/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.test.streaming.dtrace;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remote Method Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.test.streaming.dtrace.RemoteMethodExecution#getClientTimestamp <em>Client Timestamp</em>}</li>
 *   <li>{@link org.eclectic.test.streaming.dtrace.RemoteMethodExecution#getClientNodeId <em>Client Node Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.test.streaming.dtrace.DTracePackage#getRemoteMethodExecution()
 * @model
 * @generated
 */
public interface RemoteMethodExecution extends MethodExecution {
	/**
	 * Returns the value of the '<em><b>Client Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Timestamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Timestamp</em>' attribute.
	 * @see #setClientTimestamp(int)
	 * @see org.eclectic.test.streaming.dtrace.DTracePackage#getRemoteMethodExecution_ClientTimestamp()
	 * @model required="true"
	 * @generated
	 */
	int getClientTimestamp();

	/**
	 * Sets the value of the '{@link org.eclectic.test.streaming.dtrace.RemoteMethodExecution#getClientTimestamp <em>Client Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Timestamp</em>' attribute.
	 * @see #getClientTimestamp()
	 * @generated
	 */
	void setClientTimestamp(int value);

	/**
	 * Returns the value of the '<em><b>Client Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Node Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Node Id</em>' attribute.
	 * @see #setClientNodeId(int)
	 * @see org.eclectic.test.streaming.dtrace.DTracePackage#getRemoteMethodExecution_ClientNodeId()
	 * @model required="true"
	 * @generated
	 */
	int getClientNodeId();

	/**
	 * Sets the value of the '{@link org.eclectic.test.streaming.dtrace.RemoteMethodExecution#getClientNodeId <em>Client Node Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Node Id</em>' attribute.
	 * @see #getClientNodeId()
	 * @generated
	 */
	void setClientNodeId(int value);

} // RemoteMethodExecution
