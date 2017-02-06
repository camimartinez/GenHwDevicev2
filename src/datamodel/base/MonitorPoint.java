/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package datamodel.base;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monitor Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datamodel.base.MonitorPoint#getGetInfoFromAPSpread <em>Get Info From AP Spread</em>}</li>
 *   <li>{@link datamodel.base.MonitorPoint#getGetInfoFromMPSpread <em>Get Info From MP Spread</em>}</li>
 * </ul>
 * </p>
 *
 * @see datamodel.base.BasePackage#getMonitorPoint()
 * @model abstract="true"
 * @generated
 */
public interface MonitorPoint extends MandCBase {
	/**
	 * Returns the value of the '<em><b>Get Info From AP Spread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Info From AP Spread</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Info From AP Spread</em>' reference.
	 * @see #setGetInfoFromAPSpread(ArchiveProperty)
	 * @see datamodel.base.BasePackage#getMonitorPoint_GetInfoFromAPSpread()
	 * @model
	 * @generated
	 */
	ArchiveProperty getGetInfoFromAPSpread();

	/**
	 * Sets the value of the '{@link datamodel.base.MonitorPoint#getGetInfoFromAPSpread <em>Get Info From AP Spread</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Info From AP Spread</em>' reference.
	 * @see #getGetInfoFromAPSpread()
	 * @generated
	 */
	void setGetInfoFromAPSpread(ArchiveProperty value);

	/**
	 * Returns the value of the '<em><b>Get Info From MP Spread</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Info From MP Spread</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Info From MP Spread</em>' reference.
	 * @see #setGetInfoFromMPSpread(Table)
	 * @see datamodel.base.BasePackage#getMonitorPoint_GetInfoFromMPSpread()
	 * @model
	 * @generated
	 */
	Table getGetInfoFromMPSpread();

	/**
	 * Sets the value of the '{@link datamodel.base.MonitorPoint#getGetInfoFromMPSpread <em>Get Info From MP Spread</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Info From MP Spread</em>' reference.
	 * @see #getGetInfoFromMPSpread()
	 * @generated
	 */
	void setGetInfoFromMPSpread(Table value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String Default();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String ErrorCondition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String ErrorSeverity();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String ErrorAction();

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
	String RefersTo();

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
	String Tittle();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String MPName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String AltMPName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isMonitored();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isPartOfPattern();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isHomogeneous();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isPartOfHomogeneous();

} // MonitorPoint
