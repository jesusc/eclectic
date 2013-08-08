/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.test.streaming.seqdiagram;

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
 * @see org.eclectic.test.streaming.seqdiagram.SeqdiagramFactory
 * @model kind="package"
 * @generated
 */
public interface SeqdiagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "seqdiagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclectic.org/streaming/simplified_seq_diagram";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "seq_diagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SeqdiagramPackage eINSTANCE = org.eclectic.test.streaming.seqdiagram.impl.SeqdiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclectic.test.streaming.seqdiagram.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.test.streaming.seqdiagram.impl.MessageImpl
	 * @see org.eclectic.test.streaming.seqdiagram.impl.SeqdiagramPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Following Messages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__FOLLOWING_MESSAGES = 0;

	/**
	 * The feature id for the '<em><b>Source Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__SOURCE_CLASSIFIER = 1;

	/**
	 * The feature id for the '<em><b>Target Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__TARGET_CLASSIFIER = 2;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclectic.test.streaming.seqdiagram.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.test.streaming.seqdiagram.impl.OperationImpl
	 * @see org.eclectic.test.streaming.seqdiagram.impl.SeqdiagramPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 1;

	/**
	 * The feature id for the '<em><b>Following Messages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__FOLLOWING_MESSAGES = MESSAGE__FOLLOWING_MESSAGES;

	/**
	 * The feature id for the '<em><b>Source Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__SOURCE_CLASSIFIER = MESSAGE__SOURCE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Target Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__TARGET_CLASSIFIER = MESSAGE__TARGET_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclectic.test.streaming.seqdiagram.impl.ClassifierImpl <em>Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.test.streaming.seqdiagram.impl.ClassifierImpl
	 * @see org.eclectic.test.streaming.seqdiagram.impl.SeqdiagramPackageImpl#getClassifier()
	 * @generated
	 */
	int CLASSIFIER = 2;

	/**
	 * The number of structural features of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclectic.test.streaming.seqdiagram.impl.InstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.test.streaming.seqdiagram.impl.InstanceImpl
	 * @see org.eclectic.test.streaming.seqdiagram.impl.SeqdiagramPackageImpl#getInstance()
	 * @generated
	 */
	int INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Debug Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__DEBUG_NAME = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__OBJECT_ID = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__NODE_ID = CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Object Id hex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__OBJECT_ID_HEX = CLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Clazz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__CLAZZ = CLASSIFIER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclectic.test.streaming.seqdiagram.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclectic.test.streaming.seqdiagram.impl.ClassImpl
	 * @see org.eclectic.test.streaming.seqdiagram.impl.SeqdiagramPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 4;

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
	 * Returns the meta object for class '{@link org.eclectic.test.streaming.seqdiagram.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see org.eclectic.test.streaming.seqdiagram.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the reference list '{@link org.eclectic.test.streaming.seqdiagram.Message#getFollowingMessages <em>Following Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Following Messages</em>'.
	 * @see org.eclectic.test.streaming.seqdiagram.Message#getFollowingMessages()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_FollowingMessages();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.test.streaming.seqdiagram.Message#getSourceClassifier <em>Source Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Classifier</em>'.
	 * @see org.eclectic.test.streaming.seqdiagram.Message#getSourceClassifier()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_SourceClassifier();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.test.streaming.seqdiagram.Message#getTargetClassifier <em>Target Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Classifier</em>'.
	 * @see org.eclectic.test.streaming.seqdiagram.Message#getTargetClassifier()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_TargetClassifier();

	/**
	 * Returns the meta object for class '{@link org.eclectic.test.streaming.seqdiagram.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see org.eclectic.test.streaming.seqdiagram.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.test.streaming.seqdiagram.Operation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclectic.test.streaming.seqdiagram.Operation#getName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Name();

	/**
	 * Returns the meta object for class '{@link org.eclectic.test.streaming.seqdiagram.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier</em>'.
	 * @see org.eclectic.test.streaming.seqdiagram.Classifier
	 * @generated
	 */
	EClass getClassifier();

	/**
	 * Returns the meta object for class '{@link org.eclectic.test.streaming.seqdiagram.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see org.eclectic.test.streaming.seqdiagram.Instance
	 * @generated
	 */
	EClass getInstance();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.test.streaming.seqdiagram.Instance#getDebugName <em>Debug Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Debug Name</em>'.
	 * @see org.eclectic.test.streaming.seqdiagram.Instance#getDebugName()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_DebugName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.test.streaming.seqdiagram.Instance#getObjectId <em>Object Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Id</em>'.
	 * @see org.eclectic.test.streaming.seqdiagram.Instance#getObjectId()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_ObjectId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.test.streaming.seqdiagram.Instance#getNodeId <em>Node Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Id</em>'.
	 * @see org.eclectic.test.streaming.seqdiagram.Instance#getNodeId()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_NodeId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.test.streaming.seqdiagram.Instance#getObjectId_hex <em>Object Id hex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Id hex</em>'.
	 * @see org.eclectic.test.streaming.seqdiagram.Instance#getObjectId_hex()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_ObjectId_hex();

	/**
	 * Returns the meta object for the reference '{@link org.eclectic.test.streaming.seqdiagram.Instance#getClazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clazz</em>'.
	 * @see org.eclectic.test.streaming.seqdiagram.Instance#getClazz()
	 * @see #getInstance()
	 * @generated
	 */
	EReference getInstance_Clazz();

	/**
	 * Returns the meta object for class '{@link org.eclectic.test.streaming.seqdiagram.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see org.eclectic.test.streaming.seqdiagram.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the attribute '{@link org.eclectic.test.streaming.seqdiagram.Class#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclectic.test.streaming.seqdiagram.Class#getName()
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
	SeqdiagramFactory getSeqdiagramFactory();

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
		 * The meta object literal for the '{@link org.eclectic.test.streaming.seqdiagram.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.test.streaming.seqdiagram.impl.MessageImpl
		 * @see org.eclectic.test.streaming.seqdiagram.impl.SeqdiagramPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Following Messages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__FOLLOWING_MESSAGES = eINSTANCE.getMessage_FollowingMessages();

		/**
		 * The meta object literal for the '<em><b>Source Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__SOURCE_CLASSIFIER = eINSTANCE.getMessage_SourceClassifier();

		/**
		 * The meta object literal for the '<em><b>Target Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__TARGET_CLASSIFIER = eINSTANCE.getMessage_TargetClassifier();

		/**
		 * The meta object literal for the '{@link org.eclectic.test.streaming.seqdiagram.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.test.streaming.seqdiagram.impl.OperationImpl
		 * @see org.eclectic.test.streaming.seqdiagram.impl.SeqdiagramPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

		/**
		 * The meta object literal for the '{@link org.eclectic.test.streaming.seqdiagram.impl.ClassifierImpl <em>Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.test.streaming.seqdiagram.impl.ClassifierImpl
		 * @see org.eclectic.test.streaming.seqdiagram.impl.SeqdiagramPackageImpl#getClassifier()
		 * @generated
		 */
		EClass CLASSIFIER = eINSTANCE.getClassifier();

		/**
		 * The meta object literal for the '{@link org.eclectic.test.streaming.seqdiagram.impl.InstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.test.streaming.seqdiagram.impl.InstanceImpl
		 * @see org.eclectic.test.streaming.seqdiagram.impl.SeqdiagramPackageImpl#getInstance()
		 * @generated
		 */
		EClass INSTANCE = eINSTANCE.getInstance();

		/**
		 * The meta object literal for the '<em><b>Debug Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE__DEBUG_NAME = eINSTANCE.getInstance_DebugName();

		/**
		 * The meta object literal for the '<em><b>Object Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE__OBJECT_ID = eINSTANCE.getInstance_ObjectId();

		/**
		 * The meta object literal for the '<em><b>Node Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE__NODE_ID = eINSTANCE.getInstance_NodeId();

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
		 * The meta object literal for the '{@link org.eclectic.test.streaming.seqdiagram.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclectic.test.streaming.seqdiagram.impl.ClassImpl
		 * @see org.eclectic.test.streaming.seqdiagram.impl.SeqdiagramPackageImpl#getClass_()
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

} //SeqdiagramPackage
