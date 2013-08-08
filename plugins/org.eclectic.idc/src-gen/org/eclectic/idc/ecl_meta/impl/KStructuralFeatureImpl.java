/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.ecl_meta.impl;

import org.eclectic.idc.ecl_meta.Ecl_metaPackage;
import org.eclectic.idc.ecl_meta.KClassifier;
import org.eclectic.idc.ecl_meta.KStructuralFeature;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KStructural Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.idc.ecl_meta.impl.KStructuralFeatureImpl#isIsMultivalued <em>Is Multivalued</em>}</li>
 *   <li>{@link org.eclectic.idc.ecl_meta.impl.KStructuralFeatureImpl#getKtype <em>Ktype</em>}</li>
 *   <li>{@link org.eclectic.idc.ecl_meta.impl.KStructuralFeatureImpl#getKtypeName <em>Ktype Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class KStructuralFeatureImpl extends NamedElementImpl implements KStructuralFeature {
	/**
	 * The default value of the '{@link #isIsMultivalued() <em>Is Multivalued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMultivalued()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MULTIVALUED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMultivalued() <em>Is Multivalued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMultivalued()
	 * @generated
	 * @ordered
	 */
	protected boolean isMultivalued = IS_MULTIVALUED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKtype() <em>Ktype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKtype()
	 * @generated
	 * @ordered
	 */
	protected KClassifier ktype;

	/**
	 * The default value of the '{@link #getKtypeName() <em>Ktype Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKtypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String KTYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKtypeName() <em>Ktype Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKtypeName()
	 * @generated
	 * @ordered
	 */
	protected String ktypeName = KTYPE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KStructuralFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ecl_metaPackage.Literals.KSTRUCTURAL_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMultivalued() {
		return isMultivalued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMultivalued(boolean newIsMultivalued) {
		boolean oldIsMultivalued = isMultivalued;
		isMultivalued = newIsMultivalued;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ecl_metaPackage.KSTRUCTURAL_FEATURE__IS_MULTIVALUED, oldIsMultivalued, isMultivalued));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KClassifier getKtype() {
		if (ktype != null && ktype.eIsProxy()) {
			InternalEObject oldKtype = (InternalEObject)ktype;
			ktype = (KClassifier)eResolveProxy(oldKtype);
			if (ktype != oldKtype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ecl_metaPackage.KSTRUCTURAL_FEATURE__KTYPE, oldKtype, ktype));
			}
		}
		return ktype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KClassifier basicGetKtype() {
		return ktype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKtype(KClassifier newKtype) {
		KClassifier oldKtype = ktype;
		ktype = newKtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ecl_metaPackage.KSTRUCTURAL_FEATURE__KTYPE, oldKtype, ktype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKtypeName() {
		return ktypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKtypeName(String newKtypeName) {
		String oldKtypeName = ktypeName;
		ktypeName = newKtypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ecl_metaPackage.KSTRUCTURAL_FEATURE__KTYPE_NAME, oldKtypeName, ktypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ecl_metaPackage.KSTRUCTURAL_FEATURE__IS_MULTIVALUED:
				return isIsMultivalued();
			case Ecl_metaPackage.KSTRUCTURAL_FEATURE__KTYPE:
				if (resolve) return getKtype();
				return basicGetKtype();
			case Ecl_metaPackage.KSTRUCTURAL_FEATURE__KTYPE_NAME:
				return getKtypeName();
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
			case Ecl_metaPackage.KSTRUCTURAL_FEATURE__IS_MULTIVALUED:
				setIsMultivalued((Boolean)newValue);
				return;
			case Ecl_metaPackage.KSTRUCTURAL_FEATURE__KTYPE:
				setKtype((KClassifier)newValue);
				return;
			case Ecl_metaPackage.KSTRUCTURAL_FEATURE__KTYPE_NAME:
				setKtypeName((String)newValue);
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
			case Ecl_metaPackage.KSTRUCTURAL_FEATURE__IS_MULTIVALUED:
				setIsMultivalued(IS_MULTIVALUED_EDEFAULT);
				return;
			case Ecl_metaPackage.KSTRUCTURAL_FEATURE__KTYPE:
				setKtype((KClassifier)null);
				return;
			case Ecl_metaPackage.KSTRUCTURAL_FEATURE__KTYPE_NAME:
				setKtypeName(KTYPE_NAME_EDEFAULT);
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
			case Ecl_metaPackage.KSTRUCTURAL_FEATURE__IS_MULTIVALUED:
				return isMultivalued != IS_MULTIVALUED_EDEFAULT;
			case Ecl_metaPackage.KSTRUCTURAL_FEATURE__KTYPE:
				return ktype != null;
			case Ecl_metaPackage.KSTRUCTURAL_FEATURE__KTYPE_NAME:
				return KTYPE_NAME_EDEFAULT == null ? ktypeName != null : !KTYPE_NAME_EDEFAULT.equals(ktypeName);
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
		result.append(" (isMultivalued: ");
		result.append(isMultivalued);
		result.append(", ktypeName: ");
		result.append(ktypeName);
		result.append(')');
		return result.toString();
	}

} //KStructuralFeatureImpl
