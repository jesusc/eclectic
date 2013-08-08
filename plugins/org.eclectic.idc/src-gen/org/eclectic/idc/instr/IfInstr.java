/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.instr;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Instr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.instr.IfInstr#getThen <em>Then</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.IfInstr#getElsifs <em>Elsifs</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.IfInstr#getElseBlock <em>Else Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.instr.InstrPackage#getIfInstr()
 * @model
 * @generated
 */
public interface IfInstr extends InstructionWithResult {
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
	 * @see org.eclectic.idc.instr.InstrPackage#getIfInstr_Then()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IfBranch getThen();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.instr.IfInstr#getThen <em>Then</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then</em>' containment reference.
	 * @see #getThen()
	 * @generated
	 */
	void setThen(IfBranch value);

	/**
	 * Returns the value of the '<em><b>Elsifs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.idc.instr.IfBranch}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elsifs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elsifs</em>' containment reference list.
	 * @see org.eclectic.idc.instr.InstrPackage#getIfInstr_Elsifs()
	 * @model containment="true"
	 * @generated
	 */
	EList<IfBranch> getElsifs();

	/**
	 * Returns the value of the '<em><b>Else Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Block</em>' containment reference.
	 * @see #setElseBlock(IfElseBlock)
	 * @see org.eclectic.idc.instr.InstrPackage#getIfInstr_ElseBlock()
	 * @model containment="true"
	 * @generated
	 */
	IfElseBlock getElseBlock();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.instr.IfInstr#getElseBlock <em>Else Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Block</em>' containment reference.
	 * @see #getElseBlock()
	 * @generated
	 */
	void setElseBlock(IfElseBlock value);

} // IfInstr
