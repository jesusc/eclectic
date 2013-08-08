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
 * A representation of the model object '<em><b>Join</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.mappings.Join#getMappings <em>Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.mappings.MappingsPackage#getJoin()
 * @model
 * @generated
 */
public interface Join extends Operator {
	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.mappings.ClassMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappings</em>' containment reference list.
	 * @see org.eclectic.frontend.mappings.MappingsPackage#getJoin_Mappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassMapping> getMappings();

} // Join
