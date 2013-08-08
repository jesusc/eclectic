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
 * A representation of the model object '<em><b>Attribute2 Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.mappings.Attribute2Attribute#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.Attribute2Attribute#getContext <em>Context</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.Attribute2Attribute#getRight <em>Right</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.Attribute2Attribute#getModifiers <em>Modifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.mappings.MappingsPackage#getAttribute2Attribute()
 * @model
 * @generated
 */
public interface Attribute2Attribute extends Feature2Feature, AttributeRightPart {
	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclectic.frontend.mappings.MappingCardinality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see org.eclectic.frontend.mappings.MappingCardinality
	 * @see #setCardinality(MappingCardinality)
	 * @see org.eclectic.frontend.mappings.MappingsPackage#getAttribute2Attribute_Cardinality()
	 * @model required="true"
	 * @generated
	 */
	MappingCardinality getCardinality();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.mappings.Attribute2Attribute#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see org.eclectic.frontend.mappings.MappingCardinality
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(MappingCardinality value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclectic.frontend.mappings.Class2Class#getScopedAttributes <em>Scoped Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' container reference.
	 * @see #setContext(Class2Class)
	 * @see org.eclectic.frontend.mappings.MappingsPackage#getAttribute2Attribute_Context()
	 * @see org.eclectic.frontend.mappings.Class2Class#getScopedAttributes
	 * @model opposite="scopedAttributes" transient="false"
	 * @generated
	 */
	Class2Class getContext();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.mappings.Attribute2Attribute#getContext <em>Context</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' container reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Class2Class value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.mappings.AttributeRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference list.
	 * @see org.eclectic.frontend.mappings.MappingsPackage#getAttribute2Attribute_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AttributeRef> getRight();

	/**
	 * Returns the value of the '<em><b>Modifiers</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.mappings.AttributeModifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modifiers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifiers</em>' containment reference list.
	 * @see org.eclectic.frontend.mappings.MappingsPackage#getAttribute2Attribute_Modifiers()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeModifier> getModifiers();

} // Attribute2Attribute
