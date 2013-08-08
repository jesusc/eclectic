/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.scheduling.impl;

import java.util.Collection;

import org.eclectic.idc.core.ModelDefinition;

import org.eclectic.idc.core.impl.LocatedElementImpl;
import org.eclectic.idc.scheduling.SchedulingPackage;
import org.eclectic.idc.scheduling.TransformationExecution;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

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
 *   <li>{@link org.eclectic.idc.scheduling.impl.TransformationExecutionImpl#getTransformationName <em>Transformation Name</em>}</li>
 *   <li>{@link org.eclectic.idc.scheduling.impl.TransformationExecutionImpl#getInModels <em>In Models</em>}</li>
 *   <li>{@link org.eclectic.idc.scheduling.impl.TransformationExecutionImpl#getOutModels <em>Out Models</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformationExecutionImpl extends LocatedElementImpl implements TransformationExecution {
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
	 * The cached value of the '{@link #getInModels() <em>In Models</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInModels()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelDefinition> inModels;

	/**
	 * The cached value of the '{@link #getOutModels() <em>Out Models</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutModels()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelDefinition> outModels;

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
		return SchedulingPackage.Literals.TRANSFORMATION_EXECUTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchedulingPackage.TRANSFORMATION_EXECUTION__TRANSFORMATION_NAME, oldTransformationName, transformationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelDefinition> getInModels() {
		if (inModels == null) {
			inModels = new EObjectResolvingEList<ModelDefinition>(ModelDefinition.class, this, SchedulingPackage.TRANSFORMATION_EXECUTION__IN_MODELS);
		}
		return inModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelDefinition> getOutModels() {
		if (outModels == null) {
			outModels = new EObjectResolvingEList<ModelDefinition>(ModelDefinition.class, this, SchedulingPackage.TRANSFORMATION_EXECUTION__OUT_MODELS);
		}
		return outModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchedulingPackage.TRANSFORMATION_EXECUTION__TRANSFORMATION_NAME:
				return getTransformationName();
			case SchedulingPackage.TRANSFORMATION_EXECUTION__IN_MODELS:
				return getInModels();
			case SchedulingPackage.TRANSFORMATION_EXECUTION__OUT_MODELS:
				return getOutModels();
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
			case SchedulingPackage.TRANSFORMATION_EXECUTION__TRANSFORMATION_NAME:
				setTransformationName((String)newValue);
				return;
			case SchedulingPackage.TRANSFORMATION_EXECUTION__IN_MODELS:
				getInModels().clear();
				getInModels().addAll((Collection<? extends ModelDefinition>)newValue);
				return;
			case SchedulingPackage.TRANSFORMATION_EXECUTION__OUT_MODELS:
				getOutModels().clear();
				getOutModels().addAll((Collection<? extends ModelDefinition>)newValue);
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
			case SchedulingPackage.TRANSFORMATION_EXECUTION__TRANSFORMATION_NAME:
				setTransformationName(TRANSFORMATION_NAME_EDEFAULT);
				return;
			case SchedulingPackage.TRANSFORMATION_EXECUTION__IN_MODELS:
				getInModels().clear();
				return;
			case SchedulingPackage.TRANSFORMATION_EXECUTION__OUT_MODELS:
				getOutModels().clear();
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
			case SchedulingPackage.TRANSFORMATION_EXECUTION__TRANSFORMATION_NAME:
				return TRANSFORMATION_NAME_EDEFAULT == null ? transformationName != null : !TRANSFORMATION_NAME_EDEFAULT.equals(transformationName);
			case SchedulingPackage.TRANSFORMATION_EXECUTION__IN_MODELS:
				return inModels != null && !inModels.isEmpty();
			case SchedulingPackage.TRANSFORMATION_EXECUTION__OUT_MODELS:
				return outModels != null && !outModels.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //TransformationExecutionImpl
