/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.instr;

import org.eclectic.idc.core.TypeInfo;
import org.eclectic.idc.core.Variable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.instr.MethodCall#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.MethodCall#getReceptor <em>Receptor</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.MethodCall#getActualParameters <em>Actual Parameters</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.MethodCall#isMaybeGet <em>Maybe Get</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.MethodCall#getReceptorType <em>Receptor Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.instr.InstrPackage#getMethodCall()
 * @model
 * @generated
 */
public interface MethodCall extends InstructionWithResult {
	/**
	 * Returns the value of the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Name</em>' attribute.
	 * @see #setMethodName(String)
	 * @see org.eclectic.idc.instr.InstrPackage#getMethodCall_MethodName()
	 * @model required="true"
	 * @generated
	 */
	String getMethodName();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.instr.MethodCall#getMethodName <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Name</em>' attribute.
	 * @see #getMethodName()
	 * @generated
	 */
	void setMethodName(String value);

	/**
	 * Returns the value of the '<em><b>Receptor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclectic.idc.core.Variable#getCallReceptors <em>Call Receptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receptor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receptor</em>' reference.
	 * @see #setReceptor(Variable)
	 * @see org.eclectic.idc.instr.InstrPackage#getMethodCall_Receptor()
	 * @see org.eclectic.idc.core.Variable#getCallReceptors
	 * @model opposite="callReceptors" required="true"
	 * @generated
	 */
	Variable getReceptor();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.instr.MethodCall#getReceptor <em>Receptor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receptor</em>' reference.
	 * @see #getReceptor()
	 * @generated
	 */
	void setReceptor(Variable value);

	/**
	 * Returns the value of the '<em><b>Actual Parameters</b></em>' reference list.
	 * The list contents are of type {@link org.eclectic.idc.core.Variable}.
	 * It is bidirectional and its opposite is '{@link org.eclectic.idc.core.Variable#getCallParameters <em>Call Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Parameters</em>' reference list.
	 * @see org.eclectic.idc.instr.InstrPackage#getMethodCall_ActualParameters()
	 * @see org.eclectic.idc.core.Variable#getCallParameters
	 * @model opposite="callParameters"
	 * @generated
	 */
	EList<Variable> getActualParameters();

	/**
	 * Returns the value of the '<em><b>Maybe Get</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maybe Get</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maybe Get</em>' attribute.
	 * @see #setMaybeGet(boolean)
	 * @see org.eclectic.idc.instr.InstrPackage#getMethodCall_MaybeGet()
	 * @model required="true"
	 * @generated
	 */
	boolean isMaybeGet();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.instr.MethodCall#isMaybeGet <em>Maybe Get</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maybe Get</em>' attribute.
	 * @see #isMaybeGet()
	 * @generated
	 */
	void setMaybeGet(boolean value);

	/**
	 * Returns the value of the '<em><b>Receptor Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receptor Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receptor Type</em>' containment reference.
	 * @see #setReceptorType(TypeInfo)
	 * @see org.eclectic.idc.instr.InstrPackage#getMethodCall_ReceptorType()
	 * @model containment="true"
	 * @generated
	 */
	TypeInfo getReceptorType();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.instr.MethodCall#getReceptorType <em>Receptor Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receptor Type</em>' containment reference.
	 * @see #getReceptorType()
	 * @generated
	 */
	void setReceptorType(TypeInfo value);

} // MethodCall
