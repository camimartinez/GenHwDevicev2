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


import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.ResourceSet;

import alma.control.datamodel.meta.base.ArchiveProperty;
import alma.control.datamodel.meta.base.BasePackage;
import alma.control.datamodel.meta.base.MonitorPoint;
import alma.control.datamodel.meta.base.Table;
import alma.control.datamodel.meta.base.Util;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monitor Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alma.control.datamodel.meta.base.impl.MonitorPointImpl#getResourceSetMonitor <em>Resource Set Monitor</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MonitorPointImpl extends MandCBaseImpl implements MonitorPoint {
	/**
	 * The default value of the '{@link #getResourceSetMonitor() <em>Resource Set Monitor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceSetMonitor()
	 * @generated
	 * @ordered
	 */
	protected static final ResourceSet RESOURCE_SET_MONITOR_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getResourceSetMonitor() <em>Resource Set Monitor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceSetMonitor()
	 * @generated
	 * @ordered
	 */
	protected ResourceSet resourceSetMonitor = RESOURCE_SET_MONITOR_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MonitorPointImpl() {
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
	public ResourceSet getResourceSetMonitor() {
		return resourceSetMonitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceSetMonitor(ResourceSet newResourceSetMonitor) {
		ResourceSet oldResourceSetMonitor = resourceSetMonitor;
		resourceSetMonitor = newResourceSetMonitor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MONITOR_POINT__RESOURCE_SET_MONITOR, oldResourceSetMonitor, resourceSetMonitor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Default() {
		return row[tables.getColNum(sheet, "Default")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String ErrorCondition() {
		return row[tables.getColNum(sheet, "Error Condition")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String ErrorSeverity() {
		return row[tables.getColNum(sheet, "Error Severity")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String ErrorAction() {
		return row[tables.getColNum(sheet, "Error Action")];
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
	 * @!generated
	 */
	@Override
	public boolean IsMonitored(){
		if(IsExternal() && IsArchived() && !IsPartOfPattern() && !IsPartOfHomogeneous())
			return true;
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	abstract public boolean IsPartOfPattern();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	abstract public boolean IsHomogeneous();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	abstract public boolean IsPartOfHomogeneous();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitorPoint(final String[] row, final EObject parent, final Table tables, final Util utils) {
		this.tables = tables;
		this.utils = utils;
		setMandCBase(row, parent, tables, utils);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasePackage.MONITOR_POINT__RESOURCE_SET_MONITOR:
				return getResourceSetMonitor();
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
			case BasePackage.MONITOR_POINT__RESOURCE_SET_MONITOR:
				setResourceSetMonitor((ResourceSet)newValue);
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
			case BasePackage.MONITOR_POINT__RESOURCE_SET_MONITOR:
				setResourceSetMonitor(RESOURCE_SET_MONITOR_EDEFAULT);
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
			case BasePackage.MONITOR_POINT__RESOURCE_SET_MONITOR:
				return RESOURCE_SET_MONITOR_EDEFAULT == null ? resourceSetMonitor != null : !RESOURCE_SET_MONITOR_EDEFAULT.equals(resourceSetMonitor);
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
		result.append(" (resourceSetMonitor: ");
		result.append(resourceSetMonitor);
		result.append(')');
		return result.toString();
	}

} //MonitorPointImpl
