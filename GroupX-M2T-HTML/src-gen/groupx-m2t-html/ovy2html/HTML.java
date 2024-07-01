/**
 */
package groupx-m2t-html.ovy2html;

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
 *   <li>{@link groupx-m2t-html.ovy2html.HTML#getBalise <em>Balise</em>}</li>
 * </ul>
 *
 * @see groupx-m2t-html.ovy2html.Ovy2htmlPackage#getHTML()
 * @model
 * @generated
 */
public interface HTML extends EObject
{
	/**
	 * Returns the value of the '<em><b>Balise</b></em>' containment reference list.
	 * The list contents are of type {@link groupx-m2t-html.ovy2html.Balise}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balise</em>' containment reference list.
	 * @see groupx-m2t-html.ovy2html.Ovy2htmlPackage#getHTML_Balise()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Balise> getBalise();

} // HTML
