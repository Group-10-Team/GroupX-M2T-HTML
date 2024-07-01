/**
 */
package groupx-m2t-html.ovy2html.impl;

import groupx-m2t-html.ovy2html.Balise;
import groupx-m2t-html.ovy2html.GrandTitre;
import groupx-m2t-html.ovy2html.Ovy2htmlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grand Titre</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link groupx-m2t-html.ovy2html.impl.GrandTitreImpl#getBalise <em>Balise</em>}</li>
 *   <li>{@link groupx-m2t-html.ovy2html.impl.GrandTitreImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GrandTitreImpl extends MinimalEObjectImpl.Container implements GrandTitre
{
	/**
	 * The cached value of the '{@link #getBalise() <em>Balise</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalise()
	 * @generated
	 * @ordered
	 */
	protected Balise balise;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GrandTitreImpl()
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
		return Ovy2htmlPackage.Literals.GRAND_TITRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Balise getBalise()
	{
		if (balise != null && balise.eIsProxy())
		{
			InternalEObject oldBalise = (InternalEObject)balise;
			balise = (Balise)eResolveProxy(oldBalise);
			if (balise != oldBalise)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ovy2htmlPackage.GRAND_TITRE__BALISE, oldBalise, balise));
			}
		}
		return balise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Balise basicGetBalise()
	{
		return balise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBalise(Balise newBalise, NotificationChain msgs)
	{
		Balise oldBalise = balise;
		balise = newBalise;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ovy2htmlPackage.GRAND_TITRE__BALISE, oldBalise, newBalise);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBalise(Balise newBalise)
	{
		if (newBalise != balise)
		{
			NotificationChain msgs = null;
			if (balise != null)
				msgs = ((InternalEObject)balise).eInverseRemove(this, Ovy2htmlPackage.BALISE__GRANDTITRE, Balise.class, msgs);
			if (newBalise != null)
				msgs = ((InternalEObject)newBalise).eInverseAdd(this, Ovy2htmlPackage.BALISE__GRANDTITRE, Balise.class, msgs);
			msgs = basicSetBalise(newBalise, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ovy2htmlPackage.GRAND_TITRE__BALISE, newBalise, newBalise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue()
	{
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue)
	{
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ovy2htmlPackage.GRAND_TITRE__VALUE, oldValue, value));
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
			case Ovy2htmlPackage.GRAND_TITRE__BALISE:
				if (balise != null)
					msgs = ((InternalEObject)balise).eInverseRemove(this, Ovy2htmlPackage.BALISE__GRANDTITRE, Balise.class, msgs);
				return basicSetBalise((Balise)otherEnd, msgs);
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
			case Ovy2htmlPackage.GRAND_TITRE__BALISE:
				return basicSetBalise(null, msgs);
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
			case Ovy2htmlPackage.GRAND_TITRE__BALISE:
				if (resolve) return getBalise();
				return basicGetBalise();
			case Ovy2htmlPackage.GRAND_TITRE__VALUE:
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case Ovy2htmlPackage.GRAND_TITRE__BALISE:
				setBalise((Balise)newValue);
				return;
			case Ovy2htmlPackage.GRAND_TITRE__VALUE:
				setValue((String)newValue);
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
			case Ovy2htmlPackage.GRAND_TITRE__BALISE:
				setBalise((Balise)null);
				return;
			case Ovy2htmlPackage.GRAND_TITRE__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case Ovy2htmlPackage.GRAND_TITRE__BALISE:
				return balise != null;
			case Ovy2htmlPackage.GRAND_TITRE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //GrandTitreImpl
