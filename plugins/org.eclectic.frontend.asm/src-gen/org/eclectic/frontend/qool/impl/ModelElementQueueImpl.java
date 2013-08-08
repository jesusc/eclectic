/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.qool.impl;

import java.util.Collection;
import org.eclectic.frontend.core.ClassUse;

import org.eclectic.frontend.qool.ModelElementQueue;
import org.eclectic.frontend.qool.QoolPackage;

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
 * An implementation of the model object '<em><b>Model Element Queue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.frontend.qool.impl.ModelElementQueueImpl#getClass_ <em>Class </em>}</li>
 *   <li>{@link org.eclectic.frontend.qool.impl.ModelElementQueueImpl#getAdditionals <em>Additionals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelElementQueueImpl extends QoolQueueImpl implements ModelElementQueue {
	/**
	 * The cached value of the '{@link #getClass_() <em>Class </em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected ClassUse class_;

	/**
	 * The cached value of the '{@link #getAdditionals() <em>Additionals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionals()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassUse> additionals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelElementQueueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QoolPackage.Literals.MODEL_ELEMENT_QUEUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassUse getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClass_(ClassUse newClass_, NotificationChain msgs) {
		ClassUse oldClass_ = class_;
		class_ = newClass_;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QoolPackage.MODEL_ELEMENT_QUEUE__CLASS_, oldClass_, newClass_);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass_(ClassUse newClass_) {
		if (newClass_ != class_) {
			NotificationChain msgs = null;
			if (class_ != null)
				msgs = ((InternalEObject)class_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QoolPackage.MODEL_ELEMENT_QUEUE__CLASS_, null, msgs);
			if (newClass_ != null)
				msgs = ((InternalEObject)newClass_).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QoolPackage.MODEL_ELEMENT_QUEUE__CLASS_, null, msgs);
			msgs = basicSetClass_(newClass_, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QoolPackage.MODEL_ELEMENT_QUEUE__CLASS_, newClass_, newClass_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassUse> getAdditionals() {
		if (additionals == null) {
			additionals = new EObjectContainmentEList<ClassUse>(ClassUse.class, this, QoolPackage.MODEL_ELEMENT_QUEUE__ADDITIONALS);
		}
		return additionals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QoolPackage.MODEL_ELEMENT_QUEUE__CLASS_:
				return basicSetClass_(null, msgs);
			case QoolPackage.MODEL_ELEMENT_QUEUE__ADDITIONALS:
				return ((InternalEList<?>)getAdditionals()).basicRemove(otherEnd, msgs);
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
			case QoolPackage.MODEL_ELEMENT_QUEUE__CLASS_:
				return getClass_();
			case QoolPackage.MODEL_ELEMENT_QUEUE__ADDITIONALS:
				return getAdditionals();
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
			case QoolPackage.MODEL_ELEMENT_QUEUE__CLASS_:
				setClass_((ClassUse)newValue);
				return;
			case QoolPackage.MODEL_ELEMENT_QUEUE__ADDITIONALS:
				getAdditionals().clear();
				getAdditionals().addAll((Collection<? extends ClassUse>)newValue);
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
			case QoolPackage.MODEL_ELEMENT_QUEUE__CLASS_:
				setClass_((ClassUse)null);
				return;
			case QoolPackage.MODEL_ELEMENT_QUEUE__ADDITIONALS:
				getAdditionals().clear();
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
			case QoolPackage.MODEL_ELEMENT_QUEUE__CLASS_:
				return class_ != null;
			case QoolPackage.MODEL_ELEMENT_QUEUE__ADDITIONALS:
				return additionals != null && !additionals.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelElementQueueImpl
