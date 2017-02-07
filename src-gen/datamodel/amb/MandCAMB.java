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
 * A representation of the model object '<em><b>Mand CAMB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datamodel.amb.MandCAMB#getRow <em>Row</em>}</li>
 *   <li>{@link datamodel.amb.MandCAMB#getSheet <em>Sheet</em>}</li>
 *   <li>{@link datamodel.amb.MandCAMB#getMcp <em>Mcp</em>}</li>
 *   <li>{@link datamodel.amb.MandCAMB#getMask <em>Mask</em>}</li>
 *   <li>{@link datamodel.amb.MandCAMB#getGetInfoSheet <em>Get Info Sheet</em>}</li>
 *   <li>{@link datamodel.amb.MandCAMB#getGetDataFromMain <em>Get Data From Main</em>}</li>
 *   <li>{@link datamodel.amb.MandCAMB#getIsMPDataType <em>Is MP Data Type</em>}</li>
 *   <li>{@link datamodel.amb.MandCAMB#getIsCPDataType <em>Is CP Data Type</em>}</li>
 *   <li>{@link datamodel.amb.MandCAMB#getUtilsToData <em>Utils To Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see datamodel.amb.AmbPackage#getMandCAMB()
 * @model
 * @generated
 */
public interface MandCAMB extends EObject {
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
	 * @see datamodel.amb.AmbPackage#getMandCAMB_Row()
	 * @model dataType="datamodel.base.String1DT"
	 * @generated
	 */
	String[] getRow();

	/**
	 * Sets the value of the '{@link datamodel.amb.MandCAMB#getRow <em>Row</em>}' attribute.
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
	 * @see datamodel.amb.AmbPackage#getMandCAMB_Sheet()
	 * @model
	 * @generated
	 */
	int getSheet();

	/**
	 * Sets the value of the '{@link datamodel.amb.MandCAMB#getSheet <em>Sheet</em>}' attribute.
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
	 * @see #setMcp(MandCBase)
	 * @see datamodel.amb.AmbPackage#getMandCAMB_Mcp()
	 * @model dataType="datamodel.base.MandCBaseDT" transient="true"
	 * @generated
	 */
	MandCBase getMcp();

	/**
	 * Sets the value of the '{@link datamodel.amb.MandCAMB#getMcp <em>Mcp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mcp</em>' attribute.
	 * @see #getMcp()
	 * @generated
	 */
	void setMcp(MandCBase value);

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
	 * @see datamodel.amb.AmbPackage#getMandCAMB_Mask()
	 * @model default="\"0x01\", \"0x02\", \"0x04\", \"0x08\", \"0x10\",\"0x20\", \"0x40\", \"0x80\"" dataType="datamodel.base.String1DT"
	 * @generated
	 */
	String[] getMask();

	/**
	 * Sets the value of the '{@link datamodel.amb.MandCAMB#getMask <em>Mask</em>}' attribute.
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
	 * @see datamodel.amb.AmbPackage#getMandCAMB_GetInfoSheet()
	 * @model
	 * @generated
	 */
	MandCBase getGetInfoSheet();

	/**
	 * Sets the value of the '{@link datamodel.amb.MandCAMB#getGetInfoSheet <em>Get Info Sheet</em>}' reference.
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
	 * @see datamodel.amb.AmbPackage#getMandCAMB_GetDataFromMain()
	 * @model
	 * @generated
	 */
	Table getGetDataFromMain();

	/**
	 * Sets the value of the '{@link datamodel.amb.MandCAMB#getGetDataFromMain <em>Get Data From Main</em>}' reference.
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
	 * @see #setIsMPDataType(MonitorAMB)
	 * @see datamodel.amb.AmbPackage#getMandCAMB_IsMPDataType()
	 * @model
	 * @generated
	 */
	MonitorAMB getIsMPDataType();

	/**
	 * Sets the value of the '{@link datamodel.amb.MandCAMB#getIsMPDataType <em>Is MP Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is MP Data Type</em>' reference.
	 * @see #getIsMPDataType()
	 * @generated
	 */
	void setIsMPDataType(MonitorAMB value);

	/**
	 * Returns the value of the '<em><b>Is CP Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is CP Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is CP Data Type</em>' reference.
	 * @see #setIsCPDataType(ControlAMB)
	 * @see datamodel.amb.AmbPackage#getMandCAMB_IsCPDataType()
	 * @model
	 * @generated
	 */
	ControlAMB getIsCPDataType();

	/**
	 * Sets the value of the '{@link datamodel.amb.MandCAMB#getIsCPDataType <em>Is CP Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is CP Data Type</em>' reference.
	 * @see #getIsCPDataType()
	 * @generated
	 */
	void setIsCPDataType(ControlAMB value);

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
	 * @see datamodel.amb.AmbPackage#getMandCAMB_UtilsToData()
	 * @model
	 * @generated
	 */
	Util getUtilsToData();

	/**
	 * Sets the value of the '{@link datamodel.amb.MandCAMB#getUtilsToData <em>Utils To Data</em>}' reference.
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, \"Assembly\")];'"
	 * @generated
	 */
	String Assembly();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, \"RCA\")];'"
	 * @generated
	 */
	String RCA();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, \"RCA\")];'"
	 * @generated
	 */
	String RCACell();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tString s = row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, \"Raw Data Type\")];\r\n\t\tif(!mcp.isDependent())\r\n\t\t\treturn isRawDataArray() ? s.substring(0, s.indexOf(\"[\")) : s;\r\n\t\t\tif(mcp instanceof MonitorAMBImpl)\r\n\t\t\t\treturn ((MonitorAMBImpl) mcp.getParent()).RawDataType();\r\n\t\t\tif(mcp instanceof ControlAMBImpl)\r\n\t\t\t\treturn ((ControlAMBImpl) mcp.getParent()).RawDataType();\r\n\t\t\treturn \"ERROR\";'"
	 * @generated
	 */
	String RawDataType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, \"Raw Data Type\")];\r\n'"
	 * @generated
	 */
	String RawDataTypeCell();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return false;'"
	 * @generated
	 */
	boolean TeRelated();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, \"TE Related\")];\r\n'"
	 * @generated
	 */
	String TeRelatedCell();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='String s = row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, \"World Data Type\")];\r\nreturn isWorldDataArray() ? s.substring(0, s.indexOf(\"[\")) : s;'"
	 * @generated
	 */
	String WorldDataType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, \"World Data Type\")];'"
	 * @generated
	 */
	String WorldDataTypeCell();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tString s = ScaleCell();\r\n\t\tif((s.equals(\"none\") == true) || (s.equals(\"extended\") == true)\r\n\t\t\t\t|| (s.equals(BaseFactory.eINSTANCE.createTable().getCelsiusToKelvin()) == true))\r\n\t\t\ts = \"1.0\";\r\n\t\treturn s;'"
	 * @generated
	 */
	String Scale();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return BaseFactory.eINSTANCE.createUtil().normalizeNumber(WorldDataType(), row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, \"Scale\")]);\r\n'"
	 * @generated
	 */
	String ScaleCell();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tString s = ScaleCell();\r\n\t\tif(s.equals(BaseFactory.eINSTANCE.createTable().getCelsiusToKelvin()))\r\n\t\t\treturn \"273.15\";\r\n\t\tString o = OffsetCell();\r\n\t\tif((o.equals(\"0\") == true) || (o.equals(\"none\") == true)\r\n\t\t\t\t|| (o.equals(\"extended\") == true))\r\n\t\t\to = \"0.0\";\r\n\t\treturn o;'"
	 * @generated
	 */
	String Offset();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return BaseFactory.eINSTANCE.createUtil().normalizeNumber(WorldDataType(), row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, \"Offset\")]);\r\n'"
	 * @generated
	 */
	String OffsetCell();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return (String)BaseFactory.eINSTANCE.createTable().getRawToCPP().get(RawDataType());\r\n'"
	 * @generated
	 */
	String RawDataToCPPType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return (String)BaseFactory.eINSTANCE.createTable().getWorldToCPP().get(WorldDataType());'"
	 * @generated
	 */
	String WorldDataToCPPType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return (String)BaseFactory.eINSTANCE.createTable().getWorldToCORBA().get(WorldDataType());'"
	 * @generated
	 */
	String WorldDataToCORBAType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return (String)BaseFactory.eINSTANCE.createTable().getWorldToIDLSeq().get(WorldDataType());'"
	 * @generated
	 */
	String WorldDataToIDLSeqType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return (String)BaseFactory.eINSTANCE.createTable().getWorldToIDL().get(WorldDataType());\r\n'"
	 * @generated
	 */
	String WorldDataToIDLType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return (String)BaseFactory.eINSTANCE.createTable().getWorldToCORBASeq().get(WorldDataType());'"
	 * @generated
	 */
	String WorldDataToCORBASeqType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return (String)BaseFactory.eINSTANCE.createTable().getWorldToCORBADevIO().get(WorldDataType());'"
	 * @generated
	 */
	String WorldDataToCORBADevIOType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return (String)BaseFactory.eINSTANCE.createTable().getWorldToJava().get(WorldDataType());'"
	 * @generated
	 */
	String WorldDataToJavaType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return (String)BaseFactory.eINSTANCE.createTable().getWorldToDatabase().get(WorldDataType());'"
	 * @generated
	 */
	String WorldDataToDatabaseType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return (String)BaseFactory.eINSTANCE.createTable().getWorldToBACI().get(WorldDataType());'"
	 * @generated
	 */
	String WorldDataToBACIType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tif(ScaleCell().equals(\"none\") && OffsetCell().equals(\"none\"))\r\n\t\t{\r\n\t\t\treturn false;\r\n\t\t}\r\n\t\telse if(ScaleCell().equals(\"1.0\") && OffsetCell().equals(\"0.0\"))\r\n\t\t{\r\n\t\t\treturn false;\r\n\t\t}\r\n\t\telse if(ScaleCell().equals(\"1.0\") && OffsetCell().equals(\"none\"))\r\n\t\t{\r\n\t\t\treturn false;\r\n\t\t}\r\n\t\telse if(ScaleCell().equals(\"none\") && OffsetCell().equals(\"0.0\"))\r\n\t\t{\r\n\t\t\treturn false;\r\n\t\t}\r\n\r\n\t\treturn true;'"
	 * @generated
	 */
	boolean isConversion();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ScaleCell().equals(\"extended\");'"
	 * @generated
	 */
	boolean isSpecialConversion();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='String s = \trow[BaseFactory.eINSTANCE.createTable().getColNum(sheet, \"World Data Type\")];\r\nreturn s.endsWith(\"]\") ? true : false;'"
	 * @generated
	 */
	boolean isWorldDataArray();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tString s = row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, \"Raw Data Type\")];\r\n\t\tif(!mcp.isDependent())\r\n\t\t\treturn s.endsWith(\"]\") ? true : false;\r\n\t\tif(s.startsWith(\"&lt;\") && s.substring(1).indexOf(\"&lt;\") != -1)\r\n\t\t\treturn true;\r\n\t\treturn false;'"
	 * @generated
	 */
	boolean isRawDataArray();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='String s = row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, \"Raw Data Type\")];\r\nreturn BaseFactory.eINSTANCE.createUtil().NumberOfItems(s);'"
	 * @generated
	 */
	String NumberItemsRawData();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='String s = row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, \"Raw Data Type\")];\r\nreturn BaseFactory.eINSTANCE.createUtil().RawDataTypeTotalBytes(s);'"
	 * @generated
	 */
	String TotalBytesRawData();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return BaseFactory.eINSTANCE.createUtil().NumberRawDataTypeBytes(RawDataType());'"
	 * @generated
	 */
	String NumberRawDataTypeBytes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='String s = row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, \"World Data Type\")];\r\nreturn BaseFactory.eINSTANCE.createUtil().NumberOfItems(s);'"
	 * @generated
	 */
	String NumberItemsWorldData();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tif(!mcp.isDependent())\r\n\t\t\treturn false;\r\n\t\tif(isDependentBit() && RawDataTypeCell().indexOf(\"-\") != -1)\r\n\t\t\treturn true;\r\n\t\treturn false;'"
	 * @generated
	 */
	boolean isDependentGroupBit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tif(!mcp.isDependent())\r\n\t\t\treturn false;\r\n\t\tif(RawDataTypeCell().startsWith(\"&lt;\"))\r\n\t\t\treturn true;\r\n\t\treturn false;'"
	 * @generated
	 */
	boolean isDependentBit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tif(!mcp.isDependent())\r\n\t\t\treturn false;\r\n\t\tif(RawDataTypeCell().startsWith(\"[\"))\r\n\t\t\treturn true;\r\n\t\treturn false;'"
	 * @generated
	 */
	boolean isDependentElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ((String)BaseFactory.eINSTANCE.createTable().getRawToByteSwapped().get(RawDataType())).equals(true);'"
	 * @generated
	 */
	boolean isByteSwapped();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tif(!mcp.isDependent())\r\n\t\t\treturn false;\r\n\t\tif(RawDataTypeCell().startsWith(\"&lt;\"))\r\n\t\t\treturn true;\r\n\t\treturn false;'"
	 * @generated
	 */
	boolean isDependentBitElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tif(!mcp.isDependent())\r\n\t\t\treturn false;\r\n\t\tif(RawDataTypeCell().startsWith(\"[\"))\r\n\t\t\treturn true;\r\n\t\treturn false;'"
	 * @generated
	 */
	boolean isDependentArrayElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tString s = RawDataTypeCell();\r\n\t\tif(isDependentArrayElement())\r\n\t\t{\r\n\t\t\tint n = s.indexOf(\"]\");\r\n\t\t\treturn s.substring(1, n);\r\n\t\t}\r\n\t\tif(!isRawDataArray())\r\n\t\t\treturn \"0\";\r\n\t\tif(isDependentBitElement())\r\n\t\t{\r\n\t\t\tint n = s.indexOf(\"&gt;\");\r\n\t\t\treturn s.substring(4, n);\r\n\t\t}\r\n\t\treturn \"0\";'"
	 * @generated
	 */
	String GetDimension();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tString s = RawDataTypeCell();\r\n\t\tif(!s.startsWith(\"&lt;\"))// &lt;0&gt;\r\n\t\t\treturn false;\r\n\t\tif(!s.endsWith(\"&gt;\"))\r\n\t\t\treturn false;\r\n\t\tif(s.indexOf(\"-\") == -1)\r\n\t\t\treturn true;\r\n\t\treturn false;'"
	 * @generated
	 */
	boolean isSingleBit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tString s = RawDataTypeCell();\r\n\t\tint n = s.indexOf(\"&gt;\");\r\n\t\treturn s.substring(4, n);'"
	 * @generated
	 */
	String getBit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tString s = RawDataTypeCell();\r\n\t\tif(!s.startsWith(\"&lt;\") || !s.endsWith(\"&gt;\"))\r\n\t\t\treturn \"\";\r\n\t\tif(isSingleBit())\r\n\t\t\treturn getBit();\r\n\t\tint n = s.indexOf(\"-\");\r\n\t\tif(n == -1)\r\n\t\t\treturn \"\";\r\n\t\treturn s.substring(4, n);'"
	 * @generated
	 */
	String getFirstBit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tString s = RawDataTypeCell();\r\n\t\tif(!s.startsWith(\"&lt;\") || !s.endsWith(\"&gt;\"))\r\n\t\t\treturn \"\";\r\n\t\tif(isSingleBit())\r\n\t\t\treturn getBit();\r\n\t\tint n = s.indexOf(\"-\");\r\n\t\tif(n == -1)\r\n\t\t\treturn \"\";\r\n\t\treturn s.substring(n + 1, s.length() - 4);'"
	 * @generated
	 */
	String getLastBit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tString s = RawDataTypeCell();\r\n\t\tif(isRawDataArray())\r\n\t\t{\r\n\t\t\ts = s.substring(4);\r\n\t\t\tint n = s.indexOf(\"&lt;\");\r\n\t\t\tint m = s.substring(n + 4).indexOf(\"&gt;\");\r\n\t\t\tif(n == -1 || m == -1)\r\n\t\t\t\treturn \"\";\r\n\t\t\ts = s.substring(n + 4, m + n + 4);\r\n\t\t}\r\n\t\telse\r\n\t\t{\r\n\t\t\ts = s.substring(4, s.length() - 4);\r\n\t\t}\r\n\t\t// \"s\" is of type \"i-j\"\r\n\t\tint n = s.indexOf(\"-\");\r\n\t\tif(n == -1)\r\n\t\t\treturn \"\";\r\n\t\treturn s.substring(0, n);'"
	 * @generated
	 */
	String getGroupStart();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tString s = RawDataTypeCell();\r\n\t\tint n = s.indexOf(\"-\");\r\n\t\tif(n == -1)\r\n\t\t\treturn \"\";\r\n\t\treturn s.substring(n + 1, s.length() - 4);'"
	 * @generated
	 */
	String getGroupEnd();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tString firstBit = getGroupStart();\r\n\t\tString lastBit = getGroupEnd();\r\n\t\tint n = Integer.parseInt(firstBit);\r\n\t\tint m = Integer.parseInt(lastBit);\r\n\t\tint intMaskSize = m - n;\r\n\t\tint intMask = 0;\r\n\t\tfor(int i = 0; i <= intMaskSize; i++)\r\n\t\t{\r\n\t\t\tintMask += Math.pow(2, i);\r\n\t\t}\r\n\t\tString mask = \"0x\".concat(Integer.toHexString(intMask).toUpperCase());\r\n\t\treturn mask;'"
	 * @generated
	 */
	String getGroupMask();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tString s = RawDataTypeCell();\r\n\t\tif((s.indexOf(\"[\") != -1) && (s.indexOf(\"-\") != -1)\r\n\t\t\t\t&& (s.indexOf(\"]\") != -1))\r\n\t\t\treturn true;\r\n\t\treturn false;'"
	 * @generated
	 */
	boolean isRawSubArray();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tString s = RawDataTypeCell();\r\n\t\treturn String.valueOf(findRawSubArrayIndex(s, true));'"
	 * @generated
	 */
	String RawSubArrayStartIndex();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tString s = RawDataTypeCell();\r\n\t\treturn String.valueOf(findRawSubArrayIndex(s, false));'"
	 * @generated
	 */
	String RawSubArrayEndIndex();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tint end = s.indexOf(\"]\");\r\n\t\tif(end == -1)\r\n\t\t\tthrow new RuntimeException(\r\n\t\t\t\t\t\"In Raw Datatype column of monitor spreadsheet, subarray notation does not contain \\\"]\\\" (\"\r\n\t\t\t\t\t+ s + \")\");\r\n\t\tint start = s.indexOf(\"[\") + 1;\r\n\t\tif(start < 1)\r\n\t\t\tthrow new RuntimeException(\r\n\t\t\t\t\t\"In Raw Datatype column of monitor spreadsheet, subarray notation does not start with \\\"[\\\" (\"\r\n\t\t\t\t\t+ s + \")\");\r\n\r\n\t\tString subString = s.substring(start, end);\r\n\t\tString interpretStrings[] = subString.split(\"-\");\r\n\t\tif(interpretStrings.length != 2)\r\n\t\t\tthrow new RuntimeException(\r\n\t\t\t\t\t\"In Raw Datatype column of monitor spreadsheet, subarray notation does contain a range (\"\r\n\t\t\t\t\t+ s + \")\");\r\n\t\tint index = -1;\r\n\t\ttry {\r\n\t\t\tif(startOrEnd == true)\r\n\t\t\t\tindex = Integer.parseInt(interpretStrings[0]);\r\n\t\t\telse\r\n\t\t\t\tindex = Integer.parseInt(interpretStrings[1]);\r\n\t\t}\r\n\t\tcatch(NumberFormatException err) {\r\n\t\t\tthrow new RuntimeException(\r\n\t\t\t\t\t\"In Raw Datatype column of monitor spreadsheet, subarray notation does not contain an integer as index (\"\r\n\t\t\t\t\t+ s\r\n\t\t\t\t\t+ \", \"\r\n\t\t\t\t\t+ interpretStrings[0]\r\n\t\t\t\t\t                   + interpretStrings[1] + \")\");\r\n\t\t}\r\n\t\treturn index;'"
	 * @generated
	 */
	int findRawSubArrayIndex(String s, boolean startOrEnd);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tString s = WorldDataToDatabaseType();\r\n\t\treturn Character.toUpperCase(s.charAt(0)) + s.substring(1);'"
	 * @generated
	 */
	String WorldDataToDatabaseTypeUpper1();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tString s = WorldDataType();\r\n\t\treturn Character.toUpperCase(s.charAt(0)) + s.substring(1);'"
	 * @generated
	 */
	String WorldDataTypeUpper1();

} // MandCAMB
