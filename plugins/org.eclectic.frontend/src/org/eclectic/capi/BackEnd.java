package org.eclectic.capi;


/**
 * 
 * @author jesusc
 *
 * @param <T> The resource to be compiled.
 * @param <R> The result of the compilation.
 */
public interface BackEnd<T, R> {

	/**
	 * Compiles an IDC model to an executable form.
	 * @param resource The resource containing the IDC model.
	 */
	R compile(T resource) throws EclecticException;

	/**
	 * Returns the result of the compilation.
	 */
	R getCompilationResult();
}
