/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package datamodel.amb.impl;

import datamodel.amb.AmbPackage;
import datamodel.amb.ArchiveAMB;

import datamodel.base.Table;

import datamodel.base.impl.ArchivePropertyImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Archive AMB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datamodel.amb.impl.ArchiveAMBImpl#getGetAssemblyColumn <em>Get Assembly Column</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArchiveAMBImpl extends ArchivePropertyImpl implements ArchiveAMB {
	/**
	 * The cached value of the '{@link #getGetAssemblyColumn() <em>Get Assembly Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetAssemblyColumn()
	 * @generated
	 * @ordered
	 */
	protected Table getAssemblyColumn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchiveAMBImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmbPackage.Literals.ARCHIVE_AMB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getGetAssemblyColumn() {
		if (getAssemblyColumn != null && getAssemblyColumn.eIsProxy()) {
			InternalEObject oldGetAssemblyColumn = (InternalEObject)getAssemblyColumn;
			getAssemblyColumn = (Table)eResolveProxy(oldGetAssemblyColumn);
			if (getAssemblyColumn != oldGetAssemblyColumn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.ARCHIVE_AMB__GET_ASSEMBLY_COLUMN, oldGetAssemblyColumn, getAssemblyColumn));
			}
		}
		return getAssemblyColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetGetAssemblyColumn() {
		return getAssemblyColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetAssemblyColumn(Table newGetAssemblyColumn) {
		Table oldGetAssemblyColumn = getAssemblyColumn;
		getAssemblyColumn = newGetAssemblyColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.ARCHIVE_AMB__GET_ASSEMBLY_COLUMN, oldGetAssemblyColumn, getAssemblyColumn));
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
			case AmbPackage.ARCHIVE_AMB__GET_ASSEMBLY_COLUMN:
				if (resolve) return getGetAssemblyColumn();
				return basicGetGetAssemblyColumn();
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
			case AmbPackage.ARCHIVE_AMB__GET_ASSEMBLY_COLUMN:
				setGetAssemblyColumn((Table)newValue);
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
			case AmbPackage.ARCHIVE_AMB__GET_ASSEMBLY_COLUMN:
				setGetAssemblyColumn((Table)null);
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
			case AmbPackage.ARCHIVE_AMB__GET_ASSEMBLY_COLUMN:
				return getAssemblyColumn != null;
		}
		return super.eIsSet(featureID);
	}

} //ArchiveAMBImpl
