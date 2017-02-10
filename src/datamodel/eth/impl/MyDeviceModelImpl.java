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
package datamodel.eth.impl;

import datamodel.base.BaseFactory;
import datamodel.base.MainBase;
import datamodel.base.Note;
import datamodel.base.SpreadsheetParser;
import datamodel.base.SpreadsheetValidator;
import datamodel.base.Table;
import datamodel.base.Util;

import datamodel.eth.ArchiveETH;
import datamodel.eth.ControlETH;
import datamodel.eth.DeviceModel;
import datamodel.eth.EthFactory;
import datamodel.eth.EthPackage;
import datamodel.eth.MonitorETH;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;


public class MyDeviceModelImpl extends datamodel.base.impl.DeviceModelImpl implements DeviceModel {
	
	
	protected MainBase infoDevMain;

	
	protected ControlETH infoControl;

	
	protected MonitorETH infoMonitor;

	
	protected Util toEndEth;

	
	protected ArchiveETH infoArch;

	
	protected Table dataSpreadsheet;

	
	protected Note notesTo;

	
	protected SpreadsheetValidator validateSpreadEth;

	
	protected SpreadsheetParser fromSpreadEth;

	
	public MyDeviceModelImpl() {
		super();
	}

	
	@Override
	protected EClass eStaticClass() {
		return EthPackage.Literals.DEVICE_MODEL;
	}

	
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

	
	public MainBase basicGetInfoDevMain() {
		return infoDevMain;
	}

	
	public void setInfoDevMain(MainBase newInfoDevMain) {
		MainBase oldInfoDevMain = infoDevMain;
		infoDevMain = newInfoDevMain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EthPackage.DEVICE_MODEL__INFO_DEV_MAIN, oldInfoDevMain, infoDevMain));
	}

	
	public ControlETH getInfoControl() {
		if (infoControl != null && infoControl.eIsProxy()) {
			InternalEObject oldInfoControl = (InternalEObject)infoControl;
			infoControl = (ControlETH)eResolveProxy(oldInfoControl);
			if (infoControl != oldInfoControl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EthPackage.DEVICE_MODEL__INFO_CONTROL, oldInfoControl, infoControl));
			}
		}
		return infoControl;
	}

	
	public ControlETH basicGetInfoControl() {
		return infoControl;
	}

	
	public void setInfoControl(ControlETH newInfoControl) {
		ControlETH oldInfoControl = infoControl;
		infoControl = newInfoControl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EthPackage.DEVICE_MODEL__INFO_CONTROL, oldInfoControl, infoControl));
	}

	
	public MonitorETH getInfoMonitor() {
		if (infoMonitor != null && infoMonitor.eIsProxy()) {
			InternalEObject oldInfoMonitor = (InternalEObject)infoMonitor;
			infoMonitor = (MonitorETH)eResolveProxy(oldInfoMonitor);
			if (infoMonitor != oldInfoMonitor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EthPackage.DEVICE_MODEL__INFO_MONITOR, oldInfoMonitor, infoMonitor));
			}
		}
		return infoMonitor;
	}

	
	public MonitorETH basicGetInfoMonitor() {
		return infoMonitor;
	}

	
	public void setInfoMonitor(MonitorETH newInfoMonitor) {
		MonitorETH oldInfoMonitor = infoMonitor;
		infoMonitor = newInfoMonitor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EthPackage.DEVICE_MODEL__INFO_MONITOR, oldInfoMonitor, infoMonitor));
	}

	
	public Util getToEndEth() {
		if (toEndEth != null && toEndEth.eIsProxy()) {
			InternalEObject oldToEndEth = (InternalEObject)toEndEth;
			toEndEth = (Util)eResolveProxy(oldToEndEth);
			if (toEndEth != oldToEndEth) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EthPackage.DEVICE_MODEL__TO_END_ETH, oldToEndEth, toEndEth));
			}
		}
		return toEndEth;
	}

	
	public Util basicGetToEndEth() {
		return toEndEth;
	}

	
	public void setToEndEth(Util newToEndEth) {
		Util oldToEndEth = toEndEth;
		toEndEth = newToEndEth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EthPackage.DEVICE_MODEL__TO_END_ETH, oldToEndEth, toEndEth));
	}

	
	public ArchiveETH getInfoArch() {
		if (infoArch != null && infoArch.eIsProxy()) {
			InternalEObject oldInfoArch = (InternalEObject)infoArch;
			infoArch = (ArchiveETH)eResolveProxy(oldInfoArch);
			if (infoArch != oldInfoArch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EthPackage.DEVICE_MODEL__INFO_ARCH, oldInfoArch, infoArch));
			}
		}
		return infoArch;
	}

	
	public ArchiveETH basicGetInfoArch() {
		return infoArch;
	}

	
	public void setInfoArch(ArchiveETH newInfoArch) {
		ArchiveETH oldInfoArch = infoArch;
		infoArch = newInfoArch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EthPackage.DEVICE_MODEL__INFO_ARCH, oldInfoArch, infoArch));
	}

	
	public Table getDataSpreadsheet() {
		if (dataSpreadsheet != null && dataSpreadsheet.eIsProxy()) {
			InternalEObject oldDataSpreadsheet = (InternalEObject)dataSpreadsheet;
			dataSpreadsheet = (Table)eResolveProxy(oldDataSpreadsheet);
			if (dataSpreadsheet != oldDataSpreadsheet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EthPackage.DEVICE_MODEL__DATA_SPREADSHEET, oldDataSpreadsheet, dataSpreadsheet));
			}
		}
		return dataSpreadsheet;
	}

	
	public Table basicGetDataSpreadsheet() {
		return dataSpreadsheet;
	}

	
	public void setDataSpreadsheet(Table newDataSpreadsheet) {
		Table oldDataSpreadsheet = dataSpreadsheet;
		dataSpreadsheet = newDataSpreadsheet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EthPackage.DEVICE_MODEL__DATA_SPREADSHEET, oldDataSpreadsheet, dataSpreadsheet));
	}

	
	public Note getNotesTo() {
		if (notesTo != null && notesTo.eIsProxy()) {
			InternalEObject oldNotesTo = (InternalEObject)notesTo;
			notesTo = (Note)eResolveProxy(oldNotesTo);
			if (notesTo != oldNotesTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EthPackage.DEVICE_MODEL__NOTES_TO, oldNotesTo, notesTo));
			}
		}
		return notesTo;
	}

	
	public Note basicGetNotesTo() {
		return notesTo;
	}

	
	public void setNotesTo(Note newNotesTo) {
		Note oldNotesTo = notesTo;
		notesTo = newNotesTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EthPackage.DEVICE_MODEL__NOTES_TO, oldNotesTo, notesTo));
	}

	
	public SpreadsheetValidator getValidateSpreadEth() {
		if (validateSpreadEth != null && validateSpreadEth.eIsProxy()) {
			InternalEObject oldValidateSpreadEth = (InternalEObject)validateSpreadEth;
			validateSpreadEth = (SpreadsheetValidator)eResolveProxy(oldValidateSpreadEth);
			if (validateSpreadEth != oldValidateSpreadEth) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EthPackage.DEVICE_MODEL__VALIDATE_SPREAD_ETH, oldValidateSpreadEth, validateSpreadEth));
			}
		}
		return validateSpreadEth;
	}

	
	public SpreadsheetValidator basicGetValidateSpreadEth() {
		return validateSpreadEth;
	}

	
	public void setValidateSpreadEth(SpreadsheetValidator newValidateSpreadEth) {
		SpreadsheetValidator oldValidateSpreadEth = validateSpreadEth;
		validateSpreadEth = newValidateSpreadEth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EthPackage.DEVICE_MODEL__VALIDATE_SPREAD_ETH, oldValidateSpreadEth, validateSpreadEth));
	}

	
	public SpreadsheetParser getFromSpreadEth() {
		if (fromSpreadEth != null && fromSpreadEth.eIsProxy()) {
			InternalEObject oldFromSpreadEth = (InternalEObject)fromSpreadEth;
			fromSpreadEth = (SpreadsheetParser)eResolveProxy(oldFromSpreadEth);
			if (fromSpreadEth != oldFromSpreadEth) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EthPackage.DEVICE_MODEL__FROM_SPREAD_ETH, oldFromSpreadEth, fromSpreadEth));
			}
		}
		return fromSpreadEth;
	}

	
	public SpreadsheetParser basicGetFromSpreadEth() {
		return fromSpreadEth;
	}

	
	public void setFromSpreadEth(SpreadsheetParser newFromSpreadEth) {
		SpreadsheetParser oldFromSpreadEth = fromSpreadEth;
		fromSpreadEth = newFromSpreadEth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EthPackage.DEVICE_MODEL__FROM_SPREAD_ETH, oldFromSpreadEth, fromSpreadEth));
	}

	@Override
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
		
		SpreadsheetParser spreadParser = baseFac.createSpreadsheetParser();
		Util utils = baseFac.createUtil();
		
		xmlFile += suffix;
		String xml = spreadParser.getSpreadsheet(spreadsheetDir, deviceName + "_spreadsheet." + suffix);
		String xsdFile = utils.getInstallDir() + "/config/schemas/" + busType.toLowerCase() + "/Workbook.xsd";

		SpreadsheetParser p = baseFac.createSpreadsheetParser(xml);
		spreadsheet = p.getWorksheets();
		SpreadsheetValidator v = baseFac.createSpreadsheetValidator();
		if (!v.validate(xmlFile, xsdFile)) {
			String s = "Spreadsheet " + deviceName + "_spreadsheet." + suffix + " is not a valid spreadsheet.";
			throw new RuntimeException(s);
		}
		System.out.println("Spreadsheet " + deviceName + "_spreadsheet." + " has been validated.");

		Table table = baseFac.createTable();
		
		table.initialize(spreadsheet);
		
		mainIndex = table.getSheetNum("Hardware Device");
		monitorIndex = table.getSheetNum("Monitor Point");
		controlIndex = table.getSheetNum("Control Point");
		archiveIndex = table.getSheetNum("Archive Property");
		
		EthFactory ethFac = EthFactory.eINSTANCE;
		
		// Get the Main..
		main = ethFac.createMainETH(spreadsheet[mainIndex][2]);
		//main.setMetaEnvironment(this.getMetaEnvironment());
		
		// Get the Notes
		notes = new ResourceSetImpl();
		for (i = 3; i < spreadsheet[mainIndex].length; i++) {
			Note note = baseFac.createNote();
			//note.setMetaEnvironment(this.getMetaEnvironment());
			note.setNote(spreadsheet[mainIndex][i][descriptionIndex]);
			notes.getResources().add((Resource)note);
		}
		
		// Get the monitor points
		MonitorETHImpl mparent = null;
		monitorPoints = new ResourceSetImpl();
		for (i = 2; i < spreadsheet[monitorIndex].length; i++) {
			if(spreadsheet[monitorIndex][i].length == 0)
				break;
			MonitorETHImpl mp;
			String[] row = spreadsheet[monitorIndex][i];
			if(!spreadsheet[monitorIndex][i][0].startsWith(table.getDepChar())){
				mp = new MonitorETHImpl(row, null);
				mparent = mp;
			}
			else{
				mp = new MonitorETHImpl(row, mparent);
				mparent.addDependent(mp);
			}
			mp.setArchive(getArchive(mp.FullName()));
			mp.setAssemblyName(main.Assembly());
			//mp.setMetaEnvironment(this.getMetaEnvironment());
			monitorPoints.getResources().add(mp);
		}
		// Get the control points
		ControlETHImpl cparent = null;
		controlPoints = new ResourceSetImpl();
		for (i = 2; i < spreadsheet[controlIndex].length; ++i) {
			if(spreadsheet[controlIndex][i].length == 0)
				break;
			ControlETHImpl cp;
			String[] row = spreadsheet[controlIndex][i];
			if(!spreadsheet[controlIndex][i][0].startsWith(table.getDepChar()))
			{
				cp = new ControlETHImpl(row, null);
				cparent = cp;
			}
			else{
				cp = new ControlETHImpl(row, cparent);
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
			ArchiveETHImpl ap;
			String[] row = spreadsheet[archiveIndex][i];
			ap = new ArchiveETHImpl(row);
			//ap.setMetaEnvironment(this.getMetaEnvironment());
			archiveProperties.getResources().add(ap);
		}
		System.out.println("DeviceModel: Initialization complete.");
		return "";
	}

	
	public String VendorClass() {
		return ((MainETHImpl)main).VendorClass();
	}

	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EthPackage.DEVICE_MODEL__INFO_DEV_MAIN:
				if (resolve) return getInfoDevMain();
				return basicGetInfoDevMain();
			case EthPackage.DEVICE_MODEL__INFO_CONTROL:
				if (resolve) return getInfoControl();
				return basicGetInfoControl();
			case EthPackage.DEVICE_MODEL__INFO_MONITOR:
				if (resolve) return getInfoMonitor();
				return basicGetInfoMonitor();
			case EthPackage.DEVICE_MODEL__TO_END_ETH:
				if (resolve) return getToEndEth();
				return basicGetToEndEth();
			case EthPackage.DEVICE_MODEL__INFO_ARCH:
				if (resolve) return getInfoArch();
				return basicGetInfoArch();
			case EthPackage.DEVICE_MODEL__DATA_SPREADSHEET:
				if (resolve) return getDataSpreadsheet();
				return basicGetDataSpreadsheet();
			case EthPackage.DEVICE_MODEL__NOTES_TO:
				if (resolve) return getNotesTo();
				return basicGetNotesTo();
			case EthPackage.DEVICE_MODEL__VALIDATE_SPREAD_ETH:
				if (resolve) return getValidateSpreadEth();
				return basicGetValidateSpreadEth();
			case EthPackage.DEVICE_MODEL__FROM_SPREAD_ETH:
				if (resolve) return getFromSpreadEth();
				return basicGetFromSpreadEth();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EthPackage.DEVICE_MODEL__INFO_DEV_MAIN:
				setInfoDevMain((MainBase)newValue);
				return;
			case EthPackage.DEVICE_MODEL__INFO_CONTROL:
				setInfoControl((ControlETH)newValue);
				return;
			case EthPackage.DEVICE_MODEL__INFO_MONITOR:
				setInfoMonitor((MonitorETH)newValue);
				return;
			case EthPackage.DEVICE_MODEL__TO_END_ETH:
				setToEndEth((Util)newValue);
				return;
			case EthPackage.DEVICE_MODEL__INFO_ARCH:
				setInfoArch((ArchiveETH)newValue);
				return;
			case EthPackage.DEVICE_MODEL__DATA_SPREADSHEET:
				setDataSpreadsheet((Table)newValue);
				return;
			case EthPackage.DEVICE_MODEL__NOTES_TO:
				setNotesTo((Note)newValue);
				return;
			case EthPackage.DEVICE_MODEL__VALIDATE_SPREAD_ETH:
				setValidateSpreadEth((SpreadsheetValidator)newValue);
				return;
			case EthPackage.DEVICE_MODEL__FROM_SPREAD_ETH:
				setFromSpreadEth((SpreadsheetParser)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EthPackage.DEVICE_MODEL__INFO_DEV_MAIN:
				setInfoDevMain((MainBase)null);
				return;
			case EthPackage.DEVICE_MODEL__INFO_CONTROL:
				setInfoControl((ControlETH)null);
				return;
			case EthPackage.DEVICE_MODEL__INFO_MONITOR:
				setInfoMonitor((MonitorETH)null);
				return;
			case EthPackage.DEVICE_MODEL__TO_END_ETH:
				setToEndEth((Util)null);
				return;
			case EthPackage.DEVICE_MODEL__INFO_ARCH:
				setInfoArch((ArchiveETH)null);
				return;
			case EthPackage.DEVICE_MODEL__DATA_SPREADSHEET:
				setDataSpreadsheet((Table)null);
				return;
			case EthPackage.DEVICE_MODEL__NOTES_TO:
				setNotesTo((Note)null);
				return;
			case EthPackage.DEVICE_MODEL__VALIDATE_SPREAD_ETH:
				setValidateSpreadEth((SpreadsheetValidator)null);
				return;
			case EthPackage.DEVICE_MODEL__FROM_SPREAD_ETH:
				setFromSpreadEth((SpreadsheetParser)null);
				return;
		}
		super.eUnset(featureID);
	}

	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EthPackage.DEVICE_MODEL__INFO_DEV_MAIN:
				return infoDevMain != null;
			case EthPackage.DEVICE_MODEL__INFO_CONTROL:
				return infoControl != null;
			case EthPackage.DEVICE_MODEL__INFO_MONITOR:
				return infoMonitor != null;
			case EthPackage.DEVICE_MODEL__TO_END_ETH:
				return toEndEth != null;
			case EthPackage.DEVICE_MODEL__INFO_ARCH:
				return infoArch != null;
			case EthPackage.DEVICE_MODEL__DATA_SPREADSHEET:
				return dataSpreadsheet != null;
			case EthPackage.DEVICE_MODEL__NOTES_TO:
				return notesTo != null;
			case EthPackage.DEVICE_MODEL__VALIDATE_SPREAD_ETH:
				return validateSpreadEth != null;
			case EthPackage.DEVICE_MODEL__FROM_SPREAD_ETH:
				return fromSpreadEth != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceModelImpl
