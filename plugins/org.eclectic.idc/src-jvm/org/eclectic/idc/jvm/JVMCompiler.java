package org.eclectic.idc.jvm;

import org.eclectic.idc.MetamodelManager;
import org.eclectic.idc.core.MethodLibrary;
import org.eclectic.idc.core.jvmgen.MethodLibraryJVMGen;
import org.eclectic.idc.qool.QoolTransformation;
import org.eclectic.idc.qool.jvmgen.QoolTransformationJVMGen;
import org.eclectic.idc.scheduling.ParallelTransformation;
import org.eclectic.idc.scheduling.jvmgen.ParallelTransformationJVMGen;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * Frontend for the IDC to JVM compiler.
 *  
 * @author Jesus Sanchez Cuadrado
 *
 */
public class JVMCompiler {

	private MetamodelManager metamodelManager;

	public JVMCompiler() {
		this(new MetamodelManager());
	}

	public JVMCompiler(MetamodelManager metamodelManager) {
		this.metamodelManager = metamodelManager;
	}

	public JVMCompilationResult compile(Resource resource, JVMCompilerOptions options) throws CompilerException {
		JVMCompilationResult result = new JVMCompilationResult();
	
		for (EObject obj : resource.getContents()) {
			//if (obj instanceof Transformation) { // TODO: This is for script, is it?
			//	compileTransformation((Transformation) obj, result);
			if (obj instanceof QoolTransformation) {
				compileTransformation((QoolTransformation) obj, result);
			} else if (obj instanceof MethodLibrary) {
				compileTransformation((MethodLibrary) obj, result);				
			} else if (obj instanceof ParallelTransformation) {
				compileTransformation((ParallelTransformation) obj, result);				
			} else {
				System.err.println("WARN: Unknown root element: " + obj);
			}
		}

		return result;
	}

	private void compileTransformation(ParallelTransformation obj, JVMCompilationResult result) {
		ParallelTransformationJVMGen tg = (ParallelTransformationJVMGen) obj;
		tg.generate(result);				
	}

	private void compileTransformation(MethodLibrary obj, JVMCompilationResult result) {
		MethodLibraryJVMGen tg = (MethodLibraryJVMGen) obj;
		tg.generate(result);				
	}

	private void compileTransformation(QoolTransformation t, JVMCompilationResult result) {
		QoolTransformationJVMGen tg = (QoolTransformationJVMGen) t;
		tg.generate(result, metamodelManager);		
	}

	/**
	 * Compiles an IDC transformation.
	 * 
	 * @param t The transformation object.
	 * @param result The generated elements are attached here.
	 */
	/*
	protected void compileTransformation(Transformation t, JVMCompilationResult result) {
		TransformationJVMGen tg = (TransformationJVMGen) t;
		tg.generate(result);
	}
	*/
}
