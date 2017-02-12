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

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import alma.Control.datamodel.meta.base.ArchiveProperty;
import alma.Control.datamodel.meta.base.BasePackage;
import alma.Control.datamodel.meta.base.Table;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Archive Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.ArchivePropertyImpl#getRow <em>Row</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.ArchivePropertyImpl#getSheet <em>Sheet</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.ArchivePropertyImpl#getMp <em>Mp</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.ArchivePropertyImpl#getCp <em>Cp</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.ArchivePropertyImpl#getGetColumnsInfoOfArchi <em>Get Columns Info Of Archi</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArchivePropertyImpl extends EObjectImpl implements ArchiveProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	public ArchivePropertyImpl(String[] row) {
		this.row = row;
		this.sheet = BaseFactoryImpl.eINSTANCE.createTable().getSheetNum("Archive Property");
	}
	
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
	 * The default value of the '{@link #getMp() <em>Mp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMp()
	 * @generated
	 * @ordered
	 */
	protected static final Resource MP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMp() <em>Mp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMp()
	 * @generated
	 * @ordered
	 */
	protected Resource mp = MP_EDEFAULT;

	/**
	 * The default value of the '{@link #getCp() <em>Cp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCp()
	 * @generated
	 * @ordered
	 */
	protected static final Resource CP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCp() <em>Cp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCp()
	 * @generated
	 * @ordered
	 */
	protected Resource cp = CP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGetColumnsInfoOfArchi() <em>Get Columns Info Of Archi</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetColumnsInfoOfArchi()
	 * @generated
	 * @ordered
	 */
	protected Table getColumnsInfoOfArchi;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchivePropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasePackage.Literals.ARCHIVE_PROPERTY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.ARCHIVE_PROPERTY__ROW, oldRow, row));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.ARCHIVE_PROPERTY__SHEET, oldSheet, sheet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getMp() {
		return mp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMp(Resource newMp) {
		Resource oldMp = mp;
		mp = newMp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.ARCHIVE_PROPERTY__MP, oldMp, mp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getCp() {
		return cp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCp(Resource newCp) {
		Resource oldCp = cp;
		cp = newCp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.ARCHIVE_PROPERTY__CP, oldCp, cp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getGetColumnsInfoOfArchi() {
		if (getColumnsInfoOfArchi != null && getColumnsInfoOfArchi.eIsProxy()) {
			InternalEObject oldGetColumnsInfoOfArchi = (InternalEObject)getColumnsInfoOfArchi;
			getColumnsInfoOfArchi = (Table)eResolveProxy(oldGetColumnsInfoOfArchi);
			if (getColumnsInfoOfArchi != oldGetColumnsInfoOfArchi) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.ARCHIVE_PROPERTY__GET_COLUMNS_INFO_OF_ARCHI, oldGetColumnsInfoOfArchi, getColumnsInfoOfArchi));
			}
		}
		return getColumnsInfoOfArchi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetGetColumnsInfoOfArchi() {
		return getColumnsInfoOfArchi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetColumnsInfoOfArchi(Table newGetColumnsInfoOfArchi) {
		Table oldGetColumnsInfoOfArchi = getColumnsInfoOfArchi;
		getColumnsInfoOfArchi = newGetColumnsInfoOfArchi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.ARCHIVE_PROPERTY__GET_COLUMNS_INFO_OF_ARCHI, oldGetColumnsInfoOfArchi, getColumnsInfoOfArchi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRefersTo() {
		return mp != null || cp != null;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMonitorPoint() {
		return mp != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isControlPoint() {
		return cp != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getMonitorPoint() {
		return mp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getControlPoint() {
		return cp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String APName() {
		 String name = Name();
		if (name.startsWith(TableImpl.DEP_CHAR_EDEFAULT))
			name = name.substring(1);
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Name() {
		return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "Name")];
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String RefersTo() {
		return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "Refers To")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String IntervalFull() {
		return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "Interval (secs)")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Interval() {
		return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "Interval (secs)")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean OnlyOnChange() {
		return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "Only On Change")].equals("yes");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DisplayUnits() {
		return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "Display Units")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String GraphMin() {
		return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "Graph Min")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String GraphMax() {
		return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "Graph Max")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Format() {
		return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "Format")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean OnStartup() {
		return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "On Startup")].equals("yes");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Title() {
		return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "Title")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasePackage.ARCHIVE_PROPERTY__ROW:
				return getRow();
			case BasePackage.ARCHIVE_PROPERTY__SHEET:
				return getSheet();
			case BasePackage.ARCHIVE_PROPERTY__MP:
				return getMp();
			case BasePackage.ARCHIVE_PROPERTY__CP:
				return getCp();
			case BasePackage.ARCHIVE_PROPERTY__GET_COLUMNS_INFO_OF_ARCHI:
				if (resolve) return getGetColumnsInfoOfArchi();
				return basicGetGetColumnsInfoOfArchi();
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
			case BasePackage.ARCHIVE_PROPERTY__ROW:
				setRow((String[])newValue);
				return;
			case BasePackage.ARCHIVE_PROPERTY__SHEET:
				setSheet((Integer)newValue);
				return;
			case BasePackage.ARCHIVE_PROPERTY__MP:
				setMp((Resource)newValue);
				return;
			case BasePackage.ARCHIVE_PROPERTY__CP:
				setCp((Resource)newValue);
				return;
			case BasePackage.ARCHIVE_PROPERTY__GET_COLUMNS_INFO_OF_ARCHI:
				setGetColumnsInfoOfArchi((Table)newValue);
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
			case BasePackage.ARCHIVE_PROPERTY__ROW:
				setRow(ROW_EDEFAULT);
				return;
			case BasePackage.ARCHIVE_PROPERTY__SHEET:
				setSheet(SHEET_EDEFAULT);
				return;
			case BasePackage.ARCHIVE_PROPERTY__MP:
				setMp(MP_EDEFAULT);
				return;
			case BasePackage.ARCHIVE_PROPERTY__CP:
				setCp(CP_EDEFAULT);
				return;
			case BasePackage.ARCHIVE_PROPERTY__GET_COLUMNS_INFO_OF_ARCHI:
				setGetColumnsInfoOfArchi((Table)null);
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
			case BasePackage.ARCHIVE_PROPERTY__ROW:
				return ROW_EDEFAULT == null ? row != null : !ROW_EDEFAULT.equals(row);
			case BasePackage.ARCHIVE_PROPERTY__SHEET:
				return sheet != SHEET_EDEFAULT;
			case BasePackage.ARCHIVE_PROPERTY__MP:
				return MP_EDEFAULT == null ? mp != null : !MP_EDEFAULT.equals(mp);
			case BasePackage.ARCHIVE_PROPERTY__CP:
				return CP_EDEFAULT == null ? cp != null : !CP_EDEFAULT.equals(cp);
			case BasePackage.ARCHIVE_PROPERTY__GET_COLUMNS_INFO_OF_ARCHI:
				return getColumnsInfoOfArchi != null;
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
		result.append(" (row: ");
		result.append(row);
		result.append(", sheet: ");
		result.append(sheet);
		result.append(", mp: ");
		result.append(mp);
		result.append(", cp: ");
		result.append(cp);
		result.append(')');
		return result.toString();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	@Override
	public ResourceSet getResourceSet() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	@Override
	public URI getURI() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	@Override
	public void setURI(URI uri) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	@Override
	public long getTimeStamp() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setTimeStamp(long timeStamp) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	@Override
	public EList<EObject> getContents() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	@Override
	public TreeIterator<EObject> getAllContents() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	@Override
	public String getURIFragment(EObject eObject) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	@Override
	public EObject getEObject(String uriFragment) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	@Override
	public void save(Map<?, ?> options) throws IOException {
		// TODO Auto-generated method stub
		
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	@Override
	public void load(Map<?, ?> options) throws IOException {
		// TODO Auto-generated method stub
		
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	@Override
	public void save(OutputStream outputStream, Map<?, ?> options)
			throws IOException {
		// TODO Auto-generated method stub
		
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	@Override
	public void load(InputStream inputStream, Map<?, ?> options)
			throws IOException {
		// TODO Auto-generated method stub
		
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	@Override
	public boolean isTrackingModification() {
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	@Override
	public void setTrackingModification(boolean isTrackingModification) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	@Override
	public boolean isModified() {
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	@Override
	public void setModified(boolean isModified) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	@Override
	public boolean isLoaded() {
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	@Override
	public void unload() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	@Override
	public void delete(Map<?, ?> options) throws IOException {
		// TODO Auto-generated method stub
		
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	@Override
	public EList<Diagnostic> getErrors() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	@Override
	public EList<Diagnostic> getWarnings() {
		// TODO Auto-generated method stub
		return null;
	}

} //ArchivePropertyImpl
