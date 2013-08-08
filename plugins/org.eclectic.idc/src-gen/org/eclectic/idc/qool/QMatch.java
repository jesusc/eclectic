/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.qool;

import org.eclectic.idc.instr.ClosureDef;
import org.eclectic.idc.instr.InstructionWithResult;
import org.eclectic.idc.core.Instruction;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QMatch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.qool.QMatch#getQueue <em>Queue</em>}</li>
 *   <li>{@link org.eclectic.idc.qool.QMatch#getPredicates <em>Predicates</em>}</li>
 *   <li>{@link org.eclectic.idc.qool.QMatch#getGetterClosure <em>Getter Closure</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.qool.QoolPackage#getQMatch()
 * @model
 * @generated
 */
public interface QMatch extends InstructionWithResult {
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
	 * @see org.eclectic.idc.qool.QoolPackage#getQMatch_Queue()
	 * @model required="true"
	 * @generated
	 */
	Queue getQueue();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.qool.QMatch#getQueue <em>Queue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue</em>' reference.
	 * @see #getQueue()
	 * @generated
	 */
	void setQueue(Queue value);

	/**
	 * Returns the value of the '<em><b>Predicates</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.idc.qool.QMatchPredicate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicates</em>' containment reference list.
	 * @see org.eclectic.idc.qool.QoolPackage#getQMatch_Predicates()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<QMatchPredicate> getPredicates();

	/**
	 * Returns the value of the '<em><b>Getter Closure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Getter Closure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Getter Closure</em>' reference.
	 * @see #setGetterClosure(ClosureDef)
	 * @see org.eclectic.idc.qool.QoolPackage#getQMatch_GetterClosure()
	 * @model
	 * @generated
	 */
	ClosureDef getGetterClosure();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.qool.QMatch#getGetterClosure <em>Getter Closure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Getter Closure</em>' reference.
	 * @see #getGetterClosure()
	 * @generated
	 */
	void setGetterClosure(ClosureDef value);

} // QMatch
