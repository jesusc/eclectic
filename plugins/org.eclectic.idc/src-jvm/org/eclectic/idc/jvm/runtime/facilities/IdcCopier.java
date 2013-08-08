package org.eclectic.idc.jvm.runtime.facilities;

import java.util.LinkedList;

import org.eclectic.idc.jvm.runtime.RunnableClosure;
import org.eclectic.modeling.emf.IModel;
import org.eclipse.emf.ecore.EObject;

public class IdcCopier {
	public LinkedList<Object> objects = new LinkedList<Object>();
	private EMFCopier impl;
	private IModel<?, ?> model;
	
	public IdcCopier(IModel<?, ?> iModel) {
		this.model = iModel;
	}
	
	public void addRootObject(Object o) {
		if ( o instanceof EObject ) {
			if ( impl == null ) impl = new EMFCopier(model);
		} else {
			throw new UnsupportedOperationException("Only copiers for EMF supported");
		}
		objects.add(o);
	}
	
	public void notifyWhen(RunnableClosure trigger, RunnableClosure action) {
		impl.notifyWhen(trigger, action);
	}
	
	public void stopWhen(RunnableClosure trigger, RunnableClosure action) {
		impl.stopWhen(trigger, action);
	}
	
	public Object copy() {
		Object x = impl.doCopy(objects);
		//System.out.println("copied: " + x);
		return null;
	}
}
