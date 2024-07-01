/**
 */
package groupx-m2t-html.ovy2html;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Balise</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link groupx-m2t-html.ovy2html.Balise#getParagraphe <em>Paragraphe</em>}</li>
 *   <li>{@link groupx-m2t-html.ovy2html.Balise#getTitre <em>Titre</em>}</li>
 *   <li>{@link groupx-m2t-html.ovy2html.Balise#getGrandtitre <em>Grandtitre</em>}</li>
 * </ul>
 *
 * @see groupx-m2t-html.ovy2html.Ovy2htmlPackage#getBalise()
 * @model abstract="true"
 * @generated
 */
public interface Balise extends EObject
{
	/**
	 * Returns the value of the '<em><b>Paragraphe</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link groupx-m2t-html.ovy2html.Paragraphe#getBalise <em>Balise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragraphe</em>' reference.
	 * @see #setParagraphe(Paragraphe)
	 * @see groupx-m2t-html.ovy2html.Ovy2htmlPackage#getBalise_Paragraphe()
	 * @see groupx-m2t-html.ovy2html.Paragraphe#getBalise
	 * @model opposite="balise"
	 * @generated
	 */
	Paragraphe getParagraphe();

	/**
	 * Sets the value of the '{@link groupx-m2t-html.ovy2html.Balise#getParagraphe <em>Paragraphe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paragraphe</em>' reference.
	 * @see #getParagraphe()
	 * @generated
	 */
	void setParagraphe(Paragraphe value);

	/**
	 * Returns the value of the '<em><b>Titre</b></em>' containment reference list.
	 * The list contents are of type {@link groupx-m2t-html.ovy2html.Titre}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titre</em>' containment reference list.
	 * @see groupx-m2t-html.ovy2html.Ovy2htmlPackage#getBalise_Titre()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Titre> getTitre();

	/**
	 * Returns the value of the '<em><b>Grandtitre</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link groupx-m2t-html.ovy2html.GrandTitre#getBalise <em>Balise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grandtitre</em>' reference.
	 * @see #setGrandtitre(GrandTitre)
	 * @see groupx-m2t-html.ovy2html.Ovy2htmlPackage#getBalise_Grandtitre()
	 * @see groupx-m2t-html.ovy2html.GrandTitre#getBalise
	 * @model opposite="balise"
	 * @generated
	 */
	GrandTitre getGrandtitre();

	/**
	 * Sets the value of the '{@link groupx-m2t-html.ovy2html.Balise#getGrandtitre <em>Grandtitre</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grandtitre</em>' reference.
	 * @see #getGrandtitre()
	 * @generated
	 */
	void setGrandtitre(GrandTitre value);

} // Balise
