/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.core.impl;

import org.eclectic.idc.core.CorePackage;
import org.eclectic.idc.core.ExecutableUnit;
import org.eclectic.idc.core.NormalFunction;

import org.eclectic.idc.scheduling.ExecutionPlan;
import org.eclectic.idc.scheduling.SchedulingPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Executable Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.idc.core.impl.ExecutableUnitImpl#getPre <em>Pre</em>}</li>
 *   <li>{@link org.eclectic.idc.core.impl.ExecutableUnitImpl#getPost <em>Post</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ExecutableUnitImpl extends CodeUnitImpl implements ExecutableUnit {
	/**
	 * The cached value of the '{@link #getPre() <em>Pre</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPre()
	 * @generated
	 * @ordered
	 */
	protected NormalFunction pre;

	/**
	 * The cached value of the '{@link #getPost() <em>Post</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPost()
	 * @generated
	 * @ordered
	 */
	protected NormalFunction post;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutableUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.EXECUTABLE_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalFunction getPre() {
		if (pre != null && pre.eIsProxy()) {
			InternalEObject oldPre = (InternalEObject)pre;
			pre = (NormalFunction)eResolveProxy(oldPre);
			if (pre != oldPre) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.EXECUTABLE_UNIT__PRE, oldPre, pre));
			}
		}
		return pre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalFunction basicGetPre() {
		return pre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPre(NormalFunction newPre) {
		NormalFunction oldPre = pre;
		pre = newPre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.EXECUTABLE_UNIT__PRE, oldPre, pre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalFunction getPost() {
		if (post != null && post.eIsProxy()) {
			InternalEObject oldPost = (InternalEObject)post;
			post = (NormalFunction)eResolveProxy(oldPost);
			if (post != oldPost) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.EXECUTABLE_UNIT__POST, oldPost, post));
			}
		}
		return post;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalFunction basicGetPost() {
		return post;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPost(NormalFunction newPost) {
		NormalFunction oldPost = post;
		post = newPost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.EXECUTABLE_UNIT__POST, oldPost, post));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.EXECUTABLE_UNIT__PRE:
				if (resolve) return getPre();
				return basicGetPre();
			case CorePackage.EXECUTABLE_UNIT__POST:
				if (resolve) return getPost();
				return basicGetPost();
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
			case CorePackage.EXECUTABLE_UNIT__PRE:
				setPre((NormalFunction)newValue);
				return;
			case CorePackage.EXECUTABLE_UNIT__POST:
				setPost((NormalFunction)newValue);
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
			case CorePackage.EXECUTABLE_UNIT__PRE:
				setPre((NormalFunction)null);
				return;
			case CorePackage.EXECUTABLE_UNIT__POST:
				setPost((NormalFunction)null);
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
			case CorePackage.EXECUTABLE_UNIT__PRE:
				return pre != null;
			case CorePackage.EXECUTABLE_UNIT__POST:
				return post != null;
		}
		return super.eIsSet(featureID);
	}

} //ExecutableUnitImpl
