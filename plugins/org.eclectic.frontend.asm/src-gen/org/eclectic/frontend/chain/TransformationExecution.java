/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.chain;

import org.eclectic.frontend.core.LocatedElement;
import org.eclectic.frontend.core.RepresentModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.chain.TransformationExecution#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link org.eclectic.frontend.chain.TransformationExecution#getInputModels <em>Input Models</em>}</li>
 *   <li>{@link org.eclectic.frontend.chain.TransformationExecution#getOutputModels <em>Output Models</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.chain.ChainPackage#getTransformationExecution()
 * @model
 * @generated
 */
public interface TransformationExecution extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation</em>' reference.
	 * @see #setTransformation(AvailableTransformation)
	 * @see org.eclectic.frontend.chain.ChainPackage#getTransformationExecution_Transformation()
	 * @model required="true"
	 * @generated
	 */
	AvailableTransformation getTransformation();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.chain.TransformationExecution#getTransformation <em>Transformation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' reference.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(AvailableTransformation value);

	/**
	 * Returns the value of the '<em><b>Input Models</b></em>' reference list.
	 * The list contents are of type {@link org.eclectic.frontend.core.RepresentModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Models</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Models</em>' reference list.
	 * @see org.eclectic.frontend.chain.ChainPackage#getTransformationExecution_InputModels()
	 * @model
	 * @generated
	 */
	EList<RepresentModel> getInputModels();

	/**
	 * Returns the value of the '<em><b>Output Models</b></em>' reference list.
	 * The list contents are of type {@link org.eclectic.frontend.core.RepresentModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Models</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Models</em>' reference list.
	 * @see org.eclectic.frontend.chain.ChainPackage#getTransformationExecution_OutputModels()
	 * @model
	 * @generated
	 */
	EList<RepresentModel> getOutputModels();

} // TransformationExecution
