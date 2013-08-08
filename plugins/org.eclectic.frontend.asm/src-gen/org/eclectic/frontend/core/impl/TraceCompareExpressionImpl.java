/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.core.impl;

import org.eclectic.frontend.core.CorePackage;
import org.eclectic.frontend.core.Expression;
import org.eclectic.frontend.core.TraceCompareExpression;
import org.eclectic.frontend.core.TraceElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace Compare Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.frontend.core.impl.TraceCompareExpressionImpl#isMultivaluedTag <em>Multivalued Tag</em>}</li>
 *   <li>{@link org.eclectic.frontend.core.impl.TraceCompareExpressionImpl#getTraceVar <em>Trace Var</em>}</li>
 *   <li>{@link org.eclectic.frontend.core.impl.TraceCompareExpressionImpl#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraceCompareExpressionImpl extends EObjectImpl implements TraceCompareExpression {
	/**
	 * The default value of the '{@link #isMultivaluedTag() <em>Multivalued Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultivaluedTag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTIVALUED_TAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMultivaluedTag() <em>Multivalued Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultivaluedTag()
	 * @generated
	 * @ordered
	 */
	protected boolean multivaluedTag = MULTIVALUED_TAG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTraceVar() <em>Trace Var</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceVar()
	 * @generated
	 * @ordered
	 */
	protected TraceElement traceVar;

	/**
	 * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpr()
	 * @generated
	 * @ordered
	 */
	protected Expression expr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceCompareExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.TRACE_COMPARE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultivaluedTag() {
		return multivaluedTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultivaluedTag(boolean newMultivaluedTag) {
		boolean oldMultivaluedTag = multivaluedTag;
		multivaluedTag = newMultivaluedTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TRACE_COMPARE_EXPRESSION__MULTIVALUED_TAG, oldMultivaluedTag, multivaluedTag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceElement getTraceVar() {
		if (traceVar != null && traceVar.eIsProxy()) {
			InternalEObject oldTraceVar = (InternalEObject)traceVar;
			traceVar = (TraceElement)eResolveProxy(oldTraceVar);
			if (traceVar != oldTraceVar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.TRACE_COMPARE_EXPRESSION__TRACE_VAR, oldTraceVar, traceVar));
			}
		}
		return traceVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceElement basicGetTraceVar() {
		return traceVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceVar(TraceElement newTraceVar) {
		TraceElement oldTraceVar = traceVar;
		traceVar = newTraceVar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TRACE_COMPARE_EXPRESSION__TRACE_VAR, oldTraceVar, traceVar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpr() {
		return expr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpr(Expression newExpr, NotificationChain msgs) {
		Expression oldExpr = expr;
		expr = newExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.TRACE_COMPARE_EXPRESSION__EXPR, oldExpr, newExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpr(Expression newExpr) {
		if (newExpr != expr) {
			NotificationChain msgs = null;
			if (expr != null)
				msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.TRACE_COMPARE_EXPRESSION__EXPR, null, msgs);
			if (newExpr != null)
				msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.TRACE_COMPARE_EXPRESSION__EXPR, null, msgs);
			msgs = basicSetExpr(newExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TRACE_COMPARE_EXPRESSION__EXPR, newExpr, newExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.TRACE_COMPARE_EXPRESSION__EXPR:
				return basicSetExpr(null, msgs);
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
			case CorePackage.TRACE_COMPARE_EXPRESSION__MULTIVALUED_TAG:
				return isMultivaluedTag();
			case CorePackage.TRACE_COMPARE_EXPRESSION__TRACE_VAR:
				if (resolve) return getTraceVar();
				return basicGetTraceVar();
			case CorePackage.TRACE_COMPARE_EXPRESSION__EXPR:
				return getExpr();
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
			case CorePackage.TRACE_COMPARE_EXPRESSION__MULTIVALUED_TAG:
				setMultivaluedTag((Boolean)newValue);
				return;
			case CorePackage.TRACE_COMPARE_EXPRESSION__TRACE_VAR:
				setTraceVar((TraceElement)newValue);
				return;
			case CorePackage.TRACE_COMPARE_EXPRESSION__EXPR:
				setExpr((Expression)newValue);
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
			case CorePackage.TRACE_COMPARE_EXPRESSION__MULTIVALUED_TAG:
				setMultivaluedTag(MULTIVALUED_TAG_EDEFAULT);
				return;
			case CorePackage.TRACE_COMPARE_EXPRESSION__TRACE_VAR:
				setTraceVar((TraceElement)null);
				return;
			case CorePackage.TRACE_COMPARE_EXPRESSION__EXPR:
				setExpr((Expression)null);
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
			case CorePackage.TRACE_COMPARE_EXPRESSION__MULTIVALUED_TAG:
				return multivaluedTag != MULTIVALUED_TAG_EDEFAULT;
			case CorePackage.TRACE_COMPARE_EXPRESSION__TRACE_VAR:
				return traceVar != null;
			case CorePackage.TRACE_COMPARE_EXPRESSION__EXPR:
				return expr != null;
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
		result.append(" (multivaluedTag: ");
		result.append(multivaluedTag);
		result.append(')');
		return result.toString();
	}

} //TraceCompareExpressionImpl
