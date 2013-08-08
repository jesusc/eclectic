/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.test.streaming.dtrace;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.test.streaming.dtrace.MethodExecution#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link org.eclectic.test.streaming.dtrace.MethodExecution#getDebugId <em>Debug Id</em>}</li>
 *   <li>{@link org.eclectic.test.streaming.dtrace.MethodExecution#getCaller <em>Caller</em>}</li>
 *   <li>{@link org.eclectic.test.streaming.dtrace.MethodExecution#getCallee <em>Callee</em>}</li>
 *   <li>{@link org.eclectic.test.streaming.dtrace.MethodExecution#getReceptor <em>Receptor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.test.streaming.dtrace.DTracePackage#getMethodExecution()
 * @model abstract="true"
 * @generated
 */
public interface MethodExecution extends ExecutionStatement {
	/**
	 * Returns the value of the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Name</em>' attribute.
	 * @see #setMethodName(String)
	 * @see org.eclectic.test.streaming.dtrace.DTracePackage#getMethodExecution_MethodName()
	 * @model required="true"
	 * @generated
	 */
	String getMethodName();

	/**
	 * Sets the value of the '{@link org.eclectic.test.streaming.dtrace.MethodExecution#getMethodName <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Name</em>' attribute.
	 * @see #getMethodName()
	 * @generated
	 */
	void setMethodName(String value);

	/**
	 * Returns the value of the '<em><b>Debug Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debug Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debug Id</em>' attribute.
	 * @see #setDebugId(String)
	 * @see org.eclectic.test.streaming.dtrace.DTracePackage#getMethodExecution_DebugId()
	 * @model
	 * @generated
	 */
	String getDebugId();

	/**
	 * Sets the value of the '{@link org.eclectic.test.streaming.dtrace.MethodExecution#getDebugId <em>Debug Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debug Id</em>' attribute.
	 * @see #getDebugId()
	 * @generated
	 */
	void setDebugId(String value);

	/**
	 * Returns the value of the '<em><b>Caller</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclectic.test.streaming.dtrace.MethodExecution#getCallee <em>Callee</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caller</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caller</em>' reference.
	 * @see #setCaller(MethodExecution)
	 * @see org.eclectic.test.streaming.dtrace.DTracePackage#getMethodExecution_Caller()
	 * @see org.eclectic.test.streaming.dtrace.MethodExecution#getCallee
	 * @model opposite="callee"
	 * @generated
	 */
	MethodExecution getCaller();

	/**
	 * Sets the value of the '{@link org.eclectic.test.streaming.dtrace.MethodExecution#getCaller <em>Caller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caller</em>' reference.
	 * @see #getCaller()
	 * @generated
	 */
	void setCaller(MethodExecution value);

	/**
	 * Returns the value of the '<em><b>Callee</b></em>' reference list.
	 * The list contents are of type {@link org.eclectic.test.streaming.dtrace.MethodExecution}.
	 * It is bidirectional and its opposite is '{@link org.eclectic.test.streaming.dtrace.MethodExecution#getCaller <em>Caller</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callee</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callee</em>' reference list.
	 * @see org.eclectic.test.streaming.dtrace.DTracePackage#getMethodExecution_Callee()
	 * @see org.eclectic.test.streaming.dtrace.MethodExecution#getCaller
	 * @model opposite="caller"
	 * @generated
	 */
	EList<MethodExecution> getCallee();

	/**
	 * Returns the value of the '<em><b>Receptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receptor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receptor</em>' reference.
	 * @see #setReceptor(Classifier)
	 * @see org.eclectic.test.streaming.dtrace.DTracePackage#getMethodExecution_Receptor()
	 * @model required="true"
	 * @generated
	 */
	Classifier getReceptor();

	/**
	 * Sets the value of the '{@link org.eclectic.test.streaming.dtrace.MethodExecution#getReceptor <em>Receptor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receptor</em>' reference.
	 * @see #getReceptor()
	 * @generated
	 */
	void setReceptor(Classifier value);

} // MethodExecution
