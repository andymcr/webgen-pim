/**
 */
package work.andycarpenter.webgen.pims.persistence.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import work.andycarpenter.webgen.pims.persistence.PersistenceFactory;
import work.andycarpenter.webgen.pims.persistence.SerializationGroup;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Serialization Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SerializationGroupTest extends TestCase {

	/**
	 * The fixture for this Serialization Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SerializationGroup fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SerializationGroupTest.class);
	}

	/**
	 * Constructs a new Serialization Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerializationGroupTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Serialization Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SerializationGroup fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Serialization Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SerializationGroup getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PersistenceFactory.eINSTANCE.createSerializationGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //SerializationGroupTest
