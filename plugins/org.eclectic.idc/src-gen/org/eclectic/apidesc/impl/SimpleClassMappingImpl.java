/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.apidesc.impl;

import java.util.Collection;
import org.eclectic.apidesc.ApidescPackage;
import org.eclectic.apidesc.CreationMechanism;
import org.eclectic.apidesc.FeatureMapping;
import org.eclectic.apidesc.SimpleClassMapping;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Class Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.apidesc.impl.SimpleClassMappingImpl#getMetaclassName <em>Metaclass Name</em>}</li>
 *   <li>{@link org.eclectic.apidesc.impl.SimpleClassMappingImpl#getCanonicalClassName <em>Canonical Class Name</em>}</li>
 *   <li>{@link org.eclectic.apidesc.impl.SimpleClassMappingImpl#getFeatureMappings <em>Feature Mappings</em>}</li>
 *   <li>{@link org.eclectic.apidesc.impl.SimpleClassMappingImpl#getCreation <em>Creation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleClassMappingImpl extends ClassMappingImpl implements SimpleClassMapping {
	/**
	 * The default value of the '{@link #getMetaclassName() <em>Metaclass Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaclassName()
	 * @generated
	 * @ordered
	 */
	protected static final String METACLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetaclassName() <em>Metaclass Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaclassName()
	 * @generated
	 * @ordered
	 */
	protected String metaclassName = METACLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCanonicalClassName() <em>Canonical Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanonicalClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CANONICAL_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCanonicalClassName() <em>Canonical Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanonicalClassName()
	 * @generated
	 * @ordered
	 */
	protected String canonicalClassName = CANONICAL_CLASS_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeatureMappings() <em>Feature Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureMapping> featureMappings;

	/**
	 * The cached value of the '{@link #getCreation() <em>Creation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreation()
	 * @generated
	 * @ordered
	 */
	protected CreationMechanism creation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleClassMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApidescPackage.Literals.SIMPLE_CLASS_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetaclassName() {
		return metaclassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaclassName(String newMetaclassName) {
		String oldMetaclassName = metaclassName;
		metaclassName = newMetaclassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApidescPackage.SIMPLE_CLASS_MAPPING__METACLASS_NAME, oldMetaclassName, metaclassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCanonicalClassName() {
		return canonicalClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanonicalClassName(String newCanonicalClassName) {
		String oldCanonicalClassName = canonicalClassName;
		canonicalClassName = newCanonicalClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApidescPackage.SIMPLE_CLASS_MAPPING__CANONICAL_CLASS_NAME, oldCanonicalClassName, canonicalClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureMapping> getFeatureMappings() {
		if (featureMappings == null) {
			featureMappings = new EObjectContainmentEList<FeatureMapping>(FeatureMapping.class, this, ApidescPackage.SIMPLE_CLASS_MAPPING__FEATURE_MAPPINGS);
		}
		return featureMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreationMechanism getCreation() {
		return creation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreation(CreationMechanism newCreation, NotificationChain msgs) {
		CreationMechanism oldCreation = creation;
		creation = newCreation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApidescPackage.SIMPLE_CLASS_MAPPING__CREATION, oldCreation, newCreation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreation(CreationMechanism newCreation) {
		if (newCreation != creation) {
			NotificationChain msgs = null;
			if (creation != null)
				msgs = ((InternalEObject)creation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApidescPackage.SIMPLE_CLASS_MAPPING__CREATION, null, msgs);
			if (newCreation != null)
				msgs = ((InternalEObject)newCreation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApidescPackage.SIMPLE_CLASS_MAPPING__CREATION, null, msgs);
			msgs = basicSetCreation(newCreation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApidescPackage.SIMPLE_CLASS_MAPPING__CREATION, newCreation, newCreation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApidescPackage.SIMPLE_CLASS_MAPPING__FEATURE_MAPPINGS:
				return ((InternalEList<?>)getFeatureMappings()).basicRemove(otherEnd, msgs);
			case ApidescPackage.SIMPLE_CLASS_MAPPING__CREATION:
				return basicSetCreation(null, msgs);
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
			case ApidescPackage.SIMPLE_CLASS_MAPPING__METACLASS_NAME:
				return getMetaclassName();
			case ApidescPackage.SIMPLE_CLASS_MAPPING__CANONICAL_CLASS_NAME:
				return getCanonicalClassName();
			case ApidescPackage.SIMPLE_CLASS_MAPPING__FEATURE_MAPPINGS:
				return getFeatureMappings();
			case ApidescPackage.SIMPLE_CLASS_MAPPING__CREATION:
				return getCreation();
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
			case ApidescPackage.SIMPLE_CLASS_MAPPING__METACLASS_NAME:
				setMetaclassName((String)newValue);
				return;
			case ApidescPackage.SIMPLE_CLASS_MAPPING__CANONICAL_CLASS_NAME:
				setCanonicalClassName((String)newValue);
				return;
			case ApidescPackage.SIMPLE_CLASS_MAPPING__FEATURE_MAPPINGS:
				getFeatureMappings().clear();
				getFeatureMappings().addAll((Collection<? extends FeatureMapping>)newValue);
				return;
			case ApidescPackage.SIMPLE_CLASS_MAPPING__CREATION:
				setCreation((CreationMechanism)newValue);
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
			case ApidescPackage.SIMPLE_CLASS_MAPPING__METACLASS_NAME:
				setMetaclassName(METACLASS_NAME_EDEFAULT);
				return;
			case ApidescPackage.SIMPLE_CLASS_MAPPING__CANONICAL_CLASS_NAME:
				setCanonicalClassName(CANONICAL_CLASS_NAME_EDEFAULT);
				return;
			case ApidescPackage.SIMPLE_CLASS_MAPPING__FEATURE_MAPPINGS:
				getFeatureMappings().clear();
				return;
			case ApidescPackage.SIMPLE_CLASS_MAPPING__CREATION:
				setCreation((CreationMechanism)null);
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
			case ApidescPackage.SIMPLE_CLASS_MAPPING__METACLASS_NAME:
				return METACLASS_NAME_EDEFAULT == null ? metaclassName != null : !METACLASS_NAME_EDEFAULT.equals(metaclassName);
			case ApidescPackage.SIMPLE_CLASS_MAPPING__CANONICAL_CLASS_NAME:
				return CANONICAL_CLASS_NAME_EDEFAULT == null ? canonicalClassName != null : !CANONICAL_CLASS_NAME_EDEFAULT.equals(canonicalClassName);
			case ApidescPackage.SIMPLE_CLASS_MAPPING__FEATURE_MAPPINGS:
				return featureMappings != null && !featureMappings.isEmpty();
			case ApidescPackage.SIMPLE_CLASS_MAPPING__CREATION:
				return creation != null;
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
		result.append(" (metaclassName: ");
		result.append(metaclassName);
		result.append(", canonicalClassName: ");
		result.append(canonicalClassName);
		result.append(')');
		return result.toString();
	}

} //SimpleClassMappingImpl
