package org.eclectic.modeling.metadepth;

import meteoric.at3rdx.kernel.Clabject;

import org.eclectic.idc.jvm.runtime.BasicMethodWrapper;
import org.eclectic.modeling.emf.IModel;

public class MetadepthBasicMethodWrapper extends BasicMethodWrapper {

	public MetadepthBasicMethodWrapper(IModel<?, ?> model, Object o) {
		super(model, o);
	}

	public Object as_potency(Integer potency) {
		throw new UnsupportedOperationException();
	}
	
	public Object ontological_type() {
		return ((Clabject) object).getType();
	}
}
