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
 * A representation of the model object '<em><b>Class2 Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.mappings.Class2Class#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.Class2Class#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.Class2Class#getLeft <em>Left</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.Class2Class#getRight <em>Right</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.Class2Class#getScopedAttributes <em>Scoped Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.mappings.MappingsPackage#getClass2Class()
 * @model
 * @generated
 */
public interface Class2Class extends ClassMapping {
	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * The default value is <code>"0"</code>.
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
	 * @see org.eclectic.frontend.mappings.MappingsPackage#getClass2Class_Cardinality()
	 * @model default="0" required="true"
	 * @generated
	 */
	MappingCardinality getCardinality();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.mappings.Class2Class#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see org.eclectic.frontend.mappings.MappingCardinality
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(MappingCardinality value);

	/**
	 * Returns the value of the '<em><b>Modifiers</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.mappings.C2CModifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modifiers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifiers</em>' containment reference list.
	 * @see org.eclectic.frontend.mappings.MappingsPackage#getClass2Class_Modifiers()
	 * @model containment="true"
	 * @generated
	 */
	EList<C2CModifier> getModifiers();

	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.mappings.ClassRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference list.
	 * @see org.eclectic.frontend.mappings.MappingsPackage#getClass2Class_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ClassRef> getLeft();

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.mappings.ClassRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference list.
	 * @see org.eclectic.frontend.mappings.MappingsPackage#getClass2Class_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ClassRef> getRight();

	/**
	 * Returns the value of the '<em><b>Scoped Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.mappings.Attribute2Attribute}.
	 * It is bidirectional and its opposite is '{@link org.eclectic.frontend.mappings.Attribute2Attribute#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scoped Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scoped Attributes</em>' containment reference list.
	 * @see org.eclectic.frontend.mappings.MappingsPackage#getClass2Class_ScopedAttributes()
	 * @see org.eclectic.frontend.mappings.Attribute2Attribute#getContext
	 * @model opposite="context" containment="true"
	 * @generated
	 */
	EList<Attribute2Attribute> getScopedAttributes();

} // Class2Class
