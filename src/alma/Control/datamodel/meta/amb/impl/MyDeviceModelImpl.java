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

import alma.Control.datamodel.meta.amb.*;

import alma.Control.datamodel.meta.base.*;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;


public class MyDeviceModelImpl extends alma.Control.datamodel.meta.amb.impl.DeviceModelImpl implements alma.Control.datamodel.meta.amb.MyDeviceModel {
	
	public MyDeviceModelImpl() {
		super();
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
	
} //MyDeviceModelImpl
