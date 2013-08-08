/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc;

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
 * @see org.eclectic.idc.IdcFactory
 * @model kind="package"
 * @generated
 */
public interface IdcPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "idc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclectic.org/idc";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "idc_ast";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IdcPackage eINSTANCE = org.eclectic.idc.impl.IdcPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclectic.idc.impl.DummyToCreateAPackageImpl <em>Dummy To Create APackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.impl.DummyToCreateAPackageImpl
	 * @see org.eclectic.idc.impl.IdcPackageImpl#getDummyToCreateAPackage()
	 * @generated
	 */
	int DUMMY_TO_CREATE_APACKAGE = 0;

	/**
	 * The number of structural features of the '<em>Dummy To Create APackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUMMY_TO_CREATE_APACKAGE_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.DummyToCreateAPackage <em>Dummy To Create APackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dummy To Create APackage</em>'.
	 * @see org.eclectic.idc.DummyToCreateAPackage
	 * @generated
	 */
	EClass getDummyToCreateAPackage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IdcFactory getIdcFactory();

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
		 * The meta object literal for the '{@link org.eclectic.idc.impl.DummyToCreateAPackageImpl <em>Dummy To Create APackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.impl.DummyToCreateAPackageImpl
		 * @see org.eclectic.idc.impl.IdcPackageImpl#getDummyToCreateAPackage()
		 * @generated
		 */
		EClass DUMMY_TO_CREATE_APACKAGE = eINSTANCE.getDummyToCreateAPackage();

	}

} //IdcPackage
