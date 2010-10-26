package org.eclipse.ese.ui.quickfix;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ese.validation.AndroidJavaValidator;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;

public class AndroidQuickfixProvider extends DefaultQuickfixProvider {

	@Fix(AndroidJavaValidator.CAPITALIZE)
	public void capitalizeName(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Capitalize name", "Capitalize the name.", "upcase.png", new IModification() {
			public void apply(IModificationContext context) throws BadLocationException {
				IXtextDocument xtextDocument = context.getXtextDocument();
				String firstLetter = xtextDocument.get(issue.getOffset(), 1);
				xtextDocument.replace(issue.getOffset(), 1, firstLetter.toUpperCase());
			}
		});
	}

	@Fix(AndroidJavaValidator.REMOVE_ELEMENT)
	public void removeLink(final Issue issue, IssueResolutionAcceptor acceptor) {
		String typeName = issue.getData()[0];
		acceptor.accept(issue, "Remove " + typeName, "Remove this "+ typeName +".", "delete.png", new ISemanticModification() {
			public void apply(EObject element, IModificationContext context) throws Exception {
				EcoreUtil.remove(element);
			}
		});
	}

}
