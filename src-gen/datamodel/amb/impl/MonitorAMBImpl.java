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
import datamodel.amb.MandCAMB;
import datamodel.amb.MonitorAMB;

import datamodel.base.Table;
import datamodel.base.Util;

import datamodel.base.impl.BaseFactoryImpl;
import datamodel.base.impl.MonitorPointImpl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monitor AMB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datamodel.amb.impl.MonitorAMBImpl#getAux7 <em>Aux7</em>}</li>
 *   <li>{@link datamodel.amb.impl.MonitorAMBImpl#getMac <em>Mac</em>}</li>
 *   <li>{@link datamodel.amb.impl.MonitorAMBImpl#getAux2 <em>Aux2</em>}</li>
 *   <li>{@link datamodel.amb.impl.MonitorAMBImpl#getAux3 <em>Aux3</em>}</li>
 *   <li>{@link datamodel.amb.impl.MonitorAMBImpl#getToNormalizeData <em>To Normalize Data</em>}</li>
 *   <li>{@link datamodel.amb.impl.MonitorAMBImpl#getGetColumnsCanBeInv <em>Get Columns Can Be Inv</em>}</li>
 *   <li>{@link datamodel.amb.impl.MonitorAMBImpl#getGetInfoMPSheet <em>Get Info MP Sheet</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MonitorAMBImpl extends MonitorPointImpl implements MonitorAMB {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	public MonitorAMBImpl(String[] row, Resource parent) {
		super(row, parent);
		mac = new MandCAMBImpl(row, sheet, this);
	}
	
	/**
	 * The default value of the '{@link #getAux7() <em>Aux7</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAux7()
	 * @generated
	 * @ordered
	 */
	protected static final BaseFactoryImpl AUX7_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAux7() <em>Aux7</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAux7()
	 * @generated
	 * @ordered
	 */
	protected BaseFactoryImpl aux7 = AUX7_EDEFAULT;

	/**
	 * The default value of the '{@link #getMac() <em>Mac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMac()
	 * @generated
	 * @ordered
	 */
	protected static final MandCAMB MAC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMac() <em>Mac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMac()
	 * @generated
	 * @ordered
	 */
	protected MandCAMB mac = MAC_EDEFAULT;

	/**
	 * The default value of the '{@link #getAux2() <em>Aux2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAux2()
	 * @generated
	 * @ordered
	 */
	protected static final Iterator AUX2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAux2() <em>Aux2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAux2()
	 * @generated
	 * @ordered
	 */
	protected Iterator aux2 = AUX2_EDEFAULT;

	/**
	 * The default value of the '{@link #getAux3() <em>Aux3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAux3()
	 * @generated
	 * @ordered
	 */
	protected static final Resource AUX3_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAux3() <em>Aux3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAux3()
	 * @generated
	 * @ordered
	 */
	protected Resource aux3 = AUX3_EDEFAULT;

	/**
	 * The cached value of the '{@link #getToNormalizeData() <em>To Normalize Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToNormalizeData()
	 * @generated
	 * @ordered
	 */
	protected Util toNormalizeData;

	/**
	 * The cached value of the '{@link #getGetColumnsCanBeInv() <em>Get Columns Can Be Inv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetColumnsCanBeInv()
	 * @generated
	 * @ordered
	 */
	protected Table getColumnsCanBeInv;

	/**
	 * The cached value of the '{@link #getGetInfoMPSheet() <em>Get Info MP Sheet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetInfoMPSheet()
	 * @generated
	 * @ordered
	 */
	protected MandCAMB getInfoMPSheet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorAMBImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmbPackage.Literals.MONITOR_AMB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseFactoryImpl getAux7() {
		return aux7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAux7(BaseFactoryImpl newAux7) {
		BaseFactoryImpl oldAux7 = aux7;
		aux7 = newAux7;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.MONITOR_AMB__AUX7, oldAux7, aux7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandCAMB getMac() {
		return mac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMac(MandCAMB newMac) {
		MandCAMB oldMac = mac;
		mac = newMac;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.MONITOR_AMB__MAC, oldMac, mac));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iterator getAux2() {
		return aux2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAux2(Iterator newAux2) {
		Iterator oldAux2 = aux2;
		aux2 = newAux2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.MONITOR_AMB__AUX2, oldAux2, aux2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getAux3() {
		return aux3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAux3(Resource newAux3) {
		Resource oldAux3 = aux3;
		aux3 = newAux3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.MONITOR_AMB__AUX3, oldAux3, aux3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Util getToNormalizeData() {
		if (toNormalizeData != null && toNormalizeData.eIsProxy()) {
			InternalEObject oldToNormalizeData = (InternalEObject)toNormalizeData;
			toNormalizeData = (Util)eResolveProxy(oldToNormalizeData);
			if (toNormalizeData != oldToNormalizeData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.MONITOR_AMB__TO_NORMALIZE_DATA, oldToNormalizeData, toNormalizeData));
			}
		}
		return toNormalizeData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Util basicGetToNormalizeData() {
		return toNormalizeData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToNormalizeData(Util newToNormalizeData) {
		Util oldToNormalizeData = toNormalizeData;
		toNormalizeData = newToNormalizeData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.MONITOR_AMB__TO_NORMALIZE_DATA, oldToNormalizeData, toNormalizeData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getGetColumnsCanBeInv() {
		if (getColumnsCanBeInv != null && getColumnsCanBeInv.eIsProxy()) {
			InternalEObject oldGetColumnsCanBeInv = (InternalEObject)getColumnsCanBeInv;
			getColumnsCanBeInv = (Table)eResolveProxy(oldGetColumnsCanBeInv);
			if (getColumnsCanBeInv != oldGetColumnsCanBeInv) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.MONITOR_AMB__GET_COLUMNS_CAN_BE_INV, oldGetColumnsCanBeInv, getColumnsCanBeInv));
			}
		}
		return getColumnsCanBeInv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetGetColumnsCanBeInv() {
		return getColumnsCanBeInv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetColumnsCanBeInv(Table newGetColumnsCanBeInv) {
		Table oldGetColumnsCanBeInv = getColumnsCanBeInv;
		getColumnsCanBeInv = newGetColumnsCanBeInv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.MONITOR_AMB__GET_COLUMNS_CAN_BE_INV, oldGetColumnsCanBeInv, getColumnsCanBeInv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandCAMB getGetInfoMPSheet() {
		if (getInfoMPSheet != null && getInfoMPSheet.eIsProxy()) {
			InternalEObject oldGetInfoMPSheet = (InternalEObject)getInfoMPSheet;
			getInfoMPSheet = (MandCAMB)eResolveProxy(oldGetInfoMPSheet);
			if (getInfoMPSheet != oldGetInfoMPSheet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.MONITOR_AMB__GET_INFO_MP_SHEET, oldGetInfoMPSheet, getInfoMPSheet));
			}
		}
		return getInfoMPSheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandCAMB basicGetGetInfoMPSheet() {
		return getInfoMPSheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetInfoMPSheet(MandCAMB newGetInfoMPSheet) {
		MandCAMB oldGetInfoMPSheet = getInfoMPSheet;
		getInfoMPSheet = newGetInfoMPSheet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.MONITOR_AMB__GET_INFO_MP_SHEET, oldGetInfoMPSheet, getInfoMPSheet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String CanBeInvalid() {
		return row[BaseFactoryImpl.eINSTANCE.createTable().getColNum(sheet, "Can Be Invalid")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFEStatus() {
		return CanBeInvalid().equals("yes-feStatus");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Assembly() {
		return mac.Assembly();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String RCA() {
		return mac.RCA();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String RawDataType() {
		return mac.RawDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean TeRelated() {
		return mac.TeRelated();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataType() {
		return mac.WorldDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Scale() {
		return mac.Scale();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Offset() {
		return mac.Offset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String RawDataToCPPType() {
		return mac.RawDataToCPPType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToCPPType() {
		return mac.WorldDataToCPPType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToCORBAType() {
		return mac.WorldDataToCORBAType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToIDLSeqType() {
		return mac.WorldDataToIDLSeqType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToIDLType() {
		return mac.WorldDataToIDLType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToCORBASeqType() {
		return mac.WorldDataToCORBASeqType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToCORBADevIOType() {
		return mac.WorldDataToCORBADevIOType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToJavaType() {
		return mac.WorldDataToJavaType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToDatabaseType() {
		return mac.WorldDataToDatabaseType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToBACIType() {
		return mac.WorldDataToBACIType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRawDataArray() {
		return mac.isRawDataArray();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWorldDataArray() {
		return mac.isWorldDataArray();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConversion() {
		return mac.isConversion();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSpecialConversion() {
		return mac.isSpecialConversion();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String NumberItemsRawData() {
		return mac.NumberItemsRawData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String TotalBytesRawData() {
		return mac.TotalBytesRawData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String NumberRawDataTypeBytes() {
		return mac.NumberRawDataTypeBytes();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String RCACell() {
		return mac.RCACell();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String NumberItemsWorldData() {
		return mac.NumberItemsWorldData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String TeRelatedCell() {
		return mac.TeRelatedCell();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDependentGroupBit() {
		return mac.isDependentGroupBit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDependentBit() {
		return mac.isDependentBit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDependentElement() {
		return mac.isDependentElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isByteSwapped() {
		return mac.isByteSwapped();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDependentBitElement() {
		return mac.isDependentBitElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDependentArrayElement() {
		return mac.isDependentArrayElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDimension() {
		return mac.GetDimension();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSingleBit() {
		return mac.isSingleBit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBit() {
		return mac.getBit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMask() {
		return mac.getMask();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstBit() {
		return mac.getFirstBit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastBit() {
		return mac.getLastBit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupMask() {
		return mac.getGroupMask();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupEnd() {
		return mac.getGroupEnd();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupStart() {
		return mac.getGroupStart();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String RawSubArrayEndIndex() {
		return mac.RawSubArrayEndIndex();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String RawSubArrayStartIndex() {
		return mac.RawSubArrayStartIndex();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRawSubArray() {
		return mac.isRawSubArray();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToDatabaseTypeUpper1() {
		return mac.WorldDataToDatabaseTypeUpper1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataTypeUpper1() {
		return mac.WorldDataTypeUpper1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String minRange() {
		return BaseFactoryImpl.eINSTANCE.createUtil().normalizeNumber(WorldDataType(), super.MinRange());
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String maxRange() {
		return BaseFactoryImpl.eINSTANCE.createUtil().normalizeNumber(WorldDataType(), super.MaxRange());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Default() {
		return BaseFactoryImpl.eINSTANCE.createUtil().normalizeNumber(WorldDataType(), super.Default());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPattern() {
				boolean ret = true;
				if( this.isDependent()) ret = false;
				if( this.getDependents().getResources().isEmpty()) ret = false;
				for (Iterator<Resource> iter = this.getDependents().getResources().iterator(); iter.hasNext(); ) {
					MonitorAMBImpl var = (MonitorAMBImpl) iter.next();
					if( var.WorldDataType().compareTo("boolean") != 0 ) ret = false;
				}
				return ret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPartOfPattern() {
			boolean ret = false;
				if( isDependent() ){
					MonitorAMBImpl parent = ((MonitorAMBImpl)this.getParent());
					if( parent.isPattern() )
						ret = true;
				}
				return ret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHomogeneous() {
				boolean ret = true;
				String firsttype = null;
				if( hasDependents() ){
					for (Iterator<Resource> iter = this.getDependents().getResources().iterator(); iter.hasNext(); ) {
						MonitorAMBImpl var = (MonitorAMBImpl) iter.next();
						if( firsttype == null){
							firsttype = new String(var.WorldDataType());
							continue;
						}
						if( var.WorldDataType().compareTo(firsttype) != 0 ) ret = false;
					}
				}else{
					ret = false;
				}
				return ret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPartOfHomogeneous() {
				boolean ret = false;
				if( isDependent() ){
					MonitorAMBImpl parent = ((MonitorAMBImpl)this.getParent());
					if( parent.isHomogeneous() )
						ret = true;
				}
				return ret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmbPackage.MONITOR_AMB__AUX7:
				return getAux7();
			case AmbPackage.MONITOR_AMB__MAC:
				return getMac();
			case AmbPackage.MONITOR_AMB__AUX2:
				return getAux2();
			case AmbPackage.MONITOR_AMB__AUX3:
				return getAux3();
			case AmbPackage.MONITOR_AMB__TO_NORMALIZE_DATA:
				if (resolve) return getToNormalizeData();
				return basicGetToNormalizeData();
			case AmbPackage.MONITOR_AMB__GET_COLUMNS_CAN_BE_INV:
				if (resolve) return getGetColumnsCanBeInv();
				return basicGetGetColumnsCanBeInv();
			case AmbPackage.MONITOR_AMB__GET_INFO_MP_SHEET:
				if (resolve) return getGetInfoMPSheet();
				return basicGetGetInfoMPSheet();
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
			case AmbPackage.MONITOR_AMB__AUX7:
				setAux7((BaseFactoryImpl)newValue);
				return;
			case AmbPackage.MONITOR_AMB__MAC:
				setMac((MandCAMB)newValue);
				return;
			case AmbPackage.MONITOR_AMB__AUX2:
				setAux2((Iterator)newValue);
				return;
			case AmbPackage.MONITOR_AMB__AUX3:
				setAux3((Resource)newValue);
				return;
			case AmbPackage.MONITOR_AMB__TO_NORMALIZE_DATA:
				setToNormalizeData((Util)newValue);
				return;
			case AmbPackage.MONITOR_AMB__GET_COLUMNS_CAN_BE_INV:
				setGetColumnsCanBeInv((Table)newValue);
				return;
			case AmbPackage.MONITOR_AMB__GET_INFO_MP_SHEET:
				setGetInfoMPSheet((MandCAMB)newValue);
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
			case AmbPackage.MONITOR_AMB__AUX7:
				setAux7(AUX7_EDEFAULT);
				return;
			case AmbPackage.MONITOR_AMB__MAC:
				setMac(MAC_EDEFAULT);
				return;
			case AmbPackage.MONITOR_AMB__AUX2:
				setAux2(AUX2_EDEFAULT);
				return;
			case AmbPackage.MONITOR_AMB__AUX3:
				setAux3(AUX3_EDEFAULT);
				return;
			case AmbPackage.MONITOR_AMB__TO_NORMALIZE_DATA:
				setToNormalizeData((Util)null);
				return;
			case AmbPackage.MONITOR_AMB__GET_COLUMNS_CAN_BE_INV:
				setGetColumnsCanBeInv((Table)null);
				return;
			case AmbPackage.MONITOR_AMB__GET_INFO_MP_SHEET:
				setGetInfoMPSheet((MandCAMB)null);
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
			case AmbPackage.MONITOR_AMB__AUX7:
				return AUX7_EDEFAULT == null ? aux7 != null : !AUX7_EDEFAULT.equals(aux7);
			case AmbPackage.MONITOR_AMB__MAC:
				return MAC_EDEFAULT == null ? mac != null : !MAC_EDEFAULT.equals(mac);
			case AmbPackage.MONITOR_AMB__AUX2:
				return AUX2_EDEFAULT == null ? aux2 != null : !AUX2_EDEFAULT.equals(aux2);
			case AmbPackage.MONITOR_AMB__AUX3:
				return AUX3_EDEFAULT == null ? aux3 != null : !AUX3_EDEFAULT.equals(aux3);
			case AmbPackage.MONITOR_AMB__TO_NORMALIZE_DATA:
				return toNormalizeData != null;
			case AmbPackage.MONITOR_AMB__GET_COLUMNS_CAN_BE_INV:
				return getColumnsCanBeInv != null;
			case AmbPackage.MONITOR_AMB__GET_INFO_MP_SHEET:
				return getInfoMPSheet != null;
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
		result.append(" (aux7: ");
		result.append(aux7);
		result.append(", mac: ");
		result.append(mac);
		result.append(", aux2: ");
		result.append(aux2);
		result.append(", aux3: ");
		result.append(aux3);
		result.append(')');
		return result.toString();
	}

	@Override
	public ResourceSet getResourceSet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public URI getURI() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setURI(URI uri) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public long getTimeStamp() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setTimeStamp(long timeStamp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EList<EObject> getContents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TreeIterator<EObject> getAllContents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getURIFragment(EObject eObject) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EObject getEObject(String uriFragment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Map<?, ?> options) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void load(Map<?, ?> options) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(OutputStream outputStream, Map<?, ?> options)
			throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void load(InputStream inputStream, Map<?, ?> options)
			throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isTrackingModification() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setTrackingModification(boolean isTrackingModification) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isModified() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setModified(boolean isModified) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isLoaded() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void unload() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Map<?, ?> options) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EList<Diagnostic> getErrors() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<Diagnostic> getWarnings() {
		// TODO Auto-generated method stub
		return null;
	}

} //MonitorAMBImpl
