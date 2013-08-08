/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.streamdesc.runtime.impl;

import java.util.Collection;

import org.eclectic.streamdesc.runtime.Annotation;
import org.eclectic.streamdesc.runtime.RuntimePackage;
import org.eclectic.streamdesc.runtime.StreamedFragment;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Streamed Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.streamdesc.runtime.impl.StreamedFragmentImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.eclectic.streamdesc.runtime.impl.StreamedFragmentImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.eclectic.streamdesc.runtime.impl.StreamedFragmentImpl#getNonProxyElements <em>Non Proxy Elements</em>}</li>
 *   <li>{@link org.eclectic.streamdesc.runtime.impl.StreamedFragmentImpl#getProxyElements <em>Proxy Elements</em>}</li>
 *   <li>{@link org.eclectic.streamdesc.runtime.impl.StreamedFragmentImpl#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StreamedFragmentImpl extends EObjectImpl implements StreamedFragment {
	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final long TIMESTAMP_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected long timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> elements;

	/**
	 * The cached value of the '{@link #getNonProxyElements() <em>Non Proxy Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonProxyElements()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> nonProxyElements;

	/**
	 * The cached value of the '{@link #getProxyElements() <em>Proxy Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyElements()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> proxyElements;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> annotations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StreamedFragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.STREAMED_FRAGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestamp(long newTimestamp) {
		long oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.STREAMED_FRAGMENT__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<EObject>(EObject.class, this, RuntimePackage.STREAMED_FRAGMENT__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getNonProxyElements() {
		if (nonProxyElements == null) {
			nonProxyElements = new EObjectResolvingEList<EObject>(EObject.class, this, RuntimePackage.STREAMED_FRAGMENT__NON_PROXY_ELEMENTS);
		}
		return nonProxyElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getProxyElements() {
		if (proxyElements == null) {
			proxyElements = new EObjectResolvingEList<EObject>(EObject.class, this, RuntimePackage.STREAMED_FRAGMENT__PROXY_ELEMENTS);
		}
		return proxyElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, RuntimePackage.STREAMED_FRAGMENT__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RuntimePackage.STREAMED_FRAGMENT__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case RuntimePackage.STREAMED_FRAGMENT__ANNOTATIONS:
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
			case RuntimePackage.STREAMED_FRAGMENT__TIMESTAMP:
				return getTimestamp();
			case RuntimePackage.STREAMED_FRAGMENT__ELEMENTS:
				return getElements();
			case RuntimePackage.STREAMED_FRAGMENT__NON_PROXY_ELEMENTS:
				return getNonProxyElements();
			case RuntimePackage.STREAMED_FRAGMENT__PROXY_ELEMENTS:
				return getProxyElements();
			case RuntimePackage.STREAMED_FRAGMENT__ANNOTATIONS:
				return getAnnotations();
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
			case RuntimePackage.STREAMED_FRAGMENT__TIMESTAMP:
				setTimestamp((Long)newValue);
				return;
			case RuntimePackage.STREAMED_FRAGMENT__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends EObject>)newValue);
				return;
			case RuntimePackage.STREAMED_FRAGMENT__NON_PROXY_ELEMENTS:
				getNonProxyElements().clear();
				getNonProxyElements().addAll((Collection<? extends EObject>)newValue);
				return;
			case RuntimePackage.STREAMED_FRAGMENT__PROXY_ELEMENTS:
				getProxyElements().clear();
				getProxyElements().addAll((Collection<? extends EObject>)newValue);
				return;
			case RuntimePackage.STREAMED_FRAGMENT__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends Annotation>)newValue);
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
			case RuntimePackage.STREAMED_FRAGMENT__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case RuntimePackage.STREAMED_FRAGMENT__ELEMENTS:
				getElements().clear();
				return;
			case RuntimePackage.STREAMED_FRAGMENT__NON_PROXY_ELEMENTS:
				getNonProxyElements().clear();
				return;
			case RuntimePackage.STREAMED_FRAGMENT__PROXY_ELEMENTS:
				getProxyElements().clear();
				return;
			case RuntimePackage.STREAMED_FRAGMENT__ANNOTATIONS:
				getAnnotations().clear();
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
			case RuntimePackage.STREAMED_FRAGMENT__TIMESTAMP:
				return timestamp != TIMESTAMP_EDEFAULT;
			case RuntimePackage.STREAMED_FRAGMENT__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case RuntimePackage.STREAMED_FRAGMENT__NON_PROXY_ELEMENTS:
				return nonProxyElements != null && !nonProxyElements.isEmpty();
			case RuntimePackage.STREAMED_FRAGMENT__PROXY_ELEMENTS:
				return proxyElements != null && !proxyElements.isEmpty();
			case RuntimePackage.STREAMED_FRAGMENT__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
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
		result.append(" (timestamp: ");
		result.append(timestamp);
		result.append(')');
		return result.toString();
	}

} //StreamedFragmentImpl
