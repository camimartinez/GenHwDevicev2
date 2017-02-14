/**
 *
 * $Id$
 */
package alma.Control.datamodel.meta.amb.validation;

import alma.Control.datamodel.meta.base.Table;

import alma.Control.datamodel.meta.base.impl.BaseFactoryImpl;

/**
 * A sample validator interface for {@link alma.Control.datamodel.meta.amb.Archive}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ArchiveValidator {
	boolean validate();

	boolean validateBaseFacTmp(BaseFactoryImpl value);
	boolean validateToAssemblyColumn(Table value);

	boolean validateGetAssemblyColumn(Table value);
}