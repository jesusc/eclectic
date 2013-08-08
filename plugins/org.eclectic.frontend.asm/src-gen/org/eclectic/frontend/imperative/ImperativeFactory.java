/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.imperative;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclectic.frontend.imperative.ImperativePackage
 * @generated
 */
public interface ImperativeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImperativeFactory eINSTANCE = org.eclectic.frontend.imperative.impl.ImperativeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation</em>'.
	 * @generated
	 */
	ImperativeTransformation createImperativeTransformation();

	/**
	 * Returns a new object of class '<em>Method Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Definition</em>'.
	 * @generated
	 */
	MethodDefinition createMethodDefinition();

	/**
	 * Returns a new object of class '<em>Method Self</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Self</em>'.
	 * @generated
	 */
	MethodSelf createMethodSelf();

	/**
	 * Returns a new object of class '<em>Method Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Parameter</em>'.
	 * @generated
	 */
	MethodParameter createMethodParameter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ImperativePackage getImperativePackage();

} //ImperativeFactory
