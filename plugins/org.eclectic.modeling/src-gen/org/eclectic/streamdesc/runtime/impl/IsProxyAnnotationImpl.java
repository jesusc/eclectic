/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.streamdesc.runtime.impl;

import org.eclectic.streamdesc.runtime.IsProxyAnnotation;
import org.eclectic.streamdesc.runtime.RuntimePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Is Proxy Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.streamdesc.runtime.impl.IsProxyAnnotationImpl#getReferenceSource <em>Reference Source</em>}</li>
 *   <li>{@link org.eclectic.streamdesc.runtime.impl.IsProxyAnnotationImpl#getReferenceName <em>Reference Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IsProxyAnnotationImpl extends AnnotationImpl implements IsProxyAnnotation {
	/**
	 * The cached value of the '{@link #getReferenceSource() <em>Reference Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceSource()
	 * @generated
	 * @ordered
	 */
	protected EObject referenceSource;
	/**
	 * The default value of the '{@link #getReferenceName() <em>Reference Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceName()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getReferenceName() <em>Reference Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceName()
	 * @generated
	 * @ordered
	 */
	protected String referenceName = REFERENCE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IsProxyAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.IS_PROXY_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getReferenceSource() {
		if (referenceSource != null && referenceSource.eIsProxy()) {
			InternalEObject oldReferenceSource = (InternalEObject)referenceSource;
			referenceSource = eResolveProxy(oldReferenceSource);
			if (referenceSource != oldReferenceSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.IS_PROXY_ANNOTATION__REFERENCE_SOURCE, oldReferenceSource, referenceSource));
			}
		}
		return referenceSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetReferenceSource() {
		return referenceSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceSource(EObject newReferenceSource) {
		EObject oldReferenceSource = referenceSource;
		referenceSource = newReferenceSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.IS_PROXY_ANNOTATION__REFERENCE_SOURCE, oldReferenceSource, referenceSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferenceName() {
		return referenceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceName(String newReferenceName) {
		String oldReferenceName = referenceName;
		referenceName = newReferenceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.IS_PROXY_ANNOTATION__REFERENCE_NAME, oldReferenceName, referenceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RuntimePackage.IS_PROXY_ANNOTATION__REFERENCE_SOURCE:
				if (resolve) return getReferenceSource();
				return basicGetReferenceSource();
			case RuntimePackage.IS_PROXY_ANNOTATION__REFERENCE_NAME:
				return getReferenceName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RuntimePackage.IS_PROXY_ANNOTATION__REFERENCE_SOURCE:
				setReferenceSource((EObject)newValue);
				return;
			case RuntimePackage.IS_PROXY_ANNOTATION__REFERENCE_NAME:
				setReferenceName((String)newValue);
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
			case RuntimePackage.IS_PROXY_ANNOTATION__REFERENCE_SOURCE:
				setReferenceSource((EObject)null);
				return;
			case RuntimePackage.IS_PROXY_ANNOTATION__REFERENCE_NAME:
				setReferenceName(REFERENCE_NAME_EDEFAULT);
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
			case RuntimePackage.IS_PROXY_ANNOTATION__REFERENCE_SOURCE:
				return referenceSource != null;
			case RuntimePackage.IS_PROXY_ANNOTATION__REFERENCE_NAME:
				return REFERENCE_NAME_EDEFAULT == null ? referenceName != null : !REFERENCE_NAME_EDEFAULT.equals(referenceName);
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
		result.append(" (referenceName: ");
		result.append(referenceName);
		result.append(')');
		return result.toString();
	}

} //IsProxyAnnotationImpl
