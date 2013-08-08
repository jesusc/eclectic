/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.tao.impl;

import java.util.Collection;

import org.eclectic.frontend.core.ClassUse;

import org.eclectic.frontend.core.CorePackage;
import org.eclectic.frontend.core.LocatedElement;
import org.eclectic.frontend.core.Statement;
import org.eclectic.frontend.core.impl.VariableImpl;

import org.eclectic.frontend.tao.Assignment;
import org.eclectic.frontend.tao.ObjectInstantiation;
import org.eclectic.frontend.tao.TaoPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Instantiation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.frontend.tao.impl.ObjectInstantiationImpl#getRow <em>Row</em>}</li>
 *   <li>{@link org.eclectic.frontend.tao.impl.ObjectInstantiationImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.eclectic.frontend.tao.impl.ObjectInstantiationImpl#getFile <em>File</em>}</li>
 *   <li>{@link org.eclectic.frontend.tao.impl.ObjectInstantiationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclectic.frontend.tao.impl.ObjectInstantiationImpl#getAssigments <em>Assigments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectInstantiationImpl extends VariableImpl implements ObjectInstantiation {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ClassUse type;

	/**
	 * The cached value of the '{@link #getAssigments() <em>Assigments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssigments()
	 * @generated
	 * @ordered
	 */
	protected EList<Assignment> assigments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectInstantiationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaoPackage.Literals.OBJECT_INSTANTIATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TaoPackage.OBJECT_INSTANTIATION__ROW, oldRow, row));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TaoPackage.OBJECT_INSTANTIATION__COLUMN, oldColumn, column));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TaoPackage.OBJECT_INSTANTIATION__FILE, oldFile, file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassUse getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(ClassUse newType, NotificationChain msgs) {
		ClassUse oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaoPackage.OBJECT_INSTANTIATION__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ClassUse newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TaoPackage.OBJECT_INSTANTIATION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TaoPackage.OBJECT_INSTANTIATION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaoPackage.OBJECT_INSTANTIATION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Assignment> getAssigments() {
		if (assigments == null) {
			assigments = new EObjectContainmentEList<Assignment>(Assignment.class, this, TaoPackage.OBJECT_INSTANTIATION__ASSIGMENTS);
		}
		return assigments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaoPackage.OBJECT_INSTANTIATION__TYPE:
				return basicSetType(null, msgs);
			case TaoPackage.OBJECT_INSTANTIATION__ASSIGMENTS:
				return ((InternalEList<?>)getAssigments()).basicRemove(otherEnd, msgs);
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
			case TaoPackage.OBJECT_INSTANTIATION__ROW:
				return getRow();
			case TaoPackage.OBJECT_INSTANTIATION__COLUMN:
				return getColumn();
			case TaoPackage.OBJECT_INSTANTIATION__FILE:
				return getFile();
			case TaoPackage.OBJECT_INSTANTIATION__TYPE:
				return getType();
			case TaoPackage.OBJECT_INSTANTIATION__ASSIGMENTS:
				return getAssigments();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TaoPackage.OBJECT_INSTANTIATION__ROW:
				setRow((Integer)newValue);
				return;
			case TaoPackage.OBJECT_INSTANTIATION__COLUMN:
				setColumn((Integer)newValue);
				return;
			case TaoPackage.OBJECT_INSTANTIATION__FILE:
				setFile((String)newValue);
				return;
			case TaoPackage.OBJECT_INSTANTIATION__TYPE:
				setType((ClassUse)newValue);
				return;
			case TaoPackage.OBJECT_INSTANTIATION__ASSIGMENTS:
				getAssigments().clear();
				getAssigments().addAll((Collection<? extends Assignment>)newValue);
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
			case TaoPackage.OBJECT_INSTANTIATION__ROW:
				setRow(ROW_EDEFAULT);
				return;
			case TaoPackage.OBJECT_INSTANTIATION__COLUMN:
				setColumn(COLUMN_EDEFAULT);
				return;
			case TaoPackage.OBJECT_INSTANTIATION__FILE:
				setFile(FILE_EDEFAULT);
				return;
			case TaoPackage.OBJECT_INSTANTIATION__TYPE:
				setType((ClassUse)null);
				return;
			case TaoPackage.OBJECT_INSTANTIATION__ASSIGMENTS:
				getAssigments().clear();
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
			case TaoPackage.OBJECT_INSTANTIATION__ROW:
				return row != ROW_EDEFAULT;
			case TaoPackage.OBJECT_INSTANTIATION__COLUMN:
				return column != COLUMN_EDEFAULT;
			case TaoPackage.OBJECT_INSTANTIATION__FILE:
				return FILE_EDEFAULT == null ? file != null : !FILE_EDEFAULT.equals(file);
			case TaoPackage.OBJECT_INSTANTIATION__TYPE:
				return type != null;
			case TaoPackage.OBJECT_INSTANTIATION__ASSIGMENTS:
				return assigments != null && !assigments.isEmpty();
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
				case TaoPackage.OBJECT_INSTANTIATION__ROW: return CorePackage.LOCATED_ELEMENT__ROW;
				case TaoPackage.OBJECT_INSTANTIATION__COLUMN: return CorePackage.LOCATED_ELEMENT__COLUMN;
				case TaoPackage.OBJECT_INSTANTIATION__FILE: return CorePackage.LOCATED_ELEMENT__FILE;
				default: return -1;
			}
		}
		if (baseClass == Statement.class) {
			switch (derivedFeatureID) {
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
				case CorePackage.LOCATED_ELEMENT__ROW: return TaoPackage.OBJECT_INSTANTIATION__ROW;
				case CorePackage.LOCATED_ELEMENT__COLUMN: return TaoPackage.OBJECT_INSTANTIATION__COLUMN;
				case CorePackage.LOCATED_ELEMENT__FILE: return TaoPackage.OBJECT_INSTANTIATION__FILE;
				default: return -1;
			}
		}
		if (baseClass == Statement.class) {
			switch (baseFeatureID) {
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

} //ObjectInstantiationImpl
