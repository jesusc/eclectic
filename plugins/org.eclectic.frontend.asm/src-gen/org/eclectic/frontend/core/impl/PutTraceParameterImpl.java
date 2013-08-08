/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.core.impl;

import org.eclectic.frontend.core.CorePackage;
import org.eclectic.frontend.core.Expression;
import org.eclectic.frontend.core.PutTraceParameter;
import org.eclectic.frontend.core.TraceElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Put Trace Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.frontend.core.impl.PutTraceParameterImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclectic.frontend.core.impl.PutTraceParameterImpl#getTraceVar <em>Trace Var</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PutTraceParameterImpl extends EObjectImpl implements PutTraceParameter {
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Expression value;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PutTraceParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.PUT_TRACE_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(Expression newValue, NotificationChain msgs) {
		Expression oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.PUT_TRACE_PARAMETER__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Expression newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.PUT_TRACE_PARAMETER__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.PUT_TRACE_PARAMETER__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PUT_TRACE_PARAMETER__VALUE, newValue, newValue));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.PUT_TRACE_PARAMETER__TRACE_VAR, oldTraceVar, traceVar));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PUT_TRACE_PARAMETER__TRACE_VAR, oldTraceVar, traceVar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.PUT_TRACE_PARAMETER__VALUE:
				return basicSetValue(null, msgs);
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
			case CorePackage.PUT_TRACE_PARAMETER__VALUE:
				return getValue();
			case CorePackage.PUT_TRACE_PARAMETER__TRACE_VAR:
				if (resolve) return getTraceVar();
				return basicGetTraceVar();
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
			case CorePackage.PUT_TRACE_PARAMETER__VALUE:
				setValue((Expression)newValue);
				return;
			case CorePackage.PUT_TRACE_PARAMETER__TRACE_VAR:
				setTraceVar((TraceElement)newValue);
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
			case CorePackage.PUT_TRACE_PARAMETER__VALUE:
				setValue((Expression)null);
				return;
			case CorePackage.PUT_TRACE_PARAMETER__TRACE_VAR:
				setTraceVar((TraceElement)null);
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
			case CorePackage.PUT_TRACE_PARAMETER__VALUE:
				return value != null;
			case CorePackage.PUT_TRACE_PARAMETER__TRACE_VAR:
				return traceVar != null;
		}
		return super.eIsSet(featureID);
	}

} //PutTraceParameterImpl
