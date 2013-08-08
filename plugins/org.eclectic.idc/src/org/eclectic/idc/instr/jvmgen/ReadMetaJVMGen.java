package org.eclectic.idc.instr.jvmgen;

import org.apache.bcel.Constants;
import org.apache.bcel.generic.ASTORE;
import org.apache.bcel.generic.ClassGen;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.DUP;
import org.apache.bcel.generic.InstructionConstants;
import org.apache.bcel.generic.InstructionFactory;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.LDC;
import org.apache.bcel.generic.LocalVariableGen;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.Type;
import org.eclectic.idc.core.jvmgen.ModelDefinitionJVMGen;
import org.eclectic.idc.instr.ReadMetaKind;
import org.eclectic.idc.instr.impl.ReadMetaImpl;
import org.eclectic.idc.jvm.bcel.DefaultTypes;
import org.eclectic.idc.jvm.context.GenScope;
import org.eclectic.idc.jvm.context.TransformationContext;
import org.eclectic.idc.jvm.gen.CommonGen;
import org.eclectic.idc.jvm.gen.GenerableInstruction;

public class ReadMetaJVMGen extends ReadMetaImpl implements GenerableInstruction {

	/**
	 * A new IdcMetaclass object is created to wrap de 
	 * real metaclass providing additional functionality.
	 * 
	 * <pre>
	 * 		NEW IdcMetaclass 
	 * 		DUP
	 * 		LDC <<model_name>>
	 * 		LDC <<class_name>>
	 * 		INVOKESPECIAL IdcMetaclass.<init>
	 * 		ASTORE !!#variable!!
	 * </pre>
	 */
	@Override
	public void generate(GenScope scope) {
		InstructionList il       = scope.getInstructionList();
		InstructionFactory ifact = scope.getInstructionFactory();
		ConstantPoolGen cpg      = scope.getConstantPool();

		LocalVariableGen lvg = null;
		
		if ( getKind() == ReadMetaKind.METACLASS) {		
			lvg = scope.newLocalVariable(this, DefaultTypes.IdcMetaclass);
			
			lvg.setStart(il.append(ifact.createNew(DefaultTypes.IdcMetaclass)));
			il.append(new DUP());
			
			// il.append(new LDC(cpg.addString(getModel().getName())));
			scope.generateGetTransformation();
			scope.generateGetModel(getModel().getName());
			// CommonGen.generateGetModel(getModel().getName(), il, ifact, scope);

			il.append(new LDC(cpg.addString(getClassName())));
			il.append(ifact.createInvoke(DefaultTypes.IdcMetaclass.getClassName(), "<init>",
				Type.VOID, new Type[] { DefaultTypes.IdcTransformation, DefaultTypes.IModel, Type.STRING },
				Constants.INVOKESPECIAL));
		} else if ( getKind() == ReadMetaKind.THIS_TRANSFORMATION_OBJECT ||
				    getKind() == ReadMetaKind.THIS_TRANSFORMATION_METHOD_HANDLER ) {
			lvg = scope.newLocalVariable(this, DefaultTypes.IdcTransformation);			
			lvg.setStart(il.append(InstructionConstants.NOP));

			scope.generateGetTransformation();
		} else if ( getKind() == ReadMetaKind.MODEL ){
			lvg = scope.newLocalVariable(this, DefaultTypes.IModel);			
			lvg.setStart(il.append(InstructionConstants.NOP));
			scope.generateGetModel(getModel().getName());	
		} else {
			throw new IllegalArgumentException();
		}
		
		il.append(new ASTORE(lvg.getIndex()));
	}

}
