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

package datamodel.eth;

import datamodel.base.MainBase;
import datamodel.base.Note;
import datamodel.base.SpreadsheetParser;
import datamodel.base.SpreadsheetValidator;
import datamodel.base.Table;
import datamodel.base.Util;


public interface MyDeviceModel extends datamodel.base.DeviceModel {
	
	MainBase getInfoDevMain();

	
	void setInfoDevMain(MainBase value);

	
	ControlETH getInfoControl();

	
	void setInfoControl(ControlETH value);

	
	MonitorETH getInfoMonitor();

	
	void setInfoMonitor(MonitorETH value);

	
	Util getToEndEth();

	
	void setToEndEth(Util value);

	
	ArchiveETH getInfoArch();

	
	void setInfoArch(ArchiveETH value);

	
	Table getDataSpreadsheet();

	
	void setDataSpreadsheet(Table value);

	
	Note getNotesTo();

	
	void setNotesTo(Note value);

	
	SpreadsheetValidator getValidateSpreadEth();

	
	void setValidateSpreadEth(SpreadsheetValidator value);

	
	SpreadsheetParser getFromSpreadEth();

	
	void setFromSpreadEth(SpreadsheetParser value);

	
	String CreateModel();

	
	String VendorClass();

} // DeviceModel
