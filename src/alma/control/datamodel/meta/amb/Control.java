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

import alma.control.datamodel.meta.base.ControlPoint;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alma.control.datamodel.meta.amb.Control#getMac <em>Mac</em>}</li>
 * </ul>
 *
 * @see alma.control.datamodel.meta.amb.AmbPackage#getControl()
 * @model
 * @generated
 */
public interface Control extends ControlPoint {
	/**
	 * Returns the value of the '<em><b>Mac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mac</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mac</em>' attribute.
	 * @see #setMac(MandC)
	 * @see alma.control.datamodel.meta.amb.AmbPackage#getControl_Mac()
	 * @model dataType="alma.control.datamodel.meta.base.MandCAMBDT"
	 * @generated
	 */
	MandC getMac();

	/**
	 * Sets the value of the '{@link alma.control.datamodel.meta.amb.Control#getMac <em>Mac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mac</em>' attribute.
	 * @see #getMac()
	 * @generated
	 */
	void setMac(MandC value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[getTable().getColNum(sheet, \"Data\")];'"
	 * @generated
	 */
	String Data();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[getTable().getColNum(sheet, \"Value\")];'"
	 * @generated
	 */
	String Value();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[getTable().getColNum(sheet, \"Returns\")];'"
	 * @generated
	 */
	String Returns();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return row[getTable().getColNum(sheet, \"Parameter\")];'"
	 * @generated
	 */
	String Parameter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.Assembly();'"
	 * @generated
	 */
	String Assembly();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.RCA();'"
	 * @generated
	 */
	String RCA();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.RawDataType();'"
	 * @generated
	 */
	String RawDataType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.TeRelated();'"
	 * @generated
	 */
	boolean TeRelated();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.WorldDataType();'"
	 * @generated
	 */
	String WorldDataType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.Scale();'"
	 * @generated
	 */
	String Scale();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.Offset();'"
	 * @generated
	 */
	String Offset();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.RawDataToCPPType();'"
	 * @generated
	 */
	String RawDataToCPPType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.WorldDataToCPPType();'"
	 * @generated
	 */
	String WorldDataToCPPType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.WorldDataToCORBAType();'"
	 * @generated
	 */
	String WorldDataToCORBAType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.WorldDataToIDLSeqType();'"
	 * @generated
	 */
	String WorldDataToIDLSeqType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.WorldDataToIDLType();'"
	 * @generated
	 */
	String WorldDataToIDLType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.WorldDataToCORBASeqType();'"
	 * @generated
	 */
	String WorldDataToCORBASeqType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.WorldDataToCORBADevIOType();'"
	 * @generated
	 */
	String WorldDataToCORBADevIOType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.WorldDataToJavaType();'"
	 * @generated
	 */
	String WorldDataToJavaType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.WorldDataToDatabaseType();'"
	 * @generated
	 */
	String WorldDataToDatabaseType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.WorldDataToBACIType();'"
	 * @generated
	 */
	String WorldDataToBACIType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.isRawDataArray();'"
	 * @generated
	 */
	boolean isRawDataArray();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.isWorldDataArray();'"
	 * @generated
	 */
	boolean isWorldDataArray();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return getUtil().normalizeNumber(WorldDataType(),super.MinRange());'"
	 * @generated
	 */
	String MinRange();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return getUtil().normalizeNumber(WorldDataType(),super.MaxRange());'"
	 * @generated
	 */
	String MaxRange();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return (String)getTable().getWorldToIDL().get(Returns());'"
	 * @generated
	 */
	String idlReturns();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return (String)getTable().getWorldToCORBA().get(Returns());'"
	 * @generated
	 */
	String corbaReturns();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='String s = idlSignature();\r\nreturn s;'"
	 * @generated
	 */
	String idlDeclaration();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tString s = \"SET_\" + CPName();\r\n\t\tif (!Parameter().equals(\"default\")) {\r\n\t\t\tif (Parameter().equals(\"void\"))\r\n\t\t\t\ts += \"()\";\r\n\t\t\telse\r\n\t\t\t\ts += \"(\" + idlParameters() + \")\";\r\n\t\t\tif (External()) {\r\n\t\t\t\ts +=  \" raises(ControlExceptions::CAMBErrorEx, ControlExceptions::INACTErrorEx)\";\r\n\t\t\t}\r\n\t\t\treturn s;\r\n\t\t\t// This gets the non-default case out of the way.\r\n\t\t}\r\n\t\t// This is the \"default\" case.\r\n\t\tboolean isTeRelated = TeRelated();\r\n\t\tboolean isExternal = External();\r\n\t\tboolean isArray = isWorldDataArray();\r\n\t\tif (isExternal) {\r\n\t\t\tif (isArray) {\r\n\t\t\t\ts += \"(in \" + WorldDataToIDLSeqType() + \" world\";\r\n\t\t\t} else {\r\n\t\t\t\ts += \"(in \" + WorldDataToIDLType() + \" world\";\r\n\t\t\t}\r\n\t\t}\r\n\t\tif (isTeRelated) {\r\n\t\t\ts += \", in ACS::Time requestTime)\";\r\n\t\t} else {\r\n\t\t\ts += \")\";\r\n\t\t}\r\n\t\tif (isExternal) {\r\n\t\t\ts += \" raises(ControlExceptions::CAMBErrorEx, ControlExceptions::INACTErrorEx)\";\r\n\t\t}\r\n\t\treturn s;'"
	 * @generated
	 */
	String idlSignature();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tString s = Parameter();\n\t\tint pos = 0;\n\t\tint n = s.indexOf(\' \');\n\t\tif (n == -1)\n\t\tthrow new RuntimeException(\"Invalid syntax in Parameter field: (\" + s + \")\");\n\t\tString word = s.substring(pos,n);\n\t\tString out = \"\";\n\t\tboolean isArray = isWorldDataArray();\n\t\tif (isArray) {\n\t\tout += \"in \" + (String)getTable().getWorldToIDLSeq().get(word) + \" \";\n\t\t}\n\t\telse\n\t\tout = \"in \" + (String)getTable().getWorldToIDL().get(word) + \" \";\n\t\tpos = n + 1;\n\t\twhile (true) {\n\t\tn = s.indexOf(\',\',pos);\n\t\tif (n == -1)\n\t\tbreak;\n\t\tword = s.substring(pos,n);\n\t\tout += word + \", \";\n\t\tpos = n + 1;\n\t\twhile (true) {\n\t\tif (s.charAt(pos) == \' \')\n\t\tpos++;\n\t\telse\n\t\tbreak;\n\t\t}\n\t\tn = s.indexOf(\' \',pos);\n\t\tif (n == -1)\n\t\tthrow new RuntimeException(\"Invalid syntax in Parameter field: (\" + s + \")\");\n\t\tword = s.substring(pos,n);\n\t\tif (isArray) {\n\t\tString type = (String)getTable().getWorldToIDL().get(word);\n\t\ttype = type.replace(\"unsigned long\", \"uLong\");\n\t\tout += \"in \" + type;\n\t\t}\n\t\telse\n\t\tout = \"in \" + (String)getTable().getWorldToIDL().get(word) + \" \";\n\t\tpos = n + 1;\n\t\t}\n\t\tword = s.substring(pos);\n\t\tout += word;\n\t\treturn out;'"
	 * @generated
	 */
	String idlParameters();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='String s = \"\";\r\n        if (!Parameter().equals(\"default\")) {\r\n            if (Parameter().equals(\"void\"))\r\n                s += \"()\";\r\n            else\r\n                s += \"(\" + corbaParameters() + \")\";\r\n            return s;\r\n            // This gets the non-default case out of the way.\r\n        }\r\n        // This is the \"default\" case.\r\n        boolean isTeRelated = TeRelated();\r\n        boolean isArray = isWorldDataArray();\r\n        if(isArray == true)\r\n        {\r\n            s += \"(const \" + WorldDataToCORBASeqType() + \"&amp; world\";\r\n        }\r\n        else\r\n        {\r\n            String type = WorldDataToCORBAType();\r\n            if(type.equalsIgnoreCase(\"CORBA::String\") == true)\r\n            {\r\n                type = \"const \" + type + \"_var&amp;\";\r\n            }\r\n\r\n            s += \"(\" + type + \" world\";\r\n        }\r\n        if (isTeRelated)\r\n        {\r\n            s += \", const acstime::Epoch&amp; requestTime)\";\r\n        }\r\n        else\r\n        {\r\n            s += \")\";\r\n        }\r\n        return s;'"
	 * @generated
	 */
	String corbaDeclaration();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tString s = Parameter();\n\t\tint pos = 0;\n\t\tint n = s.indexOf(\' \');\n\t\tif (n == -1)\n\t\tthrow new RuntimeException(\"Invalid syntax in Parameter field: (\" + s + \")\");\n\t\tString word = s.substring(pos,n);\n\t\tString out = (String)getTable().getWorldToCORBA().get(word) + \" \";\n\t\tpos = n + 1;\n\t\twhile (true) {\n\t\tn = s.indexOf(\',\',pos);\n\t\tif (n == -1)\n\t\tbreak;\n\t\tword = s.substring(pos,n);\n\t\tout += word + \", \";\n\t\tpos = n + 1;\n\t\twhile (true) {\n\t\tif (s.charAt(pos) == \' \')\n\t\tpos++;\n\t\telse\n\t\tbreak;\n\t\t}\n\t\tn = s.indexOf(\' \',pos);\n\t\tif (n == -1)\n\t\tthrow new RuntimeException(\"Invalid syntax in Parameter field: (\" + s + \")\");\n\t\tword = s.substring(pos,n);\n\t\tout += (String)getTable().getWorldToCORBA().get(word);\n\t\tpos = n + 1;\n\t\t}\n\t\tword = s.substring(pos);\n\t\tout += word;\n\t\treturn out;'"
	 * @generated
	 */
	String corbaParameters();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return (String)getTable().getWorldToCPP().get(Returns());'"
	 * @generated
	 */
	String cppReturns();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='        String s = \"\";\r\n        if (!Parameter().equals(\"default\")) {\r\n            if (Parameter().equals(\"void\"))\r\n                s += \"()\";\r\n            else\r\n                s += \"(\" + cppParameters() + \")\";\r\n            return s;\r\n            // This gets the non-default case out of the way.\r\n        }\r\n        // This is the \"default\" case.\r\n        boolean isTeRelated = TeRelated();\r\n        boolean isArray = isWorldDataArray();\r\n        if (isArray) {\r\n            s += \"(const std::vector&lt; \" + WorldDataToCPPType() + \" &gt;&amp; world\";\r\n        } else {\r\n            s += \"(const \" + WorldDataToCPPType() + \" world\";\r\n        }\r\n        if (isTeRelated) {\r\n            s += \", const acstime::Epoch&amp; requestTime)\";\r\n        } else {\r\n            s += \")\";\r\n        }\r\n        return s;'"
	 * @generated
	 */
	String cppDeclaration();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tString s = Parameter();\n\t\tint pos = 0;\n\t\tint n = s.indexOf(\' \');\n\t\tif (n == -1)\n\t\tthrow new RuntimeException(\"Invalid syntax in Parameter field: (\" + s + \")\");\n\t\tString word = s.substring(pos,n);\n\t\tString out = (String)getTable().getWorldToCPP().get(word) + \" \";\n\t\tpos = n + 1;\n\t\twhile (true) {\n\t\tn = s.indexOf(\',\',pos);\n\t\tif (n == -1)\n\t\tbreak;\n\t\tword = s.substring(pos,n);\n\t\tout += word + \", \";\n\t\tpos = n + 1;\n\t\twhile (true) {\n\t\tif (s.charAt(pos) == \' \')\n\t\tpos++;\n\t\telse\n\t\tbreak;\n\t\t}\t\t\t\t\n\t\tn = s.indexOf(\' \',pos);\n\t\tif (n == -1)\n\t\tthrow new RuntimeException(\"Invalid syntax in Parameter field: (\" + s + \")\");\n\t\tword = s.substring(pos,n);\n\t\tout += (String)getTable().getWorldToCPP().get(word) + \" \";\n\t\tpos = n + 1;\n\t\t}\n\t\tword = s.substring(pos);\n\t\tout += word;\n\t\treturn out;'"
	 * @generated
	 */
	String cppParameters();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='        if (!Parameter().equals(\"default\")) {\r\n            if (Parameter().equals(\"void\"))\r\n                return \"\";\r\n            else\r\n                return argWords();\r\n            // This gets the non-default case out of the way.\r\n        }\r\n        // This is the \"default\" case.\r\n        String s = \"world\";\r\n        boolean isTeRelated = TeRelated();\r\n        if (isTeRelated) {\r\n            s += \", requestTime\";\r\n        }\r\n        return s;'"
	 * @generated
	 */
	String argList();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tString s = Parameter();\r\n\t\tint pos = 0;\r\n\t\tint n = s.indexOf(\' \');\r\n\t\tif (n == -1)\r\n\t\t\tthrow new RuntimeException(\"Invalid syntax in Parameter field: (\" + s + \")\");\r\n\t\tString word = s.substring(pos,n);\r\n\t\tString out = \"\";\r\n\t\tpos = n + 1;\r\n\t\twhile (true) {\r\n\t\t\tn = s.indexOf(\',\',pos);\r\n\t\t\tif (n == -1)\r\n\t\t\t\tbreak;\r\n\t\t\tword = s.substring(pos,n);\r\n\t\t\tout += word + \", \";\r\n\t\t\tpos = n + 1;\r\n\t\t\twhile (true) {\r\n\t\t\t\tif (s.charAt(pos) == \' \')\r\n\t\t\t\t\tpos++;\r\n\t\t\t\telse\r\n\t\t\t\t\tbreak;\r\n\t\t\t}\r\n\t\t\tn = s.indexOf(\' \',pos);\r\n\t\t\tif (n == -1)\r\n\t\t\t\tthrow new RuntimeException(\"Invalid syntax in Parameter field: (\" + s + \")\");\r\n\t\t\tword = s.substring(pos,n);\r\n\t\t\tpos = n + 1;\r\n\t\t}\r\n\t\tword = s.substring(pos);\r\n\t\tout += word;\r\n\t\treturn out;'"
	 * @generated
	 */
	String argWords();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.isConversion();'"
	 * @generated
	 */
	boolean isConversion();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.isSpecialConversion();'"
	 * @generated
	 */
	boolean isSpecialConversion();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.NumberItemsRawData();'"
	 * @generated
	 */
	String NumberItemsRawData();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.TotalBytesRawData();'"
	 * @generated
	 */
	String TotalBytesRawData();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.NumberRawDataTypeBytes();'"
	 * @generated
	 */
	String NumberRawDataTypeBytes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.NumberItemsWorldData();'"
	 * @generated
	 */
	String NumberItemsWorldData();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.RCACell();'"
	 * @generated
	 */
	String RCACell();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.TeRelatedCell();'"
	 * @generated
	 */
	String TeRelatedCell();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.isDependentGroupBit();'"
	 * @generated
	 */
	boolean isDependentGroupBit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.isDependentBit();'"
	 * @generated
	 */
	boolean isDependentBit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.isDependentElement();'"
	 * @generated
	 */
	boolean isDependentElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.isByteSwapped();'"
	 * @generated
	 */
	boolean isByteSwapped();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.isDependentBitElement();'"
	 * @generated
	 */
	boolean isDependentBitElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.isDependentArrayElement();'"
	 * @generated
	 */
	boolean isDependentArrayElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.GetDimension();'"
	 * @generated
	 */
	String GetDimension();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.isSingleBit();'"
	 * @generated
	 */
	boolean isSingleBit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.getBit();'"
	 * @generated
	 */
	String getBit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.getMask();'"
	 * @generated
	 */
	String getMask();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.getFirstBit();'"
	 * @generated
	 */
	String getFirstBit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.getLastBit();'"
	 * @generated
	 */
	String getLastBit();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.getGroupMask();'"
	 * @generated
	 */
	String getGroupMask();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.getGroupEnd();'"
	 * @generated
	 */
	String getGroupEnd();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.getGroupStart();'"
	 * @generated
	 */
	String getGroupStart();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.RawSubArrayEndIndex();'"
	 * @generated
	 */
	String RawSubArrayEndIndex();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.RawSubArrayStartIndex();'"
	 * @generated
	 */
	String RawSubArrayStartIndex();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.isRawSubArray();'"
	 * @generated
	 */
	boolean isRawSubArray();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.WorldDataToDatabaseTypeUpper1();'"
	 * @generated
	 */
	String WorlDataToDatabaseTypeUpper1();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return mac.WorldDataTypeUpper1();'"
	 * @generated
	 */
	String WorldDataTypeUpper1();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model rowDataType="alma.control.datamodel.meta.base.EStringArray" parentDataType="alma.control.datamodel.meta.base.ResourceDT"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='setInitializeCP(row, parent);\nmac = new MandCImpl();\nmac.setInitializeMandCImpl(row, sheet, this);'"
	 * @generated
	 */
	void setInitializeCImpl(String[] row, Resource parent);

} // Control
