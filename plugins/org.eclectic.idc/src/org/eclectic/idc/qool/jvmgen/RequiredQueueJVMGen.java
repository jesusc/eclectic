package org.eclectic.idc.qool.jvmgen;

import org.apache.bcel.Constants;
import org.apache.bcel.generic.ClassGen;
import org.apache.bcel.generic.DUP;
import org.apache.bcel.generic.InstructionConstants;
import org.apache.bcel.generic.InstructionFactory;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.Type;
import org.eclectic.idc.jvm.bcel.DefaultTypes;
import org.eclectic.idc.jvm.context.GenScope;
import org.eclectic.idc.jvm.gen.CommonGen;
import org.eclectic.idc.jvm.runtime.RequiredQueue;
import org.eclectic.idc.qool.impl.RequiredQueueImpl;

public class RequiredQueueJVMGen extends RequiredQueueImpl implements QueueJVMGen {

	@Override
	public String getClassName() {
		return getType().getClassName();
	}

	@Override
	public ObjectType getType() {
		return new ObjectType(org.eclectic.idc.jvm.runtime.RequiredQueue.class.getName());		
	}

	@Override
	public String getFieldName() {
		return this.getName();
	}

	@Override
	public void generateInitField(InstructionList il, InstructionFactory ifact, GenScope scope) {
		RequiredQueueJVMGen jvmQ = this;
		ClassGen cg = scope.getClassGen();
		
		il.append(ifact.createNew(jvmQ.getType().getClassName()));
		il.append(new DUP());		

		il.append(ifact.createConstant(jvmQ.getName()));
		// il.append(InstructionConstants.THIS); 
		/*
		il.append(ifact.createInvoke(jvmQ.getClassName(), "<init>",
					Type.VOID, new Type[] { Type.STRING, DefaultTypes.QoolTransformation }, Constants.INVOKESPECIAL));				
		*/
		// required queues do not take a qool transformation, but just delegates in one
		il.append(ifact.createInvoke(jvmQ.getClassName(), "<init>",
				Type.VOID, new Type[] { Type.STRING }, Constants.INVOKESPECIAL));				
		
		// Set the field
		il.append(InstructionConstants.THIS); 
		il.append(InstructionConstants.SWAP); 

		il.append( ifact.createPutField(cg.getClassName(), jvmQ.getFieldName(), jvmQ.getType()) );		
	}
	
	public void generateConfigure(InstructionList il, InstructionFactory ifact, GenScope scope) {
		RequiredQueueJVMGen jvmQ = this;
		ClassGen cg = scope.getClassGen();
		
		// Set the delegate
		// 1. Get the transformation (as a model)
		// 2. Obtain the queue
		il.append( InstructionFactory.THIS );
		il.append( ifact.createGetField(cg.getClassName(), jvmQ.getFieldName(), jvmQ.getType()) );		
		scope.generateGetModel(getImportedModel().getName());
		il.append(ifact.createCheckCast(DefaultTypes.QoolTransformation));
		il.append(ifact.createConstant(this.getName()));
		il.append(ifact.createInvoke(DefaultTypes.QoolTransformation.getClassName(), "getQueue",
					DefaultTypes.IQueue, new Type[] { Type.STRING }, Constants.INVOKEVIRTUAL));
		//CommonGen.print(il, ifact);
		
		il.append(ifact.createInvoke(jvmQ.getClassName(), "setDelegate",
				Type.VOID, new Type[] { DefaultTypes.IQueue }, Constants.INVOKEVIRTUAL));				
		
	}

	@Override
	public void generateConfigureOptimizations(InstructionList il, InstructionFactory ifact, GenScope scope) {
		// Nothing so far
	}
	
}
