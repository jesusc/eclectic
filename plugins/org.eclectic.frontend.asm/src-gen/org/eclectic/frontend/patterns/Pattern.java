/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.patterns;

import org.eclectic.frontend.core.LocatedElement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclectic.frontend.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.patterns.Pattern#getName <em>Name</em>}</li>
 *   <li>{@link org.eclectic.frontend.patterns.Pattern#getObjects <em>Objects</em>}</li>
 *   <li>{@link org.eclectic.frontend.patterns.Pattern#getOutputVariables <em>Output Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.patterns.PatternsPackage#getPattern()
 * @model
 * @generated
 */
public interface Pattern extends LocatedElement {
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
	 * @see org.eclectic.frontend.patterns.PatternsPackage#getPattern_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.patterns.Pattern#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.patterns.PObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects</em>' containment reference list.
	 * @see org.eclectic.frontend.patterns.PatternsPackage#getPattern_Objects()
	 * @model containment="true"
	 * @generated
	 */
	EList<PObject> getObjects();

	/**
	 * Returns the value of the '<em><b>Output Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.patterns.POutputVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Variables</em>' containment reference list.
	 * @see org.eclectic.frontend.patterns.PatternsPackage#getPattern_OutputVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<POutputVariable> getOutputVariables();

} // Pattern
