/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.test.streaming.dtrace.impl;

import org.eclectic.test.streaming.dtrace.DTracePackage;
import org.eclectic.test.streaming.dtrace.ExecutionStatement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.test.streaming.dtrace.impl.ExecutionStatementImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.eclectic.test.streaming.dtrace.impl.ExecutionStatementImpl#getNodeId <em>Node Id</em>}</li>
 *   <li>{@link org.eclectic.test.streaming.dtrace.impl.ExecutionStatementImpl#getStatementSrc <em>Statement Src</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ExecutionStatementImpl extends EObjectImpl implements ExecutionStatement {
	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final int TIMESTAMP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected int timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getNodeId() <em>Node Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeId()
	 * @generated
	 * @ordered
	 */
	protected static final int NODE_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNodeId() <em>Node Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeId()
	 * @generated
	 * @ordered
	 */
	protected int nodeId = NODE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatementSrc() <em>Statement Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatementSrc()
	 * @generated
	 * @ordered
	 */
	protected static final String STATEMENT_SRC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatementSrc() <em>Statement Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatementSrc()
	 * @generated
	 * @ordered
	 */
	protected String statementSrc = STATEMENT_SRC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DTracePackage.Literals.EXECUTION_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestamp(int newTimestamp) {
		int oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DTracePackage.EXECUTION_STATEMENT__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNodeId() {
		return nodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeId(int newNodeId) {
		int oldNodeId = nodeId;
		nodeId = newNodeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DTracePackage.EXECUTION_STATEMENT__NODE_ID, oldNodeId, nodeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatementSrc() {
		return statementSrc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatementSrc(String newStatementSrc) {
		String oldStatementSrc = statementSrc;
		statementSrc = newStatementSrc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DTracePackage.EXECUTION_STATEMENT__STATEMENT_SRC, oldStatementSrc, statementSrc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DTracePackage.EXECUTION_STATEMENT__TIMESTAMP:
				return getTimestamp();
			case DTracePackage.EXECUTION_STATEMENT__NODE_ID:
				return getNodeId();
			case DTracePackage.EXECUTION_STATEMENT__STATEMENT_SRC:
				return getStatementSrc();
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
			case DTracePackage.EXECUTION_STATEMENT__TIMESTAMP:
				setTimestamp((Integer)newValue);
				return;
			case DTracePackage.EXECUTION_STATEMENT__NODE_ID:
				setNodeId((Integer)newValue);
				return;
			case DTracePackage.EXECUTION_STATEMENT__STATEMENT_SRC:
				setStatementSrc((String)newValue);
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
			case DTracePackage.EXECUTION_STATEMENT__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case DTracePackage.EXECUTION_STATEMENT__NODE_ID:
				setNodeId(NODE_ID_EDEFAULT);
				return;
			case DTracePackage.EXECUTION_STATEMENT__STATEMENT_SRC:
				setStatementSrc(STATEMENT_SRC_EDEFAULT);
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
			case DTracePackage.EXECUTION_STATEMENT__TIMESTAMP:
				return timestamp != TIMESTAMP_EDEFAULT;
			case DTracePackage.EXECUTION_STATEMENT__NODE_ID:
				return nodeId != NODE_ID_EDEFAULT;
			case DTracePackage.EXECUTION_STATEMENT__STATEMENT_SRC:
				return STATEMENT_SRC_EDEFAULT == null ? statementSrc != null : !STATEMENT_SRC_EDEFAULT.equals(statementSrc);
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
		result.append(" (timestamp: ");
		result.append(timestamp);
		result.append(", nodeId: ");
		result.append(nodeId);
		result.append(", statementSrc: ");
		result.append(statementSrc);
		result.append(')');
		return result.toString();
	}

} //ExecutionStatementImpl
