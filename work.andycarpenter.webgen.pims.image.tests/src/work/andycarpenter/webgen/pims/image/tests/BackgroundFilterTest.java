/**
 */
package work.andycarpenter.webgen.pims.image.tests;

import junit.textui.TestRunner;

import work.andycarpenter.webgen.pims.image.BackgroundFilter;
import work.andycarpenter.webgen.pims.image.ImageFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Background Filter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BackgroundFilterTest extends ImageFilterTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BackgroundFilterTest.class);
	}

	/**
	 * Constructs a new Background Filter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackgroundFilterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Background Filter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BackgroundFilter getFixture() {
		return (BackgroundFilter)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ImageFactory.eINSTANCE.createBackgroundFilter());
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

} //BackgroundFilterTest
