/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.qool.facilities.impl;

import java.util.Collection;

import org.eclectic.frontend.core.Expression;
import org.eclectic.frontend.core.TransformationDefinitionParameter;
import org.eclectic.frontend.core.impl.ExpressionImpl;
import org.eclectic.frontend.core.impl.StatementImpl;

import org.eclectic.frontend.qool.facilities.Copier;
import org.eclectic.frontend.qool.facilities.CopierCallbackDefinition;
import org.eclectic.frontend.qool.facilities.FacilitiesPackage;

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
 * An implementation of the model object '<em><b>Copier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.frontend.qool.facilities.impl.CopierImpl#getObjects <em>Objects</em>}</li>
 *   <li>{@link org.eclectic.frontend.qool.facilities.impl.CopierImpl#getCallbacks <em>Callbacks</em>}</li>
 *   <li>{@link org.eclectic.frontend.qool.facilities.impl.CopierImpl#getCopyInModel <em>Copy In Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CopierImpl extends ExpressionImpl implements Copier {
	/**
	 * The cached value of the '{@link #getObjects() <em>Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> objects;
	/**
	 * The cached value of the '{@link #getCallbacks() <em>Callbacks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallbacks()
	 * @generated
	 * @ordered
	 */
	protected EList<CopierCallbackDefinition> callbacks;

	/**
	 * The cached value of the '{@link #getCopyInModel() <em>Copy In Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyInModel()
	 * @generated
	 * @ordered
	 */
	protected TransformationDefinitionParameter copyInModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CopierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FacilitiesPackage.Literals.COPIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getObjects() {
		if (objects == null) {
			objects = new EObjectContainmentEList<Expression>(Expression.class, this, FacilitiesPackage.COPIER__OBJECTS);
		}
		return objects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CopierCallbackDefinition> getCallbacks() {
		if (callbacks == null) {
			callbacks = new EObjectContainmentEList<CopierCallbackDefinition>(CopierCallbackDefinition.class, this, FacilitiesPackage.COPIER__CALLBACKS);
		}
		return callbacks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationDefinitionParameter getCopyInModel() {
		if (copyInModel != null && copyInModel.eIsProxy()) {
			InternalEObject oldCopyInModel = (InternalEObject)copyInModel;
			copyInModel = (TransformationDefinitionParameter)eResolveProxy(oldCopyInModel);
			if (copyInModel != oldCopyInModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FacilitiesPackage.COPIER__COPY_IN_MODEL, oldCopyInModel, copyInModel));
			}
		}
		return copyInModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationDefinitionParameter basicGetCopyInModel() {
		return copyInModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyInModel(TransformationDefinitionParameter newCopyInModel) {
		TransformationDefinitionParameter oldCopyInModel = copyInModel;
		copyInModel = newCopyInModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilitiesPackage.COPIER__COPY_IN_MODEL, oldCopyInModel, copyInModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FacilitiesPackage.COPIER__OBJECTS:
				return ((InternalEList<?>)getObjects()).basicRemove(otherEnd, msgs);
			case FacilitiesPackage.COPIER__CALLBACKS:
				return ((InternalEList<?>)getCallbacks()).basicRemove(otherEnd, msgs);
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
			case FacilitiesPackage.COPIER__OBJECTS:
				return getObjects();
			case FacilitiesPackage.COPIER__CALLBACKS:
				return getCallbacks();
			case FacilitiesPackage.COPIER__COPY_IN_MODEL:
				if (resolve) return getCopyInModel();
				return basicGetCopyInModel();
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
			case FacilitiesPackage.COPIER__OBJECTS:
				getObjects().clear();
				getObjects().addAll((Collection<? extends Expression>)newValue);
				return;
			case FacilitiesPackage.COPIER__CALLBACKS:
				getCallbacks().clear();
				getCallbacks().addAll((Collection<? extends CopierCallbackDefinition>)newValue);
				return;
			case FacilitiesPackage.COPIER__COPY_IN_MODEL:
				setCopyInModel((TransformationDefinitionParameter)newValue);
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
			case FacilitiesPackage.COPIER__OBJECTS:
				getObjects().clear();
				return;
			case FacilitiesPackage.COPIER__CALLBACKS:
				getCallbacks().clear();
				return;
			case FacilitiesPackage.COPIER__COPY_IN_MODEL:
				setCopyInModel((TransformationDefinitionParameter)null);
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
			case FacilitiesPackage.COPIER__OBJECTS:
				return objects != null && !objects.isEmpty();
			case FacilitiesPackage.COPIER__CALLBACKS:
				return callbacks != null && !callbacks.isEmpty();
			case FacilitiesPackage.COPIER__COPY_IN_MODEL:
				return copyInModel != null;
		}
		return super.eIsSet(featureID);
	}

} //CopierImpl
