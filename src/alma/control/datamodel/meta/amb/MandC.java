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
package alma.control.datamodel.meta.amb;

import alma.control.datamodel.meta.base.MandCBase;

import alma.control.datamodel.meta.base.Util;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mand C</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alma.control.datamodel.meta.amb.MandC#getRow <em>Row</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.MandC#getSheet <em>Sheet</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.MandC#getMask <em>Mask</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.MandC#getMcp <em>Mcp</em>}</li>
 * </ul>
 *
 * @see alma.control.datamodel.meta.amb.AmbPackage#getMandC()
 * @model
 * @generated
 */
public interface MandC extends EObject {
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
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getMandC_Row()
	 * @model dataType="alma.control.datamodel.meta.base.EStringArray"
	 * @generated
	 */
	String[] getRow();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.MandC#getRow <em>Row</em>}' attribute.
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
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getMandC_Sheet()
	 * @model
	 * @generated
	 */
	int getSheet();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.MandC#getSheet <em>Sheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sheet</em>' attribute.
	 * @see #getSheet()
	 * @generated
	 */
	void setSheet(int value);

	/**
	 * Returns the value of the '<em><b>Mcp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mcp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mcp</em>' reference.
	 * @see #setMcp(MandCBase)
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getMandC_Mcp()
	 * @model required="true"
	 * @generated
	 */
	MandCBase getMcp();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.MandC#getMcp <em>Mcp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mcp</em>' reference.
	 * @see #getMcp()
	 * @generated
	 */
	void setMcp(MandCBase value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	String getMask();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.MandC#getMask <em>Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mask</em>' attribute.
	 * @see #getMask()
	 * @generated
	 */
	void setMask(String[] value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[mcp.getTable().getColNum(sheet, \"Assembly\")];'"
	 * @generated
	 */
	String Assembly();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[mcp.getTable().getColNum(sheet, \"RCA\")];'"
	 * @generated
	 */
	String RCA();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[mcp.getTable().getColNum(sheet, \"RCA\")];'"
	 * @generated
	 */
	String RCACell();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tString s = row[mcp.getTable().getColNum(sheet, \"Raw Data Type\")];\n\t\tif(!mcp.isDependent())\n\t\treturn isRawDataArray() ? s.substring(0, s.indexOf(\"[\")) : s;\n\t\tif(mcp instanceof Monitor)\n\t\treturn ((Monitor) mcp.getParent()).RawDataType();\n\t\tif(mcp instanceof Control)\n\t\treturn ((Control) mcp.getParent()).RawDataType();\n\t\treturn \"ERROR\";'"
	 * @generated
	 */
	String RawDataType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[mcp.getTable().getColNum(sheet, \"Raw Data Type\")];'"
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[mcp.getTable().getColNum(sheet, \"TE Related\")];'"
	 * @generated
	 */
	String TeRelatedCell();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='String s = row[mcp.getTable().getColNum(sheet, \"World Data Type\")];\nreturn isWorldDataArray() ? s.substring(0, s.indexOf(\"[\")) : s;'"
	 * @generated
	 */
	String WorldDataType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[mcp.getTable().getColNum(sheet, \"World Data Type\")];'"
	 * @generated
	 */
	String WorldDataTypeCell();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tString s = ScaleCell();\n\t\tif((s.equals(\"none\") == true) || (s.equals(\"extended\") == true) || (s.equals(mcp.getTable().getCelsiusToKelvin()) == true))\n\t\ts = \"1.0\";\n\t\treturn s;'"
	 * @generated
	 */
	String Scale();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\treturn mcp.getUtil().normalizeNumber(WorldDataType(), row[mcp.getTable().getColNum(sheet, \"Scale\")]);\n'"
	 * @generated
	 */
	String ScaleCell();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tString s = ScaleCell();\n\t\t\tif(s.equals(mcp.getTable().getCelsiusToKelvin()))\n\t\t\treturn \"273.15\";\n\t\tString o = OffsetCell();\n\t\t\tif((o.equals(\"0\") == true) || (o.equals(\"none\") == true)\t|| (o.equals(\"extended\") == true))\n\t\t\to = \"0.0\";\n\t\t\treturn o;'"
	 * @generated
	 */
	String Offset();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mcp.getUtil().normalizeNumber(WorldDataType(), row[mcp.getTable().getColNum(sheet, \"Offset\")]);\n'"
	 * @generated
	 */
	String OffsetCell();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return (String)mcp.getTable().getRawToCPP().get(RawDataType());'"
	 * @generated
	 */
	String RawDataToCPPType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return (String)mcp.getTable().getWorldToCPP().get(WorldDataType());'"
	 * @generated
	 */
	String WorldDataToCPPType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return (String)mcp.getTable().getWorldToCORBA().get(WorldDataType());'"
	 * @generated
	 */
	String WorldDataToCORBAType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return (String)mcp.getTable().getWorldToIDLSeq().get(WorldDataType());'"
	 * @generated
	 */
	String WorldDataToIDLSeqType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return (String)mcp.getTable().getWorldToIDL().get(WorldDataType());'"
	 * @generated
	 */
	String WorldDataToIDLType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return (String)mcp.getTable().getWorldToCORBASeq().get(WorldDataType());'"
	 * @generated
	 */
	String WorldDataToCORBASeqType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return (String)mcp.getTable().getWorldToCORBADevIO().get(WorldDataType());'"
	 * @generated
	 */
	String WorldDataToCORBADevIOType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return (String)mcp.getTable().getWorldToJava().get(WorldDataType());'"
	 * @generated
	 */
	String WorldDataToJavaType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return (String)mcp.getTable().getWorldToDatabase().get(WorldDataType());'"
	 * @generated
	 */
	String WorldDataToDatabaseType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return (String)mcp.getTable().getWorldToBACI().get(WorldDataType());'"
	 * @generated
	 */
	String WorldDataToBACIType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tif(ScaleCell().equals(\"none\") &amp;&amp; OffsetCell().equals(\"none\"))\r\n\t\t{\r\n\t\t\treturn false;\r\n\t\t}\r\n\t\telse if(ScaleCell().equals(\"1.0\") &amp;&amp; OffsetCell().equals(\"0.0\"))\r\n\t\t{\r\n\t\t\treturn false;\r\n\t\t}\r\n\t\telse if(ScaleCell().equals(\"1.0\") &amp;&amp; OffsetCell().equals(\"none\"))\r\n\t\t{\r\n\t\t\treturn false;\r\n\t\t}\r\n\t\telse if(ScaleCell().equals(\"none\") &amp;&amp; OffsetCell().equals(\"0.0\"))\r\n\t\t{\r\n\t\t\treturn false;\r\n\t\t}\r\n\r\n\t\treturn true;'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='String s = row[mcp.getTable().getColNum(sheet, \"World Data Type\")];\nreturn s.endsWith(\"]\") ? true : false;'"
	 * @generated
	 */
	boolean isWorldDataArray();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='String s = row[mcp.getTable().getColNum(sheet, \"Raw Data Type\")];\n\t\t\tif(!mcp.isDependent())\n\t\t\treturn s.endsWith(\"]\") ? true : false;\n\t\t\tif(s.startsWith(\"&amp;lt;\") &amp;&amp; s.substring(1).indexOf(\"&amp;lt;\") != -1)\n\t\t\treturn true;\n\t\treturn false;'"
	 * @generated
	 */
	boolean isRawDataArray();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='String s = row[mcp.getTable().getColNum(sheet, \"Raw Data Type\")];\nreturn mcp.getUtil().NumberOfItems(s);'"
	 * @generated
	 */
	String NumberItemsRawData();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='String s = row[mcp.getTable().getColNum(sheet, \"Raw Data Type\")];\nreturn mcp.getUtil().RawDataTypeTotalBytes(s);'"
	 * @generated
	 */
	String TotalBytesRawData();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mcp.getUtil().NumberRawDataTypeBytes(RawDataType());'"
	 * @generated
	 */
	String NumberRawDataTypeBytes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='String s = row[mcp.getTable().getColNum(sheet, \"World Data Type\")];\nreturn mcp.getUtil().NumberOfItems(s);'"
	 * @generated
	 */
	String NumberItemsWorldData();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tif(!mcp.isDependent())\r\n\t\t\treturn false;\r\n\t\tif(isDependentBit() &amp;&amp; RawDataTypeCell().indexOf(\"-\") != -1)\r\n\t\t\treturn true;\r\n\t\treturn false;'"
	 * @generated
	 */
	boolean isDependentGroupBit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tif(!mcp.isDependent())\r\n\t\t\treturn false;\r\n\t\tif(RawDataTypeCell().startsWith(\"&amp;lt;\"))\r\n\t\t\treturn true;\r\n\t\treturn false;'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ((String)mcp.getTable().getRawToByteSwapped().get(RawDataType())).equals(true);'"
	 * @generated
	 */
	boolean isByteSwapped();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tif(!mcp.isDependent())\r\n\t\t\treturn false;\r\n\t\tif(RawDataTypeCell().startsWith(\"&amp;lt;\"))\r\n\t\t\treturn true;\r\n\t\treturn false;'"
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tString s = RawDataTypeCell();\r\n\t\tif(isDependentArrayElement())\r\n\t\t{\r\n\t\t\tint n = s.indexOf(\"]\");\r\n\t\t\treturn s.substring(1, n);\r\n\t\t}\r\n\t\tif(!isRawDataArray())\r\n\t\t\treturn \"0\";\r\n\t\tif(isDependentBitElement())\r\n\t\t{\r\n\t\t\tint n = s.indexOf(\"&amp;gt;\");\r\n\t\t\treturn s.substring(4, n);\r\n\t\t}\r\n\t\treturn \"0\";'"
	 * @generated
	 */
	String GetDimension();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tString s = RawDataTypeCell();\r\n\t\tif(!s.startsWith(\"&amp;lt;\"))// &amp;lt;0&amp;gt;\r\n\t\t\treturn false;\r\n\t\tif(!s.endsWith(\"&amp;gt;\"))\r\n\t\t\treturn false;\r\n\t\tif(s.indexOf(\"-\") == -1)\r\n\t\t\treturn true;\r\n\t\treturn false;'"
	 * @generated
	 */
	boolean isSingleBit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tString s = RawDataTypeCell();\r\n\t\tint n = s.indexOf(\"&amp;gt;\");\r\n\t\treturn s.substring(4, n);'"
	 * @generated
	 */
	String getBit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tString s = RawDataTypeCell();\r\n\t\tif(!s.startsWith(\"&amp;lt;\") || !s.endsWith(\"&amp;gt;\"))\r\n\t\t\treturn \"\";\r\n\t\tif(isSingleBit())\r\n\t\t\treturn getBit();\r\n\t\tint n = s.indexOf(\"-\");\r\n\t\tif(n == -1)\r\n\t\t\treturn \"\";\r\n\t\treturn s.substring(4, n);'"
	 * @generated
	 */
	String getFirstBit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tString s = RawDataTypeCell();\r\n\t\tif(!s.startsWith(\"&amp;lt;\") || !s.endsWith(\"&amp;gt;\"))\r\n\t\t\treturn \"\";\r\n\t\tif(isSingleBit())\r\n\t\t\treturn getBit();\r\n\t\tint n = s.indexOf(\"-\");\r\n\t\tif(n == -1)\r\n\t\t\treturn \"\";\r\n\t\treturn s.substring(n + 1, s.length() - 4);'"
	 * @generated
	 */
	String getLastBit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tString s = RawDataTypeCell();\r\n\t\tif(isRawDataArray())\r\n\t\t{\r\n\t\t\ts = s.substring(4);\r\n\t\t\tint n = s.indexOf(\"&amp;lt;\");\r\n\t\t\tint m = s.substring(n + 4).indexOf(\"&amp;gt;\");\r\n\t\t\tif(n == -1 || m == -1)\r\n\t\t\t\treturn \"\";\r\n\t\t\ts = s.substring(n + 4, m + n + 4);\r\n\t\t}\r\n\t\telse\r\n\t\t{\r\n\t\t\ts = s.substring(4, s.length() - 4);\r\n\t\t}\r\n\t\t// \"s\" is of type \"i-j\"\r\n\t\tint n = s.indexOf(\"-\");\r\n\t\tif(n == -1)\r\n\t\t\treturn \"\";\r\n\t\treturn s.substring(0, n);'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tString firstBit = getGroupStart();\r\n\t\tString lastBit = getGroupEnd();\r\n\t\tint n = Integer.parseInt(firstBit);\r\n\t\tint m = Integer.parseInt(lastBit);\r\n\t\tint intMaskSize = m - n;\r\n\t\tint intMask = 0;\r\n\t\tfor(int i = 0; i &lt;= intMaskSize; i++)\r\n\t\t{\r\n\t\t\tintMask += Math.pow(2, i);\r\n\t\t}\r\n\t\tString mask = \"0x\".concat(Integer.toHexString(intMask).toUpperCase());\r\n\t\treturn mask;'"
	 * @generated
	 */
	String getGroupMask();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tString s = RawDataTypeCell();\r\n\t\tif((s.indexOf(\"[\") != -1) &amp;&amp; (s.indexOf(\"-\") != -1)\r\n\t\t\t\t&amp;&amp; (s.indexOf(\"]\") != -1))\r\n\t\t\treturn true;\r\n\t\treturn false;'"
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tint end = s.indexOf(\"]\");\r\n\t\tif(end == -1)\r\n\t\t\tthrow new RuntimeException(\r\n\t\t\t\t\t\"In Raw Datatype column of monitor spreadsheet, subarray notation does not contain \\\"]\\\" (\"\r\n\t\t\t\t\t+ s + \")\");\r\n\t\tint start = s.indexOf(\"[\") + 1;\r\n\t\tif(start &lt; 1)\r\n\t\t\tthrow new RuntimeException(\r\n\t\t\t\t\t\"In Raw Datatype column of monitor spreadsheet, subarray notation does not start with \\\"[\\\" (\"\r\n\t\t\t\t\t+ s + \")\");\r\n\r\n\t\tString subString = s.substring(start, end);\r\n\t\tString interpretStrings[] = subString.split(\"-\");\r\n\t\tif(interpretStrings.length != 2)\r\n\t\t\tthrow new RuntimeException(\r\n\t\t\t\t\t\"In Raw Datatype column of monitor spreadsheet, subarray notation does contain a range (\"\r\n\t\t\t\t\t+ s + \")\");\r\n\t\tint index = -1;\r\n\t\ttry {\r\n\t\t\tif(startOrEnd == true)\r\n\t\t\t\tindex = Integer.parseInt(interpretStrings[0]);\r\n\t\t\telse\r\n\t\t\t\tindex = Integer.parseInt(interpretStrings[1]);\r\n\t\t}\r\n\t\tcatch(NumberFormatException err) {\r\n\t\t\tthrow new RuntimeException(\r\n\t\t\t\t\t\"In Raw Datatype column of monitor spreadsheet, subarray notation does not contain an integer as index (\"\r\n\t\t\t\t\t+ s\r\n\t\t\t\t\t+ \", \"\r\n\t\t\t\t\t+ interpretStrings[0]\r\n\t\t\t\t\t                   + interpretStrings[1] + \")\");\r\n\t\t}\r\n\t\treturn index;'"
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model rowDataType="alma.control.datamodel.meta.base.EStringArray"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='this.row = row;\nthis.sheet = sheet;\nthis.mcp = mcp;'"
	 * @generated
	 */
	void setInitializeMandCImpl(String[] row, int sheet, MandCBase mcp);

} // MandC
