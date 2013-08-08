/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.attribution;

import org.eclectic.frontend.core.ClassUse;
import org.eclectic.frontend.core.Expression;
import org.eclectic.frontend.core.LocatedElement;
import org.eclectic.frontend.core.Statement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.attribution.AttributionRule#getType <em>Type</em>}</li>
 *   <li>{@link org.eclectic.frontend.attribution.AttributionRule#getSelf <em>Self</em>}</li>
 *   <li>{@link org.eclectic.frontend.attribution.AttributionRule#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclectic.frontend.attribution.AttributionRule#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.attribution.AttributionPackage#getAttributionRule()
 * @model
 * @generated
 */
public interface AttributionRule extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(ClassUse)
	 * @see org.eclectic.frontend.attribution.AttributionPackage#getAttributionRule_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ClassUse getType();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.attribution.AttributionRule#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ClassUse value);

	/**
	 * Returns the value of the '<em><b>Self</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Self</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Self</em>' containment reference.
	 * @see #setSelf(RuleSelf)
	 * @see org.eclectic.frontend.attribution.AttributionPackage#getAttributionRule_Self()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RuleSelf getSelf();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.attribution.AttributionRule#getSelf <em>Self</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Self</em>' containment reference.
	 * @see #getSelf()
	 * @generated
	 */
	void setSelf(RuleSelf value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Expression)
	 * @see org.eclectic.frontend.attribution.AttributionPackage#getAttributionRule_Condition()
	 * @model containment="true"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.attribution.AttributionRule#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.core.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see org.eclectic.frontend.attribution.AttributionPackage#getAttributionRule_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatements();

} // AttributionRule
