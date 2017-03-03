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
package alma.control.datamodel.meta.eth.impl;

import alma.control.datamodel.meta.base.BaseFactory;
import alma.control.datamodel.meta.base.MainBase;
import alma.control.datamodel.meta.base.Note;
import alma.control.datamodel.meta.base.SpreadsheetParser;
import alma.control.datamodel.meta.base.SpreadsheetValidator;

import alma.control.datamodel.meta.eth.Archive;
import alma.control.datamodel.meta.eth.Control;
import alma.control.datamodel.meta.eth.DeviceModel;
import alma.control.datamodel.meta.eth.EthFactory;
import alma.control.datamodel.meta.eth.EthPackage;
import alma.control.datamodel.meta.eth.Monitor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
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
 *   <li>{@link alma.control.datamodel.meta.eth.impl.DeviceModelImpl#getInfoDevMain <em>Info Dev Main</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.eth.impl.DeviceModelImpl#getObtainControlPoints <em>Obtain Control Points</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.eth.impl.DeviceModelImpl#getObtainMonitorPoints <em>Obtain Monitor Points</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.eth.impl.DeviceModelImpl#getObtainArchiveProperties <em>Obtain Archive Properties</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.eth.impl.DeviceModelImpl#getValidateSpreadsheet <em>Validate Spreadsheet</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.eth.impl.DeviceModelImpl#getParserSpreadsheet <em>Parser Spreadsheet</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.eth.impl.DeviceModelImpl#getNotess <em>Notess</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceModelImpl extends alma.control.datamodel.meta.base.impl.DeviceModelImpl implements DeviceModel {
	/**
	 * The cached value of the '{@link #getInfoDevMain() <em>Info Dev Main</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfoDevMain()
	 * @generated
	 * @ordered
	 */
	protected MainBase infoDevMain;

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
	 * The cached value of the '{@link #getValidateSpreadsheet() <em>Validate Spreadsheet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidateSpreadsheet()
	 * @generated
	 * @ordered
	 */
	protected SpreadsheetValidator validateSpreadsheet;

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
	 * The cached value of the '{@link #getNotess() <em>Notess</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotess()
	 * @generated
	 * @ordered
	 */
	protected Note notess;

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
		return EthPackage.Literals.DEVICE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainBase getInfoDevMain() {
		if (infoDevMain != null && infoDevMain.eIsProxy()) {
			InternalEObject oldInfoDevMain = (InternalEObject)infoDevMain;
			infoDevMain = (MainBase)eResolveProxy(oldInfoDevMain);
			if (infoDevMain != oldInfoDevMain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EthPackage.DEVICE_MODEL__INFO_DEV_MAIN, oldInfoDevMain, infoDevMain));
			}
		}
		return infoDevMain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainBase basicGetInfoDevMain() {
		return infoDevMain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfoDevMain(MainBase newInfoDevMain) {
		MainBase oldInfoDevMain = infoDevMain;
		infoDevMain = newInfoDevMain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EthPackage.DEVICE_MODEL__INFO_DEV_MAIN, oldInfoDevMain, infoDevMain));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EthPackage.DEVICE_MODEL__OBTAIN_CONTROL_POINTS, oldObtainControlPoints, obtainControlPoints));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EthPackage.DEVICE_MODEL__OBTAIN_CONTROL_POINTS, oldObtainControlPoints, obtainControlPoints));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EthPackage.DEVICE_MODEL__OBTAIN_MONITOR_POINTS, oldObtainMonitorPoints, obtainMonitorPoints));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EthPackage.DEVICE_MODEL__OBTAIN_MONITOR_POINTS, oldObtainMonitorPoints, obtainMonitorPoints));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EthPackage.DEVICE_MODEL__OBTAIN_ARCHIVE_PROPERTIES, oldObtainArchiveProperties, obtainArchiveProperties));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EthPackage.DEVICE_MODEL__OBTAIN_ARCHIVE_PROPERTIES, oldObtainArchiveProperties, obtainArchiveProperties));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EthPackage.DEVICE_MODEL__VALIDATE_SPREADSHEET, oldValidateSpreadsheet, validateSpreadsheet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EthPackage.DEVICE_MODEL__VALIDATE_SPREADSHEET, oldValidateSpreadsheet, validateSpreadsheet));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EthPackage.DEVICE_MODEL__PARSER_SPREADSHEET, oldParserSpreadsheet, parserSpreadsheet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EthPackage.DEVICE_MODEL__PARSER_SPREADSHEET, oldParserSpreadsheet, parserSpreadsheet));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EthPackage.DEVICE_MODEL__NOTESS, oldNotess, notess));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EthPackage.DEVICE_MODEL__NOTESS, oldNotess, notess));
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
		if(fileExists.exists() == false)
		{
			// The blah.filter file does not exist, so assume that the file
			// is an XML file.
			suffix = "xml";
		}

		xmlFile += suffix;
		String xml = parserSpreadsheet.getSpreadsheet(spreadsheetDir, deviceName + "_spreadsheet." + suffix);
		String xsdFile = utils.getInstallDir() + "/config/schemas/" + busType.toLowerCase() + "/Workbook.xsd";

		SpreadsheetParser p = BaseFactory.eINSTANCE.createSpreadsheetParser(xml);
		spreadsheet = p.getWorksheets();

		if (!validateSpreadsheet.validate(xmlFile, xsdFile)) {
			String s = "Spreadsheet " + deviceName + "_spreadsheet." + suffix + " is not a valid spreadsheet.";
			throw new RuntimeException(s);
		}
		System.out.println("Spreadsheet " + deviceName + " has been validated.");

		tables.initialize(spreadsheet);
		
		// Get the Main..
		mainIndex = tables.getSheetNum("Hardware Device");
		monitorIndex = tables.getSheetNum("Monitor Point");
		controlIndex = tables.getSheetNum("Control Point");
		archiveIndex = tables.getSheetNum("Archive Property");
		
		EthFactory ethFac = EthFactory.eINSTANCE;
		
		main = ethFac.createMain(spreadsheet[mainIndex][2]);
		//main.setMetaEnvironment(this.getMetaEnvironment());
		
		// Get the Notes
		notes = new ResourceSetImpl();
		for (i = 3; i < spreadsheet[mainIndex].length; ++i) {
			//note.setMetaEnvironment(this.getMetaEnvironment());
			notess.setNote(spreadsheet[mainIndex][i][descriptionIndex]);
			notes.getResources().add((Resource) notess);
		}
		// Get the monitor points
		Monitor mparent = ethFac.createMonitor();
		mparent = null;
		monitorPoints = new ResourceSetImpl();
		for (i = 2; i < spreadsheet[monitorIndex].length; ++i) {
			if(spreadsheet[monitorIndex][i].length == 0)
				break;
			Monitor mp = ethFac.createMonitor();
			String[] row = spreadsheet[monitorIndex][i];
			if(!spreadsheet[monitorIndex][i][0].startsWith(tables.getDepChar())){
				mp = ethFac.createMonitor(row,null);
				mparent = mp;
			}
			else{
				mp = ethFac.createMonitor(row, mparent);
				mparent.addDependent(mp);
			}
			mp.setArchive(getArchive(mp.FullName()));
			mp.setAssemblyName(main.Assembly());
			//mp.setMetaEnvironment(this.getMetaEnvironment());
			monitorPoints.getResources().add(mp);
		}
		// Get the control points
		Control cparent = ethFac.createControl();
		cparent = null;
		controlPoints = new ResourceSetImpl();
		for (i = 2; i < spreadsheet[controlIndex].length; ++i) {
			if(spreadsheet[controlIndex][i].length == 0)
				break;
			Control cp = ethFac.createControl();
			String[] row = spreadsheet[controlIndex][i];
			if(!spreadsheet[controlIndex][i][0].startsWith(tables.getDepChar()))
			{
				cp = ethFac.createControl(row, null);
				cparent = cp;
			}
			else{
				cp = ethFac.createControl(row, cparent);
				cparent.addDependent(cp);
			}
			cp.setArchive(getArchive(cp.FullName()));
			cp.setAssemblyName(main.Assembly());
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
			ap = ethFac.createArchive(row);
			//ap.setMetaEnvironment(this.getMetaEnvironment());
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
	public String VendorClass() {
		return ((MainImpl)main).VendorClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EthPackage.DEVICE_MODEL__INFO_DEV_MAIN:
				if (resolve) return getInfoDevMain();
				return basicGetInfoDevMain();
			case EthPackage.DEVICE_MODEL__OBTAIN_CONTROL_POINTS:
				if (resolve) return getObtainControlPoints();
				return basicGetObtainControlPoints();
			case EthPackage.DEVICE_MODEL__OBTAIN_MONITOR_POINTS:
				if (resolve) return getObtainMonitorPoints();
				return basicGetObtainMonitorPoints();
			case EthPackage.DEVICE_MODEL__OBTAIN_ARCHIVE_PROPERTIES:
				if (resolve) return getObtainArchiveProperties();
				return basicGetObtainArchiveProperties();
			case EthPackage.DEVICE_MODEL__VALIDATE_SPREADSHEET:
				if (resolve) return getValidateSpreadsheet();
				return basicGetValidateSpreadsheet();
			case EthPackage.DEVICE_MODEL__PARSER_SPREADSHEET:
				if (resolve) return getParserSpreadsheet();
				return basicGetParserSpreadsheet();
			case EthPackage.DEVICE_MODEL__NOTESS:
				if (resolve) return getNotess();
				return basicGetNotess();
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
			case EthPackage.DEVICE_MODEL__INFO_DEV_MAIN:
				setInfoDevMain((MainBase)newValue);
				return;
			case EthPackage.DEVICE_MODEL__OBTAIN_CONTROL_POINTS:
				setObtainControlPoints((Control)newValue);
				return;
			case EthPackage.DEVICE_MODEL__OBTAIN_MONITOR_POINTS:
				setObtainMonitorPoints((Monitor)newValue);
				return;
			case EthPackage.DEVICE_MODEL__OBTAIN_ARCHIVE_PROPERTIES:
				setObtainArchiveProperties((Archive)newValue);
				return;
			case EthPackage.DEVICE_MODEL__VALIDATE_SPREADSHEET:
				setValidateSpreadsheet((SpreadsheetValidator)newValue);
				return;
			case EthPackage.DEVICE_MODEL__PARSER_SPREADSHEET:
				setParserSpreadsheet((SpreadsheetParser)newValue);
				return;
			case EthPackage.DEVICE_MODEL__NOTESS:
				setNotess((Note)newValue);
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
			case EthPackage.DEVICE_MODEL__INFO_DEV_MAIN:
				setInfoDevMain((MainBase)null);
				return;
			case EthPackage.DEVICE_MODEL__OBTAIN_CONTROL_POINTS:
				setObtainControlPoints((Control)null);
				return;
			case EthPackage.DEVICE_MODEL__OBTAIN_MONITOR_POINTS:
				setObtainMonitorPoints((Monitor)null);
				return;
			case EthPackage.DEVICE_MODEL__OBTAIN_ARCHIVE_PROPERTIES:
				setObtainArchiveProperties((Archive)null);
				return;
			case EthPackage.DEVICE_MODEL__VALIDATE_SPREADSHEET:
				setValidateSpreadsheet((SpreadsheetValidator)null);
				return;
			case EthPackage.DEVICE_MODEL__PARSER_SPREADSHEET:
				setParserSpreadsheet((SpreadsheetParser)null);
				return;
			case EthPackage.DEVICE_MODEL__NOTESS:
				setNotess((Note)null);
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
			case EthPackage.DEVICE_MODEL__INFO_DEV_MAIN:
				return infoDevMain != null;
			case EthPackage.DEVICE_MODEL__OBTAIN_CONTROL_POINTS:
				return obtainControlPoints != null;
			case EthPackage.DEVICE_MODEL__OBTAIN_MONITOR_POINTS:
				return obtainMonitorPoints != null;
			case EthPackage.DEVICE_MODEL__OBTAIN_ARCHIVE_PROPERTIES:
				return obtainArchiveProperties != null;
			case EthPackage.DEVICE_MODEL__VALIDATE_SPREADSHEET:
				return validateSpreadsheet != null;
			case EthPackage.DEVICE_MODEL__PARSER_SPREADSHEET:
				return parserSpreadsheet != null;
			case EthPackage.DEVICE_MODEL__NOTESS:
				return notess != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceModelImpl
