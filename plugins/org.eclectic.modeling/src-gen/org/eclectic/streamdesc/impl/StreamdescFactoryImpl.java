/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.streamdesc.impl;

import org.eclectic.streamdesc.*;

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
public class StreamdescFactoryImpl extends EFactoryImpl implements StreamdescFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StreamdescFactory init() {
		try {
			StreamdescFactory theStreamdescFactory = (StreamdescFactory)EPackage.Registry.INSTANCE.getEFactory("http://eclectic.org/streamdesc"); 
			if (theStreamdescFactory != null) {
				return theStreamdescFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StreamdescFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamdescFactoryImpl() {
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
			case StreamdescPackage.STREAM_DESCRIPTION: return createStreamDescription();
			case StreamdescPackage.ELEMENT_SLIDING_WINDOW: return createElementSlidingWindow();
			case StreamdescPackage.TIME_SLIDING_WINDOW: return createTimeSlidingWindow();
			case StreamdescPackage.KEY_SPEC: return createKeySpec();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamDescription createStreamDescription() {
		StreamDescriptionImpl streamDescription = new StreamDescriptionImpl();
		return streamDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementSlidingWindow createElementSlidingWindow() {
		ElementSlidingWindowImpl elementSlidingWindow = new ElementSlidingWindowImpl();
		return elementSlidingWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSlidingWindow createTimeSlidingWindow() {
		TimeSlidingWindowImpl timeSlidingWindow = new TimeSlidingWindowImpl();
		return timeSlidingWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeySpec createKeySpec() {
		KeySpecImpl keySpec = new KeySpecImpl();
		return keySpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamdescPackage getStreamdescPackage() {
		return (StreamdescPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StreamdescPackage getPackage() {
		return StreamdescPackage.eINSTANCE;
	}

} //StreamdescFactoryImpl
