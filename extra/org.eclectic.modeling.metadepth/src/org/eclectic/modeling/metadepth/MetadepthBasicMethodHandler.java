package org.eclectic.modeling.metadepth;

import org.eclectic.idc.jvm.runtime.BasicMethodWrapper;
import org.eclectic.idc.jvm.runtime.IMethodWrapper;
import org.eclectic.idc.jvm.runtime.IdcException;
import org.eclectic.modeling.emf.ModelManager;
import org.eclectic.modeling.emf.NoModelFoundException;

public class MetadepthBasicMethodHandler extends org.eclectic.idc.jvm.runtime.BasicMethodHandler {

	public MetadepthBasicMethodHandler(ModelManager m) {
		super(m);
	}

	@Override
	public IMethodWrapper wrap(Object o) {
		try {
			return new MetadepthBasicMethodWrapper(manager.getNamespace(o), o);
		} catch (NoModelFoundException e) {
			throw new IdcException(e);
		}
	}

	
}
