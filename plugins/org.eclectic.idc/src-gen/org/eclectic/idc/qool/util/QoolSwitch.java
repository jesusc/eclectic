/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.idc.qool.util;

import org.eclectic.idc.core.CodeUnit;
import org.eclectic.idc.core.ExecutableUnit;
import org.eclectic.idc.core.Instruction;
import org.eclectic.idc.core.InstructionBlock;
import org.eclectic.idc.core.LocatedElement;
import org.eclectic.idc.core.ModelDefinition;
import org.eclectic.idc.core.NamedElement;

import org.eclectic.idc.core.Variable;
import org.eclectic.idc.instr.InstructionWithResult;
import org.eclectic.idc.qool.*;

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
 * @see org.eclectic.idc.qool.QoolPackage
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
				if (result == null) result = caseExecutableUnit(qoolTransformation);
				if (result == null) result = caseCodeUnit(qoolTransformation);
				if (result == null) result = caseLocatedElement(qoolTransformation);
				if (result == null) result = caseNamedElement(qoolTransformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QoolPackage.INLINE_MODEL: {
				InlineModel inlineModel = (InlineModel)theEObject;
				T result = caseInlineModel(inlineModel);
				if (result == null) result = caseModelDefinition(inlineModel);
				if (result == null) result = caseNamedElement(inlineModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QoolPackage.SEGMENT: {
				Segment segment = (Segment)theEObject;
				T result = caseSegment(segment);
				if (result == null) result = caseInstructionBlock(segment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QoolPackage.QUEUE: {
				Queue queue = (Queue)theEObject;
				T result = caseQueue(queue);
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
			case QoolPackage.MODEL_ELEMENT_QUEUE: {
				ModelElementQueue modelElementQueue = (ModelElementQueue)theEObject;
				T result = caseModelElementQueue(modelElementQueue);
				if (result == null) result = caseQueue(modelElementQueue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QoolPackage.LOCAL_QUEUE: {
				LocalQueue localQueue = (LocalQueue)theEObject;
				T result = caseLocalQueue(localQueue);
				if (result == null) result = caseQueue(localQueue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QoolPackage.REQUIRED_QUEUE: {
				RequiredQueue requiredQueue = (RequiredQueue)theEObject;
				T result = caseRequiredQueue(requiredQueue);
				if (result == null) result = caseQueue(requiredQueue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QoolPackage.QITERATOR: {
				QIterator qIterator = (QIterator)theEObject;
				T result = caseQIterator(qIterator);
				if (result == null) result = caseVariable(qIterator);
				if (result == null) result = caseInstruction(qIterator);
				if (result == null) result = caseInstructionBlock(qIterator);
				if (result == null) result = caseNamedElement(qIterator);
				if (result == null) result = caseLocatedElement(qIterator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QoolPackage.QFOR_ALL: {
				QForAll qForAll = (QForAll)theEObject;
				T result = caseQForAll(qForAll);
				if (result == null) result = caseQIterator(qForAll);
				if (result == null) result = caseVariable(qForAll);
				if (result == null) result = caseInstruction(qForAll);
				if (result == null) result = caseInstructionBlock(qForAll);
				if (result == null) result = caseNamedElement(qForAll);
				if (result == null) result = caseLocatedElement(qForAll);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QoolPackage.QEMIT: {
				QEmit qEmit = (QEmit)theEObject;
				T result = caseQEmit(qEmit);
				if (result == null) result = caseInstruction(qEmit);
				if (result == null) result = caseLocatedElement(qEmit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QoolPackage.QMATCH: {
				QMatch qMatch = (QMatch)theEObject;
				T result = caseQMatch(qMatch);
				if (result == null) result = caseInstructionWithResult(qMatch);
				if (result == null) result = caseVariable(qMatch);
				if (result == null) result = caseInstruction(qMatch);
				if (result == null) result = caseNamedElement(qMatch);
				if (result == null) result = caseLocatedElement(qMatch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QoolPackage.QMATCH_PREDICATE: {
				QMatchPredicate qMatchPredicate = (QMatchPredicate)theEObject;
				T result = caseQMatchPredicate(qMatchPredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QoolPackage.KIND_OF_PREDICATE: {
				KindOfPredicate kindOfPredicate = (KindOfPredicate)theEObject;
				T result = caseKindOfPredicate(kindOfPredicate);
				if (result == null) result = caseQMatchPredicate(kindOfPredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QoolPackage.PROPERTY_EQUALS_PREDICATE: {
				PropertyEqualsPredicate propertyEqualsPredicate = (PropertyEqualsPredicate)theEObject;
				T result = casePropertyEqualsPredicate(propertyEqualsPredicate);
				if (result == null) result = caseQMatchPredicate(propertyEqualsPredicate);
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
	 * Returns the result of interpreting the object as an instance of '<em>Inline Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inline Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInlineModel(InlineModel object) {
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
	public T caseQueue(Queue object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Required Queue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Queue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiredQueue(RequiredQueue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QIterator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QIterator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQIterator(QIterator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QFor All</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QFor All</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQForAll(QForAll object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QEmit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QEmit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQEmit(QEmit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QMatch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QMatch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQMatch(QMatch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QMatch Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QMatch Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQMatchPredicate(QMatchPredicate object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Code Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeUnit(CodeUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Executable Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Executable Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutableUnit(ExecutableUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelDefinition(ModelDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instruction Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruction Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstructionBlock(InstructionBlock object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstruction(Instruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instruction With Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruction With Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstructionWithResult(InstructionWithResult object) {
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
