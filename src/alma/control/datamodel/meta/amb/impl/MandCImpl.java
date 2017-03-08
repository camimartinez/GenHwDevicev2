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
package alma.control.datamodel.meta.amb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import alma.control.datamodel.meta.amb.AmbPackage;
import alma.control.datamodel.meta.amb.Control;
import alma.control.datamodel.meta.amb.MandC;
import alma.control.datamodel.meta.amb.Monitor;
import alma.control.datamodel.meta.base.BasePackage;
import alma.control.datamodel.meta.base.MandCBase;
import alma.control.datamodel.meta.base.Util;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mand C</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.MandCImpl#getRow <em>Row</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.MandCImpl#getSheet <em>Sheet</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.MandCImpl#getMask <em>Mask</em>}</li>
 *   <li>{@link alma.control.datamodel.meta.amb.impl.MandCImpl#getMcp <em>Mcp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MandCImpl extends EObjectImpl implements MandC {
	/**
	 * The default value of the '{@link #getRow() <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected static final String[] ROW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRow() <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected String[] row = ROW_EDEFAULT;

	/**
	 * The default value of the '{@link #getSheet() <em>Sheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheet()
	 * @generated
	 * @ordered
	 */
	protected static final int SHEET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSheet() <em>Sheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheet()
	 * @generated
	 * @ordered
	 */
	protected int sheet = SHEET_EDEFAULT;

	/**
	 * The default value of the '{@link #getMask() <em>Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMask()
	 * @!generated
	 * @ordered
	 */
	protected static final String[] MASK_EDEFAULT = {"0x01", "0x02", "0x04", "0x08", "0x10", "0x20", "0x40", "0x80"};

	/**
	 * The cached value of the '{@link #getMask() <em>Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMask()
	 * @generated
	 * @ordered
	 */
	protected String[] mask = MASK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMcp() <em>Mcp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMcp()
	 * @generated
	 * @ordered
	 */
	protected MandCBase mcp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MandCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmbPackage.Literals.MAND_C;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String[] getRow() {
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRow(String[] newRow) {
		String[] oldRow = row;
		row = newRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.MAND_C__ROW, oldRow, row));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSheet() {
		return sheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSheet(int newSheet) {
		int oldSheet = sheet;
		sheet = newSheet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.MAND_C__SHEET, oldSheet, sheet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandCBase getMcp() {
		if (mcp != null && mcp.eIsProxy()) {
			InternalEObject oldMcp = (InternalEObject)mcp;
			mcp = (MandCBase)eResolveProxy(oldMcp);
			if (mcp != oldMcp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AmbPackage.MAND_C__MCP, oldMcp, mcp));
			}
		}
		return mcp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandCBase basicGetMcp() {
		return mcp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMcp(MandCBase newMcp) {
		MandCBase oldMcp = mcp;
		mcp = newMcp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.MAND_C__MCP, oldMcp, mcp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	 */
	public String getMask() {
		if(!isSingleBit())
			return "";
		String s = null;
		if(isRawDataArray()) {
			s = RawDataTypeCell().substring(4);
			int n = s.indexOf("&lt;");
			int m = s.substring(n + 4).indexOf("&gt;");
			s = s.substring(n + 4, m + n + 4);
		}
		else {
			s = RawDataTypeCell().substring(4, RawDataTypeCell().length() - 4);
		}
		int n = Integer.parseInt(s);
		return mask[n];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMask(String[] newMask) {
		String[] oldMask = mask;
		mask = newMask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmbPackage.MAND_C__MASK, oldMask, mask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	
	private Object getObjectByInstanceClass(){
		Object object = EcoreUtil.getObjectByType(eAdapters(), BasePackage.Literals.TABLE);
		if(object instanceof Table){
			return object;
		}else{
			System.out.println("The is no Object for instance Table in: amb/MandCImpl");
			return "The is no Object for instance Table in: amb/MandCImpl";
		}
	}
	
	Table table = (Table)getObjectByInstanceClass();
	 */
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Assembly() {
		return row[mcp.getTable().getColNum(sheet, "Assembly")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String RCA() {
		return row[mcp.getTable().getColNum(sheet, "RCA")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String RCACell() {
		return row[mcp.getTable().getColNum(sheet, "RCA")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String RawDataType() {
				String s = row[mcp.getTable().getColNum(sheet, "Raw Data Type")];
				if(!mcp.isDependent())
				return isRawDataArray() ? s.substring(0, s.indexOf("[")) : s;
				if(mcp instanceof Monitor)
				return ((Monitor) mcp.getParent()).RawDataType();
				if(mcp instanceof Control)
				return ((Control) mcp.getParent()).RawDataType();
				return "ERROR";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String RawDataTypeCell() {
		return row[mcp.getTable().getColNum(sheet, "Raw Data Type")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean TeRelated() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String TeRelatedCell() {
		return row[mcp.getTable().getColNum(sheet, "TE Related")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataType() {
		String s = row[mcp.getTable().getColNum(sheet, "World Data Type")];
		return isWorldDataArray() ? s.substring(0, s.indexOf("[")) : s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataTypeCell() {
		return row[mcp.getTable().getColNum(sheet, "World Data Type")];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Scale() {
				String s = ScaleCell();
				if((s.equals("none") == true) || (s.equals("extended") == true) || (s.equals(mcp.getTable().getCelsiusToKelvin()) == true))
				s = "1.0";
				return s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @!generated
	
	private Object getObjectByInstanceClassUtil(){
		Object object = EcoreUtil.getObjectByType(eAdapters(), BasePackage.Literals.UTIL);
		if(object instanceof Util){
			return object;
		}else{
			System.out.println("The is no Object for instance Util in: amb/ControlImpl");
			return "The is no Object for instance Util in: amb/ControlImpl";
		}
	}
	
	Util util = (Util)getObjectByInstanceClassUtil();
	 */
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String ScaleCell() {
				return mcp.getUtil().normalizeNumber(WorldDataType(), row[mcp.getTable().getColNum(sheet, "Scale")]);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String Offset() {
				String s = ScaleCell();
					if(s.equals(mcp.getTable().getCelsiusToKelvin()))
					return "273.15";
				String o = OffsetCell();
					if((o.equals("0") == true) || (o.equals("none") == true)	|| (o.equals("extended") == true))
					o = "0.0";
					return o;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String OffsetCell() {
		return mcp.getUtil().normalizeNumber(WorldDataType(), row[mcp.getTable().getColNum(sheet, "Offset")]);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String RawDataToCPPType() {
		return (String)mcp.getTable().getRawToCPP().get(RawDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToCPPType() {
		return (String)mcp.getTable().getWorldToCPP().get(WorldDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToCORBAType() {
		return (String)mcp.getTable().getWorldToCORBA().get(WorldDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToIDLSeqType() {
		return (String)mcp.getTable().getWorldToIDLSeq().get(WorldDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToIDLType() {
		return (String)mcp.getTable().getWorldToIDL().get(WorldDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToCORBASeqType() {
		return (String)mcp.getTable().getWorldToCORBASeq().get(WorldDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToCORBADevIOType() {
		return (String)mcp.getTable().getWorldToCORBADevIO().get(WorldDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToJavaType() {
		return (String)mcp.getTable().getWorldToJava().get(WorldDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToDatabaseType() {
		return (String)mcp.getTable().getWorldToDatabase().get(WorldDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToBACIType() {
		return (String)mcp.getTable().getWorldToBACI().get(WorldDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConversion() {
				if(ScaleCell().equals("none") && OffsetCell().equals("none")) {
					return false;
				}
				else if(ScaleCell().equals("1.0") && OffsetCell().equals("0.0")) {
					return false;
				}
				else if(ScaleCell().equals("1.0") && OffsetCell().equals("none")) {
					return false;
				}
				else if(ScaleCell().equals("none") && OffsetCell().equals("0.0")) {
					return false;
				}
		
				return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSpecialConversion() {
		return ScaleCell().equals("extended");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWorldDataArray() {
		String s = row[mcp.getTable().getColNum(sheet, "World Data Type")];
		return s.endsWith("]") ? true : false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRawDataArray() {
		String s = row[mcp.getTable().getColNum(sheet, "Raw Data Type")];
					if(!mcp.isDependent())
					return s.endsWith("]") ? true : false;
					if(s.startsWith("&lt;") && s.substring(1).indexOf("&lt;") != -1)
					return true;
				return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String NumberItemsRawData() {
		String s = row[mcp.getTable().getColNum(sheet, "Raw Data Type")];
		return mcp.getUtil().NumberOfItems(s);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String TotalBytesRawData() {
		String s = row[mcp.getTable().getColNum(sheet, "Raw Data Type")];
		return mcp.getUtil().RawDataTypeTotalBytes(s);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String NumberRawDataTypeBytes() {
		return mcp.getUtil().NumberRawDataTypeBytes(RawDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String NumberItemsWorldData() {
		String s = row[mcp.getTable().getColNum(sheet, "World Data Type")];
		return mcp.getUtil().NumberOfItems(s);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDependentGroupBit() {
				if(!mcp.isDependent())
					return false;
				if(isDependentBit() && RawDataTypeCell().indexOf("-") != -1)
					return true;
				return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDependentBit() {
				if(!mcp.isDependent())
					return false;
				if(RawDataTypeCell().startsWith("&lt;"))
					return true;
				return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDependentElement() {
				if(!mcp.isDependent())
					return false;
				if(RawDataTypeCell().startsWith("["))
					return true;
				return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isByteSwapped() {
		return ((String)mcp.getTable().getRawToByteSwapped().get(RawDataType())).equals(true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDependentBitElement() {
				if(!mcp.isDependent())
					return false;
				if(RawDataTypeCell().startsWith("&lt;"))
					return true;
				return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDependentArrayElement() {
				if(!mcp.isDependent())
					return false;
				if(RawDataTypeCell().startsWith("["))
					return true;
				return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String GetDimension() {
				String s = RawDataTypeCell();
				if(isDependentArrayElement()) {
					int n = s.indexOf("]");
					return s.substring(1, n);
				}
				if(!isRawDataArray())
					return "0";
				if(isDependentBitElement()) {
					int n = s.indexOf("&gt;");
					return s.substring(4, n);
				}
				return "0";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSingleBit() {
				String s = RawDataTypeCell();
				if(!s.startsWith("&lt;"))// &lt;0&gt;
					return false;
				if(!s.endsWith("&gt;"))
					return false;
				if(s.indexOf("-") == -1)
					return true;
				return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBit() {
				String s = RawDataTypeCell();
				int n = s.indexOf("&gt;");
				return s.substring(4, n);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstBit() {
				String s = RawDataTypeCell();
				if(!s.startsWith("&lt;") || !s.endsWith("&gt;"))
					return "";
				if(isSingleBit())
					return getBit();
				int n = s.indexOf("-");
				if(n == -1)
					return "";
				return s.substring(4, n);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastBit() {
				String s = RawDataTypeCell();
				if(!s.startsWith("&lt;") || !s.endsWith("&gt;"))
					return "";
				if(isSingleBit())
					return getBit();
				int n = s.indexOf("-");
				if(n == -1)
					return "";
				return s.substring(n + 1, s.length() - 4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupStart() {
				String s = RawDataTypeCell();
				if(isRawDataArray()) {
					s = s.substring(4);
					int n = s.indexOf("&lt;");
					int m = s.substring(n + 4).indexOf("&gt;");
					if(n == -1 || m == -1)
						return "";
					s = s.substring(n + 4, m + n + 4);
				}
				else {
					s = s.substring(4, s.length() - 4);
				}
				// "s" is of type "i-j"
				int n = s.indexOf("-");
				if(n == -1)
					return "";
				return s.substring(0, n);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupEnd() {
				String s = RawDataTypeCell();
				int n = s.indexOf("-");
				if(n == -1)
					return "";
				return s.substring(n + 1, s.length() - 4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupMask() {
				String firstBit = getGroupStart();
				String lastBit = getGroupEnd();
				int n = Integer.parseInt(firstBit);
				int m = Integer.parseInt(lastBit);
				int intMaskSize = m - n;
				int intMask = 0;
				for(int i = 0; i <= intMaskSize; i++) {
					intMask += Math.pow(2, i);
				}
				String mask = "0x".concat(Integer.toHexString(intMask).toUpperCase());
				return mask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRawSubArray() {
				String s = RawDataTypeCell();
				if((s.indexOf("[") != -1) && (s.indexOf("-") != -1)
						&& (s.indexOf("]") != -1))
					return true;
				return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String RawSubArrayStartIndex() {
				String s = RawDataTypeCell();
				return String.valueOf(findRawSubArrayIndex(s, true));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String RawSubArrayEndIndex() {
				String s = RawDataTypeCell();
				return String.valueOf(findRawSubArrayIndex(s, false));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int findRawSubArrayIndex(final String s, final boolean startOrEnd) {
				int end = s.indexOf("]");
				if(end == -1)
					throw new RuntimeException(
							"In Raw Datatype column of monitor spreadsheet, subarray notation does not contain \"]\" ("
							+ s + ")");
				int start = s.indexOf("[") + 1;
				if(start < 1)
					throw new RuntimeException(
							"In Raw Datatype column of monitor spreadsheet, subarray notation does not start with \"[\" ("
							+ s + ")");
		
				String subString = s.substring(start, end);
				String interpretStrings[] = subString.split("-");
				if(interpretStrings.length != 2)
					throw new RuntimeException(
							"In Raw Datatype column of monitor spreadsheet, subarray notation does contain a range ("
							+ s + ")");
				int index = -1;
				try {
					if(startOrEnd == true)
						index = Integer.parseInt(interpretStrings[0]);
					else
						index = Integer.parseInt(interpretStrings[1]);
				}
				catch(NumberFormatException err) {
					throw new RuntimeException(
							"In Raw Datatype column of monitor spreadsheet, subarray notation does not contain an integer as index ("
							+ s
							+ ", "
							+ interpretStrings[0]
							                   + interpretStrings[1] + ")");
				}
				return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataToDatabaseTypeUpper1() {
				String s = WorldDataToDatabaseType();
				return Character.toUpperCase(s.charAt(0)) + s.substring(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String WorldDataTypeUpper1() {
				String s = WorldDataType();
				return Character.toUpperCase(s.charAt(0)) + s.substring(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitializeMandCImpl(final String[] row, final int sheet, final MandCBase mcp) {
		this.row = row;
		this.sheet = sheet;
		this.mcp = mcp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmbPackage.MAND_C__ROW:
				return getRow();
			case AmbPackage.MAND_C__SHEET:
				return getSheet();
			case AmbPackage.MAND_C__MASK:
				return getMask();
			case AmbPackage.MAND_C__MCP:
				if (resolve) return getMcp();
				return basicGetMcp();
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
			case AmbPackage.MAND_C__ROW:
				setRow((String[])newValue);
				return;
			case AmbPackage.MAND_C__SHEET:
				setSheet((Integer)newValue);
				return;
			case AmbPackage.MAND_C__MASK:
				setMask((String[])newValue);
				return;
			case AmbPackage.MAND_C__MCP:
				setMcp((MandCBase)newValue);
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
			case AmbPackage.MAND_C__ROW:
				setRow(ROW_EDEFAULT);
				return;
			case AmbPackage.MAND_C__SHEET:
				setSheet(SHEET_EDEFAULT);
				return;
			case AmbPackage.MAND_C__MASK:
				setMask(MASK_EDEFAULT);
				return;
			case AmbPackage.MAND_C__MCP:
				setMcp((MandCBase)null);
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
			case AmbPackage.MAND_C__ROW:
				return ROW_EDEFAULT == null ? row != null : !ROW_EDEFAULT.equals(row);
			case AmbPackage.MAND_C__SHEET:
				return sheet != SHEET_EDEFAULT;
			case AmbPackage.MAND_C__MASK:
				return MASK_EDEFAULT == null ? mask != null : !MASK_EDEFAULT.equals(mask);
			case AmbPackage.MAND_C__MCP:
				return mcp != null;
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
		result.append(" (row: ");
		result.append(row);
		result.append(", sheet: ");
		result.append(sheet);
		result.append(", mask: ");
		result.append(mask);
		result.append(')');
		return result.toString();
	}

} //MandCImpl
