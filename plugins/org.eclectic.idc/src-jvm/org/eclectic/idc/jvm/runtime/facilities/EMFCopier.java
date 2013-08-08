package org.eclectic.idc.jvm.runtime.facilities;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclectic.idc.jvm.runtime.RunnableClosure;
import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.IModel;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;

public class EMFCopier extends Copier {
	protected Set<EClass> classes = new HashSet<EClass>();
	protected BasicEMFModel model;
	
	public EMFCopier(IModel<?, ?> model) {
		this.model = (BasicEMFModel) model;
	}

	public void exclude(EClass... classes) {
		for (int i = 0; i < classes.length; i++) {
			this.classes.add(classes[i]);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	protected void copyContainment(EReference eReference, EObject eObject,
			EObject copyEObject) {
		if (eObject.eIsSet(eReference)) {
			if (eReference.isMany()) {
				List<EObject> source = (List<EObject>) eObject.eGet(eReference);
				List<EObject> target = (List<EObject>) copyEObject.eGet(getTarget(eReference));
				if (source.isEmpty()) {
					target.clear();
				} else {
					for (EObject src : source) {
						if ( mustStop(copyEObject, eReference, src) ) {
							System.out.println("Stop " + src);
						} else {
							EObject copy = copy(src);
							notify(copyEObject, eReference, src, copy);
							target.add(copy);
						}
					}
					// target.addAll(copyAll(source));
				}
			} else {
				EObject childEObject = (EObject) eObject.eGet(eReference);
				if ( childEObject != null ) {
					if ( mustStop(copyEObject, eReference, childEObject) ) {
						System.out.println("Stop " + childEObject);
					} else {					
						EObject copy = copy(childEObject);
						copyEObject.eSet(getTarget(eReference), copy);
						notify(copyEObject, eReference, childEObject, copy);
					}
				}
			}
		}
	}

	@Override
	protected EObject createCopy(EObject eObject) {
		EObject result = super.createCopy(eObject);
		model.getHandler().addToResource(result);
		return result;
	}

	/// 
	
	private boolean mustStop(EObject targetParent, EReference eReference, EObject sourceReferenced) {
		boolean result = false;
		for (java.util.Map.Entry<RunnableClosure, RunnableClosure> stopEntry : stop.entrySet()) {
			RunnableClosure trigger = stopEntry.getKey();
			result = result ||
					(Boolean) trigger.call_3(targetParent, eReference.getName(), sourceReferenced);
		}
		return result;
	}

	private void notify(EObject targetParent, EReference eReference, EObject sourceReferenced, EObject copiedReferenced) {
		// TODO Auto-generated method stub
		
	}

	private HashMap<RunnableClosure, RunnableClosure> notify =  new HashMap<RunnableClosure, RunnableClosure>();
	private HashMap<RunnableClosure, RunnableClosure> stop   =  new HashMap<RunnableClosure, RunnableClosure>();
	
	public void stopWhen(RunnableClosure trigger, RunnableClosure action) {
		stop.put(trigger, action);
	}

	public void notifyWhen(RunnableClosure trigger, RunnableClosure action) {
		notify.put(trigger, action);
	}

	public Object doCopy(LinkedList<Object> objects) {
		Collection<Object> result = this.copyAll(objects);
		this.copyReferences();
		return result;
	}
}
