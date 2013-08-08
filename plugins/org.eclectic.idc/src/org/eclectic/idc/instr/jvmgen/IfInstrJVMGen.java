package org.eclectic.idc.instr.jvmgen;

import org.apache.bcel.Constants;
import org.apache.bcel.generic.ASTORE;
import org.apache.bcel.generic.BranchInstruction;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.InstructionConstants;
import org.apache.bcel.generic.InstructionFactory;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.LDC;
import org.apache.bcel.generic.LocalVariableGen;
import org.apache.bcel.generic.Type;
import org.eclectic.idc.core.Variable;
import org.eclectic.idc.instr.IfBranch;
import org.eclectic.idc.instr.impl.IfBranchImpl;
import org.eclectic.idc.instr.impl.IfInstrImpl;
import org.eclectic.idc.jvm.bcel.DefaultTypes;
import org.eclectic.idc.jvm.context.GenScope;
import org.eclectic.idc.jvm.gen.GenUtil;
import org.eclectic.idc.jvm.gen.GenerableInstruction;

public class IfInstrJVMGen extends IfInstrImpl implements GenerableInstruction {

	@Override
	public void generate(GenScope scope) {
		InstructionList il       = scope.getInstructionList();
		InstructionFactory ifact = scope.getInstructionFactory();
		ConstantPoolGen cpg      = scope.getConstantPool();
		LocalVariableGen lvg = scope.newLocalVariable(this, Type.OBJECT);

		lvg.setStart(il.append(InstructionConstants.NOP)); // Start someplace easily

		il.append(InstructionFactory.ACONST_NULL);
		il.append(new ASTORE( lvg.getIndex() ));

		// int hasElse = getElseBlock() == null ? 0 : 1;
		BranchInstruction[] branchToNext   = new BranchInstruction[getElsifs().size() + 1];
		BranchInstruction[] branchGotoLast = new BranchInstruction[getElsifs().size() + 1];
		
		for(int i = 0; i < getElsifs().size() + 1; i++) {
			branchToNext[i] = InstructionFactory
					.createBranchInstruction(Constants.IFEQ, null);
		}

		/*
		if (  getElseBlock() != null ) {
			branchToNext[getElsifs().size()] = InstructionFactory
					.createBranchInstruction(Constants.IFEQ, null);
		}
		*/
		
		for(int i = 0; i < branchGotoLast.length; i++) {
			branchGotoLast[i] = InstructionFactory.createBranchInstruction(Constants.GOTO, null);
		}

		int gotoLastIdx = 0;
		int branchToNextLastIdx = 0;
		InstructionHandle lastInstr = null;

		// Generate instructions for "then". Only for the then part, the instructions of the condition
		// could be outside the branch (this is for compatibility with already existing compilers)
		if ( this.getThen().getInstructions().size() > 0 )
			GenUtil.generate(this.getThen(), scope.getClassGen(), scope.getCurrentMethod(), scope, false, true);			

		// Generate ifeq == 0
		genEqInstruction(scope, il, ifact, this.getThen().getBooleanVariable());

		// Jump to next if not satisfied
		il.append(branchToNext[branchToNextLastIdx]);
		
		// Generate the body and store the result
		GenUtil.generate(this.getThen().getIfBlock(), scope.getClassGen(), scope.getCurrentMethod(), scope, true, true);			
		il.append(new ASTORE( lvg.getIndex() ));
		
		// Jump to the end of the instruction
		lastInstr = il.append(branchGotoLast[gotoLastIdx++]);
		
		
		for(int i = 0; i < getElsifs().size(); i++) {
			IfBranch elsif = getElsifs().get(i);
			
			// Generate condition
			GenUtil.generate(elsif, scope.getClassGen(), scope.getCurrentMethod(), scope, false, true);			

			// Just get the first instruction of the condition, to make it the label of the previous branchToNext
			branchToNext[branchToNextLastIdx++].setTarget(lastInstr.getNext());

			// Generate ifeq
			genEqInstruction(scope, il, ifact, elsif.getBooleanVariable());

			// Jump to next if not satisfied
			il.append(branchToNext[branchToNextLastIdx]);

			// Generate the body and store the result			
			GenUtil.generate(elsif.getIfBlock(), scope.getClassGen(), scope.getCurrentMethod(), scope, true, true);			
			il.append(new ASTORE( lvg.getIndex() ));		
			
			// Jump to the end of the instruction			
			lastInstr = il.append(branchGotoLast[gotoLastIdx++]);
		}
		
		if ( getElseBlock() != null ) {
			GenUtil.generate(getElseBlock(), scope.getClassGen(), scope.getCurrentMethod(), scope, true, true);			
			il.append(new ASTORE( lvg.getIndex() ));		

			// Get the first instruction of the body, to make it the label of the previous branchToNext
			branchToNext[branchToNextLastIdx++].setTarget(lastInstr.getNext());
		}

		InstructionHandle last = il.append(InstructionConstants.NOP);		
		for (BranchInstruction branchInstruction : branchGotoLast) {
			branchInstruction.setTarget(last);
		}
		
		if ( getElseBlock() == null ) {
			branchToNext[branchToNextLastIdx++].setTarget(last);			
		}
	
	}

	private void genEqInstruction(GenScope scope, InstructionList il,
			InstructionFactory ifact, Variable v) {
		Variable realBooleanVariable = scope.getRealVariable(v);
		scope.loadVariable(realBooleanVariable, il);		
				il.append(ifact.createInvoke(DefaultTypes.RuntimeModel.getClassName(),
						"isTrueObject", Type.BOOLEAN, new Type[] { Type.OBJECT },
						Constants.INVOKESTATIC));
	}

}
