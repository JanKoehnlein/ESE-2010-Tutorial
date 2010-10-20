package org.eclipse.ese.ui.contentassist;

import java.util.Arrays;
import java.util.List;

import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.DefaultCompletionProposalPostProcessor;
import org.eclipse.xtext.ui.editor.templates.XtextTemplateProposal;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

public class AndroidCompletionProposalPostProcessor extends
		DefaultCompletionProposalPostProcessor {

	private static final String NAME_REPLACEMENT_STRING = "Name";
	
	@Override
	public ICompletionProposal[] postProcess(ICompletionProposal[] proposals) {
		List<ICompletionProposal> result =  Lists.newArrayList(Iterables.filter(Arrays.asList(proposals), new Predicate<ICompletionProposal>(){
			@Override
			public boolean apply(ICompletionProposal input) {
				if(input instanceof ConfigurableCompletionProposal){
					ConfigurableCompletionProposal proposal = (ConfigurableCompletionProposal) input;
					return proposal.getReplacementString().equals(NAME_REPLACEMENT_STRING);
				} 
				return input instanceof XtextTemplateProposal;
			}
		}));
		return super.postProcess(result.toArray(new ICompletionProposal[result.size()]));
	}
}
