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
import org.eclectic.frontend.core.KeywordMethodCall;
import org.eclectic.frontend.core.KeywordParameter;

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
 * An implementation of the model object '<em><b>Keyword Method Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.frontend.core.impl.KeywordMethodCallImpl#getReceptor <em>Receptor</em>}</li>
 *   <li>{@link org.eclectic.frontend.core.impl.KeywordMethodCallImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KeywordMethodCallImpl extends ExpressionImpl implements KeywordMethodCall {
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
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<KeywordParameter> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeywordMethodCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.KEYWORD_METHOD_CALL;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.KEYWORD_METHOD_CALL__RECEPTOR, oldReceptor, newReceptor);
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
				msgs = ((InternalEObject)receptor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.KEYWORD_METHOD_CALL__RECEPTOR, null, msgs);
			if (newReceptor != null)
				msgs = ((InternalEObject)newReceptor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.KEYWORD_METHOD_CALL__RECEPTOR, null, msgs);
			msgs = basicSetReceptor(newReceptor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.KEYWORD_METHOD_CALL__RECEPTOR, newReceptor, newReceptor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeywordParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<KeywordParameter>(KeywordParameter.class, this, CorePackage.KEYWORD_METHOD_CALL__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.KEYWORD_METHOD_CALL__RECEPTOR:
				return basicSetReceptor(null, msgs);
			case CorePackage.KEYWORD_METHOD_CALL__PARAMETERS:
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
			case CorePackage.KEYWORD_METHOD_CALL__RECEPTOR:
				return getReceptor();
			case CorePackage.KEYWORD_METHOD_CALL__PARAMETERS:
				return getParameters();
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
			case CorePackage.KEYWORD_METHOD_CALL__RECEPTOR:
				setReceptor((Expression)newValue);
				return;
			case CorePackage.KEYWORD_METHOD_CALL__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends KeywordParameter>)newValue);
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
			case CorePackage.KEYWORD_METHOD_CALL__RECEPTOR:
				setReceptor((Expression)null);
				return;
			case CorePackage.KEYWORD_METHOD_CALL__PARAMETERS:
				getParameters().clear();
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
			case CorePackage.KEYWORD_METHOD_CALL__RECEPTOR:
				return receptor != null;
			case CorePackage.KEYWORD_METHOD_CALL__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //KeywordMethodCallImpl
