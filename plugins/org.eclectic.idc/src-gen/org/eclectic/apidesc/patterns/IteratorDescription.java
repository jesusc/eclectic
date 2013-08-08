/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.apidesc.patterns;

import org.eclectic.apidesc.DeclaredElement;
import org.eclectic.apidesc.Method;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iterator Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.apidesc.patterns.IteratorDescription#getIteratorClass <em>Iterator Class</em>}</li>
 *   <li>{@link org.eclectic.apidesc.patterns.IteratorDescription#getHasFinished <em>Has Finished</em>}</li>
 *   <li>{@link org.eclectic.apidesc.patterns.IteratorDescription#getNextElement <em>Next Element</em>}</li>
 *   <li>{@link org.eclectic.apidesc.patterns.IteratorDescription#getCurrentElement <em>Current Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.apidesc.patterns.PatternsPackage#getIteratorDescription()
 * @model
 * @generated
 */
public interface IteratorDescription extends DeclaredElement {
	/**
	 * Returns the value of the '<em><b>Iterator Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iterator Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterator Class</em>' attribute.
	 * @see #setIteratorClass(String)
	 * @see org.eclectic.apidesc.patterns.PatternsPackage#getIteratorDescription_IteratorClass()
	 * @model
	 * @generated
	 */
	String getIteratorClass();

	/**
	 * Sets the value of the '{@link org.eclectic.apidesc.patterns.IteratorDescription#getIteratorClass <em>Iterator Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iterator Class</em>' attribute.
	 * @see #getIteratorClass()
	 * @generated
	 */
	void setIteratorClass(String value);

	/**
	 * Returns the value of the '<em><b>Has Finished</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Finished</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Finished</em>' containment reference.
	 * @see #setHasFinished(Method)
	 * @see org.eclectic.apidesc.patterns.PatternsPackage#getIteratorDescription_HasFinished()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Method getHasFinished();

	/**
	 * Sets the value of the '{@link org.eclectic.apidesc.patterns.IteratorDescription#getHasFinished <em>Has Finished</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Finished</em>' containment reference.
	 * @see #getHasFinished()
	 * @generated
	 */
	void setHasFinished(Method value);

	/**
	 * Returns the value of the '<em><b>Next Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Element</em>' containment reference.
	 * @see #setNextElement(Method)
	 * @see org.eclectic.apidesc.patterns.PatternsPackage#getIteratorDescription_NextElement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Method getNextElement();

	/**
	 * Sets the value of the '{@link org.eclectic.apidesc.patterns.IteratorDescription#getNextElement <em>Next Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Element</em>' containment reference.
	 * @see #getNextElement()
	 * @generated
	 */
	void setNextElement(Method value);

	/**
	 * Returns the value of the '<em><b>Current Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Element</em>' containment reference.
	 * @see #setCurrentElement(Method)
	 * @see org.eclectic.apidesc.patterns.PatternsPackage#getIteratorDescription_CurrentElement()
	 * @model containment="true"
	 * @generated
	 */
	Method getCurrentElement();

	/**
	 * Sets the value of the '{@link org.eclectic.apidesc.patterns.IteratorDescription#getCurrentElement <em>Current Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Element</em>' containment reference.
	 * @see #getCurrentElement()
	 * @generated
	 */
	void setCurrentElement(Method value);

} // IteratorDescription
