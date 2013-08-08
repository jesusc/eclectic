/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.apidesc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.apidesc.Method#getName <em>Name</em>}</li>
 *   <li>{@link org.eclectic.apidesc.Method#getParameterTypes <em>Parameter Types</em>}</li>
 *   <li>{@link org.eclectic.apidesc.Method#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.eclectic.apidesc.Method#getReturnVoid <em>Return Void</em>}</li>
 *   <li>{@link org.eclectic.apidesc.Method#getReturnArray <em>Return Array</em>}</li>
 *   <li>{@link org.eclectic.apidesc.Method#getReturnCollection <em>Return Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.apidesc.ApidescPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends EObject {
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
	 * @see org.eclectic.apidesc.ApidescPackage#getMethod_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclectic.apidesc.Method#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parameter Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Types</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Types</em>' attribute list.
	 * @see org.eclectic.apidesc.ApidescPackage#getMethod_ParameterTypes()
	 * @model
	 * @generated
	 */
	EList<String> getParameterTypes();

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' attribute.
	 * @see #setReturnType(String)
	 * @see org.eclectic.apidesc.ApidescPackage#getMethod_ReturnType()
	 * @model
	 * @generated
	 */
	String getReturnType();

	/**
	 * Sets the value of the '{@link org.eclectic.apidesc.Method#getReturnType <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' attribute.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(String value);

	/**
	 * Returns the value of the '<em><b>Return Void</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Void</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Void</em>' attribute.
	 * @see #setReturnVoid(Boolean)
	 * @see org.eclectic.apidesc.ApidescPackage#getMethod_ReturnVoid()
	 * @model default="false" required="true"
	 * @generated
	 */
	Boolean getReturnVoid();

	/**
	 * Sets the value of the '{@link org.eclectic.apidesc.Method#getReturnVoid <em>Return Void</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Void</em>' attribute.
	 * @see #getReturnVoid()
	 * @generated
	 */
	void setReturnVoid(Boolean value);

	/**
	 * Returns the value of the '<em><b>Return Array</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Array</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Array</em>' attribute.
	 * @see #setReturnArray(Boolean)
	 * @see org.eclectic.apidesc.ApidescPackage#getMethod_ReturnArray()
	 * @model default="false" required="true"
	 * @generated
	 */
	Boolean getReturnArray();

	/**
	 * Sets the value of the '{@link org.eclectic.apidesc.Method#getReturnArray <em>Return Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Array</em>' attribute.
	 * @see #getReturnArray()
	 * @generated
	 */
	void setReturnArray(Boolean value);

	/**
	 * Returns the value of the '<em><b>Return Collection</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Collection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Collection</em>' attribute.
	 * @see #setReturnCollection(Boolean)
	 * @see org.eclectic.apidesc.ApidescPackage#getMethod_ReturnCollection()
	 * @model default="false" required="true"
	 * @generated
	 */
	Boolean getReturnCollection();

	/**
	 * Sets the value of the '{@link org.eclectic.apidesc.Method#getReturnCollection <em>Return Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Collection</em>' attribute.
	 * @see #getReturnCollection()
	 * @generated
	 */
	void setReturnCollection(Boolean value);

} // Method
