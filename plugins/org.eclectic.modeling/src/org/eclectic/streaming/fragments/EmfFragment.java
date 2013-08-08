package org.eclectic.streaming.fragments;

import java.util.ArrayList;
import java.util.List;

import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.IStreamedFragment;
import org.eclectic.streamdesc.runtime.Annotation;
import org.eclectic.streamdesc.runtime.IsProxyAnnotation;
import org.eclectic.streamdesc.runtime.RuntimeFactory;
import org.eclectic.streamdesc.runtime.StreamedFragment;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;

public class EmfFragment implements IStreamedFragment<EObject, org.eclectic.streamdesc.runtime.Annotation> {

	private BasicEMFModel model;
	public List<IsProxyAnnotation> proxyAnnotations = new ArrayList<IsProxyAnnotation>();

	private StreamedFragment fragment;
	
	public EmfFragment(BasicEMFModel model) {
		this.model = model;
		this.fragment = RuntimeFactory.eINSTANCE.createStreamedFragment();
		if ( model != null )
			this.model.getHandler().addToResource(fragment);
	}
	
	@Override
	public EObject createObject(String metaclassName) {
		EObject obj = this.model.createObject(metaclassName);
		fragment.getElements().add(obj);
		fragment.getNonProxyElements().add(obj);
		// objects.add(obj);
		return obj;
	}

	@Override
	public EObject createProxyObject(String metaclassName, EObject source, String referenceName) {		
		EObject obj = this.model.createObject(metaclassName);
		fragment.getElements().add(obj);
		fragment.getProxyElements().add(obj);

		// Enough with the proxyElements reference
		IsProxyAnnotation proxy = RuntimeFactory.eINSTANCE.createIsProxyAnnotation();
		proxy.setObject(obj);
		proxy.setReferenceSource(source);
		proxy.setReferenceName(referenceName);
		fragment.getAnnotations().add(proxy);
		
		proxyAnnotations.add(proxy);
		
		return obj;
	}

	public StreamedFragment getFragment() {
		return this.fragment;
	}
	
	@Override
	public EObject[] getObjects() {
		EObject[] objects = new EObject[fragment.getNonProxyElements().size()];
		int i = 0;
		for(EObject obj : fragment.getNonProxyElements()) {
			objects[i++] = obj;
		}
		return objects;
	}

	@Override
	public EObject[] getProxyObjects() {
		EObject[] objects = new EObject[fragment.getProxyElements().size()];
		int i = 0;
		for(EObject obj : fragment.getProxyElements()) {
			objects[i++] = obj;
		}
		return objects;
	}
	
	@Override
	public Annotation[] getAnnotations() {
		Annotation[] annotations = new Annotation[fragment.getAnnotations().size()];
		int i = 0;
		for(Annotation ann : fragment.getAnnotations()) {
			annotations[i++] = ann;
		}
		return annotations;
	}

	@Override
	public IsProxyAnnotation[] getProxyAnnotations() {
		IsProxyAnnotation[] annotations = new IsProxyAnnotation[proxyAnnotations.size()];
		int i = 0;
		for(IsProxyAnnotation ann : proxyAnnotations) {
			annotations[i++] = ann;
		}
		return annotations;
	}

	public void clean() {
		this.model.clean();
	}
	
}
