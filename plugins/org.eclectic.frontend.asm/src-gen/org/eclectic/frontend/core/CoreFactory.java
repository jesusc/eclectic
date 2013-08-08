/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.core;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclectic.frontend.core.CorePackage
 * @generated
 */
public interface CoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CoreFactory eINSTANCE = org.eclectic.frontend.core.impl.CoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Module Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Parameter</em>'.
	 * @generated
	 */
	ModuleParameter createModuleParameter();

	/**
	 * Returns a new object of class '<em>Implicitly Annotable Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implicitly Annotable Element</em>'.
	 * @generated
	 */
	ImplicitlyAnnotableElement createImplicitlyAnnotableElement();

	/**
	 * Returns a new object of class '<em>Optimizations Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Optimizations Annotation</em>'.
	 * @generated
	 */
	OptimizationsAnnotation createOptimizationsAnnotation();

	/**
	 * Returns a new object of class '<em>Metamodel Model Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metamodel Model Annotation</em>'.
	 * @generated
	 */
	MetamodelModelAnnotation createMetamodelModelAnnotation();

	/**
	 * Returns a new object of class '<em>Potency Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Potency Annotation</em>'.
	 * @generated
	 */
	PotencyAnnotation createPotencyAnnotation();

	/**
	 * Returns a new object of class '<em>Generic Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Annotation</em>'.
	 * @generated
	 */
	GenericAnnotation createGenericAnnotation();

	/**
	 * Returns a new object of class '<em>Eclectic Transformation Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eclectic Transformation Definition</em>'.
	 * @generated
	 */
	EclecticTransformationDefinition createEclecticTransformationDefinition();

	/**
	 * Returns a new object of class '<em>Transformation Definition Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation Definition Parameter</em>'.
	 * @generated
	 */
	TransformationDefinitionParameter createTransformationDefinitionParameter();

	/**
	 * Returns a new object of class '<em>Imported Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imported Model</em>'.
	 * @generated
	 */
	ImportedModel createImportedModel();

	/**
	 * Returns a new object of class '<em>Use Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Use Declaration</em>'.
	 * @generated
	 */
	UseDeclaration createUseDeclaration();

	/**
	 * Returns a new object of class '<em>Require Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Require Declaration</em>'.
	 * @generated
	 */
	RequireDeclaration createRequireDeclaration();

	/**
	 * Returns a new object of class '<em>Require Model Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Require Model Parameter</em>'.
	 * @generated
	 */
	RequireModelParameter createRequireModelParameter();

	/**
	 * Returns a new object of class '<em>Define Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Define Variable</em>'.
	 * @generated
	 */
	DefineVariable createDefineVariable();

	/**
	 * Returns a new object of class '<em>Property Write</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Write</em>'.
	 * @generated
	 */
	PropertyWrite createPropertyWrite();

	/**
	 * Returns a new object of class '<em>Model Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Reference</em>'.
	 * @generated
	 */
	ModelReference createModelReference();

	/**
	 * Returns a new object of class '<em>Variable Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Reference</em>'.
	 * @generated
	 */
	VariableReference createVariableReference();

	/**
	 * Returns a new object of class '<em>Method Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Call</em>'.
	 * @generated
	 */
	MethodCall createMethodCall();

	/**
	 * Returns a new object of class '<em>Keyword Method Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Keyword Method Call</em>'.
	 * @generated
	 */
	KeywordMethodCall createKeywordMethodCall();

	/**
	 * Returns a new object of class '<em>Keyword Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Keyword Parameter</em>'.
	 * @generated
	 */
	KeywordParameter createKeywordParameter();

	/**
	 * Returns a new object of class '<em>Binary Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Expr</em>'.
	 * @generated
	 */
	BinaryExpr createBinaryExpr();

	/**
	 * Returns a new object of class '<em>Closure Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Closure Declaration</em>'.
	 * @generated
	 */
	ClosureDeclaration createClosureDeclaration();

	/**
	 * Returns a new object of class '<em>Closure Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Closure Parameter</em>'.
	 * @generated
	 */
	ClosureParameter createClosureParameter();

	/**
	 * Returns a new object of class '<em>Resolve Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resolve Link</em>'.
	 * @generated
	 */
	ResolveLink createResolveLink();

	/**
	 * Returns a new object of class '<em>If Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Expr</em>'.
	 * @generated
	 */
	IfExpr createIfExpr();

	/**
	 * Returns a new object of class '<em>If Branch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Branch</em>'.
	 * @generated
	 */
	IfBranch createIfBranch();

	/**
	 * Returns a new object of class '<em>Num Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Num Literal</em>'.
	 * @generated
	 */
	NumLiteral createNumLiteral();

	/**
	 * Returns a new object of class '<em>Double Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double Literal</em>'.
	 * @generated
	 */
	DoubleLiteral createDoubleLiteral();

	/**
	 * Returns a new object of class '<em>String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Literal</em>'.
	 * @generated
	 */
	StringLiteral createStringLiteral();

	/**
	 * Returns a new object of class '<em>Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Literal</em>'.
	 * @generated
	 */
	BooleanLiteral createBooleanLiteral();

	/**
	 * Returns a new object of class '<em>Match Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Match Trace</em>'.
	 * @generated
	 */
	MatchTrace createMatchTrace();

	/**
	 * Returns a new object of class '<em>Trace Compare Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trace Compare Expression</em>'.
	 * @generated
	 */
	TraceCompareExpression createTraceCompareExpression();

	/**
	 * Returns a new object of class '<em>Put Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Put Trace</em>'.
	 * @generated
	 */
	PutTrace createPutTrace();

	/**
	 * Returns a new object of class '<em>Put Trace Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Put Trace Parameter</em>'.
	 * @generated
	 */
	PutTraceParameter createPutTraceParameter();

	/**
	 * Returns a new object of class '<em>Class Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Use</em>'.
	 * @generated
	 */
	ClassUse createClassUse();

	/**
	 * Returns a new object of class '<em>Trace Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trace Use</em>'.
	 * @generated
	 */
	TraceUse createTraceUse();

	/**
	 * Returns a new object of class '<em>Trace Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trace Interface</em>'.
	 * @generated
	 */
	TraceInterface createTraceInterface();

	/**
	 * Returns a new object of class '<em>Traced Model Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Model Parameter</em>'.
	 * @generated
	 */
	TracedModelParameter createTracedModelParameter();

	/**
	 * Returns a new object of class '<em>Trace Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trace Definition</em>'.
	 * @generated
	 */
	TraceDefinition createTraceDefinition();

	/**
	 * Returns a new object of class '<em>Trace Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trace Element</em>'.
	 * @generated
	 */
	TraceElement createTraceElement();

	/**
	 * Returns a new object of class '<em>Inline Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inline Model</em>'.
	 * @generated
	 */
	InlineModel createInlineModel();

	/**
	 * Returns a new object of class '<em>Inline Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inline Class</em>'.
	 * @generated
	 */
	InlineClass createInlineClass();

	/**
	 * Returns a new object of class '<em>Inline Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inline Feature</em>'.
	 * @generated
	 */
	InlineFeature createInlineFeature();

	/**
	 * Returns a new object of class '<em>Inline Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inline Attribute</em>'.
	 * @generated
	 */
	InlineAttribute createInlineAttribute();

	/**
	 * Returns a new object of class '<em>Inline Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inline Reference</em>'.
	 * @generated
	 */
	InlineReference createInlineReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CorePackage getCorePackage();

} //CoreFactory
