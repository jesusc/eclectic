/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.apidesc.patterns.impl;

import org.eclectic.apidesc.Method;

import org.eclectic.apidesc.impl.DeclaredElementImpl;

import org.eclectic.apidesc.patterns.IteratorDescription;
import org.eclectic.apidesc.patterns.PatternsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iterator Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.apidesc.patterns.impl.IteratorDescriptionImpl#getIteratorClass <em>Iterator Class</em>}</li>
 *   <li>{@link org.eclectic.apidesc.patterns.impl.IteratorDescriptionImpl#getHasFinished <em>Has Finished</em>}</li>
 *   <li>{@link org.eclectic.apidesc.patterns.impl.IteratorDescriptionImpl#getNextElement <em>Next Element</em>}</li>
 *   <li>{@link org.eclectic.apidesc.patterns.impl.IteratorDescriptionImpl#getCurrentElement <em>Current Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IteratorDescriptionImpl extends DeclaredElementImpl implements IteratorDescription {
	/**
	 * The default value of the '{@link #getIteratorClass() <em>Iterator Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIteratorClass()
	 * @generated
	 * @ordered
	 */
	protected static final String ITERATOR_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIteratorClass() <em>Iterator Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIteratorClass()
	 * @generated
	 * @ordered
	 */
	protected String iteratorClass = ITERATOR_CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasFinished() <em>Has Finished</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasFinished()
	 * @generated
	 * @ordered
	 */
	protected Method hasFinished;

	/**
	 * The cached value of the '{@link #getNextElement() <em>Next Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextElement()
	 * @generated
	 * @ordered
	 */
	protected Method nextElement;

	/**
	 * The cached value of the '{@link #getCurrentElement() <em>Current Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentElement()
	 * @generated
	 * @ordered
	 */
	protected Method currentElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IteratorDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternsPackage.Literals.ITERATOR_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIteratorClass() {
		return iteratorClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIteratorClass(String newIteratorClass) {
		String oldIteratorClass = iteratorClass;
		iteratorClass = newIteratorClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.ITERATOR_DESCRIPTION__ITERATOR_CLASS, oldIteratorClass, iteratorClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getHasFinished() {
		return hasFinished;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasFinished(Method newHasFinished, NotificationChain msgs) {
		Method oldHasFinished = hasFinished;
		hasFinished = newHasFinished;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternsPackage.ITERATOR_DESCRIPTION__HAS_FINISHED, oldHasFinished, newHasFinished);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasFinished(Method newHasFinished) {
		if (newHasFinished != hasFinished) {
			NotificationChain msgs = null;
			if (hasFinished != null)
				msgs = ((InternalEObject)hasFinished).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternsPackage.ITERATOR_DESCRIPTION__HAS_FINISHED, null, msgs);
			if (newHasFinished != null)
				msgs = ((InternalEObject)newHasFinished).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternsPackage.ITERATOR_DESCRIPTION__HAS_FINISHED, null, msgs);
			msgs = basicSetHasFinished(newHasFinished, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.ITERATOR_DESCRIPTION__HAS_FINISHED, newHasFinished, newHasFinished));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getNextElement() {
		return nextElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNextElement(Method newNextElement, NotificationChain msgs) {
		Method oldNextElement = nextElement;
		nextElement = newNextElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternsPackage.ITERATOR_DESCRIPTION__NEXT_ELEMENT, oldNextElement, newNextElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextElement(Method newNextElement) {
		if (newNextElement != nextElement) {
			NotificationChain msgs = null;
			if (nextElement != null)
				msgs = ((InternalEObject)nextElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternsPackage.ITERATOR_DESCRIPTION__NEXT_ELEMENT, null, msgs);
			if (newNextElement != null)
				msgs = ((InternalEObject)newNextElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternsPackage.ITERATOR_DESCRIPTION__NEXT_ELEMENT, null, msgs);
			msgs = basicSetNextElement(newNextElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.ITERATOR_DESCRIPTION__NEXT_ELEMENT, newNextElement, newNextElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getCurrentElement() {
		return currentElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentElement(Method newCurrentElement, NotificationChain msgs) {
		Method oldCurrentElement = currentElement;
		currentElement = newCurrentElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternsPackage.ITERATOR_DESCRIPTION__CURRENT_ELEMENT, oldCurrentElement, newCurrentElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentElement(Method newCurrentElement) {
		if (newCurrentElement != currentElement) {
			NotificationChain msgs = null;
			if (currentElement != null)
				msgs = ((InternalEObject)currentElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternsPackage.ITERATOR_DESCRIPTION__CURRENT_ELEMENT, null, msgs);
			if (newCurrentElement != null)
				msgs = ((InternalEObject)newCurrentElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternsPackage.ITERATOR_DESCRIPTION__CURRENT_ELEMENT, null, msgs);
			msgs = basicSetCurrentElement(newCurrentElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternsPackage.ITERATOR_DESCRIPTION__CURRENT_ELEMENT, newCurrentElement, newCurrentElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternsPackage.ITERATOR_DESCRIPTION__HAS_FINISHED:
				return basicSetHasFinished(null, msgs);
			case PatternsPackage.ITERATOR_DESCRIPTION__NEXT_ELEMENT:
				return basicSetNextElement(null, msgs);
			case PatternsPackage.ITERATOR_DESCRIPTION__CURRENT_ELEMENT:
				return basicSetCurrentElement(null, msgs);
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
			case PatternsPackage.ITERATOR_DESCRIPTION__ITERATOR_CLASS:
				return getIteratorClass();
			case PatternsPackage.ITERATOR_DESCRIPTION__HAS_FINISHED:
				return getHasFinished();
			case PatternsPackage.ITERATOR_DESCRIPTION__NEXT_ELEMENT:
				return getNextElement();
			case PatternsPackage.ITERATOR_DESCRIPTION__CURRENT_ELEMENT:
				return getCurrentElement();
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
			case PatternsPackage.ITERATOR_DESCRIPTION__ITERATOR_CLASS:
				setIteratorClass((String)newValue);
				return;
			case PatternsPackage.ITERATOR_DESCRIPTION__HAS_FINISHED:
				setHasFinished((Method)newValue);
				return;
			case PatternsPackage.ITERATOR_DESCRIPTION__NEXT_ELEMENT:
				setNextElement((Method)newValue);
				return;
			case PatternsPackage.ITERATOR_DESCRIPTION__CURRENT_ELEMENT:
				setCurrentElement((Method)newValue);
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
			case PatternsPackage.ITERATOR_DESCRIPTION__ITERATOR_CLASS:
				setIteratorClass(ITERATOR_CLASS_EDEFAULT);
				return;
			case PatternsPackage.ITERATOR_DESCRIPTION__HAS_FINISHED:
				setHasFinished((Method)null);
				return;
			case PatternsPackage.ITERATOR_DESCRIPTION__NEXT_ELEMENT:
				setNextElement((Method)null);
				return;
			case PatternsPackage.ITERATOR_DESCRIPTION__CURRENT_ELEMENT:
				setCurrentElement((Method)null);
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
			case PatternsPackage.ITERATOR_DESCRIPTION__ITERATOR_CLASS:
				return ITERATOR_CLASS_EDEFAULT == null ? iteratorClass != null : !ITERATOR_CLASS_EDEFAULT.equals(iteratorClass);
			case PatternsPackage.ITERATOR_DESCRIPTION__HAS_FINISHED:
				return hasFinished != null;
			case PatternsPackage.ITERATOR_DESCRIPTION__NEXT_ELEMENT:
				return nextElement != null;
			case PatternsPackage.ITERATOR_DESCRIPTION__CURRENT_ELEMENT:
				return currentElement != null;
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
		result.append(" (iteratorClass: ");
		result.append(iteratorClass);
		result.append(')');
		return result.toString();
	}

} //IteratorDescriptionImpl
