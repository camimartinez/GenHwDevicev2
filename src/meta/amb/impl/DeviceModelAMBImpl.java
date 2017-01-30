/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package meta.amb.impl;

import meta.amb.AmbPackage;
import meta.amb.ArchiveImpl;
import meta.amb.ControlImpl;
import meta.amb.DeviceModelAMB;
import meta.amb.MainImpl;
import meta.amb.MonitorImpl;

import meta.base.ControlPoint;
import meta.base.MainBase;
import meta.base.MonitorPoint;
import meta.base.Note;
import meta.base.SpreadsheetParser;
import meta.base.SpreadsheetValidator;
import meta.base.Table;
import meta.base.Util;

import meta.base.impl.DeviceModelImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Model AMB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link meta.amb.impl.DeviceModelAMBImpl#getEReference7 <em>EReference7</em>}</li>
 *   <li>{@link meta.amb.impl.DeviceModelAMBImpl#getEReference8 <em>EReference8</em>}</li>
 *   <li>{@link meta.amb.impl.DeviceModelAMBImpl#getEReference9 <em>EReference9</em>}</li>
 *   <li>{@link meta.amb.impl.DeviceModelAMBImpl#getEReference10 <em>EReference10</em>}</li>
 *   <li>{@link meta.amb.impl.DeviceModelAMBImpl#getEReference11 <em>EReference11</em>}</li>
 *   <li>{@link meta.amb.impl.DeviceModelAMBImpl#getEReference12 <em>EReference12</em>}</li>
 *   <li>{@link meta.amb.impl.DeviceModelAMBImpl#getEReference13 <em>EReference13</em>}</li>
 *   <li>{@link meta.amb.impl.DeviceModelAMBImpl#getEReference14 <em>EReference14</em>}</li>
 *   <li>{@link meta.amb.impl.DeviceModelAMBImpl#getEReference15 <em>EReference15</em>}</li>
 *   <li>{@link meta.amb.impl.DeviceModelAMBImpl#getEReference16 <em>EReference16</em>}</li>
 *   <li>{@link meta.amb.impl.DeviceModelAMBImpl#getEReference17 <em>EReference17</em>}</li>
 *   <li>{@link meta.amb.impl.DeviceModelAMBImpl#getEReference18 <em>EReference18</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeviceModelAMBImpl extends DeviceModelImpl implements DeviceModelAMB {
	/**
	 * The cached value of the '{@link #getEReference7() <em>EReference7</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference7()
	 * @generated
	 * @ordered
	 */
	protected ControlPoint eReference7;

	/**
	 * The cached value of the '{@link #getEReference8() <em>EReference8</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference8()
	 * @generated
	 * @ordered
	 */
	protected Note eReference8;

	/**
	 * The cached value of the '{@link #getEReference9() <em>EReference9</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference9()
	 * @generated
	 * @ordered
	 */
	protected MonitorPoint eReference9;

	/**
	 * The cached value of the '{@link #getEReference10() <em>EReference10</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference10()
	 * @generated
	 * @ordered
	 */
	protected MainBase eReference10;

	/**
	 * The cached value of the '{@link #getEReference11() <em>EReference11</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference11()
	 * @generated
	 * @ordered
	 */
	protected ControlImpl eReference11;

	/**
	 * The cached value of the '{@link #getEReference12() <em>EReference12</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference12()
	 * @generated
	 * @ordered
	 */
	protected MainImpl eReference12;

	/**
	 * The cached value of the '{@link #getEReference13() <em>EReference13</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference13()
	 * @generated
	 * @ordered
	 */
	protected MonitorImpl eReference13;

	/**
	 * The cached value of the '{@link #getEReference14() <em>EReference14</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference14()
	 * @generated
	 * @ordered
	 */
	protected Table eReference14;

	/**
	 * The cached value of the '{@link #getEReference15() <em>EReference15</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference15()
	 * @generated
	 * @ordered
	 */
	protected ArchiveImpl eReference15;

	/**
	 * The cached value of the '{@link #getEReference16() <em>EReference16</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference16()
	 * @generated
	 * @ordered
	 */
	protected Util eReference16;

	/**
	 * The cached value of the '{@link #getEReference17() <em>EReference17</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference17()
	 * @generated
	 * @ordered
	 */
	protected SpreadsheetParser eReference17;

	/**
	 * The cached value of the '{@link #getEReference18() <em>EReference18</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference18()
	 * @generated
	 * @ordered
	 */
	protected SpreadsheetValidator eReference18;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceModelAMBImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmbPackage.Literals.DEVICE_MODEL_AMB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlPoint getEReference7() {
		if (eReference7 != null && eReference7.eIsProxy()) {
			InternalEObject oldEReference7 = (InternalEObject)eReference7;
			eReference7 = (ControlPoint)eResolveProxy(oldEReference7);
			if (eReference7 != oldEReference7) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL_AMB__EREFERENCE7, oldEReference7, eReference7));
			}
		}
		return eReference7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlPoint basicGetEReference7() {
		return eReference7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference7(ControlPoint newEReference7) {
		ControlPoint oldEReference7 = eReference7;
		eReference7 = newEReference7;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL_AMB__EREFERENCE7, oldEReference7, eReference7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Note getEReference8() {
		if (eReference8 != null && eReference8.eIsProxy()) {
			InternalEObject oldEReference8 = (InternalEObject)eReference8;
			eReference8 = (Note)eResolveProxy(oldEReference8);
			if (eReference8 != oldEReference8) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL_AMB__EREFERENCE8, oldEReference8, eReference8));
			}
		}
		return eReference8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Note basicGetEReference8() {
		return eReference8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference8(Note newEReference8) {
		Note oldEReference8 = eReference8;
		eReference8 = newEReference8;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL_AMB__EREFERENCE8, oldEReference8, eReference8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorPoint getEReference9() {
		if (eReference9 != null && eReference9.eIsProxy()) {
			InternalEObject oldEReference9 = (InternalEObject)eReference9;
			eReference9 = (MonitorPoint)eResolveProxy(oldEReference9);
			if (eReference9 != oldEReference9) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL_AMB__EREFERENCE9, oldEReference9, eReference9));
			}
		}
		return eReference9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorPoint basicGetEReference9() {
		return eReference9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference9(MonitorPoint newEReference9) {
		MonitorPoint oldEReference9 = eReference9;
		eReference9 = newEReference9;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL_AMB__EREFERENCE9, oldEReference9, eReference9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainBase getEReference10() {
		if (eReference10 != null && eReference10.eIsProxy()) {
			InternalEObject oldEReference10 = (InternalEObject)eReference10;
			eReference10 = (MainBase)eResolveProxy(oldEReference10);
			if (eReference10 != oldEReference10) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL_AMB__EREFERENCE10, oldEReference10, eReference10));
			}
		}
		return eReference10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainBase basicGetEReference10() {
		return eReference10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference10(MainBase newEReference10) {
		MainBase oldEReference10 = eReference10;
		eReference10 = newEReference10;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL_AMB__EREFERENCE10, oldEReference10, eReference10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlImpl getEReference11() {
		if (eReference11 != null && eReference11.eIsProxy()) {
			InternalEObject oldEReference11 = (InternalEObject)eReference11;
			eReference11 = (ControlImpl)eResolveProxy(oldEReference11);
			if (eReference11 != oldEReference11) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL_AMB__EREFERENCE11, oldEReference11, eReference11));
			}
		}
		return eReference11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlImpl basicGetEReference11() {
		return eReference11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference11(ControlImpl newEReference11) {
		ControlImpl oldEReference11 = eReference11;
		eReference11 = newEReference11;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL_AMB__EREFERENCE11, oldEReference11, eReference11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainImpl getEReference12() {
		if (eReference12 != null && eReference12.eIsProxy()) {
			InternalEObject oldEReference12 = (InternalEObject)eReference12;
			eReference12 = (MainImpl)eResolveProxy(oldEReference12);
			if (eReference12 != oldEReference12) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL_AMB__EREFERENCE12, oldEReference12, eReference12));
			}
		}
		return eReference12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainImpl basicGetEReference12() {
		return eReference12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference12(MainImpl newEReference12) {
		MainImpl oldEReference12 = eReference12;
		eReference12 = newEReference12;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL_AMB__EREFERENCE12, oldEReference12, eReference12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorImpl getEReference13() {
		if (eReference13 != null && eReference13.eIsProxy()) {
			InternalEObject oldEReference13 = (InternalEObject)eReference13;
			eReference13 = (MonitorImpl)eResolveProxy(oldEReference13);
			if (eReference13 != oldEReference13) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL_AMB__EREFERENCE13, oldEReference13, eReference13));
			}
		}
		return eReference13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorImpl basicGetEReference13() {
		return eReference13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference13(MonitorImpl newEReference13) {
		MonitorImpl oldEReference13 = eReference13;
		eReference13 = newEReference13;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL_AMB__EREFERENCE13, oldEReference13, eReference13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getEReference14() {
		if (eReference14 != null && eReference14.eIsProxy()) {
			InternalEObject oldEReference14 = (InternalEObject)eReference14;
			eReference14 = (Table)eResolveProxy(oldEReference14);
			if (eReference14 != oldEReference14) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL_AMB__EREFERENCE14, oldEReference14, eReference14));
			}
		}
		return eReference14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetEReference14() {
		return eReference14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference14(Table newEReference14) {
		Table oldEReference14 = eReference14;
		eReference14 = newEReference14;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL_AMB__EREFERENCE14, oldEReference14, eReference14));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchiveImpl getEReference15() {
		if (eReference15 != null && eReference15.eIsProxy()) {
			InternalEObject oldEReference15 = (InternalEObject)eReference15;
			eReference15 = (ArchiveImpl)eResolveProxy(oldEReference15);
			if (eReference15 != oldEReference15) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL_AMB__EREFERENCE15, oldEReference15, eReference15));
			}
		}
		return eReference15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchiveImpl basicGetEReference15() {
		return eReference15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference15(ArchiveImpl newEReference15) {
		ArchiveImpl oldEReference15 = eReference15;
		eReference15 = newEReference15;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL_AMB__EREFERENCE15, oldEReference15, eReference15));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Util getEReference16() {
		if (eReference16 != null && eReference16.eIsProxy()) {
			InternalEObject oldEReference16 = (InternalEObject)eReference16;
			eReference16 = (Util)eResolveProxy(oldEReference16);
			if (eReference16 != oldEReference16) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL_AMB__EREFERENCE16, oldEReference16, eReference16));
			}
		}
		return eReference16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Util basicGetEReference16() {
		return eReference16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference16(Util newEReference16) {
		Util oldEReference16 = eReference16;
		eReference16 = newEReference16;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL_AMB__EREFERENCE16, oldEReference16, eReference16));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetParser getEReference17() {
		if (eReference17 != null && eReference17.eIsProxy()) {
			InternalEObject oldEReference17 = (InternalEObject)eReference17;
			eReference17 = (SpreadsheetParser)eResolveProxy(oldEReference17);
			if (eReference17 != oldEReference17) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL_AMB__EREFERENCE17, oldEReference17, eReference17));
			}
		}
		return eReference17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetParser basicGetEReference17() {
		return eReference17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference17(SpreadsheetParser newEReference17) {
		SpreadsheetParser oldEReference17 = eReference17;
		eReference17 = newEReference17;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL_AMB__EREFERENCE17, oldEReference17, eReference17));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetValidator getEReference18() {
		if (eReference18 != null && eReference18.eIsProxy()) {
			InternalEObject oldEReference18 = (InternalEObject)eReference18;
			eReference18 = (SpreadsheetValidator)eResolveProxy(oldEReference18);
			if (eReference18 != oldEReference18) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.DEVICE_MODEL_AMB__EREFERENCE18, oldEReference18, eReference18));
			}
		}
		return eReference18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetValidator basicGetEReference18() {
		return eReference18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference18(SpreadsheetValidator newEReference18) {
		SpreadsheetValidator oldEReference18 = eReference18;
		eReference18 = newEReference18;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.DEVICE_MODEL_AMB__EREFERENCE18, oldEReference18, eReference18));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean IsGeneratedAlt() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Parent() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Cardinality() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String NodeAddress() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Channel() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String BaseAddress() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean GenericMonitorPoints() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String NodeAddressInDecimal() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String HexToDec(String s) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE7:
				if (resolve) return getEReference7();
				return basicGetEReference7();
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE8:
				if (resolve) return getEReference8();
				return basicGetEReference8();
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE9:
				if (resolve) return getEReference9();
				return basicGetEReference9();
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE10:
				if (resolve) return getEReference10();
				return basicGetEReference10();
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE11:
				if (resolve) return getEReference11();
				return basicGetEReference11();
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE12:
				if (resolve) return getEReference12();
				return basicGetEReference12();
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE13:
				if (resolve) return getEReference13();
				return basicGetEReference13();
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE14:
				if (resolve) return getEReference14();
				return basicGetEReference14();
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE15:
				if (resolve) return getEReference15();
				return basicGetEReference15();
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE16:
				if (resolve) return getEReference16();
				return basicGetEReference16();
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE17:
				if (resolve) return getEReference17();
				return basicGetEReference17();
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE18:
				if (resolve) return getEReference18();
				return basicGetEReference18();
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
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE7:
				setEReference7((ControlPoint)newValue);
				return;
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE8:
				setEReference8((Note)newValue);
				return;
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE9:
				setEReference9((MonitorPoint)newValue);
				return;
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE10:
				setEReference10((MainBase)newValue);
				return;
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE11:
				setEReference11((ControlImpl)newValue);
				return;
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE12:
				setEReference12((MainImpl)newValue);
				return;
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE13:
				setEReference13((MonitorImpl)newValue);
				return;
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE14:
				setEReference14((Table)newValue);
				return;
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE15:
				setEReference15((ArchiveImpl)newValue);
				return;
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE16:
				setEReference16((Util)newValue);
				return;
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE17:
				setEReference17((SpreadsheetParser)newValue);
				return;
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE18:
				setEReference18((SpreadsheetValidator)newValue);
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
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE7:
				setEReference7((ControlPoint)null);
				return;
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE8:
				setEReference8((Note)null);
				return;
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE9:
				setEReference9((MonitorPoint)null);
				return;
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE10:
				setEReference10((MainBase)null);
				return;
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE11:
				setEReference11((ControlImpl)null);
				return;
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE12:
				setEReference12((MainImpl)null);
				return;
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE13:
				setEReference13((MonitorImpl)null);
				return;
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE14:
				setEReference14((Table)null);
				return;
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE15:
				setEReference15((ArchiveImpl)null);
				return;
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE16:
				setEReference16((Util)null);
				return;
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE17:
				setEReference17((SpreadsheetParser)null);
				return;
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE18:
				setEReference18((SpreadsheetValidator)null);
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
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE7:
				return eReference7 != null;
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE8:
				return eReference8 != null;
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE9:
				return eReference9 != null;
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE10:
				return eReference10 != null;
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE11:
				return eReference11 != null;
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE12:
				return eReference12 != null;
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE13:
				return eReference13 != null;
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE14:
				return eReference14 != null;
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE15:
				return eReference15 != null;
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE16:
				return eReference16 != null;
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE17:
				return eReference17 != null;
			case AmbPackage.DEVICE_MODEL_AMB__EREFERENCE18:
				return eReference18 != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceModelAMBImpl
