/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.qool.impl;

import org.eclectic.idc.core.CorePackage;
import org.eclectic.idc.core.ImportedModel;
import org.eclectic.idc.qool.QoolPackage;
import org.eclectic.idc.qool.RequiredQueue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Required Queue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.idc.qool.impl.RequiredQueueImpl#getImportedModel <em>Imported Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequiredQueueImpl extends QueueImpl implements RequiredQueue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiredQueueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QoolPackage.Literals.REQUIRED_QUEUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportedModel getImportedModel() {
		if (eContainerFeatureID() != QoolPackage.REQUIRED_QUEUE__IMPORTED_MODEL) return null;
		return (ImportedModel)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedModel(ImportedModel newImportedModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newImportedModel, QoolPackage.REQUIRED_QUEUE__IMPORTED_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedModel(ImportedModel newImportedModel) {
		if (newImportedModel != eInternalContainer() || (eContainerFeatureID() != QoolPackage.REQUIRED_QUEUE__IMPORTED_MODEL && newImportedModel != null)) {
			if (EcoreUtil.isAncestor(this, newImportedModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newImportedModel != null)
				msgs = ((InternalEObject)newImportedModel).eInverseAdd(this, CorePackage.IMPORTED_MODEL__CAPABILITY_QUEUES, ImportedModel.class, msgs);
			msgs = basicSetImportedModel(newImportedModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QoolPackage.REQUIRED_QUEUE__IMPORTED_MODEL, newImportedModel, newImportedModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QoolPackage.REQUIRED_QUEUE__IMPORTED_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetImportedModel((ImportedModel)otherEnd, msgs);
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
			case QoolPackage.REQUIRED_QUEUE__IMPORTED_MODEL:
				return basicSetImportedModel(null, msgs);
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
			case QoolPackage.REQUIRED_QUEUE__IMPORTED_MODEL:
				return eInternalContainer().eInverseRemove(this, CorePackage.IMPORTED_MODEL__CAPABILITY_QUEUES, ImportedModel.class, msgs);
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
			case QoolPackage.REQUIRED_QUEUE__IMPORTED_MODEL:
				return getImportedModel();
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
			case QoolPackage.REQUIRED_QUEUE__IMPORTED_MODEL:
				setImportedModel((ImportedModel)newValue);
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
			case QoolPackage.REQUIRED_QUEUE__IMPORTED_MODEL:
				setImportedModel((ImportedModel)null);
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
			case QoolPackage.REQUIRED_QUEUE__IMPORTED_MODEL:
				return getImportedModel() != null;
		}
		return super.eIsSet(featureID);
	}

} //RequiredQueueImpl
