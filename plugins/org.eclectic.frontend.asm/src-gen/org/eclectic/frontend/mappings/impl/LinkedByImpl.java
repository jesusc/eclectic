/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.mappings.impl;

import org.eclectic.frontend.mappings.AttributeRef;
import org.eclectic.frontend.mappings.LinkedBy;
import org.eclectic.frontend.mappings.MappingsPackage;

import org.eclectic.frontend.mappings.MatchedElement;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linked By</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.frontend.mappings.impl.LinkedByImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.impl.LinkedByImpl#getLinkedElement <em>Linked Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkedByImpl extends C2CModifierImpl implements LinkedBy {
	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected AttributeRef attribute;

	/**
	 * The cached value of the '{@link #getLinkedElement() <em>Linked Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedElement()
	 * @generated
	 * @ordered
	 */
	protected MatchedElement linkedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkedByImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingsPackage.Literals.LINKED_BY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeRef getAttribute() {
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttribute(AttributeRef newAttribute, NotificationChain msgs) {
		AttributeRef oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MappingsPackage.LINKED_BY__ATTRIBUTE, oldAttribute, newAttribute);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(AttributeRef newAttribute) {
		if (newAttribute != attribute) {
			NotificationChain msgs = null;
			if (attribute != null)
				msgs = ((InternalEObject)attribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MappingsPackage.LINKED_BY__ATTRIBUTE, null, msgs);
			if (newAttribute != null)
				msgs = ((InternalEObject)newAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MappingsPackage.LINKED_BY__ATTRIBUTE, null, msgs);
			msgs = basicSetAttribute(newAttribute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingsPackage.LINKED_BY__ATTRIBUTE, newAttribute, newAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchedElement getLinkedElement() {
		if (linkedElement != null && linkedElement.eIsProxy()) {
			InternalEObject oldLinkedElement = (InternalEObject)linkedElement;
			linkedElement = (MatchedElement)eResolveProxy(oldLinkedElement);
			if (linkedElement != oldLinkedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MappingsPackage.LINKED_BY__LINKED_ELEMENT, oldLinkedElement, linkedElement));
			}
		}
		return linkedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchedElement basicGetLinkedElement() {
		return linkedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkedElement(MatchedElement newLinkedElement) {
		MatchedElement oldLinkedElement = linkedElement;
		linkedElement = newLinkedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingsPackage.LINKED_BY__LINKED_ELEMENT, oldLinkedElement, linkedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MappingsPackage.LINKED_BY__ATTRIBUTE:
				return basicSetAttribute(null, msgs);
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
			case MappingsPackage.LINKED_BY__ATTRIBUTE:
				return getAttribute();
			case MappingsPackage.LINKED_BY__LINKED_ELEMENT:
				if (resolve) return getLinkedElement();
				return basicGetLinkedElement();
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
			case MappingsPackage.LINKED_BY__ATTRIBUTE:
				setAttribute((AttributeRef)newValue);
				return;
			case MappingsPackage.LINKED_BY__LINKED_ELEMENT:
				setLinkedElement((MatchedElement)newValue);
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
			case MappingsPackage.LINKED_BY__ATTRIBUTE:
				setAttribute((AttributeRef)null);
				return;
			case MappingsPackage.LINKED_BY__LINKED_ELEMENT:
				setLinkedElement((MatchedElement)null);
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
			case MappingsPackage.LINKED_BY__ATTRIBUTE:
				return attribute != null;
			case MappingsPackage.LINKED_BY__LINKED_ELEMENT:
				return linkedElement != null;
		}
		return super.eIsSet(featureID);
	}

} //LinkedByImpl
