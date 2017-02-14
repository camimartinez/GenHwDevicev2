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

import alma.Control.datamodel.meta.base.MainBase;
import alma.Control.datamodel.meta.base.Note;
import alma.Control.datamodel.meta.base.SpreadsheetParser;
import alma.Control.datamodel.meta.base.SpreadsheetValidator;
import alma.Control.datamodel.meta.base.Table;
import alma.Control.datamodel.meta.base.Util;

import alma.Control.datamodel.meta.eth.Archive;
import alma.Control.datamodel.meta.eth.Control;
import alma.Control.datamodel.meta.eth.DeviceModel;
import alma.Control.datamodel.meta.eth.EthPackage;
import alma.Control.datamodel.meta.eth.Monitor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alma.Control.datamodel.meta.eth.impl.DeviceModelImpl#getInfoDevMain <em>Info Dev Main</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.eth.impl.DeviceModelImpl#getInfoControl <em>Info Control</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.eth.impl.DeviceModelImpl#getInfoMonitor <em>Info Monitor</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.eth.impl.DeviceModelImpl#getToEndEth <em>To End Eth</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.eth.impl.DeviceModelImpl#getInfoArch <em>Info Arch</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.eth.impl.DeviceModelImpl#getDataSpreadsheet <em>Data Spreadsheet</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.eth.impl.DeviceModelImpl#getToNotes <em>To Notes</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.eth.impl.DeviceModelImpl#getToValidateSpreadEth <em>To Validate Spread Eth</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.eth.impl.DeviceModelImpl#getToSpreadEth <em>To Spread Eth</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceModelImpl extends alma.Control.datamodel.meta.base.impl.DeviceModelImpl implements DeviceModel {
	/**
	 * The cached value of the '{@link #getInfoDevMain() <em>Info Dev Main</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfoDevMain()
	 * @generated
	 * @ordered
	 */
	protected MainBase infoDevMain;

	/**
	 * The cached value of the '{@link #getInfoControl() <em>Info Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfoControl()
	 * @generated
	 * @ordered
	 */
	protected Control infoControl;

	/**
	 * The cached value of the '{@link #getInfoMonitor() <em>Info Monitor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfoMonitor()
	 * @generated
	 * @ordered
	 */
	protected Monitor infoMonitor;

	/**
	 * The cached value of the '{@link #getToEndEth() <em>To End Eth</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToEndEth()
	 * @generated
	 * @ordered
	 */
	protected Util toEndEth;

	/**
	 * The cached value of the '{@link #getInfoArch() <em>Info Arch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfoArch()
	 * @generated
	 * @ordered
	 */
	protected Archive infoArch;

	/**
	 * The cached value of the '{@link #getDataSpreadsheet() <em>Data Spreadsheet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSpreadsheet()
	 * @generated
	 * @ordered
	 */
	protected Table dataSpreadsheet;

	/**
	 * The cached value of the '{@link #getToNotes() <em>To Notes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToNotes()
	 * @generated
	 * @ordered
	 */
	protected Note toNotes;

	/**
	 * The cached value of the '{@link #getToValidateSpreadEth() <em>To Validate Spread Eth</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToValidateSpreadEth()
	 * @generated
	 * @ordered
	 */
	protected SpreadsheetValidator toValidateSpreadEth;

	/**
	 * The cached value of the '{@link #getToSpreadEth() <em>To Spread Eth</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToSpreadEth()
	 * @generated
	 * @ordered
	 */
	protected SpreadsheetParser toSpreadEth;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EthPackage.Literals.DEVICE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainBase getInfoDevMain() {
		if (infoDevMain != null && infoDevMain.eIsProxy()) {
			InternalEObject oldInfoDevMain = (InternalEObject)infoDevMain;
			infoDevMain = (MainBase)eResolveProxy(oldInfoDevMain);
			if (infoDevMain != oldInfoDevMain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EthPackage.DEVICE_MODEL__INFO_DEV_MAIN, oldInfoDevMain, infoDevMain));
			}
		}
		return infoDevMain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainBase basicGetInfoDevMain() {
		return infoDevMain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfoDevMain(MainBase newInfoDevMain) {
		MainBase oldInfoDevMain = infoDevMain;
		infoDevMain = newInfoDevMain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EthPackage.DEVICE_MODEL__INFO_DEV_MAIN, oldInfoDevMain, infoDevMain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Control getInfoControl() {
		if (infoControl != null && infoControl.eIsProxy()) {
			InternalEObject oldInfoControl = (InternalEObject)infoControl;
			infoControl = (Control)eResolveProxy(oldInfoControl);
			if (infoControl != oldInfoControl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EthPackage.DEVICE_MODEL__INFO_CONTROL, oldInfoControl, infoControl));
			}
		}
		return infoControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Control basicGetInfoControl() {
		return infoControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfoControl(Control newInfoControl) {
		Control oldInfoControl = infoControl;
		infoControl = newInfoControl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EthPackage.DEVICE_MODEL__INFO_CONTROL, oldInfoControl, infoControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Monitor getInfoMonitor() {
		if (infoMonitor != null && infoMonitor.eIsProxy()) {
			InternalEObject oldInfoMonitor = (InternalEObject)infoMonitor;
			infoMonitor = (Monitor)eResolveProxy(oldInfoMonitor);
			if (infoMonitor != oldInfoMonitor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EthPackage.DEVICE_MODEL__INFO_MONITOR, oldInfoMonitor, infoMonitor));
			}
		}
		return infoMonitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Monitor basicGetInfoMonitor() {
		return infoMonitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfoMonitor(Monitor newInfoMonitor) {
		Monitor oldInfoMonitor = infoMonitor;
		infoMonitor = newInfoMonitor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EthPackage.DEVICE_MODEL__INFO_MONITOR, oldInfoMonitor, infoMonitor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Util getToEndEth() {
		if (toEndEth != null && toEndEth.eIsProxy()) {
			InternalEObject oldToEndEth = (InternalEObject)toEndEth;
			toEndEth = (Util)eResolveProxy(oldToEndEth);
			if (toEndEth != oldToEndEth) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EthPackage.DEVICE_MODEL__TO_END_ETH, oldToEndEth, toEndEth));
			}
		}
		return toEndEth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Util basicGetToEndEth() {
		return toEndEth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToEndEth(Util newToEndEth) {
		Util oldToEndEth = toEndEth;
		toEndEth = newToEndEth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EthPackage.DEVICE_MODEL__TO_END_ETH, oldToEndEth, toEndEth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Archive getInfoArch() {
		if (infoArch != null && infoArch.eIsProxy()) {
			InternalEObject oldInfoArch = (InternalEObject)infoArch;
			infoArch = (Archive)eResolveProxy(oldInfoArch);
			if (infoArch != oldInfoArch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EthPackage.DEVICE_MODEL__INFO_ARCH, oldInfoArch, infoArch));
			}
		}
		return infoArch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Archive basicGetInfoArch() {
		return infoArch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfoArch(Archive newInfoArch) {
		Archive oldInfoArch = infoArch;
		infoArch = newInfoArch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EthPackage.DEVICE_MODEL__INFO_ARCH, oldInfoArch, infoArch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getDataSpreadsheet() {
		if (dataSpreadsheet != null && dataSpreadsheet.eIsProxy()) {
			InternalEObject oldDataSpreadsheet = (InternalEObject)dataSpreadsheet;
			dataSpreadsheet = (Table)eResolveProxy(oldDataSpreadsheet);
			if (dataSpreadsheet != oldDataSpreadsheet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EthPackage.DEVICE_MODEL__DATA_SPREADSHEET, oldDataSpreadsheet, dataSpreadsheet));
			}
		}
		return dataSpreadsheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetDataSpreadsheet() {
		return dataSpreadsheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSpreadsheet(Table newDataSpreadsheet) {
		Table oldDataSpreadsheet = dataSpreadsheet;
		dataSpreadsheet = newDataSpreadsheet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EthPackage.DEVICE_MODEL__DATA_SPREADSHEET, oldDataSpreadsheet, dataSpreadsheet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Note getToNotes() {
		if (toNotes != null && toNotes.eIsProxy()) {
			InternalEObject oldToNotes = (InternalEObject)toNotes;
			toNotes = (Note)eResolveProxy(oldToNotes);
			if (toNotes != oldToNotes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EthPackage.DEVICE_MODEL__TO_NOTES, oldToNotes, toNotes));
			}
		}
		return toNotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Note basicGetToNotes() {
		return toNotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToNotes(Note newToNotes) {
		Note oldToNotes = toNotes;
		toNotes = newToNotes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EthPackage.DEVICE_MODEL__TO_NOTES, oldToNotes, toNotes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetValidator getToValidateSpreadEth() {
		if (toValidateSpreadEth != null && toValidateSpreadEth.eIsProxy()) {
			InternalEObject oldToValidateSpreadEth = (InternalEObject)toValidateSpreadEth;
			toValidateSpreadEth = (SpreadsheetValidator)eResolveProxy(oldToValidateSpreadEth);
			if (toValidateSpreadEth != oldToValidateSpreadEth) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EthPackage.DEVICE_MODEL__TO_VALIDATE_SPREAD_ETH, oldToValidateSpreadEth, toValidateSpreadEth));
			}
		}
		return toValidateSpreadEth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetValidator basicGetToValidateSpreadEth() {
		return toValidateSpreadEth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToValidateSpreadEth(SpreadsheetValidator newToValidateSpreadEth) {
		SpreadsheetValidator oldToValidateSpreadEth = toValidateSpreadEth;
		toValidateSpreadEth = newToValidateSpreadEth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EthPackage.DEVICE_MODEL__TO_VALIDATE_SPREAD_ETH, oldToValidateSpreadEth, toValidateSpreadEth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetParser getToSpreadEth() {
		if (toSpreadEth != null && toSpreadEth.eIsProxy()) {
			InternalEObject oldToSpreadEth = (InternalEObject)toSpreadEth;
			toSpreadEth = (SpreadsheetParser)eResolveProxy(oldToSpreadEth);
			if (toSpreadEth != oldToSpreadEth) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EthPackage.DEVICE_MODEL__TO_SPREAD_ETH, oldToSpreadEth, toSpreadEth));
			}
		}
		return toSpreadEth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetParser basicGetToSpreadEth() {
		return toSpreadEth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToSpreadEth(SpreadsheetParser newToSpreadEth) {
		SpreadsheetParser oldToSpreadEth = toSpreadEth;
		toSpreadEth = newToSpreadEth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EthPackage.DEVICE_MODEL__TO_SPREAD_ETH, oldToSpreadEth, toSpreadEth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String CreateModel() {
		return "true";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String VendorClass() {
		return ((MainImpl)main).VendorClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EthPackage.DEVICE_MODEL__INFO_DEV_MAIN:
				if (resolve) return getInfoDevMain();
				return basicGetInfoDevMain();
			case EthPackage.DEVICE_MODEL__INFO_CONTROL:
				if (resolve) return getInfoControl();
				return basicGetInfoControl();
			case EthPackage.DEVICE_MODEL__INFO_MONITOR:
				if (resolve) return getInfoMonitor();
				return basicGetInfoMonitor();
			case EthPackage.DEVICE_MODEL__TO_END_ETH:
				if (resolve) return getToEndEth();
				return basicGetToEndEth();
			case EthPackage.DEVICE_MODEL__INFO_ARCH:
				if (resolve) return getInfoArch();
				return basicGetInfoArch();
			case EthPackage.DEVICE_MODEL__DATA_SPREADSHEET:
				if (resolve) return getDataSpreadsheet();
				return basicGetDataSpreadsheet();
			case EthPackage.DEVICE_MODEL__TO_NOTES:
				if (resolve) return getToNotes();
				return basicGetToNotes();
			case EthPackage.DEVICE_MODEL__TO_VALIDATE_SPREAD_ETH:
				if (resolve) return getToValidateSpreadEth();
				return basicGetToValidateSpreadEth();
			case EthPackage.DEVICE_MODEL__TO_SPREAD_ETH:
				if (resolve) return getToSpreadEth();
				return basicGetToSpreadEth();
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
			case EthPackage.DEVICE_MODEL__INFO_DEV_MAIN:
				setInfoDevMain((MainBase)newValue);
				return;
			case EthPackage.DEVICE_MODEL__INFO_CONTROL:
				setInfoControl((Control)newValue);
				return;
			case EthPackage.DEVICE_MODEL__INFO_MONITOR:
				setInfoMonitor((Monitor)newValue);
				return;
			case EthPackage.DEVICE_MODEL__TO_END_ETH:
				setToEndEth((Util)newValue);
				return;
			case EthPackage.DEVICE_MODEL__INFO_ARCH:
				setInfoArch((Archive)newValue);
				return;
			case EthPackage.DEVICE_MODEL__DATA_SPREADSHEET:
				setDataSpreadsheet((Table)newValue);
				return;
			case EthPackage.DEVICE_MODEL__TO_NOTES:
				setToNotes((Note)newValue);
				return;
			case EthPackage.DEVICE_MODEL__TO_VALIDATE_SPREAD_ETH:
				setToValidateSpreadEth((SpreadsheetValidator)newValue);
				return;
			case EthPackage.DEVICE_MODEL__TO_SPREAD_ETH:
				setToSpreadEth((SpreadsheetParser)newValue);
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
			case EthPackage.DEVICE_MODEL__INFO_DEV_MAIN:
				setInfoDevMain((MainBase)null);
				return;
			case EthPackage.DEVICE_MODEL__INFO_CONTROL:
				setInfoControl((Control)null);
				return;
			case EthPackage.DEVICE_MODEL__INFO_MONITOR:
				setInfoMonitor((Monitor)null);
				return;
			case EthPackage.DEVICE_MODEL__TO_END_ETH:
				setToEndEth((Util)null);
				return;
			case EthPackage.DEVICE_MODEL__INFO_ARCH:
				setInfoArch((Archive)null);
				return;
			case EthPackage.DEVICE_MODEL__DATA_SPREADSHEET:
				setDataSpreadsheet((Table)null);
				return;
			case EthPackage.DEVICE_MODEL__TO_NOTES:
				setToNotes((Note)null);
				return;
			case EthPackage.DEVICE_MODEL__TO_VALIDATE_SPREAD_ETH:
				setToValidateSpreadEth((SpreadsheetValidator)null);
				return;
			case EthPackage.DEVICE_MODEL__TO_SPREAD_ETH:
				setToSpreadEth((SpreadsheetParser)null);
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
			case EthPackage.DEVICE_MODEL__INFO_DEV_MAIN:
				return infoDevMain != null;
			case EthPackage.DEVICE_MODEL__INFO_CONTROL:
				return infoControl != null;
			case EthPackage.DEVICE_MODEL__INFO_MONITOR:
				return infoMonitor != null;
			case EthPackage.DEVICE_MODEL__TO_END_ETH:
				return toEndEth != null;
			case EthPackage.DEVICE_MODEL__INFO_ARCH:
				return infoArch != null;
			case EthPackage.DEVICE_MODEL__DATA_SPREADSHEET:
				return dataSpreadsheet != null;
			case EthPackage.DEVICE_MODEL__TO_NOTES:
				return toNotes != null;
			case EthPackage.DEVICE_MODEL__TO_VALIDATE_SPREAD_ETH:
				return toValidateSpreadEth != null;
			case EthPackage.DEVICE_MODEL__TO_SPREAD_ETH:
				return toSpreadEth != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceModelImpl
