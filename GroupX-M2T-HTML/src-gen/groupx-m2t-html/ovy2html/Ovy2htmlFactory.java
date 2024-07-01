/**
 */
package groupx-m2t-html.ovy2html;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see groupx-m2t-html.ovy2html.Ovy2htmlPackage
 * @generated
 */
public interface Ovy2htmlFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Ovy2htmlFactory eINSTANCE = groupx-m2t-html.ovy2html.impl.Ovy2htmlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>HTML</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HTML</em>'.
	 * @generated
	 */
	HTML createHTML();

	/**
	 * Returns a new object of class '<em>Grand Titre</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grand Titre</em>'.
	 * @generated
	 */
	GrandTitre createGrandTitre();

	/**
	 * Returns a new object of class '<em>Paragraphe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Paragraphe</em>'.
	 * @generated
	 */
	Paragraphe createParagraphe();

	/**
	 * Returns a new object of class '<em>Titre</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Titre</em>'.
	 * @generated
	 */
	Titre createTitre();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Ovy2htmlPackage getOvy2htmlPackage();

} //Ovy2htmlFactory
