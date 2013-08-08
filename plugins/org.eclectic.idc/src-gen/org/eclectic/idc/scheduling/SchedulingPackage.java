/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.scheduling;

import org.eclectic.idc.core.CorePackage;
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
 * @see org.eclectic.idc.scheduling.SchedulingFactory
 * @model kind="package"
 * @generated
 */
public interface SchedulingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "scheduling";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclectic.org/idc/scheduling";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "idc_ast_scheduling";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SchedulingPackage eINSTANCE = org.eclectic.idc.scheduling.impl.SchedulingPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclectic.idc.scheduling.impl.ParallelTransformationImpl <em>Parallel Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.scheduling.impl.ParallelTransformationImpl
	 * @see org.eclectic.idc.scheduling.impl.SchedulingPackageImpl#getParallelTransformation()
	 * @generated
	 */
	int PARALLEL_TRANSFORMATION = 0;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_TRANSFORMATION__ROW = CorePackage.EXECUTABLE_UNIT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_TRANSFORMATION__COLUMN = CorePackage.EXECUTABLE_UNIT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_TRANSFORMATION__FILE = CorePackage.EXECUTABLE_UNIT__FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_TRANSFORMATION__NAME = CorePackage.EXECUTABLE_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_TRANSFORMATION__QUALIFIER = CorePackage.EXECUTABLE_UNIT__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_TRANSFORMATION__MAIN = CorePackage.EXECUTABLE_UNIT__MAIN;

	/**
	 * The feature id for the '<em><b>Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_TRANSFORMATION__MODELS = CorePackage.EXECUTABLE_UNIT__MODELS;

	/**
	 * The feature id for the '<em><b>Additional Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_TRANSFORMATION__ADDITIONAL_MODELS = CorePackage.EXECUTABLE_UNIT__ADDITIONAL_MODELS;

	/**
	 * The feature id for the '<em><b>Imported Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_TRANSFORMATION__IMPORTED_MODELS = CorePackage.EXECUTABLE_UNIT__IMPORTED_MODELS;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_TRANSFORMATION__REQUIRES = CorePackage.EXECUTABLE_UNIT__REQUIRES;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_TRANSFORMATION__PRE = CorePackage.EXECUTABLE_UNIT__PRE;

	/**
	 * The feature id for the '<em><b>Post</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_TRANSFORMATION__POST = CorePackage.EXECUTABLE_UNIT__POST;

	/**
	 * The feature id for the '<em><b>Executions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_TRANSFORMATION__EXECUTIONS = CorePackage.EXECUTABLE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parallel Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_TRANSFORMATION_FEATURE_COUNT = CorePackage.EXECUTABLE_UNIT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.scheduling.impl.SequentialTransformationImpl <em>Sequential Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.scheduling.impl.SequentialTransformationImpl
	 * @see org.eclectic.idc.scheduling.impl.SchedulingPackageImpl#getSequentialTransformation()
	 * @generated
	 */
	int SEQUENTIAL_TRANSFORMATION = 1;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_TRANSFORMATION__ROW = CorePackage.EXECUTABLE_UNIT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_TRANSFORMATION__COLUMN = CorePackage.EXECUTABLE_UNIT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_TRANSFORMATION__FILE = CorePackage.EXECUTABLE_UNIT__FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_TRANSFORMATION__NAME = CorePackage.EXECUTABLE_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_TRANSFORMATION__QUALIFIER = CorePackage.EXECUTABLE_UNIT__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_TRANSFORMATION__MAIN = CorePackage.EXECUTABLE_UNIT__MAIN;

	/**
	 * The feature id for the '<em><b>Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_TRANSFORMATION__MODELS = CorePackage.EXECUTABLE_UNIT__MODELS;

	/**
	 * The feature id for the '<em><b>Additional Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_TRANSFORMATION__ADDITIONAL_MODELS = CorePackage.EXECUTABLE_UNIT__ADDITIONAL_MODELS;

	/**
	 * The feature id for the '<em><b>Imported Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_TRANSFORMATION__IMPORTED_MODELS = CorePackage.EXECUTABLE_UNIT__IMPORTED_MODELS;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_TRANSFORMATION__REQUIRES = CorePackage.EXECUTABLE_UNIT__REQUIRES;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_TRANSFORMATION__PRE = CorePackage.EXECUTABLE_UNIT__PRE;

	/**
	 * The feature id for the '<em><b>Post</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_TRANSFORMATION__POST = CorePackage.EXECUTABLE_UNIT__POST;

	/**
	 * The feature id for the '<em><b>Executions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_TRANSFORMATION__EXECUTIONS = CorePackage.EXECUTABLE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Intermediate Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_TRANSFORMATION__INTERMEDIATE_MODELS = CorePackage.EXECUTABLE_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sequential Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_TRANSFORMATION_FEATURE_COUNT = CorePackage.EXECUTABLE_UNIT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclectic.idc.scheduling.impl.TransformationExecutionImpl <em>Transformation Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.idc.scheduling.impl.TransformationExecutionImpl
	 * @see org.eclectic.idc.scheduling.impl.SchedulingPackageImpl#getTransformationExecution()
	 * @generated
	 */
	int TRANSFORMATION_EXECUTION = 2;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_EXECUTION__ROW = CorePackage.LOCATED_ELEMENT__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_EXECUTION__COLUMN = CorePackage.LOCATED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_EXECUTION__FILE = CorePackage.LOCATED_ELEMENT__FILE;

	/**
	 * The feature id for the '<em><b>Transformation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_EXECUTION__TRANSFORMATION_NAME = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_EXECUTION__IN_MODELS = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Out Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_EXECUTION__OUT_MODELS = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Transformation Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_EXECUTION_FEATURE_COUNT = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.scheduling.ParallelTransformation <em>Parallel Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Transformation</em>'.
	 * @see org.eclectic.idc.scheduling.ParallelTransformation
	 * @generated
	 */
	EClass getParallelTransformation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.idc.scheduling.ParallelTransformation#getExecutions <em>Executions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Executions</em>'.
	 * @see org.eclectic.idc.scheduling.ParallelTransformation#getExecutions()
	 * @see #getParallelTransformation()
	 * @generated
	 */
	EReference getParallelTransformation_Executions();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.scheduling.SequentialTransformation <em>Sequential Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequential Transformation</em>'.
	 * @see org.eclectic.idc.scheduling.SequentialTransformation
	 * @generated
	 */
	EClass getSequentialTransformation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.idc.scheduling.SequentialTransformation#getExecutions <em>Executions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Executions</em>'.
	 * @see org.eclectic.idc.scheduling.SequentialTransformation#getExecutions()
	 * @see #getSequentialTransformation()
	 * @generated
	 */
	EReference getSequentialTransformation_Executions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.idc.scheduling.SequentialTransformation#getIntermediateModels <em>Intermediate Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediate Models</em>'.
	 * @see org.eclectic.idc.scheduling.SequentialTransformation#getIntermediateModels()
	 * @see #getSequentialTransformation()
	 * @generated
	 */
	EReference getSequentialTransformation_IntermediateModels();

	/**
	 * Returns the meta object for class '{@link org.eclectic.idc.scheduling.TransformationExecution <em>Transformation Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation Execution</em>'.
	 * @see org.eclectic.idc.scheduling.TransformationExecution
	 * @generated
	 */
	EClass getTransformationExecution();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.idc.scheduling.TransformationExecution#getTransformationName <em>Transformation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformation Name</em>'.
	 * @see org.eclectic.idc.scheduling.TransformationExecution#getTransformationName()
	 * @see #getTransformationExecution()
	 * @generated
	 */
	EAttribute getTransformationExecution_TransformationName();

	/**
	 * Returns the meta object for the reference list '{@link org.eclectic.idc.scheduling.TransformationExecution#getInModels <em>In Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Models</em>'.
	 * @see org.eclectic.idc.scheduling.TransformationExecution#getInModels()
	 * @see #getTransformationExecution()
	 * @generated
	 */
	EReference getTransformationExecution_InModels();

	/**
	 * Returns the meta object for the reference list '{@link org.eclectic.idc.scheduling.TransformationExecution#getOutModels <em>Out Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out Models</em>'.
	 * @see org.eclectic.idc.scheduling.TransformationExecution#getOutModels()
	 * @see #getTransformationExecution()
	 * @generated
	 */
	EReference getTransformationExecution_OutModels();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SchedulingFactory getSchedulingFactory();

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
		 * The meta object literal for the '{@link org.eclectic.idc.scheduling.impl.ParallelTransformationImpl <em>Parallel Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.scheduling.impl.ParallelTransformationImpl
		 * @see org.eclectic.idc.scheduling.impl.SchedulingPackageImpl#getParallelTransformation()
		 * @generated
		 */
		EClass PARALLEL_TRANSFORMATION = eINSTANCE.getParallelTransformation();

		/**
		 * The meta object literal for the '<em><b>Executions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARALLEL_TRANSFORMATION__EXECUTIONS = eINSTANCE.getParallelTransformation_Executions();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.scheduling.impl.SequentialTransformationImpl <em>Sequential Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.scheduling.impl.SequentialTransformationImpl
		 * @see org.eclectic.idc.scheduling.impl.SchedulingPackageImpl#getSequentialTransformation()
		 * @generated
		 */
		EClass SEQUENTIAL_TRANSFORMATION = eINSTANCE.getSequentialTransformation();

		/**
		 * The meta object literal for the '<em><b>Executions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENTIAL_TRANSFORMATION__EXECUTIONS = eINSTANCE.getSequentialTransformation_Executions();

		/**
		 * The meta object literal for the '<em><b>Intermediate Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENTIAL_TRANSFORMATION__INTERMEDIATE_MODELS = eINSTANCE.getSequentialTransformation_IntermediateModels();

		/**
		 * The meta object literal for the '{@link org.eclectic.idc.scheduling.impl.TransformationExecutionImpl <em>Transformation Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.idc.scheduling.impl.TransformationExecutionImpl
		 * @see org.eclectic.idc.scheduling.impl.SchedulingPackageImpl#getTransformationExecution()
		 * @generated
		 */
		EClass TRANSFORMATION_EXECUTION = eINSTANCE.getTransformationExecution();

		/**
		 * The meta object literal for the '<em><b>Transformation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION_EXECUTION__TRANSFORMATION_NAME = eINSTANCE.getTransformationExecution_TransformationName();

		/**
		 * The meta object literal for the '<em><b>In Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_EXECUTION__IN_MODELS = eINSTANCE.getTransformationExecution_InModels();

		/**
		 * The meta object literal for the '<em><b>Out Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_EXECUTION__OUT_MODELS = eINSTANCE.getTransformationExecution_OutModels();

	}

} //SchedulingPackage
