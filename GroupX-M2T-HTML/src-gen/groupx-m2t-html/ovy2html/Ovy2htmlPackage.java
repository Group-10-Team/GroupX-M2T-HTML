/**
 */
package groupx-m2t-html.ovy2html;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see groupx-m2t-html.ovy2html.Ovy2htmlFactory
 * @model kind="package"
 * @generated
 */
public interface Ovy2htmlPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ovy2html";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ovy2html";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ovy2html";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Ovy2htmlPackage eINSTANCE = groupx-m2t-html.ovy2html.impl.Ovy2htmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link groupx-m2t-html.ovy2html.impl.HTMLImpl <em>HTML</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see groupx-m2t-html.ovy2html.impl.HTMLImpl
	 * @see groupx-m2t-html.ovy2html.impl.Ovy2htmlPackageImpl#getHTML()
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
	 * The meta object id for the '{@link groupx-m2t-html.ovy2html.impl.BaliseImpl <em>Balise</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see groupx-m2t-html.ovy2html.impl.BaliseImpl
	 * @see groupx-m2t-html.ovy2html.impl.Ovy2htmlPackageImpl#getBalise()
	 * @generated
	 */
	int BALISE = 1;

	/**
	 * The feature id for the '<em><b>Paragraphe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALISE__PARAGRAPHE = 0;

	/**
	 * The feature id for the '<em><b>Titre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALISE__TITRE = 1;

	/**
	 * The feature id for the '<em><b>Grandtitre</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALISE__GRANDTITRE = 2;

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
	 * The meta object id for the '{@link groupx-m2t-html.ovy2html.impl.GrandTitreImpl <em>Grand Titre</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see groupx-m2t-html.ovy2html.impl.GrandTitreImpl
	 * @see groupx-m2t-html.ovy2html.impl.Ovy2htmlPackageImpl#getGrandTitre()
	 * @generated
	 */
	int GRAND_TITRE = 2;

	/**
	 * The feature id for the '<em><b>Balise</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAND_TITRE__BALISE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAND_TITRE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Grand Titre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAND_TITRE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Grand Titre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAND_TITRE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link groupx-m2t-html.ovy2html.impl.ParagrapheImpl <em>Paragraphe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see groupx-m2t-html.ovy2html.impl.ParagrapheImpl
	 * @see groupx-m2t-html.ovy2html.impl.Ovy2htmlPackageImpl#getParagraphe()
	 * @generated
	 */
	int PARAGRAPHE = 3;

	/**
	 * The feature id for the '<em><b>Balise</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPHE__BALISE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPHE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Paragraphe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPHE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Paragraphe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPHE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link groupx-m2t-html.ovy2html.impl.TitreImpl <em>Titre</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see groupx-m2t-html.ovy2html.impl.TitreImpl
	 * @see groupx-m2t-html.ovy2html.impl.Ovy2htmlPackageImpl#getTitre()
	 * @generated
	 */
	int TITRE = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITRE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Titre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITRE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Titre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITRE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link groupx-m2t-html.ovy2html.HTML <em>HTML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTML</em>'.
	 * @see groupx-m2t-html.ovy2html.HTML
	 * @generated
	 */
	EClass getHTML();

	/**
	 * Returns the meta object for the containment reference list '{@link groupx-m2t-html.ovy2html.HTML#getBalise <em>Balise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Balise</em>'.
	 * @see groupx-m2t-html.ovy2html.HTML#getBalise()
	 * @see #getHTML()
	 * @generated
	 */
	EReference getHTML_Balise();

	/**
	 * Returns the meta object for class '{@link groupx-m2t-html.ovy2html.Balise <em>Balise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Balise</em>'.
	 * @see groupx-m2t-html.ovy2html.Balise
	 * @generated
	 */
	EClass getBalise();

	/**
	 * Returns the meta object for the reference '{@link groupx-m2t-html.ovy2html.Balise#getParagraphe <em>Paragraphe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Paragraphe</em>'.
	 * @see groupx-m2t-html.ovy2html.Balise#getParagraphe()
	 * @see #getBalise()
	 * @generated
	 */
	EReference getBalise_Paragraphe();

	/**
	 * Returns the meta object for the containment reference list '{@link groupx-m2t-html.ovy2html.Balise#getTitre <em>Titre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Titre</em>'.
	 * @see groupx-m2t-html.ovy2html.Balise#getTitre()
	 * @see #getBalise()
	 * @generated
	 */
	EReference getBalise_Titre();

	/**
	 * Returns the meta object for the reference '{@link groupx-m2t-html.ovy2html.Balise#getGrandtitre <em>Grandtitre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Grandtitre</em>'.
	 * @see groupx-m2t-html.ovy2html.Balise#getGrandtitre()
	 * @see #getBalise()
	 * @generated
	 */
	EReference getBalise_Grandtitre();

	/**
	 * Returns the meta object for class '{@link groupx-m2t-html.ovy2html.GrandTitre <em>Grand Titre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grand Titre</em>'.
	 * @see groupx-m2t-html.ovy2html.GrandTitre
	 * @generated
	 */
	EClass getGrandTitre();

	/**
	 * Returns the meta object for the reference '{@link groupx-m2t-html.ovy2html.GrandTitre#getBalise <em>Balise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Balise</em>'.
	 * @see groupx-m2t-html.ovy2html.GrandTitre#getBalise()
	 * @see #getGrandTitre()
	 * @generated
	 */
	EReference getGrandTitre_Balise();

	/**
	 * Returns the meta object for the attribute '{@link groupx-m2t-html.ovy2html.GrandTitre#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see groupx-m2t-html.ovy2html.GrandTitre#getValue()
	 * @see #getGrandTitre()
	 * @generated
	 */
	EAttribute getGrandTitre_Value();

	/**
	 * Returns the meta object for class '{@link groupx-m2t-html.ovy2html.Paragraphe <em>Paragraphe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraphe</em>'.
	 * @see groupx-m2t-html.ovy2html.Paragraphe
	 * @generated
	 */
	EClass getParagraphe();

	/**
	 * Returns the meta object for the reference '{@link groupx-m2t-html.ovy2html.Paragraphe#getBalise <em>Balise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Balise</em>'.
	 * @see groupx-m2t-html.ovy2html.Paragraphe#getBalise()
	 * @see #getParagraphe()
	 * @generated
	 */
	EReference getParagraphe_Balise();

	/**
	 * Returns the meta object for the attribute '{@link groupx-m2t-html.ovy2html.Paragraphe#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see groupx-m2t-html.ovy2html.Paragraphe#getValue()
	 * @see #getParagraphe()
	 * @generated
	 */
	EAttribute getParagraphe_Value();

	/**
	 * Returns the meta object for class '{@link groupx-m2t-html.ovy2html.Titre <em>Titre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Titre</em>'.
	 * @see groupx-m2t-html.ovy2html.Titre
	 * @generated
	 */
	EClass getTitre();

	/**
	 * Returns the meta object for the attribute '{@link groupx-m2t-html.ovy2html.Titre#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see groupx-m2t-html.ovy2html.Titre#getValue()
	 * @see #getTitre()
	 * @generated
	 */
	EAttribute getTitre_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Ovy2htmlFactory getOvy2htmlFactory();

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
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link groupx-m2t-html.ovy2html.impl.HTMLImpl <em>HTML</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see groupx-m2t-html.ovy2html.impl.HTMLImpl
		 * @see groupx-m2t-html.ovy2html.impl.Ovy2htmlPackageImpl#getHTML()
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
		 * The meta object literal for the '{@link groupx-m2t-html.ovy2html.impl.BaliseImpl <em>Balise</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see groupx-m2t-html.ovy2html.impl.BaliseImpl
		 * @see groupx-m2t-html.ovy2html.impl.Ovy2htmlPackageImpl#getBalise()
		 * @generated
		 */
		EClass BALISE = eINSTANCE.getBalise();

		/**
		 * The meta object literal for the '<em><b>Paragraphe</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BALISE__PARAGRAPHE = eINSTANCE.getBalise_Paragraphe();

		/**
		 * The meta object literal for the '<em><b>Titre</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BALISE__TITRE = eINSTANCE.getBalise_Titre();

		/**
		 * The meta object literal for the '<em><b>Grandtitre</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BALISE__GRANDTITRE = eINSTANCE.getBalise_Grandtitre();

		/**
		 * The meta object literal for the '{@link groupx-m2t-html.ovy2html.impl.GrandTitreImpl <em>Grand Titre</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see groupx-m2t-html.ovy2html.impl.GrandTitreImpl
		 * @see groupx-m2t-html.ovy2html.impl.Ovy2htmlPackageImpl#getGrandTitre()
		 * @generated
		 */
		EClass GRAND_TITRE = eINSTANCE.getGrandTitre();

		/**
		 * The meta object literal for the '<em><b>Balise</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAND_TITRE__BALISE = eINSTANCE.getGrandTitre_Balise();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAND_TITRE__VALUE = eINSTANCE.getGrandTitre_Value();

		/**
		 * The meta object literal for the '{@link groupx-m2t-html.ovy2html.impl.ParagrapheImpl <em>Paragraphe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see groupx-m2t-html.ovy2html.impl.ParagrapheImpl
		 * @see groupx-m2t-html.ovy2html.impl.Ovy2htmlPackageImpl#getParagraphe()
		 * @generated
		 */
		EClass PARAGRAPHE = eINSTANCE.getParagraphe();

		/**
		 * The meta object literal for the '<em><b>Balise</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAGRAPHE__BALISE = eINSTANCE.getParagraphe_Balise();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPHE__VALUE = eINSTANCE.getParagraphe_Value();

		/**
		 * The meta object literal for the '{@link groupx-m2t-html.ovy2html.impl.TitreImpl <em>Titre</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see groupx-m2t-html.ovy2html.impl.TitreImpl
		 * @see groupx-m2t-html.ovy2html.impl.Ovy2htmlPackageImpl#getTitre()
		 * @generated
		 */
		EClass TITRE = eINSTANCE.getTitre();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITRE__VALUE = eINSTANCE.getTitre_Value();

	}

} //Ovy2htmlPackage
