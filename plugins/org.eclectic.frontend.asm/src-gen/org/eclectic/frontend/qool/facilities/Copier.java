/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.qool.facilities;

import org.eclectic.frontend.core.Expression;
import org.eclectic.frontend.core.TransformationDefinitionParameter;
import org.eclectic.frontend.core.Statement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Copier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.qool.facilities.Copier#getObjects <em>Objects</em>}</li>
 *   <li>{@link org.eclectic.frontend.qool.facilities.Copier#getCallbacks <em>Callbacks</em>}</li>
 *   <li>{@link org.eclectic.frontend.qool.facilities.Copier#getCopyInModel <em>Copy In Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.qool.facilities.FacilitiesPackage#getCopier()
 * @model
 * @generated
 */
public interface Copier extends Expression {
	/**
	 * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.core.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects</em>' containment reference list.
	 * @see org.eclectic.frontend.qool.facilities.FacilitiesPackage#getCopier_Objects()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getObjects();

	/**
	 * Returns the value of the '<em><b>Callbacks</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.qool.facilities.CopierCallbackDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callbacks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callbacks</em>' containment reference list.
	 * @see org.eclectic.frontend.qool.facilities.FacilitiesPackage#getCopier_Callbacks()
	 * @model containment="true"
	 * @generated
	 */
	EList<CopierCallbackDefinition> getCallbacks();

	/**
	 * Returns the value of the '<em><b>Copy In Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copy In Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copy In Model</em>' reference.
	 * @see #setCopyInModel(TransformationDefinitionParameter)
	 * @see org.eclectic.frontend.qool.facilities.FacilitiesPackage#getCopier_CopyInModel()
	 * @model required="true"
	 * @generated
	 */
	TransformationDefinitionParameter getCopyInModel();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.qool.facilities.Copier#getCopyInModel <em>Copy In Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy In Model</em>' reference.
	 * @see #getCopyInModel()
	 * @generated
	 */
	void setCopyInModel(TransformationDefinitionParameter value);

} // Copier
