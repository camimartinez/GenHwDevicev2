/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package datamodel.base;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Archive Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datamodel.base.ArchiveProperty#getRow <em>Row</em>}</li>
 *   <li>{@link datamodel.base.ArchiveProperty#getSheet <em>Sheet</em>}</li>
 *   <li>{@link datamodel.base.ArchiveProperty#getGetColumnsInfoOfArchi <em>Get Columns Info Of Archi</em>}</li>
 *   <li>{@link datamodel.base.ArchiveProperty#getMp <em>Mp</em>}</li>
 *   <li>{@link datamodel.base.ArchiveProperty#getCp <em>Cp</em>}</li>
 * </ul>
 * </p>
 *
 * @see datamodel.base.BasePackage#getArchiveProperty()
 * @model
 * @generated
 */
public interface ArchiveProperty extends EObject {
	/**
	 * Returns the value of the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row</em>' attribute.
	 * @see #setRow(String[])
	 * @see datamodel.base.BasePackage#getArchiveProperty_Row()
	 * @model dataType="datamodel.base.String1DT"
	 * @generated
	 */
	String[] getRow();

	/**
	 * Sets the value of the '{@link datamodel.base.ArchiveProperty#getRow <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row</em>' attribute.
	 * @see #getRow()
	 * @generated
	 */
	void setRow(String[] value);

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
	 * @see datamodel.base.BasePackage#getArchiveProperty_Sheet()
	 * @model
	 * @generated
	 */
	int getSheet();

	/**
	 * Sets the value of the '{@link datamodel.base.ArchiveProperty#getSheet <em>Sheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sheet</em>' attribute.
	 * @see #getSheet()
	 * @generated
	 */
	void setSheet(int value);

	/**
	 * Returns the value of the '<em><b>Get Columns Info Of Archi</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Columns Info Of Archi</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Columns Info Of Archi</em>' reference.
	 * @see #setGetColumnsInfoOfArchi(Table)
	 * @see datamodel.base.BasePackage#getArchiveProperty_GetColumnsInfoOfArchi()
	 * @model
	 * @generated
	 */
	Table getGetColumnsInfoOfArchi();

	/**
	 * Sets the value of the '{@link datamodel.base.ArchiveProperty#getGetColumnsInfoOfArchi <em>Get Columns Info Of Archi</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Columns Info Of Archi</em>' reference.
	 * @see #getGetColumnsInfoOfArchi()
	 * @generated
	 */
	void setGetColumnsInfoOfArchi(Table value);

	/**
	 * Returns the value of the '<em><b>Mp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mp</em>' attribute.
	 * @see #setMp(Resource)
	 * @see datamodel.base.BasePackage#getArchiveProperty_Mp()
	 * @model transient="true"
	 * @generated
	 */
	Resource getMp();

	/**
	 * Sets the value of the '{@link datamodel.base.ArchiveProperty#getMp <em>Mp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mp</em>' attribute.
	 * @see #getMp()
	 * @generated
	 */
	void setMp(Resource value);

	/**
	 * Returns the value of the '<em><b>Cp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cp</em>' attribute.
	 * @see #setCp(Resource)
	 * @see datamodel.base.BasePackage#getArchiveProperty_Cp()
	 * @model transient="true"
	 * @generated
	 */
	Resource getCp();

	/**
	 * Sets the value of the '{@link datamodel.base.ArchiveProperty#getCp <em>Cp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cp</em>' attribute.
	 * @see #getCp()
	 * @generated
	 */
	void setCp(Resource value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isRefersTo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isMonitorPoint();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isControlPoint();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Resource getMonitorPoint();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Resource getControlPoint();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String APName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String Name();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String RefersTo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String IntervalFull();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String Interval();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean OnlyOnChange();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String DisplayUnits();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String GraphMin();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String GraphMax();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String Format();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean OnStartup();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String Tittle();

} // ArchiveProperty
