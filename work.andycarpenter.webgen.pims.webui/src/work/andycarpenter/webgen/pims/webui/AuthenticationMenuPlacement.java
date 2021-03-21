/**
 */
package work.andycarpenter.webgen.pims.webui;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Authentication Menu Placement</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see work.andycarpenter.webgen.pims.webui.WebuiPackage#getAuthenticationMenuPlacement()
 * @model
 * @generated
 */
public enum AuthenticationMenuPlacement implements Enumerator {
	/**
	 * The '<em><b>Above</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABOVE_VALUE
	 * @generated
	 * @ordered
	 */
	ABOVE(0, "Above", "Above"),

	/**
	 * The '<em><b>Below</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BELOW_VALUE
	 * @generated
	 * @ordered
	 */
	BELOW(1, "Below", "Below"),

	/**
	 * The '<em><b>Integrated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGRATED_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGRATED(2, "Integrated", "Integrated");

	/**
	 * The '<em><b>Above</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABOVE
	 * @model name="Above"
	 * @generated
	 * @ordered
	 */
	public static final int ABOVE_VALUE = 0;

	/**
	 * The '<em><b>Below</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BELOW
	 * @model name="Below"
	 * @generated
	 * @ordered
	 */
	public static final int BELOW_VALUE = 1;

	/**
	 * The '<em><b>Integrated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGRATED
	 * @model name="Integrated"
	 * @generated
	 * @ordered
	 */
	public static final int INTEGRATED_VALUE = 2;

	/**
	 * An array of all the '<em><b>Authentication Menu Placement</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AuthenticationMenuPlacement[] VALUES_ARRAY =
		new AuthenticationMenuPlacement[] {
			ABOVE,
			BELOW,
			INTEGRATED,
		};

	/**
	 * A public read-only list of all the '<em><b>Authentication Menu Placement</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AuthenticationMenuPlacement> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Authentication Menu Placement</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AuthenticationMenuPlacement get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AuthenticationMenuPlacement result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Authentication Menu Placement</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AuthenticationMenuPlacement getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AuthenticationMenuPlacement result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Authentication Menu Placement</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AuthenticationMenuPlacement get(int value) {
		switch (value) {
			case ABOVE_VALUE: return ABOVE;
			case BELOW_VALUE: return BELOW;
			case INTEGRATED_VALUE: return INTEGRATED;
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
	private AuthenticationMenuPlacement(int value, String name, String literal) {
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
	
} //AuthenticationMenuPlacement
