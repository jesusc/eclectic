/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.apidesc.patterns.impl;

import java.util.Collection;

import org.eclectic.apidesc.impl.DeclaredElementImpl;

import org.eclectic.apidesc.patterns.ObserverDescription;
import org.eclectic.apidesc.patterns.PatternsPackage;
import org.eclectic.apidesc.patterns.UpdateMethod;

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
 * An implementation of the model object '<em><b>Observer Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.apidesc.patterns.impl.ObserverDescriptionImpl#getObserverClass <em>Observer Class</em>}</li>
 *   <li>{@link org.eclectic.apidesc.patterns.impl.ObserverDescriptionImpl#getUpdateMethods <em>Update Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObserverDescriptionImpl extends DeclaredElementImpl implements ObserverDescription {
	/**
	 * The default value of the '{@link #getObserverClass() <em>Observer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObserverClass()
	 * @generated
	 * @ordered
	 */
	protected static final String OBSERVER_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObserverClass() <em>Observer Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObserverClass()
	 * @generated
	 * @ordered
	 */
	protected String observerClass = OBSERVER_CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUpdateMethods() <em>Update Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<UpdateMethod> updateMethods;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObserverDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.OBSERVER_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObserverClass() {
		return observerClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObserverClass(String newObserverClass) {
		String oldObserverClass = observerClass;
		observerClass = newObserverClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.OBSERVER_DESCRIPTION__OBSERVER_CLASS, oldObserverClass, observerClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UpdateMethod> getUpdateMethods() {
		if (updateMethods == null) {
			updateMethods = new EObjectContainmentEList<UpdateMethod>(UpdateMethod.class, this, PatternsPackage.OBSERVER_DESCRIPTION__UPDATE_METHODS);
		}
		return updateMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternsPackage.OBSERVER_DESCRIPTION__UPDATE_METHODS:
				return ((InternalEList<?>)getUpdateMethods()).basicRemove(otherEnd, msgs);
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
			case PatternsPackage.OBSERVER_DESCRIPTION__OBSERVER_CLASS:
				return getObserverClass();
			case PatternsPackage.OBSERVER_DESCRIPTION__UPDATE_METHODS:
				return getUpdateMethods();
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
			case PatternsPackage.OBSERVER_DESCRIPTION__OBSERVER_CLASS:
				setObserverClass((String)newValue);
				return;
			case PatternsPackage.OBSERVER_DESCRIPTION__UPDATE_METHODS:
				getUpdateMethods().clear();
				getUpdateMethods().addAll((Collection<? extends UpdateMethod>)newValue);
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
			case PatternsPackage.OBSERVER_DESCRIPTION__OBSERVER_CLASS:
				setObserverClass(OBSERVER_CLASS_EDEFAULT);
				return;
			case PatternsPackage.OBSERVER_DESCRIPTION__UPDATE_METHODS:
				getUpdateMethods().clear();
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
			case PatternsPackage.OBSERVER_DESCRIPTION__OBSERVER_CLASS:
				return OBSERVER_CLASS_EDEFAULT == null ? observerClass != null : !OBSERVER_CLASS_EDEFAULT.equals(observerClass);
			case PatternsPackage.OBSERVER_DESCRIPTION__UPDATE_METHODS:
				return updateMethods != null && !updateMethods.isEmpty();
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
		result.append(" (observerClass: ");
		result.append(observerClass);
		result.append(')');
		return result.toString();
	}

} //ObserverDescriptionImpl
