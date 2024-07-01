/**
 */
package groupx-m2t-html.ovy2html;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grand Titre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link groupx-m2t-html.ovy2html.GrandTitre#getBalise <em>Balise</em>}</li>
 *   <li>{@link groupx-m2t-html.ovy2html.GrandTitre#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see groupx-m2t-html.ovy2html.Ovy2htmlPackage#getGrandTitre()
 * @model
 * @generated
 */
public interface GrandTitre extends EObject
{
	/**
	 * Returns the value of the '<em><b>Balise</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link groupx-m2t-html.ovy2html.Balise#getGrandtitre <em>Grandtitre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balise</em>' reference.
	 * @see #setBalise(Balise)
	 * @see groupx-m2t-html.ovy2html.Ovy2htmlPackage#getGrandTitre_Balise()
	 * @see groupx-m2t-html.ovy2html.Balise#getGrandtitre
	 * @model opposite="grandtitre"
	 * @generated
	 */
	Balise getBalise();

	/**
	 * Sets the value of the '{@link groupx-m2t-html.ovy2html.GrandTitre#getBalise <em>Balise</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Balise</em>' reference.
	 * @see #getBalise()
	 * @generated
	 */
	void setBalise(Balise value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see groupx-m2t-html.ovy2html.Ovy2htmlPackage#getGrandTitre_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link groupx-m2t-html.ovy2html.GrandTitre#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // GrandTitre
