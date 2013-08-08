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
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclectic.test.streaming.dtrace.DTracePackage
 * @generated
 */
public class DTraceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DTracePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTraceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DTracePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DTraceSwitch<Adapter> modelSwitch =
		new DTraceSwitch<Adapter>() {
			@Override
			public Adapter caseExecutionStatement(ExecutionStatement object) {
				return createExecutionStatementAdapter();
			}
			@Override
			public Adapter caseMethodExecution(MethodExecution object) {
				return createMethodExecutionAdapter();
			}
			@Override
			public Adapter caseLocalExecution(LocalExecution object) {
				return createLocalExecutionAdapter();
			}
			@Override
			public Adapter caseRemoteCall(RemoteCall object) {
				return createRemoteCallAdapter();
			}
			@Override
			public Adapter caseRemoteMethodExecution(RemoteMethodExecution object) {
				return createRemoteMethodExecutionAdapter();
			}
			@Override
			public Adapter caseClassifier(Classifier object) {
				return createClassifierAdapter();
			}
			@Override
			public Adapter caseInstance(Instance object) {
				return createInstanceAdapter();
			}
			@Override
			public Adapter caseLocalInstance(LocalInstance object) {
				return createLocalInstanceAdapter();
			}
			@Override
			public Adapter caseRemoteInstance(RemoteInstance object) {
				return createRemoteInstanceAdapter();
			}
			@Override
			public Adapter caseClass(org.eclectic.test.streaming.dtrace.Class object) {
				return createClassAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.test.streaming.dtrace.ExecutionStatement <em>Execution Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.test.streaming.dtrace.ExecutionStatement
	 * @generated
	 */
	public Adapter createExecutionStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.test.streaming.dtrace.MethodExecution <em>Method Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.test.streaming.dtrace.MethodExecution
	 * @generated
	 */
	public Adapter createMethodExecutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.test.streaming.dtrace.LocalExecution <em>Local Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.test.streaming.dtrace.LocalExecution
	 * @generated
	 */
	public Adapter createLocalExecutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.test.streaming.dtrace.RemoteCall <em>Remote Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.test.streaming.dtrace.RemoteCall
	 * @generated
	 */
	public Adapter createRemoteCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.test.streaming.dtrace.RemoteMethodExecution <em>Remote Method Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.test.streaming.dtrace.RemoteMethodExecution
	 * @generated
	 */
	public Adapter createRemoteMethodExecutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.test.streaming.dtrace.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.test.streaming.dtrace.Classifier
	 * @generated
	 */
	public Adapter createClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.test.streaming.dtrace.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.test.streaming.dtrace.Instance
	 * @generated
	 */
	public Adapter createInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.test.streaming.dtrace.LocalInstance <em>Local Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.test.streaming.dtrace.LocalInstance
	 * @generated
	 */
	public Adapter createLocalInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.test.streaming.dtrace.RemoteInstance <em>Remote Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.test.streaming.dtrace.RemoteInstance
	 * @generated
	 */
	public Adapter createRemoteInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclectic.test.streaming.dtrace.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclectic.test.streaming.dtrace.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DTraceAdapterFactory
