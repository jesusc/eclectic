/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.core.impl;

import org.eclectic.frontend.core.CorePackage;
import org.eclectic.frontend.core.MatchTrace;
import org.eclectic.frontend.core.ResolveTraceCardinality;
import org.eclectic.frontend.core.TraceCompareExpression;
import org.eclectic.frontend.core.TraceDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.frontend.core.impl.MatchTraceImpl#getTrace <em>Trace</em>}</li>
 *   <li>{@link org.eclectic.frontend.core.impl.MatchTraceImpl#getTraceExpr <em>Trace Expr</em>}</li>
 *   <li>{@link org.eclectic.frontend.core.impl.MatchTraceImpl#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MatchTraceImpl extends ExpressionImpl implements MatchTrace {
	/**
	 * The cached value of the '{@link #getTrace() <em>Trace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrace()
	 * @generated
	 * @ordered
	 */
	protected TraceDefinition trace;

	/**
	 * The cached value of the '{@link #getTraceExpr() <em>Trace Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceExpr()
	 * @generated
	 * @ordered
	 */
	protected TraceCompareExpression traceExpr;

	/**
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final ResolveTraceCardinality CARDINALITY_EDEFAULT = ResolveTraceCardinality.ONE_ONE;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected ResolveTraceCardinality cardinality = CARDINALITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.MATCH_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceDefinition getTrace() {
		if (trace != null && trace.eIsProxy()) {
			InternalEObject oldTrace = (InternalEObject)trace;
			trace = (TraceDefinition)eResolveProxy(oldTrace);
			if (trace != oldTrace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.MATCH_TRACE__TRACE, oldTrace, trace));
			}
		}
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceDefinition basicGetTrace() {
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrace(TraceDefinition newTrace) {
		TraceDefinition oldTrace = trace;
		trace = newTrace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.MATCH_TRACE__TRACE, oldTrace, trace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceCompareExpression getTraceExpr() {
		return traceExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTraceExpr(TraceCompareExpression newTraceExpr, NotificationChain msgs) {
		TraceCompareExpression oldTraceExpr = traceExpr;
		traceExpr = newTraceExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.MATCH_TRACE__TRACE_EXPR, oldTraceExpr, newTraceExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceExpr(TraceCompareExpression newTraceExpr) {
		if (newTraceExpr != traceExpr) {
			NotificationChain msgs = null;
			if (traceExpr != null)
				msgs = ((InternalEObject)traceExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.MATCH_TRACE__TRACE_EXPR, null, msgs);
			if (newTraceExpr != null)
				msgs = ((InternalEObject)newTraceExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.MATCH_TRACE__TRACE_EXPR, null, msgs);
			msgs = basicSetTraceExpr(newTraceExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.MATCH_TRACE__TRACE_EXPR, newTraceExpr, newTraceExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolveTraceCardinality getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(ResolveTraceCardinality newCardinality) {
		ResolveTraceCardinality oldCardinality = cardinality;
		cardinality = newCardinality == null ? CARDINALITY_EDEFAULT : newCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.MATCH_TRACE__CARDINALITY, oldCardinality, cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.MATCH_TRACE__TRACE_EXPR:
				return basicSetTraceExpr(null, msgs);
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
			case CorePackage.MATCH_TRACE__TRACE:
				if (resolve) return getTrace();
				return basicGetTrace();
			case CorePackage.MATCH_TRACE__TRACE_EXPR:
				return getTraceExpr();
			case CorePackage.MATCH_TRACE__CARDINALITY:
				return getCardinality();
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
			case CorePackage.MATCH_TRACE__TRACE:
				setTrace((TraceDefinition)newValue);
				return;
			case CorePackage.MATCH_TRACE__TRACE_EXPR:
				setTraceExpr((TraceCompareExpression)newValue);
				return;
			case CorePackage.MATCH_TRACE__CARDINALITY:
				setCardinality((ResolveTraceCardinality)newValue);
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
			case CorePackage.MATCH_TRACE__TRACE:
				setTrace((TraceDefinition)null);
				return;
			case CorePackage.MATCH_TRACE__TRACE_EXPR:
				setTraceExpr((TraceCompareExpression)null);
				return;
			case CorePackage.MATCH_TRACE__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
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
			case CorePackage.MATCH_TRACE__TRACE:
				return trace != null;
			case CorePackage.MATCH_TRACE__TRACE_EXPR:
				return traceExpr != null;
			case CorePackage.MATCH_TRACE__CARDINALITY:
				return cardinality != CARDINALITY_EDEFAULT;
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
		result.append(" (cardinality: ");
		result.append(cardinality);
		result.append(')');
		return result.toString();
	}

} //MatchTraceImpl
