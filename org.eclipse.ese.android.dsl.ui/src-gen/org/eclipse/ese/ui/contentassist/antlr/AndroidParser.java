/*
* generated by Xtext
*/
package org.eclipse.ese.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.eclipse.ese.services.AndroidGrammarAccess;

public class AndroidParser extends AbstractContentAssistParser {
	
	@Inject
	private AndroidGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.eclipse.ese.ui.contentassist.antlr.internal.InternalAndroidParser createParser() {
		org.eclipse.ese.ui.contentassist.antlr.internal.InternalAndroidParser result = new org.eclipse.ese.ui.contentassist.antlr.internal.InternalAndroidParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getEntryAccess().getAlternatives(), "rule__Entry__Alternatives");
					put(grammarAccess.getWidgetAccess().getAlternatives(), "rule__Widget__Alternatives");
					put(grammarAccess.getIdOrStringAccess().getAlternatives(), "rule__IdOrString__Alternatives");
					put(grammarAccess.getProjectAccess().getGroup(), "rule__Project__Group__0");
					put(grammarAccess.getActivityAccess().getGroup(), "rule__Activity__Group__0");
					put(grammarAccess.getTextAccess().getGroup(), "rule__Text__Group__0");
					put(grammarAccess.getButtonAccess().getGroup(), "rule__Button__Group__0");
					put(grammarAccess.getSpinnerAccess().getGroup(), "rule__Spinner__Group__0");
					put(grammarAccess.getLinkAccess().getGroup(), "rule__Link__Group__0");
					put(grammarAccess.getProjectAccess().getNameAssignment_1(), "rule__Project__NameAssignment_1");
					put(grammarAccess.getProjectAccess().getActivitiesAssignment_2(), "rule__Project__ActivitiesAssignment_2");
					put(grammarAccess.getActivityAccess().getNameAssignment_1(), "rule__Activity__NameAssignment_1");
					put(grammarAccess.getActivityAccess().getWidgetsAssignment_3(), "rule__Activity__WidgetsAssignment_3");
					put(grammarAccess.getTextAccess().getNameAssignment_1(), "rule__Text__NameAssignment_1");
					put(grammarAccess.getButtonAccess().getNameAssignment_1(), "rule__Button__NameAssignment_1");
					put(grammarAccess.getSpinnerAccess().getNameAssignment_1(), "rule__Spinner__NameAssignment_1");
					put(grammarAccess.getLinkAccess().getNameAssignment_1(), "rule__Link__NameAssignment_1");
					put(grammarAccess.getLinkAccess().getActivityAssignment_3(), "rule__Link__ActivityAssignment_3");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.eclipse.ese.ui.contentassist.antlr.internal.InternalAndroidParser typedParser = (org.eclipse.ese.ui.contentassist.antlr.internal.InternalAndroidParser) parser;
			typedParser.entryRuleEntry();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public AndroidGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(AndroidGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
