/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.chain.impl;

import java.util.Collection;

import org.eclectic.frontend.chain.AvailableTransformation;
import org.eclectic.frontend.chain.ChainPackage;
import org.eclectic.frontend.chain.TransformationExecution;

import org.eclectic.frontend.core.RepresentModel;

import org.eclectic.frontend.core.impl.LocatedElementImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation Execution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.frontend.chain.impl.TransformationExecutionImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link org.eclectic.frontend.chain.impl.TransformationExecutionImpl#getInputModels <em>Input Models</em>}</li>
 *   <li>{@link org.eclectic.frontend.chain.impl.TransformationExecutionImpl#getOutputModels <em>Output Models</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformationExecutionImpl extends LocatedElementImpl implements TransformationExecution {
	/**
	 * The cached value of the '{@link #getTransformation() <em>Transformation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation()
	 * @generated
	 * @ordered
	 */
	protected AvailableTransformation transformation;

	/**
	 * The cached value of the '{@link #getInputModels() <em>Input Models</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputModels()
	 * @generated
	 * @ordered
	 */
	protected EList<RepresentModel> inputModels;

	/**
	 * The cached value of the '{@link #getOutputModels() <em>Output Models</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputModels()
	 * @generated
	 * @ordered
	 */
	protected EList<RepresentModel> outputModels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationExecutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChainPackage.Literals.TRANSFORMATION_EXECUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvailableTransformation getTransformation() {
		if (transformation != null && transformation.eIsProxy()) {
			InternalEObject oldTransformation = (InternalEObject)transformation;
			transformation = (AvailableTransformation)eResolveProxy(oldTransformation);
			if (transformation != oldTransformation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChainPackage.TRANSFORMATION_EXECUTION__TRANSFORMATION, oldTransformation, transformation));
			}
		}
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvailableTransformation basicGetTransformation() {
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformation(AvailableTransformation newTransformation) {
		AvailableTransformation oldTransformation = transformation;
		transformation = newTransformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChainPackage.TRANSFORMATION_EXECUTION__TRANSFORMATION, oldTransformation, transformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RepresentModel> getInputModels() {
		if (inputModels == null) {
			inputModels = new EObjectResolvingEList<RepresentModel>(RepresentModel.class, this, ChainPackage.TRANSFORMATION_EXECUTION__INPUT_MODELS);
		}
		return inputModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RepresentModel> getOutputModels() {
		if (outputModels == null) {
			outputModels = new EObjectResolvingEList<RepresentModel>(RepresentModel.class, this, ChainPackage.TRANSFORMATION_EXECUTION__OUTPUT_MODELS);
		}
		return outputModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChainPackage.TRANSFORMATION_EXECUTION__TRANSFORMATION:
				if (resolve) return getTransformation();
				return basicGetTransformation();
			case ChainPackage.TRANSFORMATION_EXECUTION__INPUT_MODELS:
				return getInputModels();
			case ChainPackage.TRANSFORMATION_EXECUTION__OUTPUT_MODELS:
				return getOutputModels();
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
			case ChainPackage.TRANSFORMATION_EXECUTION__TRANSFORMATION:
				setTransformation((AvailableTransformation)newValue);
				return;
			case ChainPackage.TRANSFORMATION_EXECUTION__INPUT_MODELS:
				getInputModels().clear();
				getInputModels().addAll((Collection<? extends RepresentModel>)newValue);
				return;
			case ChainPackage.TRANSFORMATION_EXECUTION__OUTPUT_MODELS:
				getOutputModels().clear();
				getOutputModels().addAll((Collection<? extends RepresentModel>)newValue);
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
			case ChainPackage.TRANSFORMATION_EXECUTION__TRANSFORMATION:
				setTransformation((AvailableTransformation)null);
				return;
			case ChainPackage.TRANSFORMATION_EXECUTION__INPUT_MODELS:
				getInputModels().clear();
				return;
			case ChainPackage.TRANSFORMATION_EXECUTION__OUTPUT_MODELS:
				getOutputModels().clear();
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
			case ChainPackage.TRANSFORMATION_EXECUTION__TRANSFORMATION:
				return transformation != null;
			case ChainPackage.TRANSFORMATION_EXECUTION__INPUT_MODELS:
				return inputModels != null && !inputModels.isEmpty();
			case ChainPackage.TRANSFORMATION_EXECUTION__OUTPUT_MODELS:
				return outputModels != null && !outputModels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TransformationExecutionImpl
