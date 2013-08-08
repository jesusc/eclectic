package org.eclectic.frontend.capi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.eclectic.capi.BackEnd;
import org.eclectic.capi.EclecticException;
import org.eclectic.idc.IdcPreprocessor;
import org.eclectic.idc.MetamodelManager;
import org.eclectic.idc.jvm.CompilerException;
import org.eclectic.idc.jvm.JVMCompilationResult;
import org.eclectic.idc.jvm.JVMCompiler;
import org.eclipse.emf.ecore.resource.Resource;

public class JVMBackend implements BackEnd<Resource, JVMCompilationResult> {

	private MetamodelManager metamodelManager;

	public JVMBackend() {
		this(new MetamodelManager());
	}

	public JVMBackend(MetamodelManager manager) {
		this.metamodelManager = manager;
	}

	@Override
	public JVMCompilationResult compile(Resource resource) throws EclecticException {
		return compile(resource, null);
	}

	/**
	 * 
	 * @param resource
	 *            A resource containing a piece of IDC code.
	 * @param options TODO: Create an options object...
	 * @return
	 * @throws CompilerException
	 */
	public JVMCompilationResult compile(Resource resource, Object options) throws EclecticException {
		IdcPreprocessor preprocessor = new IdcPreprocessor(resource, metamodelManager);
		resource = preprocessor.apply();
		try {
			resource.save(new FileOutputStream(new File("idx-reorder.xmi")), null);
		} catch (Exception e1) {
			throw new RuntimeException(e1);
		}

		JVMCompiler compiler = new JVMCompiler(this.metamodelManager);
		try {
			return compiler.compile(resource, null);
		} catch (CompilerException e) {
			throw new EclecticException(e);
		}
	}

	@Override
	public JVMCompilationResult getCompilationResult() {
		throw new UnsupportedOperationException();
	}
}
