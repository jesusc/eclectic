/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.qool;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QFor All</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.qool.QForAll#getQueue <em>Queue</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.qool.QoolPackage#getQForAll()
 * @model
 * @generated
 */
public interface QForAll extends QIterator {
	/**
	 * Returns the value of the '<em><b>Queue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queue</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue</em>' reference.
	 * @see #setQueue(Queue)
	 * @see org.eclectic.idc.qool.QoolPackage#getQForAll_Queue()
	 * @model required="true"
	 * @generated
	 */
	Queue getQueue();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.qool.QForAll#getQueue <em>Queue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue</em>' reference.
	 * @see #getQueue()
	 * @generated
	 */
	void setQueue(Queue value);

} // QForAll
