/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.test.nativejavaparser.ejctree;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EJC Method Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.test.nativejavaparser.ejctree.EJCMethodDecl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclectic.test.nativejavaparser.ejctree.EJCMethodDecl#getQName <em>QName</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.test.nativejavaparser.ejctree.EjctreePackage#getEJCMethodDecl()
 * @model
 * @generated
 */
public interface EJCMethodDecl extends EJCTree {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclectic.test.nativejavaparser.ejctree.EjctreePackage#getEJCMethodDecl_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclectic.test.nativejavaparser.ejctree.EJCMethodDecl#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>QName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QName</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QName</em>' attribute.
	 * @see #setQName(String)
	 * @see org.eclectic.test.nativejavaparser.ejctree.EjctreePackage#getEJCMethodDecl_QName()
	 * @model required="true"
	 * @generated
	 */
	String getQName();

	/**
	 * Sets the value of the '{@link org.eclectic.test.nativejavaparser.ejctree.EJCMethodDecl#getQName <em>QName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QName</em>' attribute.
	 * @see #getQName()
	 * @generated
	 */
	void setQName(String value);

} // EJCMethodDecl
