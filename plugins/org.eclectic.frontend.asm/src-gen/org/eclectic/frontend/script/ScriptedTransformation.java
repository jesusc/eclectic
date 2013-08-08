/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.script;

import org.eclectic.frontend.core.Statement;
import org.eclectic.frontend.core.TransformationDefinition;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scripted Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.script.ScriptedTransformation#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.script.ScriptPackage#getScriptedTransformation()
 * @model
 * @generated
 */
public interface ScriptedTransformation extends TransformationDefinition {
	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.core.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see org.eclectic.frontend.script.ScriptPackage#getScriptedTransformation_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatements();

} // ScriptedTransformation
