/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.core.impl;

import org.eclectic.frontend.core.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoreFactoryImpl extends EFactoryImpl implements CoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CoreFactory init() {
		try {
			CoreFactory theCoreFactory = (CoreFactory)EPackage.Registry.INSTANCE.getEFactory("http://eclectic.org/frontend/core"); 
			if (theCoreFactory != null) {
				return theCoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CorePackage.MODULE_PARAMETER: return createModuleParameter();
			case CorePackage.IMPLICITLY_ANNOTABLE_ELEMENT: return createImplicitlyAnnotableElement();
			case CorePackage.OPTIMIZATIONS_ANNOTATION: return createOptimizationsAnnotation();
			case CorePackage.METAMODEL_MODEL_ANNOTATION: return createMetamodelModelAnnotation();
			case CorePackage.POTENCY_ANNOTATION: return createPotencyAnnotation();
			case CorePackage.GENERIC_ANNOTATION: return createGenericAnnotation();
			case CorePackage.ECLECTIC_TRANSFORMATION_DEFINITION: return createEclecticTransformationDefinition();
			case CorePackage.TRANSFORMATION_DEFINITION_PARAMETER: return createTransformationDefinitionParameter();
			case CorePackage.IMPORTED_MODEL: return createImportedModel();
			case CorePackage.USE_DECLARATION: return createUseDeclaration();
			case CorePackage.REQUIRE_DECLARATION: return createRequireDeclaration();
			case CorePackage.REQUIRE_MODEL_PARAMETER: return createRequireModelParameter();
			case CorePackage.DEFINE_VARIABLE: return createDefineVariable();
			case CorePackage.PROPERTY_WRITE: return createPropertyWrite();
			case CorePackage.MODEL_REFERENCE: return createModelReference();
			case CorePackage.VARIABLE_REFERENCE: return createVariableReference();
			case CorePackage.METHOD_CALL: return createMethodCall();
			case CorePackage.KEYWORD_METHOD_CALL: return createKeywordMethodCall();
			case CorePackage.KEYWORD_PARAMETER: return createKeywordParameter();
			case CorePackage.BINARY_EXPR: return createBinaryExpr();
			case CorePackage.CLOSURE_DECLARATION: return createClosureDeclaration();
			case CorePackage.CLOSURE_PARAMETER: return createClosureParameter();
			case CorePackage.RESOLVE_LINK: return createResolveLink();
			case CorePackage.IF_EXPR: return createIfExpr();
			case CorePackage.IF_BRANCH: return createIfBranch();
			case CorePackage.NUM_LITERAL: return createNumLiteral();
			case CorePackage.DOUBLE_LITERAL: return createDoubleLiteral();
			case CorePackage.STRING_LITERAL: return createStringLiteral();
			case CorePackage.BOOLEAN_LITERAL: return createBooleanLiteral();
			case CorePackage.CLASS_USE: return createClassUse();
			case CorePackage.TRACE_USE: return createTraceUse();
			case CorePackage.TRACE_INTERFACE: return createTraceInterface();
			case CorePackage.TRACED_MODEL_PARAMETER: return createTracedModelParameter();
			case CorePackage.TRACE_DEFINITION: return createTraceDefinition();
			case CorePackage.TRACE_ELEMENT: return createTraceElement();
			case CorePackage.INLINE_MODEL: return createInlineModel();
			case CorePackage.INLINE_CLASS: return createInlineClass();
			case CorePackage.INLINE_FEATURE: return createInlineFeature();
			case CorePackage.INLINE_ATTRIBUTE: return createInlineAttribute();
			case CorePackage.INLINE_REFERENCE: return createInlineReference();
			case CorePackage.MATCH_TRACE: return createMatchTrace();
			case CorePackage.TRACE_COMPARE_EXPRESSION: return createTraceCompareExpression();
			case CorePackage.PUT_TRACE: return createPutTrace();
			case CorePackage.PUT_TRACE_PARAMETER: return createPutTraceParameter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CorePackage.BINARY_OP:
				return createBinaryOpFromString(eDataType, initialValue);
			case CorePackage.RESOLVE_TRACE_CARDINALITY:
				return createResolveTraceCardinalityFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CorePackage.BINARY_OP:
				return convertBinaryOpToString(eDataType, instanceValue);
			case CorePackage.RESOLVE_TRACE_CARDINALITY:
				return convertResolveTraceCardinalityToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleParameter createModuleParameter() {
		ModuleParameterImpl moduleParameter = new ModuleParameterImpl();
		return moduleParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicitlyAnnotableElement createImplicitlyAnnotableElement() {
		ImplicitlyAnnotableElementImpl implicitlyAnnotableElement = new ImplicitlyAnnotableElementImpl();
		return implicitlyAnnotableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptimizationsAnnotation createOptimizationsAnnotation() {
		OptimizationsAnnotationImpl optimizationsAnnotation = new OptimizationsAnnotationImpl();
		return optimizationsAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelModelAnnotation createMetamodelModelAnnotation() {
		MetamodelModelAnnotationImpl metamodelModelAnnotation = new MetamodelModelAnnotationImpl();
		return metamodelModelAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PotencyAnnotation createPotencyAnnotation() {
		PotencyAnnotationImpl potencyAnnotation = new PotencyAnnotationImpl();
		return potencyAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericAnnotation createGenericAnnotation() {
		GenericAnnotationImpl genericAnnotation = new GenericAnnotationImpl();
		return genericAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EclecticTransformationDefinition createEclecticTransformationDefinition() {
		EclecticTransformationDefinitionImpl eclecticTransformationDefinition = new EclecticTransformationDefinitionImpl();
		return eclecticTransformationDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationDefinitionParameter createTransformationDefinitionParameter() {
		TransformationDefinitionParameterImpl transformationDefinitionParameter = new TransformationDefinitionParameterImpl();
		return transformationDefinitionParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportedModel createImportedModel() {
		ImportedModelImpl importedModel = new ImportedModelImpl();
		return importedModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseDeclaration createUseDeclaration() {
		UseDeclarationImpl useDeclaration = new UseDeclarationImpl();
		return useDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequireDeclaration createRequireDeclaration() {
		RequireDeclarationImpl requireDeclaration = new RequireDeclarationImpl();
		return requireDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequireModelParameter createRequireModelParameter() {
		RequireModelParameterImpl requireModelParameter = new RequireModelParameterImpl();
		return requireModelParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefineVariable createDefineVariable() {
		DefineVariableImpl defineVariable = new DefineVariableImpl();
		return defineVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyWrite createPropertyWrite() {
		PropertyWriteImpl propertyWrite = new PropertyWriteImpl();
		return propertyWrite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelReference createModelReference() {
		ModelReferenceImpl modelReference = new ModelReferenceImpl();
		return modelReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableReference createVariableReference() {
		VariableReferenceImpl variableReference = new VariableReferenceImpl();
		return variableReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodCall createMethodCall() {
		MethodCallImpl methodCall = new MethodCallImpl();
		return methodCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeywordMethodCall createKeywordMethodCall() {
		KeywordMethodCallImpl keywordMethodCall = new KeywordMethodCallImpl();
		return keywordMethodCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeywordParameter createKeywordParameter() {
		KeywordParameterImpl keywordParameter = new KeywordParameterImpl();
		return keywordParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryExpr createBinaryExpr() {
		BinaryExprImpl binaryExpr = new BinaryExprImpl();
		return binaryExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClosureDeclaration createClosureDeclaration() {
		ClosureDeclarationImpl closureDeclaration = new ClosureDeclarationImpl();
		return closureDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClosureParameter createClosureParameter() {
		ClosureParameterImpl closureParameter = new ClosureParameterImpl();
		return closureParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolveLink createResolveLink() {
		ResolveLinkImpl resolveLink = new ResolveLinkImpl();
		return resolveLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfExpr createIfExpr() {
		IfExprImpl ifExpr = new IfExprImpl();
		return ifExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfBranch createIfBranch() {
		IfBranchImpl ifBranch = new IfBranchImpl();
		return ifBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumLiteral createNumLiteral() {
		NumLiteralImpl numLiteral = new NumLiteralImpl();
		return numLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleLiteral createDoubleLiteral() {
		DoubleLiteralImpl doubleLiteral = new DoubleLiteralImpl();
		return doubleLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringLiteral createStringLiteral() {
		StringLiteralImpl stringLiteral = new StringLiteralImpl();
		return stringLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanLiteral createBooleanLiteral() {
		BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
		return booleanLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchTrace createMatchTrace() {
		MatchTraceImpl matchTrace = new MatchTraceImpl();
		return matchTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceCompareExpression createTraceCompareExpression() {
		TraceCompareExpressionImpl traceCompareExpression = new TraceCompareExpressionImpl();
		return traceCompareExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PutTrace createPutTrace() {
		PutTraceImpl putTrace = new PutTraceImpl();
		return putTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PutTraceParameter createPutTraceParameter() {
		PutTraceParameterImpl putTraceParameter = new PutTraceParameterImpl();
		return putTraceParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassUse createClassUse() {
		ClassUseImpl classUse = new ClassUseImpl();
		return classUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceUse createTraceUse() {
		TraceUseImpl traceUse = new TraceUseImpl();
		return traceUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceInterface createTraceInterface() {
		TraceInterfaceImpl traceInterface = new TraceInterfaceImpl();
		return traceInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedModelParameter createTracedModelParameter() {
		TracedModelParameterImpl tracedModelParameter = new TracedModelParameterImpl();
		return tracedModelParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceDefinition createTraceDefinition() {
		TraceDefinitionImpl traceDefinition = new TraceDefinitionImpl();
		return traceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceElement createTraceElement() {
		TraceElementImpl traceElement = new TraceElementImpl();
		return traceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InlineModel createInlineModel() {
		InlineModelImpl inlineModel = new InlineModelImpl();
		return inlineModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InlineClass createInlineClass() {
		InlineClassImpl inlineClass = new InlineClassImpl();
		return inlineClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InlineFeature createInlineFeature() {
		InlineFeatureImpl inlineFeature = new InlineFeatureImpl();
		return inlineFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InlineAttribute createInlineAttribute() {
		InlineAttributeImpl inlineAttribute = new InlineAttributeImpl();
		return inlineAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InlineReference createInlineReference() {
		InlineReferenceImpl inlineReference = new InlineReferenceImpl();
		return inlineReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOp createBinaryOpFromString(EDataType eDataType, String initialValue) {
		BinaryOp result = BinaryOp.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBinaryOpToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolveTraceCardinality createResolveTraceCardinalityFromString(EDataType eDataType, String initialValue) {
		ResolveTraceCardinality result = ResolveTraceCardinality.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResolveTraceCardinalityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorePackage getCorePackage() {
		return (CorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CorePackage getPackage() {
		return CorePackage.eINSTANCE;
	}

} //CoreFactoryImpl
