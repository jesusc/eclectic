/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.core.impl;

import java.util.Collection;

import org.eclectic.frontend.core.AnnotableElement;
import org.eclectic.frontend.core.Annotation;
import org.eclectic.frontend.core.CorePackage;
import org.eclectic.frontend.core.RepresentModel;
import org.eclectic.frontend.core.TracedModelParameter;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Model Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.frontend.core.impl.TracedModelParameterImpl#getAnnotatedWith <em>Annotated With</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TracedModelParameterImpl extends DefinitionParameterImpl implements TracedModelParameter {
	/**
	 * The cached value of the '{@link #getAnnotatedWith() <em>Annotated With</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatedWith()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> annotatedWith;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedModelParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.TRACED_MODEL_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnnotatedWith() {
		if (annotatedWith == null) {
			annotatedWith = new EObjectWithInverseResolvingEList<Annotation>(Annotation.class, this, CorePackage.TRACED_MODEL_PARAMETER__ANNOTATED_WITH, CorePackage.ANNOTATION__ANNOTATED_ELEMENT);
		}
		return annotatedWith;
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
			case CorePackage.TRACED_MODEL_PARAMETER__ANNOTATED_WITH:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAnnotatedWith()).basicAdd(otherEnd, msgs);
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
			case CorePackage.TRACED_MODEL_PARAMETER__ANNOTATED_WITH:
				return ((InternalEList<?>)getAnnotatedWith()).basicRemove(otherEnd, msgs);
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
			case CorePackage.TRACED_MODEL_PARAMETER__ANNOTATED_WITH:
				return getAnnotatedWith();
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
			case CorePackage.TRACED_MODEL_PARAMETER__ANNOTATED_WITH:
				getAnnotatedWith().clear();
				getAnnotatedWith().addAll((Collection<? extends Annotation>)newValue);
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
			case CorePackage.TRACED_MODEL_PARAMETER__ANNOTATED_WITH:
				getAnnotatedWith().clear();
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
			case CorePackage.TRACED_MODEL_PARAMETER__ANNOTATED_WITH:
				return annotatedWith != null && !annotatedWith.isEmpty();
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
		if (baseClass == AnnotableElement.class) {
			switch (derivedFeatureID) {
				case CorePackage.TRACED_MODEL_PARAMETER__ANNOTATED_WITH: return CorePackage.ANNOTABLE_ELEMENT__ANNOTATED_WITH;
				default: return -1;
			}
		}
		if (baseClass == RepresentModel.class) {
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
		if (baseClass == AnnotableElement.class) {
			switch (baseFeatureID) {
				case CorePackage.ANNOTABLE_ELEMENT__ANNOTATED_WITH: return CorePackage.TRACED_MODEL_PARAMETER__ANNOTATED_WITH;
				default: return -1;
			}
		}
		if (baseClass == RepresentModel.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //TracedModelParameterImpl
