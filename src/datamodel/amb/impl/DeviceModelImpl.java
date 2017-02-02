/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package datamodel.amb.impl;

import datamodel.amb.AmbPackage;
import datamodel.amb.ArchiveImpl;
import datamodel.amb.ControlImpl;
import datamodel.amb.DeviceModel;
import datamodel.amb.GenericMonitorPoints;
import datamodel.amb.MainImpl;
import datamodel.amb.MonitorImpl;

import datamodel.base.ControlPoint;
import datamodel.base.MainBase;
import datamodel.base.MonitorPoint;
import datamodel.base.Note;
import datamodel.base.SpreadsheetParser;
import datamodel.base.SpreadsheetValidator;
import datamodel.base.Table;
import datamodel.base.Util;

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
public class DeviceModelImpl extends datamodel.base.impl.DeviceModelImpl implements DeviceModel {
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
	protected ControlImpl getCPfromControl;

	/**
	 * The cached value of the '{@link #getGetInfoFromMainSheet() <em>Get Info From Main Sheet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetInfoFromMainSheet()
	 * @generated
	 * @ordered
	 */
	protected MainImpl getInfoFromMainSheet;

	/**
	 * The cached value of the '{@link #getGetMPfromMonitor() <em>Get MPfrom Monitor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetMPfromMonitor()
	 * @generated
	 * @ordered
	 */
	protected MonitorImpl getMPfromMonitor;

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
	protected ArchiveImpl getAPfromArchive;

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
	public ControlImpl getGetCPfromControl() {
		if (getCPfromControl != null && getCPfromControl.eIsProxy()) {
			InternalEObject oldGetCPfromControl = (InternalEObject)getCPfromControl;
			getCPfromControl = (ControlImpl)eResolveProxy(oldGetCPfromControl);
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
	public ControlImpl basicGetGetCPfromControl() {
		return getCPfromControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetCPfromControl(ControlImpl newGetCPfromControl) {
		ControlImpl oldGetCPfromControl = getCPfromControl;
		getCPfromControl = newGetCPfromControl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__GET_CPFROM_CONTROL, oldGetCPfromControl, getCPfromControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainImpl getGetInfoFromMainSheet() {
		if (getInfoFromMainSheet != null && getInfoFromMainSheet.eIsProxy()) {
			InternalEObject oldGetInfoFromMainSheet = (InternalEObject)getInfoFromMainSheet;
			getInfoFromMainSheet = (MainImpl)eResolveProxy(oldGetInfoFromMainSheet);
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
	public MainImpl basicGetGetInfoFromMainSheet() {
		return getInfoFromMainSheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetInfoFromMainSheet(MainImpl newGetInfoFromMainSheet) {
		MainImpl oldGetInfoFromMainSheet = getInfoFromMainSheet;
		getInfoFromMainSheet = newGetInfoFromMainSheet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL__GET_INFO_FROM_MAIN_SHEET, oldGetInfoFromMainSheet, getInfoFromMainSheet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorImpl getGetMPfromMonitor() {
		if (getMPfromMonitor != null && getMPfromMonitor.eIsProxy()) {
			InternalEObject oldGetMPfromMonitor = (InternalEObject)getMPfromMonitor;
			getMPfromMonitor = (MonitorImpl)eResolveProxy(oldGetMPfromMonitor);
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
	public MonitorImpl basicGetGetMPfromMonitor() {
		return getMPfromMonitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetMPfromMonitor(MonitorImpl newGetMPfromMonitor) {
		MonitorImpl oldGetMPfromMonitor = getMPfromMonitor;
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
	public ArchiveImpl getGetAPfromArchive() {
		if (getAPfromArchive != null && getAPfromArchive.eIsProxy()) {
			InternalEObject oldGetAPfromArchive = (InternalEObject)getAPfromArchive;
			getAPfromArchive = (ArchiveImpl)eResolveProxy(oldGetAPfromArchive);
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
	public ArchiveImpl basicGetGetAPfromArchive() {
		return getAPfromArchive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetAPfromArchive(ArchiveImpl newGetAPfromArchive) {
		ArchiveImpl oldGetAPfromArchive = getAPfromArchive;
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
	public boolean IsGeneratedAlt() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Parent() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Cardinality() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String NodeAddress() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Channel() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String BaseAddress() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean GenericMonitorPoints() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String NodeAddressInDecimal() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String HexToDec(String s) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
				setGetCPfromControl((ControlImpl)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__GET_INFO_FROM_MAIN_SHEET:
				setGetInfoFromMainSheet((MainImpl)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__GET_MPFROM_MONITOR:
				setGetMPfromMonitor((MonitorImpl)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__GET_DATA_FROM_SPREAD:
				setGetDataFromSpread((Table)newValue);
				return;
			case AmbPackage.DEVICE_MODEL__GET_APFROM_ARCHIVE:
				setGetAPfromArchive((ArchiveImpl)newValue);
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
				setGetCPfromControl((ControlImpl)null);
				return;
			case AmbPackage.DEVICE_MODEL__GET_INFO_FROM_MAIN_SHEET:
				setGetInfoFromMainSheet((MainImpl)null);
				return;
			case AmbPackage.DEVICE_MODEL__GET_MPFROM_MONITOR:
				setGetMPfromMonitor((MonitorImpl)null);
				return;
			case AmbPackage.DEVICE_MODEL__GET_DATA_FROM_SPREAD:
				setGetDataFromSpread((Table)null);
				return;
			case AmbPackage.DEVICE_MODEL__GET_APFROM_ARCHIVE:
				setGetAPfromArchive((ArchiveImpl)null);
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

} //DeviceModelImpl