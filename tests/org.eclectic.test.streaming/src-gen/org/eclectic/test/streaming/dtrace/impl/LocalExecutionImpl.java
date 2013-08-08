/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.test.streaming.dtrace.impl;

import org.eclectic.test.streaming.dtrace.DTracePackage;
import org.eclectic.test.streaming.dtrace.LocalExecution;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Execution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.test.streaming.dtrace.impl.LocalExecutionImpl#isIsCreate <em>Is Create</em>}</li>
 *   <li>{@link org.eclectic.test.streaming.dtrace.impl.LocalExecutionImpl#isIsDestroy <em>Is Destroy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocalExecutionImpl extends MethodExecutionImpl implements LocalExecution {
	/**
	 * The default value of the '{@link #isIsCreate() <em>Is Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCreate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CREATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCreate() <em>Is Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCreate()
	 * @generated
	 * @ordered
	 */
	protected boolean isCreate = IS_CREATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDestroy() <em>Is Destroy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDestroy()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DESTROY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDestroy() <em>Is Destroy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDestroy()
	 * @generated
	 * @ordered
	 */
	protected boolean isDestroy = IS_DESTROY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalExecutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DTracePackage.Literals.LOCAL_EXECUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCreate() {
		return isCreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCreate(boolean newIsCreate) {
		boolean oldIsCreate = isCreate;
		isCreate = newIsCreate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DTracePackage.LOCAL_EXECUTION__IS_CREATE, oldIsCreate, isCreate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDestroy() {
		return isDestroy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDestroy(boolean newIsDestroy) {
		boolean oldIsDestroy = isDestroy;
		isDestroy = newIsDestroy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DTracePackage.LOCAL_EXECUTION__IS_DESTROY, oldIsDestroy, isDestroy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DTracePackage.LOCAL_EXECUTION__IS_CREATE:
				return isIsCreate();
			case DTracePackage.LOCAL_EXECUTION__IS_DESTROY:
				return isIsDestroy();
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
			case DTracePackage.LOCAL_EXECUTION__IS_CREATE:
				setIsCreate((Boolean)newValue);
				return;
			case DTracePackage.LOCAL_EXECUTION__IS_DESTROY:
				setIsDestroy((Boolean)newValue);
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
			case DTracePackage.LOCAL_EXECUTION__IS_CREATE:
				setIsCreate(IS_CREATE_EDEFAULT);
				return;
			case DTracePackage.LOCAL_EXECUTION__IS_DESTROY:
				setIsDestroy(IS_DESTROY_EDEFAULT);
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
			case DTracePackage.LOCAL_EXECUTION__IS_CREATE:
				return isCreate != IS_CREATE_EDEFAULT;
			case DTracePackage.LOCAL_EXECUTION__IS_DESTROY:
				return isDestroy != IS_DESTROY_EDEFAULT;
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
		result.append(" (isCreate: ");
		result.append(isCreate);
		result.append(", isDestroy: ");
		result.append(isDestroy);
		result.append(')');
		return result.toString();
	}

} //LocalExecutionImpl
