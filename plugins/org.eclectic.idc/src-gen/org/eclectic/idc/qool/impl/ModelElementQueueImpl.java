/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.qool.impl;

import java.util.Collection;
import org.eclectic.idc.core.TypeInfo;

import org.eclectic.idc.extensions.Extension;
import org.eclectic.idc.qool.ModelElementQueue;
import org.eclectic.idc.qool.QoolPackage;

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
 *   <li>{@link org.eclectic.idc.qool.impl.ModelElementQueueImpl#getType_ <em>Type </em>}</li>
 *   <li>{@link org.eclectic.idc.qool.impl.ModelElementQueueImpl#getAdditionals <em>Additionals</em>}</li>
 *   <li>{@link org.eclectic.idc.qool.impl.ModelElementQueueImpl#getExtension <em>Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelElementQueueImpl extends QueueImpl implements ModelElementQueue {
	/**
	 * The cached value of the '{@link #getType_() <em>Type </em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_()
	 * @generated
	 * @ordered
	 */
	protected TypeInfo type_;

	/**
	 * The cached value of the '{@link #getAdditionals() <em>Additionals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionals()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeInfo> additionals;

	/**
	 * The cached value of the '{@link #getExtension() <em>Extension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected Extension extension;

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
	public TypeInfo getType_() {
		return type_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType_(TypeInfo newType_, NotificationChain msgs) {
		TypeInfo oldType_ = type_;
		type_ = newType_;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QoolPackage.MODEL_ELEMENT_QUEUE__TYPE_, oldType_, newType_);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType_(TypeInfo newType_) {
		if (newType_ != type_) {
			NotificationChain msgs = null;
			if (type_ != null)
				msgs = ((InternalEObject)type_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QoolPackage.MODEL_ELEMENT_QUEUE__TYPE_, null, msgs);
			if (newType_ != null)
				msgs = ((InternalEObject)newType_).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QoolPackage.MODEL_ELEMENT_QUEUE__TYPE_, null, msgs);
			msgs = basicSetType_(newType_, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QoolPackage.MODEL_ELEMENT_QUEUE__TYPE_, newType_, newType_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeInfo> getAdditionals() {
		if (additionals == null) {
			additionals = new EObjectContainmentEList<TypeInfo>(TypeInfo.class, this, QoolPackage.MODEL_ELEMENT_QUEUE__ADDITIONALS);
		}
		return additionals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension getExtension() {
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtension(Extension newExtension, NotificationChain msgs) {
		Extension oldExtension = extension;
		extension = newExtension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QoolPackage.MODEL_ELEMENT_QUEUE__EXTENSION, oldExtension, newExtension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtension(Extension newExtension) {
		if (newExtension != extension) {
			NotificationChain msgs = null;
			if (extension != null)
				msgs = ((InternalEObject)extension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QoolPackage.MODEL_ELEMENT_QUEUE__EXTENSION, null, msgs);
			if (newExtension != null)
				msgs = ((InternalEObject)newExtension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QoolPackage.MODEL_ELEMENT_QUEUE__EXTENSION, null, msgs);
			msgs = basicSetExtension(newExtension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QoolPackage.MODEL_ELEMENT_QUEUE__EXTENSION, newExtension, newExtension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QoolPackage.MODEL_ELEMENT_QUEUE__TYPE_:
				return basicSetType_(null, msgs);
			case QoolPackage.MODEL_ELEMENT_QUEUE__ADDITIONALS:
				return ((InternalEList<?>)getAdditionals()).basicRemove(otherEnd, msgs);
			case QoolPackage.MODEL_ELEMENT_QUEUE__EXTENSION:
				return basicSetExtension(null, msgs);
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
			case QoolPackage.MODEL_ELEMENT_QUEUE__TYPE_:
				return getType_();
			case QoolPackage.MODEL_ELEMENT_QUEUE__ADDITIONALS:
				return getAdditionals();
			case QoolPackage.MODEL_ELEMENT_QUEUE__EXTENSION:
				return getExtension();
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
			case QoolPackage.MODEL_ELEMENT_QUEUE__TYPE_:
				setType_((TypeInfo)newValue);
				return;
			case QoolPackage.MODEL_ELEMENT_QUEUE__ADDITIONALS:
				getAdditionals().clear();
				getAdditionals().addAll((Collection<? extends TypeInfo>)newValue);
				return;
			case QoolPackage.MODEL_ELEMENT_QUEUE__EXTENSION:
				setExtension((Extension)newValue);
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
			case QoolPackage.MODEL_ELEMENT_QUEUE__TYPE_:
				setType_((TypeInfo)null);
				return;
			case QoolPackage.MODEL_ELEMENT_QUEUE__ADDITIONALS:
				getAdditionals().clear();
				return;
			case QoolPackage.MODEL_ELEMENT_QUEUE__EXTENSION:
				setExtension((Extension)null);
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
			case QoolPackage.MODEL_ELEMENT_QUEUE__TYPE_:
				return type_ != null;
			case QoolPackage.MODEL_ELEMENT_QUEUE__ADDITIONALS:
				return additionals != null && !additionals.isEmpty();
			case QoolPackage.MODEL_ELEMENT_QUEUE__EXTENSION:
				return extension != null;
		}
		return super.eIsSet(featureID);
	}

} //ModelElementQueueImpl
