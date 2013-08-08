/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.qool;

import org.eclectic.idc.core.TypeInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Queue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.qool.LocalQueue#getType_ <em>Type </em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.qool.QoolPackage#getLocalQueue()
 * @model
 * @generated
 */
public interface LocalQueue extends Queue {
	/**
	 * Returns the value of the '<em><b>Type </b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type </em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type </em>' containment reference.
	 * @see #setType_(TypeInfo)
	 * @see org.eclectic.idc.qool.QoolPackage#getLocalQueue_Type_()
	 * @model containment="true"
	 * @generated
	 */
	TypeInfo getType_();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.qool.LocalQueue#getType_ <em>Type </em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type </em>' containment reference.
	 * @see #getType_()
	 * @generated
	 */
	void setType_(TypeInfo value);

} // LocalQueue
