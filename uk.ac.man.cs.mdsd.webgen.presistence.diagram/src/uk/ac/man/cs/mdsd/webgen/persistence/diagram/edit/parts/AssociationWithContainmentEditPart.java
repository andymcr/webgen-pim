package uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.policies.AssociationWithContainmentItemSemanticEditPolicy;

/**
 * @generated
 */
public class AssociationWithContainmentEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4002;

	/**
	* @generated
	*/
	public AssociationWithContainmentEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new AssociationWithContainmentItemSemanticEditPolicy());
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof AssociationWithContainmentNameEditPart) {
			((AssociationWithContainmentNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureContainedAssociationNameLabel());
			return true;
		}
		if (childEditPart instanceof AssociationWithContainmentCardinalityEditPart) {
			((AssociationWithContainmentCardinalityEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureContainedAssociationMultiplicityLabel());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, index);
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof AssociationWithContainmentNameEditPart) {
			return true;
		}
		if (childEditPart instanceof AssociationWithContainmentCardinalityEditPart) {
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/

	protected Connection createConnectionFigure() {
		return new ContainedAssociationFigure();
	}

	/**
	* @generated
	*/
	public ContainedAssociationFigure getPrimaryShape() {
		return (ContainedAssociationFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ContainedAssociationFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureContainedAssociationNameLabel;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureContainedAssociationMultiplicityLabel;

		/**
		 * @generated
		 */
		public ContainedAssociationFigure() {

			createContents();
			setSourceDecoration(createSourceDecoration());
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureContainedAssociationNameLabel = new WrappingLabel();

			fFigureContainedAssociationNameLabel.setText("");

			this.add(fFigureContainedAssociationNameLabel);

			fFigureContainedAssociationMultiplicityLabel = new WrappingLabel();

			fFigureContainedAssociationMultiplicityLabel.setText("");

			this.add(fFigureContainedAssociationMultiplicityLabel);

		}

		/**
		 * @generated
		 */
		private RotatableDecoration createSourceDecoration() {
			PolygonDecoration df = new PolygonDecoration();
			df.setFill(true);
			PointList pl = new PointList();
			pl.addPoint(getMapMode().DPtoLP(-1), getMapMode().DPtoLP(1));
			pl.addPoint(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0));
			pl.addPoint(getMapMode().DPtoLP(-1), getMapMode().DPtoLP(-1));
			pl.addPoint(getMapMode().DPtoLP(-2), getMapMode().DPtoLP(0));
			pl.addPoint(getMapMode().DPtoLP(-1), getMapMode().DPtoLP(1));
			df.setTemplate(pl);
			df.setScale(getMapMode().DPtoLP(7), getMapMode().DPtoLP(3));
			return df;
		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			PointList pl = new PointList();
			pl.addPoint(getMapMode().DPtoLP(-1), getMapMode().DPtoLP(1));
			pl.addPoint(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0));
			pl.addPoint(getMapMode().DPtoLP(-1), getMapMode().DPtoLP(-1));
			df.setTemplate(pl);
			df.setScale(getMapMode().DPtoLP(7), getMapMode().DPtoLP(3));
			return df;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureContainedAssociationNameLabel() {
			return fFigureContainedAssociationNameLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureContainedAssociationMultiplicityLabel() {
			return fFigureContainedAssociationMultiplicityLabel;
		}

	}

}
