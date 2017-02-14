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
package alma.Control.datamodel.meta.base.impl;

import alma.Control.datamodel.meta.base.ArchiveProperty;
import alma.Control.datamodel.meta.base.BaseFactory;
import alma.Control.datamodel.meta.base.BasePackage;
import alma.Control.datamodel.meta.base.MandCBase;
import alma.Control.datamodel.meta.base.MonitorPoint;
import alma.Control.datamodel.meta.base.Table;
import alma.Control.datamodel.meta.base.Util;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mand CBase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.MandCBaseImpl#getSpreadsheetName <em>Spreadsheet Name</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.MandCBaseImpl#getSheetName <em>Sheet Name</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.MandCBaseImpl#getRow <em>Row</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.MandCBaseImpl#getParentRow <em>Parent Row</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.MandCBaseImpl#getSheet <em>Sheet</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.MandCBaseImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.MandCBaseImpl#getArchive <em>Archive</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.MandCBaseImpl#getDependents <em>Dependents</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.MandCBaseImpl#getSetInfFromSpread <em>Set Inf From Spread</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.MandCBaseImpl#getToCommonInf <em>To Common Inf</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.MandCBaseImpl#getToMPorCP <em>To MPor CP</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.MandCBaseImpl#getToSheetMP <em>To Sheet MP</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MandCBaseImpl extends EObjectImpl implements MandCBase {
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	public MandCBaseImpl(String[] row, Resource parent) {
		this.row = row;
		this.parent = parent;
		dependents = new ResourceSetImpl();
		sheet = (this instanceof MonitorPoint) ? BaseFactory.eINSTANCE.createTable().getSheetNum("Monitor Point") : BaseFactory.eINSTANCE.createTable().getSheetNum("Control Point");
	}
	
	/**
	 * The default value of the '{@link #getSpreadsheetName() <em>Spreadsheet Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpreadsheetName()
	 * @generated
	 * @ordered
	 */
	protected static final String SPREADSHEET_NAME_EDEFAULT = "Not needed";

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
	 * The cached value of the '{@link #getToCommonInf() <em>To Common Inf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToCommonInf()
	 * @generated
	 * @ordered
	 */
	protected Table toCommonInf;

	/**
	 * The cached value of the '{@link #getToMPorCP() <em>To MPor CP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToMPorCP()
	 * @generated
	 * @ordered
	 */
	protected ArchiveProperty toMPorCP;

	/**
	 * The cached value of the '{@link #getToSheetMP() <em>To Sheet MP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToSheetMP()
	 * @generated
	 * @ordered
	 */
	protected MonitorPoint toSheetMP;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandCBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	public Table getToCommonInf() {
		if (toCommonInf != null && toCommonInf.eIsProxy()) {
			InternalEObject oldToCommonInf = (InternalEObject)toCommonInf;
			toCommonInf = (Table)eResolveProxy(oldToCommonInf);
			if (toCommonInf != oldToCommonInf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.MAND_CBASE__TO_COMMON_INF, oldToCommonInf, toCommonInf));
			}
		}
		return toCommonInf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetToCommonInf() {
		return toCommonInf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToCommonInf(Table newToCommonInf) {
		Table oldToCommonInf = toCommonInf;
		toCommonInf = newToCommonInf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MAND_CBASE__TO_COMMON_INF, oldToCommonInf, toCommonInf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchiveProperty getToMPorCP() {
		if (toMPorCP != null && toMPorCP.eIsProxy()) {
			InternalEObject oldToMPorCP = (InternalEObject)toMPorCP;
			toMPorCP = (ArchiveProperty)eResolveProxy(oldToMPorCP);
			if (toMPorCP != oldToMPorCP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.MAND_CBASE__TO_MPOR_CP, oldToMPorCP, toMPorCP));
			}
		}
		return toMPorCP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchiveProperty basicGetToMPorCP() {
		return toMPorCP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToMPorCP(ArchiveProperty newToMPorCP) {
		ArchiveProperty oldToMPorCP = toMPorCP;
		toMPorCP = newToMPorCP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MAND_CBASE__TO_MPOR_CP, oldToMPorCP, toMPorCP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorPoint getToSheetMP() {
		if (toSheetMP != null && toSheetMP.eIsProxy()) {
			InternalEObject oldToSheetMP = (InternalEObject)toSheetMP;
			toSheetMP = (MonitorPoint)eResolveProxy(oldToSheetMP);
			if (toSheetMP != oldToSheetMP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.MAND_CBASE__TO_SHEET_MP, oldToSheetMP, toSheetMP));
			}
		}
		return toSheetMP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorPoint basicGetToSheetMP() {
		return toSheetMP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToSheetMP(MonitorPoint newToSheetMP) {
		MonitorPoint oldToSheetMP = toSheetMP;
		toSheetMP = newToSheetMP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MAND_CBASE__TO_SHEET_MP, oldToSheetMP, toSheetMP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addDependent(final Resource son) {
		dependents.getResources().add(son);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDependent() {
		if (parent == null)
			return false;
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasDependents() {
		return !dependents.getResources().isEmpty();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String FullName() {
		return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "Name")];
		
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Name() {
		if(isDependent())
			return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "Name")].substring(1);
		else
			return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "Name")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDependentName() {
		return Name();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAltDependentName() {
		return BaseFactoryImpl.eINSTANCE.createUtil().AltName(getDependentName());
		
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDependsOnName() {
		if(!isDependent())
			return "";
		return ((MandCBase)getParent()).Name();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAltDependsOnName() {
		return BaseFactoryImpl.eINSTANCE.createUtil().AltName(((MandCBase)getParent()).Name());
		
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DataUnits() {
		return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "Data Units")];
		
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String MinRange() {
		return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "Min Range")];
		
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String MaxRange() {
		return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "Max Range")];
		
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Mode() {
		return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "Mode")];
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean Implement() {
		return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "Implement")].equals("yes");
		
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean External() {
		return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "External")].equals("yes");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Description() {
		return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "Description")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExternal() {
		return External();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isArchived() {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isImplemented() {
		return Implement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String dropPrefix(final String s) {
		if (s.startsWith("GET_") || s.startsWith("SET_"))
			return s.substring(4);
		return s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String PName() {
		if (Name().startsWith(TableImpl.DEP_CHAR_EDEFAULT))
			return dropPrefix(Name().substring(1));
		return dropPrefix(Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String AltPName() {
		if (Name().startsWith("SET_"))
			return "Cntl" + BaseFactoryImpl.eINSTANCE.createUtil().AltName(PName()); 
		return BaseFactoryImpl.eINSTANCE.createUtil().AltName(PName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DescriptionAsString() {
		return BaseFactoryImpl.eINSTANCE.createUtil().descriptionAsString(Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DescriptionFormatted() {
		return BaseFactoryImpl.eINSTANCE.createUtil().formatDescriptionL2(Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DescriptionFormattedL4() {
		return BaseFactoryImpl.eINSTANCE.createUtil().formatDescriptionL4(Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DescriptionFormattedL5() {
		return BaseFactoryImpl.eINSTANCE.createUtil().formatDescriptionL5(Description());
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
	@Override
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
				return getSheet();
			case BasePackage.MAND_CBASE__PARENT:
				return getParent();
			case BasePackage.MAND_CBASE__ARCHIVE:
				return getArchive();
			case BasePackage.MAND_CBASE__DEPENDENTS:
				return getDependents();
			case BasePackage.MAND_CBASE__SET_INF_FROM_SPREAD:
				if (resolve) return getSetInfFromSpread();
				return basicGetSetInfFromSpread();
			case BasePackage.MAND_CBASE__TO_COMMON_INF:
				if (resolve) return getToCommonInf();
				return basicGetToCommonInf();
			case BasePackage.MAND_CBASE__TO_MPOR_CP:
				if (resolve) return getToMPorCP();
				return basicGetToMPorCP();
			case BasePackage.MAND_CBASE__TO_SHEET_MP:
				if (resolve) return getToSheetMP();
				return basicGetToSheetMP();
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
				setSheet((Integer)newValue);
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
			case BasePackage.MAND_CBASE__TO_COMMON_INF:
				setToCommonInf((Table)newValue);
				return;
			case BasePackage.MAND_CBASE__TO_MPOR_CP:
				setToMPorCP((ArchiveProperty)newValue);
				return;
			case BasePackage.MAND_CBASE__TO_SHEET_MP:
				setToSheetMP((MonitorPoint)newValue);
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
			case BasePackage.MAND_CBASE__TO_COMMON_INF:
				setToCommonInf((Table)null);
				return;
			case BasePackage.MAND_CBASE__TO_MPOR_CP:
				setToMPorCP((ArchiveProperty)null);
				return;
			case BasePackage.MAND_CBASE__TO_SHEET_MP:
				setToSheetMP((MonitorPoint)null);
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
			case BasePackage.MAND_CBASE__TO_COMMON_INF:
				return toCommonInf != null;
			case BasePackage.MAND_CBASE__TO_MPOR_CP:
				return toMPorCP != null;
			case BasePackage.MAND_CBASE__TO_SHEET_MP:
				return toSheetMP != null;
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
