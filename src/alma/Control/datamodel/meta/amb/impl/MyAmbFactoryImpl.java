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
package alma.Control.datamodel.meta.amb.impl;

import alma.Control.datamodel.meta.amb.MyAmbFactory;
import alma.Control.datamodel.meta.amb.MyDeviceModel;


/**
 * This is the new Factory class to be used, to create base instances. It inherits from 
 * the generated factory and this factory is bound in the factory_override extension.
 * All overriden code should be defined in this package and instanciated by this factory.
*/
public class MyAmbFactoryImpl extends AmbFactoryImpl implements MyAmbFactory {
	

	public MyAmbFactoryImpl(){
		super();
	}
	
	@Override
	public MyDeviceModel createDeviceModel() {
		MyDeviceModelImpl deviceModel = new MyDeviceModelImpl();
		return deviceModel;
	}


} //MyAmbFactoryImpl