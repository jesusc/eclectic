package org.eclectic.idc.qool.jvmgen;

import java.util.List;

import org.apache.bcel.Constants;
import org.apache.bcel.generic.InstructionConstants;
import org.apache.bcel.generic.InstructionFactory;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.Type;
import org.eclectic.idc.jvm.bcel.DefaultTypes;
import org.eclectic.idc.jvm.context.GenScope;
import org.eclectic.idc.jvm.gen.CommonGen;
import org.eclectic.idc.jvm.gen.GenerableInstruction;
import org.eclectic.idc.qool.impl.QEmitImpl;

public class QEmitJVMGen extends QEmitImpl implements GenerableInstruction {

	@Override
	public void generate(GenScope scope) {
		QueueJVMGen jvmQ = (QueueJVMGen) this.getQueue();

		// Load the closure into 
		InstructionList il       = scope.getInstructionList();
		InstructionFactory ifact = scope.getInstructionFactory();		

		// Get the queue
		CommonGen.generateGetQueue(scope, jvmQ);
		
		// Register the closure		
		scope.loadVariable(this.getValue(), il);
		il.append(ifact.createInvoke(jvmQ.getClassName(),
				"put", Type.VOID, new Type[] { Type.OBJECT }, Constants.INVOKEVIRTUAL));
	}

}
