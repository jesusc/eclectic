/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.mappings.impl;

import org.eclectic.frontend.core.CorePackage;
import org.eclectic.frontend.core.LocatedElement;
import org.eclectic.frontend.mappings.Converter;
import org.eclectic.frontend.mappings.Feature2Feature;
import org.eclectic.frontend.mappings.FeatureRef;
import org.eclectic.frontend.mappings.MappingElement;
import org.eclectic.frontend.mappings.MappingsPackage;
import org.eclectic.frontend.mappings.MatchedElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.frontend.mappings.impl.FeatureRefImpl#getRow <em>Row</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.impl.FeatureRefImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.impl.FeatureRefImpl#getFile <em>File</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.impl.FeatureRefImpl#getLeftFeature <em>Left Feature</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.impl.FeatureRefImpl#getConverter <em>Converter</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.impl.FeatureRefImpl#getReferredElement <em>Referred Element</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.impl.FeatureRefImpl#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link org.eclectic.frontend.mappings.impl.FeatureRefImpl#isMultivalued <em>Multivalued</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureRefImpl extends MetamodelElementRefImpl implements FeatureRef {
	/**
	 * The default value of the '{@link #getRow() <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected static final int ROW_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRow() <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected int row = ROW_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumn() <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected static final int COLUMN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected int column = COLUMN_EDEFAULT;

	/**
	 * The default value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected String file = FILE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLeftFeature() <em>Left Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftFeature()
	 * @generated
	 * @ordered
	 */
	protected FeatureRef leftFeature;

	/**
	 * The cached value of the '{@link #getConverter() <em>Converter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConverter()
	 * @generated
	 * @ordered
	 */
	protected Converter converter;

	/**
	 * The cached value of the '{@link #getReferredElement() <em>Referred Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferredElement()
	 * @generated
	 * @ordered
	 */
	protected MatchedElement referredElement;

	/**
	 * The default value of the '{@link #getFeatureName() <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureName()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeatureName() <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureName()
	 * @generated
	 * @ordered
	 */
	protected String featureName = FEATURE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isMultivalued() <em>Multivalued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultivalued()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTIVALUED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMultivalued() <em>Multivalued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultivalued()
	 * @generated
	 * @ordered
	 */
	protected boolean multivalued = MULTIVALUED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingsPackage.Literals.FEATURE_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRow() {
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRow(int newRow) {
		int oldRow = row;
		row = newRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingsPackage.FEATURE_REF__ROW, oldRow, row));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColumn() {
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumn(int newColumn) {
		int oldColumn = column;
		column = newColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingsPackage.FEATURE_REF__COLUMN, oldColumn, column));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFile() {
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFile(String newFile) {
		String oldFile = file;
		file = newFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingsPackage.FEATURE_REF__FILE, oldFile, file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureRef getLeftFeature() {
		return leftFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftFeature(FeatureRef newLeftFeature, NotificationChain msgs) {
		FeatureRef oldLeftFeature = leftFeature;
		leftFeature = newLeftFeature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MappingsPackage.FEATURE_REF__LEFT_FEATURE, oldLeftFeature, newLeftFeature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftFeature(FeatureRef newLeftFeature) {
		if (newLeftFeature != leftFeature) {
			NotificationChain msgs = null;
			if (leftFeature != null)
				msgs = ((InternalEObject)leftFeature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MappingsPackage.FEATURE_REF__LEFT_FEATURE, null, msgs);
			if (newLeftFeature != null)
				msgs = ((InternalEObject)newLeftFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MappingsPackage.FEATURE_REF__LEFT_FEATURE, null, msgs);
			msgs = basicSetLeftFeature(newLeftFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingsPackage.FEATURE_REF__LEFT_FEATURE, newLeftFeature, newLeftFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Converter getConverter() {
		return converter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConverter(Converter newConverter, NotificationChain msgs) {
		Converter oldConverter = converter;
		converter = newConverter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MappingsPackage.FEATURE_REF__CONVERTER, oldConverter, newConverter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConverter(Converter newConverter) {
		if (newConverter != converter) {
			NotificationChain msgs = null;
			if (converter != null)
				msgs = ((InternalEObject)converter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MappingsPackage.FEATURE_REF__CONVERTER, null, msgs);
			if (newConverter != null)
				msgs = ((InternalEObject)newConverter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MappingsPackage.FEATURE_REF__CONVERTER, null, msgs);
			msgs = basicSetConverter(newConverter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingsPackage.FEATURE_REF__CONVERTER, newConverter, newConverter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchedElement getReferredElement() {
		if (referredElement != null && referredElement.eIsProxy()) {
			InternalEObject oldReferredElement = (InternalEObject)referredElement;
			referredElement = (MatchedElement)eResolveProxy(oldReferredElement);
			if (referredElement != oldReferredElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MappingsPackage.FEATURE_REF__REFERRED_ELEMENT, oldReferredElement, referredElement));
			}
		}
		return referredElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchedElement basicGetReferredElement() {
		return referredElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferredElement(MatchedElement newReferredElement) {
		MatchedElement oldReferredElement = referredElement;
		referredElement = newReferredElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingsPackage.FEATURE_REF__REFERRED_ELEMENT, oldReferredElement, referredElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeatureName() {
		return featureName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureName(String newFeatureName) {
		String oldFeatureName = featureName;
		featureName = newFeatureName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingsPackage.FEATURE_REF__FEATURE_NAME, oldFeatureName, featureName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultivalued() {
		return multivalued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultivalued(boolean newMultivalued) {
		boolean oldMultivalued = multivalued;
		multivalued = newMultivalued;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingsPackage.FEATURE_REF__MULTIVALUED, oldMultivalued, multivalued));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MappingsPackage.FEATURE_REF__LEFT_FEATURE:
				return basicSetLeftFeature(null, msgs);
			case MappingsPackage.FEATURE_REF__CONVERTER:
				return basicSetConverter(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MappingsPackage.FEATURE_REF__ROW:
				return getRow();
			case MappingsPackage.FEATURE_REF__COLUMN:
				return getColumn();
			case MappingsPackage.FEATURE_REF__FILE:
				return getFile();
			case MappingsPackage.FEATURE_REF__LEFT_FEATURE:
				return getLeftFeature();
			case MappingsPackage.FEATURE_REF__CONVERTER:
				return getConverter();
			case MappingsPackage.FEATURE_REF__REFERRED_ELEMENT:
				if (resolve) return getReferredElement();
				return basicGetReferredElement();
			case MappingsPackage.FEATURE_REF__FEATURE_NAME:
				return getFeatureName();
			case MappingsPackage.FEATURE_REF__MULTIVALUED:
				return isMultivalued();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MappingsPackage.FEATURE_REF__ROW:
				setRow((Integer)newValue);
				return;
			case MappingsPackage.FEATURE_REF__COLUMN:
				setColumn((Integer)newValue);
				return;
			case MappingsPackage.FEATURE_REF__FILE:
				setFile((String)newValue);
				return;
			case MappingsPackage.FEATURE_REF__LEFT_FEATURE:
				setLeftFeature((FeatureRef)newValue);
				return;
			case MappingsPackage.FEATURE_REF__CONVERTER:
				setConverter((Converter)newValue);
				return;
			case MappingsPackage.FEATURE_REF__REFERRED_ELEMENT:
				setReferredElement((MatchedElement)newValue);
				return;
			case MappingsPackage.FEATURE_REF__FEATURE_NAME:
				setFeatureName((String)newValue);
				return;
			case MappingsPackage.FEATURE_REF__MULTIVALUED:
				setMultivalued((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MappingsPackage.FEATURE_REF__ROW:
				setRow(ROW_EDEFAULT);
				return;
			case MappingsPackage.FEATURE_REF__COLUMN:
				setColumn(COLUMN_EDEFAULT);
				return;
			case MappingsPackage.FEATURE_REF__FILE:
				setFile(FILE_EDEFAULT);
				return;
			case MappingsPackage.FEATURE_REF__LEFT_FEATURE:
				setLeftFeature((FeatureRef)null);
				return;
			case MappingsPackage.FEATURE_REF__CONVERTER:
				setConverter((Converter)null);
				return;
			case MappingsPackage.FEATURE_REF__REFERRED_ELEMENT:
				setReferredElement((MatchedElement)null);
				return;
			case MappingsPackage.FEATURE_REF__FEATURE_NAME:
				setFeatureName(FEATURE_NAME_EDEFAULT);
				return;
			case MappingsPackage.FEATURE_REF__MULTIVALUED:
				setMultivalued(MULTIVALUED_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MappingsPackage.FEATURE_REF__ROW:
				return row != ROW_EDEFAULT;
			case MappingsPackage.FEATURE_REF__COLUMN:
				return column != COLUMN_EDEFAULT;
			case MappingsPackage.FEATURE_REF__FILE:
				return FILE_EDEFAULT == null ? file != null : !FILE_EDEFAULT.equals(file);
			case MappingsPackage.FEATURE_REF__LEFT_FEATURE:
				return leftFeature != null;
			case MappingsPackage.FEATURE_REF__CONVERTER:
				return converter != null;
			case MappingsPackage.FEATURE_REF__REFERRED_ELEMENT:
				return referredElement != null;
			case MappingsPackage.FEATURE_REF__FEATURE_NAME:
				return FEATURE_NAME_EDEFAULT == null ? featureName != null : !FEATURE_NAME_EDEFAULT.equals(featureName);
			case MappingsPackage.FEATURE_REF__MULTIVALUED:
				return multivalued != MULTIVALUED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == LocatedElement.class) {
			switch (derivedFeatureID) {
				case MappingsPackage.FEATURE_REF__ROW: return CorePackage.LOCATED_ELEMENT__ROW;
				case MappingsPackage.FEATURE_REF__COLUMN: return CorePackage.LOCATED_ELEMENT__COLUMN;
				case MappingsPackage.FEATURE_REF__FILE: return CorePackage.LOCATED_ELEMENT__FILE;
				default: return -1;
			}
		}
		if (baseClass == MappingElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Feature2Feature.class) {
			switch (derivedFeatureID) {
				case MappingsPackage.FEATURE_REF__LEFT_FEATURE: return MappingsPackage.FEATURE2_FEATURE__LEFT_FEATURE;
				case MappingsPackage.FEATURE_REF__CONVERTER: return MappingsPackage.FEATURE2_FEATURE__CONVERTER;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == LocatedElement.class) {
			switch (baseFeatureID) {
				case CorePackage.LOCATED_ELEMENT__ROW: return MappingsPackage.FEATURE_REF__ROW;
				case CorePackage.LOCATED_ELEMENT__COLUMN: return MappingsPackage.FEATURE_REF__COLUMN;
				case CorePackage.LOCATED_ELEMENT__FILE: return MappingsPackage.FEATURE_REF__FILE;
				default: return -1;
			}
		}
		if (baseClass == MappingElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Feature2Feature.class) {
			switch (baseFeatureID) {
				case MappingsPackage.FEATURE2_FEATURE__LEFT_FEATURE: return MappingsPackage.FEATURE_REF__LEFT_FEATURE;
				case MappingsPackage.FEATURE2_FEATURE__CONVERTER: return MappingsPackage.FEATURE_REF__CONVERTER;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (row: ");
		result.append(row);
		result.append(", column: ");
		result.append(column);
		result.append(", file: ");
		result.append(file);
		result.append(", featureName: ");
		result.append(featureName);
		result.append(", multivalued: ");
		result.append(multivalued);
		result.append(')');
		return result.toString();
	}

} //FeatureRefImpl
