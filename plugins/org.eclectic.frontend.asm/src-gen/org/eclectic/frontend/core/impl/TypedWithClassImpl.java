/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.core.impl;

import org.eclectic.frontend.core.ClassUse;
import org.eclectic.frontend.core.CorePackage;
import org.eclectic.frontend.core.TypedWithClass;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Typed With Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.frontend.core.impl.TypedWithClassImpl#getType_ <em>Type </em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypedWithClassImpl extends EObjectImpl implements TypedWithClass {
	/**
	 * The cached value of the '{@link #getType_() <em>Type </em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_()
	 * @generated
	 * @ordered
	 */
	protected ClassUse type_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypedWithClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.TYPED_WITH_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassUse getType_() {
		return type_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType_(ClassUse newType_, NotificationChain msgs) {
		ClassUse oldType_ = type_;
		type_ = newType_;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.TYPED_WITH_CLASS__TYPE_, oldType_, newType_);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType_(ClassUse newType_) {
		if (newType_ != type_) {
			NotificationChain msgs = null;
			if (type_ != null)
				msgs = ((InternalEObject)type_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.TYPED_WITH_CLASS__TYPE_, null, msgs);
			if (newType_ != null)
				msgs = ((InternalEObject)newType_).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.TYPED_WITH_CLASS__TYPE_, null, msgs);
			msgs = basicSetType_(newType_, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TYPED_WITH_CLASS__TYPE_, newType_, newType_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.TYPED_WITH_CLASS__TYPE_:
				return basicSetType_(null, msgs);
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
			case CorePackage.TYPED_WITH_CLASS__TYPE_:
				return getType_();
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
			case CorePackage.TYPED_WITH_CLASS__TYPE_:
				setType_((ClassUse)newValue);
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
			case CorePackage.TYPED_WITH_CLASS__TYPE_:
				setType_((ClassUse)null);
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
			case CorePackage.TYPED_WITH_CLASS__TYPE_:
				return type_ != null;
		}
		return super.eIsSet(featureID);
	}

} //TypedWithClassImpl
