/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.test.streaming.dtrace;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.test.streaming.dtrace.ExecutionStatement#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.eclectic.test.streaming.dtrace.ExecutionStatement#getNodeId <em>Node Id</em>}</li>
 *   <li>{@link org.eclectic.test.streaming.dtrace.ExecutionStatement#getStatementSrc <em>Statement Src</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.test.streaming.dtrace.DTracePackage#getExecutionStatement()
 * @model abstract="true"
 * @generated
 */
public interface ExecutionStatement extends EObject {
	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(int)
	 * @see org.eclectic.test.streaming.dtrace.DTracePackage#getExecutionStatement_Timestamp()
	 * @model required="true"
	 * @generated
	 */
	int getTimestamp();

	/**
	 * Sets the value of the '{@link org.eclectic.test.streaming.dtrace.ExecutionStatement#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(int value);

	/**
	 * Returns the value of the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Id</em>' attribute.
	 * @see #setNodeId(int)
	 * @see org.eclectic.test.streaming.dtrace.DTracePackage#getExecutionStatement_NodeId()
	 * @model required="true"
	 * @generated
	 */
	int getNodeId();

	/**
	 * Sets the value of the '{@link org.eclectic.test.streaming.dtrace.ExecutionStatement#getNodeId <em>Node Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Id</em>' attribute.
	 * @see #getNodeId()
	 * @generated
	 */
	void setNodeId(int value);

	/**
	 * Returns the value of the '<em><b>Statement Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statement Src</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement Src</em>' attribute.
	 * @see #setStatementSrc(String)
	 * @see org.eclectic.test.streaming.dtrace.DTracePackage#getExecutionStatement_StatementSrc()
	 * @model required="true"
	 * @generated
	 */
	String getStatementSrc();

	/**
	 * Sets the value of the '{@link org.eclectic.test.streaming.dtrace.ExecutionStatement#getStatementSrc <em>Statement Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement Src</em>' attribute.
	 * @see #getStatementSrc()
	 * @generated
	 */
	void setStatementSrc(String value);

} // ExecutionStatement
