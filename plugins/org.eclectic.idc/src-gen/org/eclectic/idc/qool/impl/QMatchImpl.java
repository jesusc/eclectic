/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.qool.impl;

import java.util.Collection;

import org.eclectic.idc.instr.ClosureDef;
import org.eclectic.idc.instr.impl.InstructionWithResultImpl;
import org.eclectic.idc.core.impl.InstructionImpl;

import org.eclectic.idc.qool.QMatch;
import org.eclectic.idc.qool.QMatchPredicate;
import org.eclectic.idc.qool.QoolPackage;
import org.eclectic.idc.qool.Queue;

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
 * An implementation of the model object '<em><b>QMatch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.idc.qool.impl.QMatchImpl#getQueue <em>Queue</em>}</li>
 *   <li>{@link org.eclectic.idc.qool.impl.QMatchImpl#getPredicates <em>Predicates</em>}</li>
 *   <li>{@link org.eclectic.idc.qool.impl.QMatchImpl#getGetterClosure <em>Getter Closure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QMatchImpl extends InstructionWithResultImpl implements QMatch {
	/**
	 * The cached value of the '{@link #getQueue() <em>Queue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueue()
	 * @generated
	 * @ordered
	 */
	protected Queue queue;

	/**
	 * The cached value of the '{@link #getPredicates() <em>Predicates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicates()
	 * @generated
	 * @ordered
	 */
	protected EList<QMatchPredicate> predicates;

	/**
	 * The cached value of the '{@link #getGetterClosure() <em>Getter Closure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetterClosure()
	 * @generated
	 * @ordered
	 */
	protected ClosureDef getterClosure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QMatchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QoolPackage.Literals.QMATCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Queue getQueue() {
		if (queue != null && queue.eIsProxy()) {
			InternalEObject oldQueue = (InternalEObject)queue;
			queue = (Queue)eResolveProxy(oldQueue);
			if (queue != oldQueue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QoolPackage.QMATCH__QUEUE, oldQueue, queue));
			}
		}
		return queue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Queue basicGetQueue() {
		return queue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueue(Queue newQueue) {
		Queue oldQueue = queue;
		queue = newQueue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QoolPackage.QMATCH__QUEUE, oldQueue, queue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QMatchPredicate> getPredicates() {
		if (predicates == null) {
			predicates = new EObjectContainmentEList<QMatchPredicate>(QMatchPredicate.class, this, QoolPackage.QMATCH__PREDICATES);
		}
		return predicates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClosureDef getGetterClosure() {
		if (getterClosure != null && getterClosure.eIsProxy()) {
			InternalEObject oldGetterClosure = (InternalEObject)getterClosure;
			getterClosure = (ClosureDef)eResolveProxy(oldGetterClosure);
			if (getterClosure != oldGetterClosure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QoolPackage.QMATCH__GETTER_CLOSURE, oldGetterClosure, getterClosure));
			}
		}
		return getterClosure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClosureDef basicGetGetterClosure() {
		return getterClosure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetterClosure(ClosureDef newGetterClosure) {
		ClosureDef oldGetterClosure = getterClosure;
		getterClosure = newGetterClosure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QoolPackage.QMATCH__GETTER_CLOSURE, oldGetterClosure, getterClosure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QoolPackage.QMATCH__PREDICATES:
				return ((InternalEList<?>)getPredicates()).basicRemove(otherEnd, msgs);
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
			case QoolPackage.QMATCH__QUEUE:
				if (resolve) return getQueue();
				return basicGetQueue();
			case QoolPackage.QMATCH__PREDICATES:
				return getPredicates();
			case QoolPackage.QMATCH__GETTER_CLOSURE:
				if (resolve) return getGetterClosure();
				return basicGetGetterClosure();
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
			case QoolPackage.QMATCH__QUEUE:
				setQueue((Queue)newValue);
				return;
			case QoolPackage.QMATCH__PREDICATES:
				getPredicates().clear();
				getPredicates().addAll((Collection<? extends QMatchPredicate>)newValue);
				return;
			case QoolPackage.QMATCH__GETTER_CLOSURE:
				setGetterClosure((ClosureDef)newValue);
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
			case QoolPackage.QMATCH__QUEUE:
				setQueue((Queue)null);
				return;
			case QoolPackage.QMATCH__PREDICATES:
				getPredicates().clear();
				return;
			case QoolPackage.QMATCH__GETTER_CLOSURE:
				setGetterClosure((ClosureDef)null);
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
			case QoolPackage.QMATCH__QUEUE:
				return queue != null;
			case QoolPackage.QMATCH__PREDICATES:
				return predicates != null && !predicates.isEmpty();
			case QoolPackage.QMATCH__GETTER_CLOSURE:
				return getterClosure != null;
		}
		return super.eIsSet(featureID);
	}

} //QMatchImpl
