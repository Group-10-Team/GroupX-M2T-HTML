/**
 */
package HtmlMetaModel.impl;

import HtmlMetaModel.Attribut;
import HtmlMetaModel.Balise;
import HtmlMetaModel.Balise_Type;
import HtmlMetaModel.HtmlMetaModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
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
 *   <li>{@link HtmlMetaModel.impl.BaliseImpl#getAttribut <em>Attribut</em>}</li>
 *   <li>{@link HtmlMetaModel.impl.BaliseImpl#getBalise <em>Balise</em>}</li>
 *   <li>{@link HtmlMetaModel.impl.BaliseImpl#getNom <em>Nom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BaliseImpl extends MinimalEObjectImpl.Container implements Balise {
	/**
	 * The cached value of the '{@link #getAttribut() <em>Attribut</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribut()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribut> attribut;

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
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected EList<Balise_Type> nom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaliseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlMetaModelPackage.Literals.BALISE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attribut> getAttribut() {
		if (attribut == null) {
			attribut = new EObjectContainmentEList<Attribut>(Attribut.class, this, HtmlMetaModelPackage.BALISE__ATTRIBUT);
		}
		return attribut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Balise> getBalise() {
		if (balise == null) {
			balise = new EObjectContainmentEList<Balise>(Balise.class, this, HtmlMetaModelPackage.BALISE__BALISE);
		}
		return balise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Balise_Type> getNom() {
		if (nom == null) {
			nom = new EDataTypeUniqueEList<Balise_Type>(Balise_Type.class, this, HtmlMetaModelPackage.BALISE__NOM);
		}
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HtmlMetaModelPackage.BALISE__ATTRIBUT:
				return ((InternalEList<?>)getAttribut()).basicRemove(otherEnd, msgs);
			case HtmlMetaModelPackage.BALISE__BALISE:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HtmlMetaModelPackage.BALISE__ATTRIBUT:
				return getAttribut();
			case HtmlMetaModelPackage.BALISE__BALISE:
				return getBalise();
			case HtmlMetaModelPackage.BALISE__NOM:
				return getNom();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HtmlMetaModelPackage.BALISE__ATTRIBUT:
				getAttribut().clear();
				getAttribut().addAll((Collection<? extends Attribut>)newValue);
				return;
			case HtmlMetaModelPackage.BALISE__BALISE:
				getBalise().clear();
				getBalise().addAll((Collection<? extends Balise>)newValue);
				return;
			case HtmlMetaModelPackage.BALISE__NOM:
				getNom().clear();
				getNom().addAll((Collection<? extends Balise_Type>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case HtmlMetaModelPackage.BALISE__ATTRIBUT:
				getAttribut().clear();
				return;
			case HtmlMetaModelPackage.BALISE__BALISE:
				getBalise().clear();
				return;
			case HtmlMetaModelPackage.BALISE__NOM:
				getNom().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HtmlMetaModelPackage.BALISE__ATTRIBUT:
				return attribut != null && !attribut.isEmpty();
			case HtmlMetaModelPackage.BALISE__BALISE:
				return balise != null && !balise.isEmpty();
			case HtmlMetaModelPackage.BALISE__NOM:
				return nom != null && !nom.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nom: ");
		result.append(nom);
		result.append(')');
		return result.toString();
	}

} //BaliseImpl
