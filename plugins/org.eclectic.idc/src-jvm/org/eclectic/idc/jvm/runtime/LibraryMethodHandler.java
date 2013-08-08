package org.eclectic.idc.jvm.runtime;

import org.eclectic.modeling.emf.ModelManager;
import org.eclectic.modeling.emf.NoModelFoundException;

public class LibraryMethodHandler implements IModelMethodHandler {

	protected ModelManager manager;

	// This can be more efficient, because sometimes the model is known at compile time
	public LibraryMethodHandler(ModelManager m) {
		this.manager = m;
	}
	
	@Override
	public IMethodWrapper wrap(Object o) {
		try {
			return new BasicMethodWrapper(manager.getNamespace(o), o);
		} catch (NoModelFoundException e) {
			throw new IdcException(e);
		}
	}
	
	public class LibraryMethodWrapper implements IMethodWrapper {
		
	}
}
