package org.eclectic.streaming.fragments;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.EMFHandler;
import org.eclectic.modeling.emf.ICollectionConverter;
import org.eclectic.modeling.emf.IStreamedFragment;
import org.eclectic.modeling.emf.IStreamedModel;
import org.eclectic.streamdesc.ElementSlidingWindow;
import org.eclectic.streamdesc.KeySpec;
import org.eclectic.streamdesc.SlidingWindow;
import org.eclectic.streamdesc.StreamDescription;
import org.eclectic.streamdesc.StreamdescPackage;
import org.eclectic.streamdesc.impl.ElementSlidingWindowImpl;
import org.eclectic.streamdesc.runtime.IsProxyAnnotation;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EContentsEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class StreamedEmfModel extends BasicEMFModel implements IStreamedModel<EObject, EClass>{

	private StreamDescription description;
	private HashMap<String, KeySpec> keySpecByMetaclass = new HashMap<String, KeySpec>();
	
	private HashMap<String, EObject> receivedObjectsByKey = new HashMap<String, EObject>();
	
	private HashMap<Object, IsProxyAnnotation> proxiesTemp = new HashMap<Object, IsProxyAnnotation>();
	
	private HashSet<String> classesWithoutKey = new HashSet<String>();
	private boolean explicitKey = false;
	private boolean lazyLoading;
	private LinkedList<ILazyLoadListener> lazyLoadListeners = new LinkedList<ILazyLoadListener>();
	
	public StreamedEmfModel(EMFHandler handler, StreamDescription desc, ICollectionConverter converter) {
		super(handler, converter);
		this.description = desc;
	
		for(KeySpec k : desc.getKeys()) {
			if ( k.getFeatureName().toUpperCase().equals("NO_KEY") ) {
				classesWithoutKey.add(k.getClassName());
				continue;
			}
			keySpecByMetaclass.put(k.getClassName(), k);
		}		
	}
	
	public void setExplicitKeyMode() {
		this.explicitKey  = true;
	}
	
	public void setLazyLoading() {
		this.lazyLoading = true;
	}

	@Override
	public void addLazyLoadListener(ILazyLoadListener listener) {
		this.lazyLoadListeners.add(listener);
	}
	
	@Override
	public Collection<Object> receive(IStreamedFragment<EObject, ?> frg) {
		EmfFragment fragment = (EmfFragment) frg;
		LinkedList<Object> newObjects = new LinkedList<Object>();
		
		// System.out.println("Received: " + receivedObjectsByKey.size());
		
		Object[] objects = fragment.getObjects();
		for(int i = 0; i < objects.length; i++) {
			EObject eobject = (EObject) objects[i];
			if ( ! classesWithoutKey.contains(eobject.eClass().getName()) ) {
				String key = findKey(eobject, explicitKey);
				if ( key != null ) {
					
					if ( receivedObjectsByKey.containsKey(key) ) {
						// System.out.println("* " + eobject);
						for(int j = 0; j < objects.length; j++) {
							EContentsEList.FeatureIterator it = (EContentsEList.FeatureIterator) ((EObject) objects[j]).eCrossReferences().iterator();
							while ( it.hasNext() ) {
								EObject refObject = (EObject) it.next();
								if ( refObject == eobject ) {
									EStructuralFeature f = it.feature();
									EcoreUtil.replace((EObject) objects[j], f, eobject, receivedObjectsByKey.get(key));
								}
							}
						}
						// System.out.println(eobject.eCrossReferences());
						// REPLACE THE ARRIVED OBJECT WITH THE EXISTING ONE!!
						//((EObject) objects[i]).ese
						// Force opposite...
						continue;
					}
					
					receivedObjectsByKey.put(key, (EObject) objects[i]);
				}
			}
			
			newObjects.add(objects[i]);
			handler.addToResource((EObject) objects[i]);
		}
		// handler.packRootElements();
	
		// TODO: Now assuming the same proxy is not referenced from several places
		IsProxyAnnotation[] annotations = fragment.getProxyAnnotations();
		for(int i = 0; i < annotations.length; i++) {
			EObject object = (EObject) annotations[i].getObject();
			String k       = findKey(object, false);
			if ( receivedObjectsByKey.containsKey(k) ) {
				EObject realObj = receivedObjectsByKey.get(k);
				
				// TODO: Assuming mono-valued reference
				EcoreUtil.replace(annotations[i].getReferenceSource(), 
						annotations[i].getObject().eClass().getEStructuralFeature(annotations[i].getReferenceName()), 
						object, realObj);
				
				// Now it seems that it does not work
				// EcoreUtil.replace(object, realObj);
			} 
			else {
				// Needed for "needsWaiting"
				proxiesTemp.put(object, annotations[i]);			
			}
		}

		return newObjects;
	}

	private String findKey(EObject object, boolean isKeyExplicit) {
		String metaclassName = object.eClass().getName();
		KeySpec keySpec = keySpecByMetaclass.get(metaclassName);
		if ( keySpec != null ) {
			Object v = getFeature(object, keySpec.getFeatureName());
			if ( v == null )
				throw new IllegalStateException("Cannot build key with null feature " + keySpec.getFeatureName() + " - " + object);
			String k = buildKeyString(metaclassName, v);
			return k;
		}
		if ( isKeyExplicit ) 
			return null;
		throw new IllegalStateException("No key for proxy " + object);
	}

	private String buildKeyString(String metaclassName, Object v) {
		return metaclassName + "__" + v.toString();
	}

	@Override
	public Object getFeature(EObject obj, String featureName) {
		Object result = super.getFeature(obj, featureName);
		if ( lazyLoading ) {
			if ( converter.isList(result) ) {
				Iterator<Object> it = converter.toIterator(result);
				while ( it.hasNext() ) {
					addLazyLoaded( it.next() );
				}
			} else {
				addLazyLoaded(result);
			}
		}
		return result;
	}
	
	private void addLazyLoaded(Object o) {
		if ( o instanceof EObject && ! super.contains(o) ) {
			this.handler.addToResource((EObject) o);
			for (ILazyLoadListener l : lazyLoadListeners) {
				l.loaded(o);
			}
		}		
	}
	
	@Override
	public boolean contains(Object obj) {
		if ( ! super.contains(obj) ) {
			// Check it is a proxy
			return proxiesTemp.containsKey(obj);
		}
		return true;
	}
	
	// TODO: I think featureName is not needed, just to check the receptor
	@Override
	public boolean receptorNeedsWaiting(Object receptor, String featureName) {
		// Object r = this.getFeature((EObject) receptor, featureName);
		// return proxiesTemp.contains(r);
		return proxiesTemp.containsKey(receptor);
	}

	public boolean valueNeedsWaiting(Object value) {
		return proxiesTemp.containsKey(value);		
	}

	
	
	@Override
	public boolean tryToResolveProxy(Object proxyObj, Object o) {
		EObject obj = receivedObjectsByKey.get(findKey((EObject) proxyObj, false));
		if ( obj != null && obj == o ) {
			EcoreUtil.replace((EObject) proxyObj, obj);
			return true;
		}
		return false;
	}

	@Override
	public Collection<ElementSlidingWindow> getElementSlidingWindows() {
		EList<SlidingWindow> windows = this.description.getWindows();
		return EcoreUtil.getObjectsByType(windows, StreamdescPackage.eINSTANCE.getElementSlidingWindow());
	}

	@Override
	public void removeStreamed(Object o) {
		String k = findKey((EObject) o, this.explicitKey);
		if ( k != null )
			receivedObjectsByKey.remove(k);
		handler.deleteSimple((EObject) o);
		// handler.delete((EObject) o);
	}
	
	
}
