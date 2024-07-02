/**
 */
package goupxm2thtml.goupdix.impl;

import goupxm2thtml.goupdix.Attr_Type;
import goupxm2thtml.goupdix.Attribut;
import goupxm2thtml.goupdix.GoupdixPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribut</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link goupxm2thtml.goupdix.impl.AttributImpl#getNom_attr <em>Nom attr</em>}</li>
 *   <li>{@link goupxm2thtml.goupdix.impl.AttributImpl#getContenu <em>Contenu</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributImpl extends MinimalEObjectImpl.Container implements Attribut {
	/**
	 * The cached value of the '{@link #getNom_attr() <em>Nom attr</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom_attr()
	 * @generated
	 * @ordered
	 */
	protected EList<Attr_Type> nom_attr;

	/**
	 * The default value of the '{@link #getContenu() <em>Contenu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContenu()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENU_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContenu() <em>Contenu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContenu()
	 * @generated
	 * @ordered
	 */
	protected String contenu = CONTENU_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GoupdixPackage.Literals.ATTRIBUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attr_Type> getNom_attr() {
		if (nom_attr == null) {
			nom_attr = new EDataTypeUniqueEList<Attr_Type>(Attr_Type.class, this, GoupdixPackage.ATTRIBUT__NOM_ATTR);
		}
		return nom_attr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContenu() {
		return contenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContenu(String newContenu) {
		String oldContenu = contenu;
		contenu = newContenu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GoupdixPackage.ATTRIBUT__CONTENU, oldContenu,
					contenu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GoupdixPackage.ATTRIBUT__NOM_ATTR:
			return getNom_attr();
		case GoupdixPackage.ATTRIBUT__CONTENU:
			return getContenu();
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
		case GoupdixPackage.ATTRIBUT__NOM_ATTR:
			getNom_attr().clear();
			getNom_attr().addAll((Collection<? extends Attr_Type>) newValue);
			return;
		case GoupdixPackage.ATTRIBUT__CONTENU:
			setContenu((String) newValue);
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
		case GoupdixPackage.ATTRIBUT__NOM_ATTR:
			getNom_attr().clear();
			return;
		case GoupdixPackage.ATTRIBUT__CONTENU:
			setContenu(CONTENU_EDEFAULT);
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
		case GoupdixPackage.ATTRIBUT__NOM_ATTR:
			return nom_attr != null && !nom_attr.isEmpty();
		case GoupdixPackage.ATTRIBUT__CONTENU:
			return CONTENU_EDEFAULT == null ? contenu != null : !CONTENU_EDEFAULT.equals(contenu);
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
		result.append(" (nom_attr: ");
		result.append(nom_attr);
		result.append(", contenu: ");
		result.append(contenu);
		result.append(')');
		return result.toString();
	}

} //AttributImpl
