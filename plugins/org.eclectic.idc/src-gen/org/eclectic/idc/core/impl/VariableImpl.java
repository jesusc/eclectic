/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.core.impl;

import java.util.Collection;
import org.eclectic.idc.core.CorePackage;
import org.eclectic.idc.core.TypeInfo;
import org.eclectic.idc.core.Variable;

import org.eclectic.idc.instr.Assign;
import org.eclectic.idc.instr.Get;
import org.eclectic.idc.instr.IfBranch;
import org.eclectic.idc.instr.InstrPackage;
import org.eclectic.idc.instr.MethodCall;
import org.eclectic.idc.instr.Set;
import org.eclectic.idc.qool.QEmit;
import org.eclectic.idc.qool.QoolPackage;
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
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.idc.core.impl.VariableImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclectic.idc.core.impl.VariableImpl#getGetReceptors <em>Get Receptors</em>}</li>
 *   <li>{@link org.eclectic.idc.core.impl.VariableImpl#getSetReceptors <em>Set Receptors</em>}</li>
 *   <li>{@link org.eclectic.idc.core.impl.VariableImpl#getSetValues <em>Set Values</em>}</li>
 *   <li>{@link org.eclectic.idc.core.impl.VariableImpl#getAssignVariables <em>Assign Variables</em>}</li>
 *   <li>{@link org.eclectic.idc.core.impl.VariableImpl#getIfConditions <em>If Conditions</em>}</li>
 *   <li>{@link org.eclectic.idc.core.impl.VariableImpl#getCallReceptors <em>Call Receptors</em>}</li>
 *   <li>{@link org.eclectic.idc.core.impl.VariableImpl#getCallParameters <em>Call Parameters</em>}</li>
 *   <li>{@link org.eclectic.idc.core.impl.VariableImpl#getEmitValues <em>Emit Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class VariableImpl extends NamedElementImpl implements Variable {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeInfo type;

	/**
	 * The cached value of the '{@link #getGetReceptors() <em>Get Receptors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetReceptors()
	 * @generated
	 * @ordered
	 */
	protected EList<Get> getReceptors;
	/**
	 * The cached value of the '{@link #getSetReceptors() <em>Set Receptors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetReceptors()
	 * @generated
	 * @ordered
	 */
	protected EList<Set> setReceptors;
	/**
	 * The cached value of the '{@link #getSetValues() <em>Set Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetValues()
	 * @generated
	 * @ordered
	 */
	protected EList<Set> setValues;
	/**
	 * The cached value of the '{@link #getAssignVariables() <em>Assign Variables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Assign> assignVariables;
	/**
	 * The cached value of the '{@link #getIfConditions() <em>If Conditions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<IfBranch> ifConditions;
	/**
	 * The cached value of the '{@link #getCallReceptors() <em>Call Receptors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallReceptors()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodCall> callReceptors;
	/**
	 * The cached value of the '{@link #getCallParameters() <em>Call Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodCall> callParameters;
	/**
	 * The cached value of the '{@link #getEmitValues() <em>Emit Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmitValues()
	 * @generated
	 * @ordered
	 */
	protected EList<QEmit> emitValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeInfo getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(TypeInfo newType, NotificationChain msgs) {
		TypeInfo oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.VARIABLE__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeInfo newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.VARIABLE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.VARIABLE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VARIABLE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Get> getGetReceptors() {
		if (getReceptors == null) {
			getReceptors = new EObjectWithInverseResolvingEList<Get>(Get.class, this, CorePackage.VARIABLE__GET_RECEPTORS, InstrPackage.GET__RECEPTOR);
		}
		return getReceptors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Set> getSetReceptors() {
		if (setReceptors == null) {
			setReceptors = new EObjectWithInverseResolvingEList<Set>(Set.class, this, CorePackage.VARIABLE__SET_RECEPTORS, InstrPackage.SET__RECEPTOR);
		}
		return setReceptors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Set> getSetValues() {
		if (setValues == null) {
			setValues = new EObjectWithInverseResolvingEList<Set>(Set.class, this, CorePackage.VARIABLE__SET_VALUES, InstrPackage.SET__VALUE);
		}
		return setValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Assign> getAssignVariables() {
		if (assignVariables == null) {
			assignVariables = new EObjectWithInverseResolvingEList<Assign>(Assign.class, this, CorePackage.VARIABLE__ASSIGN_VARIABLES, InstrPackage.ASSIGN__RIGHT_VARIABLE);
		}
		return assignVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfBranch> getIfConditions() {
		if (ifConditions == null) {
			ifConditions = new EObjectWithInverseResolvingEList<IfBranch>(IfBranch.class, this, CorePackage.VARIABLE__IF_CONDITIONS, InstrPackage.IF_BRANCH__BOOLEAN_VARIABLE);
		}
		return ifConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodCall> getCallReceptors() {
		if (callReceptors == null) {
			callReceptors = new EObjectWithInverseResolvingEList<MethodCall>(MethodCall.class, this, CorePackage.VARIABLE__CALL_RECEPTORS, InstrPackage.METHOD_CALL__RECEPTOR);
		}
		return callReceptors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodCall> getCallParameters() {
		if (callParameters == null) {
			callParameters = new EObjectWithInverseResolvingEList.ManyInverse<MethodCall>(MethodCall.class, this, CorePackage.VARIABLE__CALL_PARAMETERS, InstrPackage.METHOD_CALL__ACTUAL_PARAMETERS);
		}
		return callParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QEmit> getEmitValues() {
		if (emitValues == null) {
			emitValues = new EObjectWithInverseResolvingEList<QEmit>(QEmit.class, this, CorePackage.VARIABLE__EMIT_VALUES, QoolPackage.QEMIT__VALUE);
		}
		return emitValues;
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
			case CorePackage.VARIABLE__GET_RECEPTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGetReceptors()).basicAdd(otherEnd, msgs);
			case CorePackage.VARIABLE__SET_RECEPTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSetReceptors()).basicAdd(otherEnd, msgs);
			case CorePackage.VARIABLE__SET_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSetValues()).basicAdd(otherEnd, msgs);
			case CorePackage.VARIABLE__ASSIGN_VARIABLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssignVariables()).basicAdd(otherEnd, msgs);
			case CorePackage.VARIABLE__IF_CONDITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIfConditions()).basicAdd(otherEnd, msgs);
			case CorePackage.VARIABLE__CALL_RECEPTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCallReceptors()).basicAdd(otherEnd, msgs);
			case CorePackage.VARIABLE__CALL_PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCallParameters()).basicAdd(otherEnd, msgs);
			case CorePackage.VARIABLE__EMIT_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEmitValues()).basicAdd(otherEnd, msgs);
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
			case CorePackage.VARIABLE__TYPE:
				return basicSetType(null, msgs);
			case CorePackage.VARIABLE__GET_RECEPTORS:
				return ((InternalEList<?>)getGetReceptors()).basicRemove(otherEnd, msgs);
			case CorePackage.VARIABLE__SET_RECEPTORS:
				return ((InternalEList<?>)getSetReceptors()).basicRemove(otherEnd, msgs);
			case CorePackage.VARIABLE__SET_VALUES:
				return ((InternalEList<?>)getSetValues()).basicRemove(otherEnd, msgs);
			case CorePackage.VARIABLE__ASSIGN_VARIABLES:
				return ((InternalEList<?>)getAssignVariables()).basicRemove(otherEnd, msgs);
			case CorePackage.VARIABLE__IF_CONDITIONS:
				return ((InternalEList<?>)getIfConditions()).basicRemove(otherEnd, msgs);
			case CorePackage.VARIABLE__CALL_RECEPTORS:
				return ((InternalEList<?>)getCallReceptors()).basicRemove(otherEnd, msgs);
			case CorePackage.VARIABLE__CALL_PARAMETERS:
				return ((InternalEList<?>)getCallParameters()).basicRemove(otherEnd, msgs);
			case CorePackage.VARIABLE__EMIT_VALUES:
				return ((InternalEList<?>)getEmitValues()).basicRemove(otherEnd, msgs);
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
			case CorePackage.VARIABLE__TYPE:
				return getType();
			case CorePackage.VARIABLE__GET_RECEPTORS:
				return getGetReceptors();
			case CorePackage.VARIABLE__SET_RECEPTORS:
				return getSetReceptors();
			case CorePackage.VARIABLE__SET_VALUES:
				return getSetValues();
			case CorePackage.VARIABLE__ASSIGN_VARIABLES:
				return getAssignVariables();
			case CorePackage.VARIABLE__IF_CONDITIONS:
				return getIfConditions();
			case CorePackage.VARIABLE__CALL_RECEPTORS:
				return getCallReceptors();
			case CorePackage.VARIABLE__CALL_PARAMETERS:
				return getCallParameters();
			case CorePackage.VARIABLE__EMIT_VALUES:
				return getEmitValues();
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
			case CorePackage.VARIABLE__TYPE:
				setType((TypeInfo)newValue);
				return;
			case CorePackage.VARIABLE__GET_RECEPTORS:
				getGetReceptors().clear();
				getGetReceptors().addAll((Collection<? extends Get>)newValue);
				return;
			case CorePackage.VARIABLE__SET_RECEPTORS:
				getSetReceptors().clear();
				getSetReceptors().addAll((Collection<? extends Set>)newValue);
				return;
			case CorePackage.VARIABLE__SET_VALUES:
				getSetValues().clear();
				getSetValues().addAll((Collection<? extends Set>)newValue);
				return;
			case CorePackage.VARIABLE__ASSIGN_VARIABLES:
				getAssignVariables().clear();
				getAssignVariables().addAll((Collection<? extends Assign>)newValue);
				return;
			case CorePackage.VARIABLE__IF_CONDITIONS:
				getIfConditions().clear();
				getIfConditions().addAll((Collection<? extends IfBranch>)newValue);
				return;
			case CorePackage.VARIABLE__CALL_RECEPTORS:
				getCallReceptors().clear();
				getCallReceptors().addAll((Collection<? extends MethodCall>)newValue);
				return;
			case CorePackage.VARIABLE__CALL_PARAMETERS:
				getCallParameters().clear();
				getCallParameters().addAll((Collection<? extends MethodCall>)newValue);
				return;
			case CorePackage.VARIABLE__EMIT_VALUES:
				getEmitValues().clear();
				getEmitValues().addAll((Collection<? extends QEmit>)newValue);
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
			case CorePackage.VARIABLE__TYPE:
				setType((TypeInfo)null);
				return;
			case CorePackage.VARIABLE__GET_RECEPTORS:
				getGetReceptors().clear();
				return;
			case CorePackage.VARIABLE__SET_RECEPTORS:
				getSetReceptors().clear();
				return;
			case CorePackage.VARIABLE__SET_VALUES:
				getSetValues().clear();
				return;
			case CorePackage.VARIABLE__ASSIGN_VARIABLES:
				getAssignVariables().clear();
				return;
			case CorePackage.VARIABLE__IF_CONDITIONS:
				getIfConditions().clear();
				return;
			case CorePackage.VARIABLE__CALL_RECEPTORS:
				getCallReceptors().clear();
				return;
			case CorePackage.VARIABLE__CALL_PARAMETERS:
				getCallParameters().clear();
				return;
			case CorePackage.VARIABLE__EMIT_VALUES:
				getEmitValues().clear();
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
			case CorePackage.VARIABLE__TYPE:
				return type != null;
			case CorePackage.VARIABLE__GET_RECEPTORS:
				return getReceptors != null && !getReceptors.isEmpty();
			case CorePackage.VARIABLE__SET_RECEPTORS:
				return setReceptors != null && !setReceptors.isEmpty();
			case CorePackage.VARIABLE__SET_VALUES:
				return setValues != null && !setValues.isEmpty();
			case CorePackage.VARIABLE__ASSIGN_VARIABLES:
				return assignVariables != null && !assignVariables.isEmpty();
			case CorePackage.VARIABLE__IF_CONDITIONS:
				return ifConditions != null && !ifConditions.isEmpty();
			case CorePackage.VARIABLE__CALL_RECEPTORS:
				return callReceptors != null && !callReceptors.isEmpty();
			case CorePackage.VARIABLE__CALL_PARAMETERS:
				return callParameters != null && !callParameters.isEmpty();
			case CorePackage.VARIABLE__EMIT_VALUES:
				return emitValues != null && !emitValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VariableImpl
