/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package datamodel.amb;

import datamodel.base.ControlPoint;
import datamodel.base.MainBase;
import datamodel.base.MonitorPoint;
import datamodel.base.Note;
import datamodel.base.SpreadsheetParser;
import datamodel.base.SpreadsheetValidator;
import datamodel.base.Table;
import datamodel.base.Util;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datamodel.amb.DeviceModel#getToAddCP <em>To Add CP</em>}</li>
 *   <li>{@link datamodel.amb.DeviceModel#getGetNoteFromMain <em>Get Note From Main</em>}</li>
 *   <li>{@link datamodel.amb.DeviceModel#getToAddMP <em>To Add MP</em>}</li>
 *   <li>{@link datamodel.amb.DeviceModel#getGetInfoMain <em>Get Info Main</em>}</li>
 *   <li>{@link datamodel.amb.DeviceModel#getGetCPfromControl <em>Get CPfrom Control</em>}</li>
 *   <li>{@link datamodel.amb.DeviceModel#getGetInfoFromMainSheet <em>Get Info From Main Sheet</em>}</li>
 *   <li>{@link datamodel.amb.DeviceModel#getGetMPfromMonitor <em>Get MPfrom Monitor</em>}</li>
 *   <li>{@link datamodel.amb.DeviceModel#getGetDataFromSpread <em>Get Data From Spread</em>}</li>
 *   <li>{@link datamodel.amb.DeviceModel#getGetAPfromArchive <em>Get APfrom Archive</em>}</li>
 *   <li>{@link datamodel.amb.DeviceModel#getToinstallEndGeneration <em>Toinstall End Generation</em>}</li>
 *   <li>{@link datamodel.amb.DeviceModel#getGetFromSpreadsheet <em>Get From Spreadsheet</em>}</li>
 *   <li>{@link datamodel.amb.DeviceModel#getToValidateSpreadsheet <em>To Validate Spreadsheet</em>}</li>
 *   <li>{@link datamodel.amb.DeviceModel#getGetGenericMP <em>Get Generic MP</em>}</li>
 * </ul>
 * </p>
 *
 * @see datamodel.amb.AmbPackage#getDeviceModel()
 * @model
 * @generated
 */
public interface DeviceModel extends datamodel.base.DeviceModel {
	/**
	 * Returns the value of the '<em><b>To Add CP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Add CP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Add CP</em>' reference.
	 * @see #setToAddCP(ControlPoint)
	 * @see datamodel.amb.AmbPackage#getDeviceModel_ToAddCP()
	 * @model
	 * @generated
	 */
	ControlPoint getToAddCP();

	/**
	 * Sets the value of the '{@link datamodel.amb.DeviceModel#getToAddCP <em>To Add CP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Add CP</em>' reference.
	 * @see #getToAddCP()
	 * @generated
	 */
	void setToAddCP(ControlPoint value);

	/**
	 * Returns the value of the '<em><b>Get Note From Main</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Note From Main</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Note From Main</em>' reference.
	 * @see #setGetNoteFromMain(Note)
	 * @see datamodel.amb.AmbPackage#getDeviceModel_GetNoteFromMain()
	 * @model
	 * @generated
	 */
	Note getGetNoteFromMain();

	/**
	 * Sets the value of the '{@link datamodel.amb.DeviceModel#getGetNoteFromMain <em>Get Note From Main</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Note From Main</em>' reference.
	 * @see #getGetNoteFromMain()
	 * @generated
	 */
	void setGetNoteFromMain(Note value);

	/**
	 * Returns the value of the '<em><b>To Add MP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Add MP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Add MP</em>' reference.
	 * @see #setToAddMP(MonitorPoint)
	 * @see datamodel.amb.AmbPackage#getDeviceModel_ToAddMP()
	 * @model
	 * @generated
	 */
	MonitorPoint getToAddMP();

	/**
	 * Sets the value of the '{@link datamodel.amb.DeviceModel#getToAddMP <em>To Add MP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Add MP</em>' reference.
	 * @see #getToAddMP()
	 * @generated
	 */
	void setToAddMP(MonitorPoint value);

	/**
	 * Returns the value of the '<em><b>Get Info Main</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Info Main</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Info Main</em>' reference.
	 * @see #setGetInfoMain(MainBase)
	 * @see datamodel.amb.AmbPackage#getDeviceModel_GetInfoMain()
	 * @model
	 * @generated
	 */
	MainBase getGetInfoMain();

	/**
	 * Sets the value of the '{@link datamodel.amb.DeviceModel#getGetInfoMain <em>Get Info Main</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Info Main</em>' reference.
	 * @see #getGetInfoMain()
	 * @generated
	 */
	void setGetInfoMain(MainBase value);

	/**
	 * Returns the value of the '<em><b>Get CPfrom Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get CPfrom Control</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get CPfrom Control</em>' reference.
	 * @see #setGetCPfromControl(ControlImpl)
	 * @see datamodel.amb.AmbPackage#getDeviceModel_GetCPfromControl()
	 * @model
	 * @generated
	 */
	ControlImpl getGetCPfromControl();

	/**
	 * Sets the value of the '{@link datamodel.amb.DeviceModel#getGetCPfromControl <em>Get CPfrom Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get CPfrom Control</em>' reference.
	 * @see #getGetCPfromControl()
	 * @generated
	 */
	void setGetCPfromControl(ControlImpl value);

	/**
	 * Returns the value of the '<em><b>Get Info From Main Sheet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Info From Main Sheet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Info From Main Sheet</em>' reference.
	 * @see #setGetInfoFromMainSheet(MainImpl)
	 * @see datamodel.amb.AmbPackage#getDeviceModel_GetInfoFromMainSheet()
	 * @model
	 * @generated
	 */
	MainImpl getGetInfoFromMainSheet();

	/**
	 * Sets the value of the '{@link datamodel.amb.DeviceModel#getGetInfoFromMainSheet <em>Get Info From Main Sheet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Info From Main Sheet</em>' reference.
	 * @see #getGetInfoFromMainSheet()
	 * @generated
	 */
	void setGetInfoFromMainSheet(MainImpl value);

	/**
	 * Returns the value of the '<em><b>Get MPfrom Monitor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get MPfrom Monitor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get MPfrom Monitor</em>' reference.
	 * @see #setGetMPfromMonitor(MonitorImpl)
	 * @see datamodel.amb.AmbPackage#getDeviceModel_GetMPfromMonitor()
	 * @model
	 * @generated
	 */
	MonitorImpl getGetMPfromMonitor();

	/**
	 * Sets the value of the '{@link datamodel.amb.DeviceModel#getGetMPfromMonitor <em>Get MPfrom Monitor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get MPfrom Monitor</em>' reference.
	 * @see #getGetMPfromMonitor()
	 * @generated
	 */
	void setGetMPfromMonitor(MonitorImpl value);

	/**
	 * Returns the value of the '<em><b>Get Data From Spread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Data From Spread</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Data From Spread</em>' reference.
	 * @see #setGetDataFromSpread(Table)
	 * @see datamodel.amb.AmbPackage#getDeviceModel_GetDataFromSpread()
	 * @model
	 * @generated
	 */
	Table getGetDataFromSpread();

	/**
	 * Sets the value of the '{@link datamodel.amb.DeviceModel#getGetDataFromSpread <em>Get Data From Spread</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Data From Spread</em>' reference.
	 * @see #getGetDataFromSpread()
	 * @generated
	 */
	void setGetDataFromSpread(Table value);

	/**
	 * Returns the value of the '<em><b>Get APfrom Archive</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get APfrom Archive</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get APfrom Archive</em>' reference.
	 * @see #setGetAPfromArchive(ArchiveImpl)
	 * @see datamodel.amb.AmbPackage#getDeviceModel_GetAPfromArchive()
	 * @model
	 * @generated
	 */
	ArchiveImpl getGetAPfromArchive();

	/**
	 * Sets the value of the '{@link datamodel.amb.DeviceModel#getGetAPfromArchive <em>Get APfrom Archive</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get APfrom Archive</em>' reference.
	 * @see #getGetAPfromArchive()
	 * @generated
	 */
	void setGetAPfromArchive(ArchiveImpl value);

	/**
	 * Returns the value of the '<em><b>Toinstall End Generation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Toinstall End Generation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toinstall End Generation</em>' reference.
	 * @see #setToinstallEndGeneration(Util)
	 * @see datamodel.amb.AmbPackage#getDeviceModel_ToinstallEndGeneration()
	 * @model
	 * @generated
	 */
	Util getToinstallEndGeneration();

	/**
	 * Sets the value of the '{@link datamodel.amb.DeviceModel#getToinstallEndGeneration <em>Toinstall End Generation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Toinstall End Generation</em>' reference.
	 * @see #getToinstallEndGeneration()
	 * @generated
	 */
	void setToinstallEndGeneration(Util value);

	/**
	 * Returns the value of the '<em><b>Get From Spreadsheet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get From Spreadsheet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get From Spreadsheet</em>' reference.
	 * @see #setGetFromSpreadsheet(SpreadsheetParser)
	 * @see datamodel.amb.AmbPackage#getDeviceModel_GetFromSpreadsheet()
	 * @model
	 * @generated
	 */
	SpreadsheetParser getGetFromSpreadsheet();

	/**
	 * Sets the value of the '{@link datamodel.amb.DeviceModel#getGetFromSpreadsheet <em>Get From Spreadsheet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get From Spreadsheet</em>' reference.
	 * @see #getGetFromSpreadsheet()
	 * @generated
	 */
	void setGetFromSpreadsheet(SpreadsheetParser value);

	/**
	 * Returns the value of the '<em><b>To Validate Spreadsheet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Validate Spreadsheet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Validate Spreadsheet</em>' reference.
	 * @see #setToValidateSpreadsheet(SpreadsheetValidator)
	 * @see datamodel.amb.AmbPackage#getDeviceModel_ToValidateSpreadsheet()
	 * @model
	 * @generated
	 */
	SpreadsheetValidator getToValidateSpreadsheet();

	/**
	 * Sets the value of the '{@link datamodel.amb.DeviceModel#getToValidateSpreadsheet <em>To Validate Spreadsheet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Validate Spreadsheet</em>' reference.
	 * @see #getToValidateSpreadsheet()
	 * @generated
	 */
	void setToValidateSpreadsheet(SpreadsheetValidator value);

	/**
	 * Returns the value of the '<em><b>Get Generic MP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Generic MP</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Generic MP</em>' reference.
	 * @see #setGetGenericMP(GenericMonitorPoints)
	 * @see datamodel.amb.AmbPackage#getDeviceModel_GetGenericMP()
	 * @model
	 * @generated
	 */
	GenericMonitorPoints getGetGenericMP();

	/**
	 * Sets the value of the '{@link datamodel.amb.DeviceModel#getGetGenericMP <em>Get Generic MP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Generic MP</em>' reference.
	 * @see #getGetGenericMP()
	 * @generated
	 */
	void setGetGenericMP(GenericMonitorPoints value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isMonitorDBOnly();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean IsGeneratedAlt();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String Parent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String Cardinality();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String NodeAddress();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String Channel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String BaseAddress();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean GenericMonitorPoints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String CreateModel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String TheEnd();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String NodeAddressInDecimal();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String HexToDec(String s);

} // DeviceModel
