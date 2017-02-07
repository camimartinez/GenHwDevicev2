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

import datamodel.base.BasePackage;
import datamodel.base.ControlPoint;
import datamodel.base.Table;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datamodel.base.impl.ControlPointImpl#getGetArchOnUseControl <em>Get Arch On Use Control</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MyControlPointImpl extends MandCBaseImpl implements ControlPoint {
	/**
	 * The cached value of the '{@link #getGetArchOnUseControl() <em>Get Arch On Use Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetArchOnUseControl()
	 * @generated
	 * @ordered
	 */
	protected Table getArchOnUseControl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MyControlPointImpl() {
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
	public Table getGetArchOnUseControl() {
		if (getArchOnUseControl != null && getArchOnUseControl.eIsProxy()) {
			InternalEObject oldGetArchOnUseControl = (InternalEObject)getArchOnUseControl;
			getArchOnUseControl = (Table)eResolveProxy(oldGetArchOnUseControl);
			if (getArchOnUseControl != oldGetArchOnUseControl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.CONTROL_POINT__GET_ARCH_ON_USE_CONTROL, oldGetArchOnUseControl, getArchOnUseControl));
			}
		}
		return getArchOnUseControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetGetArchOnUseControl() {
		return getArchOnUseControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetArchOnUseControl(Table newGetArchOnUseControl) {
		Table oldGetArchOnUseControl = getArchOnUseControl;
		getArchOnUseControl = newGetArchOnUseControl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.CONTROL_POINT__GET_ARCH_ON_USE_CONTROL, oldGetArchOnUseControl, getArchOnUseControl));
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
		return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "Archive On Use")].equals("yes");
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMonitored() {
		return false;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasePackage.CONTROL_POINT__GET_ARCH_ON_USE_CONTROL:
				if (resolve) return getGetArchOnUseControl();
				return basicGetGetArchOnUseControl();
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
			case BasePackage.CONTROL_POINT__GET_ARCH_ON_USE_CONTROL:
				setGetArchOnUseControl((Table)newValue);
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
			case BasePackage.CONTROL_POINT__GET_ARCH_ON_USE_CONTROL:
				setGetArchOnUseControl((Table)null);
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
			case BasePackage.CONTROL_POINT__GET_ARCH_ON_USE_CONTROL:
				return getArchOnUseControl != null;
		}
		return super.eIsSet(featureID);
	}

} //ControlPointImpl
