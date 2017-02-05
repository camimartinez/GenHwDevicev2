/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package datamodel.base.impl;

import datamodel.base.ArchiveProperty;
import datamodel.base.BasePackage;
import datamodel.base.Table;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Archive Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datamodel.base.impl.ArchivePropertyImpl#getRow <em>Row</em>}</li>
 *   <li>{@link datamodel.base.impl.ArchivePropertyImpl#getSheet <em>Sheet</em>}</li>
 *   <li>{@link datamodel.base.impl.ArchivePropertyImpl#getGetColumnsInfoOfArchi <em>Get Columns Info Of Archi</em>}</li>
 *   <li>{@link datamodel.base.impl.ArchivePropertyImpl#getMp <em>Mp</em>}</li>
 *   <li>{@link datamodel.base.impl.ArchivePropertyImpl#getCp <em>Cp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArchivePropertyImpl extends EObjectImpl implements ArchiveProperty {
	/**
	 * The default value of the '{@link #getRow() <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected static final String[] ROW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRow() <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected String[] row = ROW_EDEFAULT;

	/**
	 * The default value of the '{@link #getSheet() <em>Sheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheet()
	 * @generated
	 * @ordered
	 */
	protected static final int SHEET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSheet() <em>Sheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheet()
	 * @generated
	 * @ordered
	 */
	protected int sheet = SHEET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGetColumnsInfoOfArchi() <em>Get Columns Info Of Archi</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetColumnsInfoOfArchi()
	 * @generated
	 * @ordered
	 */
	protected Table getColumnsInfoOfArchi;

	/**
	 * The default value of the '{@link #getMp() <em>Mp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMp()
	 * @generated
	 * @ordered
	 */
	protected static final Resource MP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMp() <em>Mp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMp()
	 * @generated
	 * @ordered
	 */
	protected Resource mp = MP_EDEFAULT;

	/**
	 * The default value of the '{@link #getCp() <em>Cp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCp()
	 * @generated
	 * @ordered
	 */
	protected static final Resource CP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCp() <em>Cp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCp()
	 * @generated
	 * @ordered
	 */
	protected Resource cp = CP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchivePropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return BasePackage.Literals.ARCHIVE_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String[] getRow() {
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRow(String[] newRow) {
		String[] oldRow = row;
		row = newRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.ARCHIVE_PROPERTY__ROW, oldRow, row));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSheet() {
		return sheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSheet(int newSheet) {
		int oldSheet = sheet;
		sheet = newSheet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.ARCHIVE_PROPERTY__SHEET, oldSheet, sheet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getGetColumnsInfoOfArchi() {
		if (getColumnsInfoOfArchi != null && getColumnsInfoOfArchi.eIsProxy()) {
			InternalEObject oldGetColumnsInfoOfArchi = (InternalEObject)getColumnsInfoOfArchi;
			getColumnsInfoOfArchi = (Table)eResolveProxy(oldGetColumnsInfoOfArchi);
			if (getColumnsInfoOfArchi != oldGetColumnsInfoOfArchi) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.ARCHIVE_PROPERTY__GET_COLUMNS_INFO_OF_ARCHI, oldGetColumnsInfoOfArchi, getColumnsInfoOfArchi));
			}
		}
		return getColumnsInfoOfArchi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetGetColumnsInfoOfArchi() {
		return getColumnsInfoOfArchi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetColumnsInfoOfArchi(Table newGetColumnsInfoOfArchi) {
		Table oldGetColumnsInfoOfArchi = getColumnsInfoOfArchi;
		getColumnsInfoOfArchi = newGetColumnsInfoOfArchi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.ARCHIVE_PROPERTY__GET_COLUMNS_INFO_OF_ARCHI, oldGetColumnsInfoOfArchi, getColumnsInfoOfArchi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getMp() {
		return mp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMp(Resource newMp) {
		Resource oldMp = mp;
		mp = newMp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.ARCHIVE_PROPERTY__MP, oldMp, mp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getCp() {
		return cp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCp(Resource newCp) {
		Resource oldCp = cp;
		cp = newCp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.ARCHIVE_PROPERTY__CP, oldCp, cp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRefersTo() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMonitorPoint() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isControlPoint() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getMonitorPoint() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getControlPoint() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String APName() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Name() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String RefersTo() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String IntervalFull() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Interval() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean OnlyOnChange() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DisplayUnits() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String GraphMin() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String GraphMax() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Format() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean OnStartup() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Tittle() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasePackage.ARCHIVE_PROPERTY__ROW:
				return getRow();
			case BasePackage.ARCHIVE_PROPERTY__SHEET:
				return new Integer(getSheet());
			case BasePackage.ARCHIVE_PROPERTY__GET_COLUMNS_INFO_OF_ARCHI:
				if (resolve) return getGetColumnsInfoOfArchi();
				return basicGetGetColumnsInfoOfArchi();
			case BasePackage.ARCHIVE_PROPERTY__MP:
				return getMp();
			case BasePackage.ARCHIVE_PROPERTY__CP:
				return getCp();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BasePackage.ARCHIVE_PROPERTY__ROW:
				setRow((String[])newValue);
				return;
			case BasePackage.ARCHIVE_PROPERTY__SHEET:
				setSheet(((Integer)newValue).intValue());
				return;
			case BasePackage.ARCHIVE_PROPERTY__GET_COLUMNS_INFO_OF_ARCHI:
				setGetColumnsInfoOfArchi((Table)newValue);
				return;
			case BasePackage.ARCHIVE_PROPERTY__MP:
				setMp((Resource)newValue);
				return;
			case BasePackage.ARCHIVE_PROPERTY__CP:
				setCp((Resource)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case BasePackage.ARCHIVE_PROPERTY__ROW:
				setRow(ROW_EDEFAULT);
				return;
			case BasePackage.ARCHIVE_PROPERTY__SHEET:
				setSheet(SHEET_EDEFAULT);
				return;
			case BasePackage.ARCHIVE_PROPERTY__GET_COLUMNS_INFO_OF_ARCHI:
				setGetColumnsInfoOfArchi((Table)null);
				return;
			case BasePackage.ARCHIVE_PROPERTY__MP:
				setMp(MP_EDEFAULT);
				return;
			case BasePackage.ARCHIVE_PROPERTY__CP:
				setCp(CP_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BasePackage.ARCHIVE_PROPERTY__ROW:
				return ROW_EDEFAULT == null ? row != null : !ROW_EDEFAULT.equals(row);
			case BasePackage.ARCHIVE_PROPERTY__SHEET:
				return sheet != SHEET_EDEFAULT;
			case BasePackage.ARCHIVE_PROPERTY__GET_COLUMNS_INFO_OF_ARCHI:
				return getColumnsInfoOfArchi != null;
			case BasePackage.ARCHIVE_PROPERTY__MP:
				return MP_EDEFAULT == null ? mp != null : !MP_EDEFAULT.equals(mp);
			case BasePackage.ARCHIVE_PROPERTY__CP:
				return CP_EDEFAULT == null ? cp != null : !CP_EDEFAULT.equals(cp);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (row: ");
		result.append(row);
		result.append(", sheet: ");
		result.append(sheet);
		result.append(", mp: ");
		result.append(mp);
		result.append(", cp: ");
		result.append(cp);
		result.append(')');
		return result.toString();
	}

} //ArchivePropertyImpl
