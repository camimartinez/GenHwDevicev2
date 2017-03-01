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
package alma.buildtime.gen;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.mwe.core.WorkflowEngine;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;

import alma.control.datamodel.meta.base.BaseFactory;

public class LinuxGen {

	public static void main(String[] arg){
		String devType = "AMB";
		if (arg.length < 1) {
			System.out.println("The name of the device must be specified.");
			return;
		}
		if (arg.length < 2) System.out.println("The type of the device was not specified. Default to AMB Device.");
		else devType = arg[1];
		System.out.println(">>>>>GenHwDevice.main Starting code generation for device " + arg[0]);
		System.setProperty("DEVICE_NAME", arg[0]);
		System.setProperty("DEVICE_TYPE", devType);
		String wfFile = BaseFactory.eINSTANCE.createUtil().getInstallDir() + "/config/workflow/generator.mwe";
		Map properties = new HashMap ();
		Map slotContents = new HashMap ();
		
		System.out.println(">>>>>GenHwDevice.main Starting WorkflowEngineRunner");
		new WorkflowEngine().run(wfFile, new NullProgressMonitor(), properties, slotContents);
	}
}