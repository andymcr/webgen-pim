/**
 */
package work.andycarpenter.webgen.pims.persistence.tests;

import junit.textui.TestRunner;

import work.andycarpenter.webgen.pims.persistence.LocationAttribute;
import work.andycarpenter.webgen.pims.persistence.PersistenceFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Location Attribute</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LocationAttributeTest extends AttributeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LocationAttributeTest.class);
	}

	/**
	 * Constructs a new Location Attribute test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationAttributeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Location Attribute test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LocationAttribute getFixture() {
		return (LocationAttribute)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PersistenceFactory.eINSTANCE.createLocationAttribute());
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

} //LocationAttributeTest
