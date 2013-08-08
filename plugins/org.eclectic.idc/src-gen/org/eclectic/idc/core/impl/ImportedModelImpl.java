/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.core.impl;

import java.util.Collection;
import org.eclectic.idc.core.CorePackage;
import org.eclectic.idc.core.ImportedModel;

import org.eclectic.idc.qool.QoolPackage;
import org.eclectic.idc.qool.RequiredQueue;
import org.eclectic.idc.qool.Queue;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imported Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.idc.core.impl.ImportedModelImpl#getCapabilityQueues <em>Capability Queues</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImportedModelImpl extends ModelDefinitionImpl implements ImportedModel {
	/**
	 * The cached value of the '{@link #getCapabilityQueues() <em>Capability Queues</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityQueues()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredQueue> capabilityQueues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportedModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.IMPORTED_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequiredQueue> getCapabilityQueues() {
		if (capabilityQueues == null) {
			capabilityQueues = new EObjectContainmentWithInverseEList<RequiredQueue>(RequiredQueue.class, this, CorePackage.IMPORTED_MODEL__CAPABILITY_QUEUES, QoolPackage.REQUIRED_QUEUE__IMPORTED_MODEL);
		}
		return capabilityQueues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.IMPORTED_MODEL__CAPABILITY_QUEUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCapabilityQueues()).basicAdd(otherEnd, msgs);
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
			case CorePackage.IMPORTED_MODEL__CAPABILITY_QUEUES:
				return ((InternalEList<?>)getCapabilityQueues()).basicRemove(otherEnd, msgs);
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
			case CorePackage.IMPORTED_MODEL__CAPABILITY_QUEUES:
				return getCapabilityQueues();
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
			case CorePackage.IMPORTED_MODEL__CAPABILITY_QUEUES:
				getCapabilityQueues().clear();
				getCapabilityQueues().addAll((Collection<? extends RequiredQueue>)newValue);
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
			case CorePackage.IMPORTED_MODEL__CAPABILITY_QUEUES:
				getCapabilityQueues().clear();
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
			case CorePackage.IMPORTED_MODEL__CAPABILITY_QUEUES:
				return capabilityQueues != null && !capabilityQueues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImportedModelImpl
