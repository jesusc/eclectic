/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.apidesc.impl;

import org.eclectic.apidesc.ApidescPackage;
import org.eclectic.apidesc.FeatureMapping;

import org.eclectic.apidesc.GetMechanism;
import org.eclectic.apidesc.SetMechanism;
import org.eclectic.apidesc.Method;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.apidesc.impl.FeatureMappingImpl#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link org.eclectic.apidesc.impl.FeatureMappingImpl#getConstructorType <em>Constructor Type</em>}</li>
 *   <li>{@link org.eclectic.apidesc.impl.FeatureMappingImpl#getSetMethod <em>Set Method</em>}</li>
 *   <li>{@link org.eclectic.apidesc.impl.FeatureMappingImpl#getGetMethod <em>Get Method</em>}</li>
 *   <li>{@link org.eclectic.apidesc.impl.FeatureMappingImpl#isIsMultivalued <em>Is Multivalued</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FeatureMappingImpl extends EObjectImpl implements FeatureMapping {
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
	 * The default value of the '{@link #getConstructorType() <em>Constructor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructorType()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRUCTOR_TYPE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getConstructorType() <em>Constructor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructorType()
	 * @generated
	 * @ordered
	 */
	protected String constructorType = CONSTRUCTOR_TYPE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getSetMethod() <em>Set Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetMethod()
	 * @generated
	 * @ordered
	 */
	protected SetMechanism setMethod;
	/**
	 * The cached value of the '{@link #getGetMethod() <em>Get Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetMethod()
	 * @generated
	 * @ordered
	 */
	protected GetMechanism getMethod;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApidescPackage.Literals.FEATURE_MAPPING;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApidescPackage.FEATURE_MAPPING__FEATURE_NAME, oldFeatureName, featureName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstructorType() {
		return constructorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstructorType(String newConstructorType) {
		String oldConstructorType = constructorType;
		constructorType = newConstructorType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApidescPackage.FEATURE_MAPPING__CONSTRUCTOR_TYPE, oldConstructorType, constructorType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetMechanism getSetMethod() {
		return setMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetMethod(SetMechanism newSetMethod, NotificationChain msgs) {
		SetMechanism oldSetMethod = setMethod;
		setMethod = newSetMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApidescPackage.FEATURE_MAPPING__SET_METHOD, oldSetMethod, newSetMethod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetMethod(SetMechanism newSetMethod) {
		if (newSetMethod != setMethod) {
			NotificationChain msgs = null;
			if (setMethod != null)
				msgs = ((InternalEObject)setMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApidescPackage.FEATURE_MAPPING__SET_METHOD, null, msgs);
			if (newSetMethod != null)
				msgs = ((InternalEObject)newSetMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApidescPackage.FEATURE_MAPPING__SET_METHOD, null, msgs);
			msgs = basicSetSetMethod(newSetMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApidescPackage.FEATURE_MAPPING__SET_METHOD, newSetMethod, newSetMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetMechanism getGetMethod() {
		return getMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetMethod(GetMechanism newGetMethod, NotificationChain msgs) {
		GetMechanism oldGetMethod = getMethod;
		getMethod = newGetMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApidescPackage.FEATURE_MAPPING__GET_METHOD, oldGetMethod, newGetMethod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetMethod(GetMechanism newGetMethod) {
		if (newGetMethod != getMethod) {
			NotificationChain msgs = null;
			if (getMethod != null)
				msgs = ((InternalEObject)getMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApidescPackage.FEATURE_MAPPING__GET_METHOD, null, msgs);
			if (newGetMethod != null)
				msgs = ((InternalEObject)newGetMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApidescPackage.FEATURE_MAPPING__GET_METHOD, null, msgs);
			msgs = basicSetGetMethod(newGetMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApidescPackage.FEATURE_MAPPING__GET_METHOD, newGetMethod, newGetMethod));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApidescPackage.FEATURE_MAPPING__IS_MULTIVALUED, oldIsMultivalued, isMultivalued));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApidescPackage.FEATURE_MAPPING__SET_METHOD:
				return basicSetSetMethod(null, msgs);
			case ApidescPackage.FEATURE_MAPPING__GET_METHOD:
				return basicSetGetMethod(null, msgs);
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
			case ApidescPackage.FEATURE_MAPPING__FEATURE_NAME:
				return getFeatureName();
			case ApidescPackage.FEATURE_MAPPING__CONSTRUCTOR_TYPE:
				return getConstructorType();
			case ApidescPackage.FEATURE_MAPPING__SET_METHOD:
				return getSetMethod();
			case ApidescPackage.FEATURE_MAPPING__GET_METHOD:
				return getGetMethod();
			case ApidescPackage.FEATURE_MAPPING__IS_MULTIVALUED:
				return isIsMultivalued();
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
			case ApidescPackage.FEATURE_MAPPING__FEATURE_NAME:
				setFeatureName((String)newValue);
				return;
			case ApidescPackage.FEATURE_MAPPING__CONSTRUCTOR_TYPE:
				setConstructorType((String)newValue);
				return;
			case ApidescPackage.FEATURE_MAPPING__SET_METHOD:
				setSetMethod((SetMechanism)newValue);
				return;
			case ApidescPackage.FEATURE_MAPPING__GET_METHOD:
				setGetMethod((GetMechanism)newValue);
				return;
			case ApidescPackage.FEATURE_MAPPING__IS_MULTIVALUED:
				setIsMultivalued((Boolean)newValue);
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
			case ApidescPackage.FEATURE_MAPPING__FEATURE_NAME:
				setFeatureName(FEATURE_NAME_EDEFAULT);
				return;
			case ApidescPackage.FEATURE_MAPPING__CONSTRUCTOR_TYPE:
				setConstructorType(CONSTRUCTOR_TYPE_EDEFAULT);
				return;
			case ApidescPackage.FEATURE_MAPPING__SET_METHOD:
				setSetMethod((SetMechanism)null);
				return;
			case ApidescPackage.FEATURE_MAPPING__GET_METHOD:
				setGetMethod((GetMechanism)null);
				return;
			case ApidescPackage.FEATURE_MAPPING__IS_MULTIVALUED:
				setIsMultivalued(IS_MULTIVALUED_EDEFAULT);
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
			case ApidescPackage.FEATURE_MAPPING__FEATURE_NAME:
				return FEATURE_NAME_EDEFAULT == null ? featureName != null : !FEATURE_NAME_EDEFAULT.equals(featureName);
			case ApidescPackage.FEATURE_MAPPING__CONSTRUCTOR_TYPE:
				return CONSTRUCTOR_TYPE_EDEFAULT == null ? constructorType != null : !CONSTRUCTOR_TYPE_EDEFAULT.equals(constructorType);
			case ApidescPackage.FEATURE_MAPPING__SET_METHOD:
				return setMethod != null;
			case ApidescPackage.FEATURE_MAPPING__GET_METHOD:
				return getMethod != null;
			case ApidescPackage.FEATURE_MAPPING__IS_MULTIVALUED:
				return isMultivalued != IS_MULTIVALUED_EDEFAULT;
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
		result.append(", constructorType: ");
		result.append(constructorType);
		result.append(", isMultivalued: ");
		result.append(isMultivalued);
		result.append(')');
		return result.toString();
	}

} //FeatureMappingImpl
