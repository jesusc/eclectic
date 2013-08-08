/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.imperative;

import org.eclectic.frontend.core.ClassUse;
import org.eclectic.frontend.core.LocatedElement;
import org.eclectic.frontend.core.Statement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.imperative.MethodDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.eclectic.frontend.imperative.MethodDefinition#getFormalParameters <em>Formal Parameters</em>}</li>
 *   <li>{@link org.eclectic.frontend.imperative.MethodDefinition#getSelf <em>Self</em>}</li>
 *   <li>{@link org.eclectic.frontend.imperative.MethodDefinition#getType <em>Type</em>}</li>
 *   <li>{@link org.eclectic.frontend.imperative.MethodDefinition#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.imperative.ImperativePackage#getMethodDefinition()
 * @model
 * @generated
 */
public interface MethodDefinition extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclectic.frontend.imperative.ImperativePackage#getMethodDefinition_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.imperative.MethodDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Formal Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.imperative.MethodParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal Parameters</em>' containment reference list.
	 * @see org.eclectic.frontend.imperative.ImperativePackage#getMethodDefinition_FormalParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<MethodParameter> getFormalParameters();

	/**
	 * Returns the value of the '<em><b>Self</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Self</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Self</em>' containment reference.
	 * @see #setSelf(MethodSelf)
	 * @see org.eclectic.frontend.imperative.ImperativePackage#getMethodDefinition_Self()
	 * @model containment="true"
	 * @generated
	 */
	MethodSelf getSelf();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.imperative.MethodDefinition#getSelf <em>Self</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Self</em>' containment reference.
	 * @see #getSelf()
	 * @generated
	 */
	void setSelf(MethodSelf value);

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
	 * @see org.eclectic.frontend.imperative.ImperativePackage#getMethodDefinition_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ClassUse getType();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.imperative.MethodDefinition#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ClassUse value);

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
	 * @see org.eclectic.frontend.imperative.ImperativePackage#getMethodDefinition_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatements();

} // MethodDefinition
