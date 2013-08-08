/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.streamdesc.util;

import org.eclectic.streamdesc.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclectic.streamdesc.StreamdescPackage
 * @generated
 */
public class StreamdescSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StreamdescPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamdescSwitch() {
		if (modelPackage == null) {
			modelPackage = StreamdescPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case StreamdescPackage.STREAM_DESCRIPTION: {
				StreamDescription streamDescription = (StreamDescription)theEObject;
				T result = caseStreamDescription(streamDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StreamdescPackage.SLIDING_WINDOW: {
				SlidingWindow slidingWindow = (SlidingWindow)theEObject;
				T result = caseSlidingWindow(slidingWindow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StreamdescPackage.ELEMENT_SLIDING_WINDOW: {
				ElementSlidingWindow elementSlidingWindow = (ElementSlidingWindow)theEObject;
				T result = caseElementSlidingWindow(elementSlidingWindow);
				if (result == null) result = caseSlidingWindow(elementSlidingWindow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StreamdescPackage.TIME_SLIDING_WINDOW: {
				TimeSlidingWindow timeSlidingWindow = (TimeSlidingWindow)theEObject;
				T result = caseTimeSlidingWindow(timeSlidingWindow);
				if (result == null) result = caseSlidingWindow(timeSlidingWindow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StreamdescPackage.KEY_SPEC: {
				KeySpec keySpec = (KeySpec)theEObject;
				T result = caseKeySpec(keySpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stream Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stream Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStreamDescription(StreamDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sliding Window</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sliding Window</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlidingWindow(SlidingWindow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Sliding Window</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Sliding Window</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementSlidingWindow(ElementSlidingWindow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Sliding Window</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Sliding Window</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeSlidingWindow(TimeSlidingWindow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeySpec(KeySpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //StreamdescSwitch
