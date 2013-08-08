/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.qool.util;

import org.eclectic.frontend.core.AnnotableElement;
import org.eclectic.frontend.core.Expression;
import org.eclectic.frontend.core.LocatedElement;
import org.eclectic.frontend.core.ModuleDefinition;
import org.eclectic.frontend.core.NamedElement;
import org.eclectic.frontend.core.Statement;
import org.eclectic.frontend.core.TransformationDefinition;
import org.eclectic.frontend.core.Variable;

import org.eclectic.frontend.qool.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclectic.frontend.qool.QoolPackage
 * @generated
 */
public class QoolSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QoolPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoolSwitch() {
		if (modelPackage == null) {
			modelPackage = QoolPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case QoolPackage.QOOL_TRANSFORMATION: {
				QoolTransformation qoolTransformation = (QoolTransformation)theEObject;
				T result = caseQoolTransformation(qoolTransformation);
				if (result == null) result = caseTransformationDefinition(qoolTransformation);
				if (result == null) result = caseModuleDefinition(qoolTransformation);
				if (result == null) result = caseLocatedElement(qoolTransformation);
				if (result == null) result = caseNamedElement(qoolTransformation);
				if (result == null) result = caseAnnotableElement(qoolTransformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QoolPackage.QOOL_QUEUE: {
				QoolQueue qoolQueue = (QoolQueue)theEObject;
				T result = caseQoolQueue(qoolQueue);
				if (result == null) result = caseLocatedElement(qoolQueue);
				if (result == null) result = caseNamedElement(qoolQueue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QoolPackage.QUEUE_OPTIMIZATION: {
				QueueOptimization queueOptimization = (QueueOptimization)theEObject;
				T result = caseQueueOptimization(queueOptimization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QoolPackage.ACCESS_BY_FEATURE_OPTIMIZATION: {
				AccessByFeatureOptimization accessByFeatureOptimization = (AccessByFeatureOptimization)theEObject;
				T result = caseAccessByFeatureOptimization(accessByFeatureOptimization);
				if (result == null) result = caseQueueOptimization(accessByFeatureOptimization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QoolPackage.LOCAL_QUEUE: {
				LocalQueue localQueue = (LocalQueue)theEObject;
				T result = caseLocalQueue(localQueue);
				if (result == null) result = caseQoolQueue(localQueue);
				if (result == null) result = caseLocatedElement(localQueue);
				if (result == null) result = caseNamedElement(localQueue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QoolPackage.MODEL_ELEMENT_QUEUE: {
				ModelElementQueue modelElementQueue = (ModelElementQueue)theEObject;
				T result = caseModelElementQueue(modelElementQueue);
				if (result == null) result = caseQoolQueue(modelElementQueue);
				if (result == null) result = caseLocatedElement(modelElementQueue);
				if (result == null) result = caseNamedElement(modelElementQueue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QoolPackage.SEGMENT: {
				Segment segment = (Segment)theEObject;
				T result = caseSegment(segment);
				if (result == null) result = caseNamedElement(segment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QoolPackage.ITERATOR_STATEMENT: {
				IteratorStatement iteratorStatement = (IteratorStatement)theEObject;
				T result = caseIteratorStatement(iteratorStatement);
				if (result == null) result = caseStatement(iteratorStatement);
				if (result == null) result = caseVariable(iteratorStatement);
				if (result == null) result = caseLocatedElement(iteratorStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QoolPackage.FOR_ALL_STATEMENT: {
				ForAllStatement forAllStatement = (ForAllStatement)theEObject;
				T result = caseForAllStatement(forAllStatement);
				if (result == null) result = caseIteratorStatement(forAllStatement);
				if (result == null) result = caseStatement(forAllStatement);
				if (result == null) result = caseVariable(forAllStatement);
				if (result == null) result = caseLocatedElement(forAllStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QoolPackage.FOR_EACH_STATEMENT: {
				ForEachStatement forEachStatement = (ForEachStatement)theEObject;
				T result = caseForEachStatement(forEachStatement);
				if (result == null) result = caseIteratorStatement(forEachStatement);
				if (result == null) result = caseStatement(forEachStatement);
				if (result == null) result = caseVariable(forEachStatement);
				if (result == null) result = caseLocatedElement(forEachStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QoolPackage.EMIT_STATEMENT: {
				EmitStatement emitStatement = (EmitStatement)theEObject;
				T result = caseEmitStatement(emitStatement);
				if (result == null) result = caseStatement(emitStatement);
				if (result == null) result = caseLocatedElement(emitStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QoolPackage.MATCH_EXPRESSION: {
				MatchExpression matchExpression = (MatchExpression)theEObject;
				T result = caseMatchExpression(matchExpression);
				if (result == null) result = caseExpression(matchExpression);
				if (result == null) result = caseStatement(matchExpression);
				if (result == null) result = caseLocatedElement(matchExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QoolPackage.MATCH_PREDICATE: {
				MatchPredicate matchPredicate = (MatchPredicate)theEObject;
				T result = caseMatchPredicate(matchPredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QoolPackage.KIND_OF_PREDICATE: {
				KindOfPredicate kindOfPredicate = (KindOfPredicate)theEObject;
				T result = caseKindOfPredicate(kindOfPredicate);
				if (result == null) result = caseMatchPredicate(kindOfPredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QoolPackage.PROPERTY_EQUALS_PREDICATE: {
				PropertyEqualsPredicate propertyEqualsPredicate = (PropertyEqualsPredicate)theEObject;
				T result = casePropertyEqualsPredicate(propertyEqualsPredicate);
				if (result == null) result = caseMatchPredicate(propertyEqualsPredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QoolPackage.INVOKE_TRANSFORMATION: {
				InvokeTransformation invokeTransformation = (InvokeTransformation)theEObject;
				T result = caseInvokeTransformation(invokeTransformation);
				if (result == null) result = caseExpression(invokeTransformation);
				if (result == null) result = caseStatement(invokeTransformation);
				if (result == null) result = caseLocatedElement(invokeTransformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QoolPackage.INVOKE_EXTERNAL: {
				InvokeExternal invokeExternal = (InvokeExternal)theEObject;
				T result = caseInvokeExternal(invokeExternal);
				if (result == null) result = caseInvokeTransformation(invokeExternal);
				if (result == null) result = caseExpression(invokeExternal);
				if (result == null) result = caseStatement(invokeExternal);
				if (result == null) result = caseLocatedElement(invokeExternal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QoolPackage.INVOKE_INTERNAL: {
				InvokeInternal invokeInternal = (InvokeInternal)theEObject;
				T result = caseInvokeInternal(invokeInternal);
				if (result == null) result = caseInvokeTransformation(invokeInternal);
				if (result == null) result = caseExpression(invokeInternal);
				if (result == null) result = caseStatement(invokeInternal);
				if (result == null) result = caseLocatedElement(invokeInternal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QoolPackage.INVOCATION_PARAMETER: {
				InvocationParameter invocationParameter = (InvocationParameter)theEObject;
				T result = caseInvocationParameter(invocationParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QoolPackage.NAMED_INVOCATION_PARAMETER: {
				NamedInvocationParameter namedInvocationParameter = (NamedInvocationParameter)theEObject;
				T result = caseNamedInvocationParameter(namedInvocationParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQoolTransformation(QoolTransformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Queue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Queue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQoolQueue(QoolQueue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Queue Optimization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Queue Optimization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueueOptimization(QueueOptimization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access By Feature Optimization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access By Feature Optimization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessByFeatureOptimization(AccessByFeatureOptimization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Queue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Queue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalQueue(LocalQueue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element Queue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element Queue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElementQueue(ModelElementQueue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSegment(Segment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iterator Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iterator Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIteratorStatement(IteratorStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For All Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For All Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForAllStatement(ForAllStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Each Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Each Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForEachStatement(ForEachStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Emit Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Emit Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmitStatement(EmitStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Match Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Match Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatchExpression(MatchExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Match Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Match Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatchPredicate(MatchPredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kind Of Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kind Of Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKindOfPredicate(KindOfPredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Equals Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Equals Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyEqualsPredicate(PropertyEqualsPredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invoke Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invoke Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvokeTransformation(InvokeTransformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invoke External</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invoke External</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvokeExternal(InvokeExternal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invoke Internal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invoke Internal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvokeInternal(InvokeInternal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invocation Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invocation Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvocationParameter(InvocationParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Invocation Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Invocation Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedInvocationParameter(NamedInvocationParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Located Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Located Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocatedElement(LocatedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotableElement(AnnotableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleDefinition(ModuleDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformationDefinition(TransformationDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //QoolSwitch
