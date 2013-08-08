/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.apidesc.patterns;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclectic.apidesc.patterns.PatternsPackage
 * @generated
 */
public interface PatternsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PatternsFactory eINSTANCE = org.eclectic.apidesc.patterns.impl.PatternsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Iterator Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iterator Description</em>'.
	 * @generated
	 */
	IteratorDescription createIteratorDescription();

	/**
	 * Returns a new object of class '<em>Iterator Getter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iterator Getter</em>'.
	 * @generated
	 */
	IteratorGetter createIteratorGetter();

	/**
	 * Returns a new object of class '<em>Observer Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Observer Description</em>'.
	 * @generated
	 */
	ObserverDescription createObserverDescription();

	/**
	 * Returns a new object of class '<em>Update Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Method</em>'.
	 * @generated
	 */
	UpdateMethod createUpdateMethod();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PatternsPackage getPatternsPackage();

} //PatternsFactory
