/**
 */
package groupx-m2t-html.ovy2html.util;

import groupx-m2t-html.ovy2html.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see groupx-m2t-html.ovy2html.Ovy2htmlPackage
 * @generated
 */
public class Ovy2htmlAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Ovy2htmlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ovy2htmlAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = Ovy2htmlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ovy2htmlSwitch<Adapter> modelSwitch =
		new Ovy2htmlSwitch<Adapter>()
		{
			@Override
			public Adapter caseHTML(HTML object)
			{
				return createHTMLAdapter();
			}
			@Override
			public Adapter caseBalise(Balise object)
			{
				return createBaliseAdapter();
			}
			@Override
			public Adapter caseGrandTitre(GrandTitre object)
			{
				return createGrandTitreAdapter();
			}
			@Override
			public Adapter caseParagraphe(Paragraphe object)
			{
				return createParagrapheAdapter();
			}
			@Override
			public Adapter caseTitre(Titre object)
			{
				return createTitreAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object)
			{
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link groupx-m2t-html.ovy2html.HTML <em>HTML</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see groupx-m2t-html.ovy2html.HTML
	 * @generated
	 */
	public Adapter createHTMLAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link groupx-m2t-html.ovy2html.Balise <em>Balise</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see groupx-m2t-html.ovy2html.Balise
	 * @generated
	 */
	public Adapter createBaliseAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link groupx-m2t-html.ovy2html.GrandTitre <em>Grand Titre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see groupx-m2t-html.ovy2html.GrandTitre
	 * @generated
	 */
	public Adapter createGrandTitreAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link groupx-m2t-html.ovy2html.Paragraphe <em>Paragraphe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see groupx-m2t-html.ovy2html.Paragraphe
	 * @generated
	 */
	public Adapter createParagrapheAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link groupx-m2t-html.ovy2html.Titre <em>Titre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see groupx-m2t-html.ovy2html.Titre
	 * @generated
	 */
	public Adapter createTitreAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //Ovy2htmlAdapterFactory
