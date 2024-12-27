/**
 */
package work.andycarpenter.webgen.pims.image.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import work.andycarpenter.webgen.pims.image.ImageFactory;
import work.andycarpenter.webgen.pims.image.ImageManipulation;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Manipulation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImageManipulationTest extends TestCase {

	/**
	 * The fixture for this Manipulation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageManipulation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ImageManipulationTest.class);
	}

	/**
	 * Constructs a new Manipulation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageManipulationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Manipulation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ImageManipulation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Manipulation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageManipulation getFixture() {
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
		setFixture(ImageFactory.eINSTANCE.createImageManipulation());
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

} //ImageManipulationTest
