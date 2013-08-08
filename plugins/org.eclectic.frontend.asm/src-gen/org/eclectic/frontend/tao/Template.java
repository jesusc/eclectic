/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.tao;

import org.eclectic.frontend.core.LocatedElement;
import org.eclectic.frontend.core.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.tao.Template#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclectic.frontend.tao.Template#getRoots <em>Roots</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.tao.TaoPackage#getTemplate()
 * @model
 * @generated
 */
public interface Template extends NamedElement, LocatedElement {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.tao.TemplateParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.eclectic.frontend.tao.TaoPackage#getTemplate_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<TemplateParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Roots</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclectic.frontend.tao.TemplateRootObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roots</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roots</em>' containment reference list.
	 * @see org.eclectic.frontend.tao.TaoPackage#getTemplate_Roots()
	 * @model containment="true"
	 * @generated
	 */
	EList<TemplateRootObject> getRoots();

} // Template
