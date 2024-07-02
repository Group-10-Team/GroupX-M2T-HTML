/**
 */
package goupxm2thtml.goupdix.impl;

import goupxm2thtml.goupdix.Attribut;
import goupxm2thtml.goupdix.Balise;
import goupxm2thtml.goupdix.Balise_Type;
import goupxm2thtml.goupdix.GoupdixPackage;

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
 *   <li>{@link goupxm2thtml.goupdix.impl.BaliseImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link goupxm2thtml.goupdix.impl.BaliseImpl#getBalise <em>Balise</em>}</li>
 *   <li>{@link goupxm2thtml.goupdix.impl.BaliseImpl#getAttribut <em>Attribut</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BaliseImpl extends MinimalEObjectImpl.Container implements Balise {
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
	 * The cached value of the '{@link #getBalise() <em>Balise</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalise()
	 * @generated
	 * @ordered
	 */
	protected EList<Balise> balise;

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
		return GoupdixPackage.Literals.BALISE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Balise_Type> getNom() {
		if (nom == null) {
			nom = new EDataTypeUniqueEList<Balise_Type>(Balise_Type.class, this, GoupdixPackage.BALISE__NOM);
		}
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Balise> getBalise() {
		if (balise == null) {
			balise = new EObjectContainmentEList<Balise>(Balise.class, this, GoupdixPackage.BALISE__BALISE);
		}
		return balise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attribut> getAttribut() {
		if (attribut == null) {
			attribut = new EObjectContainmentEList<Attribut>(Attribut.class, this, GoupdixPackage.BALISE__ATTRIBUT);
		}
		return attribut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GoupdixPackage.BALISE__BALISE:
			return ((InternalEList<?>) getBalise()).basicRemove(otherEnd, msgs);
		case GoupdixPackage.BALISE__ATTRIBUT:
			return ((InternalEList<?>) getAttribut()).basicRemove(otherEnd, msgs);
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
		case GoupdixPackage.BALISE__NOM:
			return getNom();
		case GoupdixPackage.BALISE__BALISE:
			return getBalise();
		case GoupdixPackage.BALISE__ATTRIBUT:
			return getAttribut();
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
		case GoupdixPackage.BALISE__NOM:
			getNom().clear();
			getNom().addAll((Collection<? extends Balise_Type>) newValue);
			return;
		case GoupdixPackage.BALISE__BALISE:
			getBalise().clear();
			getBalise().addAll((Collection<? extends Balise>) newValue);
			return;
		case GoupdixPackage.BALISE__ATTRIBUT:
			getAttribut().clear();
			getAttribut().addAll((Collection<? extends Attribut>) newValue);
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
		case GoupdixPackage.BALISE__NOM:
			getNom().clear();
			return;
		case GoupdixPackage.BALISE__BALISE:
			getBalise().clear();
			return;
		case GoupdixPackage.BALISE__ATTRIBUT:
			getAttribut().clear();
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
		case GoupdixPackage.BALISE__NOM:
			return nom != null && !nom.isEmpty();
		case GoupdixPackage.BALISE__BALISE:
			return balise != null && !balise.isEmpty();
		case GoupdixPackage.BALISE__ATTRIBUT:
			return attribut != null && !attribut.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nom: ");
		result.append(nom);
		result.append(')');
		return result.toString();
	}

} //BaliseImpl
