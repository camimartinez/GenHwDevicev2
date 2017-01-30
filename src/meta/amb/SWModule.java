/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package meta.amb;

import meta.base.Table;
import meta.base.Util;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SW Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link meta.amb.SWModule#getAssemblyName <em>Assembly Name</em>}</li>
 *   <li>{@link meta.amb.SWModule#getDirPath <em>Dir Path</em>}</li>
 *   <li>{@link meta.amb.SWModule#getMainAssembly <em>Main Assembly</em>}</li>
 *   <li>{@link meta.amb.SWModule#isOneSwModule <em>One Sw Module</em>}</li>
 *   <li>{@link meta.amb.SWModule#getRow <em>Row</em>}</li>
 *   <li>{@link meta.amb.SWModule#getParentRow <em>Parent Row</em>}</li>
 *   <li>{@link meta.amb.SWModule#getSheet <em>Sheet</em>}</li>
 *   <li>{@link meta.amb.SWModule#getMonitorPoints <em>Monitor Points</em>}</li>
 *   <li>{@link meta.amb.SWModule#getControlPoints <em>Control Points</em>}</li>
 *   <li>{@link meta.amb.SWModule#getArchiveProperties <em>Archive Properties</em>}</li>
 *   <li>{@link meta.amb.SWModule#getSimMonitorPoints <em>Sim Monitor Points</em>}</li>
 *   <li>{@link meta.amb.SWModule#getSimControlPoints <em>Sim Control Points</em>}</li>
 *   <li>{@link meta.amb.SWModule#getEReference0 <em>EReference0</em>}</li>
 *   <li>{@link meta.amb.SWModule#getEReference1 <em>EReference1</em>}</li>
 *   <li>{@link meta.amb.SWModule#getEReference2 <em>EReference2</em>}</li>
 *   <li>{@link meta.amb.SWModule#getEReference3 <em>EReference3</em>}</li>
 * </ul>
 * </p>
 *
 * @see meta.amb.AmbPackage#getSWModule()
 * @model
 * @generated
 */
public interface SWModule extends EObject {
	/**
	 * Returns the value of the '<em><b>Assembly Name</b></em>' attribute.
	 * The default value is <code>"null"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assembly Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Name</em>' attribute.
	 * @see #setAssemblyName(String)
	 * @see meta.amb.AmbPackage#getSWModule_AssemblyName()
	 * @model default="null"
	 * @generated
	 */
	String getAssemblyName();

	/**
	 * Sets the value of the '{@link meta.amb.SWModule#getAssemblyName <em>Assembly Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly Name</em>' attribute.
	 * @see #getAssemblyName()
	 * @generated
	 */
	void setAssemblyName(String value);

	/**
	 * Returns the value of the '<em><b>Dir Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dir Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dir Path</em>' attribute.
	 * @see #setDirPath(String)
	 * @see meta.amb.AmbPackage#getSWModule_DirPath()
	 * @model
	 * @generated
	 */
	String getDirPath();

	/**
	 * Sets the value of the '{@link meta.amb.SWModule#getDirPath <em>Dir Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir Path</em>' attribute.
	 * @see #getDirPath()
	 * @generated
	 */
	void setDirPath(String value);

	/**
	 * Returns the value of the '<em><b>Main Assembly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Assembly</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Assembly</em>' attribute.
	 * @see #setMainAssembly(String)
	 * @see meta.amb.AmbPackage#getSWModule_MainAssembly()
	 * @model
	 * @generated
	 */
	String getMainAssembly();

	/**
	 * Sets the value of the '{@link meta.amb.SWModule#getMainAssembly <em>Main Assembly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Assembly</em>' attribute.
	 * @see #getMainAssembly()
	 * @generated
	 */
	void setMainAssembly(String value);

	/**
	 * Returns the value of the '<em><b>One Sw Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>One Sw Module</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>One Sw Module</em>' attribute.
	 * @see #setOneSwModule(boolean)
	 * @see meta.amb.AmbPackage#getSWModule_OneSwModule()
	 * @model
	 * @generated
	 */
	boolean isOneSwModule();

	/**
	 * Sets the value of the '{@link meta.amb.SWModule#isOneSwModule <em>One Sw Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>One Sw Module</em>' attribute.
	 * @see #isOneSwModule()
	 * @generated
	 */
	void setOneSwModule(boolean value);

	/**
	 * Returns the value of the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row</em>' attribute.
	 * @see #setRow(String)
	 * @see meta.amb.AmbPackage#getSWModule_Row()
	 * @model
	 * @generated
	 */
	String getRow();

	/**
	 * Sets the value of the '{@link meta.amb.SWModule#getRow <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row</em>' attribute.
	 * @see #getRow()
	 * @generated
	 */
	void setRow(String value);

	/**
	 * Returns the value of the '<em><b>Parent Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Row</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Row</em>' attribute.
	 * @see #setParentRow(String)
	 * @see meta.amb.AmbPackage#getSWModule_ParentRow()
	 * @model
	 * @generated
	 */
	String getParentRow();

	/**
	 * Sets the value of the '{@link meta.amb.SWModule#getParentRow <em>Parent Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Row</em>' attribute.
	 * @see #getParentRow()
	 * @generated
	 */
	void setParentRow(String value);

	/**
	 * Returns the value of the '<em><b>Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sheet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheet</em>' attribute.
	 * @see #setSheet(int)
	 * @see meta.amb.AmbPackage#getSWModule_Sheet()
	 * @model
	 * @generated
	 */
	int getSheet();

	/**
	 * Sets the value of the '{@link meta.amb.SWModule#getSheet <em>Sheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sheet</em>' attribute.
	 * @see #getSheet()
	 * @generated
	 */
	void setSheet(int value);

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
	 * @see meta.amb.AmbPackage#getSWModule_MonitorPoints()
	 * @model transient="true"
	 * @generated
	 */
	ResourceSet getMonitorPoints();

	/**
	 * Sets the value of the '{@link meta.amb.SWModule#getMonitorPoints <em>Monitor Points</em>}' attribute.
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
	 * @see meta.amb.AmbPackage#getSWModule_ControlPoints()
	 * @model transient="true"
	 * @generated
	 */
	ResourceSet getControlPoints();

	/**
	 * Sets the value of the '{@link meta.amb.SWModule#getControlPoints <em>Control Points</em>}' attribute.
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
	 * @see meta.amb.AmbPackage#getSWModule_ArchiveProperties()
	 * @model transient="true"
	 * @generated
	 */
	ResourceSet getArchiveProperties();

	/**
	 * Sets the value of the '{@link meta.amb.SWModule#getArchiveProperties <em>Archive Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Archive Properties</em>' attribute.
	 * @see #getArchiveProperties()
	 * @generated
	 */
	void setArchiveProperties(ResourceSet value);

	/**
	 * Returns the value of the '<em><b>Sim Monitor Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sim Monitor Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sim Monitor Points</em>' attribute.
	 * @see #setSimMonitorPoints(ResourceSet)
	 * @see meta.amb.AmbPackage#getSWModule_SimMonitorPoints()
	 * @model transient="true"
	 * @generated
	 */
	ResourceSet getSimMonitorPoints();

	/**
	 * Sets the value of the '{@link meta.amb.SWModule#getSimMonitorPoints <em>Sim Monitor Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sim Monitor Points</em>' attribute.
	 * @see #getSimMonitorPoints()
	 * @generated
	 */
	void setSimMonitorPoints(ResourceSet value);

	/**
	 * Returns the value of the '<em><b>Sim Control Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sim Control Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sim Control Points</em>' attribute.
	 * @see #setSimControlPoints(ResourceSet)
	 * @see meta.amb.AmbPackage#getSWModule_SimControlPoints()
	 * @model transient="true"
	 * @generated
	 */
	ResourceSet getSimControlPoints();

	/**
	 * Sets the value of the '{@link meta.amb.SWModule#getSimControlPoints <em>Sim Control Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sim Control Points</em>' attribute.
	 * @see #getSimControlPoints()
	 * @generated
	 */
	void setSimControlPoints(ResourceSet value);

	/**
	 * Returns the value of the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference0</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference0</em>' reference.
	 * @see #setEReference0(MonitorImpl)
	 * @see meta.amb.AmbPackage#getSWModule_EReference0()
	 * @model
	 * @generated
	 */
	MonitorImpl getEReference0();

	/**
	 * Sets the value of the '{@link meta.amb.SWModule#getEReference0 <em>EReference0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference0</em>' reference.
	 * @see #getEReference0()
	 * @generated
	 */
	void setEReference0(MonitorImpl value);

	/**
	 * Returns the value of the '<em><b>EReference1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference1</em>' reference.
	 * @see #setEReference1(ControlImpl)
	 * @see meta.amb.AmbPackage#getSWModule_EReference1()
	 * @model
	 * @generated
	 */
	ControlImpl getEReference1();

	/**
	 * Sets the value of the '{@link meta.amb.SWModule#getEReference1 <em>EReference1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference1</em>' reference.
	 * @see #getEReference1()
	 * @generated
	 */
	void setEReference1(ControlImpl value);

	/**
	 * Returns the value of the '<em><b>EReference2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference2</em>' reference.
	 * @see #setEReference2(Util)
	 * @see meta.amb.AmbPackage#getSWModule_EReference2()
	 * @model
	 * @generated
	 */
	Util getEReference2();

	/**
	 * Sets the value of the '{@link meta.amb.SWModule#getEReference2 <em>EReference2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference2</em>' reference.
	 * @see #getEReference2()
	 * @generated
	 */
	void setEReference2(Util value);

	/**
	 * Returns the value of the '<em><b>EReference3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference3</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference3</em>' reference.
	 * @see #setEReference3(Table)
	 * @see meta.amb.AmbPackage#getSWModule_EReference3()
	 * @model
	 * @generated
	 */
	Table getEReference3();

	/**
	 * Sets the value of the '{@link meta.amb.SWModule#getEReference3 <em>EReference3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference3</em>' reference.
	 * @see #getEReference3()
	 * @generated
	 */
	void setEReference3(Table value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addMP(Resource mp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addCP(Resource cp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addAP(Resource ap);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String Initialize();

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ResourceSet SimMonitorPoint();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ResourceSet SimControlPoint();

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
	String Description();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String DescriptionL1();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void DescriptionAsString();

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
	String Extends();

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
	boolean GenericMonitorPoints();

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
	String HexToDec(String s);

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
	String SimSerialNumber();

} // SWModule
