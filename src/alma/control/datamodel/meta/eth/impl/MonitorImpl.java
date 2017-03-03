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
package alma.control.datamodel.meta.eth.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import alma.control.datamodel.meta.base.Util;
import alma.control.datamodel.meta.base.impl.MonitorPointImpl;

import alma.control.datamodel.meta.eth.EthPackage;
import alma.control.datamodel.meta.eth.MandC;
import alma.control.datamodel.meta.eth.Monitor;
import alma.control.datamodel.meta.eth.impl.MandCImpl;

import org.eclipse.emf.common.notify.Adapter;
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
 * An implementation of the model object '<em><b>Monitor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alma.control.datamodel.meta.eth.impl.MonitorImpl#getMac <em>Mac</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.eth.impl.MonitorImpl#getMandCb <em>Mand Cb</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MonitorImpl extends MonitorPointImpl implements Monitor {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	public MonitorImpl(String[] row, Resource parent){
		super(row, parent);
		mac = new MandCImpl(row, sheet);
	}
	
	/**
	 * The default value of the '{@link #getMac() <em>Mac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMac()
	 * @generated
	 * @ordered
	 */
	protected static final MandC MAC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMac() <em>Mac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMac()
	 * @generated
	 * @ordered
	 */
	protected MandC mac = MAC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMandCb() <em>Mand Cb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandCb()
	 * @generated
	 * @ordered
	 */
	protected MandC mandCb;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EthPackage.Literals.MONITOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandC getMac() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, EthPackage.MONITOR__MAC, oldMac, mac));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandC getMandCb() {
		if (mandCb != null && mandCb.eIsProxy()) {
			InternalEObject oldMandCb = (InternalEObject)mandCb;
			mandCb = (MandC)eResolveProxy(oldMandCb);
			if (mandCb != oldMandCb) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EthPackage.MONITOR__MAND_CB, oldMandCb, mandCb));
			}
		}
		return mandCb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandC basicGetMandCb() {
		return mandCb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMandCb(MandC newMandCb) {
		MandC oldMandCb = mandCb;
		mandCb = newMandCb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EthPackage.MONITOR__MAND_CB, oldMandCb, mandCb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssemblyName(final String assembly) {
		mac.setAssemblyName(assembly);
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
	public String Address() {
		return mac.Address();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnumAddress() {
				try {
					Integer.decode(mac.Address());
				}
				catch(Exception e) {
					return true;
				}
		
				return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DataType() {
		return mac.DataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDataArray() {
		return mac.isDataArray();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOpenArray() {
		return mac.isOpenArray();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArrayLength() {
		return mac.getArrayLength();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DataToIDLType() {
		return mac.DataToIDLType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DataToIDLSeqType() {
		return mac.DataToIDLSeqType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DataToCPPType() {
		return mac.DataToCPPType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DataToCORBAType() {
		return mac.DataToCORBAType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DataToCORBADevIOType() {
		return mac.DataToCORBADevIOType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DataToCORBASeqType() {
		return mac.DataToCORBASeqType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DataToBACIType() {
		return mac.DataToBACIType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String DataToDatabaseType() {
		return mac.DataToDatabaseType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isArchived() {
		
				if (DataType().equals("uint"))
					return false;
			
				if ( DataType().equals("bool") || DataType().equals("boolean")
						|| DataType().equals("string")
						|| (DataType().equals("double") && isDataArray())
						|| (DataType().equals("int") && isDataArray()) )
					return false;
				return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPartOfPattern() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHomogeneous() {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EthPackage.MONITOR__MAC:
				return getMac();
			case EthPackage.MONITOR__MAND_CB:
				if (resolve) return getMandCb();
				return basicGetMandCb();
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
			case EthPackage.MONITOR__MAC:
				setMac((MandC)newValue);
				return;
			case EthPackage.MONITOR__MAND_CB:
				setMandCb((MandC)newValue);
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
			case EthPackage.MONITOR__MAC:
				setMac(MAC_EDEFAULT);
				return;
			case EthPackage.MONITOR__MAND_CB:
				setMandCb((MandC)null);
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
			case EthPackage.MONITOR__MAC:
				return MAC_EDEFAULT == null ? mac != null : !MAC_EDEFAULT.equals(mac);
			case EthPackage.MONITOR__MAND_CB:
				return mandCb != null;
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
		result.append(" (mac: ");
		result.append(mac);
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

	@Override
	public boolean isPartOfHomogeneous() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setUtil(Util value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EList<Adapter> eAdapters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eDeliver() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void eSetDeliver(boolean deliver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eNotify(Notification notification) {
		// TODO Auto-generated method stub
		
	}

} //MonitorImpl
