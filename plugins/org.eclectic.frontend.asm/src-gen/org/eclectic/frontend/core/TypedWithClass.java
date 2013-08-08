/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed With Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.core.TypedWithClass#getType_ <em>Type </em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.core.CorePackage#getTypedWithClass()
 * @model abstract="true"
 * @generated
 */
public interface TypedWithClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Type </b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type </em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type </em>' containment reference.
	 * @see #setType_(ClassUse)
	 * @see org.eclectic.frontend.core.CorePackage#getTypedWithClass_Type_()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ClassUse getType_();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.core.TypedWithClass#getType_ <em>Type </em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type </em>' containment reference.
	 * @see #getType_()
	 * @generated
	 */
	void setType_(ClassUse value);

} // TypedWithClass
