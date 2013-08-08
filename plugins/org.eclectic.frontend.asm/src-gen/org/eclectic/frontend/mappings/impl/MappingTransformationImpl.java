/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.mappings.impl;

import java.util.Collection;

import org.eclectic.frontend.core.TransformationDefinitionParameter;

import org.eclectic.frontend.core.impl.TransformationDefinitionImpl;

import org.eclectic.frontend.mappings.Context;
import org.eclectic.frontend.mappings.Delegate;
import org.eclectic.frontend.mappings.MappingTransformation;
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
 * An implementation of the model object '<em><b>Mapping Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.frontend.mappings.impl.MappingTransformationImpl#getDelegates <em>Delegates</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.impl.MappingTransformationImpl#getContexts <em>Contexts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappingTransformationImpl extends TransformationDefinitionImpl implements MappingTransformation {
	/**
	 * The cached value of the '{@link #getDelegates() <em>Delegates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegates()
	 * @generated
	 * @ordered
	 */
	protected EList<Delegate> delegates;
	/**
	 * The cached value of the '{@link #getContexts() <em>Contexts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<Context> contexts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingTransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingsPackage.Literals.MAPPING_TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Delegate> getDelegates() {
		if (delegates == null) {
			delegates = new EObjectContainmentEList<Delegate>(Delegate.class, this, MappingsPackage.MAPPING_TRANSFORMATION__DELEGATES);
		}
		return delegates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Context> getContexts() {
		if (contexts == null) {
			contexts = new EObjectContainmentEList<Context>(Context.class, this, MappingsPackage.MAPPING_TRANSFORMATION__CONTEXTS);
		}
		return contexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MappingsPackage.MAPPING_TRANSFORMATION__DELEGATES:
				return ((InternalEList<?>)getDelegates()).basicRemove(otherEnd, msgs);
			case MappingsPackage.MAPPING_TRANSFORMATION__CONTEXTS:
				return ((InternalEList<?>)getContexts()).basicRemove(otherEnd, msgs);
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
			case MappingsPackage.MAPPING_TRANSFORMATION__DELEGATES:
				return getDelegates();
			case MappingsPackage.MAPPING_TRANSFORMATION__CONTEXTS:
				return getContexts();
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
			case MappingsPackage.MAPPING_TRANSFORMATION__DELEGATES:
				getDelegates().clear();
				getDelegates().addAll((Collection<? extends Delegate>)newValue);
				return;
			case MappingsPackage.MAPPING_TRANSFORMATION__CONTEXTS:
				getContexts().clear();
				getContexts().addAll((Collection<? extends Context>)newValue);
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
			case MappingsPackage.MAPPING_TRANSFORMATION__DELEGATES:
				getDelegates().clear();
				return;
			case MappingsPackage.MAPPING_TRANSFORMATION__CONTEXTS:
				getContexts().clear();
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
			case MappingsPackage.MAPPING_TRANSFORMATION__DELEGATES:
				return delegates != null && !delegates.isEmpty();
			case MappingsPackage.MAPPING_TRANSFORMATION__CONTEXTS:
				return contexts != null && !contexts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MappingTransformationImpl
