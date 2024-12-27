/**
 */
package work.andycarpenter.webgen.pims.persistence.tests;

import junit.textui.TestRunner;

import work.andycarpenter.webgen.pims.persistence.Asc;
import work.andycarpenter.webgen.pims.persistence.PersistenceFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Asc</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AscTest extends OrderTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AscTest.class);
	}

	/**
	 * Constructs a new Asc test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AscTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Asc test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Asc getFixture() {
		return (Asc)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PersistenceFactory.eINSTANCE.createAsc());
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

} //AscTest
