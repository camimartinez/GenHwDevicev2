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
import datamodel.amb.MonitorAMB;
import datamodel.amb.SWModule;

import datamodel.base.Table;
import datamodel.base.Util;

import datamodel.base.impl.BaseFactoryImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SW Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datamodel.amb.impl.SWModuleImpl#getAssemblyName <em>Assembly Name</em>}</li>
 *   <li>{@link datamodel.amb.impl.SWModuleImpl#getDirPath <em>Dir Path</em>}</li>
 *   <li>{@link datamodel.amb.impl.SWModuleImpl#getMainAssembly <em>Main Assembly</em>}</li>
 *   <li>{@link datamodel.amb.impl.SWModuleImpl#isOneSwModule <em>One Sw Module</em>}</li>
 *   <li>{@link datamodel.amb.impl.SWModuleImpl#getRow <em>Row</em>}</li>
 *   <li>{@link datamodel.amb.impl.SWModuleImpl#getParentRow <em>Parent Row</em>}</li>
 *   <li>{@link datamodel.amb.impl.SWModuleImpl#getSheet <em>Sheet</em>}</li>
 *   <li>{@link datamodel.amb.impl.SWModuleImpl#getMonitorPoints <em>Monitor Points</em>}</li>
 *   <li>{@link datamodel.amb.impl.SWModuleImpl#getControlPoints <em>Control Points</em>}</li>
 *   <li>{@link datamodel.amb.impl.SWModuleImpl#getArchiveProperties <em>Archive Properties</em>}</li>
 *   <li>{@link datamodel.amb.impl.SWModuleImpl#getSimMonitorPoints <em>Sim Monitor Points</em>}</li>
 *   <li>{@link datamodel.amb.impl.SWModuleImpl#getSimControlPoints <em>Sim Control Points</em>}</li>
 *   <li>{@link datamodel.amb.impl.SWModuleImpl#getAux <em>Aux</em>}</li>
 *   <li>{@link datamodel.amb.impl.SWModuleImpl#getAddAllMP <em>Add All MP</em>}</li>
 *   <li>{@link datamodel.amb.impl.SWModuleImpl#getAddAllCP <em>Add All CP</em>}</li>
 *   <li>{@link datamodel.amb.impl.SWModuleImpl#getSetFormatDescriptions <em>Set Format Descriptions</em>}</li>
 *   <li>{@link datamodel.amb.impl.SWModuleImpl#getGetSheetColumns <em>Get Sheet Columns</em>}</li>
 * </ul>
 * </p>
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
	 * The default value of the '{@link #getAux() <em>Aux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAux()
	 * @generated
	 * @ordered
	 */
	protected static final BaseFactoryImpl AUX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAux() <em>Aux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAux()
	 * @generated
	 * @ordered
	 */
	protected BaseFactoryImpl aux = AUX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAddAllMP() <em>Add All MP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddAllMP()
	 * @generated
	 * @ordered
	 */
	protected MonitorAMB addAllMP;

	/**
	 * The cached value of the '{@link #getAddAllCP() <em>Add All CP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddAllCP()
	 * @generated
	 * @ordered
	 */
	protected ControlAMB addAllCP;

	/**
	 * The cached value of the '{@link #getSetFormatDescriptions() <em>Set Format Descriptions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetFormatDescriptions()
	 * @generated
	 * @ordered
	 */
	protected Util setFormatDescriptions;

	/**
	 * The cached value of the '{@link #getGetSheetColumns() <em>Get Sheet Columns</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetSheetColumns()
	 * @generated
	 * @ordered
	 */
	protected Table getSheetColumns;

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
	 * @!generated
	 */
	public SWModuleImpl(String[] row, boolean oneSwModule, String mainAssembly) {
		this.row = row;
		this.sheet = BaseFactoryImpl.eINSTANCE.createTable().getSheetNum("Hardware Device");
		this.oneSwModule = oneSwModule;
		int assemblyIndex = BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "Assembly");
		this.assemblyName = row[assemblyIndex];
		this.mainAssembly = mainAssembly;
		if(oneSwModule){
			setDirPath(row[assemblyIndex]);
		}
		else{
			setDirPath(mainAssembly + "/" + row[assemblyIndex]);
		}
		monitorPoints = new ResourceSetImpl();
		controlPoints = new ResourceSetImpl();
		archiveProperties = new ResourceSetImpl();
		simMonitorPoints = new ResourceSetImpl();
		simControlPoints = new ResourceSetImpl();
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
	public BaseFactoryImpl getAux() {
		return aux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAux(BaseFactoryImpl newAux) {
		BaseFactoryImpl oldAux = aux;
		aux = newAux;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.SW_MODULE__AUX, oldAux, aux));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorAMB getAddAllMP() {
		if (addAllMP != null && addAllMP.eIsProxy()) {
			InternalEObject oldAddAllMP = (InternalEObject)addAllMP;
			addAllMP = (MonitorAMB)eResolveProxy(oldAddAllMP);
			if (addAllMP != oldAddAllMP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.SW_MODULE__ADD_ALL_MP, oldAddAllMP, addAllMP));
			}
		}
		return addAllMP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorAMB basicGetAddAllMP() {
		return addAllMP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddAllMP(MonitorAMB newAddAllMP) {
		MonitorAMB oldAddAllMP = addAllMP;
		addAllMP = newAddAllMP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.SW_MODULE__ADD_ALL_MP, oldAddAllMP, addAllMP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlAMB getAddAllCP() {
		if (addAllCP != null && addAllCP.eIsProxy()) {
			InternalEObject oldAddAllCP = (InternalEObject)addAllCP;
			addAllCP = (ControlAMB)eResolveProxy(oldAddAllCP);
			if (addAllCP != oldAddAllCP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.SW_MODULE__ADD_ALL_CP, oldAddAllCP, addAllCP));
			}
		}
		return addAllCP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlAMB basicGetAddAllCP() {
		return addAllCP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddAllCP(ControlAMB newAddAllCP) {
		ControlAMB oldAddAllCP = addAllCP;
		addAllCP = newAddAllCP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.SW_MODULE__ADD_ALL_CP, oldAddAllCP, addAllCP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Util getSetFormatDescriptions() {
		if (setFormatDescriptions != null && setFormatDescriptions.eIsProxy()) {
			InternalEObject oldSetFormatDescriptions = (InternalEObject)setFormatDescriptions;
			setFormatDescriptions = (Util)eResolveProxy(oldSetFormatDescriptions);
			if (setFormatDescriptions != oldSetFormatDescriptions) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.SW_MODULE__SET_FORMAT_DESCRIPTIONS, oldSetFormatDescriptions, setFormatDescriptions));
			}
		}
		return setFormatDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Util basicGetSetFormatDescriptions() {
		return setFormatDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetFormatDescriptions(Util newSetFormatDescriptions) {
		Util oldSetFormatDescriptions = setFormatDescriptions;
		setFormatDescriptions = newSetFormatDescriptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.SW_MODULE__SET_FORMAT_DESCRIPTIONS, oldSetFormatDescriptions, setFormatDescriptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getGetSheetColumns() {
		if (getSheetColumns != null && getSheetColumns.eIsProxy()) {
			InternalEObject oldGetSheetColumns = (InternalEObject)getSheetColumns;
			getSheetColumns = (Table)eResolveProxy(oldGetSheetColumns);
			if (getSheetColumns != oldGetSheetColumns) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.SW_MODULE__GET_SHEET_COLUMNS, oldGetSheetColumns, getSheetColumns));
			}
		}
		return getSheetColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetGetSheetColumns() {
		return getSheetColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetSheetColumns(Table newGetSheetColumns) {
		Table oldGetSheetColumns = getSheetColumns;
		getSheetColumns = newGetSheetColumns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.SW_MODULE__GET_SHEET_COLUMNS, oldGetSheetColumns, getSheetColumns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addMP(Resource mp) {
				monitorPoints.getResources().add(mp);
				if (!(((MonitorAMBImpl)mp).RCA().equals("none") ||
						((MonitorAMBImpl)mp).RCA().equals("0x00000") ||
						((MonitorAMBImpl)mp).RCA().equals("0x30000") ||
						((MonitorAMBImpl)mp).RCA().equals("0x30001") ||
						((MonitorAMBImpl)mp).RCA().equals("0x30002") ||
						((MonitorAMBImpl)mp).RCA().equals("0x30003") ||
						((MonitorAMBImpl)mp).RCA().equals("0x30004") ||
						((MonitorAMBImpl)mp).RCA().equals("0x30005")
				)){
					for(int i=0;i< simMonitorPoints.getResources().size();i++)
						if(((MonitorAMBImpl)mp).RCA().equals(((MonitorAMBImpl)simMonitorPoints.getResources().get(i)).RCA()))
							return;
					simMonitorPoints.getResources().add(mp);
				}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addCP(Resource cp) {
				controlPoints.getResources().add(cp);
				if (!(((ControlAMBImpl)cp).RCA().equals("none") ||
						((ControlAMBImpl)cp).RCA().equals("0x31000") ||
						((ControlAMBImpl)cp).RCA().equals("0x31001")
				)){
					for(int i=0;i< simControlPoints.getResources().size();i++)
						if(((ControlAMBImpl)cp).RCA().equals(((ControlAMBImpl)simControlPoints.getResources().get(i)).RCA()))
							return;
					simControlPoints.getResources().add(cp);
				}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addAP(Resource ap) {
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
	public String DescriptionL1() {
		return BaseFactoryImpl.eINSTANCE.createUtil().formatDescriptionL1(Description());
		
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
	public String Parent() {
		return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "Parent")];
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Cardinality() {
		return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "Cardinality")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean GenericMonitorPoints() {
		return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "Generic Monitor Points")].equals("yes");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String NodeAddress() {
		return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "Node Address")];
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String HexToDec(String s) {
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
		return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "Channel")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String BaseAddress() {
		return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "Base Address")];
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
			case AmbPackage.SW_MODULE__AUX:
				return getAux();
			case AmbPackage.SW_MODULE__ADD_ALL_MP:
				if (resolve) return getAddAllMP();
				return basicGetAddAllMP();
			case AmbPackage.SW_MODULE__ADD_ALL_CP:
				if (resolve) return getAddAllCP();
				return basicGetAddAllCP();
			case AmbPackage.SW_MODULE__SET_FORMAT_DESCRIPTIONS:
				if (resolve) return getSetFormatDescriptions();
				return basicGetSetFormatDescriptions();
			case AmbPackage.SW_MODULE__GET_SHEET_COLUMNS:
				if (resolve) return getGetSheetColumns();
				return basicGetGetSheetColumns();
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
			case AmbPackage.SW_MODULE__AUX:
				setAux((BaseFactoryImpl)newValue);
				return;
			case AmbPackage.SW_MODULE__ADD_ALL_MP:
				setAddAllMP((MonitorAMB)newValue);
				return;
			case AmbPackage.SW_MODULE__ADD_ALL_CP:
				setAddAllCP((ControlAMB)newValue);
				return;
			case AmbPackage.SW_MODULE__SET_FORMAT_DESCRIPTIONS:
				setSetFormatDescriptions((Util)newValue);
				return;
			case AmbPackage.SW_MODULE__GET_SHEET_COLUMNS:
				setGetSheetColumns((Table)newValue);
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
			case AmbPackage.SW_MODULE__AUX:
				setAux(AUX_EDEFAULT);
				return;
			case AmbPackage.SW_MODULE__ADD_ALL_MP:
				setAddAllMP((MonitorAMB)null);
				return;
			case AmbPackage.SW_MODULE__ADD_ALL_CP:
				setAddAllCP((ControlAMB)null);
				return;
			case AmbPackage.SW_MODULE__SET_FORMAT_DESCRIPTIONS:
				setSetFormatDescriptions((Util)null);
				return;
			case AmbPackage.SW_MODULE__GET_SHEET_COLUMNS:
				setGetSheetColumns((Table)null);
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
			case AmbPackage.SW_MODULE__AUX:
				return AUX_EDEFAULT == null ? aux != null : !AUX_EDEFAULT.equals(aux);
			case AmbPackage.SW_MODULE__ADD_ALL_MP:
				return addAllMP != null;
			case AmbPackage.SW_MODULE__ADD_ALL_CP:
				return addAllCP != null;
			case AmbPackage.SW_MODULE__SET_FORMAT_DESCRIPTIONS:
				return setFormatDescriptions != null;
			case AmbPackage.SW_MODULE__GET_SHEET_COLUMNS:
				return getSheetColumns != null;
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
		result.append(", aux: ");
		result.append(aux);
		result.append(')');
		return result.toString();
	}

} //SWModuleImpl
