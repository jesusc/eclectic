/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.core;

import org.eclectic.idc.instr.Assign;
import org.eclectic.idc.instr.Get;
import org.eclectic.idc.instr.IfBranch;
import org.eclectic.idc.instr.MethodCall;
import org.eclectic.idc.instr.Set;
import org.eclectic.idc.qool.QEmit;
import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.core.Variable#getType <em>Type</em>}</li>
 *   <li>{@link org.eclectic.idc.core.Variable#getGetReceptors <em>Get Receptors</em>}</li>
 *   <li>{@link org.eclectic.idc.core.Variable#getSetReceptors <em>Set Receptors</em>}</li>
 *   <li>{@link org.eclectic.idc.core.Variable#getSetValues <em>Set Values</em>}</li>
 *   <li>{@link org.eclectic.idc.core.Variable#getAssignVariables <em>Assign Variables</em>}</li>
 *   <li>{@link org.eclectic.idc.core.Variable#getIfConditions <em>If Conditions</em>}</li>
 *   <li>{@link org.eclectic.idc.core.Variable#getCallReceptors <em>Call Receptors</em>}</li>
 *   <li>{@link org.eclectic.idc.core.Variable#getCallParameters <em>Call Parameters</em>}</li>
 *   <li>{@link org.eclectic.idc.core.Variable#getEmitValues <em>Emit Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.core.CorePackage#getVariable()
 * @model abstract="true"
 * @generated
 */
public interface Variable extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(TypeInfo)
	 * @see org.eclectic.idc.core.CorePackage#getVariable_Type()
	 * @model containment="true"
	 * @generated
	 */
	TypeInfo getType();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.core.Variable#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeInfo value);

	/**
	 * Returns the value of the '<em><b>Get Receptors</b></em>' reference list.
	 * The list contents are of type {@link org.eclectic.idc.instr.Get}.
	 * It is bidirectional and its opposite is '{@link org.eclectic.idc.instr.Get#getReceptor <em>Receptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Receptors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Receptors</em>' reference list.
	 * @see org.eclectic.idc.core.CorePackage#getVariable_GetReceptors()
	 * @see org.eclectic.idc.instr.Get#getReceptor
	 * @model opposite="receptor"
	 * @generated
	 */
	EList<Get> getGetReceptors();

	/**
	 * Returns the value of the '<em><b>Set Receptors</b></em>' reference list.
	 * The list contents are of type {@link org.eclectic.idc.instr.Set}.
	 * It is bidirectional and its opposite is '{@link org.eclectic.idc.instr.Set#getReceptor <em>Receptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Receptors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Receptors</em>' reference list.
	 * @see org.eclectic.idc.core.CorePackage#getVariable_SetReceptors()
	 * @see org.eclectic.idc.instr.Set#getReceptor
	 * @model opposite="receptor"
	 * @generated
	 */
	EList<Set> getSetReceptors();

	/**
	 * Returns the value of the '<em><b>Set Values</b></em>' reference list.
	 * The list contents are of type {@link org.eclectic.idc.instr.Set}.
	 * It is bidirectional and its opposite is '{@link org.eclectic.idc.instr.Set#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Values</em>' reference list.
	 * @see org.eclectic.idc.core.CorePackage#getVariable_SetValues()
	 * @see org.eclectic.idc.instr.Set#getValue
	 * @model opposite="value"
	 * @generated
	 */
	EList<Set> getSetValues();

	/**
	 * Returns the value of the '<em><b>Assign Variables</b></em>' reference list.
	 * The list contents are of type {@link org.eclectic.idc.instr.Assign}.
	 * It is bidirectional and its opposite is '{@link org.eclectic.idc.instr.Assign#getRightVariable <em>Right Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assign Variables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assign Variables</em>' reference list.
	 * @see org.eclectic.idc.core.CorePackage#getVariable_AssignVariables()
	 * @see org.eclectic.idc.instr.Assign#getRightVariable
	 * @model opposite="rightVariable"
	 * @generated
	 */
	EList<Assign> getAssignVariables();

	/**
	 * Returns the value of the '<em><b>If Conditions</b></em>' reference list.
	 * The list contents are of type {@link org.eclectic.idc.instr.IfBranch}.
	 * It is bidirectional and its opposite is '{@link org.eclectic.idc.instr.IfBranch#getBooleanVariable <em>Boolean Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Conditions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Conditions</em>' reference list.
	 * @see org.eclectic.idc.core.CorePackage#getVariable_IfConditions()
	 * @see org.eclectic.idc.instr.IfBranch#getBooleanVariable
	 * @model opposite="booleanVariable"
	 * @generated
	 */
	EList<IfBranch> getIfConditions();

	/**
	 * Returns the value of the '<em><b>Call Receptors</b></em>' reference list.
	 * The list contents are of type {@link org.eclectic.idc.instr.MethodCall}.
	 * It is bidirectional and its opposite is '{@link org.eclectic.idc.instr.MethodCall#getReceptor <em>Receptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Receptors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Receptors</em>' reference list.
	 * @see org.eclectic.idc.core.CorePackage#getVariable_CallReceptors()
	 * @see org.eclectic.idc.instr.MethodCall#getReceptor
	 * @model opposite="receptor"
	 * @generated
	 */
	EList<MethodCall> getCallReceptors();

	/**
	 * Returns the value of the '<em><b>Call Parameters</b></em>' reference list.
	 * The list contents are of type {@link org.eclectic.idc.instr.MethodCall}.
	 * It is bidirectional and its opposite is '{@link org.eclectic.idc.instr.MethodCall#getActualParameters <em>Actual Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Parameters</em>' reference list.
	 * @see org.eclectic.idc.core.CorePackage#getVariable_CallParameters()
	 * @see org.eclectic.idc.instr.MethodCall#getActualParameters
	 * @model opposite="actualParameters"
	 * @generated
	 */
	EList<MethodCall> getCallParameters();

	/**
	 * Returns the value of the '<em><b>Emit Values</b></em>' reference list.
	 * The list contents are of type {@link org.eclectic.idc.qool.QEmit}.
	 * It is bidirectional and its opposite is '{@link org.eclectic.idc.qool.QEmit#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emit Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emit Values</em>' reference list.
	 * @see org.eclectic.idc.core.CorePackage#getVariable_EmitValues()
	 * @see org.eclectic.idc.qool.QEmit#getValue
	 * @model opposite="value"
	 * @generated
	 */
	EList<QEmit> getEmitValues();

} // Variable
