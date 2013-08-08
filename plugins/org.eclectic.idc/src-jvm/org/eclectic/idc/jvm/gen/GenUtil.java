package org.eclectic.idc.jvm.gen;

import org.apache.bcel.generic.ALOAD;
import org.apache.bcel.generic.ClassGen;
import org.apache.bcel.generic.InstructionConstants;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.LocalVariableGen;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.SWAP;
import org.eclectic.idc.core.Instruction;
import org.eclectic.idc.core.InstructionBlock;
import org.eclectic.idc.core.Variable;
import org.eclectic.idc.instr.InstructionWithResult;
import org.eclectic.idc.jvm.context.GenScope;
import org.eclectic.idc.jvm.context.TransformationContext;

public class GenUtil {
	
	public static void generate(InstructionBlock b, ClassGen cg, MethodGen mg, GenScope scope) {
		generate(b, cg, mg, scope, false, false);
	}
	
	public static void generate(InstructionBlock b, ClassGen cg, MethodGen mg, GenScope scope, boolean withReturnValue) {
		generate(b, cg, mg, scope, withReturnValue, false);
	}
	
	public static void generate(InstructionBlock b, ClassGen cg, MethodGen mg, GenScope scope, boolean withReturnValue, boolean isInline) {
		InstructionList il = mg.getInstructionList();
		Instruction last   = null;

		Instruction i             = b.getInstructions().get(0);
		GenerableInstruction inst = (GenerableInstruction) i;
		last = i;			
		inst.generate(scope);		
		mg.addLineNumber(il.getStart(), i.getRow());
	
		
		for(int n = 1; n < b.getInstructions().size(); n++) {
			i    = b.getInstructions().get(n);
			inst = (GenerableInstruction) i;

			mg.addLineNumber(il.getEnd(), i.getRow());
			inst.generate(scope);		
			last = i;
		}

		/* This has the problem that line numbers are note properly generated because
		 * if there in one of the bytecodes of the instruction, you get the line number of the previous instruction
		for (Instruction i : b.getInstructions()) {
			GenerableInstruction inst = (GenerableInstruction) i;
			inst.generate(scope);
			
			mg.addLineNumber(il.getEnd(), i.getRow());
			last = i;			
		}
		*/		
		
		InstructionHandle end = null;
		if ( withReturnValue ) {
			if (! ( last instanceof InstructionWithResult)) {
				il.append(InstructionConstants.ACONST_NULL);
			} else {
				scope.loadVariable((Variable) last, il);
			}
			
			if ( ! isInline ) 
				end = il.append(InstructionConstants.ARETURN);
		} else {
			if ( ! isInline )
				end = il.append(InstructionConstants.RETURN);
		}

		if ( ! isInline ) {
			// int i = 0;
			for (LocalVariableGen lvg : mg.getLocalVariables()) {
				// if ( i > 1 )
				// if ( lvg.getEnd() == null )
					lvg.setEnd(end);
				// i++;
			}		
	
			// TODO: Instructions should modify this...
			// mg.setMaxStack(100);
			// mg.setMaxLocals(mg.getLocalVariables().length);
			mg.setMaxStack();
			mg.setMaxLocals();
		}

	}
}
