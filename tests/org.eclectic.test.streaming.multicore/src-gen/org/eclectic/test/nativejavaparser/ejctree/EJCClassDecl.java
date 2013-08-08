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
 * A representation of the model object '<em><b>EJC Class Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.test.nativejavaparser.ejctree.EJCClassDecl#getQName <em>QName</em>}</li>
 *   <li>{@link org.eclectic.test.nativejavaparser.ejctree.EJCClassDecl#getSName <em>SName</em>}</li>
 *   <li>{@link org.eclectic.test.nativejavaparser.ejctree.EJCClassDecl#getExtendingId <em>Extending Id</em>}</li>
 *   <li>{@link org.eclectic.test.nativejavaparser.ejctree.EJCClassDecl#getExtending <em>Extending</em>}</li>
 *   <li>{@link org.eclectic.test.nativejavaparser.ejctree.EJCClassDecl#getMethodDcls <em>Method Dcls</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.test.nativejavaparser.ejctree.EjctreePackage#getEJCClassDecl()
 * @model
 * @generated
 */
public interface EJCClassDecl extends EJCTree {
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
	 * @see org.eclectic.test.nativejavaparser.ejctree.EjctreePackage#getEJCClassDecl_QName()
	 * @model required="true"
	 * @generated
	 */
	String getQName();

	/**
	 * Sets the value of the '{@link org.eclectic.test.nativejavaparser.ejctree.EJCClassDecl#getQName <em>QName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QName</em>' attribute.
	 * @see #getQName()
	 * @generated
	 */
	void setQName(String value);

	/**
	 * Returns the value of the '<em><b>SName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SName</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SName</em>' attribute.
	 * @see #setSName(String)
	 * @see org.eclectic.test.nativejavaparser.ejctree.EjctreePackage#getEJCClassDecl_SName()
	 * @model required="true"
	 * @generated
	 */
	String getSName();

	/**
	 * Sets the value of the '{@link org.eclectic.test.nativejavaparser.ejctree.EJCClassDecl#getSName <em>SName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SName</em>' attribute.
	 * @see #getSName()
	 * @generated
	 */
	void setSName(String value);

	/**
	 * Returns the value of the '<em><b>Extending Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extending Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extending Id</em>' containment reference.
	 * @see #setExtendingId(EJCIdent)
	 * @see org.eclectic.test.nativejavaparser.ejctree.EjctreePackage#getEJCClassDecl_ExtendingId()
	 * @model containment="true"
	 * @generated
	 */
	EJCIdent getExtendingId();

	/**
	 * Sets the value of the '{@link org.eclectic.test.nativejavaparser.ejctree.EJCClassDecl#getExtendingId <em>Extending Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extending Id</em>' containment reference.
	 * @see #getExtendingId()
	 * @generated
	 */
	void setExtendingId(EJCIdent value);

	/**
	 * Returns the value of the '<em><b>Extending</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extending</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extending</em>' containment reference.
	 * @see #setExtending(EJCClassDecl)
	 * @see org.eclectic.test.nativejavaparser.ejctree.EjctreePackage#getEJCClassDecl_Extending()
	 * @model containment="true"
	 * @generated
	 */
	EJCClassDecl getExtending();

	/**
	 * Sets the value of the '{@link org.eclectic.test.nativejavaparser.ejctree.EJCClassDecl#getExtending <em>Extending</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extending</em>' containment reference.
	 * @see #getExtending()
	 * @generated
	 */
	void setExtending(EJCClassDecl value);

	/**
	 * Returns the value of the '<em><b>Method Dcls</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.test.nativejavaparser.ejctree.EJCMethodDecl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Dcls</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Dcls</em>' containment reference list.
	 * @see org.eclectic.test.nativejavaparser.ejctree.EjctreePackage#getEJCClassDecl_MethodDcls()
	 * @model containment="true"
	 * @generated
	 */
	EList<EJCMethodDecl> getMethodDcls();

} // EJCClassDecl
