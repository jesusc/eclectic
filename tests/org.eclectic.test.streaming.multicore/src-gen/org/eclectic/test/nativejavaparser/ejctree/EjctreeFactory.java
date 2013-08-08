/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.test.nativejavaparser.ejctree;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclectic.test.nativejavaparser.ejctree.EjctreePackage
 * @generated
 */
public interface EjctreeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EjctreeFactory eINSTANCE = org.eclectic.test.nativejavaparser.ejctree.impl.EjctreeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EJC Compilation Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EJC Compilation Unit</em>'.
	 * @generated
	 */
	EJCCompilationUnit createEJCCompilationUnit();

	/**
	 * Returns a new object of class '<em>EJC Class Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EJC Class Decl</em>'.
	 * @generated
	 */
	EJCClassDecl createEJCClassDecl();

	/**
	 * Returns a new object of class '<em>EJC Method Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EJC Method Decl</em>'.
	 * @generated
	 */
	EJCMethodDecl createEJCMethodDecl();

	/**
	 * Returns a new object of class '<em>EJC Ident</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EJC Ident</em>'.
	 * @generated
	 */
	EJCIdent createEJCIdent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EjctreePackage getEjctreePackage();

} //EjctreeFactory
