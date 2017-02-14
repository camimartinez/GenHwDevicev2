/**
 *
 * $Id$
 */
package alma.Control.datamodel.meta.eth.validation;

import alma.Control.datamodel.meta.base.MainBase;
import alma.Control.datamodel.meta.base.Note;
import alma.Control.datamodel.meta.base.SpreadsheetParser;
import alma.Control.datamodel.meta.base.SpreadsheetValidator;
import alma.Control.datamodel.meta.base.Table;
import alma.Control.datamodel.meta.base.Util;

import alma.Control.datamodel.meta.eth.Archive;
import alma.Control.datamodel.meta.eth.Control;
import alma.Control.datamodel.meta.eth.Monitor;

/**
 * A sample validator interface for {@link alma.Control.datamodel.meta.eth.DeviceModel}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DeviceModelValidator {
	boolean validate();

	boolean validateInfoDevMain(MainBase value);
	boolean validateInfoControl(Control value);
	boolean validateInfoMonitor(Monitor value);
	boolean validateToEndEth(Util value);
	boolean validateInfoArch(Archive value);
	boolean validateDataSpreadsheet(Table value);
	boolean validateToNotes(Note value);

	boolean validateToValidateSpreadEth(SpreadsheetValidator value);

	boolean validateToSpreadEth(SpreadsheetParser value);

	boolean validateNotesTo(Note value);
	boolean validateValidateSpreadEth(SpreadsheetValidator value);
	boolean validateFromSpreadEth(SpreadsheetParser value);
}