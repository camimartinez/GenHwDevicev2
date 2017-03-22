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

import alma.control.datamodel.meta.base.BasePackage;
import alma.control.datamodel.meta.base.ControlPoint;
import alma.control.datamodel.meta.base.Table;
import alma.control.datamodel.meta.base.Util;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alma.control.datamodel.meta.base.impl.ControlPointImpl#getResourceSetControl <em>Resource Set Control</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ControlPointImpl extends MandCBaseImpl implements ControlPoint {
	/**
	 * The default value of the '{@link #getResourceSetControl() <em>Resource Set Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceSetControl()
	 * @generated
	 * @ordered
	 */
	protected static final ResourceSet RESOURCE_SET_CONTROL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getResourceSetControl() <em>Resource Set Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceSetControl()
	 * @generated
	 * @ordered
	 */
	protected ResourceSet resourceSetControl = RESOURCE_SET_CONTROL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasePackage.Literals.CONTROL_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceSet getResourceSetControl() {
		return resourceSetControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceSetControl(ResourceSet newResourceSetControl) {
		ResourceSet oldResourceSetControl = resourceSetControl;
		resourceSetControl = newResourceSetControl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.CONTROL_POINT__RESOURCE_SET_CONTROL, oldResourceSetControl, resourceSetControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String CPName() {
		return PName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String AltCPName() {
		return AltPName();
		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ArchiveOnUse() {
		return row[tables.getColNum(sheet, "Archive On Use")].equals("yes");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean IsMonitored() {
		return false;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlPoint(final String[] row, final EObject parent, final Table tables, final Util utils) {
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
			case BasePackage.CONTROL_POINT__RESOURCE_SET_CONTROL:
				return getResourceSetControl();
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
			case BasePackage.CONTROL_POINT__RESOURCE_SET_CONTROL:
				setResourceSetControl((ResourceSet)newValue);
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
			case BasePackage.CONTROL_POINT__RESOURCE_SET_CONTROL:
				setResourceSetControl(RESOURCE_SET_CONTROL_EDEFAULT);
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
			case BasePackage.CONTROL_POINT__RESOURCE_SET_CONTROL:
				return RESOURCE_SET_CONTROL_EDEFAULT == null ? resourceSetControl != null : !RESOURCE_SET_CONTROL_EDEFAULT.equals(resourceSetControl);
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
		result.append(" (resourceSetControl: ");
		result.append(resourceSetControl);
		result.append(')');
		return result.toString();
	}

} //ControlPointImpl
