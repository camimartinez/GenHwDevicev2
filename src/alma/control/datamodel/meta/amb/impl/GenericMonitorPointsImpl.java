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

import alma.control.datamodel.meta.amb.AmbFactory;
import alma.control.datamodel.meta.amb.AmbPackage;
import alma.control.datamodel.meta.amb.GenericMonitorPoints;

import alma.control.datamodel.meta.base.BaseFactory;
import alma.control.datamodel.meta.base.SpreadsheetParser;
import alma.control.datamodel.meta.base.SpreadsheetValidator;
import alma.control.datamodel.meta.base.Util;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

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
 * </p>
 * <ul>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.GenericMonitorPointsImpl#getNewSpreadsheet <em>New Spreadsheet</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.GenericMonitorPointsImpl#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.GenericMonitorPointsImpl#getDirLocation <em>Dir Location</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.GenericMonitorPointsImpl#getBase <em>Base</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.GenericMonitorPointsImpl#getParserSpreadsheet <em>Parser Spreadsheet</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.GenericMonitorPointsImpl#getUtil <em>Util</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.GenericMonitorPointsImpl#getValidateSpreadsheet <em>Validate Spreadsheet</em>}</li>
 * </ul>
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
	 * The default value of the '{@link #getBase() <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected static final BaseFactory BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected BaseFactory base = BASE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParserSpreadsheet() <em>Parser Spreadsheet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParserSpreadsheet()
	 * @generated
	 * @ordered
	 */
	protected SpreadsheetParser parserSpreadsheet;

	/**
	 * The cached value of the '{@link #getUtil() <em>Util</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtil()
	 * @generated
	 * @ordered
	 */
	protected Util util;

	/**
	 * The cached value of the '{@link #getValidateSpreadsheet() <em>Validate Spreadsheet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidateSpreadsheet()
	 * @generated
	 * @ordered
	 */
	protected SpreadsheetValidator validateSpreadsheet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericMonitorPointsImpl() {
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
	public BaseFactory getBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase(BaseFactory newBase) {
		BaseFactory oldBase = base;
		base = newBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.GENERIC_MONITOR_POINTS__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetParser getParserSpreadsheet() {
		return parserSpreadsheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParserSpreadsheet(SpreadsheetParser newParserSpreadsheet, NotificationChain msgs) {
		SpreadsheetParser oldParserSpreadsheet = parserSpreadsheet;
		parserSpreadsheet = newParserSpreadsheet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmbPackage.GENERIC_MONITOR_POINTS__PARSER_SPREADSHEET, oldParserSpreadsheet, newParserSpreadsheet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParserSpreadsheet(SpreadsheetParser newParserSpreadsheet) {
		if (newParserSpreadsheet != parserSpreadsheet) {
			NotificationChain msgs = null;
			if (parserSpreadsheet != null)
				msgs = ((InternalEObject)parserSpreadsheet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmbPackage.GENERIC_MONITOR_POINTS__PARSER_SPREADSHEET, null, msgs);
			if (newParserSpreadsheet != null)
				msgs = ((InternalEObject)newParserSpreadsheet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmbPackage.GENERIC_MONITOR_POINTS__PARSER_SPREADSHEET, null, msgs);
			msgs = basicSetParserSpreadsheet(newParserSpreadsheet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.GENERIC_MONITOR_POINTS__PARSER_SPREADSHEET, newParserSpreadsheet, newParserSpreadsheet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Util getUtil() {
		if (util != null && util.eIsProxy()) {
			InternalEObject oldUtil = (InternalEObject)util;
			util = (Util)eResolveProxy(oldUtil);
			if (util != oldUtil) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.GENERIC_MONITOR_POINTS__UTIL, oldUtil, util));
			}
		}
		return util;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Util basicGetUtil() {
		return util;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtil(Util newUtil) {
		Util oldUtil = util;
		util = newUtil;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.GENERIC_MONITOR_POINTS__UTIL, oldUtil, util));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadsheetValidator getValidateSpreadsheet() {
		return validateSpreadsheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidateSpreadsheet(SpreadsheetValidator newValidateSpreadsheet, NotificationChain msgs) {
		SpreadsheetValidator oldValidateSpreadsheet = validateSpreadsheet;
		validateSpreadsheet = newValidateSpreadsheet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmbPackage.GENERIC_MONITOR_POINTS__VALIDATE_SPREADSHEET, oldValidateSpreadsheet, newValidateSpreadsheet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidateSpreadsheet(SpreadsheetValidator newValidateSpreadsheet) {
		if (newValidateSpreadsheet != validateSpreadsheet) {
			NotificationChain msgs = null;
			if (validateSpreadsheet != null)
				msgs = ((InternalEObject)validateSpreadsheet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmbPackage.GENERIC_MONITOR_POINTS__VALIDATE_SPREADSHEET, null, msgs);
			if (newValidateSpreadsheet != null)
				msgs = ((InternalEObject)newValidateSpreadsheet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmbPackage.GENERIC_MONITOR_POINTS__VALIDATE_SPREADSHEET, null, msgs);
			msgs = basicSetValidateSpreadsheet(newValidateSpreadsheet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.GENERIC_MONITOR_POINTS__VALIDATE_SPREADSHEET, newValidateSpreadsheet, newValidateSpreadsheet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String[][][] getParsedGenericSpreadsheet() {
				dirLocation = util.getInstallDir();
				if (!(new java.io.File(dirLocation + "/idl/GENERIC_spreadsheet.xml").exists())){
					System.out.println("Spreadsheet GENERIC_spreadsheet not found. Exiting....");
					System.exit(1);
				}
		
				String xml = parserSpreadsheet.getSpreadsheet(dirLocation + "/idl", "GENERIC_spreadsheet.xml");
				String xmlFile = dirLocation + "/idl/GENERIC_spreadsheet.xml";
				String xsdFile = dirLocation + "/config/schemas/amb/Workbook.xsd";
				BaseFactory baseFac = BaseFactory.eINSTANCE;
				SpreadsheetParser p = baseFac.createSpreadsheetParser(xml);
				String [][][] spreadsheet = p.getWorksheets();
				SpreadsheetValidator v = baseFac.createSpreadsheetValidator();
				if (!v.validate(xmlFile,xsdFile)) {
					String s = "Spreadsheet GENERIC_spreadsheet.xml is not a valid spreadsheet.";
					throw new RuntimeException(s);
				}
		
				System.out.println("Spreadsheet GENERIC has been validated.");
		
				return spreadsheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String[][][] getDeviceWorksheetWithGenericPointsAdded(final String[][][] spreadsheet) {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmbPackage.GENERIC_MONITOR_POINTS__PARSER_SPREADSHEET:
				return basicSetParserSpreadsheet(null, msgs);
			case AmbPackage.GENERIC_MONITOR_POINTS__VALIDATE_SPREADSHEET:
				return basicSetValidateSpreadsheet(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case AmbPackage.GENERIC_MONITOR_POINTS__BASE:
				return getBase();
			case AmbPackage.GENERIC_MONITOR_POINTS__PARSER_SPREADSHEET:
				return getParserSpreadsheet();
			case AmbPackage.GENERIC_MONITOR_POINTS__UTIL:
				if (resolve) return getUtil();
				return basicGetUtil();
			case AmbPackage.GENERIC_MONITOR_POINTS__VALIDATE_SPREADSHEET:
				return getValidateSpreadsheet();
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
			case AmbPackage.GENERIC_MONITOR_POINTS__BASE:
				setBase((BaseFactory)newValue);
				return;
			case AmbPackage.GENERIC_MONITOR_POINTS__PARSER_SPREADSHEET:
				setParserSpreadsheet((SpreadsheetParser)newValue);
				return;
			case AmbPackage.GENERIC_MONITOR_POINTS__UTIL:
				setUtil((Util)newValue);
				return;
			case AmbPackage.GENERIC_MONITOR_POINTS__VALIDATE_SPREADSHEET:
				setValidateSpreadsheet((SpreadsheetValidator)newValue);
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
			case AmbPackage.GENERIC_MONITOR_POINTS__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case AmbPackage.GENERIC_MONITOR_POINTS__PARSER_SPREADSHEET:
				setParserSpreadsheet((SpreadsheetParser)null);
				return;
			case AmbPackage.GENERIC_MONITOR_POINTS__UTIL:
				setUtil((Util)null);
				return;
			case AmbPackage.GENERIC_MONITOR_POINTS__VALIDATE_SPREADSHEET:
				setValidateSpreadsheet((SpreadsheetValidator)null);
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
			case AmbPackage.GENERIC_MONITOR_POINTS__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case AmbPackage.GENERIC_MONITOR_POINTS__PARSER_SPREADSHEET:
				return parserSpreadsheet != null;
			case AmbPackage.GENERIC_MONITOR_POINTS__UTIL:
				return util != null;
			case AmbPackage.GENERIC_MONITOR_POINTS__VALIDATE_SPREADSHEET:
				return validateSpreadsheet != null;
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
		result.append(", base: ");
		result.append(base);
		result.append(')');
		return result.toString();
	}

} //GenericMonitorPointsImpl
