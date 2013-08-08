/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.qool.impl;

import org.eclectic.frontend.qool.*;

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
			QoolFactory theQoolFactory = (QoolFactory)EPackage.Registry.INSTANCE.getEFactory("http://eclectic.org/frontend/qoolL"); 
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
			case QoolPackage.ACCESS_BY_FEATURE_OPTIMIZATION: return createAccessByFeatureOptimization();
			case QoolPackage.LOCAL_QUEUE: return createLocalQueue();
			case QoolPackage.MODEL_ELEMENT_QUEUE: return createModelElementQueue();
			case QoolPackage.SEGMENT: return createSegment();
			case QoolPackage.ITERATOR_STATEMENT: return createIteratorStatement();
			case QoolPackage.FOR_ALL_STATEMENT: return createForAllStatement();
			case QoolPackage.FOR_EACH_STATEMENT: return createForEachStatement();
			case QoolPackage.EMIT_STATEMENT: return createEmitStatement();
			case QoolPackage.MATCH_EXPRESSION: return createMatchExpression();
			case QoolPackage.KIND_OF_PREDICATE: return createKindOfPredicate();
			case QoolPackage.PROPERTY_EQUALS_PREDICATE: return createPropertyEqualsPredicate();
			case QoolPackage.INVOKE_EXTERNAL: return createInvokeExternal();
			case QoolPackage.INVOKE_INTERNAL: return createInvokeInternal();
			case QoolPackage.INVOCATION_PARAMETER: return createInvocationParameter();
			case QoolPackage.NAMED_INVOCATION_PARAMETER: return createNamedInvocationParameter();
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
	public AccessByFeatureOptimization createAccessByFeatureOptimization() {
		AccessByFeatureOptimizationImpl accessByFeatureOptimization = new AccessByFeatureOptimizationImpl();
		return accessByFeatureOptimization;
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
	public ModelElementQueue createModelElementQueue() {
		ModelElementQueueImpl modelElementQueue = new ModelElementQueueImpl();
		return modelElementQueue;
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
	public IteratorStatement createIteratorStatement() {
		IteratorStatementImpl iteratorStatement = new IteratorStatementImpl();
		return iteratorStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForAllStatement createForAllStatement() {
		ForAllStatementImpl forAllStatement = new ForAllStatementImpl();
		return forAllStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForEachStatement createForEachStatement() {
		ForEachStatementImpl forEachStatement = new ForEachStatementImpl();
		return forEachStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmitStatement createEmitStatement() {
		EmitStatementImpl emitStatement = new EmitStatementImpl();
		return emitStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchExpression createMatchExpression() {
		MatchExpressionImpl matchExpression = new MatchExpressionImpl();
		return matchExpression;
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
	public InvokeExternal createInvokeExternal() {
		InvokeExternalImpl invokeExternal = new InvokeExternalImpl();
		return invokeExternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvokeInternal createInvokeInternal() {
		InvokeInternalImpl invokeInternal = new InvokeInternalImpl();
		return invokeInternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvocationParameter createInvocationParameter() {
		InvocationParameterImpl invocationParameter = new InvocationParameterImpl();
		return invocationParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedInvocationParameter createNamedInvocationParameter() {
		NamedInvocationParameterImpl namedInvocationParameter = new NamedInvocationParameterImpl();
		return namedInvocationParameter;
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
