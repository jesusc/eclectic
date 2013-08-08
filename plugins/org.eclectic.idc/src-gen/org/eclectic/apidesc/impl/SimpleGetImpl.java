/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.apidesc.impl;

import org.eclectic.apidesc.ApidescPackage;
import org.eclectic.apidesc.Method;
import org.eclectic.apidesc.SimpleGet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Get</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.apidesc.impl.SimpleGetImpl#getDebugName <em>Debug Name</em>}</li>
 *   <li>{@link org.eclectic.apidesc.impl.SimpleGetImpl#getGetter <em>Getter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleGetImpl extends GetMechanismImpl implements SimpleGet {
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
	 * The cached value of the '{@link #getGetter() <em>Getter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetter()
	 * @generated
	 * @ordered
	 */
	protected Method getter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleGetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApidescPackage.Literals.SIMPLE_GET;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApidescPackage.SIMPLE_GET__DEBUG_NAME, oldDebugName, debugName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getGetter() {
		return getter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetter(Method newGetter, NotificationChain msgs) {
		Method oldGetter = getter;
		getter = newGetter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApidescPackage.SIMPLE_GET__GETTER, oldGetter, newGetter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetter(Method newGetter) {
		if (newGetter != getter) {
			NotificationChain msgs = null;
			if (getter != null)
				msgs = ((InternalEObject)getter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApidescPackage.SIMPLE_GET__GETTER, null, msgs);
			if (newGetter != null)
				msgs = ((InternalEObject)newGetter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApidescPackage.SIMPLE_GET__GETTER, null, msgs);
			msgs = basicSetGetter(newGetter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApidescPackage.SIMPLE_GET__GETTER, newGetter, newGetter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApidescPackage.SIMPLE_GET__GETTER:
				return basicSetGetter(null, msgs);
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
			case ApidescPackage.SIMPLE_GET__DEBUG_NAME:
				return getDebugName();
			case ApidescPackage.SIMPLE_GET__GETTER:
				return getGetter();
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
			case ApidescPackage.SIMPLE_GET__DEBUG_NAME:
				setDebugName((String)newValue);
				return;
			case ApidescPackage.SIMPLE_GET__GETTER:
				setGetter((Method)newValue);
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
			case ApidescPackage.SIMPLE_GET__DEBUG_NAME:
				setDebugName(DEBUG_NAME_EDEFAULT);
				return;
			case ApidescPackage.SIMPLE_GET__GETTER:
				setGetter((Method)null);
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
			case ApidescPackage.SIMPLE_GET__DEBUG_NAME:
				return DEBUG_NAME_EDEFAULT == null ? debugName != null : !DEBUG_NAME_EDEFAULT.equals(debugName);
			case ApidescPackage.SIMPLE_GET__GETTER:
				return getter != null;
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
		result.append(')');
		return result.toString();
	}

} //SimpleGetImpl
