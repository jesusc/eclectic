package org.eclectic.idc.qool.jvmgen;

import org.apache.bcel.generic.InstructionFactory;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.ObjectType;
import org.eclectic.idc.jvm.context.GenScope;

public interface QueueJVMGen {

	/**
	 * @return The type of the class that is used for this
	 *         queue, as a fully qualified name.
	 */
	String getClassName();

	/**
	 * @return The type of the class that is used for this
	 *         queue, as a BCEL type.
	 */	
	ObjectType getType();

	/**
	 * @return the name of the field in the enclosing class, where
	 * the queue is stored.
	 */
	String getFieldName();

	/**
	 * Generate code to initialize the corresponding field, in the class' constructor
	 * @param il
	 * @param ifact 
	 */
	void generateInitField(InstructionList il, InstructionFactory ifact, GenScope scope);

	/**
	 * Generate code to set up optimizations in queue access. Subclasses may 
	 * not generate anything if no optimization needs to be configured.
	 * 
	 * @param il
	 * @param ifact
	 * @param scope
	 */
	void generateConfigureOptimizations(InstructionList il, InstructionFactory ifact, GenScope scope);

	
}
