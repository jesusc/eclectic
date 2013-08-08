/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.qool;

import org.eclectic.frontend.core.CorePackage;

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
 * @see org.eclectic.frontend.qool.QoolFactory
 * @model kind="package"
 * @generated
 */
public interface QoolPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "qool";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclectic.org/frontend/qoolL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ec_frontend_qoolL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QoolPackage eINSTANCE = org.eclectic.frontend.qool.impl.QoolPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.qool.impl.QoolTransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.qool.impl.QoolTransformationImpl
	 * @see org.eclectic.frontend.qool.impl.QoolPackageImpl#getQoolTransformation()
	 * @generated
	 */
	int QOOL_TRANSFORMATION = 0;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOOL_TRANSFORMATION__ROW = CorePackage.TRANSFORMATION_DEFINITION__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOOL_TRANSFORMATION__COLUMN = CorePackage.TRANSFORMATION_DEFINITION__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOOL_TRANSFORMATION__FILE = CorePackage.TRANSFORMATION_DEFINITION__FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOOL_TRANSFORMATION__NAME = CorePackage.TRANSFORMATION_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Annotated With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOOL_TRANSFORMATION__ANNOTATED_WITH = CorePackage.TRANSFORMATION_DEFINITION__ANNOTATED_WITH;

	/**
	 * The feature id for the '<em><b>In Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOOL_TRANSFORMATION__IN_MODELS = CorePackage.TRANSFORMATION_DEFINITION__IN_MODELS;

	/**
	 * The feature id for the '<em><b>Out Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOOL_TRANSFORMATION__OUT_MODELS = CorePackage.TRANSFORMATION_DEFINITION__OUT_MODELS;

	/**
	 * The feature id for the '<em><b>Imported Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOOL_TRANSFORMATION__IMPORTED_MODELS = CorePackage.TRANSFORMATION_DEFINITION__IMPORTED_MODELS;

	/**
	 * The feature id for the '<em><b>Inline Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOOL_TRANSFORMATION__INLINE_MODELS = CorePackage.TRANSFORMATION_DEFINITION__INLINE_MODELS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOOL_TRANSFORMATION__ANNOTATIONS = CorePackage.TRANSFORMATION_DEFINITION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOOL_TRANSFORMATION__USES = CorePackage.TRANSFORMATION_DEFINITION__USES;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOOL_TRANSFORMATION__REQUIRES = CorePackage.TRANSFORMATION_DEFINITION__REQUIRES;

	/**
	 * The feature id for the '<em><b>Queues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOOL_TRANSFORMATION__QUEUES = CorePackage.TRANSFORMATION_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Segments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOOL_TRANSFORMATION__SEGMENTS = CorePackage.TRANSFORMATION_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOOL_TRANSFORMATION_FEATURE_COUNT = CorePackage.TRANSFORMATION_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.qool.impl.QoolQueueImpl <em>Queue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.qool.impl.QoolQueueImpl
	 * @see org.eclectic.frontend.qool.impl.QoolPackageImpl#getQoolQueue()
	 * @generated
	 */
	int QOOL_QUEUE = 1;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOOL_QUEUE__ROW = CorePackage.LOCATED_ELEMENT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOOL_QUEUE__COLUMN = CorePackage.LOCATED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOOL_QUEUE__FILE = CorePackage.LOCATED_ELEMENT__FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOOL_QUEUE__NAME = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Optimizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOOL_QUEUE__OPTIMIZATIONS = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Queue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOOL_QUEUE_FEATURE_COUNT = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.qool.impl.QueueOptimizationImpl <em>Queue Optimization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.qool.impl.QueueOptimizationImpl
	 * @see org.eclectic.frontend.qool.impl.QoolPackageImpl#getQueueOptimization()
	 * @generated
	 */
	int QUEUE_OPTIMIZATION = 2;

	/**
	 * The number of structural features of the '<em>Queue Optimization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_OPTIMIZATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.qool.impl.AccessByFeatureOptimizationImpl <em>Access By Feature Optimization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.qool.impl.AccessByFeatureOptimizationImpl
	 * @see org.eclectic.frontend.qool.impl.QoolPackageImpl#getAccessByFeatureOptimization()
	 * @generated
	 */
	int ACCESS_BY_FEATURE_OPTIMIZATION = 3;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_BY_FEATURE_OPTIMIZATION__FEATURE_NAME = QUEUE_OPTIMIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Force</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_BY_FEATURE_OPTIMIZATION__FORCE = QUEUE_OPTIMIZATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Access By Feature Optimization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_BY_FEATURE_OPTIMIZATION_FEATURE_COUNT = QUEUE_OPTIMIZATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.qool.impl.LocalQueueImpl <em>Local Queue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.qool.impl.LocalQueueImpl
	 * @see org.eclectic.frontend.qool.impl.QoolPackageImpl#getLocalQueue()
	 * @generated
	 */
	int LOCAL_QUEUE = 4;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_QUEUE__ROW = QOOL_QUEUE__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_QUEUE__COLUMN = QOOL_QUEUE__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_QUEUE__FILE = QOOL_QUEUE__FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_QUEUE__NAME = QOOL_QUEUE__NAME;

	/**
	 * The feature id for the '<em><b>Optimizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_QUEUE__OPTIMIZATIONS = QOOL_QUEUE__OPTIMIZATIONS;

	/**
	 * The feature id for the '<em><b>Type </b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_QUEUE__TYPE_ = QOOL_QUEUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Local Queue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_QUEUE_FEATURE_COUNT = QOOL_QUEUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.qool.impl.ModelElementQueueImpl <em>Model Element Queue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.qool.impl.ModelElementQueueImpl
	 * @see org.eclectic.frontend.qool.impl.QoolPackageImpl#getModelElementQueue()
	 * @generated
	 */
	int MODEL_ELEMENT_QUEUE = 5;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_QUEUE__ROW = QOOL_QUEUE__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_QUEUE__COLUMN = QOOL_QUEUE__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_QUEUE__FILE = QOOL_QUEUE__FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_QUEUE__NAME = QOOL_QUEUE__NAME;

	/**
	 * The feature id for the '<em><b>Optimizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_QUEUE__OPTIMIZATIONS = QOOL_QUEUE__OPTIMIZATIONS;

	/**
	 * The feature id for the '<em><b>Class </b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_QUEUE__CLASS_ = QOOL_QUEUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Additionals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_QUEUE__ADDITIONALS = QOOL_QUEUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Model Element Queue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_QUEUE_FEATURE_COUNT = QOOL_QUEUE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.qool.impl.SegmentImpl <em>Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.qool.impl.SegmentImpl
	 * @see org.eclectic.frontend.qool.impl.QoolPackageImpl#getSegment()
	 * @generated
	 */
	int SEGMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__STATEMENTS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.qool.impl.IteratorStatementImpl <em>Iterator Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.qool.impl.IteratorStatementImpl
	 * @see org.eclectic.frontend.qool.impl.QoolPackageImpl#getIteratorStatement()
	 * @generated
	 */
	int ITERATOR_STATEMENT = 7;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_STATEMENT__ROW = CorePackage.STATEMENT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_STATEMENT__COLUMN = CorePackage.STATEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_STATEMENT__FILE = CorePackage.STATEMENT__FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_STATEMENT__NAME = CorePackage.STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_STATEMENT__CONDITION = CorePackage.STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_STATEMENT__STATEMENTS = CorePackage.STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Iterator Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_STATEMENT_FEATURE_COUNT = CorePackage.STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.qool.impl.ForAllStatementImpl <em>For All Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.qool.impl.ForAllStatementImpl
	 * @see org.eclectic.frontend.qool.impl.QoolPackageImpl#getForAllStatement()
	 * @generated
	 */
	int FOR_ALL_STATEMENT = 8;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_STATEMENT__ROW = ITERATOR_STATEMENT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_STATEMENT__COLUMN = ITERATOR_STATEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_STATEMENT__FILE = ITERATOR_STATEMENT__FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_STATEMENT__NAME = ITERATOR_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_STATEMENT__CONDITION = ITERATOR_STATEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_STATEMENT__STATEMENTS = ITERATOR_STATEMENT__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Queue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_STATEMENT__QUEUE = ITERATOR_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>For All Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_ALL_STATEMENT_FEATURE_COUNT = ITERATOR_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.qool.impl.ForEachStatementImpl <em>For Each Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.qool.impl.ForEachStatementImpl
	 * @see org.eclectic.frontend.qool.impl.QoolPackageImpl#getForEachStatement()
	 * @generated
	 */
	int FOR_EACH_STATEMENT = 9;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_STATEMENT__ROW = ITERATOR_STATEMENT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_STATEMENT__COLUMN = ITERATOR_STATEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_STATEMENT__FILE = ITERATOR_STATEMENT__FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_STATEMENT__NAME = ITERATOR_STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_STATEMENT__CONDITION = ITERATOR_STATEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_STATEMENT__STATEMENTS = ITERATOR_STATEMENT__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_STATEMENT__COLLECTION = ITERATOR_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>For Each Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_STATEMENT_FEATURE_COUNT = ITERATOR_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.qool.impl.EmitStatementImpl <em>Emit Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.qool.impl.EmitStatementImpl
	 * @see org.eclectic.frontend.qool.impl.QoolPackageImpl#getEmitStatement()
	 * @generated
	 */
	int EMIT_STATEMENT = 10;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_STATEMENT__ROW = CorePackage.STATEMENT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_STATEMENT__COLUMN = CorePackage.STATEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_STATEMENT__FILE = CorePackage.STATEMENT__FILE;

	/**
	 * The feature id for the '<em><b>Queue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_STATEMENT__QUEUE = CorePackage.STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_STATEMENT__VALUE = CorePackage.STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Emit Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_STATEMENT_FEATURE_COUNT = CorePackage.STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.qool.impl.MatchExpressionImpl <em>Match Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.qool.impl.MatchExpressionImpl
	 * @see org.eclectic.frontend.qool.impl.QoolPackageImpl#getMatchExpression()
	 * @generated
	 */
	int MATCH_EXPRESSION = 11;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_EXPRESSION__ROW = CorePackage.EXPRESSION__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_EXPRESSION__COLUMN = CorePackage.EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_EXPRESSION__FILE = CorePackage.EXPRESSION__FILE;

	/**
	 * The feature id for the '<em><b>Queue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_EXPRESSION__QUEUE = CorePackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Predicates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_EXPRESSION__PREDICATES = CorePackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Match Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_EXPRESSION_FEATURE_COUNT = CorePackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.qool.impl.MatchPredicateImpl <em>Match Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.qool.impl.MatchPredicateImpl
	 * @see org.eclectic.frontend.qool.impl.QoolPackageImpl#getMatchPredicate()
	 * @generated
	 */
	int MATCH_PREDICATE = 12;

	/**
	 * The number of structural features of the '<em>Match Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_PREDICATE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.qool.impl.KindOfPredicateImpl <em>Kind Of Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.qool.impl.KindOfPredicateImpl
	 * @see org.eclectic.frontend.qool.impl.QoolPackageImpl#getKindOfPredicate()
	 * @generated
	 */
	int KIND_OF_PREDICATE = 13;

	/**
	 * The feature id for the '<em><b>Class </b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND_OF_PREDICATE__CLASS_ = MATCH_PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Kind Of Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND_OF_PREDICATE_FEATURE_COUNT = MATCH_PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.qool.impl.PropertyEqualsPredicateImpl <em>Property Equals Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.qool.impl.PropertyEqualsPredicateImpl
	 * @see org.eclectic.frontend.qool.impl.QoolPackageImpl#getPropertyEqualsPredicate()
	 * @generated
	 */
	int PROPERTY_EQUALS_PREDICATE = 14;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_EQUALS_PREDICATE__PROPERTY_NAME = MATCH_PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_EQUALS_PREDICATE__VALUE = MATCH_PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Property Equals Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_EQUALS_PREDICATE_FEATURE_COUNT = MATCH_PREDICATE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.qool.impl.InvokeTransformationImpl <em>Invoke Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.qool.impl.InvokeTransformationImpl
	 * @see org.eclectic.frontend.qool.impl.QoolPackageImpl#getInvokeTransformation()
	 * @generated
	 */
	int INVOKE_TRANSFORMATION = 15;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_TRANSFORMATION__ROW = CorePackage.EXPRESSION__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_TRANSFORMATION__COLUMN = CorePackage.EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_TRANSFORMATION__FILE = CorePackage.EXPRESSION__FILE;

	/**
	 * The feature id for the '<em><b>Transformation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_TRANSFORMATION__TRANSFORMATION_NAME = CorePackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_TRANSFORMATION__SOURCE_MODELS = CorePackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_TRANSFORMATION__TARGET_MODELS = CorePackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_TRANSFORMATION__PARAMETERS = CorePackage.EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input View Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_TRANSFORMATION__INPUT_VIEW_FILTER = CorePackage.EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Entry Point Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_TRANSFORMATION__ENTRY_POINT_NAME = CorePackage.EXPRESSION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Entry Point Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_TRANSFORMATION__ENTRY_POINT_PARAMETERS = CorePackage.EXPRESSION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Invoke Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_TRANSFORMATION_FEATURE_COUNT = CorePackage.EXPRESSION_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.qool.impl.InvokeExternalImpl <em>Invoke External</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.qool.impl.InvokeExternalImpl
	 * @see org.eclectic.frontend.qool.impl.QoolPackageImpl#getInvokeExternal()
	 * @generated
	 */
	int INVOKE_EXTERNAL = 16;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_EXTERNAL__ROW = INVOKE_TRANSFORMATION__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_EXTERNAL__COLUMN = INVOKE_TRANSFORMATION__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_EXTERNAL__FILE = INVOKE_TRANSFORMATION__FILE;

	/**
	 * The feature id for the '<em><b>Transformation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_EXTERNAL__TRANSFORMATION_NAME = INVOKE_TRANSFORMATION__TRANSFORMATION_NAME;

	/**
	 * The feature id for the '<em><b>Source Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_EXTERNAL__SOURCE_MODELS = INVOKE_TRANSFORMATION__SOURCE_MODELS;

	/**
	 * The feature id for the '<em><b>Target Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_EXTERNAL__TARGET_MODELS = INVOKE_TRANSFORMATION__TARGET_MODELS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_EXTERNAL__PARAMETERS = INVOKE_TRANSFORMATION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Input View Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_EXTERNAL__INPUT_VIEW_FILTER = INVOKE_TRANSFORMATION__INPUT_VIEW_FILTER;

	/**
	 * The feature id for the '<em><b>Entry Point Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_EXTERNAL__ENTRY_POINT_NAME = INVOKE_TRANSFORMATION__ENTRY_POINT_NAME;

	/**
	 * The feature id for the '<em><b>Entry Point Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_EXTERNAL__ENTRY_POINT_PARAMETERS = INVOKE_TRANSFORMATION__ENTRY_POINT_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Output Resolution Source Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_EXTERNAL__OUTPUT_RESOLUTION_SOURCE_ELEMENT = INVOKE_TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Queue Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_EXTERNAL__QUEUE_NAME = INVOKE_TRANSFORMATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Trace Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_EXTERNAL__TRACE_ATTRIBUTE_NAME = INVOKE_TRANSFORMATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Invoke External</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_EXTERNAL_FEATURE_COUNT = INVOKE_TRANSFORMATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.qool.impl.InvokeInternalImpl <em>Invoke Internal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.qool.impl.InvokeInternalImpl
	 * @see org.eclectic.frontend.qool.impl.QoolPackageImpl#getInvokeInternal()
	 * @generated
	 */
	int INVOKE_INTERNAL = 17;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_INTERNAL__ROW = INVOKE_TRANSFORMATION__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_INTERNAL__COLUMN = INVOKE_TRANSFORMATION__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_INTERNAL__FILE = INVOKE_TRANSFORMATION__FILE;

	/**
	 * The feature id for the '<em><b>Transformation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_INTERNAL__TRANSFORMATION_NAME = INVOKE_TRANSFORMATION__TRANSFORMATION_NAME;

	/**
	 * The feature id for the '<em><b>Source Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_INTERNAL__SOURCE_MODELS = INVOKE_TRANSFORMATION__SOURCE_MODELS;

	/**
	 * The feature id for the '<em><b>Target Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_INTERNAL__TARGET_MODELS = INVOKE_TRANSFORMATION__TARGET_MODELS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_INTERNAL__PARAMETERS = INVOKE_TRANSFORMATION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Input View Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_INTERNAL__INPUT_VIEW_FILTER = INVOKE_TRANSFORMATION__INPUT_VIEW_FILTER;

	/**
	 * The feature id for the '<em><b>Entry Point Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_INTERNAL__ENTRY_POINT_NAME = INVOKE_TRANSFORMATION__ENTRY_POINT_NAME;

	/**
	 * The feature id for the '<em><b>Entry Point Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_INTERNAL__ENTRY_POINT_PARAMETERS = INVOKE_TRANSFORMATION__ENTRY_POINT_PARAMETERS;

	/**
	 * The number of structural features of the '<em>Invoke Internal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_INTERNAL_FEATURE_COUNT = INVOKE_TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.qool.impl.InvocationParameterImpl <em>Invocation Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.qool.impl.InvocationParameterImpl
	 * @see org.eclectic.frontend.qool.impl.QoolPackageImpl#getInvocationParameter()
	 * @generated
	 */
	int INVOCATION_PARAMETER = 18;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_PARAMETER__MODEL = 0;

	/**
	 * The feature id for the '<em><b>Callee Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_PARAMETER__CALLEE_MODEL_NAME = 1;

	/**
	 * The number of structural features of the '<em>Invocation Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.qool.impl.NamedInvocationParameterImpl <em>Named Invocation Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.qool.impl.NamedInvocationParameterImpl
	 * @see org.eclectic.frontend.qool.impl.QoolPackageImpl#getNamedInvocationParameter()
	 * @generated
	 */
	int NAMED_INVOCATION_PARAMETER = 19;

	/**
	 * The feature id for the '<em><b>Formal Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_INVOCATION_PARAMETER__FORMAL_NAME = 0;

	/**
	 * The feature id for the '<em><b>Actual Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_INVOCATION_PARAMETER__ACTUAL_PARAMETER = 1;

	/**
	 * The number of structural features of the '<em>Named Invocation Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_INVOCATION_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.qool.QoolTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see org.eclectic.frontend.qool.QoolTransformation
	 * @generated
	 */
	EClass getQoolTransformation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.qool.QoolTransformation#getQueues <em>Queues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Queues</em>'.
	 * @see org.eclectic.frontend.qool.QoolTransformation#getQueues()
	 * @see #getQoolTransformation()
	 * @generated
	 */
	EReference getQoolTransformation_Queues();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.qool.QoolTransformation#getSegments <em>Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Segments</em>'.
	 * @see org.eclectic.frontend.qool.QoolTransformation#getSegments()
	 * @see #getQoolTransformation()
	 * @generated
	 */
	EReference getQoolTransformation_Segments();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.qool.QoolQueue <em>Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Queue</em>'.
	 * @see org.eclectic.frontend.qool.QoolQueue
	 * @generated
	 */
	EClass getQoolQueue();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.qool.QoolQueue#getOptimizations <em>Optimizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Optimizations</em>'.
	 * @see org.eclectic.frontend.qool.QoolQueue#getOptimizations()
	 * @see #getQoolQueue()
	 * @generated
	 */
	EReference getQoolQueue_Optimizations();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.qool.QueueOptimization <em>Queue Optimization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Queue Optimization</em>'.
	 * @see org.eclectic.frontend.qool.QueueOptimization
	 * @generated
	 */
	EClass getQueueOptimization();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.qool.AccessByFeatureOptimization <em>Access By Feature Optimization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access By Feature Optimization</em>'.
	 * @see org.eclectic.frontend.qool.AccessByFeatureOptimization
	 * @generated
	 */
	EClass getAccessByFeatureOptimization();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.qool.AccessByFeatureOptimization#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see org.eclectic.frontend.qool.AccessByFeatureOptimization#getFeatureName()
	 * @see #getAccessByFeatureOptimization()
	 * @generated
	 */
	EAttribute getAccessByFeatureOptimization_FeatureName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.qool.AccessByFeatureOptimization#isForce <em>Force</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Force</em>'.
	 * @see org.eclectic.frontend.qool.AccessByFeatureOptimization#isForce()
	 * @see #getAccessByFeatureOptimization()
	 * @generated
	 */
	EAttribute getAccessByFeatureOptimization_Force();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.qool.LocalQueue <em>Local Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Queue</em>'.
	 * @see org.eclectic.frontend.qool.LocalQueue
	 * @generated
	 */
	EClass getLocalQueue();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.qool.LocalQueue#getType_ <em>Type </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type </em>'.
	 * @see org.eclectic.frontend.qool.LocalQueue#getType_()
	 * @see #getLocalQueue()
	 * @generated
	 */
	EReference getLocalQueue_Type_();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.qool.ModelElementQueue <em>Model Element Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element Queue</em>'.
	 * @see org.eclectic.frontend.qool.ModelElementQueue
	 * @generated
	 */
	EClass getModelElementQueue();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.qool.ModelElementQueue#getClass_ <em>Class </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Class </em>'.
	 * @see org.eclectic.frontend.qool.ModelElementQueue#getClass_()
	 * @see #getModelElementQueue()
	 * @generated
	 */
	EReference getModelElementQueue_Class_();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.qool.ModelElementQueue#getAdditionals <em>Additionals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additionals</em>'.
	 * @see org.eclectic.frontend.qool.ModelElementQueue#getAdditionals()
	 * @see #getModelElementQueue()
	 * @generated
	 */
	EReference getModelElementQueue_Additionals();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.qool.Segment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Segment</em>'.
	 * @see org.eclectic.frontend.qool.Segment
	 * @generated
	 */
	EClass getSegment();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.qool.Segment#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see org.eclectic.frontend.qool.Segment#getStatements()
	 * @see #getSegment()
	 * @generated
	 */
	EReference getSegment_Statements();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.qool.IteratorStatement <em>Iterator Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterator Statement</em>'.
	 * @see org.eclectic.frontend.qool.IteratorStatement
	 * @generated
	 */
	EClass getIteratorStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.qool.IteratorStatement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.eclectic.frontend.qool.IteratorStatement#getCondition()
	 * @see #getIteratorStatement()
	 * @generated
	 */
	EReference getIteratorStatement_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.qool.IteratorStatement#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see org.eclectic.frontend.qool.IteratorStatement#getStatements()
	 * @see #getIteratorStatement()
	 * @generated
	 */
	EReference getIteratorStatement_Statements();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.qool.ForAllStatement <em>For All Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For All Statement</em>'.
	 * @see org.eclectic.frontend.qool.ForAllStatement
	 * @generated
	 */
	EClass getForAllStatement();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.frontend.qool.ForAllStatement#getQueue <em>Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Queue</em>'.
	 * @see org.eclectic.frontend.qool.ForAllStatement#getQueue()
	 * @see #getForAllStatement()
	 * @generated
	 */
	EReference getForAllStatement_Queue();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.qool.ForEachStatement <em>For Each Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Each Statement</em>'.
	 * @see org.eclectic.frontend.qool.ForEachStatement
	 * @generated
	 */
	EClass getForEachStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.qool.ForEachStatement#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collection</em>'.
	 * @see org.eclectic.frontend.qool.ForEachStatement#getCollection()
	 * @see #getForEachStatement()
	 * @generated
	 */
	EReference getForEachStatement_Collection();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.qool.EmitStatement <em>Emit Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emit Statement</em>'.
	 * @see org.eclectic.frontend.qool.EmitStatement
	 * @generated
	 */
	EClass getEmitStatement();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.frontend.qool.EmitStatement#getQueue <em>Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Queue</em>'.
	 * @see org.eclectic.frontend.qool.EmitStatement#getQueue()
	 * @see #getEmitStatement()
	 * @generated
	 */
	EReference getEmitStatement_Queue();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.qool.EmitStatement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.eclectic.frontend.qool.EmitStatement#getValue()
	 * @see #getEmitStatement()
	 * @generated
	 */
	EReference getEmitStatement_Value();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.qool.MatchExpression <em>Match Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match Expression</em>'.
	 * @see org.eclectic.frontend.qool.MatchExpression
	 * @generated
	 */
	EClass getMatchExpression();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.frontend.qool.MatchExpression#getQueue <em>Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Queue</em>'.
	 * @see org.eclectic.frontend.qool.MatchExpression#getQueue()
	 * @see #getMatchExpression()
	 * @generated
	 */
	EReference getMatchExpression_Queue();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.qool.MatchExpression#getPredicates <em>Predicates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Predicates</em>'.
	 * @see org.eclectic.frontend.qool.MatchExpression#getPredicates()
	 * @see #getMatchExpression()
	 * @generated
	 */
	EReference getMatchExpression_Predicates();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.qool.MatchPredicate <em>Match Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match Predicate</em>'.
	 * @see org.eclectic.frontend.qool.MatchPredicate
	 * @generated
	 */
	EClass getMatchPredicate();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.qool.KindOfPredicate <em>Kind Of Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kind Of Predicate</em>'.
	 * @see org.eclectic.frontend.qool.KindOfPredicate
	 * @generated
	 */
	EClass getKindOfPredicate();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.qool.KindOfPredicate#getClass_ <em>Class </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Class </em>'.
	 * @see org.eclectic.frontend.qool.KindOfPredicate#getClass_()
	 * @see #getKindOfPredicate()
	 * @generated
	 */
	EReference getKindOfPredicate_Class_();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.qool.PropertyEqualsPredicate <em>Property Equals Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Equals Predicate</em>'.
	 * @see org.eclectic.frontend.qool.PropertyEqualsPredicate
	 * @generated
	 */
	EClass getPropertyEqualsPredicate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.qool.PropertyEqualsPredicate#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see org.eclectic.frontend.qool.PropertyEqualsPredicate#getPropertyName()
	 * @see #getPropertyEqualsPredicate()
	 * @generated
	 */
	EAttribute getPropertyEqualsPredicate_PropertyName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.qool.PropertyEqualsPredicate#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.eclectic.frontend.qool.PropertyEqualsPredicate#getValue()
	 * @see #getPropertyEqualsPredicate()
	 * @generated
	 */
	EReference getPropertyEqualsPredicate_Value();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.qool.InvokeTransformation <em>Invoke Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invoke Transformation</em>'.
	 * @see org.eclectic.frontend.qool.InvokeTransformation
	 * @generated
	 */
	EClass getInvokeTransformation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.qool.InvokeTransformation#getTransformationName <em>Transformation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformation Name</em>'.
	 * @see org.eclectic.frontend.qool.InvokeTransformation#getTransformationName()
	 * @see #getInvokeTransformation()
	 * @generated
	 */
	EAttribute getInvokeTransformation_TransformationName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.qool.InvokeTransformation#getSourceModels <em>Source Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Models</em>'.
	 * @see org.eclectic.frontend.qool.InvokeTransformation#getSourceModels()
	 * @see #getInvokeTransformation()
	 * @generated
	 */
	EReference getInvokeTransformation_SourceModels();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.qool.InvokeTransformation#getTargetModels <em>Target Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target Models</em>'.
	 * @see org.eclectic.frontend.qool.InvokeTransformation#getTargetModels()
	 * @see #getInvokeTransformation()
	 * @generated
	 */
	EReference getInvokeTransformation_TargetModels();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.qool.InvokeTransformation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.eclectic.frontend.qool.InvokeTransformation#getParameters()
	 * @see #getInvokeTransformation()
	 * @generated
	 */
	EReference getInvokeTransformation_Parameters();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.frontend.qool.InvokeTransformation#getInputViewFilter <em>Input View Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input View Filter</em>'.
	 * @see org.eclectic.frontend.qool.InvokeTransformation#getInputViewFilter()
	 * @see #getInvokeTransformation()
	 * @generated
	 */
	EReference getInvokeTransformation_InputViewFilter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.qool.InvokeTransformation#getEntryPointName <em>Entry Point Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entry Point Name</em>'.
	 * @see org.eclectic.frontend.qool.InvokeTransformation#getEntryPointName()
	 * @see #getInvokeTransformation()
	 * @generated
	 */
	EAttribute getInvokeTransformation_EntryPointName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.qool.InvokeTransformation#getEntryPointParameters <em>Entry Point Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry Point Parameters</em>'.
	 * @see org.eclectic.frontend.qool.InvokeTransformation#getEntryPointParameters()
	 * @see #getInvokeTransformation()
	 * @generated
	 */
	EReference getInvokeTransformation_EntryPointParameters();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.qool.InvokeExternal <em>Invoke External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invoke External</em>'.
	 * @see org.eclectic.frontend.qool.InvokeExternal
	 * @generated
	 */
	EClass getInvokeExternal();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.qool.InvokeExternal#getOutputResolutionSourceElement <em>Output Resolution Source Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Resolution Source Element</em>'.
	 * @see org.eclectic.frontend.qool.InvokeExternal#getOutputResolutionSourceElement()
	 * @see #getInvokeExternal()
	 * @generated
	 */
	EReference getInvokeExternal_OutputResolutionSourceElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.qool.InvokeExternal#getQueueName <em>Queue Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Queue Name</em>'.
	 * @see org.eclectic.frontend.qool.InvokeExternal#getQueueName()
	 * @see #getInvokeExternal()
	 * @generated
	 */
	EAttribute getInvokeExternal_QueueName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.qool.InvokeExternal#getTraceAttributeName <em>Trace Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trace Attribute Name</em>'.
	 * @see org.eclectic.frontend.qool.InvokeExternal#getTraceAttributeName()
	 * @see #getInvokeExternal()
	 * @generated
	 */
	EAttribute getInvokeExternal_TraceAttributeName();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.qool.InvokeInternal <em>Invoke Internal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invoke Internal</em>'.
	 * @see org.eclectic.frontend.qool.InvokeInternal
	 * @generated
	 */
	EClass getInvokeInternal();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.qool.InvocationParameter <em>Invocation Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invocation Parameter</em>'.
	 * @see org.eclectic.frontend.qool.InvocationParameter
	 * @generated
	 */
	EClass getInvocationParameter();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.frontend.qool.InvocationParameter#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see org.eclectic.frontend.qool.InvocationParameter#getModel()
	 * @see #getInvocationParameter()
	 * @generated
	 */
	EReference getInvocationParameter_Model();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.qool.InvocationParameter#getCalleeModelName <em>Callee Model Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Callee Model Name</em>'.
	 * @see org.eclectic.frontend.qool.InvocationParameter#getCalleeModelName()
	 * @see #getInvocationParameter()
	 * @generated
	 */
	EAttribute getInvocationParameter_CalleeModelName();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.qool.NamedInvocationParameter <em>Named Invocation Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Invocation Parameter</em>'.
	 * @see org.eclectic.frontend.qool.NamedInvocationParameter
	 * @generated
	 */
	EClass getNamedInvocationParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.frontend.qool.NamedInvocationParameter#getFormalName <em>Formal Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formal Name</em>'.
	 * @see org.eclectic.frontend.qool.NamedInvocationParameter#getFormalName()
	 * @see #getNamedInvocationParameter()
	 * @generated
	 */
	EAttribute getNamedInvocationParameter_FormalName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.frontend.qool.NamedInvocationParameter#getActualParameter <em>Actual Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Actual Parameter</em>'.
	 * @see org.eclectic.frontend.qool.NamedInvocationParameter#getActualParameter()
	 * @see #getNamedInvocationParameter()
	 * @generated
	 */
	EReference getNamedInvocationParameter_ActualParameter();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QoolFactory getQoolFactory();

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
		 * The meta object literal for the '{@link org.eclectic.frontend.qool.impl.QoolTransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.qool.impl.QoolTransformationImpl
		 * @see org.eclectic.frontend.qool.impl.QoolPackageImpl#getQoolTransformation()
		 * @generated
		 */
		EClass QOOL_TRANSFORMATION = eINSTANCE.getQoolTransformation();

		/**
		 * The meta object literal for the '<em><b>Queues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QOOL_TRANSFORMATION__QUEUES = eINSTANCE.getQoolTransformation_Queues();

		/**
		 * The meta object literal for the '<em><b>Segments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QOOL_TRANSFORMATION__SEGMENTS = eINSTANCE.getQoolTransformation_Segments();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.qool.impl.QoolQueueImpl <em>Queue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.qool.impl.QoolQueueImpl
		 * @see org.eclectic.frontend.qool.impl.QoolPackageImpl#getQoolQueue()
		 * @generated
		 */
		EClass QOOL_QUEUE = eINSTANCE.getQoolQueue();

		/**
		 * The meta object literal for the '<em><b>Optimizations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QOOL_QUEUE__OPTIMIZATIONS = eINSTANCE.getQoolQueue_Optimizations();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.qool.impl.QueueOptimizationImpl <em>Queue Optimization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.qool.impl.QueueOptimizationImpl
		 * @see org.eclectic.frontend.qool.impl.QoolPackageImpl#getQueueOptimization()
		 * @generated
		 */
		EClass QUEUE_OPTIMIZATION = eINSTANCE.getQueueOptimization();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.qool.impl.AccessByFeatureOptimizationImpl <em>Access By Feature Optimization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.qool.impl.AccessByFeatureOptimizationImpl
		 * @see org.eclectic.frontend.qool.impl.QoolPackageImpl#getAccessByFeatureOptimization()
		 * @generated
		 */
		EClass ACCESS_BY_FEATURE_OPTIMIZATION = eINSTANCE.getAccessByFeatureOptimization();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_BY_FEATURE_OPTIMIZATION__FEATURE_NAME = eINSTANCE.getAccessByFeatureOptimization_FeatureName();

		/**
		 * The meta object literal for the '<em><b>Force</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_BY_FEATURE_OPTIMIZATION__FORCE = eINSTANCE.getAccessByFeatureOptimization_Force();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.qool.impl.LocalQueueImpl <em>Local Queue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.qool.impl.LocalQueueImpl
		 * @see org.eclectic.frontend.qool.impl.QoolPackageImpl#getLocalQueue()
		 * @generated
		 */
		EClass LOCAL_QUEUE = eINSTANCE.getLocalQueue();

		/**
		 * The meta object literal for the '<em><b>Type </b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_QUEUE__TYPE_ = eINSTANCE.getLocalQueue_Type_();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.qool.impl.ModelElementQueueImpl <em>Model Element Queue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.qool.impl.ModelElementQueueImpl
		 * @see org.eclectic.frontend.qool.impl.QoolPackageImpl#getModelElementQueue()
		 * @generated
		 */
		EClass MODEL_ELEMENT_QUEUE = eINSTANCE.getModelElementQueue();

		/**
		 * The meta object literal for the '<em><b>Class </b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT_QUEUE__CLASS_ = eINSTANCE.getModelElementQueue_Class_();

		/**
		 * The meta object literal for the '<em><b>Additionals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT_QUEUE__ADDITIONALS = eINSTANCE.getModelElementQueue_Additionals();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.qool.impl.SegmentImpl <em>Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.qool.impl.SegmentImpl
		 * @see org.eclectic.frontend.qool.impl.QoolPackageImpl#getSegment()
		 * @generated
		 */
		EClass SEGMENT = eINSTANCE.getSegment();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGMENT__STATEMENTS = eINSTANCE.getSegment_Statements();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.qool.impl.IteratorStatementImpl <em>Iterator Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.qool.impl.IteratorStatementImpl
		 * @see org.eclectic.frontend.qool.impl.QoolPackageImpl#getIteratorStatement()
		 * @generated
		 */
		EClass ITERATOR_STATEMENT = eINSTANCE.getIteratorStatement();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATOR_STATEMENT__CONDITION = eINSTANCE.getIteratorStatement_Condition();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATOR_STATEMENT__STATEMENTS = eINSTANCE.getIteratorStatement_Statements();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.qool.impl.ForAllStatementImpl <em>For All Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.qool.impl.ForAllStatementImpl
		 * @see org.eclectic.frontend.qool.impl.QoolPackageImpl#getForAllStatement()
		 * @generated
		 */
		EClass FOR_ALL_STATEMENT = eINSTANCE.getForAllStatement();

		/**
		 * The meta object literal for the '<em><b>Queue</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_ALL_STATEMENT__QUEUE = eINSTANCE.getForAllStatement_Queue();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.qool.impl.ForEachStatementImpl <em>For Each Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.qool.impl.ForEachStatementImpl
		 * @see org.eclectic.frontend.qool.impl.QoolPackageImpl#getForEachStatement()
		 * @generated
		 */
		EClass FOR_EACH_STATEMENT = eINSTANCE.getForEachStatement();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_EACH_STATEMENT__COLLECTION = eINSTANCE.getForEachStatement_Collection();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.qool.impl.EmitStatementImpl <em>Emit Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.qool.impl.EmitStatementImpl
		 * @see org.eclectic.frontend.qool.impl.QoolPackageImpl#getEmitStatement()
		 * @generated
		 */
		EClass EMIT_STATEMENT = eINSTANCE.getEmitStatement();

		/**
		 * The meta object literal for the '<em><b>Queue</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMIT_STATEMENT__QUEUE = eINSTANCE.getEmitStatement_Queue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMIT_STATEMENT__VALUE = eINSTANCE.getEmitStatement_Value();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.qool.impl.MatchExpressionImpl <em>Match Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.qool.impl.MatchExpressionImpl
		 * @see org.eclectic.frontend.qool.impl.QoolPackageImpl#getMatchExpression()
		 * @generated
		 */
		EClass MATCH_EXPRESSION = eINSTANCE.getMatchExpression();

		/**
		 * The meta object literal for the '<em><b>Queue</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH_EXPRESSION__QUEUE = eINSTANCE.getMatchExpression_Queue();

		/**
		 * The meta object literal for the '<em><b>Predicates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH_EXPRESSION__PREDICATES = eINSTANCE.getMatchExpression_Predicates();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.qool.impl.MatchPredicateImpl <em>Match Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.qool.impl.MatchPredicateImpl
		 * @see org.eclectic.frontend.qool.impl.QoolPackageImpl#getMatchPredicate()
		 * @generated
		 */
		EClass MATCH_PREDICATE = eINSTANCE.getMatchPredicate();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.qool.impl.KindOfPredicateImpl <em>Kind Of Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.qool.impl.KindOfPredicateImpl
		 * @see org.eclectic.frontend.qool.impl.QoolPackageImpl#getKindOfPredicate()
		 * @generated
		 */
		EClass KIND_OF_PREDICATE = eINSTANCE.getKindOfPredicate();

		/**
		 * The meta object literal for the '<em><b>Class </b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KIND_OF_PREDICATE__CLASS_ = eINSTANCE.getKindOfPredicate_Class_();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.qool.impl.PropertyEqualsPredicateImpl <em>Property Equals Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.qool.impl.PropertyEqualsPredicateImpl
		 * @see org.eclectic.frontend.qool.impl.QoolPackageImpl#getPropertyEqualsPredicate()
		 * @generated
		 */
		EClass PROPERTY_EQUALS_PREDICATE = eINSTANCE.getPropertyEqualsPredicate();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_EQUALS_PREDICATE__PROPERTY_NAME = eINSTANCE.getPropertyEqualsPredicate_PropertyName();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_EQUALS_PREDICATE__VALUE = eINSTANCE.getPropertyEqualsPredicate_Value();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.qool.impl.InvokeTransformationImpl <em>Invoke Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.qool.impl.InvokeTransformationImpl
		 * @see org.eclectic.frontend.qool.impl.QoolPackageImpl#getInvokeTransformation()
		 * @generated
		 */
		EClass INVOKE_TRANSFORMATION = eINSTANCE.getInvokeTransformation();

		/**
		 * The meta object literal for the '<em><b>Transformation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOKE_TRANSFORMATION__TRANSFORMATION_NAME = eINSTANCE.getInvokeTransformation_TransformationName();

		/**
		 * The meta object literal for the '<em><b>Source Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOKE_TRANSFORMATION__SOURCE_MODELS = eINSTANCE.getInvokeTransformation_SourceModels();

		/**
		 * The meta object literal for the '<em><b>Target Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOKE_TRANSFORMATION__TARGET_MODELS = eINSTANCE.getInvokeTransformation_TargetModels();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOKE_TRANSFORMATION__PARAMETERS = eINSTANCE.getInvokeTransformation_Parameters();

		/**
		 * The meta object literal for the '<em><b>Input View Filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOKE_TRANSFORMATION__INPUT_VIEW_FILTER = eINSTANCE.getInvokeTransformation_InputViewFilter();

		/**
		 * The meta object literal for the '<em><b>Entry Point Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOKE_TRANSFORMATION__ENTRY_POINT_NAME = eINSTANCE.getInvokeTransformation_EntryPointName();

		/**
		 * The meta object literal for the '<em><b>Entry Point Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOKE_TRANSFORMATION__ENTRY_POINT_PARAMETERS = eINSTANCE.getInvokeTransformation_EntryPointParameters();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.qool.impl.InvokeExternalImpl <em>Invoke External</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.qool.impl.InvokeExternalImpl
		 * @see org.eclectic.frontend.qool.impl.QoolPackageImpl#getInvokeExternal()
		 * @generated
		 */
		EClass INVOKE_EXTERNAL = eINSTANCE.getInvokeExternal();

		/**
		 * The meta object literal for the '<em><b>Output Resolution Source Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOKE_EXTERNAL__OUTPUT_RESOLUTION_SOURCE_ELEMENT = eINSTANCE.getInvokeExternal_OutputResolutionSourceElement();

		/**
		 * The meta object literal for the '<em><b>Queue Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOKE_EXTERNAL__QUEUE_NAME = eINSTANCE.getInvokeExternal_QueueName();

		/**
		 * The meta object literal for the '<em><b>Trace Attribute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOKE_EXTERNAL__TRACE_ATTRIBUTE_NAME = eINSTANCE.getInvokeExternal_TraceAttributeName();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.qool.impl.InvokeInternalImpl <em>Invoke Internal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.qool.impl.InvokeInternalImpl
		 * @see org.eclectic.frontend.qool.impl.QoolPackageImpl#getInvokeInternal()
		 * @generated
		 */
		EClass INVOKE_INTERNAL = eINSTANCE.getInvokeInternal();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.qool.impl.InvocationParameterImpl <em>Invocation Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.qool.impl.InvocationParameterImpl
		 * @see org.eclectic.frontend.qool.impl.QoolPackageImpl#getInvocationParameter()
		 * @generated
		 */
		EClass INVOCATION_PARAMETER = eINSTANCE.getInvocationParameter();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOCATION_PARAMETER__MODEL = eINSTANCE.getInvocationParameter_Model();

		/**
		 * The meta object literal for the '<em><b>Callee Model Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOCATION_PARAMETER__CALLEE_MODEL_NAME = eINSTANCE.getInvocationParameter_CalleeModelName();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.qool.impl.NamedInvocationParameterImpl <em>Named Invocation Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.qool.impl.NamedInvocationParameterImpl
		 * @see org.eclectic.frontend.qool.impl.QoolPackageImpl#getNamedInvocationParameter()
		 * @generated
		 */
		EClass NAMED_INVOCATION_PARAMETER = eINSTANCE.getNamedInvocationParameter();

		/**
		 * The meta object literal for the '<em><b>Formal Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_INVOCATION_PARAMETER__FORMAL_NAME = eINSTANCE.getNamedInvocationParameter_FormalName();

		/**
		 * The meta object literal for the '<em><b>Actual Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_INVOCATION_PARAMETER__ACTUAL_PARAMETER = eINSTANCE.getNamedInvocationParameter_ActualParameter();

	}

} //QoolPackage
