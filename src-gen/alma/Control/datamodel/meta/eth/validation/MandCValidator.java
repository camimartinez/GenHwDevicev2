/**
 *
 * $Id$
 */
package alma.Control.datamodel.meta.eth.validation;

import alma.Control.datamodel.meta.base.Table;

import alma.Control.datamodel.meta.base.impl.BaseFactoryImpl;

/**
 * A sample validator interface for {@link alma.Control.datamodel.meta.eth.MandC}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface MandCValidator {
	boolean validate();

	boolean validateRow(String[] value);
	boolean validateSheet(int value);
	boolean validateAssembly(String value);
	boolean validateAux(BaseFactoryImpl value);
	boolean validateToInfoFromCol(Table value);

	boolean validateGetInfoFromCol(Table value);
}