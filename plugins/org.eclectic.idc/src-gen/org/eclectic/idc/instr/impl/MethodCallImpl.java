/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.instr.impl;

import java.util.Collection;

import org.eclectic.idc.core.CorePackage;
import org.eclectic.idc.core.TypeInfo;
import org.eclectic.idc.core.Variable;

import org.eclectic.idc.instr.InstrPackage;
import org.eclectic.idc.instr.MethodCall;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.idc.instr.impl.MethodCallImpl#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.impl.MethodCallImpl#getReceptor <em>Receptor</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.impl.MethodCallImpl#getActualParameters <em>Actual Parameters</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.impl.MethodCallImpl#isMaybeGet <em>Maybe Get</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.impl.MethodCallImpl#getReceptorType <em>Receptor Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodCallImpl extends InstructionWithResultImpl implements MethodCall {
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
	 * The cached value of the '{@link #getReceptor() <em>Receptor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceptor()
	 * @generated
	 * @ordered
	 */
	protected Variable receptor;

	/**
	 * The cached value of the '{@link #getActualParameters() <em>Actual Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> actualParameters;

	/**
	 * The default value of the '{@link #isMaybeGet() <em>Maybe Get</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMaybeGet()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MAYBE_GET_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMaybeGet() <em>Maybe Get</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMaybeGet()
	 * @generated
	 * @ordered
	 */
	protected boolean maybeGet = MAYBE_GET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReceptorType() <em>Receptor Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceptorType()
	 * @generated
	 * @ordered
	 */
	protected TypeInfo receptorType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstrPackage.Literals.METHOD_CALL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, InstrPackage.METHOD_CALL__METHOD_NAME, oldMethodName, methodName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getReceptor() {
		if (receptor != null && receptor.eIsProxy()) {
			InternalEObject oldReceptor = (InternalEObject)receptor;
			receptor = (Variable)eResolveProxy(oldReceptor);
			if (receptor != oldReceptor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstrPackage.METHOD_CALL__RECEPTOR, oldReceptor, receptor));
			}
		}
		return receptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetReceptor() {
		return receptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceptor(Variable newReceptor, NotificationChain msgs) {
		Variable oldReceptor = receptor;
		receptor = newReceptor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstrPackage.METHOD_CALL__RECEPTOR, oldReceptor, newReceptor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceptor(Variable newReceptor) {
		if (newReceptor != receptor) {
			NotificationChain msgs = null;
			if (receptor != null)
				msgs = ((InternalEObject)receptor).eInverseRemove(this, CorePackage.VARIABLE__CALL_RECEPTORS, Variable.class, msgs);
			if (newReceptor != null)
				msgs = ((InternalEObject)newReceptor).eInverseAdd(this, CorePackage.VARIABLE__CALL_RECEPTORS, Variable.class, msgs);
			msgs = basicSetReceptor(newReceptor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstrPackage.METHOD_CALL__RECEPTOR, newReceptor, newReceptor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getActualParameters() {
		if (actualParameters == null) {
			actualParameters = new EObjectWithInverseResolvingEList.ManyInverse<Variable>(Variable.class, this, InstrPackage.METHOD_CALL__ACTUAL_PARAMETERS, CorePackage.VARIABLE__CALL_PARAMETERS);
		}
		return actualParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMaybeGet() {
		return maybeGet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaybeGet(boolean newMaybeGet) {
		boolean oldMaybeGet = maybeGet;
		maybeGet = newMaybeGet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstrPackage.METHOD_CALL__MAYBE_GET, oldMaybeGet, maybeGet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeInfo getReceptorType() {
		return receptorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceptorType(TypeInfo newReceptorType, NotificationChain msgs) {
		TypeInfo oldReceptorType = receptorType;
		receptorType = newReceptorType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstrPackage.METHOD_CALL__RECEPTOR_TYPE, oldReceptorType, newReceptorType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceptorType(TypeInfo newReceptorType) {
		if (newReceptorType != receptorType) {
			NotificationChain msgs = null;
			if (receptorType != null)
				msgs = ((InternalEObject)receptorType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstrPackage.METHOD_CALL__RECEPTOR_TYPE, null, msgs);
			if (newReceptorType != null)
				msgs = ((InternalEObject)newReceptorType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstrPackage.METHOD_CALL__RECEPTOR_TYPE, null, msgs);
			msgs = basicSetReceptorType(newReceptorType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstrPackage.METHOD_CALL__RECEPTOR_TYPE, newReceptorType, newReceptorType));
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
			case InstrPackage.METHOD_CALL__RECEPTOR:
				if (receptor != null)
					msgs = ((InternalEObject)receptor).eInverseRemove(this, CorePackage.VARIABLE__CALL_RECEPTORS, Variable.class, msgs);
				return basicSetReceptor((Variable)otherEnd, msgs);
			case InstrPackage.METHOD_CALL__ACTUAL_PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActualParameters()).basicAdd(otherEnd, msgs);
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
			case InstrPackage.METHOD_CALL__RECEPTOR:
				return basicSetReceptor(null, msgs);
			case InstrPackage.METHOD_CALL__ACTUAL_PARAMETERS:
				return ((InternalEList<?>)getActualParameters()).basicRemove(otherEnd, msgs);
			case InstrPackage.METHOD_CALL__RECEPTOR_TYPE:
				return basicSetReceptorType(null, msgs);
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
			case InstrPackage.METHOD_CALL__METHOD_NAME:
				return getMethodName();
			case InstrPackage.METHOD_CALL__RECEPTOR:
				if (resolve) return getReceptor();
				return basicGetReceptor();
			case InstrPackage.METHOD_CALL__ACTUAL_PARAMETERS:
				return getActualParameters();
			case InstrPackage.METHOD_CALL__MAYBE_GET:
				return isMaybeGet();
			case InstrPackage.METHOD_CALL__RECEPTOR_TYPE:
				return getReceptorType();
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
			case InstrPackage.METHOD_CALL__METHOD_NAME:
				setMethodName((String)newValue);
				return;
			case InstrPackage.METHOD_CALL__RECEPTOR:
				setReceptor((Variable)newValue);
				return;
			case InstrPackage.METHOD_CALL__ACTUAL_PARAMETERS:
				getActualParameters().clear();
				getActualParameters().addAll((Collection<? extends Variable>)newValue);
				return;
			case InstrPackage.METHOD_CALL__MAYBE_GET:
				setMaybeGet((Boolean)newValue);
				return;
			case InstrPackage.METHOD_CALL__RECEPTOR_TYPE:
				setReceptorType((TypeInfo)newValue);
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
			case InstrPackage.METHOD_CALL__METHOD_NAME:
				setMethodName(METHOD_NAME_EDEFAULT);
				return;
			case InstrPackage.METHOD_CALL__RECEPTOR:
				setReceptor((Variable)null);
				return;
			case InstrPackage.METHOD_CALL__ACTUAL_PARAMETERS:
				getActualParameters().clear();
				return;
			case InstrPackage.METHOD_CALL__MAYBE_GET:
				setMaybeGet(MAYBE_GET_EDEFAULT);
				return;
			case InstrPackage.METHOD_CALL__RECEPTOR_TYPE:
				setReceptorType((TypeInfo)null);
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
			case InstrPackage.METHOD_CALL__METHOD_NAME:
				return METHOD_NAME_EDEFAULT == null ? methodName != null : !METHOD_NAME_EDEFAULT.equals(methodName);
			case InstrPackage.METHOD_CALL__RECEPTOR:
				return receptor != null;
			case InstrPackage.METHOD_CALL__ACTUAL_PARAMETERS:
				return actualParameters != null && !actualParameters.isEmpty();
			case InstrPackage.METHOD_CALL__MAYBE_GET:
				return maybeGet != MAYBE_GET_EDEFAULT;
			case InstrPackage.METHOD_CALL__RECEPTOR_TYPE:
				return receptorType != null;
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
		result.append(", maybeGet: ");
		result.append(maybeGet);
		result.append(')');
		return result.toString();
	}

} //MethodCallImpl
