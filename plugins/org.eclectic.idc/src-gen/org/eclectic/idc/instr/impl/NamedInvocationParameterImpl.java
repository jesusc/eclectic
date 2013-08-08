/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.instr.impl;

import org.eclectic.idc.core.Variable;

import org.eclectic.idc.instr.InstrPackage;
import org.eclectic.idc.instr.NamedInvocationParameter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Invocation Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.idc.instr.impl.NamedInvocationParameterImpl#getFormalName <em>Formal Name</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.impl.NamedInvocationParameterImpl#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NamedInvocationParameterImpl extends EObjectImpl implements NamedInvocationParameter {
	/**
	 * The default value of the '{@link #getFormalName() <em>Formal Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormalName()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormalName() <em>Formal Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormalName()
	 * @generated
	 * @ordered
	 */
	protected String formalName = FORMAL_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected Variable result;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedInvocationParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstrPackage.Literals.NAMED_INVOCATION_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormalName() {
		return formalName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormalName(String newFormalName) {
		String oldFormalName = formalName;
		formalName = newFormalName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstrPackage.NAMED_INVOCATION_PARAMETER__FORMAL_NAME, oldFormalName, formalName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getResult() {
		if (result != null && result.eIsProxy()) {
			InternalEObject oldResult = (InternalEObject)result;
			result = (Variable)eResolveProxy(oldResult);
			if (result != oldResult) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstrPackage.NAMED_INVOCATION_PARAMETER__RESULT, oldResult, result));
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(Variable newResult) {
		Variable oldResult = result;
		result = newResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstrPackage.NAMED_INVOCATION_PARAMETER__RESULT, oldResult, result));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InstrPackage.NAMED_INVOCATION_PARAMETER__FORMAL_NAME:
				return getFormalName();
			case InstrPackage.NAMED_INVOCATION_PARAMETER__RESULT:
				if (resolve) return getResult();
				return basicGetResult();
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
			case InstrPackage.NAMED_INVOCATION_PARAMETER__FORMAL_NAME:
				setFormalName((String)newValue);
				return;
			case InstrPackage.NAMED_INVOCATION_PARAMETER__RESULT:
				setResult((Variable)newValue);
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
			case InstrPackage.NAMED_INVOCATION_PARAMETER__FORMAL_NAME:
				setFormalName(FORMAL_NAME_EDEFAULT);
				return;
			case InstrPackage.NAMED_INVOCATION_PARAMETER__RESULT:
				setResult((Variable)null);
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
			case InstrPackage.NAMED_INVOCATION_PARAMETER__FORMAL_NAME:
				return FORMAL_NAME_EDEFAULT == null ? formalName != null : !FORMAL_NAME_EDEFAULT.equals(formalName);
			case InstrPackage.NAMED_INVOCATION_PARAMETER__RESULT:
				return result != null;
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
		result.append(" (formalName: ");
		result.append(formalName);
		result.append(')');
		return result.toString();
	}

} //NamedInvocationParameterImpl
