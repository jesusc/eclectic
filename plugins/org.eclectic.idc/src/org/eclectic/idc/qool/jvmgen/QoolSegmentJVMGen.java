package org.eclectic.idc.qool.jvmgen;

import org.apache.bcel.Constants;
import org.apache.bcel.generic.ClassGen;
import org.apache.bcel.generic.InstructionConstants;
import org.apache.bcel.generic.InstructionFactory;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.Type;
import org.eclectic.idc.jvm.bcel.DefaultTypes;
import org.eclectic.idc.jvm.context.ClosureScope;
import org.eclectic.idc.jvm.context.GenScope;
import org.eclectic.idc.jvm.gen.GenUtil;
import org.eclectic.idc.jvm.gen.GenerableFunction;
import org.eclectic.idc.qool.impl.SegmentImpl;

public class QoolSegmentJVMGen extends SegmentImpl implements GenerableFunction {

	private String segmentClassName = null;
	public GenScope generateContinuableClass(GenScope transformationScope) {
		segmentClassName = transformationScope.getClassGen().getClassName() + "$segment$" + getName();
		
		ClassGen cg = new ClassGen(segmentClassName, DefaultTypes.BaseSegment.getClassName(), transformationScope.getTransformationContext().getFilename(),
				Constants.ACC_PUBLIC, new String[] { Runnable.class.getName() });
		
		cg.addEmptyConstructor(Constants.ACC_PUBLIC);

		// ClosureScope is used to allow access to transformation_ and modelManager_ fields 
		GenScope scope = new ClosureScope(transformationScope, cg);		
		generate(cg, scope, "run");

		scope.getTransformationContext().addExtraClass(cg.getJavaClass());
		
		return scope;		
	}

	public String getSegmentClassName() {
		if ( segmentClassName == null ) throw new IllegalStateException();
		return segmentClassName;
	}
	
	
	@Override
	public void generate(ClassGen cg, GenScope scope) {
		generate(cg, scope, this.getName());
	}
	
	public void generate(ClassGen cg, GenScope scope, String methodName) {
		InstructionList il = new InstructionList();

		MethodGen mg = new MethodGen(Constants.ACC_PUBLIC,// access flags
				Type.VOID, // return type
				null, null, // arg
				// names
				methodName, cg.getClassName(), // method, class
				il, cg.getConstantPool());
		
		scope.processMethod(mg);
		
		GenUtil.generate(this, cg, mg, scope);
		
		cg.addMethod(mg.getMethod());
	}

	@Override
	public void genFunctionCallCode(ClassGen cg, MethodGen mg) {
		InstructionList il = mg.getInstructionList();
		InstructionFactory ifact = new InstructionFactory(cg);
		
		il.append(InstructionFactory.createLoad(Type.OBJECT, 0));
		il.append(ifact.createInvoke(cg.getClassName(), 
						this.getName(), 
						Type.VOID, Type.NO_ARGS, Constants.INVOKEVIRTUAL));	
	}

	public void genContinuableCallCode(GenScope transformationScope, ClassGen cg, MethodGen mg) {
		InstructionList il = mg.getInstructionList();
		InstructionFactory ifact = new InstructionFactory(cg);

		il.append(InstructionConstants.THIS);
		il.append(ifact.createConstant(getSegmentClassName()));
		transformationScope.generateGetTransformation();
		transformationScope.generateGetModelManager();
		il.append(ifact.createInvoke(DefaultTypes.QoolTransformation.getClassName(), "startSegment",
				Type.VOID, new Type[] { Type.STRING, DefaultTypes.IdcTransformation, DefaultTypes.ModelManager }, Constants.INVOKEVIRTUAL));		
		
		/*
		il.append(ifact.createConstant(getSegmentClassName()));
		transformationScope.generateGetTransformation();
		transformationScope.generateGetModelManager();
		il.append(ifact.createInvoke(DefaultTypes.RuntimeUtil.getClassName(), "startSegment",
				Type.VOID, new Type[] { Type.STRING, DefaultTypes.IdcTransformation, DefaultTypes.ModelManager }, Constants.INVOKESTATIC));		
		*/
	}

}
