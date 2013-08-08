package org.eclectic.frontend.api;

import java.io.IOException;

import org.eclectic.capi.EclecticException;
import org.eclectic.frontend.capi.EclecticMiddleEnd;
import org.eclectic.frontend.capi.EclecticMiddleEnd.EclecticMiddleEndOptions;
import org.eclectic.frontend.capi.FrontendUtil;
import org.eclectic.frontend.capi.JVMBackend;
import org.eclectic.frontend.core.EclecticTransformationDefinition;
import org.eclectic.idc.jvm.JVMCompilationResult;
import org.eclipse.xtext.resource.XtextResource;

// import org.eclectic.idc.jvm.

public class EclecticCompiler extends BasicCompiler<EclecticCompiler> {

	@Override
	public JVMCompilationResult execute(String transformation) throws IOException, EclecticException {
		throw new UnsupportedOperationException();
	}

	@Override
	public JVMCompilationResult execute(XtextResource resource, String path)
			throws IOException, EclecticException {
		EclecticTransformationDefinition transformation = (EclecticTransformationDefinition) resource.getContents().get(0);
		EclecticMiddleEndOptions options = new EclecticMiddleEndOptions();
		options.saveIntermediate = "eclectic-idc.xmi";
		
		JVMBackend  b = new JVMBackend(this.manager);
		EclecticMiddleEnd<JVMCompilationResult> m = new EclecticMiddleEnd<JVMCompilationResult>(b, options);
			
		FrontendUtil.setFilePathToElements(path, transformation);

		JVMCompilationResult executor = m.compile(transformation);
		return executor;
	}


}
