package org.eclectic.idc.qool.jvmgen;

import org.apache.bcel.Constants;
import org.apache.bcel.generic.ClassGen;
import org.apache.bcel.generic.DUP;
import org.apache.bcel.generic.InstructionConstants;
import org.apache.bcel.generic.InstructionFactory;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.Type;
import org.eclectic.idc.core.TypeInfo;
import org.eclectic.idc.core.jvmgen.ModelDefinitionJVMGen;
import org.eclectic.idc.extensions.PotencyExtension;
import org.eclectic.idc.jvm.bcel.DefaultTypes;
import org.eclectic.idc.jvm.context.GenScope;
import org.eclectic.idc.qool.ModelElementQueue;
import org.eclectic.idc.qool.impl.ModelElementQueueImpl;

public class ModelElementQueueJVMGen extends ModelElementQueueImpl implements QueueJVMGen {

	@Override
	public String getClassName() {
		return getType().getClassName();
	}

	@Override
	public ObjectType getType() {
		ModelDefinitionJVMGen jvmgen = (ModelDefinitionJVMGen) this.getType_().getModel();
		if ( jvmgen.isStreamingModel() ) 
			return new ObjectType(org.eclectic.idc.jvm.runtime.StreamedModelQueue.class.getName());
		return new ObjectType(org.eclectic.idc.jvm.runtime.ModelQueue.class.getName());		
	}

	@Override
	public String getFieldName() {
		return this.getName();
	}

	@Override
	public void generateInitField(InstructionList il, InstructionFactory ifact, GenScope scope) {
		ModelElementQueueJVMGen jvmQ = this;
		ClassGen cg = scope.getClassGen();
		
		il.append(ifact.createNew(jvmQ.getType().getClassName()));
		il.append(new DUP());		

		il.append(ifact.createConstant( jvmQ.getName()));
		il.append(ifact.createConstant( ((ModelElementQueue) jvmQ).getType_().getModel().getName() ) );
		il.append(ifact.createConstant( ((ModelElementQueue) jvmQ).getType_().getClassifierName() ) );
		il.append(InstructionConstants.THIS); 
		il.append(ifact.createInvoke(jvmQ.getClassName(), "<init>",
				Type.VOID, new Type[] { Type.STRING, Type.STRING, Type.STRING, DefaultTypes.QoolTransformation }, Constants.INVOKESPECIAL));

		// Set if the type is strict (no subclasses)
		il.append(InstructionConstants.DUP);
		il.append(ifact.createConstant( this.getType_().isStrictType() ));
		il.append(ifact.createInvoke(jvmQ.getClassName(), "setStrictType",
				Type.VOID, new Type[] { Type.BOOLEAN }, Constants.INVOKEVIRTUAL));			

		
		for(TypeInfo info : getAdditionals()) {
			il.append(InstructionConstants.DUP);
			il.append(ifact.createConstant( info.getModel().getName() ));
			il.append(ifact.createConstant( info.getClassifierName() ));
			il.append(ifact.createConstant( info.isStrictType() ));
			il.append(ifact.createInvoke(jvmQ.getClassName(), "addAdditionalType",
					Type.VOID, new Type[] { Type.STRING,Type.STRING, Type.BOOLEAN }, 
					Constants.INVOKEVIRTUAL));			
		}
		
		// Dealing with potency
		if ( this.extension != null && this.extension instanceof PotencyExtension ) {
			il.append(InstructionConstants.DUP);
			il.append(ifact.createConstant( ((PotencyExtension) extension).getPotency() ));
			il.append(ifact.createInvoke(jvmQ.getClassName(), "setPotency",
					Type.VOID, new Type[] { Type.INT }, Constants.INVOKEVIRTUAL));			
		}
		
		il.append(InstructionConstants.THIS); 
		il.append(InstructionConstants.SWAP); 

		il.append( ifact.createPutField(cg.getClassName(), jvmQ.getFieldName(), jvmQ.getType()) );
		
	}

	@Override
	public void generateConfigureOptimizations(InstructionList il, InstructionFactory ifact, GenScope scope) {
		// Nothing so far
	}

}
