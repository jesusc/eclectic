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
 * A representation of the model object '<em><b>Reference2 Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.mappings.Reference2Reference#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.Reference2Reference#getLeft <em>Left</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.Reference2Reference#getRight <em>Right</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.Reference2Reference#getResolverName <em>Resolver Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.mappings.MappingsPackage#getReference2Reference()
 * @model
 * @generated
 */
public interface Reference2Reference extends Feature2Feature {
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
	 * @see org.eclectic.frontend.mappings.MappingsPackage#getReference2Reference_Cardinality()
	 * @model required="true"
	 * @generated
	 */
	MappingCardinality getCardinality();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.mappings.Reference2Reference#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see org.eclectic.frontend.mappings.MappingCardinality
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(MappingCardinality value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.mappings.ReferenceRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference list.
	 * @see org.eclectic.frontend.mappings.MappingsPackage#getReference2Reference_Left()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReferenceRef> getLeft();

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.mappings.ReferenceRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference list.
	 * @see org.eclectic.frontend.mappings.MappingsPackage#getReference2Reference_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ReferenceRef> getRight();

	/**
	 * Returns the value of the '<em><b>Resolver Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolver Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolver Name</em>' attribute.
	 * @see #setResolverName(String)
	 * @see org.eclectic.frontend.mappings.MappingsPackage#getReference2Reference_ResolverName()
	 * @model
	 * @generated
	 */
	String getResolverName();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.mappings.Reference2Reference#getResolverName <em>Resolver Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolver Name</em>' attribute.
	 * @see #getResolverName()
	 * @generated
	 */
	void setResolverName(String value);

} // Reference2Reference
