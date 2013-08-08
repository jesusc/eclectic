package org.eclectic.javaflow;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.javaflow.ContinuationClassLoader;
import org.apache.commons.javaflow.bytecode.transformation.asm.AsmClassTransformer;
import org.apache.commons.javaflow.utils.RewritingUtils;

public class SerializedTransformer {

	private File directory;
    private AsmClassTransformer transformer = new AsmClassTransformer();
	private ClassLoader runtimeClassLoader;
	private List<String> additionalPaths;
	
	public SerializedTransformer(String directory, List<String> additionalPaths) {
		this(new File(directory), additionalPaths);
	}
	
	public SerializedTransformer(File directory, List<String> additionalPaths) {
		this.directory = directory;
		this.additionalPaths = additionalPaths;
		this.runtimeClassLoader = this.getClass().getClassLoader();
	}
	
	
	public void setRuntimeClassLoader(ClassLoader loader) {
		this.runtimeClassLoader = loader;
	}
	
	public void instrumentAll() {
        AsmClassTransformer transformer = new AsmClassTransformer();
        // FileUtils.listFiles(arg0, arg1, arg2)
        directory.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File arg0, String arg1) {
				System.out.println(arg0);
				System.out.println(arg1);
				return false;
			}        	
        });
        throw new UnsupportedOperationException();
	}
	
	/**
	 * Instrument a class, given its path relative the directory given in the constructor.
	 * @param path
	 * @throws IOException 
	 */
	public void instrumentClass(final String path) throws IOException {		
		Thread thread = new Thread() {
			@Override
			public void run() {
				URL[] urls = new URL[1 + additionalPaths.size()];
				try {
					urls[0] = directory.toURI().toURL();
					for(int i = 1; i <= additionalPaths.size(); i++) {
						urls[i] = new File(additionalPaths.get(i - 1)).toURI().toURL();
						// System.out.println(urls[i].toString());
					}
				} catch (MalformedURLException e) {
					throw new RuntimeException(e);
				}				
				
				
				ClassLoader loader = new URLClassLoader(urls, runtimeClassLoader);				
				this.setContextClassLoader( loader );

				File classFile = new File(directory, path);
				try {
					RewritingUtils.rewriteClassFile( classFile, transformer, classFile );
				} catch (IOException e) {
					System.out.println("Rewrting " + classFile.getPath());
					throw new RuntimeException("Error rewrting: " + classFile.getPath(), e);
				} catch ( IllegalArgumentException  ex) {
					// Nasty: Invalid operand (must be a signed byte): 128
					System.out.println("Error rewrting : " + classFile.getPath());
					throw ex;
				}
				
			}
		};
		
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	
	}
	
}
