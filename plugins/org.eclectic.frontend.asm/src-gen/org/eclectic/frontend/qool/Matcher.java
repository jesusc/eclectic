/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.qool;

import org.eclectic.frontend.core.LocatedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matcher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.qool.Matcher#getChild <em>Child</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.qool.QoolPackage#getMatcher()
 * @model abstract="true"
 * @generated
 */
public interface Matcher extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference.
	 * @see #setChild(Matcher)
	 * @see org.eclectic.frontend.qool.QoolPackage#getMatcher_Child()
	 * @model containment="true"
	 * @generated
	 */
	Matcher getChild();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.qool.Matcher#getChild <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' containment reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(Matcher value);

} // Matcher
