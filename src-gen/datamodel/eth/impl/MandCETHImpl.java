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
package datamodel.eth.impl;

import datamodel.base.Table;

import datamodel.base.impl.BaseFactoryImpl;

import datamodel.eth.EthPackage;
import datamodel.eth.MandCETH;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mand CETH</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datamodel.eth.impl.MandCETHImpl#getRow <em>Row</em>}</li>
 *   <li>{@link datamodel.eth.impl.MandCETHImpl#getSheet <em>Sheet</em>}</li>
 *   <li>{@link datamodel.eth.impl.MandCETHImpl#getAssembly <em>Assembly</em>}</li>
 *   <li>{@link datamodel.eth.impl.MandCETHImpl#getAux <em>Aux</em>}</li>
 *   <li>{@link datamodel.eth.impl.MandCETHImpl#getGetInfoFromCol <em>Get Info From Col</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MandCETHImpl extends EObjectImpl implements MandCETH {
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
	 * The default value of the '{@link #getAssembly() <em>Assembly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssembly()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSEMBLY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssembly() <em>Assembly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssembly()
	 * @generated
	 * @ordered
	 */
	protected String assembly = ASSEMBLY_EDEFAULT;

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
	 * The cached value of the '{@link #getGetInfoFromCol() <em>Get Info From Col</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetInfoFromCol()
	 * @generated
	 * @ordered
	 */
	protected Table getInfoFromCol;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandCETHImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	public MandCETHImpl(String[] row, int sheet){
		this.row = row;
		this.sheet = sheet;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EthPackage.Literals.MAND_CETH;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EthPackage.MAND_CETH__ROW, oldRow, row));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EthPackage.MAND_CETH__SHEET, oldSheet, sheet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssembly() {
		return assembly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssembly(String newAssembly) {
		String oldAssembly = assembly;
		assembly = newAssembly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EthPackage.MAND_CETH__ASSEMBLY, oldAssembly, assembly));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EthPackage.MAND_CETH__AUX, oldAux, aux));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getGetInfoFromCol() {
		if (getInfoFromCol != null && getInfoFromCol.eIsProxy()) {
			InternalEObject oldGetInfoFromCol = (InternalEObject)getInfoFromCol;
			getInfoFromCol = (Table)eResolveProxy(oldGetInfoFromCol);
			if (getInfoFromCol != oldGetInfoFromCol) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EthPackage.MAND_CETH__GET_INFO_FROM_COL, oldGetInfoFromCol, getInfoFromCol));
			}
		}
		return getInfoFromCol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetGetInfoFromCol() {
		return getInfoFromCol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetInfoFromCol(Table newGetInfoFromCol) {
		Table oldGetInfoFromCol = getInfoFromCol;
		getInfoFromCol = newGetInfoFromCol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EthPackage.MAND_CETH__GET_INFO_FROM_COL, oldGetInfoFromCol, getInfoFromCol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssemblyName(String assembly) {
		this.assembly = assembly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Assembly() {
		return assembly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Address() {
		return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "Address")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DataType() {
		String s = row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "DataType")];
		return isDataArray() ? s.substring(0,s.indexOf("[")) : s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDataArray() {
		return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "Data Type")].endsWith("]") ? true : false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOpenArray() {
		if(!isDataArray()) return false;
		String s =  row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "Data Type")];
		return (s.indexOf("]") - s.indexOf("[") == 1) ? true : false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArrayLength() {
		if(!isDataArray()) return "1";
		String s = row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "Data Type")];
		return s.substring(s.indexOf("[")+1,s.indexOf("]"));
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DataToCPPType() {
		return (String)BaseFactoryImpl.eINSTANCE.createTable().getToCPP().get(DataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DataToIDLType() {
		return (String)BaseFactoryImpl.eINSTANCE.createTable().getToIDL().get(DataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DataToIDLSeqType() {
		return (String)BaseFactoryImpl.eINSTANCE.createTable().getToIDLSeq().get(DataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DataToCORBAType() {
		return (String)BaseFactoryImpl.eINSTANCE.createTable().getToCORBA().get(DataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DataToCORBADevIOType() {
		return (String)BaseFactoryImpl.eINSTANCE.createTable().getToCORBADevIO().get(DataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DataToCORBASeqType() {
		return (String)BaseFactoryImpl.eINSTANCE.createTable().getToCORBASeq().get(DataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DataToBACIType() {
		return (String)BaseFactoryImpl.eINSTANCE.createTable().getToBACI().get(DataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DataToDatabaseType() {
		return (String)BaseFactoryImpl.eINSTANCE.createTable().getToDatabase().get(DataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EthPackage.MAND_CETH__ROW:
				return getRow();
			case EthPackage.MAND_CETH__SHEET:
				return getSheet();
			case EthPackage.MAND_CETH__ASSEMBLY:
				return getAssembly();
			case EthPackage.MAND_CETH__AUX:
				return getAux();
			case EthPackage.MAND_CETH__GET_INFO_FROM_COL:
				if (resolve) return getGetInfoFromCol();
				return basicGetGetInfoFromCol();
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
			case EthPackage.MAND_CETH__ROW:
				setRow((String[])newValue);
				return;
			case EthPackage.MAND_CETH__SHEET:
				setSheet((Integer)newValue);
				return;
			case EthPackage.MAND_CETH__ASSEMBLY:
				setAssembly((String)newValue);
				return;
			case EthPackage.MAND_CETH__AUX:
				setAux((BaseFactoryImpl)newValue);
				return;
			case EthPackage.MAND_CETH__GET_INFO_FROM_COL:
				setGetInfoFromCol((Table)newValue);
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
			case EthPackage.MAND_CETH__ROW:
				setRow(ROW_EDEFAULT);
				return;
			case EthPackage.MAND_CETH__SHEET:
				setSheet(SHEET_EDEFAULT);
				return;
			case EthPackage.MAND_CETH__ASSEMBLY:
				setAssembly(ASSEMBLY_EDEFAULT);
				return;
			case EthPackage.MAND_CETH__AUX:
				setAux(AUX_EDEFAULT);
				return;
			case EthPackage.MAND_CETH__GET_INFO_FROM_COL:
				setGetInfoFromCol((Table)null);
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
			case EthPackage.MAND_CETH__ROW:
				return ROW_EDEFAULT == null ? row != null : !ROW_EDEFAULT.equals(row);
			case EthPackage.MAND_CETH__SHEET:
				return sheet != SHEET_EDEFAULT;
			case EthPackage.MAND_CETH__ASSEMBLY:
				return ASSEMBLY_EDEFAULT == null ? assembly != null : !ASSEMBLY_EDEFAULT.equals(assembly);
			case EthPackage.MAND_CETH__AUX:
				return AUX_EDEFAULT == null ? aux != null : !AUX_EDEFAULT.equals(aux);
			case EthPackage.MAND_CETH__GET_INFO_FROM_COL:
				return getInfoFromCol != null;
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
		result.append(", assembly: ");
		result.append(assembly);
		result.append(", aux: ");
		result.append(aux);
		result.append(')');
		return result.toString();
	}

} //MandCETHImpl
