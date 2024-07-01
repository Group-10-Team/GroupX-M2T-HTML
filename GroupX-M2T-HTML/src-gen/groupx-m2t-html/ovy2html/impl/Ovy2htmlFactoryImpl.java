/**
 */
package groupx-m2t-html.ovy2html.impl;

import groupx-m2t-html.ovy2html.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Ovy2htmlFactoryImpl extends EFactoryImpl implements Ovy2htmlFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Ovy2htmlFactory init()
	{
		try
		{
			Ovy2htmlFactory theOvy2htmlFactory = (Ovy2htmlFactory)EPackage.Registry.INSTANCE.getEFactory(Ovy2htmlPackage.eNS_URI);
			if (theOvy2htmlFactory != null)
			{
				return theOvy2htmlFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Ovy2htmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ovy2htmlFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case Ovy2htmlPackage.HTML: return createHTML();
			case Ovy2htmlPackage.GRAND_TITRE: return createGrandTitre();
			case Ovy2htmlPackage.PARAGRAPHE: return createParagraphe();
			case Ovy2htmlPackage.TITRE: return createTitre();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTML createHTML()
	{
		HTMLImpl html = new HTMLImpl();
		return html;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrandTitre createGrandTitre()
	{
		GrandTitreImpl grandTitre = new GrandTitreImpl();
		return grandTitre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paragraphe createParagraphe()
	{
		ParagrapheImpl paragraphe = new ParagrapheImpl();
		return paragraphe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Titre createTitre()
	{
		TitreImpl titre = new TitreImpl();
		return titre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ovy2htmlPackage getOvy2htmlPackage()
	{
		return (Ovy2htmlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Ovy2htmlPackage getPackage()
	{
		return Ovy2htmlPackage.eINSTANCE;
	}

} //Ovy2htmlFactoryImpl
