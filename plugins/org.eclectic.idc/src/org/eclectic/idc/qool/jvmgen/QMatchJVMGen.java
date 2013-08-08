package org.eclectic.idc.qool.jvmgen;

import org.apache.bcel.Constants;
import org.apache.bcel.generic.ASTORE;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.InstructionConstants;
import org.apache.bcel.generic.InstructionFactory;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.LocalVariableGen;
import org.apache.bcel.generic.Type;
import org.eclectic.idc.instr.jvmgen.ReadMetaJVMGen;
import org.eclectic.idc.jvm.bcel.DefaultTypes;
import org.eclectic.idc.jvm.context.GenScope;
import org.eclectic.idc.jvm.gen.CommonGen;
import org.eclectic.idc.jvm.gen.GenerableInstruction;
import org.eclectic.idc.qool.KindOfPredicate;
import org.eclectic.idc.qool.PropertyEqualsPredicate;
import org.eclectic.idc.qool.QMatchPredicate;
import org.eclectic.idc.qool.impl.QMatchImpl;


public class QMatchJVMGen extends QMatchImpl implements GenerableInstruction {

	@Override
	public void generate(GenScope scope) {
		InstructionList il       = scope.getInstructionList();
		InstructionFactory ifact = scope.getInstructionFactory();
		ConstantPoolGen cpg      = scope.getConstantPool();

		LocalVariableGen lvg = scope.newLocalVariable(this, Type.OBJECT);

		// TODO: I'm going to assume that there is an optional kindOf and
		//       and p() predicate.
		if ( this.getPredicates().size() > 2 )
			throw new UnsupportedOperationException("QMatchJVMGen. Only 2 fixed predicates implemented.");
		
		KindOfPredicate kindOf = null;
		PropertyEqualsPredicate prop = null;
		
		if ( getPredicates().get(0) instanceof KindOfPredicate ) {
			kindOf = (KindOfPredicate) getPredicates().get(0);
			prop   = (PropertyEqualsPredicate) getPredicates().get(1);
		} else {
			prop   = (PropertyEqualsPredicate) getPredicates().get(0);
		}

		// Create the object, then the parameters of the constructor
		String requestClass = "org.eclectic.idc.jvm.runtime.RequestKindProperty";
		il.append(ifact.createNew(requestClass));		
		il.append(InstructionConstants.DUP);		
		
		scope.generateGetModelManager();
		if ( kindOf == null ) {
			il.append(InstructionConstants.ACONST_NULL);
		} else {
			ReadMetaJVMGen readMeta = new ReadMetaJVMGen();
			readMeta.setClassName( kindOf.getClassName() );
			readMeta.setModel( kindOf.getModel() );
			readMeta.setName( "_readMeta_for" + getName() );
			
			readMeta.setFile( this.getFile() );
			readMeta.setColumn( this.getColumn() );
			readMeta.setRow( this.getRow() );
			
			readMeta.generate(scope);
			scope.loadVariable(readMeta, il);			
		}
		
		il.append(ifact.createConstant( prop.getPropertyName() ));
		scope.loadVariable(prop.getValue(), il);
		// In the stack: IdcMetaclass, featureName, value + receptor x 2
				
		il.append(ifact.createInvoke(requestClass, "<init>",
				Type.VOID, new Type[] { DefaultTypes.ModelManager, DefaultTypes.IdcMetaclass, Type.STRING, Type.OBJECT }, Constants.INVOKESPECIAL));

		if ( getGetterClosure() != null ) {
			il.append(InstructionConstants.DUP);
			scope.loadVariable(getGetterClosure(), il);
			il.append(ifact.createInvoke(requestClass,
					"setGetterClosure", Type.VOID, new Type[] { DefaultTypes.IClosure }, Constants.INVOKEVIRTUAL));		
		}
		
		// Generate debug info
		il.append(InstructionConstants.DUP);
		if ( getFile() == null ) {
			il.append(InstructionConstants.ACONST_NULL);
		} else { 
			il.append(ifact.createConstant(getFile()));
		}
		il.append(ifact.createConstant(getRow()));
		il.append(ifact.createConstant(getColumn()));
		il.append(ifact.createInvoke(requestClass, "setDebugInfo",
				Type.VOID, new Type[] { Type.STRING, Type.INT, Type.INT }, Constants.INVOKEVIRTUAL));
		// End-of debug info 
		
		QueueJVMGen jvmQ = (QueueJVMGen) getQueue();
		CommonGen.generateGetQueue(scope, jvmQ);
		il.append(InstructionConstants.SWAP);

		il.append(ifact.createInvoke(DefaultTypes.ContinuationResolverHelper.getClassName(),
				"requestAndWait", Type.OBJECT, new Type[] { DefaultTypes.HistoryQueue, DefaultTypes.IRequest }, Constants.INVOKESTATIC));		
		
		//il.append(ifact.createInvoke(jvmQ.getClassName(),
		//		"requestAndWait", Type.OBJECT, new Type[] { DefaultTypes.IRequest }, Constants.INVOKEVIRTUAL));		
	
		// il.append(InstructionConstants.DUP);
		// CommonGen.print(il, ifact);
		
		il.append(new ASTORE(lvg.getIndex()));
	}

}
