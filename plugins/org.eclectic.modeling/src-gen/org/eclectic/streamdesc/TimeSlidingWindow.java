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
 * A representation of the model object '<em><b>Time Sliding Window</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclectic.streamdesc.TimeSlidingWindow#getSeconds <em>Seconds</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclectic.streamdesc.StreamdescPackage#getTimeSlidingWindow()
 * @model
 * @generated
 */
public interface TimeSlidingWindow extends SlidingWindow {
	/**
	 * Returns the value of the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seconds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seconds</em>' attribute.
	 * @see #setSeconds(int)
	 * @see org.eclectic.streamdesc.StreamdescPackage#getTimeSlidingWindow_Seconds()
	 * @model required="true"
	 * @generated
	 */
	int getSeconds();

	/**
	 * Sets the value of the '{@link org.eclectic.streamdesc.TimeSlidingWindow#getSeconds <em>Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seconds</em>' attribute.
	 * @see #getSeconds()
	 * @generated
	 */
	void setSeconds(int value);

} // TimeSlidingWindow
