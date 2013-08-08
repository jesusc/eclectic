/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.core.AnnotableElement#getAnnotatedWith <em>Annotated With</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.core.CorePackage#getAnnotableElement()
 * @model abstract="true"
 * @generated
 */
public interface AnnotableElement extends EObject {

	/**
	 * Returns the value of the '<em><b>Annotated With</b></em>' reference list.
	 * The list contents are of type {@link org.eclectic.frontend.core.Annotation}.
	 * It is bidirectional and its opposite is '{@link org.eclectic.frontend.core.Annotation#getAnnotatedElement <em>Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotated With</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotated With</em>' reference list.
	 * @see org.eclectic.frontend.core.CorePackage#getAnnotableElement_AnnotatedWith()
	 * @see org.eclectic.frontend.core.Annotation#getAnnotatedElement
	 * @model opposite="annotatedElement"
	 * @generated
	 */
	EList<Annotation> getAnnotatedWith();

} // AnnotableElement
