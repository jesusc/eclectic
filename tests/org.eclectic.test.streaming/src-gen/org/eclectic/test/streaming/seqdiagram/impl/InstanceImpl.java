/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.test.streaming.seqdiagram.impl;

import org.eclectic.test.streaming.seqdiagram.Instance;
import org.eclectic.test.streaming.seqdiagram.SeqdiagramPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.test.streaming.seqdiagram.impl.InstanceImpl#getDebugName <em>Debug Name</em>}</li>
 *   <li>{@link org.eclectic.test.streaming.seqdiagram.impl.InstanceImpl#getObjectId <em>Object Id</em>}</li>
 *   <li>{@link org.eclectic.test.streaming.seqdiagram.impl.InstanceImpl#getNodeId <em>Node Id</em>}</li>
 *   <li>{@link org.eclectic.test.streaming.seqdiagram.impl.InstanceImpl#getObjectId_hex <em>Object Id hex</em>}</li>
 *   <li>{@link org.eclectic.test.streaming.seqdiagram.impl.InstanceImpl#getClazz <em>Clazz</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstanceImpl extends ClassifierImpl implements Instance {
	/**
	 * The default value of the '{@link #getDebugName() <em>Debug Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebugName()
	 * @generated
	 * @ordered
	 */
	protected static final String DEBUG_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDebugName() <em>Debug Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebugName()
	 * @generated
	 * @ordered
	 */
	protected String debugName = DEBUG_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getObjectId() <em>Object Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectId()
	 * @generated
	 * @ordered
	 */
	protected static final int OBJECT_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getObjectId() <em>Object Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectId()
	 * @generated
	 * @ordered
	 */
	protected int objectId = OBJECT_ID_EDEFAULT;

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
	 * The default value of the '{@link #getObjectId_hex() <em>Object Id hex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectId_hex()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_ID_HEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjectId_hex() <em>Object Id hex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectId_hex()
	 * @generated
	 * @ordered
	 */
	protected String objectId_hex = OBJECT_ID_HEX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClazz() <em>Clazz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClazz()
	 * @generated
	 * @ordered
	 */
	protected org.eclectic.test.streaming.seqdiagram.Class clazz;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SeqdiagramPackage.Literals.INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDebugName() {
		return debugName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebugName(String newDebugName) {
		String oldDebugName = debugName;
		debugName = newDebugName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeqdiagramPackage.INSTANCE__DEBUG_NAME, oldDebugName, debugName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getObjectId() {
		return objectId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectId(int newObjectId) {
		int oldObjectId = objectId;
		objectId = newObjectId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeqdiagramPackage.INSTANCE__OBJECT_ID, oldObjectId, objectId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SeqdiagramPackage.INSTANCE__NODE_ID, oldNodeId, nodeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjectId_hex() {
		return objectId_hex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectId_hex(String newObjectId_hex) {
		String oldObjectId_hex = objectId_hex;
		objectId_hex = newObjectId_hex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeqdiagramPackage.INSTANCE__OBJECT_ID_HEX, oldObjectId_hex, objectId_hex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclectic.test.streaming.seqdiagram.Class getClazz() {
		if (clazz != null && clazz.eIsProxy()) {
			InternalEObject oldClazz = (InternalEObject)clazz;
			clazz = (org.eclectic.test.streaming.seqdiagram.Class)eResolveProxy(oldClazz);
			if (clazz != oldClazz) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SeqdiagramPackage.INSTANCE__CLAZZ, oldClazz, clazz));
			}
		}
		return clazz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclectic.test.streaming.seqdiagram.Class basicGetClazz() {
		return clazz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClazz(org.eclectic.test.streaming.seqdiagram.Class newClazz) {
		org.eclectic.test.streaming.seqdiagram.Class oldClazz = clazz;
		clazz = newClazz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SeqdiagramPackage.INSTANCE__CLAZZ, oldClazz, clazz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SeqdiagramPackage.INSTANCE__DEBUG_NAME:
				return getDebugName();
			case SeqdiagramPackage.INSTANCE__OBJECT_ID:
				return getObjectId();
			case SeqdiagramPackage.INSTANCE__NODE_ID:
				return getNodeId();
			case SeqdiagramPackage.INSTANCE__OBJECT_ID_HEX:
				return getObjectId_hex();
			case SeqdiagramPackage.INSTANCE__CLAZZ:
				if (resolve) return getClazz();
				return basicGetClazz();
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
			case SeqdiagramPackage.INSTANCE__DEBUG_NAME:
				setDebugName((String)newValue);
				return;
			case SeqdiagramPackage.INSTANCE__OBJECT_ID:
				setObjectId((Integer)newValue);
				return;
			case SeqdiagramPackage.INSTANCE__NODE_ID:
				setNodeId((Integer)newValue);
				return;
			case SeqdiagramPackage.INSTANCE__OBJECT_ID_HEX:
				setObjectId_hex((String)newValue);
				return;
			case SeqdiagramPackage.INSTANCE__CLAZZ:
				setClazz((org.eclectic.test.streaming.seqdiagram.Class)newValue);
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
			case SeqdiagramPackage.INSTANCE__DEBUG_NAME:
				setDebugName(DEBUG_NAME_EDEFAULT);
				return;
			case SeqdiagramPackage.INSTANCE__OBJECT_ID:
				setObjectId(OBJECT_ID_EDEFAULT);
				return;
			case SeqdiagramPackage.INSTANCE__NODE_ID:
				setNodeId(NODE_ID_EDEFAULT);
				return;
			case SeqdiagramPackage.INSTANCE__OBJECT_ID_HEX:
				setObjectId_hex(OBJECT_ID_HEX_EDEFAULT);
				return;
			case SeqdiagramPackage.INSTANCE__CLAZZ:
				setClazz((org.eclectic.test.streaming.seqdiagram.Class)null);
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
			case SeqdiagramPackage.INSTANCE__DEBUG_NAME:
				return DEBUG_NAME_EDEFAULT == null ? debugName != null : !DEBUG_NAME_EDEFAULT.equals(debugName);
			case SeqdiagramPackage.INSTANCE__OBJECT_ID:
				return objectId != OBJECT_ID_EDEFAULT;
			case SeqdiagramPackage.INSTANCE__NODE_ID:
				return nodeId != NODE_ID_EDEFAULT;
			case SeqdiagramPackage.INSTANCE__OBJECT_ID_HEX:
				return OBJECT_ID_HEX_EDEFAULT == null ? objectId_hex != null : !OBJECT_ID_HEX_EDEFAULT.equals(objectId_hex);
			case SeqdiagramPackage.INSTANCE__CLAZZ:
				return clazz != null;
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
		result.append(" (debugName: ");
		result.append(debugName);
		result.append(", objectId: ");
		result.append(objectId);
		result.append(", nodeId: ");
		result.append(nodeId);
		result.append(", objectId_hex: ");
		result.append(objectId_hex);
		result.append(')');
		return result.toString();
	}

} //InstanceImpl
