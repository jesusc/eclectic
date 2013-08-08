/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.apidesc.patterns.impl;

import org.eclectic.apidesc.Method;
import org.eclectic.apidesc.impl.GetMechanismImpl;

import org.eclectic.apidesc.patterns.IteratorDescription;
import org.eclectic.apidesc.patterns.IteratorGetter;
import org.eclectic.apidesc.patterns.PatternsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iterator Getter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.apidesc.patterns.impl.IteratorGetterImpl#getGetIterator <em>Get Iterator</em>}</li>
 *   <li>{@link org.eclectic.apidesc.patterns.impl.IteratorGetterImpl#getIterator <em>Iterator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IteratorGetterImpl extends GetMechanismImpl implements IteratorGetter {
	/**
	 * The cached value of the '{@link #getGetIterator() <em>Get Iterator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetIterator()
	 * @generated
	 * @ordered
	 */
	protected Method getIterator;
	/**
	 * The cached value of the '{@link #getIterator() <em>Iterator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterator()
	 * @generated
	 * @ordered
	 */
	protected IteratorDescription iterator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IteratorGetterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.ITERATOR_GETTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getGetIterator() {
		return getIterator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetIterator(Method newGetIterator, NotificationChain msgs) {
		Method oldGetIterator = getIterator;
		getIterator = newGetIterator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternsPackage.ITERATOR_GETTER__GET_ITERATOR, oldGetIterator, newGetIterator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetIterator(Method newGetIterator) {
		if (newGetIterator != getIterator) {
			NotificationChain msgs = null;
			if (getIterator != null)
				msgs = ((InternalEObject)getIterator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternsPackage.ITERATOR_GETTER__GET_ITERATOR, null, msgs);
			if (newGetIterator != null)
				msgs = ((InternalEObject)newGetIterator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternsPackage.ITERATOR_GETTER__GET_ITERATOR, null, msgs);
			msgs = basicSetGetIterator(newGetIterator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.ITERATOR_GETTER__GET_ITERATOR, newGetIterator, newGetIterator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IteratorDescription getIterator() {
		if (iterator != null && iterator.eIsProxy()) {
			InternalEObject oldIterator = (InternalEObject)iterator;
			iterator = (IteratorDescription)eResolveProxy(oldIterator);
			if (iterator != oldIterator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternsPackage.ITERATOR_GETTER__ITERATOR, oldIterator, iterator));
			}
		}
		return iterator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IteratorDescription basicGetIterator() {
		return iterator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIterator(IteratorDescription newIterator) {
		IteratorDescription oldIterator = iterator;
		iterator = newIterator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.ITERATOR_GETTER__ITERATOR, oldIterator, iterator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternsPackage.ITERATOR_GETTER__GET_ITERATOR:
				return basicSetGetIterator(null, msgs);
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
			case PatternsPackage.ITERATOR_GETTER__GET_ITERATOR:
				return getGetIterator();
			case PatternsPackage.ITERATOR_GETTER__ITERATOR:
				if (resolve) return getIterator();
				return basicGetIterator();
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
			case PatternsPackage.ITERATOR_GETTER__GET_ITERATOR:
				setGetIterator((Method)newValue);
				return;
			case PatternsPackage.ITERATOR_GETTER__ITERATOR:
				setIterator((IteratorDescription)newValue);
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
			case PatternsPackage.ITERATOR_GETTER__GET_ITERATOR:
				setGetIterator((Method)null);
				return;
			case PatternsPackage.ITERATOR_GETTER__ITERATOR:
				setIterator((IteratorDescription)null);
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
			case PatternsPackage.ITERATOR_GETTER__GET_ITERATOR:
				return getIterator != null;
			case PatternsPackage.ITERATOR_GETTER__ITERATOR:
				return iterator != null;
		}
		return super.eIsSet(featureID);
	}

} //IteratorGetterImpl
