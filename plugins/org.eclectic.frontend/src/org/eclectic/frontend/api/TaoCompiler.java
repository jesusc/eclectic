package org.eclectic.frontend.api;

import java.io.IOException;

import org.eclectic.capi.EclecticException;
import org.eclectic.frontend.capi.JVMBackend;
import org.eclectic.frontend.capi.TaoMiddleEnd.TaoMiddleEndOptions;
import org.eclectic.frontend.capi.TaoFrontend;
import org.eclectic.frontend.capi.TaoMiddleEnd;
import org.eclectic.frontend.tao.TaoTransformation;
import org.eclectic.idc.jvm.JVMCompilationResult;
import org.eclipse.xtext.resource.XtextResource;

// import org.eclectic.idc.jvm.

public class TaoCompiler extends BasicCompiler<TaoCompiler> {
	public JVMCompilationResult execute(String transformation) throws IOException, EclecticException {
		TaoMiddleEndOptions options = new TaoMiddleEndOptions();
		options.saveIntermediate = "idc.xmi";
		options.checkLocatedElements = true;
		
		JVMBackend                          b = new JVMBackend();
		TaoMiddleEnd<JVMCompilationResult> m = new TaoMiddleEnd<JVMCompilationResult>(b, options);
		TaoFrontend<JVMCompilationResult>  f = new TaoFrontend<JVMCompilationResult>(m);
		
		JVMCompilationResult executor = f.compile(transformation);
		return executor;
	}

	@Override
	public JVMCompilationResult execute(XtextResource resource, String path)
			throws IOException, EclecticException {

		TaoMiddleEndOptions options = new TaoMiddleEndOptions();
		TaoTransformation transformation = (TaoTransformation) resource.getContents().get(0);
		
		JVMBackend                          b = new JVMBackend();
		TaoMiddleEnd<JVMCompilationResult> m = new TaoMiddleEnd<JVMCompilationResult>(b, options);
		
		JVMCompilationResult executor = m.compile(transformation);
		return executor;
	}
}
