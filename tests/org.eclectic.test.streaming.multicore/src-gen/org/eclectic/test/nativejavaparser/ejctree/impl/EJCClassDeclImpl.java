/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.test.nativejavaparser.ejctree.impl;

import java.util.Collection;
import org.eclectic.test.nativejavaparser.ejctree.EJCClassDecl;
import org.eclectic.test.nativejavaparser.ejctree.EJCIdent;
import org.eclectic.test.nativejavaparser.ejctree.EJCMethodDecl;
import org.eclectic.test.nativejavaparser.ejctree.EjctreePackage;

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
 * An implementation of the model object '<em><b>EJC Class Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.test.nativejavaparser.ejctree.impl.EJCClassDeclImpl#getQName <em>QName</em>}</li>
 *   <li>{@link org.eclectic.test.nativejavaparser.ejctree.impl.EJCClassDeclImpl#getSName <em>SName</em>}</li>
 *   <li>{@link org.eclectic.test.nativejavaparser.ejctree.impl.EJCClassDeclImpl#getExtendingId <em>Extending Id</em>}</li>
 *   <li>{@link org.eclectic.test.nativejavaparser.ejctree.impl.EJCClassDeclImpl#getExtending <em>Extending</em>}</li>
 *   <li>{@link org.eclectic.test.nativejavaparser.ejctree.impl.EJCClassDeclImpl#getMethodDcls <em>Method Dcls</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EJCClassDeclImpl extends EJCTreeImpl implements EJCClassDecl {
	/**
	 * The default value of the '{@link #getQName() <em>QName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQName()
	 * @generated
	 * @ordered
	 */
	protected static final String QNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQName() <em>QName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQName()
	 * @generated
	 * @ordered
	 */
	protected String qName = QNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSName() <em>SName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSName()
	 * @generated
	 * @ordered
	 */
	protected static final String SNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSName() <em>SName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSName()
	 * @generated
	 * @ordered
	 */
	protected String sName = SNAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExtendingId() <em>Extending Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendingId()
	 * @generated
	 * @ordered
	 */
	protected EJCIdent extendingId;

	/**
	 * The cached value of the '{@link #getExtending() <em>Extending</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtending()
	 * @generated
	 * @ordered
	 */
	protected EJCClassDecl extending;

	/**
	 * The cached value of the '{@link #getMethodDcls() <em>Method Dcls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodDcls()
	 * @generated
	 * @ordered
	 */
	protected EList<EJCMethodDecl> methodDcls;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EJCClassDeclImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EjctreePackage.Literals.EJC_CLASS_DECL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQName() {
		return qName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQName(String newQName) {
		String oldQName = qName;
		qName = newQName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjctreePackage.EJC_CLASS_DECL__QNAME, oldQName, qName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSName() {
		return sName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSName(String newSName) {
		String oldSName = sName;
		sName = newSName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjctreePackage.EJC_CLASS_DECL__SNAME, oldSName, sName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EJCIdent getExtendingId() {
		return extendingId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtendingId(EJCIdent newExtendingId, NotificationChain msgs) {
		EJCIdent oldExtendingId = extendingId;
		extendingId = newExtendingId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjctreePackage.EJC_CLASS_DECL__EXTENDING_ID, oldExtendingId, newExtendingId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendingId(EJCIdent newExtendingId) {
		if (newExtendingId != extendingId) {
			NotificationChain msgs = null;
			if (extendingId != null)
				msgs = ((InternalEObject)extendingId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjctreePackage.EJC_CLASS_DECL__EXTENDING_ID, null, msgs);
			if (newExtendingId != null)
				msgs = ((InternalEObject)newExtendingId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjctreePackage.EJC_CLASS_DECL__EXTENDING_ID, null, msgs);
			msgs = basicSetExtendingId(newExtendingId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjctreePackage.EJC_CLASS_DECL__EXTENDING_ID, newExtendingId, newExtendingId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EJCClassDecl getExtending() {
		return extending;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtending(EJCClassDecl newExtending, NotificationChain msgs) {
		EJCClassDecl oldExtending = extending;
		extending = newExtending;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EjctreePackage.EJC_CLASS_DECL__EXTENDING, oldExtending, newExtending);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtending(EJCClassDecl newExtending) {
		if (newExtending != extending) {
			NotificationChain msgs = null;
			if (extending != null)
				msgs = ((InternalEObject)extending).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EjctreePackage.EJC_CLASS_DECL__EXTENDING, null, msgs);
			if (newExtending != null)
				msgs = ((InternalEObject)newExtending).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EjctreePackage.EJC_CLASS_DECL__EXTENDING, null, msgs);
			msgs = basicSetExtending(newExtending, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjctreePackage.EJC_CLASS_DECL__EXTENDING, newExtending, newExtending));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EJCMethodDecl> getMethodDcls() {
		if (methodDcls == null) {
			methodDcls = new EObjectContainmentEList<EJCMethodDecl>(EJCMethodDecl.class, this, EjctreePackage.EJC_CLASS_DECL__METHOD_DCLS);
		}
		return methodDcls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EjctreePackage.EJC_CLASS_DECL__EXTENDING_ID:
				return basicSetExtendingId(null, msgs);
			case EjctreePackage.EJC_CLASS_DECL__EXTENDING:
				return basicSetExtending(null, msgs);
			case EjctreePackage.EJC_CLASS_DECL__METHOD_DCLS:
				return ((InternalEList<?>)getMethodDcls()).basicRemove(otherEnd, msgs);
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
			case EjctreePackage.EJC_CLASS_DECL__QNAME:
				return getQName();
			case EjctreePackage.EJC_CLASS_DECL__SNAME:
				return getSName();
			case EjctreePackage.EJC_CLASS_DECL__EXTENDING_ID:
				return getExtendingId();
			case EjctreePackage.EJC_CLASS_DECL__EXTENDING:
				return getExtending();
			case EjctreePackage.EJC_CLASS_DECL__METHOD_DCLS:
				return getMethodDcls();
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
			case EjctreePackage.EJC_CLASS_DECL__QNAME:
				setQName((String)newValue);
				return;
			case EjctreePackage.EJC_CLASS_DECL__SNAME:
				setSName((String)newValue);
				return;
			case EjctreePackage.EJC_CLASS_DECL__EXTENDING_ID:
				setExtendingId((EJCIdent)newValue);
				return;
			case EjctreePackage.EJC_CLASS_DECL__EXTENDING:
				setExtending((EJCClassDecl)newValue);
				return;
			case EjctreePackage.EJC_CLASS_DECL__METHOD_DCLS:
				getMethodDcls().clear();
				getMethodDcls().addAll((Collection<? extends EJCMethodDecl>)newValue);
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
			case EjctreePackage.EJC_CLASS_DECL__QNAME:
				setQName(QNAME_EDEFAULT);
				return;
			case EjctreePackage.EJC_CLASS_DECL__SNAME:
				setSName(SNAME_EDEFAULT);
				return;
			case EjctreePackage.EJC_CLASS_DECL__EXTENDING_ID:
				setExtendingId((EJCIdent)null);
				return;
			case EjctreePackage.EJC_CLASS_DECL__EXTENDING:
				setExtending((EJCClassDecl)null);
				return;
			case EjctreePackage.EJC_CLASS_DECL__METHOD_DCLS:
				getMethodDcls().clear();
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
			case EjctreePackage.EJC_CLASS_DECL__QNAME:
				return QNAME_EDEFAULT == null ? qName != null : !QNAME_EDEFAULT.equals(qName);
			case EjctreePackage.EJC_CLASS_DECL__SNAME:
				return SNAME_EDEFAULT == null ? sName != null : !SNAME_EDEFAULT.equals(sName);
			case EjctreePackage.EJC_CLASS_DECL__EXTENDING_ID:
				return extendingId != null;
			case EjctreePackage.EJC_CLASS_DECL__EXTENDING:
				return extending != null;
			case EjctreePackage.EJC_CLASS_DECL__METHOD_DCLS:
				return methodDcls != null && !methodDcls.isEmpty();
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
		result.append(" (qName: ");
		result.append(qName);
		result.append(", sName: ");
		result.append(sName);
		result.append(')');
		return result.toString();
	}

} //EJCClassDeclImpl
