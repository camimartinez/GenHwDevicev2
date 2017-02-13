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
package alma.Control.datamodel.meta.amb.impl;

import java.util.List;

import alma.Control.datamodel.meta.amb.AmbFactory;
import alma.Control.datamodel.meta.amb.AmbPackage;
import alma.Control.datamodel.meta.amb.Archive;
import alma.Control.datamodel.meta.amb.Control;
import alma.Control.datamodel.meta.amb.GenericMonitorPoints;
import alma.Control.datamodel.meta.amb.Main;
import alma.Control.datamodel.meta.amb.Monitor;
import alma.Control.datamodel.meta.amb.MyDeviceModel;

import alma.Control.datamodel.meta.base.BaseFactory;
import alma.Control.datamodel.meta.base.ControlPoint;
import alma.Control.datamodel.meta.base.MainBase;
import alma.Control.datamodel.meta.base.MonitorPoint;
import alma.Control.datamodel.meta.base.Note;
import alma.Control.datamodel.meta.base.SpreadsheetParser;
import alma.Control.datamodel.meta.base.SpreadsheetValidator;
import alma.Control.datamodel.meta.base.Table;
import alma.Control.datamodel.meta.base.Util;

import alma.Control.datamodel.meta.base.impl.BaseFactoryImpl;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;


public class MyDeviceModelImpl extends alma.Control.datamodel.meta.amb.impl.DeviceModelImpl implements MyDeviceModel {
	
	protected static final BaseFactoryImpl TMP_EDEFAULT = null;

	
	protected BaseFactoryImpl tmp = TMP_EDEFAULT;

	
	protected ControlPoint toAddCP;

	
	protected Note getNoteFromMain;

	
	protected MonitorPoint toAddMP;

	
	protected MainBase getInfoMain;

	
	protected Control getCPfromControl;

	
	protected Main getInfoFromMainSheet;

	
	protected Monitor getMPfromMonitor;

	
	protected Table getDataFromSpread;

	
	protected Archive getAPfromArchive;

	
	protected Util toinstallEndGeneration;

	
	protected SpreadsheetParser getFromSpreadsheet;

	
	protected SpreadsheetValidator toValidateSpreadsheet;

	
	protected GenericMonitorPoints getGenericMP;

	
	public MyDeviceModelImpl() {
		super();
	}

	
	@Override
	protected EClass eStaticClass() {
		return AmbPackage.Literals.DEVICE_MODEL;
	}

	
	public BaseFactoryImpl getTmp() {
		return tmp;
	}

	
	public void setTmp(BaseFactoryImpl newTmp) {
		BaseFactoryImpl oldTmp = tmp;
		tmp = newTmp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__TMP, oldTmp, tmp));
	}

	
	public ControlPoint getToAddCP() {
		if (toAddCP != null && toAddCP.eIsProxy()) {
			InternalEObject oldToAddCP = (InternalEObject)toAddCP;
			toAddCP = (ControlPoint)eResolveProxy(oldToAddCP);
			if (toAddCP != oldToAddCP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL__TO_ADD_CP, oldToAddCP, toAddCP));
			}
		}
		return toAddCP;
	}

	
	public ControlPoint basicGetToAddCP() {
		return toAddCP;
	}

	
	public void setToAddCP(ControlPoint newToAddCP) {
		ControlPoint oldToAddCP = toAddCP;
		toAddCP = newToAddCP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__TO_ADD_CP, oldToAddCP, toAddCP));
	}

	
	public Note getGetNoteFromMain() {
		if (getNoteFromMain != null && getNoteFromMain.eIsProxy()) {
			InternalEObject oldGetNoteFromMain = (InternalEObject)getNoteFromMain;
			getNoteFromMain = (Note)eResolveProxy(oldGetNoteFromMain);
			if (getNoteFromMain != oldGetNoteFromMain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL__GET_NOTE_FROM_MAIN, oldGetNoteFromMain, getNoteFromMain));
			}
		}
		return getNoteFromMain;
	}

	
	public Note basicGetGetNoteFromMain() {
		return getNoteFromMain;
	}

	
	public void setGetNoteFromMain(Note newGetNoteFromMain) {
		Note oldGetNoteFromMain = getNoteFromMain;
		getNoteFromMain = newGetNoteFromMain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__GET_NOTE_FROM_MAIN, oldGetNoteFromMain, getNoteFromMain));
	}

	
	public MonitorPoint getToAddMP() {
		if (toAddMP != null && toAddMP.eIsProxy()) {
			InternalEObject oldToAddMP = (InternalEObject)toAddMP;
			toAddMP = (MonitorPoint)eResolveProxy(oldToAddMP);
			if (toAddMP != oldToAddMP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL__TO_ADD_MP, oldToAddMP, toAddMP));
			}
		}
		return toAddMP;
	}

	
	public MonitorPoint basicGetToAddMP() {
		return toAddMP;
	}

	
	public void setToAddMP(MonitorPoint newToAddMP) {
		MonitorPoint oldToAddMP = toAddMP;
		toAddMP = newToAddMP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__TO_ADD_MP, oldToAddMP, toAddMP));
	}

	
	public MainBase getGetInfoMain() {
		if (getInfoMain != null && getInfoMain.eIsProxy()) {
			InternalEObject oldGetInfoMain = (InternalEObject)getInfoMain;
			getInfoMain = (MainBase)eResolveProxy(oldGetInfoMain);
			if (getInfoMain != oldGetInfoMain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL__GET_INFO_MAIN, oldGetInfoMain, getInfoMain));
			}
		}
		return getInfoMain;
	}

	
	public MainBase basicGetGetInfoMain() {
		return getInfoMain;
	}

	
	public void setGetInfoMain(MainBase newGetInfoMain) {
		MainBase oldGetInfoMain = getInfoMain;
		getInfoMain = newGetInfoMain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__GET_INFO_MAIN, oldGetInfoMain, getInfoMain));
	}

	
	public Control getGetCPfromControl() {
		if (getCPfromControl != null && getCPfromControl.eIsProxy()) {
			InternalEObject oldGetCPfromControl = (InternalEObject)getCPfromControl;
			getCPfromControl = (Control)eResolveProxy(oldGetCPfromControl);
			if (getCPfromControl != oldGetCPfromControl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL__GET_CPFROM_CONTROL, oldGetCPfromControl, getCPfromControl));
			}
		}
		return getCPfromControl;
	}

	
	public Control basicGetGetCPfromControl() {
		return getCPfromControl;
	}

	
	public void setGetCPfromControl(Control newGetCPfromControl) {
		Control oldGetCPfromControl = getCPfromControl;
		getCPfromControl = newGetCPfromControl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__GET_CPFROM_CONTROL, oldGetCPfromControl, getCPfromControl));
	}

	
	public Main getGetInfoFromMainSheet() {
		if (getInfoFromMainSheet != null && getInfoFromMainSheet.eIsProxy()) {
			InternalEObject oldGetInfoFromMainSheet = (InternalEObject)getInfoFromMainSheet;
			getInfoFromMainSheet = (Main)eResolveProxy(oldGetInfoFromMainSheet);
			if (getInfoFromMainSheet != oldGetInfoFromMainSheet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL__GET_INFO_FROM_MAIN_SHEET, oldGetInfoFromMainSheet, getInfoFromMainSheet));
			}
		}
		return getInfoFromMainSheet;
	}

	
	public Main basicGetGetInfoFromMainSheet() {
		return getInfoFromMainSheet;
	}

	
	public void setGetInfoFromMainSheet(Main newGetInfoFromMainSheet) {
		Main oldGetInfoFromMainSheet = getInfoFromMainSheet;
		getInfoFromMainSheet = newGetInfoFromMainSheet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__GET_INFO_FROM_MAIN_SHEET, oldGetInfoFromMainSheet, getInfoFromMainSheet));
	}

	
	public Monitor getGetMPfromMonitor() {
		if (getMPfromMonitor != null && getMPfromMonitor.eIsProxy()) {
			InternalEObject oldGetMPfromMonitor = (InternalEObject)getMPfromMonitor;
			getMPfromMonitor = (Monitor)eResolveProxy(oldGetMPfromMonitor);
			if (getMPfromMonitor != oldGetMPfromMonitor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL__GET_MPFROM_MONITOR, oldGetMPfromMonitor, getMPfromMonitor));
			}
		}
		return getMPfromMonitor;
	}

	
	public Monitor basicGetGetMPfromMonitor() {
		return getMPfromMonitor;
	}

	
	public void setGetMPfromMonitor(Monitor newGetMPfromMonitor) {
		Monitor oldGetMPfromMonitor = getMPfromMonitor;
		getMPfromMonitor = newGetMPfromMonitor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__GET_MPFROM_MONITOR, oldGetMPfromMonitor, getMPfromMonitor));
	}

	
	public Table getGetDataFromSpread() {
		if (getDataFromSpread != null && getDataFromSpread.eIsProxy()) {
			InternalEObject oldGetDataFromSpread = (InternalEObject)getDataFromSpread;
			getDataFromSpread = (Table)eResolveProxy(oldGetDataFromSpread);
			if (getDataFromSpread != oldGetDataFromSpread) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL__GET_DATA_FROM_SPREAD, oldGetDataFromSpread, getDataFromSpread));
			}
		}
		return getDataFromSpread;
	}

	
	public Table basicGetGetDataFromSpread() {
		return getDataFromSpread;
	}

	
	public void setGetDataFromSpread(Table newGetDataFromSpread) {
		Table oldGetDataFromSpread = getDataFromSpread;
		getDataFromSpread = newGetDataFromSpread;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__GET_DATA_FROM_SPREAD, oldGetDataFromSpread, getDataFromSpread));
	}

	
	public Archive getGetAPfromArchive() {
		if (getAPfromArchive != null && getAPfromArchive.eIsProxy()) {
			InternalEObject oldGetAPfromArchive = (InternalEObject)getAPfromArchive;
			getAPfromArchive = (Archive)eResolveProxy(oldGetAPfromArchive);
			if (getAPfromArchive != oldGetAPfromArchive) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL__GET_APFROM_ARCHIVE, oldGetAPfromArchive, getAPfromArchive));
			}
		}
		return getAPfromArchive;
	}

	
	public Archive basicGetGetAPfromArchive() {
		return getAPfromArchive;
	}

	
	public void setGetAPfromArchive(Archive newGetAPfromArchive) {
		Archive oldGetAPfromArchive = getAPfromArchive;
		getAPfromArchive = newGetAPfromArchive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__GET_APFROM_ARCHIVE, oldGetAPfromArchive, getAPfromArchive));
	}

	
	public Util getToinstallEndGeneration() {
		if (toinstallEndGeneration != null && toinstallEndGeneration.eIsProxy()) {
			InternalEObject oldToinstallEndGeneration = (InternalEObject)toinstallEndGeneration;
			toinstallEndGeneration = (Util)eResolveProxy(oldToinstallEndGeneration);
			if (toinstallEndGeneration != oldToinstallEndGeneration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL__TOINSTALL_END_GENERATION, oldToinstallEndGeneration, toinstallEndGeneration));
			}
		}
		return toinstallEndGeneration;
	}

	
	public Util basicGetToinstallEndGeneration() {
		return toinstallEndGeneration;
	}

	
	public void setToinstallEndGeneration(Util newToinstallEndGeneration) {
		Util oldToinstallEndGeneration = toinstallEndGeneration;
		toinstallEndGeneration = newToinstallEndGeneration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__TOINSTALL_END_GENERATION, oldToinstallEndGeneration, toinstallEndGeneration));
	}

	
	public SpreadsheetParser getGetFromSpreadsheet() {
		if (getFromSpreadsheet != null && getFromSpreadsheet.eIsProxy()) {
			InternalEObject oldGetFromSpreadsheet = (InternalEObject)getFromSpreadsheet;
			getFromSpreadsheet = (SpreadsheetParser)eResolveProxy(oldGetFromSpreadsheet);
			if (getFromSpreadsheet != oldGetFromSpreadsheet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL__GET_FROM_SPREADSHEET, oldGetFromSpreadsheet, getFromSpreadsheet));
			}
		}
		return getFromSpreadsheet;
	}

	
	public SpreadsheetParser basicGetGetFromSpreadsheet() {
		return getFromSpreadsheet;
	}

	
	public void setGetFromSpreadsheet(SpreadsheetParser newGetFromSpreadsheet) {
		SpreadsheetParser oldGetFromSpreadsheet = getFromSpreadsheet;
		getFromSpreadsheet = newGetFromSpreadsheet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__GET_FROM_SPREADSHEET, oldGetFromSpreadsheet, getFromSpreadsheet));
	}

	
	public SpreadsheetValidator getToValidateSpreadsheet() {
		if (toValidateSpreadsheet != null && toValidateSpreadsheet.eIsProxy()) {
			InternalEObject oldToValidateSpreadsheet = (InternalEObject)toValidateSpreadsheet;
			toValidateSpreadsheet = (SpreadsheetValidator)eResolveProxy(oldToValidateSpreadsheet);
			if (toValidateSpreadsheet != oldToValidateSpreadsheet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL__TO_VALIDATE_SPREADSHEET, oldToValidateSpreadsheet, toValidateSpreadsheet));
			}
		}
		return toValidateSpreadsheet;
	}

	
	public SpreadsheetValidator basicGetToValidateSpreadsheet() {
		return toValidateSpreadsheet;
	}

	
	public void setToValidateSpreadsheet(SpreadsheetValidator newToValidateSpreadsheet) {
		SpreadsheetValidator oldToValidateSpreadsheet = toValidateSpreadsheet;
		toValidateSpreadsheet = newToValidateSpreadsheet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__TO_VALIDATE_SPREADSHEET, oldToValidateSpreadsheet, toValidateSpreadsheet));
	}

	
	public GenericMonitorPoints getGetGenericMP() {
		if (getGenericMP != null && getGenericMP.eIsProxy()) {
			InternalEObject oldGetGenericMP = (InternalEObject)getGenericMP;
			getGenericMP = (GenericMonitorPoints)eResolveProxy(oldGetGenericMP);
			if (getGenericMP != oldGetGenericMP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL__GET_GENERIC_MP, oldGetGenericMP, getGenericMP));
			}
		}
		return getGenericMP;
	}

	
	public GenericMonitorPoints basicGetGetGenericMP() {
		return getGenericMP;
	}

	
	public void setGetGenericMP(GenericMonitorPoints newGetGenericMP) {
		GenericMonitorPoints oldGetGenericMP = getGenericMP;
		getGenericMP = newGetGenericMP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__GET_GENERIC_MP, oldGetGenericMP, getGenericMP));
	}

	
	public boolean isMonitorDBOnly() {
		return monitorDBOnly;
	}

	
	public boolean IsGeneratedAlt() {
		return generateAlt;
	}

	
	public String Parent() {
		return ((MainImpl)main).Parent();
	}

	
	public String Cardinality() {
		return ((MainImpl)main).Cardinality();
	}

	
	public String NodeAddress() {
		return ((MainImpl)main).NodeAddress();
	}

	
	public String Channel() {
		return ((MainImpl)main).Channel();
	}

	
	public String BaseAddress() {
		return ((MainImpl)main).BaseAddress();
	}

	
	public boolean GenericMonitorPoints() {
		return ((MainImpl)main).GenericMonitorPoints();
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
		String xsdFile = utils.getInstallDir()+ "/config/schemas/" + busType.toLowerCase() + "/Workbook.xsd";

		SpreadsheetParser p = baseFac.createSpreadsheetParser(xml);
		p.setXSD(xsdFile);
		spreadsheet = p.getWorksheets();
		SpreadsheetValidator v = baseFac.createSpreadsheetValidator();
		if (!p.isReference() && !v.validate(xmlFile, xsdFile)) {
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

		AmbFactory ambFac = AmbFactory.eINSTANCE;
		if(spreadsheet[mainIndex][2][table.getColNum(mainIndex,"Generic Monitor Points")].equals("yes")){
			String[][][] spreadsheetWithGenericPointsAdded;
			GenericMonitorPoints generic = ambFac.createGenericMonitorPoints();
			spreadsheetWithGenericPointsAdded = generic.getDeviceWorksheetWithGenericPointsAdded(spreadsheet);
			spreadsheet = spreadsheetWithGenericPointsAdded;
		}

		// Get the Main
		main = ambFac.createMain(spreadsheet[mainIndex][2]);
	
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
		MonitorImpl mparent = null;
		monitorPoints = new ResourceSetImpl();
		for (i = 2; i < spreadsheet[monitorIndex].length; i++) {
			if(spreadsheet[monitorIndex][i].length == 0)
				break;
			MonitorImpl mp;
			String[] row = spreadsheet[monitorIndex][i];
			if(!spreadsheet[monitorIndex][i][1].startsWith(table.getDepChar())){
				mp = new MonitorImpl(row, null);
				mparent = mp;
			}
			else{
				mp = new MonitorImpl(row, mparent);
				mparent.addDependent(mp);
			}
			mp.setArchive(getArchive(mp.FullName()));
			//mp.setMetaEnvironment(this.getMetaEnvironment());
			monitorPoints.getResources().add(mp);
		}

		// Define undefined dependent monitor points for sequence properties
		List<Resource> list2 = (List<Resource>) monitorPoints;
		MonitorImpl[] list = (MonitorImpl[])list2.toArray(new MonitorImpl[0]);
		for (MonitorImpl mp : list) {
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
					MonitorImpl dep = new MonitorImpl(row,mp);
					mp.addDependent(dep);

					dep.setArchive(getArchive(dep.FullName()));
					//dep.setMetaEnvironment(this.getMetaEnvironment());
					monitorPoints.getResources().add(dep);
				}
		}

		// Get the control points

		ControlImpl cparent = null;
		controlPoints = new ResourceSetImpl();
		for (i = 2; i < spreadsheet[controlIndex].length; ++i) {
			if(spreadsheet[controlIndex][i].length == 0)
				break;
			ControlImpl cp;
			String[] row = spreadsheet[controlIndex][i];
			if(!spreadsheet[controlIndex][i][1].startsWith(table.getDepChar()))
			{
				cp = new ControlImpl(row, null);
				cparent = cp;
			}
			else{
				cp = new ControlImpl(row, cparent);
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
			ArchiveImpl ap;
			String[] row = spreadsheet[archiveIndex][i];
			ap = new ArchiveImpl(row);
			MonitorPoint mp = getMonitorPoint(ap.RefersTo());
			if (mp != null)
				ap.setMp(mp);
			ControlPoint cp = getControlPoint(ap.RefersTo());
			if (cp != null)
				ap.setCp(cp);
			archiveProperties.getResources().add(ap);
		}

		System.out.println("DeviceModel: Initialization complete.");
		return "";
	}

	
	public String TheEnd() {
				String dir = generatedDir + "/" + Assembly();
				Util utils = BaseFactoryImpl.eINSTANCE.createUtil();
				utils.RemoveLinesFromFile(dir + "/doc", Assembly() + ".html", 1);
				utils.RemoveLinesFromFile(dir + "/idl", Assembly() + "Add.sql", 1);
				utils.RemoveLinesFromFile(dir + "/include", Assembly() + "HWSimBase.h", 1);
				utils.RemoveLinesFromFile(dir + "/src", Assembly() + "HWSimBase.cpp", 1);
				utils.RemoveLinesFromFile(dir + "/include", Assembly() + "CompSimBase.h", 1);
				utils.RemoveLinesFromFile(dir + "/src", Assembly() + "CompSimBase.cpp", 1);
				utils.RemoveLinesFromFile(dir + "/idl", Assembly() + "CompSimBase.idl", 1);
				utils.RemoveLinesFromFile(dir + "/test", "Test" + Assembly() + "HWSimImpl.cpp", 1);
				utils.RemoveLinesFromFile(dir + "/test", "Test" + Assembly() + "AmbDeviceInt.cpp", 1);
				if (!isMonitorDBOnly()) {
					if (isGenerateAlt()) {
						utils.RemoveLinesFromFile(dir + "/../ALT/", Assembly() + ".makefile", 1);
						utils.RemoveLinesFromFile(dir + "/../ALT/", Assembly() + "Impl.idl", 1);
						utils.RemoveLinesFromFile(dir + "/../ALT/", Assembly() + "Impl.h", 1);
						utils.RemoveLinesFromFile(dir + "/../ALT/", Assembly() + "Impl.cpp", 1);
					}
					super.TheEnd();
				} else 
					System.out.println("Code generation for " + deviceName + " done.");
				return "";
	}

	
	public String NodeAddressInDecimal() {
				String s = NodeAddress();
				if (s.equals("parm"))
					return "0";
				return HexToDec(s);
	}

	
	public String HexToDec(String s) {
				int n = -1;
				try {
					n = Integer.parseInt(s.substring(2),16);
				} catch (NumberFormatException err) {
					throw new RuntimeException("Invalid number (" + s + ")");
				}
				return Integer.toString(n);
	}

	
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmbPackage.DEVICE_MODEL__TMP:
				return getTmp();
			case AmbPackage.DEVICE_MODEL__TO_ADD_CP:
				if (resolve) return getToAddCP();
				return basicGetToAddCP();
			case AmbPackage.DEVICE_MODEL__GET_NOTE_FROM_MAIN:
				if (resolve) return getGetNoteFromMain();
				return basicGetGetNoteFromMain();
			case AmbPackage.DEVICE_MODEL__TO_ADD_MP:
				if (resolve) return getToAddMP();
				return basicGetToAddMP();
			case AmbPackage.DEVICE_MODEL__GET_INFO_MAIN:
				if (resolve) return getGetInfoMain();
				return basicGetGetInfoMain();
			case AmbPackage.DEVICE_MODEL__GET_CPFROM_CONTROL:
				if (resolve) return getGetCPfromControl();
				return basicGetGetCPfromControl();
			case AmbPackage.DEVICE_MODEL__GET_INFO_FROM_MAIN_SHEET:
				if (resolve) return getGetInfoFromMainSheet();
				return basicGetGetInfoFromMainSheet();
			case AmbPackage.DEVICE_MODEL__GET_MPFROM_MONITOR:
				if (resolve) return getGetMPfromMonitor();
				return basicGetGetMPfromMonitor();
			case AmbPackage.DEVICE_MODEL__GET_DATA_FROM_SPREAD:
				if (resolve) return getGetDataFromSpread();
				return basicGetGetDataFromSpread();
			case AmbPackage.DEVICE_MODEL__GET_APFROM_ARCHIVE:
				if (resolve) return getGetAPfromArchive();
				return basicGetGetAPfromArchive();
			case AmbPackage.DEVICE_MODEL__TOINSTALL_END_GENERATION:
				if (resolve) return getToinstallEndGeneration();
				return basicGetToinstallEndGeneration();
			case AmbPackage.DEVICE_MODEL__GET_FROM_SPREADSHEET:
				if (resolve) return getGetFromSpreadsheet();
				return basicGetGetFromSpreadsheet();
			case AmbPackage.DEVICE_MODEL__TO_VALIDATE_SPREADSHEET:
				if (resolve) return getToValidateSpreadsheet();
				return basicGetToValidateSpreadsheet();
			case AmbPackage.DEVICE_MODEL__GET_GENERIC_MP:
				if (resolve) return getGetGenericMP();
				return basicGetGetGenericMP();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AmbPackage.DEVICE_MODEL__TMP:
				setTmp((BaseFactoryImpl)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__TO_ADD_CP:
				setToAddCP((ControlPoint)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__GET_NOTE_FROM_MAIN:
				setGetNoteFromMain((Note)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__TO_ADD_MP:
				setToAddMP((MonitorPoint)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__GET_INFO_MAIN:
				setGetInfoMain((MainBase)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__GET_CPFROM_CONTROL:
				setGetCPfromControl((Control)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__GET_INFO_FROM_MAIN_SHEET:
				setGetInfoFromMainSheet((Main)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__GET_MPFROM_MONITOR:
				setGetMPfromMonitor((Monitor)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__GET_DATA_FROM_SPREAD:
				setGetDataFromSpread((Table)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__GET_APFROM_ARCHIVE:
				setGetAPfromArchive((Archive)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__TOINSTALL_END_GENERATION:
				setToinstallEndGeneration((Util)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__GET_FROM_SPREADSHEET:
				setGetFromSpreadsheet((SpreadsheetParser)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__TO_VALIDATE_SPREADSHEET:
				setToValidateSpreadsheet((SpreadsheetValidator)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__GET_GENERIC_MP:
				setGetGenericMP((GenericMonitorPoints)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AmbPackage.DEVICE_MODEL__TMP:
				setTmp(TMP_EDEFAULT);
				return;
			case AmbPackage.DEVICE_MODEL__TO_ADD_CP:
				setToAddCP((ControlPoint)null);
				return;
			case AmbPackage.DEVICE_MODEL__GET_NOTE_FROM_MAIN:
				setGetNoteFromMain((Note)null);
				return;
			case AmbPackage.DEVICE_MODEL__TO_ADD_MP:
				setToAddMP((MonitorPoint)null);
				return;
			case AmbPackage.DEVICE_MODEL__GET_INFO_MAIN:
				setGetInfoMain((MainBase)null);
				return;
			case AmbPackage.DEVICE_MODEL__GET_CPFROM_CONTROL:
				setGetCPfromControl((Control)null);
				return;
			case AmbPackage.DEVICE_MODEL__GET_INFO_FROM_MAIN_SHEET:
				setGetInfoFromMainSheet((Main)null);
				return;
			case AmbPackage.DEVICE_MODEL__GET_MPFROM_MONITOR:
				setGetMPfromMonitor((Monitor)null);
				return;
			case AmbPackage.DEVICE_MODEL__GET_DATA_FROM_SPREAD:
				setGetDataFromSpread((Table)null);
				return;
			case AmbPackage.DEVICE_MODEL__GET_APFROM_ARCHIVE:
				setGetAPfromArchive((Archive)null);
				return;
			case AmbPackage.DEVICE_MODEL__TOINSTALL_END_GENERATION:
				setToinstallEndGeneration((Util)null);
				return;
			case AmbPackage.DEVICE_MODEL__GET_FROM_SPREADSHEET:
				setGetFromSpreadsheet((SpreadsheetParser)null);
				return;
			case AmbPackage.DEVICE_MODEL__TO_VALIDATE_SPREADSHEET:
				setToValidateSpreadsheet((SpreadsheetValidator)null);
				return;
			case AmbPackage.DEVICE_MODEL__GET_GENERIC_MP:
				setGetGenericMP((GenericMonitorPoints)null);
				return;
		}
		super.eUnset(featureID);
	}

	
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AmbPackage.DEVICE_MODEL__TMP:
				return TMP_EDEFAULT == null ? tmp != null : !TMP_EDEFAULT.equals(tmp);
			case AmbPackage.DEVICE_MODEL__TO_ADD_CP:
				return toAddCP != null;
			case AmbPackage.DEVICE_MODEL__GET_NOTE_FROM_MAIN:
				return getNoteFromMain != null;
			case AmbPackage.DEVICE_MODEL__TO_ADD_MP:
				return toAddMP != null;
			case AmbPackage.DEVICE_MODEL__GET_INFO_MAIN:
				return getInfoMain != null;
			case AmbPackage.DEVICE_MODEL__GET_CPFROM_CONTROL:
				return getCPfromControl != null;
			case AmbPackage.DEVICE_MODEL__GET_INFO_FROM_MAIN_SHEET:
				return getInfoFromMainSheet != null;
			case AmbPackage.DEVICE_MODEL__GET_MPFROM_MONITOR:
				return getMPfromMonitor != null;
			case AmbPackage.DEVICE_MODEL__GET_DATA_FROM_SPREAD:
				return getDataFromSpread != null;
			case AmbPackage.DEVICE_MODEL__GET_APFROM_ARCHIVE:
				return getAPfromArchive != null;
			case AmbPackage.DEVICE_MODEL__TOINSTALL_END_GENERATION:
				return toinstallEndGeneration != null;
			case AmbPackage.DEVICE_MODEL__GET_FROM_SPREADSHEET:
				return getFromSpreadsheet != null;
			case AmbPackage.DEVICE_MODEL__TO_VALIDATE_SPREADSHEET:
				return toValidateSpreadsheet != null;
			case AmbPackage.DEVICE_MODEL__GET_GENERIC_MP:
				return getGenericMP != null;
		}
		return super.eIsSet(featureID);
	}

	
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (tmp: ");
		result.append(tmp);
		result.append(')');
		return result.toString();
	}

} //MyDeviceModelImpl
