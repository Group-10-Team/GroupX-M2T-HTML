/**
 */
package groupx-m2t-html.ovy2html.impl;

import groupx-m2t-html.ovy2html.Balise;
import groupx-m2t-html.ovy2html.GrandTitre;
import groupx-m2t-html.ovy2html.Ovy2htmlFactory;
import groupx-m2t-html.ovy2html.Ovy2htmlPackage;
import groupx-m2t-html.ovy2html.Paragraphe;
import groupx-m2t-html.ovy2html.Titre;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Ovy2htmlPackageImpl extends EPackageImpl implements Ovy2htmlPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass htmlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baliseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grandTitreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paragrapheEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass titreEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see groupx-m2t-html.ovy2html.Ovy2htmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Ovy2htmlPackageImpl()
	{
		super(eNS_URI, Ovy2htmlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Ovy2htmlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Ovy2htmlPackage init()
	{
		if (isInited) return (Ovy2htmlPackage)EPackage.Registry.INSTANCE.getEPackage(Ovy2htmlPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOvy2htmlPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Ovy2htmlPackageImpl theOvy2htmlPackage = registeredOvy2htmlPackage instanceof Ovy2htmlPackageImpl ? (Ovy2htmlPackageImpl)registeredOvy2htmlPackage : new Ovy2htmlPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theOvy2htmlPackage.createPackageContents();

		// Initialize created meta-data
		theOvy2htmlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOvy2htmlPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Ovy2htmlPackage.eNS_URI, theOvy2htmlPackage);
		return theOvy2htmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHTML()
	{
		return htmlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHTML_Balise()
	{
		return (EReference)htmlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBalise()
	{
		return baliseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBalise_Paragraphe()
	{
		return (EReference)baliseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBalise_Titre()
	{
		return (EReference)baliseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBalise_Grandtitre()
	{
		return (EReference)baliseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrandTitre()
	{
		return grandTitreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrandTitre_Balise()
	{
		return (EReference)grandTitreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGrandTitre_Value()
	{
		return (EAttribute)grandTitreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParagraphe()
	{
		return paragrapheEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParagraphe_Balise()
	{
		return (EReference)paragrapheEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParagraphe_Value()
	{
		return (EAttribute)paragrapheEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTitre()
	{
		return titreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTitre_Value()
	{
		return (EAttribute)titreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ovy2htmlFactory getOvy2htmlFactory()
	{
		return (Ovy2htmlFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		htmlEClass = createEClass(HTML);
		createEReference(htmlEClass, HTML__BALISE);

		baliseEClass = createEClass(BALISE);
		createEReference(baliseEClass, BALISE__PARAGRAPHE);
		createEReference(baliseEClass, BALISE__TITRE);
		createEReference(baliseEClass, BALISE__GRANDTITRE);

		grandTitreEClass = createEClass(GRAND_TITRE);
		createEReference(grandTitreEClass, GRAND_TITRE__BALISE);
		createEAttribute(grandTitreEClass, GRAND_TITRE__VALUE);

		paragrapheEClass = createEClass(PARAGRAPHE);
		createEReference(paragrapheEClass, PARAGRAPHE__BALISE);
		createEAttribute(paragrapheEClass, PARAGRAPHE__VALUE);

		titreEClass = createEClass(TITRE);
		createEAttribute(titreEClass, TITRE__VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(htmlEClass, groupx-m2t-html.ovy2html.HTML.class, "HTML", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHTML_Balise(), this.getBalise(), null, "balise", null, 1, -1, groupx-m2t-html.ovy2html.HTML.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baliseEClass, Balise.class, "Balise", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBalise_Paragraphe(), this.getParagraphe(), this.getParagraphe_Balise(), "paragraphe", null, 0, 1, Balise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBalise_Titre(), this.getTitre(), null, "titre", null, 1, -1, Balise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBalise_Grandtitre(), this.getGrandTitre(), this.getGrandTitre_Balise(), "grandtitre", null, 0, 1, Balise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(grandTitreEClass, GrandTitre.class, "GrandTitre", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGrandTitre_Balise(), this.getBalise(), this.getBalise_Grandtitre(), "balise", null, 0, 1, GrandTitre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrandTitre_Value(), ecorePackage.getEString(), "value", null, 0, 1, GrandTitre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paragrapheEClass, Paragraphe.class, "Paragraphe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParagraphe_Balise(), this.getBalise(), this.getBalise_Paragraphe(), "balise", null, 0, 1, Paragraphe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParagraphe_Value(), ecorePackage.getEString(), "value", null, 0, 1, Paragraphe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(titreEClass, Titre.class, "Titre", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTitre_Value(), ecorePackage.getEString(), "value", null, 0, 1, Titre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Ovy2htmlPackageImpl
