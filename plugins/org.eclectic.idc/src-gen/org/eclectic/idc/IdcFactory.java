/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclectic.idc.IdcPackage
 * @generated
 */
public interface IdcFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IdcFactory eINSTANCE = org.eclectic.idc.impl.IdcFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dummy To Create APackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dummy To Create APackage</em>'.
	 * @generated
	 */
	DummyToCreateAPackage createDummyToCreateAPackage();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IdcPackage getIdcPackage();

} //IdcFactory
