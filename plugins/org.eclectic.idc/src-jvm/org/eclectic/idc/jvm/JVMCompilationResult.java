package org.eclectic.idc.jvm;

import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import org.eclectic.idc.jvm.context.TransformationContext;
import org.eclectic.idc.jvm.runtime.IdcTransformationBase;
import org.eclectic.modeling.emf.ModelManager;

/**
 * Gathers the information generated during compilation, so that
 * the generated classes can be serialized or executed. 
 * 
 * @author Jesus Sanchez Cuadrado
 */
public class JVMCompilationResult {
	protected List<TransformationContext> transformations = new LinkedList<TransformationContext>();
	protected HashSet<String> alreadyLoaded = new HashSet<String>();
	
	public void addTransformation(TransformationContext context) {
		transformations.add(context);
	}
	
	public void execute(final ModelManager manager, final String className) {
	     System.setProperty("org.apache.commons.logging.Log",
                 "org.apache.commons.logging.impl.NoOpLog");
	     
		//TransformationExecutor ex = new TransformationExecutor();
		// ex.execute(manager, this); // , new JVMBackendOptions());		
		
		Thread thread = new Thread() {
			@Override
			public void run() {
			    TransformationContext main = null;
				for (TransformationContext c : transformations) {			
					// c.loadClasses(ContinuationClassLoader.getInstance());
					if ( ! alreadyLoaded.contains(c.getRuntimeClassName()) ) {
						c.loadWithLoader();
						alreadyLoaded.add(c.getRuntimeClassName());
					}
					
					if ( c.is(className) ) {
						main = c;
					}
				}
				
				final TransformationContext m = main;

				this.setContextClassLoader( m.getLoader() );
				IdcTransformationBase t = m.getTransformationInstance(manager);		
				t.configure_();
				t.start_();
			}
		};
		
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//IdcTransformationBase t = main.getTransformationInstance(manager);		
		//t.start_();
		
		
		
	}

	public void addCompiled(JVMCompilationResult other) {
		transformations.addAll(other.transformations);
	}


	public void dump(String baseDir) throws IOException {
		dump(baseDir, null);
	}
	
	/**
	 * Generates the corresponding .class files.
	 * @throws IOException 
	 */
	public void dump(String baseDir, ClassLoader runtimeClassLoader) throws IOException {
		// TODO: I could have the following generation structure (for instance, in a transf. called uml2java.struct)
		// * uml2java
		//   - struct
		//   * internal
		//     - all closures and so on
		dump(baseDir, runtimeClassLoader, new LinkedList<String>());
	}

	public void dump(String baseDir, ClassLoader runtimeClassLoader, List<String> paths) throws IOException {	
		for (TransformationContext c : transformations) {
			c.dump(baseDir, runtimeClassLoader, paths);
		}		
	}

	public void removeCompiledFiles(String baseDir) {
		for (TransformationContext c : transformations) {
			c.removeCompileFiles(baseDir);
		}				
	}
}
