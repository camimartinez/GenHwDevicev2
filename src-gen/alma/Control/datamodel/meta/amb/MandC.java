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
package alma.Control.datamodel.meta.amb;

import alma.Control.datamodel.meta.base.BaseFactory;
import alma.Control.datamodel.meta.base.MandCBase;
import alma.Control.datamodel.meta.base.Table;
import alma.Control.datamodel.meta.base.Util;

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
 *   <li>{@link alma.Control.datamodel.meta.amb.MandC#getRow <em>Row</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.amb.MandC#getSheet <em>Sheet</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.amb.MandC#getMcp <em>Mcp</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.amb.MandC#getAmask <em>Amask</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.amb.MandC#getAux <em>Aux</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.amb.MandC#getToInfoSheet <em>To Info Sheet</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.amb.MandC#getToDataFromMain <em>To Data From Main</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.amb.MandC#getToMPDataType <em>To MP Data Type</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.amb.MandC#getToCPDataType <em>To CP Data Type</em>}</li>
 *   <li>{@link alma.Control.datamodel.meta.amb.MandC#getToUtilsToData <em>To Utils To Data</em>}</li>
 * </ul>
 *
 * @see alma.Control.datamodel.meta.amb.AmbPackage#getMandC()
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
	 * @see alma.Control.datamodel.meta.amb.AmbPackage#getMandC_Row()
	 * @model dataType="alma.Control.datamodel.meta.base.EStringArray"
	 * @generated
	 */
	String[] getRow();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.amb.MandC#getRow <em>Row</em>}' attribute.
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
	 * @see alma.Control.datamodel.meta.amb.AmbPackage#getMandC_Sheet()
	 * @model
	 * @generated
	 */
	int getSheet();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.amb.MandC#getSheet <em>Sheet</em>}' attribute.
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
	 * @see alma.Control.datamodel.meta.amb.AmbPackage#getMandC_Mcp()
	 * @model dataType="alma.Control.datamodel.meta.base.MandCBaseDT" transient="true"
	 * @generated
	 */
	MandCBase getMcp();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.amb.MandC#getMcp <em>Mcp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mcp</em>' attribute.
	 * @see #getMcp()
	 * @generated
	 */
	void setMcp(MandCBase value);

	/**
	 * Returns the value of the '<em><b>Amask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amask</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amask</em>' attribute.
	 * @see #setAmask(String[])
	 * @see alma.Control.datamodel.meta.amb.AmbPackage#getMandC_Amask()
	 * @model dataType="alma.Control.datamodel.meta.base.EStringArray"
	 * @generated
	 */
	String[] getAmask();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.amb.MandC#getAmask <em>Amask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amask</em>' attribute.
	 * @see #getAmask()
	 * @generated
	 */
	void setAmask(String[] value);

	/**
	 * Returns the value of the '<em><b>Aux</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aux</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aux</em>' attribute.
	 * @see #setAux(BaseFactory)
	 * @see alma.Control.datamodel.meta.amb.AmbPackage#getMandC_Aux()
	 * @model dataType="alma.Control.datamodel.meta.amb.BaseFactoryDT"
	 * @generated
	 */
	BaseFactory getAux();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.amb.MandC#getAux <em>Aux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aux</em>' attribute.
	 * @see #getAux()
	 * @generated
	 */
	void setAux(BaseFactory value);

	/**
	 * Returns the value of the '<em><b>To Info Sheet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Info Sheet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Info Sheet</em>' reference.
	 * @see #setToInfoSheet(MandCBase)
	 * @see alma.Control.datamodel.meta.amb.AmbPackage#getMandC_ToInfoSheet()
	 * @model
	 * @generated
	 */
	MandCBase getToInfoSheet();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.amb.MandC#getToInfoSheet <em>To Info Sheet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Info Sheet</em>' reference.
	 * @see #getToInfoSheet()
	 * @generated
	 */
	void setToInfoSheet(MandCBase value);

	/**
	 * Returns the value of the '<em><b>To Data From Main</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Data From Main</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Data From Main</em>' reference.
	 * @see #setToDataFromMain(Table)
	 * @see alma.Control.datamodel.meta.amb.AmbPackage#getMandC_ToDataFromMain()
	 * @model
	 * @generated
	 */
	Table getToDataFromMain();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.amb.MandC#getToDataFromMain <em>To Data From Main</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Data From Main</em>' reference.
	 * @see #getToDataFromMain()
	 * @generated
	 */
	void setToDataFromMain(Table value);

	/**
	 * Returns the value of the '<em><b>To MP Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To MP Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To MP Data Type</em>' reference.
	 * @see #setToMPDataType(Monitor)
	 * @see alma.Control.datamodel.meta.amb.AmbPackage#getMandC_ToMPDataType()
	 * @model
	 * @generated
	 */
	Monitor getToMPDataType();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.amb.MandC#getToMPDataType <em>To MP Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To MP Data Type</em>' reference.
	 * @see #getToMPDataType()
	 * @generated
	 */
	void setToMPDataType(Monitor value);

	/**
	 * Returns the value of the '<em><b>To CP Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To CP Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To CP Data Type</em>' reference.
	 * @see #setToCPDataType(Control)
	 * @see alma.Control.datamodel.meta.amb.AmbPackage#getMandC_ToCPDataType()
	 * @model
	 * @generated
	 */
	Control getToCPDataType();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.amb.MandC#getToCPDataType <em>To CP Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To CP Data Type</em>' reference.
	 * @see #getToCPDataType()
	 * @generated
	 */
	void setToCPDataType(Control value);

	/**
	 * Returns the value of the '<em><b>To Utils To Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Utils To Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Utils To Data</em>' reference.
	 * @see #setToUtilsToData(Util)
	 * @see alma.Control.datamodel.meta.amb.AmbPackage#getMandC_ToUtilsToData()
	 * @model
	 * @generated
	 */
	Util getToUtilsToData();

	/**
	 * Sets the value of the '{@link alma.Control.datamodel.meta.amb.MandC#getToUtilsToData <em>To Utils To Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Utils To Data</em>' reference.
	 * @see #getToUtilsToData()
	 * @generated
	 */
	void setToUtilsToData(Util value);

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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tString s = row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, \"Raw Data Type\")];\r\n\t\tif(!mcp.isDependent())\r\n\t\t\treturn isRawDataArray() ? s.substring(0, s.indexOf(\"[\")) : s;\r\n\t\t\tif(mcp instanceof MonitorImpl)\r\n\t\t\t\treturn ((MonitorImpl) mcp.getParent()).RawDataType();\r\n\t\t\tif(mcp instanceof ControlImpl)\r\n\t\t\t\treturn ((ControlImpl) mcp.getParent()).RawDataType();\r\n\t\t\treturn \"ERROR\";'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='String s = \trow[BaseFactory.eINSTANCE.createTable().getColNum(sheet, \"World Data Type\")];\r\nreturn s.endsWith(\"]\") ? true : false;'"
	 * @generated
	 */
	boolean isWorldDataArray();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tString s = row[BaseFactory.eINSTANCE.createTable().getColNum(sheet, \"Raw Data Type\")];\r\n\t\tif(!mcp.isDependent())\r\n\t\t\treturn s.endsWith(\"]\") ? true : false;\r\n\t\tif(s.startsWith(\"&amp;lt;\") &amp;&amp; s.substring(1).indexOf(\"&amp;lt;\") != -1)\r\n\t\t\treturn true;\r\n\t\treturn false;'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ((String)BaseFactory.eINSTANCE.createTable().getRawToByteSwapped().get(RawDataType())).equals(true);'"
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
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if(!isSingleBit())\r\n\t\t\treturn \"\";\r\n\t\tString s = null;\r\n\t\tif(isRawDataArray())\r\n\t\t{\r\n\t\t\ts = RawDataTypeCell().substring(4);\r\n\t\t\tint n = s.indexOf(\"&amp;lt;\");\r\n\t\t\tint m = s.substring(n + 4).indexOf(\"&amp;gt;\");\r\n\t\t\ts = s.substring(n + 4, m + n + 4);\r\n\t\t}\r\n\t\telse\r\n\t\t{\r\n\t\t\ts = RawDataTypeCell().substring(4, RawDataTypeCell().length() - 4);\r\n\t\t}\r\n\t\tint n = Integer.parseInt(s);\r\n\t\treturn amask[n];'"
	 * @generated
	 */
	String getMask();

} // MandC
