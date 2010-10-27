/*
* generated by Xtext
*/
grammar InternalAndroid;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.eclipse.ese.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.eclipse.ese.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.eclipse.ese.services.AndroidGrammarAccess;

}

@parser::members {
 
 	private AndroidGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(AndroidGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleEntry
entryRuleEntry 
:
{ before(grammarAccess.getEntryRule()); }
	 ruleEntry
{ after(grammarAccess.getEntryRule()); } 
	 EOF 
;

// Rule Entry
ruleEntry
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEntryAccess().getAlternatives()); }
(rule__Entry__Alternatives)
{ after(grammarAccess.getEntryAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleApplication
entryRuleApplication 
:
{ before(grammarAccess.getApplicationRule()); }
	 ruleApplication
{ after(grammarAccess.getApplicationRule()); } 
	 EOF 
;

// Rule Application
ruleApplication
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getApplicationAccess().getGroup()); }
(rule__Application__Group__0)
{ after(grammarAccess.getApplicationAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleActivity
entryRuleActivity 
:
{ before(grammarAccess.getActivityRule()); }
	 ruleActivity
{ after(grammarAccess.getActivityRule()); } 
	 EOF 
;

// Rule Activity
ruleActivity
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getActivityAccess().getGroup()); }
(rule__Activity__Group__0)
{ after(grammarAccess.getActivityAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleWidget
entryRuleWidget 
:
{ before(grammarAccess.getWidgetRule()); }
	 ruleWidget
{ after(grammarAccess.getWidgetRule()); } 
	 EOF 
;

// Rule Widget
ruleWidget
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getWidgetAccess().getAlternatives()); }
(rule__Widget__Alternatives)
{ after(grammarAccess.getWidgetAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleText
entryRuleText 
:
{ before(grammarAccess.getTextRule()); }
	 ruleText
{ after(grammarAccess.getTextRule()); } 
	 EOF 
;

// Rule Text
ruleText
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getTextAccess().getGroup()); }
(rule__Text__Group__0)
{ after(grammarAccess.getTextAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleButton
entryRuleButton 
:
{ before(grammarAccess.getButtonRule()); }
	 ruleButton
{ after(grammarAccess.getButtonRule()); } 
	 EOF 
;

// Rule Button
ruleButton
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getButtonAccess().getGroup()); }
(rule__Button__Group__0)
{ after(grammarAccess.getButtonAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleSpinner
entryRuleSpinner 
:
{ before(grammarAccess.getSpinnerRule()); }
	 ruleSpinner
{ after(grammarAccess.getSpinnerRule()); } 
	 EOF 
;

// Rule Spinner
ruleSpinner
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getSpinnerAccess().getGroup()); }
(rule__Spinner__Group__0)
{ after(grammarAccess.getSpinnerAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleLink
entryRuleLink 
:
{ before(grammarAccess.getLinkRule()); }
	 ruleLink
{ after(grammarAccess.getLinkRule()); } 
	 EOF 
;

// Rule Link
ruleLink
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getLinkAccess().getGroup()); }
(rule__Link__Group__0)
{ after(grammarAccess.getLinkAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleIdOrString
entryRuleIdOrString 
:
{ before(grammarAccess.getIdOrStringRule()); }
	 ruleIdOrString
{ after(grammarAccess.getIdOrStringRule()); } 
	 EOF 
;

// Rule IdOrString
ruleIdOrString
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getIdOrStringAccess().getAlternatives()); }
(rule__IdOrString__Alternatives)
{ after(grammarAccess.getIdOrStringAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__Entry__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntryAccess().getApplicationParserRuleCall_0()); }
	ruleApplication
{ after(grammarAccess.getEntryAccess().getApplicationParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getEntryAccess().getActivityParserRuleCall_1()); }
	ruleActivity
{ after(grammarAccess.getEntryAccess().getActivityParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Widget__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getWidgetAccess().getTextParserRuleCall_0()); }
	ruleText
{ after(grammarAccess.getWidgetAccess().getTextParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getWidgetAccess().getButtonParserRuleCall_1()); }
	ruleButton
{ after(grammarAccess.getWidgetAccess().getButtonParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getWidgetAccess().getSpinnerParserRuleCall_2()); }
	ruleSpinner
{ after(grammarAccess.getWidgetAccess().getSpinnerParserRuleCall_2()); }
)

    |(
{ before(grammarAccess.getWidgetAccess().getLinkParserRuleCall_3()); }
	ruleLink
{ after(grammarAccess.getWidgetAccess().getLinkParserRuleCall_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__IdOrString__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIdOrStringAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
{ after(grammarAccess.getIdOrStringAccess().getIDTerminalRuleCall_0()); }
)

    |(
{ before(grammarAccess.getIdOrStringAccess().getSTRINGTerminalRuleCall_1()); }
	RULE_STRING
{ after(grammarAccess.getIdOrStringAccess().getSTRINGTerminalRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Application__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Application__Group__0__Impl
	rule__Application__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Application__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); }

	'Application' 

{ after(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Application__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Application__Group__1__Impl
	rule__Application__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Application__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getApplicationAccess().getNameAssignment_1()); }
(rule__Application__NameAssignment_1)
{ after(grammarAccess.getApplicationAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Application__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Application__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Application__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getApplicationAccess().getActivitiesAssignment_2()); }
(rule__Application__ActivitiesAssignment_2)
{ after(grammarAccess.getApplicationAccess().getActivitiesAssignment_2()); }
)
(
{ before(grammarAccess.getApplicationAccess().getActivitiesAssignment_2()); }
(rule__Application__ActivitiesAssignment_2)*
{ after(grammarAccess.getApplicationAccess().getActivitiesAssignment_2()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Activity__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Activity__Group__0__Impl
	rule__Activity__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Activity__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getActivityAccess().getActivityKeyword_0()); }

	'Activity' 

{ after(grammarAccess.getActivityAccess().getActivityKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Activity__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Activity__Group__1__Impl
	rule__Activity__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Activity__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getActivityAccess().getNameAssignment_1()); }
(rule__Activity__NameAssignment_1)
{ after(grammarAccess.getActivityAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Activity__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Activity__Group__2__Impl
	rule__Activity__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Activity__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Activity__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Activity__Group__3__Impl
	rule__Activity__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Activity__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getActivityAccess().getWidgetsAssignment_3()); }
(rule__Activity__WidgetsAssignment_3)*
{ after(grammarAccess.getActivityAccess().getWidgetsAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Activity__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Activity__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Activity__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Text__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Text__Group__0__Impl
	rule__Text__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Text__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTextAccess().getTextKeyword_0()); }

	'Text' 

{ after(grammarAccess.getTextAccess().getTextKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Text__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Text__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Text__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTextAccess().getNameAssignment_1()); }
(rule__Text__NameAssignment_1)
{ after(grammarAccess.getTextAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Button__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Button__Group__0__Impl
	rule__Button__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Button__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getButtonAccess().getButtonKeyword_0()); }

	'Button' 

{ after(grammarAccess.getButtonAccess().getButtonKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Button__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Button__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Button__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getButtonAccess().getNameAssignment_1()); }
(rule__Button__NameAssignment_1)
{ after(grammarAccess.getButtonAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Spinner__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Spinner__Group__0__Impl
	rule__Spinner__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Spinner__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSpinnerAccess().getSpinnerKeyword_0()); }

	'Spinner' 

{ after(grammarAccess.getSpinnerAccess().getSpinnerKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Spinner__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Spinner__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Spinner__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSpinnerAccess().getNameAssignment_1()); }
(rule__Spinner__NameAssignment_1)
{ after(grammarAccess.getSpinnerAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Link__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Link__Group__0__Impl
	rule__Link__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Link__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLinkAccess().getLinkKeyword_0()); }

	'Link' 

{ after(grammarAccess.getLinkAccess().getLinkKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Link__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Link__Group__1__Impl
	rule__Link__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Link__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLinkAccess().getNameAssignment_1()); }
(rule__Link__NameAssignment_1)
{ after(grammarAccess.getLinkAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Link__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Link__Group__2__Impl
	rule__Link__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Link__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLinkAccess().getHyphenMinusGreaterThanSignKeyword_2()); }

	'->' 

{ after(grammarAccess.getLinkAccess().getHyphenMinusGreaterThanSignKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Link__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Link__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Link__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLinkAccess().getActivityAssignment_3()); }
(rule__Link__ActivityAssignment_3)
{ after(grammarAccess.getLinkAccess().getActivityAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}











rule__Application__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Application__ActivitiesAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getApplicationAccess().getActivitiesActivityParserRuleCall_2_0()); }
	ruleActivity{ after(grammarAccess.getApplicationAccess().getActivitiesActivityParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Activity__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Activity__WidgetsAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getActivityAccess().getWidgetsWidgetParserRuleCall_3_0()); }
	ruleWidget{ after(grammarAccess.getActivityAccess().getWidgetsWidgetParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Text__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTextAccess().getNameIdOrStringParserRuleCall_1_0()); }
	ruleIdOrString{ after(grammarAccess.getTextAccess().getNameIdOrStringParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Button__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getButtonAccess().getNameIdOrStringParserRuleCall_1_0()); }
	ruleIdOrString{ after(grammarAccess.getButtonAccess().getNameIdOrStringParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Spinner__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSpinnerAccess().getNameIdOrStringParserRuleCall_1_0()); }
	ruleIdOrString{ after(grammarAccess.getSpinnerAccess().getNameIdOrStringParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Link__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLinkAccess().getNameIdOrStringParserRuleCall_1_0()); }
	ruleIdOrString{ after(grammarAccess.getLinkAccess().getNameIdOrStringParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Link__ActivityAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLinkAccess().getActivityActivityCrossReference_3_0()); }
(
{ before(grammarAccess.getLinkAccess().getActivityActivityIdOrStringParserRuleCall_3_0_1()); }
	ruleIdOrString{ after(grammarAccess.getLinkAccess().getActivityActivityIdOrStringParserRuleCall_3_0_1()); }
)
{ after(grammarAccess.getLinkAccess().getActivityActivityCrossReference_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


