package org.eclectic.idc.instr.jvmgen;



import java.util.LinkedList;
import java.util.List;

import org.apache.bcel.generic.ASTORE;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.LocalVariableGen;
import org.apache.bcel.generic.Type;
import org.eclectic.idc.instr.Assign;
import org.eclectic.idc.instr.InstructionWithResult;
import org.eclectic.idc.instr.impl.AssignImpl;
import org.eclectic.idc.jvm.context.GenScope;
import org.eclectic.idc.jvm.gen.AnalysableInstruction;
import org.eclectic.idc.jvm.gen.GenerableInstruction;

public class AssignJVMGen extends AssignImpl implements Assign,
		GenerableInstruction, AnalysableInstruction {

	@Override
	public void generate(GenScope scope) {
		InstructionList il       = scope.getInstructionList();

		// if (CompilerFlags.use_assign) {
		LocalVariableGen lvg = scope.newLocalVariable(this, Type.OBJECT);
		scope.loadVariable(rightVariable, il);
		il.append(new ASTORE(lvg.getIndex()));
		// }		
	}

	@Override
	public List<AnalysableInstruction> getDependencies() {
		if ( this.getRightVariable() instanceof AnalysableInstruction ) {
			AnalysableInstruction instr = (AnalysableInstruction) getRightVariable();
			List<AnalysableInstruction> instructions = instr.getDependencies();
			instructions.add(0, instr);
			return instructions;
		} else {
			assert(! (getRightVariable() instanceof InstructionWithResult) );
			return new LinkedList<AnalysableInstruction>();
		}
	}

}
