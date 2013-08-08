package org.eclectic.frontend.api;


import java.io.IOException;

import org.eclectic.capi.EclecticException;
import org.eclectic.frontend.attribution.AttributionRule;
import org.eclectic.frontend.attribution.AttributionTransformation;
import org.eclectic.frontend.capi.AttributionFrontend;
import org.eclectic.frontend.capi.AttributionMiddleEnd;
import org.eclectic.frontend.capi.FrontendUtil;
import org.eclectic.frontend.capi.JVMBackend;
import org.eclectic.frontend.capi.AttributionMiddleEnd.AttributionMiddleEndOptions;
import org.eclectic.idc.jvm.JVMCompilationResult;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResource;

// import org.eclectic.idc.jvm.

public class AttributionCompiler extends BasicCompiler<AttributionCompiler> {
	public JVMCompilationResult execute(String transformation) throws IOException, EclecticException {
		//String home = "/home/jesusc/" + "usr/qool/workspace/org.eclectic.test/";		
		
		AttributionMiddleEndOptions options = new AttributionMiddleEndOptions();
		options.saveIntermediate = "idc.xmi";
		options.checkLocatedElements = true;
		
		JVMBackend                          b = new JVMBackend();
		AttributionMiddleEnd<JVMCompilationResult> m = new AttributionMiddleEnd<JVMCompilationResult>(b, options);
		AttributionFrontend<JVMCompilationResult>  f = new AttributionFrontend<JVMCompilationResult>(m);
		
		JVMCompilationResult executor = f.compile(transformation);
		return executor;
	}

	@Override
	public JVMCompilationResult execute(XtextResource resource, String path) throws IOException, EclecticException {
		AttributionMiddleEndOptions options = new AttributionMiddleEndOptions();
		AttributionTransformation transformation = (AttributionTransformation) resource.getContents().get(0);
		
		JVMBackend                                 b = new JVMBackend(this.manager);
		AttributionMiddleEnd<JVMCompilationResult> m = new AttributionMiddleEnd<JVMCompilationResult>(b, options);

		FrontendUtil.setFilePathToElements(path, transformation);
		
		JVMCompilationResult executor = m.compile(transformation);
		return executor;
	}
}
