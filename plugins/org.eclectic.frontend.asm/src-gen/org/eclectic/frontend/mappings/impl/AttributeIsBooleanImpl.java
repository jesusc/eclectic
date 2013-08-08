/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.mappings.impl;

import org.eclectic.frontend.mappings.AttributeIsBoolean;
import org.eclectic.frontend.mappings.MappingsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Is Boolean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.frontend.mappings.impl.AttributeIsBooleanImpl#getBoolValue <em>Bool Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeIsBooleanImpl extends AttributeRightPartImpl implements AttributeIsBoolean {
	/**
	 * The default value of the '{@link #getBoolValue() <em>Bool Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoolValue()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean BOOL_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoolValue() <em>Bool Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoolValue()
	 * @generated
	 * @ordered
	 */
	protected Boolean boolValue = BOOL_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeIsBooleanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingsPackage.Literals.ATTRIBUTE_IS_BOOLEAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getBoolValue() {
		return boolValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoolValue(Boolean newBoolValue) {
		Boolean oldBoolValue = boolValue;
		boolValue = newBoolValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingsPackage.ATTRIBUTE_IS_BOOLEAN__BOOL_VALUE, oldBoolValue, boolValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MappingsPackage.ATTRIBUTE_IS_BOOLEAN__BOOL_VALUE:
				return getBoolValue();
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
			case MappingsPackage.ATTRIBUTE_IS_BOOLEAN__BOOL_VALUE:
				setBoolValue((Boolean)newValue);
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
			case MappingsPackage.ATTRIBUTE_IS_BOOLEAN__BOOL_VALUE:
				setBoolValue(BOOL_VALUE_EDEFAULT);
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
			case MappingsPackage.ATTRIBUTE_IS_BOOLEAN__BOOL_VALUE:
				return BOOL_VALUE_EDEFAULT == null ? boolValue != null : !BOOL_VALUE_EDEFAULT.equals(boolValue);
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
		result.append(" (boolValue: ");
		result.append(boolValue);
		result.append(')');
		return result.toString();
	}

} //AttributeIsBooleanImpl
