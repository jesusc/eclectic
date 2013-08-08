package org.eclectic.frontend.qoolinit;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.eclectic.frontend.core.Annotation;
import org.eclectic.frontend.core.BooleanLiteral;
import org.eclectic.frontend.core.ClassUse;
import org.eclectic.frontend.core.ClosureDeclaration;
import org.eclectic.frontend.core.ClosureParameter;
import org.eclectic.frontend.core.DefineVariable;
import org.eclectic.frontend.core.DoubleLiteral;
import org.eclectic.frontend.core.Expression;
import org.eclectic.frontend.core.ImportedModel;
import org.eclectic.frontend.core.InlineAttribute;
import org.eclectic.frontend.core.InlineClass;
import org.eclectic.frontend.core.InlineFeature;
import org.eclectic.frontend.core.InlineModel;
import org.eclectic.frontend.core.MetamodelModelAnnotation;
import org.eclectic.frontend.core.MethodCall;
import org.eclectic.frontend.core.ModelReference;
import org.eclectic.frontend.core.NumLiteral;
import org.eclectic.frontend.core.PropertyWrite;
import org.eclectic.frontend.core.RepresentModel;
import org.eclectic.frontend.core.Statement;
import org.eclectic.frontend.core.StringLiteral;
import org.eclectic.frontend.core.TransformationDefinitionParameter;
import org.eclectic.frontend.core.TypeExpression;
import org.eclectic.frontend.core.VariableReference;
import org.eclectic.frontend.qool.AccessByFeatureOptimization;
import org.eclectic.frontend.qool.EmitStatement;
import org.eclectic.frontend.qool.ForAllStatement;
import org.eclectic.frontend.qool.InvocationParameter;
import org.eclectic.frontend.qool.InvokeExternal;
import org.eclectic.frontend.qool.InvokeInternal;
import org.eclectic.frontend.qool.KindOfPredicate;
import org.eclectic.frontend.qool.LocalQueue;
import org.eclectic.frontend.qool.MatchExpression;
import org.eclectic.frontend.qool.MatchPredicate;
import org.eclectic.frontend.qool.ModelElementQueue;
import org.eclectic.frontend.qool.NamedInvocationParameter;
import org.eclectic.frontend.qool.PropertyEqualsPredicate;
import org.eclectic.frontend.qool.QoolQueue;
import org.eclectic.frontend.qool.QoolTransformation;
import org.eclectic.frontend.qool.QueueOptimization;
import org.eclectic.frontend.qool.Segment;
import org.eclectic.frontend.qool.facilities.Copier;
import org.eclectic.frontend.qool.facilities.CopierCallbackDefinition;
import org.eclectic.idc.core.Instruction;
import org.eclectic.idc.core.MetamodelDefinition;
import org.eclectic.idc.core.ModelDefinition;
import org.eclectic.idc.core.ModelKind;
import org.eclectic.idc.core.Parameter;
import org.eclectic.idc.core.TypeInfo;
import org.eclectic.idc.core.Variable;
import org.eclectic.idc.ecl_meta.KAttribute;
import org.eclectic.idc.ecl_meta.KClass;
import org.eclectic.idc.ecl_meta.KClassifier;
import org.eclectic.idc.ecl_meta.KReference;
import org.eclectic.idc.ecl_meta.KStructuralFeature;
import org.eclectic.idc.instr.Assign;
import org.eclectic.idc.instr.ClosureDef;
import org.eclectic.idc.instr.Create;
import org.eclectic.idc.instr.Get;
import org.eclectic.idc.instr.GetKind;
import org.eclectic.idc.instr.IfBranch;
import org.eclectic.idc.instr.IfElseBlock;
import org.eclectic.idc.instr.IfInstr;
import org.eclectic.idc.instr.Literal;
import org.eclectic.idc.instr.LiteralKind;
import org.eclectic.idc.instr.ReadMeta;
import org.eclectic.idc.instr.ReadMetaKind;
import org.eclectic.idc.instr.Set;
import org.eclectic.idc.qool.QEmit;
import org.eclectic.idc.qool.QForAll;
import org.eclectic.idc.qool.QMatch;
import org.eclectic.idc.qool.QMatchPredicate;
import org.eclectic.idc.qool.Queue;
import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclipse.emf.common.util.EList;


/**
 * Transforms a Qool program into IDC. It is intended to be seed transformation
 * from which to start the bootstrapping.
 * 
 * @author jesus
 */
public class SeedQool2Idc {

	private BasicEMFModel qool;
	private BasicEMFModel idc;

	public SeedQool2Idc(BasicEMFModel qoolModel, BasicEMFModel idcModel) {
		this.qool = qoolModel;
		this.idc  = idcModel;
	}
	
	public void transform() {
		QoolTransformation src = allObjectsOf(QoolTransformation.class).get(0);
		org.eclectic.idc.qool.QoolTransformation tgt = createAndLink(org.eclectic.idc.qool.QoolTransformation.class, src);
		
		tgt.setName( src.getName() );
		tgt.setQualifier( "main ");
		for(TransformationDefinitionParameter p : src.getInModels() )  tgt.getModels().add( transformModelParameter(p, true) );
		for(TransformationDefinitionParameter p : src.getOutModels() ) tgt.getModels().add( transformModelParameter(p, false) );
		
		tgt.setMain(true);
		setFileInfo(src, tgt);

		for(ImportedModel m : src.getImportedModels() ) tgt.getAdditionalModels().add( transformImportedModel(m));
		for(InlineModel m : src.getInlineModels() ) tgt.getInlineModels().add( transformInlineModel(m));
		for(QoolQueue q : src.getQueues() ) tgt.getQueues().add( transformQueue(q));
		for(Segment s : src.getSegments() ) tgt.getSegments().add( transformSegment(s));
				
	}
	
	private org.eclectic.idc.qool.Segment transformSegment(Segment src) {
		org.eclectic.idc.qool.Segment idc = createAndLink(org.eclectic.idc.qool.Segment.class, src);
		idc.setName( src.getName() );
		
		for(Statement stmt : src.getStatements()) idc.getInstructions().addAll( transformStatement(stmt) );
		
		// get instructions
	    //	      segment.instructions = [ rt::expr2variable | source = src.statements ].map({ trace | trace.instructions; }).flatten()
	    	 
		return idc;
	}

	// BEGIN-OF Instructions
	private List<? extends Instruction> transformStatement(Statement src) {
		if ( src instanceof ForAllStatement ) return transformForAllStatement( (ForAllStatement) src);
		if ( src instanceof EmitStatement   ) return transformEmitStatement( (EmitStatement) src);
		if ( src instanceof ModelReference   ) return transformModelReference( (ModelReference) src);
		if ( src instanceof VariableReference   ) return transformVariableReference( (VariableReference) src);
		if ( src instanceof NumLiteral   ) return transformNumLiteral( (NumLiteral) src);
		if ( src instanceof StringLiteral   ) return transformStringLiteral( (StringLiteral) src);
		if ( src instanceof BooleanLiteral   ) return transformBooleanLiteral( (BooleanLiteral) src);
		if ( src instanceof DoubleLiteral   ) return transformDoubleLiteral( (DoubleLiteral) src);
		if ( src instanceof MethodCall   ) return transformMethodCall( (MethodCall) src);
		if ( src instanceof DefineVariable   ) return transformDefineVariable( (DefineVariable) src);
		if ( src instanceof PropertyWrite   ) return transformPropertyWrite( (PropertyWrite) src);
		if ( src instanceof ClosureDeclaration   ) return transformClosureDeclaration( (ClosureDeclaration) src);
		if ( src instanceof MatchExpression   ) return transformMatchExpression( (MatchExpression) src);
		if ( src instanceof InvokeExternal   ) return transformInvokeExternal( (InvokeExternal) src);
		if ( src instanceof InvokeInternal   ) return transformInvokeInternal( (InvokeInternal) src);
		if ( src instanceof Copier   ) return transformCopier( (Copier) src);
		else {
			throw new UnsupportedOperationException("Not supported " + src.eClass().getName());
		}
	}
	
	private List<? extends Instruction> transformCopier(Copier src) {
		LinkedList<Instruction> instructions = new LinkedList<Instruction>();
		for(Expression e : src.getObjects()) {
			instructions.addAll( transformStatement(e) );
		}
		
		for(CopierCallbackDefinition c : src.getCallbacks() ) {
			instructions.addAll( transformStatement(c.getTrigger() ) );
			instructions.addAll( transformStatement(c.getAction() ) );
		}
		
		ReadMeta thisTransformation = create(ReadMeta.class);
		thisTransformation.setName( nextId("thisTransformation_readmeta") );
		thisTransformation.setKind(ReadMetaKind.THIS_TRANSFORMATION_OBJECT);		
		setFileInfo(src, thisTransformation);

		org.eclectic.idc.instr.MethodCall getFacilities = create(org.eclectic.idc.instr.MethodCall.class);
		getFacilities.setName( nextId( "getFacilities" ) );
		getFacilities.setMethodName( "getFacilities" );
		getFacilities.setReceptor( thisTransformation );
		setFileInfo(src, getFacilities);

		Literal modelNameStringLiteral = create(Literal.class);
		modelNameStringLiteral.setStringValue(src.getCopyInModel().getName());
		modelNameStringLiteral.setKind(LiteralKind.STRING);
		modelNameStringLiteral.setName( nextId("literal") );
		setFileInfo(src, modelNameStringLiteral);

		org.eclectic.idc.instr.MethodCall newCopier = create(org.eclectic.idc.instr.MethodCall.class);
		newCopier.setName( nextId( "createCopier" ) );
		newCopier.setMethodName( "createCopier" );
		newCopier.setReceptor( getFacilities );
		newCopier.getActualParameters().add(modelNameStringLiteral);
		setFileInfo(src, newCopier);

		instructions.add(thisTransformation);
		instructions.add(getFacilities);
		instructions.add(modelNameStringLiteral);
		instructions.add(newCopier);

		for(Expression e : src.getObjects()) {
			org.eclectic.idc.instr.MethodCall addRootObject = create(org.eclectic.idc.instr.MethodCall.class);
			addRootObject.setName( nextId( "addRootObject" ) );
			addRootObject.setMethodName( "addRootObject" );
			addRootObject.setReceptor( newCopier );
			setFileInfo(src, addRootObject);
			addRootObject.getActualParameters().add( (Variable) resolveNow(e) );	
			
			instructions.add(addRootObject);
		}
		
		for(CopierCallbackDefinition c : src.getCallbacks() ) {
			String methodName = c.isStop() ? "stopWhen" : "notifyWhen";
			org.eclectic.idc.instr.MethodCall notify = create(org.eclectic.idc.instr.MethodCall.class);
			notify.setName( nextId( methodName ) );
			notify.setMethodName( methodName );
			notify.setReceptor( newCopier );
			setFileInfo(src, notify);
			
			notify.getActualParameters().add( (Variable) resolveNow(c.getTrigger()) );
			notify.getActualParameters().add( (Variable) resolveNow(c.getAction()) );
			
			instructions.add(notify);
		}

		org.eclectic.idc.instr.MethodCall copy = createAndLink(org.eclectic.idc.instr.MethodCall.class, src);
		copy.setName( nextId( "copy" ) );
		copy.setMethodName( "copy" );
		copy.setReceptor( newCopier );
		setFileInfo(src, copy);
		instructions.add(copy);

		return instructions;
	}

	private List<? extends Instruction> transformInvokeInternal(InvokeInternal src) {
		LinkedList<Instruction> instructions = new LinkedList<Instruction>();
		
    	org.eclectic.idc.instr.InvokeInternal idc = createAndLink(org.eclectic.idc.instr.InvokeInternal.class, src);
    	for(InvocationParameter ip : src.getSourceModels()) {
    		idc.getSourceModels().add(createInvocationParameter(ip));
    	}

    	for(InvocationParameter ip : src.getTargetModels()) {
    		idc.getTargetModels().add(createInvocationParameter(ip));
    	}

    	if ( src.getInputViewFilter() != null ) 
    		idc.setInputViewFilter( (Variable) resolveNow(src.getInputViewFilter()) );

    	if ( src.getEntryPointName() != null ) {
    		idc.setEntryPointName( src.getEntryPointName() );
    		
    		for(Expression e : src.getEntryPointParameters() ) {
    			instructions.addAll( transformStatement(e) );
    			idc.getEntryPointParameters().add( (Variable) resolveNow(e) );
    		}

        	idc.setName(nextId("invokeInternal"));
        	idc.setEntryPointName( src.getEntryPointName() );
    	}
    	
    	idc.setTransformationName( src.getTransformationName() );
    	
    	setFileInfo(src, idc);
    	instructions.add(idc);
		return instructions;
	}
	
	private List<? extends Instruction> transformInvokeExternal(InvokeExternal src) {
		LinkedList<Instruction> instructions = new LinkedList<Instruction>();

    	org.eclectic.idc.instr.InvokeExternal idc = createAndLink(org.eclectic.idc.instr.InvokeExternal.class, src);
    	for(InvocationParameter ip : src.getSourceModels()) {
    		idc.getSourceModels().add(createInvocationParameter(ip));
    	}

    	for(InvocationParameter ip : src.getTargetModels()) {
    		idc.getTargetModels().add(createInvocationParameter(ip));
    	}

    	for(NamedInvocationParameter p : src.getParameters()) {
    		instructions.addAll( transformStatement(p.getActualParameter()) ); 

    		org.eclectic.idc.instr.NamedInvocationParameter pIdc = create(org.eclectic.idc.instr.NamedInvocationParameter.class);
    		pIdc.setFormalName(p.getFormalName());
    		pIdc.setResult( (Variable) resolveNow(p.getActualParameter()) );
    		idc.getParameters().add(pIdc);
    	}
    	
    	if ( src.getEntryPointName() != null ) {
    		idc.setEntryPointName( src.getEntryPointName() );
    		
    		for(Expression e : src.getEntryPointParameters() ) {
    			instructions.addAll( transformStatement(e) );
    			idc.getEntryPointParameters().add( (Variable) resolveNow(e) );
    		}
    	} else {    			
    		idc.setInputViewFilter( (Variable) resolveNow(src.getInputViewFilter()) );
    		
    		if ( src.getOutputResolutionSourceElement() != null) {
	    		instructions.addAll( transformStatement(src.getOutputResolutionSourceElement()) ); 
	    		idc.setOutputResolutionSourceElement( (Variable) resolveNow(src.getOutputResolutionSourceElement()) );
	    		
	    		// TODO: Do not hardcode this!
	    		idc.setSrcTraceAttributeName( "s" );
	    		idc.setTgtTraceAttributeName( src.getTraceAttributeName() );
	    		idc.setQueueName( src.getQueueName() );
    		}
    	}

    	idc.setName(nextId("invokeExternal"));
    	idc.setEntryPointName( src.getEntryPointName() );
    	idc.setTransformationName( src.getTransformationName() );
    	
    	setFileInfo(src, idc);
    	instructions.add(idc);
		return instructions;
	}

	private org.eclectic.idc.instr.InvocationParameter createInvocationParameter(
			InvocationParameter ip) {
		org.eclectic.idc.instr.InvocationParameter ipIdc = createAndLink(org.eclectic.idc.instr.InvocationParameter.class, ip);

		ModelDefinition m = (ModelDefinition) resolveNow(ip.getModel());
		ipIdc.setModel( m );
		ipIdc.setCalleeModelName( ip.getCalleeModelName() );
		return ipIdc;
	}

	private List<? extends Instruction> transformMatchExpression(MatchExpression src) {
    	QMatch idc = createAndLink(QMatch.class, src);
    	idc.setName( nextId("match") );
    	idc.setQueue( (Queue) resolveNow(src.getQueue() ));

		List<Instruction> result = new LinkedList<Instruction>();

		for(MatchPredicate p : src.getPredicates() ) {
			if ( p instanceof KindOfPredicate ) {
				result.addAll(transformKinfOfPredicate( (KindOfPredicate) p)); 
			} else if ( p instanceof PropertyEqualsPredicate ) {
				result.addAll(transformPropertyEqualsPredicate( (PropertyEqualsPredicate) p)); 				
			} else {
				throw new UnsupportedOperationException();
			}
			idc.getPredicates().add( (QMatchPredicate) resolveNow(p) );
		}
		result.add(idc);
		
    	setFileInfo(src, idc);
		return result;
	}
    
   
    private Collection<? extends Instruction> transformKinfOfPredicate(KindOfPredicate src) {
    	org.eclectic.idc.qool.KindOfPredicate idc = createAndLink(org.eclectic.idc.qool.KindOfPredicate.class, src);
    	idc.setModel( (ModelDefinition) resolveNow(src.getClass_().getModel()) );
    	idc.setClassName( src.getClass_().getClassName() );

		return Collections.emptyList();
	}

    private Collection<? extends Instruction> transformPropertyEqualsPredicate(PropertyEqualsPredicate src) {
    	org.eclectic.idc.qool.PropertyEqualsPredicate idc = createAndLink(org.eclectic.idc.qool.PropertyEqualsPredicate.class, src);
    	idc.setPropertyName( src.getPropertyName() );
    	
    	List<? extends Instruction> valueInstr = transformStatement( src.getValue() );
    	
    	idc.setValue( (Variable) resolveNow(src.getValue() ));
    	
    	return valueInstr;	
    }

	private List<? extends Instruction> transformClosureDeclaration(ClosureDeclaration src) {
    	ClosureDef idc = createAndLink(ClosureDef.class, src);
		idc.setName( nextId("closure") );
    	for(ClosureParameter f : src.getFormalParameters()) {
    		Parameter p = createAndLink(Parameter.class, f);
    		p.setName( f.getName() );
    		idc.getFormalParameters().add(p);
    	}

		for(Statement stmt : src.getStatements()) idc.getInstructions().addAll( transformStatement(stmt) );

		setFileInfo(src, idc);
				
    	return singleInstruction(idc);
	}

	private List<? extends Instruction> transformPropertyWrite(PropertyWrite src) {
    	Set idc = createAndLink(Set.class, src);
    	idc.setFeatureName( src.getProperty() );

		List<? extends Instruction> exprInstr = transformStatement(src.getExpression());			

		List<Instruction> result = new LinkedList<Instruction>();
		result.addAll(exprInstr);
		result.add(idc);
		
		idc.setReceptor( (Variable) resolveNow(src.getReceptor()) );
    	idc.setValue( (Variable) resolveNow(src.getExpression()) );
		setFileInfo(src, idc);

		return result;
		}

	private List<? extends Instruction> transformDefineVariable(DefineVariable src) {
    	List<? extends Instruction> result = transformStatement( src.getExpression() );
    	link(src, resolveNow(src.getExpression()) );
    	return result;
	}
	
	private List<? extends Instruction> transformMethodCall(MethodCall src) {
		List<Instruction> paramsInstr = new LinkedList<Instruction>();
		for(Expression p : src.getParameters() ) paramsInstr.addAll( transformStatement(p) );

		List<? extends Instruction> receptorInstr = transformStatement(src.getReceptor());
			

		List<Instruction> result = new LinkedList<Instruction>();
		result.addAll(receptorInstr);
		result.addAll(paramsInstr);
		
		if ( src.getMethodName().equals("new") && src.getReceptor() instanceof ModelReference ) {
			Create create = createAndLink(Create.class, src);
			create.setName( nextId(((ModelReference) src.getReceptor()).getClassName()) );
			create.setClassName(((ModelReference) src.getReceptor()).getClassName());
			create.setModel( (ModelDefinition) resolveNow( ((ModelReference) src.getReceptor()).getModel() ) );
		
			result.add(create);
			setFileInfo(src, create);
		} else {
			if ( src.getParameters().size() > 0 ) {
				org.eclectic.idc.instr.MethodCall idc = createAndLink(org.eclectic.idc.instr.MethodCall.class, src);
				idc.setName( nextId( "method_call" ) );
				idc.setMethodName( src.getMethodName() );
				idc.setReceptor( (Variable) resolveNow(src.getReceptor() ));

				for(Expression p : src.getParameters() ) {
					idc.getActualParameters().add( (Variable) resolveNow(p) );	
				}
				
				result.add(idc);
				setFileInfo(src, idc);
			} else {				
				Get get = createAndLink(Get.class, src);
				get.setName( nextId("get") );
				get.setFeatureName( src.getMethodName() );
				get.setReceptor( (Variable) resolveNow(src.getReceptor() ));
				get.setKind( GetKind.TRY_GET_FIRST );
		
				result.add(get);
				setFileInfo(src, get);
			}
		}
		
		return result;
	}

	private List<? extends Instruction> transformDoubleLiteral(DoubleLiteral src) {
		Literal idc = createAndLink(Literal.class, src);
		idc.setName( nextId("literal") );
		idc.setKind(LiteralKind.DOUBLE);
		idc.setDoubleValue(src.getValue());
		setFileInfo(src, idc);
		
		return singleInstruction(idc);
	}

	private List<? extends Instruction> transformStringLiteral(StringLiteral src) {
		Literal idc = createAndLink(Literal.class, src);
		idc.setName( nextId("literal") );
		idc.setKind(LiteralKind.STRING);
		idc.setStringValue(src.getValue());
		setFileInfo(src, idc);
		
		return singleInstruction(idc);
	}

	private List<? extends Instruction> transformBooleanLiteral(BooleanLiteral src) {
		Literal idc = createAndLink(Literal.class, src);
		idc.setName( nextId("literal") );
		idc.setKind(LiteralKind.BOOLEAN);
		idc.setBooleanValue(src.isValue());
		setFileInfo(src, idc);
		
		return singleInstruction(idc);
	}

	private List<? extends Instruction> transformNumLiteral(NumLiteral src) {
		Literal idc = createAndLink(Literal.class, src);
		idc.setName( nextId("literal") );
		idc.setKind(LiteralKind.INTEGER);
		idc.setIntValue(src.getValue());
		setFileInfo(src, idc);
		
		return singleInstruction(idc);
	}

	private List<? extends Instruction> transformVariableReference(VariableReference src) {
		Assign idc = createAndLink(Assign.class, src);
		idc.setName( nextId("assign") );
		idc.setRightVariable( (Variable) resolveNow(src.getVariable()) );
		setFileInfo(src, idc);
		
		return singleInstruction(idc);
	}

	private List<? extends Instruction> transformModelReference(ModelReference src) {
		ReadMeta idc = createAndLink(ReadMeta.class, src);
		idc.setName( nextId("read_meta") );
		idc.setClassName( src.getClassName() );
		idc.setModel( (ModelDefinition) resolveNow(src.getModel()) );
		setFileInfo(src, idc);
		
		return singleInstruction(idc);
	}

	private List<? extends Instruction> transformEmitStatement(EmitStatement src) {
    	QEmit idc = createAndLink(QEmit.class, src);

		List<Instruction> innerInstructions = (List<Instruction>) transformStatement( src.getValue() );
		idc.setValue( (Variable) resolveNow(src.getValue()) );
		
        idc.setQueue( (Queue) resolveNow(src.getQueue() ) );
        setFileInfo(src, idc);
        
        innerInstructions.add(idc);
        return innerInstructions;
	}

	private List<? extends Instruction> transformForAllStatement(ForAllStatement src) {
		QForAll                   idc = createAndLink(QForAll.class, src);
		List<Instruction> instructions = new LinkedList<Instruction>();
		instructions.add(idc);

		idc.setName( src.getName() );
		
		List<Instruction> forAllInstructions = new LinkedList<Instruction>();		
		for(Statement stmt : src.getStatements()) forAllInstructions.addAll( transformStatement(stmt) );
		
		if ( src.getCondition() != null ) {
			  
			IfInstr ifInstr = create(IfInstr.class);
			ifInstr.setName( nextId("if_instr") );
			
			IfBranch thenBranch = create(IfBranch.class);
			ifInstr.setThen(thenBranch);
			// IfBranch elseBranch = create(IfBranch.class);

			// Fill "then"
			List<? extends Instruction> condInstructions = transformStatement(src.getCondition());
			thenBranch.getInstructions().addAll(condInstructions);
			thenBranch.setBooleanVariable((Variable) resolveNow(src.getCondition()));
			IfElseBlock ifBlock = create(IfElseBlock.class);
		    ifBlock.getInstructions().addAll( forAllInstructions );
			thenBranch.setIfBlock( ifBlock );
			
			
			/*
			IfBranch ifBranch = create(IfBranch.class);
			ifBranch.setName( nextId("if_branch") );
			
			List<? extends Instruction> condInstructions = transformStatement(src.getCondition());

			ifBranch.setBooleanVariable( (Variable) resolveNow(src.getCondition()) );

			idc.getInstructions().addAll(condInstructions);
			*/
			
			idc.getInstructions().add(ifInstr);
		} else {
			idc.getInstructions().addAll( forAllInstructions );
		}

        idc.setQueue( (Queue) resolveNow(src.getQueue() ) );
        setFileInfo(src, idc);
        
        return instructions;
	}

	// END-OF Instructions
	private Queue transformQueue(QoolQueue src) {
		if ( src instanceof ModelElementQueue ) {
			org.eclectic.idc.qool.ModelElementQueue idc = createAndLink(org.eclectic.idc.qool.ModelElementQueue.class, src);
			idc.setName( src.getName() );
			ModelElementQueue meq = (ModelElementQueue) src;
			idc.setType_( createTypeInfo(meq.getClass_().getModel(), 
					meq.getClass_().getClassName(), meq.getClass_().isStrictType() ));
			
			for(ClassUse u : meq.getAdditionals()) {
				idc.getAdditionals().add(createTypeInfo(u.getModel(), u.getClassName(), u.isStrictType()));
			}
			
			return idc;
		} else if ( src instanceof LocalQueue ) {
			org.eclectic.idc.qool.LocalQueue idc = createAndLink(org.eclectic.idc.qool.LocalQueue.class, src);
			idc.setName( src.getName() );
			
			TypeExpression queueType = ((LocalQueue) src).getType_();
			if ( !(queueType instanceof ClassUse) ) throw new UnsupportedOperationException("Not supported local queues with primitive types");
			
			idc.setType_( createTypeInfo( ((ClassUse) queueType).getModel(),  ((ClassUse) queueType).getClassName(),  ((ClassUse) queueType).isStrictType()) );
			
			for(QueueOptimization opt : ((LocalQueue) src).getOptimizations()) {
				if ( opt instanceof AccessByFeatureOptimization ) {
					org.eclectic.idc.qool.AccessByFeatureOptimization idcOpt = create(org.eclectic.idc.qool.AccessByFeatureOptimization.class);
					idcOpt.setFeatureName( ((AccessByFeatureOptimization) opt).getFeatureName() );
					idcOpt.setSpeculative( ! ((AccessByFeatureOptimization) opt).isForce() );
					idc.getOptimizations().add(idcOpt);
				} else {
					throw new UnsupportedOperationException("Not supported optimization " + opt.getClass());
				}
			}
			
			return idc;
		} else {
			throw new UnsupportedOperationException();
		}
	}


	private org.eclectic.idc.qool.InlineModel transformInlineModel(InlineModel src) {
		org.eclectic.idc.qool.InlineModel idc = createAndLink(org.eclectic.idc.qool.InlineModel.class, src);
		idc.setName( src.getName() );
		
		for(InlineClass c : src.getClasses()) idc.getClassifiers().add( transformInlineClass(c) );

		return idc;
	}

	private KClassifier transformInlineClass(InlineClass src) {
		KClass idc = createAndLink(KClass.class, src);
		idc.setName( src.getName() );
		for(InlineFeature f : src.getFeatures() ) idc.getFeatures().add( transformInlineFeature(f) );
		
		return idc;
	}

	private KStructuralFeature transformInlineFeature(InlineFeature src) {
		KStructuralFeature idc = null;
		if ( src instanceof InlineAttribute ) {
			idc = createAndLink(KAttribute.class, src);
			idc.setKtypeName( ((ClassUse) src.getType()).getClassName() );
		} else {
			idc = createAndLink(KReference.class, src);			
		}
		
		idc.setName( src.getName() );
		idc.setIsMultivalued( src.isMultivalued() );
		
		return idc;
	}

	private ModelDefinition transformImportedModel(ImportedModel src) {
		ModelDefinition tgt = createAndLink(ModelDefinition.class, src);
		if ( src.getName().equals("_") ) {
			tgt.setName("__RuntimeModel__");
		} else {
			tgt.setName( src.getName() );
		}
		return tgt;
	}

	protected ModelDefinition transformModelParameter(TransformationDefinitionParameter src, boolean isIn) {
		ModelDefinition idc = createAndLink(ModelDefinition.class, src);
		idc.setName( src.getName() );
		if ( isIn ) {
			idc.setKind(ModelKind.IN);
		} else {
			idc.setKind(ModelKind.OUT);
		}
		
		QoolTransformation transformation = (QoolTransformation) src.eContainer();
		EList<Annotation> annotations = transformation.getAnnotations();
		for (Annotation annotation : annotations) {
			if ( annotation.getAnnotatedElement() == src && annotation instanceof MetamodelModelAnnotation ) {
				MetamodelDefinition d = create(MetamodelDefinition.class);
				d.setPath( ((MetamodelModelAnnotation) annotation).getMetamodel() );
				idc.setMetamodel(d);
				
				break; // only one expected
			}
		}
		
		return idc;
	}

	@SuppressWarnings("unchecked")
	private <T> List<T> allObjectsOf(Class<T> clazz) {
		return (List<T>) qool.allObjectsOf(clazz.getSimpleName());
	}

	private <T> T create(Class<T> clazz) {
		return clazz.cast( idc.createObject(clazz.getSimpleName()) );
	}

	private TypeInfo createTypeInfo(RepresentModel model, String className, boolean strictType) {
		TypeInfo type = create(TypeInfo.class);
		type.setModel( (ModelDefinition) resolveNow(model) ) ;
		type.setClassifierName( className );
		type.setStrictType(strictType);
		return type;
	}

	private HashMap<Object, Object> trace = new HashMap<Object, Object>();
	private Object resolveNow(Object key) {
		Object value = trace.get(key);
		if ( value == null ) throw new IllegalStateException("No trace value for key " + key);
		return value;
	}

	private <T> T createAndLink(Class<T> clazz, Object src) {
		T obj = create(clazz);
		link(src, obj);
		return obj;
	}
	
	private void link(Object src, Object tgt) {
		trace.put(src, tgt);
	}
	
	private static int nextId = 0;
	private String nextId(String prefix) {
		return prefix + "_" + nextId++;
	}

	private void setFileInfo(org.eclectic.frontend.core.LocatedElement src, org.eclectic.idc.core.LocatedElement tgt) {
		tgt.setFile( src.getFile() );
		tgt.setColumn( src.getColumn() );
		tgt.setRow( src.getRow() );
	}

	private List<? extends Instruction> singleInstruction(Instruction idc) {
		List<Instruction> instr = new LinkedList<Instruction>();
		instr.add(idc);
		return instr;
	}
}
