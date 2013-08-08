/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.streamdesc.impl;

import java.util.Collection;

import org.eclectic.streamdesc.KeySpec;
import org.eclectic.streamdesc.SlidingWindow;
import org.eclectic.streamdesc.StreamDescription;
import org.eclectic.streamdesc.StreamdescPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stream Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.streamdesc.impl.StreamDescriptionImpl#getStreamName <em>Stream Name</em>}</li>
 *   <li>{@link org.eclectic.streamdesc.impl.StreamDescriptionImpl#getMetamodelName <em>Metamodel Name</em>}</li>
 *   <li>{@link org.eclectic.streamdesc.impl.StreamDescriptionImpl#getKeys <em>Keys</em>}</li>
 *   <li>{@link org.eclectic.streamdesc.impl.StreamDescriptionImpl#getWindows <em>Windows</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StreamDescriptionImpl extends EObjectImpl implements StreamDescription {
	/**
	 * The default value of the '{@link #getStreamName() <em>Stream Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreamName()
	 * @generated
	 * @ordered
	 */
	protected static final String STREAM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStreamName() <em>Stream Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreamName()
	 * @generated
	 * @ordered
	 */
	protected String streamName = STREAM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetamodelName() <em>Metamodel Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodelName()
	 * @generated
	 * @ordered
	 */
	protected static final String METAMODEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetamodelName() <em>Metamodel Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodelName()
	 * @generated
	 * @ordered
	 */
	protected String metamodelName = METAMODEL_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKeys() <em>Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<KeySpec> keys;

	/**
	 * The cached value of the '{@link #getWindows() <em>Windows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindows()
	 * @generated
	 * @ordered
	 */
	protected EList<SlidingWindow> windows;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StreamDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StreamdescPackage.Literals.STREAM_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStreamName() {
		return streamName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStreamName(String newStreamName) {
		String oldStreamName = streamName;
		streamName = newStreamName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamdescPackage.STREAM_DESCRIPTION__STREAM_NAME, oldStreamName, streamName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetamodelName() {
		return metamodelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetamodelName(String newMetamodelName) {
		String oldMetamodelName = metamodelName;
		metamodelName = newMetamodelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StreamdescPackage.STREAM_DESCRIPTION__METAMODEL_NAME, oldMetamodelName, metamodelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeySpec> getKeys() {
		if (keys == null) {
			keys = new EObjectContainmentEList<KeySpec>(KeySpec.class, this, StreamdescPackage.STREAM_DESCRIPTION__KEYS);
		}
		return keys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SlidingWindow> getWindows() {
		if (windows == null) {
			windows = new EObjectContainmentEList<SlidingWindow>(SlidingWindow.class, this, StreamdescPackage.STREAM_DESCRIPTION__WINDOWS);
		}
		return windows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StreamdescPackage.STREAM_DESCRIPTION__KEYS:
				return ((InternalEList<?>)getKeys()).basicRemove(otherEnd, msgs);
			case StreamdescPackage.STREAM_DESCRIPTION__WINDOWS:
				return ((InternalEList<?>)getWindows()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StreamdescPackage.STREAM_DESCRIPTION__STREAM_NAME:
				return getStreamName();
			case StreamdescPackage.STREAM_DESCRIPTION__METAMODEL_NAME:
				return getMetamodelName();
			case StreamdescPackage.STREAM_DESCRIPTION__KEYS:
				return getKeys();
			case StreamdescPackage.STREAM_DESCRIPTION__WINDOWS:
				return getWindows();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StreamdescPackage.STREAM_DESCRIPTION__STREAM_NAME:
				setStreamName((String)newValue);
				return;
			case StreamdescPackage.STREAM_DESCRIPTION__METAMODEL_NAME:
				setMetamodelName((String)newValue);
				return;
			case StreamdescPackage.STREAM_DESCRIPTION__KEYS:
				getKeys().clear();
				getKeys().addAll((Collection<? extends KeySpec>)newValue);
				return;
			case StreamdescPackage.STREAM_DESCRIPTION__WINDOWS:
				getWindows().clear();
				getWindows().addAll((Collection<? extends SlidingWindow>)newValue);
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
			case StreamdescPackage.STREAM_DESCRIPTION__STREAM_NAME:
				setStreamName(STREAM_NAME_EDEFAULT);
				return;
			case StreamdescPackage.STREAM_DESCRIPTION__METAMODEL_NAME:
				setMetamodelName(METAMODEL_NAME_EDEFAULT);
				return;
			case StreamdescPackage.STREAM_DESCRIPTION__KEYS:
				getKeys().clear();
				return;
			case StreamdescPackage.STREAM_DESCRIPTION__WINDOWS:
				getWindows().clear();
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
			case StreamdescPackage.STREAM_DESCRIPTION__STREAM_NAME:
				return STREAM_NAME_EDEFAULT == null ? streamName != null : !STREAM_NAME_EDEFAULT.equals(streamName);
			case StreamdescPackage.STREAM_DESCRIPTION__METAMODEL_NAME:
				return METAMODEL_NAME_EDEFAULT == null ? metamodelName != null : !METAMODEL_NAME_EDEFAULT.equals(metamodelName);
			case StreamdescPackage.STREAM_DESCRIPTION__KEYS:
				return keys != null && !keys.isEmpty();
			case StreamdescPackage.STREAM_DESCRIPTION__WINDOWS:
				return windows != null && !windows.isEmpty();
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
		result.append(" (streamName: ");
		result.append(streamName);
		result.append(", metamodelName: ");
		result.append(metamodelName);
		result.append(')');
		return result.toString();
	}

} //StreamDescriptionImpl
