/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.extensions;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see org.eclectic.idc.extensions.ExtensionsFactory
 * @model kind="package"
 * @generated
 */
public interface ExtensionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "extensions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclectic.org/idc/extensions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "idc_ast_extensions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExtensionsPackage eINSTANCE = org.eclectic.idc.extensions.impl.ExtensionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclectic.idc.extensions.impl.ExtensionImpl <em>Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.extensions.impl.ExtensionImpl
	 * @see org.eclectic.idc.extensions.impl.ExtensionsPackageImpl#getExtension()
	 * @generated
	 */
	int EXTENSION = 0;

	/**
	 * The number of structural features of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.extensions.impl.PotencyExtensionImpl <em>Potency Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.extensions.impl.PotencyExtensionImpl
	 * @see org.eclectic.idc.extensions.impl.ExtensionsPackageImpl#getPotencyExtension()
	 * @generated
	 */
	int POTENCY_EXTENSION = 1;

	/**
	 * The feature id for the '<em><b>Potency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENCY_EXTENSION__POTENCY = EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Potency Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENCY_EXTENSION_FEATURE_COUNT = EXTENSION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.extensions.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension</em>'.
	 * @see org.eclectic.idc.extensions.Extension
	 * @generated
	 */
	EClass getExtension();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.extensions.PotencyExtension <em>Potency Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Potency Extension</em>'.
	 * @see org.eclectic.idc.extensions.PotencyExtension
	 * @generated
	 */
	EClass getPotencyExtension();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.extensions.PotencyExtension#getPotency <em>Potency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Potency</em>'.
	 * @see org.eclectic.idc.extensions.PotencyExtension#getPotency()
	 * @see #getPotencyExtension()
	 * @generated
	 */
	EAttribute getPotencyExtension_Potency();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExtensionsFactory getExtensionsFactory();

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
		 * The meta object literal for the '{@link org.eclectic.idc.extensions.impl.ExtensionImpl <em>Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.extensions.impl.ExtensionImpl
		 * @see org.eclectic.idc.extensions.impl.ExtensionsPackageImpl#getExtension()
		 * @generated
		 */
		EClass EXTENSION = eINSTANCE.getExtension();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.extensions.impl.PotencyExtensionImpl <em>Potency Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.extensions.impl.PotencyExtensionImpl
		 * @see org.eclectic.idc.extensions.impl.ExtensionsPackageImpl#getPotencyExtension()
		 * @generated
		 */
		EClass POTENCY_EXTENSION = eINSTANCE.getPotencyExtension();

		/**
		 * The meta object literal for the '<em><b>Potency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POTENCY_EXTENSION__POTENCY = eINSTANCE.getPotencyExtension_Potency();

	}

} //ExtensionsPackage
