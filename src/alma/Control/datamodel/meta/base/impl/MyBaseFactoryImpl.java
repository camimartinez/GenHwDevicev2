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
package alma.Control.datamodel.meta.base.impl;

import org.eclipse.emf.ecore.EDataType;

import alma.Control.datamodel.meta.base.MyBaseFactory;
import alma.Control.datamodel.meta.base.MySpreadsheetParser;


/**
 * This is the new Factory class to be used, to create base instances. It inherits from 
 * the generated factory and this factory is bound in the factory_override extension.
 * All overriden code should be defined in this package and instanciated by this factory.
*/

public class MyBaseFactoryImpl extends BaseFactoryImpl implements MyBaseFactory {
	
	
	@Override
	public MySpreadsheetParser createSpreadsheetParser(String xml) {
		MySpreadsheetParserImpl spreadsheetParser = new MySpreadsheetParserImpl(xml);
		return spreadsheetParser;
	}
	
	@Override
	public String[] createEStringArrayFromString(EDataType eDataType, String initialValue) {
		return initialValue.split("?");
	}
	
	@Override
	public String convertEStringArrayToString(EDataType eDataType, Object instanceValue) {
		String[] array = (String[]) instanceValue;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			sb.append(array[i]);
			if (i<array.length-1) {
				sb.append("?");
			}
		}
		return sb.toString();
	}
	
	@Override
	public String[][][] createEStringArray3FromString(EDataType eDataType, String initialValue) {
		return (String[][][])super.createFromString(initialValue);
	}
	
	@Override
	public String convertEStringArray3ToString(EDataType eDataType, Object instanceValue) {
		String[][][] array = (String[][][])instanceValue;
		String[][][] aux = new String[array.length][][];
		for(int i=0; i < array.length; i++){
			
			
		}
		return null;
	}
	
} //MyBaseFactoryImpl
