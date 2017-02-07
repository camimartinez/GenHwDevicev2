/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package datamodel.amb.impl;

import datamodel.amb.AmbPackage;
import datamodel.amb.GenericMonitorPoints;

import datamodel.base.SpreadsheetParser;
import datamodel.base.SpreadsheetValidator;
import datamodel.base.Util;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Monitor Points</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link datamodel.amb.impl.GenericMonitorPointsImpl#getNewSpreadsheet <em>New Spreadsheet</em>}</li>
 *   <li>{@link datamodel.amb.impl.GenericMonitorPointsImpl#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link datamodel.amb.impl.GenericMonitorPointsImpl#getDirLocation <em>Dir Location</em>}</li>
 *   <li>{@link datamodel.amb.impl.GenericMonitorPointsImpl#getGetTheSpreadsheet <em>Get The Spreadsheet</em>}</li>
 *   <li>{@link datamodel.amb.impl.GenericMonitorPointsImpl#getToValidateTheSpreadsheet <em>To Validate The Spreadsheet</em>}</li>
 *   <li>{@link datamodel.amb.impl.GenericMonitorPointsImpl#getToInstallDir <em>To Install Dir</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenericMonitorPointsImpl extends EObjectImpl implements GenericMonitorPoints {
	/**
	 * The default value of the '{@link #getNewSpreadsheet() <em>New Spreadsheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewSpreadsheet()
	 * @generated
	 * @ordered
	 */
	protected static final String[][][] NEW_SPREADSHEET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewSpreadsheet() <em>New Spreadsheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewSpreadsheet()
	 * @generated
	 * @ordered
	 */
	protected String[][][] newSpreadsheet = NEW_SPREADSHEET_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeviceName() <em>Device Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceName()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeviceName() <em>Device Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceName()
	 * @generated
	 * @ordered
	 */
	protected String deviceName = DEVICE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirLocation() <em>Dir Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String DIR_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirLocation() <em>Dir Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirLocation()
	 * @generated
	 * @ordered
	 */
	protected String dirLocation = DIR_LOCATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGetTheSpreadsheet() <em>Get The Spreadsheet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetTheSpreadsheet()
	 * @generated
	 * @ordered
	 */
	protected SpreadsheetParser getTheSpreadsheet;

	/**
	 * The cached value of the '{@link #getToValidateTheSpreadsheet() <em>To Validate The Spreadsheet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToValidateTheSpreadsheet()
	 * @generated
	 * @ordered
	 */
	protected SpreadsheetValidator toValidateTheSpreadsheet;

	/**
	 * The cached value of the '{@link #getToInstallDir() <em>To Install Dir</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToInstallDir()
	 * @generated
	 * @ordered
	 */
	protected Util toInstallDir;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericMonitorPointsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmbPackage.Literals.GENERIC_MONITOR_POINTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String[][][] getNewSpreadsheet() {
		return newSpreadsheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewSpreadsheet(String[][][] newNewSpreadsheet) {
		String[][][] oldNewSpreadsheet = newSpreadsheet;
		newSpreadsheet = newNewSpreadsheet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.GENERIC_MONITOR_POINTS__NEW_SPREADSHEET, oldNewSpreadsheet, newSpreadsheet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeviceName() {
		return deviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceName(String newDeviceName) {
		String oldDeviceName = deviceName;
		deviceName = newDeviceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.GENERIC_MONITOR_POINTS__DEVICE_NAME, oldDeviceName, deviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDirLocation() {
		return dirLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirLocation(String newDirLocation) {
		String oldDirLocation = dirLocation;
		dirLocation = newDirLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.GENERIC_MONITOR_POINTS__DIR_LOCATION, oldDirLocation, dirLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetParser getGetTheSpreadsheet() {
		if (getTheSpreadsheet != null && getTheSpreadsheet.eIsProxy()) {
			InternalEObject oldGetTheSpreadsheet = (InternalEObject)getTheSpreadsheet;
			getTheSpreadsheet = (SpreadsheetParser)eResolveProxy(oldGetTheSpreadsheet);
			if (getTheSpreadsheet != oldGetTheSpreadsheet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.GENERIC_MONITOR_POINTS__GET_THE_SPREADSHEET, oldGetTheSpreadsheet, getTheSpreadsheet));
			}
		}
		return getTheSpreadsheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetParser basicGetGetTheSpreadsheet() {
		return getTheSpreadsheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetTheSpreadsheet(SpreadsheetParser newGetTheSpreadsheet) {
		SpreadsheetParser oldGetTheSpreadsheet = getTheSpreadsheet;
		getTheSpreadsheet = newGetTheSpreadsheet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.GENERIC_MONITOR_POINTS__GET_THE_SPREADSHEET, oldGetTheSpreadsheet, getTheSpreadsheet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetValidator getToValidateTheSpreadsheet() {
		if (toValidateTheSpreadsheet != null && toValidateTheSpreadsheet.eIsProxy()) {
			InternalEObject oldToValidateTheSpreadsheet = (InternalEObject)toValidateTheSpreadsheet;
			toValidateTheSpreadsheet = (SpreadsheetValidator)eResolveProxy(oldToValidateTheSpreadsheet);
			if (toValidateTheSpreadsheet != oldToValidateTheSpreadsheet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.GENERIC_MONITOR_POINTS__TO_VALIDATE_THE_SPREADSHEET, oldToValidateTheSpreadsheet, toValidateTheSpreadsheet));
			}
		}
		return toValidateTheSpreadsheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetValidator basicGetToValidateTheSpreadsheet() {
		return toValidateTheSpreadsheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToValidateTheSpreadsheet(SpreadsheetValidator newToValidateTheSpreadsheet) {
		SpreadsheetValidator oldToValidateTheSpreadsheet = toValidateTheSpreadsheet;
		toValidateTheSpreadsheet = newToValidateTheSpreadsheet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.GENERIC_MONITOR_POINTS__TO_VALIDATE_THE_SPREADSHEET, oldToValidateTheSpreadsheet, toValidateTheSpreadsheet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Util getToInstallDir() {
		if (toInstallDir != null && toInstallDir.eIsProxy()) {
			InternalEObject oldToInstallDir = (InternalEObject)toInstallDir;
			toInstallDir = (Util)eResolveProxy(oldToInstallDir);
			if (toInstallDir != oldToInstallDir) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.GENERIC_MONITOR_POINTS__TO_INSTALL_DIR, oldToInstallDir, toInstallDir));
			}
		}
		return toInstallDir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Util basicGetToInstallDir() {
		return toInstallDir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToInstallDir(Util newToInstallDir) {
		Util oldToInstallDir = toInstallDir;
		toInstallDir = newToInstallDir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.GENERIC_MONITOR_POINTS__TO_INSTALL_DIR, oldToInstallDir, toInstallDir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String[][][] getParsedGenericSpreadsheet() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String[][][] getDeviceWorksheetWithGenericPointsAdded(String[][][] spreadsheet) {
		 // Create the SP class
		        setDeviceName(spreadsheet[0][2][0]);
		        String [][][] genericSpreadsheet = getParsedGenericSpreadsheet();
		        // Now we iterate through spreadsheet adding monitor, control and archive generic points.
		        
		        // I coded this way to make the things clear
		        int[] Rows = null;
		        int[] Columns = null;
		        int[] GenericRows = null;
		        
		        Rows = new int[4];
		        Columns = new int[4];
		        GenericRows = new int[4];
		        
		        String deviceName=spreadsheet[0][2][0];
		        
		        int mainRows = spreadsheet[0].length;
		        int monitorRows = spreadsheet[1].length;
		        int controlRows = spreadsheet[2].length;
		        int archiveRows = spreadsheet[3].length;
		        
		        int mainColumns = spreadsheet[0][1].length;
		        int monitorColumns = spreadsheet[1][1].length;
		        int controlColumns = spreadsheet[2][1].length;
		        int archiveColumns = spreadsheet[3][1].length;
		        
		        int genericMonitorRows = genericSpreadsheet[1].length;
		        int genericControlRows = genericSpreadsheet[2].length;
		        int genericArchiveRows = genericSpreadsheet[3].length;
		        
		        // Well, first the newSpreadsheet is created. Arrays are static structures....
		        newSpreadsheet = new String[4][][];
		        newSpreadsheet[0] = new String[mainRows][mainColumns];
		        newSpreadsheet[1] = new String[monitorRows+genericMonitorRows-2][monitorColumns];
		        newSpreadsheet[2] = new String[controlRows+genericControlRows-2][controlColumns];
		        newSpreadsheet[3] = new String[archiveRows+genericArchiveRows-2][archiveColumns];
		        
			// Hardware Device
		        newSpreadsheet[0][0] = new String[1];
		        newSpreadsheet[0][0][0] = spreadsheet[0][0][0];
			// Monitor Point
		        newSpreadsheet[1][0] = new String[1];
		        newSpreadsheet[1][0][0] = spreadsheet[1][0][0];
			// Control Point
		        newSpreadsheet[2][0] = new String[1];
		        newSpreadsheet[2][0][0] = spreadsheet[2][0][0];
			// Archive Property
		        newSpreadsheet[3][0] = new String[1];
		        newSpreadsheet[3][0][0] = spreadsheet[3][0][0];
		        
		        Rows[0] = mainRows; // Yes here I ignore Notes on Main spreadsheet
		        Rows[1] = monitorRows;
		        Rows[2] = controlRows;
		        Rows[3] = archiveRows;
		        
		        Columns[0] = mainColumns;
		        Columns[1] = monitorColumns;
		        Columns[2] = controlColumns;
		        Columns[3] = archiveColumns;
		        
		        // Then I copy elements from spreadsheet to newSpreadsheet
		        for (int i = 0; i < Rows.length; i++ ) {
		            for (int j = 1; j < Rows[i]; j++) {
		                for (int k = 0; k < Columns[i]; k++) {
		                    if (spreadsheet[i][j][k].equals("Notes")){
		                        newSpreadsheet[i][j] = new String[2];
		                        newSpreadsheet[i][j][k] = spreadsheet[i][j][k];
		                        newSpreadsheet[i][j][k+1] = spreadsheet[i][j][k+1];
		                        break; 
		                    }
		                    newSpreadsheet[i][j][k] = spreadsheet[i][j][k];
		                }
		
		            }
		        }        
		        
		        // Here we start the copy process from generic spreadsheet
		        GenericRows[0] = 0;
		        GenericRows[1] = genericMonitorRows;
		        GenericRows[2] = genericControlRows;
		        GenericRows[3] = genericArchiveRows;
		
		        for (int i = 1; i < Rows.length ; i++ ) {
		            for (int j = Rows[i];j < (Rows[i] + GenericRows[i] - 2); j++) {
		                for (int k = 0; k < Columns[i]; k++) {
		                    if ( (genericSpreadsheet[i][j-Rows[i]+2][k]).equals("GENERIC")){
		                        newSpreadsheet[i][j][k] = deviceName;
		                    } else {
		                        newSpreadsheet[i][j][k] = genericSpreadsheet[i][j-Rows[i]+2][k];
		                    }
		                }
		            }
		        }
		        return newSpreadsheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmbPackage.GENERIC_MONITOR_POINTS__NEW_SPREADSHEET:
				return getNewSpreadsheet();
			case AmbPackage.GENERIC_MONITOR_POINTS__DEVICE_NAME:
				return getDeviceName();
			case AmbPackage.GENERIC_MONITOR_POINTS__DIR_LOCATION:
				return getDirLocation();
			case AmbPackage.GENERIC_MONITOR_POINTS__GET_THE_SPREADSHEET:
				if (resolve) return getGetTheSpreadsheet();
				return basicGetGetTheSpreadsheet();
			case AmbPackage.GENERIC_MONITOR_POINTS__TO_VALIDATE_THE_SPREADSHEET:
				if (resolve) return getToValidateTheSpreadsheet();
				return basicGetToValidateTheSpreadsheet();
			case AmbPackage.GENERIC_MONITOR_POINTS__TO_INSTALL_DIR:
				if (resolve) return getToInstallDir();
				return basicGetToInstallDir();
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
			case AmbPackage.GENERIC_MONITOR_POINTS__NEW_SPREADSHEET:
				setNewSpreadsheet((String[][][])newValue);
				return;
			case AmbPackage.GENERIC_MONITOR_POINTS__DEVICE_NAME:
				setDeviceName((String)newValue);
				return;
			case AmbPackage.GENERIC_MONITOR_POINTS__DIR_LOCATION:
				setDirLocation((String)newValue);
				return;
			case AmbPackage.GENERIC_MONITOR_POINTS__GET_THE_SPREADSHEET:
				setGetTheSpreadsheet((SpreadsheetParser)newValue);
				return;
			case AmbPackage.GENERIC_MONITOR_POINTS__TO_VALIDATE_THE_SPREADSHEET:
				setToValidateTheSpreadsheet((SpreadsheetValidator)newValue);
				return;
			case AmbPackage.GENERIC_MONITOR_POINTS__TO_INSTALL_DIR:
				setToInstallDir((Util)newValue);
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
			case AmbPackage.GENERIC_MONITOR_POINTS__NEW_SPREADSHEET:
				setNewSpreadsheet(NEW_SPREADSHEET_EDEFAULT);
				return;
			case AmbPackage.GENERIC_MONITOR_POINTS__DEVICE_NAME:
				setDeviceName(DEVICE_NAME_EDEFAULT);
				return;
			case AmbPackage.GENERIC_MONITOR_POINTS__DIR_LOCATION:
				setDirLocation(DIR_LOCATION_EDEFAULT);
				return;
			case AmbPackage.GENERIC_MONITOR_POINTS__GET_THE_SPREADSHEET:
				setGetTheSpreadsheet((SpreadsheetParser)null);
				return;
			case AmbPackage.GENERIC_MONITOR_POINTS__TO_VALIDATE_THE_SPREADSHEET:
				setToValidateTheSpreadsheet((SpreadsheetValidator)null);
				return;
			case AmbPackage.GENERIC_MONITOR_POINTS__TO_INSTALL_DIR:
				setToInstallDir((Util)null);
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
			case AmbPackage.GENERIC_MONITOR_POINTS__NEW_SPREADSHEET:
				return NEW_SPREADSHEET_EDEFAULT == null ? newSpreadsheet != null : !NEW_SPREADSHEET_EDEFAULT.equals(newSpreadsheet);
			case AmbPackage.GENERIC_MONITOR_POINTS__DEVICE_NAME:
				return DEVICE_NAME_EDEFAULT == null ? deviceName != null : !DEVICE_NAME_EDEFAULT.equals(deviceName);
			case AmbPackage.GENERIC_MONITOR_POINTS__DIR_LOCATION:
				return DIR_LOCATION_EDEFAULT == null ? dirLocation != null : !DIR_LOCATION_EDEFAULT.equals(dirLocation);
			case AmbPackage.GENERIC_MONITOR_POINTS__GET_THE_SPREADSHEET:
				return getTheSpreadsheet != null;
			case AmbPackage.GENERIC_MONITOR_POINTS__TO_VALIDATE_THE_SPREADSHEET:
				return toValidateTheSpreadsheet != null;
			case AmbPackage.GENERIC_MONITOR_POINTS__TO_INSTALL_DIR:
				return toInstallDir != null;
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
		result.append(" (newSpreadsheet: ");
		result.append(newSpreadsheet);
		result.append(", deviceName: ");
		result.append(deviceName);
		result.append(", dirLocation: ");
		result.append(dirLocation);
		result.append(')');
		return result.toString();
	}

} //GenericMonitorPointsImpl
