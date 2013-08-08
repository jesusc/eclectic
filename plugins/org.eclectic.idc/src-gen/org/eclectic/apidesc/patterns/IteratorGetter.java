/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.apidesc.patterns;

import org.eclectic.apidesc.GetMechanism;
import org.eclectic.apidesc.Method;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iterator Getter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.apidesc.patterns.IteratorGetter#getGetIterator <em>Get Iterator</em>}</li>
 *   <li>{@link org.eclectic.apidesc.patterns.IteratorGetter#getIterator <em>Iterator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.apidesc.patterns.PatternsPackage#getIteratorGetter()
 * @model
 * @generated
 */
public interface IteratorGetter extends GetMechanism {

	/**
	 * Returns the value of the '<em><b>Get Iterator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Iterator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Iterator</em>' containment reference.
	 * @see #setGetIterator(Method)
	 * @see org.eclectic.apidesc.patterns.PatternsPackage#getIteratorGetter_GetIterator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Method getGetIterator();

	/**
	 * Sets the value of the '{@link org.eclectic.apidesc.patterns.IteratorGetter#getGetIterator <em>Get Iterator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Iterator</em>' containment reference.
	 * @see #getGetIterator()
	 * @generated
	 */
	void setGetIterator(Method value);

	/**
	 * Returns the value of the '<em><b>Iterator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iterator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterator</em>' reference.
	 * @see #setIterator(IteratorDescription)
	 * @see org.eclectic.apidesc.patterns.PatternsPackage#getIteratorGetter_Iterator()
	 * @model required="true"
	 * @generated
	 */
	IteratorDescription getIterator();

	/**
	 * Sets the value of the '{@link org.eclectic.apidesc.patterns.IteratorGetter#getIterator <em>Iterator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iterator</em>' reference.
	 * @see #getIterator()
	 * @generated
	 */
	void setIterator(IteratorDescription value);
} // IteratorGetter
