/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.core.util;

import org.eclectic.frontend.core.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclectic.frontend.core.CorePackage
 * @generated
 */
public class CoreSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreSwitch() {
		if (modelPackage == null) {
			modelPackage = CorePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CorePackage.LOCATED_ELEMENT: {
				LocatedElement locatedElement = (LocatedElement)theEObject;
				T result = caseLocatedElement(locatedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DEFINITION_PARAMETER: {
				DefinitionParameter definitionParameter = (DefinitionParameter)theEObject;
				T result = caseDefinitionParameter(definitionParameter);
				if (result == null) result = caseNamedElement(definitionParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.MODULE_PARAMETER: {
				ModuleParameter moduleParameter = (ModuleParameter)theEObject;
				T result = caseModuleParameter(moduleParameter);
				if (result == null) result = caseDefinitionParameter(moduleParameter);
				if (result == null) result = caseNamedElement(moduleParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.MODULE_DEFINITION: {
				ModuleDefinition moduleDefinition = (ModuleDefinition)theEObject;
				T result = caseModuleDefinition(moduleDefinition);
				if (result == null) result = caseLocatedElement(moduleDefinition);
				if (result == null) result = caseNamedElement(moduleDefinition);
				if (result == null) result = caseAnnotableElement(moduleDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ANNOTABLE_ELEMENT: {
				AnnotableElement annotableElement = (AnnotableElement)theEObject;
				T result = caseAnnotableElement(annotableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.IMPLICITLY_ANNOTABLE_ELEMENT: {
				ImplicitlyAnnotableElement implicitlyAnnotableElement = (ImplicitlyAnnotableElement)theEObject;
				T result = caseImplicitlyAnnotableElement(implicitlyAnnotableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ANNOTATION: {
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.OPTIMIZATIONS_ANNOTATION: {
				OptimizationsAnnotation optimizationsAnnotation = (OptimizationsAnnotation)theEObject;
				T result = caseOptimizationsAnnotation(optimizationsAnnotation);
				if (result == null) result = caseAnnotation(optimizationsAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.METAMODEL_MODEL_ANNOTATION: {
				MetamodelModelAnnotation metamodelModelAnnotation = (MetamodelModelAnnotation)theEObject;
				T result = caseMetamodelModelAnnotation(metamodelModelAnnotation);
				if (result == null) result = caseAnnotation(metamodelModelAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SINGLE_ANNOTATION: {
				SingleAnnotation singleAnnotation = (SingleAnnotation)theEObject;
				T result = caseSingleAnnotation(singleAnnotation);
				if (result == null) result = caseAnnotation(singleAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.POTENCY_ANNOTATION: {
				PotencyAnnotation potencyAnnotation = (PotencyAnnotation)theEObject;
				T result = casePotencyAnnotation(potencyAnnotation);
				if (result == null) result = caseSingleAnnotation(potencyAnnotation);
				if (result == null) result = caseAnnotation(potencyAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.GENERIC_ANNOTATION: {
				GenericAnnotation genericAnnotation = (GenericAnnotation)theEObject;
				T result = caseGenericAnnotation(genericAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ANNOTATION_PARAMETER: {
				AnnotationParameter annotationParameter = (AnnotationParameter)theEObject;
				T result = caseAnnotationParameter(annotationParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.REPRESENT_MODEL: {
				RepresentModel representModel = (RepresentModel)theEObject;
				T result = caseRepresentModel(representModel);
				if (result == null) result = caseAnnotableElement(representModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.TRANSFORMATION_DEFINITION: {
				TransformationDefinition transformationDefinition = (TransformationDefinition)theEObject;
				T result = caseTransformationDefinition(transformationDefinition);
				if (result == null) result = caseModuleDefinition(transformationDefinition);
				if (result == null) result = caseLocatedElement(transformationDefinition);
				if (result == null) result = caseNamedElement(transformationDefinition);
				if (result == null) result = caseAnnotableElement(transformationDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ECLECTIC_TRANSFORMATION_DEFINITION: {
				EclecticTransformationDefinition eclecticTransformationDefinition = (EclecticTransformationDefinition)theEObject;
				T result = caseEclecticTransformationDefinition(eclecticTransformationDefinition);
				if (result == null) result = caseTransformationDefinition(eclecticTransformationDefinition);
				if (result == null) result = caseModuleDefinition(eclecticTransformationDefinition);
				if (result == null) result = caseLocatedElement(eclecticTransformationDefinition);
				if (result == null) result = caseNamedElement(eclecticTransformationDefinition);
				if (result == null) result = caseAnnotableElement(eclecticTransformationDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.TRANSFORMATION_DEFINITION_PARAMETER: {
				TransformationDefinitionParameter transformationDefinitionParameter = (TransformationDefinitionParameter)theEObject;
				T result = caseTransformationDefinitionParameter(transformationDefinitionParameter);
				if (result == null) result = caseDefinitionParameter(transformationDefinitionParameter);
				if (result == null) result = caseRepresentModel(transformationDefinitionParameter);
				if (result == null) result = caseNamedElement(transformationDefinitionParameter);
				if (result == null) result = caseAnnotableElement(transformationDefinitionParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.IMPORTED_MODEL: {
				ImportedModel importedModel = (ImportedModel)theEObject;
				T result = caseImportedModel(importedModel);
				if (result == null) result = caseRepresentModel(importedModel);
				if (result == null) result = caseNamedElement(importedModel);
				if (result == null) result = caseAnnotableElement(importedModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.USE_DECLARATION: {
				UseDeclaration useDeclaration = (UseDeclaration)theEObject;
				T result = caseUseDeclaration(useDeclaration);
				if (result == null) result = caseRepresentModel(useDeclaration);
				if (result == null) result = caseAnnotableElement(useDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.REQUIRE_DECLARATION: {
				RequireDeclaration requireDeclaration = (RequireDeclaration)theEObject;
				T result = caseRequireDeclaration(requireDeclaration);
				if (result == null) result = caseRepresentModel(requireDeclaration);
				if (result == null) result = caseAnnotableElement(requireDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.REQUIRE_PARAMETER: {
				RequireParameter requireParameter = (RequireParameter)theEObject;
				T result = caseRequireParameter(requireParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.REQUIRE_MODEL_PARAMETER: {
				RequireModelParameter requireModelParameter = (RequireModelParameter)theEObject;
				T result = caseRequireModelParameter(requireModelParameter);
				if (result == null) result = caseRequireParameter(requireModelParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.STATEMENT: {
				Statement statement = (Statement)theEObject;
				T result = caseStatement(statement);
				if (result == null) result = caseLocatedElement(statement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = caseStatement(expression);
				if (result == null) result = caseLocatedElement(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DEFINE_VARIABLE: {
				DefineVariable defineVariable = (DefineVariable)theEObject;
				T result = caseDefineVariable(defineVariable);
				if (result == null) result = caseStatement(defineVariable);
				if (result == null) result = caseVariable(defineVariable);
				if (result == null) result = caseLocatedElement(defineVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PROPERTY_WRITE: {
				PropertyWrite propertyWrite = (PropertyWrite)theEObject;
				T result = casePropertyWrite(propertyWrite);
				if (result == null) result = caseExpression(propertyWrite);
				if (result == null) result = caseStatement(propertyWrite);
				if (result == null) result = caseLocatedElement(propertyWrite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.MODEL_REFERENCE: {
				ModelReference modelReference = (ModelReference)theEObject;
				T result = caseModelReference(modelReference);
				if (result == null) result = caseClassUse(modelReference);
				if (result == null) result = caseExpression(modelReference);
				if (result == null) result = caseTypeExpression(modelReference);
				if (result == null) result = caseImplicitlyAnnotableElement(modelReference);
				if (result == null) result = caseStatement(modelReference);
				if (result == null) result = caseLocatedElement(modelReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VARIABLE_REFERENCE: {
				VariableReference variableReference = (VariableReference)theEObject;
				T result = caseVariableReference(variableReference);
				if (result == null) result = caseExpression(variableReference);
				if (result == null) result = caseStatement(variableReference);
				if (result == null) result = caseLocatedElement(variableReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.METHOD_CALL: {
				MethodCall methodCall = (MethodCall)theEObject;
				T result = caseMethodCall(methodCall);
				if (result == null) result = caseExpression(methodCall);
				if (result == null) result = caseStatement(methodCall);
				if (result == null) result = caseLocatedElement(methodCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.KEYWORD_METHOD_CALL: {
				KeywordMethodCall keywordMethodCall = (KeywordMethodCall)theEObject;
				T result = caseKeywordMethodCall(keywordMethodCall);
				if (result == null) result = caseExpression(keywordMethodCall);
				if (result == null) result = caseStatement(keywordMethodCall);
				if (result == null) result = caseLocatedElement(keywordMethodCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.KEYWORD_PARAMETER: {
				KeywordParameter keywordParameter = (KeywordParameter)theEObject;
				T result = caseKeywordParameter(keywordParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.BINARY_EXPR: {
				BinaryExpr binaryExpr = (BinaryExpr)theEObject;
				T result = caseBinaryExpr(binaryExpr);
				if (result == null) result = caseExpression(binaryExpr);
				if (result == null) result = caseStatement(binaryExpr);
				if (result == null) result = caseLocatedElement(binaryExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CLOSURE_DECLARATION: {
				ClosureDeclaration closureDeclaration = (ClosureDeclaration)theEObject;
				T result = caseClosureDeclaration(closureDeclaration);
				if (result == null) result = caseExpression(closureDeclaration);
				if (result == null) result = caseStatement(closureDeclaration);
				if (result == null) result = caseLocatedElement(closureDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CLOSURE_PARAMETER: {
				ClosureParameter closureParameter = (ClosureParameter)theEObject;
				T result = caseClosureParameter(closureParameter);
				if (result == null) result = caseVariable(closureParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.RESOLVE_LINK: {
				ResolveLink resolveLink = (ResolveLink)theEObject;
				T result = caseResolveLink(resolveLink);
				if (result == null) result = caseExpression(resolveLink);
				if (result == null) result = caseStatement(resolveLink);
				if (result == null) result = caseLocatedElement(resolveLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.IF_EXPR: {
				IfExpr ifExpr = (IfExpr)theEObject;
				T result = caseIfExpr(ifExpr);
				if (result == null) result = caseExpression(ifExpr);
				if (result == null) result = caseStatement(ifExpr);
				if (result == null) result = caseLocatedElement(ifExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.IF_BRANCH: {
				IfBranch ifBranch = (IfBranch)theEObject;
				T result = caseIfBranch(ifBranch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.NUM_LITERAL: {
				NumLiteral numLiteral = (NumLiteral)theEObject;
				T result = caseNumLiteral(numLiteral);
				if (result == null) result = caseExpression(numLiteral);
				if (result == null) result = caseStatement(numLiteral);
				if (result == null) result = caseLocatedElement(numLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DOUBLE_LITERAL: {
				DoubleLiteral doubleLiteral = (DoubleLiteral)theEObject;
				T result = caseDoubleLiteral(doubleLiteral);
				if (result == null) result = caseExpression(doubleLiteral);
				if (result == null) result = caseStatement(doubleLiteral);
				if (result == null) result = caseLocatedElement(doubleLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.STRING_LITERAL: {
				StringLiteral stringLiteral = (StringLiteral)theEObject;
				T result = caseStringLiteral(stringLiteral);
				if (result == null) result = caseExpression(stringLiteral);
				if (result == null) result = caseStatement(stringLiteral);
				if (result == null) result = caseLocatedElement(stringLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.BOOLEAN_LITERAL: {
				BooleanLiteral booleanLiteral = (BooleanLiteral)theEObject;
				T result = caseBooleanLiteral(booleanLiteral);
				if (result == null) result = caseExpression(booleanLiteral);
				if (result == null) result = caseStatement(booleanLiteral);
				if (result == null) result = caseLocatedElement(booleanLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.TYPE_EXPRESSION: {
				TypeExpression typeExpression = (TypeExpression)theEObject;
				T result = caseTypeExpression(typeExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CLASS_USE: {
				ClassUse classUse = (ClassUse)theEObject;
				T result = caseClassUse(classUse);
				if (result == null) result = caseTypeExpression(classUse);
				if (result == null) result = caseImplicitlyAnnotableElement(classUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.TRACE_USE: {
				TraceUse traceUse = (TraceUse)theEObject;
				T result = caseTraceUse(traceUse);
				if (result == null) result = caseTypeExpression(traceUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.TYPED_WITH_CLASS: {
				TypedWithClass typedWithClass = (TypedWithClass)theEObject;
				T result = caseTypedWithClass(typedWithClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.TRACE_INTERFACE: {
				TraceInterface traceInterface = (TraceInterface)theEObject;
				T result = caseTraceInterface(traceInterface);
				if (result == null) result = caseModuleDefinition(traceInterface);
				if (result == null) result = caseLocatedElement(traceInterface);
				if (result == null) result = caseNamedElement(traceInterface);
				if (result == null) result = caseAnnotableElement(traceInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.TRACED_MODEL_PARAMETER: {
				TracedModelParameter tracedModelParameter = (TracedModelParameter)theEObject;
				T result = caseTracedModelParameter(tracedModelParameter);
				if (result == null) result = caseDefinitionParameter(tracedModelParameter);
				if (result == null) result = caseRepresentModel(tracedModelParameter);
				if (result == null) result = caseNamedElement(tracedModelParameter);
				if (result == null) result = caseAnnotableElement(tracedModelParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.TRACE_DEFINITION: {
				TraceDefinition traceDefinition = (TraceDefinition)theEObject;
				T result = caseTraceDefinition(traceDefinition);
				if (result == null) result = caseNamedElement(traceDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.TRACE_ELEMENT: {
				TraceElement traceElement = (TraceElement)theEObject;
				T result = caseTraceElement(traceElement);
				if (result == null) result = caseNamedElement(traceElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.INLINE_MODEL: {
				InlineModel inlineModel = (InlineModel)theEObject;
				T result = caseInlineModel(inlineModel);
				if (result == null) result = caseModuleDefinition(inlineModel);
				if (result == null) result = caseRepresentModel(inlineModel);
				if (result == null) result = caseLocatedElement(inlineModel);
				if (result == null) result = caseNamedElement(inlineModel);
				if (result == null) result = caseAnnotableElement(inlineModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.INLINE_CLASS: {
				InlineClass inlineClass = (InlineClass)theEObject;
				T result = caseInlineClass(inlineClass);
				if (result == null) result = caseNamedElement(inlineClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.INLINE_FEATURE: {
				InlineFeature inlineFeature = (InlineFeature)theEObject;
				T result = caseInlineFeature(inlineFeature);
				if (result == null) result = caseNamedElement(inlineFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.INLINE_ATTRIBUTE: {
				InlineAttribute inlineAttribute = (InlineAttribute)theEObject;
				T result = caseInlineAttribute(inlineAttribute);
				if (result == null) result = caseInlineFeature(inlineAttribute);
				if (result == null) result = caseNamedElement(inlineAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.INLINE_REFERENCE: {
				InlineReference inlineReference = (InlineReference)theEObject;
				T result = caseInlineReference(inlineReference);
				if (result == null) result = caseInlineFeature(inlineReference);
				if (result == null) result = caseNamedElement(inlineReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.MATCH_TRACE: {
				MatchTrace matchTrace = (MatchTrace)theEObject;
				T result = caseMatchTrace(matchTrace);
				if (result == null) result = caseExpression(matchTrace);
				if (result == null) result = caseStatement(matchTrace);
				if (result == null) result = caseLocatedElement(matchTrace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.TRACE_COMPARE_EXPRESSION: {
				TraceCompareExpression traceCompareExpression = (TraceCompareExpression)theEObject;
				T result = caseTraceCompareExpression(traceCompareExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PUT_TRACE: {
				PutTrace putTrace = (PutTrace)theEObject;
				T result = casePutTrace(putTrace);
				if (result == null) result = caseExpression(putTrace);
				if (result == null) result = caseStatement(putTrace);
				if (result == null) result = caseLocatedElement(putTrace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PUT_TRACE_PARAMETER: {
				PutTraceParameter putTraceParameter = (PutTraceParameter)theEObject;
				T result = casePutTraceParameter(putTraceParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Located Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Located Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocatedElement(LocatedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinitionParameter(DefinitionParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleParameter(ModuleParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleDefinition(ModuleDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotableElement(AnnotableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implicitly Annotable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implicitly Annotable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplicitlyAnnotableElement(ImplicitlyAnnotableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Optimizations Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Optimizations Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptimizationsAnnotation(OptimizationsAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metamodel Model Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metamodel Model Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetamodelModelAnnotation(MetamodelModelAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleAnnotation(SingleAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Potency Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Potency Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePotencyAnnotation(PotencyAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericAnnotation(GenericAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationParameter(AnnotationParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Represent Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Represent Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepresentModel(RepresentModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformationDefinition(TransformationDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eclectic Transformation Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eclectic Transformation Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEclecticTransformationDefinition(EclecticTransformationDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation Definition Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation Definition Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformationDefinitionParameter(TransformationDefinitionParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imported Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imported Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportedModel(ImportedModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Use Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Use Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUseDeclaration(UseDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Require Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Require Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequireDeclaration(RequireDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Require Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Require Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequireParameter(RequireParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Require Model Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Require Model Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequireModelParameter(RequireModelParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Define Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Define Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefineVariable(DefineVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Write</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Write</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyWrite(PropertyWrite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelReference(ModelReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableReference(VariableReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodCall(MethodCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Keyword Method Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Keyword Method Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeywordMethodCall(KeywordMethodCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Keyword Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Keyword Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeywordParameter(KeywordParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryExpr(BinaryExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Closure Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Closure Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClosureDeclaration(ClosureDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Closure Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Closure Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClosureParameter(ClosureParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resolve Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resolve Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResolveLink(ResolveLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfExpr(IfExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Branch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Branch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfBranch(IfBranch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Num Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Num Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumLiteral(NumLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoubleLiteral(DoubleLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringLiteral(StringLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanLiteral(BooleanLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Match Trace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Match Trace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatchTrace(MatchTrace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trace Compare Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trace Compare Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraceCompareExpression(TraceCompareExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Put Trace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Put Trace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePutTrace(PutTrace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Put Trace Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Put Trace Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePutTraceParameter(PutTraceParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeExpression(TypeExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassUse(ClassUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trace Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trace Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraceUse(TraceUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed With Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed With Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedWithClass(TypedWithClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trace Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trace Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraceInterface(TraceInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Model Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Model Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTracedModelParameter(TracedModelParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trace Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trace Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraceDefinition(TraceDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trace Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trace Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraceElement(TraceElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inline Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inline Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInlineModel(InlineModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inline Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inline Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInlineClass(InlineClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inline Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inline Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInlineFeature(InlineFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inline Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inline Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInlineAttribute(InlineAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inline Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inline Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInlineReference(InlineReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CoreSwitch
