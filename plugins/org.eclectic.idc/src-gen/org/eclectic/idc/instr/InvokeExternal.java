/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.instr;

import org.eclectic.idc.core.Variable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invoke External</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.instr.InvokeExternal#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.InvokeExternal#getOutputResolutionSourceElement <em>Output Resolution Source Element</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.InvokeExternal#getQueueName <em>Queue Name</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.InvokeExternal#getSrcTraceAttributeName <em>Src Trace Attribute Name</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.InvokeExternal#getTgtTraceAttributeName <em>Tgt Trace Attribute Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.instr.InstrPackage#getInvokeExternal()
 * @model
 * @generated
 */
public interface InvokeExternal extends InvokeTransformation {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.idc.instr.NamedInvocationParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.eclectic.idc.instr.InstrPackage#getInvokeExternal_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<NamedInvocationParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Output Resolution Source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Resolution Source Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Resolution Source Element</em>' reference.
	 * @see #setOutputResolutionSourceElement(Variable)
	 * @see org.eclectic.idc.instr.InstrPackage#getInvokeExternal_OutputResolutionSourceElement()
	 * @model
	 * @generated
	 */
	Variable getOutputResolutionSourceElement();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.instr.InvokeExternal#getOutputResolutionSourceElement <em>Output Resolution Source Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Resolution Source Element</em>' reference.
	 * @see #getOutputResolutionSourceElement()
	 * @generated
	 */
	void setOutputResolutionSourceElement(Variable value);

	/**
	 * Returns the value of the '<em><b>Queue Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queue Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue Name</em>' attribute.
	 * @see #setQueueName(String)
	 * @see org.eclectic.idc.instr.InstrPackage#getInvokeExternal_QueueName()
	 * @model
	 * @generated
	 */
	String getQueueName();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.instr.InvokeExternal#getQueueName <em>Queue Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Name</em>' attribute.
	 * @see #getQueueName()
	 * @generated
	 */
	void setQueueName(String value);

	/**
	 * Returns the value of the '<em><b>Src Trace Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src Trace Attribute Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src Trace Attribute Name</em>' attribute.
	 * @see #setSrcTraceAttributeName(String)
	 * @see org.eclectic.idc.instr.InstrPackage#getInvokeExternal_SrcTraceAttributeName()
	 * @model
	 * @generated
	 */
	String getSrcTraceAttributeName();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.instr.InvokeExternal#getSrcTraceAttributeName <em>Src Trace Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src Trace Attribute Name</em>' attribute.
	 * @see #getSrcTraceAttributeName()
	 * @generated
	 */
	void setSrcTraceAttributeName(String value);

	/**
	 * Returns the value of the '<em><b>Tgt Trace Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tgt Trace Attribute Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tgt Trace Attribute Name</em>' attribute.
	 * @see #setTgtTraceAttributeName(String)
	 * @see org.eclectic.idc.instr.InstrPackage#getInvokeExternal_TgtTraceAttributeName()
	 * @model
	 * @generated
	 */
	String getTgtTraceAttributeName();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.instr.InvokeExternal#getTgtTraceAttributeName <em>Tgt Trace Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tgt Trace Attribute Name</em>' attribute.
	 * @see #getTgtTraceAttributeName()
	 * @generated
	 */
	void setTgtTraceAttributeName(String value);

} // InvokeExternal
