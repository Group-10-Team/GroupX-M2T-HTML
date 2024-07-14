/**
 */
package HtmlMetaModel;

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
 *   <li>{@link HtmlMetaModel.Balise#getAttribut <em>Attribut</em>}</li>
 *   <li>{@link HtmlMetaModel.Balise#getBalise <em>Balise</em>}</li>
 *   <li>{@link HtmlMetaModel.Balise#getNom <em>Nom</em>}</li>
 * </ul>
 *
 * @see HtmlMetaModel.HtmlMetaModelPackage#getBalise()
 * @model
 * @generated
 */
public interface Balise extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribut</b></em>' containment reference list.
	 * The list contents are of type {@link HtmlMetaModel.Attribut}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribut</em>' containment reference list.
	 * @see HtmlMetaModel.HtmlMetaModelPackage#getBalise_Attribut()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribut> getAttribut();

	/**
	 * Returns the value of the '<em><b>Balise</b></em>' containment reference list.
	 * The list contents are of type {@link HtmlMetaModel.Balise}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balise</em>' containment reference list.
	 * @see HtmlMetaModel.HtmlMetaModelPackage#getBalise_Balise()
	 * @model containment="true"
	 * @generated
	 */
	EList<Balise> getBalise();

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute list.
	 * The list contents are of type {@link HtmlMetaModel.Balise_Type}.
	 * The literals are from the enumeration {@link HtmlMetaModel.Balise_Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute list.
	 * @see HtmlMetaModel.Balise_Type
	 * @see HtmlMetaModel.HtmlMetaModelPackage#getBalise_Nom()
	 * @model
	 * @generated
	 */
	EList<Balise_Type> getNom();

} // Balise
