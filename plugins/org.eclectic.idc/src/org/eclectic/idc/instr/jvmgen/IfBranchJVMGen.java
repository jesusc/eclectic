package org.eclectic.idc.instr.jvmgen;

import org.apache.bcel.Constants;
import org.apache.bcel.generic.ASTORE;
import org.apache.bcel.generic.BranchInstruction;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.InstructionConstants;
import org.apache.bcel.generic.InstructionFactory;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.LDC;
import org.apache.bcel.generic.LocalVariableGen;
import org.apache.bcel.generic.Type;
import org.eclectic.idc.core.Variable;
import org.eclectic.idc.instr.impl.IfBranchImpl;
import org.eclectic.idc.jvm.bcel.DefaultTypes;
import org.eclectic.idc.jvm.context.GenScope;
import org.eclectic.idc.jvm.gen.GenUtil;
import org.eclectic.idc.jvm.gen.GenerableInstruction;

public class IfBranchJVMGen extends IfBranchImpl implements GenerableInstruction {

	@Override
	public void generate(GenScope scope) {
		throw new IllegalStateException();
		
		/*
		InstructionList il       = scope.getInstructionList();
		InstructionFactory ifact = scope.getInstructionFactory();
		ConstantPoolGen cpg      = scope.getConstantPool();

		Variable realBooleanVariable = scope.getRealVariable(this.getBooleanVariable());

		LocalVariableGen lvg = scope.newLocalVariable(this, Type.OBJECT);

		BranchInstruction branchToEnd = InstructionFactory
				.createBranchInstruction(Constants.GOTO, null);
		BranchInstruction branchToElse = InstructionFactory
				.createBranchInstruction(Constants.IFEQ, null);
		
		// push the boolean condition
		scope.loadVariable(realBooleanVariable, il);		
		lvg.setStart(
				il.append(ifact.createInvoke(DefaultTypes.RuntimeModel.getClassName(),
						"isTrueObject", Type.BOOLEAN, new Type[] { Type.OBJECT },
						Constants.INVOKESTATIC))
					);
	
		il.append(InstructionFactory.ACONST_NULL);
		il.append(new ASTORE( lvg.getIndex() ));
		
		il.append(branchToElse);
		// if condition is fulfilled, control flow does not jump
		GenUtil.generate(this.getIfBlock(), scope.getClassGen(), scope.getCurrentMethod(), scope, true, true);
		il.append(new ASTORE( lvg.getIndex() ));
		
		il.append(branchToEnd);

		// target of the else
		branchToElse.setTarget(il.append(InstructionConstants.NOP));		

		if ( getElseBlock() != null ) {
			GenUtil.generate(this.getElseBlock(), scope.getClassGen(), scope.getCurrentMethod(), scope, true, true);	
			il.append(new ASTORE( lvg.getIndex() ));
		}
		// target of END jump
		branchToEnd.setTarget(il.append(InstructionConstants.NOP));		

		*/
	}
	

}
