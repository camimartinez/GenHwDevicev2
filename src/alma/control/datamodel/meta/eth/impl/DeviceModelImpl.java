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
import alma.control.datamodel.meta.eth.Main;
import alma.control.datamodel.meta.eth.Monitor;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alma.control.datamodel.meta.eth.impl.DeviceModelImpl#getMainEth <em>Main Eth</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.eth.impl.DeviceModelImpl#getCPointsList <em>CPoints</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.eth.impl.DeviceModelImpl#getAPointsList <em>APoints</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.eth.impl.DeviceModelImpl#getMPointsList <em>MPoints</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.eth.impl.DeviceModelImpl#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceModelImpl extends alma.control.datamodel.meta.base.impl.DeviceModelImpl implements DeviceModel {
	/**
	 * The cached value of the '{@link #getMainEth() <em>Main Eth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainEth()
	 * @generated
	 * @ordered
	 */
	protected Main mainEth;

	/**
	 * The cached value of the '{@link #getCPointsList() <em>CPoints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPointsList()
	 * @generated
	 * @ordered
	 */
	protected EList<Control> cPoints;

	/**
	 * The empty value for the '{@link #getCPoints() <em>CPoints</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPoints()
	 * @generated
	 * @ordered
	 */
	protected static final Control[] CPOINTS_EEMPTY_ARRAY = new Control [0];

	/**
	 * The cached value of the '{@link #getAPointsList() <em>APoints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPointsList()
	 * @generated
	 * @ordered
	 */
	protected EList<Archive> aPoints;

	/**
	 * The empty value for the '{@link #getAPoints() <em>APoints</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPoints()
	 * @generated
	 * @ordered
	 */
	protected static final Archive[] APOINTS_EEMPTY_ARRAY = new Archive [0];

	/**
	 * The cached value of the '{@link #getMPointsList() <em>MPoints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMPointsList()
	 * @generated
	 * @ordered
	 */
	protected EList<Monitor> mPoints;

	/**
	 * The empty value for the '{@link #getMPoints() <em>MPoints</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMPoints()
	 * @generated
	 * @ordered
	 */
	protected static final Monitor[] MPOINTS_EEMPTY_ARRAY = new Monitor [0];

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected Note note;

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
	 * @generated
	 */
	public Main getMainEth() {
		if (mainEth != null && mainEth.eIsProxy()) {
			InternalEObject oldMainEth = (InternalEObject)mainEth;
			mainEth = (Main)eResolveProxy(oldMainEth);
			if (mainEth != oldMainEth) {
				InternalEObject newMainEth = (InternalEObject)mainEth;
				NotificationChain msgs = oldMainEth.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EthPackage.DEVICE_MODEL__MAIN_ETH, null, null);
				if (newMainEth.eInternalContainer() == null) {
					msgs = newMainEth.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EthPackage.DEVICE_MODEL__MAIN_ETH, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EthPackage.DEVICE_MODEL__MAIN_ETH, oldMainEth, mainEth));
			}
		}
		return mainEth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Main basicGetMainEth() {
		return mainEth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMainEth(Main newMainEth, NotificationChain msgs) {
		Main oldMainEth = mainEth;
		mainEth = newMainEth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EthPackage.DEVICE_MODEL__MAIN_ETH, oldMainEth, newMainEth);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainEth(Main newMainEth) {
		if (newMainEth != mainEth) {
			NotificationChain msgs = null;
			if (mainEth != null)
				msgs = ((InternalEObject)mainEth).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EthPackage.DEVICE_MODEL__MAIN_ETH, null, msgs);
			if (newMainEth != null)
				msgs = ((InternalEObject)newMainEth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EthPackage.DEVICE_MODEL__MAIN_ETH, null, msgs);
			msgs = basicSetMainEth(newMainEth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EthPackage.DEVICE_MODEL__MAIN_ETH, newMainEth, newMainEth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Control[] getCPoints() {
		if (cPoints == null || cPoints.isEmpty()) return CPOINTS_EEMPTY_ARRAY;
		BasicEList<Control> list = (BasicEList<Control>)cPoints;
		list.shrink();
		return (Control[])list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Control getCPoints(int index) {
		return getCPointsList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCPointsLength() {
		return cPoints == null ? 0 : cPoints.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCPoints(Control[] newCPoints) {
		((BasicEList<Control>)getCPointsList()).setData(newCPoints.length, newCPoints);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCPoints(int index, Control element) {
		getCPointsList().set(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Control> getCPointsList() {
		if (cPoints == null) {
			cPoints = new EObjectContainmentEList.Resolving<Control>(Control.class, this, EthPackage.DEVICE_MODEL__CPOINTS);
		}
		return cPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Archive[] getAPoints() {
		if (aPoints == null || aPoints.isEmpty()) return APOINTS_EEMPTY_ARRAY;
		BasicEList<Archive> list = (BasicEList<Archive>)aPoints;
		list.shrink();
		return (Archive[])list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Archive getAPoints(int index) {
		return getAPointsList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAPointsLength() {
		return aPoints == null ? 0 : aPoints.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPoints(Archive[] newAPoints) {
		((BasicEList<Archive>)getAPointsList()).setData(newAPoints.length, newAPoints);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPoints(int index, Archive element) {
		getAPointsList().set(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Archive> getAPointsList() {
		if (aPoints == null) {
			aPoints = new EObjectContainmentEList.Resolving<Archive>(Archive.class, this, EthPackage.DEVICE_MODEL__APOINTS);
		}
		return aPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Monitor[] getMPoints() {
		if (mPoints == null || mPoints.isEmpty()) return MPOINTS_EEMPTY_ARRAY;
		BasicEList<Monitor> list = (BasicEList<Monitor>)mPoints;
		list.shrink();
		return (Monitor[])list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Monitor getMPoints(int index) {
		return getMPointsList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMPointsLength() {
		return mPoints == null ? 0 : mPoints.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMPoints(Monitor[] newMPoints) {
		((BasicEList<Monitor>)getMPointsList()).setData(newMPoints.length, newMPoints);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMPoints(int index, Monitor element) {
		getMPointsList().set(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Monitor> getMPointsList() {
		if (mPoints == null) {
			mPoints = new EObjectContainmentEList.Resolving<Monitor>(Monitor.class, this, EthPackage.DEVICE_MODEL__MPOINTS);
		}
		return mPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Note getNote() {
		if (note != null && note.eIsProxy()) {
			InternalEObject oldNote = (InternalEObject)note;
			note = (Note)eResolveProxy(oldNote);
			if (note != oldNote) {
				InternalEObject newNote = (InternalEObject)note;
				NotificationChain msgs = oldNote.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EthPackage.DEVICE_MODEL__NOTE, null, null);
				if (newNote.eInternalContainer() == null) {
					msgs = newNote.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EthPackage.DEVICE_MODEL__NOTE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EthPackage.DEVICE_MODEL__NOTE, oldNote, note));
			}
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Note basicGetNote() {
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNote(Note newNote, NotificationChain msgs) {
		Note oldNote = note;
		note = newNote;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EthPackage.DEVICE_MODEL__NOTE, oldNote, newNote);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNote(Note newNote) {
		if (newNote != note) {
			NotificationChain msgs = null;
			if (note != null)
				msgs = ((InternalEObject)note).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EthPackage.DEVICE_MODEL__NOTE, null, msgs);
			if (newNote != null)
				msgs = ((InternalEObject)newNote).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EthPackage.DEVICE_MODEL__NOTE, null, msgs);
			msgs = basicSetNote(newNote, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EthPackage.DEVICE_MODEL__NOTE, newNote, newNote));
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
		Util util = baseFactory.createUtil();

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
	
		xmlFile += suffix;
		String fileSpreadsheetName = deviceName.concat(suffixSpreadsheet).concat(suffix);
		String xml = spreadParser.getSpreadsheet(spreadsheetDir,fileSpreadsheetName);
		String xsdFile = util.getInstallDir() + "/config/schemas/" + busType.toLowerCase() + "/Workbook.xsd";

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
	
		util.setTables(table);
		super.setTables(table);
		super.setUtils(util);
		
		container = new ResourceSetImpl();
		// Get the Notes
		notes = container.createResource(URI.createURI(""));
		for (i = 3; i < spreadsheet[mainIndex].length; i++) {
			note = baseFactory.createNote();
			note.setNote(spreadsheet[mainIndex][i][descriptionIndex]);
			notes.getContents().add(note);
			container.getResources().add(notes);
		}	
		
		//Get the Main
		main = ethFactory.createMain();
		main.setMainBase(table, util);
		main.setMainBase(spreadsheet[mainIndex][2]);
		
		// Get all independent monitor points
		Monitor mparent = null;
		monitorPoints = container.createResource(URI.createURI(""));
		for (i = 2; i < spreadsheet[monitorIndex].length; i++) {
			if(spreadsheet[monitorIndex][i].length == 0)
				break;
			Monitor mp;
			String[] row = spreadsheet[monitorIndex][i];
			if(!spreadsheet[monitorIndex][i][0].startsWith(table.getDepChar())){
				mp = ethFactory.createMonitor();
				mp.setMonitorEth(table, util);
				mp.setMonitorEth(row, null);
				mparent = mp;
			}else{
				mp = ethFactory.createMonitor();
				mp.setMonitorEth(table, util);
				mp.setMonitorEth(row, mparent);
				mparent.addDependent(mp);
			}
			mp.setArchiveProp(getArchiveProp(mp.FullName()));
			mp.setAssemblyName(main.Assembly());
			getMPointsList().add(mparent);
		}
		
		EList<Monitor> parentsMP = new BasicEList<Monitor>();
		parentsMP.addAll(getMPointsList());
		getMPointsList().clear();
				
		//Get all dependent monitor points
		for (i = 2; i < spreadsheet[monitorIndex].length; i++) {
			if(spreadsheet[monitorIndex][i].length == 0)
				break;
			Monitor mp;
			String[] row = spreadsheet[monitorIndex][i];
			if(!spreadsheet[monitorIndex][i][0].startsWith(table.getDepChar())){
				mp = ethFactory.createMonitor();
				mp.setMonitorEth(table, util);
				mp.setMonitorEth(row, null);
				mparent = mp;
				mp.setArchiveProp(getArchiveProp(mp.FullName()));
				mp.setAssemblyName(main.Assembly());
			}else{
				mp = ethFactory.createMonitor();
				mp.setMonitorEth(table, util);
				mp.setMonitorEth(row, mparent);
				mparent.addDependent(mp);
				mp.setArchiveProp(getArchiveProp(mp.FullName()));
				mp.setAssemblyName(main.Assembly());
				getMPointsList().add(mp);
			}
		}
		
		EList<Monitor> dependentMP = new BasicEList<Monitor>();
		dependentMP.addAll(getMPointsList());
		getMPointsList().clear();

		//Since we get all the dependent and independent monitor point 
		//separately it is necessary sort them
		for(int j=0; j<parentsMP.size();j++){
			Monitor	tmp = parentsMP.get(j);
			if(!tmp.hasDependents()){
				getMPointsList().add(tmp);
			}else{
				String name = tmp.MPName();
				getMPointsList().add(tmp);
				for(int n=0; n<dependentMP.size();n++){
					Monitor	tmp2 = dependentMP.get(n);
					if(name.equals(tmp2.GetDependsOnName())){
						getMPointsList().add(tmp2);
					}
				}//end for dependentMP
			}//end else		
		}//end for parentsMP
		monitorPoints.getContents().removeAll(dependentMP);
    	monitorPoints.getContents().removeAll(parentsMP);
		monitorPoints.getContents().removeAll(mPoints);
		
		monitorPoints.getContents().addAll(getMPointsList());
		container.getResources().add(monitorPoints);
		
		// Get all independent control points
		Control cparent = null;
		controlPoints = container.createResource(URI.createURI(""));
		for (i = 2; i < spreadsheet[controlIndex].length; ++i) {
			if(spreadsheet[controlIndex][i].length == 0)
				break;
			Control cp;
			String[] row = spreadsheet[controlIndex][i];
			if(!spreadsheet[controlIndex][i][0].startsWith(table.getDepChar())){
				cp = ethFactory.createControl();
				cp.setControlEth(table, util);
				cp.setControlEth(row, null);
				cparent = cp;
			}else{
				cp = ethFactory.createControl();
				cp.setControlEth(table, util);
				cp.setControlEth(row, cparent);
				cparent.addDependent(cp);
			}
			cp.setArchiveProp(getArchiveProp(cp.FullName()));
			cp.setAssemblyName(main.Assembly());
			getCPointsList().add(cparent);
		}
		
		EList<Control> parentsCP = new BasicEList<Control>();
		parentsCP.addAll(getCPointsList());
		getCPointsList().clear();
		
		// Get all dependent control points
		for (i = 2; i < spreadsheet[controlIndex].length; ++i) {
			if(spreadsheet[controlIndex][i].length == 0)
				break;
			Control cp;
			String[] row = spreadsheet[controlIndex][i];
			if(!spreadsheet[controlIndex][i][0].startsWith(table.getDepChar())){
				cp = ethFactory.createControl();
				cp.setControlEth(table, util);
				cp.setControlEth(row, null);
				cparent = cp;
				cp.setArchiveProp(getArchiveProp(cp.FullName()));
				cp.setAssemblyName(main.Assembly());
			}else{
				cp = ethFactory.createControl();
				cp.setControlEth(table, util);
				cp.setControlEth(row, cparent);
				cparent.addDependent(cp);
				cp.setArchiveProp(getArchiveProp(cp.FullName()));
				cp.setAssemblyName(main.Assembly());
				getCPointsList().add(cp);
			}
		}
		
		EList<Control> dependentCP = new BasicEList<Control>();
		dependentCP.addAll(getCPointsList());
		getCPointsList().clear();

		//Since we get all the dependent and independent control point 
		//separately it is necessary sort them
		for(int j=0; j<parentsCP.size();j++){
			Control	tmp = parentsCP.get(j);
			if(!tmp.hasDependents()){
				getCPointsList().add(tmp);
			}else{
				String name = tmp.CPName();
				getCPointsList().add(tmp);
				for(int n=0; n<dependentCP.size();n++){
					Control	tmp2 = dependentCP.get(n);
					if(name.equals(tmp2.GetDependsOnName())){
						getCPointsList().add(tmp2);
					}
				}//end for dependentCP
			}//end else		
		}//end for parentsCP
		controlPoints.getContents().removeAll(dependentCP);
		controlPoints.getContents().removeAll(parentsCP);
		controlPoints.getContents().removeAll(cPoints);

		controlPoints.getContents().addAll(getCPointsList());
		container.getResources().add(controlPoints);
		
		//Get the Archive Properties
		archiveProperties = container.createResource(URI.createURI(""));
		for(i = 2; i < spreadsheet[archiveIndex].length; i++) {
			if(spreadsheet[archiveIndex][i].length == 0)
				break;
			Archive ap;
			String[] row = spreadsheet[archiveIndex][i];
			ap = ethFactory.createArchive();
			ap.setArchiveEth(row, table);
			getAPointsList().add(ap);
		}
		archiveProperties.getContents().addAll(getAPointsList());
		container.getResources().add(archiveProperties);
		
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EthPackage.DEVICE_MODEL__MAIN_ETH:
				return basicSetMainEth(null, msgs);
			case EthPackage.DEVICE_MODEL__CPOINTS:
				return ((InternalEList<?>)getCPointsList()).basicRemove(otherEnd, msgs);
			case EthPackage.DEVICE_MODEL__APOINTS:
				return ((InternalEList<?>)getAPointsList()).basicRemove(otherEnd, msgs);
			case EthPackage.DEVICE_MODEL__MPOINTS:
				return ((InternalEList<?>)getMPointsList()).basicRemove(otherEnd, msgs);
			case EthPackage.DEVICE_MODEL__NOTE:
				return basicSetNote(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EthPackage.DEVICE_MODEL__MAIN_ETH:
				if (resolve) return getMainEth();
				return basicGetMainEth();
			case EthPackage.DEVICE_MODEL__CPOINTS:
				return getCPointsList();
			case EthPackage.DEVICE_MODEL__APOINTS:
				return getAPointsList();
			case EthPackage.DEVICE_MODEL__MPOINTS:
				return getMPointsList();
			case EthPackage.DEVICE_MODEL__NOTE:
				if (resolve) return getNote();
				return basicGetNote();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EthPackage.DEVICE_MODEL__MAIN_ETH:
				setMainEth((Main)newValue);
				return;
			case EthPackage.DEVICE_MODEL__CPOINTS:
				getCPointsList().clear();
				getCPointsList().addAll((Collection<? extends Control>)newValue);
				return;
			case EthPackage.DEVICE_MODEL__APOINTS:
				getAPointsList().clear();
				getAPointsList().addAll((Collection<? extends Archive>)newValue);
				return;
			case EthPackage.DEVICE_MODEL__MPOINTS:
				getMPointsList().clear();
				getMPointsList().addAll((Collection<? extends Monitor>)newValue);
				return;
			case EthPackage.DEVICE_MODEL__NOTE:
				setNote((Note)newValue);
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
			case EthPackage.DEVICE_MODEL__MAIN_ETH:
				setMainEth((Main)null);
				return;
			case EthPackage.DEVICE_MODEL__CPOINTS:
				getCPointsList().clear();
				return;
			case EthPackage.DEVICE_MODEL__APOINTS:
				getAPointsList().clear();
				return;
			case EthPackage.DEVICE_MODEL__MPOINTS:
				getMPointsList().clear();
				return;
			case EthPackage.DEVICE_MODEL__NOTE:
				setNote((Note)null);
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
			case EthPackage.DEVICE_MODEL__MAIN_ETH:
				return mainEth != null;
			case EthPackage.DEVICE_MODEL__CPOINTS:
				return cPoints != null && !cPoints.isEmpty();
			case EthPackage.DEVICE_MODEL__APOINTS:
				return aPoints != null && !aPoints.isEmpty();
			case EthPackage.DEVICE_MODEL__MPOINTS:
				return mPoints != null && !mPoints.isEmpty();
			case EthPackage.DEVICE_MODEL__NOTE:
				return note != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceModelImpl
