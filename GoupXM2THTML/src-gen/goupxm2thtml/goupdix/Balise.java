/**
 */
package goupxm2thtml.goupdix;

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
 *   <li>{@link goupxm2thtml.goupdix.Balise#getNom <em>Nom</em>}</li>
 *   <li>{@link goupxm2thtml.goupdix.Balise#getBalise <em>Balise</em>}</li>
 *   <li>{@link goupxm2thtml.goupdix.Balise#getAttribut <em>Attribut</em>}</li>
 * </ul>
 *
 * @see goupxm2thtml.goupdix.GoupdixPackage#getBalise()
 * @model
 * @generated
 */
public interface Balise extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute list.
	 * The list contents are of type {@link goupxm2thtml.goupdix.Balise_Type}.
	 * The literals are from the enumeration {@link goupxm2thtml.goupdix.Balise_Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute list.
	 * @see goupxm2thtml.goupdix.Balise_Type
	 * @see goupxm2thtml.goupdix.GoupdixPackage#getBalise_Nom()
	 * @model
	 * @generated
	 */
	EList<Balise_Type> getNom();

	/**
	 * Returns the value of the '<em><b>Balise</b></em>' containment reference list.
	 * The list contents are of type {@link goupxm2thtml.goupdix.Balise}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balise</em>' containment reference list.
	 * @see goupxm2thtml.goupdix.GoupdixPackage#getBalise_Balise()
	 * @model containment="true"
	 * @generated
	 */
	EList<Balise> getBalise();

	/**
	 * Returns the value of the '<em><b>Attribut</b></em>' containment reference list.
	 * The list contents are of type {@link goupxm2thtml.goupdix.Attribut}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribut</em>' containment reference list.
	 * @see goupxm2thtml.goupdix.GoupdixPackage#getBalise_Attribut()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribut> getAttribut();

} // Balise
