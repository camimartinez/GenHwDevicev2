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
package alma.Control.datamodel.meta.eth.impl;

import alma.Control.datamodel.meta.base.Table;

import alma.Control.datamodel.meta.base.impl.BaseFactoryImpl;
import alma.Control.datamodel.meta.base.impl.MainBaseImpl;

import alma.Control.datamodel.meta.eth.EthPackage;
import alma.Control.datamodel.meta.eth.Main;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link alma.Control.datamodel.meta.eth.impl.MainImpl#getAux <em>Aux</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.eth.impl.MainImpl#getToInfoMain <em>To Info Main</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MainImpl extends MainBaseImpl implements Main {
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	public MainImpl(String[] row){
		super(row);
	}
	
	/**
	 * The default value of the '{@link #getAux() <em>Aux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAux()
	 * @generated
	 * @ordered
	 */
	protected static final BaseFactoryImpl AUX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAux() <em>Aux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAux()
	 * @generated
	 * @ordered
	 */
	protected BaseFactoryImpl aux = AUX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getToInfoMain() <em>To Info Main</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToInfoMain()
	 * @generated
	 * @ordered
	 */
	protected Table toInfoMain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EthPackage.Literals.MAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseFactoryImpl getAux() {
		return aux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAux(BaseFactoryImpl newAux) {
		BaseFactoryImpl oldAux = aux;
		aux = newAux;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EthPackage.MAIN__AUX, oldAux, aux));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getToInfoMain() {
		if (toInfoMain != null && toInfoMain.eIsProxy()) {
			InternalEObject oldToInfoMain = (InternalEObject)toInfoMain;
			toInfoMain = (Table)eResolveProxy(oldToInfoMain);
			if (toInfoMain != oldToInfoMain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EthPackage.MAIN__TO_INFO_MAIN, oldToInfoMain, toInfoMain));
			}
		}
		return toInfoMain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetToInfoMain() {
		return toInfoMain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToInfoMain(Table newToInfoMain) {
		Table oldToInfoMain = toInfoMain;
		toInfoMain = newToInfoMain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EthPackage.MAIN__TO_INFO_MAIN, oldToInfoMain, toInfoMain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String VendorClass() {
		return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "Vendor Class")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EthPackage.MAIN__AUX:
				return getAux();
			case EthPackage.MAIN__TO_INFO_MAIN:
				if (resolve) return getToInfoMain();
				return basicGetToInfoMain();
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
			case EthPackage.MAIN__AUX:
				setAux((BaseFactoryImpl)newValue);
				return;
			case EthPackage.MAIN__TO_INFO_MAIN:
				setToInfoMain((Table)newValue);
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
			case EthPackage.MAIN__AUX:
				setAux(AUX_EDEFAULT);
				return;
			case EthPackage.MAIN__TO_INFO_MAIN:
				setToInfoMain((Table)null);
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
			case EthPackage.MAIN__AUX:
				return AUX_EDEFAULT == null ? aux != null : !AUX_EDEFAULT.equals(aux);
			case EthPackage.MAIN__TO_INFO_MAIN:
				return toInfoMain != null;
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

} //MainImpl
