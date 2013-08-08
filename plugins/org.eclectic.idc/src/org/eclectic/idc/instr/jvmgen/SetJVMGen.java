package org.eclectic.idc.instr.jvmgen;

import java.util.LinkedList;
import java.util.List;

import org.eclectic.idc.instr.InstructionWithResult;
import org.eclectic.idc.instr.impl.SetImpl;
import org.eclectic.idc.jvm.context.GenScope;
import org.eclectic.idc.jvm.gen.AnalysableInstruction;
import org.eclectic.idc.jvm.gen.GenerableInstruction;
import org.eclectic.idc.jvm.gen.ModelStrategy;
import org.eclectic.idc.jvm.gen.Processor;

public class SetJVMGen extends SetImpl implements GenerableInstruction, AnalysableInstruction {


	@Override
	public void generate(GenScope scope) {
		ModelStrategy strategy = Processor.getModelStrategy(this, scope.getTransformationContext());
		strategy.genSet(this, scope);	
	}

	@Override
	public List<AnalysableInstruction> getDependencies() {
		if ( this.getValue() instanceof AnalysableInstruction ) {
			AnalysableInstruction instr = (AnalysableInstruction) getValue();
			List<AnalysableInstruction> instructions = instr.getDependencies();
			instructions.add(0, instr);
			return instructions;
		} else {
			assert(! (getValue() instanceof InstructionWithResult) );
			return new LinkedList<AnalysableInstruction>();
		}
	}

}
