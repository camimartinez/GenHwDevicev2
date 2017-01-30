/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package meta.base.impl;

import meta.base.ArchiveProperty;
import meta.base.BasePackage;
import meta.base.ControlPoint;
import meta.base.DeviceModel;
import meta.base.MainBase;
import meta.base.MonitorPoint;
import meta.base.Table;
import meta.base.Util;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link meta.base.impl.DeviceModelImpl#getDescriptionIndex <em>Description Index</em>}</li>
 *   <li>{@link meta.base.impl.DeviceModelImpl#getSpreadsheet <em>Spreadsheet</em>}</li>
 *   <li>{@link meta.base.impl.DeviceModelImpl#getMain <em>Main</em>}</li>
 *   <li>{@link meta.base.impl.DeviceModelImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link meta.base.impl.DeviceModelImpl#getMonitorPoints <em>Monitor Points</em>}</li>
 *   <li>{@link meta.base.impl.DeviceModelImpl#getControlPoints <em>Control Points</em>}</li>
 *   <li>{@link meta.base.impl.DeviceModelImpl#getArchiveProperties <em>Archive Properties</em>}</li>
 *   <li>{@link meta.base.impl.DeviceModelImpl#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link meta.base.impl.DeviceModelImpl#getBusType <em>Bus Type</em>}</li>
 *   <li>{@link meta.base.impl.DeviceModelImpl#getDeviceDir <em>Device Dir</em>}</li>
 *   <li>{@link meta.base.impl.DeviceModelImpl#getCodegenDir <em>Codegen Dir</em>}</li>
 *   <li>{@link meta.base.impl.DeviceModelImpl#getSpreadsheetDir <em>Spreadsheet Dir</em>}</li>
 *   <li>{@link meta.base.impl.DeviceModelImpl#getGeneratedDir <em>Generated Dir</em>}</li>
 *   <li>{@link meta.base.impl.DeviceModelImpl#isMonitorDBOnly <em>Monitor DB Only</em>}</li>
 *   <li>{@link meta.base.impl.DeviceModelImpl#isGenerateAlt <em>Generate Alt</em>}</li>
 *   <li>{@link meta.base.impl.DeviceModelImpl#getEReference1 <em>EReference1</em>}</li>
 *   <li>{@link meta.base.impl.DeviceModelImpl#getEReference3 <em>EReference3</em>}</li>
 *   <li>{@link meta.base.impl.DeviceModelImpl#getEReference4 <em>EReference4</em>}</li>
 *   <li>{@link meta.base.impl.DeviceModelImpl#getEReference5 <em>EReference5</em>}</li>
 *   <li>{@link meta.base.impl.DeviceModelImpl#getEReference6 <em>EReference6</em>}</li>
 *   <li>{@link meta.base.impl.DeviceModelImpl#getEReference0 <em>EReference0</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DeviceModelImpl extends EObjectImpl implements DeviceModel {
	/**
	 * The default value of the '{@link #getDescriptionIndex() <em>Description Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int DESCRIPTION_INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDescriptionIndex() <em>Description Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionIndex()
	 * @generated
	 * @ordered
	 */
	protected int descriptionIndex = DESCRIPTION_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpreadsheet() <em>Spreadsheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpreadsheet()
	 * @generated
	 * @ordered
	 */
	protected static final String SPREADSHEET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpreadsheet() <em>Spreadsheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpreadsheet()
	 * @generated
	 * @ordered
	 */
	protected String spreadsheet = SPREADSHEET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMain() <em>Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMain()
	 * @generated
	 * @ordered
	 */
	protected Object main;

	/**
	 * The default value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected static final ResourceSet NOTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected ResourceSet notes = NOTES_EDEFAULT;

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
	 * The default value of the '{@link #getDeviceName() <em>Device Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceName()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeviceName() <em>Device Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceName()
	 * @generated
	 * @ordered
	 */
	protected String deviceName = DEVICE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBusType() <em>Bus Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusType()
	 * @generated
	 * @ordered
	 */
	protected static final String BUS_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBusType() <em>Bus Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusType()
	 * @generated
	 * @ordered
	 */
	protected String busType = BUS_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeviceDir() <em>Device Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceDir()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICE_DIR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeviceDir() <em>Device Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceDir()
	 * @generated
	 * @ordered
	 */
	protected String deviceDir = DEVICE_DIR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodegenDir() <em>Codegen Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodegenDir()
	 * @generated
	 * @ordered
	 */
	protected static final String CODEGEN_DIR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodegenDir() <em>Codegen Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodegenDir()
	 * @generated
	 * @ordered
	 */
	protected String codegenDir = CODEGEN_DIR_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpreadsheetDir() <em>Spreadsheet Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpreadsheetDir()
	 * @generated
	 * @ordered
	 */
	protected static final String SPREADSHEET_DIR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpreadsheetDir() <em>Spreadsheet Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpreadsheetDir()
	 * @generated
	 * @ordered
	 */
	protected String spreadsheetDir = SPREADSHEET_DIR_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedDir() <em>Generated Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedDir()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_DIR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeneratedDir() <em>Generated Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedDir()
	 * @generated
	 * @ordered
	 */
	protected String generatedDir = GENERATED_DIR_EDEFAULT;

	/**
	 * The default value of the '{@link #isMonitorDBOnly() <em>Monitor DB Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMonitorDBOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MONITOR_DB_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMonitorDBOnly() <em>Monitor DB Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMonitorDBOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean monitorDBOnly = MONITOR_DB_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerateAlt() <em>Generate Alt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateAlt()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_ALT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerateAlt() <em>Generate Alt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateAlt()
	 * @generated
	 * @ordered
	 */
	protected boolean generateAlt = GENERATE_ALT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEReference1() <em>EReference1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference1()
	 * @generated
	 * @ordered
	 */
	protected Table eReference1;

	/**
	 * The cached value of the '{@link #getEReference3() <em>EReference3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference3()
	 * @generated
	 * @ordered
	 */
	protected ControlPoint eReference3;

	/**
	 * The cached value of the '{@link #getEReference4() <em>EReference4</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference4()
	 * @generated
	 * @ordered
	 */
	protected MonitorPoint eReference4;

	/**
	 * The cached value of the '{@link #getEReference5() <em>EReference5</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference5()
	 * @generated
	 * @ordered
	 */
	protected Util eReference5;

	/**
	 * The cached value of the '{@link #getEReference6() <em>EReference6</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference6()
	 * @generated
	 * @ordered
	 */
	protected ArchiveProperty eReference6;

	/**
	 * The cached value of the '{@link #getEReference0() <em>EReference0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference0()
	 * @generated
	 * @ordered
	 */
	protected MainBase eReference0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasePackage.Literals.DEVICE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDescriptionIndex() {
		return descriptionIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionIndex(int newDescriptionIndex) {
		int oldDescriptionIndex = descriptionIndex;
		descriptionIndex = newDescriptionIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DEVICE_MODEL__DESCRIPTION_INDEX, oldDescriptionIndex, descriptionIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpreadsheet() {
		return spreadsheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpreadsheet(String newSpreadsheet) {
		String oldSpreadsheet = spreadsheet;
		spreadsheet = newSpreadsheet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DEVICE_MODEL__SPREADSHEET, oldSpreadsheet, spreadsheet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getMain() {
		return main;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMain(Object newMain) {
		Object oldMain = main;
		main = newMain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DEVICE_MODEL__MAIN, oldMain, main));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceSet getNotes() {
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotes(ResourceSet newNotes) {
		ResourceSet oldNotes = notes;
		notes = newNotes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DEVICE_MODEL__NOTES, oldNotes, notes));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DEVICE_MODEL__MONITOR_POINTS, oldMonitorPoints, monitorPoints));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DEVICE_MODEL__CONTROL_POINTS, oldControlPoints, controlPoints));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DEVICE_MODEL__ARCHIVE_PROPERTIES, oldArchiveProperties, archiveProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeviceName() {
		return deviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceName(String newDeviceName) {
		String oldDeviceName = deviceName;
		deviceName = newDeviceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DEVICE_MODEL__DEVICE_NAME, oldDeviceName, deviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBusType() {
		return busType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusType(String newBusType) {
		String oldBusType = busType;
		busType = newBusType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DEVICE_MODEL__BUS_TYPE, oldBusType, busType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeviceDir() {
		return deviceDir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceDir(String newDeviceDir) {
		String oldDeviceDir = deviceDir;
		deviceDir = newDeviceDir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DEVICE_MODEL__DEVICE_DIR, oldDeviceDir, deviceDir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodegenDir() {
		return codegenDir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodegenDir(String newCodegenDir) {
		String oldCodegenDir = codegenDir;
		codegenDir = newCodegenDir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DEVICE_MODEL__CODEGEN_DIR, oldCodegenDir, codegenDir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpreadsheetDir() {
		return spreadsheetDir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpreadsheetDir(String newSpreadsheetDir) {
		String oldSpreadsheetDir = spreadsheetDir;
		spreadsheetDir = newSpreadsheetDir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DEVICE_MODEL__SPREADSHEET_DIR, oldSpreadsheetDir, spreadsheetDir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGeneratedDir() {
		return generatedDir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratedDir(String newGeneratedDir) {
		String oldGeneratedDir = generatedDir;
		generatedDir = newGeneratedDir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DEVICE_MODEL__GENERATED_DIR, oldGeneratedDir, generatedDir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMonitorDBOnly() {
		return monitorDBOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitorDBOnly(boolean newMonitorDBOnly) {
		boolean oldMonitorDBOnly = monitorDBOnly;
		monitorDBOnly = newMonitorDBOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DEVICE_MODEL__MONITOR_DB_ONLY, oldMonitorDBOnly, monitorDBOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGenerateAlt() {
		return generateAlt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerateAlt(boolean newGenerateAlt) {
		boolean oldGenerateAlt = generateAlt;
		generateAlt = newGenerateAlt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DEVICE_MODEL__GENERATE_ALT, oldGenerateAlt, generateAlt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getEReference1() {
		if (eReference1 != null && eReference1.eIsProxy()) {
			InternalEObject oldEReference1 = (InternalEObject)eReference1;
			eReference1 = (Table)eResolveProxy(oldEReference1);
			if (eReference1 != oldEReference1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.DEVICE_MODEL__EREFERENCE1, oldEReference1, eReference1));
			}
		}
		return eReference1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetEReference1() {
		return eReference1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference1(Table newEReference1) {
		Table oldEReference1 = eReference1;
		eReference1 = newEReference1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DEVICE_MODEL__EREFERENCE1, oldEReference1, eReference1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlPoint getEReference3() {
		if (eReference3 != null && eReference3.eIsProxy()) {
			InternalEObject oldEReference3 = (InternalEObject)eReference3;
			eReference3 = (ControlPoint)eResolveProxy(oldEReference3);
			if (eReference3 != oldEReference3) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.DEVICE_MODEL__EREFERENCE3, oldEReference3, eReference3));
			}
		}
		return eReference3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlPoint basicGetEReference3() {
		return eReference3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference3(ControlPoint newEReference3) {
		ControlPoint oldEReference3 = eReference3;
		eReference3 = newEReference3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DEVICE_MODEL__EREFERENCE3, oldEReference3, eReference3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorPoint getEReference4() {
		if (eReference4 != null && eReference4.eIsProxy()) {
			InternalEObject oldEReference4 = (InternalEObject)eReference4;
			eReference4 = (MonitorPoint)eResolveProxy(oldEReference4);
			if (eReference4 != oldEReference4) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.DEVICE_MODEL__EREFERENCE4, oldEReference4, eReference4));
			}
		}
		return eReference4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorPoint basicGetEReference4() {
		return eReference4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference4(MonitorPoint newEReference4) {
		MonitorPoint oldEReference4 = eReference4;
		eReference4 = newEReference4;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DEVICE_MODEL__EREFERENCE4, oldEReference4, eReference4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Util getEReference5() {
		if (eReference5 != null && eReference5.eIsProxy()) {
			InternalEObject oldEReference5 = (InternalEObject)eReference5;
			eReference5 = (Util)eResolveProxy(oldEReference5);
			if (eReference5 != oldEReference5) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.DEVICE_MODEL__EREFERENCE5, oldEReference5, eReference5));
			}
		}
		return eReference5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Util basicGetEReference5() {
		return eReference5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference5(Util newEReference5) {
		Util oldEReference5 = eReference5;
		eReference5 = newEReference5;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DEVICE_MODEL__EREFERENCE5, oldEReference5, eReference5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchiveProperty getEReference6() {
		if (eReference6 != null && eReference6.eIsProxy()) {
			InternalEObject oldEReference6 = (InternalEObject)eReference6;
			eReference6 = (ArchiveProperty)eResolveProxy(oldEReference6);
			if (eReference6 != oldEReference6) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.DEVICE_MODEL__EREFERENCE6, oldEReference6, eReference6));
			}
		}
		return eReference6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchiveProperty basicGetEReference6() {
		return eReference6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference6(ArchiveProperty newEReference6) {
		ArchiveProperty oldEReference6 = eReference6;
		eReference6 = newEReference6;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DEVICE_MODEL__EREFERENCE6, oldEReference6, eReference6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainBase getEReference0() {
		if (eReference0 != null && eReference0.eIsProxy()) {
			InternalEObject oldEReference0 = (InternalEObject)eReference0;
			eReference0 = (MainBase)eResolveProxy(oldEReference0);
			if (eReference0 != oldEReference0) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.DEVICE_MODEL__EREFERENCE0, oldEReference0, eReference0));
			}
		}
		return eReference0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainBase basicGetEReference0() {
		return eReference0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference0(MainBase newEReference0) {
		MainBase oldEReference0 = eReference0;
		eReference0 = newEReference0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DEVICE_MODEL__EREFERENCE0, oldEReference0, eReference0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String CheckConstraints() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializeModelDependencies() {
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
	public String TheEnd() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkIfFileExists(String fileName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkIfFileExists(String directory, String fileName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkIfDeviceFileExists(String directory, String localFileName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkIfTestFileExists(String directory, String localFileName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkIfCvsignoreFileExists(String directory) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorPoint getMonitorPoint(String fullName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlPoint getControlPoint(String fullName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String CreateModel() {
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
	public Resource getArchive(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceSet Notes() {
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasePackage.DEVICE_MODEL__DESCRIPTION_INDEX:
				return getDescriptionIndex();
			case BasePackage.DEVICE_MODEL__SPREADSHEET:
				return getSpreadsheet();
			case BasePackage.DEVICE_MODEL__MAIN:
				return getMain();
			case BasePackage.DEVICE_MODEL__NOTES:
				return getNotes();
			case BasePackage.DEVICE_MODEL__MONITOR_POINTS:
				return getMonitorPoints();
			case BasePackage.DEVICE_MODEL__CONTROL_POINTS:
				return getControlPoints();
			case BasePackage.DEVICE_MODEL__ARCHIVE_PROPERTIES:
				return getArchiveProperties();
			case BasePackage.DEVICE_MODEL__DEVICE_NAME:
				return getDeviceName();
			case BasePackage.DEVICE_MODEL__BUS_TYPE:
				return getBusType();
			case BasePackage.DEVICE_MODEL__DEVICE_DIR:
				return getDeviceDir();
			case BasePackage.DEVICE_MODEL__CODEGEN_DIR:
				return getCodegenDir();
			case BasePackage.DEVICE_MODEL__SPREADSHEET_DIR:
				return getSpreadsheetDir();
			case BasePackage.DEVICE_MODEL__GENERATED_DIR:
				return getGeneratedDir();
			case BasePackage.DEVICE_MODEL__MONITOR_DB_ONLY:
				return isMonitorDBOnly();
			case BasePackage.DEVICE_MODEL__GENERATE_ALT:
				return isGenerateAlt();
			case BasePackage.DEVICE_MODEL__EREFERENCE1:
				if (resolve) return getEReference1();
				return basicGetEReference1();
			case BasePackage.DEVICE_MODEL__EREFERENCE3:
				if (resolve) return getEReference3();
				return basicGetEReference3();
			case BasePackage.DEVICE_MODEL__EREFERENCE4:
				if (resolve) return getEReference4();
				return basicGetEReference4();
			case BasePackage.DEVICE_MODEL__EREFERENCE5:
				if (resolve) return getEReference5();
				return basicGetEReference5();
			case BasePackage.DEVICE_MODEL__EREFERENCE6:
				if (resolve) return getEReference6();
				return basicGetEReference6();
			case BasePackage.DEVICE_MODEL__EREFERENCE0:
				if (resolve) return getEReference0();
				return basicGetEReference0();
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
			case BasePackage.DEVICE_MODEL__DESCRIPTION_INDEX:
				setDescriptionIndex((Integer)newValue);
				return;
			case BasePackage.DEVICE_MODEL__SPREADSHEET:
				setSpreadsheet((String)newValue);
				return;
			case BasePackage.DEVICE_MODEL__MAIN:
				setMain(newValue);
				return;
			case BasePackage.DEVICE_MODEL__NOTES:
				setNotes((ResourceSet)newValue);
				return;
			case BasePackage.DEVICE_MODEL__MONITOR_POINTS:
				setMonitorPoints((ResourceSet)newValue);
				return;
			case BasePackage.DEVICE_MODEL__CONTROL_POINTS:
				setControlPoints((ResourceSet)newValue);
				return;
			case BasePackage.DEVICE_MODEL__ARCHIVE_PROPERTIES:
				setArchiveProperties((ResourceSet)newValue);
				return;
			case BasePackage.DEVICE_MODEL__DEVICE_NAME:
				setDeviceName((String)newValue);
				return;
			case BasePackage.DEVICE_MODEL__BUS_TYPE:
				setBusType((String)newValue);
				return;
			case BasePackage.DEVICE_MODEL__DEVICE_DIR:
				setDeviceDir((String)newValue);
				return;
			case BasePackage.DEVICE_MODEL__CODEGEN_DIR:
				setCodegenDir((String)newValue);
				return;
			case BasePackage.DEVICE_MODEL__SPREADSHEET_DIR:
				setSpreadsheetDir((String)newValue);
				return;
			case BasePackage.DEVICE_MODEL__GENERATED_DIR:
				setGeneratedDir((String)newValue);
				return;
			case BasePackage.DEVICE_MODEL__MONITOR_DB_ONLY:
				setMonitorDBOnly((Boolean)newValue);
				return;
			case BasePackage.DEVICE_MODEL__GENERATE_ALT:
				setGenerateAlt((Boolean)newValue);
				return;
			case BasePackage.DEVICE_MODEL__EREFERENCE1:
				setEReference1((Table)newValue);
				return;
			case BasePackage.DEVICE_MODEL__EREFERENCE3:
				setEReference3((ControlPoint)newValue);
				return;
			case BasePackage.DEVICE_MODEL__EREFERENCE4:
				setEReference4((MonitorPoint)newValue);
				return;
			case BasePackage.DEVICE_MODEL__EREFERENCE5:
				setEReference5((Util)newValue);
				return;
			case BasePackage.DEVICE_MODEL__EREFERENCE6:
				setEReference6((ArchiveProperty)newValue);
				return;
			case BasePackage.DEVICE_MODEL__EREFERENCE0:
				setEReference0((MainBase)newValue);
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
			case BasePackage.DEVICE_MODEL__DESCRIPTION_INDEX:
				setDescriptionIndex(DESCRIPTION_INDEX_EDEFAULT);
				return;
			case BasePackage.DEVICE_MODEL__SPREADSHEET:
				setSpreadsheet(SPREADSHEET_EDEFAULT);
				return;
			case BasePackage.DEVICE_MODEL__MAIN:
				setMain((Object)null);
				return;
			case BasePackage.DEVICE_MODEL__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case BasePackage.DEVICE_MODEL__MONITOR_POINTS:
				setMonitorPoints(MONITOR_POINTS_EDEFAULT);
				return;
			case BasePackage.DEVICE_MODEL__CONTROL_POINTS:
				setControlPoints(CONTROL_POINTS_EDEFAULT);
				return;
			case BasePackage.DEVICE_MODEL__ARCHIVE_PROPERTIES:
				setArchiveProperties(ARCHIVE_PROPERTIES_EDEFAULT);
				return;
			case BasePackage.DEVICE_MODEL__DEVICE_NAME:
				setDeviceName(DEVICE_NAME_EDEFAULT);
				return;
			case BasePackage.DEVICE_MODEL__BUS_TYPE:
				setBusType(BUS_TYPE_EDEFAULT);
				return;
			case BasePackage.DEVICE_MODEL__DEVICE_DIR:
				setDeviceDir(DEVICE_DIR_EDEFAULT);
				return;
			case BasePackage.DEVICE_MODEL__CODEGEN_DIR:
				setCodegenDir(CODEGEN_DIR_EDEFAULT);
				return;
			case BasePackage.DEVICE_MODEL__SPREADSHEET_DIR:
				setSpreadsheetDir(SPREADSHEET_DIR_EDEFAULT);
				return;
			case BasePackage.DEVICE_MODEL__GENERATED_DIR:
				setGeneratedDir(GENERATED_DIR_EDEFAULT);
				return;
			case BasePackage.DEVICE_MODEL__MONITOR_DB_ONLY:
				setMonitorDBOnly(MONITOR_DB_ONLY_EDEFAULT);
				return;
			case BasePackage.DEVICE_MODEL__GENERATE_ALT:
				setGenerateAlt(GENERATE_ALT_EDEFAULT);
				return;
			case BasePackage.DEVICE_MODEL__EREFERENCE1:
				setEReference1((Table)null);
				return;
			case BasePackage.DEVICE_MODEL__EREFERENCE3:
				setEReference3((ControlPoint)null);
				return;
			case BasePackage.DEVICE_MODEL__EREFERENCE4:
				setEReference4((MonitorPoint)null);
				return;
			case BasePackage.DEVICE_MODEL__EREFERENCE5:
				setEReference5((Util)null);
				return;
			case BasePackage.DEVICE_MODEL__EREFERENCE6:
				setEReference6((ArchiveProperty)null);
				return;
			case BasePackage.DEVICE_MODEL__EREFERENCE0:
				setEReference0((MainBase)null);
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
			case BasePackage.DEVICE_MODEL__DESCRIPTION_INDEX:
				return descriptionIndex != DESCRIPTION_INDEX_EDEFAULT;
			case BasePackage.DEVICE_MODEL__SPREADSHEET:
				return SPREADSHEET_EDEFAULT == null ? spreadsheet != null : !SPREADSHEET_EDEFAULT.equals(spreadsheet);
			case BasePackage.DEVICE_MODEL__MAIN:
				return main != null;
			case BasePackage.DEVICE_MODEL__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case BasePackage.DEVICE_MODEL__MONITOR_POINTS:
				return MONITOR_POINTS_EDEFAULT == null ? monitorPoints != null : !MONITOR_POINTS_EDEFAULT.equals(monitorPoints);
			case BasePackage.DEVICE_MODEL__CONTROL_POINTS:
				return CONTROL_POINTS_EDEFAULT == null ? controlPoints != null : !CONTROL_POINTS_EDEFAULT.equals(controlPoints);
			case BasePackage.DEVICE_MODEL__ARCHIVE_PROPERTIES:
				return ARCHIVE_PROPERTIES_EDEFAULT == null ? archiveProperties != null : !ARCHIVE_PROPERTIES_EDEFAULT.equals(archiveProperties);
			case BasePackage.DEVICE_MODEL__DEVICE_NAME:
				return DEVICE_NAME_EDEFAULT == null ? deviceName != null : !DEVICE_NAME_EDEFAULT.equals(deviceName);
			case BasePackage.DEVICE_MODEL__BUS_TYPE:
				return BUS_TYPE_EDEFAULT == null ? busType != null : !BUS_TYPE_EDEFAULT.equals(busType);
			case BasePackage.DEVICE_MODEL__DEVICE_DIR:
				return DEVICE_DIR_EDEFAULT == null ? deviceDir != null : !DEVICE_DIR_EDEFAULT.equals(deviceDir);
			case BasePackage.DEVICE_MODEL__CODEGEN_DIR:
				return CODEGEN_DIR_EDEFAULT == null ? codegenDir != null : !CODEGEN_DIR_EDEFAULT.equals(codegenDir);
			case BasePackage.DEVICE_MODEL__SPREADSHEET_DIR:
				return SPREADSHEET_DIR_EDEFAULT == null ? spreadsheetDir != null : !SPREADSHEET_DIR_EDEFAULT.equals(spreadsheetDir);
			case BasePackage.DEVICE_MODEL__GENERATED_DIR:
				return GENERATED_DIR_EDEFAULT == null ? generatedDir != null : !GENERATED_DIR_EDEFAULT.equals(generatedDir);
			case BasePackage.DEVICE_MODEL__MONITOR_DB_ONLY:
				return monitorDBOnly != MONITOR_DB_ONLY_EDEFAULT;
			case BasePackage.DEVICE_MODEL__GENERATE_ALT:
				return generateAlt != GENERATE_ALT_EDEFAULT;
			case BasePackage.DEVICE_MODEL__EREFERENCE1:
				return eReference1 != null;
			case BasePackage.DEVICE_MODEL__EREFERENCE3:
				return eReference3 != null;
			case BasePackage.DEVICE_MODEL__EREFERENCE4:
				return eReference4 != null;
			case BasePackage.DEVICE_MODEL__EREFERENCE5:
				return eReference5 != null;
			case BasePackage.DEVICE_MODEL__EREFERENCE6:
				return eReference6 != null;
			case BasePackage.DEVICE_MODEL__EREFERENCE0:
				return eReference0 != null;
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
		result.append(" (DescriptionIndex: ");
		result.append(descriptionIndex);
		result.append(", spreadsheet: ");
		result.append(spreadsheet);
		result.append(", main: ");
		result.append(main);
		result.append(", notes: ");
		result.append(notes);
		result.append(", monitorPoints: ");
		result.append(monitorPoints);
		result.append(", controlPoints: ");
		result.append(controlPoints);
		result.append(", archiveProperties: ");
		result.append(archiveProperties);
		result.append(", deviceName: ");
		result.append(deviceName);
		result.append(", busType: ");
		result.append(busType);
		result.append(", deviceDir: ");
		result.append(deviceDir);
		result.append(", codegenDir: ");
		result.append(codegenDir);
		result.append(", spreadsheetDir: ");
		result.append(spreadsheetDir);
		result.append(", generatedDir: ");
		result.append(generatedDir);
		result.append(", monitorDBOnly: ");
		result.append(monitorDBOnly);
		result.append(", generateAlt: ");
		result.append(generateAlt);
		result.append(')');
		return result.toString();
	}

} //DeviceModelImpl
