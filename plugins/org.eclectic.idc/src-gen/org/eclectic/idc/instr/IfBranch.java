/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.instr;

import org.eclectic.idc.core.InstructionBlock;
import org.eclectic.idc.core.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.instr.IfBranch#getBooleanVariable <em>Boolean Variable</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.IfBranch#getIfBlock <em>If Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.instr.InstrPackage#getIfBranch()
 * @model
 * @generated
 */
public interface IfBranch extends InstructionBlock {
	/**
	 * Returns the value of the '<em><b>Boolean Variable</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclectic.idc.core.Variable#getIfConditions <em>If Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Variable</em>' reference.
	 * @see #setBooleanVariable(Variable)
	 * @see org.eclectic.idc.instr.InstrPackage#getIfBranch_BooleanVariable()
	 * @see org.eclectic.idc.core.Variable#getIfConditions
	 * @model opposite="ifConditions"
	 * @generated
	 */
	Variable getBooleanVariable();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.instr.IfBranch#getBooleanVariable <em>Boolean Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Variable</em>' reference.
	 * @see #getBooleanVariable()
	 * @generated
	 */
	void setBooleanVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>If Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Block</em>' containment reference.
	 * @see #setIfBlock(IfElseBlock)
	 * @see org.eclectic.idc.instr.InstrPackage#getIfBranch_IfBlock()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IfElseBlock getIfBlock();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.instr.IfBranch#getIfBlock <em>If Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Block</em>' containment reference.
	 * @see #getIfBlock()
	 * @generated
	 */
	void setIfBlock(IfElseBlock value);

} // IfBranch
