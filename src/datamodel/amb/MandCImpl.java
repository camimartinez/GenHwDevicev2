/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package datamodel.amb;

import datamodel.base.MandCBase;
import datamodel.base.Table;
import datamodel.base.Util;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mand CImpl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datamodel.amb.MandCImpl#getRow <em>Row</em>}</li>
 *   <li>{@link datamodel.amb.MandCImpl#getSheet <em>Sheet</em>}</li>
 *   <li>{@link datamodel.amb.MandCImpl#getMcp <em>Mcp</em>}</li>
 *   <li>{@link datamodel.amb.MandCImpl#getMask <em>Mask</em>}</li>
 *   <li>{@link datamodel.amb.MandCImpl#getGetInfoSheet <em>Get Info Sheet</em>}</li>
 *   <li>{@link datamodel.amb.MandCImpl#getGetDataFromMain <em>Get Data From Main</em>}</li>
 *   <li>{@link datamodel.amb.MandCImpl#getIsMPDataType <em>Is MP Data Type</em>}</li>
 *   <li>{@link datamodel.amb.MandCImpl#getIsCPDataType <em>Is CP Data Type</em>}</li>
 *   <li>{@link datamodel.amb.MandCImpl#getUtilsToData <em>Utils To Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see datamodel.amb.AmbPackage#getMandCImpl()
 * @model
 * @generated
 */
public interface MandCImpl extends EObject {
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
	 * @see datamodel.amb.AmbPackage#getMandCImpl_Row()
	 * @model dataType="datamodel.base.String1DT"
	 * @generated
	 */
	String[] getRow();

	/**
	 * Sets the value of the '{@link datamodel.amb.MandCImpl#getRow <em>Row</em>}' attribute.
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
	 * @see datamodel.amb.AmbPackage#getMandCImpl_Sheet()
	 * @model
	 * @generated
	 */
	int getSheet();

	/**
	 * Sets the value of the '{@link datamodel.amb.MandCImpl#getSheet <em>Sheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sheet</em>' attribute.
	 * @see #getSheet()
	 * @generated
	 */
	void setSheet(int value);

	/**
	 * Returns the value of the '<em><b>Mcp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mcp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mcp</em>' attribute.
	 * @see #setMcp(Object)
	 * @see datamodel.amb.AmbPackage#getMandCImpl_Mcp()
	 * @model dataType="datamodel.base.MandCBaseDT" transient="true"
	 * @generated
	 */
	Object getMcp();

	/**
	 * Sets the value of the '{@link datamodel.amb.MandCImpl#getMcp <em>Mcp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mcp</em>' attribute.
	 * @see #getMcp()
	 * @generated
	 */
	void setMcp(Object value);

	/**
	 * Returns the value of the '<em><b>Mask</b></em>' attribute.
	 * The default value is <code>"\"0x01\", \"0x02\", \"0x04\", \"0x08\", \"0x10\",\"0x20\", \"0x40\", \"0x80\""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mask</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mask</em>' attribute.
	 * @see #setMask(String[])
	 * @see datamodel.amb.AmbPackage#getMandCImpl_Mask()
	 * @model default="\"0x01\", \"0x02\", \"0x04\", \"0x08\", \"0x10\",\"0x20\", \"0x40\", \"0x80\"" dataType="datamodel.base.String1DT"
	 * @generated
	 */
	String[] getMask();

	/**
	 * Sets the value of the '{@link datamodel.amb.MandCImpl#getMask <em>Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mask</em>' attribute.
	 * @see #getMask()
	 * @generated
	 */
	void setMask(String[] value);

	/**
	 * Returns the value of the '<em><b>Get Info Sheet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Info Sheet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Info Sheet</em>' reference.
	 * @see #setGetInfoSheet(MandCBase)
	 * @see datamodel.amb.AmbPackage#getMandCImpl_GetInfoSheet()
	 * @model
	 * @generated
	 */
	MandCBase getGetInfoSheet();

	/**
	 * Sets the value of the '{@link datamodel.amb.MandCImpl#getGetInfoSheet <em>Get Info Sheet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Info Sheet</em>' reference.
	 * @see #getGetInfoSheet()
	 * @generated
	 */
	void setGetInfoSheet(MandCBase value);

	/**
	 * Returns the value of the '<em><b>Get Data From Main</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Data From Main</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Data From Main</em>' reference.
	 * @see #setGetDataFromMain(Table)
	 * @see datamodel.amb.AmbPackage#getMandCImpl_GetDataFromMain()
	 * @model
	 * @generated
	 */
	Table getGetDataFromMain();

	/**
	 * Sets the value of the '{@link datamodel.amb.MandCImpl#getGetDataFromMain <em>Get Data From Main</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Data From Main</em>' reference.
	 * @see #getGetDataFromMain()
	 * @generated
	 */
	void setGetDataFromMain(Table value);

	/**
	 * Returns the value of the '<em><b>Is MP Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is MP Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is MP Data Type</em>' reference.
	 * @see #setIsMPDataType(MonitorImpl)
	 * @see datamodel.amb.AmbPackage#getMandCImpl_IsMPDataType()
	 * @model
	 * @generated
	 */
	MonitorImpl getIsMPDataType();

	/**
	 * Sets the value of the '{@link datamodel.amb.MandCImpl#getIsMPDataType <em>Is MP Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is MP Data Type</em>' reference.
	 * @see #getIsMPDataType()
	 * @generated
	 */
	void setIsMPDataType(MonitorImpl value);

	/**
	 * Returns the value of the '<em><b>Is CP Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is CP Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is CP Data Type</em>' reference.
	 * @see #setIsCPDataType(ControlImpl)
	 * @see datamodel.amb.AmbPackage#getMandCImpl_IsCPDataType()
	 * @model
	 * @generated
	 */
	ControlImpl getIsCPDataType();

	/**
	 * Sets the value of the '{@link datamodel.amb.MandCImpl#getIsCPDataType <em>Is CP Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is CP Data Type</em>' reference.
	 * @see #getIsCPDataType()
	 * @generated
	 */
	void setIsCPDataType(ControlImpl value);

	/**
	 * Returns the value of the '<em><b>Utils To Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utils To Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utils To Data</em>' reference.
	 * @see #setUtilsToData(Util)
	 * @see datamodel.amb.AmbPackage#getMandCImpl_UtilsToData()
	 * @model
	 * @generated
	 */
	Util getUtilsToData();

	/**
	 * Sets the value of the '{@link datamodel.amb.MandCImpl#getUtilsToData <em>Utils To Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utils To Data</em>' reference.
	 * @see #getUtilsToData()
	 * @generated
	 */
	void setUtilsToData(Util value);

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
	String RCA();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String RCACell();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String RawDataType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String RawDataTypeCell();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean TeRelated();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String WorldDataType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String WorldDataTypeCell();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String Scale();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String ScaleCell();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String Offset();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String OffsetCell();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String RawDataToCPPType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String WorldDataToCPPType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String WorldDataToCORBAType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String WorldDataToIDLSeqType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String WorldDataToIDLType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String WorldDataToCORBASeqType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String WorldDataToCORBADevIOType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String WorldDataToJavaType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String WorldDataToDatabaseType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String WorldDataToBACIType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isConversion();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isSpecialConversion();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isWorldDataArray();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isRawDataArray();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String NumberItemsRawData();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String TotalBytesRawData();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String NumberRawDataTypeBytes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String NumberItemsWorldData();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isDependentGroupBit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isDependentBit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isDependentElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isByteSwapped();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isDependentBitElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isDependentArrayElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String GetDimension();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isSingleBit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getBit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getFirstBit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getLastBit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getGroupStart();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getGroupEnd();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getGroupMask();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isRawSubArray();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String RawSubArrayStartIndex();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String RawSubArrayEndIndex();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int findRawSubArrayIndex(String s, boolean startOrEnd);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String WorldDataToDatabaseTypeUpper1();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String WorldDataTypeUpper1();

} // MandCImpl
