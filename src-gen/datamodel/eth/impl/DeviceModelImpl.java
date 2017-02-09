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

import datamodel.base.MainBase;
import datamodel.base.Note;
import datamodel.base.SpreadsheetParser;
import datamodel.base.SpreadsheetValidator;
import datamodel.base.Table;
import datamodel.base.Util;

import datamodel.eth.ArchiveETH;
import datamodel.eth.ControlETH;
import datamodel.eth.DeviceModel;
import datamodel.eth.EthPackage;
import datamodel.eth.MonitorETH;

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
 * <ul>
 *   <li>{@link datamodel.eth.impl.DeviceModelImpl#getInfoDevMain <em>Info Dev Main</em>}</li>
 *   <li>{@link datamodel.eth.impl.DeviceModelImpl#getInfoControl <em>Info Control</em>}</li>
 *   <li>{@link datamodel.eth.impl.DeviceModelImpl#getInfoMonitor <em>Info Monitor</em>}</li>
 *   <li>{@link datamodel.eth.impl.DeviceModelImpl#getToEndEth <em>To End Eth</em>}</li>
 *   <li>{@link datamodel.eth.impl.DeviceModelImpl#getInfoArch <em>Info Arch</em>}</li>
 *   <li>{@link datamodel.eth.impl.DeviceModelImpl#getDataSpreadsheet <em>Data Spreadsheet</em>}</li>
 *   <li>{@link datamodel.eth.impl.DeviceModelImpl#getNotesTo <em>Notes To</em>}</li>
 *   <li>{@link datamodel.eth.impl.DeviceModelImpl#getValidateSpreadEth <em>Validate Spread Eth</em>}</li>
 *   <li>{@link datamodel.eth.impl.DeviceModelImpl#getFromSpreadEth <em>From Spread Eth</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeviceModelImpl extends datamodel.base.impl.DeviceModelImpl implements DeviceModel {
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
	protected ControlETH infoControl;

	/**
	 * The cached value of the '{@link #getInfoMonitor() <em>Info Monitor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfoMonitor()
	 * @generated
	 * @ordered
	 */
	protected MonitorETH infoMonitor;

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
	protected ArchiveETH infoArch;

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
	 * The cached value of the '{@link #getNotesTo() <em>Notes To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotesTo()
	 * @generated
	 * @ordered
	 */
	protected Note notesTo;

	/**
	 * The cached value of the '{@link #getValidateSpreadEth() <em>Validate Spread Eth</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidateSpreadEth()
	 * @generated
	 * @ordered
	 */
	protected SpreadsheetValidator validateSpreadEth;

	/**
	 * The cached value of the '{@link #getFromSpreadEth() <em>From Spread Eth</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromSpreadEth()
	 * @generated
	 * @ordered
	 */
	protected SpreadsheetParser fromSpreadEth;

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
	public ControlETH getInfoControl() {
		if (infoControl != null && infoControl.eIsProxy()) {
			InternalEObject oldInfoControl = (InternalEObject)infoControl;
			infoControl = (ControlETH)eResolveProxy(oldInfoControl);
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
	public ControlETH basicGetInfoControl() {
		return infoControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfoControl(ControlETH newInfoControl) {
		ControlETH oldInfoControl = infoControl;
		infoControl = newInfoControl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EthPackage.DEVICE_MODEL__INFO_CONTROL, oldInfoControl, infoControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorETH getInfoMonitor() {
		if (infoMonitor != null && infoMonitor.eIsProxy()) {
			InternalEObject oldInfoMonitor = (InternalEObject)infoMonitor;
			infoMonitor = (MonitorETH)eResolveProxy(oldInfoMonitor);
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
	public MonitorETH basicGetInfoMonitor() {
		return infoMonitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfoMonitor(MonitorETH newInfoMonitor) {
		MonitorETH oldInfoMonitor = infoMonitor;
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
	public ArchiveETH getInfoArch() {
		if (infoArch != null && infoArch.eIsProxy()) {
			InternalEObject oldInfoArch = (InternalEObject)infoArch;
			infoArch = (ArchiveETH)eResolveProxy(oldInfoArch);
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
	public ArchiveETH basicGetInfoArch() {
		return infoArch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfoArch(ArchiveETH newInfoArch) {
		ArchiveETH oldInfoArch = infoArch;
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
	public Note getNotesTo() {
		if (notesTo != null && notesTo.eIsProxy()) {
			InternalEObject oldNotesTo = (InternalEObject)notesTo;
			notesTo = (Note)eResolveProxy(oldNotesTo);
			if (notesTo != oldNotesTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EthPackage.DEVICE_MODEL__NOTES_TO, oldNotesTo, notesTo));
			}
		}
		return notesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Note basicGetNotesTo() {
		return notesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotesTo(Note newNotesTo) {
		Note oldNotesTo = notesTo;
		notesTo = newNotesTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EthPackage.DEVICE_MODEL__NOTES_TO, oldNotesTo, notesTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetValidator getValidateSpreadEth() {
		if (validateSpreadEth != null && validateSpreadEth.eIsProxy()) {
			InternalEObject oldValidateSpreadEth = (InternalEObject)validateSpreadEth;
			validateSpreadEth = (SpreadsheetValidator)eResolveProxy(oldValidateSpreadEth);
			if (validateSpreadEth != oldValidateSpreadEth) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EthPackage.DEVICE_MODEL__VALIDATE_SPREAD_ETH, oldValidateSpreadEth, validateSpreadEth));
			}
		}
		return validateSpreadEth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetValidator basicGetValidateSpreadEth() {
		return validateSpreadEth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidateSpreadEth(SpreadsheetValidator newValidateSpreadEth) {
		SpreadsheetValidator oldValidateSpreadEth = validateSpreadEth;
		validateSpreadEth = newValidateSpreadEth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EthPackage.DEVICE_MODEL__VALIDATE_SPREAD_ETH, oldValidateSpreadEth, validateSpreadEth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetParser getFromSpreadEth() {
		if (fromSpreadEth != null && fromSpreadEth.eIsProxy()) {
			InternalEObject oldFromSpreadEth = (InternalEObject)fromSpreadEth;
			fromSpreadEth = (SpreadsheetParser)eResolveProxy(oldFromSpreadEth);
			if (fromSpreadEth != oldFromSpreadEth) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EthPackage.DEVICE_MODEL__FROM_SPREAD_ETH, oldFromSpreadEth, fromSpreadEth));
			}
		}
		return fromSpreadEth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetParser basicGetFromSpreadEth() {
		return fromSpreadEth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromSpreadEth(SpreadsheetParser newFromSpreadEth) {
		SpreadsheetParser oldFromSpreadEth = fromSpreadEth;
		fromSpreadEth = newFromSpreadEth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EthPackage.DEVICE_MODEL__FROM_SPREAD_ETH, oldFromSpreadEth, fromSpreadEth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String VendorClass() {
		return ((MainETHImpl)main).VendorClass();
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
			case EthPackage.DEVICE_MODEL__NOTES_TO:
				if (resolve) return getNotesTo();
				return basicGetNotesTo();
			case EthPackage.DEVICE_MODEL__VALIDATE_SPREAD_ETH:
				if (resolve) return getValidateSpreadEth();
				return basicGetValidateSpreadEth();
			case EthPackage.DEVICE_MODEL__FROM_SPREAD_ETH:
				if (resolve) return getFromSpreadEth();
				return basicGetFromSpreadEth();
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
				setInfoControl((ControlETH)newValue);
				return;
			case EthPackage.DEVICE_MODEL__INFO_MONITOR:
				setInfoMonitor((MonitorETH)newValue);
				return;
			case EthPackage.DEVICE_MODEL__TO_END_ETH:
				setToEndEth((Util)newValue);
				return;
			case EthPackage.DEVICE_MODEL__INFO_ARCH:
				setInfoArch((ArchiveETH)newValue);
				return;
			case EthPackage.DEVICE_MODEL__DATA_SPREADSHEET:
				setDataSpreadsheet((Table)newValue);
				return;
			case EthPackage.DEVICE_MODEL__NOTES_TO:
				setNotesTo((Note)newValue);
				return;
			case EthPackage.DEVICE_MODEL__VALIDATE_SPREAD_ETH:
				setValidateSpreadEth((SpreadsheetValidator)newValue);
				return;
			case EthPackage.DEVICE_MODEL__FROM_SPREAD_ETH:
				setFromSpreadEth((SpreadsheetParser)newValue);
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
				setInfoControl((ControlETH)null);
				return;
			case EthPackage.DEVICE_MODEL__INFO_MONITOR:
				setInfoMonitor((MonitorETH)null);
				return;
			case EthPackage.DEVICE_MODEL__TO_END_ETH:
				setToEndEth((Util)null);
				return;
			case EthPackage.DEVICE_MODEL__INFO_ARCH:
				setInfoArch((ArchiveETH)null);
				return;
			case EthPackage.DEVICE_MODEL__DATA_SPREADSHEET:
				setDataSpreadsheet((Table)null);
				return;
			case EthPackage.DEVICE_MODEL__NOTES_TO:
				setNotesTo((Note)null);
				return;
			case EthPackage.DEVICE_MODEL__VALIDATE_SPREAD_ETH:
				setValidateSpreadEth((SpreadsheetValidator)null);
				return;
			case EthPackage.DEVICE_MODEL__FROM_SPREAD_ETH:
				setFromSpreadEth((SpreadsheetParser)null);
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
			case EthPackage.DEVICE_MODEL__NOTES_TO:
				return notesTo != null;
			case EthPackage.DEVICE_MODEL__VALIDATE_SPREAD_ETH:
				return validateSpreadEth != null;
			case EthPackage.DEVICE_MODEL__FROM_SPREAD_ETH:
				return fromSpreadEth != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceModelImpl
