/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package meta.base;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link meta.base.DeviceModel#getDescriptionIndex <em>Description Index</em>}</li>
 *   <li>{@link meta.base.DeviceModel#getSpreadsheet <em>Spreadsheet</em>}</li>
 *   <li>{@link meta.base.DeviceModel#getMain <em>Main</em>}</li>
 *   <li>{@link meta.base.DeviceModel#getNotes <em>Notes</em>}</li>
 *   <li>{@link meta.base.DeviceModel#getMonitorPoints <em>Monitor Points</em>}</li>
 *   <li>{@link meta.base.DeviceModel#getControlPoints <em>Control Points</em>}</li>
 *   <li>{@link meta.base.DeviceModel#getArchiveProperties <em>Archive Properties</em>}</li>
 *   <li>{@link meta.base.DeviceModel#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link meta.base.DeviceModel#getBusType <em>Bus Type</em>}</li>
 *   <li>{@link meta.base.DeviceModel#getDeviceDir <em>Device Dir</em>}</li>
 *   <li>{@link meta.base.DeviceModel#getCodegenDir <em>Codegen Dir</em>}</li>
 *   <li>{@link meta.base.DeviceModel#getSpreadsheetDir <em>Spreadsheet Dir</em>}</li>
 *   <li>{@link meta.base.DeviceModel#getGeneratedDir <em>Generated Dir</em>}</li>
 *   <li>{@link meta.base.DeviceModel#isMonitorDBOnly <em>Monitor DB Only</em>}</li>
 *   <li>{@link meta.base.DeviceModel#isGenerateAlt <em>Generate Alt</em>}</li>
 *   <li>{@link meta.base.DeviceModel#getEReference1 <em>EReference1</em>}</li>
 *   <li>{@link meta.base.DeviceModel#getEReference3 <em>EReference3</em>}</li>
 *   <li>{@link meta.base.DeviceModel#getEReference4 <em>EReference4</em>}</li>
 *   <li>{@link meta.base.DeviceModel#getEReference5 <em>EReference5</em>}</li>
 *   <li>{@link meta.base.DeviceModel#getEReference6 <em>EReference6</em>}</li>
 *   <li>{@link meta.base.DeviceModel#getEReference0 <em>EReference0</em>}</li>
 * </ul>
 * </p>
 *
 * @see meta.base.BasePackage#getDeviceModel()
 * @model abstract="true"
 * @generated
 */
public interface DeviceModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Description Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Index</em>' attribute.
	 * @see #setDescriptionIndex(int)
	 * @see meta.base.BasePackage#getDeviceModel_DescriptionIndex()
	 * @model
	 * @generated
	 */
	int getDescriptionIndex();

	/**
	 * Sets the value of the '{@link meta.base.DeviceModel#getDescriptionIndex <em>Description Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Index</em>' attribute.
	 * @see #getDescriptionIndex()
	 * @generated
	 */
	void setDescriptionIndex(int value);

	/**
	 * Returns the value of the '<em><b>Spreadsheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spreadsheet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spreadsheet</em>' attribute.
	 * @see #setSpreadsheet(String)
	 * @see meta.base.BasePackage#getDeviceModel_Spreadsheet()
	 * @model
	 * @generated
	 */
	String getSpreadsheet();

	/**
	 * Sets the value of the '{@link meta.base.DeviceModel#getSpreadsheet <em>Spreadsheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spreadsheet</em>' attribute.
	 * @see #getSpreadsheet()
	 * @generated
	 */
	void setSpreadsheet(String value);

	/**
	 * Returns the value of the '<em><b>Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main</em>' attribute.
	 * @see #setMain(Object)
	 * @see meta.base.BasePackage#getDeviceModel_Main()
	 * @model dataType="meta.base.MainBaseDT" transient="true"
	 * @generated
	 */
	Object getMain();

	/**
	 * Sets the value of the '{@link meta.base.DeviceModel#getMain <em>Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main</em>' attribute.
	 * @see #getMain()
	 * @generated
	 */
	void setMain(Object value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' attribute.
	 * @see #setNotes(ResourceSet)
	 * @see meta.base.BasePackage#getDeviceModel_Notes()
	 * @model transient="true"
	 * @generated
	 */
	ResourceSet getNotes();

	/**
	 * Sets the value of the '{@link meta.base.DeviceModel#getNotes <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' attribute.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(ResourceSet value);

	/**
	 * Returns the value of the '<em><b>Monitor Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitor Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitor Points</em>' attribute.
	 * @see #setMonitorPoints(ResourceSet)
	 * @see meta.base.BasePackage#getDeviceModel_MonitorPoints()
	 * @model transient="true"
	 * @generated
	 */
	ResourceSet getMonitorPoints();

	/**
	 * Sets the value of the '{@link meta.base.DeviceModel#getMonitorPoints <em>Monitor Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitor Points</em>' attribute.
	 * @see #getMonitorPoints()
	 * @generated
	 */
	void setMonitorPoints(ResourceSet value);

	/**
	 * Returns the value of the '<em><b>Control Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Points</em>' attribute.
	 * @see #setControlPoints(ResourceSet)
	 * @see meta.base.BasePackage#getDeviceModel_ControlPoints()
	 * @model transient="true"
	 * @generated
	 */
	ResourceSet getControlPoints();

	/**
	 * Sets the value of the '{@link meta.base.DeviceModel#getControlPoints <em>Control Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Points</em>' attribute.
	 * @see #getControlPoints()
	 * @generated
	 */
	void setControlPoints(ResourceSet value);

	/**
	 * Returns the value of the '<em><b>Archive Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Archive Properties</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Archive Properties</em>' attribute.
	 * @see #setArchiveProperties(ResourceSet)
	 * @see meta.base.BasePackage#getDeviceModel_ArchiveProperties()
	 * @model transient="true"
	 * @generated
	 */
	ResourceSet getArchiveProperties();

	/**
	 * Sets the value of the '{@link meta.base.DeviceModel#getArchiveProperties <em>Archive Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Archive Properties</em>' attribute.
	 * @see #getArchiveProperties()
	 * @generated
	 */
	void setArchiveProperties(ResourceSet value);

	/**
	 * Returns the value of the '<em><b>Device Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Name</em>' attribute.
	 * @see #setDeviceName(String)
	 * @see meta.base.BasePackage#getDeviceModel_DeviceName()
	 * @model
	 * @generated
	 */
	String getDeviceName();

	/**
	 * Sets the value of the '{@link meta.base.DeviceModel#getDeviceName <em>Device Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Name</em>' attribute.
	 * @see #getDeviceName()
	 * @generated
	 */
	void setDeviceName(String value);

	/**
	 * Returns the value of the '<em><b>Bus Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Type</em>' attribute.
	 * @see #setBusType(String)
	 * @see meta.base.BasePackage#getDeviceModel_BusType()
	 * @model
	 * @generated
	 */
	String getBusType();

	/**
	 * Sets the value of the '{@link meta.base.DeviceModel#getBusType <em>Bus Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Type</em>' attribute.
	 * @see #getBusType()
	 * @generated
	 */
	void setBusType(String value);

	/**
	 * Returns the value of the '<em><b>Device Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Dir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Dir</em>' attribute.
	 * @see #setDeviceDir(String)
	 * @see meta.base.BasePackage#getDeviceModel_DeviceDir()
	 * @model
	 * @generated
	 */
	String getDeviceDir();

	/**
	 * Sets the value of the '{@link meta.base.DeviceModel#getDeviceDir <em>Device Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Dir</em>' attribute.
	 * @see #getDeviceDir()
	 * @generated
	 */
	void setDeviceDir(String value);

	/**
	 * Returns the value of the '<em><b>Codegen Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Codegen Dir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codegen Dir</em>' attribute.
	 * @see #setCodegenDir(String)
	 * @see meta.base.BasePackage#getDeviceModel_CodegenDir()
	 * @model
	 * @generated
	 */
	String getCodegenDir();

	/**
	 * Sets the value of the '{@link meta.base.DeviceModel#getCodegenDir <em>Codegen Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codegen Dir</em>' attribute.
	 * @see #getCodegenDir()
	 * @generated
	 */
	void setCodegenDir(String value);

	/**
	 * Returns the value of the '<em><b>Spreadsheet Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spreadsheet Dir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spreadsheet Dir</em>' attribute.
	 * @see #setSpreadsheetDir(String)
	 * @see meta.base.BasePackage#getDeviceModel_SpreadsheetDir()
	 * @model
	 * @generated
	 */
	String getSpreadsheetDir();

	/**
	 * Sets the value of the '{@link meta.base.DeviceModel#getSpreadsheetDir <em>Spreadsheet Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spreadsheet Dir</em>' attribute.
	 * @see #getSpreadsheetDir()
	 * @generated
	 */
	void setSpreadsheetDir(String value);

	/**
	 * Returns the value of the '<em><b>Generated Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generated Dir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Dir</em>' attribute.
	 * @see #setGeneratedDir(String)
	 * @see meta.base.BasePackage#getDeviceModel_GeneratedDir()
	 * @model
	 * @generated
	 */
	String getGeneratedDir();

	/**
	 * Sets the value of the '{@link meta.base.DeviceModel#getGeneratedDir <em>Generated Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generated Dir</em>' attribute.
	 * @see #getGeneratedDir()
	 * @generated
	 */
	void setGeneratedDir(String value);

	/**
	 * Returns the value of the '<em><b>Monitor DB Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitor DB Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitor DB Only</em>' attribute.
	 * @see #setMonitorDBOnly(boolean)
	 * @see meta.base.BasePackage#getDeviceModel_MonitorDBOnly()
	 * @model
	 * @generated
	 */
	boolean isMonitorDBOnly();

	/**
	 * Sets the value of the '{@link meta.base.DeviceModel#isMonitorDBOnly <em>Monitor DB Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitor DB Only</em>' attribute.
	 * @see #isMonitorDBOnly()
	 * @generated
	 */
	void setMonitorDBOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Generate Alt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generate Alt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate Alt</em>' attribute.
	 * @see #setGenerateAlt(boolean)
	 * @see meta.base.BasePackage#getDeviceModel_GenerateAlt()
	 * @model
	 * @generated
	 */
	boolean isGenerateAlt();

	/**
	 * Sets the value of the '{@link meta.base.DeviceModel#isGenerateAlt <em>Generate Alt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate Alt</em>' attribute.
	 * @see #isGenerateAlt()
	 * @generated
	 */
	void setGenerateAlt(boolean value);

	/**
	 * Returns the value of the '<em><b>EReference1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference1</em>' reference.
	 * @see #setEReference1(Table)
	 * @see meta.base.BasePackage#getDeviceModel_EReference1()
	 * @model
	 * @generated
	 */
	Table getEReference1();

	/**
	 * Sets the value of the '{@link meta.base.DeviceModel#getEReference1 <em>EReference1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference1</em>' reference.
	 * @see #getEReference1()
	 * @generated
	 */
	void setEReference1(Table value);

	/**
	 * Returns the value of the '<em><b>EReference3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference3</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference3</em>' reference.
	 * @see #setEReference3(ControlPoint)
	 * @see meta.base.BasePackage#getDeviceModel_EReference3()
	 * @model
	 * @generated
	 */
	ControlPoint getEReference3();

	/**
	 * Sets the value of the '{@link meta.base.DeviceModel#getEReference3 <em>EReference3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference3</em>' reference.
	 * @see #getEReference3()
	 * @generated
	 */
	void setEReference3(ControlPoint value);

	/**
	 * Returns the value of the '<em><b>EReference4</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference4</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference4</em>' reference.
	 * @see #setEReference4(MonitorPoint)
	 * @see meta.base.BasePackage#getDeviceModel_EReference4()
	 * @model
	 * @generated
	 */
	MonitorPoint getEReference4();

	/**
	 * Sets the value of the '{@link meta.base.DeviceModel#getEReference4 <em>EReference4</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference4</em>' reference.
	 * @see #getEReference4()
	 * @generated
	 */
	void setEReference4(MonitorPoint value);

	/**
	 * Returns the value of the '<em><b>EReference5</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference5</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference5</em>' reference.
	 * @see #setEReference5(Util)
	 * @see meta.base.BasePackage#getDeviceModel_EReference5()
	 * @model
	 * @generated
	 */
	Util getEReference5();

	/**
	 * Sets the value of the '{@link meta.base.DeviceModel#getEReference5 <em>EReference5</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference5</em>' reference.
	 * @see #getEReference5()
	 * @generated
	 */
	void setEReference5(Util value);

	/**
	 * Returns the value of the '<em><b>EReference6</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference6</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference6</em>' reference.
	 * @see #setEReference6(ArchiveProperty)
	 * @see meta.base.BasePackage#getDeviceModel_EReference6()
	 * @model
	 * @generated
	 */
	ArchiveProperty getEReference6();

	/**
	 * Sets the value of the '{@link meta.base.DeviceModel#getEReference6 <em>EReference6</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference6</em>' reference.
	 * @see #getEReference6()
	 * @generated
	 */
	void setEReference6(ArchiveProperty value);

	/**
	 * Returns the value of the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference0</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference0</em>' reference.
	 * @see #setEReference0(MainBase)
	 * @see meta.base.BasePackage#getDeviceModel_EReference0()
	 * @model
	 * @generated
	 */
	MainBase getEReference0();

	/**
	 * Sets the value of the '{@link meta.base.DeviceModel#getEReference0 <em>EReference0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference0</em>' reference.
	 * @see #getEReference0()
	 * @generated
	 */
	void setEReference0(MainBase value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String CheckConstraints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initializeModelDependencies();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String DirPath();

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
	boolean checkIfFileExists(String fileName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkIfFileExists(String directory, String fileName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkIfDeviceFileExists(String directory, String localFileName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkIfTestFileExists(String directory, String localFileName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkIfCvsignoreFileExists(String directory);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	MonitorPoint getMonitorPoint(String fullName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ControlPoint getControlPoint(String fullName);

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
	String Assembly();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String Extends();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String DeviceName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String Description();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String DescriptionAsString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String ICD();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String ICDDate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String ICDDateAsDatabaseDate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String ICDDateAsArrayTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Resource getArchive(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ResourceSet Notes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ResourceSet MonitorPoint();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ResourceSet ControlPoint();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ResourceSet ArchiveProperty();

} // DeviceModel
