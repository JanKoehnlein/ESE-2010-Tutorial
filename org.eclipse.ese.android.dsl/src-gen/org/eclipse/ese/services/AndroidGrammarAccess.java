/*
* generated by Xtext
*/

package org.eclipse.ese.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class AndroidGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class EntryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Entry");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cProjectParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cActivityParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Entry returns ecore::EObject:
		//	Project | Activity;
		public ParserRule getRule() { return rule; }

		//Project | Activity
		public Alternatives getAlternatives() { return cAlternatives; }

		//Project
		public RuleCall getProjectParserRuleCall_0() { return cProjectParserRuleCall_0; }

		//Activity
		public RuleCall getActivityParserRuleCall_1() { return cActivityParserRuleCall_1; }
	}

	public class ProjectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Project");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cProjectKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cActivitiesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cActivitiesActivityParserRuleCall_2_0 = (RuleCall)cActivitiesAssignment_2.eContents().get(0);
		
		//Project:
		//	"Project" name=ID activities+=Activity+;
		public ParserRule getRule() { return rule; }

		//"Project" name=ID activities+=Activity+
		public Group getGroup() { return cGroup; }

		//"Project"
		public Keyword getProjectKeyword_0() { return cProjectKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//activities+=Activity+
		public Assignment getActivitiesAssignment_2() { return cActivitiesAssignment_2; }

		//Activity
		public RuleCall getActivitiesActivityParserRuleCall_2_0() { return cActivitiesActivityParserRuleCall_2_0; }
	}

	public class ActivityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Activity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cActivityKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cWidgetsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cWidgetsWidgetParserRuleCall_3_0 = (RuleCall)cWidgetsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Activity:
		//	"Activity" name=ID "{" widgets+=Widget* "}";
		public ParserRule getRule() { return rule; }

		//"Activity" name=ID "{" widgets+=Widget* "}"
		public Group getGroup() { return cGroup; }

		//"Activity"
		public Keyword getActivityKeyword_0() { return cActivityKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//widgets+=Widget*
		public Assignment getWidgetsAssignment_3() { return cWidgetsAssignment_3; }

		//Widget
		public RuleCall getWidgetsWidgetParserRuleCall_3_0() { return cWidgetsWidgetParserRuleCall_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class WidgetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Widget");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cTextParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cButtonParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cSpinnerParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cLinkParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//Widget:
		//	Text | Button | Spinner | Link;
		public ParserRule getRule() { return rule; }

		//Text | Button | Spinner | Link
		public Alternatives getAlternatives() { return cAlternatives; }

		//Text
		public RuleCall getTextParserRuleCall_0() { return cTextParserRuleCall_0; }

		//Button
		public RuleCall getButtonParserRuleCall_1() { return cButtonParserRuleCall_1; }

		//Spinner
		public RuleCall getSpinnerParserRuleCall_2() { return cSpinnerParserRuleCall_2; }

		//Link
		public RuleCall getLinkParserRuleCall_3() { return cLinkParserRuleCall_3; }
	}

	public class TextElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Text");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTextKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIdOrStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Text:
		//	"Text" name=IdOrString;
		public ParserRule getRule() { return rule; }

		//"Text" name=IdOrString
		public Group getGroup() { return cGroup; }

		//"Text"
		public Keyword getTextKeyword_0() { return cTextKeyword_0; }

		//name=IdOrString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//IdOrString
		public RuleCall getNameIdOrStringParserRuleCall_1_0() { return cNameIdOrStringParserRuleCall_1_0; }
	}

	public class ButtonElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Button");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cButtonKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIdOrStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Button:
		//	"Button" name=IdOrString;
		public ParserRule getRule() { return rule; }

		//"Button" name=IdOrString
		public Group getGroup() { return cGroup; }

		//"Button"
		public Keyword getButtonKeyword_0() { return cButtonKeyword_0; }

		//name=IdOrString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//IdOrString
		public RuleCall getNameIdOrStringParserRuleCall_1_0() { return cNameIdOrStringParserRuleCall_1_0; }
	}

	public class SpinnerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Spinner");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSpinnerKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIdOrStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Spinner:
		//	"Spinner" name=IdOrString;
		public ParserRule getRule() { return rule; }

		//"Spinner" name=IdOrString
		public Group getGroup() { return cGroup; }

		//"Spinner"
		public Keyword getSpinnerKeyword_0() { return cSpinnerKeyword_0; }

		//name=IdOrString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//IdOrString
		public RuleCall getNameIdOrStringParserRuleCall_1_0() { return cNameIdOrStringParserRuleCall_1_0; }
	}

	public class LinkElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Link");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLinkKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIdOrStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cActivityAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cActivityActivityCrossReference_3_0 = (CrossReference)cActivityAssignment_3.eContents().get(0);
		private final RuleCall cActivityActivityIDTerminalRuleCall_3_0_1 = (RuleCall)cActivityActivityCrossReference_3_0.eContents().get(1);
		
		//Link:
		//	"Link" name=IdOrString "->" activity=[Activity];
		public ParserRule getRule() { return rule; }

		//"Link" name=IdOrString "->" activity=[Activity]
		public Group getGroup() { return cGroup; }

		//"Link"
		public Keyword getLinkKeyword_0() { return cLinkKeyword_0; }

		//name=IdOrString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//IdOrString
		public RuleCall getNameIdOrStringParserRuleCall_1_0() { return cNameIdOrStringParserRuleCall_1_0; }

		//"->"
		public Keyword getHyphenMinusGreaterThanSignKeyword_2() { return cHyphenMinusGreaterThanSignKeyword_2; }

		//activity=[Activity]
		public Assignment getActivityAssignment_3() { return cActivityAssignment_3; }

		//[Activity]
		public CrossReference getActivityActivityCrossReference_3_0() { return cActivityActivityCrossReference_3_0; }

		//ID
		public RuleCall getActivityActivityIDTerminalRuleCall_3_0_1() { return cActivityActivityIDTerminalRuleCall_3_0_1; }
	}

	public class IdOrStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "IdOrString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cSTRINGTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//IdOrString returns ecore::EString:
		//	ID | STRING;
		public ParserRule getRule() { return rule; }

		//ID | STRING
		public Alternatives getAlternatives() { return cAlternatives; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//STRING
		public RuleCall getSTRINGTerminalRuleCall_1() { return cSTRINGTerminalRuleCall_1; }
	}
	
	
	private EntryElements pEntry;
	private ProjectElements pProject;
	private ActivityElements pActivity;
	private WidgetElements pWidget;
	private TextElements pText;
	private ButtonElements pButton;
	private SpinnerElements pSpinner;
	private LinkElements pLink;
	private IdOrStringElements pIdOrString;
	
	private final GrammarProvider grammarProvider;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public AndroidGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammarProvider = grammarProvider;
		this.gaTerminals = gaTerminals;
	}
	
	public Grammar getGrammar() {	
		return grammarProvider.getGrammar(this);
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Entry returns ecore::EObject:
	//	Project | Activity;
	public EntryElements getEntryAccess() {
		return (pEntry != null) ? pEntry : (pEntry = new EntryElements());
	}
	
	public ParserRule getEntryRule() {
		return getEntryAccess().getRule();
	}

	//Project:
	//	"Project" name=ID activities+=Activity+;
	public ProjectElements getProjectAccess() {
		return (pProject != null) ? pProject : (pProject = new ProjectElements());
	}
	
	public ParserRule getProjectRule() {
		return getProjectAccess().getRule();
	}

	//Activity:
	//	"Activity" name=ID "{" widgets+=Widget* "}";
	public ActivityElements getActivityAccess() {
		return (pActivity != null) ? pActivity : (pActivity = new ActivityElements());
	}
	
	public ParserRule getActivityRule() {
		return getActivityAccess().getRule();
	}

	//Widget:
	//	Text | Button | Spinner | Link;
	public WidgetElements getWidgetAccess() {
		return (pWidget != null) ? pWidget : (pWidget = new WidgetElements());
	}
	
	public ParserRule getWidgetRule() {
		return getWidgetAccess().getRule();
	}

	//Text:
	//	"Text" name=IdOrString;
	public TextElements getTextAccess() {
		return (pText != null) ? pText : (pText = new TextElements());
	}
	
	public ParserRule getTextRule() {
		return getTextAccess().getRule();
	}

	//Button:
	//	"Button" name=IdOrString;
	public ButtonElements getButtonAccess() {
		return (pButton != null) ? pButton : (pButton = new ButtonElements());
	}
	
	public ParserRule getButtonRule() {
		return getButtonAccess().getRule();
	}

	//Spinner:
	//	"Spinner" name=IdOrString;
	public SpinnerElements getSpinnerAccess() {
		return (pSpinner != null) ? pSpinner : (pSpinner = new SpinnerElements());
	}
	
	public ParserRule getSpinnerRule() {
		return getSpinnerAccess().getRule();
	}

	//Link:
	//	"Link" name=IdOrString "->" activity=[Activity];
	public LinkElements getLinkAccess() {
		return (pLink != null) ? pLink : (pLink = new LinkElements());
	}
	
	public ParserRule getLinkRule() {
		return getLinkAccess().getRule();
	}

	//IdOrString returns ecore::EString:
	//	ID | STRING;
	public IdOrStringElements getIdOrStringAccess() {
		return (pIdOrString != null) ? pIdOrString : (pIdOrString = new IdOrStringElements());
	}
	
	public ParserRule getIdOrStringRule() {
		return getIdOrStringAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" | "n" |
	//	"f" | "r" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
