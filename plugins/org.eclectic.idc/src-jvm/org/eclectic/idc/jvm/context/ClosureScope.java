package org.eclectic.idc.jvm.context;

import org.apache.bcel.Constants;
import org.apache.bcel.generic.ALOAD;
import org.apache.bcel.generic.ClassGen;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.InstructionFactory;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.LDC;
import org.apache.bcel.generic.LocalVariableGen;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.Type;
import org.eclectic.idc.core.Variable;
import org.eclectic.idc.jvm.bcel.DefaultTypes;
import org.eclectic.idc.jvm.gen.CommonGen;
import org.eclectic.idc.jvm.gen.OuterVariableSet;
import org.eclectic.idc.jvm.gen.Processor;
import org.eclectic.idc.jvm.runtime.IdcException;

/**
 * Specializes GenScope to deal with closure specific issues
 * when generating code. Notably,
 * <ul>
 *   <li>generateGetModel now takes into account that it must access the property
 *       transformationContext_ to get the TransformationContext.</li>
 * </ul>
 * @author Jesus Sanchez Cuadrado
 *
 */
public class ClosureScope extends GenScope {

	public ClosureScope(GenScope parentScope, ClassGen closureClass) {
		super(parentScope, closureClass);
	}

	public String getJavaClassName() {
		return this.getClassGen().getClassName();
	}
	
	@Override
	protected boolean loadOuterVariable(Variable variable, InstructionList il) {
		il.append( InstructionFactory.createLoad(Type.OBJECT, 0) );
		il.append( ifact.createGetField(this.getJavaClassName(), variable.getName(), Type.OBJECT));
		
		return true;
	}
	
	/**
	 * 
	 * @param receptor
	 */
	@Override 
	public void generateGetModel(Variable receptor) {
		CommonGen.generateGetModel(receptor, this);
	}
	
	@Override
	public void generateGetModelManager() {
		CommonGen.generateGetModelManager(this);
	}

	@Override
	public void generateGetModel(String name) {
		CommonGen.generateGetModel(name, this);		
	}	
	
	@Override
	public void generateGetTransformation() {
		CommonGen.generateGetTransformation(this);
	}
}
