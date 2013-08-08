/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.koan.impl;

import java.util.Collection;

import org.eclectic.frontend.core.TraceInterface;

import org.eclectic.frontend.core.impl.TransformationDefinitionImpl;

import org.eclectic.frontend.koan.KoanPackage;
import org.eclectic.frontend.koan.KoanRule;
import org.eclectic.frontend.koan.KoanTransformation;

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
 * An implementation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.frontend.koan.impl.KoanTransformationImpl#getTraceInterface <em>Trace Interface</em>}</li>
 *   <li>{@link org.eclectic.frontend.koan.impl.KoanTransformationImpl#getRules <em>Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KoanTransformationImpl extends TransformationDefinitionImpl implements KoanTransformation {
	/**
	 * The cached value of the '{@link #getTraceInterface() <em>Trace Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceInterface()
	 * @generated
	 * @ordered
	 */
	protected TraceInterface traceInterface;

	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<KoanRule> rules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KoanTransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KoanPackage.Literals.KOAN_TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceInterface getTraceInterface() {
		return traceInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTraceInterface(TraceInterface newTraceInterface, NotificationChain msgs) {
		TraceInterface oldTraceInterface = traceInterface;
		traceInterface = newTraceInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KoanPackage.KOAN_TRANSFORMATION__TRACE_INTERFACE, oldTraceInterface, newTraceInterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceInterface(TraceInterface newTraceInterface) {
		if (newTraceInterface != traceInterface) {
			NotificationChain msgs = null;
			if (traceInterface != null)
				msgs = ((InternalEObject)traceInterface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KoanPackage.KOAN_TRANSFORMATION__TRACE_INTERFACE, null, msgs);
			if (newTraceInterface != null)
				msgs = ((InternalEObject)newTraceInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KoanPackage.KOAN_TRANSFORMATION__TRACE_INTERFACE, null, msgs);
			msgs = basicSetTraceInterface(newTraceInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KoanPackage.KOAN_TRANSFORMATION__TRACE_INTERFACE, newTraceInterface, newTraceInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KoanRule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<KoanRule>(KoanRule.class, this, KoanPackage.KOAN_TRANSFORMATION__RULES);
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
			case KoanPackage.KOAN_TRANSFORMATION__TRACE_INTERFACE:
				return basicSetTraceInterface(null, msgs);
			case KoanPackage.KOAN_TRANSFORMATION__RULES:
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
			case KoanPackage.KOAN_TRANSFORMATION__TRACE_INTERFACE:
				return getTraceInterface();
			case KoanPackage.KOAN_TRANSFORMATION__RULES:
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
			case KoanPackage.KOAN_TRANSFORMATION__TRACE_INTERFACE:
				setTraceInterface((TraceInterface)newValue);
				return;
			case KoanPackage.KOAN_TRANSFORMATION__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends KoanRule>)newValue);
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
			case KoanPackage.KOAN_TRANSFORMATION__TRACE_INTERFACE:
				setTraceInterface((TraceInterface)null);
				return;
			case KoanPackage.KOAN_TRANSFORMATION__RULES:
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
			case KoanPackage.KOAN_TRANSFORMATION__TRACE_INTERFACE:
				return traceInterface != null;
			case KoanPackage.KOAN_TRANSFORMATION__RULES:
				return rules != null && !rules.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //KoanTransformationImpl
