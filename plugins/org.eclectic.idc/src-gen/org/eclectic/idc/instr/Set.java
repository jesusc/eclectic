/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.instr;

import org.eclectic.idc.core.Instruction;
import org.eclectic.idc.core.Variable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.instr.Set#getReceptor <em>Receptor</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.Set#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.Set#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.instr.InstrPackage#getSet()
 * @model
 * @generated
 */
public interface Set extends Instruction {
	/**
	 * Returns the value of the '<em><b>Receptor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclectic.idc.core.Variable#getSetReceptors <em>Set Receptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receptor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receptor</em>' reference.
	 * @see #setReceptor(Variable)
	 * @see org.eclectic.idc.instr.InstrPackage#getSet_Receptor()
	 * @see org.eclectic.idc.core.Variable#getSetReceptors
	 * @model opposite="setReceptors"
	 * @generated
	 */
	Variable getReceptor();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.instr.Set#getReceptor <em>Receptor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receptor</em>' reference.
	 * @see #getReceptor()
	 * @generated
	 */
	void setReceptor(Variable value);

	/**
	 * Returns the value of the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Name</em>' attribute.
	 * @see #setFeatureName(String)
	 * @see org.eclectic.idc.instr.InstrPackage#getSet_FeatureName()
	 * @model
	 * @generated
	 */
	String getFeatureName();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.instr.Set#getFeatureName <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Name</em>' attribute.
	 * @see #getFeatureName()
	 * @generated
	 */
	void setFeatureName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclectic.idc.core.Variable#getSetValues <em>Set Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(Variable)
	 * @see org.eclectic.idc.instr.InstrPackage#getSet_Value()
	 * @see org.eclectic.idc.core.Variable#getSetValues
	 * @model opposite="setValues"
	 * @generated
	 */
	Variable getValue();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.instr.Set#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Variable value);

} // Set
