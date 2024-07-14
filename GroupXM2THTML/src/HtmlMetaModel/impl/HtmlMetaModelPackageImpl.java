/**
 */
package HtmlMetaModel.impl;

import HtmlMetaModel.Attr_Type;
import HtmlMetaModel.Attribut;
import HtmlMetaModel.Balise;
import HtmlMetaModel.Balise_Type;
import HtmlMetaModel.HtmlMetaModelFactory;
import HtmlMetaModel.HtmlMetaModelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HtmlMetaModelPackageImpl extends EPackageImpl implements HtmlMetaModelPackage {
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
	private EClass attributEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum balise_TypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum attr_TypeEEnum = null;

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
	 * @see HtmlMetaModel.HtmlMetaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HtmlMetaModelPackageImpl() {
		super(eNS_URI, HtmlMetaModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HtmlMetaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HtmlMetaModelPackage init() {
		if (isInited) return (HtmlMetaModelPackage)EPackage.Registry.INSTANCE.getEPackage(HtmlMetaModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredHtmlMetaModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		HtmlMetaModelPackageImpl theHtmlMetaModelPackage = registeredHtmlMetaModelPackage instanceof HtmlMetaModelPackageImpl ? (HtmlMetaModelPackageImpl)registeredHtmlMetaModelPackage : new HtmlMetaModelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theHtmlMetaModelPackage.createPackageContents();

		// Initialize created meta-data
		theHtmlMetaModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHtmlMetaModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HtmlMetaModelPackage.eNS_URI, theHtmlMetaModelPackage);
		return theHtmlMetaModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHTML() {
		return htmlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHTML_Balise() {
		return (EReference)htmlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBalise() {
		return baliseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBalise_Attribut() {
		return (EReference)baliseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBalise_Balise() {
		return (EReference)baliseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBalise_Nom() {
		return (EAttribute)baliseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttribut() {
		return attributEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttribut_Nom_attr() {
		return (EAttribute)attributEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttribut_Contenu() {
		return (EAttribute)attributEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBalise_Type() {
		return balise_TypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAttr_Type() {
		return attr_TypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HtmlMetaModelFactory getHtmlMetaModelFactory() {
		return (HtmlMetaModelFactory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		htmlEClass = createEClass(HTML);
		createEReference(htmlEClass, HTML__BALISE);

		baliseEClass = createEClass(BALISE);
		createEReference(baliseEClass, BALISE__ATTRIBUT);
		createEReference(baliseEClass, BALISE__BALISE);
		createEAttribute(baliseEClass, BALISE__NOM);

		attributEClass = createEClass(ATTRIBUT);
		createEAttribute(attributEClass, ATTRIBUT__NOM_ATTR);
		createEAttribute(attributEClass, ATTRIBUT__CONTENU);

		// Create enums
		balise_TypeEEnum = createEEnum(BALISE_TYPE);
		attr_TypeEEnum = createEEnum(ATTR_TYPE);
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
	public void initializePackageContents() {
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
		initEClass(htmlEClass, HtmlMetaModel.HTML.class, "HTML", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHTML_Balise(), this.getBalise(), null, "balise", null, 1, -1, HtmlMetaModel.HTML.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baliseEClass, Balise.class, "Balise", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBalise_Attribut(), this.getAttribut(), null, "attribut", null, 0, -1, Balise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBalise_Balise(), this.getBalise(), null, "balise", null, 0, -1, Balise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBalise_Nom(), this.getBalise_Type(), "nom", null, 0, -1, Balise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributEClass, Attribut.class, "Attribut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribut_Nom_attr(), this.getAttr_Type(), "nom_attr", null, 0, -1, Attribut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribut_Contenu(), ecorePackage.getEString(), "contenu", null, 0, 1, Attribut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(balise_TypeEEnum, Balise_Type.class, "Balise_Type");
		addEEnumLiteral(balise_TypeEEnum, Balise_Type.TITRE);
		addEEnumLiteral(balise_TypeEEnum, Balise_Type.H1);
		addEEnumLiteral(balise_TypeEEnum, Balise_Type.H2);
		addEEnumLiteral(balise_TypeEEnum, Balise_Type.H3);
		addEEnumLiteral(balise_TypeEEnum, Balise_Type.H4);
		addEEnumLiteral(balise_TypeEEnum, Balise_Type.P);
		addEEnumLiteral(balise_TypeEEnum, Balise_Type.SPAN);
		addEEnumLiteral(balise_TypeEEnum, Balise_Type.DIV);

		initEEnum(attr_TypeEEnum, Attr_Type.class, "Attr_Type");
		addEEnumLiteral(attr_TypeEEnum, Attr_Type.CLASS);
		addEEnumLiteral(attr_TypeEEnum, Attr_Type.ID);
		addEEnumLiteral(attr_TypeEEnum, Attr_Type.SRC);
		addEEnumLiteral(attr_TypeEEnum, Attr_Type.HREF);

		// Create resource
		createResource(eNS_URI);
	}

} //HtmlMetaModelPackageImpl
