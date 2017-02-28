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



import java.util.List;

import alma.control.datamodel.meta.amb.AmbFactory;
import alma.control.datamodel.meta.amb.AmbPackage;
import alma.control.datamodel.meta.amb.Archive;
import alma.control.datamodel.meta.amb.Control;
import alma.control.datamodel.meta.amb.DeviceModel;
import alma.control.datamodel.meta.amb.GenericMonitorPoints;
import alma.control.datamodel.meta.amb.Main;
import alma.control.datamodel.meta.amb.Monitor;
import alma.control.datamodel.meta.base.BaseFactory;
import alma.control.datamodel.meta.base.ControlPoint;
import alma.control.datamodel.meta.base.MainBase;
import alma.control.datamodel.meta.base.MonitorPoint;
import alma.control.datamodel.meta.base.Note;
import alma.control.datamodel.meta.base.SpreadsheetParser;
import alma.control.datamodel.meta.base.SpreadsheetValidator;
import alma.control.datamodel.meta.base.Table;
import alma.control.datamodel.meta.base.Util;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
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
 *   <li>{@link alma.control.datamodel.meta.amb.impl.DeviceModelImpl#getToAddCP <em>To Add CP</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.DeviceModelImpl#getToNoteFromMain <em>To Note From Main</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.DeviceModelImpl#getToAddMP <em>To Add MP</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.DeviceModelImpl#getToInfoMain <em>To Info Main</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.DeviceModelImpl#getToInfoFromMainSheet <em>To Info From Main Sheet</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.DeviceModelImpl#getToMPfromMonitor <em>To MPfrom Monitor</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.DeviceModelImpl#getToDataFromSpread <em>To Data From Spread</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.DeviceModelImpl#getToarchiveProperties <em>Toarchive Properties</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.DeviceModelImpl#getToInstallEndGeneration <em>To Install End Generation</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.DeviceModelImpl#getToSpreadsheetFrom <em>To Spreadsheet From</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.DeviceModelImpl#getToValidateSpreadsheet <em>To Validate Spreadsheet</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.DeviceModelImpl#getToGenericMP <em>To Generic MP</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceModelImpl extends alma.control.datamodel.meta.base.impl.DeviceModelImpl implements DeviceModel {
	/**
	 * The cached value of the '{@link #getToAddCP() <em>To Add CP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToAddCP()
	 * @generated
	 * @ordered
	 */
	protected ControlPoint toAddCP;

	/**
	 * The cached value of the '{@link #getToNoteFromMain() <em>To Note From Main</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToNoteFromMain()
	 * @generated
	 * @ordered
	 */
	protected Note toNoteFromMain;

	/**
	 * The cached value of the '{@link #getToAddMP() <em>To Add MP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToAddMP()
	 * @generated
	 * @ordered
	 */
	protected MonitorPoint toAddMP;

	/**
	 * The cached value of the '{@link #getToInfoMain() <em>To Info Main</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToInfoMain()
	 * @generated
	 * @ordered
	 */
	protected MainBase toInfoMain;

	/**
	 * The cached value of the '{@link #getToInfoFromMainSheet() <em>To Info From Main Sheet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToInfoFromMainSheet()
	 * @generated
	 * @ordered
	 */
	protected Main toInfoFromMainSheet;

	/**
	 * The cached value of the '{@link #getToMPfromMonitor() <em>To MPfrom Monitor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToMPfromMonitor()
	 * @generated
	 * @ordered
	 */
	protected Monitor toMPfromMonitor;

	/**
	 * The cached value of the '{@link #getToDataFromSpread() <em>To Data From Spread</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToDataFromSpread()
	 * @generated
	 * @ordered
	 */
	protected Table toDataFromSpread;

	/**
	 * The cached value of the '{@link #getToarchiveProperties() <em>Toarchive Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToarchiveProperties()
	 * @generated
	 * @ordered
	 */
	protected Archive toarchiveProperties;

	/**
	 * The cached value of the '{@link #getToInstallEndGeneration() <em>To Install End Generation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToInstallEndGeneration()
	 * @generated
	 * @ordered
	 */
	protected Util toInstallEndGeneration;

	/**
	 * The cached value of the '{@link #getToSpreadsheetFrom() <em>To Spreadsheet From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToSpreadsheetFrom()
	 * @generated
	 * @ordered
	 */
	protected SpreadsheetParser toSpreadsheetFrom;

	/**
	 * The cached value of the '{@link #getToValidateSpreadsheet() <em>To Validate Spreadsheet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToValidateSpreadsheet()
	 * @generated
	 * @ordered
	 */
	protected SpreadsheetValidator toValidateSpreadsheet;

	/**
	 * The cached value of the '{@link #getToGenericMP() <em>To Generic MP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToGenericMP()
	 * @generated
	 * @ordered
	 */
	protected GenericMonitorPoints toGenericMP;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceModelImpl() {
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlPoint basicGetToAddCP() {
		return toAddCP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToAddCP(ControlPoint newToAddCP) {
		ControlPoint oldToAddCP = toAddCP;
		toAddCP = newToAddCP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__TO_ADD_CP, oldToAddCP, toAddCP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Note basicGetToNoteFromMain() {
		return toNoteFromMain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToNoteFromMain(Note newToNoteFromMain) {
		Note oldToNoteFromMain = toNoteFromMain;
		toNoteFromMain = newToNoteFromMain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__TO_NOTE_FROM_MAIN, oldToNoteFromMain, toNoteFromMain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorPoint basicGetToAddMP() {
		return toAddMP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToAddMP(MonitorPoint newToAddMP) {
		MonitorPoint oldToAddMP = toAddMP;
		toAddMP = newToAddMP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__TO_ADD_MP, oldToAddMP, toAddMP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainBase basicGetToInfoMain() {
		return toInfoMain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToInfoMain(MainBase newToInfoMain) {
		MainBase oldToInfoMain = toInfoMain;
		toInfoMain = newToInfoMain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__TO_INFO_MAIN, oldToInfoMain, toInfoMain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Main basicGetToInfoFromMainSheet() {
		return toInfoFromMainSheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToInfoFromMainSheet(Main newToInfoFromMainSheet) {
		Main oldToInfoFromMainSheet = toInfoFromMainSheet;
		toInfoFromMainSheet = newToInfoFromMainSheet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__TO_INFO_FROM_MAIN_SHEET, oldToInfoFromMainSheet, toInfoFromMainSheet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Monitor basicGetToMPfromMonitor() {
		return toMPfromMonitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToMPfromMonitor(Monitor newToMPfromMonitor) {
		Monitor oldToMPfromMonitor = toMPfromMonitor;
		toMPfromMonitor = newToMPfromMonitor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__TO_MPFROM_MONITOR, oldToMPfromMonitor, toMPfromMonitor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetToDataFromSpread() {
		return toDataFromSpread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToDataFromSpread(Table newToDataFromSpread) {
		Table oldToDataFromSpread = toDataFromSpread;
		toDataFromSpread = newToDataFromSpread;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__TO_DATA_FROM_SPREAD, oldToDataFromSpread, toDataFromSpread));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Archive getToarchiveProperties() {
		return toarchiveProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToarchiveProperties(Archive newToarchiveProperties, NotificationChain msgs) {
		Archive oldToarchiveProperties = toarchiveProperties;
		toarchiveProperties = newToarchiveProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__TOARCHIVE_PROPERTIES, oldToarchiveProperties, newToarchiveProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToarchiveProperties(Archive newToarchiveProperties) {
		if (newToarchiveProperties != toarchiveProperties) {
			NotificationChain msgs = null;
			if (toarchiveProperties != null)
				msgs = ((InternalEObject)toarchiveProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmbPackage.DEVICE_MODEL__TOARCHIVE_PROPERTIES, null, msgs);
			if (newToarchiveProperties != null)
				msgs = ((InternalEObject)newToarchiveProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmbPackage.DEVICE_MODEL__TOARCHIVE_PROPERTIES, null, msgs);
			msgs = basicSetToarchiveProperties(newToarchiveProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__TOARCHIVE_PROPERTIES, newToarchiveProperties, newToarchiveProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Util basicGetToInstallEndGeneration() {
		return toInstallEndGeneration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToInstallEndGeneration(Util newToInstallEndGeneration) {
		Util oldToInstallEndGeneration = toInstallEndGeneration;
		toInstallEndGeneration = newToInstallEndGeneration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__TO_INSTALL_END_GENERATION, oldToInstallEndGeneration, toInstallEndGeneration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetParser basicGetToSpreadsheetFrom() {
		return toSpreadsheetFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToSpreadsheetFrom(SpreadsheetParser newToSpreadsheetFrom) {
		SpreadsheetParser oldToSpreadsheetFrom = toSpreadsheetFrom;
		toSpreadsheetFrom = newToSpreadsheetFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__TO_SPREADSHEET_FROM, oldToSpreadsheetFrom, toSpreadsheetFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetValidator basicGetToValidateSpreadsheet() {
		return toValidateSpreadsheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToValidateSpreadsheet(SpreadsheetValidator newToValidateSpreadsheet) {
		SpreadsheetValidator oldToValidateSpreadsheet = toValidateSpreadsheet;
		toValidateSpreadsheet = newToValidateSpreadsheet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__TO_VALIDATE_SPREADSHEET, oldToValidateSpreadsheet, toValidateSpreadsheet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericMonitorPoints basicGetToGenericMP() {
		return toGenericMP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToGenericMP(GenericMonitorPoints newToGenericMP) {
		GenericMonitorPoints oldToGenericMP = toGenericMP;
		toGenericMP = newToGenericMP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__TO_GENERIC_MP, oldToGenericMP, toGenericMP));
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
		return ((Main)main).Parent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Cardinality() {
		return ((Main)main).Cardinality();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String NodeAddress() {
		return ((Main)main).NodeAddress();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Channel() {
		return ((Main)main).Channel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String BaseAddress() {
		return ((Main)main).BaseAddress();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean GenericMonitorPoints() {
		return ((Main)main).GenericMonitorPoints();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	BaseFactory baseFac = BaseFactory.eINSTANCE;
	
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
		Monitor mparent = ambFac.createMonitor();
		mparent = null;
		monitorPoints = new ResourceSetImpl();
		for (i = 2; i < spreadsheet[monitorIndex].length; i++) {
			if(spreadsheet[monitorIndex][i].length == 0)
				break;
			Monitor mp = ambFac.createMonitor();
			String[] row = spreadsheet[monitorIndex][i];
			if(!spreadsheet[monitorIndex][i][1].startsWith(table.getDepChar())){
				mp = ambFac.createMonitor(row, null);
				mparent = mp;
			}
			else{
				mp = ambFac.createMonitor(row, mparent);
				mparent.addDependent(mp);
			}
			mp.setArchive(getArchive(mp.FullName()));
			//mp.setMetaEnvironment(this.getMetaEnvironment());
			monitorPoints.getResources().add(mp);
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
					Monitor dep = ambFac.createMonitor(row, mp);
					mp.addDependent(dep);

					dep.setArchive(getArchive(dep.FullName()));
					//dep.setMetaEnvironment(this.getMetaEnvironment());
					monitorPoints.getResources().add(dep);
				}
		}

		// Get the control points
		Control cparent = ambFac.createControl();
		cparent = null;
		controlPoints = new ResourceSetImpl();
		for (i = 2; i < spreadsheet[controlIndex].length; ++i) {
			if(spreadsheet[controlIndex][i].length == 0)
				break;
			Control cp;
			String[] row = spreadsheet[controlIndex][i];
			if(!spreadsheet[controlIndex][i][1].startsWith(table.getDepChar()))
			{
				cp = ambFac.createControl(row,null);
				cparent = cp;
			}
			else{
				cp = ambFac.createControl(row, cparent);
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
			Archive ap;
			String[] row = spreadsheet[archiveIndex][i];
			ap = ambFac.createArchive(row);
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String TheEnd() {
				String dir = generatedDir + "/" + Assembly();
				Util utils = baseFac.createUtil();
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmbPackage.DEVICE_MODEL__TOARCHIVE_PROPERTIES:
				return basicSetToarchiveProperties(null, msgs);
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
			case AmbPackage.DEVICE_MODEL__TO_INFO_FROM_MAIN_SHEET:
				if (resolve) return getToInfoFromMainSheet();
				return basicGetToInfoFromMainSheet();
			case AmbPackage.DEVICE_MODEL__TO_MPFROM_MONITOR:
				if (resolve) return getToMPfromMonitor();
				return basicGetToMPfromMonitor();
			case AmbPackage.DEVICE_MODEL__TO_DATA_FROM_SPREAD:
				if (resolve) return getToDataFromSpread();
				return basicGetToDataFromSpread();
			case AmbPackage.DEVICE_MODEL__TOARCHIVE_PROPERTIES:
				return getToarchiveProperties();
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
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
			case AmbPackage.DEVICE_MODEL__TO_INFO_FROM_MAIN_SHEET:
				setToInfoFromMainSheet((Main)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__TO_MPFROM_MONITOR:
				setToMPfromMonitor((Monitor)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__TO_DATA_FROM_SPREAD:
				setToDataFromSpread((Table)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__TOARCHIVE_PROPERTIES:
				setToarchiveProperties((Archive)newValue);
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
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
			case AmbPackage.DEVICE_MODEL__TO_INFO_FROM_MAIN_SHEET:
				setToInfoFromMainSheet((Main)null);
				return;
			case AmbPackage.DEVICE_MODEL__TO_MPFROM_MONITOR:
				setToMPfromMonitor((Monitor)null);
				return;
			case AmbPackage.DEVICE_MODEL__TO_DATA_FROM_SPREAD:
				setToDataFromSpread((Table)null);
				return;
			case AmbPackage.DEVICE_MODEL__TOARCHIVE_PROPERTIES:
				setToarchiveProperties((Archive)null);
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AmbPackage.DEVICE_MODEL__TO_ADD_CP:
				return toAddCP != null;
			case AmbPackage.DEVICE_MODEL__TO_NOTE_FROM_MAIN:
				return toNoteFromMain != null;
			case AmbPackage.DEVICE_MODEL__TO_ADD_MP:
				return toAddMP != null;
			case AmbPackage.DEVICE_MODEL__TO_INFO_MAIN:
				return toInfoMain != null;
			case AmbPackage.DEVICE_MODEL__TO_INFO_FROM_MAIN_SHEET:
				return toInfoFromMainSheet != null;
			case AmbPackage.DEVICE_MODEL__TO_MPFROM_MONITOR:
				return toMPfromMonitor != null;
			case AmbPackage.DEVICE_MODEL__TO_DATA_FROM_SPREAD:
				return toDataFromSpread != null;
			case AmbPackage.DEVICE_MODEL__TOARCHIVE_PROPERTIES:
				return toarchiveProperties != null;
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

} //DeviceModelImpl
