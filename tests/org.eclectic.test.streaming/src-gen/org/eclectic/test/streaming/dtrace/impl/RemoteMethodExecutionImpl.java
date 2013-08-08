/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.test.streaming.dtrace.impl;

import org.eclectic.test.streaming.dtrace.DTracePackage;
import org.eclectic.test.streaming.dtrace.RemoteMethodExecution;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remote Method Execution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.test.streaming.dtrace.impl.RemoteMethodExecutionImpl#getClientTimestamp <em>Client Timestamp</em>}</li>
 *   <li>{@link org.eclectic.test.streaming.dtrace.impl.RemoteMethodExecutionImpl#getClientNodeId <em>Client Node Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RemoteMethodExecutionImpl extends MethodExecutionImpl implements RemoteMethodExecution {
	/**
	 * The default value of the '{@link #getClientTimestamp() <em>Client Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final int CLIENT_TIMESTAMP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getClientTimestamp() <em>Client Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientTimestamp()
	 * @generated
	 * @ordered
	 */
	protected int clientTimestamp = CLIENT_TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getClientNodeId() <em>Client Node Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientNodeId()
	 * @generated
	 * @ordered
	 */
	protected static final int CLIENT_NODE_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getClientNodeId() <em>Client Node Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientNodeId()
	 * @generated
	 * @ordered
	 */
	protected int clientNodeId = CLIENT_NODE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoteMethodExecutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DTracePackage.Literals.REMOTE_METHOD_EXECUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getClientTimestamp() {
		return clientTimestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientTimestamp(int newClientTimestamp) {
		int oldClientTimestamp = clientTimestamp;
		clientTimestamp = newClientTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DTracePackage.REMOTE_METHOD_EXECUTION__CLIENT_TIMESTAMP, oldClientTimestamp, clientTimestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getClientNodeId() {
		return clientNodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientNodeId(int newClientNodeId) {
		int oldClientNodeId = clientNodeId;
		clientNodeId = newClientNodeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DTracePackage.REMOTE_METHOD_EXECUTION__CLIENT_NODE_ID, oldClientNodeId, clientNodeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DTracePackage.REMOTE_METHOD_EXECUTION__CLIENT_TIMESTAMP:
				return getClientTimestamp();
			case DTracePackage.REMOTE_METHOD_EXECUTION__CLIENT_NODE_ID:
				return getClientNodeId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DTracePackage.REMOTE_METHOD_EXECUTION__CLIENT_TIMESTAMP:
				setClientTimestamp((Integer)newValue);
				return;
			case DTracePackage.REMOTE_METHOD_EXECUTION__CLIENT_NODE_ID:
				setClientNodeId((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DTracePackage.REMOTE_METHOD_EXECUTION__CLIENT_TIMESTAMP:
				setClientTimestamp(CLIENT_TIMESTAMP_EDEFAULT);
				return;
			case DTracePackage.REMOTE_METHOD_EXECUTION__CLIENT_NODE_ID:
				setClientNodeId(CLIENT_NODE_ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DTracePackage.REMOTE_METHOD_EXECUTION__CLIENT_TIMESTAMP:
				return clientTimestamp != CLIENT_TIMESTAMP_EDEFAULT;
			case DTracePackage.REMOTE_METHOD_EXECUTION__CLIENT_NODE_ID:
				return clientNodeId != CLIENT_NODE_ID_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (clientTimestamp: ");
		result.append(clientTimestamp);
		result.append(", clientNodeId: ");
		result.append(clientNodeId);
		result.append(')');
		return result.toString();
	}

} //RemoteMethodExecutionImpl
