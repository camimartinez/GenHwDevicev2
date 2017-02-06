/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package datamodel.base;

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
 *   <li>{@link datamodel.base.DeviceModel#getDescriptionIndex <em>Description Index</em>}</li>
 *   <li>{@link datamodel.base.DeviceModel#getSpreadsheet <em>Spreadsheet</em>}</li>
 *   <li>{@link datamodel.base.DeviceModel#getMain <em>Main</em>}</li>
 *   <li>{@link datamodel.base.DeviceModel#getNotes <em>Notes</em>}</li>
 *   <li>{@link datamodel.base.DeviceModel#getMonitorPoints <em>Monitor Points</em>}</li>
 *   <li>{@link datamodel.base.DeviceModel#getControlPoints <em>Control Points</em>}</li>
 *   <li>{@link datamodel.base.DeviceModel#getArchiveProperties <em>Archive Properties</em>}</li>
 *   <li>{@link datamodel.base.DeviceModel#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link datamodel.base.DeviceModel#getBusType <em>Bus Type</em>}</li>
 *   <li>{@link datamodel.base.DeviceModel#getDeviceDir <em>Device Dir</em>}</li>
 *   <li>{@link datamodel.base.DeviceModel#getCodegenDir <em>Codegen Dir</em>}</li>
 *   <li>{@link datamodel.base.DeviceModel#getSpreadsheetDir <em>Spreadsheet Dir</em>}</li>
 *   <li>{@link datamodel.base.DeviceModel#getGeneratedDir <em>Generated Dir</em>}</li>
 *   <li>{@link datamodel.base.DeviceModel#isMonitorDBOnly <em>Monitor DB Only</em>}</li>
 *   <li>{@link datamodel.base.DeviceModel#isGenerateAlt <em>Generate Alt</em>}</li>
 *   <li>{@link datamodel.base.DeviceModel#getGetArchiveIndex <em>Get Archive Index</em>}</li>
 *   <li>{@link datamodel.base.DeviceModel#getGetContPoints <em>Get Cont Points</em>}</li>
 *   <li>{@link datamodel.base.DeviceModel#getGetMoniPoints <em>Get Moni Points</em>}</li>
 *   <li>{@link datamodel.base.DeviceModel#getGetEndOfGeneration <em>Get End Of Generation</em>}</li>
 *   <li>{@link datamodel.base.DeviceModel#getGetArchivProp <em>Get Archiv Prop</em>}</li>
 *   <li>{@link datamodel.base.DeviceModel#getGetInfFromSpread <em>Get Inf From Spread</em>}</li>
 * </ul>
 * </p>
 *
 * @see datamodel.base.BasePackage#getDeviceModel()
 * @model abstract="true"
 * @generated
 */
public interface DeviceModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Description Index</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Index</em>' attribute.
	 * @see #setDescriptionIndex(int)
	 * @see datamodel.base.BasePackage#getDeviceModel_DescriptionIndex()
	 * @model default="1"
	 * @generated
	 */
	int getDescriptionIndex();

	/**
	 * Sets the value of the '{@link datamodel.base.DeviceModel#getDescriptionIndex <em>Description Index</em>}' attribute.
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
	 * @see #setSpreadsheet(String[][][])
	 * @see datamodel.base.BasePackage#getDeviceModel_Spreadsheet()
	 * @model dataType="datamodel.base.String3DT"
	 * @generated
	 */
	String[][][] getSpreadsheet();

	/**
	 * Sets the value of the '{@link datamodel.base.DeviceModel#getSpreadsheet <em>Spreadsheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spreadsheet</em>' attribute.
	 * @see #getSpreadsheet()
	 * @generated
	 */
	void setSpreadsheet(String[][][] value);

	/**
	 * Returns the value of the '<em><b>Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main</em>' attribute.
	 * @see #setMain(MainBase)
	 * @see datamodel.base.BasePackage#getDeviceModel_Main()
	 * @model dataType="datamodel.base.MainBaseDT" transient="true"
	 * @generated
	 */
	MainBase getMain();

	/**
	 * Sets the value of the '{@link datamodel.base.DeviceModel#getMain <em>Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main</em>' attribute.
	 * @see #getMain()
	 * @generated
	 */
	void setMain(MainBase value);

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
	 * @see datamodel.base.BasePackage#getDeviceModel_Notes()
	 * @model transient="true"
	 * @generated
	 */
	ResourceSet getNotes();

	/**
	 * Sets the value of the '{@link datamodel.base.DeviceModel#getNotes <em>Notes</em>}' attribute.
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
	 * @see datamodel.base.BasePackage#getDeviceModel_MonitorPoints()
	 * @model transient="true"
	 * @generated
	 */
	ResourceSet getMonitorPoints();

	/**
	 * Sets the value of the '{@link datamodel.base.DeviceModel#getMonitorPoints <em>Monitor Points</em>}' attribute.
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
	 * @see datamodel.base.BasePackage#getDeviceModel_ControlPoints()
	 * @model transient="true"
	 * @generated
	 */
	ResourceSet getControlPoints();

	/**
	 * Sets the value of the '{@link datamodel.base.DeviceModel#getControlPoints <em>Control Points</em>}' attribute.
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
	 * @see datamodel.base.BasePackage#getDeviceModel_ArchiveProperties()
	 * @model transient="true"
	 * @generated
	 */
	ResourceSet getArchiveProperties();

	/**
	 * Sets the value of the '{@link datamodel.base.DeviceModel#getArchiveProperties <em>Archive Properties</em>}' attribute.
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
	 * @see datamodel.base.BasePackage#getDeviceModel_DeviceName()
	 * @model
	 * @generated
	 */
	String getDeviceName();

	/**
	 * Sets the value of the '{@link datamodel.base.DeviceModel#getDeviceName <em>Device Name</em>}' attribute.
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
	 * @see datamodel.base.BasePackage#getDeviceModel_BusType()
	 * @model
	 * @generated
	 */
	String getBusType();

	/**
	 * Sets the value of the '{@link datamodel.base.DeviceModel#getBusType <em>Bus Type</em>}' attribute.
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
	 * @see datamodel.base.BasePackage#getDeviceModel_DeviceDir()
	 * @model
	 * @generated
	 */
	String getDeviceDir();

	/**
	 * Sets the value of the '{@link datamodel.base.DeviceModel#getDeviceDir <em>Device Dir</em>}' attribute.
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
	 * @see datamodel.base.BasePackage#getDeviceModel_CodegenDir()
	 * @model
	 * @generated
	 */
	String getCodegenDir();

	/**
	 * Sets the value of the '{@link datamodel.base.DeviceModel#getCodegenDir <em>Codegen Dir</em>}' attribute.
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
	 * @see datamodel.base.BasePackage#getDeviceModel_SpreadsheetDir()
	 * @model
	 * @generated
	 */
	String getSpreadsheetDir();

	/**
	 * Sets the value of the '{@link datamodel.base.DeviceModel#getSpreadsheetDir <em>Spreadsheet Dir</em>}' attribute.
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
	 * @see datamodel.base.BasePackage#getDeviceModel_GeneratedDir()
	 * @model
	 * @generated
	 */
	String getGeneratedDir();

	/**
	 * Sets the value of the '{@link datamodel.base.DeviceModel#getGeneratedDir <em>Generated Dir</em>}' attribute.
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
	 * @see datamodel.base.BasePackage#getDeviceModel_MonitorDBOnly()
	 * @model
	 * @generated
	 */
	boolean isMonitorDBOnly();

	/**
	 * Sets the value of the '{@link datamodel.base.DeviceModel#isMonitorDBOnly <em>Monitor DB Only</em>}' attribute.
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
	 * @see datamodel.base.BasePackage#getDeviceModel_GenerateAlt()
	 * @model
	 * @generated
	 */
	boolean isGenerateAlt();

	/**
	 * Sets the value of the '{@link datamodel.base.DeviceModel#isGenerateAlt <em>Generate Alt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate Alt</em>' attribute.
	 * @see #isGenerateAlt()
	 * @generated
	 */
	void setGenerateAlt(boolean value);

	/**
	 * Returns the value of the '<em><b>Get Archive Index</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Archive Index</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Archive Index</em>' reference.
	 * @see #setGetArchiveIndex(Table)
	 * @see datamodel.base.BasePackage#getDeviceModel_GetArchiveIndex()
	 * @model
	 * @generated
	 */
	Table getGetArchiveIndex();

	/**
	 * Sets the value of the '{@link datamodel.base.DeviceModel#getGetArchiveIndex <em>Get Archive Index</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Archive Index</em>' reference.
	 * @see #getGetArchiveIndex()
	 * @generated
	 */
	void setGetArchiveIndex(Table value);

	/**
	 * Returns the value of the '<em><b>Get Cont Points</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Cont Points</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Cont Points</em>' reference.
	 * @see #setGetContPoints(ControlPoint)
	 * @see datamodel.base.BasePackage#getDeviceModel_GetContPoints()
	 * @model
	 * @generated
	 */
	ControlPoint getGetContPoints();

	/**
	 * Sets the value of the '{@link datamodel.base.DeviceModel#getGetContPoints <em>Get Cont Points</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Cont Points</em>' reference.
	 * @see #getGetContPoints()
	 * @generated
	 */
	void setGetContPoints(ControlPoint value);

	/**
	 * Returns the value of the '<em><b>Get Moni Points</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Moni Points</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Moni Points</em>' reference.
	 * @see #setGetMoniPoints(MonitorPoint)
	 * @see datamodel.base.BasePackage#getDeviceModel_GetMoniPoints()
	 * @model
	 * @generated
	 */
	MonitorPoint getGetMoniPoints();

	/**
	 * Sets the value of the '{@link datamodel.base.DeviceModel#getGetMoniPoints <em>Get Moni Points</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Moni Points</em>' reference.
	 * @see #getGetMoniPoints()
	 * @generated
	 */
	void setGetMoniPoints(MonitorPoint value);

	/**
	 * Returns the value of the '<em><b>Get End Of Generation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get End Of Generation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get End Of Generation</em>' reference.
	 * @see #setGetEndOfGeneration(Util)
	 * @see datamodel.base.BasePackage#getDeviceModel_GetEndOfGeneration()
	 * @model
	 * @generated
	 */
	Util getGetEndOfGeneration();

	/**
	 * Sets the value of the '{@link datamodel.base.DeviceModel#getGetEndOfGeneration <em>Get End Of Generation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get End Of Generation</em>' reference.
	 * @see #getGetEndOfGeneration()
	 * @generated
	 */
	void setGetEndOfGeneration(Util value);

	/**
	 * Returns the value of the '<em><b>Get Archiv Prop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Archiv Prop</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Archiv Prop</em>' reference.
	 * @see #setGetArchivProp(ArchiveProperty)
	 * @see datamodel.base.BasePackage#getDeviceModel_GetArchivProp()
	 * @model
	 * @generated
	 */
	ArchiveProperty getGetArchivProp();

	/**
	 * Sets the value of the '{@link datamodel.base.DeviceModel#getGetArchivProp <em>Get Archiv Prop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Archiv Prop</em>' reference.
	 * @see #getGetArchivProp()
	 * @generated
	 */
	void setGetArchivProp(ArchiveProperty value);

	/**
	 * Returns the value of the '<em><b>Get Inf From Spread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Inf From Spread</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Inf From Spread</em>' reference.
	 * @see #setGetInfFromSpread(MainBase)
	 * @see datamodel.base.BasePackage#getDeviceModel_GetInfFromSpread()
	 * @model
	 * @generated
	 */
	MainBase getGetInfFromSpread();

	/**
	 * Sets the value of the '{@link datamodel.base.DeviceModel#getGetInfFromSpread <em>Get Inf From Spread</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Inf From Spread</em>' reference.
	 * @see #getGetInfFromSpread()
	 * @generated
	 */
	void setGetInfFromSpread(MainBase value);

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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"\";\r\n'"
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return Assembly();\r\n'"
	 * @generated
	 */
	String DirPath();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='String dir = generatedDir + \"/\" + Assembly();\r\nUtil utils = BaseFactoryImpl.eINSTANCE.createUtil();\r\nutils.RemoveLinesFromFile(dir + \"/src\", Assembly() + \"Base.cpp\", 1);\r\nutils.RemoveLinesFromFile(dir + \"/include\", Assembly() + \"Base.h\", 1);\r\nutils.RemoveLinesFromFile(dir + \"/idl\", Assembly() + \"Base.idl\", 1);\r\nutils.RemoveLinesFromFile(dir + \"/idl\", Assembly() + \"Add.sql\", 1);\r\nutils.RemoveLinesFromFile(dir + \"/doc\", Assembly() + \".xml\", 1);\r\nutils.RemoveLinesFromFile(dir + \"/doc\", Assembly() + \"Component.xml\", 1);\r\nutils.RemoveLinesFromFile(dir + \"/config/CDB/schemas\", Assembly() + \"Base.xsd\", 1);\r\nutils.RemoveLinesFromFile(dir + \"/config\", \"TMCDB\" + Assembly() + \"Add.xml\", 1);\r\nutils.RemoveLinesFromFile(dir + \"/src/CCL\", Assembly() + \"Base.py\", 1);\r\nutils.RemoveLinesFromFile(dir + \"/src/CCL\", \"__init__.py\", 1);\r\nSystem.out.println(\"Code generation for \" + deviceName + \" done.\");\r\nreturn \"\";'"
	 * @generated
	 */
	String TheEnd();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='java.io.File f = new java.io.File(fileName);\r\nif(f.exists() == true){\r\n            return true;\r\n  }else{\r\n            return false;\r\n          }'"
	 * @generated
	 */
	boolean checkIfFileExists(String fileName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if(directory.isEmpty() == false){\r\n            return checkIfFileExists(directory + \"/\" + fileName);\r\n        } else{\r\n            return checkIfFileExists(fileName);\r\n                }'"
	 * @generated
	 */
	boolean checkIfFileExists(String directory, String fileName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='String fileName = getDeviceDir() + \"/\" + directory + \"/\" + Assembly() + localFileName;\r\n        return checkIfFileExists(fileName);'"
	 * @generated
	 */
	boolean checkIfDeviceFileExists(String directory, String localFileName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='String fileName = getDeviceDir() + \"/\" + directory + \"/Test\" + Assembly() + localFileName;\r\n        return checkIfFileExists(fileName);'"
	 * @generated
	 */
	boolean checkIfTestFileExists(String directory, String localFileName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='String fileName = getDeviceDir() + \"/\" + directory + \"/.cvsignore\";\r\n        return checkIfFileExists(fileName);'"
	 * @generated
	 */
	boolean checkIfCvsignoreFileExists(String directory);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='int archiveIndex = BaseFactoryImpl.eINSTANCE.createTable().getSheetNum(\"ArchiveProperty\");\r\n\tfor(int i = 2; i < spreadsheet[archiveIndex].length; i++)  {\r\n\t\tif(spreadsheet[archiveIndex][i].length == 0)\r\n\t\tbreak;\r\n\t\t            \t\r\n\t\t String[] row = spreadsheet[archiveIndex][i];\r\n\t\t  ArchiveProperty ap = BaseFactoryImpl.eINSTANCE.createArchiveProperty();\r\n\t\t  if(name.equals(ap.RefersTo()))\r\n\t\t             return (Resource) ap;\r\n\t\t   }\r\n\t\t        return null;'"
	 * @generated
	 */
	Resource getArchive(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='for(int i = 0; i < monitorPoints.getResources().size(); i++){\r\n\tMonitorPoint mp = (MonitorPoint) monitorPoints.getResources().get(i);\r\n      if(mp.FullName().equals(fullName))\r\n\t\t      return mp;\r\n\t}\r\n\t\treturn null;'"
	 * @generated
	 */
	MonitorPoint getMonitorPoint(String fullName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='for (int i = 0; i < controlPoints.getResources().size(); i++) {\r\n\t ControlPoint cp = (ControlPoint) controlPoints.getResources().get(i);\r\n\t if (cp.FullName().equals(fullName))\r\n\t\t         return cp;\r\n\t }\r\n\t\t  return null;'"
	 * @generated
	 */
	ControlPoint getControlPoint(String fullName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return main.Assembly();\r\n'"
	 * @generated
	 */
	String Assembly();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return main.Extends();\r\n'"
	 * @generated
	 */
	String Extends();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return main.DeviceName();\r\n'"
	 * @generated
	 */
	String DeviceName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return main.Description();\r\n'"
	 * @generated
	 */
	String Description();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return main.DescriptionAsString();\r\n'"
	 * @generated
	 */
	String DescriptionAsString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return main.ICD();\r\n'"
	 * @generated
	 */
	String ICD();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return main.ICDDate();\r\n'"
	 * @generated
	 */
	String ICDDate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return main.ICDDateAsDatabaseDate();\r\n'"
	 * @generated
	 */
	String ICDDateAsDatabaseDate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return main.ICDDateAsArrayTime();\r\n'"
	 * @generated
	 */
	String ICDDateAsArrayTime();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return notes;'"
	 * @generated
	 */
	ResourceSet Notes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return monitorPoints;\r\n'"
	 * @generated
	 */
	ResourceSet MonitorPoint();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return controlPoints;\r\n'"
	 * @generated
	 */
	ResourceSet ControlPoint();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return archiveProperties;\r\n'"
	 * @generated
	 */
	ResourceSet ArchiveProperty();

} // DeviceModel
