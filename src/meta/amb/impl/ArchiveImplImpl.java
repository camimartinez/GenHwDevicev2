/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package meta.amb.impl;

import meta.amb.AmbPackage;
import meta.amb.ArchiveImpl;

import meta.base.Table;

import meta.base.impl.ArchivePropertyImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Archive Impl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link meta.amb.impl.ArchiveImplImpl#getEReference1 <em>EReference1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArchiveImplImpl extends ArchivePropertyImpl implements ArchiveImpl {
	/**
	 * The cached value of the '{@link #getEReference1() <em>EReference1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference1()
	 * @generated
	 * @ordered
	 */
	protected Table eReference1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchiveImplImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmbPackage.Literals.ARCHIVE_IMPL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getEReference1() {
		if (eReference1 != null && eReference1.eIsProxy()) {
			InternalEObject oldEReference1 = (InternalEObject)eReference1;
			eReference1 = (Table)eResolveProxy(oldEReference1);
			if (eReference1 != oldEReference1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.ARCHIVE_IMPL__EREFERENCE1, oldEReference1, eReference1));
			}
		}
		return eReference1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetEReference1() {
		return eReference1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference1(Table newEReference1) {
		Table oldEReference1 = eReference1;
		eReference1 = newEReference1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.ARCHIVE_IMPL__EREFERENCE1, oldEReference1, eReference1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Assembly() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIntervalTE() {
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
			case AmbPackage.ARCHIVE_IMPL__EREFERENCE1:
				if (resolve) return getEReference1();
				return basicGetEReference1();
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
			case AmbPackage.ARCHIVE_IMPL__EREFERENCE1:
				setEReference1((Table)newValue);
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
			case AmbPackage.ARCHIVE_IMPL__EREFERENCE1:
				setEReference1((Table)null);
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
			case AmbPackage.ARCHIVE_IMPL__EREFERENCE1:
				return eReference1 != null;
		}
		return super.eIsSet(featureID);
	}

} //ArchiveImplImpl
