/**
 */
package goupxm2thtml.goupdix;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribut</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link goupxm2thtml.goupdix.Attribut#getNom_attr <em>Nom attr</em>}</li>
 *   <li>{@link goupxm2thtml.goupdix.Attribut#getContenu <em>Contenu</em>}</li>
 * </ul>
 *
 * @see goupxm2thtml.goupdix.GoupdixPackage#getAttribut()
 * @model
 * @generated
 */
public interface Attribut extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom attr</b></em>' attribute list.
	 * The list contents are of type {@link goupxm2thtml.goupdix.Attr_Type}.
	 * The literals are from the enumeration {@link goupxm2thtml.goupdix.Attr_Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom attr</em>' attribute list.
	 * @see goupxm2thtml.goupdix.Attr_Type
	 * @see goupxm2thtml.goupdix.GoupdixPackage#getAttribut_Nom_attr()
	 * @model
	 * @generated
	 */
	EList<Attr_Type> getNom_attr();

	/**
	 * Returns the value of the '<em><b>Contenu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contenu</em>' attribute.
	 * @see #setContenu(String)
	 * @see goupxm2thtml.goupdix.GoupdixPackage#getAttribut_Contenu()
	 * @model
	 * @generated
	 */
	String getContenu();

	/**
	 * Sets the value of the '{@link goupxm2thtml.goupdix.Attribut#getContenu <em>Contenu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contenu</em>' attribute.
	 * @see #getContenu()
	 * @generated
	 */
	void setContenu(String value);

} // Attribut
