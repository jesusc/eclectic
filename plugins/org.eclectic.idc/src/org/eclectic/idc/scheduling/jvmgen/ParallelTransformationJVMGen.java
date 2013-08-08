package org.eclectic.idc.scheduling.jvmgen;

import org.apache.bcel.Constants;
import org.apache.bcel.generic.ClassGen;
import org.apache.bcel.generic.DUP;
import org.apache.bcel.generic.INVOKESPECIAL;
import org.apache.bcel.generic.InstructionConstants;
import org.apache.bcel.generic.InstructionFactory;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.Type;
import org.eclectic.idc.jvm.JVMCompilationResult;
import org.eclectic.idc.jvm.bcel.DefaultTypes;
import org.eclectic.idc.jvm.context.GenScope;
import org.eclectic.idc.jvm.context.TransformationContext;
import org.eclectic.idc.jvm.runtime.ParallelTransformationBase;
import org.eclectic.idc.scheduling.TransformationExecution;
import org.eclectic.idc.scheduling.impl.ParallelTransformationImpl;

public class ParallelTransformationJVMGen extends ParallelTransformationImpl {

	public void generate(JVMCompilationResult result) {
		TransformationContext context = new TransformationContext(this, null);
		result.addTransformation(context);
		
		ClassGen cg = new ClassGen(context.getRuntimeClassName(), ParallelTransformationBase.class.getName(),
				context.getFilename(), Constants.ACC_PUBLIC | Constants.ACC_SUPER,
				new String[] {});

		GenScope scope   = new GenScope(context, cg);           

		//cg.addEmptyConstructor(Constants.ACC_PUBLIC);
		createConstructor(scope, cg);


		context.setJavaClass( cg.getJavaClass() );
	}
	
	private void createConstructor(GenScope scope, ClassGen cg) {
		InstructionList il = new InstructionList();
		InstructionFactory ifact = new InstructionFactory(cg);
	
		// Call super
        il.append(InstructionConstants.THIS); 
        il.append(new INVOKESPECIAL(cg.getConstantPool().addMethodref(cg.getSuperclassName(), "<init>", "()V")));
        
        // Instantiate and register each transformation to be executed 
		for (TransformationExecution exec : getExecutions()) {
			// TODO: Ensure the name obtained with "getTransformationName" is the one of the generated transformation (weak link now!)
			String transformationClassName = exec.getTransformationName();
			// TODO: Find out the class package name!!
			transformationClassName = "eclectic." + transformationClassName;
			
			il.append(ifact.createNew(transformationClassName)); 
			il.append(new DUP());		
			il.append(ifact.createInvoke(transformationClassName, "<init>",
					Type.VOID, new Type[] { }, Constants.INVOKESPECIAL));

			il.append(InstructionConstants.THIS); 
			il.append(InstructionConstants.SWAP); 
			il.append(ifact.createInvoke(cg.getClassName(), "register",
						Type.VOID, new Type[] { DefaultTypes.IdcTransformation }, Constants.INVOKEVIRTUAL));				
		}
			
        il.append(InstructionConstants.RETURN);

        MethodGen mg = new MethodGen(Constants.ACC_PUBLIC, Type.VOID, new Type[] { } , null, "<init>",
                cg.getClassName(), il, cg.getConstantPool());
        mg.setMaxStack();
        cg.addMethod(mg.getMethod());		
	}
	
}
