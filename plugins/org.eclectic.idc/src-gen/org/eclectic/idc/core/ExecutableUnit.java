/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.core;

import org.eclectic.idc.scheduling.ExecutionPlan;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Executable Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.idc.core.ExecutableUnit#getPre <em>Pre</em>}</li>
 *   <li>{@link org.eclectic.idc.core.ExecutableUnit#getPost <em>Post</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.idc.core.CorePackage#getExecutableUnit()
 * @model abstract="true"
 * @generated
 */
public interface ExecutableUnit extends CodeUnit {
	/**
	 * Returns the value of the '<em><b>Pre</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre</em>' reference.
	 * @see #setPre(NormalFunction)
	 * @see org.eclectic.idc.core.CorePackage#getExecutableUnit_Pre()
	 * @model
	 * @generated
	 */
	NormalFunction getPre();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.core.ExecutableUnit#getPre <em>Pre</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre</em>' reference.
	 * @see #getPre()
	 * @generated
	 */
	void setPre(NormalFunction value);

	/**
	 * Returns the value of the '<em><b>Post</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post</em>' reference.
	 * @see #setPost(NormalFunction)
	 * @see org.eclectic.idc.core.CorePackage#getExecutableUnit_Post()
	 * @model
	 * @generated
	 */
	NormalFunction getPost();

	/**
	 * Sets the value of the '{@link org.eclectic.idc.core.ExecutableUnit#getPost <em>Post</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post</em>' reference.
	 * @see #getPost()
	 * @generated
	 */
	void setPost(NormalFunction value);

} // ExecutableUnit
