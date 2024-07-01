/**
 */
package groupx-m2t-html.ovy2html.impl;

import groupx-m2t-html.ovy2html.Balise;
import groupx-m2t-html.ovy2html.GrandTitre;
import groupx-m2t-html.ovy2html.Ovy2htmlPackage;
import groupx-m2t-html.ovy2html.Paragraphe;
import groupx-m2t-html.ovy2html.Titre;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Balise</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link groupx-m2t-html.ovy2html.impl.BaliseImpl#getParagraphe <em>Paragraphe</em>}</li>
 *   <li>{@link groupx-m2t-html.ovy2html.impl.BaliseImpl#getTitre <em>Titre</em>}</li>
 *   <li>{@link groupx-m2t-html.ovy2html.impl.BaliseImpl#getGrandtitre <em>Grandtitre</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BaliseImpl extends MinimalEObjectImpl.Container implements Balise
{
	/**
	 * The cached value of the '{@link #getParagraphe() <em>Paragraphe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParagraphe()
	 * @generated
	 * @ordered
	 */
	protected Paragraphe paragraphe;

	/**
	 * The cached value of the '{@link #getTitre() <em>Titre</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitre()
	 * @generated
	 * @ordered
	 */
	protected EList<Titre> titre;

	/**
	 * The cached value of the '{@link #getGrandtitre() <em>Grandtitre</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrandtitre()
	 * @generated
	 * @ordered
	 */
	protected GrandTitre grandtitre;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaliseImpl()
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
		return Ovy2htmlPackage.Literals.BALISE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paragraphe getParagraphe()
	{
		if (paragraphe != null && paragraphe.eIsProxy())
		{
			InternalEObject oldParagraphe = (InternalEObject)paragraphe;
			paragraphe = (Paragraphe)eResolveProxy(oldParagraphe);
			if (paragraphe != oldParagraphe)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ovy2htmlPackage.BALISE__PARAGRAPHE, oldParagraphe, paragraphe));
			}
		}
		return paragraphe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paragraphe basicGetParagraphe()
	{
		return paragraphe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParagraphe(Paragraphe newParagraphe, NotificationChain msgs)
	{
		Paragraphe oldParagraphe = paragraphe;
		paragraphe = newParagraphe;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ovy2htmlPackage.BALISE__PARAGRAPHE, oldParagraphe, newParagraphe);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParagraphe(Paragraphe newParagraphe)
	{
		if (newParagraphe != paragraphe)
		{
			NotificationChain msgs = null;
			if (paragraphe != null)
				msgs = ((InternalEObject)paragraphe).eInverseRemove(this, Ovy2htmlPackage.PARAGRAPHE__BALISE, Paragraphe.class, msgs);
			if (newParagraphe != null)
				msgs = ((InternalEObject)newParagraphe).eInverseAdd(this, Ovy2htmlPackage.PARAGRAPHE__BALISE, Paragraphe.class, msgs);
			msgs = basicSetParagraphe(newParagraphe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ovy2htmlPackage.BALISE__PARAGRAPHE, newParagraphe, newParagraphe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Titre> getTitre()
	{
		if (titre == null)
		{
			titre = new EObjectContainmentEList<Titre>(Titre.class, this, Ovy2htmlPackage.BALISE__TITRE);
		}
		return titre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrandTitre getGrandtitre()
	{
		if (grandtitre != null && grandtitre.eIsProxy())
		{
			InternalEObject oldGrandtitre = (InternalEObject)grandtitre;
			grandtitre = (GrandTitre)eResolveProxy(oldGrandtitre);
			if (grandtitre != oldGrandtitre)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ovy2htmlPackage.BALISE__GRANDTITRE, oldGrandtitre, grandtitre));
			}
		}
		return grandtitre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrandTitre basicGetGrandtitre()
	{
		return grandtitre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGrandtitre(GrandTitre newGrandtitre, NotificationChain msgs)
	{
		GrandTitre oldGrandtitre = grandtitre;
		grandtitre = newGrandtitre;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ovy2htmlPackage.BALISE__GRANDTITRE, oldGrandtitre, newGrandtitre);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrandtitre(GrandTitre newGrandtitre)
	{
		if (newGrandtitre != grandtitre)
		{
			NotificationChain msgs = null;
			if (grandtitre != null)
				msgs = ((InternalEObject)grandtitre).eInverseRemove(this, Ovy2htmlPackage.GRAND_TITRE__BALISE, GrandTitre.class, msgs);
			if (newGrandtitre != null)
				msgs = ((InternalEObject)newGrandtitre).eInverseAdd(this, Ovy2htmlPackage.GRAND_TITRE__BALISE, GrandTitre.class, msgs);
			msgs = basicSetGrandtitre(newGrandtitre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ovy2htmlPackage.BALISE__GRANDTITRE, newGrandtitre, newGrandtitre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case Ovy2htmlPackage.BALISE__PARAGRAPHE:
				if (paragraphe != null)
					msgs = ((InternalEObject)paragraphe).eInverseRemove(this, Ovy2htmlPackage.PARAGRAPHE__BALISE, Paragraphe.class, msgs);
				return basicSetParagraphe((Paragraphe)otherEnd, msgs);
			case Ovy2htmlPackage.BALISE__GRANDTITRE:
				if (grandtitre != null)
					msgs = ((InternalEObject)grandtitre).eInverseRemove(this, Ovy2htmlPackage.GRAND_TITRE__BALISE, GrandTitre.class, msgs);
				return basicSetGrandtitre((GrandTitre)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
			case Ovy2htmlPackage.BALISE__PARAGRAPHE:
				return basicSetParagraphe(null, msgs);
			case Ovy2htmlPackage.BALISE__TITRE:
				return ((InternalEList<?>)getTitre()).basicRemove(otherEnd, msgs);
			case Ovy2htmlPackage.BALISE__GRANDTITRE:
				return basicSetGrandtitre(null, msgs);
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
			case Ovy2htmlPackage.BALISE__PARAGRAPHE:
				if (resolve) return getParagraphe();
				return basicGetParagraphe();
			case Ovy2htmlPackage.BALISE__TITRE:
				return getTitre();
			case Ovy2htmlPackage.BALISE__GRANDTITRE:
				if (resolve) return getGrandtitre();
				return basicGetGrandtitre();
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
			case Ovy2htmlPackage.BALISE__PARAGRAPHE:
				setParagraphe((Paragraphe)newValue);
				return;
			case Ovy2htmlPackage.BALISE__TITRE:
				getTitre().clear();
				getTitre().addAll((Collection<? extends Titre>)newValue);
				return;
			case Ovy2htmlPackage.BALISE__GRANDTITRE:
				setGrandtitre((GrandTitre)newValue);
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
			case Ovy2htmlPackage.BALISE__PARAGRAPHE:
				setParagraphe((Paragraphe)null);
				return;
			case Ovy2htmlPackage.BALISE__TITRE:
				getTitre().clear();
				return;
			case Ovy2htmlPackage.BALISE__GRANDTITRE:
				setGrandtitre((GrandTitre)null);
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
			case Ovy2htmlPackage.BALISE__PARAGRAPHE:
				return paragraphe != null;
			case Ovy2htmlPackage.BALISE__TITRE:
				return titre != null && !titre.isEmpty();
			case Ovy2htmlPackage.BALISE__GRANDTITRE:
				return grandtitre != null;
		}
		return super.eIsSet(featureID);
	}

} //BaliseImpl
