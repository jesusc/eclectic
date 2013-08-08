/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.qool;

import org.eclectic.frontend.core.TypeExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Queue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.qool.LocalQueue#getType_ <em>Type </em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.qool.QoolPackage#getLocalQueue()
 * @model
 * @generated
 */
public interface LocalQueue extends QoolQueue {
	/**
	 * Returns the value of the '<em><b>Type </b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type </em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type </em>' containment reference.
	 * @see #setType_(TypeExpression)
	 * @see org.eclectic.frontend.qool.QoolPackage#getLocalQueue_Type_()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TypeExpression getType_();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.qool.LocalQueue#getType_ <em>Type </em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type </em>' containment reference.
	 * @see #getType_()
	 * @generated
	 */
	void setType_(TypeExpression value);

} // LocalQueue
