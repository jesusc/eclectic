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
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.chain.ChainTransformation#getComposites <em>Composites</em>}</li>
 *   <li>{@link org.eclectic.frontend.chain.ChainTransformation#getExternals <em>Externals</em>}</li>
 *   <li>{@link org.eclectic.frontend.chain.ChainTransformation#getGeneratedModels <em>Generated Models</em>}</li>
 *   <li>{@link org.eclectic.frontend.chain.ChainTransformation#getExecutions <em>Executions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.chain.ChainPackage#getChainTransformation()
 * @model
 * @generated
 */
public interface ChainTransformation extends TransformationDefinition {
	/**
	 * Returns the value of the '<em><b>Composites</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.chain.CompositeTransformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composites</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composites</em>' containment reference list.
	 * @see org.eclectic.frontend.chain.ChainPackage#getChainTransformation_Composites()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompositeTransformation> getComposites();

	/**
	 * Returns the value of the '<em><b>Externals</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.chain.ExternalTransformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Externals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Externals</em>' containment reference list.
	 * @see org.eclectic.frontend.chain.ChainPackage#getChainTransformation_Externals()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExternalTransformation> getExternals();

	/**
	 * Returns the value of the '<em><b>Generated Models</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.chain.GeneratedModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generated Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Models</em>' containment reference list.
	 * @see org.eclectic.frontend.chain.ChainPackage#getChainTransformation_GeneratedModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<GeneratedModel> getGeneratedModels();

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
	 * @see org.eclectic.frontend.chain.ChainPackage#getChainTransformation_Executions()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransformationExecution> getExecutions();

} // ChainTransformation
