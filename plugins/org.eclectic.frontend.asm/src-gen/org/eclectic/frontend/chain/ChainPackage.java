/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.chain;

import org.eclectic.frontend.core.CorePackage;

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
 * @see org.eclectic.frontend.chain.ChainFactory
 * @model kind="package"
 * @generated
 */
public interface ChainPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "chain";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclectic.org/frontend/chainL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ec_frontend_chainL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChainPackage eINSTANCE = org.eclectic.frontend.chain.impl.ChainPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.chain.impl.ChainTransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.chain.impl.ChainTransformationImpl
	 * @see org.eclectic.frontend.chain.impl.ChainPackageImpl#getChainTransformation()
	 * @generated
	 */
	int CHAIN_TRANSFORMATION = 0;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_TRANSFORMATION__ROW = CorePackage.TRANSFORMATION_DEFINITION__ROW;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_TRANSFORMATION__COLUMN = CorePackage.TRANSFORMATION_DEFINITION__COLUMN;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_TRANSFORMATION__FILE = CorePackage.TRANSFORMATION_DEFINITION__FILE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_TRANSFORMATION__NAME = CorePackage.TRANSFORMATION_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Annotated With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_TRANSFORMATION__ANNOTATED_WITH = CorePackage.TRANSFORMATION_DEFINITION__ANNOTATED_WITH;

	/**
	 * The feature id for the '<em><b>In Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_TRANSFORMATION__IN_MODELS = CorePackage.TRANSFORMATION_DEFINITION__IN_MODELS;

	/**
	 * The feature id for the '<em><b>Out Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_TRANSFORMATION__OUT_MODELS = CorePackage.TRANSFORMATION_DEFINITION__OUT_MODELS;

	/**
	 * The feature id for the '<em><b>Imported Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_TRANSFORMATION__IMPORTED_MODELS = CorePackage.TRANSFORMATION_DEFINITION__IMPORTED_MODELS;

	/**
	 * The feature id for the '<em><b>Inline Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_TRANSFORMATION__INLINE_MODELS = CorePackage.TRANSFORMATION_DEFINITION__INLINE_MODELS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_TRANSFORMATION__ANNOTATIONS = CorePackage.TRANSFORMATION_DEFINITION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_TRANSFORMATION__USES = CorePackage.TRANSFORMATION_DEFINITION__USES;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_TRANSFORMATION__REQUIRES = CorePackage.TRANSFORMATION_DEFINITION__REQUIRES;

	/**
	 * The feature id for the '<em><b>Composites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_TRANSFORMATION__COMPOSITES = CorePackage.TRANSFORMATION_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Externals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_TRANSFORMATION__EXTERNALS = CorePackage.TRANSFORMATION_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generated Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_TRANSFORMATION__GENERATED_MODELS = CorePackage.TRANSFORMATION_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Executions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_TRANSFORMATION__EXECUTIONS = CorePackage.TRANSFORMATION_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_TRANSFORMATION_FEATURE_COUNT = CorePackage.TRANSFORMATION_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.chain.impl.GeneratedModelImpl <em>Generated Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.chain.impl.GeneratedModelImpl
	 * @see org.eclectic.frontend.chain.impl.ChainPackageImpl#getGeneratedModel()
	 * @generated
	 */
	int GENERATED_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Annotated With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_MODEL__ANNOTATED_WITH = CorePackage.REPRESENT_MODEL__ANNOTATED_WITH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_MODEL__NAME = CorePackage.REPRESENT_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Generated Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATED_MODEL_FEATURE_COUNT = CorePackage.REPRESENT_MODEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.chain.impl.TransformationExecutionImpl <em>Transformation Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.chain.impl.TransformationExecutionImpl
	 * @see org.eclectic.frontend.chain.impl.ChainPackageImpl#getTransformationExecution()
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
	 * The feature id for the '<em><b>Transformation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_EXECUTION__TRANSFORMATION = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_EXECUTION__INPUT_MODELS = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_EXECUTION__OUTPUT_MODELS = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Transformation Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_EXECUTION_FEATURE_COUNT = CorePackage.LOCATED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.chain.impl.AvailableTransformationImpl <em>Available Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.chain.impl.AvailableTransformationImpl
	 * @see org.eclectic.frontend.chain.impl.ChainPackageImpl#getAvailableTransformation()
	 * @generated
	 */
	int AVAILABLE_TRANSFORMATION = 3;

	/**
	 * The number of structural features of the '<em>Available Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABLE_TRANSFORMATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.chain.impl.ExternalTransformationImpl <em>External Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.chain.impl.ExternalTransformationImpl
	 * @see org.eclectic.frontend.chain.impl.ChainPackageImpl#getExternalTransformation()
	 * @generated
	 */
	int EXTERNAL_TRANSFORMATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TRANSFORMATION__NAME = AVAILABLE_TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>External Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TRANSFORMATION_FEATURE_COUNT = AVAILABLE_TRANSFORMATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.frontend.chain.impl.CompositeTransformationImpl <em>Composite Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.frontend.chain.impl.CompositeTransformationImpl
	 * @see org.eclectic.frontend.chain.impl.ChainPackageImpl#getCompositeTransformation()
	 * @generated
	 */
	int COMPOSITE_TRANSFORMATION = 5;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TRANSFORMATION__ROW = AVAILABLE_TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TRANSFORMATION__COLUMN = AVAILABLE_TRANSFORMATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TRANSFORMATION__FILE = AVAILABLE_TRANSFORMATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TRANSFORMATION__NAME = AVAILABLE_TRANSFORMATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Annotated With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TRANSFORMATION__ANNOTATED_WITH = AVAILABLE_TRANSFORMATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>In Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TRANSFORMATION__IN_MODELS = AVAILABLE_TRANSFORMATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Out Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TRANSFORMATION__OUT_MODELS = AVAILABLE_TRANSFORMATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Imported Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TRANSFORMATION__IMPORTED_MODELS = AVAILABLE_TRANSFORMATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Inline Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TRANSFORMATION__INLINE_MODELS = AVAILABLE_TRANSFORMATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TRANSFORMATION__ANNOTATIONS = AVAILABLE_TRANSFORMATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TRANSFORMATION__USES = AVAILABLE_TRANSFORMATION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TRANSFORMATION__REQUIRES = AVAILABLE_TRANSFORMATION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Executions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TRANSFORMATION__EXECUTIONS = AVAILABLE_TRANSFORMATION_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Composite Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TRANSFORMATION_FEATURE_COUNT = AVAILABLE_TRANSFORMATION_FEATURE_COUNT + 13;


	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.chain.ChainTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see org.eclectic.frontend.chain.ChainTransformation
	 * @generated
	 */
	EClass getChainTransformation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.chain.ChainTransformation#getComposites <em>Composites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composites</em>'.
	 * @see org.eclectic.frontend.chain.ChainTransformation#getComposites()
	 * @see #getChainTransformation()
	 * @generated
	 */
	EReference getChainTransformation_Composites();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.chain.ChainTransformation#getExternals <em>Externals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Externals</em>'.
	 * @see org.eclectic.frontend.chain.ChainTransformation#getExternals()
	 * @see #getChainTransformation()
	 * @generated
	 */
	EReference getChainTransformation_Externals();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.chain.ChainTransformation#getGeneratedModels <em>Generated Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generated Models</em>'.
	 * @see org.eclectic.frontend.chain.ChainTransformation#getGeneratedModels()
	 * @see #getChainTransformation()
	 * @generated
	 */
	EReference getChainTransformation_GeneratedModels();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.chain.ChainTransformation#getExecutions <em>Executions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Executions</em>'.
	 * @see org.eclectic.frontend.chain.ChainTransformation#getExecutions()
	 * @see #getChainTransformation()
	 * @generated
	 */
	EReference getChainTransformation_Executions();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.chain.GeneratedModel <em>Generated Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generated Model</em>'.
	 * @see org.eclectic.frontend.chain.GeneratedModel
	 * @generated
	 */
	EClass getGeneratedModel();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.chain.TransformationExecution <em>Transformation Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation Execution</em>'.
	 * @see org.eclectic.frontend.chain.TransformationExecution
	 * @generated
	 */
	EClass getTransformationExecution();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.frontend.chain.TransformationExecution#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformation</em>'.
	 * @see org.eclectic.frontend.chain.TransformationExecution#getTransformation()
	 * @see #getTransformationExecution()
	 * @generated
	 */
	EReference getTransformationExecution_Transformation();

	/**
	 * Returns the meta object for the reference list '{@link org.eclectic.frontend.chain.TransformationExecution#getInputModels <em>Input Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Models</em>'.
	 * @see org.eclectic.frontend.chain.TransformationExecution#getInputModels()
	 * @see #getTransformationExecution()
	 * @generated
	 */
	EReference getTransformationExecution_InputModels();

	/**
	 * Returns the meta object for the reference list '{@link org.eclectic.frontend.chain.TransformationExecution#getOutputModels <em>Output Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output Models</em>'.
	 * @see org.eclectic.frontend.chain.TransformationExecution#getOutputModels()
	 * @see #getTransformationExecution()
	 * @generated
	 */
	EReference getTransformationExecution_OutputModels();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.chain.AvailableTransformation <em>Available Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Available Transformation</em>'.
	 * @see org.eclectic.frontend.chain.AvailableTransformation
	 * @generated
	 */
	EClass getAvailableTransformation();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.chain.ExternalTransformation <em>External Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Transformation</em>'.
	 * @see org.eclectic.frontend.chain.ExternalTransformation
	 * @generated
	 */
	EClass getExternalTransformation();

	/**
	 * Returns the meta object for class '{@link org.eclectic.frontend.chain.CompositeTransformation <em>Composite Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Transformation</em>'.
	 * @see org.eclectic.frontend.chain.CompositeTransformation
	 * @generated
	 */
	EClass getCompositeTransformation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclectic.frontend.chain.CompositeTransformation#getExecutions <em>Executions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Executions</em>'.
	 * @see org.eclectic.frontend.chain.CompositeTransformation#getExecutions()
	 * @see #getCompositeTransformation()
	 * @generated
	 */
	EReference getCompositeTransformation_Executions();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ChainFactory getChainFactory();

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
		 * The meta object literal for the '{@link org.eclectic.frontend.chain.impl.ChainTransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.chain.impl.ChainTransformationImpl
		 * @see org.eclectic.frontend.chain.impl.ChainPackageImpl#getChainTransformation()
		 * @generated
		 */
		EClass CHAIN_TRANSFORMATION = eINSTANCE.getChainTransformation();

		/**
		 * The meta object literal for the '<em><b>Composites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAIN_TRANSFORMATION__COMPOSITES = eINSTANCE.getChainTransformation_Composites();

		/**
		 * The meta object literal for the '<em><b>Externals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAIN_TRANSFORMATION__EXTERNALS = eINSTANCE.getChainTransformation_Externals();

		/**
		 * The meta object literal for the '<em><b>Generated Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAIN_TRANSFORMATION__GENERATED_MODELS = eINSTANCE.getChainTransformation_GeneratedModels();

		/**
		 * The meta object literal for the '<em><b>Executions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAIN_TRANSFORMATION__EXECUTIONS = eINSTANCE.getChainTransformation_Executions();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.chain.impl.GeneratedModelImpl <em>Generated Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.chain.impl.GeneratedModelImpl
		 * @see org.eclectic.frontend.chain.impl.ChainPackageImpl#getGeneratedModel()
		 * @generated
		 */
		EClass GENERATED_MODEL = eINSTANCE.getGeneratedModel();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.chain.impl.TransformationExecutionImpl <em>Transformation Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.chain.impl.TransformationExecutionImpl
		 * @see org.eclectic.frontend.chain.impl.ChainPackageImpl#getTransformationExecution()
		 * @generated
		 */
		EClass TRANSFORMATION_EXECUTION = eINSTANCE.getTransformationExecution();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_EXECUTION__TRANSFORMATION = eINSTANCE.getTransformationExecution_Transformation();

		/**
		 * The meta object literal for the '<em><b>Input Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_EXECUTION__INPUT_MODELS = eINSTANCE.getTransformationExecution_InputModels();

		/**
		 * The meta object literal for the '<em><b>Output Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_EXECUTION__OUTPUT_MODELS = eINSTANCE.getTransformationExecution_OutputModels();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.chain.impl.AvailableTransformationImpl <em>Available Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.chain.impl.AvailableTransformationImpl
		 * @see org.eclectic.frontend.chain.impl.ChainPackageImpl#getAvailableTransformation()
		 * @generated
		 */
		EClass AVAILABLE_TRANSFORMATION = eINSTANCE.getAvailableTransformation();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.chain.impl.ExternalTransformationImpl <em>External Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.chain.impl.ExternalTransformationImpl
		 * @see org.eclectic.frontend.chain.impl.ChainPackageImpl#getExternalTransformation()
		 * @generated
		 */
		EClass EXTERNAL_TRANSFORMATION = eINSTANCE.getExternalTransformation();

		/**
		 * The meta object literal for the '{@link org.eclectic.frontend.chain.impl.CompositeTransformationImpl <em>Composite Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.frontend.chain.impl.CompositeTransformationImpl
		 * @see org.eclectic.frontend.chain.impl.ChainPackageImpl#getCompositeTransformation()
		 * @generated
		 */
		EClass COMPOSITE_TRANSFORMATION = eINSTANCE.getCompositeTransformation();

		/**
		 * The meta object literal for the '<em><b>Executions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_TRANSFORMATION__EXECUTIONS = eINSTANCE.getCompositeTransformation_Executions();

	}

} //ChainPackage
