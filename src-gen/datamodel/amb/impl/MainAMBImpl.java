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
import datamodel.amb.MainAMB;

import datamodel.base.BaseFactory;
import datamodel.base.Table;

import datamodel.base.impl.MainBaseImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main AMB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datamodel.amb.impl.MainAMBImpl#getTmp <em>Tmp</em>}</li>
 *   <li>{@link datamodel.amb.impl.MainAMBImpl#getGetInfoFromMain <em>Get Info From Main</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MainAMBImpl extends MainBaseImpl implements MainAMB {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	public MainAMBImpl(String[] row){
		super(row);
	}
	
	/**
	 * The default value of the '{@link #getTmp() <em>Tmp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTmp()
	 * @generated
	 * @ordered
	 */
	protected static final BaseFactory TMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTmp() <em>Tmp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTmp()
	 * @generated
	 * @ordered
	 */
	protected BaseFactory tmp = TMP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGetInfoFromMain() <em>Get Info From Main</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetInfoFromMain()
	 * @generated
	 * @ordered
	 */
	protected Table getInfoFromMain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainAMBImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmbPackage.Literals.MAIN_AMB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseFactory getTmp() {
		return tmp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTmp(BaseFactory newTmp) {
		BaseFactory oldTmp = tmp;
		tmp = newTmp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.MAIN_AMB__TMP, oldTmp, tmp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getGetInfoFromMain() {
		if (getInfoFromMain != null && getInfoFromMain.eIsProxy()) {
			InternalEObject oldGetInfoFromMain = (InternalEObject)getInfoFromMain;
			getInfoFromMain = (Table)eResolveProxy(oldGetInfoFromMain);
			if (getInfoFromMain != oldGetInfoFromMain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.MAIN_AMB__GET_INFO_FROM_MAIN, oldGetInfoFromMain, getInfoFromMain));
			}
		}
		return getInfoFromMain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetGetInfoFromMain() {
		return getInfoFromMain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetInfoFromMain(Table newGetInfoFromMain) {
		Table oldGetInfoFromMain = getInfoFromMain;
		getInfoFromMain = newGetInfoFromMain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.MAIN_AMB__GET_INFO_FROM_MAIN, oldGetInfoFromMain, getInfoFromMain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Parent() {
		return row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, "Parent")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String NodeAddress() {
		return row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, "Node Address")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Cardinality() {
		return row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, "Cardinality")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Channel() {
		return row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, "Channel")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean GenericMonitorPoints() {
		return row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, "Generic Monitor Points")].equals("yes");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String BaseAddress() {
		return row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, "Base Address")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmbPackage.MAIN_AMB__TMP:
				return getTmp();
			case AmbPackage.MAIN_AMB__GET_INFO_FROM_MAIN:
				if (resolve) return getGetInfoFromMain();
				return basicGetGetInfoFromMain();
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
			case AmbPackage.MAIN_AMB__TMP:
				setTmp((BaseFactory)newValue);
				return;
			case AmbPackage.MAIN_AMB__GET_INFO_FROM_MAIN:
				setGetInfoFromMain((Table)newValue);
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
			case AmbPackage.MAIN_AMB__TMP:
				setTmp(TMP_EDEFAULT);
				return;
			case AmbPackage.MAIN_AMB__GET_INFO_FROM_MAIN:
				setGetInfoFromMain((Table)null);
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
			case AmbPackage.MAIN_AMB__TMP:
				return TMP_EDEFAULT == null ? tmp != null : !TMP_EDEFAULT.equals(tmp);
			case AmbPackage.MAIN_AMB__GET_INFO_FROM_MAIN:
				return getInfoFromMain != null;
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
		result.append(" (tmp: ");
		result.append(tmp);
		result.append(')');
		return result.toString();
	}

} //MainAMBImpl
