/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.koan;

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
 * @see org.eclectic.frontend.koan.KoanFactory
 * @model kind="package"
 * @generated
 */
public interface KoanPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "koan";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclectic.org/frontend/koanL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ec_frontend_koanL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KoanPackage eINSTANCE = org.eclectic.frontend.koan.impl.KoanPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.koan.impl.KoanTransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.koan.impl.KoanTransformationImpl
	 * @see org.eclectic.frontend.koan.impl.KoanPackageImpl#getKoanTransformation()
	 * @generated
	 */
	int KOAN_TRANSFORMATION = 0;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOAN_TRANSFORMATION__ROW = CorePackage.TRANSFORMATION_DEFINITION__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOAN_TRANSFORMATION__COLUMN = CorePackage.TRANSFORMATION_DEFINITION__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOAN_TRANSFORMATION__FILE = CorePackage.TRANSFORMATION_DEFINITION__FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOAN_TRANSFORMATION__NAME = CorePackage.TRANSFORMATION_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Annotated With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOAN_TRANSFORMATION__ANNOTATED_WITH = CorePackage.TRANSFORMATION_DEFINITION__ANNOTATED_WITH;

	/**
	 * The feature id for the '<em><b>In Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOAN_TRANSFORMATION__IN_MODELS = CorePackage.TRANSFORMATION_DEFINITION__IN_MODELS;

	/**
	 * The feature id for the '<em><b>Out Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOAN_TRANSFORMATION__OUT_MODELS = CorePackage.TRANSFORMATION_DEFINITION__OUT_MODELS;

	/**
	 * The feature id for the '<em><b>Imported Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOAN_TRANSFORMATION__IMPORTED_MODELS = CorePackage.TRANSFORMATION_DEFINITION__IMPORTED_MODELS;

	/**
	 * The feature id for the '<em><b>Inline Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOAN_TRANSFORMATION__INLINE_MODELS = CorePackage.TRANSFORMATION_DEFINITION__INLINE_MODELS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOAN_TRANSFORMATION__ANNOTATIONS = CorePackage.TRANSFORMATION_DEFINITION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOAN_TRANSFORMATION__USES = CorePackage.TRANSFORMATION_DEFINITION__USES;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOAN_TRANSFORMATION__REQUIRES = CorePackage.TRANSFORMATION_DEFINITION__REQUIRES;

	/**
	 * The feature id for the '<em><b>Trace Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOAN_TRANSFORMATION__TRACE_INTERFACE = CorePackage.TRANSFORMATION_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOAN_TRANSFORMATION__RULES = CorePackage.TRANSFORMATION_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOAN_TRANSFORMATION_FEATURE_COUNT = CorePackage.TRANSFORMATION_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.koan.impl.KoanRuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.koan.impl.KoanRuleImpl
	 * @see org.eclectic.frontend.koan.impl.KoanPackageImpl#getKoanRule()
	 * @generated
	 */
	int KOAN_RULE = 1;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOAN_RULE__ROW = CorePackage.LOCATED_ELEMENT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOAN_RULE__COLUMN = CorePackage.LOCATED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOAN_RULE__FILE = CorePackage.LOCATED_ELEMENT__FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOAN_RULE__NAME = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Matcher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOAN_RULE__MATCHER = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOAN_RULE__STATEMENTS = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOAN_RULE_FEATURE_COUNT = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.koan.impl.MatcherImpl <em>Matcher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.koan.impl.MatcherImpl
	 * @see org.eclectic.frontend.koan.impl.KoanPackageImpl#getMatcher()
	 * @generated
	 */
	int MATCHER = 2;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHER__ROW = CorePackage.LOCATED_ELEMENT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHER__COLUMN = CorePackage.LOCATED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHER__FILE = CorePackage.LOCATED_ELEMENT__FILE;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHER__CHILD = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Matcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHER_FEATURE_COUNT = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.koan.impl.ForAllMatcherImpl <em>For All Matcher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.koan.impl.ForAllMatcherImpl
	 * @see org.eclectic.frontend.koan.impl.KoanPackageImpl#getForAllMatcher()
	 * @generated
	 */
	int FOR_ALL_MATCHER = 3;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_MATCHER__ROW = MATCHER__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_MATCHER__COLUMN = MATCHER__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_MATCHER__FILE = MATCHER__FILE;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_MATCHER__CHILD = MATCHER__CHILD;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_MATCHER__NAME = MATCHER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_MATCHER__TYPE = MATCHER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>For All Matcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_MATCHER_FEATURE_COUNT = MATCHER_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.koan.KoanTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see org.eclectic.frontend.koan.KoanTransformation
	 * @generated
	 */
	EClass getKoanTransformation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.koan.KoanTransformation#getTraceInterface <em>Trace Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trace Interface</em>'.
	 * @see org.eclectic.frontend.koan.KoanTransformation#getTraceInterface()
	 * @see #getKoanTransformation()
	 * @generated
	 */
	EReference getKoanTransformation_TraceInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.koan.KoanTransformation#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see org.eclectic.frontend.koan.KoanTransformation#getRules()
	 * @see #getKoanTransformation()
	 * @generated
	 */
	EReference getKoanTransformation_Rules();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.koan.KoanRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see org.eclectic.frontend.koan.KoanRule
	 * @generated
	 */
	EClass getKoanRule();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.koan.KoanRule#getMatcher <em>Matcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Matcher</em>'.
	 * @see org.eclectic.frontend.koan.KoanRule#getMatcher()
	 * @see #getKoanRule()
	 * @generated
	 */
	EReference getKoanRule_Matcher();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.koan.KoanRule#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see org.eclectic.frontend.koan.KoanRule#getStatements()
	 * @see #getKoanRule()
	 * @generated
	 */
	EReference getKoanRule_Statements();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.koan.Matcher <em>Matcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matcher</em>'.
	 * @see org.eclectic.frontend.koan.Matcher
	 * @generated
	 */
	EClass getMatcher();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.koan.Matcher#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child</em>'.
	 * @see org.eclectic.frontend.koan.Matcher#getChild()
	 * @see #getMatcher()
	 * @generated
	 */
	EReference getMatcher_Child();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.koan.ForAllMatcher <em>For All Matcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For All Matcher</em>'.
	 * @see org.eclectic.frontend.koan.ForAllMatcher
	 * @generated
	 */
	EClass getForAllMatcher();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.koan.ForAllMatcher#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.eclectic.frontend.koan.ForAllMatcher#getType()
	 * @see #getForAllMatcher()
	 * @generated
	 */
	EReference getForAllMatcher_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KoanFactory getKoanFactory();

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
		 * The meta object literal for the '{@link org.eclectic.frontend.koan.impl.KoanTransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.koan.impl.KoanTransformationImpl
		 * @see org.eclectic.frontend.koan.impl.KoanPackageImpl#getKoanTransformation()
		 * @generated
		 */
		EClass KOAN_TRANSFORMATION = eINSTANCE.getKoanTransformation();

		/**
		 * The meta object literal for the '<em><b>Trace Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KOAN_TRANSFORMATION__TRACE_INTERFACE = eINSTANCE.getKoanTransformation_TraceInterface();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KOAN_TRANSFORMATION__RULES = eINSTANCE.getKoanTransformation_Rules();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.koan.impl.KoanRuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.koan.impl.KoanRuleImpl
		 * @see org.eclectic.frontend.koan.impl.KoanPackageImpl#getKoanRule()
		 * @generated
		 */
		EClass KOAN_RULE = eINSTANCE.getKoanRule();

		/**
		 * The meta object literal for the '<em><b>Matcher</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KOAN_RULE__MATCHER = eINSTANCE.getKoanRule_Matcher();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KOAN_RULE__STATEMENTS = eINSTANCE.getKoanRule_Statements();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.koan.impl.MatcherImpl <em>Matcher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.koan.impl.MatcherImpl
		 * @see org.eclectic.frontend.koan.impl.KoanPackageImpl#getMatcher()
		 * @generated
		 */
		EClass MATCHER = eINSTANCE.getMatcher();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCHER__CHILD = eINSTANCE.getMatcher_Child();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.koan.impl.ForAllMatcherImpl <em>For All Matcher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.koan.impl.ForAllMatcherImpl
		 * @see org.eclectic.frontend.koan.impl.KoanPackageImpl#getForAllMatcher()
		 * @generated
		 */
		EClass FOR_ALL_MATCHER = eINSTANCE.getForAllMatcher();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_ALL_MATCHER__TYPE = eINSTANCE.getForAllMatcher_Type();

	}

} //KoanPackage
