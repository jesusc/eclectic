package org.eclectic.idc.instr.jvmgen;

import org.apache.bcel.Constants;
import org.apache.bcel.generic.ASTORE;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.InstructionFactory;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.LocalVariableGen;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.Type;
import org.eclectic.idc.core.Variable;
import org.eclectic.idc.instr.NamedInvocationParameter;
import org.eclectic.idc.instr.impl.InvokeExternalImpl;
import org.eclectic.idc.jvm.bcel.DefaultTypes;
import org.eclectic.idc.jvm.context.GenScope;
import org.eclectic.idc.jvm.gen.GenerableInstruction;
import org.eclipse.emf.common.util.EList;

public class InvokeExternalJVMGen extends InvokeExternalImpl implements GenerableInstruction {

	@Override
	public void generate(GenScope scope) {
		InstructionList il       = scope.getInstructionList();
		InstructionFactory ifact = scope.getInstructionFactory();
		ConstantPoolGen cpg      = scope.getConstantPool();

		String transformationName = this.getTransformationName();
		String entryPointName     = this.getEntryPointName();
		
		
		LocalVariableGen lvg = scope.newLocalVariable(this, Type.OBJECT);
		
		// Probably this could be improved, but for the moment a transformation
		// object will provide a facility to instantiate another transformation
		
		// Create the new transformation
		// [This_Transformation, "TransformationName"] -> instantiateTransformation -> [Created_Transformation]		
		scope.generateGetTransformation();
		il.append(ifact.createConstant(transformationName));
		il.append(ifact.createInvoke(DefaultTypes.IdcTransformation.getClassName(), "instantiateTransformation",
				DefaultTypes.IdcTransformation, new Type[] { Type.STRING },
				Constants.INVOKEVIRTUAL));
		
		
		// There are two cases
		//
		// 1. Explicit invocation of a transformation rule
		
		if ( entryPointName != null ) {
			generateInvokeEntryPoint(scope, il, ifact, transformationName, entryPointName, lvg);
		} else {
			generateInvokeTransformation(scope, il, ifact, transformationName, lvg);
		}
		
	}

	private void generateInvokeTransformation(GenScope scope, InstructionList il, InstructionFactory ifact, String transformationName, LocalVariableGen lvg) {
		il.append(InstructionFactory.DUP);
		il.append(InstructionFactory.DUP);
		il.append(InstructionFactory.DUP);

		// Configure the invoked transformation: view filter 
		scope.loadVariable(this.getInputViewFilter(), il);
		il.append(ifact.createInvoke(DefaultTypes.IdcTransformation.getClassName(), "configure_invocation_",
				Type.VOID, new Type[] { DefaultTypes.RunnableClosure }, Constants.INVOKEVIRTUAL));

		// Configure the transformation
		il.append(InstructionFactory.DUP);
		il.append(ifact.createInvoke(DefaultTypes.IdcTransformation.getClassName(), "configure_",
				Type.VOID, new Type[] { }, Constants.INVOKEVIRTUAL));

		// Set parameters
		for(NamedInvocationParameter p : this.getParameters()) {
			il.append(InstructionFactory.DUP);
			il.append(ifact.createConstant(p.getFormalName()));
			scope.loadVariable(p.getResult(), il);
			il.append(ifact.createInvoke(DefaultTypes.IdcTransformation.getClassName(), "setParameterValue",
					Type.VOID, new Type[] { Type.STRING, Type.OBJECT }, Constants.INVOKEVIRTUAL));			
		}
		
		// Start the transformation
		il.append(ifact.createInvoke(DefaultTypes.IdcTransformation.getClassName(), "start_",
				Type.VOID, new Type[] { }, Constants.INVOKEVIRTUAL));

		// Get a target element from a trace
		if ( this.getOutputResolutionSourceElement() != null ) {
			scope.loadVariable(this.getOutputResolutionSourceElement(), il);
			il.append(ifact.createConstant(this.getQueueName()));
			il.append(ifact.createConstant(this.getSrcTraceAttributeName()));		
			il.append(ifact.createConstant(this.getTgtTraceAttributeName()));		
			il.append(ifact.createInvoke(DefaultTypes.IdcTransformation.getClassName(), "retrieve_from_invocation_",
					Type.OBJECT, new Type[] { Type.OBJECT, Type.STRING, Type.STRING, Type.STRING }, Constants.INVOKEVIRTUAL));
		} else {
			il.append(InstructionFactory.ACONST_NULL);
		}
		
		il.append(new ASTORE( lvg.getIndex() ));		
	}

	private void generateInvokeEntryPoint(GenScope scope, InstructionList il,
			InstructionFactory ifact, String transformationName,
			String entryPointName, LocalVariableGen lvg) {

		// Configure the transformation
		il.append(InstructionFactory.DUP);
		il.append(ifact.createInvoke(DefaultTypes.IdcTransformation.getClassName(), "configure_",
				Type.VOID, new Type[] { }, Constants.INVOKEVIRTUAL));
		// TODO: Configure the models properly, not as I'm doing directly in instantiateTransformation directly

		// Put the params into the stack and invoke, but first check the type of the transformation object
		ObjectType transformationType = new ObjectType(transformationName);
		il.append(ifact.createCheckCast(transformationType));
		// [Transformation, param1, ..., paramN] 
		EList<Variable> params = this.getEntryPointParameters();
		Type[] types = new Type[params.size()];
		int i = 0;
		for (Variable variable : params) {
			scope.loadVariable(variable, il);
			types[i++] = Type.OBJECT;
		}
		il.append(ifact.createInvoke(transformationType.getClassName(), entryPointName,
				Type.OBJECT, types,
				Constants.INVOKEVIRTUAL));		

		il.append(new ASTORE( lvg.getIndex() ));
	}

}
