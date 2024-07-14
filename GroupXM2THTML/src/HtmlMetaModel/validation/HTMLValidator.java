/**
 *
 * $Id$
 */
package HtmlMetaModel.validation;

import HtmlMetaModel.Balise;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link HtmlMetaModel.HTML}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface HTMLValidator {
	boolean validate();

	boolean validateBalise(EList<Balise> value);
}
