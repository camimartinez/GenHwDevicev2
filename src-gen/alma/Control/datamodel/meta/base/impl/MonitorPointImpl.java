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
import alma.Control.datamodel.meta.base.BasePackage;
import alma.Control.datamodel.meta.base.MonitorPoint;
import alma.Control.datamodel.meta.base.Table;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monitor Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.MonitorPointImpl#getAux <em>Aux</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.MonitorPointImpl#getToInfoFromAPSpread <em>To Info From AP Spread</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.base.impl.MonitorPointImpl#getToInfoFromMPSpread <em>To Info From MP Spread</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MonitorPointImpl extends MandCBaseImpl implements MonitorPoint {
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	public MonitorPointImpl(String[] row, Resource parent) {
		super(row, parent);
	}	
	
	/**
	 * The default value of the '{@link #getAux() <em>Aux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAux()
	 * @generated
	 * @ordered
	 */
	protected static final Resource AUX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAux() <em>Aux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAux()
	 * @generated
	 * @ordered
	 */
	protected Resource aux = AUX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getToInfoFromAPSpread() <em>To Info From AP Spread</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToInfoFromAPSpread()
	 * @generated
	 * @ordered
	 */
	protected ArchiveProperty toInfoFromAPSpread;

	/**
	 * The cached value of the '{@link #getToInfoFromMPSpread() <em>To Info From MP Spread</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToInfoFromMPSpread()
	 * @generated
	 * @ordered
	 */
	protected Table toInfoFromMPSpread;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorPointImpl() {
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
	public Resource getAux() {
		return aux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAux(Resource newAux) {
		Resource oldAux = aux;
		aux = newAux;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MONITOR_POINT__AUX, oldAux, aux));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchiveProperty getToInfoFromAPSpread() {
		if (toInfoFromAPSpread != null && toInfoFromAPSpread.eIsProxy()) {
			InternalEObject oldToInfoFromAPSpread = (InternalEObject)toInfoFromAPSpread;
			toInfoFromAPSpread = (ArchiveProperty)eResolveProxy(oldToInfoFromAPSpread);
			if (toInfoFromAPSpread != oldToInfoFromAPSpread) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.MONITOR_POINT__TO_INFO_FROM_AP_SPREAD, oldToInfoFromAPSpread, toInfoFromAPSpread));
			}
		}
		return toInfoFromAPSpread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchiveProperty basicGetToInfoFromAPSpread() {
		return toInfoFromAPSpread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToInfoFromAPSpread(ArchiveProperty newToInfoFromAPSpread) {
		ArchiveProperty oldToInfoFromAPSpread = toInfoFromAPSpread;
		toInfoFromAPSpread = newToInfoFromAPSpread;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MONITOR_POINT__TO_INFO_FROM_AP_SPREAD, oldToInfoFromAPSpread, toInfoFromAPSpread));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getToInfoFromMPSpread() {
		if (toInfoFromMPSpread != null && toInfoFromMPSpread.eIsProxy()) {
			InternalEObject oldToInfoFromMPSpread = (InternalEObject)toInfoFromMPSpread;
			toInfoFromMPSpread = (Table)eResolveProxy(oldToInfoFromMPSpread);
			if (toInfoFromMPSpread != oldToInfoFromMPSpread) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.MONITOR_POINT__TO_INFO_FROM_MP_SPREAD, oldToInfoFromMPSpread, toInfoFromMPSpread));
			}
		}
		return toInfoFromMPSpread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetToInfoFromMPSpread() {
		return toInfoFromMPSpread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToInfoFromMPSpread(Table newToInfoFromMPSpread) {
		Table oldToInfoFromMPSpread = toInfoFromMPSpread;
		toInfoFromMPSpread = newToInfoFromMPSpread;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MONITOR_POINT__TO_INFO_FROM_MP_SPREAD, oldToInfoFromMPSpread, toInfoFromMPSpread));
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
			case BasePackage.MONITOR_POINT__AUX:
				return getAux();
			case BasePackage.MONITOR_POINT__TO_INFO_FROM_AP_SPREAD:
				if (resolve) return getToInfoFromAPSpread();
				return basicGetToInfoFromAPSpread();
			case BasePackage.MONITOR_POINT__TO_INFO_FROM_MP_SPREAD:
				if (resolve) return getToInfoFromMPSpread();
				return basicGetToInfoFromMPSpread();
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
			case BasePackage.MONITOR_POINT__AUX:
				setAux((Resource)newValue);
				return;
			case BasePackage.MONITOR_POINT__TO_INFO_FROM_AP_SPREAD:
				setToInfoFromAPSpread((ArchiveProperty)newValue);
				return;
			case BasePackage.MONITOR_POINT__TO_INFO_FROM_MP_SPREAD:
				setToInfoFromMPSpread((Table)newValue);
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
			case BasePackage.MONITOR_POINT__AUX:
				setAux(AUX_EDEFAULT);
				return;
			case BasePackage.MONITOR_POINT__TO_INFO_FROM_AP_SPREAD:
				setToInfoFromAPSpread((ArchiveProperty)null);
				return;
			case BasePackage.MONITOR_POINT__TO_INFO_FROM_MP_SPREAD:
				setToInfoFromMPSpread((Table)null);
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
			case BasePackage.MONITOR_POINT__AUX:
				return AUX_EDEFAULT == null ? aux != null : !AUX_EDEFAULT.equals(aux);
			case BasePackage.MONITOR_POINT__TO_INFO_FROM_AP_SPREAD:
				return toInfoFromAPSpread != null;
			case BasePackage.MONITOR_POINT__TO_INFO_FROM_MP_SPREAD:
				return toInfoFromMPSpread != null;
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
		result.append(" (aux: ");
		result.append(aux);
		result.append(')');
		return result.toString();
	}

} //MonitorPointImpl
