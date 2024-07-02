/**
 */
package goupxm2thtml.goupdix;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Balise Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see goupxm2thtml.goupdix.GoupdixPackage#getBalise_Type()
 * @model
 * @generated
 */
public enum Balise_Type implements Enumerator {
	/**
	 * The '<em><b>Titre</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TITRE_VALUE
	 * @generated
	 * @ordered
	 */
	TITRE(0, "Titre", "Titre"),

	/**
	 * The '<em><b>H1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #H1_VALUE
	 * @generated
	 * @ordered
	 */
	H1(1, "H1", "H1"),

	/**
	 * The '<em><b>H2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #H2_VALUE
	 * @generated
	 * @ordered
	 */
	H2(2, "H2", "H2"),

	/**
	 * The '<em><b>H3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #H3_VALUE
	 * @generated
	 * @ordered
	 */
	H3(3, "H3", "H3"),

	/**
	 * The '<em><b>H4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #H4_VALUE
	 * @generated
	 * @ordered
	 */
	H4(4, "H4", "H4"),

	/**
	 * The '<em><b>P</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #P_VALUE
	 * @generated
	 * @ordered
	 */
	P(5, "P", "P"),

	/**
	 * The '<em><b>Span</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPAN_VALUE
	 * @generated
	 * @ordered
	 */
	SPAN(6, "span", "span"),

	/**
	 * The '<em><b>Div</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIV_VALUE
	 * @generated
	 * @ordered
	 */
	DIV(7, "div", "div");

	/**
	 * The '<em><b>Titre</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TITRE
	 * @model name="Titre"
	 * @generated
	 * @ordered
	 */
	public static final int TITRE_VALUE = 0;

	/**
	 * The '<em><b>H1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #H1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int H1_VALUE = 1;

	/**
	 * The '<em><b>H2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #H2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int H2_VALUE = 2;

	/**
	 * The '<em><b>H3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #H3
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int H3_VALUE = 3;

	/**
	 * The '<em><b>H4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #H4
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int H4_VALUE = 4;

	/**
	 * The '<em><b>P</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #P
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int P_VALUE = 5;

	/**
	 * The '<em><b>Span</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPAN
	 * @model name="span"
	 * @generated
	 * @ordered
	 */
	public static final int SPAN_VALUE = 6;

	/**
	 * The '<em><b>Div</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIV
	 * @model name="div"
	 * @generated
	 * @ordered
	 */
	public static final int DIV_VALUE = 7;

	/**
	 * An array of all the '<em><b>Balise Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Balise_Type[] VALUES_ARRAY = new Balise_Type[] { TITRE, H1, H2, H3, H4, P, SPAN, DIV, };

	/**
	 * A public read-only list of all the '<em><b>Balise Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Balise_Type> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Balise Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Balise_Type get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Balise_Type result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Balise Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Balise_Type getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Balise_Type result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Balise Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Balise_Type get(int value) {
		switch (value) {
		case TITRE_VALUE:
			return TITRE;
		case H1_VALUE:
			return H1;
		case H2_VALUE:
			return H2;
		case H3_VALUE:
			return H3;
		case H4_VALUE:
			return H4;
		case P_VALUE:
			return P;
		case SPAN_VALUE:
			return SPAN;
		case DIV_VALUE:
			return DIV;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Balise_Type(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //Balise_Type
