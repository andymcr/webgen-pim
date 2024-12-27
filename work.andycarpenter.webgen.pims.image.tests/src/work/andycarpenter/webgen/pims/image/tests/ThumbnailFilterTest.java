/**
 */
package work.andycarpenter.webgen.pims.image.tests;

import junit.textui.TestRunner;

import work.andycarpenter.webgen.pims.image.ImageFactory;
import work.andycarpenter.webgen.pims.image.ThumbnailFilter;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Thumbnail Filter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ThumbnailFilterTest extends ImageFilterTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ThumbnailFilterTest.class);
	}

	/**
	 * Constructs a new Thumbnail Filter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThumbnailFilterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Thumbnail Filter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ThumbnailFilter getFixture() {
		return (ThumbnailFilter)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ImageFactory.eINSTANCE.createThumbnailFilter());
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

} //ThumbnailFilterTest
