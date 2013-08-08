/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.qool.impl;

import java.util.Collection;

import org.eclectic.frontend.core.impl.ExpressionImpl;
import org.eclectic.frontend.core.impl.StatementImpl;

import org.eclectic.frontend.qool.MatchExpression;
import org.eclectic.frontend.qool.MatchPredicate;
import org.eclectic.frontend.qool.QoolPackage;
import org.eclectic.frontend.qool.QoolQueue;

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
 * An implementation of the model object '<em><b>Match Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.frontend.qool.impl.MatchExpressionImpl#getQueue <em>Queue</em>}</li>
 *   <li>{@link org.eclectic.frontend.qool.impl.MatchExpressionImpl#getPredicates <em>Predicates</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MatchExpressionImpl extends ExpressionImpl implements MatchExpression {
	/**
	 * The cached value of the '{@link #getQueue() <em>Queue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueue()
	 * @generated
	 * @ordered
	 */
	protected QoolQueue queue;

	/**
	 * The cached value of the '{@link #getPredicates() <em>Predicates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicates()
	 * @generated
	 * @ordered
	 */
	protected EList<MatchPredicate> predicates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QoolPackage.Literals.MATCH_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoolQueue getQueue() {
		if (queue != null && queue.eIsProxy()) {
			InternalEObject oldQueue = (InternalEObject)queue;
			queue = (QoolQueue)eResolveProxy(oldQueue);
			if (queue != oldQueue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QoolPackage.MATCH_EXPRESSION__QUEUE, oldQueue, queue));
			}
		}
		return queue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoolQueue basicGetQueue() {
		return queue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueue(QoolQueue newQueue) {
		QoolQueue oldQueue = queue;
		queue = newQueue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QoolPackage.MATCH_EXPRESSION__QUEUE, oldQueue, queue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MatchPredicate> getPredicates() {
		if (predicates == null) {
			predicates = new EObjectContainmentEList<MatchPredicate>(MatchPredicate.class, this, QoolPackage.MATCH_EXPRESSION__PREDICATES);
		}
		return predicates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QoolPackage.MATCH_EXPRESSION__PREDICATES:
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
			case QoolPackage.MATCH_EXPRESSION__QUEUE:
				if (resolve) return getQueue();
				return basicGetQueue();
			case QoolPackage.MATCH_EXPRESSION__PREDICATES:
				return getPredicates();
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
			case QoolPackage.MATCH_EXPRESSION__QUEUE:
				setQueue((QoolQueue)newValue);
				return;
			case QoolPackage.MATCH_EXPRESSION__PREDICATES:
				getPredicates().clear();
				getPredicates().addAll((Collection<? extends MatchPredicate>)newValue);
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
			case QoolPackage.MATCH_EXPRESSION__QUEUE:
				setQueue((QoolQueue)null);
				return;
			case QoolPackage.MATCH_EXPRESSION__PREDICATES:
				getPredicates().clear();
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
			case QoolPackage.MATCH_EXPRESSION__QUEUE:
				return queue != null;
			case QoolPackage.MATCH_EXPRESSION__PREDICATES:
				return predicates != null && !predicates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MatchExpressionImpl
