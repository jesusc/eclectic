/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.apidesc.impl;

import org.eclectic.apidesc.ApidescPackage;
import org.eclectic.apidesc.FeatureMapping;
import org.eclectic.apidesc.ReturnKind;
import org.eclectic.apidesc.SetFeature;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.apidesc.impl.SetFeatureImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.eclectic.apidesc.impl.SetFeatureImpl#getValueKind <em>Value Kind</em>}</li>
 *   <li>{@link org.eclectic.apidesc.impl.SetFeatureImpl#getStrValue <em>Str Value</em>}</li>
 *   <li>{@link org.eclectic.apidesc.impl.SetFeatureImpl#getIntValue <em>Int Value</em>}</li>
 *   <li>{@link org.eclectic.apidesc.impl.SetFeatureImpl#isBoolValue <em>Bool Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetFeatureImpl extends StatementImpl implements SetFeature {
	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected FeatureMapping feature;

	/**
	 * The default value of the '{@link #getValueKind() <em>Value Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueKind()
	 * @generated
	 * @ordered
	 */
	protected static final ReturnKind VALUE_KIND_EDEFAULT = ReturnKind.SINGLE_OBJECT;

	/**
	 * The cached value of the '{@link #getValueKind() <em>Value Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueKind()
	 * @generated
	 * @ordered
	 */
	protected ReturnKind valueKind = VALUE_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrValue() <em>Str Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrValue()
	 * @generated
	 * @ordered
	 */
	protected static final String STR_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStrValue() <em>Str Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrValue()
	 * @generated
	 * @ordered
	 */
	protected String strValue = STR_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntValue() <em>Int Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntValue()
	 * @generated
	 * @ordered
	 */
	protected static final int INT_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIntValue() <em>Int Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntValue()
	 * @generated
	 * @ordered
	 */
	protected int intValue = INT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isBoolValue() <em>Bool Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBoolValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOOL_VALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBoolValue() <em>Bool Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBoolValue()
	 * @generated
	 * @ordered
	 */
	protected boolean boolValue = BOOL_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApidescPackage.Literals.SET_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMapping getFeature() {
		if (feature != null && feature.eIsProxy()) {
			InternalEObject oldFeature = (InternalEObject)feature;
			feature = (FeatureMapping)eResolveProxy(oldFeature);
			if (feature != oldFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApidescPackage.SET_FEATURE__FEATURE, oldFeature, feature));
			}
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMapping basicGetFeature() {
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature(FeatureMapping newFeature) {
		FeatureMapping oldFeature = feature;
		feature = newFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApidescPackage.SET_FEATURE__FEATURE, oldFeature, feature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnKind getValueKind() {
		return valueKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueKind(ReturnKind newValueKind) {
		ReturnKind oldValueKind = valueKind;
		valueKind = newValueKind == null ? VALUE_KIND_EDEFAULT : newValueKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApidescPackage.SET_FEATURE__VALUE_KIND, oldValueKind, valueKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStrValue() {
		return strValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrValue(String newStrValue) {
		String oldStrValue = strValue;
		strValue = newStrValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApidescPackage.SET_FEATURE__STR_VALUE, oldStrValue, strValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIntValue() {
		return intValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntValue(int newIntValue) {
		int oldIntValue = intValue;
		intValue = newIntValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApidescPackage.SET_FEATURE__INT_VALUE, oldIntValue, intValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBoolValue() {
		return boolValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoolValue(boolean newBoolValue) {
		boolean oldBoolValue = boolValue;
		boolValue = newBoolValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApidescPackage.SET_FEATURE__BOOL_VALUE, oldBoolValue, boolValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApidescPackage.SET_FEATURE__FEATURE:
				if (resolve) return getFeature();
				return basicGetFeature();
			case ApidescPackage.SET_FEATURE__VALUE_KIND:
				return getValueKind();
			case ApidescPackage.SET_FEATURE__STR_VALUE:
				return getStrValue();
			case ApidescPackage.SET_FEATURE__INT_VALUE:
				return getIntValue();
			case ApidescPackage.SET_FEATURE__BOOL_VALUE:
				return isBoolValue();
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
			case ApidescPackage.SET_FEATURE__FEATURE:
				setFeature((FeatureMapping)newValue);
				return;
			case ApidescPackage.SET_FEATURE__VALUE_KIND:
				setValueKind((ReturnKind)newValue);
				return;
			case ApidescPackage.SET_FEATURE__STR_VALUE:
				setStrValue((String)newValue);
				return;
			case ApidescPackage.SET_FEATURE__INT_VALUE:
				setIntValue((Integer)newValue);
				return;
			case ApidescPackage.SET_FEATURE__BOOL_VALUE:
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
			case ApidescPackage.SET_FEATURE__FEATURE:
				setFeature((FeatureMapping)null);
				return;
			case ApidescPackage.SET_FEATURE__VALUE_KIND:
				setValueKind(VALUE_KIND_EDEFAULT);
				return;
			case ApidescPackage.SET_FEATURE__STR_VALUE:
				setStrValue(STR_VALUE_EDEFAULT);
				return;
			case ApidescPackage.SET_FEATURE__INT_VALUE:
				setIntValue(INT_VALUE_EDEFAULT);
				return;
			case ApidescPackage.SET_FEATURE__BOOL_VALUE:
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
			case ApidescPackage.SET_FEATURE__FEATURE:
				return feature != null;
			case ApidescPackage.SET_FEATURE__VALUE_KIND:
				return valueKind != VALUE_KIND_EDEFAULT;
			case ApidescPackage.SET_FEATURE__STR_VALUE:
				return STR_VALUE_EDEFAULT == null ? strValue != null : !STR_VALUE_EDEFAULT.equals(strValue);
			case ApidescPackage.SET_FEATURE__INT_VALUE:
				return intValue != INT_VALUE_EDEFAULT;
			case ApidescPackage.SET_FEATURE__BOOL_VALUE:
				return boolValue != BOOL_VALUE_EDEFAULT;
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
		result.append(" (valueKind: ");
		result.append(valueKind);
		result.append(", strValue: ");
		result.append(strValue);
		result.append(", intValue: ");
		result.append(intValue);
		result.append(", boolValue: ");
		result.append(boolValue);
		result.append(')');
		return result.toString();
	}

} //SetFeatureImpl
