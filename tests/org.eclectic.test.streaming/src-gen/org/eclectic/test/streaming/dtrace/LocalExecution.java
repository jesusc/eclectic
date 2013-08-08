/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.test.streaming.dtrace;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.test.streaming.dtrace.LocalExecution#isIsCreate <em>Is Create</em>}</li>
 *   <li>{@link org.eclectic.test.streaming.dtrace.LocalExecution#isIsDestroy <em>Is Destroy</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.test.streaming.dtrace.DTracePackage#getLocalExecution()
 * @model
 * @generated
 */
public interface LocalExecution extends MethodExecution {
	/**
	 * Returns the value of the '<em><b>Is Create</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Create</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Create</em>' attribute.
	 * @see #setIsCreate(boolean)
	 * @see org.eclectic.test.streaming.dtrace.DTracePackage#getLocalExecution_IsCreate()
	 * @model
	 * @generated
	 */
	boolean isIsCreate();

	/**
	 * Sets the value of the '{@link org.eclectic.test.streaming.dtrace.LocalExecution#isIsCreate <em>Is Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Create</em>' attribute.
	 * @see #isIsCreate()
	 * @generated
	 */
	void setIsCreate(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Destroy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Destroy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Destroy</em>' attribute.
	 * @see #setIsDestroy(boolean)
	 * @see org.eclectic.test.streaming.dtrace.DTracePackage#getLocalExecution_IsDestroy()
	 * @model
	 * @generated
	 */
	boolean isIsDestroy();

	/**
	 * Sets the value of the '{@link org.eclectic.test.streaming.dtrace.LocalExecution#isIsDestroy <em>Is Destroy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Destroy</em>' attribute.
	 * @see #isIsDestroy()
	 * @generated
	 */
	void setIsDestroy(boolean value);

} // LocalExecution
