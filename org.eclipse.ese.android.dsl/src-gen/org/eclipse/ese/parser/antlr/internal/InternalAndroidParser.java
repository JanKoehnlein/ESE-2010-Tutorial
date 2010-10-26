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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Application'", "'Activity'", "'{'", "'}'", "'Text'", "'Button'", "'Spinner'", "'Link'", "'->'"
    };
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int EOF=-1;
    public static final int RULE_INT=6;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;

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
        	return "Entry";	
       	}
       	
       	@Override
       	protected AndroidGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleEntry
    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:77:1: entryRuleEntry returns [EObject current=null] : iv_ruleEntry= ruleEntry EOF ;
    public final EObject entryRuleEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntry = null;


        try {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:78:2: (iv_ruleEntry= ruleEntry EOF )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:79:2: iv_ruleEntry= ruleEntry EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEntryRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleEntry_in_entryRuleEntry75);
            iv_ruleEntry=ruleEntry();
            _fsp--;

             current =iv_ruleEntry; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEntry85); 

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
    // $ANTLR end entryRuleEntry


    // $ANTLR start ruleEntry
    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:86:1: ruleEntry returns [EObject current=null] : (this_Application_0= ruleApplication | this_Activity_1= ruleActivity ) ;
    public final EObject ruleEntry() throws RecognitionException {
        EObject current = null;

        EObject this_Application_0 = null;

        EObject this_Activity_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:91:6: ( (this_Application_0= ruleApplication | this_Activity_1= ruleActivity ) )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:92:1: (this_Application_0= ruleApplication | this_Activity_1= ruleActivity )
            {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:92:1: (this_Application_0= ruleApplication | this_Activity_1= ruleActivity )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("92:1: (this_Application_0= ruleApplication | this_Activity_1= ruleActivity )", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:93:5: this_Application_0= ruleApplication
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEntryAccess().getApplicationParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleApplication_in_ruleEntry132);
                    this_Application_0=ruleApplication();
                    _fsp--;

                     
                            current = this_Application_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:103:5: this_Activity_1= ruleActivity
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getEntryAccess().getActivityParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleActivity_in_ruleEntry159);
                    this_Activity_1=ruleActivity();
                    _fsp--;

                     
                            current = this_Activity_1; 
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
    // $ANTLR end ruleEntry


    // $ANTLR start entryRuleApplication
    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:119:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:120:2: (iv_ruleApplication= ruleApplication EOF )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:121:2: iv_ruleApplication= ruleApplication EOF
            {
             currentNode = createCompositeNode(grammarAccess.getApplicationRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleApplication_in_entryRuleApplication194);
            iv_ruleApplication=ruleApplication();
            _fsp--;

             current =iv_ruleApplication; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleApplication204); 

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
    // $ANTLR end entryRuleApplication


    // $ANTLR start ruleApplication
    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:128:1: ruleApplication returns [EObject current=null] : ( 'Application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_activities_2_0= ruleActivity ) )+ ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_activities_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:133:6: ( ( 'Application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_activities_2_0= ruleActivity ) )+ ) )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:134:1: ( 'Application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_activities_2_0= ruleActivity ) )+ )
            {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:134:1: ( 'Application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_activities_2_0= ruleActivity ) )+ )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:134:3: 'Application' ( (lv_name_1_0= RULE_ID ) ) ( (lv_activities_2_0= ruleActivity ) )+
            {
            match(input,11,FollowSets000.FOLLOW_11_in_ruleApplication239); 

                    createLeafNode(grammarAccess.getApplicationAccess().getApplicationKeyword_0(), null); 
                
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:138:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:139:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:139:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:140:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleApplication256); 

            			createLeafNode(grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getApplicationRule().getType().getClassifier());
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

            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:162:2: ( (lv_activities_2_0= ruleActivity ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:163:1: (lv_activities_2_0= ruleActivity )
            	    {
            	    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:163:1: (lv_activities_2_0= ruleActivity )
            	    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:164:3: lv_activities_2_0= ruleActivity
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getApplicationAccess().getActivitiesActivityParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleActivity_in_ruleApplication282);
            	    lv_activities_2_0=ruleActivity();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getApplicationRule().getType().getClassifier());
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // $ANTLR end ruleApplication


    // $ANTLR start entryRuleActivity
    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:194:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:195:2: (iv_ruleActivity= ruleActivity EOF )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:196:2: iv_ruleActivity= ruleActivity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getActivityRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleActivity_in_entryRuleActivity319);
            iv_ruleActivity=ruleActivity();
            _fsp--;

             current =iv_ruleActivity; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleActivity329); 

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
    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:203:1: ruleActivity returns [EObject current=null] : ( 'Activity' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_widgets_3_0= ruleWidget ) )* '}' ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_widgets_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:208:6: ( ( 'Activity' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_widgets_3_0= ruleWidget ) )* '}' ) )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:209:1: ( 'Activity' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_widgets_3_0= ruleWidget ) )* '}' )
            {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:209:1: ( 'Activity' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_widgets_3_0= ruleWidget ) )* '}' )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:209:3: 'Activity' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_widgets_3_0= ruleWidget ) )* '}'
            {
            match(input,12,FollowSets000.FOLLOW_12_in_ruleActivity364); 

                    createLeafNode(grammarAccess.getActivityAccess().getActivityKeyword_0(), null); 
                
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:213:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:214:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:214:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:215:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleActivity381); 

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

            match(input,13,FollowSets000.FOLLOW_13_in_ruleActivity396); 

                    createLeafNode(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:241:1: ( (lv_widgets_3_0= ruleWidget ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=15 && LA3_0<=18)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:242:1: (lv_widgets_3_0= ruleWidget )
            	    {
            	    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:242:1: (lv_widgets_3_0= ruleWidget )
            	    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:243:3: lv_widgets_3_0= ruleWidget
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getActivityAccess().getWidgetsWidgetParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleWidget_in_ruleActivity417);
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
            	    break loop3;
                }
            } while (true);

            match(input,14,FollowSets000.FOLLOW_14_in_ruleActivity428); 

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
    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:277:1: entryRuleWidget returns [EObject current=null] : iv_ruleWidget= ruleWidget EOF ;
    public final EObject entryRuleWidget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidget = null;


        try {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:278:2: (iv_ruleWidget= ruleWidget EOF )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:279:2: iv_ruleWidget= ruleWidget EOF
            {
             currentNode = createCompositeNode(grammarAccess.getWidgetRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleWidget_in_entryRuleWidget464);
            iv_ruleWidget=ruleWidget();
            _fsp--;

             current =iv_ruleWidget; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWidget474); 

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
    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:286:1: ruleWidget returns [EObject current=null] : (this_Text_0= ruleText | this_Button_1= ruleButton | this_Spinner_2= ruleSpinner | this_Link_3= ruleLink ) ;
    public final EObject ruleWidget() throws RecognitionException {
        EObject current = null;

        EObject this_Text_0 = null;

        EObject this_Button_1 = null;

        EObject this_Spinner_2 = null;

        EObject this_Link_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:291:6: ( (this_Text_0= ruleText | this_Button_1= ruleButton | this_Spinner_2= ruleSpinner | this_Link_3= ruleLink ) )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:292:1: (this_Text_0= ruleText | this_Button_1= ruleButton | this_Spinner_2= ruleSpinner | this_Link_3= ruleLink )
            {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:292:1: (this_Text_0= ruleText | this_Button_1= ruleButton | this_Spinner_2= ruleSpinner | this_Link_3= ruleLink )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case 17:
                {
                alt4=3;
                }
                break;
            case 18:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("292:1: (this_Text_0= ruleText | this_Button_1= ruleButton | this_Spinner_2= ruleSpinner | this_Link_3= ruleLink )", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:293:5: this_Text_0= ruleText
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getWidgetAccess().getTextParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleText_in_ruleWidget521);
                    this_Text_0=ruleText();
                    _fsp--;

                     
                            current = this_Text_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:303:5: this_Button_1= ruleButton
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getWidgetAccess().getButtonParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleButton_in_ruleWidget548);
                    this_Button_1=ruleButton();
                    _fsp--;

                     
                            current = this_Button_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:313:5: this_Spinner_2= ruleSpinner
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getWidgetAccess().getSpinnerParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSpinner_in_ruleWidget575);
                    this_Spinner_2=ruleSpinner();
                    _fsp--;

                     
                            current = this_Spinner_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:323:5: this_Link_3= ruleLink
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getWidgetAccess().getLinkParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLink_in_ruleWidget602);
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
    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:339:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:340:2: (iv_ruleText= ruleText EOF )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:341:2: iv_ruleText= ruleText EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTextRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleText_in_entryRuleText637);
            iv_ruleText=ruleText();
            _fsp--;

             current =iv_ruleText; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleText647); 

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
    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:348:1: ruleText returns [EObject current=null] : ( 'Text' ( (lv_name_1_0= ruleIdOrString ) ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:353:6: ( ( 'Text' ( (lv_name_1_0= ruleIdOrString ) ) ) )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:354:1: ( 'Text' ( (lv_name_1_0= ruleIdOrString ) ) )
            {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:354:1: ( 'Text' ( (lv_name_1_0= ruleIdOrString ) ) )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:354:3: 'Text' ( (lv_name_1_0= ruleIdOrString ) )
            {
            match(input,15,FollowSets000.FOLLOW_15_in_ruleText682); 

                    createLeafNode(grammarAccess.getTextAccess().getTextKeyword_0(), null); 
                
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:358:1: ( (lv_name_1_0= ruleIdOrString ) )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:359:1: (lv_name_1_0= ruleIdOrString )
            {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:359:1: (lv_name_1_0= ruleIdOrString )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:360:3: lv_name_1_0= ruleIdOrString
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTextAccess().getNameIdOrStringParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleIdOrString_in_ruleText703);
            lv_name_1_0=ruleIdOrString();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTextRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"IdOrString", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

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
    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:390:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:391:2: (iv_ruleButton= ruleButton EOF )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:392:2: iv_ruleButton= ruleButton EOF
            {
             currentNode = createCompositeNode(grammarAccess.getButtonRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleButton_in_entryRuleButton739);
            iv_ruleButton=ruleButton();
            _fsp--;

             current =iv_ruleButton; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleButton749); 

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
    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:399:1: ruleButton returns [EObject current=null] : ( 'Button' ( (lv_name_1_0= ruleIdOrString ) ) ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:404:6: ( ( 'Button' ( (lv_name_1_0= ruleIdOrString ) ) ) )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:405:1: ( 'Button' ( (lv_name_1_0= ruleIdOrString ) ) )
            {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:405:1: ( 'Button' ( (lv_name_1_0= ruleIdOrString ) ) )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:405:3: 'Button' ( (lv_name_1_0= ruleIdOrString ) )
            {
            match(input,16,FollowSets000.FOLLOW_16_in_ruleButton784); 

                    createLeafNode(grammarAccess.getButtonAccess().getButtonKeyword_0(), null); 
                
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:409:1: ( (lv_name_1_0= ruleIdOrString ) )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:410:1: (lv_name_1_0= ruleIdOrString )
            {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:410:1: (lv_name_1_0= ruleIdOrString )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:411:3: lv_name_1_0= ruleIdOrString
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getButtonAccess().getNameIdOrStringParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleIdOrString_in_ruleButton805);
            lv_name_1_0=ruleIdOrString();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getButtonRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"IdOrString", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

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
    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:441:1: entryRuleSpinner returns [EObject current=null] : iv_ruleSpinner= ruleSpinner EOF ;
    public final EObject entryRuleSpinner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpinner = null;


        try {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:442:2: (iv_ruleSpinner= ruleSpinner EOF )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:443:2: iv_ruleSpinner= ruleSpinner EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSpinnerRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleSpinner_in_entryRuleSpinner841);
            iv_ruleSpinner=ruleSpinner();
            _fsp--;

             current =iv_ruleSpinner; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSpinner851); 

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
    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:450:1: ruleSpinner returns [EObject current=null] : ( 'Spinner' ( (lv_name_1_0= ruleIdOrString ) ) ) ;
    public final EObject ruleSpinner() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:455:6: ( ( 'Spinner' ( (lv_name_1_0= ruleIdOrString ) ) ) )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:456:1: ( 'Spinner' ( (lv_name_1_0= ruleIdOrString ) ) )
            {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:456:1: ( 'Spinner' ( (lv_name_1_0= ruleIdOrString ) ) )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:456:3: 'Spinner' ( (lv_name_1_0= ruleIdOrString ) )
            {
            match(input,17,FollowSets000.FOLLOW_17_in_ruleSpinner886); 

                    createLeafNode(grammarAccess.getSpinnerAccess().getSpinnerKeyword_0(), null); 
                
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:460:1: ( (lv_name_1_0= ruleIdOrString ) )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:461:1: (lv_name_1_0= ruleIdOrString )
            {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:461:1: (lv_name_1_0= ruleIdOrString )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:462:3: lv_name_1_0= ruleIdOrString
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSpinnerAccess().getNameIdOrStringParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleIdOrString_in_ruleSpinner907);
            lv_name_1_0=ruleIdOrString();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSpinnerRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"IdOrString", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

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
    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:492:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:493:2: (iv_ruleLink= ruleLink EOF )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:494:2: iv_ruleLink= ruleLink EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLinkRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleLink_in_entryRuleLink943);
            iv_ruleLink=ruleLink();
            _fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLink953); 

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
    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:501:1: ruleLink returns [EObject current=null] : ( 'Link' ( (lv_name_1_0= ruleIdOrString ) ) '->' ( ( RULE_ID ) ) ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:506:6: ( ( 'Link' ( (lv_name_1_0= ruleIdOrString ) ) '->' ( ( RULE_ID ) ) ) )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:507:1: ( 'Link' ( (lv_name_1_0= ruleIdOrString ) ) '->' ( ( RULE_ID ) ) )
            {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:507:1: ( 'Link' ( (lv_name_1_0= ruleIdOrString ) ) '->' ( ( RULE_ID ) ) )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:507:3: 'Link' ( (lv_name_1_0= ruleIdOrString ) ) '->' ( ( RULE_ID ) )
            {
            match(input,18,FollowSets000.FOLLOW_18_in_ruleLink988); 

                    createLeafNode(grammarAccess.getLinkAccess().getLinkKeyword_0(), null); 
                
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:511:1: ( (lv_name_1_0= ruleIdOrString ) )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:512:1: (lv_name_1_0= ruleIdOrString )
            {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:512:1: (lv_name_1_0= ruleIdOrString )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:513:3: lv_name_1_0= ruleIdOrString
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLinkAccess().getNameIdOrStringParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleIdOrString_in_ruleLink1009);
            lv_name_1_0=ruleIdOrString();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"IdOrString", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,19,FollowSets000.FOLLOW_19_in_ruleLink1019); 

                    createLeafNode(grammarAccess.getLinkAccess().getHyphenMinusGreaterThanSignKeyword_2(), null); 
                
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:539:1: ( ( RULE_ID ) )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:540:1: ( RULE_ID )
            {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:540:1: ( RULE_ID )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:541:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getLinkRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleLink1037); 

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


    // $ANTLR start entryRuleIdOrString
    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:561:1: entryRuleIdOrString returns [String current=null] : iv_ruleIdOrString= ruleIdOrString EOF ;
    public final String entryRuleIdOrString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrString = null;


        try {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:562:2: (iv_ruleIdOrString= ruleIdOrString EOF )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:563:2: iv_ruleIdOrString= ruleIdOrString EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIdOrStringRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleIdOrString_in_entryRuleIdOrString1074);
            iv_ruleIdOrString=ruleIdOrString();
            _fsp--;

             current =iv_ruleIdOrString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIdOrString1085); 

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
    // $ANTLR end entryRuleIdOrString


    // $ANTLR start ruleIdOrString
    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:570:1: ruleIdOrString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleIdOrString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:575:6: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING ) )
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:576:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING )
            {
            // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:576:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_STRING) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("576:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING )", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:576:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleIdOrString1125); 

                    		current.merge(this_ID_0);
                        
                     
                        createLeafNode(grammarAccess.getIdOrStringAccess().getIDTerminalRuleCall_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ese.android.dsl/src-gen/org/eclipse/ese/parser/antlr/internal/InternalAndroid.g:584:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)input.LT(1);
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleIdOrString1151); 

                    		current.merge(this_STRING_1);
                        
                     
                        createLeafNode(grammarAccess.getIdOrStringAccess().getSTRINGTerminalRuleCall_1(), null); 
                        

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
    // $ANTLR end ruleIdOrString


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleEntry_in_entryRuleEntry75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEntry85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleApplication_in_ruleEntry132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleActivity_in_ruleEntry159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleApplication_in_entryRuleApplication194 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleApplication204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleApplication239 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleApplication256 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_ruleActivity_in_ruleApplication282 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity319 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleActivity329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleActivity364 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleActivity381 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleActivity396 = new BitSet(new long[]{0x000000000007C000L});
        public static final BitSet FOLLOW_ruleWidget_in_ruleActivity417 = new BitSet(new long[]{0x000000000007C000L});
        public static final BitSet FOLLOW_14_in_ruleActivity428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWidget_in_entryRuleWidget464 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWidget474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleText_in_ruleWidget521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleButton_in_ruleWidget548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSpinner_in_ruleWidget575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLink_in_ruleWidget602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleText_in_entryRuleText637 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleText647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleText682 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleIdOrString_in_ruleText703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleButton_in_entryRuleButton739 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleButton749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleButton784 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleIdOrString_in_ruleButton805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSpinner_in_entryRuleSpinner841 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSpinner851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleSpinner886 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleIdOrString_in_ruleSpinner907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLink_in_entryRuleLink943 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLink953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleLink988 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleIdOrString_in_ruleLink1009 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleLink1019 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleLink1037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIdOrString_in_entryRuleIdOrString1074 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIdOrString1085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleIdOrString1125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleIdOrString1151 = new BitSet(new long[]{0x0000000000000002L});
    }


}