/*
* generated by Xtext
*/
grammar InternalAndroid;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.eclipse.ese.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.ese.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.ese.services.AndroidGrammarAccess;

}

@parser::members {

 	private AndroidGrammarAccess grammarAccess;
 	
    public InternalAndroidParser(TokenStream input, IAstFactory factory, AndroidGrammarAccess grammarAccess) {
        this(input);
        this.factory = factory;
        registerRules(grammarAccess.getGrammar());
        this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected InputStream getTokenFile() {
    	ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/eclipse/ese/parser/antlr/internal/InternalAndroid.tokens");
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Entry";	
   	}
   	
   	@Override
   	protected AndroidGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleEntry
entryRuleEntry returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getEntryRule(), currentNode); }
	 iv_ruleEntry=ruleEntry 
	 { $current=$iv_ruleEntry.current; } 
	 EOF 
;

// Rule Entry
ruleEntry returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(
    { 
        currentNode=createCompositeNode(grammarAccess.getEntryAccess().getApplicationParserRuleCall_0(), currentNode); 
    }
    this_Application_0=ruleApplication
    { 
        $current = $this_Application_0.current; 
        currentNode = currentNode.getParent();
    }

    |
    { 
        currentNode=createCompositeNode(grammarAccess.getEntryAccess().getActivityParserRuleCall_1(), currentNode); 
    }
    this_Activity_1=ruleActivity
    { 
        $current = $this_Activity_1.current; 
        currentNode = currentNode.getParent();
    }
)
;





// Entry rule entryRuleApplication
entryRuleApplication returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getApplicationRule(), currentNode); }
	 iv_ruleApplication=ruleApplication 
	 { $current=$iv_ruleApplication.current; } 
	 EOF 
;

// Rule Application
ruleApplication returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'Application' 
    {
        createLeafNode(grammarAccess.getApplicationAccess().getApplicationKeyword_0(), null); 
    }
(
(
		lv_name_1_0=RULE_ID
		{
			createLeafNode(grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getApplicationRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"name",
	        		lv_name_1_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getApplicationAccess().getActivitiesActivityParserRuleCall_2_0(), currentNode); 
	    }
		lv_activities_2_0=ruleActivity		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getApplicationRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"activities",
	        		lv_activities_2_0, 
	        		"Activity", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)+)
;





// Entry rule entryRuleActivity
entryRuleActivity returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getActivityRule(), currentNode); }
	 iv_ruleActivity=ruleActivity 
	 { $current=$iv_ruleActivity.current; } 
	 EOF 
;

// Rule Activity
ruleActivity returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'Activity' 
    {
        createLeafNode(grammarAccess.getActivityAccess().getActivityKeyword_0(), null); 
    }
(
(
		lv_name_1_0=RULE_ID
		{
			createLeafNode(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
		}
		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getActivityRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"name",
	        		lv_name_1_0, 
	        		"ID", 
	        		lastConsumedNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	    }

)
)	'{' 
    {
        createLeafNode(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_2(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getActivityAccess().getWidgetsWidgetParserRuleCall_3_0(), currentNode); 
	    }
		lv_widgets_3_0=ruleWidget		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getActivityRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		add(
	       			$current, 
	       			"widgets",
	        		lv_widgets_3_0, 
	        		"Widget", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)*	'}' 
    {
        createLeafNode(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_4(), null); 
    }
)
;





// Entry rule entryRuleWidget
entryRuleWidget returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getWidgetRule(), currentNode); }
	 iv_ruleWidget=ruleWidget 
	 { $current=$iv_ruleWidget.current; } 
	 EOF 
;

// Rule Widget
ruleWidget returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(
    { 
        currentNode=createCompositeNode(grammarAccess.getWidgetAccess().getTextParserRuleCall_0(), currentNode); 
    }
    this_Text_0=ruleText
    { 
        $current = $this_Text_0.current; 
        currentNode = currentNode.getParent();
    }

    |
    { 
        currentNode=createCompositeNode(grammarAccess.getWidgetAccess().getSpinnerParserRuleCall_1(), currentNode); 
    }
    this_Spinner_1=ruleSpinner
    { 
        $current = $this_Spinner_1.current; 
        currentNode = currentNode.getParent();
    }

    |
    { 
        currentNode=createCompositeNode(grammarAccess.getWidgetAccess().getLinkParserRuleCall_2(), currentNode); 
    }
    this_Link_2=ruleLink
    { 
        $current = $this_Link_2.current; 
        currentNode = currentNode.getParent();
    }
)
;





// Entry rule entryRuleText
entryRuleText returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getTextRule(), currentNode); }
	 iv_ruleText=ruleText 
	 { $current=$iv_ruleText.current; } 
	 EOF 
;

// Rule Text
ruleText returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'Text' 
    {
        createLeafNode(grammarAccess.getTextAccess().getTextKeyword_0(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getTextAccess().getNameIdOrStringParserRuleCall_1_0(), currentNode); 
	    }
		lv_name_1_0=ruleIdOrString		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getTextRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"name",
	        		lv_name_1_0, 
	        		"IdOrString", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
))
;





// Entry rule entryRuleSpinner
entryRuleSpinner returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getSpinnerRule(), currentNode); }
	 iv_ruleSpinner=ruleSpinner 
	 { $current=$iv_ruleSpinner.current; } 
	 EOF 
;

// Rule Spinner
ruleSpinner returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'Spinner' 
    {
        createLeafNode(grammarAccess.getSpinnerAccess().getSpinnerKeyword_0(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getSpinnerAccess().getNameIdOrStringParserRuleCall_1_0(), currentNode); 
	    }
		lv_name_1_0=ruleIdOrString		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getSpinnerRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"name",
	        		lv_name_1_0, 
	        		"IdOrString", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
))
;





// Entry rule entryRuleLink
entryRuleLink returns [EObject current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getLinkRule(), currentNode); }
	 iv_ruleLink=ruleLink 
	 { $current=$iv_ruleLink.current; } 
	 EOF 
;

// Rule Link
ruleLink returns [EObject current=null] 
    @init { EObject temp=null; setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
    	lastConsumedNode = currentNode;
    }:
(	'Link' 
    {
        createLeafNode(grammarAccess.getLinkAccess().getLinkKeyword_0(), null); 
    }
(
(
		{ 
	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getNameIdOrStringParserRuleCall_1_0(), currentNode); 
	    }
		lv_name_1_0=ruleIdOrString		{
	        if ($current==null) {
	            $current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode.getParent(), $current);
	        }
	        try {
	       		set(
	       			$current, 
	       			"name",
	        		lv_name_1_0, 
	        		"IdOrString", 
	        		currentNode);
	        } catch (ValueConverterException vce) {
				handleValueConverterException(vce);
	        }
	        currentNode = currentNode.getParent();
	    }

)
)	'->' 
    {
        createLeafNode(grammarAccess.getLinkAccess().getHyphenMinusGreaterThanSignKeyword_2(), null); 
    }
(
(
		{
			if ($current==null) {
	            $current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
	            associateNodeWithAstElement(currentNode, $current);
	        }
        }
		{ 
	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getActivityActivityCrossReference_3_0(), currentNode); 
	    }
		ruleIdOrString		{ 
	        currentNode = currentNode.getParent();
	    }

)
))
;





// Entry rule entryRuleIdOrString
entryRuleIdOrString returns [String current=null] 
	:
	{ currentNode = createCompositeNode(grammarAccess.getIdOrStringRule(), currentNode); } 
	 iv_ruleIdOrString=ruleIdOrString 
	 { $current=$iv_ruleIdOrString.current.getText(); }  
	 EOF 
;

// Rule IdOrString
ruleIdOrString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { setCurrentLookahead(); resetLookahead(); 
    }
    @after { resetLookahead(); 
	    lastConsumedNode = currentNode;
    }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    createLeafNode(grammarAccess.getIdOrStringAccess().getIDTerminalRuleCall_0(), null); 
    }

    |    this_STRING_1=RULE_STRING    {
		$current.merge(this_STRING_1);
    }

    { 
    createLeafNode(grammarAccess.getIdOrStringAccess().getSTRINGTerminalRuleCall_1(), null); 
    }
)
    ;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


