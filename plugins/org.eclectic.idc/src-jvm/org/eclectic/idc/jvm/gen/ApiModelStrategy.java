package org.eclectic.idc.jvm.gen;

import org.apache.bcel.Constants;
import org.apache.bcel.generic.BasicType;
import org.apache.bcel.generic.BranchHandle;
import org.apache.bcel.generic.BranchInstruction;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.InstructionConstants;
import org.apache.bcel.generic.InstructionFactory;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.LDC;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.Type;
import org.eclectic.apidesc.ApiDescription;
import org.eclectic.apidesc.CreationMechanism;
import org.eclectic.apidesc.Method;
import org.eclectic.apidesc.SetMechanism;
import org.eclectic.apidesc.SimpleSet;
import org.eclectic.apidesc.jvmgen.ApiDescriptionJVMGen;
import org.eclectic.apidesc.jvmgen.CreationMechanismJVMGen;
import org.eclectic.apidesc.jvmgen.CreationMechanismJVMGen.VariableParameter;
import org.eclectic.idc.core.Variable;
import org.eclectic.idc.instr.Create;
import org.eclectic.idc.instr.Set;
import org.eclectic.idc.jvm.bcel.DefaultTypes;
import org.eclectic.idc.jvm.context.GenScope;

public class ApiModelStrategy implements ModelStrategy  {

	private ApiDescriptionJVMGen description;
	private String modelName;
	private String className;

	public ApiModelStrategy(String modelName, String className, ApiDescription description) {
		this.modelName   = modelName;
		this.className   = className;
		this.description = (ApiDescriptionJVMGen) description;
	}

	@Override
	public void genCreate(Create c, GenScope scope) {
		InstructionList il       = scope.getInstructionList();
		InstructionFactory ifact = scope.getInstructionFactory();
		
		CreationMechanismJVMGen creation = (CreationMechanismJVMGen) description.getCreationMechanism(c);
		VariableParameter[] variables = creation.sortConstructorVariablesParameters(c.getConstructorParameters());
				
		String javaClassName = description.getJavaClass(c.getClassName());

		il.append(ifact.createNew(javaClassName));		
		il.append(InstructionConstants.DUP);		
		
		Type[] constructorTypes = new Type[variables.length];
		for(int i = 0; i < variables.length; i++) {
			String constructorTypeStr = variables[i].featureMapping.getConstructorType();
			constructorTypes[i] = computeParamType(constructorTypeStr);			
			scope.loadVariable( scope.getRealVariable(variables[i].var), il);
			castIfNeeded(il, ifact, constructorTypeStr);
		}

		il.append(ifact.createInvoke(javaClassName, "<init>", Type.VOID, constructorTypes, Constants.INVOKESPECIAL));
		il.append(InstructionConstants.DUP);	

		scope.generateGetModel(modelName);
		il.append(ifact.createCheckCast(DefaultTypes.ApiModel));
		il.append(InstructionConstants.SWAP);
		
		il.append(ifact.createInvoke(DefaultTypes.ApiModel.getClassName(), "addObject", Type.VOID, new Type[] { Type.OBJECT }, Constants.INVOKEVIRTUAL));
	}

	@Override
	public void genSet(Set s, GenScope scope) {
		String javaClassName = description.getJavaClass(className);
		SimpleSet    setter  = (SimpleSet) description.getSetter(className, s.getFeatureName());
		assert(setter != null); // constructor setter should be rewritten in a pre-processing step
		// ObjectType paramType = new ObjectType(setter.getSetter().getParameterTypes().get(0));
		Type      returnType = Type.VOID;

		if ( setter.getSetter().getReturnType() != null ) {
			returnType = computeParamType(setter.getSetter().getReturnType()); // new ObjectType(setter.getSetter().getReturnType());
		}
		
		InstructionList il       = scope.getInstructionList();
		InstructionFactory ifact = scope.getInstructionFactory();

		Variable realReceptor = scope.getRealVariable(s.getReceptor());
		Variable realValue    = scope.getRealVariable(s.getValue());

		BranchInstruction branchToEnd = InstructionFactory
				.createBranchInstruction(Constants.GOTO, null);

		BranchInstruction branchToMonovalued = InstructionFactory
				.createBranchInstruction(Constants.IFEQ, null);

		// push value
		scope.loadVariable(realValue, il);
		il.append(InstructionConstants.DUP);

		// check if it is multivalued result
		il.append(ifact.createInstanceOf(DefaultTypes.Iterable));
		
		// If it is not an iterable goto -> monovalued set
		il.append(branchToMonovalued);

		// It is an iterable -> multivalued set
		   // the collection is in queue, get the iterator 
		   il.append(ifact.createCheckCast(DefaultTypes.Iterable));
	       il.append(ifact.createInvoke("java.lang.Iterable", "iterator", new ObjectType("java.util.Iterator"), Type.NO_ARGS, Constants.INVOKEINTERFACE));
	       
	       // got to check next
	       BranchHandle gotoHasNext = il.append(InstructionFactory.createBranchInstruction(Constants.GOTO, null));
		   
	       // next object
	       InstructionHandle nextElement = il.append(InstructionConstants.DUP);
	       il.append(ifact.createInvoke("java.util.Iterator", "next", Type.OBJECT, Type.NO_ARGS, Constants.INVOKEINTERFACE));
	       
	       genMonovaluedSet(scope, javaClassName, setter.getSetter(), il, ifact, realReceptor, returnType);

		   // check if hasNext, but before dup the iterator
		   gotoHasNext.setTarget( il.append(InstructionConstants.DUP) ); 
		   il.append(ifact.createInvoke("java.util.Iterator", "hasNext", Type.BOOLEAN, Type.NO_ARGS, Constants.INVOKEINTERFACE));
	       il.append(InstructionFactory.createBranchInstruction(Constants.IFNE, nextElement));
	       
	       // Pop the iterator, that it is no longer needed
	       il.append(InstructionConstants.POP);
	    // end of iteration
	    // Skip monovalued set
		
		il.append(branchToEnd);
		
		// target of monovalued
		branchToMonovalued.setTarget(il.append(InstructionConstants.NOP));		
		genMonovaluedSet(scope, javaClassName, setter.getSetter(), il,
				ifact, realReceptor, returnType);

		branchToEnd.setTarget(il.append(InstructionConstants.NOP));		
	}

	/**
	 * The requirement is that the value to be set must be on the top of the stack
	 * 
	 * @param scope
	 * @param javaClassName
	 * @param setterMethod
	 * @param paramType
	 * @param il
	 * @param ifact
	 * @param realReceptor
	 */
	private void genMonovaluedSet(GenScope scope, String javaClassName,
			Method setterMethod, InstructionList il,
			InstructionFactory ifact, Variable realReceptor, Type returnType) {
		
		String paramType = setterMethod.getParameterTypes().get(0);
		
		// push receptor
		scope.loadVariable(realReceptor, il);
		
		// push value
		// scope.loadVariable(realValue, il);
		il.append(InstructionConstants.SWAP);

		// cast to the expected type (this is needed because scope.newLocalVariable() usually takes Type.OBJECT)
		// also needed to convert to primitive types
		castIfNeeded(il, ifact, paramType);
		
		// invoke setter
		Type pType = computeParamType(paramType);
		il.append(ifact.createInvoke(javaClassName, setterMethod.getName(), returnType, 
				new Type[] { pType }, Constants.INVOKEVIRTUAL));
		
		if ( returnType != Type.VOID ) {
			il.append(InstructionConstants.POP);
		}
	}

	private void castIfNeeded(InstructionList il, InstructionFactory ifact, String paramType) {
		if ( paramType.equals("boolean") ) {
			il.append(ifact.createCheckCast(new ObjectType(Boolean.class.getName())));	
			il.append(ifact.createInvoke(Boolean.class.getName(), "booleanValue", Type.BOOLEAN,  Type.NO_ARGS, Constants.INVOKEVIRTUAL));			
		} else if ( paramType.equals("double") ) {
				il.append(ifact.createCheckCast(new ObjectType(Double.class.getName())));	
				il.append(ifact.createInvoke(Double.class.getName(), "doubleValue", Type.DOUBLE,  Type.NO_ARGS, Constants.INVOKEVIRTUAL));
		} else if ( paramType.equals("int") ) {
			il.append(ifact.createInvoke(DefaultTypes.RuntimeUtil.getClassName(), "convertInt", Type.INT, new Type[] { Type.OBJECT }, Constants.INVOKESTATIC));
			//il.append(ifact.createCheckCast(new ObjectType(Integer.class.getName())));	
			//il.append(ifact.createInvoke(Integer.class.getName(), "intValue", Type.INT,  Type.NO_ARGS, Constants.INVOKEVIRTUAL));
		} else {
			ObjectType objectType = new ObjectType(paramType);
			il.append(ifact.createCheckCast(objectType));	
		}
	}
	
	// How to make both methods in one? I would need closures...
	private Type computeParamType(String paramType) {
		if ( paramType.equals("boolean") ) {
			return Type.BOOLEAN;
		} else if ( paramType.equals("double") ) {
			return Type.DOUBLE;
		} else if ( paramType.equals("int") ) {
			return Type.INT;
		} else {
			return new ObjectType(paramType);			
		}
	}
}
