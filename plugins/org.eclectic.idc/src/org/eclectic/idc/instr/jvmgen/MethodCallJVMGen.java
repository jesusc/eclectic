package org.eclectic.idc.instr.jvmgen;

import org.apache.bcel.Constants;
import org.apache.bcel.generic.ALOAD;
import org.apache.bcel.generic.ASTORE;
import org.apache.bcel.generic.ArrayType;
import org.apache.bcel.generic.BranchInstruction;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.InstructionConstants;
import org.apache.bcel.generic.InstructionFactory;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.LocalVariableGen;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.Type;
import org.eclectic.idc.core.ImportedModel;
import org.eclectic.idc.core.ModelDefinition;
import org.eclectic.idc.core.Variable;
import org.eclectic.idc.instr.ReadMeta;
import org.eclectic.idc.instr.ReadMetaKind;
import org.eclectic.idc.instr.impl.MethodCallImpl;
import org.eclectic.idc.jvm.bcel.DefaultTypes;
import org.eclectic.idc.jvm.context.GenScope;
import org.eclectic.idc.jvm.gen.CommonGen;
import org.eclectic.idc.jvm.gen.GenerableInstruction;
import org.eclectic.idc.jvm.runtime.IClosure;
import org.eclectic.idc.jvm.runtime.MethodLibraryBase;
import org.eclectic.idc.jvm.runtime.RunnableClosure;

public class MethodCallJVMGen extends MethodCallImpl implements GenerableInstruction {

	/*
	@Override
	public void generate(GenScope scope) {
		InstructionList il       = scope.getInstructionList();
		InstructionFactory ifact = scope.getInstructionFactory();
		ConstantPoolGen cpg      = scope.getConstantPool();
		
		LocalVariableGen lvg  = scope.newLocalVariable(this, Type.OBJECT);	
		Variable realReceptor = scope.getRealVariable(this.receptor);
		
		LocalVariableGen params = scope.getCurrentMethod().addLocalVariable(
				scope.uniqueId("params"),
				DefaultTypes.JavaList, null, null);

		// il.append(ifact.createPrintln("INICIO METHODCALL"));
		// Null initialization
		//lvg.setStart(il.append(InstructionConstants.ACONST_NULL));
		
		// Null initialization
		il.append(InstructionConstants.ACONST_NULL);
		il.append(new ASTORE(lvg.getIndex()));


		// create params list, store in "params"
		il.append(ifact.createNew(DefaultTypes.JavaList));
		il.append(new DUP());
		il.append(ifact.createInvoke(DefaultTypes.JavaList.getClassName(), "<init>",
				Type.VOID, new Type[] {}, Constants.INVOKESPECIAL));
		il.append(new ASTORE(params.getIndex()));

		// add parameters to the "params" list
		if (actualParameters != null) {
			for (Variable var : actualParameters) {
				il.append(new ALOAD(params.getIndex()));
				scope.loadVariable(var, il);
				il.append(ifact.createInvoke(List.class.getName(),
						"add", Type.BOOLEAN,
						new Type[] { Type.OBJECT },
						Constants.INVOKEINTERFACE));
				il.append(new POP());
			}
		}

		scope.loadVariable( scope.getRealVariable(this.receptor), il);
		il.append(new ALOAD(params.getIndex()));
		il.append(new LDC(cpg.addString(methodName)));

		scope.generateGetModel(realReceptor);

		if (isMaybeGet()) {
			il.append(InstructionConstants.ICONST_1);
		} else {
			il.append(InstructionConstants.ICONST_0);
		}

		il.append(ifact.createInvoke(DefaultTypes.MethodCallHandler.getClassName(),
				"execute", Type.OBJECT, new Type[] { 
						Type.OBJECT,
						new ObjectType(List.class.getName()), 
						Type.STRING,
						DefaultTypes.IModel,
						Type.BOOLEAN}, Constants.INVOKESTATIC));
		
		// store result		
		il.append(new ASTORE(lvg.getIndex()));
	}
	*/

	@Override
	public void generate(GenScope scope) {
		InstructionList il       = scope.getInstructionList();
		InstructionFactory ifact = scope.getInstructionFactory();

		LocalVariableGen lvg  = scope.newLocalVariable(this, Type.OBJECT);	
		// Null initialization of the result
		il.append(InstructionConstants.ACONST_NULL);
		il.append(new ASTORE(lvg.getIndex()));

		generateWithNoVar(scope);
		
		il.append(new ASTORE(lvg.getIndex()));		
	}

	public void generateWithNoVar(GenScope scope) {
		InstructionList il       = scope.getInstructionList();
		InstructionFactory ifact = scope.getInstructionFactory();
		ConstantPoolGen cpg      = scope.getConstantPool();
		
		Variable realReceptor = scope.getRealVariable(this.receptor);
		
		/*
		 * TRYING DIRECT METHOD CALLS BUT DOES NOT WORK BECAUSE METHOD LIBRARY CLASS IS NOT CONTINUABLE
		if ( getReceptorType() != null ) {
			// For the moment consider just calling a model name
			ModelDefinition m = getReceptorType().getModel();
			if ( getReceptorType().getClassifierName() != null ) throw new UnsupportedOperationException("Not supported yet");
			if ( ! (m instanceof ImportedModel) ) throw new UnsupportedOperationException("Not supported yet");
			
			System.out.println("Generating direct call to " + m.getName() + "#" + getMethodName());
			// TODO: Compute the full type
	        scope.loadVariable( scope.getRealVariable(this.receptor), il);
	        il.append(ifact.createCheckCast(new ObjectType(m.getName())));
	        
	        Type[] paramTypes = new Type[getActualParameters().size()];
	        int idx = 0;
	        for (Variable var : getActualParameters()) {
	        	paramTypes[idx++] = Type.OBJECT;
				scope.loadVariable(var, il);
			}

	        CommonGen.printText(il, ifact, "Hola");
			il.append(ifact.createInvoke(m.getName(), 
					getMethodName(), Type.OBJECT, paramTypes, Constants.INVOKEVIRTUAL));		
			
			return;
		}
		*/

		
		// if ( getReceptorType() != null ) {

		if ( getReceptor() instanceof ReadMeta  && (
				((ReadMeta) getReceptor()).getKind() == ReadMetaKind.MODEL ||
				((ReadMeta) getReceptor()).getKind() == ReadMetaKind.THIS_TRANSFORMATION_METHOD_HANDLER )) {
			
			// For the moment consider just calling a model name
			/*
			ModelDefinition m = getReceptorType().getModel();
			if ( getReceptorType().getClassifierName() != null ) throw new UnsupportedOperationException("Not supported yet");
			if ( ! (m instanceof ImportedModel) ) throw new UnsupportedOperationException("Not supported yet");
			if ( getActualParameters().size() != 1 ) throw new UnsupportedOperationException("Not supported yet");
			*/
			ReadMeta readMeta = (ReadMeta) getReceptor();
			boolean supported = readMeta.getKind() == ReadMetaKind.MODEL ||
					    readMeta.getKind() == ReadMetaKind.THIS_TRANSFORMATION_METHOD_HANDLER ;
			if ( ! supported ) throw new UnsupportedOperationException("Not supported yet");
			
			String receptorClassName = null;
			if ( readMeta.getKind() == ReadMetaKind.MODEL ) {
				receptorClassName = readMeta.getModel().getName();
				// This is not properly computed!!
			} else if ( readMeta.getKind() == ReadMetaKind.THIS_TRANSFORMATION_METHOD_HANDLER ) {
				receptorClassName = scope.getClassGen().getClassName();
			}
			receptorClassName = MethodLibraryBase.class.getName();
			
			//System.out.println("Generating direct call to " + receptorClassName + "#" + getMethodName());
			
	        scope.loadVariable( scope.getRealVariable(this.receptor), il);
	        //System.out.println(receptorClassName);
	        il.append(ifact.createCheckCast(new ObjectType(receptorClassName)));
	        
	        il.append(ifact.createConstant(getMethodName()));
	        scope.loadVariable(getActualParameters().get(0), il);
	        il.append(ifact.createInvoke(receptorClassName, "getMethodHandler", 
	        		DefaultTypes.RunnableClosure, new Type[] { Type.STRING, Type.OBJECT }, Constants.INVOKEVIRTUAL));		

	        // The method handler is just a closure
	        scope.loadVariable(getActualParameters().get(0), il);
	        il.append(ifact.createInvoke(DefaultTypes.RunnableClosure.getClassName(), "call_1", Type.OBJECT,
	        		new Type[] { Type.OBJECT }, Constants.INVOKEVIRTUAL));
	        
	        return;
		}
		
		// Do this: 
		//   IModelMethodHandler methodHandler = (IModelMethodHandler) model.getMethodHandler();
		//   methodHandler.wrap(receptor)
		scope.generateGetModel(realReceptor);
	    il.append(ifact.createInvoke(DefaultTypes.IModel.getClassName(), "getMethodHandler", 
    			Type.OBJECT, Type.NO_ARGS, Constants.INVOKEINTERFACE));	    
	    il.append(InstructionConstants.DUP);
	    
        BranchInstruction ifNull = ifact.createBranchInstruction(Constants.IFNULL, null);
        il.append(ifNull);
	    
	    il.append(ifact.createCheckCast(DefaultTypes.IModelMethodHandler));
        scope.loadVariable( scope.getRealVariable(this.receptor), il);
	    il.append(ifact.createInvoke(DefaultTypes.IModelMethodHandler.getClassName(), "wrap", 
    			Type.OBJECT, new Type[] { Type.OBJECT }, Constants.INVOKEINTERFACE));	    	    
	    BranchInstruction jump = ifact.createBranchInstruction(Constants.GOTO, null);
		il.append(jump);
	    
	    ifNull.setTarget(il.append(InstructionConstants.POP)); // removes null method handler
	    scope.loadVariable( scope.getRealVariable(this.receptor), il);
	    
	    jump.setTarget( il.append(InstructionConstants.DUP) );
	    // Stack: wrappedReceptor, wrappedReceptor
	    
	    il.append(ifact.createConstant(this.getMethodName()));
	    // Stack: methodName, wrappedReceptor, wrappedReceptor
	    
	    // Copy params into array
		il.append(ifact.createConstant( this.getActualParameters().size() ));
		il.append(ifact.createNewArray(Type.OBJECT, (short) 1));

		int idxArray = 0;
		for (Variable var : actualParameters) {
			il.append(InstructionConstants.DUP);
			il.append(ifact.createConstant(idxArray));
			scope.loadVariable(var, il);
			il.append(InstructionConstants.AASTORE);
			
			idxArray++;
		}

		LocalVariableGen paramsAsArray = scope.getCurrentMethod().addLocalVariable(
				scope.uniqueId("paramsArray"),
				new ArrayType(Type.OBJECT, 1), null, null);
		il.append(InstructionConstants.DUP);
		il.append(new ASTORE(paramsAsArray.getIndex()));		
		// stack: filled args array, methodName, wrappedReceptor, wrappedReceptor
	    
	    il.append(ifact.createInvoke(DefaultTypes.RuntimeUtil.getClassName(), "getReflectiveMethod", 
	    //il.append(ifact.createInvoke(DefaultTypes.RuntimeUtil.getClassName(), "getReflectiveMethod_Dummy", 
			new ObjectType("java.lang.reflect.Method"), new Type[] { Type.OBJECT, Type.STRING, new ArrayType(Type.OBJECT, 1) }, Constants.INVOKESTATIC));
	    // stack: method, wrappedReceptor
	    
	    il.append(InstructionConstants.SWAP);
	    il.append(new ALOAD(paramsAsArray.getIndex()));
	    // stack: wrappedReceptor, method

	    //il.append(ifact.createInvoke("java.lang.reflect.Method", "invoke", 
	    //		Type.OBJECT, new Type[] { Type.OBJECT, new ArrayType(Type.OBJECT, 1) }, Constants.INVOKEVIRTUAL));

	    il.append(ifact.createInvoke(DefaultTypes.ContinuationResolverHelper.getClassName(),
				"performCall", Type.OBJECT, new Type[] { new ObjectType("java.lang.reflect.Method"), Type.OBJECT, new ArrayType(Type.OBJECT, 1) }, Constants.INVOKESTATIC));		

	}
}
