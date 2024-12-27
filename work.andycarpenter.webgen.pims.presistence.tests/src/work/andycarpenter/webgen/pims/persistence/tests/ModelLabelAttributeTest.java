/**
 */
package work.andycarpenter.webgen.pims.persistence.tests;

import junit.textui.TestRunner;

import work.andycarpenter.webgen.pims.persistence.ModelLabelAttribute;
import work.andycarpenter.webgen.pims.persistence.PersistenceFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Model Label Attribute</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelLabelAttributeTest extends AttributePathElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ModelLabelAttributeTest.class);
	}

	/**
	 * Constructs a new Model Label Attribute test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelLabelAttributeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Model Label Attribute test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ModelLabelAttribute getFixture() {
		return (ModelLabelAttribute)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PersistenceFactory.eINSTANCE.createModelLabelAttribute());
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

} //ModelLabelAttributeTest
