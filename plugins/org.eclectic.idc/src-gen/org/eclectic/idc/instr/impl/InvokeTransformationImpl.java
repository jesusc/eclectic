/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.instr.impl;

import java.util.Collection;
import org.eclectic.idc.core.Variable;
import org.eclectic.idc.core.impl.InstructionImpl;

import org.eclectic.idc.instr.InstrPackage;
import org.eclectic.idc.instr.InvocationParameter;
import org.eclectic.idc.instr.InvokeTransformation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invoke Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.idc.instr.impl.InvokeTransformationImpl#getTransformationName <em>Transformation Name</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.impl.InvokeTransformationImpl#getSourceModels <em>Source Models</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.impl.InvokeTransformationImpl#getTargetModels <em>Target Models</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.impl.InvokeTransformationImpl#getInputViewFilter <em>Input View Filter</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.impl.InvokeTransformationImpl#getEntryPointName <em>Entry Point Name</em>}</li>
 *   <li>{@link org.eclectic.idc.instr.impl.InvokeTransformationImpl#getEntryPointParameters <em>Entry Point Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class InvokeTransformationImpl extends InstructionWithResultImpl implements InvokeTransformation {
	/**
	 * The default value of the '{@link #getTransformationName() <em>Transformation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationName()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSFORMATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransformationName() <em>Transformation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationName()
	 * @generated
	 * @ordered
	 */
	protected String transformationName = TRANSFORMATION_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourceModels() <em>Source Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceModels()
	 * @generated
	 * @ordered
	 */
	protected EList<InvocationParameter> sourceModels;

	/**
	 * The cached value of the '{@link #getTargetModels() <em>Target Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetModels()
	 * @generated
	 * @ordered
	 */
	protected EList<InvocationParameter> targetModels;

	/**
	 * The cached value of the '{@link #getInputViewFilter() <em>Input View Filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputViewFilter()
	 * @generated
	 * @ordered
	 */
	protected Variable inputViewFilter;

	/**
	 * The default value of the '{@link #getEntryPointName() <em>Entry Point Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryPointName()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTRY_POINT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntryPointName() <em>Entry Point Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryPointName()
	 * @generated
	 * @ordered
	 */
	protected String entryPointName = ENTRY_POINT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntryPointParameters() <em>Entry Point Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryPointParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> entryPointParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvokeTransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstrPackage.Literals.INVOKE_TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransformationName() {
		return transformationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformationName(String newTransformationName) {
		String oldTransformationName = transformationName;
		transformationName = newTransformationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstrPackage.INVOKE_TRANSFORMATION__TRANSFORMATION_NAME, oldTransformationName, transformationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InvocationParameter> getSourceModels() {
		if (sourceModels == null) {
			sourceModels = new EObjectContainmentEList<InvocationParameter>(InvocationParameter.class, this, InstrPackage.INVOKE_TRANSFORMATION__SOURCE_MODELS);
		}
		return sourceModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InvocationParameter> getTargetModels() {
		if (targetModels == null) {
			targetModels = new EObjectContainmentEList<InvocationParameter>(InvocationParameter.class, this, InstrPackage.INVOKE_TRANSFORMATION__TARGET_MODELS);
		}
		return targetModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getInputViewFilter() {
		if (inputViewFilter != null && inputViewFilter.eIsProxy()) {
			InternalEObject oldInputViewFilter = (InternalEObject)inputViewFilter;
			inputViewFilter = (Variable)eResolveProxy(oldInputViewFilter);
			if (inputViewFilter != oldInputViewFilter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstrPackage.INVOKE_TRANSFORMATION__INPUT_VIEW_FILTER, oldInputViewFilter, inputViewFilter));
			}
		}
		return inputViewFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetInputViewFilter() {
		return inputViewFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputViewFilter(Variable newInputViewFilter) {
		Variable oldInputViewFilter = inputViewFilter;
		inputViewFilter = newInputViewFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstrPackage.INVOKE_TRANSFORMATION__INPUT_VIEW_FILTER, oldInputViewFilter, inputViewFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEntryPointName() {
		return entryPointName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryPointName(String newEntryPointName) {
		String oldEntryPointName = entryPointName;
		entryPointName = newEntryPointName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstrPackage.INVOKE_TRANSFORMATION__ENTRY_POINT_NAME, oldEntryPointName, entryPointName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getEntryPointParameters() {
		if (entryPointParameters == null) {
			entryPointParameters = new EObjectResolvingEList<Variable>(Variable.class, this, InstrPackage.INVOKE_TRANSFORMATION__ENTRY_POINT_PARAMETERS);
		}
		return entryPointParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstrPackage.INVOKE_TRANSFORMATION__SOURCE_MODELS:
				return ((InternalEList<?>)getSourceModels()).basicRemove(otherEnd, msgs);
			case InstrPackage.INVOKE_TRANSFORMATION__TARGET_MODELS:
				return ((InternalEList<?>)getTargetModels()).basicRemove(otherEnd, msgs);
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
			case InstrPackage.INVOKE_TRANSFORMATION__TRANSFORMATION_NAME:
				return getTransformationName();
			case InstrPackage.INVOKE_TRANSFORMATION__SOURCE_MODELS:
				return getSourceModels();
			case InstrPackage.INVOKE_TRANSFORMATION__TARGET_MODELS:
				return getTargetModels();
			case InstrPackage.INVOKE_TRANSFORMATION__INPUT_VIEW_FILTER:
				if (resolve) return getInputViewFilter();
				return basicGetInputViewFilter();
			case InstrPackage.INVOKE_TRANSFORMATION__ENTRY_POINT_NAME:
				return getEntryPointName();
			case InstrPackage.INVOKE_TRANSFORMATION__ENTRY_POINT_PARAMETERS:
				return getEntryPointParameters();
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
			case InstrPackage.INVOKE_TRANSFORMATION__TRANSFORMATION_NAME:
				setTransformationName((String)newValue);
				return;
			case InstrPackage.INVOKE_TRANSFORMATION__SOURCE_MODELS:
				getSourceModels().clear();
				getSourceModels().addAll((Collection<? extends InvocationParameter>)newValue);
				return;
			case InstrPackage.INVOKE_TRANSFORMATION__TARGET_MODELS:
				getTargetModels().clear();
				getTargetModels().addAll((Collection<? extends InvocationParameter>)newValue);
				return;
			case InstrPackage.INVOKE_TRANSFORMATION__INPUT_VIEW_FILTER:
				setInputViewFilter((Variable)newValue);
				return;
			case InstrPackage.INVOKE_TRANSFORMATION__ENTRY_POINT_NAME:
				setEntryPointName((String)newValue);
				return;
			case InstrPackage.INVOKE_TRANSFORMATION__ENTRY_POINT_PARAMETERS:
				getEntryPointParameters().clear();
				getEntryPointParameters().addAll((Collection<? extends Variable>)newValue);
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
			case InstrPackage.INVOKE_TRANSFORMATION__TRANSFORMATION_NAME:
				setTransformationName(TRANSFORMATION_NAME_EDEFAULT);
				return;
			case InstrPackage.INVOKE_TRANSFORMATION__SOURCE_MODELS:
				getSourceModels().clear();
				return;
			case InstrPackage.INVOKE_TRANSFORMATION__TARGET_MODELS:
				getTargetModels().clear();
				return;
			case InstrPackage.INVOKE_TRANSFORMATION__INPUT_VIEW_FILTER:
				setInputViewFilter((Variable)null);
				return;
			case InstrPackage.INVOKE_TRANSFORMATION__ENTRY_POINT_NAME:
				setEntryPointName(ENTRY_POINT_NAME_EDEFAULT);
				return;
			case InstrPackage.INVOKE_TRANSFORMATION__ENTRY_POINT_PARAMETERS:
				getEntryPointParameters().clear();
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
			case InstrPackage.INVOKE_TRANSFORMATION__TRANSFORMATION_NAME:
				return TRANSFORMATION_NAME_EDEFAULT == null ? transformationName != null : !TRANSFORMATION_NAME_EDEFAULT.equals(transformationName);
			case InstrPackage.INVOKE_TRANSFORMATION__SOURCE_MODELS:
				return sourceModels != null && !sourceModels.isEmpty();
			case InstrPackage.INVOKE_TRANSFORMATION__TARGET_MODELS:
				return targetModels != null && !targetModels.isEmpty();
			case InstrPackage.INVOKE_TRANSFORMATION__INPUT_VIEW_FILTER:
				return inputViewFilter != null;
			case InstrPackage.INVOKE_TRANSFORMATION__ENTRY_POINT_NAME:
				return ENTRY_POINT_NAME_EDEFAULT == null ? entryPointName != null : !ENTRY_POINT_NAME_EDEFAULT.equals(entryPointName);
			case InstrPackage.INVOKE_TRANSFORMATION__ENTRY_POINT_PARAMETERS:
				return entryPointParameters != null && !entryPointParameters.isEmpty();
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
		result.append(" (transformationName: ");
		result.append(transformationName);
		result.append(", entryPointName: ");
		result.append(entryPointName);
		result.append(')');
		return result.toString();
	}

} //InvokeTransformationImpl
