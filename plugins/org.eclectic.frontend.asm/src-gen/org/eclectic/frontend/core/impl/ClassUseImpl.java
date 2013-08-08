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
import org.eclectic.frontend.core.ClassUse;
import org.eclectic.frontend.core.CorePackage;
import org.eclectic.frontend.core.ImplicitlyAnnotableElement;
import org.eclectic.frontend.core.RepresentModel;

import org.eclectic.frontend.core.SingleAnnotation;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Use</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.frontend.core.impl.ClassUseImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclectic.frontend.core.impl.ClassUseImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.eclectic.frontend.core.impl.ClassUseImpl#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.eclectic.frontend.core.impl.ClassUseImpl#isStrictType <em>Strict Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassUseImpl extends TypeExpressionImpl implements ClassUse {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<SingleAnnotation> annotations;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected RepresentModel model;

	/**
	 * The default value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected String className = CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isStrictType() <em>Strict Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStrictType()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STRICT_TYPE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStrictType() <em>Strict Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStrictType()
	 * @generated
	 * @ordered
	 */
	protected boolean strictType = STRICT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassUseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.CLASS_USE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SingleAnnotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<SingleAnnotation>(SingleAnnotation.class, this, CorePackage.CLASS_USE__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentModel getModel() {
		if (model != null && model.eIsProxy()) {
			InternalEObject oldModel = (InternalEObject)model;
			model = (RepresentModel)eResolveProxy(oldModel);
			if (model != oldModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.CLASS_USE__MODEL, oldModel, model));
			}
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentModel basicGetModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(RepresentModel newModel) {
		RepresentModel oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CLASS_USE__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassName(String newClassName) {
		String oldClassName = className;
		className = newClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CLASS_USE__CLASS_NAME, oldClassName, className));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStrictType() {
		return strictType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrictType(boolean newStrictType) {
		boolean oldStrictType = strictType;
		strictType = newStrictType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CLASS_USE__STRICT_TYPE, oldStrictType, strictType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.CLASS_USE__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
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
			case CorePackage.CLASS_USE__ANNOTATIONS:
				return getAnnotations();
			case CorePackage.CLASS_USE__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
			case CorePackage.CLASS_USE__CLASS_NAME:
				return getClassName();
			case CorePackage.CLASS_USE__STRICT_TYPE:
				return isStrictType();
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
			case CorePackage.CLASS_USE__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends SingleAnnotation>)newValue);
				return;
			case CorePackage.CLASS_USE__MODEL:
				setModel((RepresentModel)newValue);
				return;
			case CorePackage.CLASS_USE__CLASS_NAME:
				setClassName((String)newValue);
				return;
			case CorePackage.CLASS_USE__STRICT_TYPE:
				setStrictType((Boolean)newValue);
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
			case CorePackage.CLASS_USE__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case CorePackage.CLASS_USE__MODEL:
				setModel((RepresentModel)null);
				return;
			case CorePackage.CLASS_USE__CLASS_NAME:
				setClassName(CLASS_NAME_EDEFAULT);
				return;
			case CorePackage.CLASS_USE__STRICT_TYPE:
				setStrictType(STRICT_TYPE_EDEFAULT);
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
			case CorePackage.CLASS_USE__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case CorePackage.CLASS_USE__MODEL:
				return model != null;
			case CorePackage.CLASS_USE__CLASS_NAME:
				return CLASS_NAME_EDEFAULT == null ? className != null : !CLASS_NAME_EDEFAULT.equals(className);
			case CorePackage.CLASS_USE__STRICT_TYPE:
				return strictType != STRICT_TYPE_EDEFAULT;
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
		if (baseClass == ImplicitlyAnnotableElement.class) {
			switch (derivedFeatureID) {
				case CorePackage.CLASS_USE__ANNOTATIONS: return CorePackage.IMPLICITLY_ANNOTABLE_ELEMENT__ANNOTATIONS;
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
		if (baseClass == ImplicitlyAnnotableElement.class) {
			switch (baseFeatureID) {
				case CorePackage.IMPLICITLY_ANNOTABLE_ELEMENT__ANNOTATIONS: return CorePackage.CLASS_USE__ANNOTATIONS;
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
		result.append(" (className: ");
		result.append(className);
		result.append(", strictType: ");
		result.append(strictType);
		result.append(')');
		return result.toString();
	}

} //ClassUseImpl
