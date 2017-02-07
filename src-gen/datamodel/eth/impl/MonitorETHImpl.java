/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package datamodel.eth.impl;

import datamodel.base.impl.MonitorPointImpl;

import datamodel.eth.EthPackage;
import datamodel.eth.MandCETH;
import datamodel.eth.MonitorETH;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monitor ETH</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datamodel.eth.impl.MonitorETHImpl#getMac <em>Mac</em>}</li>
 *   <li>{@link datamodel.eth.impl.MonitorETHImpl#getGetInfoMPEth <em>Get Info MP Eth</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MonitorETHImpl extends MonitorPointImpl implements MonitorETH {
	/**
	 * The default value of the '{@link #getMac() <em>Mac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMac()
	 * @generated
	 * @ordered
	 */
	protected static final MandCETH MAC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMac() <em>Mac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMac()
	 * @generated
	 * @ordered
	 */
	protected MandCETH mac = MAC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGetInfoMPEth() <em>Get Info MP Eth</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetInfoMPEth()
	 * @generated
	 * @ordered
	 */
	protected MandCETH getInfoMPEth;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MonitorETHImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EthPackage.Literals.MONITOR_ETH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandCETH getMac() {
		return mac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMac(MandCETH newMac) {
		MandCETH oldMac = mac;
		mac = newMac;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EthPackage.MONITOR_ETH__MAC, oldMac, mac));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandCETH getGetInfoMPEth() {
		if (getInfoMPEth != null && getInfoMPEth.eIsProxy()) {
			InternalEObject oldGetInfoMPEth = (InternalEObject)getInfoMPEth;
			getInfoMPEth = (MandCETH)eResolveProxy(oldGetInfoMPEth);
			if (getInfoMPEth != oldGetInfoMPEth) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EthPackage.MONITOR_ETH__GET_INFO_MP_ETH, oldGetInfoMPEth, getInfoMPEth));
			}
		}
		return getInfoMPEth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandCETH basicGetGetInfoMPEth() {
		return getInfoMPEth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetInfoMPEth(MandCETH newGetInfoMPEth) {
		MandCETH oldGetInfoMPEth = getInfoMPEth;
		getInfoMPEth = newGetInfoMPEth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EthPackage.MONITOR_ETH__GET_INFO_MP_ETH, oldGetInfoMPEth, getInfoMPEth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssembly(String assembly) {
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
			case EthPackage.MONITOR_ETH__MAC:
				return getMac();
			case EthPackage.MONITOR_ETH__GET_INFO_MP_ETH:
				if (resolve) return getGetInfoMPEth();
				return basicGetGetInfoMPEth();
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
			case EthPackage.MONITOR_ETH__MAC:
				setMac((MandCETH)newValue);
				return;
			case EthPackage.MONITOR_ETH__GET_INFO_MP_ETH:
				setGetInfoMPEth((MandCETH)newValue);
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
			case EthPackage.MONITOR_ETH__MAC:
				setMac(MAC_EDEFAULT);
				return;
			case EthPackage.MONITOR_ETH__GET_INFO_MP_ETH:
				setGetInfoMPEth((MandCETH)null);
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
			case EthPackage.MONITOR_ETH__MAC:
				return MAC_EDEFAULT == null ? mac != null : !MAC_EDEFAULT.equals(mac);
			case EthPackage.MONITOR_ETH__GET_INFO_MP_ETH:
				return getInfoMPEth != null;
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

} //MonitorETHImpl
