/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.attribution.impl;

import java.util.Collection;

import org.eclectic.frontend.attribution.AttributeDcl;
import org.eclectic.frontend.attribution.AttributionPackage;
import org.eclectic.frontend.attribution.AttributionRule;
import org.eclectic.frontend.attribution.AttributionTransformation;

import org.eclectic.frontend.core.impl.TransformationDefinitionImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.frontend.attribution.impl.AttributionTransformationImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.eclectic.frontend.attribution.impl.AttributionTransformationImpl#getRules <em>Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributionTransformationImpl extends TransformationDefinitionImpl implements AttributionTransformation {
	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeDcl> attributes;

	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributionRule> rules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributionTransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AttributionPackage.Literals.ATTRIBUTION_TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeDcl> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<AttributeDcl>(AttributeDcl.class, this, AttributionPackage.ATTRIBUTION_TRANSFORMATION__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributionRule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<AttributionRule>(AttributionRule.class, this, AttributionPackage.ATTRIBUTION_TRANSFORMATION__RULES);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AttributionPackage.ATTRIBUTION_TRANSFORMATION__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case AttributionPackage.ATTRIBUTION_TRANSFORMATION__RULES:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
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
			case AttributionPackage.ATTRIBUTION_TRANSFORMATION__ATTRIBUTES:
				return getAttributes();
			case AttributionPackage.ATTRIBUTION_TRANSFORMATION__RULES:
				return getRules();
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
			case AttributionPackage.ATTRIBUTION_TRANSFORMATION__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends AttributeDcl>)newValue);
				return;
			case AttributionPackage.ATTRIBUTION_TRANSFORMATION__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends AttributionRule>)newValue);
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
			case AttributionPackage.ATTRIBUTION_TRANSFORMATION__ATTRIBUTES:
				getAttributes().clear();
				return;
			case AttributionPackage.ATTRIBUTION_TRANSFORMATION__RULES:
				getRules().clear();
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
			case AttributionPackage.ATTRIBUTION_TRANSFORMATION__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case AttributionPackage.ATTRIBUTION_TRANSFORMATION__RULES:
				return rules != null && !rules.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AttributionTransformationImpl
