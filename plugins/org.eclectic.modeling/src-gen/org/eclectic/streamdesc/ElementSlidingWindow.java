/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.streamdesc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Sliding Window</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.streamdesc.ElementSlidingWindow#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.streamdesc.StreamdescPackage#getElementSlidingWindow()
 * @model
 * @generated
 */
public interface ElementSlidingWindow extends SlidingWindow {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' attribute.
	 * @see #setElements(int)
	 * @see org.eclectic.streamdesc.StreamdescPackage#getElementSlidingWindow_Elements()
	 * @model required="true"
	 * @generated
	 */
	int getElements();

	/**
	 * Sets the value of the '{@link org.eclectic.streamdesc.ElementSlidingWindow#getElements <em>Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elements</em>' attribute.
	 * @see #getElements()
	 * @generated
	 */
	void setElements(int value);

} // ElementSlidingWindow
