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
package alma.Control.datamodel.meta.amb.impl;

import alma.Control.datamodel.meta.amb.AmbPackage;
import alma.Control.datamodel.meta.amb.Archive;

import alma.Control.datamodel.meta.base.Table;

import alma.Control.datamodel.meta.base.impl.ArchivePropertyImpl;
import alma.Control.datamodel.meta.base.impl.BaseFactoryImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Archive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alma.Control.datamodel.meta.amb.impl.ArchiveImpl#getBaseFacTmp <em>Base Fac Tmp</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.amb.impl.ArchiveImpl#getToAssemblyColumn <em>To Assembly Column</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArchiveImpl extends ArchivePropertyImpl implements Archive {
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	public ArchiveImpl(String[] row) {
		super(row);
	}

	/**
	 * The default value of the '{@link #getBaseFacTmp() <em>Base Fac Tmp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseFacTmp()
	 * @generated
	 * @ordered
	 */
	protected static final BaseFactoryImpl BASE_FAC_TMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseFacTmp() <em>Base Fac Tmp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseFacTmp()
	 * @generated
	 * @ordered
	 */
	protected BaseFactoryImpl baseFacTmp = BASE_FAC_TMP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getToAssemblyColumn() <em>To Assembly Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToAssemblyColumn()
	 * @generated
	 * @ordered
	 */
	protected Table toAssemblyColumn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmbPackage.Literals.ARCHIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseFactoryImpl getBaseFacTmp() {
		return baseFacTmp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseFacTmp(BaseFactoryImpl newBaseFacTmp) {
		BaseFactoryImpl oldBaseFacTmp = baseFacTmp;
		baseFacTmp = newBaseFacTmp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.ARCHIVE__BASE_FAC_TMP, oldBaseFacTmp, baseFacTmp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getToAssemblyColumn() {
		if (toAssemblyColumn != null && toAssemblyColumn.eIsProxy()) {
			InternalEObject oldToAssemblyColumn = (InternalEObject)toAssemblyColumn;
			toAssemblyColumn = (Table)eResolveProxy(oldToAssemblyColumn);
			if (toAssemblyColumn != oldToAssemblyColumn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.ARCHIVE__TO_ASSEMBLY_COLUMN, oldToAssemblyColumn, toAssemblyColumn));
			}
		}
		return toAssemblyColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetToAssemblyColumn() {
		return toAssemblyColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToAssemblyColumn(Table newToAssemblyColumn) {
		Table oldToAssemblyColumn = toAssemblyColumn;
		toAssemblyColumn = newToAssemblyColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.ARCHIVE__TO_ASSEMBLY_COLUMN, oldToAssemblyColumn, toAssemblyColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Assembly() {
		return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "Assembly")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIntervalTE() {
		String s = IntervalFull();
		       if (s.startsWith("te/"))
		           return true;
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Interval() {
		if(isIntervalTE())
			return IntervalFull().substring(3);
		return IntervalFull();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmbPackage.ARCHIVE__BASE_FAC_TMP:
				return getBaseFacTmp();
			case AmbPackage.ARCHIVE__TO_ASSEMBLY_COLUMN:
				if (resolve) return getToAssemblyColumn();
				return basicGetToAssemblyColumn();
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
			case AmbPackage.ARCHIVE__BASE_FAC_TMP:
				setBaseFacTmp((BaseFactoryImpl)newValue);
				return;
			case AmbPackage.ARCHIVE__TO_ASSEMBLY_COLUMN:
				setToAssemblyColumn((Table)newValue);
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
			case AmbPackage.ARCHIVE__BASE_FAC_TMP:
				setBaseFacTmp(BASE_FAC_TMP_EDEFAULT);
				return;
			case AmbPackage.ARCHIVE__TO_ASSEMBLY_COLUMN:
				setToAssemblyColumn((Table)null);
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
			case AmbPackage.ARCHIVE__BASE_FAC_TMP:
				return BASE_FAC_TMP_EDEFAULT == null ? baseFacTmp != null : !BASE_FAC_TMP_EDEFAULT.equals(baseFacTmp);
			case AmbPackage.ARCHIVE__TO_ASSEMBLY_COLUMN:
				return toAssemblyColumn != null;
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
		result.append(" (baseFacTmp: ");
		result.append(baseFacTmp);
		result.append(')');
		return result.toString();
	}

} //ArchiveImpl