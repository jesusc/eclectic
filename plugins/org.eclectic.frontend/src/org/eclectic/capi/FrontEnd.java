package org.eclectic.capi;

import java.io.IOException;
import java.io.InputStream;

import org.eclipse.xtext.resource.XtextResource;

public interface FrontEnd<ModelType, R> {
	
	/**
	 * Parse an Eclectic transformation definition.
	 * 
	 * @param path The path of the transformation definition.
	 * @return The abstract syntax metamodel.
	 */
	ModelType parse(String path, InputStream stream) throws EclecticException, IOException;
	
	/**
	 * Compile a given transformation definition, first parsing
	 * the definition and then passing the control to the middle-end.
	 * 
	 * @param path The path of the transformation definition.
	 * @throws IOException 
	 */
	R compile(String path) throws EclecticException, IOException;
	
	/**
	 * Return the middle-end used to compile.
	 * @return The middle-end.
	 */
	MiddleEnd getMiddleEnd();

}
