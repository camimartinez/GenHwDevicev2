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

import datamodel.base.Table;

import datamodel.base.impl.ArchivePropertyImpl;
import datamodel.base.impl.BaseFactoryImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Archive AMB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datamodel.amb.impl.ArchiveAMBImpl#getBaseFacTmp <em>Base Fac Tmp</em>}</li>
 *   <li>{@link datamodel.amb.impl.ArchiveAMBImpl#getGetAssemblyColumn <em>Get Assembly Column</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArchiveAMBImpl extends ArchivePropertyImpl implements ArchiveAMB {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	public ArchiveAMBImpl(String[] row) {
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
	 * The cached value of the '{@link #getGetAssemblyColumn() <em>Get Assembly Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetAssemblyColumn()
	 * @generated
	 * @ordered
	 */
	protected Table getAssemblyColumn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchiveAMBImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmbPackage.Literals.ARCHIVE_AMB;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.ARCHIVE_AMB__BASE_FAC_TMP, oldBaseFacTmp, baseFacTmp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getGetAssemblyColumn() {
		if (getAssemblyColumn != null && getAssemblyColumn.eIsProxy()) {
			InternalEObject oldGetAssemblyColumn = (InternalEObject)getAssemblyColumn;
			getAssemblyColumn = (Table)eResolveProxy(oldGetAssemblyColumn);
			if (getAssemblyColumn != oldGetAssemblyColumn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.ARCHIVE_AMB__GET_ASSEMBLY_COLUMN, oldGetAssemblyColumn, getAssemblyColumn));
			}
		}
		return getAssemblyColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetGetAssemblyColumn() {
		return getAssemblyColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetAssemblyColumn(Table newGetAssemblyColumn) {
		Table oldGetAssemblyColumn = getAssemblyColumn;
		getAssemblyColumn = newGetAssemblyColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.ARCHIVE_AMB__GET_ASSEMBLY_COLUMN, oldGetAssemblyColumn, getAssemblyColumn));
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
			case AmbPackage.ARCHIVE_AMB__BASE_FAC_TMP:
				return getBaseFacTmp();
			case AmbPackage.ARCHIVE_AMB__GET_ASSEMBLY_COLUMN:
				if (resolve) return getGetAssemblyColumn();
				return basicGetGetAssemblyColumn();
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
			case AmbPackage.ARCHIVE_AMB__BASE_FAC_TMP:
				setBaseFacTmp((BaseFactoryImpl)newValue);
				return;
			case AmbPackage.ARCHIVE_AMB__GET_ASSEMBLY_COLUMN:
				setGetAssemblyColumn((Table)newValue);
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
			case AmbPackage.ARCHIVE_AMB__BASE_FAC_TMP:
				setBaseFacTmp(BASE_FAC_TMP_EDEFAULT);
				return;
			case AmbPackage.ARCHIVE_AMB__GET_ASSEMBLY_COLUMN:
				setGetAssemblyColumn((Table)null);
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
			case AmbPackage.ARCHIVE_AMB__BASE_FAC_TMP:
				return BASE_FAC_TMP_EDEFAULT == null ? baseFacTmp != null : !BASE_FAC_TMP_EDEFAULT.equals(baseFacTmp);
			case AmbPackage.ARCHIVE_AMB__GET_ASSEMBLY_COLUMN:
				return getAssemblyColumn != null;
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

} //ArchiveAMBImpl
