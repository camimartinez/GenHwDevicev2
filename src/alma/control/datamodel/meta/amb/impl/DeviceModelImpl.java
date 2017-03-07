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
import alma.control.datamodel.meta.amb.DeviceModel;
import alma.control.datamodel.meta.base.BaseFactory;
import alma.control.datamodel.meta.base.BasePackage;
import alma.control.datamodel.meta.base.Note;
import alma.control.datamodel.meta.base.SpreadsheetParser;
import alma.control.datamodel.meta.base.Table;
import alma.control.datamodel.meta.base.Util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DeviceModelImpl extends alma.control.datamodel.meta.base.impl.DeviceModelImpl implements DeviceModel {
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
		return AmbPackage.Literals.DEVICE_MODEL;
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
		return ((MainImpl)main).Parent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Cardinality() {
		return ((MainImpl)main).Cardinality();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String NodeAddress() {
		return ((MainImpl)main).NodeAddress();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Channel() {
		return ((MainImpl)main).Channel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String BaseAddress() {
		return ((MainImpl)main).BaseAddress();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean GenericMonitorPoints() {
		return ((MainImpl)main).GenericMonitorPoints();
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
		String suffixSpreadsheet="_spreadsheet.";

		BasePackage.eINSTANCE.eClass();
		BaseFactory baseFac = BaseFactory.eINSTANCE;		

		AmbPackage.eINSTANCE.eClass();
		AmbFactory ambFac = AmbFactory.eINSTANCE;

		// Check if the spreadsheet file is an actual spreadsheet or a
		// "filter" file which is some kind of a filter for a real
		// spreadsheet but inherits from it.
		String xmlFile = spreadsheetDir + "/" + deviceName + suffixSpreadsheet;
		String suffix = "filter";
		java.io.File fileExists = new java.io.File(xmlFile + suffix);
		if(fileExists.exists() == false){
			// The blah.filter file does not exist, so assume that the file
			// is an XML file.
			suffix = "xml";
		}

		Util util = baseFac.createUtil();

		xmlFile += suffix;
		String fileSpreadsheetName = deviceName.concat(suffixSpreadsheet).concat(suffix);
		String xml = baseFac.createSpreadsheetParser().getSpreadsheet(spreadsheetDir, fileSpreadsheetName);		
		String xsdFile = util.getInstallDir()+ "/config/schemas/" + busType.toLowerCase() + "/Workbook.xsd";

		SpreadsheetParser p = baseFac.createSpreadsheetParser();
		p.setInitializeSP(xml);
		p.setXSD(xsdFile);
		spreadsheet = p.getWorksheets();
		if (!p.isReference() && !baseFac.createSpreadsheetValidator().validate(xmlFile, xsdFile)) {
			String s = "Spreadsheet: " + fileSpreadsheetName + " is not a valid spreadsheet.";
			throw new RuntimeException(s);
		}

		System.out.println("Spreadsheet: " + fileSpreadsheetName + " has been validated.");

		Table tab = baseFac.createTable();

		tab.initialize(spreadsheet);
		mainIndex = tab.getSheetNum("Hardware Device");
		monitorIndex = tab.getSheetNum("Monitor Point");
		controlIndex = tab.getSheetNum("Control Point");
		archiveIndex = tab.getSheetNum("Archive Property");
		
		if(spreadsheet[mainIndex][2][tab.getColNum(mainIndex,"Generic Monitor Points")].equals("yes")){
			String[][][] spreadsheetWithGenericPointsAdded;
			spreadsheetWithGenericPointsAdded = ambFac.createGenericMonitorPoints().getDeviceWorksheetWithGenericPointsAdded(spreadsheet);
			spreadsheet = spreadsheetWithGenericPointsAdded;
		}

		// Get the Main
		System.out.println("mainIndex: "+mainIndex+"");
		main = ambFac.createMain();
		main.setInitializeMB(spreadsheet[mainIndex][2]);
		eSetClass(main.eClass());

		// Get the Notes
		notes = new ResourceSetImpl();
		Resource noteRes = notes.createResource(URI.createURI(""));
		for (i = 3; i < spreadsheet[mainIndex].length; i++) {
			Note note = baseFac.createNote();
			note.setNote(spreadsheet[mainIndex][i][descriptionIndex]);
			noteRes.getContents().add(note);
		}

		/*
		// Get the monitor points
		Monitor mparent = ambFac.createMonitor();
		mparent = null;
		monitorPoints = new ResourceSetImpl();
		Resource monitorRes = monitorPoints.createResource(URI.createURI(""));
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
				mp = ambFac.createMonitor(row,mparent.eResource());
				mparent.addDependent(mp.eResource());
			}
			mp.setArchive(getArchive(mp.FullName()));
			monitorRes.getContents().add(mp);
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
					Monitor dep = ambFac.createMonitor(row, mp.eResource());
					mp.addDependent(dep.eResource());

					dep.setArchive(getArchive(dep.FullName()));
					monitorPoints.getResources().add((Resource) dep);
				}
		}

		// Get the control points
		Control cparent = ambFac.createControl();
		cparent = null;
		controlPoints = new ResourceSetImpl();
		Resource controlRes = controlPoints.createResource(URI.createURI(""));
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
				cp = ambFac.createControl(row, cparent.eResource());
				cparent.addDependent(cp.eResource());
			}
			cp.setArchive(getArchive(cp.FullName()));
			controlRes.getContents().add(cp);
		}

		//Get the Archive Properties
		archiveProperties = new ResourceSetImpl();
		Resource archiveRes = archiveProperties.createResource(URI.createURI(""));
		for(i = 2; i < spreadsheet[archiveIndex].length; i++) {
			if(spreadsheet[archiveIndex][i].length == 0)
				break;
			Archive ap;
			String[] row = spreadsheet[archiveIndex][i];
			ap = ambFac.createArchive(row);
			alma.control.datamodel.meta.base.MonitorPoint mp = getMonitorPoint(ap.RefersTo());
			if (mp != null)
				ap.setMP(mp.eResource());
			alma.control.datamodel.meta.base.ControlPoint cp = getControlPoint(ap.RefersTo());
			if (cp != null)
				ap.setCP(cp.eResource());
			archiveRes.getContents().add(ap);
		}
*/
		System.out.println("DeviceModel: Initialization complete.");
		return "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String TheEnd() {
				String dir = generatedDir + "/" + Assembly();
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

} //DeviceModelImpl
