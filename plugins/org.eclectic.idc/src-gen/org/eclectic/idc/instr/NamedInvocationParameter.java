/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.instr;

import org.eclectic.idc.core.Variable;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Invocation Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.instr.NamedInvocationParameter#getFormalName <em>Formal Name</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.NamedInvocationParameter#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.instr.InstrPackage#getNamedInvocationParameter()
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
	 * @see org.eclectic.idc.instr.InstrPackage#getNamedInvocationParameter_FormalName()
	 * @model required="true"
	 * @generated
	 */
	String getFormalName();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.instr.NamedInvocationParameter#getFormalName <em>Formal Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formal Name</em>' attribute.
	 * @see #getFormalName()
	 * @generated
	 */
	void setFormalName(String value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' reference.
	 * @see #setResult(Variable)
	 * @see org.eclectic.idc.instr.InstrPackage#getNamedInvocationParameter_Result()
	 * @model required="true"
	 * @generated
	 */
	Variable getResult();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.instr.NamedInvocationParameter#getResult <em>Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(Variable value);

} // NamedInvocationParameter
