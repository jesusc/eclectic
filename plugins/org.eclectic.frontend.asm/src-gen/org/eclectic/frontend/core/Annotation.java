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
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.frontend.core.Annotation#getAnnotatedElement <em>Annotated Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.frontend.core.CorePackage#getAnnotation()
 * @model abstract="true"
 * @generated
 */
public interface Annotation extends EObject {

	/**
	 * Returns the value of the '<em><b>Annotated Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclectic.frontend.core.AnnotableElement#getAnnotatedWith <em>Annotated With</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotated Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotated Element</em>' reference.
	 * @see #setAnnotatedElement(AnnotableElement)
	 * @see org.eclectic.frontend.core.CorePackage#getAnnotation_AnnotatedElement()
	 * @see org.eclectic.frontend.core.AnnotableElement#getAnnotatedWith
	 * @model opposite="annotatedWith"
	 * @generated
	 */
	AnnotableElement getAnnotatedElement();

	/**
	 * Sets the value of the '{@link org.eclectic.frontend.core.Annotation#getAnnotatedElement <em>Annotated Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotated Element</em>' reference.
	 * @see #getAnnotatedElement()
	 * @generated
	 */
	void setAnnotatedElement(AnnotableElement value);

} // Annotation
