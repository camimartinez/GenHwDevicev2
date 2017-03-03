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
 * 
 */
package alma.control.datamodel.meta.base.impl;

import alma.control.datamodel.meta.amb.AmbFactory;
import alma.control.datamodel.meta.amb.AmbPackage;

import alma.control.datamodel.meta.base.BasePackage;
import alma.control.datamodel.meta.base.MainBase;
import alma.control.datamodel.meta.base.Table;
import alma.control.datamodel.meta.base.Util;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alma.control.datamodel.meta.base.impl.MainBaseImpl#getRow <em>Row</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.MainBaseImpl#getSheet <em>Sheet</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.MainBaseImpl#getTable <em>Table</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.MainBaseImpl#getUtil <em>Util</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.MainBaseImpl#getUtilss <em>Utilss</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.MainBaseImpl#getTables <em>Tables</em>}</li>
 * </ul>
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	public MainBaseImpl(String[] row) {
		this.row = row;
		this.sheet = BaseFactoryImpl.eINSTANCE.createTable().getSheetNum("Hardware Device");
	}
	
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
	 * The default value of the '{@link #getTable() <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected static final Table TABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTable() <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected Table table = TABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUtil() <em>Util</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtil()
	 * @generated
	 * @ordered
	 */
	protected static final Util UTIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUtil() <em>Util</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtil()
	 * @generated
	 * @ordered
	 */
	protected Util util = UTIL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUtilss() <em>Utilss</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilss()
	 * @generated
	 * @ordered
	 */
	protected Util utilss;

	/**
	 * The cached value of the '{@link #getTables() <em>Tables</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTables()
	 * @generated
	 * @ordered
	 */
	protected Table tables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainBaseImpl() {
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
	public Table getTable() {
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(Table newTable) {
		Table oldTable = table;
		table = newTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MAIN_BASE__TABLE, oldTable, table));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Util getUtil() {
		return util;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtil(Util newUtil) {
		Util oldUtil = util;
		util = newUtil;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MAIN_BASE__UTIL, oldUtil, util));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Util getUtilss() {
		if (utilss != null && utilss.eIsProxy()) {
			InternalEObject oldUtilss = (InternalEObject)utilss;
			utilss = (Util)eResolveProxy(oldUtilss);
			if (utilss != oldUtilss) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.MAIN_BASE__UTILSS, oldUtilss, utilss));
			}
		}
		return utilss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Util basicGetUtilss() {
		return utilss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtilss(Util newUtilss) {
		Util oldUtilss = utilss;
		utilss = newUtilss;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MAIN_BASE__UTILSS, oldUtilss, utilss));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getTables() {
		if (tables != null && tables.eIsProxy()) {
			InternalEObject oldTables = (InternalEObject)tables;
			tables = (Table)eResolveProxy(oldTables);
			if (tables != oldTables) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.MAIN_BASE__TABLES, oldTables, tables));
			}
		}
		return tables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetTables() {
		return tables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTables(Table newTables) {
		Table oldTables = tables;
		tables = newTables;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MAIN_BASE__TABLES, oldTables, tables));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Assembly() {
		return row[table.getColNum(sheet, "Assembly")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Description() {
		return row[table.getColNum(sheet, "Description")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DescriptionAsString() {
		return util.descriptionAsString(Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DeviceName() {
		return row[table.getColNum(sheet, "Device Name")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Extends() {
		return row[table.getColNum(sheet, "Extends")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String ICD() {
		return row[table.getColNum(sheet, "ICD")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String ICDDate() {
		return row[table.getColNum(sheet, "ICD Date")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String ICDDateAsDatabaseDate() {
		return util.toDatabaseDate(ICDDate());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String ICDDateAsArrayTime() {
		return util.toArrayTime(ICDDate());
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
			case BasePackage.MAIN_BASE__TABLE:
				return getTable();
			case BasePackage.MAIN_BASE__UTIL:
				return getUtil();
			case BasePackage.MAIN_BASE__UTILSS:
				if (resolve) return getUtilss();
				return basicGetUtilss();
			case BasePackage.MAIN_BASE__TABLES:
				if (resolve) return getTables();
				return basicGetTables();
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
			case BasePackage.MAIN_BASE__TABLE:
				setTable((Table)newValue);
				return;
			case BasePackage.MAIN_BASE__UTIL:
				setUtil((Util)newValue);
				return;
			case BasePackage.MAIN_BASE__UTILSS:
				setUtilss((Util)newValue);
				return;
			case BasePackage.MAIN_BASE__TABLES:
				setTables((Table)newValue);
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
			case BasePackage.MAIN_BASE__TABLE:
				setTable(TABLE_EDEFAULT);
				return;
			case BasePackage.MAIN_BASE__UTIL:
				setUtil(UTIL_EDEFAULT);
				return;
			case BasePackage.MAIN_BASE__UTILSS:
				setUtilss((Util)null);
				return;
			case BasePackage.MAIN_BASE__TABLES:
				setTables((Table)null);
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
			case BasePackage.MAIN_BASE__TABLE:
				return TABLE_EDEFAULT == null ? table != null : !TABLE_EDEFAULT.equals(table);
			case BasePackage.MAIN_BASE__UTIL:
				return UTIL_EDEFAULT == null ? util != null : !UTIL_EDEFAULT.equals(util);
			case BasePackage.MAIN_BASE__UTILSS:
				return utilss != null;
			case BasePackage.MAIN_BASE__TABLES:
				return tables != null;
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
		result.append(", table: ");
		result.append(table);
		result.append(", util: ");
		result.append(util);
		result.append(')');
		return result.toString();
	}

} //MainBaseImpl
