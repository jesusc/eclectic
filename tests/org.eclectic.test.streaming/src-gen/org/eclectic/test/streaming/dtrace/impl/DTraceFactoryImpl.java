/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.test.streaming.dtrace.impl;

import org.eclectic.test.streaming.dtrace.DTraceFactory;
import org.eclectic.test.streaming.dtrace.DTracePackage;
import org.eclectic.test.streaming.dtrace.LocalExecution;
import org.eclectic.test.streaming.dtrace.LocalInstance;
import org.eclectic.test.streaming.dtrace.RemoteCall;
import org.eclectic.test.streaming.dtrace.RemoteInstance;

import org.eclectic.test.streaming.dtrace.RemoteMethodExecution;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DTraceFactoryImpl extends EFactoryImpl implements DTraceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DTraceFactory init() {
		try {
			DTraceFactory theDTraceFactory = (DTraceFactory)EPackage.Registry.INSTANCE.getEFactory("http://eclectic.org/streaming/dynamic_trace"); 
			if (theDTraceFactory != null) {
				return theDTraceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DTraceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTraceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DTracePackage.LOCAL_EXECUTION: return createLocalExecution();
			case DTracePackage.REMOTE_CALL: return createRemoteCall();
			case DTracePackage.REMOTE_METHOD_EXECUTION: return createRemoteMethodExecution();
			case DTracePackage.LOCAL_INSTANCE: return createLocalInstance();
			case DTracePackage.REMOTE_INSTANCE: return createRemoteInstance();
			case DTracePackage.CLASS: return createClass();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalExecution createLocalExecution() {
		LocalExecutionImpl localExecution = new LocalExecutionImpl();
		return localExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteCall createRemoteCall() {
		RemoteCallImpl remoteCall = new RemoteCallImpl();
		return remoteCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteMethodExecution createRemoteMethodExecution() {
		RemoteMethodExecutionImpl remoteMethodExecution = new RemoteMethodExecutionImpl();
		return remoteMethodExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalInstance createLocalInstance() {
		LocalInstanceImpl localInstance = new LocalInstanceImpl();
		return localInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteInstance createRemoteInstance() {
		RemoteInstanceImpl remoteInstance = new RemoteInstanceImpl();
		return remoteInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclectic.test.streaming.dtrace.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTracePackage getDTracePackage() {
		return (DTracePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DTracePackage getPackage() {
		return DTracePackage.eINSTANCE;
	}

} //DTraceFactoryImpl
