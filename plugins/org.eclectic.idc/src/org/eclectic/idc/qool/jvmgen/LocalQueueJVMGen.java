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
import org.eclectic.idc.qool.AccessByFeatureOptimization;
import org.eclectic.idc.qool.impl.LocalQueueImpl;

public class LocalQueueJVMGen extends LocalQueueImpl implements QueueJVMGen {

	@Override
	public String getClassName() {
		return getType().getClassName();
	}

	@Override
	public ObjectType getType() {
		return new ObjectType(org.eclectic.idc.jvm.runtime.LocalQueue.class.getName());		
	}

	@Override
	public String getFieldName() {
		return this.getName();
	}

	@Override
	public void generateInitField(InstructionList il, InstructionFactory ifact, GenScope scope) {
		LocalQueueJVMGen jvmQ = this;
		ClassGen cg = scope.getClassGen();
		
		il.append(ifact.createNew(jvmQ.getType().getClassName()));
		il.append(new DUP());		

		il.append(ifact.createConstant(jvmQ.getName()));
		il.append(InstructionConstants.THIS); 
		il.append(ifact.createInvoke(jvmQ.getClassName(), "<init>",
					Type.VOID, new Type[] { Type.STRING, DefaultTypes.QoolTransformation }, Constants.INVOKESPECIAL));				
		
		// Stack: queue
		il.append(InstructionConstants.THIS); 
		il.append(InstructionConstants.SWAP); 

		il.append( ifact.createPutField(cg.getClassName(), jvmQ.getFieldName(), jvmQ.getType()) );		
	}

	@Override
	public void generateConfigureOptimizations(InstructionList il, InstructionFactory ifact, GenScope scope) {
		if ( getOptimizations().size() > 1 ) throw new UnsupportedOperationException("Only one optimization at a time supported by now");
		if ( getOptimizations().size() == 1 ) {
			AccessByFeatureOptimization opt = (AccessByFeatureOptimization) getOptimizations().get(0);

			il.append(new DUP());		
			il.append(ifact.createConstant(opt.getFeatureName()));
			il.append(ifact.createInvoke(this.getClassName(), "configureAccessByFeatureOptimization",
					Type.VOID, new Type[] { Type.STRING }, Constants.INVOKEVIRTUAL));				
			
			// TODO: Configure if the access is speculative...
		}


		// Sets the model of the queue statically
		// It is compulsory to have a type for the queue to enable optimizations
		if ( getOptimizations().size() > 0 ) {
			il.append(new DUP());	
			scope.generateGetModel(this.getType_().getModel().getName());
			il.append(ifact.createInvoke(this.getClassName(), "setModel",
					Type.VOID, new Type[] { DefaultTypes.IModel }, Constants.INVOKEVIRTUAL));				
		}
	}

}
