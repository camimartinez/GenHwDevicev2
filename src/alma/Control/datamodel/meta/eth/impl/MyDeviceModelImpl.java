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
package alma.Control.datamodel.meta.eth.impl;


import alma.control.datamodel.meta.base.*;
import alma.control.datamodel.meta.eth.*;
import alma.control.datamodel.meta.eth.impl.ArchiveImpl;
import alma.control.datamodel.meta.eth.impl.ControlImpl;
import alma.control.datamodel.meta.eth.impl.MonitorImpl;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;


public class MyDeviceModelImpl extends alma.control.datamodel.meta.eth.impl.DeviceModelImpl implements alma.Control.datamodel.meta.eth.MyDeviceModel {
	
		
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
		main = ethFac.createMain(spreadsheet[mainIndex][2]);
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
			if(!spreadsheet[monitorIndex][i][0].startsWith(table.getDepChar())){
				mp = new MonitorImpl(row, null);
				mparent = mp;
			}
			else{
				mp = new MonitorImpl(row, mparent);
				mparent.addDependent(mp);
			}
			mp.setArchive(getArchive(mp.FullName()));
			mp.setAssemblyName(main.Assembly());
			//mp.setMetaEnvironment(this.getMetaEnvironment());
			monitorPoints.getResources().add(mp);
		}
		// Get the control points
		ControlImpl cparent = null;
		controlPoints = new ResourceSetImpl();
		for (i = 2; i < spreadsheet[controlIndex].length; ++i) {
			if(spreadsheet[controlIndex][i].length == 0)
				break;
			ControlImpl cp;
			String[] row = spreadsheet[controlIndex][i];
			if(!spreadsheet[controlIndex][i][0].startsWith(table.getDepChar()))
			{
				cp = new ControlImpl(row, null);
				cparent = cp;
			}
			else{
				cp = new ControlImpl(row, cparent);
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
			ArchiveImpl ap;
			String[] row = spreadsheet[archiveIndex][i];
			ap = new ArchiveImpl(row);
			//ap.setMetaEnvironment(this.getMetaEnvironment());
			archiveProperties.getResources().add(ap);
		}
		System.out.println("DeviceModel: Initialization complete.");
		return "";
	}

	} //DeviceModelImpl
