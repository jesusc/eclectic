/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.qool.impl;

import org.eclectic.idc.qool.AccessByFeatureOptimization;
import org.eclectic.idc.qool.QoolPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access By Feature Optimization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.idc.qool.impl.AccessByFeatureOptimizationImpl#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link org.eclectic.idc.qool.impl.AccessByFeatureOptimizationImpl#isSpeculative <em>Speculative</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AccessByFeatureOptimizationImpl extends QueueOptimizationImpl implements AccessByFeatureOptimization {
	/**
	 * The default value of the '{@link #getFeatureName() <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureName()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeatureName() <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureName()
	 * @generated
	 * @ordered
	 */
	protected String featureName = FEATURE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isSpeculative() <em>Speculative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSpeculative()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SPECULATIVE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSpeculative() <em>Speculative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSpeculative()
	 * @generated
	 * @ordered
	 */
	protected boolean speculative = SPECULATIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessByFeatureOptimizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QoolPackage.Literals.ACCESS_BY_FEATURE_OPTIMIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeatureName() {
		return featureName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureName(String newFeatureName) {
		String oldFeatureName = featureName;
		featureName = newFeatureName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QoolPackage.ACCESS_BY_FEATURE_OPTIMIZATION__FEATURE_NAME, oldFeatureName, featureName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSpeculative() {
		return speculative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeculative(boolean newSpeculative) {
		boolean oldSpeculative = speculative;
		speculative = newSpeculative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QoolPackage.ACCESS_BY_FEATURE_OPTIMIZATION__SPECULATIVE, oldSpeculative, speculative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QoolPackage.ACCESS_BY_FEATURE_OPTIMIZATION__FEATURE_NAME:
				return getFeatureName();
			case QoolPackage.ACCESS_BY_FEATURE_OPTIMIZATION__SPECULATIVE:
				return isSpeculative();
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
			case QoolPackage.ACCESS_BY_FEATURE_OPTIMIZATION__FEATURE_NAME:
				setFeatureName((String)newValue);
				return;
			case QoolPackage.ACCESS_BY_FEATURE_OPTIMIZATION__SPECULATIVE:
				setSpeculative((Boolean)newValue);
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
			case QoolPackage.ACCESS_BY_FEATURE_OPTIMIZATION__FEATURE_NAME:
				setFeatureName(FEATURE_NAME_EDEFAULT);
				return;
			case QoolPackage.ACCESS_BY_FEATURE_OPTIMIZATION__SPECULATIVE:
				setSpeculative(SPECULATIVE_EDEFAULT);
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
			case QoolPackage.ACCESS_BY_FEATURE_OPTIMIZATION__FEATURE_NAME:
				return FEATURE_NAME_EDEFAULT == null ? featureName != null : !FEATURE_NAME_EDEFAULT.equals(featureName);
			case QoolPackage.ACCESS_BY_FEATURE_OPTIMIZATION__SPECULATIVE:
				return speculative != SPECULATIVE_EDEFAULT;
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
		result.append(" (featureName: ");
		result.append(featureName);
		result.append(", speculative: ");
		result.append(speculative);
		result.append(')');
		return result.toString();
	}

} //AccessByFeatureOptimizationImpl
