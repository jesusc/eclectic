/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.chain.impl;

import java.util.Collection;

import org.eclectic.frontend.chain.ChainPackage;
import org.eclectic.frontend.chain.ChainTransformation;
import org.eclectic.frontend.chain.CompositeTransformation;
import org.eclectic.frontend.chain.ExternalTransformation;
import org.eclectic.frontend.chain.GeneratedModel;
import org.eclectic.frontend.chain.TransformationExecution;

import org.eclectic.frontend.core.impl.TransformationDefinitionImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.frontend.chain.impl.ChainTransformationImpl#getComposites <em>Composites</em>}</li>
 *   <li>{@link org.eclectic.frontend.chain.impl.ChainTransformationImpl#getExternals <em>Externals</em>}</li>
 *   <li>{@link org.eclectic.frontend.chain.impl.ChainTransformationImpl#getGeneratedModels <em>Generated Models</em>}</li>
 *   <li>{@link org.eclectic.frontend.chain.impl.ChainTransformationImpl#getExecutions <em>Executions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChainTransformationImpl extends TransformationDefinitionImpl implements ChainTransformation {
	/**
	 * The cached value of the '{@link #getComposites() <em>Composites</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposites()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositeTransformation> composites;

	/**
	 * The cached value of the '{@link #getExternals() <em>Externals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternals()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalTransformation> externals;

	/**
	 * The cached value of the '{@link #getGeneratedModels() <em>Generated Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedModels()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneratedModel> generatedModels;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChainTransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChainPackage.Literals.CHAIN_TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositeTransformation> getComposites() {
		if (composites == null) {
			composites = new EObjectContainmentEList<CompositeTransformation>(CompositeTransformation.class, this, ChainPackage.CHAIN_TRANSFORMATION__COMPOSITES);
		}
		return composites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExternalTransformation> getExternals() {
		if (externals == null) {
			externals = new EObjectContainmentEList<ExternalTransformation>(ExternalTransformation.class, this, ChainPackage.CHAIN_TRANSFORMATION__EXTERNALS);
		}
		return externals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneratedModel> getGeneratedModels() {
		if (generatedModels == null) {
			generatedModels = new EObjectContainmentEList<GeneratedModel>(GeneratedModel.class, this, ChainPackage.CHAIN_TRANSFORMATION__GENERATED_MODELS);
		}
		return generatedModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransformationExecution> getExecutions() {
		if (executions == null) {
			executions = new EObjectContainmentEList<TransformationExecution>(TransformationExecution.class, this, ChainPackage.CHAIN_TRANSFORMATION__EXECUTIONS);
		}
		return executions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ChainPackage.CHAIN_TRANSFORMATION__COMPOSITES:
				return ((InternalEList<?>)getComposites()).basicRemove(otherEnd, msgs);
			case ChainPackage.CHAIN_TRANSFORMATION__EXTERNALS:
				return ((InternalEList<?>)getExternals()).basicRemove(otherEnd, msgs);
			case ChainPackage.CHAIN_TRANSFORMATION__GENERATED_MODELS:
				return ((InternalEList<?>)getGeneratedModels()).basicRemove(otherEnd, msgs);
			case ChainPackage.CHAIN_TRANSFORMATION__EXECUTIONS:
				return ((InternalEList<?>)getExecutions()).basicRemove(otherEnd, msgs);
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
			case ChainPackage.CHAIN_TRANSFORMATION__COMPOSITES:
				return getComposites();
			case ChainPackage.CHAIN_TRANSFORMATION__EXTERNALS:
				return getExternals();
			case ChainPackage.CHAIN_TRANSFORMATION__GENERATED_MODELS:
				return getGeneratedModels();
			case ChainPackage.CHAIN_TRANSFORMATION__EXECUTIONS:
				return getExecutions();
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
			case ChainPackage.CHAIN_TRANSFORMATION__COMPOSITES:
				getComposites().clear();
				getComposites().addAll((Collection<? extends CompositeTransformation>)newValue);
				return;
			case ChainPackage.CHAIN_TRANSFORMATION__EXTERNALS:
				getExternals().clear();
				getExternals().addAll((Collection<? extends ExternalTransformation>)newValue);
				return;
			case ChainPackage.CHAIN_TRANSFORMATION__GENERATED_MODELS:
				getGeneratedModels().clear();
				getGeneratedModels().addAll((Collection<? extends GeneratedModel>)newValue);
				return;
			case ChainPackage.CHAIN_TRANSFORMATION__EXECUTIONS:
				getExecutions().clear();
				getExecutions().addAll((Collection<? extends TransformationExecution>)newValue);
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
			case ChainPackage.CHAIN_TRANSFORMATION__COMPOSITES:
				getComposites().clear();
				return;
			case ChainPackage.CHAIN_TRANSFORMATION__EXTERNALS:
				getExternals().clear();
				return;
			case ChainPackage.CHAIN_TRANSFORMATION__GENERATED_MODELS:
				getGeneratedModels().clear();
				return;
			case ChainPackage.CHAIN_TRANSFORMATION__EXECUTIONS:
				getExecutions().clear();
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
			case ChainPackage.CHAIN_TRANSFORMATION__COMPOSITES:
				return composites != null && !composites.isEmpty();
			case ChainPackage.CHAIN_TRANSFORMATION__EXTERNALS:
				return externals != null && !externals.isEmpty();
			case ChainPackage.CHAIN_TRANSFORMATION__GENERATED_MODELS:
				return generatedModels != null && !generatedModels.isEmpty();
			case ChainPackage.CHAIN_TRANSFORMATION__EXECUTIONS:
				return executions != null && !executions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ChainTransformationImpl
