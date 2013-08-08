/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.streamdesc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclectic.streamdesc.StreamdescPackage
 * @generated
 */
public interface StreamdescFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StreamdescFactory eINSTANCE = org.eclectic.streamdesc.impl.StreamdescFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Stream Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stream Description</em>'.
	 * @generated
	 */
	StreamDescription createStreamDescription();

	/**
	 * Returns a new object of class '<em>Element Sliding Window</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Sliding Window</em>'.
	 * @generated
	 */
	ElementSlidingWindow createElementSlidingWindow();

	/**
	 * Returns a new object of class '<em>Time Sliding Window</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Sliding Window</em>'.
	 * @generated
	 */
	TimeSlidingWindow createTimeSlidingWindow();

	/**
	 * Returns a new object of class '<em>Key Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Spec</em>'.
	 * @generated
	 */
	KeySpec createKeySpec();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StreamdescPackage getStreamdescPackage();

} //StreamdescFactory
