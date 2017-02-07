/**
 * ALMA - Atacama Large Millimiter Array
 * (c) European Southern Observatory, 2017
 * Copyright by ESO (in the framework of the ALMA collaboration),
 * All rights reserved
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, 
 * MA 02111-1307  USA
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
 *   <li>{@link datamodel.base.impl.MainBaseImpl#getImplementTo <em>Implement To</em>}</li>
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
	 * The cached value of the '{@link #getImplementTo() <em>Implement To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementTo()
	 * @generated
	 * @ordered
	 */
	protected DeviceModel implementTo;

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
	public DeviceModel getImplementTo() {
		if (implementTo != null && implementTo.eIsProxy()) {
			InternalEObject oldImplementTo = (InternalEObject)implementTo;
			implementTo = (DeviceModel)eResolveProxy(oldImplementTo);
			if (implementTo != oldImplementTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.MAIN_BASE__IMPLEMENT_TO, oldImplementTo, implementTo));
			}
		}
		return implementTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceModel basicGetImplementTo() {
		return implementTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementTo(DeviceModel newImplementTo) {
		DeviceModel oldImplementTo = implementTo;
		implementTo = newImplementTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MAIN_BASE__IMPLEMENT_TO, oldImplementTo, implementTo));
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
		return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "Assembly")];
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Description() {
		return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "Description")];
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DescriptionAsString() {
		return BaseFactoryImpl.eINSTANCE.createUtil().descriptionAsString(Description());
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DeviceName() {
		return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "Device Name")];
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Extends() {
		return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "Extends")];
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String ICD() {
		return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "ICD")];
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String ICDDate() {
		return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "ICD Date")];
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String ICDDateAsDatabaseDate() {
		return BaseFactoryImpl.eINSTANCE.createUtil().toDatabaseDate(ICDDate());
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String ICDDateAsArrayTime() {
		return BaseFactoryImpl.eINSTANCE.createUtil().toArrayTime(ICDDate());
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
			case BasePackage.MAIN_BASE__IMPLEMENT_TO:
				if (resolve) return getImplementTo();
				return basicGetImplementTo();
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
			case BasePackage.MAIN_BASE__IMPLEMENT_TO:
				setImplementTo((DeviceModel)newValue);
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
			case BasePackage.MAIN_BASE__IMPLEMENT_TO:
				setImplementTo((DeviceModel)null);
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
			case BasePackage.MAIN_BASE__IMPLEMENT_TO:
				return implementTo != null;
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
