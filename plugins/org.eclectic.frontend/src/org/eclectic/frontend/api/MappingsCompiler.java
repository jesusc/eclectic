package org.eclectic.frontend.api;

import java.io.IOException;

import org.eclectic.capi.EclecticException;
import org.eclectic.frontend.capi.FrontendUtil;
import org.eclectic.frontend.capi.JVMBackend;
import org.eclectic.frontend.capi.MappingsFrontend;
import org.eclectic.frontend.capi.MappingsMiddleEnd;
import org.eclectic.frontend.capi.MappingsMiddleEnd.MappingsMiddleEndOptions;
import org.eclectic.frontend.mappings.MappingTransformation;
import org.eclectic.idc.MetamodelManager;
import org.eclectic.idc.jvm.JVMCompilationResult;
import org.eclipse.xtext.resource.XtextResource;

// import org.eclectic.idc.jvm.

public class MappingsCompiler extends BasicCompiler<MappingsCompiler> {
	
	@Override
	public JVMCompilationResult execute(String transformation) throws IOException, EclecticException {
		//String home = "/home/jesusc/" + "usr/qool/workspace/org.eclectic.test/";		
		
		MappingsMiddleEndOptions options = new MappingsMiddleEndOptions();
		options.saveIntermediate = "idc.xmi";
		options.checkLocatedElements = true;
		
		JVMBackend                          b = new JVMBackend(this.manager);
		MappingsMiddleEnd<JVMCompilationResult> m = new MappingsMiddleEnd<JVMCompilationResult>(b, options);
		MappingsFrontend<JVMCompilationResult>  f = new MappingsFrontend<JVMCompilationResult>(m);
		
		JVMCompilationResult executor = f.compile(transformation);
		return executor;
	}

	public JVMCompilationResult execute(XtextResource resource, String path) throws EclecticException {
		MappingsMiddleEndOptions options = new MappingsMiddleEndOptions();
		MappingTransformation t = (MappingTransformation) resource.getContents().get(0);
		
		JVMBackend                          b = new JVMBackend(this.manager);
		MappingsMiddleEnd<JVMCompilationResult> m = new MappingsMiddleEnd<JVMCompilationResult>(b, options);
		
		FrontendUtil.setFilePathToElements(path, t);
		
		JVMCompilationResult executor = m.compile(t);
		return executor;
	}
}
