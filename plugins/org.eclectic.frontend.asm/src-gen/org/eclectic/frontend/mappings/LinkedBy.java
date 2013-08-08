/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.mappings;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linked By</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.mappings.LinkedBy#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.LinkedBy#getLinkedElement <em>Linked Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.mappings.MappingsPackage#getLinkedBy()
 * @model
 * @generated
 */
public interface LinkedBy extends C2CModifier {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference.
	 * @see #setAttribute(AttributeRef)
	 * @see org.eclectic.frontend.mappings.MappingsPackage#getLinkedBy_Attribute()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AttributeRef getAttribute();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.mappings.LinkedBy#getAttribute <em>Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' containment reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(AttributeRef value);

	/**
	 * Returns the value of the '<em><b>Linked Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linked Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked Element</em>' reference.
	 * @see #setLinkedElement(MatchedElement)
	 * @see org.eclectic.frontend.mappings.MappingsPackage#getLinkedBy_LinkedElement()
	 * @model required="true"
	 * @generated
	 */
	MatchedElement getLinkedElement();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.mappings.LinkedBy#getLinkedElement <em>Linked Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linked Element</em>' reference.
	 * @see #getLinkedElement()
	 * @generated
	 */
	void setLinkedElement(MatchedElement value);

} // LinkedBy
