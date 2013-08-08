/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.qool.impl;

import java.util.Collection;

import org.eclectic.frontend.core.InlineModel;
import org.eclectic.frontend.core.TraceInterface;

import org.eclectic.frontend.core.impl.TransformationDefinitionImpl;

import org.eclectic.frontend.qool.KoanRule;
import org.eclectic.frontend.qool.QoolPackage;
import org.eclectic.frontend.qool.QoolQueue;
import org.eclectic.frontend.qool.QoolTransformation;

import org.eclectic.frontend.qool.Segment;
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
 *   <li>{@link org.eclectic.frontend.qool.impl.QoolTransformationImpl#getQueues <em>Queues</em>}</li>
 *   <li>{@link org.eclectic.frontend.qool.impl.QoolTransformationImpl#getSegments <em>Segments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QoolTransformationImpl extends TransformationDefinitionImpl implements QoolTransformation {
	/**
	 * The cached value of the '{@link #getQueues() <em>Queues</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueues()
	 * @generated
	 * @ordered
	 */
	protected EList<QoolQueue> queues;

	/**
	 * The cached value of the '{@link #getSegments() <em>Segments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegments()
	 * @generated
	 * @ordered
	 */
	protected EList<Segment> segments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QoolTransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QoolPackage.Literals.QOOL_TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QoolQueue> getQueues() {
		if (queues == null) {
			queues = new EObjectContainmentEList<QoolQueue>(QoolQueue.class, this, QoolPackage.QOOL_TRANSFORMATION__QUEUES);
		}
		return queues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Segment> getSegments() {
		if (segments == null) {
			segments = new EObjectContainmentEList<Segment>(Segment.class, this, QoolPackage.QOOL_TRANSFORMATION__SEGMENTS);
		}
		return segments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QoolPackage.QOOL_TRANSFORMATION__QUEUES:
				return ((InternalEList<?>)getQueues()).basicRemove(otherEnd, msgs);
			case QoolPackage.QOOL_TRANSFORMATION__SEGMENTS:
				return ((InternalEList<?>)getSegments()).basicRemove(otherEnd, msgs);
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
			case QoolPackage.QOOL_TRANSFORMATION__QUEUES:
				return getQueues();
			case QoolPackage.QOOL_TRANSFORMATION__SEGMENTS:
				return getSegments();
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
			case QoolPackage.QOOL_TRANSFORMATION__QUEUES:
				getQueues().clear();
				getQueues().addAll((Collection<? extends QoolQueue>)newValue);
				return;
			case QoolPackage.QOOL_TRANSFORMATION__SEGMENTS:
				getSegments().clear();
				getSegments().addAll((Collection<? extends Segment>)newValue);
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
			case QoolPackage.QOOL_TRANSFORMATION__QUEUES:
				getQueues().clear();
				return;
			case QoolPackage.QOOL_TRANSFORMATION__SEGMENTS:
				getSegments().clear();
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
			case QoolPackage.QOOL_TRANSFORMATION__QUEUES:
				return queues != null && !queues.isEmpty();
			case QoolPackage.QOOL_TRANSFORMATION__SEGMENTS:
				return segments != null && !segments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QoolTransformationImpl
