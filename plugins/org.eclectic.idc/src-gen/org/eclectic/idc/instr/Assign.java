/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.instr;

import org.eclectic.idc.core.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.instr.Assign#getRightVariable <em>Right Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.instr.InstrPackage#getAssign()
 * @model
 * @generated
 */
public interface Assign extends InstructionWithResult {
	/**
	 * Returns the value of the '<em><b>Right Variable</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclectic.idc.core.Variable#getAssignVariables <em>Assign Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Variable</em>' reference.
	 * @see #setRightVariable(Variable)
	 * @see org.eclectic.idc.instr.InstrPackage#getAssign_RightVariable()
	 * @see org.eclectic.idc.core.Variable#getAssignVariables
	 * @model opposite="assignVariables"
	 * @generated
	 */
	Variable getRightVariable();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.instr.Assign#getRightVariable <em>Right Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Variable</em>' reference.
	 * @see #getRightVariable()
	 * @generated
	 */
	void setRightVariable(Variable value);

} // Assign
