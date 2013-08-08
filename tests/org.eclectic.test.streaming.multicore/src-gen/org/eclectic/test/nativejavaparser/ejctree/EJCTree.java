/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.test.nativejavaparser.ejctree;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EJC Tree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.test.nativejavaparser.ejctree.EJCTree#getObjectId <em>Object Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.test.nativejavaparser.ejctree.EjctreePackage#getEJCTree()
 * @model abstract="true"
 * @generated
 */
public interface EJCTree extends EObject {

	/**
	 * Returns the value of the '<em><b>Object Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Id</em>' attribute.
	 * @see #setObjectId(String)
	 * @see org.eclectic.test.nativejavaparser.ejctree.EjctreePackage#getEJCTree_ObjectId()
	 * @model required="true"
	 * @generated
	 */
	String getObjectId();

	/**
	 * Sets the value of the '{@link org.eclectic.test.nativejavaparser.ejctree.EJCTree#getObjectId <em>Object Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Id</em>' attribute.
	 * @see #getObjectId()
	 * @generated
	 */
	void setObjectId(String value);
} // EJCTree
