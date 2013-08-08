/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.test.streaming.dtrace.impl;

import java.util.Collection;

import org.eclectic.test.streaming.dtrace.Classifier;
import org.eclectic.test.streaming.dtrace.DTracePackage;
import org.eclectic.test.streaming.dtrace.MethodExecution;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Execution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.test.streaming.dtrace.impl.MethodExecutionImpl#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link org.eclectic.test.streaming.dtrace.impl.MethodExecutionImpl#getDebugId <em>Debug Id</em>}</li>
 *   <li>{@link org.eclectic.test.streaming.dtrace.impl.MethodExecutionImpl#getCaller <em>Caller</em>}</li>
 *   <li>{@link org.eclectic.test.streaming.dtrace.impl.MethodExecutionImpl#getCallee <em>Callee</em>}</li>
 *   <li>{@link org.eclectic.test.streaming.dtrace.impl.MethodExecutionImpl#getReceptor <em>Receptor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MethodExecutionImpl extends ExecutionStatementImpl implements MethodExecution {
	/**
	 * The default value of the '{@link #getMethodName() <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodName()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethodName() <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodName()
	 * @generated
	 * @ordered
	 */
	protected String methodName = METHOD_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDebugId() <em>Debug Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebugId()
	 * @generated
	 * @ordered
	 */
	protected static final String DEBUG_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDebugId() <em>Debug Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebugId()
	 * @generated
	 * @ordered
	 */
	protected String debugId = DEBUG_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCaller() <em>Caller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaller()
	 * @generated
	 * @ordered
	 */
	protected MethodExecution caller;

	/**
	 * The cached value of the '{@link #getCallee() <em>Callee</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallee()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodExecution> callee;

	/**
	 * The cached value of the '{@link #getReceptor() <em>Receptor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceptor()
	 * @generated
	 * @ordered
	 */
	protected Classifier receptor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodExecutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DTracePackage.Literals.METHOD_EXECUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMethodName() {
		return methodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodName(String newMethodName) {
		String oldMethodName = methodName;
		methodName = newMethodName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DTracePackage.METHOD_EXECUTION__METHOD_NAME, oldMethodName, methodName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDebugId() {
		return debugId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebugId(String newDebugId) {
		String oldDebugId = debugId;
		debugId = newDebugId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DTracePackage.METHOD_EXECUTION__DEBUG_ID, oldDebugId, debugId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodExecution getCaller() {
		if (caller != null && caller.eIsProxy()) {
			InternalEObject oldCaller = (InternalEObject)caller;
			caller = (MethodExecution)eResolveProxy(oldCaller);
			if (caller != oldCaller) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DTracePackage.METHOD_EXECUTION__CALLER, oldCaller, caller));
			}
		}
		return caller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodExecution basicGetCaller() {
		return caller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaller(MethodExecution newCaller, NotificationChain msgs) {
		MethodExecution oldCaller = caller;
		caller = newCaller;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DTracePackage.METHOD_EXECUTION__CALLER, oldCaller, newCaller);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaller(MethodExecution newCaller) {
		if (newCaller != caller) {
			NotificationChain msgs = null;
			if (caller != null)
				msgs = ((InternalEObject)caller).eInverseRemove(this, DTracePackage.METHOD_EXECUTION__CALLEE, MethodExecution.class, msgs);
			if (newCaller != null)
				msgs = ((InternalEObject)newCaller).eInverseAdd(this, DTracePackage.METHOD_EXECUTION__CALLEE, MethodExecution.class, msgs);
			msgs = basicSetCaller(newCaller, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DTracePackage.METHOD_EXECUTION__CALLER, newCaller, newCaller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodExecution> getCallee() {
		if (callee == null) {
			callee = new EObjectWithInverseResolvingEList<MethodExecution>(MethodExecution.class, this, DTracePackage.METHOD_EXECUTION__CALLEE, DTracePackage.METHOD_EXECUTION__CALLER);
		}
		return callee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getReceptor() {
		if (receptor != null && receptor.eIsProxy()) {
			InternalEObject oldReceptor = (InternalEObject)receptor;
			receptor = (Classifier)eResolveProxy(oldReceptor);
			if (receptor != oldReceptor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DTracePackage.METHOD_EXECUTION__RECEPTOR, oldReceptor, receptor));
			}
		}
		return receptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetReceptor() {
		return receptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceptor(Classifier newReceptor) {
		Classifier oldReceptor = receptor;
		receptor = newReceptor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DTracePackage.METHOD_EXECUTION__RECEPTOR, oldReceptor, receptor));
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
			case DTracePackage.METHOD_EXECUTION__CALLER:
				if (caller != null)
					msgs = ((InternalEObject)caller).eInverseRemove(this, DTracePackage.METHOD_EXECUTION__CALLEE, MethodExecution.class, msgs);
				return basicSetCaller((MethodExecution)otherEnd, msgs);
			case DTracePackage.METHOD_EXECUTION__CALLEE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCallee()).basicAdd(otherEnd, msgs);
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
			case DTracePackage.METHOD_EXECUTION__CALLER:
				return basicSetCaller(null, msgs);
			case DTracePackage.METHOD_EXECUTION__CALLEE:
				return ((InternalEList<?>)getCallee()).basicRemove(otherEnd, msgs);
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
			case DTracePackage.METHOD_EXECUTION__METHOD_NAME:
				return getMethodName();
			case DTracePackage.METHOD_EXECUTION__DEBUG_ID:
				return getDebugId();
			case DTracePackage.METHOD_EXECUTION__CALLER:
				if (resolve) return getCaller();
				return basicGetCaller();
			case DTracePackage.METHOD_EXECUTION__CALLEE:
				return getCallee();
			case DTracePackage.METHOD_EXECUTION__RECEPTOR:
				if (resolve) return getReceptor();
				return basicGetReceptor();
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
			case DTracePackage.METHOD_EXECUTION__METHOD_NAME:
				setMethodName((String)newValue);
				return;
			case DTracePackage.METHOD_EXECUTION__DEBUG_ID:
				setDebugId((String)newValue);
				return;
			case DTracePackage.METHOD_EXECUTION__CALLER:
				setCaller((MethodExecution)newValue);
				return;
			case DTracePackage.METHOD_EXECUTION__CALLEE:
				getCallee().clear();
				getCallee().addAll((Collection<? extends MethodExecution>)newValue);
				return;
			case DTracePackage.METHOD_EXECUTION__RECEPTOR:
				setReceptor((Classifier)newValue);
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
			case DTracePackage.METHOD_EXECUTION__METHOD_NAME:
				setMethodName(METHOD_NAME_EDEFAULT);
				return;
			case DTracePackage.METHOD_EXECUTION__DEBUG_ID:
				setDebugId(DEBUG_ID_EDEFAULT);
				return;
			case DTracePackage.METHOD_EXECUTION__CALLER:
				setCaller((MethodExecution)null);
				return;
			case DTracePackage.METHOD_EXECUTION__CALLEE:
				getCallee().clear();
				return;
			case DTracePackage.METHOD_EXECUTION__RECEPTOR:
				setReceptor((Classifier)null);
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
			case DTracePackage.METHOD_EXECUTION__METHOD_NAME:
				return METHOD_NAME_EDEFAULT == null ? methodName != null : !METHOD_NAME_EDEFAULT.equals(methodName);
			case DTracePackage.METHOD_EXECUTION__DEBUG_ID:
				return DEBUG_ID_EDEFAULT == null ? debugId != null : !DEBUG_ID_EDEFAULT.equals(debugId);
			case DTracePackage.METHOD_EXECUTION__CALLER:
				return caller != null;
			case DTracePackage.METHOD_EXECUTION__CALLEE:
				return callee != null && !callee.isEmpty();
			case DTracePackage.METHOD_EXECUTION__RECEPTOR:
				return receptor != null;
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
		result.append(" (methodName: ");
		result.append(methodName);
		result.append(", debugId: ");
		result.append(debugId);
		result.append(')');
		return result.toString();
	}

} //MethodExecutionImpl
