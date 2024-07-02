/**
 */
package goupxm2thtml.goupdix;

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
 *   <li>{@link goupxm2thtml.goupdix.HTML#getBalise <em>Balise</em>}</li>
 * </ul>
 *
 * @see goupxm2thtml.goupdix.GoupdixPackage#getHTML()
 * @model
 * @generated
 */
public interface HTML extends EObject {
	/**
	 * Returns the value of the '<em><b>Balise</b></em>' containment reference list.
	 * The list contents are of type {@link goupxm2thtml.goupdix.Balise}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balise</em>' containment reference list.
	 * @see goupxm2thtml.goupdix.GoupdixPackage#getHTML_Balise()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Balise> getBalise();

} // HTML
