package org.eclectic.idc.qool.jvmgen;

import org.apache.bcel.Constants;
import org.apache.bcel.generic.InstructionConstants;
import org.apache.bcel.generic.InstructionFactory;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.Type;
import org.eclectic.idc.core.CoreFactory;
import org.eclectic.idc.core.Instruction;
import org.eclectic.idc.core.Parameter;
import org.eclectic.idc.instr.jvmgen.ClosureDefJVMGen;
import org.eclectic.idc.jvm.bcel.DefaultTypes;
import org.eclectic.idc.jvm.context.GenScope;
import org.eclectic.idc.jvm.gen.GenerableInstruction;
import org.eclectic.idc.qool.impl.QForAllImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class QForAllJVMGen extends QForAllImpl implements GenerableInstruction {
	private static int ForAllCounter = 1;
	
	@Override
	public void generate(GenScope scope) {
		QueueJVMGen jvmQ = (QueueJVMGen) this.getQueue();
		
		// Generate a closure that will be called 
		QForAllContents closureGen = new QForAllContents();
		closureGen.generate(scope);

		// Load the closure into 
		InstructionList il       = scope.getInstructionList();
		InstructionFactory ifact = scope.getInstructionFactory();		

		// Get the queue
		// TODO: I need to find out a better way of getting the transformation
		//       because when I put some class that is not a closure and the code need
		//       the transformation this just does not work (and fail in the validation with 
		//       "incompatible argument for function call" !
		scope.generateGetTransformation();
		il.append(ifact.createCheckCast(new ObjectType(scope.getTransformationContext().getRuntimeClassName())));		
		il.append(ifact.createGetField(scope.getTransformationContext().getRuntimeClassName(), jvmQ.getFieldName(), jvmQ.getType()));

		// Register the closure		 org.eclectic.idc.jvm.runtime
		scope.loadVariable(closureGen, il);
		il.append(ifact.createInvoke(jvmQ.getType().getClassName(),
				"requestAll", Type.VOID, new Type[] { DefaultTypes.IClosure }, Constants.INVOKEVIRTUAL));
	} 
	
	class QForAllContents extends ClosureDefJVMGen {
		
		public QForAllContents() {
			this.setName("ForAll" + QForAllJVMGen.this.getName());
			
			Parameter p = CoreFactory.eINSTANCE.createParameter();
			p.setName(QForAllJVMGen.this.getName());			
			p.setType( EcoreUtil.copy(QForAllJVMGen.this.getType()) );
			this.getFormalParameters().add(p);
		}
		
		@Override
		public EList<Instruction> getInstructions() {
			return QForAllJVMGen.this.getInstructions();
		}
	}

}
