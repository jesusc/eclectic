/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.mappings;

import org.eclectic.frontend.core.TransformationDefinition;
import org.eclectic.frontend.core.TransformationDefinitionParameter;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.mappings.MappingTransformation#getDelegates <em>Delegates</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.MappingTransformation#getContexts <em>Contexts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.mappings.MappingsPackage#getMappingTransformation()
 * @model
 * @generated
 */
public interface MappingTransformation extends TransformationDefinition {
	/**
	 * Returns the value of the '<em><b>Delegates</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.mappings.Delegate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegates</em>' containment reference list.
	 * @see org.eclectic.frontend.mappings.MappingsPackage#getMappingTransformation_Delegates()
	 * @model containment="true"
	 * @generated
	 */
	EList<Delegate> getDelegates();

	/**
	 * Returns the value of the '<em><b>Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.mappings.Context}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contexts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contexts</em>' containment reference list.
	 * @see org.eclectic.frontend.mappings.MappingsPackage#getMappingTransformation_Contexts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Context> getContexts();

} // MappingTransformation
