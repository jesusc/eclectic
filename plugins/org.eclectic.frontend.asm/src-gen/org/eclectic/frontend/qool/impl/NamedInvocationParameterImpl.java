/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.qool.impl;

import org.eclectic.frontend.core.Expression;

import org.eclectic.frontend.qool.NamedInvocationParameter;
import org.eclectic.frontend.qool.QoolPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

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
 *   <li>{@link org.eclectic.frontend.qool.impl.NamedInvocationParameterImpl#getFormalName <em>Formal Name</em>}</li>
 *   <li>{@link org.eclectic.frontend.qool.impl.NamedInvocationParameterImpl#getActualParameter <em>Actual Parameter</em>}</li>
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
	 * The cached value of the '{@link #getActualParameter() <em>Actual Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualParameter()
	 * @generated
	 * @ordered
	 */
	protected Expression actualParameter;

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
		return QoolPackage.Literals.NAMED_INVOCATION_PARAMETER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, QoolPackage.NAMED_INVOCATION_PARAMETER__FORMAL_NAME, oldFormalName, formalName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getActualParameter() {
		return actualParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActualParameter(Expression newActualParameter, NotificationChain msgs) {
		Expression oldActualParameter = actualParameter;
		actualParameter = newActualParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QoolPackage.NAMED_INVOCATION_PARAMETER__ACTUAL_PARAMETER, oldActualParameter, newActualParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualParameter(Expression newActualParameter) {
		if (newActualParameter != actualParameter) {
			NotificationChain msgs = null;
			if (actualParameter != null)
				msgs = ((InternalEObject)actualParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QoolPackage.NAMED_INVOCATION_PARAMETER__ACTUAL_PARAMETER, null, msgs);
			if (newActualParameter != null)
				msgs = ((InternalEObject)newActualParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QoolPackage.NAMED_INVOCATION_PARAMETER__ACTUAL_PARAMETER, null, msgs);
			msgs = basicSetActualParameter(newActualParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QoolPackage.NAMED_INVOCATION_PARAMETER__ACTUAL_PARAMETER, newActualParameter, newActualParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QoolPackage.NAMED_INVOCATION_PARAMETER__ACTUAL_PARAMETER:
				return basicSetActualParameter(null, msgs);
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
			case QoolPackage.NAMED_INVOCATION_PARAMETER__FORMAL_NAME:
				return getFormalName();
			case QoolPackage.NAMED_INVOCATION_PARAMETER__ACTUAL_PARAMETER:
				return getActualParameter();
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
			case QoolPackage.NAMED_INVOCATION_PARAMETER__FORMAL_NAME:
				setFormalName((String)newValue);
				return;
			case QoolPackage.NAMED_INVOCATION_PARAMETER__ACTUAL_PARAMETER:
				setActualParameter((Expression)newValue);
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
			case QoolPackage.NAMED_INVOCATION_PARAMETER__FORMAL_NAME:
				setFormalName(FORMAL_NAME_EDEFAULT);
				return;
			case QoolPackage.NAMED_INVOCATION_PARAMETER__ACTUAL_PARAMETER:
				setActualParameter((Expression)null);
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
			case QoolPackage.NAMED_INVOCATION_PARAMETER__FORMAL_NAME:
				return FORMAL_NAME_EDEFAULT == null ? formalName != null : !FORMAL_NAME_EDEFAULT.equals(formalName);
			case QoolPackage.NAMED_INVOCATION_PARAMETER__ACTUAL_PARAMETER:
				return actualParameter != null;
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
