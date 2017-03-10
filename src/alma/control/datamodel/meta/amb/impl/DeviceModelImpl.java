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

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import alma.control.datamodel.meta.amb.AmbFactory;
import alma.control.datamodel.meta.amb.AmbPackage;
import alma.control.datamodel.meta.amb.DeviceModel;
import alma.control.datamodel.meta.amb.GenericMonitorPoints;
import alma.control.datamodel.meta.amb.Main;
import alma.control.datamodel.meta.base.BaseFactory;
import alma.control.datamodel.meta.base.BasePackage;
import alma.control.datamodel.meta.base.MonitorPoint;
import alma.control.datamodel.meta.base.Note;
import alma.control.datamodel.meta.base.SpreadsheetParser;
import alma.control.datamodel.meta.base.SpreadsheetValidator;
import alma.control.datamodel.meta.base.Table;
import alma.control.datamodel.meta.base.Util;

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

		//Base Package and Factory instances
		BasePackage.eINSTANCE.eClass();
		BaseFactory baseFactory = BaseFactory.eINSTANCE;		

		//Amb Package and Factory instances
		AmbPackage.eINSTANCE.eClass();
		AmbFactory ambFactory = AmbFactory.eINSTANCE;

		//Creation 
		
		Util util = baseFactory.createUtil();

		SpreadsheetParser spreadParser = baseFactory.createSpreadsheetParser();
		SpreadsheetParser p = baseFactory.createSpreadsheetParser();
		SpreadsheetValidator spreadValid = baseFactory.createSpreadsheetValidator();
		Table table = baseFactory.createTable();

		//Creation of instances of in amb package
		GenericMonitorPoints genericMPoints = ambFactory.createGenericMonitorPoints();

		// Register the XMI resource factory for the .xmi extension
		Resource.Factory.Registry regis = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> mm = regis.getExtensionToFactoryMap();		
		String extension = "xmi";
		String tmp = deviceDir.concat("/").concat(extension).concat("/");
		mm.put(extension, new XMIResourceFactoryImpl());

		Map<String, Boolean> options = new HashMap<String, Boolean>();
		options.put(XMLResource.OPTION_SAVE_ONLY_IF_CHANGED, Boolean.TRUE);

		container = new ResourceSetImpl();

		// Check if the spreadsheet file is an actual spreadsheet or a
		// "filter" file which is some kind of a filter for a real
		// spreadsheet but inherits from it.
		String xmlFile = spreadsheetDir + "/" + deviceName + suffixSpreadsheet;
		String suffix = "filter";
		java.io.File fileExists = new java.io.File(xmlFile + suffix);
		if(fileExists.exists() == false){
			// The blah.filter file does not exist, so assume that the file is an XML file.
			suffix = "xml";
		}

		xmlFile += suffix;
		String fileSpreadsheetName = deviceName.concat(suffixSpreadsheet).concat(suffix);
		String xml = spreadParser.getSpreadsheet(spreadsheetDir, fileSpreadsheetName);		
		String xsdFile = util.getInstallDir()+ "/config/schemas/" + busType.toLowerCase() + "/Workbook.xsd";

		p.setSpreadsheetParser(xml);
		p.setXSD(xsdFile);
		spreadsheet = p.getWorksheets();

		if (!p.isReference() && !spreadValid.validate(xmlFile, xsdFile)) {
			String s = "Spreadsheet: " + fileSpreadsheetName + " is not a valid spreadsheet.";
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
		
		//Util:
		String xmiUtils = tmp.concat("utils.").concat(extension);	
		Resource resourceUtils= container.createResource(URI.createURI(xmiUtils));
		resourceUtils.getContents().add(util);
		try{
			resourceUtils.save(options);
		}catch(IOException e){
			e.printStackTrace();
		}	
		
		if(spreadsheet[mainIndex][2][table.getColNum(mainIndex,"Generic Monitor Points")].equals("yes")){
			String[][][] spreadsheetWithGenericPointsAdded;
			spreadsheetWithGenericPointsAdded = genericMPoints.getDeviceWorksheetWithGenericPointsAdded(spreadsheet);
			spreadsheet = spreadsheetWithGenericPointsAdded;
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
		//FIXME
		String xmiMain = tmp.concat("main.").concat(extension);		
		Main main2 = ambFactory.createMain();
		main2.setMainAmb(spreadsheet[mainIndex][2]);
	
		printAttributeValues(main2);
		
		Resource resourceMain = container.createResource(URI.createURI(xmiMain));
		resourceMain.getContents().add(main2);
		
		/*
		// Get the monitor points
		Monitor mparent = null;
		//monitorPoints = new ResourceSetImpl();
		String xmiMonitorPoints = tmp.concat("monitorPoints.").concat(extension);
		monitorPoints = container.createResource(URI.createURI(xmiMonitorPoints));

		for (i = 2; i < spreadsheet[monitorIndex].length; i++) {
			if(spreadsheet[monitorIndex][i].length == 0)
				break;
			Monitor mp;
			String[] row = spreadsheet[monitorIndex][i];
			if(!spreadsheet[monitorIndex][i][1].startsWith(table.getDepChar())){
				mp = ambFactory.createMonitor();
				//Resource mParentResource = containerResource.createResource(URI.createURI(xmiMonitorPoints));
				// FIXME
				//mp.setTables(table);
				//mp.setUtils(util);
				mp.setMonitorPoint(row, null);
				mparent = mp;
			}else{
				mp = ambFactory.createMonitor();
				//Resource mpResource = containerResource.createResource(URI.createURI(xmiMonitorPoints));
				//mp.setTables(table);
				//mp.setUtils(util);
				mp.setMonitorPoint(row, mparent);
				mparent.addDependent(mp);	
			}						
			mp.setArchive(getArchiveProperties(mp.FullName()));		
			monitorPoints.getContents().add(mp);	
			try{
				monitorPoints.save(options);
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	
		// Define undefined dependent monitor points for sequence properties
		List<EObject> listMP = monitorPoints.getContents();
		MonitorImpl[] arrayMP = listMP.toArray( new MonitorImpl[0]);
		System.out.println("size of array is: "+arrayMP.length+"");
	
		
		for (Monitor mp : arrayMP) {
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
					//Monitor dep = ambFactory.createMonitor();
					//Resource depMPResource = monitorPoints.createResource(URI.createURI(xmiMonitorPoints));
					//dep.setDevices(this);		
					//dep.setInitializeMImpl(row, mp.eResource());
					//depMPResource.getContents().add(dep);
					//mp.addDependent(dep.eResource());
					//dep.setArchive(getArchive(dep.FullName()));
					//monitorResource.getContents().add(dep);							
					//try{
					//	monitorResource.save(Collections.EMPTY_MAP);
					//}catch(IOException e){
					//	e.printStackTrace();
					//}

				}
		}

		
		// Get the control points
		Control cparent = null;
		controlPoints = new ResourceSetImpl();

		String xmiControlPoints = tmp.concat("controlPoints.").concat(extension);


		//ResourceSet resourceSetCparent = new ResourceSetImpl();
		//Resource resourceCparent  = resourceSetCparent.createResource(URI.createURI(""));

		//ResourceSet resourceSetCp = new ResourceSetImpl();
		//Resource resourceCp = resourceSetCp.createResource(URI.createURI(""));
		Resource controlResource = controlPoints.createResource(URI.createURI(xmiControlPoints));

		for (i = 2; i < spreadsheet[controlIndex].length; ++i) {
			if(spreadsheet[controlIndex][i].length == 0)
				break;
			Control cp;
			String[] row = spreadsheet[controlIndex][i];
			if(!spreadsheet[controlIndex][i][1].startsWith(table.getDepChar())){
				cp = ambFactory.createControl();
				Resource cParentResource = controlPoints.createResource(URI.createURI(xmiControlPoints));
				cp.setDevices(this);	
				cp.setInitializeCImpl(row, null);
				cparent = cp;
				cParentResource.getContents().add(cparent);
			}else{
				cp = ambFactory.createControl();
				Resource cpResource = controlPoints.createResource(URI.createURI(xmiControlPoints));
				cp.setDevices(this);
				cp.setInitializeCImpl(row, cparent.eResource());
				cpResource.getContents().add(cp);
				cparent.addDependent(cp.eResource());
			}	
			//setControlPoint(cp);
			cp.setArchive(getArchive(cp.FullName()));
			controlResource.getContents().add(cp);
			//try{
			//	controlResource.save(Collections.EMPTY_MAP);
			//}catch(IOException e){
			//	e.printStackTrace();
			//}
		}

		//Get the Archive Properties
		archiveProperties = new ResourceSetImpl();	
		String xmiArchiveProperties = tmp.concat("archiveproperties.").concat(extension);
		Resource archivePropResource = archiveProperties.createResource(URI.createURI(xmiArchiveProperties));

		for(i = 2; i < spreadsheet[archiveIndex].length; i++) {
			if(spreadsheet[archiveIndex][i].length == 0)
				break;
			Archive ap;
			String[] row = spreadsheet[archiveIndex][i];
			ap = ambFactory.createArchive();
			Resource apResouce = archiveProperties.createResource(URI.createURI(xmiArchiveProperties));
			ap.setDevices(this);
			ap.setInitializeAImpl(row);
			apResouce.getContents().add(ap);

			MonitorPoint mp = getMonitorPoint(ap.RefersTo());

			Resource mpRes = archiveProperties.createResource(URI.createURI(xmiArchiveProperties));
			mpRes.getContents().add(mp);
			if (mp != null){
				ap.setMP(mp.eResource());
				apResouce.getContents().add(ap);
			}else{
				ControlPoint cp = getControlPoint(ap.RefersTo());
				Resource cpRes = archiveProperties.createResource(URI.createURI(xmiArchiveProperties));
				if (cp != null){
					ap.setCP(cp.eResource());
					cpRes.getContents().add(cp);
				}

			}

			archivePropResource.getContents().add(ap);

			//try{
			//	archivePropResource.save(Collections.EMPTY_MAP);
			//}catch(IOException e){
			//	e.printStackTrace();
			//}
		}

		 */
		System.out.println("DeviceModel: Initialization complete.");
		return "";
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	//Print the values of the class, to test the objects
	public static void printAttributeValues(EObject object) {
		EClass eClass = object.eClass();
		System.out.println(eClass.getName());
		for (Iterator iter = eClass.getEAllAttributes().iterator(); iter.hasNext(); ) {
			EAttribute attribute = (EAttribute)iter.next();
			Object value = object.eGet(attribute);

			System.out.print("  " + attribute.getName() + " : ");
			if (object.eIsSet(attribute))
				System.out.println(value);
			else
				System.out.println(value + " (default)");
		}
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

	@Override
	public MonitorPoint getMonitorPoint(String fullName) {
		// TODO Auto-generated method stub
		return null;
	}

} //DeviceModelImpl
