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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alma.control.datamodel.meta.eth.impl.DeviceModelImpl#getMainEth <em>Main Eth</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.eth.impl.DeviceModelImpl#getMonitor <em>Monitor</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.eth.impl.DeviceModelImpl#getControl <em>Control</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.eth.impl.DeviceModelImpl#getArchive <em>Archive</em>}</li>
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
	 * The cached value of the '{@link #getMonitor() <em>Monitor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitor()
	 * @generated
	 * @ordered
	 */
	protected Monitor monitor;

	/**
	 * The cached value of the '{@link #getControl() <em>Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControl()
	 * @generated
	 * @ordered
	 */
	protected Control control;

	/**
	 * The cached value of the '{@link #getArchive() <em>Archive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchive()
	 * @generated
	 * @ordered
	 */
	protected Archive archive;

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
	public Monitor getMonitor() {
		if (monitor != null && monitor.eIsProxy()) {
			InternalEObject oldMonitor = (InternalEObject)monitor;
			monitor = (Monitor)eResolveProxy(oldMonitor);
			if (monitor != oldMonitor) {
				InternalEObject newMonitor = (InternalEObject)monitor;
				NotificationChain msgs = oldMonitor.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EthPackage.DEVICE_MODEL__MONITOR, null, null);
				if (newMonitor.eInternalContainer() == null) {
					msgs = newMonitor.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EthPackage.DEVICE_MODEL__MONITOR, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EthPackage.DEVICE_MODEL__MONITOR, oldMonitor, monitor));
			}
		}
		return monitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Monitor basicGetMonitor() {
		return monitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMonitor(Monitor newMonitor, NotificationChain msgs) {
		Monitor oldMonitor = monitor;
		monitor = newMonitor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EthPackage.DEVICE_MODEL__MONITOR, oldMonitor, newMonitor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitor(Monitor newMonitor) {
		if (newMonitor != monitor) {
			NotificationChain msgs = null;
			if (monitor != null)
				msgs = ((InternalEObject)monitor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EthPackage.DEVICE_MODEL__MONITOR, null, msgs);
			if (newMonitor != null)
				msgs = ((InternalEObject)newMonitor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EthPackage.DEVICE_MODEL__MONITOR, null, msgs);
			msgs = basicSetMonitor(newMonitor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EthPackage.DEVICE_MODEL__MONITOR, newMonitor, newMonitor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Control getControl() {
		if (control != null && control.eIsProxy()) {
			InternalEObject oldControl = (InternalEObject)control;
			control = (Control)eResolveProxy(oldControl);
			if (control != oldControl) {
				InternalEObject newControl = (InternalEObject)control;
				NotificationChain msgs = oldControl.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EthPackage.DEVICE_MODEL__CONTROL, null, null);
				if (newControl.eInternalContainer() == null) {
					msgs = newControl.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EthPackage.DEVICE_MODEL__CONTROL, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EthPackage.DEVICE_MODEL__CONTROL, oldControl, control));
			}
		}
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Control basicGetControl() {
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControl(Control newControl, NotificationChain msgs) {
		Control oldControl = control;
		control = newControl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EthPackage.DEVICE_MODEL__CONTROL, oldControl, newControl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControl(Control newControl) {
		if (newControl != control) {
			NotificationChain msgs = null;
			if (control != null)
				msgs = ((InternalEObject)control).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EthPackage.DEVICE_MODEL__CONTROL, null, msgs);
			if (newControl != null)
				msgs = ((InternalEObject)newControl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EthPackage.DEVICE_MODEL__CONTROL, null, msgs);
			msgs = basicSetControl(newControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EthPackage.DEVICE_MODEL__CONTROL, newControl, newControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Archive getArchive() {
		if (archive != null && archive.eIsProxy()) {
			InternalEObject oldArchive = (InternalEObject)archive;
			archive = (Archive)eResolveProxy(oldArchive);
			if (archive != oldArchive) {
				InternalEObject newArchive = (InternalEObject)archive;
				NotificationChain msgs = oldArchive.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EthPackage.DEVICE_MODEL__ARCHIVE, null, null);
				if (newArchive.eInternalContainer() == null) {
					msgs = newArchive.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EthPackage.DEVICE_MODEL__ARCHIVE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EthPackage.DEVICE_MODEL__ARCHIVE, oldArchive, archive));
			}
		}
		return archive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Archive basicGetArchive() {
		return archive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArchive(Archive newArchive, NotificationChain msgs) {
		Archive oldArchive = archive;
		archive = newArchive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EthPackage.DEVICE_MODEL__ARCHIVE, oldArchive, newArchive);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchive(Archive newArchive) {
		if (newArchive != archive) {
			NotificationChain msgs = null;
			if (archive != null)
				msgs = ((InternalEObject)archive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EthPackage.DEVICE_MODEL__ARCHIVE, null, msgs);
			if (newArchive != null)
				msgs = ((InternalEObject)newArchive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EthPackage.DEVICE_MODEL__ARCHIVE, null, msgs);
			msgs = basicSetArchive(newArchive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EthPackage.DEVICE_MODEL__ARCHIVE, newArchive, newArchive));
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
		
		container = new ResourceSetImpl();
		// Get the Notes
		notes = container.createResource(URI.createURI(""));
		for (i = 3; i < spreadsheet[mainIndex].length; i++) {
			Note note = baseFactory.createNote();
			note.setNote(spreadsheet[mainIndex][i][descriptionIndex]);
			notes.getContents().add(note);
			container.getResources().add(notes);
		}	
		
		//Get the Main
		main = ethFactory.createMain();
		main.setMainBase(spreadsheet[mainIndex][2], table, util);
		
		// Get the monitor points
		Monitor mparent = null;
		monitorPoints = container.createResource(URI.createURI(""));
		for (i = 2; i < spreadsheet[monitorIndex].length; i++) {
			if(spreadsheet[monitorIndex][i].length == 0)
				break;
			Monitor mp;
			String[] row = spreadsheet[monitorIndex][i];
			if(!spreadsheet[monitorIndex][i][0].startsWith(table.getDepChar())){
				mp = ethFactory.createMonitor();
				mp.setMonitorEth(row, null, table, util);
				mparent = mp;
			}else{
				mp = ethFactory.createMonitor();
				mp.setMonitorEth(row, mparent, table, util);
				mparent.addDependent(mp);
			}
			setDeviceModel(table,util);
			mp.setArchiveProp(getArchiveProp(mp.FullName()));
			mp.setAssemblyName(main.Assembly());
			monitorPoints.getContents().add(mp);
			container.getResources().add(monitorPoints);
		}
			
		// Get the control points
		Control cparent = null;
		controlPoints = container.createResource(URI.createURI(""));
		for (i = 2; i < spreadsheet[controlIndex].length; ++i) {
			if(spreadsheet[controlIndex][i].length == 0)
				break;
			Control cp;
			String[] row = spreadsheet[controlIndex][i];
			if(!spreadsheet[controlIndex][i][0].startsWith(table.getDepChar())){
				cp = ethFactory.createControl();
				cp.setControlEth(row, null, table, util);
				cparent = cp;
			}else{
				cp = ethFactory.createControl();
				cp.setControlEth(row, cparent, table, util);
				cparent.addDependent(cp);
			}
			cp.setArchiveProp(getArchiveProp(cp.FullName()));
			cp.setAssemblyName(main.Assembly());
			controlPoints.getContents().add(cp);
			container.getResources().add(controlPoints);
		}

		//Get the Archive Properties
		archiveProperties = container.createResource(URI.createURI(""));
		for(i = 2; i < spreadsheet[archiveIndex].length; i++) {
			if(spreadsheet[archiveIndex][i].length == 0)
				break;
			Archive ap;
			String[] row = spreadsheet[archiveIndex][i];
			ap = ethFactory.createArchive();
			ap.setArchiveEth(row, table);
			archiveProperties.getContents().add(ap);
			container.getResources().add(archiveProperties);
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
			case EthPackage.DEVICE_MODEL__MONITOR:
				return basicSetMonitor(null, msgs);
			case EthPackage.DEVICE_MODEL__CONTROL:
				return basicSetControl(null, msgs);
			case EthPackage.DEVICE_MODEL__ARCHIVE:
				return basicSetArchive(null, msgs);
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
			case EthPackage.DEVICE_MODEL__MONITOR:
				if (resolve) return getMonitor();
				return basicGetMonitor();
			case EthPackage.DEVICE_MODEL__CONTROL:
				if (resolve) return getControl();
				return basicGetControl();
			case EthPackage.DEVICE_MODEL__ARCHIVE:
				if (resolve) return getArchive();
				return basicGetArchive();
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EthPackage.DEVICE_MODEL__MAIN_ETH:
				setMainEth((Main)newValue);
				return;
			case EthPackage.DEVICE_MODEL__MONITOR:
				setMonitor((Monitor)newValue);
				return;
			case EthPackage.DEVICE_MODEL__CONTROL:
				setControl((Control)newValue);
				return;
			case EthPackage.DEVICE_MODEL__ARCHIVE:
				setArchive((Archive)newValue);
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
			case EthPackage.DEVICE_MODEL__MONITOR:
				setMonitor((Monitor)null);
				return;
			case EthPackage.DEVICE_MODEL__CONTROL:
				setControl((Control)null);
				return;
			case EthPackage.DEVICE_MODEL__ARCHIVE:
				setArchive((Archive)null);
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
			case EthPackage.DEVICE_MODEL__MONITOR:
				return monitor != null;
			case EthPackage.DEVICE_MODEL__CONTROL:
				return control != null;
			case EthPackage.DEVICE_MODEL__ARCHIVE:
				return archive != null;
			case EthPackage.DEVICE_MODEL__NOTE:
				return note != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceModelImpl
