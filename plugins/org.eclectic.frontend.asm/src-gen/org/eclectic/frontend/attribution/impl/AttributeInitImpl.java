/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.attribution.impl;

import org.eclectic.frontend.attribution.AttributeDcl;
import org.eclectic.frontend.attribution.AttributeInit;
import org.eclectic.frontend.attribution.AttributionPackage;

import org.eclectic.frontend.core.Expression;

import org.eclectic.frontend.core.impl.StatementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Init</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.frontend.attribution.impl.AttributeInitImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.eclectic.frontend.attribution.impl.AttributeInitImpl#getReceptor <em>Receptor</em>}</li>
 *   <li>{@link org.eclectic.frontend.attribution.impl.AttributeInitImpl#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeInitImpl extends StatementImpl implements AttributeInit {
	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected AttributeDcl attribute;

	/**
	 * The cached value of the '{@link #getReceptor() <em>Receptor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceptor()
	 * @generated
	 * @ordered
	 */
	protected Expression receptor;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected Expression right;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeInitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AttributionPackage.Literals.ATTRIBUTE_INIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDcl getAttribute() {
		if (attribute != null && attribute.eIsProxy()) {
			InternalEObject oldAttribute = (InternalEObject)attribute;
			attribute = (AttributeDcl)eResolveProxy(oldAttribute);
			if (attribute != oldAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AttributionPackage.ATTRIBUTE_INIT__ATTRIBUTE, oldAttribute, attribute));
			}
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDcl basicGetAttribute() {
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(AttributeDcl newAttribute) {
		AttributeDcl oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AttributionPackage.ATTRIBUTE_INIT__ATTRIBUTE, oldAttribute, attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getReceptor() {
		return receptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceptor(Expression newReceptor, NotificationChain msgs) {
		Expression oldReceptor = receptor;
		receptor = newReceptor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AttributionPackage.ATTRIBUTE_INIT__RECEPTOR, oldReceptor, newReceptor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceptor(Expression newReceptor) {
		if (newReceptor != receptor) {
			NotificationChain msgs = null;
			if (receptor != null)
				msgs = ((InternalEObject)receptor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AttributionPackage.ATTRIBUTE_INIT__RECEPTOR, null, msgs);
			if (newReceptor != null)
				msgs = ((InternalEObject)newReceptor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AttributionPackage.ATTRIBUTE_INIT__RECEPTOR, null, msgs);
			msgs = basicSetReceptor(newReceptor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AttributionPackage.ATTRIBUTE_INIT__RECEPTOR, newReceptor, newReceptor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRight(Expression newRight, NotificationChain msgs) {
		Expression oldRight = right;
		right = newRight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AttributionPackage.ATTRIBUTE_INIT__RIGHT, oldRight, newRight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(Expression newRight) {
		if (newRight != right) {
			NotificationChain msgs = null;
			if (right != null)
				msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AttributionPackage.ATTRIBUTE_INIT__RIGHT, null, msgs);
			if (newRight != null)
				msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AttributionPackage.ATTRIBUTE_INIT__RIGHT, null, msgs);
			msgs = basicSetRight(newRight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AttributionPackage.ATTRIBUTE_INIT__RIGHT, newRight, newRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AttributionPackage.ATTRIBUTE_INIT__RECEPTOR:
				return basicSetReceptor(null, msgs);
			case AttributionPackage.ATTRIBUTE_INIT__RIGHT:
				return basicSetRight(null, msgs);
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
			case AttributionPackage.ATTRIBUTE_INIT__ATTRIBUTE:
				if (resolve) return getAttribute();
				return basicGetAttribute();
			case AttributionPackage.ATTRIBUTE_INIT__RECEPTOR:
				return getReceptor();
			case AttributionPackage.ATTRIBUTE_INIT__RIGHT:
				return getRight();
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
			case AttributionPackage.ATTRIBUTE_INIT__ATTRIBUTE:
				setAttribute((AttributeDcl)newValue);
				return;
			case AttributionPackage.ATTRIBUTE_INIT__RECEPTOR:
				setReceptor((Expression)newValue);
				return;
			case AttributionPackage.ATTRIBUTE_INIT__RIGHT:
				setRight((Expression)newValue);
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
			case AttributionPackage.ATTRIBUTE_INIT__ATTRIBUTE:
				setAttribute((AttributeDcl)null);
				return;
			case AttributionPackage.ATTRIBUTE_INIT__RECEPTOR:
				setReceptor((Expression)null);
				return;
			case AttributionPackage.ATTRIBUTE_INIT__RIGHT:
				setRight((Expression)null);
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
			case AttributionPackage.ATTRIBUTE_INIT__ATTRIBUTE:
				return attribute != null;
			case AttributionPackage.ATTRIBUTE_INIT__RECEPTOR:
				return receptor != null;
			case AttributionPackage.ATTRIBUTE_INIT__RIGHT:
				return right != null;
		}
		return super.eIsSet(featureID);
	}

} //AttributeInitImpl
