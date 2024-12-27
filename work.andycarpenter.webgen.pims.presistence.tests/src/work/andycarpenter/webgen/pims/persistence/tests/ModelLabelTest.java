/**
 */
package work.andycarpenter.webgen.pims.persistence.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import work.andycarpenter.webgen.pims.persistence.ModelLabel;
import work.andycarpenter.webgen.pims.persistence.PersistenceFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Model Label</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelLabelTest extends TestCase {

	/**
	 * The fixture for this Model Label test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelLabel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ModelLabelTest.class);
	}

	/**
	 * Constructs a new Model Label test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelLabelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Model Label test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ModelLabel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Model Label test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelLabel getFixture() {
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
		setFixture(PersistenceFactory.eINSTANCE.createModelLabel());
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

} //ModelLabelTest
