/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.attribution;

import org.eclectic.frontend.core.CorePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclectic.frontend.attribution.AttributionFactory
 * @model kind="package"
 * @generated
 */
public interface AttributionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "attribution";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclectic.org/frontend/attributionL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ec_frontend_attributionL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AttributionPackage eINSTANCE = org.eclectic.frontend.attribution.impl.AttributionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.attribution.impl.AttributionTransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.attribution.impl.AttributionTransformationImpl
	 * @see org.eclectic.frontend.attribution.impl.AttributionPackageImpl#getAttributionTransformation()
	 * @generated
	 */
	int ATTRIBUTION_TRANSFORMATION = 0;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTION_TRANSFORMATION__ROW = CorePackage.TRANSFORMATION_DEFINITION__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTION_TRANSFORMATION__COLUMN = CorePackage.TRANSFORMATION_DEFINITION__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTION_TRANSFORMATION__FILE = CorePackage.TRANSFORMATION_DEFINITION__FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTION_TRANSFORMATION__NAME = CorePackage.TRANSFORMATION_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Annotated With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTION_TRANSFORMATION__ANNOTATED_WITH = CorePackage.TRANSFORMATION_DEFINITION__ANNOTATED_WITH;

	/**
	 * The feature id for the '<em><b>In Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTION_TRANSFORMATION__IN_MODELS = CorePackage.TRANSFORMATION_DEFINITION__IN_MODELS;

	/**
	 * The feature id for the '<em><b>Out Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTION_TRANSFORMATION__OUT_MODELS = CorePackage.TRANSFORMATION_DEFINITION__OUT_MODELS;

	/**
	 * The feature id for the '<em><b>Imported Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTION_TRANSFORMATION__IMPORTED_MODELS = CorePackage.TRANSFORMATION_DEFINITION__IMPORTED_MODELS;

	/**
	 * The feature id for the '<em><b>Inline Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTION_TRANSFORMATION__INLINE_MODELS = CorePackage.TRANSFORMATION_DEFINITION__INLINE_MODELS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTION_TRANSFORMATION__ANNOTATIONS = CorePackage.TRANSFORMATION_DEFINITION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTION_TRANSFORMATION__USES = CorePackage.TRANSFORMATION_DEFINITION__USES;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTION_TRANSFORMATION__REQUIRES = CorePackage.TRANSFORMATION_DEFINITION__REQUIRES;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTION_TRANSFORMATION__ATTRIBUTES = CorePackage.TRANSFORMATION_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTION_TRANSFORMATION__RULES = CorePackage.TRANSFORMATION_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTION_TRANSFORMATION_FEATURE_COUNT = CorePackage.TRANSFORMATION_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.attribution.impl.AttributeDclImpl <em>Attribute Dcl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.attribution.impl.AttributeDclImpl
	 * @see org.eclectic.frontend.attribution.impl.AttributionPackageImpl#getAttributeDcl()
	 * @generated
	 */
	int ATTRIBUTE_DCL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DCL__NAME = CorePackage.VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type </b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DCL__TYPE_ = CorePackage.VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DCL__ROW = CorePackage.VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DCL__COLUMN = CorePackage.VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DCL__FILE = CorePackage.VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Attribute Dcl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DCL_FEATURE_COUNT = CorePackage.VARIABLE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.attribution.impl.InheritedAttributeDclImpl <em>Inherited Attribute Dcl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.attribution.impl.InheritedAttributeDclImpl
	 * @see org.eclectic.frontend.attribution.impl.AttributionPackageImpl#getInheritedAttributeDcl()
	 * @generated
	 */
	int INHERITED_ATTRIBUTE_DCL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_ATTRIBUTE_DCL__NAME = ATTRIBUTE_DCL__NAME;

	/**
	 * The feature id for the '<em><b>Type </b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_ATTRIBUTE_DCL__TYPE_ = ATTRIBUTE_DCL__TYPE_;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_ATTRIBUTE_DCL__ROW = ATTRIBUTE_DCL__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_ATTRIBUTE_DCL__COLUMN = ATTRIBUTE_DCL__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_ATTRIBUTE_DCL__FILE = ATTRIBUTE_DCL__FILE;

	/**
	 * The number of structural features of the '<em>Inherited Attribute Dcl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_ATTRIBUTE_DCL_FEATURE_COUNT = ATTRIBUTE_DCL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.attribution.impl.SynthesizedAttributeDclImpl <em>Synthesized Attribute Dcl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.attribution.impl.SynthesizedAttributeDclImpl
	 * @see org.eclectic.frontend.attribution.impl.AttributionPackageImpl#getSynthesizedAttributeDcl()
	 * @generated
	 */
	int SYNTHESIZED_ATTRIBUTE_DCL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIZED_ATTRIBUTE_DCL__NAME = ATTRIBUTE_DCL__NAME;

	/**
	 * The feature id for the '<em><b>Type </b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIZED_ATTRIBUTE_DCL__TYPE_ = ATTRIBUTE_DCL__TYPE_;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIZED_ATTRIBUTE_DCL__ROW = ATTRIBUTE_DCL__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIZED_ATTRIBUTE_DCL__COLUMN = ATTRIBUTE_DCL__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIZED_ATTRIBUTE_DCL__FILE = ATTRIBUTE_DCL__FILE;

	/**
	 * The number of structural features of the '<em>Synthesized Attribute Dcl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIZED_ATTRIBUTE_DCL_FEATURE_COUNT = ATTRIBUTE_DCL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.attribution.impl.AttributionRuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.attribution.impl.AttributionRuleImpl
	 * @see org.eclectic.frontend.attribution.impl.AttributionPackageImpl#getAttributionRule()
	 * @generated
	 */
	int ATTRIBUTION_RULE = 4;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTION_RULE__ROW = CorePackage.LOCATED_ELEMENT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTION_RULE__COLUMN = CorePackage.LOCATED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTION_RULE__FILE = CorePackage.LOCATED_ELEMENT__FILE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTION_RULE__TYPE = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Self</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTION_RULE__SELF = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTION_RULE__CONDITION = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTION_RULE__STATEMENTS = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTION_RULE_FEATURE_COUNT = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.attribution.impl.RuleSelfImpl <em>Rule Self</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.attribution.impl.RuleSelfImpl
	 * @see org.eclectic.frontend.attribution.impl.AttributionPackageImpl#getRuleSelf()
	 * @generated
	 */
	int RULE_SELF = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SELF__NAME = CorePackage.VARIABLE__NAME;

	/**
	 * The number of structural features of the '<em>Rule Self</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SELF_FEATURE_COUNT = CorePackage.VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.attribution.impl.AttributeInitImpl <em>Attribute Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.attribution.impl.AttributeInitImpl
	 * @see org.eclectic.frontend.attribution.impl.AttributionPackageImpl#getAttributeInit()
	 * @generated
	 */
	int ATTRIBUTE_INIT = 6;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_INIT__ROW = CorePackage.STATEMENT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_INIT__COLUMN = CorePackage.STATEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_INIT__FILE = CorePackage.STATEMENT__FILE;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_INIT__ATTRIBUTE = CorePackage.STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Receptor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_INIT__RECEPTOR = CorePackage.STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_INIT__RIGHT = CorePackage.STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Attribute Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_INIT_FEATURE_COUNT = CorePackage.STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.attribution.impl.AttributeUseImpl <em>Attribute Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.attribution.impl.AttributeUseImpl
	 * @see org.eclectic.frontend.attribution.impl.AttributionPackageImpl#getAttributeUse()
	 * @generated
	 */
	int ATTRIBUTE_USE = 7;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_USE__ROW = CorePackage.EXPRESSION__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_USE__COLUMN = CorePackage.EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_USE__FILE = CorePackage.EXPRESSION__FILE;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_USE__EXPR = CorePackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_USE__ATTRIBUTE = CorePackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_USE_FEATURE_COUNT = CorePackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.attribution.AttributionTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see org.eclectic.frontend.attribution.AttributionTransformation
	 * @generated
	 */
	EClass getAttributionTransformation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.attribution.AttributionTransformation#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.eclectic.frontend.attribution.AttributionTransformation#getAttributes()
	 * @see #getAttributionTransformation()
	 * @generated
	 */
	EReference getAttributionTransformation_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.attribution.AttributionTransformation#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see org.eclectic.frontend.attribution.AttributionTransformation#getRules()
	 * @see #getAttributionTransformation()
	 * @generated
	 */
	EReference getAttributionTransformation_Rules();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.attribution.AttributeDcl <em>Attribute Dcl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Dcl</em>'.
	 * @see org.eclectic.frontend.attribution.AttributeDcl
	 * @generated
	 */
	EClass getAttributeDcl();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.attribution.InheritedAttributeDcl <em>Inherited Attribute Dcl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inherited Attribute Dcl</em>'.
	 * @see org.eclectic.frontend.attribution.InheritedAttributeDcl
	 * @generated
	 */
	EClass getInheritedAttributeDcl();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.attribution.SynthesizedAttributeDcl <em>Synthesized Attribute Dcl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synthesized Attribute Dcl</em>'.
	 * @see org.eclectic.frontend.attribution.SynthesizedAttributeDcl
	 * @generated
	 */
	EClass getSynthesizedAttributeDcl();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.attribution.AttributionRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see org.eclectic.frontend.attribution.AttributionRule
	 * @generated
	 */
	EClass getAttributionRule();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.attribution.AttributionRule#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.eclectic.frontend.attribution.AttributionRule#getType()
	 * @see #getAttributionRule()
	 * @generated
	 */
	EReference getAttributionRule_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.attribution.AttributionRule#getSelf <em>Self</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Self</em>'.
	 * @see org.eclectic.frontend.attribution.AttributionRule#getSelf()
	 * @see #getAttributionRule()
	 * @generated
	 */
	EReference getAttributionRule_Self();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.attribution.AttributionRule#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.eclectic.frontend.attribution.AttributionRule#getCondition()
	 * @see #getAttributionRule()
	 * @generated
	 */
	EReference getAttributionRule_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.attribution.AttributionRule#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see org.eclectic.frontend.attribution.AttributionRule#getStatements()
	 * @see #getAttributionRule()
	 * @generated
	 */
	EReference getAttributionRule_Statements();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.attribution.RuleSelf <em>Rule Self</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Self</em>'.
	 * @see org.eclectic.frontend.attribution.RuleSelf
	 * @generated
	 */
	EClass getRuleSelf();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.attribution.AttributeInit <em>Attribute Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Init</em>'.
	 * @see org.eclectic.frontend.attribution.AttributeInit
	 * @generated
	 */
	EClass getAttributeInit();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.frontend.attribution.AttributeInit#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see org.eclectic.frontend.attribution.AttributeInit#getAttribute()
	 * @see #getAttributeInit()
	 * @generated
	 */
	EReference getAttributeInit_Attribute();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.attribution.AttributeInit#getReceptor <em>Receptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Receptor</em>'.
	 * @see org.eclectic.frontend.attribution.AttributeInit#getReceptor()
	 * @see #getAttributeInit()
	 * @generated
	 */
	EReference getAttributeInit_Receptor();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.attribution.AttributeInit#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see org.eclectic.frontend.attribution.AttributeInit#getRight()
	 * @see #getAttributeInit()
	 * @generated
	 */
	EReference getAttributeInit_Right();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.attribution.AttributeUse <em>Attribute Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Use</em>'.
	 * @see org.eclectic.frontend.attribution.AttributeUse
	 * @generated
	 */
	EClass getAttributeUse();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.attribution.AttributeUse#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see org.eclectic.frontend.attribution.AttributeUse#getExpr()
	 * @see #getAttributeUse()
	 * @generated
	 */
	EReference getAttributeUse_Expr();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.frontend.attribution.AttributeUse#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see org.eclectic.frontend.attribution.AttributeUse#getAttribute()
	 * @see #getAttributeUse()
	 * @generated
	 */
	EReference getAttributeUse_Attribute();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AttributionFactory getAttributionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.attribution.impl.AttributionTransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.attribution.impl.AttributionTransformationImpl
		 * @see org.eclectic.frontend.attribution.impl.AttributionPackageImpl#getAttributionTransformation()
		 * @generated
		 */
		EClass ATTRIBUTION_TRANSFORMATION = eINSTANCE.getAttributionTransformation();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTION_TRANSFORMATION__ATTRIBUTES = eINSTANCE.getAttributionTransformation_Attributes();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTION_TRANSFORMATION__RULES = eINSTANCE.getAttributionTransformation_Rules();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.attribution.impl.AttributeDclImpl <em>Attribute Dcl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.attribution.impl.AttributeDclImpl
		 * @see org.eclectic.frontend.attribution.impl.AttributionPackageImpl#getAttributeDcl()
		 * @generated
		 */
		EClass ATTRIBUTE_DCL = eINSTANCE.getAttributeDcl();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.attribution.impl.InheritedAttributeDclImpl <em>Inherited Attribute Dcl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.attribution.impl.InheritedAttributeDclImpl
		 * @see org.eclectic.frontend.attribution.impl.AttributionPackageImpl#getInheritedAttributeDcl()
		 * @generated
		 */
		EClass INHERITED_ATTRIBUTE_DCL = eINSTANCE.getInheritedAttributeDcl();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.attribution.impl.SynthesizedAttributeDclImpl <em>Synthesized Attribute Dcl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.attribution.impl.SynthesizedAttributeDclImpl
		 * @see org.eclectic.frontend.attribution.impl.AttributionPackageImpl#getSynthesizedAttributeDcl()
		 * @generated
		 */
		EClass SYNTHESIZED_ATTRIBUTE_DCL = eINSTANCE.getSynthesizedAttributeDcl();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.attribution.impl.AttributionRuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.attribution.impl.AttributionRuleImpl
		 * @see org.eclectic.frontend.attribution.impl.AttributionPackageImpl#getAttributionRule()
		 * @generated
		 */
		EClass ATTRIBUTION_RULE = eINSTANCE.getAttributionRule();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTION_RULE__TYPE = eINSTANCE.getAttributionRule_Type();

		/**
		 * The meta object literal for the '<em><b>Self</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTION_RULE__SELF = eINSTANCE.getAttributionRule_Self();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTION_RULE__CONDITION = eINSTANCE.getAttributionRule_Condition();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTION_RULE__STATEMENTS = eINSTANCE.getAttributionRule_Statements();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.attribution.impl.RuleSelfImpl <em>Rule Self</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.attribution.impl.RuleSelfImpl
		 * @see org.eclectic.frontend.attribution.impl.AttributionPackageImpl#getRuleSelf()
		 * @generated
		 */
		EClass RULE_SELF = eINSTANCE.getRuleSelf();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.attribution.impl.AttributeInitImpl <em>Attribute Init</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.attribution.impl.AttributeInitImpl
		 * @see org.eclectic.frontend.attribution.impl.AttributionPackageImpl#getAttributeInit()
		 * @generated
		 */
		EClass ATTRIBUTE_INIT = eINSTANCE.getAttributeInit();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_INIT__ATTRIBUTE = eINSTANCE.getAttributeInit_Attribute();

		/**
		 * The meta object literal for the '<em><b>Receptor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_INIT__RECEPTOR = eINSTANCE.getAttributeInit_Receptor();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_INIT__RIGHT = eINSTANCE.getAttributeInit_Right();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.attribution.impl.AttributeUseImpl <em>Attribute Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.attribution.impl.AttributeUseImpl
		 * @see org.eclectic.frontend.attribution.impl.AttributionPackageImpl#getAttributeUse()
		 * @generated
		 */
		EClass ATTRIBUTE_USE = eINSTANCE.getAttributeUse();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_USE__EXPR = eINSTANCE.getAttributeUse_Expr();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_USE__ATTRIBUTE = eINSTANCE.getAttributeUse_Attribute();

	}

} //AttributionPackage
