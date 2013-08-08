/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.apidesc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Get</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.apidesc.SimpleGet#getDebugName <em>Debug Name</em>}</li>
 *   <li>{@link org.eclectic.apidesc.SimpleGet#getGetter <em>Getter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.apidesc.ApidescPackage#getSimpleGet()
 * @model
 * @generated
 */
public interface SimpleGet extends GetMechanism {
	/**
	 * Returns the value of the '<em><b>Debug Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debug Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debug Name</em>' attribute.
	 * @see #setDebugName(String)
	 * @see org.eclectic.apidesc.ApidescPackage#getSimpleGet_DebugName()
	 * @model
	 * @generated
	 */
	String getDebugName();

	/**
	 * Sets the value of the '{@link org.eclectic.apidesc.SimpleGet#getDebugName <em>Debug Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debug Name</em>' attribute.
	 * @see #getDebugName()
	 * @generated
	 */
	void setDebugName(String value);

	/**
	 * Returns the value of the '<em><b>Getter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Getter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Getter</em>' containment reference.
	 * @see #setGetter(Method)
	 * @see org.eclectic.apidesc.ApidescPackage#getSimpleGet_Getter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Method getGetter();

	/**
	 * Sets the value of the '{@link org.eclectic.apidesc.SimpleGet#getGetter <em>Getter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Getter</em>' containment reference.
	 * @see #getGetter()
	 * @generated
	 */
	void setGetter(Method value);

} // SimpleGet
