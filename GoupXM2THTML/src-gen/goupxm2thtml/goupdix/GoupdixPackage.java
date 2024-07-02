/**
 */
package goupxm2thtml.goupdix;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see goupxm2thtml.goupdix.GoupdixFactory
 * @model kind="package"
 * @generated
 */
public interface GoupdixPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "goupdix";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/goupdix";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "goupdix";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GoupdixPackage eINSTANCE = goupxm2thtml.goupdix.impl.GoupdixPackageImpl.init();

	/**
	 * The meta object id for the '{@link goupxm2thtml.goupdix.impl.HTMLImpl <em>HTML</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see goupxm2thtml.goupdix.impl.HTMLImpl
	 * @see goupxm2thtml.goupdix.impl.GoupdixPackageImpl#getHTML()
	 * @generated
	 */
	int HTML = 0;

	/**
	 * The feature id for the '<em><b>Balise</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML__BALISE = 0;

	/**
	 * The number of structural features of the '<em>HTML</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>HTML</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link goupxm2thtml.goupdix.impl.AttributImpl <em>Attribut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see goupxm2thtml.goupdix.impl.AttributImpl
	 * @see goupxm2thtml.goupdix.impl.GoupdixPackageImpl#getAttribut()
	 * @generated
	 */
	int ATTRIBUT = 1;

	/**
	 * The feature id for the '<em><b>Nom attr</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUT__NOM_ATTR = 0;

	/**
	 * The feature id for the '<em><b>Contenu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUT__CONTENU = 1;

	/**
	 * The number of structural features of the '<em>Attribut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Attribut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link goupxm2thtml.goupdix.impl.BaliseImpl <em>Balise</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see goupxm2thtml.goupdix.impl.BaliseImpl
	 * @see goupxm2thtml.goupdix.impl.GoupdixPackageImpl#getBalise()
	 * @generated
	 */
	int BALISE = 2;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALISE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Balise</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALISE__BALISE = 1;

	/**
	 * The feature id for the '<em><b>Attribut</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALISE__ATTRIBUT = 2;

	/**
	 * The number of structural features of the '<em>Balise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALISE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Balise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALISE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link goupxm2thtml.goupdix.Balise_Type <em>Balise Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see goupxm2thtml.goupdix.Balise_Type
	 * @see goupxm2thtml.goupdix.impl.GoupdixPackageImpl#getBalise_Type()
	 * @generated
	 */
	int BALISE_TYPE = 3;

	/**
	 * The meta object id for the '{@link goupxm2thtml.goupdix.Attr_Type <em>Attr Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see goupxm2thtml.goupdix.Attr_Type
	 * @see goupxm2thtml.goupdix.impl.GoupdixPackageImpl#getAttr_Type()
	 * @generated
	 */
	int ATTR_TYPE = 4;

	/**
	 * Returns the meta object for class '{@link goupxm2thtml.goupdix.HTML <em>HTML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTML</em>'.
	 * @see goupxm2thtml.goupdix.HTML
	 * @generated
	 */
	EClass getHTML();

	/**
	 * Returns the meta object for the containment reference list '{@link goupxm2thtml.goupdix.HTML#getBalise <em>Balise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Balise</em>'.
	 * @see goupxm2thtml.goupdix.HTML#getBalise()
	 * @see #getHTML()
	 * @generated
	 */
	EReference getHTML_Balise();

	/**
	 * Returns the meta object for class '{@link goupxm2thtml.goupdix.Attribut <em>Attribut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribut</em>'.
	 * @see goupxm2thtml.goupdix.Attribut
	 * @generated
	 */
	EClass getAttribut();

	/**
	 * Returns the meta object for the attribute list '{@link goupxm2thtml.goupdix.Attribut#getNom_attr <em>Nom attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Nom attr</em>'.
	 * @see goupxm2thtml.goupdix.Attribut#getNom_attr()
	 * @see #getAttribut()
	 * @generated
	 */
	EAttribute getAttribut_Nom_attr();

	/**
	 * Returns the meta object for the attribute '{@link goupxm2thtml.goupdix.Attribut#getContenu <em>Contenu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contenu</em>'.
	 * @see goupxm2thtml.goupdix.Attribut#getContenu()
	 * @see #getAttribut()
	 * @generated
	 */
	EAttribute getAttribut_Contenu();

	/**
	 * Returns the meta object for class '{@link goupxm2thtml.goupdix.Balise <em>Balise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Balise</em>'.
	 * @see goupxm2thtml.goupdix.Balise
	 * @generated
	 */
	EClass getBalise();

	/**
	 * Returns the meta object for the attribute list '{@link goupxm2thtml.goupdix.Balise#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Nom</em>'.
	 * @see goupxm2thtml.goupdix.Balise#getNom()
	 * @see #getBalise()
	 * @generated
	 */
	EAttribute getBalise_Nom();

	/**
	 * Returns the meta object for the containment reference list '{@link goupxm2thtml.goupdix.Balise#getBalise <em>Balise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Balise</em>'.
	 * @see goupxm2thtml.goupdix.Balise#getBalise()
	 * @see #getBalise()
	 * @generated
	 */
	EReference getBalise_Balise();

	/**
	 * Returns the meta object for the containment reference list '{@link goupxm2thtml.goupdix.Balise#getAttribut <em>Attribut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribut</em>'.
	 * @see goupxm2thtml.goupdix.Balise#getAttribut()
	 * @see #getBalise()
	 * @generated
	 */
	EReference getBalise_Attribut();

	/**
	 * Returns the meta object for enum '{@link goupxm2thtml.goupdix.Balise_Type <em>Balise Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Balise Type</em>'.
	 * @see goupxm2thtml.goupdix.Balise_Type
	 * @generated
	 */
	EEnum getBalise_Type();

	/**
	 * Returns the meta object for enum '{@link goupxm2thtml.goupdix.Attr_Type <em>Attr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attr Type</em>'.
	 * @see goupxm2thtml.goupdix.Attr_Type
	 * @generated
	 */
	EEnum getAttr_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GoupdixFactory getGoupdixFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link goupxm2thtml.goupdix.impl.HTMLImpl <em>HTML</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see goupxm2thtml.goupdix.impl.HTMLImpl
		 * @see goupxm2thtml.goupdix.impl.GoupdixPackageImpl#getHTML()
		 * @generated
		 */
		EClass HTML = eINSTANCE.getHTML();

		/**
		 * The meta object literal for the '<em><b>Balise</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTML__BALISE = eINSTANCE.getHTML_Balise();

		/**
		 * The meta object literal for the '{@link goupxm2thtml.goupdix.impl.AttributImpl <em>Attribut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see goupxm2thtml.goupdix.impl.AttributImpl
		 * @see goupxm2thtml.goupdix.impl.GoupdixPackageImpl#getAttribut()
		 * @generated
		 */
		EClass ATTRIBUT = eINSTANCE.getAttribut();

		/**
		 * The meta object literal for the '<em><b>Nom attr</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUT__NOM_ATTR = eINSTANCE.getAttribut_Nom_attr();

		/**
		 * The meta object literal for the '<em><b>Contenu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUT__CONTENU = eINSTANCE.getAttribut_Contenu();

		/**
		 * The meta object literal for the '{@link goupxm2thtml.goupdix.impl.BaliseImpl <em>Balise</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see goupxm2thtml.goupdix.impl.BaliseImpl
		 * @see goupxm2thtml.goupdix.impl.GoupdixPackageImpl#getBalise()
		 * @generated
		 */
		EClass BALISE = eINSTANCE.getBalise();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BALISE__NOM = eINSTANCE.getBalise_Nom();

		/**
		 * The meta object literal for the '<em><b>Balise</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BALISE__BALISE = eINSTANCE.getBalise_Balise();

		/**
		 * The meta object literal for the '<em><b>Attribut</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BALISE__ATTRIBUT = eINSTANCE.getBalise_Attribut();

		/**
		 * The meta object literal for the '{@link goupxm2thtml.goupdix.Balise_Type <em>Balise Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see goupxm2thtml.goupdix.Balise_Type
		 * @see goupxm2thtml.goupdix.impl.GoupdixPackageImpl#getBalise_Type()
		 * @generated
		 */
		EEnum BALISE_TYPE = eINSTANCE.getBalise_Type();

		/**
		 * The meta object literal for the '{@link goupxm2thtml.goupdix.Attr_Type <em>Attr Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see goupxm2thtml.goupdix.Attr_Type
		 * @see goupxm2thtml.goupdix.impl.GoupdixPackageImpl#getAttr_Type()
		 * @generated
		 */
		EEnum ATTR_TYPE = eINSTANCE.getAttr_Type();

	}

} //GoupdixPackage
