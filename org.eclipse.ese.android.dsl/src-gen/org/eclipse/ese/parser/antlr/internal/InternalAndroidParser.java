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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAndroidParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Project'", "'Activity'", "'{'", "'}'", "'Text'", "'Button'", "'Spinner'", "'Link'", "'->'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalAndroidParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g"; }



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
        	return "Project";	
       	}
       	
       	@Override
       	protected AndroidGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleProject
    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:77:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:78:2: (iv_ruleProject= ruleProject EOF )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:79:2: iv_ruleProject= ruleProject EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProjectRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleProject_in_entryRuleProject75);
            iv_ruleProject=ruleProject();
            _fsp--;

             current =iv_ruleProject; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProject85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleProject


    // $ANTLR start ruleProject
    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:86:1: ruleProject returns [EObject current=null] : ( 'Project' ( (lv_name_1_0= RULE_ID ) ) ( (lv_activities_2_0= ruleActivity ) )+ ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_activities_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:91:6: ( ( 'Project' ( (lv_name_1_0= RULE_ID ) ) ( (lv_activities_2_0= ruleActivity ) )+ ) )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:92:1: ( 'Project' ( (lv_name_1_0= RULE_ID ) ) ( (lv_activities_2_0= ruleActivity ) )+ )
            {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:92:1: ( 'Project' ( (lv_name_1_0= RULE_ID ) ) ( (lv_activities_2_0= ruleActivity ) )+ )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:92:3: 'Project' ( (lv_name_1_0= RULE_ID ) ) ( (lv_activities_2_0= ruleActivity ) )+
            {
            match(input,11,FollowSets000.FOLLOW_11_in_ruleProject120); 

                    createLeafNode(grammarAccess.getProjectAccess().getProjectKeyword_0(), null); 
                
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:96:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:97:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:97:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:98:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleProject137); 

            			createLeafNode(grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProjectRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:120:2: ( (lv_activities_2_0= ruleActivity ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:121:1: (lv_activities_2_0= ruleActivity )
            	    {
            	    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:121:1: (lv_activities_2_0= ruleActivity )
            	    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:122:3: lv_activities_2_0= ruleActivity
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getProjectAccess().getActivitiesActivityParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleActivity_in_ruleProject163);
            	    lv_activities_2_0=ruleActivity();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getProjectRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"activities",
            	    	        		lv_activities_2_0, 
            	    	        		"Activity", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleProject


    // $ANTLR start entryRuleActivity
    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:152:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:153:2: (iv_ruleActivity= ruleActivity EOF )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:154:2: iv_ruleActivity= ruleActivity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActivityRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleActivity_in_entryRuleActivity200);
            iv_ruleActivity=ruleActivity();
            _fsp--;

             current =iv_ruleActivity; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleActivity210); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleActivity


    // $ANTLR start ruleActivity
    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:161:1: ruleActivity returns [EObject current=null] : ( 'Activity' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_widgets_3_0= ruleWidget ) )* '}' ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_widgets_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:166:6: ( ( 'Activity' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_widgets_3_0= ruleWidget ) )* '}' ) )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:167:1: ( 'Activity' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_widgets_3_0= ruleWidget ) )* '}' )
            {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:167:1: ( 'Activity' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_widgets_3_0= ruleWidget ) )* '}' )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:167:3: 'Activity' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_widgets_3_0= ruleWidget ) )* '}'
            {
            match(input,12,FollowSets000.FOLLOW_12_in_ruleActivity245); 

                    createLeafNode(grammarAccess.getActivityAccess().getActivityKeyword_0(), null); 
                
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:171:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:172:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:172:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:173:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleActivity262); 

            			createLeafNode(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getActivityRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,13,FollowSets000.FOLLOW_13_in_ruleActivity277); 

                    createLeafNode(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:199:1: ( (lv_widgets_3_0= ruleWidget ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=15 && LA2_0<=18)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:200:1: (lv_widgets_3_0= ruleWidget )
            	    {
            	    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:200:1: (lv_widgets_3_0= ruleWidget )
            	    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:201:3: lv_widgets_3_0= ruleWidget
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getActivityAccess().getWidgetsWidgetParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleWidget_in_ruleActivity298);
            	    lv_widgets_3_0=ruleWidget();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getActivityRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"widgets",
            	    	        		lv_widgets_3_0, 
            	    	        		"Widget", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match(input,14,FollowSets000.FOLLOW_14_in_ruleActivity309); 

                    createLeafNode(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleActivity


    // $ANTLR start entryRuleWidget
    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:235:1: entryRuleWidget returns [EObject current=null] : iv_ruleWidget= ruleWidget EOF ;
    public final EObject entryRuleWidget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidget = null;


        try {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:236:2: (iv_ruleWidget= ruleWidget EOF )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:237:2: iv_ruleWidget= ruleWidget EOF
            {
             currentNode = createCompositeNode(grammarAccess.getWidgetRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleWidget_in_entryRuleWidget345);
            iv_ruleWidget=ruleWidget();
            _fsp--;

             current =iv_ruleWidget; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWidget355); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleWidget


    // $ANTLR start ruleWidget
    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:244:1: ruleWidget returns [EObject current=null] : (this_Text_0= ruleText | this_Button_1= ruleButton | this_Spinner_2= ruleSpinner | this_Link_3= ruleLink ) ;
    public final EObject ruleWidget() throws RecognitionException {
        EObject current = null;

        EObject this_Text_0 = null;

        EObject this_Button_1 = null;

        EObject this_Spinner_2 = null;

        EObject this_Link_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:249:6: ( (this_Text_0= ruleText | this_Button_1= ruleButton | this_Spinner_2= ruleSpinner | this_Link_3= ruleLink ) )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:250:1: (this_Text_0= ruleText | this_Button_1= ruleButton | this_Spinner_2= ruleSpinner | this_Link_3= ruleLink )
            {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:250:1: (this_Text_0= ruleText | this_Button_1= ruleButton | this_Spinner_2= ruleSpinner | this_Link_3= ruleLink )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            case 18:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("250:1: (this_Text_0= ruleText | this_Button_1= ruleButton | this_Spinner_2= ruleSpinner | this_Link_3= ruleLink )", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:251:5: this_Text_0= ruleText
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getWidgetAccess().getTextParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleText_in_ruleWidget402);
                    this_Text_0=ruleText();
                    _fsp--;

                     
                            current = this_Text_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:261:5: this_Button_1= ruleButton
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getWidgetAccess().getButtonParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleButton_in_ruleWidget429);
                    this_Button_1=ruleButton();
                    _fsp--;

                     
                            current = this_Button_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:271:5: this_Spinner_2= ruleSpinner
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getWidgetAccess().getSpinnerParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSpinner_in_ruleWidget456);
                    this_Spinner_2=ruleSpinner();
                    _fsp--;

                     
                            current = this_Spinner_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:281:5: this_Link_3= ruleLink
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getWidgetAccess().getLinkParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLink_in_ruleWidget483);
                    this_Link_3=ruleLink();
                    _fsp--;

                     
                            current = this_Link_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleWidget


    // $ANTLR start entryRuleText
    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:297:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:298:2: (iv_ruleText= ruleText EOF )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:299:2: iv_ruleText= ruleText EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTextRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleText_in_entryRuleText518);
            iv_ruleText=ruleText();
            _fsp--;

             current =iv_ruleText; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleText528); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleText


    // $ANTLR start ruleText
    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:306:1: ruleText returns [EObject current=null] : ( 'Text' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:311:6: ( ( 'Text' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:312:1: ( 'Text' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:312:1: ( 'Text' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:312:3: 'Text' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,15,FollowSets000.FOLLOW_15_in_ruleText563); 

                    createLeafNode(grammarAccess.getTextAccess().getTextKeyword_0(), null); 
                
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:316:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:317:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:317:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:318:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleText580); 

            			createLeafNode(grammarAccess.getTextAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTextRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleText


    // $ANTLR start entryRuleButton
    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:348:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:349:2: (iv_ruleButton= ruleButton EOF )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:350:2: iv_ruleButton= ruleButton EOF
            {
             currentNode = createCompositeNode(grammarAccess.getButtonRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleButton_in_entryRuleButton621);
            iv_ruleButton=ruleButton();
            _fsp--;

             current =iv_ruleButton; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleButton631); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleButton


    // $ANTLR start ruleButton
    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:357:1: ruleButton returns [EObject current=null] : ( 'Button' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:362:6: ( ( 'Button' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:363:1: ( 'Button' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:363:1: ( 'Button' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:363:3: 'Button' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,16,FollowSets000.FOLLOW_16_in_ruleButton666); 

                    createLeafNode(grammarAccess.getButtonAccess().getButtonKeyword_0(), null); 
                
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:367:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:368:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:368:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:369:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleButton683); 

            			createLeafNode(grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getButtonRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleButton


    // $ANTLR start entryRuleSpinner
    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:399:1: entryRuleSpinner returns [EObject current=null] : iv_ruleSpinner= ruleSpinner EOF ;
    public final EObject entryRuleSpinner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpinner = null;


        try {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:400:2: (iv_ruleSpinner= ruleSpinner EOF )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:401:2: iv_ruleSpinner= ruleSpinner EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSpinnerRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleSpinner_in_entryRuleSpinner724);
            iv_ruleSpinner=ruleSpinner();
            _fsp--;

             current =iv_ruleSpinner; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSpinner734); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSpinner


    // $ANTLR start ruleSpinner
    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:408:1: ruleSpinner returns [EObject current=null] : ( 'Spinner' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSpinner() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:413:6: ( ( 'Spinner' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:414:1: ( 'Spinner' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:414:1: ( 'Spinner' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:414:3: 'Spinner' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,17,FollowSets000.FOLLOW_17_in_ruleSpinner769); 

                    createLeafNode(grammarAccess.getSpinnerAccess().getSpinnerKeyword_0(), null); 
                
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:418:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:419:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:419:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:420:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSpinner786); 

            			createLeafNode(grammarAccess.getSpinnerAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSpinnerRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSpinner


    // $ANTLR start entryRuleLink
    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:450:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:451:2: (iv_ruleLink= ruleLink EOF )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:452:2: iv_ruleLink= ruleLink EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLinkRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleLink_in_entryRuleLink827);
            iv_ruleLink=ruleLink();
            _fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLink837); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLink


    // $ANTLR start ruleLink
    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:459:1: ruleLink returns [EObject current=null] : ( 'Link' ( (lv_name_1_0= RULE_ID ) ) '->' ( ( RULE_ID ) ) ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:464:6: ( ( 'Link' ( (lv_name_1_0= RULE_ID ) ) '->' ( ( RULE_ID ) ) ) )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:465:1: ( 'Link' ( (lv_name_1_0= RULE_ID ) ) '->' ( ( RULE_ID ) ) )
            {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:465:1: ( 'Link' ( (lv_name_1_0= RULE_ID ) ) '->' ( ( RULE_ID ) ) )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:465:3: 'Link' ( (lv_name_1_0= RULE_ID ) ) '->' ( ( RULE_ID ) )
            {
            match(input,18,FollowSets000.FOLLOW_18_in_ruleLink872); 

                    createLeafNode(grammarAccess.getLinkAccess().getLinkKeyword_0(), null); 
                
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:469:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:470:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:470:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:471:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleLink889); 

            			createLeafNode(grammarAccess.getLinkAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,19,FollowSets000.FOLLOW_19_in_ruleLink904); 

                    createLeafNode(grammarAccess.getLinkAccess().getHyphenMinusGreaterThanSignKeyword_2(), null); 
                
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:497:1: ( ( RULE_ID ) )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:498:1: ( RULE_ID )
            {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:498:1: ( RULE_ID )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:499:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleLink922); 

            		createLeafNode(grammarAccess.getLinkAccess().getActivityActivityCrossReference_3_0(), "activity"); 
            	

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLink


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleProject_in_entryRuleProject75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProject85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleProject120 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleProject137 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_ruleActivity_in_ruleProject163 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity200 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleActivity210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleActivity245 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleActivity262 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleActivity277 = new BitSet(new long[]{0x000000000007C000L});
        public static final BitSet FOLLOW_ruleWidget_in_ruleActivity298 = new BitSet(new long[]{0x000000000007C000L});
        public static final BitSet FOLLOW_14_in_ruleActivity309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWidget_in_entryRuleWidget345 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWidget355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleText_in_ruleWidget402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleButton_in_ruleWidget429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSpinner_in_ruleWidget456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLink_in_ruleWidget483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleText_in_entryRuleText518 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleText528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleText563 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleText580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleButton_in_entryRuleButton621 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleButton631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleButton666 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleButton683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSpinner_in_entryRuleSpinner724 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSpinner734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleSpinner769 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSpinner786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLink_in_entryRuleLink827 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLink837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleLink872 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleLink889 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleLink904 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleLink922 = new BitSet(new long[]{0x0000000000000002L});
    }


}