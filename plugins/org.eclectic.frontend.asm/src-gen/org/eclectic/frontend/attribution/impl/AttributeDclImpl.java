/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.attribution.impl;

import org.eclectic.frontend.attribution.AttributeDcl;
import org.eclectic.frontend.attribution.AttributionPackage;

import org.eclectic.frontend.core.ClassUse;
import org.eclectic.frontend.core.CorePackage;
import org.eclectic.frontend.core.LocatedElement;
import org.eclectic.frontend.core.TypedWithClass;

import org.eclectic.frontend.core.impl.VariableImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Dcl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.frontend.attribution.impl.AttributeDclImpl#getType_ <em>Type </em>}</li>
 *   <li>{@link org.eclectic.frontend.attribution.impl.AttributeDclImpl#getRow <em>Row</em>}</li>
 *   <li>{@link org.eclectic.frontend.attribution.impl.AttributeDclImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.eclectic.frontend.attribution.impl.AttributeDclImpl#getFile <em>File</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AttributeDclImpl extends VariableImpl implements AttributeDcl {
	/**
	 * The cached value of the '{@link #getType_() <em>Type </em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_()
	 * @generated
	 * @ordered
	 */
	protected ClassUse type_;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeDclImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AttributionPackage.Literals.ATTRIBUTE_DCL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassUse getType_() {
		return type_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType_(ClassUse newType_, NotificationChain msgs) {
		ClassUse oldType_ = type_;
		type_ = newType_;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AttributionPackage.ATTRIBUTE_DCL__TYPE_, oldType_, newType_);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType_(ClassUse newType_) {
		if (newType_ != type_) {
			NotificationChain msgs = null;
			if (type_ != null)
				msgs = ((InternalEObject)type_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AttributionPackage.ATTRIBUTE_DCL__TYPE_, null, msgs);
			if (newType_ != null)
				msgs = ((InternalEObject)newType_).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AttributionPackage.ATTRIBUTE_DCL__TYPE_, null, msgs);
			msgs = basicSetType_(newType_, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AttributionPackage.ATTRIBUTE_DCL__TYPE_, newType_, newType_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AttributionPackage.ATTRIBUTE_DCL__ROW, oldRow, row));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AttributionPackage.ATTRIBUTE_DCL__COLUMN, oldColumn, column));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AttributionPackage.ATTRIBUTE_DCL__FILE, oldFile, file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AttributionPackage.ATTRIBUTE_DCL__TYPE_:
				return basicSetType_(null, msgs);
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
			case AttributionPackage.ATTRIBUTE_DCL__TYPE_:
				return getType_();
			case AttributionPackage.ATTRIBUTE_DCL__ROW:
				return getRow();
			case AttributionPackage.ATTRIBUTE_DCL__COLUMN:
				return getColumn();
			case AttributionPackage.ATTRIBUTE_DCL__FILE:
				return getFile();
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
			case AttributionPackage.ATTRIBUTE_DCL__TYPE_:
				setType_((ClassUse)newValue);
				return;
			case AttributionPackage.ATTRIBUTE_DCL__ROW:
				setRow((Integer)newValue);
				return;
			case AttributionPackage.ATTRIBUTE_DCL__COLUMN:
				setColumn((Integer)newValue);
				return;
			case AttributionPackage.ATTRIBUTE_DCL__FILE:
				setFile((String)newValue);
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
			case AttributionPackage.ATTRIBUTE_DCL__TYPE_:
				setType_((ClassUse)null);
				return;
			case AttributionPackage.ATTRIBUTE_DCL__ROW:
				setRow(ROW_EDEFAULT);
				return;
			case AttributionPackage.ATTRIBUTE_DCL__COLUMN:
				setColumn(COLUMN_EDEFAULT);
				return;
			case AttributionPackage.ATTRIBUTE_DCL__FILE:
				setFile(FILE_EDEFAULT);
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
			case AttributionPackage.ATTRIBUTE_DCL__TYPE_:
				return type_ != null;
			case AttributionPackage.ATTRIBUTE_DCL__ROW:
				return row != ROW_EDEFAULT;
			case AttributionPackage.ATTRIBUTE_DCL__COLUMN:
				return column != COLUMN_EDEFAULT;
			case AttributionPackage.ATTRIBUTE_DCL__FILE:
				return FILE_EDEFAULT == null ? file != null : !FILE_EDEFAULT.equals(file);
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
		if (baseClass == TypedWithClass.class) {
			switch (derivedFeatureID) {
				case AttributionPackage.ATTRIBUTE_DCL__TYPE_: return CorePackage.TYPED_WITH_CLASS__TYPE_;
				default: return -1;
			}
		}
		if (baseClass == LocatedElement.class) {
			switch (derivedFeatureID) {
				case AttributionPackage.ATTRIBUTE_DCL__ROW: return CorePackage.LOCATED_ELEMENT__ROW;
				case AttributionPackage.ATTRIBUTE_DCL__COLUMN: return CorePackage.LOCATED_ELEMENT__COLUMN;
				case AttributionPackage.ATTRIBUTE_DCL__FILE: return CorePackage.LOCATED_ELEMENT__FILE;
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
		if (baseClass == TypedWithClass.class) {
			switch (baseFeatureID) {
				case CorePackage.TYPED_WITH_CLASS__TYPE_: return AttributionPackage.ATTRIBUTE_DCL__TYPE_;
				default: return -1;
			}
		}
		if (baseClass == LocatedElement.class) {
			switch (baseFeatureID) {
				case CorePackage.LOCATED_ELEMENT__ROW: return AttributionPackage.ATTRIBUTE_DCL__ROW;
				case CorePackage.LOCATED_ELEMENT__COLUMN: return AttributionPackage.ATTRIBUTE_DCL__COLUMN;
				case CorePackage.LOCATED_ELEMENT__FILE: return AttributionPackage.ATTRIBUTE_DCL__FILE;
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
		result.append(')');
		return result.toString();
	}

} //AttributeDclImpl
