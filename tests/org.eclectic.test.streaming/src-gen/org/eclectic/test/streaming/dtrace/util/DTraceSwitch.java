/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.test.streaming.dtrace.util;

import org.eclectic.test.streaming.dtrace.Classifier;
import org.eclectic.test.streaming.dtrace.DTracePackage;
import org.eclectic.test.streaming.dtrace.ExecutionStatement;
import org.eclectic.test.streaming.dtrace.Instance;
import org.eclectic.test.streaming.dtrace.LocalExecution;
import org.eclectic.test.streaming.dtrace.LocalInstance;
import org.eclectic.test.streaming.dtrace.MethodExecution;
import org.eclectic.test.streaming.dtrace.RemoteCall;
import org.eclectic.test.streaming.dtrace.RemoteInstance;

import org.eclectic.test.streaming.dtrace.RemoteMethodExecution;
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
 * @see org.eclectic.test.streaming.dtrace.DTracePackage
 * @generated
 */
public class DTraceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DTracePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTraceSwitch() {
		if (modelPackage == null) {
			modelPackage = DTracePackage.eINSTANCE;
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
			case DTracePackage.EXECUTION_STATEMENT: {
				ExecutionStatement executionStatement = (ExecutionStatement)theEObject;
				T result = caseExecutionStatement(executionStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DTracePackage.METHOD_EXECUTION: {
				MethodExecution methodExecution = (MethodExecution)theEObject;
				T result = caseMethodExecution(methodExecution);
				if (result == null) result = caseExecutionStatement(methodExecution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DTracePackage.LOCAL_EXECUTION: {
				LocalExecution localExecution = (LocalExecution)theEObject;
				T result = caseLocalExecution(localExecution);
				if (result == null) result = caseMethodExecution(localExecution);
				if (result == null) result = caseExecutionStatement(localExecution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DTracePackage.REMOTE_CALL: {
				RemoteCall remoteCall = (RemoteCall)theEObject;
				T result = caseRemoteCall(remoteCall);
				if (result == null) result = caseMethodExecution(remoteCall);
				if (result == null) result = caseExecutionStatement(remoteCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DTracePackage.REMOTE_METHOD_EXECUTION: {
				RemoteMethodExecution remoteMethodExecution = (RemoteMethodExecution)theEObject;
				T result = caseRemoteMethodExecution(remoteMethodExecution);
				if (result == null) result = caseMethodExecution(remoteMethodExecution);
				if (result == null) result = caseExecutionStatement(remoteMethodExecution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DTracePackage.CLASSIFIER: {
				Classifier classifier = (Classifier)theEObject;
				T result = caseClassifier(classifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DTracePackage.INSTANCE: {
				Instance instance = (Instance)theEObject;
				T result = caseInstance(instance);
				if (result == null) result = caseClassifier(instance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DTracePackage.LOCAL_INSTANCE: {
				LocalInstance localInstance = (LocalInstance)theEObject;
				T result = caseLocalInstance(localInstance);
				if (result == null) result = caseInstance(localInstance);
				if (result == null) result = caseClassifier(localInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DTracePackage.REMOTE_INSTANCE: {
				RemoteInstance remoteInstance = (RemoteInstance)theEObject;
				T result = caseRemoteInstance(remoteInstance);
				if (result == null) result = caseInstance(remoteInstance);
				if (result == null) result = caseClassifier(remoteInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DTracePackage.CLASS: {
				org.eclectic.test.streaming.dtrace.Class class_ = (org.eclectic.test.streaming.dtrace.Class)theEObject;
				T result = caseClass(class_);
				if (result == null) result = caseClassifier(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionStatement(ExecutionStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Execution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Execution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodExecution(MethodExecution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Execution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Execution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalExecution(LocalExecution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remote Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remote Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoteCall(RemoteCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remote Method Execution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remote Method Execution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoteMethodExecution(RemoteMethodExecution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifier(Classifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstance(Instance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalInstance(LocalInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remote Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remote Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoteInstance(RemoteInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(org.eclectic.test.streaming.dtrace.Class object) {
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

} //DTraceSwitch
