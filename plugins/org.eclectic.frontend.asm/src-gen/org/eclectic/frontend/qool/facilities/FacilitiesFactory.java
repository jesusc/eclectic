/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.qool.facilities;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclectic.frontend.qool.facilities.FacilitiesPackage
 * @generated
 */
public interface FacilitiesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FacilitiesFactory eINSTANCE = org.eclectic.frontend.qool.facilities.impl.FacilitiesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Copier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Copier</em>'.
	 * @generated
	 */
	Copier createCopier();

	/**
	 * Returns a new object of class '<em>Copier Callback Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Copier Callback Definition</em>'.
	 * @generated
	 */
	CopierCallbackDefinition createCopierCallbackDefinition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FacilitiesPackage getFacilitiesPackage();

} //FacilitiesFactory
