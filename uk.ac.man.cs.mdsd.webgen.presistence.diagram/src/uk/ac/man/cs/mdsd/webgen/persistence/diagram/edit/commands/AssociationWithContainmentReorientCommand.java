package uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import uk.ac.man.cs.mdsd.webgen.persistence.AssociationWithContainment;
import uk.ac.man.cs.mdsd.webgen.persistence.Entity;
import uk.ac.man.cs.mdsd.webgen.persistence.diagram.edit.policies.PersistenceBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class AssociationWithContainmentReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public AssociationWithContainmentReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof AssociationWithContainment) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Entity && newEnd instanceof Entity)) {
			return false;
		}
		Entity target = getLink().getTargetEntity();
		return PersistenceBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistAssociationWithContainment_4002(getLink(), getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Entity && newEnd instanceof Entity)) {
			return false;
		}
		if (!(getLink().eContainer() instanceof Entity)) {
			return false;
		}
		Entity source = (Entity) getLink().eContainer();
		return PersistenceBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistAssociationWithContainment_4002(getLink(), source, getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().getEntityFeatures().remove(getLink());
		getNewSource().getEntityFeatures().add(getLink());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTargetEntity(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected AssociationWithContainment getLink() {
		return (AssociationWithContainment) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected Entity getOldSource() {
		return (Entity) oldEnd;
	}

	/**
	* @generated
	*/
	protected Entity getNewSource() {
		return (Entity) newEnd;
	}

	/**
	* @generated
	*/
	protected Entity getOldTarget() {
		return (Entity) oldEnd;
	}

	/**
	* @generated
	*/
	protected Entity getNewTarget() {
		return (Entity) newEnd;
	}
}
