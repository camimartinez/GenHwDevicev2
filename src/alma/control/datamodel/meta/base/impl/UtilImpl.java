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
package alma.control.datamodel.meta.base.impl;

import alma.control.datamodel.meta.amb.AmbFactory;
import alma.control.datamodel.meta.amb.AmbPackage;
import alma.control.datamodel.meta.base.BasePackage;
import alma.control.datamodel.meta.base.Table;
import alma.control.datamodel.meta.base.Util;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Util</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alma.control.datamodel.meta.base.impl.UtilImpl#getNewline <em>Newline</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.UtilImpl#getTable <em>Table</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.UtilImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.UtilImpl#getMONTH <em>MONTH</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.UtilImpl#getMONTHalt <em>MONT Halt</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.base.impl.UtilImpl#getToRawBytes <em>To Raw Bytes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UtilImpl extends EObjectImpl implements Util {
	/**
	 * The default value of the '{@link #getNewline() <em>Newline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewline()
	 * @!generated
	 * @ordered
	 */
	protected static final String NEWLINE_EDEFAULT = System.getProperty("line.separator");

	/**
	 * The cached value of the '{@link #getNewline() <em>Newline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewline()
	 * @generated
	 * @ordered
	 */
	protected String newline = NEWLINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTable() <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected static final Table TABLE_EDEFAULT = (Table)AmbFactory.eINSTANCE.createFromString(AmbPackage.eINSTANCE.getTableDT(), "BaseFactory.eINSTANCE;");

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasePackage.Literals.UTIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewline() {
		return newline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewline(String newNewline) {
		String oldNewline = newline;
		newline = newNewline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.UTIL__NEWLINE, oldNewline, newline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getTable() {
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(Table newTable) {
		Table oldTable = table;
		table = newTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.UTIL__TABLE, oldTable, table));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxLength() {
		return maxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxLength(int newMaxLength) {
		int oldMaxLength = maxLength;
		maxLength = newMaxLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.UTIL__MAX_LENGTH, oldMaxLength, maxLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String[] getMONTH() {
		return month;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMONTH(String[] newMONTH) {
		String[] oldMONTH = month;
		month = newMONTH;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.UTIL__MONTH, oldMONTH, month));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String[] getMONTHalt() {
		return montHalt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMONTHalt(String[] newMONTHalt) {
		String[] oldMONTHalt = montHalt;
		montHalt = newMONTHalt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.UTIL__MONT_HALT, oldMONTHalt, montHalt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getToRawBytes() {
		if (toRawBytes != null && toRawBytes.eIsProxy()) {
			InternalEObject oldToRawBytes = (InternalEObject)toRawBytes;
			toRawBytes = (Table)eResolveProxy(oldToRawBytes);
			if (toRawBytes != oldToRawBytes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasePackage.UTIL__TO_RAW_BYTES, oldToRawBytes, toRawBytes));
			}
		}
		return toRawBytes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetToRawBytes() {
		return toRawBytes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToRawBytes(Table newToRawBytes) {
		Table oldToRawBytes = toRawBytes;
		toRawBytes = newToRawBytes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.UTIL__TO_RAW_BYTES, oldToRawBytes, toRawBytes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void error(final String msg) {
		System.out.println(msg);
		System.exit(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void RemoveLinesFromFile(final String dirName, final String fileName, final int replace) {
						java.io.PrintStream out = null;
						java.io.LineNumberReader in = null;
						String line = null;
						
						java.io.File file = new java.io.File (dirName,fileName);
						if (!file.isFile())
							error(file.getAbsolutePath() + " is not a file.");
						
						try {
							// Open the input file.
							in = new java.io.LineNumberReader(new java.io.FileReader(file));
							
							// Create the output file.
							String newName = file.getAbsolutePath() + ".tmp";
							out = new java.io.PrintStream (new java.io.FileOutputStream (new java.io.File(newName)));
							
							line = in.readLine();
							// Skip all blank lines at the beginning.
							while (true) {
								if (line != null && line.trim().length() == 0)
									line = in.readLine();
								else
									break;
							}
							boolean blankFound = false;
							while (line != null) {
								if (line.trim().length() == 0) {
									blankFound = true;
								} else {
									if (blankFound) {
										blankFound = false;
										if (replace == 1)
											out.println();
									}
									out.println(line);
								}
								line = in.readLine();
							}
							// Close the input file and the output file.
							in.close();
							out.close();
							// Delete the old file and rename the new file.
							if (!file.delete())
								error("Could not delete " + file.getAbsolutePath());
							java.io.File newFile = new java.io.File (newName);
							newFile.renameTo(file);
						}catch (java.io.IOException err) {
							error(err.toString());
						}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String AltName(final String str) {
		if (str == null || str.length() == 0)
		            return null;
		        String s = str;
		        StringBuffer x = new StringBuffer ();
		        char c = s.charAt(0);
		        x.append(Character.toUpperCase(c));
		        for (int i = 1; i < s.length(); ++i) {
		            c = s.charAt(i);
		            if (c == '_') {
		                do {
		                    ++i;
		                    if (i == s.length())
		                        break;
		                    c = s.charAt(i);
		                } while (c == '_');
		                if (i == s.length())
		                    break;
		                x.append(Character.toUpperCase(c));
		            } else {
		                x.append(Character.toLowerCase(c));
		            }
		        }
		        return x.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String formatDescriptionBase(final String s, final String prefix) {
		if (s == null)
		            return "";
		        String raw = decodeHTMLChars(s);
		        StringBuffer extract = new StringBuffer ();
		        int begin = 0;
		        int current = 0;
		        int len = raw.length();
		        char c = 0;
		        while (current < len) {
		            c = raw.charAt(current);
		            if (c == '&' && (current + 4) <= len && raw.charAt(current + 1) == '#' &&
		                        raw.charAt(current + 2) == '1' && raw.charAt(current + 3) == '0' &&
		                        raw.charAt(current + 4) == ';') {
		                c = ' ';
		                current += 4;
		            }
		            extract.append(c);
		            if ((current - begin) > maxLength && c == ' ') {
		                extract.append(newline);
		                extract.append(prefix);
		                begin = current + 1;
		            }
		            ++current;
		        }
		        return extract.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String formatDescription(final String s) {
		return formatDescriptionBase(s,"");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String formatDescriptionL1(final String s) {
		return formatDescriptionBase(s,"/// ");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String formatDescriptionL2(final String s) {
		return formatDescriptionBase(s,"    /// ");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String formatDescriptionL4(final String s) {
		return formatDescriptionBase(s,"/// ");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String formatDescriptionL5(final String s) {
		return formatDescriptionBase(s,"    /// ");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String descriptionAsString(final String s) {
		if (s == null)
		            return "";
		        String raw = decodeHTMLChars(s);
		        StringBuffer extract = new StringBuffer ();
		        int current = 0;
		        int len = raw.length();
		        char c = 0;
		        while (current < len) {
		            c = raw.charAt(current);
		            if (c == '&' && (current + 4) <= len && raw.charAt(current + 1) == '#' &&
		                        raw.charAt(current + 2) == '1' && raw.charAt(current + 3) == '0' &&
		                        raw.charAt(current + 4) == ';') {
		                c = ' ';
		                current += 4;
		            }
		            extract.append(c);
		            ++current;
		        }
		        return extract.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String decodeHTMLChars(final String s) {
		 if (s == null || s.length() == 0)
		            return s;
		        StringBuffer x = new StringBuffer();
		        int index = 0;
		        int index1 = 0;
		        int index2 = 0;
		        int index3 = 0;
		        int index4 = 0;
		        int current = 0;
		        while (true) {
		            // look for any HTML encoded character
		            index1 = s.indexOf("&lt;", current);
		            index2 = s.indexOf("&gt;", current);
		            index3 = s.indexOf("&amp;", current);
		            index4 = s.indexOf("&#xd;", current);
		            // if there aren't any, we're done
		            if (index1 == -1 && index2 == -1 && index3 == -1 && index4 == -1) {
		                x.append(s.substring(current));
		                break;
		            }
		            // set index to the least value that is not -1
		            index = index1;
		            if (index == -1 || (index2 != -1 && index2 < index))
		                index = index2;
		            if (index == -1 || (index3 != -1 && index3 < index))
		                index = index3;
		            if (index == -1 || (index4 != -1 && index4 < index))
		                index = index4;
		            // append the current text up to index
		            x.append(s.substring(current,index));
		            // append the correct character and skip over the HTML encoded characters
		            if (index == index1) {
		                x.append('<');
		                current = index + 4;
		            } else if (index == index2) {
		                x.append('>');
		                current = index + 4;
		            } else if (index == index3) {
		                x.append('&');
		                current = index + 5;
		            } else if (index == index4) {
		                x.append('\n');
		                current = index + 5;
		            }
		        }
		        return new String (x);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isArray(final String s) {
		return s.endsWith("]") ? true : false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String NumberRawDataTypeBytes(final String s) {
		return (String)TableImpl.RAW_BYTES_EDEFAULT.get(s);
		
	}

	/**
	 * The cached value of the '{@link #getTable() <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	
	protected Table table = TABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_LENGTH_EDEFAULT = 54;

	/**
	 * The cached value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected int maxLength = MAX_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMONTH() <em>MONTH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMONTH()
	 * @!generated
	 * @ordered
	 */
	protected static final String[] MONTH_EDEFAULT = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};

	/**
	 * The cached value of the '{@link #getMONTH() <em>MONTH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMONTH()
	 * @generated
	 * @ordered
	 */
	protected String[] month = MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMONTHalt() <em>MONT Halt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMONTHalt()
	 * @!generated
	 * @ordered
	 */
	protected static final String[] MONT_HALT_EDEFAULT = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};

	/**
	 * The cached value of the '{@link #getMONTHalt() <em>MONT Halt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMONTHalt()
	 * @generated
	 * @ordered
	 */
	protected String[] montHalt = MONT_HALT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getToRawBytes() <em>To Raw Bytes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToRawBytes()
	 * @generated
	 * @ordered
	 */
	protected Table toRawBytes;
	
	public String RawDataTypeTotalBytes(final String s) {
		if (isArray(s)) {
			int b;
			int n = Integer.parseInt(NumberOfItems(s));
			if(s.startsWith("&lt;"))
				return "0";
			if(s.startsWith("["))
				return "0";
			int i = s.indexOf("[");
			b = Integer.parseInt((String)table.getRawBytes().get(s.substring(0,1)));

			String x = Integer.toString(n * b);
			return x;
		}
		return (String)table.getRawBytes().get(s);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String NumberOfItems(final String s) {
				if (s.startsWith("&lt;"))
					return "1";
				if (!isArray(s))
					return "1";
				int i = s.indexOf("[");
				if (i == -1)
					throw new RuntimeException("Invalid syntax in array notation: (" + s + ")");
				String x = s.substring(i + 1, s.length() - 1);
				try {
					int n = Integer.parseInt(x);
				} catch (NumberFormatException err) {
					throw new RuntimeException("Invalid syntax in array notation: (" + s + ")");
				}
				return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRawDataTypeIndex(final String s) {
				if (s.startsWith("&lt;"))
					return 0;
				if (s.startsWith("["))
					return 0; // This isn't really true, but it will pass the validation.
				String x = s;
				if (isArray(s)) {
					int i = s.indexOf("[");
					if (i == -1)
						throw new RuntimeException("Invalid syntax in array notation: (" + s + ")");
					x = s.substring(0, i);
				}
				return 0;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toArrayTime(final String s) {
				    	//The required string date form is "YYYY-MM-DDThh:mm:ss.ssss".
				    	alma.hla.runtime.asdm.types.ArrayTime t = new alma.hla.runtime.asdm.types.ArrayTime ("20" + parseDateString(s,true) + "T00:00:00.0");
				    	long l = t.get();
				    	return Long.toString(l);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String parseDateString(final String s, final boolean alt) {
				int pos = 0;
				int n = s.indexOf('-'); 	if (n == -1) return null;
				String yy = s.substring(pos,n);
				if (yy.startsWith("20"))
					yy = yy.substring(2);
				pos = n + 1;
				n = s.indexOf('-',pos); 	if (n == -1) return null;
				String mm = s.substring(pos,n);
				int nmm = 0;
				try {
					nmm = Integer.parseInt(mm);
				} catch (NumberFormatException err) {
					return null;
				}
				if (nmm < 1 || nmm > 12) return null;
				pos = n + 1;
				n = s.indexOf('T',pos); 	if (n == -1) return null;
				String dd = s.substring(pos,n);
				return yy + '-' + (alt ? montHalt[nmm - 1] : month[nmm - 1]) + '-' + dd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String normalizeNumber(final String wdt, final String value) {
		 if (wdt.equals("boolean"))
				   return normalizeBoolean(value);
			   else if (wdt.equals("double") || wdt.equals("float"))
				   return normalizeFloat(value);
			   else
				   return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String normalizeFloat(final String value) {
			   try {
		          // Does value contain a valid "double" or "float"?
				  Double.parseDouble(value);
		          // Does value contain a decimal point?
		          if (-1 == value.indexOf('.')) {
		        	  // No decimal point found.
				      // Does value contain an exponent?
				      int i = value.indexOf('E');
				      if (-1 != i) {
					      // Insert the ".0" before the "E".
					      String parts[] = value.split("E");
					      return parts[0] + ".0E" + parts[1];
				       } else {
				    	   // No exponent found.
					       // Append the ".0" to the end.
		                   return value + ".0";
				       }
			       } else {
			    	   // value contains a decimal point.  Return it without changes.  
			           return value;
			       }
		       } catch (NumberFormatException de) {
		           try {
		               // Does this contain a valid "integer" or "long"?
		        	   Integer.parseInt(value);
		        	   // Add the missing decimal point and trailing "0".
		        	   return value + ".0";
		       	   } catch (NumberFormatException ie) {
		       		   // This is not a number.
		       		   // Return it as is.
		       		   return value;
		       	   }
		       }
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String normalizeBoolean(final String value) {
			   int indexOfDot = value.indexOf('.');
			   if (-1 == indexOfDot) {
				   return value;
			   } else {
				   return value.substring(0,indexOfDot);
			   }
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstallDir() {
				String dirLocation = null;
				String acsroot = System.getenv("ACSROOT");
				String intlist = System.getenv("INTLIST");
				String introot = System.getenv("INTROOT");
		
				if (acsroot != null && new java.io.File(acsroot + "/lib/ControlGenHwDevicev2").exists()) {
					dirLocation = acsroot + "/lib/ControlGenHwDevicev2";
				}
		
				if (intlist != null ) {
					String dirs[] = intlist.split(":");
					for (int i = 0; i < dirs.length; i++) {
						if (new java.io.File(dirs[i] + "/lib/ControlGenHwDevicev2").exists()) {
							dirLocation = dirs[i] + "/lib/ControlGenHwDevicev2";
							break;
						}
					}
		
				}
		
				if (introot != null && new java.io.File(introot + "/lib/ControlGenHwDevicev2").exists()) {
					dirLocation = introot + "/lib/ControlGenHwDevicev2";
				}  
		
				assert dirLocation != null : "dirLocation is null, this means that I cannot find lib/ControlGenHwDevicev2";
				return dirLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toDatabaseDate(final String s) {
		return parseDateString(s,false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasePackage.UTIL__NEWLINE:
				return getNewline();
			case BasePackage.UTIL__TABLE:
				return getTable();
			case BasePackage.UTIL__MAX_LENGTH:
				return getMaxLength();
			case BasePackage.UTIL__MONTH:
				return getMONTH();
			case BasePackage.UTIL__MONT_HALT:
				return getMONTHalt();
			case BasePackage.UTIL__TO_RAW_BYTES:
				if (resolve) return getToRawBytes();
				return basicGetToRawBytes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BasePackage.UTIL__NEWLINE:
				setNewline((String)newValue);
				return;
			case BasePackage.UTIL__TABLE:
				setTable((Table)newValue);
				return;
			case BasePackage.UTIL__MAX_LENGTH:
				setMaxLength((Integer)newValue);
				return;
			case BasePackage.UTIL__MONTH:
				setMONTH((String[])newValue);
				return;
			case BasePackage.UTIL__MONT_HALT:
				setMONTHalt((String[])newValue);
				return;
			case BasePackage.UTIL__TO_RAW_BYTES:
				setToRawBytes((Table)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BasePackage.UTIL__NEWLINE:
				setNewline(NEWLINE_EDEFAULT);
				return;
			case BasePackage.UTIL__TABLE:
				setTable(TABLE_EDEFAULT);
				return;
			case BasePackage.UTIL__MAX_LENGTH:
				setMaxLength(MAX_LENGTH_EDEFAULT);
				return;
			case BasePackage.UTIL__MONTH:
				setMONTH(MONTH_EDEFAULT);
				return;
			case BasePackage.UTIL__MONT_HALT:
				setMONTHalt(MONT_HALT_EDEFAULT);
				return;
			case BasePackage.UTIL__TO_RAW_BYTES:
				setToRawBytes((Table)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BasePackage.UTIL__NEWLINE:
				return NEWLINE_EDEFAULT == null ? newline != null : !NEWLINE_EDEFAULT.equals(newline);
			case BasePackage.UTIL__TABLE:
				return TABLE_EDEFAULT == null ? table != null : !TABLE_EDEFAULT.equals(table);
			case BasePackage.UTIL__MAX_LENGTH:
				return maxLength != MAX_LENGTH_EDEFAULT;
			case BasePackage.UTIL__MONTH:
				return MONTH_EDEFAULT == null ? month != null : !MONTH_EDEFAULT.equals(month);
			case BasePackage.UTIL__MONT_HALT:
				return MONT_HALT_EDEFAULT == null ? montHalt != null : !MONT_HALT_EDEFAULT.equals(montHalt);
			case BasePackage.UTIL__TO_RAW_BYTES:
				return toRawBytes != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (newline: ");
		result.append(newline);
		result.append(", table: ");
		result.append(table);
		result.append(", maxLength: ");
		result.append(maxLength);
		result.append(", MONTH: ");
		result.append(month);
		result.append(", MONTHalt: ");
		result.append(montHalt);
		result.append(')');
		return result.toString();
	}

} //UtilImpl
