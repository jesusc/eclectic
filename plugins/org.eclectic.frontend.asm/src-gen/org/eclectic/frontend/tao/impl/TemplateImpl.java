/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclectic.frontend.tao.impl;

import java.util.Collection;

import org.eclectic.frontend.core.CorePackage;
import org.eclectic.frontend.core.LocatedElement;
import org.eclectic.frontend.core.impl.NamedElementImpl;

import org.eclectic.frontend.tao.TaoPackage;
import org.eclectic.frontend.tao.Template;
import org.eclectic.frontend.tao.TemplateParameter;
import org.eclectic.frontend.tao.TemplateRootObject;

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
 * An implementation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclectic.frontend.tao.impl.TemplateImpl#getRow <em>Row</em>}</li>
 *   <li>{@link org.eclectic.frontend.tao.impl.TemplateImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.eclectic.frontend.tao.impl.TemplateImpl#getFile <em>File</em>}</li>
 *   <li>{@link org.eclectic.frontend.tao.impl.TemplateImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclectic.frontend.tao.impl.TemplateImpl#getRoots <em>Roots</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateImpl extends NamedElementImpl implements Template {
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
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateParameter> parameters;

	/**
	 * The cached value of the '{@link #getRoots() <em>Roots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoots()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateRootObject> roots;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaoPackage.Literals.TEMPLATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TaoPackage.TEMPLATE__ROW, oldRow, row));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TaoPackage.TEMPLATE__COLUMN, oldColumn, column));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TaoPackage.TEMPLATE__FILE, oldFile, file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<TemplateParameter>(TemplateParameter.class, this, TaoPackage.TEMPLATE__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateRootObject> getRoots() {
		if (roots == null) {
			roots = new EObjectContainmentEList<TemplateRootObject>(TemplateRootObject.class, this, TaoPackage.TEMPLATE__ROOTS);
		}
		return roots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaoPackage.TEMPLATE__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case TaoPackage.TEMPLATE__ROOTS:
				return ((InternalEList<?>)getRoots()).basicRemove(otherEnd, msgs);
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
			case TaoPackage.TEMPLATE__ROW:
				return getRow();
			case TaoPackage.TEMPLATE__COLUMN:
				return getColumn();
			case TaoPackage.TEMPLATE__FILE:
				return getFile();
			case TaoPackage.TEMPLATE__PARAMETERS:
				return getParameters();
			case TaoPackage.TEMPLATE__ROOTS:
				return getRoots();
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
			case TaoPackage.TEMPLATE__ROW:
				setRow((Integer)newValue);
				return;
			case TaoPackage.TEMPLATE__COLUMN:
				setColumn((Integer)newValue);
				return;
			case TaoPackage.TEMPLATE__FILE:
				setFile((String)newValue);
				return;
			case TaoPackage.TEMPLATE__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends TemplateParameter>)newValue);
				return;
			case TaoPackage.TEMPLATE__ROOTS:
				getRoots().clear();
				getRoots().addAll((Collection<? extends TemplateRootObject>)newValue);
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
			case TaoPackage.TEMPLATE__ROW:
				setRow(ROW_EDEFAULT);
				return;
			case TaoPackage.TEMPLATE__COLUMN:
				setColumn(COLUMN_EDEFAULT);
				return;
			case TaoPackage.TEMPLATE__FILE:
				setFile(FILE_EDEFAULT);
				return;
			case TaoPackage.TEMPLATE__PARAMETERS:
				getParameters().clear();
				return;
			case TaoPackage.TEMPLATE__ROOTS:
				getRoots().clear();
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
			case TaoPackage.TEMPLATE__ROW:
				return row != ROW_EDEFAULT;
			case TaoPackage.TEMPLATE__COLUMN:
				return column != COLUMN_EDEFAULT;
			case TaoPackage.TEMPLATE__FILE:
				return FILE_EDEFAULT == null ? file != null : !FILE_EDEFAULT.equals(file);
			case TaoPackage.TEMPLATE__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case TaoPackage.TEMPLATE__ROOTS:
				return roots != null && !roots.isEmpty();
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
				case TaoPackage.TEMPLATE__ROW: return CorePackage.LOCATED_ELEMENT__ROW;
				case TaoPackage.TEMPLATE__COLUMN: return CorePackage.LOCATED_ELEMENT__COLUMN;
				case TaoPackage.TEMPLATE__FILE: return CorePackage.LOCATED_ELEMENT__FILE;
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
				case CorePackage.LOCATED_ELEMENT__ROW: return TaoPackage.TEMPLATE__ROW;
				case CorePackage.LOCATED_ELEMENT__COLUMN: return TaoPackage.TEMPLATE__COLUMN;
				case CorePackage.LOCATED_ELEMENT__FILE: return TaoPackage.TEMPLATE__FILE;
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

} //TemplateImpl
