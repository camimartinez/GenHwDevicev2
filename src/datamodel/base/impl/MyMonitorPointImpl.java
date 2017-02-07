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
package datamodel.base.impl;

import datamodel.base.ArchiveProperty;
import datamodel.base.BasePackage;
import datamodel.base.MonitorPoint;
import datamodel.base.Table;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monitor Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datamodel.base.impl.MonitorPointImpl#getGetInfoFromAPSpread <em>Get Info From AP Spread</em>}</li>
 *   <li>{@link datamodel.base.impl.MonitorPointImpl#getGetInfoFromMPSpread <em>Get Info From MP Spread</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MyMonitorPointImpl extends MandCBaseImpl implements MonitorPoint {
	/**
	 * The cached value of the '{@link #getGetInfoFromAPSpread() <em>Get Info From AP Spread</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetInfoFromAPSpread()
	 * @generated
	 * @ordered
	 */
	protected ArchiveProperty getInfoFromAPSpread;

	/**
	 * The cached value of the '{@link #getGetInfoFromMPSpread() <em>Get Info From MP Spread</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetInfoFromMPSpread()
	 * @generated
	 * @ordered
	 */
	protected Table getInfoFromMPSpread;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MyMonitorPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasePackage.Literals.MONITOR_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchiveProperty getGetInfoFromAPSpread() {
		if (getInfoFromAPSpread != null && getInfoFromAPSpread.eIsProxy()) {
			InternalEObject oldGetInfoFromAPSpread = (InternalEObject)getInfoFromAPSpread;
			getInfoFromAPSpread = (ArchiveProperty)eResolveProxy(oldGetInfoFromAPSpread);
			if (getInfoFromAPSpread != oldGetInfoFromAPSpread) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.MONITOR_POINT__GET_INFO_FROM_AP_SPREAD, oldGetInfoFromAPSpread, getInfoFromAPSpread));
			}
		}
		return getInfoFromAPSpread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchiveProperty basicGetGetInfoFromAPSpread() {
		return getInfoFromAPSpread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetInfoFromAPSpread(ArchiveProperty newGetInfoFromAPSpread) {
		ArchiveProperty oldGetInfoFromAPSpread = getInfoFromAPSpread;
		getInfoFromAPSpread = newGetInfoFromAPSpread;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MONITOR_POINT__GET_INFO_FROM_AP_SPREAD, oldGetInfoFromAPSpread, getInfoFromAPSpread));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getGetInfoFromMPSpread() {
		if (getInfoFromMPSpread != null && getInfoFromMPSpread.eIsProxy()) {
			InternalEObject oldGetInfoFromMPSpread = (InternalEObject)getInfoFromMPSpread;
			getInfoFromMPSpread = (Table)eResolveProxy(oldGetInfoFromMPSpread);
			if (getInfoFromMPSpread != oldGetInfoFromMPSpread) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.MONITOR_POINT__GET_INFO_FROM_MP_SPREAD, oldGetInfoFromMPSpread, getInfoFromMPSpread));
			}
		}
		return getInfoFromMPSpread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetGetInfoFromMPSpread() {
		return getInfoFromMPSpread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetInfoFromMPSpread(Table newGetInfoFromMPSpread) {
		Table oldGetInfoFromMPSpread = getInfoFromMPSpread;
		getInfoFromMPSpread = newGetInfoFromMPSpread;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MONITOR_POINT__GET_INFO_FROM_MP_SPREAD, oldGetInfoFromMPSpread, getInfoFromMPSpread));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Default() {
		return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "Default")];
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String ErrorCondition() {
		return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "Error Condition")];
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String ErrorSeverity() {
		return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "Error Severity")];
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String ErrorAction() {
		return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "Error Action")];
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String APName() {
		return PName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String RefersTo() {
		return PName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Interval() {
		int defaultValue = 300;
			if(archive != null) {
					if ( ((ArchiveProperty)archive).Interval().equals("none") )
						return Integer.toString(defaultValue);
					int value = Integer.valueOf(((ArchiveProperty)archive).Interval());
					if (value <= 0)
						value = defaultValue;
					return Integer.toString(value);
				}
				else
					return Integer.toString(defaultValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean OnlyOnChange() {
		if(archive != null)
			return ((ArchiveProperty)archive).OnlyOnChange();
		else
			return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DisplayUnits() {
		if(archive != null)
			return ((ArchiveProperty)archive).DisplayUnits();
		else
			return DataUnits();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String GraphMin() {
		if(archive != null)
			return ((ArchiveProperty)archive).GraphMin();
		else
			return "none";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String GraphMax() {
		if(archive != null)
			return ((ArchiveProperty)archive).GraphMax();
		else
			return "none";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Format() {
		if(archive != null)
			return ((ArchiveProperty)archive).Format();
		else
			return "none";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Title() {
		if(archive != null)
			return ((ArchiveProperty)archive).Title();
		else
			return Description();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String MPName() {
		return PName();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String AltMPName() {
		return AltPName();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPartOfPattern() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHomogeneous() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPartOfHomogeneous() {
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
			case BasePackage.MONITOR_POINT__GET_INFO_FROM_AP_SPREAD:
				if (resolve) return getGetInfoFromAPSpread();
				return basicGetGetInfoFromAPSpread();
			case BasePackage.MONITOR_POINT__GET_INFO_FROM_MP_SPREAD:
				if (resolve) return getGetInfoFromMPSpread();
				return basicGetGetInfoFromMPSpread();
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
			case BasePackage.MONITOR_POINT__GET_INFO_FROM_AP_SPREAD:
				setGetInfoFromAPSpread((ArchiveProperty)newValue);
				return;
			case BasePackage.MONITOR_POINT__GET_INFO_FROM_MP_SPREAD:
				setGetInfoFromMPSpread((Table)newValue);
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
			case BasePackage.MONITOR_POINT__GET_INFO_FROM_AP_SPREAD:
				setGetInfoFromAPSpread((ArchiveProperty)null);
				return;
			case BasePackage.MONITOR_POINT__GET_INFO_FROM_MP_SPREAD:
				setGetInfoFromMPSpread((Table)null);
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
			case BasePackage.MONITOR_POINT__GET_INFO_FROM_AP_SPREAD:
				return getInfoFromAPSpread != null;
			case BasePackage.MONITOR_POINT__GET_INFO_FROM_MP_SPREAD:
				return getInfoFromMPSpread != null;
		}
		return super.eIsSet(featureID);
	}

} //MonitorPointImpl
