/**
 */
package groupx-m2t-html.ovy2html.impl;

import groupx-m2t-html.ovy2html.Balise;
import groupx-m2t-html.ovy2html.HTML;
import groupx-m2t-html.ovy2html.Ovy2htmlPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HTML</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link groupx-m2t-html.ovy2html.impl.HTMLImpl#getBalise <em>Balise</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HTMLImpl extends MinimalEObjectImpl.Container implements HTML
{
	/**
	 * The cached value of the '{@link #getBalise() <em>Balise</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalise()
	 * @generated
	 * @ordered
	 */
	protected EList<Balise> balise;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HTMLImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return Ovy2htmlPackage.Literals.HTML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Balise> getBalise()
	{
		if (balise == null)
		{
			balise = new EObjectContainmentEList<Balise>(Balise.class, this, Ovy2htmlPackage.HTML__BALISE);
		}
		return balise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case Ovy2htmlPackage.HTML__BALISE:
				return ((InternalEList<?>)getBalise()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case Ovy2htmlPackage.HTML__BALISE:
				return getBalise();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case Ovy2htmlPackage.HTML__BALISE:
				getBalise().clear();
				getBalise().addAll((Collection<? extends Balise>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case Ovy2htmlPackage.HTML__BALISE:
				getBalise().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case Ovy2htmlPackage.HTML__BALISE:
				return balise != null && !balise.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HTMLImpl
