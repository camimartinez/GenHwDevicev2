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
 */
package datamodel.amb.impl;

import datamodel.amb.AmbPackage;
import datamodel.amb.ArchiveAMB;
import datamodel.amb.ControlAMB;
import datamodel.amb.DeviceModel;
import datamodel.amb.GenericMonitorPoints;
import datamodel.amb.MainAMB;
import datamodel.amb.MonitorAMB;

import datamodel.base.ControlPoint;
import datamodel.base.MainBase;
import datamodel.base.MonitorPoint;
import datamodel.base.Note;
import datamodel.base.SpreadsheetParser;
import datamodel.base.SpreadsheetValidator;
import datamodel.base.Table;
import datamodel.base.Util;

import datamodel.base.impl.BaseFactoryImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datamodel.amb.impl.DeviceModelImpl#getTmp <em>Tmp</em>}</li>
 *   <li>{@link datamodel.amb.impl.DeviceModelImpl#getToAddCP <em>To Add CP</em>}</li>
 *   <li>{@link datamodel.amb.impl.DeviceModelImpl#getGetNoteFromMain <em>Get Note From Main</em>}</li>
 *   <li>{@link datamodel.amb.impl.DeviceModelImpl#getToAddMP <em>To Add MP</em>}</li>
 *   <li>{@link datamodel.amb.impl.DeviceModelImpl#getGetInfoMain <em>Get Info Main</em>}</li>
 *   <li>{@link datamodel.amb.impl.DeviceModelImpl#getGetCPfromControl <em>Get CPfrom Control</em>}</li>
 *   <li>{@link datamodel.amb.impl.DeviceModelImpl#getGetInfoFromMainSheet <em>Get Info From Main Sheet</em>}</li>
 *   <li>{@link datamodel.amb.impl.DeviceModelImpl#getGetMPfromMonitor <em>Get MPfrom Monitor</em>}</li>
 *   <li>{@link datamodel.amb.impl.DeviceModelImpl#getGetDataFromSpread <em>Get Data From Spread</em>}</li>
 *   <li>{@link datamodel.amb.impl.DeviceModelImpl#getGetAPfromArchive <em>Get APfrom Archive</em>}</li>
 *   <li>{@link datamodel.amb.impl.DeviceModelImpl#getToinstallEndGeneration <em>Toinstall End Generation</em>}</li>
 *   <li>{@link datamodel.amb.impl.DeviceModelImpl#getGetFromSpreadsheet <em>Get From Spreadsheet</em>}</li>
 *   <li>{@link datamodel.amb.impl.DeviceModelImpl#getToValidateSpreadsheet <em>To Validate Spreadsheet</em>}</li>
 *   <li>{@link datamodel.amb.impl.DeviceModelImpl#getGetGenericMP <em>Get Generic MP</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MyDeviceModelImpl extends datamodel.base.impl.DeviceModelImpl implements DeviceModel {
	/**
	 * The default value of the '{@link #getTmp() <em>Tmp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTmp()
	 * @generated
	 * @ordered
	 */
	protected static final BaseFactoryImpl TMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTmp() <em>Tmp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTmp()
	 * @generated
	 * @ordered
	 */
	protected BaseFactoryImpl tmp = TMP_EDEFAULT;

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
	 * The cached value of the '{@link #getGetNoteFromMain() <em>Get Note From Main</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetNoteFromMain()
	 * @generated
	 * @ordered
	 */
	protected Note getNoteFromMain;

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
	 * The cached value of the '{@link #getGetInfoMain() <em>Get Info Main</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetInfoMain()
	 * @generated
	 * @ordered
	 */
	protected MainBase getInfoMain;

	/**
	 * The cached value of the '{@link #getGetCPfromControl() <em>Get CPfrom Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetCPfromControl()
	 * @generated
	 * @ordered
	 */
	protected ControlAMB getCPfromControl;

	/**
	 * The cached value of the '{@link #getGetInfoFromMainSheet() <em>Get Info From Main Sheet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetInfoFromMainSheet()
	 * @generated
	 * @ordered
	 */
	protected MainAMB getInfoFromMainSheet;

	/**
	 * The cached value of the '{@link #getGetMPfromMonitor() <em>Get MPfrom Monitor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetMPfromMonitor()
	 * @generated
	 * @ordered
	 */
	protected MonitorAMB getMPfromMonitor;

	/**
	 * The cached value of the '{@link #getGetDataFromSpread() <em>Get Data From Spread</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetDataFromSpread()
	 * @generated
	 * @ordered
	 */
	protected Table getDataFromSpread;

	/**
	 * The cached value of the '{@link #getGetAPfromArchive() <em>Get APfrom Archive</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetAPfromArchive()
	 * @generated
	 * @ordered
	 */
	protected ArchiveAMB getAPfromArchive;

	/**
	 * The cached value of the '{@link #getToinstallEndGeneration() <em>Toinstall End Generation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToinstallEndGeneration()
	 * @generated
	 * @ordered
	 */
	protected Util toinstallEndGeneration;

	/**
	 * The cached value of the '{@link #getGetFromSpreadsheet() <em>Get From Spreadsheet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetFromSpreadsheet()
	 * @generated
	 * @ordered
	 */
	protected SpreadsheetParser getFromSpreadsheet;

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
	 * The cached value of the '{@link #getGetGenericMP() <em>Get Generic MP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetGenericMP()
	 * @generated
	 * @ordered
	 */
	protected GenericMonitorPoints getGenericMP;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MyDeviceModelImpl() {
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
	public BaseFactoryImpl getTmp() {
		return tmp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTmp(BaseFactoryImpl newTmp) {
		BaseFactoryImpl oldTmp = tmp;
		tmp = newTmp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__TMP, oldTmp, tmp));
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
	public Note getGetNoteFromMain() {
		if (getNoteFromMain != null && getNoteFromMain.eIsProxy()) {
			InternalEObject oldGetNoteFromMain = (InternalEObject)getNoteFromMain;
			getNoteFromMain = (Note)eResolveProxy(oldGetNoteFromMain);
			if (getNoteFromMain != oldGetNoteFromMain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL__GET_NOTE_FROM_MAIN, oldGetNoteFromMain, getNoteFromMain));
			}
		}
		return getNoteFromMain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Note basicGetGetNoteFromMain() {
		return getNoteFromMain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetNoteFromMain(Note newGetNoteFromMain) {
		Note oldGetNoteFromMain = getNoteFromMain;
		getNoteFromMain = newGetNoteFromMain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__GET_NOTE_FROM_MAIN, oldGetNoteFromMain, getNoteFromMain));
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
	public MainBase getGetInfoMain() {
		if (getInfoMain != null && getInfoMain.eIsProxy()) {
			InternalEObject oldGetInfoMain = (InternalEObject)getInfoMain;
			getInfoMain = (MainBase)eResolveProxy(oldGetInfoMain);
			if (getInfoMain != oldGetInfoMain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL__GET_INFO_MAIN, oldGetInfoMain, getInfoMain));
			}
		}
		return getInfoMain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainBase basicGetGetInfoMain() {
		return getInfoMain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetInfoMain(MainBase newGetInfoMain) {
		MainBase oldGetInfoMain = getInfoMain;
		getInfoMain = newGetInfoMain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__GET_INFO_MAIN, oldGetInfoMain, getInfoMain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlAMB getGetCPfromControl() {
		if (getCPfromControl != null && getCPfromControl.eIsProxy()) {
			InternalEObject oldGetCPfromControl = (InternalEObject)getCPfromControl;
			getCPfromControl = (ControlAMB)eResolveProxy(oldGetCPfromControl);
			if (getCPfromControl != oldGetCPfromControl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL__GET_CPFROM_CONTROL, oldGetCPfromControl, getCPfromControl));
			}
		}
		return getCPfromControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlAMB basicGetGetCPfromControl() {
		return getCPfromControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetCPfromControl(ControlAMB newGetCPfromControl) {
		ControlAMB oldGetCPfromControl = getCPfromControl;
		getCPfromControl = newGetCPfromControl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__GET_CPFROM_CONTROL, oldGetCPfromControl, getCPfromControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainAMB getGetInfoFromMainSheet() {
		if (getInfoFromMainSheet != null && getInfoFromMainSheet.eIsProxy()) {
			InternalEObject oldGetInfoFromMainSheet = (InternalEObject)getInfoFromMainSheet;
			getInfoFromMainSheet = (MainAMB)eResolveProxy(oldGetInfoFromMainSheet);
			if (getInfoFromMainSheet != oldGetInfoFromMainSheet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL__GET_INFO_FROM_MAIN_SHEET, oldGetInfoFromMainSheet, getInfoFromMainSheet));
			}
		}
		return getInfoFromMainSheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainAMB basicGetGetInfoFromMainSheet() {
		return getInfoFromMainSheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetInfoFromMainSheet(MainAMB newGetInfoFromMainSheet) {
		MainAMB oldGetInfoFromMainSheet = getInfoFromMainSheet;
		getInfoFromMainSheet = newGetInfoFromMainSheet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__GET_INFO_FROM_MAIN_SHEET, oldGetInfoFromMainSheet, getInfoFromMainSheet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorAMB getGetMPfromMonitor() {
		if (getMPfromMonitor != null && getMPfromMonitor.eIsProxy()) {
			InternalEObject oldGetMPfromMonitor = (InternalEObject)getMPfromMonitor;
			getMPfromMonitor = (MonitorAMB)eResolveProxy(oldGetMPfromMonitor);
			if (getMPfromMonitor != oldGetMPfromMonitor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL__GET_MPFROM_MONITOR, oldGetMPfromMonitor, getMPfromMonitor));
			}
		}
		return getMPfromMonitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorAMB basicGetGetMPfromMonitor() {
		return getMPfromMonitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetMPfromMonitor(MonitorAMB newGetMPfromMonitor) {
		MonitorAMB oldGetMPfromMonitor = getMPfromMonitor;
		getMPfromMonitor = newGetMPfromMonitor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__GET_MPFROM_MONITOR, oldGetMPfromMonitor, getMPfromMonitor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getGetDataFromSpread() {
		if (getDataFromSpread != null && getDataFromSpread.eIsProxy()) {
			InternalEObject oldGetDataFromSpread = (InternalEObject)getDataFromSpread;
			getDataFromSpread = (Table)eResolveProxy(oldGetDataFromSpread);
			if (getDataFromSpread != oldGetDataFromSpread) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL__GET_DATA_FROM_SPREAD, oldGetDataFromSpread, getDataFromSpread));
			}
		}
		return getDataFromSpread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetGetDataFromSpread() {
		return getDataFromSpread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetDataFromSpread(Table newGetDataFromSpread) {
		Table oldGetDataFromSpread = getDataFromSpread;
		getDataFromSpread = newGetDataFromSpread;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__GET_DATA_FROM_SPREAD, oldGetDataFromSpread, getDataFromSpread));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchiveAMB getGetAPfromArchive() {
		if (getAPfromArchive != null && getAPfromArchive.eIsProxy()) {
			InternalEObject oldGetAPfromArchive = (InternalEObject)getAPfromArchive;
			getAPfromArchive = (ArchiveAMB)eResolveProxy(oldGetAPfromArchive);
			if (getAPfromArchive != oldGetAPfromArchive) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL__GET_APFROM_ARCHIVE, oldGetAPfromArchive, getAPfromArchive));
			}
		}
		return getAPfromArchive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchiveAMB basicGetGetAPfromArchive() {
		return getAPfromArchive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetAPfromArchive(ArchiveAMB newGetAPfromArchive) {
		ArchiveAMB oldGetAPfromArchive = getAPfromArchive;
		getAPfromArchive = newGetAPfromArchive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__GET_APFROM_ARCHIVE, oldGetAPfromArchive, getAPfromArchive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Util getToinstallEndGeneration() {
		if (toinstallEndGeneration != null && toinstallEndGeneration.eIsProxy()) {
			InternalEObject oldToinstallEndGeneration = (InternalEObject)toinstallEndGeneration;
			toinstallEndGeneration = (Util)eResolveProxy(oldToinstallEndGeneration);
			if (toinstallEndGeneration != oldToinstallEndGeneration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL__TOINSTALL_END_GENERATION, oldToinstallEndGeneration, toinstallEndGeneration));
			}
		}
		return toinstallEndGeneration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Util basicGetToinstallEndGeneration() {
		return toinstallEndGeneration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToinstallEndGeneration(Util newToinstallEndGeneration) {
		Util oldToinstallEndGeneration = toinstallEndGeneration;
		toinstallEndGeneration = newToinstallEndGeneration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__TOINSTALL_END_GENERATION, oldToinstallEndGeneration, toinstallEndGeneration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetParser getGetFromSpreadsheet() {
		if (getFromSpreadsheet != null && getFromSpreadsheet.eIsProxy()) {
			InternalEObject oldGetFromSpreadsheet = (InternalEObject)getFromSpreadsheet;
			getFromSpreadsheet = (SpreadsheetParser)eResolveProxy(oldGetFromSpreadsheet);
			if (getFromSpreadsheet != oldGetFromSpreadsheet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL__GET_FROM_SPREADSHEET, oldGetFromSpreadsheet, getFromSpreadsheet));
			}
		}
		return getFromSpreadsheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetParser basicGetGetFromSpreadsheet() {
		return getFromSpreadsheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetFromSpreadsheet(SpreadsheetParser newGetFromSpreadsheet) {
		SpreadsheetParser oldGetFromSpreadsheet = getFromSpreadsheet;
		getFromSpreadsheet = newGetFromSpreadsheet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__GET_FROM_SPREADSHEET, oldGetFromSpreadsheet, getFromSpreadsheet));
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
	public GenericMonitorPoints getGetGenericMP() {
		if (getGenericMP != null && getGenericMP.eIsProxy()) {
			InternalEObject oldGetGenericMP = (InternalEObject)getGenericMP;
			getGenericMP = (GenericMonitorPoints)eResolveProxy(oldGetGenericMP);
			if (getGenericMP != oldGetGenericMP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL__GET_GENERIC_MP, oldGetGenericMP, getGenericMP));
			}
		}
		return getGenericMP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericMonitorPoints basicGetGetGenericMP() {
		return getGenericMP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetGenericMP(GenericMonitorPoints newGetGenericMP) {
		GenericMonitorPoints oldGetGenericMP = getGenericMP;
		getGenericMP = newGetGenericMP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__GET_GENERIC_MP, oldGetGenericMP, getGenericMP));
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
		return ((MainAMBImpl)main).Parent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Cardinality() {
		return ((MainAMBImpl)main).Cardinality();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String NodeAddress() {
		return ((MainAMBImpl)main).NodeAddress();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Channel() {
		return ((MainAMBImpl)main).Channel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String BaseAddress() {
		return ((MainAMBImpl)main).BaseAddress();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean GenericMonitorPoints() {
		return ((MainAMBImpl)main).GenericMonitorPoints();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public String HexToDec(String s) {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmbPackage.DEVICE_MODEL__TMP:
				return getTmp();
			case AmbPackage.DEVICE_MODEL__TO_ADD_CP:
				if (resolve) return getToAddCP();
				return basicGetToAddCP();
			case AmbPackage.DEVICE_MODEL__GET_NOTE_FROM_MAIN:
				if (resolve) return getGetNoteFromMain();
				return basicGetGetNoteFromMain();
			case AmbPackage.DEVICE_MODEL__TO_ADD_MP:
				if (resolve) return getToAddMP();
				return basicGetToAddMP();
			case AmbPackage.DEVICE_MODEL__GET_INFO_MAIN:
				if (resolve) return getGetInfoMain();
				return basicGetGetInfoMain();
			case AmbPackage.DEVICE_MODEL__GET_CPFROM_CONTROL:
				if (resolve) return getGetCPfromControl();
				return basicGetGetCPfromControl();
			case AmbPackage.DEVICE_MODEL__GET_INFO_FROM_MAIN_SHEET:
				if (resolve) return getGetInfoFromMainSheet();
				return basicGetGetInfoFromMainSheet();
			case AmbPackage.DEVICE_MODEL__GET_MPFROM_MONITOR:
				if (resolve) return getGetMPfromMonitor();
				return basicGetGetMPfromMonitor();
			case AmbPackage.DEVICE_MODEL__GET_DATA_FROM_SPREAD:
				if (resolve) return getGetDataFromSpread();
				return basicGetGetDataFromSpread();
			case AmbPackage.DEVICE_MODEL__GET_APFROM_ARCHIVE:
				if (resolve) return getGetAPfromArchive();
				return basicGetGetAPfromArchive();
			case AmbPackage.DEVICE_MODEL__TOINSTALL_END_GENERATION:
				if (resolve) return getToinstallEndGeneration();
				return basicGetToinstallEndGeneration();
			case AmbPackage.DEVICE_MODEL__GET_FROM_SPREADSHEET:
				if (resolve) return getGetFromSpreadsheet();
				return basicGetGetFromSpreadsheet();
			case AmbPackage.DEVICE_MODEL__TO_VALIDATE_SPREADSHEET:
				if (resolve) return getToValidateSpreadsheet();
				return basicGetToValidateSpreadsheet();
			case AmbPackage.DEVICE_MODEL__GET_GENERIC_MP:
				if (resolve) return getGetGenericMP();
				return basicGetGetGenericMP();
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
			case AmbPackage.DEVICE_MODEL__TMP:
				setTmp((BaseFactoryImpl)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__TO_ADD_CP:
				setToAddCP((ControlPoint)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__GET_NOTE_FROM_MAIN:
				setGetNoteFromMain((Note)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__TO_ADD_MP:
				setToAddMP((MonitorPoint)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__GET_INFO_MAIN:
				setGetInfoMain((MainBase)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__GET_CPFROM_CONTROL:
				setGetCPfromControl((ControlAMB)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__GET_INFO_FROM_MAIN_SHEET:
				setGetInfoFromMainSheet((MainAMB)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__GET_MPFROM_MONITOR:
				setGetMPfromMonitor((MonitorAMB)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__GET_DATA_FROM_SPREAD:
				setGetDataFromSpread((Table)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__GET_APFROM_ARCHIVE:
				setGetAPfromArchive((ArchiveAMB)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__TOINSTALL_END_GENERATION:
				setToinstallEndGeneration((Util)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__GET_FROM_SPREADSHEET:
				setGetFromSpreadsheet((SpreadsheetParser)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__TO_VALIDATE_SPREADSHEET:
				setToValidateSpreadsheet((SpreadsheetValidator)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__GET_GENERIC_MP:
				setGetGenericMP((GenericMonitorPoints)newValue);
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
			case AmbPackage.DEVICE_MODEL__TMP:
				setTmp(TMP_EDEFAULT);
				return;
			case AmbPackage.DEVICE_MODEL__TO_ADD_CP:
				setToAddCP((ControlPoint)null);
				return;
			case AmbPackage.DEVICE_MODEL__GET_NOTE_FROM_MAIN:
				setGetNoteFromMain((Note)null);
				return;
			case AmbPackage.DEVICE_MODEL__TO_ADD_MP:
				setToAddMP((MonitorPoint)null);
				return;
			case AmbPackage.DEVICE_MODEL__GET_INFO_MAIN:
				setGetInfoMain((MainBase)null);
				return;
			case AmbPackage.DEVICE_MODEL__GET_CPFROM_CONTROL:
				setGetCPfromControl((ControlAMB)null);
				return;
			case AmbPackage.DEVICE_MODEL__GET_INFO_FROM_MAIN_SHEET:
				setGetInfoFromMainSheet((MainAMB)null);
				return;
			case AmbPackage.DEVICE_MODEL__GET_MPFROM_MONITOR:
				setGetMPfromMonitor((MonitorAMB)null);
				return;
			case AmbPackage.DEVICE_MODEL__GET_DATA_FROM_SPREAD:
				setGetDataFromSpread((Table)null);
				return;
			case AmbPackage.DEVICE_MODEL__GET_APFROM_ARCHIVE:
				setGetAPfromArchive((ArchiveAMB)null);
				return;
			case AmbPackage.DEVICE_MODEL__TOINSTALL_END_GENERATION:
				setToinstallEndGeneration((Util)null);
				return;
			case AmbPackage.DEVICE_MODEL__GET_FROM_SPREADSHEET:
				setGetFromSpreadsheet((SpreadsheetParser)null);
				return;
			case AmbPackage.DEVICE_MODEL__TO_VALIDATE_SPREADSHEET:
				setToValidateSpreadsheet((SpreadsheetValidator)null);
				return;
			case AmbPackage.DEVICE_MODEL__GET_GENERIC_MP:
				setGetGenericMP((GenericMonitorPoints)null);
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
			case AmbPackage.DEVICE_MODEL__TMP:
				return TMP_EDEFAULT == null ? tmp != null : !TMP_EDEFAULT.equals(tmp);
			case AmbPackage.DEVICE_MODEL__TO_ADD_CP:
				return toAddCP != null;
			case AmbPackage.DEVICE_MODEL__GET_NOTE_FROM_MAIN:
				return getNoteFromMain != null;
			case AmbPackage.DEVICE_MODEL__TO_ADD_MP:
				return toAddMP != null;
			case AmbPackage.DEVICE_MODEL__GET_INFO_MAIN:
				return getInfoMain != null;
			case AmbPackage.DEVICE_MODEL__GET_CPFROM_CONTROL:
				return getCPfromControl != null;
			case AmbPackage.DEVICE_MODEL__GET_INFO_FROM_MAIN_SHEET:
				return getInfoFromMainSheet != null;
			case AmbPackage.DEVICE_MODEL__GET_MPFROM_MONITOR:
				return getMPfromMonitor != null;
			case AmbPackage.DEVICE_MODEL__GET_DATA_FROM_SPREAD:
				return getDataFromSpread != null;
			case AmbPackage.DEVICE_MODEL__GET_APFROM_ARCHIVE:
				return getAPfromArchive != null;
			case AmbPackage.DEVICE_MODEL__TOINSTALL_END_GENERATION:
				return toinstallEndGeneration != null;
			case AmbPackage.DEVICE_MODEL__GET_FROM_SPREADSHEET:
				return getFromSpreadsheet != null;
			case AmbPackage.DEVICE_MODEL__TO_VALIDATE_SPREADSHEET:
				return toValidateSpreadsheet != null;
			case AmbPackage.DEVICE_MODEL__GET_GENERIC_MP:
				return getGenericMP != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (tmp: ");
		result.append(tmp);
		result.append(')');
		return result.toString();
	}

} //DeviceModelImpl
