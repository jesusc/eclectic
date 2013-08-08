/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.apidesc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.apidesc.SimpleSet#getSetter <em>Setter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.apidesc.ApidescPackage#getSimpleSet()
 * @model
 * @generated
 */
public interface SimpleSet extends SetMechanism {
	/**
	 * Returns the value of the '<em><b>Setter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setter</em>' containment reference.
	 * @see #setSetter(Method)
	 * @see org.eclectic.apidesc.ApidescPackage#getSimpleSet_Setter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Method getSetter();

	/**
	 * Sets the value of the '{@link org.eclectic.apidesc.SimpleSet#getSetter <em>Setter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setter</em>' containment reference.
	 * @see #getSetter()
	 * @generated
	 */
	void setSetter(Method value);

} // SimpleSet
