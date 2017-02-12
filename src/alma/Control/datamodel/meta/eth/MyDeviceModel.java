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

package alma.Control.datamodel.meta.eth;

import alma.Control.datamodel.meta.base.MainBase;
import alma.Control.datamodel.meta.base.Note;
import alma.Control.datamodel.meta.base.SpreadsheetParser;
import alma.Control.datamodel.meta.base.SpreadsheetValidator;
import alma.Control.datamodel.meta.base.Table;
import alma.Control.datamodel.meta.base.Util;


public interface MyDeviceModel extends alma.Control.datamodel.meta.base.DeviceModel {
	
	MainBase getInfoDevMain();

	
	void setInfoDevMain(MainBase value);

	
	Control getInfoControl();

	
	void setInfoControl(Control value);

	
	Monitor getInfoMonitor();

	
	void setInfoMonitor(Monitor value);

	
	Util getToEndEth();

	
	void setToEndEth(Util value);

	
	Archive getInfoArch();

	
	void setInfoArch(Archive value);

	
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

} // MyDeviceModel
