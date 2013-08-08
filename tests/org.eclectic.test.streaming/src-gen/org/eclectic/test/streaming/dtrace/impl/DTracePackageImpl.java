/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.test.streaming.dtrace.impl;

import org.eclectic.test.streaming.dtrace.Classifier;
import org.eclectic.test.streaming.dtrace.DTraceFactory;
import org.eclectic.test.streaming.dtrace.DTracePackage;
import org.eclectic.test.streaming.dtrace.ExecutionStatement;
import org.eclectic.test.streaming.dtrace.Instance;
import org.eclectic.test.streaming.dtrace.LocalExecution;
import org.eclectic.test.streaming.dtrace.LocalInstance;
import org.eclectic.test.streaming.dtrace.MethodExecution;
import org.eclectic.test.streaming.dtrace.RemoteCall;
import org.eclectic.test.streaming.dtrace.RemoteInstance;

import org.eclectic.test.streaming.dtrace.RemoteMethodExecution;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DTracePackageImpl extends EPackageImpl implements DTracePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remoteCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remoteMethodExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remoteInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclectic.test.streaming.dtrace.DTracePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DTracePackageImpl() {
		super(eNS_URI, DTraceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DTracePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DTracePackage init() {
		if (isInited) return (DTracePackage)EPackage.Registry.INSTANCE.getEPackage(DTracePackage.eNS_URI);

		// Obtain or create and register package
		DTracePackageImpl theDTracePackage = (DTracePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DTracePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DTracePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDTracePackage.createPackageContents();

		// Initialize created meta-data
		theDTracePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDTracePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DTracePackage.eNS_URI, theDTracePackage);
		return theDTracePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionStatement() {
		return executionStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutionStatement_Timestamp() {
		return (EAttribute)executionStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutionStatement_NodeId() {
		return (EAttribute)executionStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecutionStatement_StatementSrc() {
		return (EAttribute)executionStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodExecution() {
		return methodExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodExecution_MethodName() {
		return (EAttribute)methodExecutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodExecution_DebugId() {
		return (EAttribute)methodExecutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodExecution_Caller() {
		return (EReference)methodExecutionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodExecution_Callee() {
		return (EReference)methodExecutionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodExecution_Receptor() {
		return (EReference)methodExecutionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalExecution() {
		return localExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalExecution_IsCreate() {
		return (EAttribute)localExecutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalExecution_IsDestroy() {
		return (EAttribute)localExecutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoteCall() {
		return remoteCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoteMethodExecution() {
		return remoteMethodExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoteMethodExecution_ClientTimestamp() {
		return (EAttribute)remoteMethodExecutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoteMethodExecution_ClientNodeId() {
		return (EAttribute)remoteMethodExecutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifier() {
		return classifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstance() {
		return instanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_ObjectId() {
		return (EAttribute)instanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_ObjectId_hex() {
		return (EAttribute)instanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstance_Clazz() {
		return (EReference)instanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalInstance() {
		return localInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoteInstance() {
		return remoteInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoteInstance_NodeId() {
		return (EAttribute)remoteInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_Name() {
		return (EAttribute)classEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTraceFactory getDTraceFactory() {
		return (DTraceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		executionStatementEClass = createEClass(EXECUTION_STATEMENT);
		createEAttribute(executionStatementEClass, EXECUTION_STATEMENT__TIMESTAMP);
		createEAttribute(executionStatementEClass, EXECUTION_STATEMENT__NODE_ID);
		createEAttribute(executionStatementEClass, EXECUTION_STATEMENT__STATEMENT_SRC);

		methodExecutionEClass = createEClass(METHOD_EXECUTION);
		createEAttribute(methodExecutionEClass, METHOD_EXECUTION__METHOD_NAME);
		createEAttribute(methodExecutionEClass, METHOD_EXECUTION__DEBUG_ID);
		createEReference(methodExecutionEClass, METHOD_EXECUTION__CALLER);
		createEReference(methodExecutionEClass, METHOD_EXECUTION__CALLEE);
		createEReference(methodExecutionEClass, METHOD_EXECUTION__RECEPTOR);

		localExecutionEClass = createEClass(LOCAL_EXECUTION);
		createEAttribute(localExecutionEClass, LOCAL_EXECUTION__IS_CREATE);
		createEAttribute(localExecutionEClass, LOCAL_EXECUTION__IS_DESTROY);

		remoteCallEClass = createEClass(REMOTE_CALL);

		remoteMethodExecutionEClass = createEClass(REMOTE_METHOD_EXECUTION);
		createEAttribute(remoteMethodExecutionEClass, REMOTE_METHOD_EXECUTION__CLIENT_TIMESTAMP);
		createEAttribute(remoteMethodExecutionEClass, REMOTE_METHOD_EXECUTION__CLIENT_NODE_ID);

		classifierEClass = createEClass(CLASSIFIER);

		instanceEClass = createEClass(INSTANCE);
		createEAttribute(instanceEClass, INSTANCE__OBJECT_ID);
		createEAttribute(instanceEClass, INSTANCE__OBJECT_ID_HEX);
		createEReference(instanceEClass, INSTANCE__CLAZZ);

		localInstanceEClass = createEClass(LOCAL_INSTANCE);

		remoteInstanceEClass = createEClass(REMOTE_INSTANCE);
		createEAttribute(remoteInstanceEClass, REMOTE_INSTANCE__NODE_ID);

		classEClass = createEClass(CLASS);
		createEAttribute(classEClass, CLASS__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		methodExecutionEClass.getESuperTypes().add(this.getExecutionStatement());
		localExecutionEClass.getESuperTypes().add(this.getMethodExecution());
		remoteCallEClass.getESuperTypes().add(this.getMethodExecution());
		remoteMethodExecutionEClass.getESuperTypes().add(this.getMethodExecution());
		instanceEClass.getESuperTypes().add(this.getClassifier());
		localInstanceEClass.getESuperTypes().add(this.getInstance());
		remoteInstanceEClass.getESuperTypes().add(this.getInstance());
		classEClass.getESuperTypes().add(this.getClassifier());

		// Initialize classes and features; add operations and parameters
		initEClass(executionStatementEClass, ExecutionStatement.class, "ExecutionStatement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExecutionStatement_Timestamp(), ecorePackage.getEInt(), "timestamp", null, 1, 1, ExecutionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutionStatement_NodeId(), ecorePackage.getEInt(), "nodeId", null, 1, 1, ExecutionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutionStatement_StatementSrc(), ecorePackage.getEString(), "statementSrc", null, 1, 1, ExecutionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodExecutionEClass, MethodExecution.class, "MethodExecution", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethodExecution_MethodName(), ecorePackage.getEString(), "methodName", null, 1, 1, MethodExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodExecution_DebugId(), ecorePackage.getEString(), "debugId", null, 0, 1, MethodExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodExecution_Caller(), this.getMethodExecution(), this.getMethodExecution_Callee(), "caller", null, 0, 1, MethodExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodExecution_Callee(), this.getMethodExecution(), this.getMethodExecution_Caller(), "callee", null, 0, -1, MethodExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodExecution_Receptor(), this.getClassifier(), null, "receptor", null, 1, 1, MethodExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localExecutionEClass, LocalExecution.class, "LocalExecution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocalExecution_IsCreate(), ecorePackage.getEBoolean(), "isCreate", null, 0, 1, LocalExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocalExecution_IsDestroy(), ecorePackage.getEBoolean(), "isDestroy", null, 0, 1, LocalExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(remoteCallEClass, RemoteCall.class, "RemoteCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(remoteMethodExecutionEClass, RemoteMethodExecution.class, "RemoteMethodExecution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoteMethodExecution_ClientTimestamp(), ecorePackage.getEInt(), "clientTimestamp", null, 1, 1, RemoteMethodExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoteMethodExecution_ClientNodeId(), ecorePackage.getEInt(), "clientNodeId", null, 1, 1, RemoteMethodExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classifierEClass, Classifier.class, "Classifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(instanceEClass, Instance.class, "Instance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstance_ObjectId(), ecorePackage.getEInt(), "objectId", null, 0, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstance_ObjectId_hex(), ecorePackage.getEString(), "objectId_hex", null, 0, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstance_Clazz(), this.getClass_(), null, "clazz", null, 1, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localInstanceEClass, LocalInstance.class, "LocalInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(remoteInstanceEClass, RemoteInstance.class, "RemoteInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoteInstance_NodeId(), ecorePackage.getEInt(), "nodeId", null, 0, 1, RemoteInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classEClass, org.eclectic.test.streaming.dtrace.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClass_Name(), ecorePackage.getEString(), "name", null, 1, 1, org.eclectic.test.streaming.dtrace.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DTracePackageImpl
