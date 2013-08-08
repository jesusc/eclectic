/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.mappings;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.mappings.AttributeMapping#getLeft <em>Left</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.AttributeMapping#getRightPart <em>Right Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.mappings.MappingsPackage#getAttributeMapping()
 * @model
 * @generated
 */
public interface AttributeMapping extends Feature2Feature {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.mappings.AttributeRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference list.
	 * @see org.eclectic.frontend.mappings.MappingsPackage#getAttributeMapping_Left()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeRef> getLeft();

	/**
	 * Returns the value of the '<em><b>Right Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Part</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Part</em>' containment reference.
	 * @see #setRightPart(AttributeRightPart)
	 * @see org.eclectic.frontend.mappings.MappingsPackage#getAttributeMapping_RightPart()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AttributeRightPart getRightPart();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.mappings.AttributeMapping#getRightPart <em>Right Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Part</em>' containment reference.
	 * @see #getRightPart()
	 * @generated
	 */
	void setRightPart(AttributeRightPart value);

} // AttributeMapping
