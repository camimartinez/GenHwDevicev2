/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package datamodel.base.impl;

import datamodel.base.BasePackage;
import datamodel.base.ControlPoint;
import datamodel.base.Table;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datamodel.base.impl.ControlPointImpl#getGetArchOnUseControl <em>Get Arch On Use Control</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ControlPointImpl extends MandCBaseImpl implements ControlPoint {
	/**
	 * The cached value of the '{@link #getGetArchOnUseControl() <em>Get Arch On Use Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetArchOnUseControl()
	 * @generated
	 * @ordered
	 */
	protected Table getArchOnUseControl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return BasePackage.Literals.CONTROL_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getGetArchOnUseControl() {
		if (getArchOnUseControl != null && getArchOnUseControl.eIsProxy()) {
			InternalEObject oldGetArchOnUseControl = (InternalEObject)getArchOnUseControl;
			getArchOnUseControl = (Table)eResolveProxy(oldGetArchOnUseControl);
			if (getArchOnUseControl != oldGetArchOnUseControl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.CONTROL_POINT__GET_ARCH_ON_USE_CONTROL, oldGetArchOnUseControl, getArchOnUseControl));
			}
		}
		return getArchOnUseControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetGetArchOnUseControl() {
		return getArchOnUseControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetArchOnUseControl(Table newGetArchOnUseControl) {
		Table oldGetArchOnUseControl = getArchOnUseControl;
		getArchOnUseControl = newGetArchOnUseControl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.CONTROL_POINT__GET_ARCH_ON_USE_CONTROL, oldGetArchOnUseControl, getArchOnUseControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String CPName() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String AltCPName() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ArchiveOnUse() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasePackage.CONTROL_POINT__GET_ARCH_ON_USE_CONTROL:
				if (resolve) return getGetArchOnUseControl();
				return basicGetGetArchOnUseControl();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BasePackage.CONTROL_POINT__GET_ARCH_ON_USE_CONTROL:
				setGetArchOnUseControl((Table)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case BasePackage.CONTROL_POINT__GET_ARCH_ON_USE_CONTROL:
				setGetArchOnUseControl((Table)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BasePackage.CONTROL_POINT__GET_ARCH_ON_USE_CONTROL:
				return getArchOnUseControl != null;
		}
		return super.eIsSet(featureID);
	}

} //ControlPointImpl
