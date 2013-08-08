package org.eclectic.idc.jvm.gen;

import org.apache.bcel.generic.ClassGen;
import org.apache.bcel.generic.MethodGen;
import org.eclectic.idc.jvm.context.GenScope;
import org.eclectic.idc.jvm.context.TransformationContext;

public interface GenerableFunction {

	/**
	 * Generates the implementation of the function within
	 * a given class. 
	 * @param cg The generator class.
	 */
	void generate(ClassGen cg, GenScope scope);

	/**
	 * Generates the code to call this function.
	 * 
	 * @param cg 
	 * @param mg The method where the code will be appended.
	 */
	void genFunctionCallCode(ClassGen cg, MethodGen mg);
}
