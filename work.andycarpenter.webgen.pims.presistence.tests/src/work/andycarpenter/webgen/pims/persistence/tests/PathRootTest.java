/**
 */
package work.andycarpenter.webgen.pims.persistence.tests;

import junit.textui.TestRunner;

import work.andycarpenter.webgen.pims.persistence.PathRoot;
import work.andycarpenter.webgen.pims.persistence.PersistenceFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Path Root</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PathRootTest extends PathTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PathRootTest.class);
	}

	/**
	 * Constructs a new Path Root test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathRootTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Path Root test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PathRoot getFixture() {
		return (PathRoot)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PersistenceFactory.eINSTANCE.createPathRoot());
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

} //PathRootTest
