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

import java.util.List;

import alma.control.datamodel.meta.amb.AmbFactory;
import alma.control.datamodel.meta.amb.AmbPackage;
import alma.control.datamodel.meta.amb.Archive;
import alma.control.datamodel.meta.amb.Control;
import alma.control.datamodel.meta.amb.DeviceModel;
import alma.control.datamodel.meta.amb.GenericMonitorPoints;
import alma.control.datamodel.meta.amb.Main;
import alma.control.datamodel.meta.amb.Monitor;

import alma.control.datamodel.meta.base.BaseFactory;
import alma.control.datamodel.meta.base.Note;
import alma.control.datamodel.meta.base.SpreadsheetParser;
import alma.control.datamodel.meta.base.SpreadsheetValidator;
import alma.control.datamodel.meta.base.Table;
import alma.control.datamodel.meta.base.Util;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.DeviceModelImpl#getObtainMain <em>Obtain Main</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.DeviceModelImpl#getObtainMonitorPoints <em>Obtain Monitor Points</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.DeviceModelImpl#getObtainArchiveProperties <em>Obtain Archive Properties</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.DeviceModelImpl#getObtainControlPoints <em>Obtain Control Points</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.DeviceModelImpl#getParserSpreadsheet <em>Parser Spreadsheet</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.DeviceModelImpl#getValidateSpreadsheet <em>Validate Spreadsheet</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.DeviceModelImpl#getGenericMonitorPoints <em>Generic Monitor Points</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.DeviceModelImpl#getNotess <em>Notess</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.DeviceModelImpl#getUtilDT <em>Util DT</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.DeviceModelImpl#getTableDT <em>Table DT</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceModelImpl extends alma.control.datamodel.meta.base.impl.DeviceModelImpl implements DeviceModel {
	/**
	 * The cached value of the '{@link #getObtainMain() <em>Obtain Main</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObtainMain()
	 * @generated
	 * @ordered
	 */
	protected Main obtainMain;

	/**
	 * The cached value of the '{@link #getObtainMonitorPoints() <em>Obtain Monitor Points</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObtainMonitorPoints()
	 * @generated
	 * @ordered
	 */
	protected Monitor obtainMonitorPoints;

	/**
	 * The cached value of the '{@link #getObtainArchiveProperties() <em>Obtain Archive Properties</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObtainArchiveProperties()
	 * @generated
	 * @ordered
	 */
	protected Archive obtainArchiveProperties;

	/**
	 * The cached value of the '{@link #getObtainControlPoints() <em>Obtain Control Points</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObtainControlPoints()
	 * @generated
	 * @ordered
	 */
	protected Control obtainControlPoints;

	/**
	 * The cached value of the '{@link #getParserSpreadsheet() <em>Parser Spreadsheet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParserSpreadsheet()
	 * @generated
	 * @ordered
	 */
	protected SpreadsheetParser parserSpreadsheet;

	/**
	 * The cached value of the '{@link #getValidateSpreadsheet() <em>Validate Spreadsheet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidateSpreadsheet()
	 * @generated
	 * @ordered
	 */
	protected SpreadsheetValidator validateSpreadsheet;

	/**
	 * The cached value of the '{@link #getGenericMonitorPoints() <em>Generic Monitor Points</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericMonitorPoints()
	 * @generated
	 * @ordered
	 */
	protected GenericMonitorPoints genericMonitorPoints;

	/**
	 * The cached value of the '{@link #getNotess() <em>Notess</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotess()
	 * @generated
	 * @ordered
	 */
	protected Note notess;

	/**
	 * The default value of the '{@link #getUtilDT() <em>Util DT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilDT()
	 * @generated
	 * @ordered
	 */
	protected static final Util UTIL_DT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUtilDT() <em>Util DT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilDT()
	 * @generated
	 * @ordered
	 */
	protected Util utilDT = UTIL_DT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTableDT() <em>Table DT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableDT()
	 * @generated
	 * @ordered
	 */
	protected static final Table TABLE_DT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTableDT() <em>Table DT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableDT()
	 * @generated
	 * @ordered
	 */
	protected Table tableDT = TABLE_DT_EDEFAULT;

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
		return AmbPackage.Literals.DEVICE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Main getObtainMain() {
		if (obtainMain != null && obtainMain.eIsProxy()) {
			InternalEObject oldObtainMain = (InternalEObject)obtainMain;
			obtainMain = (Main)eResolveProxy(oldObtainMain);
			if (obtainMain != oldObtainMain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL__OBTAIN_MAIN, oldObtainMain, obtainMain));
			}
		}
		return obtainMain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Main basicGetObtainMain() {
		return obtainMain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObtainMain(Main newObtainMain) {
		Main oldObtainMain = obtainMain;
		obtainMain = newObtainMain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__OBTAIN_MAIN, oldObtainMain, obtainMain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Monitor getObtainMonitorPoints() {
		if (obtainMonitorPoints != null && obtainMonitorPoints.eIsProxy()) {
			InternalEObject oldObtainMonitorPoints = (InternalEObject)obtainMonitorPoints;
			obtainMonitorPoints = (Monitor)eResolveProxy(oldObtainMonitorPoints);
			if (obtainMonitorPoints != oldObtainMonitorPoints) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL__OBTAIN_MONITOR_POINTS, oldObtainMonitorPoints, obtainMonitorPoints));
			}
		}
		return obtainMonitorPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Monitor basicGetObtainMonitorPoints() {
		return obtainMonitorPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObtainMonitorPoints(Monitor newObtainMonitorPoints) {
		Monitor oldObtainMonitorPoints = obtainMonitorPoints;
		obtainMonitorPoints = newObtainMonitorPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__OBTAIN_MONITOR_POINTS, oldObtainMonitorPoints, obtainMonitorPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Archive getObtainArchiveProperties() {
		if (obtainArchiveProperties != null && obtainArchiveProperties.eIsProxy()) {
			InternalEObject oldObtainArchiveProperties = (InternalEObject)obtainArchiveProperties;
			obtainArchiveProperties = (Archive)eResolveProxy(oldObtainArchiveProperties);
			if (obtainArchiveProperties != oldObtainArchiveProperties) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL__OBTAIN_ARCHIVE_PROPERTIES, oldObtainArchiveProperties, obtainArchiveProperties));
			}
		}
		return obtainArchiveProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Archive basicGetObtainArchiveProperties() {
		return obtainArchiveProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObtainArchiveProperties(Archive newObtainArchiveProperties) {
		Archive oldObtainArchiveProperties = obtainArchiveProperties;
		obtainArchiveProperties = newObtainArchiveProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__OBTAIN_ARCHIVE_PROPERTIES, oldObtainArchiveProperties, obtainArchiveProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Control getObtainControlPoints() {
		if (obtainControlPoints != null && obtainControlPoints.eIsProxy()) {
			InternalEObject oldObtainControlPoints = (InternalEObject)obtainControlPoints;
			obtainControlPoints = (Control)eResolveProxy(oldObtainControlPoints);
			if (obtainControlPoints != oldObtainControlPoints) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL__OBTAIN_CONTROL_POINTS, oldObtainControlPoints, obtainControlPoints));
			}
		}
		return obtainControlPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Control basicGetObtainControlPoints() {
		return obtainControlPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObtainControlPoints(Control newObtainControlPoints) {
		Control oldObtainControlPoints = obtainControlPoints;
		obtainControlPoints = newObtainControlPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__OBTAIN_CONTROL_POINTS, oldObtainControlPoints, obtainControlPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetParser getParserSpreadsheet() {
		if (parserSpreadsheet != null && parserSpreadsheet.eIsProxy()) {
			InternalEObject oldParserSpreadsheet = (InternalEObject)parserSpreadsheet;
			parserSpreadsheet = (SpreadsheetParser)eResolveProxy(oldParserSpreadsheet);
			if (parserSpreadsheet != oldParserSpreadsheet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL__PARSER_SPREADSHEET, oldParserSpreadsheet, parserSpreadsheet));
			}
		}
		return parserSpreadsheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetParser basicGetParserSpreadsheet() {
		return parserSpreadsheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParserSpreadsheet(SpreadsheetParser newParserSpreadsheet) {
		SpreadsheetParser oldParserSpreadsheet = parserSpreadsheet;
		parserSpreadsheet = newParserSpreadsheet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__PARSER_SPREADSHEET, oldParserSpreadsheet, parserSpreadsheet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetValidator getValidateSpreadsheet() {
		if (validateSpreadsheet != null && validateSpreadsheet.eIsProxy()) {
			InternalEObject oldValidateSpreadsheet = (InternalEObject)validateSpreadsheet;
			validateSpreadsheet = (SpreadsheetValidator)eResolveProxy(oldValidateSpreadsheet);
			if (validateSpreadsheet != oldValidateSpreadsheet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL__VALIDATE_SPREADSHEET, oldValidateSpreadsheet, validateSpreadsheet));
			}
		}
		return validateSpreadsheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetValidator basicGetValidateSpreadsheet() {
		return validateSpreadsheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidateSpreadsheet(SpreadsheetValidator newValidateSpreadsheet) {
		SpreadsheetValidator oldValidateSpreadsheet = validateSpreadsheet;
		validateSpreadsheet = newValidateSpreadsheet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__VALIDATE_SPREADSHEET, oldValidateSpreadsheet, validateSpreadsheet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericMonitorPoints getGenericMonitorPoints() {
		if (genericMonitorPoints != null && genericMonitorPoints.eIsProxy()) {
			InternalEObject oldGenericMonitorPoints = (InternalEObject)genericMonitorPoints;
			genericMonitorPoints = (GenericMonitorPoints)eResolveProxy(oldGenericMonitorPoints);
			if (genericMonitorPoints != oldGenericMonitorPoints) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL__GENERIC_MONITOR_POINTS, oldGenericMonitorPoints, genericMonitorPoints));
			}
		}
		return genericMonitorPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericMonitorPoints basicGetGenericMonitorPoints() {
		return genericMonitorPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenericMonitorPoints(GenericMonitorPoints newGenericMonitorPoints) {
		GenericMonitorPoints oldGenericMonitorPoints = genericMonitorPoints;
		genericMonitorPoints = newGenericMonitorPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__GENERIC_MONITOR_POINTS, oldGenericMonitorPoints, genericMonitorPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Note getNotess() {
		if (notess != null && notess.eIsProxy()) {
			InternalEObject oldNotess = (InternalEObject)notess;
			notess = (Note)eResolveProxy(oldNotess);
			if (notess != oldNotess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL__NOTESS, oldNotess, notess));
			}
		}
		return notess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Note basicGetNotess() {
		return notess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotess(Note newNotess) {
		Note oldNotess = notess;
		notess = newNotess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__NOTESS, oldNotess, notess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Util getUtilDT() {
		return utilDT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtilDT(Util newUtilDT) {
		Util oldUtilDT = utilDT;
		utilDT = newUtilDT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__UTIL_DT, oldUtilDT, utilDT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getTableDT() {
		return tableDT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableDT(Table newTableDT) {
		Table oldTableDT = tableDT;
		tableDT = newTableDT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__TABLE_DT, oldTableDT, tableDT));
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
	public boolean IsGeneratedAlt() {
		return generateAlt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Parent() {
		return ((Main)main).Parent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Cardinality() {
		return ((Main)main).Cardinality();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String NodeAddress() {
		return ((Main)main).NodeAddress();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Channel() {
		return ((Main)main).Channel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String BaseAddress() {
		return ((Main)main).BaseAddress();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean GenericMonitorPoints() {
		return ((Main)main).GenericMonitorPoints();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	
	public String CreateModel() {
		// Parse and validate the spreadsheet.
		int i;
		int mainIndex;
		int monitorIndex;
		int controlIndex;
		int archiveIndex;

		// Check if the spreadsheet file is an actual spreadsheet or a
		// "filter" file which is some kind of a filter for a real
		// spreadsheet but inherits from it.
		String xmlFile = spreadsheetDir + "/" + deviceName + "_spreadsheet.";
		String suffix = "filter";
		java.io.File fileExists = new java.io.File(xmlFile + suffix);
		if(fileExists.exists() == false){
			// The blah.filter file does not exist, so assume that the file
			// is an XML file.
			suffix = "xml";
		}
	
		BaseFactory baseFac = BaseFactory.eINSTANCE;
		
		Util util = baseFac.createUtil();
		
		xmlFile += suffix;		
		String xml = baseFac.createSpreadsheetParser().getSpreadsheet(spreadsheetDir, deviceName + "_spreadsheet." + suffix);		
		String xsdFile = util.getInstallDir()+ "/config/schemas/" + busType.toLowerCase() + "/Workbook.xsd";

		SpreadsheetParser p = baseFac.createSpreadsheetParser(xml);
		p.setXSD(xsdFile);
		spreadsheet = p.getWorksheets();
		if (!p.isReference() && !baseFac.createSpreadsheetValidator().validate(xmlFile, xsdFile)) {
			String s = "Spreadsheet: " + deviceName + "_spreadsheet." + suffix + " is not a valid spreadsheet.";
			throw new RuntimeException(s);
		}
		System.out.println("Spreadsheet " + deviceName + "_spreadsheet." + " has been validated.");

		Table tab = baseFac.createTable();
		
		tab.initialize(spreadsheet);
		mainIndex = tab.getSheetNum("Hardware Device");
		monitorIndex = tab.getSheetNum("Monitor Point");
		controlIndex = tab.getSheetNum("Control Point");
		archiveIndex = tab.getSheetNum("Archive Property");

		AmbFactory ambFac = AmbFactory.eINSTANCE;
		
		if(spreadsheet[mainIndex][2][tab.getColNum(mainIndex,"Generic Monitor Points")].equals("yes")){
			String[][][] spreadsheetWithGenericPointsAdded;
			spreadsheetWithGenericPointsAdded = ambFac.createGenericMonitorPoints().getDeviceWorksheetWithGenericPointsAdded(spreadsheet);
			spreadsheet = spreadsheetWithGenericPointsAdded;
		}

		
		// Get the Main
		main = ambFac.createMain(spreadsheet[mainIndex][2]);
		//main.eAdapters().notify();
		//main.setMetaEnvironment(this.getMetaEnvironment());

		// Get the Notes
		notes = new ResourceSetImpl();
		for (i = 3; i < spreadsheet[mainIndex].length; i++) {
			//note.setMetaEnvironment(this.getMetaEnvironment());
			notess.setNote(spreadsheet[mainIndex][i][descriptionIndex]);
			notes.getResources().add((Resource) notess);
		}

		// Get the monitor points
		Monitor mparent = ambFac.createMonitor();
		mparent = null;
		monitorPoints = new ResourceSetImpl();
		for (i = 2; i < spreadsheet[monitorIndex].length; i++) {
			if(spreadsheet[monitorIndex][i].length == 0)
				break;
			Monitor mp = ambFac.createMonitor();
			String[] row = spreadsheet[monitorIndex][i];
			if(!spreadsheet[monitorIndex][i][1].startsWith(tab.getDepChar())){
				mp = ambFac.createMonitor(row, null);
				mparent = mp;
			}
			else{
				mp = ambFac.createMonitor(row, mparent);
				mparent.addDependent(mp);
			}
			mp.setArchive(getArchive(mp.FullName()));
			//mp.setMetaEnvironment(this.getMetaEnvironment());
			monitorPoints.getResources().add(mp);
		}

		// Define undefined dependent monitor points for sequence properties
		List<Resource> list2 = (List<Resource>) monitorPoints;
		Monitor[] list = (Monitor[])list2.toArray(new Monitor[0]);
		for (Monitor mp : list) {
			if (mp.isWorldDataArray() && !mp.hasDependents())
				for (i=0; i < Integer.parseInt(mp.NumberItemsWorldData()); i++) {
					String[] row = {
							mp.Assembly(),
							"^" + mp.MPName() + "_" + Integer.toString(i),
							mp.RCA(),
							mp.RawDataType(),
							mp.TeRelatedCell(),
							mp.WorldDataType(),
							mp.DataUnits(),
							"none",
							"none",
							"none",
							"none",
							"none",
							mp.ErrorCondition(),
							mp.ErrorSeverity(),
							mp.ErrorAction(),
							mp.Mode(),
							"yes",
							"no",
							mp.CanBeInvalid(),
							mp.Description() + " (dependent monitor point)"
					};
					Monitor dep = ambFac.createMonitor(row, (Resource) mp);
					mp.addDependent(dep);

					dep.setArchive(getArchive(dep.FullName()));
					//dep.setMetaEnvironment(this.getMetaEnvironment());
					monitorPoints.getResources().add((Resource) dep);
				}
		}

		// Get the control points
		Control cparent = ambFac.createControl();
		cparent = null;
		controlPoints = new ResourceSetImpl();
		for (i = 2; i < spreadsheet[controlIndex].length; ++i) {
			if(spreadsheet[controlIndex][i].length == 0)
				break;
			Control cp;
			String[] row = spreadsheet[controlIndex][i];
			if(!spreadsheet[controlIndex][i][1].startsWith(tab.getDepChar()))
			{
				cp = ambFac.createControl(row, null);
				cparent = cp;
			}
			else{
				cp = ambFac.createControl(row, cparent);
				cparent.addDependent(cp);
			}
			cp.setArchive(getArchive(cp.FullName()));
			//cp.setMetaEnvironment(this.getMetaEnvironment());
			controlPoints.getResources().add(cp);
		}

		//Get the Archive Properties
		archiveProperties = new ResourceSetImpl();
		for(i = 2; i < spreadsheet[archiveIndex].length; i++) {
			if(spreadsheet[archiveIndex][i].length == 0)
				break;
			Archive ap;
			String[] row = spreadsheet[archiveIndex][i];
			ap = ambFac.createArchive(row);
			alma.control.datamodel.meta.base.MonitorPoint mp = getMonitorPoint(ap.RefersTo());
			if (mp != null)
				ap.setMp(mp);
			alma.control.datamodel.meta.base.ControlPoint cp = getControlPoint(ap.RefersTo());
			if (cp != null)
				ap.setCp(cp);
			archiveProperties.getResources().add((Resource) ap);
		}

		System.out.println("DeviceModel: Initialization complete.");
		return "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String TheEnd() {
		Util util = BaseFactory.eINSTANCE.createUtil();
		String dir = generatedDir + "/" + Assembly();
		util.RemoveLinesFromFile(dir + "/doc", Assembly() + ".html", 1);
		util.RemoveLinesFromFile(dir + "/idl", Assembly() + "Add.sql", 1);
		util.RemoveLinesFromFile(dir + "/include", Assembly() + "HWSimBase.h", 1);
		util.RemoveLinesFromFile(dir + "/src", Assembly() + "HWSimBase.cpp", 1);
		util.RemoveLinesFromFile(dir + "/include", Assembly() + "CompSimBase.h", 1);
		util.RemoveLinesFromFile(dir + "/src", Assembly() + "CompSimBase.cpp", 1);
		util.RemoveLinesFromFile(dir + "/idl", Assembly() + "CompSimBase.idl", 1);
		util.RemoveLinesFromFile(dir + "/test", "Test" + Assembly() + "HWSimImpl.cpp", 1);
		util.RemoveLinesFromFile(dir + "/test", "Test" + Assembly() + "AmbDeviceInt.cpp", 1);
			if (!isMonitorDBOnly()) {
				if (isGenerateAlt()) {
					util.RemoveLinesFromFile(dir + "/../ALT/", Assembly() + ".makefile", 1);
					util.RemoveLinesFromFile(dir + "/../ALT/", Assembly() + "Impl.idl", 1);
					util.RemoveLinesFromFile(dir + "/../ALT/", Assembly() + "Impl.h", 1);
					util.RemoveLinesFromFile(dir + "/../ALT/", Assembly() + "Impl.cpp", 1);
				}
				super.TheEnd();
			} else 
				System.out.println("Code generation for " + deviceName + " done.");
			return "";
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmbPackage.DEVICE_MODEL__OBTAIN_MAIN:
				if (resolve) return getObtainMain();
				return basicGetObtainMain();
			case AmbPackage.DEVICE_MODEL__OBTAIN_MONITOR_POINTS:
				if (resolve) return getObtainMonitorPoints();
				return basicGetObtainMonitorPoints();
			case AmbPackage.DEVICE_MODEL__OBTAIN_ARCHIVE_PROPERTIES:
				if (resolve) return getObtainArchiveProperties();
				return basicGetObtainArchiveProperties();
			case AmbPackage.DEVICE_MODEL__OBTAIN_CONTROL_POINTS:
				if (resolve) return getObtainControlPoints();
				return basicGetObtainControlPoints();
			case AmbPackage.DEVICE_MODEL__PARSER_SPREADSHEET:
				if (resolve) return getParserSpreadsheet();
				return basicGetParserSpreadsheet();
			case AmbPackage.DEVICE_MODEL__VALIDATE_SPREADSHEET:
				if (resolve) return getValidateSpreadsheet();
				return basicGetValidateSpreadsheet();
			case AmbPackage.DEVICE_MODEL__GENERIC_MONITOR_POINTS:
				if (resolve) return getGenericMonitorPoints();
				return basicGetGenericMonitorPoints();
			case AmbPackage.DEVICE_MODEL__NOTESS:
				if (resolve) return getNotess();
				return basicGetNotess();
			case AmbPackage.DEVICE_MODEL__UTIL_DT:
				return getUtilDT();
			case AmbPackage.DEVICE_MODEL__TABLE_DT:
				return getTableDT();
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
			case AmbPackage.DEVICE_MODEL__OBTAIN_MAIN:
				setObtainMain((Main)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__OBTAIN_MONITOR_POINTS:
				setObtainMonitorPoints((Monitor)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__OBTAIN_ARCHIVE_PROPERTIES:
				setObtainArchiveProperties((Archive)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__OBTAIN_CONTROL_POINTS:
				setObtainControlPoints((Control)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__PARSER_SPREADSHEET:
				setParserSpreadsheet((SpreadsheetParser)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__VALIDATE_SPREADSHEET:
				setValidateSpreadsheet((SpreadsheetValidator)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__GENERIC_MONITOR_POINTS:
				setGenericMonitorPoints((GenericMonitorPoints)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__NOTESS:
				setNotess((Note)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__UTIL_DT:
				setUtilDT((Util)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__TABLE_DT:
				setTableDT((Table)newValue);
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
			case AmbPackage.DEVICE_MODEL__OBTAIN_MAIN:
				setObtainMain((Main)null);
				return;
			case AmbPackage.DEVICE_MODEL__OBTAIN_MONITOR_POINTS:
				setObtainMonitorPoints((Monitor)null);
				return;
			case AmbPackage.DEVICE_MODEL__OBTAIN_ARCHIVE_PROPERTIES:
				setObtainArchiveProperties((Archive)null);
				return;
			case AmbPackage.DEVICE_MODEL__OBTAIN_CONTROL_POINTS:
				setObtainControlPoints((Control)null);
				return;
			case AmbPackage.DEVICE_MODEL__PARSER_SPREADSHEET:
				setParserSpreadsheet((SpreadsheetParser)null);
				return;
			case AmbPackage.DEVICE_MODEL__VALIDATE_SPREADSHEET:
				setValidateSpreadsheet((SpreadsheetValidator)null);
				return;
			case AmbPackage.DEVICE_MODEL__GENERIC_MONITOR_POINTS:
				setGenericMonitorPoints((GenericMonitorPoints)null);
				return;
			case AmbPackage.DEVICE_MODEL__NOTESS:
				setNotess((Note)null);
				return;
			case AmbPackage.DEVICE_MODEL__UTIL_DT:
				setUtilDT(UTIL_DT_EDEFAULT);
				return;
			case AmbPackage.DEVICE_MODEL__TABLE_DT:
				setTableDT(TABLE_DT_EDEFAULT);
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
			case AmbPackage.DEVICE_MODEL__OBTAIN_MAIN:
				return obtainMain != null;
			case AmbPackage.DEVICE_MODEL__OBTAIN_MONITOR_POINTS:
				return obtainMonitorPoints != null;
			case AmbPackage.DEVICE_MODEL__OBTAIN_ARCHIVE_PROPERTIES:
				return obtainArchiveProperties != null;
			case AmbPackage.DEVICE_MODEL__OBTAIN_CONTROL_POINTS:
				return obtainControlPoints != null;
			case AmbPackage.DEVICE_MODEL__PARSER_SPREADSHEET:
				return parserSpreadsheet != null;
			case AmbPackage.DEVICE_MODEL__VALIDATE_SPREADSHEET:
				return validateSpreadsheet != null;
			case AmbPackage.DEVICE_MODEL__GENERIC_MONITOR_POINTS:
				return genericMonitorPoints != null;
			case AmbPackage.DEVICE_MODEL__NOTESS:
				return notess != null;
			case AmbPackage.DEVICE_MODEL__UTIL_DT:
				return UTIL_DT_EDEFAULT == null ? utilDT != null : !UTIL_DT_EDEFAULT.equals(utilDT);
			case AmbPackage.DEVICE_MODEL__TABLE_DT:
				return TABLE_DT_EDEFAULT == null ? tableDT != null : !TABLE_DT_EDEFAULT.equals(tableDT);
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
		result.append(" (UtilDT: ");
		result.append(utilDT);
		result.append(", TableDT: ");
		result.append(tableDT);
		result.append(')');
		return result.toString();
	}

} //DeviceModelImpl
