package org.eclectic.idc.instr.jvmgen;

import java.util.LinkedList;
import java.util.List;

import org.apache.bcel.Constants;
import org.apache.bcel.generic.ASTORE;
import org.apache.bcel.generic.BranchInstruction;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.DUP;
import org.apache.bcel.generic.InstructionConstants;
import org.apache.bcel.generic.InstructionFactory;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.InstructionList;
import org.apache.bcel.generic.LDC;
import org.apache.bcel.generic.LocalVariableGen;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.POP;
import org.apache.bcel.generic.Type;
import org.eclectic.idc.core.CodeUnit;
import org.eclectic.idc.core.ModelDefinition;
import org.eclectic.idc.core.Variable;
import org.eclectic.idc.core.jvmgen.ModelDefinitionJVMGen;
import org.eclectic.idc.instr.GetKind;
import org.eclectic.idc.instr.InstructionWithResult;
import org.eclectic.idc.instr.impl.GetImpl;
import org.eclectic.idc.jvm.bcel.DefaultTypes;
import org.eclectic.idc.jvm.context.GenScope;
import org.eclectic.idc.jvm.gen.AnalysableInstruction;
import org.eclectic.idc.jvm.gen.CommonGen;
import org.eclectic.idc.jvm.gen.GenerableInstruction;
import org.eclectic.idc.jvm.gen.Processor;
import org.eclectic.idc.qool.QoolTransformation;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class GetJVMGen extends GetImpl implements GenerableInstruction, AnalysableInstruction {

	/**
	 * <<GET_IMODEL(THIS)>> 
 	 * ALOAD !!#receptor_variable!!
     * LDC <<featureName>>
	 * INVOKEINTERFACE getFeature
	 */	 
	@Override
	public void generate(GenScope scope) {
		InstructionList il       = scope.getInstructionList();
		InstructionFactory ifact = scope.getInstructionFactory();
		ConstantPoolGen cpg      = scope.getConstantPool();

		Variable realReceptor = scope.getRealVariable(this.receptor);

		LocalVariableGen lvg = scope.newLocalVariable(this, Type.OBJECT);

		// generate model access
		scope.generateGetModel(realReceptor);
		il.append(new DUP()); // for later calls of get/method calls (problem if I put the generateGetModel directly, not using the dup optimize, why?)
		
		
		// push receptor
		// push featureName
		scope.loadVariable(realReceptor, il);
		lvg.setStart(il.append(new LDC(cpg.addString(featureName))));
		
		if ( kind == GetKind.PLAIN_GET ) {
			appendGetFeature(il, ifact);
			il.append(InstructionFactory.SWAP);
			il.append(InstructionFactory.POP);
			// I should swap, and then pop...
			// il.append(new POP());
		} else {
			BranchInstruction branchToCall = InstructionFactory
					.createBranchInstruction(Constants.IFEQ, null);
			BranchInstruction branchToEnd = InstructionFactory
					.createBranchInstruction(Constants.GOTO, null);
			
			// hasFeature(f)
			// ifeq (jump if value == 0)
			appendHasFeature(il, ifact);
			lvg.setStart(il.append(branchToCall));

			// push receptor
			// push featureName
			// get & jump to the end
			/*
			scope.loadVariable(realReceptor, il);
			lvg.setStart(il.append(new LDC(cpg.addString(featureName))));
			*/
			if ( isStreamingMode(scope) ) {
				appendContinuableGetFeature(scope, realReceptor, il, ifact, cpg);
			} else {
				scope.loadVariable(realReceptor, il);
				il.append(new LDC(cpg.addString(featureName)));
				appendGetFeature(il, ifact);
				// branchToEnd.setTarget(appendGetFeature(il, ifact));
			}
			il.append(branchToEnd);
			
			// push receptor
			// push featureName
			// methodCall
			branchToCall.setTarget( il.append(InstructionConstants.NOP) ); // label for this part
			//scope.loadVariable(realReceptor, il);
			// lvg.setStart(il.append(new LDC(cpg.addString(featureName))));			
			lvg.setStart(il.append(InstructionConstants.POP)); // remove IModel
			appendMethodCall(scope, il, ifact);

			// NOP-end
			branchToEnd.setTarget( il.append(InstructionConstants.NOP) );
		}
		
		// store result
		il.append(new ASTORE( lvg.getIndex() ));
	}

	private void appendMethodCall(GenScope scope, InstructionList il, InstructionFactory ifact) {
		MethodCallJVMGen gen = new MethodCallJVMGen();
		gen.setColumn( getColumn() );
		gen.setRow( getRow() );
		gen.setFile( getFile() );
		gen.setName( this.getName() );
		gen.setReceptor( this.getReceptor() );
		gen.setMethodName( this.getFeatureName() );
		
		gen.generateWithNoVar(scope);
		
		// calling MethodHandler.execute(Object receptor, String methodName, IModel model)
		/*
		il.append(ifact.createInvoke(DefaultTypes.MethodCallHandler.getClassName(),
				"execute", Type.OBJECT, new Type[] { 
						DefaultTypes.IModel, Type.OBJECT, Type.STRING
						}, Constants.INVOKESTATIC));		
		*/
	}

	private boolean isStreamingMode(GenScope scope) {
		// TODO: Do this with a ModelStrategy, asking the Processor
		CodeUnit t = (CodeUnit) EcoreUtil.getRootContainer(this);
		for ( ModelDefinition m : t.getModels()) {
			if ( ((ModelDefinitionJVMGen) m).isStreamingModel() ) 
				return true;
		}
		return false;
	}

	private void appendContinuableGetFeature(GenScope scope, Variable realReceptor, InstructionList il, InstructionFactory ifact, ConstantPoolGen cpg) {
		BranchInstruction branchToGet_noStreaming = InstructionFactory.createBranchInstruction(Constants.IFEQ, null);
		BranchInstruction branchToGet2 = InstructionFactory.createBranchInstruction(Constants.IFEQ, null);
		BranchInstruction branchToSkipNormalGet = InstructionFactory.createBranchInstruction(Constants.IFEQ, null);

		BranchInstruction gotoGet = InstructionFactory.createBranchInstruction(Constants.GOTO, null);
		BranchInstruction gotoSkipNormalGet = InstructionFactory.createBranchInstruction(Constants.GOTO, null);

		// check if it is an streaming model
		il.append(InstructionFactory.DUP);
		il.append(ifact.createInstanceOf(DefaultTypes.IStreamingModel));
		il.append(branchToGet_noStreaming);
		
		// il.append(InstructionFactory.DUP); // this one is for the final get
		il.append(ifact.createCheckCast(DefaultTypes.IStreamingModel));
		il.append(InstructionFactory.DUP);


		scope.loadVariable(realReceptor, il);
		il.append(new LDC(cpg.addString(featureName)));		
		// stack: model, model, receptor, featureName
		il.append(ifact.createInvoke(DefaultTypes.IStreamingModel.getClassName(),
				"receptorNeedsWaiting", Type.BOOLEAN, new Type[] { Type.OBJECT, Type.STRING }, DefaultTypes.IModelCall));		
		

		// ifeq (jump if value == 0) => if no need to wait
		il.append(branchToGet2);

		// Wait
		il.append(InstructionFactory.DUP);
		scope.generateGetTransformation();
		il.append(ifact.createCheckCast(DefaultTypes.QoolTransformation));
		il.append(InstructionFactory.SWAP);
		scope.loadVariable(realReceptor, il);
		// stack: model, transformation, model, receptor 
		il.append(ifact.createInvoke(DefaultTypes.ContinuationResolverHelper.getClassName(),
				"requestStreamedAndWait", Type.OBJECT, new Type[] { DefaultTypes.QoolTransformation, DefaultTypes.IStreamingModel, Type.OBJECT}, Constants.INVOKESTATIC));		
		
		il.append(InstructionFactory.SWAP);
		il.append(InstructionFactory.DUP_X1);
		il.append(ifact.createCheckCast(DefaultTypes.IModel));
		il.append(InstructionFactory.SWAP);
		il.append(gotoGet);  // [model, model, receptor] 
		
		// Get the value
		InstructionHandle nop = il.append(InstructionFactory.NOP);		
		branchToGet2.setTarget(nop);

		il.append(InstructionFactory.DUP);
		il.append(ifact.createCheckCast(DefaultTypes.IModel));
		scope.loadVariable(realReceptor, il);
		gotoGet.setTarget(il.append(new LDC(cpg.addString(featureName))));		
		// stack: model, model, receptor, featureName
		appendGetFeature(il, ifact);
		
		il.append(InstructionFactory.DUP_X1); // stack: value, model, value
		
		// check whether the value is a proxy
		il.append(ifact.createInvoke(DefaultTypes.IStreamingModel.getClassName(),
				"valueNeedsWaiting", Type.BOOLEAN, new Type[] { Type.OBJECT }, DefaultTypes.IModelCall));		
		
		// ifeq (jump if value == 0) => if no need to wait		
		il.append(branchToSkipNormalGet);
		
		// Wait for the value
		scope.generateGetTransformation();
		il.append(ifact.createCheckCast(DefaultTypes.QoolTransformation));
		il.append(InstructionFactory.SWAP); // [transformation, value]
		scope.generateGetModel(realReceptor); // fed up with poping/pushing... do it the hard way
		il.append(ifact.createCheckCast(DefaultTypes.IStreamingModel));
		il.append(InstructionFactory.SWAP); 
	
		// [transformation, model, value]
		il.append(ifact.createInvoke(DefaultTypes.ContinuationResolverHelper.getClassName(),
				"requestStreamedAndWait", Type.OBJECT, new Type[] { DefaultTypes.QoolTransformation, DefaultTypes.IStreamingModel, Type.OBJECT}, Constants.INVOKESTATIC));		

		il.append(gotoSkipNormalGet);
		
		// No streaming => Normal get
		branchToGet_noStreaming.setTarget(il.append(ifact.createCheckCast(DefaultTypes.IModel)));
		scope.loadVariable(realReceptor, il);
		il.append(new LDC(cpg.addString(featureName)));		
		// stack: model, receptor, featureName
		appendGetFeature(il, ifact);
		

		InstructionHandle nop2 = il.append(InstructionFactory.NOP);	
		branchToSkipNormalGet.setTarget(nop2);
		gotoSkipNormalGet.setTarget(nop2);
	}	
	
	
	private InstructionHandle appendGetFeature(InstructionList il, InstructionFactory ifact) {
		// invoke
		return il.append(ifact.createInvoke(DefaultTypes.IModel.getClassName(),
				"getFeature", 
				Type.OBJECT, 
				new Type[] { Type.OBJECT, Type.STRING }, 
				DefaultTypes.IModelCall));		
	}

	private InstructionHandle appendHasFeature(InstructionList il, InstructionFactory ifact) {
		// invoke
		return il.append(ifact.createInvoke(DefaultTypes.IModel.getClassName(),
				"hasFeature", 
				Type.BOOLEAN, 
				new Type[] { Type.OBJECT, Type.STRING }, 
				DefaultTypes.IModelCall));		
	}

	// Begin-of AnalysableInstruction
	
	@Override
	public List<AnalysableInstruction> getDependencies() {
		throw new UnsupportedOperationException();
	}

	// End-of AnalysableInstruction

}
