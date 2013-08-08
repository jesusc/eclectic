/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.test.nativejavaparser.ejctree.util;

import org.eclectic.test.nativejavaparser.ejctree.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclectic.test.nativejavaparser.ejctree.EjctreePackage
 * @generated
 */
public class EjctreeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EjctreePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjctreeSwitch() {
		if (modelPackage == null) {
			modelPackage = EjctreePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EjctreePackage.EJC_TREE: {
				EJCTree ejcTree = (EJCTree)theEObject;
				T result = caseEJCTree(ejcTree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjctreePackage.EJC_COMPILATION_UNIT: {
				EJCCompilationUnit ejcCompilationUnit = (EJCCompilationUnit)theEObject;
				T result = caseEJCCompilationUnit(ejcCompilationUnit);
				if (result == null) result = caseEJCTree(ejcCompilationUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjctreePackage.EJC_CLASS_DECL: {
				EJCClassDecl ejcClassDecl = (EJCClassDecl)theEObject;
				T result = caseEJCClassDecl(ejcClassDecl);
				if (result == null) result = caseEJCTree(ejcClassDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjctreePackage.EJC_METHOD_DECL: {
				EJCMethodDecl ejcMethodDecl = (EJCMethodDecl)theEObject;
				T result = caseEJCMethodDecl(ejcMethodDecl);
				if (result == null) result = caseEJCTree(ejcMethodDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EjctreePackage.EJC_IDENT: {
				EJCIdent ejcIdent = (EJCIdent)theEObject;
				T result = caseEJCIdent(ejcIdent);
				if (result == null) result = caseEJCTree(ejcIdent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EJC Tree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EJC Tree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEJCTree(EJCTree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EJC Compilation Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EJC Compilation Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEJCCompilationUnit(EJCCompilationUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EJC Class Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EJC Class Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEJCClassDecl(EJCClassDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EJC Method Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EJC Method Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEJCMethodDecl(EJCMethodDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EJC Ident</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EJC Ident</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEJCIdent(EJCIdent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EjctreeSwitch
