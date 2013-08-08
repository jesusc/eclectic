/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.instr.impl;

import org.eclectic.idc.core.ModelDefinition;

import org.eclectic.idc.instr.InstrPackage;
import org.eclectic.idc.instr.InvocationParameter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invocation Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.idc.instr.impl.InvocationParameterImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.impl.InvocationParameterImpl#getCalleeModelName <em>Callee Model Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InvocationParameterImpl extends EObjectImpl implements InvocationParameter {
	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected ModelDefinition model;

	/**
	 * The default value of the '{@link #getCalleeModelName() <em>Callee Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalleeModelName()
	 * @generated
	 * @ordered
	 */
	protected static final String CALLEE_MODEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCalleeModelName() <em>Callee Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalleeModelName()
	 * @generated
	 * @ordered
	 */
	protected String calleeModelName = CALLEE_MODEL_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvocationParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstrPackage.Literals.INVOCATION_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelDefinition getModel() {
		if (model != null && model.eIsProxy()) {
			InternalEObject oldModel = (InternalEObject)model;
			model = (ModelDefinition)eResolveProxy(oldModel);
			if (model != oldModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstrPackage.INVOCATION_PARAMETER__MODEL, oldModel, model));
			}
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelDefinition basicGetModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(ModelDefinition newModel) {
		ModelDefinition oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstrPackage.INVOCATION_PARAMETER__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCalleeModelName() {
		return calleeModelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalleeModelName(String newCalleeModelName) {
		String oldCalleeModelName = calleeModelName;
		calleeModelName = newCalleeModelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstrPackage.INVOCATION_PARAMETER__CALLEE_MODEL_NAME, oldCalleeModelName, calleeModelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InstrPackage.INVOCATION_PARAMETER__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
			case InstrPackage.INVOCATION_PARAMETER__CALLEE_MODEL_NAME:
				return getCalleeModelName();
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
			case InstrPackage.INVOCATION_PARAMETER__MODEL:
				setModel((ModelDefinition)newValue);
				return;
			case InstrPackage.INVOCATION_PARAMETER__CALLEE_MODEL_NAME:
				setCalleeModelName((String)newValue);
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
			case InstrPackage.INVOCATION_PARAMETER__MODEL:
				setModel((ModelDefinition)null);
				return;
			case InstrPackage.INVOCATION_PARAMETER__CALLEE_MODEL_NAME:
				setCalleeModelName(CALLEE_MODEL_NAME_EDEFAULT);
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
			case InstrPackage.INVOCATION_PARAMETER__MODEL:
				return model != null;
			case InstrPackage.INVOCATION_PARAMETER__CALLEE_MODEL_NAME:
				return CALLEE_MODEL_NAME_EDEFAULT == null ? calleeModelName != null : !CALLEE_MODEL_NAME_EDEFAULT.equals(calleeModelName);
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
		result.append(" (calleeModelName: ");
		result.append(calleeModelName);
		result.append(')');
		return result.toString();
	}

} //InvocationParameterImpl
