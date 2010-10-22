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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAndroidParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g"; }


     
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




    // $ANTLR start entryRuleEntry
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:61:1: entryRuleEntry : ruleEntry EOF ;
    public final void entryRuleEntry() throws RecognitionException {
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:62:1: ( ruleEntry EOF )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:63:1: ruleEntry EOF
            {
             before(grammarAccess.getEntryRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntry_in_entryRuleEntry61);
            ruleEntry();
            _fsp--;

             after(grammarAccess.getEntryRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEntry68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEntry


    // $ANTLR start ruleEntry
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:70:1: ruleEntry : ( ( rule__Entry__Alternatives ) ) ;
    public final void ruleEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:74:2: ( ( ( rule__Entry__Alternatives ) ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:75:1: ( ( rule__Entry__Alternatives ) )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:75:1: ( ( rule__Entry__Alternatives ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:76:1: ( rule__Entry__Alternatives )
            {
             before(grammarAccess.getEntryAccess().getAlternatives()); 
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:77:1: ( rule__Entry__Alternatives )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:77:2: rule__Entry__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entry__Alternatives_in_ruleEntry94);
            rule__Entry__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getEntryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEntry


    // $ANTLR start entryRuleProject
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:89:1: entryRuleProject : ruleProject EOF ;
    public final void entryRuleProject() throws RecognitionException {
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:90:1: ( ruleProject EOF )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:91:1: ruleProject EOF
            {
             before(grammarAccess.getProjectRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProject_in_entryRuleProject121);
            ruleProject();
            _fsp--;

             after(grammarAccess.getProjectRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProject128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleProject


    // $ANTLR start ruleProject
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:98:1: ruleProject : ( ( rule__Project__Group__0 ) ) ;
    public final void ruleProject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:102:2: ( ( ( rule__Project__Group__0 ) ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:103:1: ( ( rule__Project__Group__0 ) )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:103:1: ( ( rule__Project__Group__0 ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:104:1: ( rule__Project__Group__0 )
            {
             before(grammarAccess.getProjectAccess().getGroup()); 
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:105:1: ( rule__Project__Group__0 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:105:2: rule__Project__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group__0_in_ruleProject154);
            rule__Project__Group__0();
            _fsp--;


            }

             after(grammarAccess.getProjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleProject


    // $ANTLR start entryRuleActivity
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:117:1: entryRuleActivity : ruleActivity EOF ;
    public final void entryRuleActivity() throws RecognitionException {
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:118:1: ( ruleActivity EOF )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:119:1: ruleActivity EOF
            {
             before(grammarAccess.getActivityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleActivity_in_entryRuleActivity181);
            ruleActivity();
            _fsp--;

             after(grammarAccess.getActivityRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleActivity188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleActivity


    // $ANTLR start ruleActivity
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:126:1: ruleActivity : ( ( rule__Activity__Group__0 ) ) ;
    public final void ruleActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:130:2: ( ( ( rule__Activity__Group__0 ) ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:131:1: ( ( rule__Activity__Group__0 ) )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:131:1: ( ( rule__Activity__Group__0 ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:132:1: ( rule__Activity__Group__0 )
            {
             before(grammarAccess.getActivityAccess().getGroup()); 
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:133:1: ( rule__Activity__Group__0 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:133:2: rule__Activity__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__0_in_ruleActivity214);
            rule__Activity__Group__0();
            _fsp--;


            }

             after(grammarAccess.getActivityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleActivity


    // $ANTLR start entryRuleWidget
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:145:1: entryRuleWidget : ruleWidget EOF ;
    public final void entryRuleWidget() throws RecognitionException {
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:146:1: ( ruleWidget EOF )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:147:1: ruleWidget EOF
            {
             before(grammarAccess.getWidgetRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWidget_in_entryRuleWidget241);
            ruleWidget();
            _fsp--;

             after(grammarAccess.getWidgetRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWidget248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleWidget


    // $ANTLR start ruleWidget
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:154:1: ruleWidget : ( ( rule__Widget__Alternatives ) ) ;
    public final void ruleWidget() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:158:2: ( ( ( rule__Widget__Alternatives ) ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:159:1: ( ( rule__Widget__Alternatives ) )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:159:1: ( ( rule__Widget__Alternatives ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:160:1: ( rule__Widget__Alternatives )
            {
             before(grammarAccess.getWidgetAccess().getAlternatives()); 
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:161:1: ( rule__Widget__Alternatives )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:161:2: rule__Widget__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Widget__Alternatives_in_ruleWidget274);
            rule__Widget__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getWidgetAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleWidget


    // $ANTLR start entryRuleText
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:173:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:174:1: ( ruleText EOF )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:175:1: ruleText EOF
            {
             before(grammarAccess.getTextRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleText_in_entryRuleText301);
            ruleText();
            _fsp--;

             after(grammarAccess.getTextRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleText308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleText


    // $ANTLR start ruleText
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:182:1: ruleText : ( ( rule__Text__Group__0 ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:186:2: ( ( ( rule__Text__Group__0 ) ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:187:1: ( ( rule__Text__Group__0 ) )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:187:1: ( ( rule__Text__Group__0 ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:188:1: ( rule__Text__Group__0 )
            {
             before(grammarAccess.getTextAccess().getGroup()); 
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:189:1: ( rule__Text__Group__0 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:189:2: rule__Text__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Text__Group__0_in_ruleText334);
            rule__Text__Group__0();
            _fsp--;


            }

             after(grammarAccess.getTextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleText


    // $ANTLR start entryRuleButton
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:201:1: entryRuleButton : ruleButton EOF ;
    public final void entryRuleButton() throws RecognitionException {
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:202:1: ( ruleButton EOF )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:203:1: ruleButton EOF
            {
             before(grammarAccess.getButtonRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleButton_in_entryRuleButton361);
            ruleButton();
            _fsp--;

             after(grammarAccess.getButtonRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleButton368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleButton


    // $ANTLR start ruleButton
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:210:1: ruleButton : ( ( rule__Button__Group__0 ) ) ;
    public final void ruleButton() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:214:2: ( ( ( rule__Button__Group__0 ) ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:215:1: ( ( rule__Button__Group__0 ) )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:215:1: ( ( rule__Button__Group__0 ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:216:1: ( rule__Button__Group__0 )
            {
             before(grammarAccess.getButtonAccess().getGroup()); 
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:217:1: ( rule__Button__Group__0 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:217:2: rule__Button__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Button__Group__0_in_ruleButton394);
            rule__Button__Group__0();
            _fsp--;


            }

             after(grammarAccess.getButtonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleButton


    // $ANTLR start entryRuleSpinner
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:229:1: entryRuleSpinner : ruleSpinner EOF ;
    public final void entryRuleSpinner() throws RecognitionException {
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:230:1: ( ruleSpinner EOF )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:231:1: ruleSpinner EOF
            {
             before(grammarAccess.getSpinnerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSpinner_in_entryRuleSpinner421);
            ruleSpinner();
            _fsp--;

             after(grammarAccess.getSpinnerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSpinner428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleSpinner


    // $ANTLR start ruleSpinner
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:238:1: ruleSpinner : ( ( rule__Spinner__Group__0 ) ) ;
    public final void ruleSpinner() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:242:2: ( ( ( rule__Spinner__Group__0 ) ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:243:1: ( ( rule__Spinner__Group__0 ) )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:243:1: ( ( rule__Spinner__Group__0 ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:244:1: ( rule__Spinner__Group__0 )
            {
             before(grammarAccess.getSpinnerAccess().getGroup()); 
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:245:1: ( rule__Spinner__Group__0 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:245:2: rule__Spinner__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Spinner__Group__0_in_ruleSpinner454);
            rule__Spinner__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSpinnerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSpinner


    // $ANTLR start entryRuleLink
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:257:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:258:1: ( ruleLink EOF )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:259:1: ruleLink EOF
            {
             before(grammarAccess.getLinkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLink_in_entryRuleLink481);
            ruleLink();
            _fsp--;

             after(grammarAccess.getLinkRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLink488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleLink


    // $ANTLR start ruleLink
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:266:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:270:2: ( ( ( rule__Link__Group__0 ) ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:271:1: ( ( rule__Link__Group__0 ) )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:271:1: ( ( rule__Link__Group__0 ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:272:1: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:273:1: ( rule__Link__Group__0 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:273:2: rule__Link__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Link__Group__0_in_ruleLink514);
            rule__Link__Group__0();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLink


    // $ANTLR start rule__Entry__Alternatives
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:285:1: rule__Entry__Alternatives : ( ( ruleProject ) | ( ruleActivity ) );
    public final void rule__Entry__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:289:1: ( ( ruleProject ) | ( ruleActivity ) )
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
                    new NoViableAltException("285:1: rule__Entry__Alternatives : ( ( ruleProject ) | ( ruleActivity ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:290:1: ( ruleProject )
                    {
                    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:290:1: ( ruleProject )
                    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:291:1: ruleProject
                    {
                     before(grammarAccess.getEntryAccess().getProjectParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleProject_in_rule__Entry__Alternatives550);
                    ruleProject();
                    _fsp--;

                     after(grammarAccess.getEntryAccess().getProjectParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:296:6: ( ruleActivity )
                    {
                    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:296:6: ( ruleActivity )
                    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:297:1: ruleActivity
                    {
                     before(grammarAccess.getEntryAccess().getActivityParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleActivity_in_rule__Entry__Alternatives567);
                    ruleActivity();
                    _fsp--;

                     after(grammarAccess.getEntryAccess().getActivityParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entry__Alternatives


    // $ANTLR start rule__Widget__Alternatives
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:307:1: rule__Widget__Alternatives : ( ( ruleText ) | ( ruleButton ) | ( ruleSpinner ) | ( ruleLink ) );
    public final void rule__Widget__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:311:1: ( ( ruleText ) | ( ruleButton ) | ( ruleSpinner ) | ( ruleLink ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 17:
                {
                alt2=3;
                }
                break;
            case 18:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("307:1: rule__Widget__Alternatives : ( ( ruleText ) | ( ruleButton ) | ( ruleSpinner ) | ( ruleLink ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:312:1: ( ruleText )
                    {
                    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:312:1: ( ruleText )
                    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:313:1: ruleText
                    {
                     before(grammarAccess.getWidgetAccess().getTextParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleText_in_rule__Widget__Alternatives599);
                    ruleText();
                    _fsp--;

                     after(grammarAccess.getWidgetAccess().getTextParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:318:6: ( ruleButton )
                    {
                    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:318:6: ( ruleButton )
                    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:319:1: ruleButton
                    {
                     before(grammarAccess.getWidgetAccess().getButtonParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleButton_in_rule__Widget__Alternatives616);
                    ruleButton();
                    _fsp--;

                     after(grammarAccess.getWidgetAccess().getButtonParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:324:6: ( ruleSpinner )
                    {
                    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:324:6: ( ruleSpinner )
                    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:325:1: ruleSpinner
                    {
                     before(grammarAccess.getWidgetAccess().getSpinnerParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSpinner_in_rule__Widget__Alternatives633);
                    ruleSpinner();
                    _fsp--;

                     after(grammarAccess.getWidgetAccess().getSpinnerParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:330:6: ( ruleLink )
                    {
                    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:330:6: ( ruleLink )
                    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:331:1: ruleLink
                    {
                     before(grammarAccess.getWidgetAccess().getLinkParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleLink_in_rule__Widget__Alternatives650);
                    ruleLink();
                    _fsp--;

                     after(grammarAccess.getWidgetAccess().getLinkParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Widget__Alternatives


    // $ANTLR start rule__Project__Group__0
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:343:1: rule__Project__Group__0 : rule__Project__Group__0__Impl rule__Project__Group__1 ;
    public final void rule__Project__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:347:1: ( rule__Project__Group__0__Impl rule__Project__Group__1 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:348:2: rule__Project__Group__0__Impl rule__Project__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group__0__Impl_in_rule__Project__Group__0680);
            rule__Project__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Project__Group__1_in_rule__Project__Group__0683);
            rule__Project__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__Group__0


    // $ANTLR start rule__Project__Group__0__Impl
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:355:1: rule__Project__Group__0__Impl : ( 'Project' ) ;
    public final void rule__Project__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:359:1: ( ( 'Project' ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:360:1: ( 'Project' )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:360:1: ( 'Project' )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:361:1: 'Project'
            {
             before(grammarAccess.getProjectAccess().getProjectKeyword_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Project__Group__0__Impl711); 
             after(grammarAccess.getProjectAccess().getProjectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__Group__0__Impl


    // $ANTLR start rule__Project__Group__1
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:374:1: rule__Project__Group__1 : rule__Project__Group__1__Impl rule__Project__Group__2 ;
    public final void rule__Project__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:378:1: ( rule__Project__Group__1__Impl rule__Project__Group__2 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:379:2: rule__Project__Group__1__Impl rule__Project__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group__1__Impl_in_rule__Project__Group__1742);
            rule__Project__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Project__Group__2_in_rule__Project__Group__1745);
            rule__Project__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__Group__1


    // $ANTLR start rule__Project__Group__1__Impl
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:386:1: rule__Project__Group__1__Impl : ( ( rule__Project__NameAssignment_1 ) ) ;
    public final void rule__Project__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:390:1: ( ( ( rule__Project__NameAssignment_1 ) ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:391:1: ( ( rule__Project__NameAssignment_1 ) )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:391:1: ( ( rule__Project__NameAssignment_1 ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:392:1: ( rule__Project__NameAssignment_1 )
            {
             before(grammarAccess.getProjectAccess().getNameAssignment_1()); 
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:393:1: ( rule__Project__NameAssignment_1 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:393:2: rule__Project__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__NameAssignment_1_in_rule__Project__Group__1__Impl772);
            rule__Project__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getProjectAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__Group__1__Impl


    // $ANTLR start rule__Project__Group__2
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:403:1: rule__Project__Group__2 : rule__Project__Group__2__Impl ;
    public final void rule__Project__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:407:1: ( rule__Project__Group__2__Impl )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:408:2: rule__Project__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group__2__Impl_in_rule__Project__Group__2802);
            rule__Project__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__Group__2


    // $ANTLR start rule__Project__Group__2__Impl
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:414:1: rule__Project__Group__2__Impl : ( ( ( rule__Project__ActivitiesAssignment_2 ) ) ( ( rule__Project__ActivitiesAssignment_2 )* ) ) ;
    public final void rule__Project__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:418:1: ( ( ( ( rule__Project__ActivitiesAssignment_2 ) ) ( ( rule__Project__ActivitiesAssignment_2 )* ) ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:419:1: ( ( ( rule__Project__ActivitiesAssignment_2 ) ) ( ( rule__Project__ActivitiesAssignment_2 )* ) )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:419:1: ( ( ( rule__Project__ActivitiesAssignment_2 ) ) ( ( rule__Project__ActivitiesAssignment_2 )* ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:420:1: ( ( rule__Project__ActivitiesAssignment_2 ) ) ( ( rule__Project__ActivitiesAssignment_2 )* )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:420:1: ( ( rule__Project__ActivitiesAssignment_2 ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:421:1: ( rule__Project__ActivitiesAssignment_2 )
            {
             before(grammarAccess.getProjectAccess().getActivitiesAssignment_2()); 
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:422:1: ( rule__Project__ActivitiesAssignment_2 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:422:2: rule__Project__ActivitiesAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__ActivitiesAssignment_2_in_rule__Project__Group__2__Impl831);
            rule__Project__ActivitiesAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getProjectAccess().getActivitiesAssignment_2()); 

            }

            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:425:1: ( ( rule__Project__ActivitiesAssignment_2 )* )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:426:1: ( rule__Project__ActivitiesAssignment_2 )*
            {
             before(grammarAccess.getProjectAccess().getActivitiesAssignment_2()); 
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:427:1: ( rule__Project__ActivitiesAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:427:2: rule__Project__ActivitiesAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Project__ActivitiesAssignment_2_in_rule__Project__Group__2__Impl843);
            	    rule__Project__ActivitiesAssignment_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getActivitiesAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__Group__2__Impl


    // $ANTLR start rule__Activity__Group__0
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:444:1: rule__Activity__Group__0 : rule__Activity__Group__0__Impl rule__Activity__Group__1 ;
    public final void rule__Activity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:448:1: ( rule__Activity__Group__0__Impl rule__Activity__Group__1 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:449:2: rule__Activity__Group__0__Impl rule__Activity__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__0882);
            rule__Activity__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__0885);
            rule__Activity__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Activity__Group__0


    // $ANTLR start rule__Activity__Group__0__Impl
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:456:1: rule__Activity__Group__0__Impl : ( 'Activity' ) ;
    public final void rule__Activity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:460:1: ( ( 'Activity' ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:461:1: ( 'Activity' )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:461:1: ( 'Activity' )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:462:1: 'Activity'
            {
             before(grammarAccess.getActivityAccess().getActivityKeyword_0()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Activity__Group__0__Impl913); 
             after(grammarAccess.getActivityAccess().getActivityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Activity__Group__0__Impl


    // $ANTLR start rule__Activity__Group__1
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:475:1: rule__Activity__Group__1 : rule__Activity__Group__1__Impl rule__Activity__Group__2 ;
    public final void rule__Activity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:479:1: ( rule__Activity__Group__1__Impl rule__Activity__Group__2 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:480:2: rule__Activity__Group__1__Impl rule__Activity__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__1944);
            rule__Activity__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__1947);
            rule__Activity__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Activity__Group__1


    // $ANTLR start rule__Activity__Group__1__Impl
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:487:1: rule__Activity__Group__1__Impl : ( ( rule__Activity__NameAssignment_1 ) ) ;
    public final void rule__Activity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:491:1: ( ( ( rule__Activity__NameAssignment_1 ) ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:492:1: ( ( rule__Activity__NameAssignment_1 ) )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:492:1: ( ( rule__Activity__NameAssignment_1 ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:493:1: ( rule__Activity__NameAssignment_1 )
            {
             before(grammarAccess.getActivityAccess().getNameAssignment_1()); 
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:494:1: ( rule__Activity__NameAssignment_1 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:494:2: rule__Activity__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__NameAssignment_1_in_rule__Activity__Group__1__Impl974);
            rule__Activity__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getActivityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Activity__Group__1__Impl


    // $ANTLR start rule__Activity__Group__2
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:504:1: rule__Activity__Group__2 : rule__Activity__Group__2__Impl rule__Activity__Group__3 ;
    public final void rule__Activity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:508:1: ( rule__Activity__Group__2__Impl rule__Activity__Group__3 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:509:2: rule__Activity__Group__2__Impl rule__Activity__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__21004);
            rule__Activity__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__21007);
            rule__Activity__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Activity__Group__2


    // $ANTLR start rule__Activity__Group__2__Impl
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:516:1: rule__Activity__Group__2__Impl : ( '{' ) ;
    public final void rule__Activity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:520:1: ( ( '{' ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:521:1: ( '{' )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:521:1: ( '{' )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:522:1: '{'
            {
             before(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Activity__Group__2__Impl1035); 
             after(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Activity__Group__2__Impl


    // $ANTLR start rule__Activity__Group__3
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:535:1: rule__Activity__Group__3 : rule__Activity__Group__3__Impl rule__Activity__Group__4 ;
    public final void rule__Activity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:539:1: ( rule__Activity__Group__3__Impl rule__Activity__Group__4 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:540:2: rule__Activity__Group__3__Impl rule__Activity__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__31066);
            rule__Activity__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__31069);
            rule__Activity__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Activity__Group__3


    // $ANTLR start rule__Activity__Group__3__Impl
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:547:1: rule__Activity__Group__3__Impl : ( ( rule__Activity__WidgetsAssignment_3 )* ) ;
    public final void rule__Activity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:551:1: ( ( ( rule__Activity__WidgetsAssignment_3 )* ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:552:1: ( ( rule__Activity__WidgetsAssignment_3 )* )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:552:1: ( ( rule__Activity__WidgetsAssignment_3 )* )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:553:1: ( rule__Activity__WidgetsAssignment_3 )*
            {
             before(grammarAccess.getActivityAccess().getWidgetsAssignment_3()); 
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:554:1: ( rule__Activity__WidgetsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=15 && LA4_0<=18)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:554:2: rule__Activity__WidgetsAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Activity__WidgetsAssignment_3_in_rule__Activity__Group__3__Impl1096);
            	    rule__Activity__WidgetsAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getActivityAccess().getWidgetsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Activity__Group__3__Impl


    // $ANTLR start rule__Activity__Group__4
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:564:1: rule__Activity__Group__4 : rule__Activity__Group__4__Impl ;
    public final void rule__Activity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:568:1: ( rule__Activity__Group__4__Impl )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:569:2: rule__Activity__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__41127);
            rule__Activity__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Activity__Group__4


    // $ANTLR start rule__Activity__Group__4__Impl
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:575:1: rule__Activity__Group__4__Impl : ( '}' ) ;
    public final void rule__Activity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:579:1: ( ( '}' ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:580:1: ( '}' )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:580:1: ( '}' )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:581:1: '}'
            {
             before(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Activity__Group__4__Impl1155); 
             after(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Activity__Group__4__Impl


    // $ANTLR start rule__Text__Group__0
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:604:1: rule__Text__Group__0 : rule__Text__Group__0__Impl rule__Text__Group__1 ;
    public final void rule__Text__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:608:1: ( rule__Text__Group__0__Impl rule__Text__Group__1 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:609:2: rule__Text__Group__0__Impl rule__Text__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Text__Group__0__Impl_in_rule__Text__Group__01196);
            rule__Text__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Text__Group__1_in_rule__Text__Group__01199);
            rule__Text__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Text__Group__0


    // $ANTLR start rule__Text__Group__0__Impl
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:616:1: rule__Text__Group__0__Impl : ( 'Text' ) ;
    public final void rule__Text__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:620:1: ( ( 'Text' ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:621:1: ( 'Text' )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:621:1: ( 'Text' )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:622:1: 'Text'
            {
             before(grammarAccess.getTextAccess().getTextKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Text__Group__0__Impl1227); 
             after(grammarAccess.getTextAccess().getTextKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Text__Group__0__Impl


    // $ANTLR start rule__Text__Group__1
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:635:1: rule__Text__Group__1 : rule__Text__Group__1__Impl ;
    public final void rule__Text__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:639:1: ( rule__Text__Group__1__Impl )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:640:2: rule__Text__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Text__Group__1__Impl_in_rule__Text__Group__11258);
            rule__Text__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Text__Group__1


    // $ANTLR start rule__Text__Group__1__Impl
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:646:1: rule__Text__Group__1__Impl : ( ( rule__Text__NameAssignment_1 ) ) ;
    public final void rule__Text__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:650:1: ( ( ( rule__Text__NameAssignment_1 ) ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:651:1: ( ( rule__Text__NameAssignment_1 ) )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:651:1: ( ( rule__Text__NameAssignment_1 ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:652:1: ( rule__Text__NameAssignment_1 )
            {
             before(grammarAccess.getTextAccess().getNameAssignment_1()); 
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:653:1: ( rule__Text__NameAssignment_1 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:653:2: rule__Text__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Text__NameAssignment_1_in_rule__Text__Group__1__Impl1285);
            rule__Text__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getTextAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Text__Group__1__Impl


    // $ANTLR start rule__Button__Group__0
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:667:1: rule__Button__Group__0 : rule__Button__Group__0__Impl rule__Button__Group__1 ;
    public final void rule__Button__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:671:1: ( rule__Button__Group__0__Impl rule__Button__Group__1 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:672:2: rule__Button__Group__0__Impl rule__Button__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Button__Group__0__Impl_in_rule__Button__Group__01319);
            rule__Button__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Button__Group__1_in_rule__Button__Group__01322);
            rule__Button__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Button__Group__0


    // $ANTLR start rule__Button__Group__0__Impl
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:679:1: rule__Button__Group__0__Impl : ( 'Button' ) ;
    public final void rule__Button__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:683:1: ( ( 'Button' ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:684:1: ( 'Button' )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:684:1: ( 'Button' )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:685:1: 'Button'
            {
             before(grammarAccess.getButtonAccess().getButtonKeyword_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Button__Group__0__Impl1350); 
             after(grammarAccess.getButtonAccess().getButtonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Button__Group__0__Impl


    // $ANTLR start rule__Button__Group__1
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:698:1: rule__Button__Group__1 : rule__Button__Group__1__Impl ;
    public final void rule__Button__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:702:1: ( rule__Button__Group__1__Impl )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:703:2: rule__Button__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Button__Group__1__Impl_in_rule__Button__Group__11381);
            rule__Button__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Button__Group__1


    // $ANTLR start rule__Button__Group__1__Impl
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:709:1: rule__Button__Group__1__Impl : ( ( rule__Button__NameAssignment_1 ) ) ;
    public final void rule__Button__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:713:1: ( ( ( rule__Button__NameAssignment_1 ) ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:714:1: ( ( rule__Button__NameAssignment_1 ) )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:714:1: ( ( rule__Button__NameAssignment_1 ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:715:1: ( rule__Button__NameAssignment_1 )
            {
             before(grammarAccess.getButtonAccess().getNameAssignment_1()); 
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:716:1: ( rule__Button__NameAssignment_1 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:716:2: rule__Button__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Button__NameAssignment_1_in_rule__Button__Group__1__Impl1408);
            rule__Button__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getButtonAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Button__Group__1__Impl


    // $ANTLR start rule__Spinner__Group__0
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:730:1: rule__Spinner__Group__0 : rule__Spinner__Group__0__Impl rule__Spinner__Group__1 ;
    public final void rule__Spinner__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:734:1: ( rule__Spinner__Group__0__Impl rule__Spinner__Group__1 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:735:2: rule__Spinner__Group__0__Impl rule__Spinner__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Spinner__Group__0__Impl_in_rule__Spinner__Group__01442);
            rule__Spinner__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Spinner__Group__1_in_rule__Spinner__Group__01445);
            rule__Spinner__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Spinner__Group__0


    // $ANTLR start rule__Spinner__Group__0__Impl
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:742:1: rule__Spinner__Group__0__Impl : ( 'Spinner' ) ;
    public final void rule__Spinner__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:746:1: ( ( 'Spinner' ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:747:1: ( 'Spinner' )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:747:1: ( 'Spinner' )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:748:1: 'Spinner'
            {
             before(grammarAccess.getSpinnerAccess().getSpinnerKeyword_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Spinner__Group__0__Impl1473); 
             after(grammarAccess.getSpinnerAccess().getSpinnerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Spinner__Group__0__Impl


    // $ANTLR start rule__Spinner__Group__1
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:761:1: rule__Spinner__Group__1 : rule__Spinner__Group__1__Impl ;
    public final void rule__Spinner__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:765:1: ( rule__Spinner__Group__1__Impl )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:766:2: rule__Spinner__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Spinner__Group__1__Impl_in_rule__Spinner__Group__11504);
            rule__Spinner__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Spinner__Group__1


    // $ANTLR start rule__Spinner__Group__1__Impl
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:772:1: rule__Spinner__Group__1__Impl : ( ( rule__Spinner__NameAssignment_1 ) ) ;
    public final void rule__Spinner__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:776:1: ( ( ( rule__Spinner__NameAssignment_1 ) ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:777:1: ( ( rule__Spinner__NameAssignment_1 ) )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:777:1: ( ( rule__Spinner__NameAssignment_1 ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:778:1: ( rule__Spinner__NameAssignment_1 )
            {
             before(grammarAccess.getSpinnerAccess().getNameAssignment_1()); 
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:779:1: ( rule__Spinner__NameAssignment_1 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:779:2: rule__Spinner__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Spinner__NameAssignment_1_in_rule__Spinner__Group__1__Impl1531);
            rule__Spinner__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSpinnerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Spinner__Group__1__Impl


    // $ANTLR start rule__Link__Group__0
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:793:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:797:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:798:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Link__Group__0__Impl_in_rule__Link__Group__01565);
            rule__Link__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Link__Group__1_in_rule__Link__Group__01568);
            rule__Link__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__0


    // $ANTLR start rule__Link__Group__0__Impl
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:805:1: rule__Link__Group__0__Impl : ( 'Link' ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:809:1: ( ( 'Link' ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:810:1: ( 'Link' )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:810:1: ( 'Link' )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:811:1: 'Link'
            {
             before(grammarAccess.getLinkAccess().getLinkKeyword_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Link__Group__0__Impl1596); 
             after(grammarAccess.getLinkAccess().getLinkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__0__Impl


    // $ANTLR start rule__Link__Group__1
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:824:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:828:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:829:2: rule__Link__Group__1__Impl rule__Link__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Link__Group__1__Impl_in_rule__Link__Group__11627);
            rule__Link__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Link__Group__2_in_rule__Link__Group__11630);
            rule__Link__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__1


    // $ANTLR start rule__Link__Group__1__Impl
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:836:1: rule__Link__Group__1__Impl : ( ( rule__Link__NameAssignment_1 ) ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:840:1: ( ( ( rule__Link__NameAssignment_1 ) ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:841:1: ( ( rule__Link__NameAssignment_1 ) )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:841:1: ( ( rule__Link__NameAssignment_1 ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:842:1: ( rule__Link__NameAssignment_1 )
            {
             before(grammarAccess.getLinkAccess().getNameAssignment_1()); 
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:843:1: ( rule__Link__NameAssignment_1 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:843:2: rule__Link__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Link__NameAssignment_1_in_rule__Link__Group__1__Impl1657);
            rule__Link__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__1__Impl


    // $ANTLR start rule__Link__Group__2
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:853:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:857:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:858:2: rule__Link__Group__2__Impl rule__Link__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Link__Group__2__Impl_in_rule__Link__Group__21687);
            rule__Link__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Link__Group__3_in_rule__Link__Group__21690);
            rule__Link__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__2


    // $ANTLR start rule__Link__Group__2__Impl
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:865:1: rule__Link__Group__2__Impl : ( '->' ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:869:1: ( ( '->' ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:870:1: ( '->' )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:870:1: ( '->' )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:871:1: '->'
            {
             before(grammarAccess.getLinkAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Link__Group__2__Impl1718); 
             after(grammarAccess.getLinkAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__2__Impl


    // $ANTLR start rule__Link__Group__3
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:884:1: rule__Link__Group__3 : rule__Link__Group__3__Impl ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:888:1: ( rule__Link__Group__3__Impl )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:889:2: rule__Link__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Link__Group__3__Impl_in_rule__Link__Group__31749);
            rule__Link__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__3


    // $ANTLR start rule__Link__Group__3__Impl
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:895:1: rule__Link__Group__3__Impl : ( ( rule__Link__ActivityAssignment_3 ) ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:899:1: ( ( ( rule__Link__ActivityAssignment_3 ) ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:900:1: ( ( rule__Link__ActivityAssignment_3 ) )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:900:1: ( ( rule__Link__ActivityAssignment_3 ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:901:1: ( rule__Link__ActivityAssignment_3 )
            {
             before(grammarAccess.getLinkAccess().getActivityAssignment_3()); 
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:902:1: ( rule__Link__ActivityAssignment_3 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:902:2: rule__Link__ActivityAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Link__ActivityAssignment_3_in_rule__Link__Group__3__Impl1776);
            rule__Link__ActivityAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getActivityAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__3__Impl


    // $ANTLR start rule__Project__NameAssignment_1
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:921:1: rule__Project__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Project__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:925:1: ( ( RULE_ID ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:926:1: ( RULE_ID )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:926:1: ( RULE_ID )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:927:1: RULE_ID
            {
             before(grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Project__NameAssignment_11819); 
             after(grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__NameAssignment_1


    // $ANTLR start rule__Project__ActivitiesAssignment_2
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:936:1: rule__Project__ActivitiesAssignment_2 : ( ruleActivity ) ;
    public final void rule__Project__ActivitiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:940:1: ( ( ruleActivity ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:941:1: ( ruleActivity )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:941:1: ( ruleActivity )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:942:1: ruleActivity
            {
             before(grammarAccess.getProjectAccess().getActivitiesActivityParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleActivity_in_rule__Project__ActivitiesAssignment_21850);
            ruleActivity();
            _fsp--;

             after(grammarAccess.getProjectAccess().getActivitiesActivityParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Project__ActivitiesAssignment_2


    // $ANTLR start rule__Activity__NameAssignment_1
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:951:1: rule__Activity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Activity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:955:1: ( ( RULE_ID ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:956:1: ( RULE_ID )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:956:1: ( RULE_ID )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:957:1: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Activity__NameAssignment_11881); 
             after(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Activity__NameAssignment_1


    // $ANTLR start rule__Activity__WidgetsAssignment_3
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:966:1: rule__Activity__WidgetsAssignment_3 : ( ruleWidget ) ;
    public final void rule__Activity__WidgetsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:970:1: ( ( ruleWidget ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:971:1: ( ruleWidget )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:971:1: ( ruleWidget )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:972:1: ruleWidget
            {
             before(grammarAccess.getActivityAccess().getWidgetsWidgetParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleWidget_in_rule__Activity__WidgetsAssignment_31912);
            ruleWidget();
            _fsp--;

             after(grammarAccess.getActivityAccess().getWidgetsWidgetParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Activity__WidgetsAssignment_3


    // $ANTLR start rule__Text__NameAssignment_1
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:981:1: rule__Text__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Text__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:985:1: ( ( RULE_ID ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:986:1: ( RULE_ID )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:986:1: ( RULE_ID )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:987:1: RULE_ID
            {
             before(grammarAccess.getTextAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Text__NameAssignment_11943); 
             after(grammarAccess.getTextAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Text__NameAssignment_1


    // $ANTLR start rule__Button__NameAssignment_1
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:996:1: rule__Button__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Button__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1000:1: ( ( RULE_ID ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1001:1: ( RULE_ID )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1001:1: ( RULE_ID )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1002:1: RULE_ID
            {
             before(grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Button__NameAssignment_11974); 
             after(grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Button__NameAssignment_1


    // $ANTLR start rule__Spinner__NameAssignment_1
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1011:1: rule__Spinner__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Spinner__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1015:1: ( ( RULE_ID ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1016:1: ( RULE_ID )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1016:1: ( RULE_ID )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1017:1: RULE_ID
            {
             before(grammarAccess.getSpinnerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Spinner__NameAssignment_12005); 
             after(grammarAccess.getSpinnerAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Spinner__NameAssignment_1


    // $ANTLR start rule__Link__NameAssignment_1
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1026:1: rule__Link__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Link__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1030:1: ( ( RULE_ID ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1031:1: ( RULE_ID )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1031:1: ( RULE_ID )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1032:1: RULE_ID
            {
             before(grammarAccess.getLinkAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Link__NameAssignment_12036); 
             after(grammarAccess.getLinkAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__NameAssignment_1


    // $ANTLR start rule__Link__ActivityAssignment_3
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1041:1: rule__Link__ActivityAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Link__ActivityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1045:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1046:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1046:1: ( ( RULE_ID ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1047:1: ( RULE_ID )
            {
             before(grammarAccess.getLinkAccess().getActivityActivityCrossReference_3_0()); 
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1048:1: ( RULE_ID )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1049:1: RULE_ID
            {
             before(grammarAccess.getLinkAccess().getActivityActivityIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Link__ActivityAssignment_32071); 
             after(grammarAccess.getLinkAccess().getActivityActivityIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getLinkAccess().getActivityActivityCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__ActivityAssignment_3


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleEntry_in_entryRuleEntry61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEntry68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entry__Alternatives_in_ruleEntry94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProject_in_entryRuleProject121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProject128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group__0_in_ruleProject154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleActivity188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__0_in_ruleActivity214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWidget_in_entryRuleWidget241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWidget248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Widget__Alternatives_in_ruleWidget274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleText_in_entryRuleText301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleText308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Text__Group__0_in_ruleText334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleButton_in_entryRuleButton361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleButton368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Button__Group__0_in_ruleButton394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSpinner_in_entryRuleSpinner421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSpinner428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Spinner__Group__0_in_ruleSpinner454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLink_in_entryRuleLink481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLink488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__Group__0_in_ruleLink514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProject_in_rule__Entry__Alternatives550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleActivity_in_rule__Entry__Alternatives567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleText_in_rule__Widget__Alternatives599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleButton_in_rule__Widget__Alternatives616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSpinner_in_rule__Widget__Alternatives633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLink_in_rule__Widget__Alternatives650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group__0__Impl_in_rule__Project__Group__0680 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Project__Group__1_in_rule__Project__Group__0683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Project__Group__0__Impl711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group__1__Impl_in_rule__Project__Group__1742 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Project__Group__2_in_rule__Project__Group__1745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__NameAssignment_1_in_rule__Project__Group__1__Impl772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group__2__Impl_in_rule__Project__Group__2802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__ActivitiesAssignment_2_in_rule__Project__Group__2__Impl831 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_rule__Project__ActivitiesAssignment_2_in_rule__Project__Group__2__Impl843 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__0882 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__0885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Activity__Group__0__Impl913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__1944 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__1947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__NameAssignment_1_in_rule__Activity__Group__1__Impl974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__21004 = new BitSet(new long[]{0x000000000007C000L});
        public static final BitSet FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__21007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Activity__Group__2__Impl1035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__31066 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__31069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__WidgetsAssignment_3_in_rule__Activity__Group__3__Impl1096 = new BitSet(new long[]{0x0000000000078002L});
        public static final BitSet FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__41127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Activity__Group__4__Impl1155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Text__Group__0__Impl_in_rule__Text__Group__01196 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Text__Group__1_in_rule__Text__Group__01199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Text__Group__0__Impl1227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Text__Group__1__Impl_in_rule__Text__Group__11258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Text__NameAssignment_1_in_rule__Text__Group__1__Impl1285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Button__Group__0__Impl_in_rule__Button__Group__01319 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Button__Group__1_in_rule__Button__Group__01322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Button__Group__0__Impl1350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Button__Group__1__Impl_in_rule__Button__Group__11381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Button__NameAssignment_1_in_rule__Button__Group__1__Impl1408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Spinner__Group__0__Impl_in_rule__Spinner__Group__01442 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Spinner__Group__1_in_rule__Spinner__Group__01445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Spinner__Group__0__Impl1473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Spinner__Group__1__Impl_in_rule__Spinner__Group__11504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Spinner__NameAssignment_1_in_rule__Spinner__Group__1__Impl1531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__Group__0__Impl_in_rule__Link__Group__01565 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Link__Group__1_in_rule__Link__Group__01568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Link__Group__0__Impl1596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__Group__1__Impl_in_rule__Link__Group__11627 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Link__Group__2_in_rule__Link__Group__11630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__NameAssignment_1_in_rule__Link__Group__1__Impl1657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__Group__2__Impl_in_rule__Link__Group__21687 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Link__Group__3_in_rule__Link__Group__21690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Link__Group__2__Impl1718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__Group__3__Impl_in_rule__Link__Group__31749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__ActivityAssignment_3_in_rule__Link__Group__3__Impl1776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Project__NameAssignment_11819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleActivity_in_rule__Project__ActivitiesAssignment_21850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Activity__NameAssignment_11881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWidget_in_rule__Activity__WidgetsAssignment_31912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Text__NameAssignment_11943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Button__NameAssignment_11974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Spinner__NameAssignment_12005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Link__NameAssignment_12036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Link__ActivityAssignment_32071 = new BitSet(new long[]{0x0000000000000002L});
    }


}