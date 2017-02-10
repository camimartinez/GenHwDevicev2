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
 */
package datamodel.amb;


public interface MyDeviceModel extends datamodel.base.DeviceModel,datamodel.amb.DeviceModel {
	
	String CreateModel();
	
	/*
	BaseFactoryImpl getTmp();

	
	void setTmp(BaseFactoryImpl value);

	
	ControlPoint getToAddCP();

	
	void setToAddCP(ControlPoint value);

	
	Note getGetNoteFromMain();

	
	void setGetNoteFromMain(Note value);

	
	MonitorPoint getToAddMP();

	
	void setToAddMP(MonitorPoint value);

	
	MainBase getGetInfoMain();

	
	void setGetInfoMain(MainBase value);

	
	ControlAMB getGetCPfromControl();

	
	void setGetCPfromControl(ControlAMB value);

	
	MainAMB getGetInfoFromMainSheet();

	
	void setGetInfoFromMainSheet(MainAMB value);

	
	MonitorAMB getGetMPfromMonitor();

	
	void setGetMPfromMonitor(MonitorAMB value);

	
	Table getGetDataFromSpread();

	
	void setGetDataFromSpread(Table value);

	
	ArchiveAMB getGetAPfromArchive();

	
	void setGetAPfromArchive(ArchiveAMB value);

	
	Util getToinstallEndGeneration();

	
	void setToinstallEndGeneration(Util value);

	
	SpreadsheetParser getGetFromSpreadsheet();

	
	void setGetFromSpreadsheet(SpreadsheetParser value);

	
	SpreadsheetValidator getToValidateSpreadsheet();

	
	void setToValidateSpreadsheet(SpreadsheetValidator value);

	
	GenericMonitorPoints getGetGenericMP();

	
	void setGetGenericMP(GenericMonitorPoints value);

	
	boolean isMonitorDBOnly();

	
	boolean IsGeneratedAlt();

	
	String Parent();

	
	String Cardinality();

	
	String NodeAddress();

	
	String Channel();

	
	String BaseAddress();

	
	boolean GenericMonitorPoints();

	
	

	
	String TheEnd();

	
	String NodeAddressInDecimal();

	
	String HexToDec(String s);
	
	*/

} // MyDeviceModel
