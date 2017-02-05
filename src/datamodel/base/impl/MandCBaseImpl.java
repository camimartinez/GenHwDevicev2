/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package datamodel.base.impl;

import datamodel.base.ArchiveProperty;
import datamodel.base.BasePackage;
import datamodel.base.MandCBase;
import datamodel.base.MonitorPoint;
import datamodel.base.Table;
import datamodel.base.Util;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mand CBase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datamodel.base.impl.MandCBaseImpl#getSpreadsheetName <em>Spreadsheet Name</em>}</li>
 *   <li>{@link datamodel.base.impl.MandCBaseImpl#getSheetName <em>Sheet Name</em>}</li>
 *   <li>{@link datamodel.base.impl.MandCBaseImpl#getRow <em>Row</em>}</li>
 *   <li>{@link datamodel.base.impl.MandCBaseImpl#getParentRow <em>Parent Row</em>}</li>
 *   <li>{@link datamodel.base.impl.MandCBaseImpl#getSheet <em>Sheet</em>}</li>
 *   <li>{@link datamodel.base.impl.MandCBaseImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link datamodel.base.impl.MandCBaseImpl#getArchive <em>Archive</em>}</li>
 *   <li>{@link datamodel.base.impl.MandCBaseImpl#getDependents <em>Dependents</em>}</li>
 *   <li>{@link datamodel.base.impl.MandCBaseImpl#getSetInfFromSpread <em>Set Inf From Spread</em>}</li>
 *   <li>{@link datamodel.base.impl.MandCBaseImpl#getGetCommonInf <em>Get Common Inf</em>}</li>
 *   <li>{@link datamodel.base.impl.MandCBaseImpl#getSetMPorCP <em>Set MPor CP</em>}</li>
 *   <li>{@link datamodel.base.impl.MandCBaseImpl#getGetSheetMP <em>Get Sheet MP</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MandCBaseImpl extends EObjectImpl implements MandCBase {
	/**
	 * The default value of the '{@link #getSpreadsheetName() <em>Spreadsheet Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpreadsheetName()
	 * @generated
	 * @ordered
	 */
	protected static final String SPREADSHEET_NAME_EDEFAULT = "\"Not needed\"";

	/**
	 * The cached value of the '{@link #getSpreadsheetName() <em>Spreadsheet Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpreadsheetName()
	 * @generated
	 * @ordered
	 */
	protected String spreadsheetName = SPREADSHEET_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSheetName() <em>Sheet Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheetName()
	 * @generated
	 * @ordered
	 */
	protected static final String SHEET_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSheetName() <em>Sheet Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheetName()
	 * @generated
	 * @ordered
	 */
	protected String sheetName = SHEET_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRow() <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected static final String[] ROW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRow() <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected String[] row = ROW_EDEFAULT;

	/**
	 * The default value of the '{@link #getParentRow() <em>Parent Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentRow()
	 * @generated
	 * @ordered
	 */
	protected static final String[] PARENT_ROW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParentRow() <em>Parent Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentRow()
	 * @generated
	 * @ordered
	 */
	protected String[] parentRow = PARENT_ROW_EDEFAULT;

	/**
	 * The default value of the '{@link #getSheet() <em>Sheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheet()
	 * @generated
	 * @ordered
	 */
	protected static final int SHEET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSheet() <em>Sheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheet()
	 * @generated
	 * @ordered
	 */
	protected int sheet = SHEET_EDEFAULT;

	/**
	 * The default value of the '{@link #getParent() <em>Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected static final Resource PARENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected Resource parent = PARENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getArchive() <em>Archive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchive()
	 * @generated
	 * @ordered
	 */
	protected static final Resource ARCHIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArchive() <em>Archive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchive()
	 * @generated
	 * @ordered
	 */
	protected Resource archive = ARCHIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDependents() <em>Dependents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependents()
	 * @generated
	 * @ordered
	 */
	protected static final ResourceSet DEPENDENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDependents() <em>Dependents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependents()
	 * @generated
	 * @ordered
	 */
	protected ResourceSet dependents = DEPENDENTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSetInfFromSpread() <em>Set Inf From Spread</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetInfFromSpread()
	 * @generated
	 * @ordered
	 */
	protected Util setInfFromSpread;

	/**
	 * The cached value of the '{@link #getGetCommonInf() <em>Get Common Inf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetCommonInf()
	 * @generated
	 * @ordered
	 */
	protected Table getCommonInf;

	/**
	 * The cached value of the '{@link #getSetMPorCP() <em>Set MPor CP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetMPorCP()
	 * @generated
	 * @ordered
	 */
	protected ArchiveProperty setMPorCP;

	/**
	 * The cached value of the '{@link #getGetSheetMP() <em>Get Sheet MP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetSheetMP()
	 * @generated
	 * @ordered
	 */
	protected MonitorPoint getSheetMP;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MandCBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return BasePackage.Literals.MAND_CBASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpreadsheetName() {
		return spreadsheetName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpreadsheetName(String newSpreadsheetName) {
		String oldSpreadsheetName = spreadsheetName;
		spreadsheetName = newSpreadsheetName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MAND_CBASE__SPREADSHEET_NAME, oldSpreadsheetName, spreadsheetName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSheetName() {
		return sheetName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSheetName(String newSheetName) {
		String oldSheetName = sheetName;
		sheetName = newSheetName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MAND_CBASE__SHEET_NAME, oldSheetName, sheetName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String[] getRow() {
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRow(String[] newRow) {
		String[] oldRow = row;
		row = newRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MAND_CBASE__ROW, oldRow, row));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String[] getParentRow() {
		return parentRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentRow(String[] newParentRow) {
		String[] oldParentRow = parentRow;
		parentRow = newParentRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MAND_CBASE__PARENT_ROW, oldParentRow, parentRow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSheet() {
		return sheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSheet(int newSheet) {
		int oldSheet = sheet;
		sheet = newSheet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MAND_CBASE__SHEET, oldSheet, sheet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Resource newParent) {
		Resource oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MAND_CBASE__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getArchive() {
		return archive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchive(Resource newArchive) {
		Resource oldArchive = archive;
		archive = newArchive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MAND_CBASE__ARCHIVE, oldArchive, archive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceSet getDependents() {
		return dependents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependents(ResourceSet newDependents) {
		ResourceSet oldDependents = dependents;
		dependents = newDependents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MAND_CBASE__DEPENDENTS, oldDependents, dependents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Util getSetInfFromSpread() {
		if (setInfFromSpread != null && setInfFromSpread.eIsProxy()) {
			InternalEObject oldSetInfFromSpread = (InternalEObject)setInfFromSpread;
			setInfFromSpread = (Util)eResolveProxy(oldSetInfFromSpread);
			if (setInfFromSpread != oldSetInfFromSpread) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.MAND_CBASE__SET_INF_FROM_SPREAD, oldSetInfFromSpread, setInfFromSpread));
			}
		}
		return setInfFromSpread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Util basicGetSetInfFromSpread() {
		return setInfFromSpread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetInfFromSpread(Util newSetInfFromSpread) {
		Util oldSetInfFromSpread = setInfFromSpread;
		setInfFromSpread = newSetInfFromSpread;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MAND_CBASE__SET_INF_FROM_SPREAD, oldSetInfFromSpread, setInfFromSpread));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getGetCommonInf() {
		if (getCommonInf != null && getCommonInf.eIsProxy()) {
			InternalEObject oldGetCommonInf = (InternalEObject)getCommonInf;
			getCommonInf = (Table)eResolveProxy(oldGetCommonInf);
			if (getCommonInf != oldGetCommonInf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.MAND_CBASE__GET_COMMON_INF, oldGetCommonInf, getCommonInf));
			}
		}
		return getCommonInf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetGetCommonInf() {
		return getCommonInf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetCommonInf(Table newGetCommonInf) {
		Table oldGetCommonInf = getCommonInf;
		getCommonInf = newGetCommonInf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MAND_CBASE__GET_COMMON_INF, oldGetCommonInf, getCommonInf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchiveProperty getSetMPorCP() {
		if (setMPorCP != null && setMPorCP.eIsProxy()) {
			InternalEObject oldSetMPorCP = (InternalEObject)setMPorCP;
			setMPorCP = (ArchiveProperty)eResolveProxy(oldSetMPorCP);
			if (setMPorCP != oldSetMPorCP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.MAND_CBASE__SET_MPOR_CP, oldSetMPorCP, setMPorCP));
			}
		}
		return setMPorCP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchiveProperty basicGetSetMPorCP() {
		return setMPorCP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetMPorCP(ArchiveProperty newSetMPorCP) {
		ArchiveProperty oldSetMPorCP = setMPorCP;
		setMPorCP = newSetMPorCP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MAND_CBASE__SET_MPOR_CP, oldSetMPorCP, setMPorCP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorPoint getGetSheetMP() {
		if (getSheetMP != null && getSheetMP.eIsProxy()) {
			InternalEObject oldGetSheetMP = (InternalEObject)getSheetMP;
			getSheetMP = (MonitorPoint)eResolveProxy(oldGetSheetMP);
			if (getSheetMP != oldGetSheetMP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.MAND_CBASE__GET_SHEET_MP, oldGetSheetMP, getSheetMP));
			}
		}
		return getSheetMP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorPoint basicGetGetSheetMP() {
		return getSheetMP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetSheetMP(MonitorPoint newGetSheetMP) {
		MonitorPoint oldGetSheetMP = getSheetMP;
		getSheetMP = newGetSheetMP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MAND_CBASE__GET_SHEET_MP, oldGetSheetMP, getSheetMP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addDependent(Resource son) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDependent() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasDependents() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String FullName() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Name() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDependentName() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAltDependentName() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDependsOnName() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAltDependsOnName() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DataUnits() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String MinRange() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String MaxRange() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Mode() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean Implement() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean External() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Description() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExternal() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isArchived() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isImplemented() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String dropPrefix(String s) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String PName() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String AltPName() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DescriptionAsString() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DescriptionFormatted() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DescriptionFormattedL4() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DescriptionFormattedL5() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMonitored() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasePackage.MAND_CBASE__SPREADSHEET_NAME:
				return getSpreadsheetName();
			case BasePackage.MAND_CBASE__SHEET_NAME:
				return getSheetName();
			case BasePackage.MAND_CBASE__ROW:
				return getRow();
			case BasePackage.MAND_CBASE__PARENT_ROW:
				return getParentRow();
			case BasePackage.MAND_CBASE__SHEET:
				return new Integer(getSheet());
			case BasePackage.MAND_CBASE__PARENT:
				return getParent();
			case BasePackage.MAND_CBASE__ARCHIVE:
				return getArchive();
			case BasePackage.MAND_CBASE__DEPENDENTS:
				return getDependents();
			case BasePackage.MAND_CBASE__SET_INF_FROM_SPREAD:
				if (resolve) return getSetInfFromSpread();
				return basicGetSetInfFromSpread();
			case BasePackage.MAND_CBASE__GET_COMMON_INF:
				if (resolve) return getGetCommonInf();
				return basicGetGetCommonInf();
			case BasePackage.MAND_CBASE__SET_MPOR_CP:
				if (resolve) return getSetMPorCP();
				return basicGetSetMPorCP();
			case BasePackage.MAND_CBASE__GET_SHEET_MP:
				if (resolve) return getGetSheetMP();
				return basicGetGetSheetMP();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BasePackage.MAND_CBASE__SPREADSHEET_NAME:
				setSpreadsheetName((String)newValue);
				return;
			case BasePackage.MAND_CBASE__SHEET_NAME:
				setSheetName((String)newValue);
				return;
			case BasePackage.MAND_CBASE__ROW:
				setRow((String[])newValue);
				return;
			case BasePackage.MAND_CBASE__PARENT_ROW:
				setParentRow((String[])newValue);
				return;
			case BasePackage.MAND_CBASE__SHEET:
				setSheet(((Integer)newValue).intValue());
				return;
			case BasePackage.MAND_CBASE__PARENT:
				setParent((Resource)newValue);
				return;
			case BasePackage.MAND_CBASE__ARCHIVE:
				setArchive((Resource)newValue);
				return;
			case BasePackage.MAND_CBASE__DEPENDENTS:
				setDependents((ResourceSet)newValue);
				return;
			case BasePackage.MAND_CBASE__SET_INF_FROM_SPREAD:
				setSetInfFromSpread((Util)newValue);
				return;
			case BasePackage.MAND_CBASE__GET_COMMON_INF:
				setGetCommonInf((Table)newValue);
				return;
			case BasePackage.MAND_CBASE__SET_MPOR_CP:
				setSetMPorCP((ArchiveProperty)newValue);
				return;
			case BasePackage.MAND_CBASE__GET_SHEET_MP:
				setGetSheetMP((MonitorPoint)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case BasePackage.MAND_CBASE__SPREADSHEET_NAME:
				setSpreadsheetName(SPREADSHEET_NAME_EDEFAULT);
				return;
			case BasePackage.MAND_CBASE__SHEET_NAME:
				setSheetName(SHEET_NAME_EDEFAULT);
				return;
			case BasePackage.MAND_CBASE__ROW:
				setRow(ROW_EDEFAULT);
				return;
			case BasePackage.MAND_CBASE__PARENT_ROW:
				setParentRow(PARENT_ROW_EDEFAULT);
				return;
			case BasePackage.MAND_CBASE__SHEET:
				setSheet(SHEET_EDEFAULT);
				return;
			case BasePackage.MAND_CBASE__PARENT:
				setParent(PARENT_EDEFAULT);
				return;
			case BasePackage.MAND_CBASE__ARCHIVE:
				setArchive(ARCHIVE_EDEFAULT);
				return;
			case BasePackage.MAND_CBASE__DEPENDENTS:
				setDependents(DEPENDENTS_EDEFAULT);
				return;
			case BasePackage.MAND_CBASE__SET_INF_FROM_SPREAD:
				setSetInfFromSpread((Util)null);
				return;
			case BasePackage.MAND_CBASE__GET_COMMON_INF:
				setGetCommonInf((Table)null);
				return;
			case BasePackage.MAND_CBASE__SET_MPOR_CP:
				setSetMPorCP((ArchiveProperty)null);
				return;
			case BasePackage.MAND_CBASE__GET_SHEET_MP:
				setGetSheetMP((MonitorPoint)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BasePackage.MAND_CBASE__SPREADSHEET_NAME:
				return SPREADSHEET_NAME_EDEFAULT == null ? spreadsheetName != null : !SPREADSHEET_NAME_EDEFAULT.equals(spreadsheetName);
			case BasePackage.MAND_CBASE__SHEET_NAME:
				return SHEET_NAME_EDEFAULT == null ? sheetName != null : !SHEET_NAME_EDEFAULT.equals(sheetName);
			case BasePackage.MAND_CBASE__ROW:
				return ROW_EDEFAULT == null ? row != null : !ROW_EDEFAULT.equals(row);
			case BasePackage.MAND_CBASE__PARENT_ROW:
				return PARENT_ROW_EDEFAULT == null ? parentRow != null : !PARENT_ROW_EDEFAULT.equals(parentRow);
			case BasePackage.MAND_CBASE__SHEET:
				return sheet != SHEET_EDEFAULT;
			case BasePackage.MAND_CBASE__PARENT:
				return PARENT_EDEFAULT == null ? parent != null : !PARENT_EDEFAULT.equals(parent);
			case BasePackage.MAND_CBASE__ARCHIVE:
				return ARCHIVE_EDEFAULT == null ? archive != null : !ARCHIVE_EDEFAULT.equals(archive);
			case BasePackage.MAND_CBASE__DEPENDENTS:
				return DEPENDENTS_EDEFAULT == null ? dependents != null : !DEPENDENTS_EDEFAULT.equals(dependents);
			case BasePackage.MAND_CBASE__SET_INF_FROM_SPREAD:
				return setInfFromSpread != null;
			case BasePackage.MAND_CBASE__GET_COMMON_INF:
				return getCommonInf != null;
			case BasePackage.MAND_CBASE__SET_MPOR_CP:
				return setMPorCP != null;
			case BasePackage.MAND_CBASE__GET_SHEET_MP:
				return getSheetMP != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (spreadsheetName: ");
		result.append(spreadsheetName);
		result.append(", sheetName: ");
		result.append(sheetName);
		result.append(", row: ");
		result.append(row);
		result.append(", parentRow: ");
		result.append(parentRow);
		result.append(", sheet: ");
		result.append(sheet);
		result.append(", parent: ");
		result.append(parent);
		result.append(", archive: ");
		result.append(archive);
		result.append(", dependents: ");
		result.append(dependents);
		result.append(')');
		return result.toString();
	}

} //MandCBaseImpl
