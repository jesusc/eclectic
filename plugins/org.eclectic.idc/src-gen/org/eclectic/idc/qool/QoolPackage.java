/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.qool;

import org.eclectic.idc.core.CorePackage;

import org.eclectic.idc.instr.InstrPackage;
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
 * @see org.eclectic.idc.qool.QoolFactory
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
	String eNS_URI = "http://eclectic.org/idc/qool";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "idc_ast_qool";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QoolPackage eINSTANCE = org.eclectic.idc.qool.impl.QoolPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclectic.idc.qool.impl.QoolTransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.qool.impl.QoolTransformationImpl
	 * @see org.eclectic.idc.qool.impl.QoolPackageImpl#getQoolTransformation()
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
	int QOOL_TRANSFORMATION__ROW = CorePackage.EXECUTABLE_UNIT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOOL_TRANSFORMATION__COLUMN = CorePackage.EXECUTABLE_UNIT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOOL_TRANSFORMATION__FILE = CorePackage.EXECUTABLE_UNIT__FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOOL_TRANSFORMATION__NAME = CorePackage.EXECUTABLE_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOOL_TRANSFORMATION__QUALIFIER = CorePackage.EXECUTABLE_UNIT__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOOL_TRANSFORMATION__MAIN = CorePackage.EXECUTABLE_UNIT__MAIN;

	/**
	 * The feature id for the '<em><b>Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOOL_TRANSFORMATION__MODELS = CorePackage.EXECUTABLE_UNIT__MODELS;

	/**
	 * The feature id for the '<em><b>Additional Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOOL_TRANSFORMATION__ADDITIONAL_MODELS = CorePackage.EXECUTABLE_UNIT__ADDITIONAL_MODELS;

	/**
	 * The feature id for the '<em><b>Imported Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOOL_TRANSFORMATION__IMPORTED_MODELS = CorePackage.EXECUTABLE_UNIT__IMPORTED_MODELS;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOOL_TRANSFORMATION__REQUIRES = CorePackage.EXECUTABLE_UNIT__REQUIRES;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOOL_TRANSFORMATION__PRE = CorePackage.EXECUTABLE_UNIT__PRE;

	/**
	 * The feature id for the '<em><b>Post</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOOL_TRANSFORMATION__POST = CorePackage.EXECUTABLE_UNIT__POST;

	/**
	 * The feature id for the '<em><b>Segments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOOL_TRANSFORMATION__SEGMENTS = CorePackage.EXECUTABLE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Queues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOOL_TRANSFORMATION__QUEUES = CorePackage.EXECUTABLE_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Provided</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOOL_TRANSFORMATION__PROVIDED = CorePackage.EXECUTABLE_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Inline Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOOL_TRANSFORMATION__INLINE_MODELS = CorePackage.EXECUTABLE_UNIT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOOL_TRANSFORMATION_FEATURE_COUNT = CorePackage.EXECUTABLE_UNIT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.qool.impl.InlineModelImpl <em>Inline Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.qool.impl.InlineModelImpl
	 * @see org.eclectic.idc.qool.impl.QoolPackageImpl#getInlineModel()
	 * @generated
	 */
	int INLINE_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_MODEL__NAME = CorePackage.MODEL_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_MODEL__KIND = CorePackage.MODEL_DEFINITION__KIND;

	/**
	 * The feature id for the '<em><b>Included Libraries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_MODEL__INCLUDED_LIBRARIES = CorePackage.MODEL_DEFINITION__INCLUDED_LIBRARIES;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_MODEL__METAMODEL = CorePackage.MODEL_DEFINITION__METAMODEL;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_MODEL__CLASSIFIERS = CorePackage.MODEL_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inline Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_MODEL_FEATURE_COUNT = CorePackage.MODEL_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.qool.impl.SegmentImpl <em>Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.qool.impl.SegmentImpl
	 * @see org.eclectic.idc.qool.impl.QoolPackageImpl#getSegment()
	 * @generated
	 */
	int SEGMENT = 2;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__INSTRUCTIONS = CorePackage.INSTRUCTION_BLOCK__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__NAME = CorePackage.INSTRUCTION_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_FEATURE_COUNT = CorePackage.INSTRUCTION_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.qool.impl.QueueImpl <em>Queue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.qool.impl.QueueImpl
	 * @see org.eclectic.idc.qool.impl.QoolPackageImpl#getQueue()
	 * @generated
	 */
	int QUEUE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Optimizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE__OPTIMIZATIONS = 1;

	/**
	 * The number of structural features of the '<em>Queue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.qool.impl.QueueOptimizationImpl <em>Queue Optimization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.qool.impl.QueueOptimizationImpl
	 * @see org.eclectic.idc.qool.impl.QoolPackageImpl#getQueueOptimization()
	 * @generated
	 */
	int QUEUE_OPTIMIZATION = 4;

	/**
	 * The number of structural features of the '<em>Queue Optimization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_OPTIMIZATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.qool.impl.AccessByFeatureOptimizationImpl <em>Access By Feature Optimization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.qool.impl.AccessByFeatureOptimizationImpl
	 * @see org.eclectic.idc.qool.impl.QoolPackageImpl#getAccessByFeatureOptimization()
	 * @generated
	 */
	int ACCESS_BY_FEATURE_OPTIMIZATION = 5;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_BY_FEATURE_OPTIMIZATION__FEATURE_NAME = QUEUE_OPTIMIZATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Speculative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_BY_FEATURE_OPTIMIZATION__SPECULATIVE = QUEUE_OPTIMIZATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Access By Feature Optimization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_BY_FEATURE_OPTIMIZATION_FEATURE_COUNT = QUEUE_OPTIMIZATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.qool.impl.ModelElementQueueImpl <em>Model Element Queue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.qool.impl.ModelElementQueueImpl
	 * @see org.eclectic.idc.qool.impl.QoolPackageImpl#getModelElementQueue()
	 * @generated
	 */
	int MODEL_ELEMENT_QUEUE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_QUEUE__NAME = QUEUE__NAME;

	/**
	 * The feature id for the '<em><b>Optimizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_QUEUE__OPTIMIZATIONS = QUEUE__OPTIMIZATIONS;

	/**
	 * The feature id for the '<em><b>Type </b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_QUEUE__TYPE_ = QUEUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Additionals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_QUEUE__ADDITIONALS = QUEUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_QUEUE__EXTENSION = QUEUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Model Element Queue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_QUEUE_FEATURE_COUNT = QUEUE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.qool.impl.LocalQueueImpl <em>Local Queue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.qool.impl.LocalQueueImpl
	 * @see org.eclectic.idc.qool.impl.QoolPackageImpl#getLocalQueue()
	 * @generated
	 */
	int LOCAL_QUEUE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_QUEUE__NAME = QUEUE__NAME;

	/**
	 * The feature id for the '<em><b>Optimizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_QUEUE__OPTIMIZATIONS = QUEUE__OPTIMIZATIONS;

	/**
	 * The feature id for the '<em><b>Type </b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_QUEUE__TYPE_ = QUEUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Local Queue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_QUEUE_FEATURE_COUNT = QUEUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.qool.impl.RequiredQueueImpl <em>Required Queue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.qool.impl.RequiredQueueImpl
	 * @see org.eclectic.idc.qool.impl.QoolPackageImpl#getRequiredQueue()
	 * @generated
	 */
	int REQUIRED_QUEUE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_QUEUE__NAME = QUEUE__NAME;

	/**
	 * The feature id for the '<em><b>Optimizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_QUEUE__OPTIMIZATIONS = QUEUE__OPTIMIZATIONS;

	/**
	 * The feature id for the '<em><b>Imported Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_QUEUE__IMPORTED_MODEL = QUEUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Required Queue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_QUEUE_FEATURE_COUNT = QUEUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.qool.impl.QIteratorImpl <em>QIterator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.qool.impl.QIteratorImpl
	 * @see org.eclectic.idc.qool.impl.QoolPackageImpl#getQIterator()
	 * @generated
	 */
	int QITERATOR = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QITERATOR__NAME = CorePackage.VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QITERATOR__TYPE = CorePackage.VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Get Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QITERATOR__GET_RECEPTORS = CorePackage.VARIABLE__GET_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Set Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QITERATOR__SET_RECEPTORS = CorePackage.VARIABLE__SET_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Set Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QITERATOR__SET_VALUES = CorePackage.VARIABLE__SET_VALUES;

	/**
	 * The feature id for the '<em><b>Assign Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QITERATOR__ASSIGN_VARIABLES = CorePackage.VARIABLE__ASSIGN_VARIABLES;

	/**
	 * The feature id for the '<em><b>If Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QITERATOR__IF_CONDITIONS = CorePackage.VARIABLE__IF_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Call Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QITERATOR__CALL_RECEPTORS = CorePackage.VARIABLE__CALL_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Call Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QITERATOR__CALL_PARAMETERS = CorePackage.VARIABLE__CALL_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Emit Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QITERATOR__EMIT_VALUES = CorePackage.VARIABLE__EMIT_VALUES;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QITERATOR__ROW = CorePackage.VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QITERATOR__COLUMN = CorePackage.VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QITERATOR__FILE = CorePackage.VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QITERATOR__INSTRUCTIONS = CorePackage.VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>QIterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QITERATOR_FEATURE_COUNT = CorePackage.VARIABLE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.qool.impl.QForAllImpl <em>QFor All</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.qool.impl.QForAllImpl
	 * @see org.eclectic.idc.qool.impl.QoolPackageImpl#getQForAll()
	 * @generated
	 */
	int QFOR_ALL = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QFOR_ALL__NAME = QITERATOR__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QFOR_ALL__TYPE = QITERATOR__TYPE;

	/**
	 * The feature id for the '<em><b>Get Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QFOR_ALL__GET_RECEPTORS = QITERATOR__GET_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Set Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QFOR_ALL__SET_RECEPTORS = QITERATOR__SET_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Set Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QFOR_ALL__SET_VALUES = QITERATOR__SET_VALUES;

	/**
	 * The feature id for the '<em><b>Assign Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QFOR_ALL__ASSIGN_VARIABLES = QITERATOR__ASSIGN_VARIABLES;

	/**
	 * The feature id for the '<em><b>If Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QFOR_ALL__IF_CONDITIONS = QITERATOR__IF_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Call Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QFOR_ALL__CALL_RECEPTORS = QITERATOR__CALL_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Call Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QFOR_ALL__CALL_PARAMETERS = QITERATOR__CALL_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Emit Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QFOR_ALL__EMIT_VALUES = QITERATOR__EMIT_VALUES;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QFOR_ALL__ROW = QITERATOR__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QFOR_ALL__COLUMN = QITERATOR__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QFOR_ALL__FILE = QITERATOR__FILE;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QFOR_ALL__INSTRUCTIONS = QITERATOR__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Queue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QFOR_ALL__QUEUE = QITERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>QFor All</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QFOR_ALL_FEATURE_COUNT = QITERATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.qool.impl.QEmitImpl <em>QEmit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.qool.impl.QEmitImpl
	 * @see org.eclectic.idc.qool.impl.QoolPackageImpl#getQEmit()
	 * @generated
	 */
	int QEMIT = 11;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QEMIT__ROW = CorePackage.INSTRUCTION__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QEMIT__COLUMN = CorePackage.INSTRUCTION__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QEMIT__FILE = CorePackage.INSTRUCTION__FILE;

	/**
	 * The feature id for the '<em><b>Queue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QEMIT__QUEUE = CorePackage.INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QEMIT__VALUE = CorePackage.INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>QEmit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QEMIT_FEATURE_COUNT = CorePackage.INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.qool.impl.QMatchImpl <em>QMatch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.qool.impl.QMatchImpl
	 * @see org.eclectic.idc.qool.impl.QoolPackageImpl#getQMatch()
	 * @generated
	 */
	int QMATCH = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QMATCH__NAME = InstrPackage.INSTRUCTION_WITH_RESULT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QMATCH__TYPE = InstrPackage.INSTRUCTION_WITH_RESULT__TYPE;

	/**
	 * The feature id for the '<em><b>Get Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QMATCH__GET_RECEPTORS = InstrPackage.INSTRUCTION_WITH_RESULT__GET_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Set Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QMATCH__SET_RECEPTORS = InstrPackage.INSTRUCTION_WITH_RESULT__SET_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Set Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QMATCH__SET_VALUES = InstrPackage.INSTRUCTION_WITH_RESULT__SET_VALUES;

	/**
	 * The feature id for the '<em><b>Assign Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QMATCH__ASSIGN_VARIABLES = InstrPackage.INSTRUCTION_WITH_RESULT__ASSIGN_VARIABLES;

	/**
	 * The feature id for the '<em><b>If Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QMATCH__IF_CONDITIONS = InstrPackage.INSTRUCTION_WITH_RESULT__IF_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Call Receptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QMATCH__CALL_RECEPTORS = InstrPackage.INSTRUCTION_WITH_RESULT__CALL_RECEPTORS;

	/**
	 * The feature id for the '<em><b>Call Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QMATCH__CALL_PARAMETERS = InstrPackage.INSTRUCTION_WITH_RESULT__CALL_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Emit Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QMATCH__EMIT_VALUES = InstrPackage.INSTRUCTION_WITH_RESULT__EMIT_VALUES;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QMATCH__ROW = InstrPackage.INSTRUCTION_WITH_RESULT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QMATCH__COLUMN = InstrPackage.INSTRUCTION_WITH_RESULT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QMATCH__FILE = InstrPackage.INSTRUCTION_WITH_RESULT__FILE;

	/**
	 * The feature id for the '<em><b>Queue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QMATCH__QUEUE = InstrPackage.INSTRUCTION_WITH_RESULT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Predicates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QMATCH__PREDICATES = InstrPackage.INSTRUCTION_WITH_RESULT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Getter Closure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QMATCH__GETTER_CLOSURE = InstrPackage.INSTRUCTION_WITH_RESULT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>QMatch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QMATCH_FEATURE_COUNT = InstrPackage.INSTRUCTION_WITH_RESULT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.qool.impl.QMatchPredicateImpl <em>QMatch Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.qool.impl.QMatchPredicateImpl
	 * @see org.eclectic.idc.qool.impl.QoolPackageImpl#getQMatchPredicate()
	 * @generated
	 */
	int QMATCH_PREDICATE = 13;

	/**
	 * The number of structural features of the '<em>QMatch Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QMATCH_PREDICATE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.qool.impl.KindOfPredicateImpl <em>Kind Of Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.qool.impl.KindOfPredicateImpl
	 * @see org.eclectic.idc.qool.impl.QoolPackageImpl#getKindOfPredicate()
	 * @generated
	 */
	int KIND_OF_PREDICATE = 14;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND_OF_PREDICATE__CLASS_NAME = QMATCH_PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND_OF_PREDICATE__MODEL = QMATCH_PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Kind Of Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIND_OF_PREDICATE_FEATURE_COUNT = QMATCH_PREDICATE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.qool.impl.PropertyEqualsPredicateImpl <em>Property Equals Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.qool.impl.PropertyEqualsPredicateImpl
	 * @see org.eclectic.idc.qool.impl.QoolPackageImpl#getPropertyEqualsPredicate()
	 * @generated
	 */
	int PROPERTY_EQUALS_PREDICATE = 15;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_EQUALS_PREDICATE__PROPERTY_NAME = QMATCH_PREDICATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_EQUALS_PREDICATE__VALUE = QMATCH_PREDICATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Property Equals Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_EQUALS_PREDICATE_FEATURE_COUNT = QMATCH_PREDICATE_FEATURE_COUNT + 2;

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.qool.QoolTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see org.eclectic.idc.qool.QoolTransformation
	 * @generated
	 */
	EClass getQoolTransformation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.idc.qool.QoolTransformation#getSegments <em>Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Segments</em>'.
	 * @see org.eclectic.idc.qool.QoolTransformation#getSegments()
	 * @see #getQoolTransformation()
	 * @generated
	 */
	EReference getQoolTransformation_Segments();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.idc.qool.QoolTransformation#getQueues <em>Queues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Queues</em>'.
	 * @see org.eclectic.idc.qool.QoolTransformation#getQueues()
	 * @see #getQoolTransformation()
	 * @generated
	 */
	EReference getQoolTransformation_Queues();

	/**
	 * Returns the meta object for the reference list '{@link org.eclectic.idc.qool.QoolTransformation#getProvided <em>Provided</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provided</em>'.
	 * @see org.eclectic.idc.qool.QoolTransformation#getProvided()
	 * @see #getQoolTransformation()
	 * @generated
	 */
	EReference getQoolTransformation_Provided();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.idc.qool.QoolTransformation#getInlineModels <em>Inline Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inline Models</em>'.
	 * @see org.eclectic.idc.qool.QoolTransformation#getInlineModels()
	 * @see #getQoolTransformation()
	 * @generated
	 */
	EReference getQoolTransformation_InlineModels();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.qool.InlineModel <em>Inline Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inline Model</em>'.
	 * @see org.eclectic.idc.qool.InlineModel
	 * @generated
	 */
	EClass getInlineModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.idc.qool.InlineModel#getClassifiers <em>Classifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classifiers</em>'.
	 * @see org.eclectic.idc.qool.InlineModel#getClassifiers()
	 * @see #getInlineModel()
	 * @generated
	 */
	EReference getInlineModel_Classifiers();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.qool.Segment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Segment</em>'.
	 * @see org.eclectic.idc.qool.Segment
	 * @generated
	 */
	EClass getSegment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.qool.Segment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclectic.idc.qool.Segment#getName()
	 * @see #getSegment()
	 * @generated
	 */
	EAttribute getSegment_Name();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.qool.Queue <em>Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Queue</em>'.
	 * @see org.eclectic.idc.qool.Queue
	 * @generated
	 */
	EClass getQueue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.qool.Queue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclectic.idc.qool.Queue#getName()
	 * @see #getQueue()
	 * @generated
	 */
	EAttribute getQueue_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.idc.qool.Queue#getOptimizations <em>Optimizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Optimizations</em>'.
	 * @see org.eclectic.idc.qool.Queue#getOptimizations()
	 * @see #getQueue()
	 * @generated
	 */
	EReference getQueue_Optimizations();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.qool.QueueOptimization <em>Queue Optimization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Queue Optimization</em>'.
	 * @see org.eclectic.idc.qool.QueueOptimization
	 * @generated
	 */
	EClass getQueueOptimization();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.qool.AccessByFeatureOptimization <em>Access By Feature Optimization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access By Feature Optimization</em>'.
	 * @see org.eclectic.idc.qool.AccessByFeatureOptimization
	 * @generated
	 */
	EClass getAccessByFeatureOptimization();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.qool.AccessByFeatureOptimization#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see org.eclectic.idc.qool.AccessByFeatureOptimization#getFeatureName()
	 * @see #getAccessByFeatureOptimization()
	 * @generated
	 */
	EAttribute getAccessByFeatureOptimization_FeatureName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.qool.AccessByFeatureOptimization#isSpeculative <em>Speculative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speculative</em>'.
	 * @see org.eclectic.idc.qool.AccessByFeatureOptimization#isSpeculative()
	 * @see #getAccessByFeatureOptimization()
	 * @generated
	 */
	EAttribute getAccessByFeatureOptimization_Speculative();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.qool.ModelElementQueue <em>Model Element Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element Queue</em>'.
	 * @see org.eclectic.idc.qool.ModelElementQueue
	 * @generated
	 */
	EClass getModelElementQueue();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.idc.qool.ModelElementQueue#getType_ <em>Type </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type </em>'.
	 * @see org.eclectic.idc.qool.ModelElementQueue#getType_()
	 * @see #getModelElementQueue()
	 * @generated
	 */
	EReference getModelElementQueue_Type_();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.idc.qool.ModelElementQueue#getAdditionals <em>Additionals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additionals</em>'.
	 * @see org.eclectic.idc.qool.ModelElementQueue#getAdditionals()
	 * @see #getModelElementQueue()
	 * @generated
	 */
	EReference getModelElementQueue_Additionals();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.idc.qool.ModelElementQueue#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extension</em>'.
	 * @see org.eclectic.idc.qool.ModelElementQueue#getExtension()
	 * @see #getModelElementQueue()
	 * @generated
	 */
	EReference getModelElementQueue_Extension();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.qool.LocalQueue <em>Local Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Queue</em>'.
	 * @see org.eclectic.idc.qool.LocalQueue
	 * @generated
	 */
	EClass getLocalQueue();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclectic.idc.qool.LocalQueue#getType_ <em>Type </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type </em>'.
	 * @see org.eclectic.idc.qool.LocalQueue#getType_()
	 * @see #getLocalQueue()
	 * @generated
	 */
	EReference getLocalQueue_Type_();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.qool.RequiredQueue <em>Required Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Queue</em>'.
	 * @see org.eclectic.idc.qool.RequiredQueue
	 * @generated
	 */
	EClass getRequiredQueue();

	/**
	 * Returns the meta object for the container reference '{@link org.eclectic.idc.qool.RequiredQueue#getImportedModel <em>Imported Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Imported Model</em>'.
	 * @see org.eclectic.idc.qool.RequiredQueue#getImportedModel()
	 * @see #getRequiredQueue()
	 * @generated
	 */
	EReference getRequiredQueue_ImportedModel();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.qool.QIterator <em>QIterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QIterator</em>'.
	 * @see org.eclectic.idc.qool.QIterator
	 * @generated
	 */
	EClass getQIterator();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.qool.QForAll <em>QFor All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QFor All</em>'.
	 * @see org.eclectic.idc.qool.QForAll
	 * @generated
	 */
	EClass getQForAll();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.idc.qool.QForAll#getQueue <em>Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Queue</em>'.
	 * @see org.eclectic.idc.qool.QForAll#getQueue()
	 * @see #getQForAll()
	 * @generated
	 */
	EReference getQForAll_Queue();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.qool.QEmit <em>QEmit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QEmit</em>'.
	 * @see org.eclectic.idc.qool.QEmit
	 * @generated
	 */
	EClass getQEmit();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.idc.qool.QEmit#getQueue <em>Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Queue</em>'.
	 * @see org.eclectic.idc.qool.QEmit#getQueue()
	 * @see #getQEmit()
	 * @generated
	 */
	EReference getQEmit_Queue();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.idc.qool.QEmit#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclectic.idc.qool.QEmit#getValue()
	 * @see #getQEmit()
	 * @generated
	 */
	EReference getQEmit_Value();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.qool.QMatch <em>QMatch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QMatch</em>'.
	 * @see org.eclectic.idc.qool.QMatch
	 * @generated
	 */
	EClass getQMatch();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.idc.qool.QMatch#getQueue <em>Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Queue</em>'.
	 * @see org.eclectic.idc.qool.QMatch#getQueue()
	 * @see #getQMatch()
	 * @generated
	 */
	EReference getQMatch_Queue();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.idc.qool.QMatch#getPredicates <em>Predicates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Predicates</em>'.
	 * @see org.eclectic.idc.qool.QMatch#getPredicates()
	 * @see #getQMatch()
	 * @generated
	 */
	EReference getQMatch_Predicates();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.idc.qool.QMatch#getGetterClosure <em>Getter Closure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Getter Closure</em>'.
	 * @see org.eclectic.idc.qool.QMatch#getGetterClosure()
	 * @see #getQMatch()
	 * @generated
	 */
	EReference getQMatch_GetterClosure();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.qool.QMatchPredicate <em>QMatch Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QMatch Predicate</em>'.
	 * @see org.eclectic.idc.qool.QMatchPredicate
	 * @generated
	 */
	EClass getQMatchPredicate();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.qool.KindOfPredicate <em>Kind Of Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kind Of Predicate</em>'.
	 * @see org.eclectic.idc.qool.KindOfPredicate
	 * @generated
	 */
	EClass getKindOfPredicate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.qool.KindOfPredicate#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.eclectic.idc.qool.KindOfPredicate#getClassName()
	 * @see #getKindOfPredicate()
	 * @generated
	 */
	EAttribute getKindOfPredicate_ClassName();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.idc.qool.KindOfPredicate#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see org.eclectic.idc.qool.KindOfPredicate#getModel()
	 * @see #getKindOfPredicate()
	 * @generated
	 */
	EReference getKindOfPredicate_Model();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.qool.PropertyEqualsPredicate <em>Property Equals Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Equals Predicate</em>'.
	 * @see org.eclectic.idc.qool.PropertyEqualsPredicate
	 * @generated
	 */
	EClass getPropertyEqualsPredicate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.qool.PropertyEqualsPredicate#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see org.eclectic.idc.qool.PropertyEqualsPredicate#getPropertyName()
	 * @see #getPropertyEqualsPredicate()
	 * @generated
	 */
	EAttribute getPropertyEqualsPredicate_PropertyName();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.idc.qool.PropertyEqualsPredicate#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.eclectic.idc.qool.PropertyEqualsPredicate#getValue()
	 * @see #getPropertyEqualsPredicate()
	 * @generated
	 */
	EReference getPropertyEqualsPredicate_Value();

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
		 * The meta object literal for the '{@link org.eclectic.idc.qool.impl.QoolTransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.qool.impl.QoolTransformationImpl
		 * @see org.eclectic.idc.qool.impl.QoolPackageImpl#getQoolTransformation()
		 * @generated
		 */
		EClass QOOL_TRANSFORMATION = eINSTANCE.getQoolTransformation();

		/**
		 * The meta object literal for the '<em><b>Segments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QOOL_TRANSFORMATION__SEGMENTS = eINSTANCE.getQoolTransformation_Segments();

		/**
		 * The meta object literal for the '<em><b>Queues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QOOL_TRANSFORMATION__QUEUES = eINSTANCE.getQoolTransformation_Queues();

		/**
		 * The meta object literal for the '<em><b>Provided</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QOOL_TRANSFORMATION__PROVIDED = eINSTANCE.getQoolTransformation_Provided();

		/**
		 * The meta object literal for the '<em><b>Inline Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QOOL_TRANSFORMATION__INLINE_MODELS = eINSTANCE.getQoolTransformation_InlineModels();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.qool.impl.InlineModelImpl <em>Inline Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.qool.impl.InlineModelImpl
		 * @see org.eclectic.idc.qool.impl.QoolPackageImpl#getInlineModel()
		 * @generated
		 */
		EClass INLINE_MODEL = eINSTANCE.getInlineModel();

		/**
		 * The meta object literal for the '<em><b>Classifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE_MODEL__CLASSIFIERS = eINSTANCE.getInlineModel_Classifiers();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.qool.impl.SegmentImpl <em>Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.qool.impl.SegmentImpl
		 * @see org.eclectic.idc.qool.impl.QoolPackageImpl#getSegment()
		 * @generated
		 */
		EClass SEGMENT = eINSTANCE.getSegment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEGMENT__NAME = eINSTANCE.getSegment_Name();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.qool.impl.QueueImpl <em>Queue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.qool.impl.QueueImpl
		 * @see org.eclectic.idc.qool.impl.QoolPackageImpl#getQueue()
		 * @generated
		 */
		EClass QUEUE = eINSTANCE.getQueue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUEUE__NAME = eINSTANCE.getQueue_Name();

		/**
		 * The meta object literal for the '<em><b>Optimizations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUEUE__OPTIMIZATIONS = eINSTANCE.getQueue_Optimizations();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.qool.impl.QueueOptimizationImpl <em>Queue Optimization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.qool.impl.QueueOptimizationImpl
		 * @see org.eclectic.idc.qool.impl.QoolPackageImpl#getQueueOptimization()
		 * @generated
		 */
		EClass QUEUE_OPTIMIZATION = eINSTANCE.getQueueOptimization();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.qool.impl.AccessByFeatureOptimizationImpl <em>Access By Feature Optimization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.qool.impl.AccessByFeatureOptimizationImpl
		 * @see org.eclectic.idc.qool.impl.QoolPackageImpl#getAccessByFeatureOptimization()
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
		 * The meta object literal for the '<em><b>Speculative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_BY_FEATURE_OPTIMIZATION__SPECULATIVE = eINSTANCE.getAccessByFeatureOptimization_Speculative();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.qool.impl.ModelElementQueueImpl <em>Model Element Queue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.qool.impl.ModelElementQueueImpl
		 * @see org.eclectic.idc.qool.impl.QoolPackageImpl#getModelElementQueue()
		 * @generated
		 */
		EClass MODEL_ELEMENT_QUEUE = eINSTANCE.getModelElementQueue();

		/**
		 * The meta object literal for the '<em><b>Type </b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT_QUEUE__TYPE_ = eINSTANCE.getModelElementQueue_Type_();

		/**
		 * The meta object literal for the '<em><b>Additionals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT_QUEUE__ADDITIONALS = eINSTANCE.getModelElementQueue_Additionals();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT_QUEUE__EXTENSION = eINSTANCE.getModelElementQueue_Extension();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.qool.impl.LocalQueueImpl <em>Local Queue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.qool.impl.LocalQueueImpl
		 * @see org.eclectic.idc.qool.impl.QoolPackageImpl#getLocalQueue()
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
		 * The meta object literal for the '{@link org.eclectic.idc.qool.impl.RequiredQueueImpl <em>Required Queue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.qool.impl.RequiredQueueImpl
		 * @see org.eclectic.idc.qool.impl.QoolPackageImpl#getRequiredQueue()
		 * @generated
		 */
		EClass REQUIRED_QUEUE = eINSTANCE.getRequiredQueue();

		/**
		 * The meta object literal for the '<em><b>Imported Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_QUEUE__IMPORTED_MODEL = eINSTANCE.getRequiredQueue_ImportedModel();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.qool.impl.QIteratorImpl <em>QIterator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.qool.impl.QIteratorImpl
		 * @see org.eclectic.idc.qool.impl.QoolPackageImpl#getQIterator()
		 * @generated
		 */
		EClass QITERATOR = eINSTANCE.getQIterator();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.qool.impl.QForAllImpl <em>QFor All</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.qool.impl.QForAllImpl
		 * @see org.eclectic.idc.qool.impl.QoolPackageImpl#getQForAll()
		 * @generated
		 */
		EClass QFOR_ALL = eINSTANCE.getQForAll();

		/**
		 * The meta object literal for the '<em><b>Queue</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QFOR_ALL__QUEUE = eINSTANCE.getQForAll_Queue();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.qool.impl.QEmitImpl <em>QEmit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.qool.impl.QEmitImpl
		 * @see org.eclectic.idc.qool.impl.QoolPackageImpl#getQEmit()
		 * @generated
		 */
		EClass QEMIT = eINSTANCE.getQEmit();

		/**
		 * The meta object literal for the '<em><b>Queue</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QEMIT__QUEUE = eINSTANCE.getQEmit_Queue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QEMIT__VALUE = eINSTANCE.getQEmit_Value();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.qool.impl.QMatchImpl <em>QMatch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.qool.impl.QMatchImpl
		 * @see org.eclectic.idc.qool.impl.QoolPackageImpl#getQMatch()
		 * @generated
		 */
		EClass QMATCH = eINSTANCE.getQMatch();

		/**
		 * The meta object literal for the '<em><b>Queue</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QMATCH__QUEUE = eINSTANCE.getQMatch_Queue();

		/**
		 * The meta object literal for the '<em><b>Predicates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QMATCH__PREDICATES = eINSTANCE.getQMatch_Predicates();

		/**
		 * The meta object literal for the '<em><b>Getter Closure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QMATCH__GETTER_CLOSURE = eINSTANCE.getQMatch_GetterClosure();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.qool.impl.QMatchPredicateImpl <em>QMatch Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.qool.impl.QMatchPredicateImpl
		 * @see org.eclectic.idc.qool.impl.QoolPackageImpl#getQMatchPredicate()
		 * @generated
		 */
		EClass QMATCH_PREDICATE = eINSTANCE.getQMatchPredicate();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.qool.impl.KindOfPredicateImpl <em>Kind Of Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.qool.impl.KindOfPredicateImpl
		 * @see org.eclectic.idc.qool.impl.QoolPackageImpl#getKindOfPredicate()
		 * @generated
		 */
		EClass KIND_OF_PREDICATE = eINSTANCE.getKindOfPredicate();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KIND_OF_PREDICATE__CLASS_NAME = eINSTANCE.getKindOfPredicate_ClassName();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KIND_OF_PREDICATE__MODEL = eINSTANCE.getKindOfPredicate_Model();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.qool.impl.PropertyEqualsPredicateImpl <em>Property Equals Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.qool.impl.PropertyEqualsPredicateImpl
		 * @see org.eclectic.idc.qool.impl.QoolPackageImpl#getPropertyEqualsPredicate()
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
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_EQUALS_PREDICATE__VALUE = eINSTANCE.getPropertyEqualsPredicate_Value();

	}

} //QoolPackage
