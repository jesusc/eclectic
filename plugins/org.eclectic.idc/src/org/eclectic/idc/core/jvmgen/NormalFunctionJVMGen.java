package org.eclectic.idc.core.jvmgen;


import org.apache.bcel.Constants;
import org.apache.bcel.generic.ALOAD;
import org.apache.bcel.generic.ClassGen;
import org.apache.bcel.generic.InstructionConstants;
import org.apache.bcel.generic.InstructionFactory;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.LocalVariableGen;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.SWAP;
import org.apache.bcel.generic.Type;
import org.eclectic.idc.core.Instruction;
import org.eclectic.idc.core.impl.NormalFunctionImpl;
import org.eclectic.idc.instr.InstructionWithResult;
import org.eclectic.idc.jvm.context.GenScope;
import org.eclectic.idc.jvm.context.TransformationContext;
import org.eclectic.idc.jvm.gen.GenUtil;
import org.eclectic.idc.jvm.gen.GenerableFunction;
import org.eclectic.idc.jvm.gen.GenerableInstruction;

public class NormalFunctionJVMGen extends NormalFunctionImpl implements GenerableFunction {
	

	/**
	 * Generates one method in the given ClassGen.
	 */
	@Override
	public void generate(ClassGen cg, GenScope parentScope) {
		GenScope scope = new GenScope(parentScope, cg);
		
		/*
		ClassGen cg = new ClassGen(name, NormalFunctionAux.class.getName(),
				this.getFile(), Constants.ACC_PUBLIC | Constants.ACC_SUPER,
				new String[] {});

		cg.addEmptyConstructor(Constants.ACC_PUBLIC);
		*/
		InstructionList il = new InstructionList();
		InstructionFactory ifact = new InstructionFactory(cg);

		MethodGen mg = new MethodGen(Constants.ACC_PUBLIC,// access flags
				Type.VOID, // return type
				null, null, // arg
				// names
				this.getName(), cg.getClassName(), // method, class
				il, cg.getConstantPool());
		
		scope.processMethod(mg);
		
		GenUtil.generate(this, cg, mg, scope);
		
		cg.addMethod(mg.getMethod());		
	}

	@Override
	public void genFunctionCallCode(ClassGen cg, MethodGen mg) {
		InstructionList il = mg.getInstructionList();
		InstructionFactory ifact = new InstructionFactory(cg);
		
		il.append(InstructionFactory.createLoad(Type.OBJECT, 0));
		il.append(ifact.createInvoke(cg.getClassName(), 
						this.getName(), 
						Type.VOID, Type.NO_ARGS, Constants.INVOKEVIRTUAL));		
	}
	
}
