/**
 *
 * $Id$
 */
package alma.Control.datamodel.meta.base.validation;

import alma.Control.datamodel.meta.base.Pair;
import alma.Control.datamodel.meta.base.SpreadsheetValidator;

/**
 * A sample validator interface for {@link alma.Control.datamodel.meta.base.SpreadsheetParser}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SpreadsheetParserValidator {
	boolean validate();

	boolean validateRefPath(String value);
	boolean validateRefStatus(boolean value);
	boolean validateXml(String value);
	boolean validateXsdFile(String value);
	boolean validateNewline(String value);
	boolean validateToNewContent(Pair value);

	boolean validateSetNewContent(Pair value);
	boolean validateTovalidateSpreads(SpreadsheetValidator value);
}
