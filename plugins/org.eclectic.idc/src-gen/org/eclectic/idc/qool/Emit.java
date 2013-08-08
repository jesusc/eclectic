/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.qool;

import org.eclectic.idc.core.Instruction;
import org.eclectic.idc.core.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.qool.Emit#getQueue <em>Queue</em>}</li>
 *   <li>{@link org.eclectic.idc.qool.Emit#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.qool.QoolPackage#getEmit()
 * @model
 * @generated
 */
public interface Emit extends Instruction {
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
	 * @see org.eclectic.idc.qool.QoolPackage#getEmit_Queue()
	 * @model required="true"
	 * @generated
	 */
	Queue getQueue();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.qool.Emit#getQueue <em>Queue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue</em>' reference.
	 * @see #getQueue()
	 * @generated
	 */
	void setQueue(Queue value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(Variable)
	 * @see org.eclectic.idc.qool.QoolPackage#getEmit_Value()
	 * @model required="true"
	 * @generated
	 */
	Variable getValue();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.qool.Emit#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Variable value);

} // Emit
