package modelum.eclectic.jvm.test;

import java.io.IOException;

import org.eclectic.capi.EclecticException;
import org.eclectic.frontend.capi.JVMBackend;
import org.eclectic.frontend.capi.ScriptFrontend;
import org.eclectic.frontend.capi.ScriptMiddleEnd;
import org.eclectic.frontend.capi.ScriptMiddleEnd.ScriptMiddleEndOptions;
import org.eclectic.idc.jvm.JVMCompilationResult;

// import org.eclectic.idc.jvm.

public class ScriptCompiler {
	public JVMCompilationResult execute(String transformation) throws IOException, EclecticException {
		//String home = "/home/jesusc/" + "usr/qool/workspace/org.eclectic.test/";		
		
		ScriptMiddleEndOptions options = new ScriptMiddleEndOptions();
		options.saveIntermediate = "idc.xmi";
		options.checkLocatedElements = true;
		
		JVMBackend                          b = new JVMBackend();
		ScriptMiddleEnd<JVMCompilationResult> m = new ScriptMiddleEnd<JVMCompilationResult>(b, options);
		ScriptFrontend<JVMCompilationResult>  f = new ScriptFrontend<JVMCompilationResult>(m);
		
		JVMCompilationResult executor = f.compile(transformation);
		return executor;
	}
}
