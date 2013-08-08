/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.qool.impl;

import java.util.Collection;
import org.eclectic.idc.core.impl.ExecutableUnitImpl;

import org.eclectic.idc.qool.InlineModel;
import org.eclectic.idc.qool.QoolPackage;
import org.eclectic.idc.qool.QoolTransformation;
import org.eclectic.idc.qool.Queue;
import org.eclectic.idc.qool.Segment;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.idc.qool.impl.QoolTransformationImpl#getSegments <em>Segments</em>}</li>
 *   <li>{@link org.eclectic.idc.qool.impl.QoolTransformationImpl#getQueues <em>Queues</em>}</li>
 *   <li>{@link org.eclectic.idc.qool.impl.QoolTransformationImpl#getProvided <em>Provided</em>}</li>
 *   <li>{@link org.eclectic.idc.qool.impl.QoolTransformationImpl#getInlineModels <em>Inline Models</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QoolTransformationImpl extends ExecutableUnitImpl implements QoolTransformation {
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
	 * The cached value of the '{@link #getQueues() <em>Queues</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueues()
	 * @generated
	 * @ordered
	 */
	protected EList<Queue> queues;
	/**
	 * The cached value of the '{@link #getProvided() <em>Provided</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvided()
	 * @generated
	 * @ordered
	 */
	protected EList<Queue> provided;
	/**
	 * The cached value of the '{@link #getInlineModels() <em>Inline Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInlineModels()
	 * @generated
	 * @ordered
	 */
	protected EList<InlineModel> inlineModels;
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
	public EList<Queue> getQueues() {
		if (queues == null) {
			queues = new EObjectContainmentEList<Queue>(Queue.class, this, QoolPackage.QOOL_TRANSFORMATION__QUEUES);
		}
		return queues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Queue> getProvided() {
		if (provided == null) {
			provided = new EObjectResolvingEList<Queue>(Queue.class, this, QoolPackage.QOOL_TRANSFORMATION__PROVIDED);
		}
		return provided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InlineModel> getInlineModels() {
		if (inlineModels == null) {
			inlineModels = new EObjectContainmentEList<InlineModel>(InlineModel.class, this, QoolPackage.QOOL_TRANSFORMATION__INLINE_MODELS);
		}
		return inlineModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QoolPackage.QOOL_TRANSFORMATION__SEGMENTS:
				return ((InternalEList<?>)getSegments()).basicRemove(otherEnd, msgs);
			case QoolPackage.QOOL_TRANSFORMATION__QUEUES:
				return ((InternalEList<?>)getQueues()).basicRemove(otherEnd, msgs);
			case QoolPackage.QOOL_TRANSFORMATION__INLINE_MODELS:
				return ((InternalEList<?>)getInlineModels()).basicRemove(otherEnd, msgs);
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
			case QoolPackage.QOOL_TRANSFORMATION__SEGMENTS:
				return getSegments();
			case QoolPackage.QOOL_TRANSFORMATION__QUEUES:
				return getQueues();
			case QoolPackage.QOOL_TRANSFORMATION__PROVIDED:
				return getProvided();
			case QoolPackage.QOOL_TRANSFORMATION__INLINE_MODELS:
				return getInlineModels();
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
			case QoolPackage.QOOL_TRANSFORMATION__SEGMENTS:
				getSegments().clear();
				getSegments().addAll((Collection<? extends Segment>)newValue);
				return;
			case QoolPackage.QOOL_TRANSFORMATION__QUEUES:
				getQueues().clear();
				getQueues().addAll((Collection<? extends Queue>)newValue);
				return;
			case QoolPackage.QOOL_TRANSFORMATION__PROVIDED:
				getProvided().clear();
				getProvided().addAll((Collection<? extends Queue>)newValue);
				return;
			case QoolPackage.QOOL_TRANSFORMATION__INLINE_MODELS:
				getInlineModels().clear();
				getInlineModels().addAll((Collection<? extends InlineModel>)newValue);
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
			case QoolPackage.QOOL_TRANSFORMATION__SEGMENTS:
				getSegments().clear();
				return;
			case QoolPackage.QOOL_TRANSFORMATION__QUEUES:
				getQueues().clear();
				return;
			case QoolPackage.QOOL_TRANSFORMATION__PROVIDED:
				getProvided().clear();
				return;
			case QoolPackage.QOOL_TRANSFORMATION__INLINE_MODELS:
				getInlineModels().clear();
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
			case QoolPackage.QOOL_TRANSFORMATION__SEGMENTS:
				return segments != null && !segments.isEmpty();
			case QoolPackage.QOOL_TRANSFORMATION__QUEUES:
				return queues != null && !queues.isEmpty();
			case QoolPackage.QOOL_TRANSFORMATION__PROVIDED:
				return provided != null && !provided.isEmpty();
			case QoolPackage.QOOL_TRANSFORMATION__INLINE_MODELS:
				return inlineModels != null && !inlineModels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QoolTransformationImpl
