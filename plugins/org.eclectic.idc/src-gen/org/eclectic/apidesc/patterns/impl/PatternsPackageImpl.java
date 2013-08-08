/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.apidesc.patterns.impl;

import org.eclectic.apidesc.ApidescPackage;

import org.eclectic.apidesc.impl.ApidescPackageImpl;

import org.eclectic.apidesc.patterns.IteratorDescription;
import org.eclectic.apidesc.patterns.IteratorGetter;
import org.eclectic.apidesc.patterns.ObserverDescription;
import org.eclectic.apidesc.patterns.PatternsFactory;
import org.eclectic.apidesc.patterns.PatternsPackage;

import org.eclectic.apidesc.patterns.UpdateMethod;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternsPackageImpl extends EPackageImpl implements PatternsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iteratorDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iteratorGetterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observerDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateMethodEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclectic.apidesc.patterns.PatternsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PatternsPackageImpl() {
		super(eNS_URI, PatternsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PatternsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PatternsPackage init() {
		if (isInited) return (PatternsPackage)EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI);

		// Obtain or create and register package
		PatternsPackageImpl thePatternsPackage = (PatternsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PatternsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PatternsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ApidescPackageImpl theApidescPackage = (ApidescPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ApidescPackage.eNS_URI) instanceof ApidescPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ApidescPackage.eNS_URI) : ApidescPackage.eINSTANCE);

		// Create package meta-data objects
		thePatternsPackage.createPackageContents();
		theApidescPackage.createPackageContents();

		// Initialize created meta-data
		thePatternsPackage.initializePackageContents();
		theApidescPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePatternsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PatternsPackage.eNS_URI, thePatternsPackage);
		return thePatternsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIteratorDescription() {
		return iteratorDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIteratorDescription_IteratorClass() {
		return (EAttribute)iteratorDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIteratorDescription_HasFinished() {
		return (EReference)iteratorDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIteratorDescription_NextElement() {
		return (EReference)iteratorDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIteratorDescription_CurrentElement() {
		return (EReference)iteratorDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIteratorGetter() {
		return iteratorGetterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIteratorGetter_GetIterator() {
		return (EReference)iteratorGetterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIteratorGetter_Iterator() {
		return (EReference)iteratorGetterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObserverDescription() {
		return observerDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObserverDescription_ObserverClass() {
		return (EAttribute)observerDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObserverDescription_UpdateMethods() {
		return (EReference)observerDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateMethod() {
		return updateMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateMethod_Interest() {
		return (EAttribute)updateMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternsFactory getPatternsFactory() {
		return (PatternsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		iteratorDescriptionEClass = createEClass(ITERATOR_DESCRIPTION);
		createEAttribute(iteratorDescriptionEClass, ITERATOR_DESCRIPTION__ITERATOR_CLASS);
		createEReference(iteratorDescriptionEClass, ITERATOR_DESCRIPTION__HAS_FINISHED);
		createEReference(iteratorDescriptionEClass, ITERATOR_DESCRIPTION__NEXT_ELEMENT);
		createEReference(iteratorDescriptionEClass, ITERATOR_DESCRIPTION__CURRENT_ELEMENT);

		iteratorGetterEClass = createEClass(ITERATOR_GETTER);
		createEReference(iteratorGetterEClass, ITERATOR_GETTER__GET_ITERATOR);
		createEReference(iteratorGetterEClass, ITERATOR_GETTER__ITERATOR);

		observerDescriptionEClass = createEClass(OBSERVER_DESCRIPTION);
		createEAttribute(observerDescriptionEClass, OBSERVER_DESCRIPTION__OBSERVER_CLASS);
		createEReference(observerDescriptionEClass, OBSERVER_DESCRIPTION__UPDATE_METHODS);

		updateMethodEClass = createEClass(UPDATE_METHOD);
		createEAttribute(updateMethodEClass, UPDATE_METHOD__INTEREST);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ApidescPackage theApidescPackage = (ApidescPackage)EPackage.Registry.INSTANCE.getEPackage(ApidescPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		iteratorDescriptionEClass.getESuperTypes().add(theApidescPackage.getDeclaredElement());
		iteratorGetterEClass.getESuperTypes().add(theApidescPackage.getGetMechanism());
		observerDescriptionEClass.getESuperTypes().add(theApidescPackage.getDeclaredElement());
		updateMethodEClass.getESuperTypes().add(theApidescPackage.getMethod());

		// Initialize classes and features; add operations and parameters
		initEClass(iteratorDescriptionEClass, IteratorDescription.class, "IteratorDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIteratorDescription_IteratorClass(), ecorePackage.getEString(), "iteratorClass", null, 0, 1, IteratorDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIteratorDescription_HasFinished(), theApidescPackage.getMethod(), null, "hasFinished", null, 1, 1, IteratorDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIteratorDescription_NextElement(), theApidescPackage.getMethod(), null, "nextElement", null, 1, 1, IteratorDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIteratorDescription_CurrentElement(), theApidescPackage.getMethod(), null, "currentElement", null, 0, 1, IteratorDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iteratorGetterEClass, IteratorGetter.class, "IteratorGetter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIteratorGetter_GetIterator(), theApidescPackage.getMethod(), null, "getIterator", null, 1, 1, IteratorGetter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIteratorGetter_Iterator(), this.getIteratorDescription(), null, "iterator", null, 1, 1, IteratorGetter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(observerDescriptionEClass, ObserverDescription.class, "ObserverDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObserverDescription_ObserverClass(), ecorePackage.getEString(), "observerClass", null, 0, 1, ObserverDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObserverDescription_UpdateMethods(), this.getUpdateMethod(), null, "updateMethods", null, 0, -1, ObserverDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateMethodEClass, UpdateMethod.class, "UpdateMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpdateMethod_Interest(), ecorePackage.getEInt(), "interest", null, 0, -1, UpdateMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //PatternsPackageImpl
