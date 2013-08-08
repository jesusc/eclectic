/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.qool;

import org.eclectic.frontend.core.Expression;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Invocation Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.qool.NamedInvocationParameter#getFormalName <em>Formal Name</em>}</li>
 *   <li>{@link org.eclectic.frontend.qool.NamedInvocationParameter#getActualParameter <em>Actual Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.qool.QoolPackage#getNamedInvocationParameter()
 * @model
 * @generated
 */
public interface NamedInvocationParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Formal Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal Name</em>' attribute.
	 * @see #setFormalName(String)
	 * @see org.eclectic.frontend.qool.QoolPackage#getNamedInvocationParameter_FormalName()
	 * @model required="true"
	 * @generated
	 */
	String getFormalName();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.qool.NamedInvocationParameter#getFormalName <em>Formal Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formal Name</em>' attribute.
	 * @see #getFormalName()
	 * @generated
	 */
	void setFormalName(String value);

	/**
	 * Returns the value of the '<em><b>Actual Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Parameter</em>' containment reference.
	 * @see #setActualParameter(Expression)
	 * @see org.eclectic.frontend.qool.QoolPackage#getNamedInvocationParameter_ActualParameter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getActualParameter();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.qool.NamedInvocationParameter#getActualParameter <em>Actual Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Parameter</em>' containment reference.
	 * @see #getActualParameter()
	 * @generated
	 */
	void setActualParameter(Expression value);

} // NamedInvocationParameter
