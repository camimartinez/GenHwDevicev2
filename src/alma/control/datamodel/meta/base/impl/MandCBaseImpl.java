package alma.control.datamodel.meta.base.impl;
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

import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import alma.control.datamodel.meta.amb.Monitor;
import alma.control.datamodel.meta.base.ArchiveProperty;
import alma.control.datamodel.meta.base.BasePackage;
import alma.control.datamodel.meta.base.ControlPoint;
import alma.control.datamodel.meta.base.MandCBase;
import alma.control.datamodel.meta.base.MonitorPoint;
import alma.control.datamodel.meta.base.Table;
import alma.control.datamodel.meta.base.Util;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mand CBase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alma.control.datamodel.meta.base.impl.MandCBaseImpl#getSpreadsheetName <em>Spreadsheet Name</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.MandCBaseImpl#getSheetName <em>Sheet Name</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.MandCBaseImpl#getRow <em>Row</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.MandCBaseImpl#getParentRow <em>Parent Row</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.MandCBaseImpl#getSheet <em>Sheet</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.MandCBaseImpl#getDependents <em>Dependents</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.MandCBaseImpl#getResourceSetDependents <em>Resource Set Dependents</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.MandCBaseImpl#getTables <em>Tables</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.MandCBaseImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.MandCBaseImpl#getUtils <em>Utils</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.MandCBaseImpl#getArchive <em>Archive</em>}</li>
 * </ul>
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
	 * The default value of the '{@link #getDependents() <em>Dependents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependents()
	 * @generated
	 * @ordered
	 */
	protected static final Resource DEPENDENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDependents() <em>Dependents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependents()
	 * @generated
	 * @ordered
	 */
	protected Resource dependents = DEPENDENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceSetDependents() <em>Resource Set Dependents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceSetDependents()
	 * @generated
	 * @ordered
	 */
	protected static final ResourceSet RESOURCE_SET_DEPENDENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceSetDependents() <em>Resource Set Dependents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceSetDependents()
	 * @generated
	 * @ordered
	 */
	protected ResourceSet resourceSetDependents = RESOURCE_SET_DEPENDENTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTables() <em>Tables</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTables()
	 * @generated
	 * @ordered
	 */
	protected Table tables;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected EObject parent;

	/**
	 * The cached value of the '{@link #getUtils() <em>Utils</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtils()
	 * @generated
	 * @ordered
	 */
	protected Util utils;

	/**
	 * The cached value of the '{@link #getArchive() <em>Archive</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchive()
	 * @generated
	 * @ordered
	 */
	protected ArchiveProperty archive;

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
	public EObject getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.MAND_CBASE__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(EObject newParent) {
		EObject oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MAND_CBASE__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchiveProperty getArchive() {
		if (archive != null && archive.eIsProxy()) {
			InternalEObject oldArchive = (InternalEObject)archive;
			archive = (ArchiveProperty)eResolveProxy(oldArchive);
			if (archive != oldArchive) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.MAND_CBASE__ARCHIVE, oldArchive, archive));
			}
		}
		return archive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchiveProperty basicGetArchive() {
		return archive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	public void setArchive(ArchiveProperty newArchive) {
		this.archive = newArchive;
		if (archive != null){
			if(this instanceof MonitorPoint)	
				archive.setMP((MonitorPoint)this);
			else
				archive.setCP((ControlPoint)this);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addDependent(final EObject son) {
		dependents.getContents().add(son);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean IsDependent() {
		if (parent == null)
			return false;
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getDependents() {
		return dependents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependents(Resource newDependents) {
		Resource oldDependents = dependents;
		dependents = newDependents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MAND_CBASE__DEPENDENTS, oldDependents, dependents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceSet getResourceSetDependents() {
		return resourceSetDependents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceSetDependents(ResourceSet newResourceSetDependents) {
		ResourceSet oldResourceSetDependents = resourceSetDependents;
		resourceSetDependents = newResourceSetDependents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MAND_CBASE__RESOURCE_SET_DEPENDENTS, oldResourceSetDependents, resourceSetDependents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getTables() {
		if (tables != null && tables.eIsProxy()) {
			InternalEObject oldTables = (InternalEObject)tables;
			tables = (Table)eResolveProxy(oldTables);
			if (tables != oldTables) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.MAND_CBASE__TABLES, oldTables, tables));
			}
		}
		return tables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetTables() {
		return tables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTables(Table newTables) {
		Table oldTables = tables;
		tables = newTables;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MAND_CBASE__TABLES, oldTables, tables));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Util getUtils() {
		if (utils != null && utils.eIsProxy()) {
			InternalEObject oldUtils = (InternalEObject)utils;
			utils = (Util)eResolveProxy(oldUtils);
			if (utils != oldUtils) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.MAND_CBASE__UTILS, oldUtils, utils));
			}
		}
		return utils;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Util basicGetUtils() {
		return utils;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtils(Util newUtils) {
		Util oldUtils = utils;
		utils = newUtils;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MAND_CBASE__UTILS, oldUtils, utils));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasDependents() {
		return !dependents.getContents().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String FullName() {
		return row[tables.getColNum(sheet, "Name")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Name() {
		if(IsDependent())
							return row[tables.getColNum(sheet, "Name")].substring(1);
						else
							return row[tables.getColNum(sheet, "Name")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String GetDependentName() {
		return Name();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String GetAltDependentName() {
		return utils.AltName(GetDependentName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String GetDependsOnName() {
		if(!IsDependent())
					return "";
				return ((MandCBase)getParent()).Name();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String GetAltDependsOnName() {
		return utils.AltName(((MandCBase)getParent()).Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DataUnits() {
		return row[tables.getColNum(sheet, "Data Units")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String MinRange() {
		return row[tables.getColNum(sheet, "Min Range")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String MaxRange() {
		return row[tables.getColNum(sheet, "Max Range")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Mode() {
		return row[tables.getColNum(sheet, "Mode")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean Implement() {
		return row[tables.getColNum(sheet, "Implement")].equals("yes");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean External() {
		return row[tables.getColNum(sheet, "External")].equals("yes");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Description() {
		return row[tables.getColNum(sheet, "Description")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean IsExternal() {
		return External();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean IsArchived() {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean IsImplemented() {
		return Implement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeException dErr(final RuntimeException err, final String cell) {
		return new RuntimeException(spreadsheetName +":"+ sheetName +":"+ cell +":"+ err.toString());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeException dErr(final String err, final String cell) {
		return new RuntimeException(spreadsheetName +":"+ sheetName +":"+ cell +":"+ err);
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
				if (Name().startsWith(tables.getDepChar()))
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
					return "Cntl" + utils.AltName(PName()); 
				return utils.AltName(PName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DescriptionAsString() {
		return utils.descriptionAsString(Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DescriptionFormatted() {
		return utils.formatDescriptionL2(Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DescriptionFormattedL4() {
		return utils.formatDescriptionL4(Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DescriptionFormattedL5() {
		return utils.formatDescriptionL5(Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	abstract public boolean IsMonitored();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMandCBase(final String[] row, final EObject parent, final Table tables, final Util utils) {
		this.tables = tables;
		this.utils = utils;
		this.row = row;
		this.parent = parent;
		resourceSetDependents = new ResourceSetImpl();
		dependents = resourceSetDependents.createResource(URI.createURI(""));
		sheet = (this instanceof Monitor) ? tables.getSheetNum("Monitor Point") : tables.getSheetNum("Control Point");
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
			case BasePackage.MAND_CBASE__DEPENDENTS:
				return getDependents();
			case BasePackage.MAND_CBASE__RESOURCE_SET_DEPENDENTS:
				return getResourceSetDependents();
			case BasePackage.MAND_CBASE__TABLES:
				if (resolve) return getTables();
				return basicGetTables();
			case BasePackage.MAND_CBASE__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case BasePackage.MAND_CBASE__UTILS:
				if (resolve) return getUtils();
				return basicGetUtils();
			case BasePackage.MAND_CBASE__ARCHIVE:
				if (resolve) return getArchive();
				return basicGetArchive();
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
			case BasePackage.MAND_CBASE__DEPENDENTS:
				setDependents((Resource)newValue);
				return;
			case BasePackage.MAND_CBASE__RESOURCE_SET_DEPENDENTS:
				setResourceSetDependents((ResourceSet)newValue);
				return;
			case BasePackage.MAND_CBASE__TABLES:
				setTables((Table)newValue);
				return;
			case BasePackage.MAND_CBASE__PARENT:
				setParent((EObject)newValue);
				return;
			case BasePackage.MAND_CBASE__UTILS:
				setUtils((Util)newValue);
				return;
			case BasePackage.MAND_CBASE__ARCHIVE:
				setArchive((ArchiveProperty)newValue);
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
			case BasePackage.MAND_CBASE__DEPENDENTS:
				setDependents(DEPENDENTS_EDEFAULT);
				return;
			case BasePackage.MAND_CBASE__RESOURCE_SET_DEPENDENTS:
				setResourceSetDependents(RESOURCE_SET_DEPENDENTS_EDEFAULT);
				return;
			case BasePackage.MAND_CBASE__TABLES:
				setTables((Table)null);
				return;
			case BasePackage.MAND_CBASE__PARENT:
				setParent((EObject)null);
				return;
			case BasePackage.MAND_CBASE__UTILS:
				setUtils((Util)null);
				return;
			case BasePackage.MAND_CBASE__ARCHIVE:
				setArchive((ArchiveProperty)null);
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
			case BasePackage.MAND_CBASE__DEPENDENTS:
				return DEPENDENTS_EDEFAULT == null ? dependents != null : !DEPENDENTS_EDEFAULT.equals(dependents);
			case BasePackage.MAND_CBASE__RESOURCE_SET_DEPENDENTS:
				return RESOURCE_SET_DEPENDENTS_EDEFAULT == null ? resourceSetDependents != null : !RESOURCE_SET_DEPENDENTS_EDEFAULT.equals(resourceSetDependents);
			case BasePackage.MAND_CBASE__TABLES:
				return tables != null;
			case BasePackage.MAND_CBASE__PARENT:
				return parent != null;
			case BasePackage.MAND_CBASE__UTILS:
				return utils != null;
			case BasePackage.MAND_CBASE__ARCHIVE:
				return archive != null;
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
		result.append(", dependents: ");
		result.append(dependents);
		result.append(", resourceSetDependents: ");
		result.append(resourceSetDependents);
		result.append(')');
		return result.toString();
	}

} //MandCBaseImpl
