package alma.control.datamodel.meta.amb.impl;
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


import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import alma.control.datamodel.meta.amb.AmbPackage;
import alma.control.datamodel.meta.amb.Control;
import alma.control.datamodel.meta.amb.MandC;
import alma.control.datamodel.meta.base.Table;
import alma.control.datamodel.meta.base.Util;
import alma.control.datamodel.meta.base.impl.ControlPointImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.ControlImpl#getMac <em>Mac</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlImpl extends ControlPointImpl implements Control {
	/**
	 * The cached value of the '{@link #getMac() <em>Mac</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMac()
	 * @generated
	 * @ordered
	 */
	protected MandC mac;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmbPackage.Literals.CONTROL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandC getMac() {
		if (mac != null && mac.eIsProxy()) {
			InternalEObject oldMac = (InternalEObject)mac;
			mac = (MandC)eResolveProxy(oldMac);
			if (mac != oldMac) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.CONTROL__MAC, oldMac, mac));
			}
		}
		return mac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandC basicGetMac() {
		return mac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMac(MandC newMac) {
		MandC oldMac = mac;
		mac = newMac;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.CONTROL__MAC, oldMac, mac));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Data() {
		return row[tables.getColNum(sheet, "Data")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Value() {
		return row[tables.getColNum(sheet, "Value")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Returns() {
		return row[tables.getColNum(sheet, "Returns")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Parameter() {
		return row[tables.getColNum(sheet, "Parameter")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Assembly() {
		return mac.Assembly();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String RCA() {
		return mac.RCA();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String RawDataType() {
		return mac.RawDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean TeRelated() {
		return mac.TeRelated();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataType() {
		return mac.WorldDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Scale() {
		return mac.Scale();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Offset() {
		return mac.Offset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String RawDataToCPPType() {
		return mac.RawDataToCPPType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToCPPType() {
		return mac.WorldDataToCPPType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToCORBAType() {
		return mac.WorldDataToCORBAType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToIDLSeqType() {
		return mac.WorldDataToIDLSeqType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToIDLType() {
		return mac.WorldDataToIDLType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToCORBASeqType() {
		return mac.WorldDataToCORBASeqType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToCORBADevIOType() {
		return mac.WorldDataToCORBADevIOType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToJavaType() {
		return mac.WorldDataToJavaType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToDatabaseType() {
		return mac.WorldDataToDatabaseType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToBACIType() {
		return mac.WorldDataToBACIType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRawDataArray() {
		return mac.isRawDataArray();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWorldDataArray() {
		return mac.isWorldDataArray();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String MinRange() {
		return utils.normalizeNumber(WorldDataType(),super.MinRange());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String MaxRange() {
		return utils.normalizeNumber(WorldDataType(),super.MaxRange());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String idlReturns() {
		return (String)tables.getWorldToIDL().get(Returns());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String corbaReturns() {
		return (String)tables.getWorldToCORBA().get(Returns());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String idlDeclaration() {
		String s = idlSignature();
		return s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String idlSignature() {
				String s = "SET_" + CPName();
				if (!Parameter().equals("default")) {
					if (Parameter().equals("void"))
						s += "()";
					else
						s += "(" + idlParameters() + ")";
					if (External()) {
						s +=  " raises(ControlExceptions::CAMBErrorEx, ControlExceptions::INACTErrorEx)";
					}
					return s;
					// This gets the non-default case out of the way.
				}
				// This is the "default" case.
				boolean isTeRelated = TeRelated();
				boolean isExternal = External();
				boolean isArray = isWorldDataArray();
				if (isExternal) {
					if (isArray) {
						s += "(in " + WorldDataToIDLSeqType() + " world";
					} else {
						s += "(in " + WorldDataToIDLType() + " world";
					}
				}
				if (isTeRelated) {
					s += ", in ACS::Time requestTime)";
				} else {
					s += ")";
				}
				if (isExternal) {
					s += " raises(ControlExceptions::CAMBErrorEx, ControlExceptions::INACTErrorEx)";
				}
				return s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String idlParameters() {
						String s = Parameter();
						int pos = 0;
						int n = s.indexOf(' ');
						if (n == -1)
							throw new RuntimeException("Invalid syntax in Parameter field: (" + s + ")");
						String word = s.substring(pos,n);
						String out = "";
						boolean isArray = isWorldDataArray();
						if (isArray) {
							out += "in " + (String)tables.getWorldToIDLSeq().get(word) + " ";
						}
						else
							out = "in " + (String)tables.getWorldToIDL().get(word) + " ";
						pos = n + 1;
						while (true) {
							n = s.indexOf(',',pos);
							if (n == -1)
								break;
							word = s.substring(pos,n);
							out += word + ", ";
							pos = n + 1;
							while (true) {
								if (s.charAt(pos) == ' ')
									pos++;
								else
									break;
							}
							n = s.indexOf(' ',pos);
							if (n == -1)
								throw new RuntimeException("Invalid syntax in Parameter field: (" + s + ")");
							word = s.substring(pos,n);
							if (isArray) {
								String type = (String)tables.getWorldToIDL().get(word);
								type = type.replace("unsigned long", "uLong");
								out += "in " + type;
							}
							else
								out = "in " + (String)tables.getWorldToIDL().get(word) + " ";
							pos = n + 1;
						}
						word = s.substring(pos);
						out += word;
						return out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String corbaDeclaration() {
		String s = "";
		        if (!Parameter().equals("default")) {
		            if (Parameter().equals("void"))
		                s += "()";
		            else
		                s += "(" + corbaParameters() + ")";
		            return s;
		            // This gets the non-default case out of the way.
		        }
		        // This is the "default" case.
		        boolean isTeRelated = TeRelated();
		        boolean isArray = isWorldDataArray();
		        if(isArray == true) {
		            s += "(const " + WorldDataToCORBASeqType() + "& world";
		        }
		        else {
		            String type = WorldDataToCORBAType();
		            if(type.equalsIgnoreCase("CORBA::String") == true) {
		                type = "const " + type + "_var&";
		            }
		
		            s += "(" + type + " world";
		        }
		        if (isTeRelated) {
		            s += ", const acstime::Epoch& requestTime)";
		        }
		        else {
		            s += ")";
		        }
		        return s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String corbaParameters() {
						String s = Parameter();
						int pos = 0;
						int n = s.indexOf(' ');
						if (n == -1)
							throw new RuntimeException("Invalid syntax in Parameter field: (" + s + ")");
						String word = s.substring(pos,n);
						String out = (String)tables.getWorldToCORBA().get(word) + " ";
						pos = n + 1;
						while (true) {
							n = s.indexOf(',',pos);
							if (n == -1)
								break;
							word = s.substring(pos,n);
							out += word + ", ";
							pos = n + 1;
							while (true) {
								if (s.charAt(pos) == ' ')
									pos++;
								else
									break;
							}
							n = s.indexOf(' ',pos);
							if (n == -1)
								throw new RuntimeException("Invalid syntax in Parameter field: (" + s + ")");
							word = s.substring(pos,n);
							out += (String)tables.getWorldToCORBA().get(word);
							pos = n + 1;
						}
						word = s.substring(pos);
						out += word;
						return out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String cppReturns() {
		return (String)tables.getWorldToCPP().get(Returns());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String cppDeclaration() {
		        String s = "";
		        if (!Parameter().equals("default")) {
		            if (Parameter().equals("void"))
		                s += "()";
		            else
		                s += "(" + cppParameters() + ")";
		            return s;
		            // This gets the non-default case out of the way.
		        }
		        // This is the "default" case.
		        boolean isTeRelated = TeRelated();
		        boolean isArray = isWorldDataArray();
		        if (isArray) {
		            s += "(const std::vector< " + WorldDataToCPPType() + " >& world";
		        } else {
		            s += "(const " + WorldDataToCPPType() + " world";
		        }
		        if (isTeRelated) {
		            s += ", const acstime::Epoch& requestTime)";
		        } else {
		            s += ")";
		        }
		        return s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String cppParameters() {
			String s = Parameter();
						int pos = 0;
						int n = s.indexOf(' ');
						if (n == -1)
							throw new RuntimeException("Invalid syntax in Parameter field: (" + s + ")");
						String word = s.substring(pos,n);
						String out = (String)tables.getWorldToCPP().get(word) + " ";
						pos = n + 1;
						while (true) {
							n = s.indexOf(',',pos);
							if (n == -1)
								break;
							word = s.substring(pos,n);
							out += word + ", ";
							pos = n + 1;
							while (true) {
								if (s.charAt(pos) == ' ')
									pos++;
								else
									break;
							}				
							n = s.indexOf(' ',pos);
							if (n == -1)
								throw new RuntimeException("Invalid syntax in Parameter field: (" + s + ")");
							word = s.substring(pos,n);
							out += (String)tables.getWorldToCPP().get(word) + " ";
							pos = n + 1;
						}
						word = s.substring(pos);
						out += word;
						return out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String argList() {
		        if (!Parameter().equals("default")) {
		            if (Parameter().equals("void"))
		                return "";
		            else
		                return argWords();
		            // This gets the non-default case out of the way.
		        }
		        // This is the "default" case.
		        String s = "world";
		        boolean isTeRelated = TeRelated();
		        if (isTeRelated) {
		            s += ", requestTime";
		        }
		        return s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String argWords() {
				String s = Parameter();
				int pos = 0;
				int n = s.indexOf(' ');
				if (n == -1)
					throw new RuntimeException("Invalid syntax in Parameter field: (" + s + ")");
				String word = s.substring(pos,n);
				String out = "";
				pos = n + 1;
				while (true) {
					n = s.indexOf(',',pos);
					if (n == -1)
						break;
					word = s.substring(pos,n);
					out += word + ", ";
					pos = n + 1;
					while (true) {
						if (s.charAt(pos) == ' ')
							pos++;
						else
							break;
					}
					n = s.indexOf(' ',pos);
					if (n == -1)
						throw new RuntimeException("Invalid syntax in Parameter field: (" + s + ")");
					word = s.substring(pos,n);
					pos = n + 1;
				}
				word = s.substring(pos);
				out += word;
				return out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConversion() {
		return mac.isConversion();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSpecialConversion() {
		return mac.isSpecialConversion();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String NumberItemsRawData() {
		return mac.NumberItemsRawData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String TotalBytesRawData() {
		return mac.TotalBytesRawData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String NumberRawDataTypeBytes() {
		return mac.NumberRawDataTypeBytes();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String NumberItemsWorldData() {
		return mac.NumberItemsWorldData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String RCACell() {
		return mac.RCACell();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String TeRelatedCell() {
		return mac.TeRelatedCell();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDependentGroupBit() {
		return mac.isDependentGroupBit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDependentBit() {
		return mac.isDependentBit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDependentElement() {
		return mac.isDependentElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isByteSwapped() {
		return mac.isByteSwapped();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDependentBitElement() {
		return mac.isDependentBitElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDependentArrayElement() {
		return mac.isDependentArrayElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String GetDimension() {
		return mac.GetDimension();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSingleBit() {
		return mac.isSingleBit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBit() {
		return mac.getBit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMask() {
		return mac.getMask();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstBit() {
		return mac.getFirstBit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastBit() {
		return mac.getLastBit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupMask() {
		return mac.getGroupMask();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupEnd() {
		return mac.getGroupEnd();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupStart() {
		return mac.getGroupStart();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String RawSubArrayEndIndex() {
		return mac.RawSubArrayEndIndex();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String RawSubArrayStartIndex() {
		return mac.RawSubArrayStartIndex();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRawSubArray() {
		return mac.isRawSubArray();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorlDataToDatabaseTypeUpper1() {
		return mac.WorldDataToDatabaseTypeUpper1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataTypeUpper1() {
		return mac.WorldDataTypeUpper1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	public void setControlAmb(final String[] row, final Object parent, final Table tables, final Util utils) {
		this.tables = tables;
		this.utils = utils;
		setControlPoint(row, parent, tables, utils);
		mac = new MandCImpl();
		mac.setMandCAmb(row, sheet, this, tables, utils);
		String dir = setParameters();
		ResourceSet mandC = new ResourceSetImpl();
		Resource res = mandC.createResource(URI.createURI(dir));
		res.getContents().add(mac);
	}

	public static String setParameters(){
		Resource.Factory.Registry regis = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> mm = regis.getExtensionToFactoryMap();		
		String extension = "xmi";
		String tmp = "/home/almamgr/alma-src/2014-04-B/CONTROL/Device/HardwareDevice/MOUNT/MountVertexLLama/src/";
		mm.put(extension, new XMIResourceFactoryImpl());

		String xmiArchive = tmp.concat("archiveControl.").concat(extension);

		return xmiArchive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmbPackage.CONTROL__MAC:
				if (resolve) return getMac();
				return basicGetMac();
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
			case AmbPackage.CONTROL__MAC:
				setMac((MandC)newValue);
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
			case AmbPackage.CONTROL__MAC:
				setMac((MandC)null);
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
			case AmbPackage.CONTROL__MAC:
				return mac != null;
		}
		return super.eIsSet(featureID);
	}


	@Override
	public void addDependent(Object son) {
		// TODO Auto-generated method stub

	}

} //ControlImpl
