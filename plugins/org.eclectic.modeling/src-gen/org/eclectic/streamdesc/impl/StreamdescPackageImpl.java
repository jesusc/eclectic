/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.streamdesc.impl;

import org.eclectic.streamdesc.ElementSlidingWindow;
import org.eclectic.streamdesc.KeySpec;
import org.eclectic.streamdesc.SlidingWindow;
import org.eclectic.streamdesc.StreamDescription;
import org.eclectic.streamdesc.StreamdescFactory;
import org.eclectic.streamdesc.StreamdescPackage;

import org.eclectic.streamdesc.TimeSlidingWindow;
import org.eclectic.streamdesc.runtime.RuntimePackage;

import org.eclectic.streamdesc.runtime.impl.RuntimePackageImpl;

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
public class StreamdescPackageImpl extends EPackageImpl implements StreamdescPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass streamDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slidingWindowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementSlidingWindowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeSlidingWindowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keySpecEClass = null;

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
	 * @see org.eclectic.streamdesc.StreamdescPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StreamdescPackageImpl() {
		super(eNS_URI, StreamdescFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StreamdescPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StreamdescPackage init() {
		if (isInited) return (StreamdescPackage)EPackage.Registry.INSTANCE.getEPackage(StreamdescPackage.eNS_URI);

		// Obtain or create and register package
		StreamdescPackageImpl theStreamdescPackage = (StreamdescPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StreamdescPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StreamdescPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		RuntimePackageImpl theRuntimePackage = (RuntimePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI) instanceof RuntimePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI) : RuntimePackage.eINSTANCE);

		// Create package meta-data objects
		theStreamdescPackage.createPackageContents();
		theRuntimePackage.createPackageContents();

		// Initialize created meta-data
		theStreamdescPackage.initializePackageContents();
		theRuntimePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStreamdescPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StreamdescPackage.eNS_URI, theStreamdescPackage);
		return theStreamdescPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStreamDescription() {
		return streamDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStreamDescription_StreamName() {
		return (EAttribute)streamDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStreamDescription_MetamodelName() {
		return (EAttribute)streamDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStreamDescription_Keys() {
		return (EReference)streamDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStreamDescription_Windows() {
		return (EReference)streamDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlidingWindow() {
		return slidingWindowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlidingWindow_ClassName() {
		return (EAttribute)slidingWindowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementSlidingWindow() {
		return elementSlidingWindowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementSlidingWindow_Elements() {
		return (EAttribute)elementSlidingWindowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeSlidingWindow() {
		return timeSlidingWindowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeSlidingWindow_Seconds() {
		return (EAttribute)timeSlidingWindowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeySpec() {
		return keySpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeySpec_ClassName() {
		return (EAttribute)keySpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeySpec_FeatureName() {
		return (EAttribute)keySpecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamdescFactory getStreamdescFactory() {
		return (StreamdescFactory)getEFactoryInstance();
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
		streamDescriptionEClass = createEClass(STREAM_DESCRIPTION);
		createEAttribute(streamDescriptionEClass, STREAM_DESCRIPTION__STREAM_NAME);
		createEAttribute(streamDescriptionEClass, STREAM_DESCRIPTION__METAMODEL_NAME);
		createEReference(streamDescriptionEClass, STREAM_DESCRIPTION__KEYS);
		createEReference(streamDescriptionEClass, STREAM_DESCRIPTION__WINDOWS);

		slidingWindowEClass = createEClass(SLIDING_WINDOW);
		createEAttribute(slidingWindowEClass, SLIDING_WINDOW__CLASS_NAME);

		elementSlidingWindowEClass = createEClass(ELEMENT_SLIDING_WINDOW);
		createEAttribute(elementSlidingWindowEClass, ELEMENT_SLIDING_WINDOW__ELEMENTS);

		timeSlidingWindowEClass = createEClass(TIME_SLIDING_WINDOW);
		createEAttribute(timeSlidingWindowEClass, TIME_SLIDING_WINDOW__SECONDS);

		keySpecEClass = createEClass(KEY_SPEC);
		createEAttribute(keySpecEClass, KEY_SPEC__CLASS_NAME);
		createEAttribute(keySpecEClass, KEY_SPEC__FEATURE_NAME);
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
		RuntimePackage theRuntimePackage = (RuntimePackage)EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theRuntimePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		elementSlidingWindowEClass.getESuperTypes().add(this.getSlidingWindow());
		timeSlidingWindowEClass.getESuperTypes().add(this.getSlidingWindow());

		// Initialize classes and features; add operations and parameters
		initEClass(streamDescriptionEClass, StreamDescription.class, "StreamDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStreamDescription_StreamName(), ecorePackage.getEString(), "streamName", null, 1, 1, StreamDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStreamDescription_MetamodelName(), ecorePackage.getEString(), "metamodelName", null, 1, 1, StreamDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStreamDescription_Keys(), this.getKeySpec(), null, "keys", null, 0, -1, StreamDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStreamDescription_Windows(), this.getSlidingWindow(), null, "windows", null, 0, -1, StreamDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(slidingWindowEClass, SlidingWindow.class, "SlidingWindow", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSlidingWindow_ClassName(), ecorePackage.getEString(), "className", null, 1, 1, SlidingWindow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementSlidingWindowEClass, ElementSlidingWindow.class, "ElementSlidingWindow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementSlidingWindow_Elements(), ecorePackage.getEInt(), "elements", null, 1, 1, ElementSlidingWindow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeSlidingWindowEClass, TimeSlidingWindow.class, "TimeSlidingWindow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeSlidingWindow_Seconds(), ecorePackage.getEInt(), "seconds", null, 1, 1, TimeSlidingWindow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keySpecEClass, KeySpec.class, "KeySpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeySpec_ClassName(), ecorePackage.getEString(), "className", null, 1, 1, KeySpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeySpec_FeatureName(), ecorePackage.getEString(), "featureName", null, 1, 1, KeySpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //StreamdescPackageImpl
