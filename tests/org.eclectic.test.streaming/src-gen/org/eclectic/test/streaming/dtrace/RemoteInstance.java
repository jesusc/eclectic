/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.test.streaming.dtrace;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remote Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.test.streaming.dtrace.RemoteInstance#getNodeId <em>Node Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.test.streaming.dtrace.DTracePackage#getRemoteInstance()
 * @model
 * @generated
 */
public interface RemoteInstance extends Instance {
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
	 * @see org.eclectic.test.streaming.dtrace.DTracePackage#getRemoteInstance_NodeId()
	 * @model
	 * @generated
	 */
	int getNodeId();

	/**
	 * Sets the value of the '{@link org.eclectic.test.streaming.dtrace.RemoteInstance#getNodeId <em>Node Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Id</em>' attribute.
	 * @see #getNodeId()
	 * @generated
	 */
	void setNodeId(int value);

} // RemoteInstance
