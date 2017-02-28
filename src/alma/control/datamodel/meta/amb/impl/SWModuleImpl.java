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
import alma.control.datamodel.meta.amb.Monitor;
import alma.control.datamodel.meta.amb.SWModule;
import alma.control.datamodel.meta.base.Table;
import alma.control.datamodel.meta.base.Util;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SW Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.SWModuleImpl#getAssemblyName <em>Assembly Name</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.SWModuleImpl#getDirPath <em>Dir Path</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.SWModuleImpl#getMainAssembly <em>Main Assembly</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.SWModuleImpl#isOneSwModule <em>One Sw Module</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.SWModuleImpl#getRow <em>Row</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.SWModuleImpl#getParentRow <em>Parent Row</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.SWModuleImpl#getSheet <em>Sheet</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.SWModuleImpl#getMonitorPoints <em>Monitor Points</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.SWModuleImpl#getControlPoints <em>Control Points</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.SWModuleImpl#getArchiveProperties <em>Archive Properties</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.SWModuleImpl#getSimMonitorPoints <em>Sim Monitor Points</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.SWModuleImpl#getSimControlPoints <em>Sim Control Points</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.SWModuleImpl#getTable <em>Table</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.SWModuleImpl#getUtil <em>Util</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.SWModuleImpl#getToAddAllMP <em>To Add All MP</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.SWModuleImpl#getToAddAllCP <em>To Add All CP</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.SWModuleImpl#getToFormatDescriptions <em>To Format Descriptions</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.SWModuleImpl#getToSheetColumns <em>To Sheet Columns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SWModuleImpl extends EObjectImpl implements SWModule {
	/**
	 * The default value of the '{@link #getAssemblyName() <em>Assembly Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyName()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSEMBLY_NAME_EDEFAULT = "null";

	/**
	 * The cached value of the '{@link #getAssemblyName() <em>Assembly Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyName()
	 * @generated
	 * @ordered
	 */
	protected String assemblyName = ASSEMBLY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirPath() <em>Dir Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirPath()
	 * @generated
	 * @ordered
	 */
	protected static final String DIR_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirPath() <em>Dir Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirPath()
	 * @generated
	 * @ordered
	 */
	protected String dirPath = DIR_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMainAssembly() <em>Main Assembly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainAssembly()
	 * @generated
	 * @ordered
	 */
	protected static final String MAIN_ASSEMBLY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMainAssembly() <em>Main Assembly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainAssembly()
	 * @generated
	 * @ordered
	 */
	protected String mainAssembly = MAIN_ASSEMBLY_EDEFAULT;

	/**
	 * The default value of the '{@link #isOneSwModule() <em>One Sw Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOneSwModule()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ONE_SW_MODULE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOneSwModule() <em>One Sw Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOneSwModule()
	 * @generated
	 * @ordered
	 */
	protected boolean oneSwModule = ONE_SW_MODULE_EDEFAULT;

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
	 * The default value of the '{@link #getParentRow() <em>Parent Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentRow()
	 * @generated
	 * @ordered
	 */
	protected static final String[] PARENT_ROW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParentRow() <em>Parent Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentRow()
	 * @generated
	 * @ordered
	 */
	protected String[] parentRow = PARENT_ROW_EDEFAULT;

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
	 * The default value of the '{@link #getMonitorPoints() <em>Monitor Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitorPoints()
	 * @generated
	 * @ordered
	 */
	protected static final ResourceSet MONITOR_POINTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMonitorPoints() <em>Monitor Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitorPoints()
	 * @generated
	 * @ordered
	 */
	protected ResourceSet monitorPoints = MONITOR_POINTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getControlPoints() <em>Control Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlPoints()
	 * @generated
	 * @ordered
	 */
	protected static final ResourceSet CONTROL_POINTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getControlPoints() <em>Control Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlPoints()
	 * @generated
	 * @ordered
	 */
	protected ResourceSet controlPoints = CONTROL_POINTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getArchiveProperties() <em>Archive Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchiveProperties()
	 * @generated
	 * @ordered
	 */
	protected static final ResourceSet ARCHIVE_PROPERTIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArchiveProperties() <em>Archive Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchiveProperties()
	 * @generated
	 * @ordered
	 */
	protected ResourceSet archiveProperties = ARCHIVE_PROPERTIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getSimMonitorPoints() <em>Sim Monitor Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimMonitorPoints()
	 * @generated
	 * @ordered
	 */
	protected static final ResourceSet SIM_MONITOR_POINTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSimMonitorPoints() <em>Sim Monitor Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimMonitorPoints()
	 * @generated
	 * @ordered
	 */
	protected ResourceSet simMonitorPoints = SIM_MONITOR_POINTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSimControlPoints() <em>Sim Control Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimControlPoints()
	 * @generated
	 * @ordered
	 */
	protected static final ResourceSet SIM_CONTROL_POINTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSimControlPoints() <em>Sim Control Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimControlPoints()
	 * @generated
	 * @ordered
	 */
	protected ResourceSet simControlPoints = SIM_CONTROL_POINTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTable() <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected static final Table TABLE_EDEFAULT = (Table)AmbFactory.eINSTANCE.createFromString(AmbPackage.eINSTANCE.getTableDT(), "BaseFactory.eINSTANCE;");

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SWModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmbPackage.Literals.SW_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssemblyName() {
		return assemblyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssemblyName(String newAssemblyName) {
		String oldAssemblyName = assemblyName;
		assemblyName = newAssemblyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.SW_MODULE__ASSEMBLY_NAME, oldAssemblyName, assemblyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDirPath() {
		return dirPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirPath(String newDirPath) {
		String oldDirPath = dirPath;
		dirPath = newDirPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.SW_MODULE__DIR_PATH, oldDirPath, dirPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMainAssembly() {
		return mainAssembly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainAssembly(String newMainAssembly) {
		String oldMainAssembly = mainAssembly;
		mainAssembly = newMainAssembly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.SW_MODULE__MAIN_ASSEMBLY, oldMainAssembly, mainAssembly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOneSwModule() {
		return oneSwModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOneSwModule(boolean newOneSwModule) {
		boolean oldOneSwModule = oneSwModule;
		oneSwModule = newOneSwModule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.SW_MODULE__ONE_SW_MODULE, oldOneSwModule, oneSwModule));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.SW_MODULE__ROW, oldRow, row));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String[] getParentRow() {
		return parentRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentRow(String[] newParentRow) {
		String[] oldParentRow = parentRow;
		parentRow = newParentRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.SW_MODULE__PARENT_ROW, oldParentRow, parentRow));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.SW_MODULE__SHEET, oldSheet, sheet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceSet getMonitorPoints() {
		return monitorPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitorPoints(ResourceSet newMonitorPoints) {
		ResourceSet oldMonitorPoints = monitorPoints;
		monitorPoints = newMonitorPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.SW_MODULE__MONITOR_POINTS, oldMonitorPoints, monitorPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceSet getControlPoints() {
		return controlPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlPoints(ResourceSet newControlPoints) {
		ResourceSet oldControlPoints = controlPoints;
		controlPoints = newControlPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.SW_MODULE__CONTROL_POINTS, oldControlPoints, controlPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceSet getArchiveProperties() {
		return archiveProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchiveProperties(ResourceSet newArchiveProperties) {
		ResourceSet oldArchiveProperties = archiveProperties;
		archiveProperties = newArchiveProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.SW_MODULE__ARCHIVE_PROPERTIES, oldArchiveProperties, archiveProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceSet getSimMonitorPoints() {
		return simMonitorPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimMonitorPoints(ResourceSet newSimMonitorPoints) {
		ResourceSet oldSimMonitorPoints = simMonitorPoints;
		simMonitorPoints = newSimMonitorPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.SW_MODULE__SIM_MONITOR_POINTS, oldSimMonitorPoints, simMonitorPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceSet getSimControlPoints() {
		return simControlPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimControlPoints(ResourceSet newSimControlPoints) {
		ResourceSet oldSimControlPoints = simControlPoints;
		simControlPoints = newSimControlPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.SW_MODULE__SIM_CONTROL_POINTS, oldSimControlPoints, simControlPoints));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.SW_MODULE__TABLE, oldTable, table));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.SW_MODULE__UTIL, oldUtil, util));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Monitor getToAddAllMP() {
		if (toAddAllMP != null && toAddAllMP.eIsProxy()) {
			InternalEObject oldToAddAllMP = (InternalEObject)toAddAllMP;
			toAddAllMP = (Monitor)eResolveProxy(oldToAddAllMP);
			if (toAddAllMP != oldToAddAllMP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.SW_MODULE__TO_ADD_ALL_MP, oldToAddAllMP, toAddAllMP));
			}
		}
		return toAddAllMP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Monitor basicGetToAddAllMP() {
		return toAddAllMP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToAddAllMP(Monitor newToAddAllMP) {
		Monitor oldToAddAllMP = toAddAllMP;
		toAddAllMP = newToAddAllMP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.SW_MODULE__TO_ADD_ALL_MP, oldToAddAllMP, toAddAllMP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Control getToAddAllCP() {
		if (toAddAllCP != null && toAddAllCP.eIsProxy()) {
			InternalEObject oldToAddAllCP = (InternalEObject)toAddAllCP;
			toAddAllCP = (Control)eResolveProxy(oldToAddAllCP);
			if (toAddAllCP != oldToAddAllCP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.SW_MODULE__TO_ADD_ALL_CP, oldToAddAllCP, toAddAllCP));
			}
		}
		return toAddAllCP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Control basicGetToAddAllCP() {
		return toAddAllCP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToAddAllCP(Control newToAddAllCP) {
		Control oldToAddAllCP = toAddAllCP;
		toAddAllCP = newToAddAllCP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.SW_MODULE__TO_ADD_ALL_CP, oldToAddAllCP, toAddAllCP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Util getToFormatDescriptions() {
		if (toFormatDescriptions != null && toFormatDescriptions.eIsProxy()) {
			InternalEObject oldToFormatDescriptions = (InternalEObject)toFormatDescriptions;
			toFormatDescriptions = (Util)eResolveProxy(oldToFormatDescriptions);
			if (toFormatDescriptions != oldToFormatDescriptions) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.SW_MODULE__TO_FORMAT_DESCRIPTIONS, oldToFormatDescriptions, toFormatDescriptions));
			}
		}
		return toFormatDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Util basicGetToFormatDescriptions() {
		return toFormatDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToFormatDescriptions(Util newToFormatDescriptions) {
		Util oldToFormatDescriptions = toFormatDescriptions;
		toFormatDescriptions = newToFormatDescriptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.SW_MODULE__TO_FORMAT_DESCRIPTIONS, oldToFormatDescriptions, toFormatDescriptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getToSheetColumns() {
		if (toSheetColumns != null && toSheetColumns.eIsProxy()) {
			InternalEObject oldToSheetColumns = (InternalEObject)toSheetColumns;
			toSheetColumns = (Table)eResolveProxy(oldToSheetColumns);
			if (toSheetColumns != oldToSheetColumns) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.SW_MODULE__TO_SHEET_COLUMNS, oldToSheetColumns, toSheetColumns));
			}
		}
		return toSheetColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetToSheetColumns() {
		return toSheetColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToSheetColumns(Table newToSheetColumns) {
		Table oldToSheetColumns = toSheetColumns;
		toSheetColumns = newToSheetColumns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.SW_MODULE__TO_SHEET_COLUMNS, oldToSheetColumns, toSheetColumns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addMP(final Resource mp) {
				monitorPoints.getResources().add(mp);
				if (!(((MonitorImpl)mp).RCA().equals("none") ||
						((MonitorImpl)mp).RCA().equals("0x00000") ||
						((MonitorImpl)mp).RCA().equals("0x30000") ||
						((MonitorImpl)mp).RCA().equals("0x30001") ||
						((MonitorImpl)mp).RCA().equals("0x30002") ||
						((MonitorImpl)mp).RCA().equals("0x30003") ||
						((MonitorImpl)mp).RCA().equals("0x30004") ||
						((MonitorImpl)mp).RCA().equals("0x30005")
						)){
					for(int i=0;i< simMonitorPoints.getResources().size();i++)
						if(((MonitorImpl)mp).RCA().equals(((MonitorImpl)simMonitorPoints.getResources().get(i)).RCA()))
							return;
					simMonitorPoints.getResources().add(mp);
				}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addCP(final Resource cp) {
				controlPoints.getResources().add(cp);
				if (!(((ControlImpl)cp).RCA().equals("none") ||
						((ControlImpl)cp).RCA().equals("0x31000") ||
						((ControlImpl)cp).RCA().equals("0x31001")
						)){
					for(int i=0;i< simControlPoints.getResources().size();i++)
						if(((ControlImpl)cp).RCA().equals(((ControlImpl)simControlPoints.getResources().get(i)).RCA()))
							return;
					simControlPoints.getResources().add(cp);
				}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addAP(final Resource ap) {
		archiveProperties.getResources().add(ap);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Initialize() {
		return "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DirPath() {
		return dirPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceSet MonitorPoint() {
		return monitorPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceSet ControlPoint() {
		return controlPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceSet ArchiveProperty() {
		return archiveProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceSet SimMonitorPoint() {
		return simMonitorPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceSet SimControlPoint() {
		return simControlPoints;
	}

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
	protected static final Util UTIL_EDEFAULT = (Util)AmbFactory.eINSTANCE.createFromString(AmbPackage.eINSTANCE.getUtilDT(), "BaseFactory.eINSTANCE;");

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
	 * The cached value of the '{@link #getUtil() <em>Util</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtil()
	 * @generated
	 * @ordered
	 */
	
	protected Util util = UTIL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getToAddAllMP() <em>To Add All MP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToAddAllMP()
	 * @generated
	 * @ordered
	 */
	protected Monitor toAddAllMP;

	/**
	 * The cached value of the '{@link #getToAddAllCP() <em>To Add All CP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToAddAllCP()
	 * @generated
	 * @ordered
	 */
	protected Control toAddAllCP;

	/**
	 * The cached value of the '{@link #getToFormatDescriptions() <em>To Format Descriptions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToFormatDescriptions()
	 * @generated
	 * @ordered
	 */
	protected Util toFormatDescriptions;

	/**
	 * The cached value of the '{@link #getToSheetColumns() <em>To Sheet Columns</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToSheetColumns()
	 * @generated
	 * @ordered
	 */
	protected Table toSheetColumns;
	
	public String DescriptionL1() {
		return util.formatDescriptionL1(Description());
		
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
	public String Parent() {
		return row[table.getColNum(sheet, "Parent")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Cardinality() {
		return row[table.getColNum(sheet, "Cardinality")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean GenericMonitorPoints() {
		return row[table.getColNum(sheet, "Generic Monitor Points")].equals("yes");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String NodeAddress() {
		return row[table.getColNum(sheet, "Node Address")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String HexToDec(final String s) {
		        int n = -1;
		        try {
		            n = Integer.parseInt(s.substring(2),16);
		        } catch (NumberFormatException err) {
		            throw new RuntimeException("Invalid number (" + s + ")");
		        }
		        return Integer.toString(n);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String NodeAddressInDecimal() {
		String s = NodeAddress();
				if (s.equals("parm"))
				    return "0";
				return HexToDec(s);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Channel() {
		return row[table.getColNum(sheet, "Channel")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String BaseAddress() {
		return row[table.getColNum(sheet, "Base Address")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String SimSerialNumber() {
				String hex = Integer.toHexString(Assembly().hashCode()).toLowerCase();
				hex = "0000000000000000" + hex;
				int len = hex.length();
				hex = "0x" + hex.substring(len - 16, len);
				return hex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmbPackage.SW_MODULE__ASSEMBLY_NAME:
				return getAssemblyName();
			case AmbPackage.SW_MODULE__DIR_PATH:
				return getDirPath();
			case AmbPackage.SW_MODULE__MAIN_ASSEMBLY:
				return getMainAssembly();
			case AmbPackage.SW_MODULE__ONE_SW_MODULE:
				return isOneSwModule();
			case AmbPackage.SW_MODULE__ROW:
				return getRow();
			case AmbPackage.SW_MODULE__PARENT_ROW:
				return getParentRow();
			case AmbPackage.SW_MODULE__SHEET:
				return getSheet();
			case AmbPackage.SW_MODULE__MONITOR_POINTS:
				return getMonitorPoints();
			case AmbPackage.SW_MODULE__CONTROL_POINTS:
				return getControlPoints();
			case AmbPackage.SW_MODULE__ARCHIVE_PROPERTIES:
				return getArchiveProperties();
			case AmbPackage.SW_MODULE__SIM_MONITOR_POINTS:
				return getSimMonitorPoints();
			case AmbPackage.SW_MODULE__SIM_CONTROL_POINTS:
				return getSimControlPoints();
			case AmbPackage.SW_MODULE__TABLE:
				return getTable();
			case AmbPackage.SW_MODULE__UTIL:
				return getUtil();
			case AmbPackage.SW_MODULE__TO_ADD_ALL_MP:
				if (resolve) return getToAddAllMP();
				return basicGetToAddAllMP();
			case AmbPackage.SW_MODULE__TO_ADD_ALL_CP:
				if (resolve) return getToAddAllCP();
				return basicGetToAddAllCP();
			case AmbPackage.SW_MODULE__TO_FORMAT_DESCRIPTIONS:
				if (resolve) return getToFormatDescriptions();
				return basicGetToFormatDescriptions();
			case AmbPackage.SW_MODULE__TO_SHEET_COLUMNS:
				if (resolve) return getToSheetColumns();
				return basicGetToSheetColumns();
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
			case AmbPackage.SW_MODULE__ASSEMBLY_NAME:
				setAssemblyName((String)newValue);
				return;
			case AmbPackage.SW_MODULE__DIR_PATH:
				setDirPath((String)newValue);
				return;
			case AmbPackage.SW_MODULE__MAIN_ASSEMBLY:
				setMainAssembly((String)newValue);
				return;
			case AmbPackage.SW_MODULE__ONE_SW_MODULE:
				setOneSwModule((Boolean)newValue);
				return;
			case AmbPackage.SW_MODULE__ROW:
				setRow((String[])newValue);
				return;
			case AmbPackage.SW_MODULE__PARENT_ROW:
				setParentRow((String[])newValue);
				return;
			case AmbPackage.SW_MODULE__SHEET:
				setSheet((Integer)newValue);
				return;
			case AmbPackage.SW_MODULE__MONITOR_POINTS:
				setMonitorPoints((ResourceSet)newValue);
				return;
			case AmbPackage.SW_MODULE__CONTROL_POINTS:
				setControlPoints((ResourceSet)newValue);
				return;
			case AmbPackage.SW_MODULE__ARCHIVE_PROPERTIES:
				setArchiveProperties((ResourceSet)newValue);
				return;
			case AmbPackage.SW_MODULE__SIM_MONITOR_POINTS:
				setSimMonitorPoints((ResourceSet)newValue);
				return;
			case AmbPackage.SW_MODULE__SIM_CONTROL_POINTS:
				setSimControlPoints((ResourceSet)newValue);
				return;
			case AmbPackage.SW_MODULE__TABLE:
				setTable((Table)newValue);
				return;
			case AmbPackage.SW_MODULE__UTIL:
				setUtil((Util)newValue);
				return;
			case AmbPackage.SW_MODULE__TO_ADD_ALL_MP:
				setToAddAllMP((Monitor)newValue);
				return;
			case AmbPackage.SW_MODULE__TO_ADD_ALL_CP:
				setToAddAllCP((Control)newValue);
				return;
			case AmbPackage.SW_MODULE__TO_FORMAT_DESCRIPTIONS:
				setToFormatDescriptions((Util)newValue);
				return;
			case AmbPackage.SW_MODULE__TO_SHEET_COLUMNS:
				setToSheetColumns((Table)newValue);
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
			case AmbPackage.SW_MODULE__ASSEMBLY_NAME:
				setAssemblyName(ASSEMBLY_NAME_EDEFAULT);
				return;
			case AmbPackage.SW_MODULE__DIR_PATH:
				setDirPath(DIR_PATH_EDEFAULT);
				return;
			case AmbPackage.SW_MODULE__MAIN_ASSEMBLY:
				setMainAssembly(MAIN_ASSEMBLY_EDEFAULT);
				return;
			case AmbPackage.SW_MODULE__ONE_SW_MODULE:
				setOneSwModule(ONE_SW_MODULE_EDEFAULT);
				return;
			case AmbPackage.SW_MODULE__ROW:
				setRow(ROW_EDEFAULT);
				return;
			case AmbPackage.SW_MODULE__PARENT_ROW:
				setParentRow(PARENT_ROW_EDEFAULT);
				return;
			case AmbPackage.SW_MODULE__SHEET:
				setSheet(SHEET_EDEFAULT);
				return;
			case AmbPackage.SW_MODULE__MONITOR_POINTS:
				setMonitorPoints(MONITOR_POINTS_EDEFAULT);
				return;
			case AmbPackage.SW_MODULE__CONTROL_POINTS:
				setControlPoints(CONTROL_POINTS_EDEFAULT);
				return;
			case AmbPackage.SW_MODULE__ARCHIVE_PROPERTIES:
				setArchiveProperties(ARCHIVE_PROPERTIES_EDEFAULT);
				return;
			case AmbPackage.SW_MODULE__SIM_MONITOR_POINTS:
				setSimMonitorPoints(SIM_MONITOR_POINTS_EDEFAULT);
				return;
			case AmbPackage.SW_MODULE__SIM_CONTROL_POINTS:
				setSimControlPoints(SIM_CONTROL_POINTS_EDEFAULT);
				return;
			case AmbPackage.SW_MODULE__TABLE:
				setTable(TABLE_EDEFAULT);
				return;
			case AmbPackage.SW_MODULE__UTIL:
				setUtil(UTIL_EDEFAULT);
				return;
			case AmbPackage.SW_MODULE__TO_ADD_ALL_MP:
				setToAddAllMP((Monitor)null);
				return;
			case AmbPackage.SW_MODULE__TO_ADD_ALL_CP:
				setToAddAllCP((Control)null);
				return;
			case AmbPackage.SW_MODULE__TO_FORMAT_DESCRIPTIONS:
				setToFormatDescriptions((Util)null);
				return;
			case AmbPackage.SW_MODULE__TO_SHEET_COLUMNS:
				setToSheetColumns((Table)null);
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
			case AmbPackage.SW_MODULE__ASSEMBLY_NAME:
				return ASSEMBLY_NAME_EDEFAULT == null ? assemblyName != null : !ASSEMBLY_NAME_EDEFAULT.equals(assemblyName);
			case AmbPackage.SW_MODULE__DIR_PATH:
				return DIR_PATH_EDEFAULT == null ? dirPath != null : !DIR_PATH_EDEFAULT.equals(dirPath);
			case AmbPackage.SW_MODULE__MAIN_ASSEMBLY:
				return MAIN_ASSEMBLY_EDEFAULT == null ? mainAssembly != null : !MAIN_ASSEMBLY_EDEFAULT.equals(mainAssembly);
			case AmbPackage.SW_MODULE__ONE_SW_MODULE:
				return oneSwModule != ONE_SW_MODULE_EDEFAULT;
			case AmbPackage.SW_MODULE__ROW:
				return ROW_EDEFAULT == null ? row != null : !ROW_EDEFAULT.equals(row);
			case AmbPackage.SW_MODULE__PARENT_ROW:
				return PARENT_ROW_EDEFAULT == null ? parentRow != null : !PARENT_ROW_EDEFAULT.equals(parentRow);
			case AmbPackage.SW_MODULE__SHEET:
				return sheet != SHEET_EDEFAULT;
			case AmbPackage.SW_MODULE__MONITOR_POINTS:
				return MONITOR_POINTS_EDEFAULT == null ? monitorPoints != null : !MONITOR_POINTS_EDEFAULT.equals(monitorPoints);
			case AmbPackage.SW_MODULE__CONTROL_POINTS:
				return CONTROL_POINTS_EDEFAULT == null ? controlPoints != null : !CONTROL_POINTS_EDEFAULT.equals(controlPoints);
			case AmbPackage.SW_MODULE__ARCHIVE_PROPERTIES:
				return ARCHIVE_PROPERTIES_EDEFAULT == null ? archiveProperties != null : !ARCHIVE_PROPERTIES_EDEFAULT.equals(archiveProperties);
			case AmbPackage.SW_MODULE__SIM_MONITOR_POINTS:
				return SIM_MONITOR_POINTS_EDEFAULT == null ? simMonitorPoints != null : !SIM_MONITOR_POINTS_EDEFAULT.equals(simMonitorPoints);
			case AmbPackage.SW_MODULE__SIM_CONTROL_POINTS:
				return SIM_CONTROL_POINTS_EDEFAULT == null ? simControlPoints != null : !SIM_CONTROL_POINTS_EDEFAULT.equals(simControlPoints);
			case AmbPackage.SW_MODULE__TABLE:
				return TABLE_EDEFAULT == null ? table != null : !TABLE_EDEFAULT.equals(table);
			case AmbPackage.SW_MODULE__UTIL:
				return UTIL_EDEFAULT == null ? util != null : !UTIL_EDEFAULT.equals(util);
			case AmbPackage.SW_MODULE__TO_ADD_ALL_MP:
				return toAddAllMP != null;
			case AmbPackage.SW_MODULE__TO_ADD_ALL_CP:
				return toAddAllCP != null;
			case AmbPackage.SW_MODULE__TO_FORMAT_DESCRIPTIONS:
				return toFormatDescriptions != null;
			case AmbPackage.SW_MODULE__TO_SHEET_COLUMNS:
				return toSheetColumns != null;
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
		result.append(" (AssemblyName: ");
		result.append(assemblyName);
		result.append(", dirPath: ");
		result.append(dirPath);
		result.append(", mainAssembly: ");
		result.append(mainAssembly);
		result.append(", oneSwModule: ");
		result.append(oneSwModule);
		result.append(", row: ");
		result.append(row);
		result.append(", parentRow: ");
		result.append(parentRow);
		result.append(", sheet: ");
		result.append(sheet);
		result.append(", monitorPoints: ");
		result.append(monitorPoints);
		result.append(", controlPoints: ");
		result.append(controlPoints);
		result.append(", archiveProperties: ");
		result.append(archiveProperties);
		result.append(", simMonitorPoints: ");
		result.append(simMonitorPoints);
		result.append(", simControlPoints: ");
		result.append(simControlPoints);
		result.append(", table: ");
		result.append(table);
		result.append(", util: ");
		result.append(util);
		result.append(')');
		return result.toString();
	}

} //SWModuleImpl
