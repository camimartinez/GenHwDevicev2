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
package datamodel.amb.impl;

import datamodel.amb.AmbPackage;
import datamodel.amb.ControlAMB;
import datamodel.amb.MandCAMB;
import datamodel.amb.MonitorAMB;

import datamodel.base.BaseFactory;
import datamodel.base.BasePackage;
import datamodel.base.MandCBase;
import datamodel.base.Table;
import datamodel.base.Util;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mand CAMB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datamodel.amb.impl.MandCAMBImpl#getRow <em>Row</em>}</li>
 *   <li>{@link datamodel.amb.impl.MandCAMBImpl#getSheet <em>Sheet</em>}</li>
 *   <li>{@link datamodel.amb.impl.MandCAMBImpl#getMcp <em>Mcp</em>}</li>
 *   <li>{@link datamodel.amb.impl.MandCAMBImpl#getMask <em>Mask</em>}</li>
 *   <li>{@link datamodel.amb.impl.MandCAMBImpl#getGetInfoSheet <em>Get Info Sheet</em>}</li>
 *   <li>{@link datamodel.amb.impl.MandCAMBImpl#getGetDataFromMain <em>Get Data From Main</em>}</li>
 *   <li>{@link datamodel.amb.impl.MandCAMBImpl#getIsMPDataType <em>Is MP Data Type</em>}</li>
 *   <li>{@link datamodel.amb.impl.MandCAMBImpl#getIsCPDataType <em>Is CP Data Type</em>}</li>
 *   <li>{@link datamodel.amb.impl.MandCAMBImpl#getUtilsToData <em>Utils To Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MandCAMBImpl extends EObjectImpl implements MandCAMB {
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
	 * The default value of the '{@link #getMask() <em>Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMask()
	 * @generated
	 * @ordered
	 */
	protected static final String[] MASK_EDEFAULT = (String[])BaseFactory.eINSTANCE.createFromString(BasePackage.eINSTANCE.getString1DT(), "\"0x01\", \"0x02\", \"0x04\", \"0x08\", \"0x10\",\"0x20\", \"0x40\", \"0x80\"");

	/**
	 * The cached value of the '{@link #getMask() <em>Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMask()
	 * @generated
	 * @ordered
	 */
	protected String[] mask = MASK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGetInfoSheet() <em>Get Info Sheet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetInfoSheet()
	 * @generated
	 * @ordered
	 */
	protected MandCBase getInfoSheet;

	/**
	 * The cached value of the '{@link #getGetDataFromMain() <em>Get Data From Main</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetDataFromMain()
	 * @generated
	 * @ordered
	 */
	protected Table getDataFromMain;

	/**
	 * The cached value of the '{@link #getIsMPDataType() <em>Is MP Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMPDataType()
	 * @generated
	 * @ordered
	 */
	protected MonitorAMB isMPDataType;

	/**
	 * The cached value of the '{@link #getIsCPDataType() <em>Is CP Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCPDataType()
	 * @generated
	 * @ordered
	 */
	protected ControlAMB isCPDataType;

	/**
	 * The cached value of the '{@link #getUtilsToData() <em>Utils To Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilsToData()
	 * @generated
	 * @ordered
	 */
	protected Util utilsToData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MandCAMBImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmbPackage.Literals.MAND_CAMB;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.MAND_CAMB__ROW, oldRow, row));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.MAND_CAMB__SHEET, oldSheet, sheet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.MAND_CAMB__MCP, oldMcp, mcp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String[] getMask() {
		return mask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMask(String[] newMask) {
		String[] oldMask = mask;
		mask = newMask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.MAND_CAMB__MASK, oldMask, mask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandCBase getGetInfoSheet() {
		if (getInfoSheet != null && getInfoSheet.eIsProxy()) {
			InternalEObject oldGetInfoSheet = (InternalEObject)getInfoSheet;
			getInfoSheet = (MandCBase)eResolveProxy(oldGetInfoSheet);
			if (getInfoSheet != oldGetInfoSheet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.MAND_CAMB__GET_INFO_SHEET, oldGetInfoSheet, getInfoSheet));
			}
		}
		return getInfoSheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandCBase basicGetGetInfoSheet() {
		return getInfoSheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetInfoSheet(MandCBase newGetInfoSheet) {
		MandCBase oldGetInfoSheet = getInfoSheet;
		getInfoSheet = newGetInfoSheet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.MAND_CAMB__GET_INFO_SHEET, oldGetInfoSheet, getInfoSheet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getGetDataFromMain() {
		if (getDataFromMain != null && getDataFromMain.eIsProxy()) {
			InternalEObject oldGetDataFromMain = (InternalEObject)getDataFromMain;
			getDataFromMain = (Table)eResolveProxy(oldGetDataFromMain);
			if (getDataFromMain != oldGetDataFromMain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.MAND_CAMB__GET_DATA_FROM_MAIN, oldGetDataFromMain, getDataFromMain));
			}
		}
		return getDataFromMain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetGetDataFromMain() {
		return getDataFromMain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetDataFromMain(Table newGetDataFromMain) {
		Table oldGetDataFromMain = getDataFromMain;
		getDataFromMain = newGetDataFromMain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.MAND_CAMB__GET_DATA_FROM_MAIN, oldGetDataFromMain, getDataFromMain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorAMB getIsMPDataType() {
		if (isMPDataType != null && isMPDataType.eIsProxy()) {
			InternalEObject oldIsMPDataType = (InternalEObject)isMPDataType;
			isMPDataType = (MonitorAMB)eResolveProxy(oldIsMPDataType);
			if (isMPDataType != oldIsMPDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.MAND_CAMB__IS_MP_DATA_TYPE, oldIsMPDataType, isMPDataType));
			}
		}
		return isMPDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorAMB basicGetIsMPDataType() {
		return isMPDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMPDataType(MonitorAMB newIsMPDataType) {
		MonitorAMB oldIsMPDataType = isMPDataType;
		isMPDataType = newIsMPDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.MAND_CAMB__IS_MP_DATA_TYPE, oldIsMPDataType, isMPDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlAMB getIsCPDataType() {
		if (isCPDataType != null && isCPDataType.eIsProxy()) {
			InternalEObject oldIsCPDataType = (InternalEObject)isCPDataType;
			isCPDataType = (ControlAMB)eResolveProxy(oldIsCPDataType);
			if (isCPDataType != oldIsCPDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.MAND_CAMB__IS_CP_DATA_TYPE, oldIsCPDataType, isCPDataType));
			}
		}
		return isCPDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlAMB basicGetIsCPDataType() {
		return isCPDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCPDataType(ControlAMB newIsCPDataType) {
		ControlAMB oldIsCPDataType = isCPDataType;
		isCPDataType = newIsCPDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.MAND_CAMB__IS_CP_DATA_TYPE, oldIsCPDataType, isCPDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Util getUtilsToData() {
		if (utilsToData != null && utilsToData.eIsProxy()) {
			InternalEObject oldUtilsToData = (InternalEObject)utilsToData;
			utilsToData = (Util)eResolveProxy(oldUtilsToData);
			if (utilsToData != oldUtilsToData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.MAND_CAMB__UTILS_TO_DATA, oldUtilsToData, utilsToData));
			}
		}
		return utilsToData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Util basicGetUtilsToData() {
		return utilsToData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtilsToData(Util newUtilsToData) {
		Util oldUtilsToData = utilsToData;
		utilsToData = newUtilsToData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.MAND_CAMB__UTILS_TO_DATA, oldUtilsToData, utilsToData));
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
					if(mcp instanceof MonitorAMBImpl)
						return ((MonitorAMBImpl) mcp.getParent()).RawDataType();
					if(mcp instanceof ControlAMBImpl)
						return ((ControlAMBImpl) mcp.getParent()).RawDataType();
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
	public int findRawSubArrayIndex(String s, boolean startOrEnd) {
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmbPackage.MAND_CAMB__ROW:
				return getRow();
			case AmbPackage.MAND_CAMB__SHEET:
				return getSheet();
			case AmbPackage.MAND_CAMB__MCP:
				return getMcp();
			case AmbPackage.MAND_CAMB__MASK:
				return getMask();
			case AmbPackage.MAND_CAMB__GET_INFO_SHEET:
				if (resolve) return getGetInfoSheet();
				return basicGetGetInfoSheet();
			case AmbPackage.MAND_CAMB__GET_DATA_FROM_MAIN:
				if (resolve) return getGetDataFromMain();
				return basicGetGetDataFromMain();
			case AmbPackage.MAND_CAMB__IS_MP_DATA_TYPE:
				if (resolve) return getIsMPDataType();
				return basicGetIsMPDataType();
			case AmbPackage.MAND_CAMB__IS_CP_DATA_TYPE:
				if (resolve) return getIsCPDataType();
				return basicGetIsCPDataType();
			case AmbPackage.MAND_CAMB__UTILS_TO_DATA:
				if (resolve) return getUtilsToData();
				return basicGetUtilsToData();
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
			case AmbPackage.MAND_CAMB__ROW:
				setRow((String[])newValue);
				return;
			case AmbPackage.MAND_CAMB__SHEET:
				setSheet((Integer)newValue);
				return;
			case AmbPackage.MAND_CAMB__MCP:
				setMcp((MandCBase)newValue);
				return;
			case AmbPackage.MAND_CAMB__MASK:
				setMask((String[])newValue);
				return;
			case AmbPackage.MAND_CAMB__GET_INFO_SHEET:
				setGetInfoSheet((MandCBase)newValue);
				return;
			case AmbPackage.MAND_CAMB__GET_DATA_FROM_MAIN:
				setGetDataFromMain((Table)newValue);
				return;
			case AmbPackage.MAND_CAMB__IS_MP_DATA_TYPE:
				setIsMPDataType((MonitorAMB)newValue);
				return;
			case AmbPackage.MAND_CAMB__IS_CP_DATA_TYPE:
				setIsCPDataType((ControlAMB)newValue);
				return;
			case AmbPackage.MAND_CAMB__UTILS_TO_DATA:
				setUtilsToData((Util)newValue);
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
			case AmbPackage.MAND_CAMB__ROW:
				setRow(ROW_EDEFAULT);
				return;
			case AmbPackage.MAND_CAMB__SHEET:
				setSheet(SHEET_EDEFAULT);
				return;
			case AmbPackage.MAND_CAMB__MCP:
				setMcp(MCP_EDEFAULT);
				return;
			case AmbPackage.MAND_CAMB__MASK:
				setMask(MASK_EDEFAULT);
				return;
			case AmbPackage.MAND_CAMB__GET_INFO_SHEET:
				setGetInfoSheet((MandCBase)null);
				return;
			case AmbPackage.MAND_CAMB__GET_DATA_FROM_MAIN:
				setGetDataFromMain((Table)null);
				return;
			case AmbPackage.MAND_CAMB__IS_MP_DATA_TYPE:
				setIsMPDataType((MonitorAMB)null);
				return;
			case AmbPackage.MAND_CAMB__IS_CP_DATA_TYPE:
				setIsCPDataType((ControlAMB)null);
				return;
			case AmbPackage.MAND_CAMB__UTILS_TO_DATA:
				setUtilsToData((Util)null);
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
			case AmbPackage.MAND_CAMB__ROW:
				return ROW_EDEFAULT == null ? row != null : !ROW_EDEFAULT.equals(row);
			case AmbPackage.MAND_CAMB__SHEET:
				return sheet != SHEET_EDEFAULT;
			case AmbPackage.MAND_CAMB__MCP:
				return MCP_EDEFAULT == null ? mcp != null : !MCP_EDEFAULT.equals(mcp);
			case AmbPackage.MAND_CAMB__MASK:
				return MASK_EDEFAULT == null ? mask != null : !MASK_EDEFAULT.equals(mask);
			case AmbPackage.MAND_CAMB__GET_INFO_SHEET:
				return getInfoSheet != null;
			case AmbPackage.MAND_CAMB__GET_DATA_FROM_MAIN:
				return getDataFromMain != null;
			case AmbPackage.MAND_CAMB__IS_MP_DATA_TYPE:
				return isMPDataType != null;
			case AmbPackage.MAND_CAMB__IS_CP_DATA_TYPE:
				return isCPDataType != null;
			case AmbPackage.MAND_CAMB__UTILS_TO_DATA:
				return utilsToData != null;
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
		result.append(", mask: ");
		result.append(mask);
		result.append(')');
		return result.toString();
	}

} //MandCAMBImpl
