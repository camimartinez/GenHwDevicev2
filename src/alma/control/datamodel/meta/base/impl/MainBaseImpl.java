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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import alma.control.datamodel.meta.amb.impl.DeviceModelImpl;
import alma.control.datamodel.meta.base.BaseFactory;
import alma.control.datamodel.meta.base.BasePackage;
import alma.control.datamodel.meta.base.MainBase;
import alma.control.datamodel.meta.base.Table;
import alma.control.datamodel.meta.base.Util;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

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
	 * The cached value of the '{@link #getTable() <em>Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected Table table;

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
	public Table getTable() {
		if (table != null && table.eIsProxy()) {
			InternalEObject oldTable = (InternalEObject)table;
			table = (Table)eResolveProxy(oldTable);
			if (table != oldTable) {
				InternalEObject newTable = (InternalEObject)table;
				NotificationChain msgs =  oldTable.eInverseRemove(this, BasePackage.TABLE__MAIN, Table.class, null);
				if (newTable.eInternalContainer() == null) {
					msgs =  newTable.eInverseAdd(this, BasePackage.TABLE__MAIN, Table.class, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.MAIN_BASE__TABLE, oldTable, table));
			}
		}
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetTable() {
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTable(Table newTable, NotificationChain msgs) {
		Table oldTable = table;
		table = newTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasePackage.MAIN_BASE__TABLE, oldTable, newTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(Table newTable) {
		if (newTable != table) {
			NotificationChain msgs = null;
			if (table != null)
				msgs = ((InternalEObject)table).eInverseRemove(this, BasePackage.TABLE__MAIN, Table.class, msgs);
			if (newTable != null)
				msgs = ((InternalEObject)newTable).eInverseAdd(this, BasePackage.TABLE__MAIN, Table.class, msgs);
			msgs = basicSetTable(newTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MAIN_BASE__TABLE, newTable, newTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Util getUtil() {
		if (util != null && util.eIsProxy()) {
			InternalEObject oldUtil = (InternalEObject)util;
			util = (Util)eResolveProxy(oldUtil);
			if (util != oldUtil) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.MAIN_BASE__UTIL, oldUtil, util));
			}
		}
		return util;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Util basicGetUtil() {
		return util;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUtil(Util newUtil, NotificationChain msgs) {
		Util oldUtil = util;
		util = newUtil;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasePackage.MAIN_BASE__UTIL, oldUtil, newUtil);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtil(Util newUtil) {
		if (newUtil != util) {
			NotificationChain msgs = null;
			if (util != null)
				msgs = ((InternalEObject)util).eInverseRemove(this, BasePackage.UTIL__MANDC, Util.class, msgs);
			if (newUtil != null)
				msgs = ((InternalEObject)newUtil).eInverseAdd(this, BasePackage.UTIL__MANDC, Util.class, msgs);
			msgs = basicSetUtil(newUtil, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MAIN_BASE__UTIL, newUtil, newUtil));
	}

	/*
	private Object getObjectByInstanceClass(){
		System.out.println("entra a getObjectBYInstanceClass");
		Collection<Table> allObjects = EcoreUtil.getObjectsByType(BaseFactory.eINSTANCE.getClass()., BasePackage.Literals.TABLE);
		int size = allObjects.size();
		System.out.println("Tamaño es: "+size+"");
		Object object = EcoreUtil.getObjectsByType(eAdapters(), BasePackage.Literals.TABLE);
		if(object instanceof Table){
			return object;
		}else{
			System.out.println("The is no Object in instance Table in: base/MainBaseImpl");
			System.out.println("Creating ...");
			return "The is no Object for instance Table in: base/MainBaseImpl";
		}
	}

	Table table = (Table)getObjectByInstanceClass();

	 */
	//Table table = BaseFactory.eINSTANCE.createTable();

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

	/*
	private Object getObjectByInstanceClassUtil(){
		Object object = EcoreUtil.getObjectByType(eAdapters(), BasePackage.Literals.UTIL);
		if(object instanceof Util){
			return object;
		}else{
			System.out.println("The is no Object for instance Util in: base/MainBaseImpl");
			return "The is no Object for instance Util in: base/MainBaseImpl";
		}
	}

	Util util = (Util)getObjectByInstanceClassUtil();
	 */

	Util util = BaseFactory.eINSTANCE.createUtil();

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
	 * @!generated
	 */
	public static void printAttributeValues(EObject object) {
		EClass eClass = object.eClass();
		System.out.println(eClass.getName());
		for (Iterator iter =
				eClass.getEAllAttributes().iterator(); iter.hasNext(); ) {
			EAttribute attribute = (EAttribute)iter.next();
			Object value = object.eGet(attribute);

			System.out.print("  " + attribute.getName() + " : ");
			if (object.eIsSet(attribute))
				System.out.println(value);
			else
				System.out.println(value + " (default)");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitializeMB(final String[] row) {
		this.row = row;
		this.sheet = getTable().getSheetNum("Hardware Device");
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasePackage.MAIN_BASE__TABLE:
				if (table != null)
					msgs = ((InternalEObject)table).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasePackage.MAIN_BASE__TABLE, null, msgs);
				return basicSetTable((Table)otherEnd, msgs);
			case BasePackage.MAIN_BASE__UTIL:
				if (util != null)
					msgs = ((InternalEObject)util).eInverseRemove(this, BasePackage.UTIL__MANDC, Util.class, msgs);
				return basicSetUtil((Util)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasePackage.MAIN_BASE__TABLE:
				return basicSetTable(null, msgs);
			case BasePackage.MAIN_BASE__UTIL:
				return basicSetUtil(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/*
	
	
	EObject cont;
	public void getObjectFrom(EObject name){
		try {
			cont = name.eContainer();
		} catch (Exception e) {
			System.out.println("No container Object of type Class");	
		}	
	}
	
	
	
	public void setInitializeMB(final String[] row) {
		getObjectFrom(table);
		if(cont != null){
			System.out.println("cont != null en table");
				this.row = row;
				printAttributeValues(table);
		}else{
			System.out.println("no puede sacar el container de table");
			this.row = row;
			if(cont instanceof Table){
				table = (Table)cont;
			}else{
				System.out.println("eroor en initializeMB not container table");
			}

			this.sheet = table.getSheetNum("Hardware Device");
		}
	}
	*/
	
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
				if (resolve) return getTable();
				return basicGetTable();
			case BasePackage.MAIN_BASE__UTIL:
				if (resolve) return getUtil();
				return basicGetUtil();
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
				setTable((Table)null);
				return;
			case BasePackage.MAIN_BASE__UTIL:
				setUtil((Util)null);
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
				return table != null;
			case BasePackage.MAIN_BASE__UTIL:
				return util != null;
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
