/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.imperative;

import org.eclectic.frontend.core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see org.eclectic.frontend.imperative.ImperativeFactory
 * @model kind="package"
 * @generated
 */
public interface ImperativePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "imperative";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclectic.org/frontend/imperativeL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ec_frontend_imperativeL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImperativePackage eINSTANCE = org.eclectic.frontend.imperative.impl.ImperativePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.imperative.impl.ImperativeTransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.imperative.impl.ImperativeTransformationImpl
	 * @see org.eclectic.frontend.imperative.impl.ImperativePackageImpl#getImperativeTransformation()
	 * @generated
	 */
	int IMPERATIVE_TRANSFORMATION = 0;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_TRANSFORMATION__ROW = CorePackage.TRANSFORMATION_DEFINITION__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_TRANSFORMATION__COLUMN = CorePackage.TRANSFORMATION_DEFINITION__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_TRANSFORMATION__FILE = CorePackage.TRANSFORMATION_DEFINITION__FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_TRANSFORMATION__NAME = CorePackage.TRANSFORMATION_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Annotated With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_TRANSFORMATION__ANNOTATED_WITH = CorePackage.TRANSFORMATION_DEFINITION__ANNOTATED_WITH;

	/**
	 * The feature id for the '<em><b>In Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_TRANSFORMATION__IN_MODELS = CorePackage.TRANSFORMATION_DEFINITION__IN_MODELS;

	/**
	 * The feature id for the '<em><b>Out Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_TRANSFORMATION__OUT_MODELS = CorePackage.TRANSFORMATION_DEFINITION__OUT_MODELS;

	/**
	 * The feature id for the '<em><b>Imported Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_TRANSFORMATION__IMPORTED_MODELS = CorePackage.TRANSFORMATION_DEFINITION__IMPORTED_MODELS;

	/**
	 * The feature id for the '<em><b>Inline Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_TRANSFORMATION__INLINE_MODELS = CorePackage.TRANSFORMATION_DEFINITION__INLINE_MODELS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_TRANSFORMATION__ANNOTATIONS = CorePackage.TRANSFORMATION_DEFINITION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_TRANSFORMATION__USES = CorePackage.TRANSFORMATION_DEFINITION__USES;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_TRANSFORMATION__REQUIRES = CorePackage.TRANSFORMATION_DEFINITION__REQUIRES;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_TRANSFORMATION__METHODS = CorePackage.TRANSFORMATION_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_TRANSFORMATION_FEATURE_COUNT = CorePackage.TRANSFORMATION_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.imperative.impl.MethodDefinitionImpl <em>Method Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.imperative.impl.MethodDefinitionImpl
	 * @see org.eclectic.frontend.imperative.impl.ImperativePackageImpl#getMethodDefinition()
	 * @generated
	 */
	int METHOD_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION__ROW = CorePackage.LOCATED_ELEMENT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION__COLUMN = CorePackage.LOCATED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION__FILE = CorePackage.LOCATED_ELEMENT__FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION__NAME = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Formal Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION__FORMAL_PARAMETERS = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Self</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION__SELF = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION__TYPE = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION__STATEMENTS = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Method Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_DEFINITION_FEATURE_COUNT = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.imperative.impl.MethodSelfImpl <em>Method Self</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.imperative.impl.MethodSelfImpl
	 * @see org.eclectic.frontend.imperative.impl.ImperativePackageImpl#getMethodSelf()
	 * @generated
	 */
	int METHOD_SELF = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SELF__NAME = CorePackage.VARIABLE__NAME;

	/**
	 * The number of structural features of the '<em>Method Self</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_SELF_FEATURE_COUNT = CorePackage.VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.imperative.impl.MethodParameterImpl <em>Method Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.imperative.impl.MethodParameterImpl
	 * @see org.eclectic.frontend.imperative.impl.ImperativePackageImpl#getMethodParameter()
	 * @generated
	 */
	int METHOD_PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER__NAME = CorePackage.VARIABLE__NAME;

	/**
	 * The number of structural features of the '<em>Method Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER_FEATURE_COUNT = CorePackage.VARIABLE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.imperative.ImperativeTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see org.eclectic.frontend.imperative.ImperativeTransformation
	 * @generated
	 */
	EClass getImperativeTransformation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.imperative.ImperativeTransformation#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see org.eclectic.frontend.imperative.ImperativeTransformation#getMethods()
	 * @see #getImperativeTransformation()
	 * @generated
	 */
	EReference getImperativeTransformation_Methods();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.imperative.MethodDefinition <em>Method Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Definition</em>'.
	 * @see org.eclectic.frontend.imperative.MethodDefinition
	 * @generated
	 */
	EClass getMethodDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.imperative.MethodDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclectic.frontend.imperative.MethodDefinition#getName()
	 * @see #getMethodDefinition()
	 * @generated
	 */
	EAttribute getMethodDefinition_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.imperative.MethodDefinition#getFormalParameters <em>Formal Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formal Parameters</em>'.
	 * @see org.eclectic.frontend.imperative.MethodDefinition#getFormalParameters()
	 * @see #getMethodDefinition()
	 * @generated
	 */
	EReference getMethodDefinition_FormalParameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.imperative.MethodDefinition#getSelf <em>Self</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Self</em>'.
	 * @see org.eclectic.frontend.imperative.MethodDefinition#getSelf()
	 * @see #getMethodDefinition()
	 * @generated
	 */
	EReference getMethodDefinition_Self();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.imperative.MethodDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.eclectic.frontend.imperative.MethodDefinition#getType()
	 * @see #getMethodDefinition()
	 * @generated
	 */
	EReference getMethodDefinition_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.imperative.MethodDefinition#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see org.eclectic.frontend.imperative.MethodDefinition#getStatements()
	 * @see #getMethodDefinition()
	 * @generated
	 */
	EReference getMethodDefinition_Statements();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.imperative.MethodSelf <em>Method Self</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Self</em>'.
	 * @see org.eclectic.frontend.imperative.MethodSelf
	 * @generated
	 */
	EClass getMethodSelf();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.imperative.MethodParameter <em>Method Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Parameter</em>'.
	 * @see org.eclectic.frontend.imperative.MethodParameter
	 * @generated
	 */
	EClass getMethodParameter();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ImperativeFactory getImperativeFactory();

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
		 * The meta object literal for the '{@link org.eclectic.frontend.imperative.impl.ImperativeTransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.imperative.impl.ImperativeTransformationImpl
		 * @see org.eclectic.frontend.imperative.impl.ImperativePackageImpl#getImperativeTransformation()
		 * @generated
		 */
		EClass IMPERATIVE_TRANSFORMATION = eINSTANCE.getImperativeTransformation();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPERATIVE_TRANSFORMATION__METHODS = eINSTANCE.getImperativeTransformation_Methods();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.imperative.impl.MethodDefinitionImpl <em>Method Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.imperative.impl.MethodDefinitionImpl
		 * @see org.eclectic.frontend.imperative.impl.ImperativePackageImpl#getMethodDefinition()
		 * @generated
		 */
		EClass METHOD_DEFINITION = eINSTANCE.getMethodDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_DEFINITION__NAME = eINSTANCE.getMethodDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Formal Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_DEFINITION__FORMAL_PARAMETERS = eINSTANCE.getMethodDefinition_FormalParameters();

		/**
		 * The meta object literal for the '<em><b>Self</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_DEFINITION__SELF = eINSTANCE.getMethodDefinition_Self();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_DEFINITION__TYPE = eINSTANCE.getMethodDefinition_Type();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_DEFINITION__STATEMENTS = eINSTANCE.getMethodDefinition_Statements();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.imperative.impl.MethodSelfImpl <em>Method Self</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.imperative.impl.MethodSelfImpl
		 * @see org.eclectic.frontend.imperative.impl.ImperativePackageImpl#getMethodSelf()
		 * @generated
		 */
		EClass METHOD_SELF = eINSTANCE.getMethodSelf();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.imperative.impl.MethodParameterImpl <em>Method Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.imperative.impl.MethodParameterImpl
		 * @see org.eclectic.frontend.imperative.impl.ImperativePackageImpl#getMethodParameter()
		 * @generated
		 */
		EClass METHOD_PARAMETER = eINSTANCE.getMethodParameter();

	}

} //ImperativePackage
