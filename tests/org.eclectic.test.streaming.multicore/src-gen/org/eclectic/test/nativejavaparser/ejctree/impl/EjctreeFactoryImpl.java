/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.test.nativejavaparser.ejctree.impl;

import org.eclectic.test.nativejavaparser.ejctree.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EjctreeFactoryImpl extends EFactoryImpl implements EjctreeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EjctreeFactory init() {
		try {
			EjctreeFactory theEjctreeFactory = (EjctreeFactory)EPackage.Registry.INSTANCE.getEFactory("http://eclectic.org/streaming/emf_java_compiler_tree"); 
			if (theEjctreeFactory != null) {
				return theEjctreeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EjctreeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjctreeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EjctreePackage.EJC_COMPILATION_UNIT: return createEJCCompilationUnit();
			case EjctreePackage.EJC_CLASS_DECL: return createEJCClassDecl();
			case EjctreePackage.EJC_METHOD_DECL: return createEJCMethodDecl();
			case EjctreePackage.EJC_IDENT: return createEJCIdent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EJCCompilationUnit createEJCCompilationUnit() {
		EJCCompilationUnitImpl ejcCompilationUnit = new EJCCompilationUnitImpl();
		return ejcCompilationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EJCClassDecl createEJCClassDecl() {
		EJCClassDeclImpl ejcClassDecl = new EJCClassDeclImpl();
		return ejcClassDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EJCMethodDecl createEJCMethodDecl() {
		EJCMethodDeclImpl ejcMethodDecl = new EJCMethodDeclImpl();
		return ejcMethodDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EJCIdent createEJCIdent() {
		EJCIdentImpl ejcIdent = new EJCIdentImpl();
		return ejcIdent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EjctreePackage getEjctreePackage() {
		return (EjctreePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EjctreePackage getPackage() {
		return EjctreePackage.eINSTANCE;
	}

} //EjctreeFactoryImpl
