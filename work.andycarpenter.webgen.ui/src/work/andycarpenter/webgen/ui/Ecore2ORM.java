package work.andycarpenter.webgen.ui;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

public class Ecore2ORM extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();
		if (selection != null) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Object firstElement = structuredSelection.getFirstElement();
			if (firstElement instanceof IFile) {
				IFile file = (IFile) firstElement;
				ResourceSet resourceSet = new ResourceSetImpl();
				Resource ecoreModel = resourceSet.getResource(
					URI.createPlatformResourceURI(file.getFullPath().toString(), true), true);
				Resource dslModel = resourceSet.createResource(URI.createURI(file.getFullPath().toString() + "txt"));
				dslModel.getContents().addAll(ecoreModel.getContents());
				try {
					dslModel.save(Collections.EMPTY_MAP);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
