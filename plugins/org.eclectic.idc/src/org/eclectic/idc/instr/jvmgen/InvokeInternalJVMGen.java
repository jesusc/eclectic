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
import org.eclectic.idc.instr.impl.InvokeInternalImpl;
import org.eclectic.idc.jvm.bcel.DefaultTypes;
import org.eclectic.idc.jvm.context.GenScope;
import org.eclectic.idc.jvm.gen.GenerableInstruction;
import org.eclipse.emf.common.util.EList;

public class InvokeInternalJVMGen extends InvokeInternalImpl implements GenerableInstruction {

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

		// Configure the invoked transformation: view filter 
		if ( this.getInputViewFilter() != null ) {
			il.append(InstructionFactory.DUP);
			scope.loadVariable(this.getInputViewFilter(), il);
			il.append(ifact.createInvoke(DefaultTypes.IdcTransformation.getClassName(), "configure_invocation_",
				Type.VOID, new Type[] { DefaultTypes.RunnableClosure }, Constants.INVOKEVIRTUAL));
		}
		
		// Set the parent transformation
		il.append(InstructionFactory.DUP);
		scope.generateGetTransformation();
		il.append(InstructionFactory.SWAP);
		il.append(ifact.createInvoke(DefaultTypes.IdcTransformation.getClassName(), "setParentTransformation",
					Type.VOID, new Type[] { DefaultTypes.IdcTransformation }, Constants.INVOKEVIRTUAL));

		// Configure the transformation
		il.append(InstructionFactory.DUP);
		il.append(ifact.createInvoke(DefaultTypes.IdcTransformation.getClassName(), "configure_",
				Type.VOID, new Type[] { }, Constants.INVOKEVIRTUAL));
		
		// Start the transformation
		il.append(InstructionFactory.DUP);
		il.append(ifact.createInvoke(DefaultTypes.IdcTransformation.getClassName(), "start_",
				Type.VOID, new Type[] { }, Constants.INVOKEVIRTUAL));

		il.append(InstructionFactory.ACONST_NULL);
		il.append(new ASTORE( lvg.getIndex() ));
		
	}

	// Similar to invoke external
	private void generateInvokeEntryPoint(GenScope scope, InstructionList il,
			InstructionFactory ifact, String transformationName,
			String entryPointName, LocalVariableGen lvg) {

		throw new UnsupportedOperationException(); // Not sure
		/*
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
		*/
	}

}
