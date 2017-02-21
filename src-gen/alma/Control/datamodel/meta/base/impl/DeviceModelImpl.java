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
package alma.Control.datamodel.meta.base.impl;

import alma.Control.datamodel.meta.base.ArchiveProperty;
import alma.Control.datamodel.meta.base.BasePackage;
import alma.Control.datamodel.meta.base.ControlPoint;
import alma.Control.datamodel.meta.base.DeviceModel;
import alma.Control.datamodel.meta.base.MainBase;
import alma.Control.datamodel.meta.base.MonitorPoint;
import alma.Control.datamodel.meta.base.Table;
import alma.Control.datamodel.meta.base.Util;

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
 * </p>
 * <ul>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.DeviceModelImpl#getDescriptionIndex <em>Description Index</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.DeviceModelImpl#getSpreadsheet <em>Spreadsheet</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.DeviceModelImpl#getMain <em>Main</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.DeviceModelImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.DeviceModelImpl#getMonitorPoints <em>Monitor Points</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.DeviceModelImpl#getControlPoints <em>Control Points</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.DeviceModelImpl#getArchiveProperties <em>Archive Properties</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.DeviceModelImpl#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.DeviceModelImpl#getBusType <em>Bus Type</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.DeviceModelImpl#getDeviceDir <em>Device Dir</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.DeviceModelImpl#getCodegenDir <em>Codegen Dir</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.DeviceModelImpl#getSpreadsheetDir <em>Spreadsheet Dir</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.DeviceModelImpl#getGeneratedDir <em>Generated Dir</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.DeviceModelImpl#isMonitorDBOnly <em>Monitor DB Only</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.DeviceModelImpl#isGenerateAlt <em>Generate Alt</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.DeviceModelImpl#getToArchiveIndex <em>To Archive Index</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.DeviceModelImpl#getToContPoints <em>To Cont Points</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.DeviceModelImpl#getToMoniPoints <em>To Moni Points</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.DeviceModelImpl#getToEndOfGeneration <em>To End Of Generation</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.DeviceModelImpl#getToArchivProp <em>To Archiv Prop</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.DeviceModelImpl#getToInfFromSpread <em>To Inf From Spread</em>}</li>
 * </ul>
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
	protected static final int DESCRIPTION_INDEX_EDEFAULT = 1;

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
	protected static final String[][][] SPREADSHEET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpreadsheet() <em>Spreadsheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpreadsheet()
	 * @generated
	 * @ordered
	 */
	protected String[][][] spreadsheet = SPREADSHEET_EDEFAULT;

	/**
	 * The default value of the '{@link #getMain() <em>Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMain()
	 * @generated
	 * @ordered
	 */
	protected static final MainBase MAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMain() <em>Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMain()
	 * @generated
	 * @ordered
	 */
	protected MainBase main = MAIN_EDEFAULT;

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
	 * The cached value of the '{@link #getToArchiveIndex() <em>To Archive Index</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToArchiveIndex()
	 * @generated
	 * @ordered
	 */
	protected Table toArchiveIndex;

	/**
	 * The cached value of the '{@link #getToContPoints() <em>To Cont Points</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToContPoints()
	 * @generated
	 * @ordered
	 */
	protected ControlPoint toContPoints;

	/**
	 * The cached value of the '{@link #getToMoniPoints() <em>To Moni Points</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToMoniPoints()
	 * @generated
	 * @ordered
	 */
	protected MonitorPoint toMoniPoints;

	/**
	 * The cached value of the '{@link #getToEndOfGeneration() <em>To End Of Generation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToEndOfGeneration()
	 * @generated
	 * @ordered
	 */
	protected Util toEndOfGeneration;

	/**
	 * The cached value of the '{@link #getToArchivProp() <em>To Archiv Prop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToArchivProp()
	 * @generated
	 * @ordered
	 */
	protected ArchiveProperty toArchivProp;

	/**
	 * The cached value of the '{@link #getToInfFromSpread() <em>To Inf From Spread</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToInfFromSpread()
	 * @generated
	 * @ordered
	 */
	protected MainBase toInfFromSpread;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceModelImpl() {
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
	public String[][][] getSpreadsheet() {
		return spreadsheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpreadsheet(String[][][] newSpreadsheet) {
		String[][][] oldSpreadsheet = spreadsheet;
		spreadsheet = newSpreadsheet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DEVICE_MODEL__SPREADSHEET, oldSpreadsheet, spreadsheet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainBase getMain() {
		return main;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMain(MainBase newMain) {
		MainBase oldMain = main;
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
	public Table getToArchiveIndex() {
		if (toArchiveIndex != null && toArchiveIndex.eIsProxy()) {
			InternalEObject oldToArchiveIndex = (InternalEObject)toArchiveIndex;
			toArchiveIndex = (Table)eResolveProxy(oldToArchiveIndex);
			if (toArchiveIndex != oldToArchiveIndex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.DEVICE_MODEL__TO_ARCHIVE_INDEX, oldToArchiveIndex, toArchiveIndex));
			}
		}
		return toArchiveIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetToArchiveIndex() {
		return toArchiveIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToArchiveIndex(Table newToArchiveIndex) {
		Table oldToArchiveIndex = toArchiveIndex;
		toArchiveIndex = newToArchiveIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DEVICE_MODEL__TO_ARCHIVE_INDEX, oldToArchiveIndex, toArchiveIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlPoint getToContPoints() {
		if (toContPoints != null && toContPoints.eIsProxy()) {
			InternalEObject oldToContPoints = (InternalEObject)toContPoints;
			toContPoints = (ControlPoint)eResolveProxy(oldToContPoints);
			if (toContPoints != oldToContPoints) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.DEVICE_MODEL__TO_CONT_POINTS, oldToContPoints, toContPoints));
			}
		}
		return toContPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlPoint basicGetToContPoints() {
		return toContPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToContPoints(ControlPoint newToContPoints) {
		ControlPoint oldToContPoints = toContPoints;
		toContPoints = newToContPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DEVICE_MODEL__TO_CONT_POINTS, oldToContPoints, toContPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorPoint getToMoniPoints() {
		if (toMoniPoints != null && toMoniPoints.eIsProxy()) {
			InternalEObject oldToMoniPoints = (InternalEObject)toMoniPoints;
			toMoniPoints = (MonitorPoint)eResolveProxy(oldToMoniPoints);
			if (toMoniPoints != oldToMoniPoints) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.DEVICE_MODEL__TO_MONI_POINTS, oldToMoniPoints, toMoniPoints));
			}
		}
		return toMoniPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorPoint basicGetToMoniPoints() {
		return toMoniPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToMoniPoints(MonitorPoint newToMoniPoints) {
		MonitorPoint oldToMoniPoints = toMoniPoints;
		toMoniPoints = newToMoniPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DEVICE_MODEL__TO_MONI_POINTS, oldToMoniPoints, toMoniPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Util getToEndOfGeneration() {
		if (toEndOfGeneration != null && toEndOfGeneration.eIsProxy()) {
			InternalEObject oldToEndOfGeneration = (InternalEObject)toEndOfGeneration;
			toEndOfGeneration = (Util)eResolveProxy(oldToEndOfGeneration);
			if (toEndOfGeneration != oldToEndOfGeneration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.DEVICE_MODEL__TO_END_OF_GENERATION, oldToEndOfGeneration, toEndOfGeneration));
			}
		}
		return toEndOfGeneration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Util basicGetToEndOfGeneration() {
		return toEndOfGeneration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToEndOfGeneration(Util newToEndOfGeneration) {
		Util oldToEndOfGeneration = toEndOfGeneration;
		toEndOfGeneration = newToEndOfGeneration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DEVICE_MODEL__TO_END_OF_GENERATION, oldToEndOfGeneration, toEndOfGeneration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchiveProperty getToArchivProp() {
		if (toArchivProp != null && toArchivProp.eIsProxy()) {
			InternalEObject oldToArchivProp = (InternalEObject)toArchivProp;
			toArchivProp = (ArchiveProperty)eResolveProxy(oldToArchivProp);
			if (toArchivProp != oldToArchivProp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.DEVICE_MODEL__TO_ARCHIV_PROP, oldToArchivProp, toArchivProp));
			}
		}
		return toArchivProp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchiveProperty basicGetToArchivProp() {
		return toArchivProp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToArchivProp(ArchiveProperty newToArchivProp) {
		ArchiveProperty oldToArchivProp = toArchivProp;
		toArchivProp = newToArchivProp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DEVICE_MODEL__TO_ARCHIV_PROP, oldToArchivProp, toArchivProp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainBase getToInfFromSpread() {
		if (toInfFromSpread != null && toInfFromSpread.eIsProxy()) {
			InternalEObject oldToInfFromSpread = (InternalEObject)toInfFromSpread;
			toInfFromSpread = (MainBase)eResolveProxy(oldToInfFromSpread);
			if (toInfFromSpread != oldToInfFromSpread) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.DEVICE_MODEL__TO_INF_FROM_SPREAD, oldToInfFromSpread, toInfFromSpread));
			}
		}
		return toInfFromSpread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainBase basicGetToInfFromSpread() {
		return toInfFromSpread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToInfFromSpread(MainBase newToInfFromSpread) {
		MainBase oldToInfFromSpread = toInfFromSpread;
		toInfFromSpread = newToInfFromSpread;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.DEVICE_MODEL__TO_INF_FROM_SPREAD, oldToInfFromSpread, toInfFromSpread));
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
	public String CheckConstraints() {
		return "";
		
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
		return Assembly();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String TheEnd() {
		String dir = generatedDir + "/" + Assembly();
		Util utils = BaseFactoryImpl.eINSTANCE.createUtil();
		utils.RemoveLinesFromFile(dir + "/src", Assembly() + "Base.cpp", 1);
		utils.RemoveLinesFromFile(dir + "/include", Assembly() + "Base.h", 1);
		utils.RemoveLinesFromFile(dir + "/idl", Assembly() + "Base.idl", 1);
		utils.RemoveLinesFromFile(dir + "/idl", Assembly() + "Add.sql", 1);
		utils.RemoveLinesFromFile(dir + "/doc", Assembly() + ".xml", 1);
		utils.RemoveLinesFromFile(dir + "/doc", Assembly() + "Component.xml", 1);
		utils.RemoveLinesFromFile(dir + "/config/CDB/schemas", Assembly() + "Base.xsd", 1);
		utils.RemoveLinesFromFile(dir + "/config", "TMCDB" + Assembly() + "Add.xml", 1);
		utils.RemoveLinesFromFile(dir + "/src/CCL", Assembly() + "Base.py", 1);
		utils.RemoveLinesFromFile(dir + "/src/CCL", "__init__.py", 1);
		System.out.println("Code generation for " + deviceName + " done.");
		return "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkIfFileExists(final String fileName) {
		java.io.File f = new java.io.File(fileName);
		if(f.exists() == true){
		            return true;
		  }else{
		            return false;
		          }
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkIfFileExists(final String directory, final String fileName) {
		if(directory.isEmpty() == false){
		            return checkIfFileExists(directory + "/" + fileName);
		        } else{
		            return checkIfFileExists(fileName);
		                }
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkIfDeviceFileExists(final String directory, final String localFileName) {
		String fileName = getDeviceDir() + "/" + directory + "/" + Assembly() + localFileName;
		        return checkIfFileExists(fileName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkIfTestFileExists(final String directory, final String localFileName) {
		String fileName = getDeviceDir() + "/" + directory + "/Test" + Assembly() + localFileName;
		        return checkIfFileExists(fileName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkIfCvsignoreFileExists(final String directory) {
		String fileName = getDeviceDir() + "/" + directory + "/.cvsignore";
		        return checkIfFileExists(fileName);
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
	public MonitorPoint getMonitorPoint(final String fullName) {
		for(int i = 0; i < monitorPoints.getResources().size(); i++){
			MonitorPoint mp = (MonitorPoint) monitorPoints.getResources().get(i);
		      if(mp.FullName().equals(fullName))
				      return mp;
			}
				return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlPoint getControlPoint(final String fullName) {
		for (int i = 0; i < controlPoints.getResources().size(); i++) {
			 ControlPoint cp = (ControlPoint) controlPoints.getResources().get(i);
			 if (cp.FullName().equals(fullName))
				         return cp;
			 }
				  return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Assembly() {
		return main.Assembly();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Extends() {
		return main.Extends();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DeviceName() {
		return main.DeviceName();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Description() {
		return main.Description();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DescriptionAsString() {
		return main.DescriptionAsString();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String ICD() {
		return main.ICD();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String ICDDate() {
		return main.ICDDate();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String ICDDateAsDatabaseDate() {
		return main.ICDDateAsDatabaseDate();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String ICDDateAsArrayTime() {
		return main.ICDDateAsArrayTime();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceSet Notes() {
		return notes;
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
			case BasePackage.DEVICE_MODEL__TO_ARCHIVE_INDEX:
				if (resolve) return getToArchiveIndex();
				return basicGetToArchiveIndex();
			case BasePackage.DEVICE_MODEL__TO_CONT_POINTS:
				if (resolve) return getToContPoints();
				return basicGetToContPoints();
			case BasePackage.DEVICE_MODEL__TO_MONI_POINTS:
				if (resolve) return getToMoniPoints();
				return basicGetToMoniPoints();
			case BasePackage.DEVICE_MODEL__TO_END_OF_GENERATION:
				if (resolve) return getToEndOfGeneration();
				return basicGetToEndOfGeneration();
			case BasePackage.DEVICE_MODEL__TO_ARCHIV_PROP:
				if (resolve) return getToArchivProp();
				return basicGetToArchivProp();
			case BasePackage.DEVICE_MODEL__TO_INF_FROM_SPREAD:
				if (resolve) return getToInfFromSpread();
				return basicGetToInfFromSpread();
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
				setSpreadsheet((String[][][])newValue);
				return;
			case BasePackage.DEVICE_MODEL__MAIN:
				setMain((MainBase)newValue);
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
			case BasePackage.DEVICE_MODEL__TO_ARCHIVE_INDEX:
				setToArchiveIndex((Table)newValue);
				return;
			case BasePackage.DEVICE_MODEL__TO_CONT_POINTS:
				setToContPoints((ControlPoint)newValue);
				return;
			case BasePackage.DEVICE_MODEL__TO_MONI_POINTS:
				setToMoniPoints((MonitorPoint)newValue);
				return;
			case BasePackage.DEVICE_MODEL__TO_END_OF_GENERATION:
				setToEndOfGeneration((Util)newValue);
				return;
			case BasePackage.DEVICE_MODEL__TO_ARCHIV_PROP:
				setToArchivProp((ArchiveProperty)newValue);
				return;
			case BasePackage.DEVICE_MODEL__TO_INF_FROM_SPREAD:
				setToInfFromSpread((MainBase)newValue);
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
				setMain(MAIN_EDEFAULT);
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
			case BasePackage.DEVICE_MODEL__TO_ARCHIVE_INDEX:
				setToArchiveIndex((Table)null);
				return;
			case BasePackage.DEVICE_MODEL__TO_CONT_POINTS:
				setToContPoints((ControlPoint)null);
				return;
			case BasePackage.DEVICE_MODEL__TO_MONI_POINTS:
				setToMoniPoints((MonitorPoint)null);
				return;
			case BasePackage.DEVICE_MODEL__TO_END_OF_GENERATION:
				setToEndOfGeneration((Util)null);
				return;
			case BasePackage.DEVICE_MODEL__TO_ARCHIV_PROP:
				setToArchivProp((ArchiveProperty)null);
				return;
			case BasePackage.DEVICE_MODEL__TO_INF_FROM_SPREAD:
				setToInfFromSpread((MainBase)null);
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
				return MAIN_EDEFAULT == null ? main != null : !MAIN_EDEFAULT.equals(main);
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
			case BasePackage.DEVICE_MODEL__TO_ARCHIVE_INDEX:
				return toArchiveIndex != null;
			case BasePackage.DEVICE_MODEL__TO_CONT_POINTS:
				return toContPoints != null;
			case BasePackage.DEVICE_MODEL__TO_MONI_POINTS:
				return toMoniPoints != null;
			case BasePackage.DEVICE_MODEL__TO_END_OF_GENERATION:
				return toEndOfGeneration != null;
			case BasePackage.DEVICE_MODEL__TO_ARCHIV_PROP:
				return toArchivProp != null;
			case BasePackage.DEVICE_MODEL__TO_INF_FROM_SPREAD:
				return toInfFromSpread != null;
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
