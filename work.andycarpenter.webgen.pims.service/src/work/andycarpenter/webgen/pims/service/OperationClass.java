/**
 */
package work.andycarpenter.webgen.pims.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Operation Class</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see work.andycarpenter.webgen.pims.service.ServicePackage#getOperationClass()
 * @model
 * @generated
 */
public enum OperationClass implements Enumerator {
	/**
	 * The '<em><b>Read Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	READ_ONLY(0, "ReadOnly", "ReadOnly"),

	/**
	 * The '<em><b>Costly</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COSTLY_VALUE
	 * @generated
	 * @ordered
	 */
	COSTLY(1, "Costly", "Costly"),

	/**
	 * The '<em><b>Modifying</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODIFYING_VALUE
	 * @generated
	 * @ordered
	 */
	MODIFYING(2, "Modifying", "Modifying");

	/**
	 * The '<em><b>Read Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_ONLY
	 * @model name="ReadOnly"
	 * @generated
	 * @ordered
	 */
	public static final int READ_ONLY_VALUE = 0;

	/**
	 * The '<em><b>Costly</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COSTLY
	 * @model name="Costly"
	 * @generated
	 * @ordered
	 */
	public static final int COSTLY_VALUE = 1;

	/**
	 * The '<em><b>Modifying</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODIFYING
	 * @model name="Modifying"
	 * @generated
	 * @ordered
	 */
	public static final int MODIFYING_VALUE = 2;

	/**
	 * An array of all the '<em><b>Operation Class</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OperationClass[] VALUES_ARRAY =
		new OperationClass[] {
			READ_ONLY,
			COSTLY,
			MODIFYING,
		};

	/**
	 * A public read-only list of all the '<em><b>Operation Class</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OperationClass> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Operation Class</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OperationClass get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OperationClass result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operation Class</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OperationClass getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OperationClass result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operation Class</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OperationClass get(int value) {
		switch (value) {
			case READ_ONLY_VALUE: return READ_ONLY;
			case COSTLY_VALUE: return COSTLY;
			case MODIFYING_VALUE: return MODIFYING;
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
	private OperationClass(int value, String name, String literal) {
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
	
} //OperationClass
