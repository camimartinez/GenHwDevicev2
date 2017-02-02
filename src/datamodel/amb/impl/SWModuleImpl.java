/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package datamodel.amb.impl;

import datamodel.amb.AmbPackage;
import datamodel.amb.ControlImpl;
import datamodel.amb.MonitorImpl;
import datamodel.amb.SWModule;

import datamodel.base.Table;
import datamodel.base.Util;

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
	 * The cached value of the '{@link #getAddAllMP() <em>Add All MP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddAllMP()
	 * @generated
	 * @ordered
	 */
	protected MonitorImpl addAllMP;

	/**
	 * The cached value of the '{@link #getAddAllCP() <em>Add All CP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddAllCP()
	 * @generated
	 * @ordered
	 */
	protected ControlImpl addAllCP;

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
	protected SWModuleImpl() {
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
	public MonitorImpl getAddAllMP() {
		if (addAllMP != null && addAllMP.eIsProxy()) {
			InternalEObject oldAddAllMP = (InternalEObject)addAllMP;
			addAllMP = (MonitorImpl)eResolveProxy(oldAddAllMP);
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
	public MonitorImpl basicGetAddAllMP() {
		return addAllMP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddAllMP(MonitorImpl newAddAllMP) {
		MonitorImpl oldAddAllMP = addAllMP;
		addAllMP = newAddAllMP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.SW_MODULE__ADD_ALL_MP, oldAddAllMP, addAllMP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlImpl getAddAllCP() {
		if (addAllCP != null && addAllCP.eIsProxy()) {
			InternalEObject oldAddAllCP = (InternalEObject)addAllCP;
			addAllCP = (ControlImpl)eResolveProxy(oldAddAllCP);
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
	public ControlImpl basicGetAddAllCP() {
		return addAllCP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddAllCP(ControlImpl newAddAllCP) {
		ControlImpl oldAddAllCP = addAllCP;
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
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addCP(Resource cp) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addAP(Resource ap) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Initialize() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DirPath() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceSet MonitorPoint() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceSet ControlPoint() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceSet ArchiveProperty() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceSet SimMonitorPoint() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceSet SimControlPoint() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	public String DescriptionL1() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void DescriptionAsString() {
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
	public String Parent() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Cardinality() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean GenericMonitorPoints() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String NodeAddress() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String HexToDec(String s) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String NodeAddressInDecimal() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Channel() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String BaseAddress() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String SimSerialNumber() {
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
			case AmbPackage.SW_MODULE__ADD_ALL_MP:
				setAddAllMP((MonitorImpl)newValue);
				return;
			case AmbPackage.SW_MODULE__ADD_ALL_CP:
				setAddAllCP((ControlImpl)newValue);
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
			case AmbPackage.SW_MODULE__ADD_ALL_MP:
				setAddAllMP((MonitorImpl)null);
				return;
			case AmbPackage.SW_MODULE__ADD_ALL_CP:
				setAddAllCP((ControlImpl)null);
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
		result.append(')');
		return result.toString();
	}

} //SWModuleImpl
