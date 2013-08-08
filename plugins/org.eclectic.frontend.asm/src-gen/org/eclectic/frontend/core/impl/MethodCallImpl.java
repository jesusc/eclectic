/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.core.impl;

import java.util.Collection;

import org.eclectic.frontend.core.CorePackage;
import org.eclectic.frontend.core.Expression;
import org.eclectic.frontend.core.MethodCall;

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
 * An implementation of the model object '<em><b>Method Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.frontend.core.impl.MethodCallImpl#getReceptor <em>Receptor</em>}</li>
 *   <li>{@link org.eclectic.frontend.core.impl.MethodCallImpl#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link org.eclectic.frontend.core.impl.MethodCallImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclectic.frontend.core.impl.MethodCallImpl#isWithParameters <em>With Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodCallImpl extends ExpressionImpl implements MethodCall {
	/**
	 * The cached value of the '{@link #getReceptor() <em>Receptor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceptor()
	 * @generated
	 * @ordered
	 */
	protected Expression receptor;

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
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> parameters;

	/**
	 * The default value of the '{@link #isWithParameters() <em>With Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWithParameters()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WITH_PARAMETERS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWithParameters() <em>With Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWithParameters()
	 * @generated
	 * @ordered
	 */
	protected boolean withParameters = WITH_PARAMETERS_EDEFAULT;

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
		return CorePackage.Literals.METHOD_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getReceptor() {
		return receptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceptor(Expression newReceptor, NotificationChain msgs) {
		Expression oldReceptor = receptor;
		receptor = newReceptor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.METHOD_CALL__RECEPTOR, oldReceptor, newReceptor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceptor(Expression newReceptor) {
		if (newReceptor != receptor) {
			NotificationChain msgs = null;
			if (receptor != null)
				msgs = ((InternalEObject)receptor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.METHOD_CALL__RECEPTOR, null, msgs);
			if (newReceptor != null)
				msgs = ((InternalEObject)newReceptor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.METHOD_CALL__RECEPTOR, null, msgs);
			msgs = basicSetReceptor(newReceptor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.METHOD_CALL__RECEPTOR, newReceptor, newReceptor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.METHOD_CALL__METHOD_NAME, oldMethodName, methodName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Expression>(Expression.class, this, CorePackage.METHOD_CALL__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWithParameters() {
		return withParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWithParameters(boolean newWithParameters) {
		boolean oldWithParameters = withParameters;
		withParameters = newWithParameters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.METHOD_CALL__WITH_PARAMETERS, oldWithParameters, withParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.METHOD_CALL__RECEPTOR:
				return basicSetReceptor(null, msgs);
			case CorePackage.METHOD_CALL__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case CorePackage.METHOD_CALL__RECEPTOR:
				return getReceptor();
			case CorePackage.METHOD_CALL__METHOD_NAME:
				return getMethodName();
			case CorePackage.METHOD_CALL__PARAMETERS:
				return getParameters();
			case CorePackage.METHOD_CALL__WITH_PARAMETERS:
				return isWithParameters();
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
			case CorePackage.METHOD_CALL__RECEPTOR:
				setReceptor((Expression)newValue);
				return;
			case CorePackage.METHOD_CALL__METHOD_NAME:
				setMethodName((String)newValue);
				return;
			case CorePackage.METHOD_CALL__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Expression>)newValue);
				return;
			case CorePackage.METHOD_CALL__WITH_PARAMETERS:
				setWithParameters((Boolean)newValue);
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
			case CorePackage.METHOD_CALL__RECEPTOR:
				setReceptor((Expression)null);
				return;
			case CorePackage.METHOD_CALL__METHOD_NAME:
				setMethodName(METHOD_NAME_EDEFAULT);
				return;
			case CorePackage.METHOD_CALL__PARAMETERS:
				getParameters().clear();
				return;
			case CorePackage.METHOD_CALL__WITH_PARAMETERS:
				setWithParameters(WITH_PARAMETERS_EDEFAULT);
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
			case CorePackage.METHOD_CALL__RECEPTOR:
				return receptor != null;
			case CorePackage.METHOD_CALL__METHOD_NAME:
				return METHOD_NAME_EDEFAULT == null ? methodName != null : !METHOD_NAME_EDEFAULT.equals(methodName);
			case CorePackage.METHOD_CALL__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case CorePackage.METHOD_CALL__WITH_PARAMETERS:
				return withParameters != WITH_PARAMETERS_EDEFAULT;
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
		result.append(", withParameters: ");
		result.append(withParameters);
		result.append(')');
		return result.toString();
	}

} //MethodCallImpl
