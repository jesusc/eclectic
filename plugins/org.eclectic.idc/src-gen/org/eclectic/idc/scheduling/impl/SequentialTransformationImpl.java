/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.scheduling.impl;

import java.util.Collection;

import org.eclectic.idc.core.ModelDefinition;

import org.eclectic.idc.core.impl.ExecutableUnitImpl;

import org.eclectic.idc.scheduling.SchedulingPackage;
import org.eclectic.idc.scheduling.SequentialTransformation;
import org.eclectic.idc.scheduling.TransformationExecution;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequential Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.idc.scheduling.impl.SequentialTransformationImpl#getExecutions <em>Executions</em>}</li>
 *   <li>{@link org.eclectic.idc.scheduling.impl.SequentialTransformationImpl#getIntermediateModels <em>Intermediate Models</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequentialTransformationImpl extends ExecutableUnitImpl implements SequentialTransformation {
	/**
	 * The cached value of the '{@link #getExecutions() <em>Executions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutions()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformationExecution> executions;

	/**
	 * The cached value of the '{@link #getIntermediateModels() <em>Intermediate Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntermediateModels()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelDefinition> intermediateModels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequentialTransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchedulingPackage.Literals.SEQUENTIAL_TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransformationExecution> getExecutions() {
		if (executions == null) {
			executions = new EObjectContainmentEList<TransformationExecution>(TransformationExecution.class, this, SchedulingPackage.SEQUENTIAL_TRANSFORMATION__EXECUTIONS);
		}
		return executions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelDefinition> getIntermediateModels() {
		if (intermediateModels == null) {
			intermediateModels = new EObjectContainmentEList<ModelDefinition>(ModelDefinition.class, this, SchedulingPackage.SEQUENTIAL_TRANSFORMATION__INTERMEDIATE_MODELS);
		}
		return intermediateModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchedulingPackage.SEQUENTIAL_TRANSFORMATION__EXECUTIONS:
				return ((InternalEList<?>)getExecutions()).basicRemove(otherEnd, msgs);
			case SchedulingPackage.SEQUENTIAL_TRANSFORMATION__INTERMEDIATE_MODELS:
				return ((InternalEList<?>)getIntermediateModels()).basicRemove(otherEnd, msgs);
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
			case SchedulingPackage.SEQUENTIAL_TRANSFORMATION__EXECUTIONS:
				return getExecutions();
			case SchedulingPackage.SEQUENTIAL_TRANSFORMATION__INTERMEDIATE_MODELS:
				return getIntermediateModels();
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
			case SchedulingPackage.SEQUENTIAL_TRANSFORMATION__EXECUTIONS:
				getExecutions().clear();
				getExecutions().addAll((Collection<? extends TransformationExecution>)newValue);
				return;
			case SchedulingPackage.SEQUENTIAL_TRANSFORMATION__INTERMEDIATE_MODELS:
				getIntermediateModels().clear();
				getIntermediateModels().addAll((Collection<? extends ModelDefinition>)newValue);
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
			case SchedulingPackage.SEQUENTIAL_TRANSFORMATION__EXECUTIONS:
				getExecutions().clear();
				return;
			case SchedulingPackage.SEQUENTIAL_TRANSFORMATION__INTERMEDIATE_MODELS:
				getIntermediateModels().clear();
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
			case SchedulingPackage.SEQUENTIAL_TRANSFORMATION__EXECUTIONS:
				return executions != null && !executions.isEmpty();
			case SchedulingPackage.SEQUENTIAL_TRANSFORMATION__INTERMEDIATE_MODELS:
				return intermediateModels != null && !intermediateModels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SequentialTransformationImpl
