/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.test.nativejavaparser.ejctree;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EJC Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.test.nativejavaparser.ejctree.EJCCompilationUnit#getSourceFile <em>Source File</em>}</li>
 *   <li>{@link org.eclectic.test.nativejavaparser.ejctree.EJCCompilationUnit#getTypeDecls <em>Type Decls</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.test.nativejavaparser.ejctree.EjctreePackage#getEJCCompilationUnit()
 * @model
 * @generated
 */
public interface EJCCompilationUnit extends EJCTree {
	/**
	 * Returns the value of the '<em><b>Source File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source File</em>' attribute.
	 * @see #setSourceFile(String)
	 * @see org.eclectic.test.nativejavaparser.ejctree.EjctreePackage#getEJCCompilationUnit_SourceFile()
	 * @model required="true"
	 * @generated
	 */
	String getSourceFile();

	/**
	 * Sets the value of the '{@link org.eclectic.test.nativejavaparser.ejctree.EJCCompilationUnit#getSourceFile <em>Source File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source File</em>' attribute.
	 * @see #getSourceFile()
	 * @generated
	 */
	void setSourceFile(String value);

	/**
	 * Returns the value of the '<em><b>Type Decls</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.test.nativejavaparser.ejctree.EJCTree}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Decls</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Decls</em>' containment reference list.
	 * @see org.eclectic.test.nativejavaparser.ejctree.EjctreePackage#getEJCCompilationUnit_TypeDecls()
	 * @model containment="true"
	 * @generated
	 */
	EList<EJCTree> getTypeDecls();

} // EJCCompilationUnit
