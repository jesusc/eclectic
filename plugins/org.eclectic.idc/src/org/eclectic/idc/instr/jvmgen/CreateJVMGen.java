package org.eclectic.idc.instr.jvmgen;

import java.util.LinkedList;
import java.util.List;

import org.apache.bcel.generic.ASTORE;
import org.apache.bcel.generic.ClassGen;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.InstructionFactory;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.LDC;
import org.apache.bcel.generic.LocalVariableGen;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.Type;
import org.eclectic.idc.core.Variable;
import org.eclectic.idc.instr.impl.CreateImpl;
import org.eclectic.idc.jvm.bcel.DefaultTypes;
import org.eclectic.idc.jvm.context.GenScope;
import org.eclectic.idc.jvm.context.TransformationContext;
import org.eclectic.idc.jvm.gen.AnalysableInstruction;
import org.eclectic.idc.jvm.gen.CommonGen;
import org.eclectic.idc.jvm.gen.GenerableInstruction;
import org.eclectic.idc.jvm.gen.ModelStrategy;
import org.eclectic.idc.jvm.gen.Processor;

public class CreateJVMGen extends CreateImpl implements GenerableInstruction, AnalysableInstruction {
	
	@Override
	public void generate(GenScope scope) {
		InstructionList il       = scope.getInstructionList();
		
		LocalVariableGen lvg = scope.newLocalVariable(this, Type.OBJECT);

		// create element
		ModelStrategy strategy = Processor.getModelStrategy(this, scope.getTransformationContext());
		strategy.genCreate(this, scope);
		
		// store result
		il.append(new ASTORE( lvg.getIndex() ));
	}

	@Override
	public List<AnalysableInstruction> getDependencies() {
		return new LinkedList<AnalysableInstruction>();
	}


}
