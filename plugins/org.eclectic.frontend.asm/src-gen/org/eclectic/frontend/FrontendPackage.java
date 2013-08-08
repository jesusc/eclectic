/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.eclectic.frontend.FrontendFactory
 * @model kind="package"
 * @generated
 */
public interface FrontendPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "frontend";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclectic.org/frontend";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "frontend";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FrontendPackage eINSTANCE = org.eclectic.frontend.impl.FrontendPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.impl.DummyRootMetaclassImpl <em>Dummy Root Metaclass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.impl.DummyRootMetaclassImpl
	 * @see org.eclectic.frontend.impl.FrontendPackageImpl#getDummyRootMetaclass()
	 * @generated
	 */
	int DUMMY_ROOT_METACLASS = 0;

	/**
	 * The number of structural features of the '<em>Dummy Root Metaclass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_ROOT_METACLASS_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.DummyRootMetaclass <em>Dummy Root Metaclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dummy Root Metaclass</em>'.
	 * @see org.eclectic.frontend.DummyRootMetaclass
	 * @generated
	 */
	EClass getDummyRootMetaclass();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FrontendFactory getFrontendFactory();

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
		 * The meta object literal for the '{@link org.eclectic.frontend.impl.DummyRootMetaclassImpl <em>Dummy Root Metaclass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.impl.DummyRootMetaclassImpl
		 * @see org.eclectic.frontend.impl.FrontendPackageImpl#getDummyRootMetaclass()
		 * @generated
		 */
		EClass DUMMY_ROOT_METACLASS = eINSTANCE.getDummyRootMetaclass();

	}

} //FrontendPackage
