/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.instr.impl;

import java.util.Collection;
import org.eclectic.idc.core.CorePackage;
import org.eclectic.idc.core.Instruction;
import org.eclectic.idc.core.NamedElement;
import org.eclectic.idc.core.TypeInfo;
import org.eclectic.idc.core.Variable;

import org.eclectic.idc.core.impl.FunctionDefImpl;

import org.eclectic.idc.instr.Assign;
import org.eclectic.idc.instr.ClosureDef;
import org.eclectic.idc.instr.Get;
import org.eclectic.idc.instr.IfBranch;
import org.eclectic.idc.instr.InstrPackage;
import org.eclectic.idc.instr.InstructionWithResult;

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
 * An implementation of the model object '<em><b>Closure Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.idc.instr.impl.ClosureDefImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.impl.ClosureDefImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.impl.ClosureDefImpl#getGetReceptors <em>Get Receptors</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.impl.ClosureDefImpl#getSetReceptors <em>Set Receptors</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.impl.ClosureDefImpl#getSetValues <em>Set Values</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.impl.ClosureDefImpl#getAssignVariables <em>Assign Variables</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.impl.ClosureDefImpl#getIfConditions <em>If Conditions</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.impl.ClosureDefImpl#getCallReceptors <em>Call Receptors</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.impl.ClosureDefImpl#getCallParameters <em>Call Parameters</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.impl.ClosureDefImpl#getEmitValues <em>Emit Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClosureDefImpl extends FunctionDefImpl implements ClosureDef {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	protected ClosureDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstrPackage.Literals.CLOSURE_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstrPackage.CLOSURE_DEF__NAME, oldName, name));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstrPackage.CLOSURE_DEF__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstrPackage.CLOSURE_DEF__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InstrPackage.CLOSURE_DEF__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstrPackage.CLOSURE_DEF__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Get> getGetReceptors() {
		if (getReceptors == null) {
			getReceptors = new EObjectWithInverseResolvingEList<Get>(Get.class, this, InstrPackage.CLOSURE_DEF__GET_RECEPTORS, InstrPackage.GET__RECEPTOR);
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
			setReceptors = new EObjectWithInverseResolvingEList<Set>(Set.class, this, InstrPackage.CLOSURE_DEF__SET_RECEPTORS, InstrPackage.SET__RECEPTOR);
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
			setValues = new EObjectWithInverseResolvingEList<Set>(Set.class, this, InstrPackage.CLOSURE_DEF__SET_VALUES, InstrPackage.SET__VALUE);
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
			assignVariables = new EObjectWithInverseResolvingEList<Assign>(Assign.class, this, InstrPackage.CLOSURE_DEF__ASSIGN_VARIABLES, InstrPackage.ASSIGN__RIGHT_VARIABLE);
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
			ifConditions = new EObjectWithInverseResolvingEList<IfBranch>(IfBranch.class, this, InstrPackage.CLOSURE_DEF__IF_CONDITIONS, InstrPackage.IF_BRANCH__BOOLEAN_VARIABLE);
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
			callReceptors = new EObjectWithInverseResolvingEList<MethodCall>(MethodCall.class, this, InstrPackage.CLOSURE_DEF__CALL_RECEPTORS, InstrPackage.METHOD_CALL__RECEPTOR);
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
			callParameters = new EObjectWithInverseResolvingEList.ManyInverse<MethodCall>(MethodCall.class, this, InstrPackage.CLOSURE_DEF__CALL_PARAMETERS, InstrPackage.METHOD_CALL__ACTUAL_PARAMETERS);
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
			emitValues = new EObjectWithInverseResolvingEList<QEmit>(QEmit.class, this, InstrPackage.CLOSURE_DEF__EMIT_VALUES, QoolPackage.QEMIT__VALUE);
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
			case InstrPackage.CLOSURE_DEF__GET_RECEPTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGetReceptors()).basicAdd(otherEnd, msgs);
			case InstrPackage.CLOSURE_DEF__SET_RECEPTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSetReceptors()).basicAdd(otherEnd, msgs);
			case InstrPackage.CLOSURE_DEF__SET_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSetValues()).basicAdd(otherEnd, msgs);
			case InstrPackage.CLOSURE_DEF__ASSIGN_VARIABLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssignVariables()).basicAdd(otherEnd, msgs);
			case InstrPackage.CLOSURE_DEF__IF_CONDITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIfConditions()).basicAdd(otherEnd, msgs);
			case InstrPackage.CLOSURE_DEF__CALL_RECEPTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCallReceptors()).basicAdd(otherEnd, msgs);
			case InstrPackage.CLOSURE_DEF__CALL_PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCallParameters()).basicAdd(otherEnd, msgs);
			case InstrPackage.CLOSURE_DEF__EMIT_VALUES:
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
			case InstrPackage.CLOSURE_DEF__TYPE:
				return basicSetType(null, msgs);
			case InstrPackage.CLOSURE_DEF__GET_RECEPTORS:
				return ((InternalEList<?>)getGetReceptors()).basicRemove(otherEnd, msgs);
			case InstrPackage.CLOSURE_DEF__SET_RECEPTORS:
				return ((InternalEList<?>)getSetReceptors()).basicRemove(otherEnd, msgs);
			case InstrPackage.CLOSURE_DEF__SET_VALUES:
				return ((InternalEList<?>)getSetValues()).basicRemove(otherEnd, msgs);
			case InstrPackage.CLOSURE_DEF__ASSIGN_VARIABLES:
				return ((InternalEList<?>)getAssignVariables()).basicRemove(otherEnd, msgs);
			case InstrPackage.CLOSURE_DEF__IF_CONDITIONS:
				return ((InternalEList<?>)getIfConditions()).basicRemove(otherEnd, msgs);
			case InstrPackage.CLOSURE_DEF__CALL_RECEPTORS:
				return ((InternalEList<?>)getCallReceptors()).basicRemove(otherEnd, msgs);
			case InstrPackage.CLOSURE_DEF__CALL_PARAMETERS:
				return ((InternalEList<?>)getCallParameters()).basicRemove(otherEnd, msgs);
			case InstrPackage.CLOSURE_DEF__EMIT_VALUES:
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
			case InstrPackage.CLOSURE_DEF__NAME:
				return getName();
			case InstrPackage.CLOSURE_DEF__TYPE:
				return getType();
			case InstrPackage.CLOSURE_DEF__GET_RECEPTORS:
				return getGetReceptors();
			case InstrPackage.CLOSURE_DEF__SET_RECEPTORS:
				return getSetReceptors();
			case InstrPackage.CLOSURE_DEF__SET_VALUES:
				return getSetValues();
			case InstrPackage.CLOSURE_DEF__ASSIGN_VARIABLES:
				return getAssignVariables();
			case InstrPackage.CLOSURE_DEF__IF_CONDITIONS:
				return getIfConditions();
			case InstrPackage.CLOSURE_DEF__CALL_RECEPTORS:
				return getCallReceptors();
			case InstrPackage.CLOSURE_DEF__CALL_PARAMETERS:
				return getCallParameters();
			case InstrPackage.CLOSURE_DEF__EMIT_VALUES:
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
			case InstrPackage.CLOSURE_DEF__NAME:
				setName((String)newValue);
				return;
			case InstrPackage.CLOSURE_DEF__TYPE:
				setType((TypeInfo)newValue);
				return;
			case InstrPackage.CLOSURE_DEF__GET_RECEPTORS:
				getGetReceptors().clear();
				getGetReceptors().addAll((Collection<? extends Get>)newValue);
				return;
			case InstrPackage.CLOSURE_DEF__SET_RECEPTORS:
				getSetReceptors().clear();
				getSetReceptors().addAll((Collection<? extends Set>)newValue);
				return;
			case InstrPackage.CLOSURE_DEF__SET_VALUES:
				getSetValues().clear();
				getSetValues().addAll((Collection<? extends Set>)newValue);
				return;
			case InstrPackage.CLOSURE_DEF__ASSIGN_VARIABLES:
				getAssignVariables().clear();
				getAssignVariables().addAll((Collection<? extends Assign>)newValue);
				return;
			case InstrPackage.CLOSURE_DEF__IF_CONDITIONS:
				getIfConditions().clear();
				getIfConditions().addAll((Collection<? extends IfBranch>)newValue);
				return;
			case InstrPackage.CLOSURE_DEF__CALL_RECEPTORS:
				getCallReceptors().clear();
				getCallReceptors().addAll((Collection<? extends MethodCall>)newValue);
				return;
			case InstrPackage.CLOSURE_DEF__CALL_PARAMETERS:
				getCallParameters().clear();
				getCallParameters().addAll((Collection<? extends MethodCall>)newValue);
				return;
			case InstrPackage.CLOSURE_DEF__EMIT_VALUES:
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
			case InstrPackage.CLOSURE_DEF__NAME:
				setName(NAME_EDEFAULT);
				return;
			case InstrPackage.CLOSURE_DEF__TYPE:
				setType((TypeInfo)null);
				return;
			case InstrPackage.CLOSURE_DEF__GET_RECEPTORS:
				getGetReceptors().clear();
				return;
			case InstrPackage.CLOSURE_DEF__SET_RECEPTORS:
				getSetReceptors().clear();
				return;
			case InstrPackage.CLOSURE_DEF__SET_VALUES:
				getSetValues().clear();
				return;
			case InstrPackage.CLOSURE_DEF__ASSIGN_VARIABLES:
				getAssignVariables().clear();
				return;
			case InstrPackage.CLOSURE_DEF__IF_CONDITIONS:
				getIfConditions().clear();
				return;
			case InstrPackage.CLOSURE_DEF__CALL_RECEPTORS:
				getCallReceptors().clear();
				return;
			case InstrPackage.CLOSURE_DEF__CALL_PARAMETERS:
				getCallParameters().clear();
				return;
			case InstrPackage.CLOSURE_DEF__EMIT_VALUES:
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
			case InstrPackage.CLOSURE_DEF__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case InstrPackage.CLOSURE_DEF__TYPE:
				return type != null;
			case InstrPackage.CLOSURE_DEF__GET_RECEPTORS:
				return getReceptors != null && !getReceptors.isEmpty();
			case InstrPackage.CLOSURE_DEF__SET_RECEPTORS:
				return setReceptors != null && !setReceptors.isEmpty();
			case InstrPackage.CLOSURE_DEF__SET_VALUES:
				return setValues != null && !setValues.isEmpty();
			case InstrPackage.CLOSURE_DEF__ASSIGN_VARIABLES:
				return assignVariables != null && !assignVariables.isEmpty();
			case InstrPackage.CLOSURE_DEF__IF_CONDITIONS:
				return ifConditions != null && !ifConditions.isEmpty();
			case InstrPackage.CLOSURE_DEF__CALL_RECEPTORS:
				return callReceptors != null && !callReceptors.isEmpty();
			case InstrPackage.CLOSURE_DEF__CALL_PARAMETERS:
				return callParameters != null && !callParameters.isEmpty();
			case InstrPackage.CLOSURE_DEF__EMIT_VALUES:
				return emitValues != null && !emitValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case InstrPackage.CLOSURE_DEF__NAME: return CorePackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == Variable.class) {
			switch (derivedFeatureID) {
				case InstrPackage.CLOSURE_DEF__TYPE: return CorePackage.VARIABLE__TYPE;
				case InstrPackage.CLOSURE_DEF__GET_RECEPTORS: return CorePackage.VARIABLE__GET_RECEPTORS;
				case InstrPackage.CLOSURE_DEF__SET_RECEPTORS: return CorePackage.VARIABLE__SET_RECEPTORS;
				case InstrPackage.CLOSURE_DEF__SET_VALUES: return CorePackage.VARIABLE__SET_VALUES;
				case InstrPackage.CLOSURE_DEF__ASSIGN_VARIABLES: return CorePackage.VARIABLE__ASSIGN_VARIABLES;
				case InstrPackage.CLOSURE_DEF__IF_CONDITIONS: return CorePackage.VARIABLE__IF_CONDITIONS;
				case InstrPackage.CLOSURE_DEF__CALL_RECEPTORS: return CorePackage.VARIABLE__CALL_RECEPTORS;
				case InstrPackage.CLOSURE_DEF__CALL_PARAMETERS: return CorePackage.VARIABLE__CALL_PARAMETERS;
				case InstrPackage.CLOSURE_DEF__EMIT_VALUES: return CorePackage.VARIABLE__EMIT_VALUES;
				default: return -1;
			}
		}
		if (baseClass == Instruction.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == InstructionWithResult.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case CorePackage.NAMED_ELEMENT__NAME: return InstrPackage.CLOSURE_DEF__NAME;
				default: return -1;
			}
		}
		if (baseClass == Variable.class) {
			switch (baseFeatureID) {
				case CorePackage.VARIABLE__TYPE: return InstrPackage.CLOSURE_DEF__TYPE;
				case CorePackage.VARIABLE__GET_RECEPTORS: return InstrPackage.CLOSURE_DEF__GET_RECEPTORS;
				case CorePackage.VARIABLE__SET_RECEPTORS: return InstrPackage.CLOSURE_DEF__SET_RECEPTORS;
				case CorePackage.VARIABLE__SET_VALUES: return InstrPackage.CLOSURE_DEF__SET_VALUES;
				case CorePackage.VARIABLE__ASSIGN_VARIABLES: return InstrPackage.CLOSURE_DEF__ASSIGN_VARIABLES;
				case CorePackage.VARIABLE__IF_CONDITIONS: return InstrPackage.CLOSURE_DEF__IF_CONDITIONS;
				case CorePackage.VARIABLE__CALL_RECEPTORS: return InstrPackage.CLOSURE_DEF__CALL_RECEPTORS;
				case CorePackage.VARIABLE__CALL_PARAMETERS: return InstrPackage.CLOSURE_DEF__CALL_PARAMETERS;
				case CorePackage.VARIABLE__EMIT_VALUES: return InstrPackage.CLOSURE_DEF__EMIT_VALUES;
				default: return -1;
			}
		}
		if (baseClass == Instruction.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == InstructionWithResult.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ClosureDefImpl
