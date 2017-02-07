/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package datamodel.base;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Util</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link datamodel.base.Util#getNewline <em>Newline</em>}</li>
 *   <li>{@link datamodel.base.Util#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link datamodel.base.Util#getMONTH <em>MONTH</em>}</li>
 *   <li>{@link datamodel.base.Util#getMONTHalt <em>MONT Halt</em>}</li>
 *   <li>{@link datamodel.base.Util#getGetRawBytes <em>Get Raw Bytes</em>}</li>
 * </ul>
 * </p>
 *
 * @see datamodel.base.BasePackage#getUtil()
 * @model
 * @generated
 */
public interface Util extends EObject {
	/**
	 * Returns the value of the '<em><b>Newline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Newline</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Newline</em>' attribute.
	 * @see #setNewline(String)
	 * @see datamodel.base.BasePackage#getUtil_Newline()
	 * @model
	 * @generated
	 */
	String getNewline();

	/**
	 * Sets the value of the '{@link datamodel.base.Util#getNewline <em>Newline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Newline</em>' attribute.
	 * @see #getNewline()
	 * @generated
	 */
	void setNewline(String value);

	/**
	 * Returns the value of the '<em><b>Max Length</b></em>' attribute.
	 * The default value is <code>"54"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Length</em>' attribute.
	 * @see #setMaxLength(int)
	 * @see datamodel.base.BasePackage#getUtil_MaxLength()
	 * @model default="54"
	 * @generated
	 */
	int getMaxLength();

	/**
	 * Sets the value of the '{@link datamodel.base.Util#getMaxLength <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' attribute.
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(int value);

	/**
	 * Returns the value of the '<em><b>MONTH</b></em>' attribute.
	 * The default value is <code>"\"JAN\", \"FEB\", \"MAR\", \"APR\", \"MAY\", \"JUN\", \"JUL\", \"AUG\", \"SEP\", \"OCT\", \"NOV\", \"DEC\""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MONTH</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MONTH</em>' attribute.
	 * @see #setMONTH(String[])
	 * @see datamodel.base.BasePackage#getUtil_MONTH()
	 * @model default="\"JAN\", \"FEB\", \"MAR\", \"APR\", \"MAY\", \"JUN\", \"JUL\", \"AUG\", \"SEP\", \"OCT\", \"NOV\", \"DEC\"" dataType="datamodel.base.String1DT"
	 * @generated
	 */
	String[] getMONTH();

	/**
	 * Sets the value of the '{@link datamodel.base.Util#getMONTH <em>MONTH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MONTH</em>' attribute.
	 * @see #getMONTH()
	 * @generated
	 */
	void setMONTH(String[] value);

	/**
	 * Returns the value of the '<em><b>MONT Halt</b></em>' attribute.
	 * The default value is <code>"\"01\", \"02\", \"03\", \"04\", \"05\", \"06\", \"07\", \"08\", \"09\", \"10\", \"11\", \"12\""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MONT Halt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MONT Halt</em>' attribute.
	 * @see #setMONTHalt(String[])
	 * @see datamodel.base.BasePackage#getUtil_MONTHalt()
	 * @model default="\"01\", \"02\", \"03\", \"04\", \"05\", \"06\", \"07\", \"08\", \"09\", \"10\", \"11\", \"12\"" dataType="datamodel.base.String1DT"
	 * @generated
	 */
	String[] getMONTHalt();

	/**
	 * Sets the value of the '{@link datamodel.base.Util#getMONTHalt <em>MONT Halt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MONT Halt</em>' attribute.
	 * @see #getMONTHalt()
	 * @generated
	 */
	void setMONTHalt(String[] value);

	/**
	 * Returns the value of the '<em><b>Get Raw Bytes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Raw Bytes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Raw Bytes</em>' reference.
	 * @see #setGetRawBytes(Table)
	 * @see datamodel.base.BasePackage#getUtil_GetRawBytes()
	 * @model
	 * @generated
	 */
	Table getGetRawBytes();

	/**
	 * Sets the value of the '{@link datamodel.base.Util#getGetRawBytes <em>Get Raw Bytes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Raw Bytes</em>' reference.
	 * @see #getGetRawBytes()
	 * @generated
	 */
	void setGetRawBytes(Table value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='System.out.println(msg);\r\nSystem.exit(0);'"
	 * @generated
	 */
	void error(String msg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\t\t\tjava.io.PrintStream out = null;\r\n\t\t\t\tjava.io.LineNumberReader in = null;\r\n\t\t\t\tString line = null;\r\n\t\t\t\t\r\n\t\t\t\tjava.io.File file = new java.io.File (dirName,fileName);\r\n\t\t\t\tif (!file.isFile())\r\n\t\t\t\t\terror(file.getAbsolutePath() + \" is not a file.\");\r\n\t\t\t\t\r\n\t\t\t\ttry {\r\n\t\t\t\t\t// Open the input file.\r\n\t\t\t\t\tin = new java.io.LineNumberReader(new java.io.FileReader(file));\r\n\t\t\t\t\t\r\n\t\t\t\t\t// Create the output file.\r\n\t\t\t\t\tString newName = file.getAbsolutePath() + \".tmp\";\r\n\t\t\t\t\tout = new java.io.PrintStream (new java.io.FileOutputStream (new java.io.File(newName)));\r\n\t\t\t\t\t\r\n\t\t\t\t\tline = in.readLine();\r\n\t\t\t\t\t// Skip all blank lines at the beginning.\r\n\t\t\t\t\twhile (true) {\r\n\t\t\t\t\t\tif (line != null && line.trim().length() == 0)\r\n\t\t\t\t\t\t\tline = in.readLine();\r\n\t\t\t\t\t\telse\r\n\t\t\t\t\t\t\tbreak;\r\n\t\t\t\t\t}\r\n\t\t\t\t\tboolean blankFound = false;\r\n\t\t\t\t\twhile (line != null) {\r\n\t\t\t\t\t\tif (line.trim().length() == 0) {\r\n\t\t\t\t\t\t\tblankFound = true;\r\n\t\t\t\t\t\t} else {\r\n\t\t\t\t\t\t\tif (blankFound) {\r\n\t\t\t\t\t\t\t\tblankFound = false;\r\n\t\t\t\t\t\t\t\tif (replace == 1)\r\n\t\t\t\t\t\t\t\t\tout.println();\r\n\t\t\t\t\t\t\t}\r\n\t\t\t\t\t\t\tout.println(line);\r\n\t\t\t\t\t\t}\r\n\t\t\t\t\t\tline = in.readLine();\r\n\t\t\t\t\t}\r\n\t\t\t\t\t// Close the input file and the output file.\r\n\t\t\t\t\tin.close();\r\n\t\t\t\t\tout.close();\r\n\t\t\t\t\t// Delete the old file and rename the new file.\r\n\t\t\t\t\tif (!file.delete())\r\n\t\t\t\t\t\terror(\"Could not delete \" + file.getAbsolutePath());\r\n\t\t\t\t\tjava.io.File newFile = new java.io.File (newName);\r\n\t\t\t\t\tnewFile.renameTo(file);\r\n\t\t\t\t}catch (java.io.IOException err) {\r\n\t\t\t\t\terror(err.toString());\r\n\t\t\t\t}'"
	 * @generated
	 */
	void RemoveLinesFromFile(String dirName, String fileName, int replace);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (str == null || str.length() == 0)\r\n            return null;\r\n        String s = str;\r\n        StringBuffer x = new StringBuffer ();\r\n        char c = s.charAt(0);\r\n        x.append(Character.toUpperCase(c));\r\n        for (int i = 1; i < s.length(); ++i) {\r\n            c = s.charAt(i);\r\n            if (c == \'_\') {\r\n                do {\r\n                    ++i;\r\n                    if (i == s.length())\r\n                        break;\r\n                    c = s.charAt(i);\r\n                } while (c == \'_\');\r\n                if (i == s.length())\r\n                    break;\r\n                x.append(Character.toUpperCase(c));\r\n            } else {\r\n                x.append(Character.toLowerCase(c));\r\n            }\r\n        }\r\n        return x.toString();'"
	 * @generated
	 */
	String AltName(String str);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (s == null)\r\n            return \"\";\r\n        String raw = decodeHTMLChars(s);\r\n        StringBuffer extract = new StringBuffer ();\r\n        int begin = 0;\r\n        int current = 0;\r\n        int len = raw.length();\r\n        char c = 0;\r\n        while (current < len) {\r\n            c = raw.charAt(current);\r\n            if (c == \'&\' && (current + 4) <= len && raw.charAt(current + 1) == \'#\' &&\r\n                        raw.charAt(current + 2) == \'1\' && raw.charAt(current + 3) == \'0\' &&\r\n                        raw.charAt(current + 4) == \';\') {\r\n                c = \' \';\r\n                current += 4;\r\n            }\r\n            extract.append(c);\r\n            if ((current - begin) > maxLength && c == \' \') {\r\n                extract.append(newline);\r\n                extract.append(prefix);\r\n                begin = current + 1;\r\n            }\r\n            ++current;\r\n        }\r\n        return extract.toString();'"
	 * @generated
	 */
	String formatDescriptionBase(String s, String prefix);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return formatDescriptionBase(s,\"\");'"
	 * @generated
	 */
	String formatDescription(String s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return formatDescriptionBase(s,\"/// \");'"
	 * @generated
	 */
	String formatDescriptionL1(String s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return formatDescriptionBase(s,\"    /// \");'"
	 * @generated
	 */
	String formatDescriptionL2(String s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return formatDescriptionBase(s,\"/// \");'"
	 * @generated
	 */
	String formatDescriptionL4(String s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return formatDescriptionBase(s,\"    /// \");'"
	 * @generated
	 */
	String formatDescriptionL5(String s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (s == null)\r\n            return \"\";\r\n        String raw = decodeHTMLChars(s);\r\n        StringBuffer extract = new StringBuffer ();\r\n        int current = 0;\r\n        int len = raw.length();\r\n        char c = 0;\r\n        while (current < len) {\r\n            c = raw.charAt(current);\r\n            if (c == \'&\' && (current + 4) <= len && raw.charAt(current + 1) == \'#\' &&\r\n                        raw.charAt(current + 2) == \'1\' && raw.charAt(current + 3) == \'0\' &&\r\n                        raw.charAt(current + 4) == \';\') {\r\n                c = \' \';\r\n                current += 4;\r\n            }\r\n            extract.append(c);\r\n            ++current;\r\n        }\r\n        return extract.toString();'"
	 * @generated
	 */
	String descriptionAsString(String s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body=' if (s == null || s.length() == 0)\r\n            return s;\r\n        StringBuffer x = new StringBuffer();\r\n        int index = 0;\r\n        int index1 = 0;\r\n        int index2 = 0;\r\n        int index3 = 0;\r\n        int index4 = 0;\r\n        int current = 0;\r\n        while (true) {\r\n            // look for any HTML encoded character\r\n            index1 = s.indexOf(\"&lt;\", current);\r\n            index2 = s.indexOf(\"&gt;\", current);\r\n            index3 = s.indexOf(\"&amp;\", current);\r\n            index4 = s.indexOf(\"&#xd;\", current);\r\n            // if there aren\'t any, we\'re done\r\n            if (index1 == -1 && index2 == -1 && index3 == -1 && index4 == -1) {\r\n                x.append(s.substring(current));\r\n                break;\r\n            }\r\n            // set index to the least value that is not -1\r\n            index = index1;\r\n            if (index == -1 || (index2 != -1 && index2 < index))\r\n                index = index2;\r\n            if (index == -1 || (index3 != -1 && index3 < index))\r\n                index = index3;\r\n            if (index == -1 || (index4 != -1 && index4 < index))\r\n                index = index4;\r\n            // append the current text up to index\r\n            x.append(s.substring(current,index));\r\n            // append the correct character and skip over the HTML encoded characters\r\n            if (index == index1) {\r\n                x.append(\'<\');\r\n                current = index + 4;\r\n            } else if (index == index2) {\r\n                x.append(\'>\');\r\n                current = index + 4;\r\n            } else if (index == index3) {\r\n                x.append(\'&\');\r\n                current = index + 5;\r\n            } else if (index == index4) {\r\n                x.append(\'\\n\');\r\n                current = index + 5;\r\n            }\r\n        }\r\n        return new String (x);'"
	 * @generated
	 */
	String decodeHTMLChars(String s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return s.endsWith(\"]\") ? true : false;'"
	 * @generated
	 */
	boolean isArray(String s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return (String)TableImpl.RAW_BYTES_EDEFAULT.get(s);\r\n'"
	 * @generated
	 */
	String NumberRawDataTypeBytes(String s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\t\tif (isArray(s)) {\r\n\t\t\tint b;\r\n\t\t\tint n = Integer.parseInt(NumberOfItems(s));\r\n\t\t\tif(s.startsWith(\"&lt;\"))\r\n\t\t\t\treturn \"0\";\r\n\t\t\tif(s.startsWith(\"[\"))\r\n\t\t\t\treturn \"0\";\r\n\t\t\tint i = s.indexOf(\"[\");\r\n\t\t\tb = Integer.parseInt((String)BaseFactory.eINSTANCE.createTable().getRawBytes().get(s.substring(0,1)));\r\n\r\n\t\t\tString x = Integer.toString(n * b);\r\n\t\t\treturn x;\r\n\t\t}\r\n\t\treturn (String)BaseFactory.eINSTANCE.createTable().getRawBytes().get(s);'"
	 * @generated
	 */
	String RawDataTypeTotalBytes(String s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tif (s.startsWith(\"&lt;\"))\r\n\t\t\treturn \"1\";\r\n\t\tif (!isArray(s))\r\n\t\t\treturn \"1\";\r\n\t\tint i = s.indexOf(\"[\");\r\n\t\tif (i == -1)\r\n\t\t\tthrow new RuntimeException(\"Invalid syntax in array notation: (\" + s + \")\");\r\n\t\tString x = s.substring(i + 1, s.length() - 1);\r\n\t\ttry {\r\n\t\t\tint n = Integer.parseInt(x);\r\n\t\t} catch (NumberFormatException err) {\r\n\t\t\tthrow new RuntimeException(\"Invalid syntax in array notation: (\" + s + \")\");\r\n\t\t}\r\n\t\treturn x;'"
	 * @generated
	 */
	String NumberOfItems(String s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tif (s.startsWith(\"&lt;\"))\r\n\t\t\treturn 0;\r\n\t\tif (s.startsWith(\"[\"))\r\n\t\t\treturn 0; // This isn\'t really true, but it will pass the validation.\r\n\t\tString x = s;\r\n\t\tif (isArray(s)) {\r\n\t\t\tint i = s.indexOf(\"[\");\r\n\t\t\tif (i == -1)\r\n\t\t\t\tthrow new RuntimeException(\"Invalid syntax in array notation: (\" + s + \")\");\r\n\t\t\tx = s.substring(0, i);\r\n\t\t}\r\n\t\treturn 0;\r\n'"
	 * @generated
	 */
	int getRawDataTypeIndex(String s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\t    \t//The required string date form is \"YYYY-MM-DDThh:mm:ss.ssss\".\r\n\t\t    \talma.hla.runtime.asdm.types.ArrayTime t = new alma.hla.runtime.asdm.types.ArrayTime (\"20\" + parseDateString(s,true) + \"T00:00:00.0\");\r\n\t\t    \tlong l = t.get();\r\n\t\t    \treturn Long.toString(l);'"
	 * @generated
	 */
	String toArrayTime(String s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tint pos = 0;\r\n\t\tint n = s.indexOf(\'-\'); \tif (n == -1) return null;\r\n\t\tString yy = s.substring(pos,n);\r\n\t\tif (yy.startsWith(\"20\"))\r\n\t\t\tyy = yy.substring(2);\r\n\t\tpos = n + 1;\r\n\t\tn = s.indexOf(\'-\',pos); \tif (n == -1) return null;\r\n\t\tString mm = s.substring(pos,n);\r\n\t\tint nmm = 0;\r\n\t\ttry {\r\n\t\t\tnmm = Integer.parseInt(mm);\r\n\t\t} catch (NumberFormatException err) {\r\n\t\t\treturn null;\r\n\t\t}\r\n\t\tif (nmm < 1 || nmm > 12) return null;\r\n\t\tpos = n + 1;\r\n\t\tn = s.indexOf(\'T\',pos); \tif (n == -1) return null;\r\n\t\tString dd = s.substring(pos,n);\r\n\t\treturn yy + \'-\' + (alt ? montHalt[nmm - 1] : month[nmm - 1]) + \'-\' + dd;'"
	 * @generated
	 */
	String parseDateString(String s, boolean alt);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body=' if (wdt.equals(\"boolean\"))\r\n\t\t   return normalizeBoolean(value);\r\n\t   else if (wdt.equals(\"double\") || wdt.equals(\"float\"))\r\n\t\t   return normalizeFloat(value);\r\n\t   else\r\n\t\t   return value;'"
	 * @generated
	 */
	String normalizeNumber(String wdt, String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t   try {\r\n          // Does value contain a valid \"double\" or \"float\"?\r\n\t\t  Double.parseDouble(value);\r\n          // Does value contain a decimal point?\r\n          if (-1 == value.indexOf(\'.\')) {\r\n        \t  // No decimal point found.\r\n\t\t      // Does value contain an exponent?\r\n\t\t      int i = value.indexOf(\'E\');\r\n\t\t      if (-1 != i) {\r\n\t\t\t      // Insert the \".0\" before the \"E\".\r\n\t\t\t      String parts[] = value.split(\"E\");\r\n\t\t\t      return parts[0] + \".0E\" + parts[1];\r\n\t\t       } else {\r\n\t\t    \t   // No exponent found.\r\n\t\t\t       // Append the \".0\" to the end.\r\n                   return value + \".0\";\r\n\t\t       }\r\n\t       } else {\r\n\t    \t   // value contains a decimal point.  Return it without changes.  \r\n\t           return value;\r\n\t       }\r\n       } catch (NumberFormatException de) {\r\n           try {\r\n               // Does this contain a valid \"integer\" or \"long\"?\r\n        \t   Integer.parseInt(value);\r\n        \t   // Add the missing decimal point and trailing \"0\".\r\n        \t   return value + \".0\";\r\n       \t   } catch (NumberFormatException ie) {\r\n       \t\t   // This is not a number.\r\n       \t\t   // Return it as is.\r\n       \t\t   return value;\r\n       \t   }\r\n       }'"
	 * @generated
	 */
	String normalizeFloat(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t   int indexOfDot = value.indexOf(\'.\');\r\n\t   if (-1 == indexOfDot) {\r\n\t\t   return value;\r\n\t   } else {\r\n\t\t   return value.substring(0,indexOfDot);\r\n\t   }'"
	 * @generated
	 */
	String normalizeBoolean(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tString dirLocation = null;\r\n\t\tString acsroot = System.getenv(\"ACSROOT\");\r\n\t\tString intlist = System.getenv(\"INTLIST\");\r\n\t\tString introot = System.getenv(\"INTROOT\");\r\n\r\n\t\tif (acsroot != null && new java.io.File(acsroot + \"/lib/ControlGenHwDevice\").exists()) {\r\n\t\t\tdirLocation = acsroot + \"/lib/ControlGenHwDevice\";\r\n\t\t}\r\n\r\n\t\tif (intlist != null ) {\r\n\t\t\tString dirs[] = intlist.split(\":\");\r\n\t\t\tfor (int i = 0; i < dirs.length; i++) {\r\n\t\t\t\tif (new java.io.File(dirs[i] + \"/lib/ControlGenHwDevice\").exists()) {\r\n\t\t\t\t\tdirLocation = dirs[i] + \"/lib/ControlGenHwDevice\";\r\n\t\t\t\t\tbreak;\r\n\t\t\t\t}\r\n\t\t\t}\r\n\r\n\t\t}\r\n\r\n\t\tif (introot != null && new java.io.File(introot + \"/lib/ControlGenHwDevice\").exists()) {\r\n\t\t\tdirLocation = introot + \"/lib/ControlGenHwDevice\";\r\n\t\t}  \r\n\r\n\t\tassert dirLocation != null : \"dirLocation is null, this means that I cannot find lib/ControlGenHwDevice\";\r\n\t\treturn dirLocation;'"
	 * @generated
	 */
	String getInstallDir();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return parseDateString(s,false);'"
	 * @generated
	 */
	String toDatabaseDate(String s);

} // Util
