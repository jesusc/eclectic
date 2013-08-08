package org.eclectic.test.streaming;

import java.util.ArrayList;

import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.IStreamedFragment;
import org.eclectic.streamdesc.runtime.Annotation;
import org.eclectic.streamdesc.runtime.IsProxyAnnotation;
import org.eclectic.streaming.fragments.EmfFragment;
import org.eclipse.emf.ecore.EObject;

public class MorsaFragment extends EmfFragment {

	
	public MorsaFragment() {
		super(null);
	}

	@Override
	public EObject createObject(String metaclassName) {
		throw new UnsupportedOperationException();
	}

	@Override
	public EObject createProxyObject(String metaclassName, EObject receptor,
			String featureName) {
		throw new UnsupportedOperationException();
	}

	private ArrayList<EObject> objects = new ArrayList<EObject>();
	public void addObject(EObject obj) {
		this.objects.add(obj);
	}
	
	@Override
	public EObject[] getObjects() {
		EObject[] copy = new EObject[objects.size()];
		objects.toArray(copy);
		return copy;
	}

	@Override
	public EObject[] getProxyObjects() {
		return new EObject[0];
	}

	@Override
	public Annotation[] getAnnotations() {
		return new Annotation[0];
	}

	@Override
	public IsProxyAnnotation[] getProxyAnnotations() {
		return new IsProxyAnnotation[0];
	}

}
