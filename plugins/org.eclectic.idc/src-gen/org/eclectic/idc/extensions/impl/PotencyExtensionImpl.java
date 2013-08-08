/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.extensions.impl;

import org.eclectic.idc.extensions.ExtensionsPackage;
import org.eclectic.idc.extensions.PotencyExtension;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Potency Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.idc.extensions.impl.PotencyExtensionImpl#getPotency <em>Potency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PotencyExtensionImpl extends ExtensionImpl implements PotencyExtension {
	/**
	 * The default value of the '{@link #getPotency() <em>Potency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPotency()
	 * @generated
	 * @ordered
	 */
	protected static final Integer POTENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPotency() <em>Potency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPotency()
	 * @generated
	 * @ordered
	 */
	protected Integer potency = POTENCY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PotencyExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtensionsPackage.Literals.POTENCY_EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPotency() {
		return potency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPotency(Integer newPotency) {
		Integer oldPotency = potency;
		potency = newPotency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtensionsPackage.POTENCY_EXTENSION__POTENCY, oldPotency, potency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtensionsPackage.POTENCY_EXTENSION__POTENCY:
				return getPotency();
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
			case ExtensionsPackage.POTENCY_EXTENSION__POTENCY:
				setPotency((Integer)newValue);
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
			case ExtensionsPackage.POTENCY_EXTENSION__POTENCY:
				setPotency(POTENCY_EDEFAULT);
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
			case ExtensionsPackage.POTENCY_EXTENSION__POTENCY:
				return POTENCY_EDEFAULT == null ? potency != null : !POTENCY_EDEFAULT.equals(potency);
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
		result.append(" (potency: ");
		result.append(potency);
		result.append(')');
		return result.toString();
	}

} //PotencyExtensionImpl
