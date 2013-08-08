/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.qool;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For All Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.qool.ForAllStatement#getQueue <em>Queue</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.qool.QoolPackage#getForAllStatement()
 * @model
 * @generated
 */
public interface ForAllStatement extends IteratorStatement {
	/**
	 * Returns the value of the '<em><b>Queue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queue</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue</em>' reference.
	 * @see #setQueue(QoolQueue)
	 * @see org.eclectic.frontend.qool.QoolPackage#getForAllStatement_Queue()
	 * @model required="true"
	 * @generated
	 */
	QoolQueue getQueue();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.qool.ForAllStatement#getQueue <em>Queue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue</em>' reference.
	 * @see #getQueue()
	 * @generated
	 */
	void setQueue(QoolQueue value);

} // ForAllStatement
