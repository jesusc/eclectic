/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.koan;

import org.eclectic.frontend.core.LocatedElement;
import org.eclectic.frontend.core.NamedElement;
import org.eclectic.frontend.core.Statement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.koan.KoanRule#getMatcher <em>Matcher</em>}</li>
 *   <li>{@link org.eclectic.frontend.koan.KoanRule#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.koan.KoanPackage#getKoanRule()
 * @model
 * @generated
 */
public interface KoanRule extends LocatedElement, NamedElement {
	/**
	 * Returns the value of the '<em><b>Matcher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matcher</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matcher</em>' containment reference.
	 * @see #setMatcher(Matcher)
	 * @see org.eclectic.frontend.koan.KoanPackage#getKoanRule_Matcher()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Matcher getMatcher();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.koan.KoanRule#getMatcher <em>Matcher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matcher</em>' containment reference.
	 * @see #getMatcher()
	 * @generated
	 */
	void setMatcher(Matcher value);

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
	 * @see org.eclectic.frontend.koan.KoanPackage#getKoanRule_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatements();

} // KoanRule
