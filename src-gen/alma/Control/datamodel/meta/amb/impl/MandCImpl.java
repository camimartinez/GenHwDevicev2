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
package alma.Control.datamodel.meta.amb.impl;

import alma.Control.datamodel.meta.amb.AmbPackage;
import alma.Control.datamodel.meta.amb.Control;
import alma.Control.datamodel.meta.amb.MandC;
import alma.Control.datamodel.meta.amb.Monitor;

import alma.Control.datamodel.meta.base.BaseFactory;
import alma.Control.datamodel.meta.base.MandCBase;
import alma.Control.datamodel.meta.base.Table;
import alma.Control.datamodel.meta.base.Util;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mand C</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alma.Control.datamodel.meta.amb.impl.MandCImpl#getRow <em>Row</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.amb.impl.MandCImpl#getSheet <em>Sheet</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.amb.impl.MandCImpl#getMcp <em>Mcp</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.amb.impl.MandCImpl#getAmask <em>Amask</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.amb.impl.MandCImpl#getAux <em>Aux</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.amb.impl.MandCImpl#getToInfoSheet <em>To Info Sheet</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.amb.impl.MandCImpl#getToDataFromMain <em>To Data From Main</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.amb.impl.MandCImpl#getToMPDataType <em>To MP Data Type</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.amb.impl.MandCImpl#getToCPDataType <em>To CP Data Type</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.amb.impl.MandCImpl#getToUtilsToData <em>To Utils To Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MandCImpl extends EObjectImpl implements MandC {
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	public MandCImpl(String[] row, int sheet, MandCBase mcp) {
		this.row = row;
		this.sheet = sheet;
		this.mcp = mcp;
	}
	
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
	 * The default value of the '{@link #getMcp() <em>Mcp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMcp()
	 * @generated
	 * @ordered
	 */
	protected static final MandCBase MCP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMcp() <em>Mcp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMcp()
	 * @generated
	 * @ordered
	 */
	protected MandCBase mcp = MCP_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmask() <em>Amask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmask()
	 * @generated
	 * @ordered
	 */
	protected static final String[] AMASK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAmask() <em>Amask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmask()
	 * @generated
	 * @ordered
	 */
	protected String[] amask = AMASK_EDEFAULT;

	/**
	 * The default value of the '{@link #getAux() <em>Aux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAux()
	 * @generated
	 * @ordered
	 */
	protected static final BaseFactory AUX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAux() <em>Aux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAux()
	 * @generated
	 * @ordered
	 */
	protected BaseFactory aux = AUX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getToInfoSheet() <em>To Info Sheet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToInfoSheet()
	 * @generated
	 * @ordered
	 */
	protected MandCBase toInfoSheet;

	/**
	 * The cached value of the '{@link #getToDataFromMain() <em>To Data From Main</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToDataFromMain()
	 * @generated
	 * @ordered
	 */
	protected Table toDataFromMain;

	/**
	 * The cached value of the '{@link #getToMPDataType() <em>To MP Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToMPDataType()
	 * @generated
	 * @ordered
	 */
	protected Monitor toMPDataType;

	/**
	 * The cached value of the '{@link #getToCPDataType() <em>To CP Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToCPDataType()
	 * @generated
	 * @ordered
	 */
	protected Control toCPDataType;

	/**
	 * The cached value of the '{@link #getToUtilsToData() <em>To Utils To Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToUtilsToData()
	 * @generated
	 * @ordered
	 */
	protected Util toUtilsToData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmbPackage.Literals.MAND_C;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.MAND_C__ROW, oldRow, row));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.MAND_C__SHEET, oldSheet, sheet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandCBase getMcp() {
		return mcp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMcp(MandCBase newMcp) {
		MandCBase oldMcp = mcp;
		mcp = newMcp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.MAND_C__MCP, oldMcp, mcp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String[] getAmask() {
		return amask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmask(String[] newAmask) {
		String[] oldAmask = amask;
		amask = newAmask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.MAND_C__AMASK, oldAmask, amask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseFactory getAux() {
		return aux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAux(BaseFactory newAux) {
		BaseFactory oldAux = aux;
		aux = newAux;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.MAND_C__AUX, oldAux, aux));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandCBase getToInfoSheet() {
		if (toInfoSheet != null && toInfoSheet.eIsProxy()) {
			InternalEObject oldToInfoSheet = (InternalEObject)toInfoSheet;
			toInfoSheet = (MandCBase)eResolveProxy(oldToInfoSheet);
			if (toInfoSheet != oldToInfoSheet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.MAND_C__TO_INFO_SHEET, oldToInfoSheet, toInfoSheet));
			}
		}
		return toInfoSheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandCBase basicGetToInfoSheet() {
		return toInfoSheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToInfoSheet(MandCBase newToInfoSheet) {
		MandCBase oldToInfoSheet = toInfoSheet;
		toInfoSheet = newToInfoSheet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.MAND_C__TO_INFO_SHEET, oldToInfoSheet, toInfoSheet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getToDataFromMain() {
		if (toDataFromMain != null && toDataFromMain.eIsProxy()) {
			InternalEObject oldToDataFromMain = (InternalEObject)toDataFromMain;
			toDataFromMain = (Table)eResolveProxy(oldToDataFromMain);
			if (toDataFromMain != oldToDataFromMain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.MAND_C__TO_DATA_FROM_MAIN, oldToDataFromMain, toDataFromMain));
			}
		}
		return toDataFromMain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetToDataFromMain() {
		return toDataFromMain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToDataFromMain(Table newToDataFromMain) {
		Table oldToDataFromMain = toDataFromMain;
		toDataFromMain = newToDataFromMain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.MAND_C__TO_DATA_FROM_MAIN, oldToDataFromMain, toDataFromMain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Monitor getToMPDataType() {
		if (toMPDataType != null && toMPDataType.eIsProxy()) {
			InternalEObject oldToMPDataType = (InternalEObject)toMPDataType;
			toMPDataType = (Monitor)eResolveProxy(oldToMPDataType);
			if (toMPDataType != oldToMPDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.MAND_C__TO_MP_DATA_TYPE, oldToMPDataType, toMPDataType));
			}
		}
		return toMPDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Monitor basicGetToMPDataType() {
		return toMPDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToMPDataType(Monitor newToMPDataType) {
		Monitor oldToMPDataType = toMPDataType;
		toMPDataType = newToMPDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.MAND_C__TO_MP_DATA_TYPE, oldToMPDataType, toMPDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Control getToCPDataType() {
		if (toCPDataType != null && toCPDataType.eIsProxy()) {
			InternalEObject oldToCPDataType = (InternalEObject)toCPDataType;
			toCPDataType = (Control)eResolveProxy(oldToCPDataType);
			if (toCPDataType != oldToCPDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.MAND_C__TO_CP_DATA_TYPE, oldToCPDataType, toCPDataType));
			}
		}
		return toCPDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Control basicGetToCPDataType() {
		return toCPDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToCPDataType(Control newToCPDataType) {
		Control oldToCPDataType = toCPDataType;
		toCPDataType = newToCPDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.MAND_C__TO_CP_DATA_TYPE, oldToCPDataType, toCPDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Util getToUtilsToData() {
		if (toUtilsToData != null && toUtilsToData.eIsProxy()) {
			InternalEObject oldToUtilsToData = (InternalEObject)toUtilsToData;
			toUtilsToData = (Util)eResolveProxy(oldToUtilsToData);
			if (toUtilsToData != oldToUtilsToData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.MAND_C__TO_UTILS_TO_DATA, oldToUtilsToData, toUtilsToData));
			}
		}
		return toUtilsToData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Util basicGetToUtilsToData() {
		return toUtilsToData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToUtilsToData(Util newToUtilsToData) {
		Util oldToUtilsToData = toUtilsToData;
		toUtilsToData = newToUtilsToData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.MAND_C__TO_UTILS_TO_DATA, oldToUtilsToData, toUtilsToData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Assembly() {
		return row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, "Assembly")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String RCA() {
		return row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, "RCA")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String RCACell() {
		return row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, "RCA")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String RawDataType() {
				String s = row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, "Raw Data Type")];
				if(!mcp.isDependent())
					return isRawDataArray() ? s.substring(0, s.indexOf("[")) : s;
					if(mcp instanceof MonitorImpl)
						return ((MonitorImpl) mcp.getParent()).RawDataType();
					if(mcp instanceof ControlImpl)
						return ((ControlImpl) mcp.getParent()).RawDataType();
					return "ERROR";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String RawDataTypeCell() {
		return row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, "Raw Data Type")];
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean TeRelated() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String TeRelatedCell() {
		return row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, "TE Related")];
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataType() {
		String s = row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, "World Data Type")];
		return isWorldDataArray() ? s.substring(0, s.indexOf("[")) : s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataTypeCell() {
		return row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, "World Data Type")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Scale() {
				String s = ScaleCell();
				if((s.equals("none") == true) || (s.equals("extended") == true)
						|| (s.equals(BaseFactory.eINSTANCE.createTable().getCelsiusToKelvin()) == true))
					s = "1.0";
				return s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String ScaleCell() {
		return BaseFactory.eINSTANCE.createUtil().normalizeNumber(WorldDataType(), row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, "Scale")]);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Offset() {
				String s = ScaleCell();
				if(s.equals(BaseFactory.eINSTANCE.createTable().getCelsiusToKelvin()))
					return "273.15";
				String o = OffsetCell();
				if((o.equals("0") == true) || (o.equals("none") == true)
						|| (o.equals("extended") == true))
					o = "0.0";
				return o;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String OffsetCell() {
		return BaseFactory.eINSTANCE.createUtil().normalizeNumber(WorldDataType(), row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, "Offset")]);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String RawDataToCPPType() {
		return (String)BaseFactory.eINSTANCE.createTable().getRawToCPP().get(RawDataType());
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToCPPType() {
		return (String)BaseFactory.eINSTANCE.createTable().getWorldToCPP().get(WorldDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToCORBAType() {
		return (String)BaseFactory.eINSTANCE.createTable().getWorldToCORBA().get(WorldDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToIDLSeqType() {
		return (String)BaseFactory.eINSTANCE.createTable().getWorldToIDLSeq().get(WorldDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToIDLType() {
		return (String)BaseFactory.eINSTANCE.createTable().getWorldToIDL().get(WorldDataType());
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToCORBASeqType() {
		return (String)BaseFactory.eINSTANCE.createTable().getWorldToCORBASeq().get(WorldDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToCORBADevIOType() {
		return (String)BaseFactory.eINSTANCE.createTable().getWorldToCORBADevIO().get(WorldDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToJavaType() {
		return (String)BaseFactory.eINSTANCE.createTable().getWorldToJava().get(WorldDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToDatabaseType() {
		return (String)BaseFactory.eINSTANCE.createTable().getWorldToDatabase().get(WorldDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToBACIType() {
		return (String)BaseFactory.eINSTANCE.createTable().getWorldToBACI().get(WorldDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConversion() {
				if(ScaleCell().equals("none") && OffsetCell().equals("none")) {
					return false;
				}
				else if(ScaleCell().equals("1.0") && OffsetCell().equals("0.0")) {
					return false;
				}
				else if(ScaleCell().equals("1.0") && OffsetCell().equals("none")) {
					return false;
				}
				else if(ScaleCell().equals("none") && OffsetCell().equals("0.0")) {
					return false;
				}
		
				return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSpecialConversion() {
		return ScaleCell().equals("extended");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWorldDataArray() {
		String s = 	row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, "World Data Type")];
		return s.endsWith("]") ? true : false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRawDataArray() {
				String s = row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, "Raw Data Type")];
				if(!mcp.isDependent())
					return s.endsWith("]") ? true : false;
				if(s.startsWith("&lt;") && s.substring(1).indexOf("&lt;") != -1)
					return true;
				return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String NumberItemsRawData() {
		String s = row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, "Raw Data Type")];
		return BaseFactory.eINSTANCE.createUtil().NumberOfItems(s);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String TotalBytesRawData() {
		String s = row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, "Raw Data Type")];
		return BaseFactory.eINSTANCE.createUtil().RawDataTypeTotalBytes(s);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String NumberRawDataTypeBytes() {
		return BaseFactory.eINSTANCE.createUtil().NumberRawDataTypeBytes(RawDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String NumberItemsWorldData() {
		String s = row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, "World Data Type")];
		return BaseFactory.eINSTANCE.createUtil().NumberOfItems(s);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDependentGroupBit() {
				if(!mcp.isDependent())
					return false;
				if(isDependentBit() && RawDataTypeCell().indexOf("-") != -1)
					return true;
				return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDependentBit() {
				if(!mcp.isDependent())
					return false;
				if(RawDataTypeCell().startsWith("&lt;"))
					return true;
				return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDependentElement() {
				if(!mcp.isDependent())
					return false;
				if(RawDataTypeCell().startsWith("["))
					return true;
				return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isByteSwapped() {
		return ((String)BaseFactory.eINSTANCE.createTable().getRawToByteSwapped().get(RawDataType())).equals(true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDependentBitElement() {
				if(!mcp.isDependent())
					return false;
				if(RawDataTypeCell().startsWith("&lt;"))
					return true;
				return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDependentArrayElement() {
				if(!mcp.isDependent())
					return false;
				if(RawDataTypeCell().startsWith("["))
					return true;
				return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String GetDimension() {
				String s = RawDataTypeCell();
				if(isDependentArrayElement()) {
					int n = s.indexOf("]");
					return s.substring(1, n);
				}
				if(!isRawDataArray())
					return "0";
				if(isDependentBitElement()) {
					int n = s.indexOf("&gt;");
					return s.substring(4, n);
				}
				return "0";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSingleBit() {
				String s = RawDataTypeCell();
				if(!s.startsWith("&lt;"))// &lt;0&gt;
					return false;
				if(!s.endsWith("&gt;"))
					return false;
				if(s.indexOf("-") == -1)
					return true;
				return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBit() {
				String s = RawDataTypeCell();
				int n = s.indexOf("&gt;");
				return s.substring(4, n);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstBit() {
				String s = RawDataTypeCell();
				if(!s.startsWith("&lt;") || !s.endsWith("&gt;"))
					return "";
				if(isSingleBit())
					return getBit();
				int n = s.indexOf("-");
				if(n == -1)
					return "";
				return s.substring(4, n);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastBit() {
				String s = RawDataTypeCell();
				if(!s.startsWith("&lt;") || !s.endsWith("&gt;"))
					return "";
				if(isSingleBit())
					return getBit();
				int n = s.indexOf("-");
				if(n == -1)
					return "";
				return s.substring(n + 1, s.length() - 4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupStart() {
				String s = RawDataTypeCell();
				if(isRawDataArray()) {
					s = s.substring(4);
					int n = s.indexOf("&lt;");
					int m = s.substring(n + 4).indexOf("&gt;");
					if(n == -1 || m == -1)
						return "";
					s = s.substring(n + 4, m + n + 4);
				}
				else {
					s = s.substring(4, s.length() - 4);
				}
				// "s" is of type "i-j"
				int n = s.indexOf("-");
				if(n == -1)
					return "";
				return s.substring(0, n);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupEnd() {
				String s = RawDataTypeCell();
				int n = s.indexOf("-");
				if(n == -1)
					return "";
				return s.substring(n + 1, s.length() - 4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupMask() {
				String firstBit = getGroupStart();
				String lastBit = getGroupEnd();
				int n = Integer.parseInt(firstBit);
				int m = Integer.parseInt(lastBit);
				int intMaskSize = m - n;
				int intMask = 0;
				for(int i = 0; i <= intMaskSize; i++) {
					intMask += Math.pow(2, i);
				}
				String mask = "0x".concat(Integer.toHexString(intMask).toUpperCase());
				return mask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRawSubArray() {
				String s = RawDataTypeCell();
				if((s.indexOf("[") != -1) && (s.indexOf("-") != -1)
						&& (s.indexOf("]") != -1))
					return true;
				return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String RawSubArrayStartIndex() {
				String s = RawDataTypeCell();
				return String.valueOf(findRawSubArrayIndex(s, true));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String RawSubArrayEndIndex() {
				String s = RawDataTypeCell();
				return String.valueOf(findRawSubArrayIndex(s, false));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int findRawSubArrayIndex(final String s, final boolean startOrEnd) {
				int end = s.indexOf("]");
				if(end == -1)
					throw new RuntimeException(
							"In Raw Datatype column of monitor spreadsheet, subarray notation does not contain \"]\" ("
							+ s + ")");
				int start = s.indexOf("[") + 1;
				if(start < 1)
					throw new RuntimeException(
							"In Raw Datatype column of monitor spreadsheet, subarray notation does not start with \"[\" ("
							+ s + ")");
		
				String subString = s.substring(start, end);
				String interpretStrings[] = subString.split("-");
				if(interpretStrings.length != 2)
					throw new RuntimeException(
							"In Raw Datatype column of monitor spreadsheet, subarray notation does contain a range ("
							+ s + ")");
				int index = -1;
				try {
					if(startOrEnd == true)
						index = Integer.parseInt(interpretStrings[0]);
					else
						index = Integer.parseInt(interpretStrings[1]);
				}
				catch(NumberFormatException err) {
					throw new RuntimeException(
							"In Raw Datatype column of monitor spreadsheet, subarray notation does not contain an integer as index ("
							+ s
							+ ", "
							+ interpretStrings[0]
							                   + interpretStrings[1] + ")");
				}
				return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToDatabaseTypeUpper1() {
				String s = WorldDataToDatabaseType();
				return Character.toUpperCase(s.charAt(0)) + s.substring(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataTypeUpper1() {
				String s = WorldDataType();
				return Character.toUpperCase(s.charAt(0)) + s.substring(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMask() {
		if(!isSingleBit())
					return "";
				String s = null;
				if(isRawDataArray()) {
					s = RawDataTypeCell().substring(4);
					int n = s.indexOf("&lt;");
					int m = s.substring(n + 4).indexOf("&gt;");
					s = s.substring(n + 4, m + n + 4);
				}
				else {
					s = RawDataTypeCell().substring(4, RawDataTypeCell().length() - 4);
				}
				int n = Integer.parseInt(s);
				return amask[n];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmbPackage.MAND_C__ROW:
				return getRow();
			case AmbPackage.MAND_C__SHEET:
				return getSheet();
			case AmbPackage.MAND_C__MCP:
				return getMcp();
			case AmbPackage.MAND_C__AMASK:
				return getAmask();
			case AmbPackage.MAND_C__AUX:
				return getAux();
			case AmbPackage.MAND_C__TO_INFO_SHEET:
				if (resolve) return getToInfoSheet();
				return basicGetToInfoSheet();
			case AmbPackage.MAND_C__TO_DATA_FROM_MAIN:
				if (resolve) return getToDataFromMain();
				return basicGetToDataFromMain();
			case AmbPackage.MAND_C__TO_MP_DATA_TYPE:
				if (resolve) return getToMPDataType();
				return basicGetToMPDataType();
			case AmbPackage.MAND_C__TO_CP_DATA_TYPE:
				if (resolve) return getToCPDataType();
				return basicGetToCPDataType();
			case AmbPackage.MAND_C__TO_UTILS_TO_DATA:
				if (resolve) return getToUtilsToData();
				return basicGetToUtilsToData();
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
			case AmbPackage.MAND_C__ROW:
				setRow((String[])newValue);
				return;
			case AmbPackage.MAND_C__SHEET:
				setSheet((Integer)newValue);
				return;
			case AmbPackage.MAND_C__MCP:
				setMcp((MandCBase)newValue);
				return;
			case AmbPackage.MAND_C__AMASK:
				setAmask((String[])newValue);
				return;
			case AmbPackage.MAND_C__AUX:
				setAux((BaseFactory)newValue);
				return;
			case AmbPackage.MAND_C__TO_INFO_SHEET:
				setToInfoSheet((MandCBase)newValue);
				return;
			case AmbPackage.MAND_C__TO_DATA_FROM_MAIN:
				setToDataFromMain((Table)newValue);
				return;
			case AmbPackage.MAND_C__TO_MP_DATA_TYPE:
				setToMPDataType((Monitor)newValue);
				return;
			case AmbPackage.MAND_C__TO_CP_DATA_TYPE:
				setToCPDataType((Control)newValue);
				return;
			case AmbPackage.MAND_C__TO_UTILS_TO_DATA:
				setToUtilsToData((Util)newValue);
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
			case AmbPackage.MAND_C__ROW:
				setRow(ROW_EDEFAULT);
				return;
			case AmbPackage.MAND_C__SHEET:
				setSheet(SHEET_EDEFAULT);
				return;
			case AmbPackage.MAND_C__MCP:
				setMcp(MCP_EDEFAULT);
				return;
			case AmbPackage.MAND_C__AMASK:
				setAmask(AMASK_EDEFAULT);
				return;
			case AmbPackage.MAND_C__AUX:
				setAux(AUX_EDEFAULT);
				return;
			case AmbPackage.MAND_C__TO_INFO_SHEET:
				setToInfoSheet((MandCBase)null);
				return;
			case AmbPackage.MAND_C__TO_DATA_FROM_MAIN:
				setToDataFromMain((Table)null);
				return;
			case AmbPackage.MAND_C__TO_MP_DATA_TYPE:
				setToMPDataType((Monitor)null);
				return;
			case AmbPackage.MAND_C__TO_CP_DATA_TYPE:
				setToCPDataType((Control)null);
				return;
			case AmbPackage.MAND_C__TO_UTILS_TO_DATA:
				setToUtilsToData((Util)null);
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
			case AmbPackage.MAND_C__ROW:
				return ROW_EDEFAULT == null ? row != null : !ROW_EDEFAULT.equals(row);
			case AmbPackage.MAND_C__SHEET:
				return sheet != SHEET_EDEFAULT;
			case AmbPackage.MAND_C__MCP:
				return MCP_EDEFAULT == null ? mcp != null : !MCP_EDEFAULT.equals(mcp);
			case AmbPackage.MAND_C__AMASK:
				return AMASK_EDEFAULT == null ? amask != null : !AMASK_EDEFAULT.equals(amask);
			case AmbPackage.MAND_C__AUX:
				return AUX_EDEFAULT == null ? aux != null : !AUX_EDEFAULT.equals(aux);
			case AmbPackage.MAND_C__TO_INFO_SHEET:
				return toInfoSheet != null;
			case AmbPackage.MAND_C__TO_DATA_FROM_MAIN:
				return toDataFromMain != null;
			case AmbPackage.MAND_C__TO_MP_DATA_TYPE:
				return toMPDataType != null;
			case AmbPackage.MAND_C__TO_CP_DATA_TYPE:
				return toCPDataType != null;
			case AmbPackage.MAND_C__TO_UTILS_TO_DATA:
				return toUtilsToData != null;
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
		result.append(", mcp: ");
		result.append(mcp);
		result.append(", Amask: ");
		result.append(amask);
		result.append(", aux: ");
		result.append(aux);
		result.append(')');
		return result.toString();
	}

} //MandCImpl
