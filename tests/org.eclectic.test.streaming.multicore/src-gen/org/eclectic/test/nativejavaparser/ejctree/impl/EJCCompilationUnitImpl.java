/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.test.nativejavaparser.ejctree.impl;

import java.util.Collection;

import org.eclectic.test.nativejavaparser.ejctree.EJCCompilationUnit;
import org.eclectic.test.nativejavaparser.ejctree.EJCTree;
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
 * An implementation of the model object '<em><b>EJC Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.test.nativejavaparser.ejctree.impl.EJCCompilationUnitImpl#getSourceFile <em>Source File</em>}</li>
 *   <li>{@link org.eclectic.test.nativejavaparser.ejctree.impl.EJCCompilationUnitImpl#getTypeDecls <em>Type Decls</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EJCCompilationUnitImpl extends EJCTreeImpl implements EJCCompilationUnit {
	/**
	 * The default value of the '{@link #getSourceFile() <em>Source File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceFile()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_FILE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSourceFile() <em>Source File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceFile()
	 * @generated
	 * @ordered
	 */
	protected String sourceFile = SOURCE_FILE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getTypeDecls() <em>Type Decls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDecls()
	 * @generated
	 * @ordered
	 */
	protected EList<EJCTree> typeDecls;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EJCCompilationUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EjctreePackage.Literals.EJC_COMPILATION_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceFile() {
		return sourceFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceFile(String newSourceFile) {
		String oldSourceFile = sourceFile;
		sourceFile = newSourceFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EjctreePackage.EJC_COMPILATION_UNIT__SOURCE_FILE, oldSourceFile, sourceFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EJCTree> getTypeDecls() {
		if (typeDecls == null) {
			typeDecls = new EObjectContainmentEList<EJCTree>(EJCTree.class, this, EjctreePackage.EJC_COMPILATION_UNIT__TYPE_DECLS);
		}
		return typeDecls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EjctreePackage.EJC_COMPILATION_UNIT__TYPE_DECLS:
				return ((InternalEList<?>)getTypeDecls()).basicRemove(otherEnd, msgs);
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
			case EjctreePackage.EJC_COMPILATION_UNIT__SOURCE_FILE:
				return getSourceFile();
			case EjctreePackage.EJC_COMPILATION_UNIT__TYPE_DECLS:
				return getTypeDecls();
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
			case EjctreePackage.EJC_COMPILATION_UNIT__SOURCE_FILE:
				setSourceFile((String)newValue);
				return;
			case EjctreePackage.EJC_COMPILATION_UNIT__TYPE_DECLS:
				getTypeDecls().clear();
				getTypeDecls().addAll((Collection<? extends EJCTree>)newValue);
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
			case EjctreePackage.EJC_COMPILATION_UNIT__SOURCE_FILE:
				setSourceFile(SOURCE_FILE_EDEFAULT);
				return;
			case EjctreePackage.EJC_COMPILATION_UNIT__TYPE_DECLS:
				getTypeDecls().clear();
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
			case EjctreePackage.EJC_COMPILATION_UNIT__SOURCE_FILE:
				return SOURCE_FILE_EDEFAULT == null ? sourceFile != null : !SOURCE_FILE_EDEFAULT.equals(sourceFile);
			case EjctreePackage.EJC_COMPILATION_UNIT__TYPE_DECLS:
				return typeDecls != null && !typeDecls.isEmpty();
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
		result.append(" (sourceFile: ");
		result.append(sourceFile);
		result.append(')');
		return result.toString();
	}

} //EJCCompilationUnitImpl
