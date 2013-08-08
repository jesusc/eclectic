/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.test.streaming.dtrace;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclectic.test.streaming.dtrace.DTraceFactory
 * @model kind="package"
 * @generated
 */
public interface DTracePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dtrace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclectic.org/streaming/dynamic_trace";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dynamic_trace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DTracePackage eINSTANCE = org.eclectic.test.streaming.dtrace.impl.DTracePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclectic.test.streaming.dtrace.impl.ExecutionStatementImpl <em>Execution Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.test.streaming.dtrace.impl.ExecutionStatementImpl
	 * @see org.eclectic.test.streaming.dtrace.impl.DTracePackageImpl#getExecutionStatement()
	 * @generated
	 */
	int EXECUTION_STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STATEMENT__TIMESTAMP = 0;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STATEMENT__NODE_ID = 1;

	/**
	 * The feature id for the '<em><b>Statement Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STATEMENT__STATEMENT_SRC = 2;

	/**
	 * The number of structural features of the '<em>Execution Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STATEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclectic.test.streaming.dtrace.impl.MethodExecutionImpl <em>Method Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.test.streaming.dtrace.impl.MethodExecutionImpl
	 * @see org.eclectic.test.streaming.dtrace.impl.DTracePackageImpl#getMethodExecution()
	 * @generated
	 */
	int METHOD_EXECUTION = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_EXECUTION__TIMESTAMP = EXECUTION_STATEMENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_EXECUTION__NODE_ID = EXECUTION_STATEMENT__NODE_ID;

	/**
	 * The feature id for the '<em><b>Statement Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_EXECUTION__STATEMENT_SRC = EXECUTION_STATEMENT__STATEMENT_SRC;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_EXECUTION__METHOD_NAME = EXECUTION_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Debug Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_EXECUTION__DEBUG_ID = EXECUTION_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Caller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_EXECUTION__CALLER = EXECUTION_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Callee</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_EXECUTION__CALLEE = EXECUTION_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Receptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_EXECUTION__RECEPTOR = EXECUTION_STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Method Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_EXECUTION_FEATURE_COUNT = EXECUTION_STATEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclectic.test.streaming.dtrace.impl.LocalExecutionImpl <em>Local Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.test.streaming.dtrace.impl.LocalExecutionImpl
	 * @see org.eclectic.test.streaming.dtrace.impl.DTracePackageImpl#getLocalExecution()
	 * @generated
	 */
	int LOCAL_EXECUTION = 2;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_EXECUTION__TIMESTAMP = METHOD_EXECUTION__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_EXECUTION__NODE_ID = METHOD_EXECUTION__NODE_ID;

	/**
	 * The feature id for the '<em><b>Statement Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_EXECUTION__STATEMENT_SRC = METHOD_EXECUTION__STATEMENT_SRC;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_EXECUTION__METHOD_NAME = METHOD_EXECUTION__METHOD_NAME;

	/**
	 * The feature id for the '<em><b>Debug Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_EXECUTION__DEBUG_ID = METHOD_EXECUTION__DEBUG_ID;

	/**
	 * The feature id for the '<em><b>Caller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_EXECUTION__CALLER = METHOD_EXECUTION__CALLER;

	/**
	 * The feature id for the '<em><b>Callee</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_EXECUTION__CALLEE = METHOD_EXECUTION__CALLEE;

	/**
	 * The feature id for the '<em><b>Receptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_EXECUTION__RECEPTOR = METHOD_EXECUTION__RECEPTOR;

	/**
	 * The feature id for the '<em><b>Is Create</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_EXECUTION__IS_CREATE = METHOD_EXECUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Destroy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_EXECUTION__IS_DESTROY = METHOD_EXECUTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Local Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_EXECUTION_FEATURE_COUNT = METHOD_EXECUTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclectic.test.streaming.dtrace.impl.RemoteCallImpl <em>Remote Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.test.streaming.dtrace.impl.RemoteCallImpl
	 * @see org.eclectic.test.streaming.dtrace.impl.DTracePackageImpl#getRemoteCall()
	 * @generated
	 */
	int REMOTE_CALL = 3;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CALL__TIMESTAMP = METHOD_EXECUTION__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CALL__NODE_ID = METHOD_EXECUTION__NODE_ID;

	/**
	 * The feature id for the '<em><b>Statement Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CALL__STATEMENT_SRC = METHOD_EXECUTION__STATEMENT_SRC;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CALL__METHOD_NAME = METHOD_EXECUTION__METHOD_NAME;

	/**
	 * The feature id for the '<em><b>Debug Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CALL__DEBUG_ID = METHOD_EXECUTION__DEBUG_ID;

	/**
	 * The feature id for the '<em><b>Caller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CALL__CALLER = METHOD_EXECUTION__CALLER;

	/**
	 * The feature id for the '<em><b>Callee</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CALL__CALLEE = METHOD_EXECUTION__CALLEE;

	/**
	 * The feature id for the '<em><b>Receptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CALL__RECEPTOR = METHOD_EXECUTION__RECEPTOR;

	/**
	 * The number of structural features of the '<em>Remote Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_CALL_FEATURE_COUNT = METHOD_EXECUTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclectic.test.streaming.dtrace.impl.RemoteMethodExecutionImpl <em>Remote Method Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.test.streaming.dtrace.impl.RemoteMethodExecutionImpl
	 * @see org.eclectic.test.streaming.dtrace.impl.DTracePackageImpl#getRemoteMethodExecution()
	 * @generated
	 */
	int REMOTE_METHOD_EXECUTION = 4;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_METHOD_EXECUTION__TIMESTAMP = METHOD_EXECUTION__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_METHOD_EXECUTION__NODE_ID = METHOD_EXECUTION__NODE_ID;

	/**
	 * The feature id for the '<em><b>Statement Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_METHOD_EXECUTION__STATEMENT_SRC = METHOD_EXECUTION__STATEMENT_SRC;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_METHOD_EXECUTION__METHOD_NAME = METHOD_EXECUTION__METHOD_NAME;

	/**
	 * The feature id for the '<em><b>Debug Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_METHOD_EXECUTION__DEBUG_ID = METHOD_EXECUTION__DEBUG_ID;

	/**
	 * The feature id for the '<em><b>Caller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_METHOD_EXECUTION__CALLER = METHOD_EXECUTION__CALLER;

	/**
	 * The feature id for the '<em><b>Callee</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_METHOD_EXECUTION__CALLEE = METHOD_EXECUTION__CALLEE;

	/**
	 * The feature id for the '<em><b>Receptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_METHOD_EXECUTION__RECEPTOR = METHOD_EXECUTION__RECEPTOR;

	/**
	 * The feature id for the '<em><b>Client Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_METHOD_EXECUTION__CLIENT_TIMESTAMP = METHOD_EXECUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Client Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_METHOD_EXECUTION__CLIENT_NODE_ID = METHOD_EXECUTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Remote Method Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_METHOD_EXECUTION_FEATURE_COUNT = METHOD_EXECUTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclectic.test.streaming.dtrace.impl.ClassifierImpl <em>Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.test.streaming.dtrace.impl.ClassifierImpl
	 * @see org.eclectic.test.streaming.dtrace.impl.DTracePackageImpl#getClassifier()
	 * @generated
	 */
	int CLASSIFIER = 5;

	/**
	 * The number of structural features of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclectic.test.streaming.dtrace.impl.InstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.test.streaming.dtrace.impl.InstanceImpl
	 * @see org.eclectic.test.streaming.dtrace.impl.DTracePackageImpl#getInstance()
	 * @generated
	 */
	int INSTANCE = 6;

	/**
	 * The feature id for the '<em><b>Object Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__OBJECT_ID = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object Id hex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__OBJECT_ID_HEX = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Clazz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__CLAZZ = CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclectic.test.streaming.dtrace.impl.LocalInstanceImpl <em>Local Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.test.streaming.dtrace.impl.LocalInstanceImpl
	 * @see org.eclectic.test.streaming.dtrace.impl.DTracePackageImpl#getLocalInstance()
	 * @generated
	 */
	int LOCAL_INSTANCE = 7;

	/**
	 * The feature id for the '<em><b>Object Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_INSTANCE__OBJECT_ID = INSTANCE__OBJECT_ID;

	/**
	 * The feature id for the '<em><b>Object Id hex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_INSTANCE__OBJECT_ID_HEX = INSTANCE__OBJECT_ID_HEX;

	/**
	 * The feature id for the '<em><b>Clazz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_INSTANCE__CLAZZ = INSTANCE__CLAZZ;

	/**
	 * The number of structural features of the '<em>Local Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_INSTANCE_FEATURE_COUNT = INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclectic.test.streaming.dtrace.impl.RemoteInstanceImpl <em>Remote Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.test.streaming.dtrace.impl.RemoteInstanceImpl
	 * @see org.eclectic.test.streaming.dtrace.impl.DTracePackageImpl#getRemoteInstance()
	 * @generated
	 */
	int REMOTE_INSTANCE = 8;

	/**
	 * The feature id for the '<em><b>Object Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_INSTANCE__OBJECT_ID = INSTANCE__OBJECT_ID;

	/**
	 * The feature id for the '<em><b>Object Id hex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_INSTANCE__OBJECT_ID_HEX = INSTANCE__OBJECT_ID_HEX;

	/**
	 * The feature id for the '<em><b>Clazz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_INSTANCE__CLAZZ = INSTANCE__CLAZZ;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_INSTANCE__NODE_ID = INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Remote Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_INSTANCE_FEATURE_COUNT = INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.test.streaming.dtrace.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.test.streaming.dtrace.impl.ClassImpl
	 * @see org.eclectic.test.streaming.dtrace.impl.DTracePackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.eclectic.test.streaming.dtrace.ExecutionStatement <em>Execution Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Statement</em>'.
	 * @see org.eclectic.test.streaming.dtrace.ExecutionStatement
	 * @generated
	 */
	EClass getExecutionStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.test.streaming.dtrace.ExecutionStatement#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see org.eclectic.test.streaming.dtrace.ExecutionStatement#getTimestamp()
	 * @see #getExecutionStatement()
	 * @generated
	 */
	EAttribute getExecutionStatement_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.test.streaming.dtrace.ExecutionStatement#getNodeId <em>Node Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Id</em>'.
	 * @see org.eclectic.test.streaming.dtrace.ExecutionStatement#getNodeId()
	 * @see #getExecutionStatement()
	 * @generated
	 */
	EAttribute getExecutionStatement_NodeId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.test.streaming.dtrace.ExecutionStatement#getStatementSrc <em>Statement Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statement Src</em>'.
	 * @see org.eclectic.test.streaming.dtrace.ExecutionStatement#getStatementSrc()
	 * @see #getExecutionStatement()
	 * @generated
	 */
	EAttribute getExecutionStatement_StatementSrc();

	/**
	 * Returns the meta object for class '{@link org.eclectic.test.streaming.dtrace.MethodExecution <em>Method Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Execution</em>'.
	 * @see org.eclectic.test.streaming.dtrace.MethodExecution
	 * @generated
	 */
	EClass getMethodExecution();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.test.streaming.dtrace.MethodExecution#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see org.eclectic.test.streaming.dtrace.MethodExecution#getMethodName()
	 * @see #getMethodExecution()
	 * @generated
	 */
	EAttribute getMethodExecution_MethodName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.test.streaming.dtrace.MethodExecution#getDebugId <em>Debug Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Debug Id</em>'.
	 * @see org.eclectic.test.streaming.dtrace.MethodExecution#getDebugId()
	 * @see #getMethodExecution()
	 * @generated
	 */
	EAttribute getMethodExecution_DebugId();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.test.streaming.dtrace.MethodExecution#getCaller <em>Caller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Caller</em>'.
	 * @see org.eclectic.test.streaming.dtrace.MethodExecution#getCaller()
	 * @see #getMethodExecution()
	 * @generated
	 */
	EReference getMethodExecution_Caller();

	/**
	 * Returns the meta object for the reference list '{@link org.eclectic.test.streaming.dtrace.MethodExecution#getCallee <em>Callee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Callee</em>'.
	 * @see org.eclectic.test.streaming.dtrace.MethodExecution#getCallee()
	 * @see #getMethodExecution()
	 * @generated
	 */
	EReference getMethodExecution_Callee();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.test.streaming.dtrace.MethodExecution#getReceptor <em>Receptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receptor</em>'.
	 * @see org.eclectic.test.streaming.dtrace.MethodExecution#getReceptor()
	 * @see #getMethodExecution()
	 * @generated
	 */
	EReference getMethodExecution_Receptor();

	/**
	 * Returns the meta object for class '{@link org.eclectic.test.streaming.dtrace.LocalExecution <em>Local Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Execution</em>'.
	 * @see org.eclectic.test.streaming.dtrace.LocalExecution
	 * @generated
	 */
	EClass getLocalExecution();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.test.streaming.dtrace.LocalExecution#isIsCreate <em>Is Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Create</em>'.
	 * @see org.eclectic.test.streaming.dtrace.LocalExecution#isIsCreate()
	 * @see #getLocalExecution()
	 * @generated
	 */
	EAttribute getLocalExecution_IsCreate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.test.streaming.dtrace.LocalExecution#isIsDestroy <em>Is Destroy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Destroy</em>'.
	 * @see org.eclectic.test.streaming.dtrace.LocalExecution#isIsDestroy()
	 * @see #getLocalExecution()
	 * @generated
	 */
	EAttribute getLocalExecution_IsDestroy();

	/**
	 * Returns the meta object for class '{@link org.eclectic.test.streaming.dtrace.RemoteCall <em>Remote Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote Call</em>'.
	 * @see org.eclectic.test.streaming.dtrace.RemoteCall
	 * @generated
	 */
	EClass getRemoteCall();

	/**
	 * Returns the meta object for class '{@link org.eclectic.test.streaming.dtrace.RemoteMethodExecution <em>Remote Method Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote Method Execution</em>'.
	 * @see org.eclectic.test.streaming.dtrace.RemoteMethodExecution
	 * @generated
	 */
	EClass getRemoteMethodExecution();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.test.streaming.dtrace.RemoteMethodExecution#getClientTimestamp <em>Client Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Timestamp</em>'.
	 * @see org.eclectic.test.streaming.dtrace.RemoteMethodExecution#getClientTimestamp()
	 * @see #getRemoteMethodExecution()
	 * @generated
	 */
	EAttribute getRemoteMethodExecution_ClientTimestamp();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.test.streaming.dtrace.RemoteMethodExecution#getClientNodeId <em>Client Node Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Node Id</em>'.
	 * @see org.eclectic.test.streaming.dtrace.RemoteMethodExecution#getClientNodeId()
	 * @see #getRemoteMethodExecution()
	 * @generated
	 */
	EAttribute getRemoteMethodExecution_ClientNodeId();

	/**
	 * Returns the meta object for class '{@link org.eclectic.test.streaming.dtrace.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier</em>'.
	 * @see org.eclectic.test.streaming.dtrace.Classifier
	 * @generated
	 */
	EClass getClassifier();

	/**
	 * Returns the meta object for class '{@link org.eclectic.test.streaming.dtrace.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see org.eclectic.test.streaming.dtrace.Instance
	 * @generated
	 */
	EClass getInstance();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.test.streaming.dtrace.Instance#getObjectId <em>Object Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Id</em>'.
	 * @see org.eclectic.test.streaming.dtrace.Instance#getObjectId()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_ObjectId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.test.streaming.dtrace.Instance#getObjectId_hex <em>Object Id hex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Id hex</em>'.
	 * @see org.eclectic.test.streaming.dtrace.Instance#getObjectId_hex()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_ObjectId_hex();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.test.streaming.dtrace.Instance#getClazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clazz</em>'.
	 * @see org.eclectic.test.streaming.dtrace.Instance#getClazz()
	 * @see #getInstance()
	 * @generated
	 */
	EReference getInstance_Clazz();

	/**
	 * Returns the meta object for class '{@link org.eclectic.test.streaming.dtrace.LocalInstance <em>Local Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Instance</em>'.
	 * @see org.eclectic.test.streaming.dtrace.LocalInstance
	 * @generated
	 */
	EClass getLocalInstance();

	/**
	 * Returns the meta object for class '{@link org.eclectic.test.streaming.dtrace.RemoteInstance <em>Remote Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote Instance</em>'.
	 * @see org.eclectic.test.streaming.dtrace.RemoteInstance
	 * @generated
	 */
	EClass getRemoteInstance();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.test.streaming.dtrace.RemoteInstance#getNodeId <em>Node Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Id</em>'.
	 * @see org.eclectic.test.streaming.dtrace.RemoteInstance#getNodeId()
	 * @see #getRemoteInstance()
	 * @generated
	 */
	EAttribute getRemoteInstance_NodeId();

	/**
	 * Returns the meta object for class '{@link org.eclectic.test.streaming.dtrace.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see org.eclectic.test.streaming.dtrace.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.test.streaming.dtrace.Class#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclectic.test.streaming.dtrace.Class#getName()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DTraceFactory getDTraceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclectic.test.streaming.dtrace.impl.ExecutionStatementImpl <em>Execution Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.test.streaming.dtrace.impl.ExecutionStatementImpl
		 * @see org.eclectic.test.streaming.dtrace.impl.DTracePackageImpl#getExecutionStatement()
		 * @generated
		 */
		EClass EXECUTION_STATEMENT = eINSTANCE.getExecutionStatement();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_STATEMENT__TIMESTAMP = eINSTANCE.getExecutionStatement_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Node Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_STATEMENT__NODE_ID = eINSTANCE.getExecutionStatement_NodeId();

		/**
		 * The meta object literal for the '<em><b>Statement Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_STATEMENT__STATEMENT_SRC = eINSTANCE.getExecutionStatement_StatementSrc();

		/**
		 * The meta object literal for the '{@link org.eclectic.test.streaming.dtrace.impl.MethodExecutionImpl <em>Method Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.test.streaming.dtrace.impl.MethodExecutionImpl
		 * @see org.eclectic.test.streaming.dtrace.impl.DTracePackageImpl#getMethodExecution()
		 * @generated
		 */
		EClass METHOD_EXECUTION = eINSTANCE.getMethodExecution();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_EXECUTION__METHOD_NAME = eINSTANCE.getMethodExecution_MethodName();

		/**
		 * The meta object literal for the '<em><b>Debug Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_EXECUTION__DEBUG_ID = eINSTANCE.getMethodExecution_DebugId();

		/**
		 * The meta object literal for the '<em><b>Caller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_EXECUTION__CALLER = eINSTANCE.getMethodExecution_Caller();

		/**
		 * The meta object literal for the '<em><b>Callee</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_EXECUTION__CALLEE = eINSTANCE.getMethodExecution_Callee();

		/**
		 * The meta object literal for the '<em><b>Receptor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_EXECUTION__RECEPTOR = eINSTANCE.getMethodExecution_Receptor();

		/**
		 * The meta object literal for the '{@link org.eclectic.test.streaming.dtrace.impl.LocalExecutionImpl <em>Local Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.test.streaming.dtrace.impl.LocalExecutionImpl
		 * @see org.eclectic.test.streaming.dtrace.impl.DTracePackageImpl#getLocalExecution()
		 * @generated
		 */
		EClass LOCAL_EXECUTION = eINSTANCE.getLocalExecution();

		/**
		 * The meta object literal for the '<em><b>Is Create</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_EXECUTION__IS_CREATE = eINSTANCE.getLocalExecution_IsCreate();

		/**
		 * The meta object literal for the '<em><b>Is Destroy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_EXECUTION__IS_DESTROY = eINSTANCE.getLocalExecution_IsDestroy();

		/**
		 * The meta object literal for the '{@link org.eclectic.test.streaming.dtrace.impl.RemoteCallImpl <em>Remote Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.test.streaming.dtrace.impl.RemoteCallImpl
		 * @see org.eclectic.test.streaming.dtrace.impl.DTracePackageImpl#getRemoteCall()
		 * @generated
		 */
		EClass REMOTE_CALL = eINSTANCE.getRemoteCall();

		/**
		 * The meta object literal for the '{@link org.eclectic.test.streaming.dtrace.impl.RemoteMethodExecutionImpl <em>Remote Method Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.test.streaming.dtrace.impl.RemoteMethodExecutionImpl
		 * @see org.eclectic.test.streaming.dtrace.impl.DTracePackageImpl#getRemoteMethodExecution()
		 * @generated
		 */
		EClass REMOTE_METHOD_EXECUTION = eINSTANCE.getRemoteMethodExecution();

		/**
		 * The meta object literal for the '<em><b>Client Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_METHOD_EXECUTION__CLIENT_TIMESTAMP = eINSTANCE.getRemoteMethodExecution_ClientTimestamp();

		/**
		 * The meta object literal for the '<em><b>Client Node Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_METHOD_EXECUTION__CLIENT_NODE_ID = eINSTANCE.getRemoteMethodExecution_ClientNodeId();

		/**
		 * The meta object literal for the '{@link org.eclectic.test.streaming.dtrace.impl.ClassifierImpl <em>Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.test.streaming.dtrace.impl.ClassifierImpl
		 * @see org.eclectic.test.streaming.dtrace.impl.DTracePackageImpl#getClassifier()
		 * @generated
		 */
		EClass CLASSIFIER = eINSTANCE.getClassifier();

		/**
		 * The meta object literal for the '{@link org.eclectic.test.streaming.dtrace.impl.InstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.test.streaming.dtrace.impl.InstanceImpl
		 * @see org.eclectic.test.streaming.dtrace.impl.DTracePackageImpl#getInstance()
		 * @generated
		 */
		EClass INSTANCE = eINSTANCE.getInstance();

		/**
		 * The meta object literal for the '<em><b>Object Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE__OBJECT_ID = eINSTANCE.getInstance_ObjectId();

		/**
		 * The meta object literal for the '<em><b>Object Id hex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE__OBJECT_ID_HEX = eINSTANCE.getInstance_ObjectId_hex();

		/**
		 * The meta object literal for the '<em><b>Clazz</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE__CLAZZ = eINSTANCE.getInstance_Clazz();

		/**
		 * The meta object literal for the '{@link org.eclectic.test.streaming.dtrace.impl.LocalInstanceImpl <em>Local Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.test.streaming.dtrace.impl.LocalInstanceImpl
		 * @see org.eclectic.test.streaming.dtrace.impl.DTracePackageImpl#getLocalInstance()
		 * @generated
		 */
		EClass LOCAL_INSTANCE = eINSTANCE.getLocalInstance();

		/**
		 * The meta object literal for the '{@link org.eclectic.test.streaming.dtrace.impl.RemoteInstanceImpl <em>Remote Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.test.streaming.dtrace.impl.RemoteInstanceImpl
		 * @see org.eclectic.test.streaming.dtrace.impl.DTracePackageImpl#getRemoteInstance()
		 * @generated
		 */
		EClass REMOTE_INSTANCE = eINSTANCE.getRemoteInstance();

		/**
		 * The meta object literal for the '<em><b>Node Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_INSTANCE__NODE_ID = eINSTANCE.getRemoteInstance_NodeId();

		/**
		 * The meta object literal for the '{@link org.eclectic.test.streaming.dtrace.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.test.streaming.dtrace.impl.ClassImpl
		 * @see org.eclectic.test.streaming.dtrace.impl.DTracePackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__NAME = eINSTANCE.getClass_Name();

	}

} //DTracePackage
