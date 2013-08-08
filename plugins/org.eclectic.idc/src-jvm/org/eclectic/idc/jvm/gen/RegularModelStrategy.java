package org.eclectic.idc.jvm.gen;

import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.InstructionFactory;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.LDC;
import org.apache.bcel.generic.Type;
import org.eclectic.idc.core.Variable;
import org.eclectic.idc.instr.Create;
import org.eclectic.idc.instr.Set;
import org.eclectic.idc.jvm.bcel.DefaultTypes;
import org.eclectic.idc.jvm.context.GenScope;

public class RegularModelStrategy implements ModelStrategy {

	private String modelName;

	public RegularModelStrategy(String modelName) {
		this.modelName = modelName;
	}
	
	/**
	 * <<GET_IMODEL(THIS)>> 
	 * LDC className
     * INVOKEINTERFACE createObject
	 */
	@Override
	public void genCreate(Create c, GenScope scope) {
		InstructionList il       = scope.getInstructionList();
		InstructionFactory ifact = scope.getInstructionFactory();
		ConstantPoolGen cpg      = scope.getConstantPool();
		
		// generate model access
		scope.generateGetModel(modelName);
		// CommonGen.generateGetModel(modelName, il, ifact, scope.getTransformationContext() );

		// push className
		il.append(new LDC(cpg.addString(c.getClassName())));
			
		// invoke
		il.append(ifact.createInvoke(DefaultTypes.IModel.getClassName(),
					"createObject", Type.OBJECT, 
					new Type[] { Type.STRING },
					DefaultTypes.IModelCall));
		
	}

	/**
	 * <<GET_IMODEL(THIS)>> 
 	 * ALOAD !!#receptor_variable!!
     * LDC <<featureName>>
	 * ALOAD !!#value_variable!!
	 * INVOKEINTERFACE setFeature
	 */
	@Override
	public void genSet(Set s, GenScope scope) {
		InstructionList il       = scope.getInstructionList();
		InstructionFactory ifact = scope.getInstructionFactory();
		ConstantPoolGen cpg      = scope.getConstantPool();

		Variable realReceptor = scope.getRealVariable(s.getReceptor());
		Variable realValue    = scope.getRealVariable(s.getValue());

		// push IModel (generate model access)
		scope.generateGetModel(s.getReceptor());

		// push receptor
		scope.loadVariable(realReceptor, il);

		// push featureName
		il.append(new LDC(cpg.addString(s.getFeatureName())));

		// push value
		scope.loadVariable(realValue, il);

		// invoke setFeature
		il.append(ifact.createInvoke(DefaultTypes.IModel.getClassName(),
				"setFeature", 
				Type.VOID, 
				new Type[] { Type.OBJECT, Type.STRING, Type.OBJECT }, 
				DefaultTypes.IModelCall));		
	}
	
}
