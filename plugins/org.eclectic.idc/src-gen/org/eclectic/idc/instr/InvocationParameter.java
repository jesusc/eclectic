/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.instr;

import org.eclectic.idc.core.ModelDefinition;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invocation Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.instr.InvocationParameter#getModel <em>Model</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.InvocationParameter#getCalleeModelName <em>Callee Model Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.instr.InstrPackage#getInvocationParameter()
 * @model
 * @generated
 */
public interface InvocationParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(ModelDefinition)
	 * @see org.eclectic.idc.instr.InstrPackage#getInvocationParameter_Model()
	 * @model required="true"
	 * @generated
	 */
	ModelDefinition getModel();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.instr.InvocationParameter#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(ModelDefinition value);

	/**
	 * Returns the value of the '<em><b>Callee Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callee Model Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callee Model Name</em>' attribute.
	 * @see #setCalleeModelName(String)
	 * @see org.eclectic.idc.instr.InstrPackage#getInvocationParameter_CalleeModelName()
	 * @model required="true"
	 * @generated
	 */
	String getCalleeModelName();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.instr.InvocationParameter#getCalleeModelName <em>Callee Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callee Model Name</em>' attribute.
	 * @see #getCalleeModelName()
	 * @generated
	 */
	void setCalleeModelName(String value);

} // InvocationParameter
