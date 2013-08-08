/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.qool;

import org.eclectic.frontend.core.Expression;
import org.eclectic.frontend.core.Statement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.qool.MatchExpression#getQueue <em>Queue</em>}</li>
 *   <li>{@link org.eclectic.frontend.qool.MatchExpression#getPredicates <em>Predicates</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.qool.QoolPackage#getMatchExpression()
 * @model
 * @generated
 */
public interface MatchExpression extends Expression {
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
	 * @see org.eclectic.frontend.qool.QoolPackage#getMatchExpression_Queue()
	 * @model required="true"
	 * @generated
	 */
	QoolQueue getQueue();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.qool.MatchExpression#getQueue <em>Queue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue</em>' reference.
	 * @see #getQueue()
	 * @generated
	 */
	void setQueue(QoolQueue value);

	/**
	 * Returns the value of the '<em><b>Predicates</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.qool.MatchPredicate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicates</em>' containment reference list.
	 * @see org.eclectic.frontend.qool.QoolPackage#getMatchExpression_Predicates()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MatchPredicate> getPredicates();

} // MatchExpression
