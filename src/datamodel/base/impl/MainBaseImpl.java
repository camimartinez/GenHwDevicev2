/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package datamodel.base.impl;

import datamodel.base.BasePackage;
import datamodel.base.DeviceModel;
import datamodel.base.MainBase;
import datamodel.base.Table;
import datamodel.base.Util;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datamodel.base.impl.MainBaseImpl#getRow <em>Row</em>}</li>
 *   <li>{@link datamodel.base.impl.MainBaseImpl#getSheet <em>Sheet</em>}</li>
 *   <li>{@link datamodel.base.impl.MainBaseImpl#getEReference0 <em>EReference0</em>}</li>
 *   <li>{@link datamodel.base.impl.MainBaseImpl#getConvertInfoTo <em>Convert Info To</em>}</li>
 *   <li>{@link datamodel.base.impl.MainBaseImpl#getGetInfoFromSpread <em>Get Info From Spread</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MainBaseImpl extends EObjectImpl implements MainBase {
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
	 * The cached value of the '{@link #getEReference0() <em>EReference0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference0()
	 * @generated
	 * @ordered
	 */
	protected DeviceModel eReference0;

	/**
	 * The cached value of the '{@link #getConvertInfoTo() <em>Convert Info To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConvertInfoTo()
	 * @generated
	 * @ordered
	 */
	protected Util convertInfoTo;

	/**
	 * The cached value of the '{@link #getGetInfoFromSpread() <em>Get Info From Spread</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetInfoFromSpread()
	 * @generated
	 * @ordered
	 */
	protected Table getInfoFromSpread;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MainBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasePackage.Literals.MAIN_BASE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MAIN_BASE__ROW, oldRow, row));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MAIN_BASE__SHEET, oldSheet, sheet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceModel getEReference0() {
		if (eReference0 != null && eReference0.eIsProxy()) {
			InternalEObject oldEReference0 = (InternalEObject)eReference0;
			eReference0 = (DeviceModel)eResolveProxy(oldEReference0);
			if (eReference0 != oldEReference0) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.MAIN_BASE__EREFERENCE0, oldEReference0, eReference0));
			}
		}
		return eReference0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceModel basicGetEReference0() {
		return eReference0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference0(DeviceModel newEReference0) {
		DeviceModel oldEReference0 = eReference0;
		eReference0 = newEReference0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MAIN_BASE__EREFERENCE0, oldEReference0, eReference0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Util getConvertInfoTo() {
		if (convertInfoTo != null && convertInfoTo.eIsProxy()) {
			InternalEObject oldConvertInfoTo = (InternalEObject)convertInfoTo;
			convertInfoTo = (Util)eResolveProxy(oldConvertInfoTo);
			if (convertInfoTo != oldConvertInfoTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.MAIN_BASE__CONVERT_INFO_TO, oldConvertInfoTo, convertInfoTo));
			}
		}
		return convertInfoTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Util basicGetConvertInfoTo() {
		return convertInfoTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConvertInfoTo(Util newConvertInfoTo) {
		Util oldConvertInfoTo = convertInfoTo;
		convertInfoTo = newConvertInfoTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MAIN_BASE__CONVERT_INFO_TO, oldConvertInfoTo, convertInfoTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getGetInfoFromSpread() {
		if (getInfoFromSpread != null && getInfoFromSpread.eIsProxy()) {
			InternalEObject oldGetInfoFromSpread = (InternalEObject)getInfoFromSpread;
			getInfoFromSpread = (Table)eResolveProxy(oldGetInfoFromSpread);
			if (getInfoFromSpread != oldGetInfoFromSpread) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.MAIN_BASE__GET_INFO_FROM_SPREAD, oldGetInfoFromSpread, getInfoFromSpread));
			}
		}
		return getInfoFromSpread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetGetInfoFromSpread() {
		return getInfoFromSpread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetInfoFromSpread(Table newGetInfoFromSpread) {
		Table oldGetInfoFromSpread = getInfoFromSpread;
		getInfoFromSpread = newGetInfoFromSpread;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MAIN_BASE__GET_INFO_FROM_SPREAD, oldGetInfoFromSpread, getInfoFromSpread));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Assembly() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Description() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DescriptionAsString() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DeviceName() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Extends() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String ICD() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String ICDDate() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String ICDDateAsDatabaseDate() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String ICDDateAsArrayTime() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasePackage.MAIN_BASE__ROW:
				return getRow();
			case BasePackage.MAIN_BASE__SHEET:
				return getSheet();
			case BasePackage.MAIN_BASE__EREFERENCE0:
				if (resolve) return getEReference0();
				return basicGetEReference0();
			case BasePackage.MAIN_BASE__CONVERT_INFO_TO:
				if (resolve) return getConvertInfoTo();
				return basicGetConvertInfoTo();
			case BasePackage.MAIN_BASE__GET_INFO_FROM_SPREAD:
				if (resolve) return getGetInfoFromSpread();
				return basicGetGetInfoFromSpread();
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
			case BasePackage.MAIN_BASE__ROW:
				setRow((String[])newValue);
				return;
			case BasePackage.MAIN_BASE__SHEET:
				setSheet((Integer)newValue);
				return;
			case BasePackage.MAIN_BASE__EREFERENCE0:
				setEReference0((DeviceModel)newValue);
				return;
			case BasePackage.MAIN_BASE__CONVERT_INFO_TO:
				setConvertInfoTo((Util)newValue);
				return;
			case BasePackage.MAIN_BASE__GET_INFO_FROM_SPREAD:
				setGetInfoFromSpread((Table)newValue);
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
			case BasePackage.MAIN_BASE__ROW:
				setRow(ROW_EDEFAULT);
				return;
			case BasePackage.MAIN_BASE__SHEET:
				setSheet(SHEET_EDEFAULT);
				return;
			case BasePackage.MAIN_BASE__EREFERENCE0:
				setEReference0((DeviceModel)null);
				return;
			case BasePackage.MAIN_BASE__CONVERT_INFO_TO:
				setConvertInfoTo((Util)null);
				return;
			case BasePackage.MAIN_BASE__GET_INFO_FROM_SPREAD:
				setGetInfoFromSpread((Table)null);
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
			case BasePackage.MAIN_BASE__ROW:
				return ROW_EDEFAULT == null ? row != null : !ROW_EDEFAULT.equals(row);
			case BasePackage.MAIN_BASE__SHEET:
				return sheet != SHEET_EDEFAULT;
			case BasePackage.MAIN_BASE__EREFERENCE0:
				return eReference0 != null;
			case BasePackage.MAIN_BASE__CONVERT_INFO_TO:
				return convertInfoTo != null;
			case BasePackage.MAIN_BASE__GET_INFO_FROM_SPREAD:
				return getInfoFromSpread != null;
		}
		return super.eIsSet(featureID);
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
		result.append(", sheet: ");
		result.append(sheet);
		result.append(')');
		return result.toString();
	}

} //MainBaseImpl
