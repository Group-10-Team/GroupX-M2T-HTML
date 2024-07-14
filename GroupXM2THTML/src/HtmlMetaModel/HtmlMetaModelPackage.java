/**
 */
package HtmlMetaModel;

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
 * @see HtmlMetaModel.HtmlMetaModelFactory
 * @model kind="package"
 * @generated
 */
public interface HtmlMetaModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "HtmlMetaModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "MyMetaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "HTMLMM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HtmlMetaModelPackage eINSTANCE = HtmlMetaModel.impl.HtmlMetaModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link HtmlMetaModel.impl.HTMLImpl <em>HTML</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HtmlMetaModel.impl.HTMLImpl
	 * @see HtmlMetaModel.impl.HtmlMetaModelPackageImpl#getHTML()
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
	 * The meta object id for the '{@link HtmlMetaModel.impl.BaliseImpl <em>Balise</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HtmlMetaModel.impl.BaliseImpl
	 * @see HtmlMetaModel.impl.HtmlMetaModelPackageImpl#getBalise()
	 * @generated
	 */
	int BALISE = 1;

	/**
	 * The feature id for the '<em><b>Attribut</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALISE__ATTRIBUT = 0;

	/**
	 * The feature id for the '<em><b>Balise</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALISE__BALISE = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALISE__NOM = 2;

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
	 * The meta object id for the '{@link HtmlMetaModel.impl.AttributImpl <em>Attribut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HtmlMetaModel.impl.AttributImpl
	 * @see HtmlMetaModel.impl.HtmlMetaModelPackageImpl#getAttribut()
	 * @generated
	 */
	int ATTRIBUT = 2;

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
	 * The meta object id for the '{@link HtmlMetaModel.Balise_Type <em>Balise Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HtmlMetaModel.Balise_Type
	 * @see HtmlMetaModel.impl.HtmlMetaModelPackageImpl#getBalise_Type()
	 * @generated
	 */
	int BALISE_TYPE = 3;

	/**
	 * The meta object id for the '{@link HtmlMetaModel.Attr_Type <em>Attr Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HtmlMetaModel.Attr_Type
	 * @see HtmlMetaModel.impl.HtmlMetaModelPackageImpl#getAttr_Type()
	 * @generated
	 */
	int ATTR_TYPE = 4;


	/**
	 * Returns the meta object for class '{@link HtmlMetaModel.HTML <em>HTML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTML</em>'.
	 * @see HtmlMetaModel.HTML
	 * @generated
	 */
	EClass getHTML();

	/**
	 * Returns the meta object for the containment reference list '{@link HtmlMetaModel.HTML#getBalise <em>Balise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Balise</em>'.
	 * @see HtmlMetaModel.HTML#getBalise()
	 * @see #getHTML()
	 * @generated
	 */
	EReference getHTML_Balise();

	/**
	 * Returns the meta object for class '{@link HtmlMetaModel.Balise <em>Balise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Balise</em>'.
	 * @see HtmlMetaModel.Balise
	 * @generated
	 */
	EClass getBalise();

	/**
	 * Returns the meta object for the containment reference list '{@link HtmlMetaModel.Balise#getAttribut <em>Attribut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribut</em>'.
	 * @see HtmlMetaModel.Balise#getAttribut()
	 * @see #getBalise()
	 * @generated
	 */
	EReference getBalise_Attribut();

	/**
	 * Returns the meta object for the containment reference list '{@link HtmlMetaModel.Balise#getBalise <em>Balise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Balise</em>'.
	 * @see HtmlMetaModel.Balise#getBalise()
	 * @see #getBalise()
	 * @generated
	 */
	EReference getBalise_Balise();

	/**
	 * Returns the meta object for the attribute list '{@link HtmlMetaModel.Balise#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Nom</em>'.
	 * @see HtmlMetaModel.Balise#getNom()
	 * @see #getBalise()
	 * @generated
	 */
	EAttribute getBalise_Nom();

	/**
	 * Returns the meta object for class '{@link HtmlMetaModel.Attribut <em>Attribut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribut</em>'.
	 * @see HtmlMetaModel.Attribut
	 * @generated
	 */
	EClass getAttribut();

	/**
	 * Returns the meta object for the attribute list '{@link HtmlMetaModel.Attribut#getNom_attr <em>Nom attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Nom attr</em>'.
	 * @see HtmlMetaModel.Attribut#getNom_attr()
	 * @see #getAttribut()
	 * @generated
	 */
	EAttribute getAttribut_Nom_attr();

	/**
	 * Returns the meta object for the attribute '{@link HtmlMetaModel.Attribut#getContenu <em>Contenu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contenu</em>'.
	 * @see HtmlMetaModel.Attribut#getContenu()
	 * @see #getAttribut()
	 * @generated
	 */
	EAttribute getAttribut_Contenu();

	/**
	 * Returns the meta object for enum '{@link HtmlMetaModel.Balise_Type <em>Balise Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Balise Type</em>'.
	 * @see HtmlMetaModel.Balise_Type
	 * @generated
	 */
	EEnum getBalise_Type();

	/**
	 * Returns the meta object for enum '{@link HtmlMetaModel.Attr_Type <em>Attr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attr Type</em>'.
	 * @see HtmlMetaModel.Attr_Type
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
	HtmlMetaModelFactory getHtmlMetaModelFactory();

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
		 * The meta object literal for the '{@link HtmlMetaModel.impl.HTMLImpl <em>HTML</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HtmlMetaModel.impl.HTMLImpl
		 * @see HtmlMetaModel.impl.HtmlMetaModelPackageImpl#getHTML()
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
		 * The meta object literal for the '{@link HtmlMetaModel.impl.BaliseImpl <em>Balise</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HtmlMetaModel.impl.BaliseImpl
		 * @see HtmlMetaModel.impl.HtmlMetaModelPackageImpl#getBalise()
		 * @generated
		 */
		EClass BALISE = eINSTANCE.getBalise();

		/**
		 * The meta object literal for the '<em><b>Attribut</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BALISE__ATTRIBUT = eINSTANCE.getBalise_Attribut();

		/**
		 * The meta object literal for the '<em><b>Balise</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BALISE__BALISE = eINSTANCE.getBalise_Balise();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BALISE__NOM = eINSTANCE.getBalise_Nom();

		/**
		 * The meta object literal for the '{@link HtmlMetaModel.impl.AttributImpl <em>Attribut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HtmlMetaModel.impl.AttributImpl
		 * @see HtmlMetaModel.impl.HtmlMetaModelPackageImpl#getAttribut()
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
		 * The meta object literal for the '{@link HtmlMetaModel.Balise_Type <em>Balise Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HtmlMetaModel.Balise_Type
		 * @see HtmlMetaModel.impl.HtmlMetaModelPackageImpl#getBalise_Type()
		 * @generated
		 */
		EEnum BALISE_TYPE = eINSTANCE.getBalise_Type();

		/**
		 * The meta object literal for the '{@link HtmlMetaModel.Attr_Type <em>Attr Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HtmlMetaModel.Attr_Type
		 * @see HtmlMetaModel.impl.HtmlMetaModelPackageImpl#getAttr_Type()
		 * @generated
		 */
		EEnum ATTR_TYPE = eINSTANCE.getAttr_Type();

	}

} //HtmlMetaModelPackage
