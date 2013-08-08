package org.eclectic.frontend.capi.internal;

import org.eclectic.frontend.core.ClassUse;
import org.eclectic.frontend.core.ResolveLink;
import org.eclectic.frontend.mappings.Delegate;
import org.eclectic.idc.jvm.runtime.IMethodWrapper;
import org.eclectic.idc.jvm.runtime.IdcException;
import org.eclectic.modeling.emf.IModel;
import org.eclectic.modeling.emf.ModelManager;
import org.eclectic.modeling.emf.NoModelFoundException;

public class MethodHandler extends org.eclectic.idc.jvm.runtime.BasicMethodHandler {

	public MethodHandler(ModelManager m) {
		super(m);
	}

	@Override
	public IMethodWrapper wrap(Object o) {
		IModel<?, ?> namespace;
		try {
		 namespace = manager.getNamespace(o);
		} catch ( NoModelFoundException e) {
			throw new IdcException(e);
		}
		if ( o instanceof ClassUse) {
			return new ElementWrappers.ClassUseMethodHandler(namespace, (ClassUse) o);
		} else if ( o instanceof ResolveLink ) {
			return new ElementWrappers.ResolveLinkMethodHandler(namespace, (ResolveLink) o);
		}  else if ( o instanceof Delegate ) {
			return new ElementWrappers.DelegateMethodHandler(namespace, (Delegate) o);
		}

		return super.wrap(o);
	}		
}
