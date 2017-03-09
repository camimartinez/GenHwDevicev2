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
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import alma.control.datamodel.meta.amb.AmbFactory;
import alma.control.datamodel.meta.amb.AmbPackage;
import alma.control.datamodel.meta.amb.Archive;
import alma.control.datamodel.meta.amb.Control;
import alma.control.datamodel.meta.amb.DeviceModel;
import alma.control.datamodel.meta.amb.GenericMonitorPoints;
import alma.control.datamodel.meta.amb.Monitor;
import alma.control.datamodel.meta.base.BaseFactory;
import alma.control.datamodel.meta.base.BasePackage;
import alma.control.datamodel.meta.base.ControlPoint;
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

		//Creation of instances base package
		Util util = baseFactory.createUtil();
		SpreadsheetParser spreadParser = baseFactory.createSpreadsheetParser();
		SpreadsheetParser p = baseFactory.createSpreadsheetParser();
		SpreadsheetValidator spreadValid = baseFactory.createSpreadsheetValidator();
		Table table = baseFactory.createTable();

		//Creation of instances of in amb package
		GenericMonitorPoints genericMPoints = ambFactory.createGenericMonitorPoints();
		main = ambFactory.createMain();
		
		// Register the XMI resource factory fot the .tmp extension
		Resource.Factory.Registry regis = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> mm = regis.getExtensionToFactoryMap();		
		String extension = "tmp";
		String tmp = deviceDir.concat("/").concat(extension).concat("/");
		mm.put(extension, new XMIResourceFactoryImpl());

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

		p.setInitializeSP(xml);
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
		
		ResourceSet tables = new ResourceSetImpl();
		String xmiTables = tmp.concat("tables.").concat(extension);	
		Resource resourceTables = tables.createResource(URI.createURI(xmiTables));

		resourceTables.getContents().add(table);
		try{
			resourceTables.save(Collections.EMPTY_MAP);
		}catch(IOException e){
			e.printStackTrace();
		}

		ResourceSet utils = new ResourceSetImpl();
		String xmiUtils = tmp.concat("utils.").concat(extension);	
		Resource resourceUtils= utils.createResource(URI.createURI(xmiUtils));

		resourceUtils.getContents().add(util);
		
		try{
			resourceUtils.save(Collections.EMPTY_MAP);
		}catch(IOException e){
			e.printStackTrace();
		}
		
		if(spreadsheet[mainIndex][2][table.getColNum(mainIndex,"Generic Monitor Points")].equals("yes")){
			String[][][] spreadsheetWithGenericPointsAdded;
			spreadsheetWithGenericPointsAdded = genericMPoints.getDeviceWorksheetWithGenericPointsAdded(spreadsheet);
			spreadsheet = spreadsheetWithGenericPointsAdded;
		}

		//printAttributeValues(tab);

		// Get the Main
		main.setTable(table);
		main.setUtil(util);
		main.setInitializeMB(spreadsheet[mainIndex][2]);

		// Get the Notes
		notes = new ResourceSetImpl();	
		String xmiNote = tmp.concat("notes.").concat(extension);		
		Resource resourceNote = notes.createResource(URI.createURI(xmiNote));

		for (i = 3; i < spreadsheet[mainIndex].length; i++) {
			Note note = baseFactory.createNote();
			note.setNote(spreadsheet[mainIndex][i][descriptionIndex]);
			resourceNote.getContents().add(note);
			try{
				resourceNote.save(Collections.EMPTY_MAP);
			}catch(IOException e){
				e.printStackTrace();
			}
		}
			
		// Get the monitor points
		Monitor mparent = null;
		monitorPoints = new ResourceSetImpl();
		String xmiMonitorPoints = tmp.concat("monitorPoints.").concat(extension);	
		Resource monitorResource = monitorPoints.createResource(URI.createURI(xmiMonitorPoints));

		/*
		ResourceSet resourceSetMparent = new ResourceSetImpl();
		String xmiMPparent = tmp.concat("mpParent.").concat(extension);	
		Resource resourceMparent = resourceSetMparent.createResource(URI.createURI(xmiMPparent));


		ResourceSet resourceSetMp = new ResourceSetImpl();
		String xmiMp = tmp.concat("mp.").concat(extension);	
		Resource resourceMp = resourceSetMp.createResource(URI.createURI(xmiMp));
		*/
		
		for (i = 2; i < spreadsheet[monitorIndex].length; i++) {
			if(spreadsheet[monitorIndex][i].length == 0)
				break;
			Monitor mp;
			String[] row = spreadsheet[monitorIndex][i];
			if(!spreadsheet[monitorIndex][i][1].startsWith(table.getDepChar())){
				mp = ambFactory.createMonitor();
				mp.setTable(main.getTable());
				mp.setUtil(main.getUtil());
				mp.setInitializeMImpl(row, null);
				mparent = mp;
			}else{
				mp = ambFactory.createMonitor();
				mp.setTable(main.getTable());
				mp.setUtil(main.getUtil());
				mp.setInitializeMImpl(row, mparent.eResource());
				//monitorResource.getContents().add(mp);
				mparent.addDependent(mp);	
			}
			//printAttributeValues(table);
			
			
			ResourceSet tryi = new ResourceSetImpl();
			
			Resource resource = tryi.createResource(URI.createDeviceURI(""));

					
			// FIXME: fix the method 			
			//mp.setArchive(getArchive(mp.FullName()));
			monitorResource.getContents().add(mp);
			try{
				monitorResource.save(Collections.EMPTY_MAP);
			}catch(IOException e){
				e.printStackTrace();
			}			
			//Arreglar:

			//mp.setArchive(getArchive(mp.FullName()));
			/*
			monitorPoints.getResources().addAll(c);
			//resourcemp.getContents().add(mp);
			monitorRes.getContents().add(mp);
			try{
				monitorRes.save(Collections.EMPTY_MAP);
			}catch(IOException e){
				System.out.println("error en guardar monitorRes");
				//e.printStackTrace();
			}	
			*/
		}

		/*
		// Define undefined dependent monitor points for sequence properties

		List<EObject> listMP = monitorRes.getContents();
		MonitorImpl[] arrayMP = listMP.toArray( new MonitorImpl[0]);

		ResourceSet resourceSetImp = new ResourceSetImpl();
		Resource resourceImp = resourceSetImp.createResource(URI.createURI(""));

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
					Monitor dep = ambFactory.createMonitor();
					dep.setTable(main.getTable());
					dep.setUtil(main.getUtil());
					dep.setInitializeMImpl(row, resourceImp);
					mp.addDependent(resourceImp);

					//Arreglar:
					//dep.setArchive(getArchive(dep.FullName()));
					
					//resourcemp.getContents().add(mp);

					monitorRes.getContents().add(dep);
				}
		}

		// Get the control points
		Control cparent = ambFactory.createControl();
		cparent = null;
		controlPoints = new ResourceSetImpl();
		Resource controlRes = controlPoints.createResource(URI.createURI(""));

		ResourceSet resourceSetCparent = new ResourceSetImpl();
		Resource resourceCparent  = resourceSetCparent.createResource(URI.createURI(""));

		ResourceSet resourceSetCp = new ResourceSetImpl();
		Resource resourceCp = resourceSetCp.createResource(URI.createURI(""));

		for (i = 2; i < spreadsheet[controlIndex].length; ++i) {
			if(spreadsheet[controlIndex][i].length == 0)
				break;
			Control cp;
			String[] row = spreadsheet[controlIndex][i];
			if(!spreadsheet[controlIndex][i][1].startsWith(table.getDepChar())){
				cp = ambFactory.createControl();
				cp.setTable(main.getTable());
				cp.setUtil(main.getUtil());
				cp.setInitializeCImpl(row, null);
				cparent = cp;
				resourceCparent.getContents().add(cparent);
			}else{
				cp = ambFactory.createControl();
				cp.setTable(main.getTable());
				cp.setUtil(main.getUtil());
				cp.setInitializeCImpl(row, resourceCparent);
				resourceCp.getContents().add(cp);
				cparent.addDependent(resourceCp);
			}
			//Arreglar
			//cp.setArchive(getArchive(cp.FullName()));
			
			//resourcecp.getContents().add(cp);

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
			ap = ambFactory.createArchive();
			ap.setTable(main.getTable());
			ap.setInitializeAImpl(row);
			MonitorPoint mp = getMonitorPoint(ap.RefersTo());
			if (mp != null)
				ap.setMP(mp.eResource());
			ControlPoint cp = getControlPoint(ap.RefersTo());
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
	 * @!generated
	 */
	public String TheEnd() {
		Object object = EcoreUtil.getObjectByType(eAdapters(), BasePackage.Literals.UTIL);
		if(object instanceof Util){
			Util util = (Util)object;
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
		}else{
			System.out.println("There is no instance of class Util in: amb/DeviceModelImpl");
			return "There is no instance of class Util in: amb/DeviceModelImpl";
		}

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
