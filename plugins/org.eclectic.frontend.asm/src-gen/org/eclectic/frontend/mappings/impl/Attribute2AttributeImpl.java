/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.mappings.impl;

import java.util.Collection;

import org.eclectic.frontend.mappings.Attribute2Attribute;
import org.eclectic.frontend.mappings.AttributeMapping;
import org.eclectic.frontend.mappings.AttributeModifier;
import org.eclectic.frontend.mappings.AttributeRef;
import org.eclectic.frontend.mappings.Class2Class;
import org.eclectic.frontend.mappings.MappingCardinality;
import org.eclectic.frontend.mappings.MappingsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute2 Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.frontend.mappings.impl.Attribute2AttributeImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.impl.Attribute2AttributeImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.impl.Attribute2AttributeImpl#getRight <em>Right</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.impl.Attribute2AttributeImpl#getModifiers <em>Modifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Attribute2AttributeImpl extends Feature2FeatureImpl implements Attribute2Attribute {
	/**
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final MappingCardinality CARDINALITY_EDEFAULT = MappingCardinality.ONE_TO_ONE;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected MappingCardinality cardinality = CARDINALITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeRef> right;

	/**
	 * The cached value of the '{@link #getModifiers() <em>Modifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeModifier> modifiers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Attribute2AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingsPackage.Literals.ATTRIBUTE2_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingCardinality getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(MappingCardinality newCardinality) {
		MappingCardinality oldCardinality = cardinality;
		cardinality = newCardinality == null ? CARDINALITY_EDEFAULT : newCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingsPackage.ATTRIBUTE2_ATTRIBUTE__CARDINALITY, oldCardinality, cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class2Class getContext() {
		if (eContainerFeatureID() != MappingsPackage.ATTRIBUTE2_ATTRIBUTE__CONTEXT) return null;
		return (Class2Class)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(Class2Class newContext, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContext, MappingsPackage.ATTRIBUTE2_ATTRIBUTE__CONTEXT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(Class2Class newContext) {
		if (newContext != eInternalContainer() || (eContainerFeatureID() != MappingsPackage.ATTRIBUTE2_ATTRIBUTE__CONTEXT && newContext != null)) {
			if (EcoreUtil.isAncestor(this, newContext))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, MappingsPackage.CLASS2_CLASS__SCOPED_ATTRIBUTES, Class2Class.class, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingsPackage.ATTRIBUTE2_ATTRIBUTE__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeRef> getRight() {
		if (right == null) {
			right = new EObjectContainmentEList<AttributeRef>(AttributeRef.class, this, MappingsPackage.ATTRIBUTE2_ATTRIBUTE__RIGHT);
		}
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeModifier> getModifiers() {
		if (modifiers == null) {
			modifiers = new EObjectContainmentEList<AttributeModifier>(AttributeModifier.class, this, MappingsPackage.ATTRIBUTE2_ATTRIBUTE__MODIFIERS);
		}
		return modifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MappingsPackage.ATTRIBUTE2_ATTRIBUTE__CONTEXT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContext((Class2Class)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MappingsPackage.ATTRIBUTE2_ATTRIBUTE__CONTEXT:
				return basicSetContext(null, msgs);
			case MappingsPackage.ATTRIBUTE2_ATTRIBUTE__RIGHT:
				return ((InternalEList<?>)getRight()).basicRemove(otherEnd, msgs);
			case MappingsPackage.ATTRIBUTE2_ATTRIBUTE__MODIFIERS:
				return ((InternalEList<?>)getModifiers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case MappingsPackage.ATTRIBUTE2_ATTRIBUTE__CONTEXT:
				return eInternalContainer().eInverseRemove(this, MappingsPackage.CLASS2_CLASS__SCOPED_ATTRIBUTES, Class2Class.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MappingsPackage.ATTRIBUTE2_ATTRIBUTE__CARDINALITY:
				return getCardinality();
			case MappingsPackage.ATTRIBUTE2_ATTRIBUTE__CONTEXT:
				return getContext();
			case MappingsPackage.ATTRIBUTE2_ATTRIBUTE__RIGHT:
				return getRight();
			case MappingsPackage.ATTRIBUTE2_ATTRIBUTE__MODIFIERS:
				return getModifiers();
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
			case MappingsPackage.ATTRIBUTE2_ATTRIBUTE__CARDINALITY:
				setCardinality((MappingCardinality)newValue);
				return;
			case MappingsPackage.ATTRIBUTE2_ATTRIBUTE__CONTEXT:
				setContext((Class2Class)newValue);
				return;
			case MappingsPackage.ATTRIBUTE2_ATTRIBUTE__RIGHT:
				getRight().clear();
				getRight().addAll((Collection<? extends AttributeRef>)newValue);
				return;
			case MappingsPackage.ATTRIBUTE2_ATTRIBUTE__MODIFIERS:
				getModifiers().clear();
				getModifiers().addAll((Collection<? extends AttributeModifier>)newValue);
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
			case MappingsPackage.ATTRIBUTE2_ATTRIBUTE__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
				return;
			case MappingsPackage.ATTRIBUTE2_ATTRIBUTE__CONTEXT:
				setContext((Class2Class)null);
				return;
			case MappingsPackage.ATTRIBUTE2_ATTRIBUTE__RIGHT:
				getRight().clear();
				return;
			case MappingsPackage.ATTRIBUTE2_ATTRIBUTE__MODIFIERS:
				getModifiers().clear();
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
			case MappingsPackage.ATTRIBUTE2_ATTRIBUTE__CARDINALITY:
				return cardinality != CARDINALITY_EDEFAULT;
			case MappingsPackage.ATTRIBUTE2_ATTRIBUTE__CONTEXT:
				return getContext() != null;
			case MappingsPackage.ATTRIBUTE2_ATTRIBUTE__RIGHT:
				return right != null && !right.isEmpty();
			case MappingsPackage.ATTRIBUTE2_ATTRIBUTE__MODIFIERS:
				return modifiers != null && !modifiers.isEmpty();
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
		result.append(" (cardinality: ");
		result.append(cardinality);
		result.append(')');
		return result.toString();
	}

} //Attribute2AttributeImpl
