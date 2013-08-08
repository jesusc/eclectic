package org.eclectic.frontend.api;

import java.io.IOException;

import org.eclectic.capi.EclecticException;
import org.eclectic.idc.MetamodelManager;
import org.eclectic.idc.jvm.JVMCompilationResult;
import org.eclipse.xtext.resource.XtextResource;

public abstract class BasicCompiler<Subclass extends BasicCompiler<Subclass>> {
	
	
	protected MetamodelManager manager;

	@SuppressWarnings("unchecked")
	public Subclass withMetamodelManager(MetamodelManager manager) {
		this.manager = manager;
		return (Subclass) this;
	}
	
	public abstract JVMCompilationResult execute(String transformation) throws IOException, EclecticException;

	public abstract JVMCompilationResult execute(XtextResource resource, String path) throws IOException, EclecticException;
	
}
