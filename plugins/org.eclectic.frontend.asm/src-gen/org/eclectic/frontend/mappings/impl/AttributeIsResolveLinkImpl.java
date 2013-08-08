/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.mappings.impl;

import org.eclectic.frontend.core.ResolveLink;

import org.eclectic.frontend.mappings.AttributeIsResolveLink;
import org.eclectic.frontend.mappings.MappingsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Is Resolve Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.frontend.mappings.impl.AttributeIsResolveLinkImpl#getResolveLink <em>Resolve Link</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeIsResolveLinkImpl extends AttributeRightPartImpl implements AttributeIsResolveLink {
	/**
	 * The cached value of the '{@link #getResolveLink() <em>Resolve Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolveLink()
	 * @generated
	 * @ordered
	 */
	protected ResolveLink resolveLink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeIsResolveLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingsPackage.Literals.ATTRIBUTE_IS_RESOLVE_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolveLink getResolveLink() {
		return resolveLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResolveLink(ResolveLink newResolveLink, NotificationChain msgs) {
		ResolveLink oldResolveLink = resolveLink;
		resolveLink = newResolveLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MappingsPackage.ATTRIBUTE_IS_RESOLVE_LINK__RESOLVE_LINK, oldResolveLink, newResolveLink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolveLink(ResolveLink newResolveLink) {
		if (newResolveLink != resolveLink) {
			NotificationChain msgs = null;
			if (resolveLink != null)
				msgs = ((InternalEObject)resolveLink).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MappingsPackage.ATTRIBUTE_IS_RESOLVE_LINK__RESOLVE_LINK, null, msgs);
			if (newResolveLink != null)
				msgs = ((InternalEObject)newResolveLink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MappingsPackage.ATTRIBUTE_IS_RESOLVE_LINK__RESOLVE_LINK, null, msgs);
			msgs = basicSetResolveLink(newResolveLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingsPackage.ATTRIBUTE_IS_RESOLVE_LINK__RESOLVE_LINK, newResolveLink, newResolveLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MappingsPackage.ATTRIBUTE_IS_RESOLVE_LINK__RESOLVE_LINK:
				return basicSetResolveLink(null, msgs);
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
			case MappingsPackage.ATTRIBUTE_IS_RESOLVE_LINK__RESOLVE_LINK:
				return getResolveLink();
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
			case MappingsPackage.ATTRIBUTE_IS_RESOLVE_LINK__RESOLVE_LINK:
				setResolveLink((ResolveLink)newValue);
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
			case MappingsPackage.ATTRIBUTE_IS_RESOLVE_LINK__RESOLVE_LINK:
				setResolveLink((ResolveLink)null);
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
			case MappingsPackage.ATTRIBUTE_IS_RESOLVE_LINK__RESOLVE_LINK:
				return resolveLink != null;
		}
		return super.eIsSet(featureID);
	}

} //AttributeIsResolveLinkImpl
