/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.chain;

import org.eclectic.frontend.core.TransformationDefinition;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.chain.CompositeTransformation#getExecutions <em>Executions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.chain.ChainPackage#getCompositeTransformation()
 * @model
 * @generated
 */
public interface CompositeTransformation extends AvailableTransformation, TransformationDefinition {
	/**
	 * Returns the value of the '<em><b>Executions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.chain.TransformationExecution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executions</em>' containment reference list.
	 * @see org.eclectic.frontend.chain.ChainPackage#getCompositeTransformation_Executions()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransformationExecution> getExecutions();

} // CompositeTransformation
