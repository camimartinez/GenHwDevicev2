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

	
	protected Note toNoteFromMain;

	
	protected MonitorPoint toAddMP;

	
	protected MainBase toInfoMain;

	
	protected Control toCPfromControl;

	
	protected Main toInfoFromMainSheet;

	
	protected Monitor toMPfromMonitor;

	
	protected Table toDataFromSpread;

	
	protected Archive toAPfromArchive;

	
	protected Util toInstallEndGeneration;

	
	protected SpreadsheetParser toSpreadsheetFrom;

	
	protected SpreadsheetValidator toValidateSpreadsheet;

	
	protected GenericMonitorPoints toGenericMP;

	
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

	
	public Note getToNoteFromMain() {
		if (toNoteFromMain != null && toNoteFromMain.eIsProxy()) {
			InternalEObject oldToNoteFromMain = (InternalEObject)toNoteFromMain;
			toNoteFromMain = (Note)eResolveProxy(oldToNoteFromMain);
			if (toNoteFromMain != oldToNoteFromMain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL__TO_NOTE_FROM_MAIN, oldToNoteFromMain, toNoteFromMain));
			}
		}
		return toNoteFromMain;
	}

	
	public Note basicGetToNoteFromMain() {
		return toNoteFromMain;
	}

	
	public void setToNoteFromMain(Note newToNoteFromMain) {
		Note oldToNoteFromMain = toNoteFromMain;
		toNoteFromMain = newToNoteFromMain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__TO_NOTE_FROM_MAIN, oldToNoteFromMain, toNoteFromMain));
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

	
	public MainBase getToInfoMain() {
		if (toInfoMain != null && toInfoMain.eIsProxy()) {
			InternalEObject oldToInfoMain = (InternalEObject)toInfoMain;
			toInfoMain = (MainBase)eResolveProxy(oldToInfoMain);
			if (toInfoMain != oldToInfoMain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL__TO_INFO_MAIN, oldToInfoMain, toInfoMain));
			}
		}
		return toInfoMain;
	}

	
	public MainBase basicGetToInfoMain() {
		return toInfoMain;
	}

	
	public void setToInfoMain(MainBase newToInfoMain) {
		MainBase oldToInfoMain = toInfoMain;
		toInfoMain = newToInfoMain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__TO_INFO_MAIN, oldToInfoMain, toInfoMain));
	}

	
	public Control getToCPfromControl() {
		if (toCPfromControl != null && toCPfromControl.eIsProxy()) {
			InternalEObject oldToCPfromControl = (InternalEObject)toCPfromControl;
			toCPfromControl = (Control)eResolveProxy(oldToCPfromControl);
			if (toCPfromControl != oldToCPfromControl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL__TO_CPFROM_CONTROL, oldToCPfromControl, toCPfromControl));
			}
		}
		return toCPfromControl;
	}

	
	public Control basicGetToCPfromControl() {
		return toCPfromControl;
	}

	
	public void setToCPfromControl(Control newToCPfromControl) {
		Control oldToCPfromControl = toCPfromControl;
		toCPfromControl = newToCPfromControl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__TO_CPFROM_CONTROL, oldToCPfromControl, toCPfromControl));
	}

	
	public Main getToInfoFromMainSheet() {
		if (toInfoFromMainSheet != null && toInfoFromMainSheet.eIsProxy()) {
			InternalEObject oldToInfoFromMainSheet = (InternalEObject)toInfoFromMainSheet;
			toInfoFromMainSheet = (Main)eResolveProxy(oldToInfoFromMainSheet);
			if (toInfoFromMainSheet != oldToInfoFromMainSheet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL__TO_INFO_FROM_MAIN_SHEET, oldToInfoFromMainSheet, toInfoFromMainSheet));
			}
		}
		return toInfoFromMainSheet;
	}

	
	public Main basicGetToInfoFromMainSheet() {
		return toInfoFromMainSheet;
	}

	
	public void setToInfoFromMainSheet(Main newToInfoFromMainSheet) {
		Main oldToInfoFromMainSheet = toInfoFromMainSheet;
		toInfoFromMainSheet = newToInfoFromMainSheet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__TO_INFO_FROM_MAIN_SHEET, oldToInfoFromMainSheet, toInfoFromMainSheet));
	}

	
	public Monitor getToMPfromMonitor() {
		if (toMPfromMonitor != null && toMPfromMonitor.eIsProxy()) {
			InternalEObject oldToMPfromMonitor = (InternalEObject)toMPfromMonitor;
			toMPfromMonitor = (Monitor)eResolveProxy(oldToMPfromMonitor);
			if (toMPfromMonitor != oldToMPfromMonitor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL__TO_MPFROM_MONITOR, oldToMPfromMonitor, toMPfromMonitor));
			}
		}
		return toMPfromMonitor;
	}

	
	public Monitor basicGetToMPfromMonitor() {
		return toMPfromMonitor;
	}

	
	public void setToMPfromMonitor(Monitor newToMPfromMonitor) {
		Monitor oldToMPfromMonitor = toMPfromMonitor;
		toMPfromMonitor = newToMPfromMonitor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__TO_MPFROM_MONITOR, oldToMPfromMonitor, toMPfromMonitor));
	}

	
	public Table getToDataFromSpread() {
		if (toDataFromSpread != null && toDataFromSpread.eIsProxy()) {
			InternalEObject oldToDataFromSpread = (InternalEObject)toDataFromSpread;
			toDataFromSpread = (Table)eResolveProxy(oldToDataFromSpread);
			if (toDataFromSpread != oldToDataFromSpread) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL__TO_DATA_FROM_SPREAD, oldToDataFromSpread, toDataFromSpread));
			}
		}
		return toDataFromSpread;
	}

	
	public Table basicGetToDataFromSpread() {
		return toDataFromSpread;
	}

	
	public void setToDataFromSpread(Table newToDataFromSpread) {
		Table oldToDataFromSpread = toDataFromSpread;
		toDataFromSpread = newToDataFromSpread;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__TO_DATA_FROM_SPREAD, oldToDataFromSpread, toDataFromSpread));
	}

	
	public Archive getToAPfromArchive() {
		if (toAPfromArchive != null && toAPfromArchive.eIsProxy()) {
			InternalEObject oldToAPfromArchive = (InternalEObject)toAPfromArchive;
			toAPfromArchive = (Archive)eResolveProxy(oldToAPfromArchive);
			if (toAPfromArchive != oldToAPfromArchive) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL__TO_APFROM_ARCHIVE, oldToAPfromArchive, toAPfromArchive));
			}
		}
		return toAPfromArchive;
	}

	
	public Archive basicGetToAPfromArchive() {
		return toAPfromArchive;
	}

	
	public void setToAPfromArchive(Archive newToAPfromArchive) {
		Archive oldToAPfromArchive = toAPfromArchive;
		toAPfromArchive = newToAPfromArchive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__TO_APFROM_ARCHIVE, oldToAPfromArchive, toAPfromArchive));
	}

	
	public Util getToInstallEndGeneration() {
		if (toInstallEndGeneration != null && toInstallEndGeneration.eIsProxy()) {
			InternalEObject oldToInstallEndGeneration = (InternalEObject)toInstallEndGeneration;
			toInstallEndGeneration = (Util)eResolveProxy(oldToInstallEndGeneration);
			if (toInstallEndGeneration != oldToInstallEndGeneration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL__TO_INSTALL_END_GENERATION, oldToInstallEndGeneration, toInstallEndGeneration));
			}
		}
		return toInstallEndGeneration;
	}

	
	public Util basicGetToInstallEndGeneration() {
		return toInstallEndGeneration;
	}

	
	public void setToInstallEndGeneration(Util newToInstallEndGeneration) {
		Util oldToInstallEndGeneration = toInstallEndGeneration;
		toInstallEndGeneration = newToInstallEndGeneration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__TO_INSTALL_END_GENERATION, oldToInstallEndGeneration, toInstallEndGeneration));
	}

	
	public SpreadsheetParser getToSpreadsheetFrom() {
		if (toSpreadsheetFrom != null && toSpreadsheetFrom.eIsProxy()) {
			InternalEObject oldToSpreadsheetFrom = (InternalEObject)toSpreadsheetFrom;
			toSpreadsheetFrom = (SpreadsheetParser)eResolveProxy(oldToSpreadsheetFrom);
			if (toSpreadsheetFrom != oldToSpreadsheetFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL__TO_SPREADSHEET_FROM, oldToSpreadsheetFrom, toSpreadsheetFrom));
			}
		}
		return toSpreadsheetFrom;
	}

	
	public SpreadsheetParser basicGetToSpreadsheetFrom() {
		return toSpreadsheetFrom;
	}

	
	public void setToSpreadsheetFrom(SpreadsheetParser newToSpreadsheetFrom) {
		SpreadsheetParser oldToSpreadsheetFrom = toSpreadsheetFrom;
		toSpreadsheetFrom = newToSpreadsheetFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__TO_SPREADSHEET_FROM, oldToSpreadsheetFrom, toSpreadsheetFrom));
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

	
	public GenericMonitorPoints getToGenericMP() {
		if (toGenericMP != null && toGenericMP.eIsProxy()) {
			InternalEObject oldToGenericMP = (InternalEObject)toGenericMP;
			toGenericMP = (GenericMonitorPoints)eResolveProxy(oldToGenericMP);
			if (toGenericMP != oldToGenericMP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL__TO_GENERIC_MP, oldToGenericMP, toGenericMP));
			}
		}
		return toGenericMP;
	}

	
	public GenericMonitorPoints basicGetToGenericMP() {
		return toGenericMP;
	}

	
	public void setToGenericMP(GenericMonitorPoints newToGenericMP) {
		GenericMonitorPoints oldToGenericMP = toGenericMP;
		toGenericMP = newToGenericMP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__TO_GENERIC_MP, oldToGenericMP, toGenericMP));
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

		//AmbAdapterFactory ambF = new AmbAdapterFactory();
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

	
	public String HexToDec(final String s) {
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
			case AmbPackage.DEVICE_MODEL__TO_NOTE_FROM_MAIN:
				if (resolve) return getToNoteFromMain();
				return basicGetToNoteFromMain();
			case AmbPackage.DEVICE_MODEL__TO_ADD_MP:
				if (resolve) return getToAddMP();
				return basicGetToAddMP();
			case AmbPackage.DEVICE_MODEL__TO_INFO_MAIN:
				if (resolve) return getToInfoMain();
				return basicGetToInfoMain();
			case AmbPackage.DEVICE_MODEL__TO_CPFROM_CONTROL:
				if (resolve) return getToCPfromControl();
				return basicGetToCPfromControl();
			case AmbPackage.DEVICE_MODEL__TO_INFO_FROM_MAIN_SHEET:
				if (resolve) return getToInfoFromMainSheet();
				return basicGetToInfoFromMainSheet();
			case AmbPackage.DEVICE_MODEL__TO_MPFROM_MONITOR:
				if (resolve) return getToMPfromMonitor();
				return basicGetToMPfromMonitor();
			case AmbPackage.DEVICE_MODEL__TO_DATA_FROM_SPREAD:
				if (resolve) return getToDataFromSpread();
				return basicGetToDataFromSpread();
			case AmbPackage.DEVICE_MODEL__TO_APFROM_ARCHIVE:
				if (resolve) return getToAPfromArchive();
				return basicGetToAPfromArchive();
			case AmbPackage.DEVICE_MODEL__TO_INSTALL_END_GENERATION:
				if (resolve) return getToInstallEndGeneration();
				return basicGetToInstallEndGeneration();
			case AmbPackage.DEVICE_MODEL__TO_SPREADSHEET_FROM:
				if (resolve) return getToSpreadsheetFrom();
				return basicGetToSpreadsheetFrom();
			case AmbPackage.DEVICE_MODEL__TO_VALIDATE_SPREADSHEET:
				if (resolve) return getToValidateSpreadsheet();
				return basicGetToValidateSpreadsheet();
			case AmbPackage.DEVICE_MODEL__TO_GENERIC_MP:
				if (resolve) return getToGenericMP();
				return basicGetToGenericMP();
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
			case AmbPackage.DEVICE_MODEL__TO_NOTE_FROM_MAIN:
				setToNoteFromMain((Note)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__TO_ADD_MP:
				setToAddMP((MonitorPoint)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__TO_INFO_MAIN:
				setToInfoMain((MainBase)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__TO_CPFROM_CONTROL:
				setToCPfromControl((Control)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__TO_INFO_FROM_MAIN_SHEET:
				setToInfoFromMainSheet((Main)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__TO_MPFROM_MONITOR:
				setToMPfromMonitor((Monitor)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__TO_DATA_FROM_SPREAD:
				setToDataFromSpread((Table)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__TO_APFROM_ARCHIVE:
				setToAPfromArchive((Archive)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__TO_INSTALL_END_GENERATION:
				setToInstallEndGeneration((Util)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__TO_SPREADSHEET_FROM:
				setToSpreadsheetFrom((SpreadsheetParser)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__TO_VALIDATE_SPREADSHEET:
				setToValidateSpreadsheet((SpreadsheetValidator)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__TO_GENERIC_MP:
				setToGenericMP((GenericMonitorPoints)newValue);
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
			case AmbPackage.DEVICE_MODEL__TO_NOTE_FROM_MAIN:
				setToNoteFromMain((Note)null);
				return;
			case AmbPackage.DEVICE_MODEL__TO_ADD_MP:
				setToAddMP((MonitorPoint)null);
				return;
			case AmbPackage.DEVICE_MODEL__TO_INFO_MAIN:
				setToInfoMain((MainBase)null);
				return;
			case AmbPackage.DEVICE_MODEL__TO_CPFROM_CONTROL:
				setToCPfromControl((Control)null);
				return;
			case AmbPackage.DEVICE_MODEL__TO_INFO_FROM_MAIN_SHEET:
				setToInfoFromMainSheet((Main)null);
				return;
			case AmbPackage.DEVICE_MODEL__TO_MPFROM_MONITOR:
				setToMPfromMonitor((Monitor)null);
				return;
			case AmbPackage.DEVICE_MODEL__TO_DATA_FROM_SPREAD:
				setToDataFromSpread((Table)null);
				return;
			case AmbPackage.DEVICE_MODEL__TO_APFROM_ARCHIVE:
				setToAPfromArchive((Archive)null);
				return;
			case AmbPackage.DEVICE_MODEL__TO_INSTALL_END_GENERATION:
				setToInstallEndGeneration((Util)null);
				return;
			case AmbPackage.DEVICE_MODEL__TO_SPREADSHEET_FROM:
				setToSpreadsheetFrom((SpreadsheetParser)null);
				return;
			case AmbPackage.DEVICE_MODEL__TO_VALIDATE_SPREADSHEET:
				setToValidateSpreadsheet((SpreadsheetValidator)null);
				return;
			case AmbPackage.DEVICE_MODEL__TO_GENERIC_MP:
				setToGenericMP((GenericMonitorPoints)null);
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
			case AmbPackage.DEVICE_MODEL__TO_NOTE_FROM_MAIN:
				return toNoteFromMain != null;
			case AmbPackage.DEVICE_MODEL__TO_ADD_MP:
				return toAddMP != null;
			case AmbPackage.DEVICE_MODEL__TO_INFO_MAIN:
				return toInfoMain != null;
			case AmbPackage.DEVICE_MODEL__TO_CPFROM_CONTROL:
				return toCPfromControl != null;
			case AmbPackage.DEVICE_MODEL__TO_INFO_FROM_MAIN_SHEET:
				return toInfoFromMainSheet != null;
			case AmbPackage.DEVICE_MODEL__TO_MPFROM_MONITOR:
				return toMPfromMonitor != null;
			case AmbPackage.DEVICE_MODEL__TO_DATA_FROM_SPREAD:
				return toDataFromSpread != null;
			case AmbPackage.DEVICE_MODEL__TO_APFROM_ARCHIVE:
				return toAPfromArchive != null;
			case AmbPackage.DEVICE_MODEL__TO_INSTALL_END_GENERATION:
				return toInstallEndGeneration != null;
			case AmbPackage.DEVICE_MODEL__TO_SPREADSHEET_FROM:
				return toSpreadsheetFrom != null;
			case AmbPackage.DEVICE_MODEL__TO_VALIDATE_SPREADSHEET:
				return toValidateSpreadsheet != null;
			case AmbPackage.DEVICE_MODEL__TO_GENERIC_MP:
				return toGenericMP != null;
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
