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
package alma.Control.datamodel.meta.base;


public interface MySpreadsheetParser extends SpreadsheetParser {
	
	
	String getRefPath();

	
	void setRefPath(String value);

	
	boolean isRefStatus();

	
	void setRefStatus(boolean value);

	
	String getXml();

	
	void setXml(String value);

	
	String getXsdFile();

	
	void setXsdFile(String value);

	
	String getNewline();

	
	void setNewline(String value);

	
	Pair getToNewContent();

	
	void setToNewContent(Pair value);

	
	SpreadsheetValidator getTovalidateSpreads();

	
	void setTovalidateSpreads(SpreadsheetValidator value);

	
	String getSpreadsheet(String dirName, String fileName);

	
	Pair getBoundedContent(String s, String beginPart1, String beginPart2, String end);

	
	String[] getDataCells(String row);

	
	String[][][] getWorksheets();

	
	boolean isReference();

	
	String getReference();

	
	void setXSD(String xsd);

	
	String[][][] filter(String doc);

	
	void deleteRow(String[][] worksheet, String name);

	
	void modifyRow(String[][] worksheet, int lineNumber, String rowName, String s);


} // MySpreadsheetParser
