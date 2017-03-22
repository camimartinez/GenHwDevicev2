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
package alma.control.datamodel.meta.amb.impl;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import alma.control.datamodel.meta.amb.AmbPackage;
import alma.control.datamodel.meta.amb.MandC;
import alma.control.datamodel.meta.amb.Monitor;
import alma.control.datamodel.meta.base.Table;
import alma.control.datamodel.meta.base.Util;
import alma.control.datamodel.meta.base.impl.MonitorPointImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monitor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.MonitorImpl#getMac <em>Mac</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MonitorImpl extends MonitorPointImpl implements Monitor {
	/**
	 * The cached value of the '{@link #getMac() <em>Mac</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMac()
	 * @generated
	 * @ordered
	 */
	protected MandC mac;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MonitorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmbPackage.Literals.MONITOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandC getMac() {
		if (mac != null && mac.eIsProxy()) {
			InternalEObject oldMac = (InternalEObject)mac;
			mac = (MandC)eResolveProxy(oldMac);
			if (mac != oldMac) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.MONITOR__MAC, oldMac, mac));
			}
		}
		return mac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandC basicGetMac() {
		return mac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMac(MandC newMac) {
		MandC oldMac = mac;
		mac = newMac;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.MONITOR__MAC, oldMac, mac));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String CanBeInvalid() {
		return row[tables.getColNum(sheet, "Can Be Invalid")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean IsFEStatus() {
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
	public boolean IsRawDataArray() {
		return mac.IsRawDataArray();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean IsWorldDataArray() {
		return mac.IsWorldDataArray();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean IsConversion() {
		return mac.IsConversion();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean IsSpecialConversion() {
		return mac.IsSpecialConversion();
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
	public boolean IsDependentGroupBit() {
		return mac.IsDependentGroupBit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean IsDependentBit() {
		return mac.IsDependentBit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean IsDependentElement() {
		return mac.IsDependentElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean IsByteSwapped() {
		return mac.IsByteSwapped();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean IsDependentBitElement() {
		return mac.IsDependentBitElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean IsDependentArrayElement() {
		return mac.IsDependentArrayElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String GetDimension() {
		return mac.GetDimension();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean IsSingleBit() {
		return mac.IsSingleBit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String GetBit() {
		return mac.GetBit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String GetMask() {
		return mac.GetMask();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String GetFirstBit() {
		return mac.GetFirstBit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String GetLastBit() {
		return mac.GetLastBit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String GetGroupMask() {
		return mac.GetGroupMask();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String GetGroupEnd() {
		return mac.GetGroupEnd();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String GetGroupStart() {
		return mac.GetGroupStart();
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
	public boolean IsRawSubArray() {
		return mac.IsRawSubArray();
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
	public String MinRange() {
		return utils.normalizeNumber(WorldDataType(), super.MinRange());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String MaxRange() {
		return utils.normalizeNumber(WorldDataType(), super.MaxRange());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Default() {
		return utils.normalizeNumber(WorldDataType(), super.Default());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean IsPattern() {
		boolean ret = true;
						if( this.IsDependent()) ret = false;
						if( this.getDependents().getContents().isEmpty()) ret = false;
						for (Iterator<EObject> iter = this.getDependents().getContents().iterator(); iter.hasNext(); ) {
							MonitorImpl var = (MonitorImpl) iter.next();
							if( var.WorldDataType().compareTo("boolean") != 0 ) ret = false;
						}
						return ret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	@Override
	public boolean IsPartOfPattern() {
		boolean ret = false;
		if( IsDependent() ){
			MonitorImpl parent = ((MonitorImpl)this.getParent());
			if( parent.IsPattern() )
				ret = true;
		}
		return ret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	@Override
	public boolean IsHomogeneous() {
		boolean ret = true;
		String firsttype = null;
		if( hasDependents() ){
			for (Iterator<EObject> iter = this.getDependents().getContents().iterator(); iter.hasNext(); ) {
				MonitorImpl var = (MonitorImpl) iter.next();
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
	 * @!generated
	 */
	@Override
	public boolean IsPartOfHomogeneous() {
		boolean ret = false;
		if( IsDependent() ){
			MonitorImpl parent = ((MonitorImpl)this.getParent());
			if( parent.IsHomogeneous() )
				ret = true;
		}
		return ret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitorAmb(final String[] row, final EObject parent, final Table tables, final Util utils, final String dirDevice) {
		this.tables = tables;
		this.utils = utils;
		setMonitorPoint(row, parent,tables,utils);
		mac = new MandCImpl();
		mac.setMandCAmb(row, sheet, this, tables, utils);
		String dir = setParameters(dirDevice);
		resourceSetMonitor = new ResourceSetImpl();
		Resource res = resourceSetMonitor.createResource(URI.createURI(dir));
		res.getContents().add(mac);		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	public String setParameters(String dirDevice){
		Resource.Factory.Registry regis = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> mm = regis.getExtensionToFactoryMap();		
		String extension = "xmi";
		String tmp = dirDevice.concat("/").concat(extension).concat("/");
		mm.put(extension, new XMIResourceFactoryImpl());
		String xmiArchive = tmp.concat("monitorAmb.").concat(extension);
		return xmiArchive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmbPackage.MONITOR__MAC:
				if (resolve) return getMac();
				return basicGetMac();
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
			case AmbPackage.MONITOR__MAC:
				setMac((MandC)newValue);
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
			case AmbPackage.MONITOR__MAC:
				setMac((MandC)null);
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
			case AmbPackage.MONITOR__MAC:
				return mac != null;
		}
		return super.eIsSet(featureID);
	}
} //MonitorImpl
