/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclectic.frontend.FrontendPackage
 * @generated
 */
public interface FrontendFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FrontendFactory eINSTANCE = org.eclectic.frontend.impl.FrontendFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dummy Root Metaclass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dummy Root Metaclass</em>'.
	 * @generated
	 */
	DummyRootMetaclass createDummyRootMetaclass();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FrontendPackage getFrontendPackage();

} //FrontendFactory
