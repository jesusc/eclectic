package org.eclectic.frontend.api;


import java.io.IOException;


import org.eclectic.capi.EclecticException;
import org.eclectic.frontend.capi.ChainFrontend;
import org.eclectic.frontend.capi.ChainMiddleEnd;
import org.eclectic.frontend.capi.JVMBackend;
import org.eclectic.frontend.capi.ChainMiddleEnd.ChainMiddleEndOptions;
import org.eclectic.frontend.chain.ChainTransformation;
import org.eclectic.frontend.mappings.MappingTransformation;
import org.eclectic.idc.jvm.JVMCompilationResult;
import org.eclipse.xtext.resource.XtextResource;

// import org.eclectic.idc.jvm.

public class ChainCompiler extends BasicCompiler<ChainCompiler> {
	public JVMCompilationResult execute(String transformation) throws IOException, EclecticException {
		//String home = "/home/jesusc/" + "usr/qool/workspace/org.eclectic.test/";		
		
		ChainMiddleEndOptions options = new ChainMiddleEndOptions();
		options.saveIntermediate = "idc.xmi";
		options.checkLocatedElements = true;
		
		JVMBackend                          b = new JVMBackend();
		ChainMiddleEnd<JVMCompilationResult> m = new ChainMiddleEnd<JVMCompilationResult>(b, options);
		ChainFrontend<JVMCompilationResult>  f = new ChainFrontend<JVMCompilationResult>(m);
		
		JVMCompilationResult executor = f.compile(transformation);
		return executor;
	}

	@Override
	public JVMCompilationResult execute(XtextResource resource, String path)
			throws IOException, EclecticException {
		ChainMiddleEndOptions options = new ChainMiddleEndOptions();
		ChainTransformation t = (ChainTransformation) resource.getContents().get(0);

		JVMBackend                          b = new JVMBackend();
		ChainMiddleEnd<JVMCompilationResult> m = new ChainMiddleEnd<JVMCompilationResult>(b, options);
		
		JVMCompilationResult executor = m.compile(t);
		return executor;
	}
}
