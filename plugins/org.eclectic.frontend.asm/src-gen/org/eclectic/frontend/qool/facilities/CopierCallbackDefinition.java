/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.qool.facilities;

import org.eclectic.frontend.core.Expression;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Copier Callback Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.qool.facilities.CopierCallbackDefinition#isStop <em>Stop</em>}</li>
 *   <li>{@link org.eclectic.frontend.qool.facilities.CopierCallbackDefinition#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.eclectic.frontend.qool.facilities.CopierCallbackDefinition#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.qool.facilities.FacilitiesPackage#getCopierCallbackDefinition()
 * @model
 * @generated
 */
public interface CopierCallbackDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Stop</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stop</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop</em>' attribute.
	 * @see #setStop(boolean)
	 * @see org.eclectic.frontend.qool.facilities.FacilitiesPackage#getCopierCallbackDefinition_Stop()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isStop();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.qool.facilities.CopierCallbackDefinition#isStop <em>Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop</em>' attribute.
	 * @see #isStop()
	 * @generated
	 */
	void setStop(boolean value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' containment reference.
	 * @see #setTrigger(Expression)
	 * @see org.eclectic.frontend.qool.facilities.FacilitiesPackage#getCopierCallbackDefinition_Trigger()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getTrigger();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.qool.facilities.CopierCallbackDefinition#getTrigger <em>Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' containment reference.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(Expression value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(Expression)
	 * @see org.eclectic.frontend.qool.facilities.FacilitiesPackage#getCopierCallbackDefinition_Action()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getAction();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.qool.facilities.CopierCallbackDefinition#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Expression value);

} // CopierCallbackDefinition
