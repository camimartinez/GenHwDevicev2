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

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import alma.control.datamodel.meta.base.BaseFactory;
import alma.control.datamodel.meta.base.BasePackage;
import alma.control.datamodel.meta.base.Note;
import alma.control.datamodel.meta.base.SpreadsheetParser;
import alma.control.datamodel.meta.base.SpreadsheetValidator;
import alma.control.datamodel.meta.base.Table;
import alma.control.datamodel.meta.base.Util;
import alma.control.datamodel.meta.eth.Archive;
import alma.control.datamodel.meta.eth.Control;
import alma.control.datamodel.meta.eth.DeviceModel;
import alma.control.datamodel.meta.eth.EthFactory;
import alma.control.datamodel.meta.eth.EthPackage;
import alma.control.datamodel.meta.eth.Monitor;

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
		return EthPackage.Literals.DEVICE_MODEL;
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
		
		//Base Package and Factory instances
		BasePackage.eINSTANCE.eClass();
		BaseFactory baseFactory = BaseFactory.eINSTANCE;		

		//Eth Package and Factory instances
		EthPackage.eINSTANCE.eClass();
		EthFactory ethFactory = EthFactory.eINSTANCE;
		
		//Creation 
		SpreadsheetParser spreadParser = baseFactory.createSpreadsheetParser();
		SpreadsheetParser p = baseFactory.createSpreadsheetParser();
		SpreadsheetValidator spreadValid = baseFactory.createSpreadsheetValidator();
		Table table = baseFactory.createTable();
		
		// Register the XMI resource factory for the .xmi extension
		String extension = "xmi";
		String tmp = deviceDir.concat("/").concat(extension).concat("/");
		container = new ResourceSetImpl();
		container.getResourceFactoryRegistry().getExtensionToFactoryMap().put(extension, new XMIResourceFactoryImpl());

		//Resource.Factory.Registry regis = Resource.Factory.Registry.INSTANCE;
		//Map<String, Object> mm = regis.getExtensionToFactoryMap();		

		//mm.put(extension, new XMIResourceFactoryImpl());

		Map<String, Boolean> options = new HashMap<String, Boolean>();
		options.put(XMLResource.OPTION_SAVE_ONLY_IF_CHANGED, Boolean.TRUE);

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
	
		Util util = baseFactory.createUtil();

		xmlFile += suffix;
		String fileSpreadsheetName = deviceName.concat(suffixSpreadsheet).concat(suffix);
		String xml = spreadParser.getSpreadsheet(spreadsheetDir,fileSpreadsheetName);
		String xsdFile = utils.getInstallDir() + "/config/schemas/" + busType.toLowerCase() + "/Workbook.xsd";

		p.setSpreadsheetParser(xml);
		spreadsheet = p.getWorksheets();
		if (!spreadValid.validate(xmlFile, xsdFile)) {
			String s = "Spreadsheet: " + fileSpreadsheetName + suffix + " is not a valid spreadsheet.";
			throw new RuntimeException(s);
		}
		System.out.println("Spreadsheet: " + fileSpreadsheetName + " has been validated.");

		table.initialize(spreadsheet);
		mainIndex = table.getSheetNum("Hardware Device");
		monitorIndex = table.getSheetNum("Monitor Point");
		controlIndex = table.getSheetNum("Control Point");
		archiveIndex = table.getSheetNum("Archive Property");
	
		//Table:
		String xmiTables = tmp.concat("tables.").concat(extension);	
		Resource resourceTables = container.createResource(URI.createURI(xmiTables));
		resourceTables.getContents().add(table);	
		try{
			resourceTables.save(options);
		}catch(IOException e){
			e.printStackTrace();
		}	

		util.setTables(table);

		//Util:
		String xmiUtils = tmp.concat("utils.").concat(extension);	
		Resource resourceUtils= container.createResource(URI.createURI(xmiUtils));
		resourceUtils.getContents().add(util);
		try{
			resourceUtils.save(options);
		}catch(IOException e){
			e.printStackTrace();
		}	

		// Get the Notes
		String xmiNote = tmp.concat("notes.").concat(extension);		
		for (i = 3; i < spreadsheet[mainIndex].length; i++) {
			Note note = baseFactory.createNote();
			notes = container.createResource(URI.createURI(xmiNote));
			note.setNote(spreadsheet[mainIndex][i][descriptionIndex]);
			notes.getContents().add(note);
			try{
				notes.save(options);
			}catch(IOException e){
				e.printStackTrace();
			}	
		}
		
		//Get the Main
		String xmiMain = tmp.concat("main.").concat(extension);		
		mainEth = ethFactory.createMain();
		mainEth.setMainEth(spreadsheet[mainIndex][2], table, util);
		main = container.createResource(URI.createURI(xmiMain));
		main.getContents().add(mainEth);
		try{
			main.save(options);
		}catch(IOException e){
			e.printStackTrace();
		}
	
		// Get the monitor points
		Monitor mparent = null;
		String xmiMonitorPoints = tmp.concat("monitorPoints.").concat(extension);
		monitorPoints = container.createResource(URI.createURI(xmiMonitorPoints));
		for (i = 2; i < spreadsheet[monitorIndex].length; ++i) {
			if(spreadsheet[monitorIndex][i].length == 0)
				break;
			Monitor mp;
			String[] row = spreadsheet[monitorIndex][i];
			if(!spreadsheet[monitorIndex][i][0].startsWith(table.getDepChar())){
				mp = ethFactory.createMonitor();
				mp.setMonitorEth(row, null, table, util, deviceDir);
				mparent = mp;
			}else{
				mp = ethFactory.createMonitor();
				mp.setMonitorEth(row, mparent, table, util, deviceDir);
				mparent.addDependent(mp);
			}
			setDeviceModel(table,util);
			mp.setArchive(getArchiveProperties(mp.FullName()));
			//FIXME
			mp.setAssemblyName(mainEth.Assembly());
			monitorPoints.getContents().add(mp);
			try{
				monitorPoints.save(options);
			}catch(IOException e){
				e.printStackTrace();
			}		
		}
		
		// Get the control points
		Control cparent = null;
		String xmiControlPoints = tmp.concat("controlPoints.").concat(extension);
		controlPoints = container.createResource(URI.createURI(xmiControlPoints));
		for (i = 2; i < spreadsheet[controlIndex].length; ++i) {
			if(spreadsheet[controlIndex][i].length == 0)
				break;
			Control cp;
			String[] row = spreadsheet[controlIndex][i];
			if(!spreadsheet[controlIndex][i][0].startsWith(table.getDepChar())){
				cp = ethFactory.createControl();
				cp.setControlEth(row, null, table, util, deviceDir);
				cparent = cp;
			}else{
				cp = ethFactory.createControl();
				cp.setControlEth(row, cparent, table, util, deviceDir);
				cparent.addDependent(cp);
			}
			cp.setArchive(getArchiveProperties(cp.FullName()));
			//FIXME
			cp.setAssemblyName(mainEth.Assembly());
			controlPoints.getContents().add(cp);
			try{
				controlPoints.save(options);
			}catch(IOException e){
				e.printStackTrace();
			}
		}

		//Get the Archive Properties
		String xmiArchiveProperties = tmp.concat("archiveproperties.").concat(extension);
		archiveProperties = container.createResource(URI.createURI(xmiArchiveProperties));
		for(i = 2; i < spreadsheet[archiveIndex].length; i++) {
			if(spreadsheet[archiveIndex][i].length == 0)
				break;
			Archive ap;
			String[] row = spreadsheet[archiveIndex][i];
			ap = ethFactory.createArchive();
			ap.setArchiveEth(row, table);
			archiveProperties.getContents().add(ap);
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
		return getMainEth().VendorClass();
	}
} //DeviceModelImpl
