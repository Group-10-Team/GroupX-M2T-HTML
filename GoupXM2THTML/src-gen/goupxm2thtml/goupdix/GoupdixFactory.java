/**
 */
package goupxm2thtml.goupdix;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see goupxm2thtml.goupdix.GoupdixPackage
 * @generated
 */
public interface GoupdixFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GoupdixFactory eINSTANCE = goupxm2thtml.goupdix.impl.GoupdixFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>HTML</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HTML</em>'.
	 * @generated
	 */
	HTML createHTML();

	/**
	 * Returns a new object of class '<em>Attribut</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribut</em>'.
	 * @generated
	 */
	Attribut createAttribut();

	/**
	 * Returns a new object of class '<em>Balise</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Balise</em>'.
	 * @generated
	 */
	Balise createBalise();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GoupdixPackage getGoupdixPackage();

} //GoupdixFactory
