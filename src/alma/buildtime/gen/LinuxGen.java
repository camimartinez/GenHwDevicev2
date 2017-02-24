package alma.buildtime.gen;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.mwe.core.WorkflowEngine;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

import alma.Control.datamodel.meta.base.*;

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
		String wfFile=BaseFactory.eINSTANCE.createUtil().getInstallDir() + "/config/workflow/generator.mwe";
		Log log = LogFactory.getLog(WorkflowEngine.class);
		Map properties = new HashMap ();
		Map slotContents = new HashMap ();
		
		System.out.println(">>>>>GenHwDevice.main Starting WorkflowEngineRunner");
		new WorkflowEngine().run(wfFile, (ProgressMonitor) new NullProgressMonitor(), properties, slotContents);
	}
}
