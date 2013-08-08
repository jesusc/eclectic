package org.eclectic.frontend.capi;

import org.eclectic.capi.BackEnd;
import org.eclectic.capi.EclecticException;
import org.eclipse.emf.ecore.resource.Resource;

public class ScalaIDC implements BackEnd<Resource, IDCExecutor> {
	
	private IDCExecutor executor;

	@Override
	public IDCExecutor getCompilationResult() {
		return executor;
	}

	@Override
	public IDCExecutor compile(Resource resource) throws EclecticException {
		this.executor = new IDCExecutor(resource);
		return executor;
	}

}
