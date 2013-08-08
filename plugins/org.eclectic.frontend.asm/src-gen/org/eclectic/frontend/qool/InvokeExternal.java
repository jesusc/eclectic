/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.qool;

import org.eclectic.frontend.core.Expression;

import org.eclectic.frontend.core.Variable;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invoke External</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.qool.InvokeExternal#getOutputResolutionSourceElement <em>Output Resolution Source Element</em>}</li>
 *   <li>{@link org.eclectic.frontend.qool.InvokeExternal#getQueueName <em>Queue Name</em>}</li>
 *   <li>{@link org.eclectic.frontend.qool.InvokeExternal#getTraceAttributeName <em>Trace Attribute Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.qool.QoolPackage#getInvokeExternal()
 * @model
 * @generated
 */
public interface InvokeExternal extends InvokeTransformation {
	/**
	 * Returns the value of the '<em><b>Output Resolution Source Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Resolution Source Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Resolution Source Element</em>' containment reference.
	 * @see #setOutputResolutionSourceElement(Expression)
	 * @see org.eclectic.frontend.qool.QoolPackage#getInvokeExternal_OutputResolutionSourceElement()
	 * @model containment="true"
	 * @generated
	 */
	Expression getOutputResolutionSourceElement();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.qool.InvokeExternal#getOutputResolutionSourceElement <em>Output Resolution Source Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Resolution Source Element</em>' containment reference.
	 * @see #getOutputResolutionSourceElement()
	 * @generated
	 */
	void setOutputResolutionSourceElement(Expression value);

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
	 * @see org.eclectic.frontend.qool.QoolPackage#getInvokeExternal_QueueName()
	 * @model
	 * @generated
	 */
	String getQueueName();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.qool.InvokeExternal#getQueueName <em>Queue Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Name</em>' attribute.
	 * @see #getQueueName()
	 * @generated
	 */
	void setQueueName(String value);

	/**
	 * Returns the value of the '<em><b>Trace Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace Attribute Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Attribute Name</em>' attribute.
	 * @see #setTraceAttributeName(String)
	 * @see org.eclectic.frontend.qool.QoolPackage#getInvokeExternal_TraceAttributeName()
	 * @model
	 * @generated
	 */
	String getTraceAttributeName();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.qool.InvokeExternal#getTraceAttributeName <em>Trace Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace Attribute Name</em>' attribute.
	 * @see #getTraceAttributeName()
	 * @generated
	 */
	void setTraceAttributeName(String value);

} // InvokeExternal
