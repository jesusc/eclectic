/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.qool.impl;

import org.eclectic.idc.qool.*;

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
public class QoolFactoryImpl extends EFactoryImpl implements QoolFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QoolFactory init() {
		try {
			QoolFactory theQoolFactory = (QoolFactory)EPackage.Registry.INSTANCE.getEFactory("http://eclectic.org/idc/qool"); 
			if (theQoolFactory != null) {
				return theQoolFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QoolFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoolFactoryImpl() {
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
			case QoolPackage.QOOL_TRANSFORMATION: return createQoolTransformation();
			case QoolPackage.INLINE_MODEL: return createInlineModel();
			case QoolPackage.SEGMENT: return createSegment();
			case QoolPackage.ACCESS_BY_FEATURE_OPTIMIZATION: return createAccessByFeatureOptimization();
			case QoolPackage.MODEL_ELEMENT_QUEUE: return createModelElementQueue();
			case QoolPackage.LOCAL_QUEUE: return createLocalQueue();
			case QoolPackage.REQUIRED_QUEUE: return createRequiredQueue();
			case QoolPackage.QFOR_ALL: return createQForAll();
			case QoolPackage.QEMIT: return createQEmit();
			case QoolPackage.QMATCH: return createQMatch();
			case QoolPackage.KIND_OF_PREDICATE: return createKindOfPredicate();
			case QoolPackage.PROPERTY_EQUALS_PREDICATE: return createPropertyEqualsPredicate();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoolTransformation createQoolTransformation() {
		QoolTransformationImpl qoolTransformation = new QoolTransformationImpl();
		return qoolTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InlineModel createInlineModel() {
		InlineModelImpl inlineModel = new InlineModelImpl();
		return inlineModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Segment createSegment() {
		SegmentImpl segment = new SegmentImpl();
		return segment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessByFeatureOptimization createAccessByFeatureOptimization() {
		AccessByFeatureOptimizationImpl accessByFeatureOptimization = new AccessByFeatureOptimizationImpl();
		return accessByFeatureOptimization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElementQueue createModelElementQueue() {
		ModelElementQueueImpl modelElementQueue = new ModelElementQueueImpl();
		return modelElementQueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalQueue createLocalQueue() {
		LocalQueueImpl localQueue = new LocalQueueImpl();
		return localQueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredQueue createRequiredQueue() {
		RequiredQueueImpl requiredQueue = new RequiredQueueImpl();
		return requiredQueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QForAll createQForAll() {
		QForAllImpl qForAll = new QForAllImpl();
		return qForAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QEmit createQEmit() {
		QEmitImpl qEmit = new QEmitImpl();
		return qEmit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QMatch createQMatch() {
		QMatchImpl qMatch = new QMatchImpl();
		return qMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KindOfPredicate createKindOfPredicate() {
		KindOfPredicateImpl kindOfPredicate = new KindOfPredicateImpl();
		return kindOfPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyEqualsPredicate createPropertyEqualsPredicate() {
		PropertyEqualsPredicateImpl propertyEqualsPredicate = new PropertyEqualsPredicateImpl();
		return propertyEqualsPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoolPackage getQoolPackage() {
		return (QoolPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QoolPackage getPackage() {
		return QoolPackage.eINSTANCE;
	}

} //QoolFactoryImpl
