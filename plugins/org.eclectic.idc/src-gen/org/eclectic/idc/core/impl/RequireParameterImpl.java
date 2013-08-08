/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.core.impl;

import org.eclectic.idc.core.CorePackage;
import org.eclectic.idc.core.RequireParameter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Require Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.idc.core.impl.RequireParameterImpl#getFormalParameterName <em>Formal Parameter Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RequireParameterImpl extends EObjectImpl implements RequireParameter {
	/**
	 * The default value of the '{@link #getFormalParameterName() <em>Formal Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormalParameterName()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAL_PARAMETER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormalParameterName() <em>Formal Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormalParameterName()
	 * @generated
	 * @ordered
	 */
	protected String formalParameterName = FORMAL_PARAMETER_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequireParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.REQUIRE_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormalParameterName() {
		return formalParameterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormalParameterName(String newFormalParameterName) {
		String oldFormalParameterName = formalParameterName;
		formalParameterName = newFormalParameterName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.REQUIRE_PARAMETER__FORMAL_PARAMETER_NAME, oldFormalParameterName, formalParameterName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.REQUIRE_PARAMETER__FORMAL_PARAMETER_NAME:
				return getFormalParameterName();
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
			case CorePackage.REQUIRE_PARAMETER__FORMAL_PARAMETER_NAME:
				setFormalParameterName((String)newValue);
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
			case CorePackage.REQUIRE_PARAMETER__FORMAL_PARAMETER_NAME:
				setFormalParameterName(FORMAL_PARAMETER_NAME_EDEFAULT);
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
			case CorePackage.REQUIRE_PARAMETER__FORMAL_PARAMETER_NAME:
				return FORMAL_PARAMETER_NAME_EDEFAULT == null ? formalParameterName != null : !FORMAL_PARAMETER_NAME_EDEFAULT.equals(formalParameterName);
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
		result.append(" (formalParameterName: ");
		result.append(formalParameterName);
		result.append(')');
		return result.toString();
	}

} //RequireParameterImpl
