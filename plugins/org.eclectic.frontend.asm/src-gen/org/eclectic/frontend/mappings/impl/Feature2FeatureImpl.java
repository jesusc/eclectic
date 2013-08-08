/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.mappings.impl;

import org.eclectic.frontend.mappings.Converter;
import org.eclectic.frontend.mappings.Feature2Feature;
import org.eclectic.frontend.mappings.FeatureRef;
import org.eclectic.frontend.mappings.MappingsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature2 Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.frontend.mappings.impl.Feature2FeatureImpl#getLeftFeature <em>Left Feature</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.impl.Feature2FeatureImpl#getConverter <em>Converter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class Feature2FeatureImpl extends MappingElementImpl implements Feature2Feature {
	/**
	 * The cached value of the '{@link #getLeftFeature() <em>Left Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftFeature()
	 * @generated
	 * @ordered
	 */
	protected FeatureRef leftFeature;
	/**
	 * The cached value of the '{@link #getConverter() <em>Converter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConverter()
	 * @generated
	 * @ordered
	 */
	protected Converter converter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Feature2FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingsPackage.Literals.FEATURE2_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureRef getLeftFeature() {
		return leftFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftFeature(FeatureRef newLeftFeature, NotificationChain msgs) {
		FeatureRef oldLeftFeature = leftFeature;
		leftFeature = newLeftFeature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MappingsPackage.FEATURE2_FEATURE__LEFT_FEATURE, oldLeftFeature, newLeftFeature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftFeature(FeatureRef newLeftFeature) {
		if (newLeftFeature != leftFeature) {
			NotificationChain msgs = null;
			if (leftFeature != null)
				msgs = ((InternalEObject)leftFeature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MappingsPackage.FEATURE2_FEATURE__LEFT_FEATURE, null, msgs);
			if (newLeftFeature != null)
				msgs = ((InternalEObject)newLeftFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MappingsPackage.FEATURE2_FEATURE__LEFT_FEATURE, null, msgs);
			msgs = basicSetLeftFeature(newLeftFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingsPackage.FEATURE2_FEATURE__LEFT_FEATURE, newLeftFeature, newLeftFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Converter getConverter() {
		return converter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConverter(Converter newConverter, NotificationChain msgs) {
		Converter oldConverter = converter;
		converter = newConverter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MappingsPackage.FEATURE2_FEATURE__CONVERTER, oldConverter, newConverter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConverter(Converter newConverter) {
		if (newConverter != converter) {
			NotificationChain msgs = null;
			if (converter != null)
				msgs = ((InternalEObject)converter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MappingsPackage.FEATURE2_FEATURE__CONVERTER, null, msgs);
			if (newConverter != null)
				msgs = ((InternalEObject)newConverter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MappingsPackage.FEATURE2_FEATURE__CONVERTER, null, msgs);
			msgs = basicSetConverter(newConverter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingsPackage.FEATURE2_FEATURE__CONVERTER, newConverter, newConverter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MappingsPackage.FEATURE2_FEATURE__LEFT_FEATURE:
				return basicSetLeftFeature(null, msgs);
			case MappingsPackage.FEATURE2_FEATURE__CONVERTER:
				return basicSetConverter(null, msgs);
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
			case MappingsPackage.FEATURE2_FEATURE__LEFT_FEATURE:
				return getLeftFeature();
			case MappingsPackage.FEATURE2_FEATURE__CONVERTER:
				return getConverter();
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
			case MappingsPackage.FEATURE2_FEATURE__LEFT_FEATURE:
				setLeftFeature((FeatureRef)newValue);
				return;
			case MappingsPackage.FEATURE2_FEATURE__CONVERTER:
				setConverter((Converter)newValue);
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
			case MappingsPackage.FEATURE2_FEATURE__LEFT_FEATURE:
				setLeftFeature((FeatureRef)null);
				return;
			case MappingsPackage.FEATURE2_FEATURE__CONVERTER:
				setConverter((Converter)null);
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
			case MappingsPackage.FEATURE2_FEATURE__LEFT_FEATURE:
				return leftFeature != null;
			case MappingsPackage.FEATURE2_FEATURE__CONVERTER:
				return converter != null;
		}
		return super.eIsSet(featureID);
	}

} //Feature2FeatureImpl
