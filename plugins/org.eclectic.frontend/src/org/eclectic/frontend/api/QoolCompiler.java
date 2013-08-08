package org.eclectic.frontend.api;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

import org.eclectic.capi.EclecticException;
import org.eclectic.capi.MiddleEnd;
import org.eclectic.frontend.attribution.AttributionTransformation;
import org.eclectic.frontend.capi.FrontendUtil;
import org.eclectic.frontend.capi.JVMBackend;
import org.eclectic.frontend.capi.QoolFrontend;
import org.eclectic.frontend.capi.QoolMiddleEnd;
import org.eclectic.frontend.capi.QoolMiddleEnd.QoolMiddleEndOptions;
import org.eclectic.frontend.capi.QoolMiddleEndInjava;
import org.eclectic.frontend.capi.QoolMiddleEndInjava.QoolMiddleEndInJavaOptions;
import org.eclectic.frontend.qool.QoolTransformation;
import org.eclectic.idc.jvm.JVMCompilationResult;
import org.eclipse.xtext.resource.XtextResource;

// import org.eclectic.idc.jvm.

public class QoolCompiler extends BasicCompiler<QoolCompiler> {
	private static HashMap<String, JVMCompilationResult> inMemory = new HashMap<String, JVMCompilationResult>();
	private boolean recompile;
	private int version;
	
	public static final int JAVA_VERSION  = 1;
	public static final int SCALA_VERSION = 0;

	public QoolCompiler(boolean recompile, int version) {
		this(recompile);
		this.version   = version;
	}

	public QoolCompiler(int version) {
		this(false);
		this.version   = version;
	}

	public QoolCompiler(boolean recompile) {
		this.recompile = recompile;
	}
	
	public QoolCompiler() {
		this(false);
	}
	
	public JVMCompilationResult execute(String transformation) throws IOException, EclecticException {
		return execute(transformation, new FileInputStream(transformation));
	}
	
	public JVMCompilationResult execute(String transformation, InputStream qoolS) throws IOException, EclecticException {
		//String home = "/home/jesusc/" + "usr/qool/workspace/org.eclectic.test/";		
		
		
		JVMBackend                          b = new JVMBackend(this.manager);
		MiddleEnd<QoolTransformation, JVMCompilationResult> m = null;
		if ( version == JAVA_VERSION ) {
			QoolMiddleEndInJavaOptions options = new QoolMiddleEndInJavaOptions();
			options.saveIntermediate = "idc-with-java-gen.xmi";
			options.checkLocatedElements = true;

			m = new QoolMiddleEndInjava<JVMCompilationResult>(b, options);
		} else {
			QoolMiddleEndOptions options = new QoolMiddleEndOptions();
			options.saveIntermediate = "idc.xmi";
			options.checkLocatedElements = true;

			m = new QoolMiddleEnd<JVMCompilationResult>(b, options);
		}	
		QoolFrontend<JVMCompilationResult>  f = new QoolFrontend<JVMCompilationResult>(m);
		
		// This is to avoid loading the same transformation twice. 
		// TODO: Devise a way to allow reloading
		JVMCompilationResult executor = inMemory.get(transformation);
		if ( recompile == true || executor == null ) {
			executor = f.compile(transformation, qoolS);
			inMemory.put(transformation, executor);
		}
		return executor;
	}

	@Override
	public JVMCompilationResult execute(XtextResource resource, String path)
			throws IOException, EclecticException {
		QoolTransformation transformation = (QoolTransformation) resource.getContents().get(0);
		
		JVMBackend                          b = new JVMBackend(this.manager);
		MiddleEnd<QoolTransformation, JVMCompilationResult> m = null;
		if ( version == JAVA_VERSION ) {
			QoolMiddleEndInJavaOptions options = new QoolMiddleEndInJavaOptions();
			//options.saveIntermediate = "idc-with-java-gen.xmi";
			//options.checkLocatedElements = true;

			m = new QoolMiddleEndInjava<JVMCompilationResult>(b, options);
		} else {
			QoolMiddleEndOptions options = new QoolMiddleEndOptions();
			//options.saveIntermediate = "idc.xmi";
			//options.checkLocatedElements = true;

			m = new QoolMiddleEnd<JVMCompilationResult>(b, options);
		}
		
		FrontendUtil.setFilePathToElements(path, transformation);

		// This is to avoid loading the same transformation twice. 
		// TODO: Devise a way to allow reloading
		JVMCompilationResult executor = inMemory.get(path);
		if ( recompile == true || executor == null ) {
			
			executor = m.compile(transformation);
			inMemory.put(path, executor);
		}
		return executor;
	}

}
