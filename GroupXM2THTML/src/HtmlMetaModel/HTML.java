/**
 */
package HtmlMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HTML</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link HtmlMetaModel.HTML#getBalise <em>Balise</em>}</li>
 * </ul>
 *
 * @see HtmlMetaModel.HtmlMetaModelPackage#getHTML()
 * @model
 * @generated
 */
public interface HTML extends EObject {
	/**
	 * Returns the value of the '<em><b>Balise</b></em>' containment reference list.
	 * The list contents are of type {@link HtmlMetaModel.Balise}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balise</em>' containment reference list.
	 * @see HtmlMetaModel.HtmlMetaModelPackage#getHTML_Balise()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Balise> getBalise();

} // HTML
