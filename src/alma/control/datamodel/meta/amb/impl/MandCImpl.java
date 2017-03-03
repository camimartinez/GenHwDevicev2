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
package alma.control.datamodel.meta.amb.impl;

import alma.control.datamodel.meta.amb.AmbFactory;
import alma.control.datamodel.meta.amb.AmbPackage;
import alma.control.datamodel.meta.amb.Control;
import alma.control.datamodel.meta.amb.MandC;
import alma.control.datamodel.meta.amb.Monitor;

import alma.control.datamodel.meta.base.MandCBase;
import alma.control.datamodel.meta.base.Table;
import alma.control.datamodel.meta.base.Util;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
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
 *   <li>{@link alma.control.datamodel.meta.amb.impl.MandCImpl#getTable <em>Table</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.MandCImpl#getUtil <em>Util</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.MandCImpl#getRow <em>Row</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.MandCImpl#getSheet <em>Sheet</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.MandCImpl#getMcp <em>Mcp</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.MandCImpl#getAmask <em>Amask</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.MandCImpl#getMandCb <em>Mand Cb</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.MandCImpl#getTables <em>Tables</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.MandCImpl#getMonitorPoints <em>Monitor Points</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.MandCImpl#getControlPoints <em>Control Points</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.MandCImpl#getUtilss <em>Utilss</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MandCImpl extends EObjectImpl implements MandC {
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
	 * The cached value of the '{@link #getMandCb() <em>Mand Cb</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandCb()
	 * @generated
	 * @ordered
	 */
	protected MandCBase mandCb;

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
	 * The cached value of the '{@link #getMonitorPoints() <em>Monitor Points</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitorPoints()
	 * @generated
	 * @ordered
	 */
	protected Monitor monitorPoints;

	/**
	 * The cached value of the '{@link #getControlPoints() <em>Control Points</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlPoints()
	 * @generated
	 * @ordered
	 */
	protected Control controlPoints;

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
	 * @!generated
	 */
	public MandCImpl(String[] row, int sheet, MandCBase mcp) {
		this.row = row;
		this.sheet = sheet;
		this.mcp = mcp;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.MAND_C__TABLE, oldTable, table));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.MAND_C__UTIL, oldUtil, util));
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
	public MandCBase getMandCb() {
		return mandCb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMandCb(MandCBase newMandCb, NotificationChain msgs) {
		MandCBase oldMandCb = mandCb;
		mandCb = newMandCb;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmbPackage.MAND_C__MAND_CB, oldMandCb, newMandCb);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMandCb(MandCBase newMandCb) {
		if (newMandCb != mandCb) {
			NotificationChain msgs = null;
			if (mandCb != null)
				msgs = ((InternalEObject)mandCb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmbPackage.MAND_C__MAND_CB, null, msgs);
			if (newMandCb != null)
				msgs = ((InternalEObject)newMandCb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmbPackage.MAND_C__MAND_CB, null, msgs);
			msgs = basicSetMandCb(newMandCb, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.MAND_C__MAND_CB, newMandCb, newMandCb));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.MAND_C__TABLES, oldTables, tables));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.MAND_C__TABLES, oldTables, tables));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Monitor getMonitorPoints() {
		if (monitorPoints != null && monitorPoints.eIsProxy()) {
			InternalEObject oldMonitorPoints = (InternalEObject)monitorPoints;
			monitorPoints = (Monitor)eResolveProxy(oldMonitorPoints);
			if (monitorPoints != oldMonitorPoints) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.MAND_C__MONITOR_POINTS, oldMonitorPoints, monitorPoints));
			}
		}
		return monitorPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Monitor basicGetMonitorPoints() {
		return monitorPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitorPoints(Monitor newMonitorPoints) {
		Monitor oldMonitorPoints = monitorPoints;
		monitorPoints = newMonitorPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.MAND_C__MONITOR_POINTS, oldMonitorPoints, monitorPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Control getControlPoints() {
		if (controlPoints != null && controlPoints.eIsProxy()) {
			InternalEObject oldControlPoints = (InternalEObject)controlPoints;
			controlPoints = (Control)eResolveProxy(oldControlPoints);
			if (controlPoints != oldControlPoints) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.MAND_C__CONTROL_POINTS, oldControlPoints, controlPoints));
			}
		}
		return controlPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Control basicGetControlPoints() {
		return controlPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlPoints(Control newControlPoints) {
		Control oldControlPoints = controlPoints;
		controlPoints = newControlPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.MAND_C__CONTROL_POINTS, oldControlPoints, controlPoints));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.MAND_C__UTILSS, oldUtilss, utilss));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.MAND_C__UTILSS, oldUtilss, utilss));
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
	public String RCA() {
		return row[table.getColNum(sheet, "RCA")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String RCACell() {
		return row[table.getColNum(sheet, "RCA")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String RawDataType() {
				String s = row[table.getColNum(sheet, "Raw Data Type")];
				if(!mcp.isDependent())
					return isRawDataArray() ? s.substring(0, s.indexOf("[")) : s;
					if(mcp instanceof Monitor)
						return ((Monitor) mcp.getParent()).RawDataType();
					if(mcp instanceof Control)
						return ((Control) mcp.getParent()).RawDataType();
					return "ERROR";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String RawDataTypeCell() {
		return row[table.getColNum(sheet, "Raw Data Type")];
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
		return row[table.getColNum(sheet, "TE Related")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataType() {
		String s = row[table.getColNum(sheet, "World Data Type")];
		return isWorldDataArray() ? s.substring(0, s.indexOf("[")) : s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataTypeCell() {
		return row[table.getColNum(sheet, "World Data Type")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Scale() {
				String s = ScaleCell();
				if((s.equals("none") == true) || (s.equals("extended") == true)
						|| (s.equals(table.getCelsiusToKelvin()) == true))
					s = "1.0";
				return s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String ScaleCell() {
		return util.normalizeNumber(WorldDataType(), row[table.getColNum(sheet, "Scale")]);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Offset() {
				String s = ScaleCell();
				if(s.equals(table.getCelsiusToKelvin()))
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
		return util.normalizeNumber(WorldDataType(), row[table.getColNum(sheet, "Offset")]);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String RawDataToCPPType() {
		return (String)table.getRawToCPP().get(RawDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToCPPType() {
		return (String)table.getWorldToCPP().get(WorldDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToCORBAType() {
		return (String)table.getWorldToCORBA().get(WorldDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToIDLSeqType() {
		return (String)table.getWorldToIDLSeq().get(WorldDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToIDLType() {
		return (String)table.getWorldToIDL().get(WorldDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToCORBASeqType() {
		return (String)table.getWorldToCORBASeq().get(WorldDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToCORBADevIOType() {
		return (String)table.getWorldToCORBADevIO().get(WorldDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToJavaType() {
		return (String)table.getWorldToJava().get(WorldDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToDatabaseType() {
		return (String)table.getWorldToDatabase().get(WorldDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToBACIType() {
		return (String)table.getWorldToBACI().get(WorldDataType());
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
		String s = row[table.getColNum(sheet, "World Data Type")];
		return s.endsWith("]") ? true : false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRawDataArray() {
				String s = row[table.getColNum(sheet, "Raw Data Type")];
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
		String s = row[table.getColNum(sheet, "Raw Data Type")];
		return util.NumberOfItems(s);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String TotalBytesRawData() {
		String s = row[table.getColNum(sheet, "Raw Data Type")];
		return util.RawDataTypeTotalBytes(s);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String NumberRawDataTypeBytes() {
		return util.NumberRawDataTypeBytes(RawDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String NumberItemsWorldData() {
		String s = row[table.getColNum(sheet, "World Data Type")];
		return util.NumberOfItems(s);
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
		return ((String)table.getRawToByteSwapped().get(RawDataType())).equals(true);
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmbPackage.MAND_C__MAND_CB:
				return basicSetMandCb(null, msgs);
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
			case AmbPackage.MAND_C__TABLE:
				return getTable();
			case AmbPackage.MAND_C__UTIL:
				return getUtil();
			case AmbPackage.MAND_C__ROW:
				return getRow();
			case AmbPackage.MAND_C__SHEET:
				return getSheet();
			case AmbPackage.MAND_C__MCP:
				return getMcp();
			case AmbPackage.MAND_C__AMASK:
				return getAmask();
			case AmbPackage.MAND_C__MAND_CB:
				return getMandCb();
			case AmbPackage.MAND_C__TABLES:
				if (resolve) return getTables();
				return basicGetTables();
			case AmbPackage.MAND_C__MONITOR_POINTS:
				if (resolve) return getMonitorPoints();
				return basicGetMonitorPoints();
			case AmbPackage.MAND_C__CONTROL_POINTS:
				if (resolve) return getControlPoints();
				return basicGetControlPoints();
			case AmbPackage.MAND_C__UTILSS:
				if (resolve) return getUtilss();
				return basicGetUtilss();
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
			case AmbPackage.MAND_C__TABLE:
				setTable((Table)newValue);
				return;
			case AmbPackage.MAND_C__UTIL:
				setUtil((Util)newValue);
				return;
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
			case AmbPackage.MAND_C__MAND_CB:
				setMandCb((MandCBase)newValue);
				return;
			case AmbPackage.MAND_C__TABLES:
				setTables((Table)newValue);
				return;
			case AmbPackage.MAND_C__MONITOR_POINTS:
				setMonitorPoints((Monitor)newValue);
				return;
			case AmbPackage.MAND_C__CONTROL_POINTS:
				setControlPoints((Control)newValue);
				return;
			case AmbPackage.MAND_C__UTILSS:
				setUtilss((Util)newValue);
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
			case AmbPackage.MAND_C__TABLE:
				setTable(TABLE_EDEFAULT);
				return;
			case AmbPackage.MAND_C__UTIL:
				setUtil(UTIL_EDEFAULT);
				return;
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
			case AmbPackage.MAND_C__MAND_CB:
				setMandCb((MandCBase)null);
				return;
			case AmbPackage.MAND_C__TABLES:
				setTables((Table)null);
				return;
			case AmbPackage.MAND_C__MONITOR_POINTS:
				setMonitorPoints((Monitor)null);
				return;
			case AmbPackage.MAND_C__CONTROL_POINTS:
				setControlPoints((Control)null);
				return;
			case AmbPackage.MAND_C__UTILSS:
				setUtilss((Util)null);
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
			case AmbPackage.MAND_C__TABLE:
				return TABLE_EDEFAULT == null ? table != null : !TABLE_EDEFAULT.equals(table);
			case AmbPackage.MAND_C__UTIL:
				return UTIL_EDEFAULT == null ? util != null : !UTIL_EDEFAULT.equals(util);
			case AmbPackage.MAND_C__ROW:
				return ROW_EDEFAULT == null ? row != null : !ROW_EDEFAULT.equals(row);
			case AmbPackage.MAND_C__SHEET:
				return sheet != SHEET_EDEFAULT;
			case AmbPackage.MAND_C__MCP:
				return MCP_EDEFAULT == null ? mcp != null : !MCP_EDEFAULT.equals(mcp);
			case AmbPackage.MAND_C__AMASK:
				return AMASK_EDEFAULT == null ? amask != null : !AMASK_EDEFAULT.equals(amask);
			case AmbPackage.MAND_C__MAND_CB:
				return mandCb != null;
			case AmbPackage.MAND_C__TABLES:
				return tables != null;
			case AmbPackage.MAND_C__MONITOR_POINTS:
				return monitorPoints != null;
			case AmbPackage.MAND_C__CONTROL_POINTS:
				return controlPoints != null;
			case AmbPackage.MAND_C__UTILSS:
				return utilss != null;
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
		result.append(" (table: ");
		result.append(table);
		result.append(", util: ");
		result.append(util);
		result.append(", row: ");
		result.append(row);
		result.append(", sheet: ");
		result.append(sheet);
		result.append(", mcp: ");
		result.append(mcp);
		result.append(", Amask: ");
		result.append(amask);
		result.append(')');
		return result.toString();
	}

} //MandCImpl
