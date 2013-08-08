/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.mappings.impl;

import java.util.Collection;

import org.eclectic.frontend.mappings.AttributeMapping;
import org.eclectic.frontend.mappings.AttributeRef;
import org.eclectic.frontend.mappings.AttributeRightPart;
import org.eclectic.frontend.mappings.MappingsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.frontend.mappings.impl.AttributeMappingImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.impl.AttributeMappingImpl#getRightPart <em>Right Part</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeMappingImpl extends Feature2FeatureImpl implements AttributeMapping {
	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeRef> left;

	/**
	 * The cached value of the '{@link #getRightPart() <em>Right Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightPart()
	 * @generated
	 * @ordered
	 */
	protected AttributeRightPart rightPart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingsPackage.Literals.ATTRIBUTE_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeRef> getLeft() {
		if (left == null) {
			left = new EObjectContainmentEList<AttributeRef>(AttributeRef.class, this, MappingsPackage.ATTRIBUTE_MAPPING__LEFT);
		}
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeRightPart getRightPart() {
		return rightPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightPart(AttributeRightPart newRightPart, NotificationChain msgs) {
		AttributeRightPart oldRightPart = rightPart;
		rightPart = newRightPart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MappingsPackage.ATTRIBUTE_MAPPING__RIGHT_PART, oldRightPart, newRightPart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightPart(AttributeRightPart newRightPart) {
		if (newRightPart != rightPart) {
			NotificationChain msgs = null;
			if (rightPart != null)
				msgs = ((InternalEObject)rightPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MappingsPackage.ATTRIBUTE_MAPPING__RIGHT_PART, null, msgs);
			if (newRightPart != null)
				msgs = ((InternalEObject)newRightPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MappingsPackage.ATTRIBUTE_MAPPING__RIGHT_PART, null, msgs);
			msgs = basicSetRightPart(newRightPart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingsPackage.ATTRIBUTE_MAPPING__RIGHT_PART, newRightPart, newRightPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MappingsPackage.ATTRIBUTE_MAPPING__LEFT:
				return ((InternalEList<?>)getLeft()).basicRemove(otherEnd, msgs);
			case MappingsPackage.ATTRIBUTE_MAPPING__RIGHT_PART:
				return basicSetRightPart(null, msgs);
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
			case MappingsPackage.ATTRIBUTE_MAPPING__LEFT:
				return getLeft();
			case MappingsPackage.ATTRIBUTE_MAPPING__RIGHT_PART:
				return getRightPart();
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
			case MappingsPackage.ATTRIBUTE_MAPPING__LEFT:
				getLeft().clear();
				getLeft().addAll((Collection<? extends AttributeRef>)newValue);
				return;
			case MappingsPackage.ATTRIBUTE_MAPPING__RIGHT_PART:
				setRightPart((AttributeRightPart)newValue);
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
			case MappingsPackage.ATTRIBUTE_MAPPING__LEFT:
				getLeft().clear();
				return;
			case MappingsPackage.ATTRIBUTE_MAPPING__RIGHT_PART:
				setRightPart((AttributeRightPart)null);
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
			case MappingsPackage.ATTRIBUTE_MAPPING__LEFT:
				return left != null && !left.isEmpty();
			case MappingsPackage.ATTRIBUTE_MAPPING__RIGHT_PART:
				return rightPart != null;
		}
		return super.eIsSet(featureID);
	}

} //AttributeMappingImpl
