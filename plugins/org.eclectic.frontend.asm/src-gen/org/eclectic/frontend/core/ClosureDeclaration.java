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
 * A representation of the model object '<em><b>Closure Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.core.ClosureDeclaration#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.eclectic.frontend.core.ClosureDeclaration#getFormalParameters <em>Formal Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.core.CorePackage#getClosureDeclaration()
 * @model
 * @generated
 */
public interface ClosureDeclaration extends Expression {
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
	 * @see org.eclectic.frontend.core.CorePackage#getClosureDeclaration_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatements();

	/**
	 * Returns the value of the '<em><b>Formal Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.core.ClosureParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal Parameters</em>' containment reference list.
	 * @see org.eclectic.frontend.core.CorePackage#getClosureDeclaration_FormalParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClosureParameter> getFormalParameters();

} // ClosureDeclaration
