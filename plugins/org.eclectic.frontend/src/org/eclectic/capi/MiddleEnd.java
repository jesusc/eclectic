package org.eclectic.capi;

import modelum.eclectic.CompilerException;

public interface MiddleEnd<T, R> {

	/**
	 * Compile a transformation definition, given as an abstract syntax
	 * model (wrapped within a Resource). 
	 * 
	 * @param eclResource The resource containing the asm.
	 * @throws CompilerException
	 */
	public abstract R compile(T r)
			throws EclecticException;

}