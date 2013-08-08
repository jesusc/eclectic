/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.core.IfExpr#getThen <em>Then</em>}</li>
 *   <li>{@link org.eclectic.frontend.core.IfExpr#getElsifs <em>Elsifs</em>}</li>
 *   <li>{@link org.eclectic.frontend.core.IfExpr#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.core.CorePackage#getIfExpr()
 * @model
 * @generated
 */
public interface IfExpr extends Expression {
	/**
	 * Returns the value of the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' containment reference.
	 * @see #setThen(IfBranch)
	 * @see org.eclectic.frontend.core.CorePackage#getIfExpr_Then()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IfBranch getThen();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.core.IfExpr#getThen <em>Then</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then</em>' containment reference.
	 * @see #getThen()
	 * @generated
	 */
	void setThen(IfBranch value);

	/**
	 * Returns the value of the '<em><b>Elsifs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.core.IfBranch}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elsifs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elsifs</em>' containment reference list.
	 * @see org.eclectic.frontend.core.CorePackage#getIfExpr_Elsifs()
	 * @model containment="true"
	 * @generated
	 */
	EList<IfBranch> getElsifs();

	/**
	 * Returns the value of the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' containment reference.
	 * @see #setElse(IfBranch)
	 * @see org.eclectic.frontend.core.CorePackage#getIfExpr_Else()
	 * @model containment="true"
	 * @generated
	 */
	IfBranch getElse();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.core.IfExpr#getElse <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' containment reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(IfBranch value);

} // IfExpr
