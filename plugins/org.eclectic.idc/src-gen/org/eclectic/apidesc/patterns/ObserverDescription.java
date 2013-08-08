/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.apidesc.patterns;

import org.eclectic.apidesc.DeclaredElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observer Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.apidesc.patterns.ObserverDescription#getObserverClass <em>Observer Class</em>}</li>
 *   <li>{@link org.eclectic.apidesc.patterns.ObserverDescription#getUpdateMethods <em>Update Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.apidesc.patterns.PatternsPackage#getObserverDescription()
 * @model
 * @generated
 */
public interface ObserverDescription extends DeclaredElement {
	/**
	 * Returns the value of the '<em><b>Observer Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observer Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observer Class</em>' attribute.
	 * @see #setObserverClass(String)
	 * @see org.eclectic.apidesc.patterns.PatternsPackage#getObserverDescription_ObserverClass()
	 * @model
	 * @generated
	 */
	String getObserverClass();

	/**
	 * Sets the value of the '{@link org.eclectic.apidesc.patterns.ObserverDescription#getObserverClass <em>Observer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observer Class</em>' attribute.
	 * @see #getObserverClass()
	 * @generated
	 */
	void setObserverClass(String value);

	/**
	 * Returns the value of the '<em><b>Update Methods</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.apidesc.patterns.UpdateMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Methods</em>' containment reference list.
	 * @see org.eclectic.apidesc.patterns.PatternsPackage#getObserverDescription_UpdateMethods()
	 * @model containment="true"
	 * @generated
	 */
	EList<UpdateMethod> getUpdateMethods();

} // ObserverDescription
