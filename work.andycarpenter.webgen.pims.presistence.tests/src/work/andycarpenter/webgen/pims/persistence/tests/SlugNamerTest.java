/**
 */
package work.andycarpenter.webgen.pims.persistence.tests;

import junit.textui.TestRunner;

import work.andycarpenter.webgen.pims.persistence.PersistenceFactory;
import work.andycarpenter.webgen.pims.persistence.SlugNamer;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Slug Namer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SlugNamerTest extends FileNamerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SlugNamerTest.class);
	}

	/**
	 * Constructs a new Slug Namer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlugNamerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Slug Namer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SlugNamer getFixture() {
		return (SlugNamer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PersistenceFactory.eINSTANCE.createSlugNamer());
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

} //SlugNamerTest
