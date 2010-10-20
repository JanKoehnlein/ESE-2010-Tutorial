/*
 * generated by Xtext
 */
package org.eclipse.ese.ui;

import org.eclipse.ese.ui.contentassist.AndroidCompletionProposalPostProcessor;
import org.eclipse.ese.ui.contentassist.AndroidTemplateProposalProvider;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalPostProcessor;
import org.eclipse.xtext.ui.editor.contentassist.ITemplateProposalProvider;

/**
 * Use this class to register components to be used within the IDE.
 */
public class AndroidUiModule extends org.eclipse.ese.ui.AbstractAndroidUiModule {
	public AndroidUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	@Override
	public Class<? extends ICompletionProposalPostProcessor> bindICompletionProposalPostProcessor() {
		return AndroidCompletionProposalPostProcessor.class;
	}
	
	@Override
	public Class<? extends ITemplateProposalProvider> bindITemplateProposalProvider() {
		return AndroidTemplateProposalProvider.class;
	}
}