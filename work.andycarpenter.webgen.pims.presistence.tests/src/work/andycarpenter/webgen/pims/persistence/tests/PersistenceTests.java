/**
 */
package work.andycarpenter.webgen.pims.persistence.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>persistence</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class PersistenceTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new PersistenceTests("persistence Tests");
		suite.addTestSuite(EntityTest.class);
		suite.addTestSuite(PathRootTest.class);
		suite.addTestSuite(ChildAssociationTest.class);
		suite.addTestSuite(ChildAttributeTest.class);
		suite.addTestSuite(ChildResourceTest.class);
		suite.addTestSuite(ModelLabelAssociationTest.class);
		suite.addTestSuite(ModelLabelAttributeTest.class);
		suite.addTestSuite(SelectionTest.class);
		suite.addTestSuite(SelectionPathTest.class);
		suite.addTestSuite(AscTest.class);
		suite.addTestSuite(DescTest.class);
		suite.addTestSuite(FilterTest.class);
		suite.addTestSuite(AssociationVariableTest.class);
		suite.addTestSuite(AttributeVariableTest.class);
		suite.addTestSuite(ResourceVariableTest.class);
		suite.addTestSuite(ParameterVariableTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceTests(String name) {
		super(name);
	}

} //PersistenceTests
