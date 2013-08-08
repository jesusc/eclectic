/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.mappings;

import org.eclectic.frontend.core.ClassUse;
import org.eclectic.frontend.core.LocatedElement;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.mappings.Context#getLeft <em>Left</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.Context#getRight <em>Right</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.Context#getMappings <em>Mappings</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.Context#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.Context#getSections <em>Sections</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.Context#getTags <em>Tags</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.mappings.MappingsPackage#getContext()
 * @model
 * @generated
 */
public interface Context extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.mappings.MatchedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference list.
	 * @see org.eclectic.frontend.mappings.MappingsPackage#getContext_Left()
	 * @model containment="true"
	 * @generated
	 */
	EList<MatchedElement> getLeft();

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.mappings.MatchedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference list.
	 * @see org.eclectic.frontend.mappings.MappingsPackage#getContext_Right()
	 * @model containment="true"
	 * @generated
	 */
	EList<MatchedElement> getRight();

	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.mappings.MappingElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mappings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappings</em>' containment reference list.
	 * @see org.eclectic.frontend.mappings.MappingsPackage#getContext_Mappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<MappingElement> getMappings();

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
	 * @see org.eclectic.frontend.mappings.MappingsPackage#getContext_Modifiers()
	 * @model containment="true"
	 * @generated
	 */
	EList<C2CModifier> getModifiers();

	/**
	 * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.mappings.Section}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sections</em>' containment reference list.
	 * @see org.eclectic.frontend.mappings.MappingsPackage#getContext_Sections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Section> getSections();

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.mappings.Tag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tags</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference list.
	 * @see org.eclectic.frontend.mappings.MappingsPackage#getContext_Tags()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tag> getTags();

} // Context
