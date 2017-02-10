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
package datamodel.base.impl;

import java.io.IOException;
import java.io.LineNumberReader;
import java.io.StringReader;
import java.util.ArrayList;

import datamodel.amb.impl.MonitorAMBImpl;
import datamodel.base.BaseFactory;
import datamodel.base.BasePackage;
import datamodel.base.MySpreadsheetParser;
import datamodel.base.Pair;
import datamodel.base.SpreadsheetParser;
import datamodel.base.SpreadsheetValidator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;


public class MySpreadsheetParserImpl extends SpreadsheetParserImpl implements MySpreadsheetParser {

	public MySpreadsheetParserImpl(String xml) {
		this.xml = xml;
	}
	
	@Override
	public Pair getBoundedContent(String s, String beginPart1, String beginPart2, String end) {
		int b1 = s.indexOf(beginPart1);
		if (b1 == -1)
			return null;
		int b2 = s.indexOf(beginPart2,b1);
		if (b2 == -1)
			return null;
		int e = s.indexOf(end,b2);
		if (e == -1)
			return null;
		String content = s.substring(b2 + 1,e).trim();
		int n = e + end.length();
		String newS = null;
		if (n < s.length())
			newS = s.substring(n);
		PairImpl pp = new PairImpl(content,newS) {};
		return pp;
	}

	@Override
	public String[] getDataCells(String row) {
		ArrayList list = new ArrayList ();
		String data = null;
		String content = null;
		while (row != null && row.length() > 0) {
			Pair p = getBoundedContent(row,"<Cell",">","</Cell>");
			if (p == null)
				break;
			data = p.getContent();
			row = p.getNewString();
			p = getBoundedContent(data,"<Data",">","</Data>");
			if (p == null)
				continue;
			content = p.getContent();
			list.add(content);
		}
		if(list.size() == 0)
			return null;
		String[] x = new String [list.size()];
		return (String[])list.toArray(x);
	}

	@Override
	public String[][][] getWorksheets() {
		ArrayList rowList = null;
		ArrayList sheetList = null;
		String sheet = null;
		String row = null;
		String[] data = null;
		sheetList = new ArrayList ();
		String doc = new String (xml);
		if (doc.startsWith("@reference")) {
			refStatus = true;
			return filter(doc);
		}
		Pair p = null;
		while (doc != null && doc.length() > 0) {
			p = getBoundedContent(doc,"<Worksheet",">","</Worksheet>");
			if (p == null)
				break;
			sheet = p.getContent();
			doc = p.getNewString();
			rowList = new ArrayList ();
			while (sheet != null && sheet.length() > 0) {
				Pair p2 = getBoundedContent(sheet,"<Row",">","</Row>");
				if (p2 == null)
					break;
				row = p2.getContent();
				sheet = p2.getNewString();
				data = getDataCells(row);
				if (data != null)
					rowList.add(data);
			}
			sheetList.add(rowList);
		}

		if(p == null){
			doc = new String(xml);
			while (doc != null && doc.length() > 0) {
				p = getBoundedContent(doc,"<ss:Worksheet",">","</ss:Worksheet>");
				if(p == null)
					break;
				sheet = p.getContent();
				doc = p.getNewString();
				rowList = new ArrayList ();
				while (sheet != null && sheet.length() > 0) {
					Pair p2 = getBoundedContent(sheet,"<Row",">","</Row>");
					if (p2 == null)
						break;
					row = p2.getContent();
					sheet = p2.getNewString();
					data = getDataCells(row);
					if (data != null)
						rowList.add(data);
				}
				sheetList.add(rowList);
			}
		}


		String[][][] result = new String [sheetList.size()][][];
		for (int i = 0; i < result.length; ++i) {
			ArrayList x = (ArrayList)sheetList.get(i);
			result[i] = new String [x.size()][];
			for (int j = 0; j < result[i].length; ++j) {
				String[] y = (String[])x.get(j);
				result[i][j] = new String [y.length];
				for (int k = 0; k < y.length; ++k)
					result[i][j][k] = y[k];
			}
		}
		return result;
	}

	@Override
	public String[][][] filter(String doc) {
		// A. Get the directory that is referenced, and the old and new assembly names.
		// Syntax: @reference = <base-directory-path-name> <base-assembly-name> = <new-assembly-name>
		LineNumberReader text = new LineNumberReader(new StringReader(doc));
		String line = null;
		try {
			line = text.readLine();
		} catch (IOException err) {
			throw new RuntimeException("Cannot read file: " + err.toString());
		}
		String[] tmp = line.split("[ |\t]+");
		if (!tmp[0].equals("@reference") || !tmp[1].equals("=") || !tmp[4].equals("=")) {
			throw new RuntimeException("Invalid syntax at line number " + text.getLineNumber() + " in file filter.");
		}
		String baseDirectory = tmp[2];
		String baseAssemblyName = tmp[3];
		String newAssemblyName = tmp[5];
		System.out.println("Applying filter in directory " + baseDirectory + 
				" to assembly " + baseAssemblyName + ".  New assembly is " + newAssemblyName + ".");
		
		// B. Get the contents of this base spreadsheet.
		BaseFactory baseFac = BaseFactory.eINSTANCE;
		String referenceXml = baseFac.createSpreadsheetParser().getSpreadsheet(baseDirectory, baseAssemblyName + "_spreadsheet.xml");
		refPath = baseDirectory + "/" + baseAssemblyName + "_spreadsheet.xml";
		SpreadsheetParser p = baseFac.createSpreadsheetParser(referenceXml);
		SpreadsheetValidator v = baseFac.createSpreadsheetValidator();
		if (!v.validate(refPath,xsdFile)) {
			String s = "Spreadsheet " + baseAssemblyName + "_spreadsheet.xml is not a valid spreadsheet.";
			throw new RuntimeException(s);
		}
		System.out.println("Base spreadsheet " + baseAssemblyName + " has been validated.");
		String[][][] base = p.getWorksheets();
		
		// C. Change the assembly name in the base spreadsheet.
		for (int i = 0; i < base.length; ++i) {
			for (int j = 0; j < base[i].length; ++j) {
				if (base[i][j][0].equals(baseAssemblyName)) {
					base[i][j][0] = newAssemblyName;
				}
			}
		}
			
		// D. Apply the filter to the base.
		//    Any deleted rows we will simply make null.
		String[][] worksheet = null;
		while (true) {
			try {
		 		line = text.readLine();
			} catch (IOException err) {
				throw new RuntimeException("Cannot read file: " + err.toString());
			}
			if (line == null)
				break;
			if (line.trim().length() == 0)
				continue;
			if (line.startsWith("Main"))
				worksheet = base[0];
			else if (line.startsWith("EndMain"))
				worksheet = null;
			else if (line.startsWith("Monitor"))
				worksheet = base[1];
			else if (line.startsWith("EndMonitor"))
				worksheet = null;
			else if (line.startsWith("Control"))
				worksheet = base[2];
			else if (line.startsWith("EndControl"))
				worksheet = null;
			else if (line.startsWith("Archive"))
				worksheet = base[3];
			else if (line.startsWith("EndArchive"))
				worksheet = null;
			else {
				if (worksheet == null)
					throw new RuntimeException("Invalid syntax at line number " + text.getLineNumber() + " in file filter. (Missing statement)");
				tmp = line.split("[ |\t]+");
				if (line.startsWith("~")) {
					deleteRow(worksheet,tmp[0].substring(1));
				} else {
					String s = line.substring(tmp[0].length());
					modifyRow(worksheet,text.getLineNumber(),tmp[0],s);
				}
			}
		}
		
		// E. Assign the non-null array.
		String[][][] result = new String [base.length] [] [];
		for (int i = 0; i < result.length; ++i) {
			int nrow = 0;
			for (int j = 0; j < base[i].length; ++j) {
				if (base[i][j] != null)
					++nrow;
			}
			result[i] = new String [nrow] [];
			int jj = 0;
			for (int j = 0; j < base[i].length; ++j) {
				if (base[i][j] != null) {
					result[i][jj] = new String [base[i][j].length];
					for (int k = 0; k < base[i][j].length; ++k)
						result[i][jj][k] = base[i][j][k];
					++jj;
				}
			}
		}
		
		// F. Return the new spreadsheet. 
		return result;
	}


} //MySpreadsheetParserImpl
