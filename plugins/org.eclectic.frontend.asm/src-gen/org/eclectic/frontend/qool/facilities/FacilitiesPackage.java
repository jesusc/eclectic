/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.qool.facilities;

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
 * @see org.eclectic.frontend.qool.facilities.FacilitiesFactory
 * @model kind="package"
 * @generated
 */
public interface FacilitiesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "facilities";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclectic.org/frontend/qoolL/facilities";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "qool_facilities";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FacilitiesPackage eINSTANCE = org.eclectic.frontend.qool.facilities.impl.FacilitiesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.qool.facilities.impl.CopierImpl <em>Copier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.qool.facilities.impl.CopierImpl
	 * @see org.eclectic.frontend.qool.facilities.impl.FacilitiesPackageImpl#getCopier()
	 * @generated
	 */
	int COPIER = 0;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPIER__ROW = CorePackage.EXPRESSION__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPIER__COLUMN = CorePackage.EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPIER__FILE = CorePackage.EXPRESSION__FILE;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPIER__OBJECTS = CorePackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Callbacks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPIER__CALLBACKS = CorePackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Copy In Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPIER__COPY_IN_MODEL = CorePackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Copier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPIER_FEATURE_COUNT = CorePackage.EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.qool.facilities.impl.CopierCallbackDefinitionImpl <em>Copier Callback Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.qool.facilities.impl.CopierCallbackDefinitionImpl
	 * @see org.eclectic.frontend.qool.facilities.impl.FacilitiesPackageImpl#getCopierCallbackDefinition()
	 * @generated
	 */
	int COPIER_CALLBACK_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPIER_CALLBACK_DEFINITION__STOP = 0;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPIER_CALLBACK_DEFINITION__TRIGGER = 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPIER_CALLBACK_DEFINITION__ACTION = 2;

	/**
	 * The number of structural features of the '<em>Copier Callback Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPIER_CALLBACK_DEFINITION_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.qool.facilities.Copier <em>Copier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Copier</em>'.
	 * @see org.eclectic.frontend.qool.facilities.Copier
	 * @generated
	 */
	EClass getCopier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.qool.facilities.Copier#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objects</em>'.
	 * @see org.eclectic.frontend.qool.facilities.Copier#getObjects()
	 * @see #getCopier()
	 * @generated
	 */
	EReference getCopier_Objects();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.qool.facilities.Copier#getCallbacks <em>Callbacks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Callbacks</em>'.
	 * @see org.eclectic.frontend.qool.facilities.Copier#getCallbacks()
	 * @see #getCopier()
	 * @generated
	 */
	EReference getCopier_Callbacks();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.frontend.qool.facilities.Copier#getCopyInModel <em>Copy In Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Copy In Model</em>'.
	 * @see org.eclectic.frontend.qool.facilities.Copier#getCopyInModel()
	 * @see #getCopier()
	 * @generated
	 */
	EReference getCopier_CopyInModel();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.qool.facilities.CopierCallbackDefinition <em>Copier Callback Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Copier Callback Definition</em>'.
	 * @see org.eclectic.frontend.qool.facilities.CopierCallbackDefinition
	 * @generated
	 */
	EClass getCopierCallbackDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.qool.facilities.CopierCallbackDefinition#isStop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop</em>'.
	 * @see org.eclectic.frontend.qool.facilities.CopierCallbackDefinition#isStop()
	 * @see #getCopierCallbackDefinition()
	 * @generated
	 */
	EAttribute getCopierCallbackDefinition_Stop();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.qool.facilities.CopierCallbackDefinition#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trigger</em>'.
	 * @see org.eclectic.frontend.qool.facilities.CopierCallbackDefinition#getTrigger()
	 * @see #getCopierCallbackDefinition()
	 * @generated
	 */
	EReference getCopierCallbackDefinition_Trigger();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.qool.facilities.CopierCallbackDefinition#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see org.eclectic.frontend.qool.facilities.CopierCallbackDefinition#getAction()
	 * @see #getCopierCallbackDefinition()
	 * @generated
	 */
	EReference getCopierCallbackDefinition_Action();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FacilitiesFactory getFacilitiesFactory();

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
		 * The meta object literal for the '{@link org.eclectic.frontend.qool.facilities.impl.CopierImpl <em>Copier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.qool.facilities.impl.CopierImpl
		 * @see org.eclectic.frontend.qool.facilities.impl.FacilitiesPackageImpl#getCopier()
		 * @generated
		 */
		EClass COPIER = eINSTANCE.getCopier();

		/**
		 * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COPIER__OBJECTS = eINSTANCE.getCopier_Objects();

		/**
		 * The meta object literal for the '<em><b>Callbacks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COPIER__CALLBACKS = eINSTANCE.getCopier_Callbacks();

		/**
		 * The meta object literal for the '<em><b>Copy In Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COPIER__COPY_IN_MODEL = eINSTANCE.getCopier_CopyInModel();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.qool.facilities.impl.CopierCallbackDefinitionImpl <em>Copier Callback Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.qool.facilities.impl.CopierCallbackDefinitionImpl
		 * @see org.eclectic.frontend.qool.facilities.impl.FacilitiesPackageImpl#getCopierCallbackDefinition()
		 * @generated
		 */
		EClass COPIER_CALLBACK_DEFINITION = eINSTANCE.getCopierCallbackDefinition();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPIER_CALLBACK_DEFINITION__STOP = eINSTANCE.getCopierCallbackDefinition_Stop();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COPIER_CALLBACK_DEFINITION__TRIGGER = eINSTANCE.getCopierCallbackDefinition_Trigger();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COPIER_CALLBACK_DEFINITION__ACTION = eINSTANCE.getCopierCallbackDefinition_Action();

	}

} //FacilitiesPackage
