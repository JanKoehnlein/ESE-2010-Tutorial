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




    // $ANTLR start entryRuleProject
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:61:1: entryRuleProject : ruleProject EOF ;
    public final void entryRuleProject() throws RecognitionException {
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:62:1: ( ruleProject EOF )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:63:1: ruleProject EOF
            {
             before(grammarAccess.getProjectRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProject_in_entryRuleProject61);
            ruleProject();
            _fsp--;

             after(grammarAccess.getProjectRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProject68); 

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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:70:1: ruleProject : ( ( rule__Project__Group__0 ) ) ;
    public final void ruleProject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:74:2: ( ( ( rule__Project__Group__0 ) ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:75:1: ( ( rule__Project__Group__0 ) )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:75:1: ( ( rule__Project__Group__0 ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:76:1: ( rule__Project__Group__0 )
            {
             before(grammarAccess.getProjectAccess().getGroup()); 
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:77:1: ( rule__Project__Group__0 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:77:2: rule__Project__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group__0_in_ruleProject94);
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:89:1: entryRuleActivity : ruleActivity EOF ;
    public final void entryRuleActivity() throws RecognitionException {
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:90:1: ( ruleActivity EOF )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:91:1: ruleActivity EOF
            {
             before(grammarAccess.getActivityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleActivity_in_entryRuleActivity121);
            ruleActivity();
            _fsp--;

             after(grammarAccess.getActivityRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleActivity128); 

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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:98:1: ruleActivity : ( ( rule__Activity__Group__0 ) ) ;
    public final void ruleActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:102:2: ( ( ( rule__Activity__Group__0 ) ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:103:1: ( ( rule__Activity__Group__0 ) )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:103:1: ( ( rule__Activity__Group__0 ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:104:1: ( rule__Activity__Group__0 )
            {
             before(grammarAccess.getActivityAccess().getGroup()); 
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:105:1: ( rule__Activity__Group__0 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:105:2: rule__Activity__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__0_in_ruleActivity154);
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:117:1: entryRuleWidget : ruleWidget EOF ;
    public final void entryRuleWidget() throws RecognitionException {
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:118:1: ( ruleWidget EOF )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:119:1: ruleWidget EOF
            {
             before(grammarAccess.getWidgetRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWidget_in_entryRuleWidget181);
            ruleWidget();
            _fsp--;

             after(grammarAccess.getWidgetRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWidget188); 

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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:126:1: ruleWidget : ( ( rule__Widget__Alternatives ) ) ;
    public final void ruleWidget() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:130:2: ( ( ( rule__Widget__Alternatives ) ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:131:1: ( ( rule__Widget__Alternatives ) )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:131:1: ( ( rule__Widget__Alternatives ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:132:1: ( rule__Widget__Alternatives )
            {
             before(grammarAccess.getWidgetAccess().getAlternatives()); 
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:133:1: ( rule__Widget__Alternatives )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:133:2: rule__Widget__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Widget__Alternatives_in_ruleWidget214);
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:145:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:146:1: ( ruleText EOF )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:147:1: ruleText EOF
            {
             before(grammarAccess.getTextRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleText_in_entryRuleText241);
            ruleText();
            _fsp--;

             after(grammarAccess.getTextRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleText248); 

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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:154:1: ruleText : ( ( rule__Text__Group__0 ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:158:2: ( ( ( rule__Text__Group__0 ) ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:159:1: ( ( rule__Text__Group__0 ) )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:159:1: ( ( rule__Text__Group__0 ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:160:1: ( rule__Text__Group__0 )
            {
             before(grammarAccess.getTextAccess().getGroup()); 
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:161:1: ( rule__Text__Group__0 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:161:2: rule__Text__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Text__Group__0_in_ruleText274);
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:173:1: entryRuleButton : ruleButton EOF ;
    public final void entryRuleButton() throws RecognitionException {
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:174:1: ( ruleButton EOF )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:175:1: ruleButton EOF
            {
             before(grammarAccess.getButtonRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleButton_in_entryRuleButton301);
            ruleButton();
            _fsp--;

             after(grammarAccess.getButtonRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleButton308); 

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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:182:1: ruleButton : ( ( rule__Button__Group__0 ) ) ;
    public final void ruleButton() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:186:2: ( ( ( rule__Button__Group__0 ) ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:187:1: ( ( rule__Button__Group__0 ) )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:187:1: ( ( rule__Button__Group__0 ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:188:1: ( rule__Button__Group__0 )
            {
             before(grammarAccess.getButtonAccess().getGroup()); 
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:189:1: ( rule__Button__Group__0 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:189:2: rule__Button__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Button__Group__0_in_ruleButton334);
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:201:1: entryRuleSpinner : ruleSpinner EOF ;
    public final void entryRuleSpinner() throws RecognitionException {
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:202:1: ( ruleSpinner EOF )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:203:1: ruleSpinner EOF
            {
             before(grammarAccess.getSpinnerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSpinner_in_entryRuleSpinner361);
            ruleSpinner();
            _fsp--;

             after(grammarAccess.getSpinnerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSpinner368); 

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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:210:1: ruleSpinner : ( ( rule__Spinner__Group__0 ) ) ;
    public final void ruleSpinner() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:214:2: ( ( ( rule__Spinner__Group__0 ) ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:215:1: ( ( rule__Spinner__Group__0 ) )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:215:1: ( ( rule__Spinner__Group__0 ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:216:1: ( rule__Spinner__Group__0 )
            {
             before(grammarAccess.getSpinnerAccess().getGroup()); 
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:217:1: ( rule__Spinner__Group__0 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:217:2: rule__Spinner__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Spinner__Group__0_in_ruleSpinner394);
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:229:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:230:1: ( ruleLink EOF )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:231:1: ruleLink EOF
            {
             before(grammarAccess.getLinkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLink_in_entryRuleLink421);
            ruleLink();
            _fsp--;

             after(grammarAccess.getLinkRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLink428); 

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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:238:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:242:2: ( ( ( rule__Link__Group__0 ) ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:243:1: ( ( rule__Link__Group__0 ) )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:243:1: ( ( rule__Link__Group__0 ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:244:1: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:245:1: ( rule__Link__Group__0 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:245:2: rule__Link__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Link__Group__0_in_ruleLink454);
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


    // $ANTLR start rule__Widget__Alternatives
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:257:1: rule__Widget__Alternatives : ( ( ruleText ) | ( ruleButton ) | ( ruleSpinner ) | ( ruleLink ) );
    public final void rule__Widget__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:261:1: ( ( ruleText ) | ( ruleButton ) | ( ruleSpinner ) | ( ruleLink ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt1=1;
                }
                break;
            case 16:
                {
                alt1=2;
                }
                break;
            case 17:
                {
                alt1=3;
                }
                break;
            case 18:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("257:1: rule__Widget__Alternatives : ( ( ruleText ) | ( ruleButton ) | ( ruleSpinner ) | ( ruleLink ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:262:1: ( ruleText )
                    {
                    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:262:1: ( ruleText )
                    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:263:1: ruleText
                    {
                     before(grammarAccess.getWidgetAccess().getTextParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleText_in_rule__Widget__Alternatives490);
                    ruleText();
                    _fsp--;

                     after(grammarAccess.getWidgetAccess().getTextParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:268:6: ( ruleButton )
                    {
                    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:268:6: ( ruleButton )
                    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:269:1: ruleButton
                    {
                     before(grammarAccess.getWidgetAccess().getButtonParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleButton_in_rule__Widget__Alternatives507);
                    ruleButton();
                    _fsp--;

                     after(grammarAccess.getWidgetAccess().getButtonParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:274:6: ( ruleSpinner )
                    {
                    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:274:6: ( ruleSpinner )
                    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:275:1: ruleSpinner
                    {
                     before(grammarAccess.getWidgetAccess().getSpinnerParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSpinner_in_rule__Widget__Alternatives524);
                    ruleSpinner();
                    _fsp--;

                     after(grammarAccess.getWidgetAccess().getSpinnerParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:280:6: ( ruleLink )
                    {
                    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:280:6: ( ruleLink )
                    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:281:1: ruleLink
                    {
                     before(grammarAccess.getWidgetAccess().getLinkParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleLink_in_rule__Widget__Alternatives541);
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:293:1: rule__Project__Group__0 : rule__Project__Group__0__Impl rule__Project__Group__1 ;
    public final void rule__Project__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:297:1: ( rule__Project__Group__0__Impl rule__Project__Group__1 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:298:2: rule__Project__Group__0__Impl rule__Project__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group__0__Impl_in_rule__Project__Group__0571);
            rule__Project__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Project__Group__1_in_rule__Project__Group__0574);
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:305:1: rule__Project__Group__0__Impl : ( 'Project' ) ;
    public final void rule__Project__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:309:1: ( ( 'Project' ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:310:1: ( 'Project' )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:310:1: ( 'Project' )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:311:1: 'Project'
            {
             before(grammarAccess.getProjectAccess().getProjectKeyword_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Project__Group__0__Impl602); 
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:324:1: rule__Project__Group__1 : rule__Project__Group__1__Impl rule__Project__Group__2 ;
    public final void rule__Project__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:328:1: ( rule__Project__Group__1__Impl rule__Project__Group__2 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:329:2: rule__Project__Group__1__Impl rule__Project__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group__1__Impl_in_rule__Project__Group__1633);
            rule__Project__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Project__Group__2_in_rule__Project__Group__1636);
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:336:1: rule__Project__Group__1__Impl : ( ( rule__Project__NameAssignment_1 ) ) ;
    public final void rule__Project__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:340:1: ( ( ( rule__Project__NameAssignment_1 ) ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:341:1: ( ( rule__Project__NameAssignment_1 ) )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:341:1: ( ( rule__Project__NameAssignment_1 ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:342:1: ( rule__Project__NameAssignment_1 )
            {
             before(grammarAccess.getProjectAccess().getNameAssignment_1()); 
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:343:1: ( rule__Project__NameAssignment_1 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:343:2: rule__Project__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__NameAssignment_1_in_rule__Project__Group__1__Impl663);
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:353:1: rule__Project__Group__2 : rule__Project__Group__2__Impl ;
    public final void rule__Project__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:357:1: ( rule__Project__Group__2__Impl )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:358:2: rule__Project__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__Group__2__Impl_in_rule__Project__Group__2693);
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:364:1: rule__Project__Group__2__Impl : ( ( ( rule__Project__ActivitiesAssignment_2 ) ) ( ( rule__Project__ActivitiesAssignment_2 )* ) ) ;
    public final void rule__Project__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:368:1: ( ( ( ( rule__Project__ActivitiesAssignment_2 ) ) ( ( rule__Project__ActivitiesAssignment_2 )* ) ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:369:1: ( ( ( rule__Project__ActivitiesAssignment_2 ) ) ( ( rule__Project__ActivitiesAssignment_2 )* ) )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:369:1: ( ( ( rule__Project__ActivitiesAssignment_2 ) ) ( ( rule__Project__ActivitiesAssignment_2 )* ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:370:1: ( ( rule__Project__ActivitiesAssignment_2 ) ) ( ( rule__Project__ActivitiesAssignment_2 )* )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:370:1: ( ( rule__Project__ActivitiesAssignment_2 ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:371:1: ( rule__Project__ActivitiesAssignment_2 )
            {
             before(grammarAccess.getProjectAccess().getActivitiesAssignment_2()); 
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:372:1: ( rule__Project__ActivitiesAssignment_2 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:372:2: rule__Project__ActivitiesAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Project__ActivitiesAssignment_2_in_rule__Project__Group__2__Impl722);
            rule__Project__ActivitiesAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getProjectAccess().getActivitiesAssignment_2()); 

            }

            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:375:1: ( ( rule__Project__ActivitiesAssignment_2 )* )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:376:1: ( rule__Project__ActivitiesAssignment_2 )*
            {
             before(grammarAccess.getProjectAccess().getActivitiesAssignment_2()); 
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:377:1: ( rule__Project__ActivitiesAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:377:2: rule__Project__ActivitiesAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Project__ActivitiesAssignment_2_in_rule__Project__Group__2__Impl734);
            	    rule__Project__ActivitiesAssignment_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:394:1: rule__Activity__Group__0 : rule__Activity__Group__0__Impl rule__Activity__Group__1 ;
    public final void rule__Activity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:398:1: ( rule__Activity__Group__0__Impl rule__Activity__Group__1 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:399:2: rule__Activity__Group__0__Impl rule__Activity__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__0773);
            rule__Activity__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__0776);
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:406:1: rule__Activity__Group__0__Impl : ( 'Activity' ) ;
    public final void rule__Activity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:410:1: ( ( 'Activity' ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:411:1: ( 'Activity' )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:411:1: ( 'Activity' )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:412:1: 'Activity'
            {
             before(grammarAccess.getActivityAccess().getActivityKeyword_0()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Activity__Group__0__Impl804); 
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:425:1: rule__Activity__Group__1 : rule__Activity__Group__1__Impl rule__Activity__Group__2 ;
    public final void rule__Activity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:429:1: ( rule__Activity__Group__1__Impl rule__Activity__Group__2 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:430:2: rule__Activity__Group__1__Impl rule__Activity__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__1835);
            rule__Activity__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__1838);
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:437:1: rule__Activity__Group__1__Impl : ( ( rule__Activity__NameAssignment_1 ) ) ;
    public final void rule__Activity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:441:1: ( ( ( rule__Activity__NameAssignment_1 ) ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:442:1: ( ( rule__Activity__NameAssignment_1 ) )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:442:1: ( ( rule__Activity__NameAssignment_1 ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:443:1: ( rule__Activity__NameAssignment_1 )
            {
             before(grammarAccess.getActivityAccess().getNameAssignment_1()); 
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:444:1: ( rule__Activity__NameAssignment_1 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:444:2: rule__Activity__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__NameAssignment_1_in_rule__Activity__Group__1__Impl865);
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:454:1: rule__Activity__Group__2 : rule__Activity__Group__2__Impl rule__Activity__Group__3 ;
    public final void rule__Activity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:458:1: ( rule__Activity__Group__2__Impl rule__Activity__Group__3 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:459:2: rule__Activity__Group__2__Impl rule__Activity__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__2895);
            rule__Activity__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__2898);
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:466:1: rule__Activity__Group__2__Impl : ( '{' ) ;
    public final void rule__Activity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:470:1: ( ( '{' ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:471:1: ( '{' )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:471:1: ( '{' )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:472:1: '{'
            {
             before(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Activity__Group__2__Impl926); 
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:485:1: rule__Activity__Group__3 : rule__Activity__Group__3__Impl rule__Activity__Group__4 ;
    public final void rule__Activity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:489:1: ( rule__Activity__Group__3__Impl rule__Activity__Group__4 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:490:2: rule__Activity__Group__3__Impl rule__Activity__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__3957);
            rule__Activity__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__3960);
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:497:1: rule__Activity__Group__3__Impl : ( ( rule__Activity__WidgetsAssignment_3 )* ) ;
    public final void rule__Activity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:501:1: ( ( ( rule__Activity__WidgetsAssignment_3 )* ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:502:1: ( ( rule__Activity__WidgetsAssignment_3 )* )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:502:1: ( ( rule__Activity__WidgetsAssignment_3 )* )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:503:1: ( rule__Activity__WidgetsAssignment_3 )*
            {
             before(grammarAccess.getActivityAccess().getWidgetsAssignment_3()); 
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:504:1: ( rule__Activity__WidgetsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=15 && LA3_0<=18)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:504:2: rule__Activity__WidgetsAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Activity__WidgetsAssignment_3_in_rule__Activity__Group__3__Impl987);
            	    rule__Activity__WidgetsAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:514:1: rule__Activity__Group__4 : rule__Activity__Group__4__Impl ;
    public final void rule__Activity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:518:1: ( rule__Activity__Group__4__Impl )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:519:2: rule__Activity__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__41018);
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:525:1: rule__Activity__Group__4__Impl : ( '}' ) ;
    public final void rule__Activity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:529:1: ( ( '}' ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:530:1: ( '}' )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:530:1: ( '}' )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:531:1: '}'
            {
             before(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Activity__Group__4__Impl1046); 
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:554:1: rule__Text__Group__0 : rule__Text__Group__0__Impl rule__Text__Group__1 ;
    public final void rule__Text__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:558:1: ( rule__Text__Group__0__Impl rule__Text__Group__1 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:559:2: rule__Text__Group__0__Impl rule__Text__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Text__Group__0__Impl_in_rule__Text__Group__01087);
            rule__Text__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Text__Group__1_in_rule__Text__Group__01090);
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:566:1: rule__Text__Group__0__Impl : ( 'Text' ) ;
    public final void rule__Text__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:570:1: ( ( 'Text' ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:571:1: ( 'Text' )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:571:1: ( 'Text' )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:572:1: 'Text'
            {
             before(grammarAccess.getTextAccess().getTextKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Text__Group__0__Impl1118); 
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:585:1: rule__Text__Group__1 : rule__Text__Group__1__Impl ;
    public final void rule__Text__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:589:1: ( rule__Text__Group__1__Impl )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:590:2: rule__Text__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Text__Group__1__Impl_in_rule__Text__Group__11149);
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:596:1: rule__Text__Group__1__Impl : ( ( rule__Text__NameAssignment_1 ) ) ;
    public final void rule__Text__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:600:1: ( ( ( rule__Text__NameAssignment_1 ) ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:601:1: ( ( rule__Text__NameAssignment_1 ) )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:601:1: ( ( rule__Text__NameAssignment_1 ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:602:1: ( rule__Text__NameAssignment_1 )
            {
             before(grammarAccess.getTextAccess().getNameAssignment_1()); 
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:603:1: ( rule__Text__NameAssignment_1 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:603:2: rule__Text__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Text__NameAssignment_1_in_rule__Text__Group__1__Impl1176);
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:617:1: rule__Button__Group__0 : rule__Button__Group__0__Impl rule__Button__Group__1 ;
    public final void rule__Button__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:621:1: ( rule__Button__Group__0__Impl rule__Button__Group__1 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:622:2: rule__Button__Group__0__Impl rule__Button__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Button__Group__0__Impl_in_rule__Button__Group__01210);
            rule__Button__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Button__Group__1_in_rule__Button__Group__01213);
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:629:1: rule__Button__Group__0__Impl : ( 'Button' ) ;
    public final void rule__Button__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:633:1: ( ( 'Button' ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:634:1: ( 'Button' )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:634:1: ( 'Button' )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:635:1: 'Button'
            {
             before(grammarAccess.getButtonAccess().getButtonKeyword_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Button__Group__0__Impl1241); 
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:648:1: rule__Button__Group__1 : rule__Button__Group__1__Impl ;
    public final void rule__Button__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:652:1: ( rule__Button__Group__1__Impl )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:653:2: rule__Button__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Button__Group__1__Impl_in_rule__Button__Group__11272);
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:659:1: rule__Button__Group__1__Impl : ( ( rule__Button__NameAssignment_1 ) ) ;
    public final void rule__Button__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:663:1: ( ( ( rule__Button__NameAssignment_1 ) ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:664:1: ( ( rule__Button__NameAssignment_1 ) )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:664:1: ( ( rule__Button__NameAssignment_1 ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:665:1: ( rule__Button__NameAssignment_1 )
            {
             before(grammarAccess.getButtonAccess().getNameAssignment_1()); 
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:666:1: ( rule__Button__NameAssignment_1 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:666:2: rule__Button__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Button__NameAssignment_1_in_rule__Button__Group__1__Impl1299);
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:680:1: rule__Spinner__Group__0 : rule__Spinner__Group__0__Impl rule__Spinner__Group__1 ;
    public final void rule__Spinner__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:684:1: ( rule__Spinner__Group__0__Impl rule__Spinner__Group__1 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:685:2: rule__Spinner__Group__0__Impl rule__Spinner__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Spinner__Group__0__Impl_in_rule__Spinner__Group__01333);
            rule__Spinner__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Spinner__Group__1_in_rule__Spinner__Group__01336);
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:692:1: rule__Spinner__Group__0__Impl : ( 'Spinner' ) ;
    public final void rule__Spinner__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:696:1: ( ( 'Spinner' ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:697:1: ( 'Spinner' )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:697:1: ( 'Spinner' )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:698:1: 'Spinner'
            {
             before(grammarAccess.getSpinnerAccess().getSpinnerKeyword_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Spinner__Group__0__Impl1364); 
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:711:1: rule__Spinner__Group__1 : rule__Spinner__Group__1__Impl ;
    public final void rule__Spinner__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:715:1: ( rule__Spinner__Group__1__Impl )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:716:2: rule__Spinner__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Spinner__Group__1__Impl_in_rule__Spinner__Group__11395);
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:722:1: rule__Spinner__Group__1__Impl : ( ( rule__Spinner__NameAssignment_1 ) ) ;
    public final void rule__Spinner__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:726:1: ( ( ( rule__Spinner__NameAssignment_1 ) ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:727:1: ( ( rule__Spinner__NameAssignment_1 ) )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:727:1: ( ( rule__Spinner__NameAssignment_1 ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:728:1: ( rule__Spinner__NameAssignment_1 )
            {
             before(grammarAccess.getSpinnerAccess().getNameAssignment_1()); 
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:729:1: ( rule__Spinner__NameAssignment_1 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:729:2: rule__Spinner__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Spinner__NameAssignment_1_in_rule__Spinner__Group__1__Impl1422);
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:743:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:747:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:748:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Link__Group__0__Impl_in_rule__Link__Group__01456);
            rule__Link__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Link__Group__1_in_rule__Link__Group__01459);
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:755:1: rule__Link__Group__0__Impl : ( 'Link' ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:759:1: ( ( 'Link' ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:760:1: ( 'Link' )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:760:1: ( 'Link' )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:761:1: 'Link'
            {
             before(grammarAccess.getLinkAccess().getLinkKeyword_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Link__Group__0__Impl1487); 
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:774:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:778:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:779:2: rule__Link__Group__1__Impl rule__Link__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Link__Group__1__Impl_in_rule__Link__Group__11518);
            rule__Link__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Link__Group__2_in_rule__Link__Group__11521);
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:786:1: rule__Link__Group__1__Impl : ( ( rule__Link__NameAssignment_1 ) ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:790:1: ( ( ( rule__Link__NameAssignment_1 ) ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:791:1: ( ( rule__Link__NameAssignment_1 ) )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:791:1: ( ( rule__Link__NameAssignment_1 ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:792:1: ( rule__Link__NameAssignment_1 )
            {
             before(grammarAccess.getLinkAccess().getNameAssignment_1()); 
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:793:1: ( rule__Link__NameAssignment_1 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:793:2: rule__Link__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Link__NameAssignment_1_in_rule__Link__Group__1__Impl1548);
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:803:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:807:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:808:2: rule__Link__Group__2__Impl rule__Link__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Link__Group__2__Impl_in_rule__Link__Group__21578);
            rule__Link__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Link__Group__3_in_rule__Link__Group__21581);
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:815:1: rule__Link__Group__2__Impl : ( '->' ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:819:1: ( ( '->' ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:820:1: ( '->' )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:820:1: ( '->' )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:821:1: '->'
            {
             before(grammarAccess.getLinkAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Link__Group__2__Impl1609); 
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:834:1: rule__Link__Group__3 : rule__Link__Group__3__Impl ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:838:1: ( rule__Link__Group__3__Impl )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:839:2: rule__Link__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Link__Group__3__Impl_in_rule__Link__Group__31640);
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:845:1: rule__Link__Group__3__Impl : ( ( rule__Link__ActivityAssignment_3 ) ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:849:1: ( ( ( rule__Link__ActivityAssignment_3 ) ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:850:1: ( ( rule__Link__ActivityAssignment_3 ) )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:850:1: ( ( rule__Link__ActivityAssignment_3 ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:851:1: ( rule__Link__ActivityAssignment_3 )
            {
             before(grammarAccess.getLinkAccess().getActivityAssignment_3()); 
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:852:1: ( rule__Link__ActivityAssignment_3 )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:852:2: rule__Link__ActivityAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Link__ActivityAssignment_3_in_rule__Link__Group__3__Impl1667);
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:871:1: rule__Project__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Project__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:875:1: ( ( RULE_ID ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:876:1: ( RULE_ID )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:876:1: ( RULE_ID )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:877:1: RULE_ID
            {
             before(grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Project__NameAssignment_11710); 
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:886:1: rule__Project__ActivitiesAssignment_2 : ( ruleActivity ) ;
    public final void rule__Project__ActivitiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:890:1: ( ( ruleActivity ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:891:1: ( ruleActivity )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:891:1: ( ruleActivity )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:892:1: ruleActivity
            {
             before(grammarAccess.getProjectAccess().getActivitiesActivityParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleActivity_in_rule__Project__ActivitiesAssignment_21741);
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:901:1: rule__Activity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Activity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:905:1: ( ( RULE_ID ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:906:1: ( RULE_ID )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:906:1: ( RULE_ID )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:907:1: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Activity__NameAssignment_11772); 
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:916:1: rule__Activity__WidgetsAssignment_3 : ( ruleWidget ) ;
    public final void rule__Activity__WidgetsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:920:1: ( ( ruleWidget ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:921:1: ( ruleWidget )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:921:1: ( ruleWidget )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:922:1: ruleWidget
            {
             before(grammarAccess.getActivityAccess().getWidgetsWidgetParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleWidget_in_rule__Activity__WidgetsAssignment_31803);
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:931:1: rule__Text__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Text__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:935:1: ( ( RULE_ID ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:936:1: ( RULE_ID )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:936:1: ( RULE_ID )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:937:1: RULE_ID
            {
             before(grammarAccess.getTextAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Text__NameAssignment_11834); 
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:946:1: rule__Button__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Button__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:950:1: ( ( RULE_ID ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:951:1: ( RULE_ID )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:951:1: ( RULE_ID )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:952:1: RULE_ID
            {
             before(grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Button__NameAssignment_11865); 
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:961:1: rule__Spinner__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Spinner__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:965:1: ( ( RULE_ID ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:966:1: ( RULE_ID )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:966:1: ( RULE_ID )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:967:1: RULE_ID
            {
             before(grammarAccess.getSpinnerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Spinner__NameAssignment_11896); 
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:976:1: rule__Link__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Link__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:980:1: ( ( RULE_ID ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:981:1: ( RULE_ID )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:981:1: ( RULE_ID )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:982:1: RULE_ID
            {
             before(grammarAccess.getLinkAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Link__NameAssignment_11927); 
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
    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:991:1: rule__Link__ActivityAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Link__ActivityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:995:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:996:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:996:1: ( ( RULE_ID ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:997:1: ( RULE_ID )
            {
             before(grammarAccess.getLinkAccess().getActivityActivityCrossReference_3_0()); 
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:998:1: ( RULE_ID )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:999:1: RULE_ID
            {
             before(grammarAccess.getLinkAccess().getActivityActivityIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Link__ActivityAssignment_31962); 
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
        public static final BitSet FOLLOW_ruleProject_in_entryRuleProject61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProject68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group__0_in_ruleProject94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleActivity128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__0_in_ruleActivity154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWidget_in_entryRuleWidget181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWidget188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Widget__Alternatives_in_ruleWidget214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleText_in_entryRuleText241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleText248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Text__Group__0_in_ruleText274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleButton_in_entryRuleButton301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleButton308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Button__Group__0_in_ruleButton334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSpinner_in_entryRuleSpinner361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSpinner368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Spinner__Group__0_in_ruleSpinner394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLink_in_entryRuleLink421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLink428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__Group__0_in_ruleLink454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleText_in_rule__Widget__Alternatives490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleButton_in_rule__Widget__Alternatives507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSpinner_in_rule__Widget__Alternatives524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLink_in_rule__Widget__Alternatives541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group__0__Impl_in_rule__Project__Group__0571 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Project__Group__1_in_rule__Project__Group__0574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Project__Group__0__Impl602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group__1__Impl_in_rule__Project__Group__1633 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Project__Group__2_in_rule__Project__Group__1636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__NameAssignment_1_in_rule__Project__Group__1__Impl663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__Group__2__Impl_in_rule__Project__Group__2693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Project__ActivitiesAssignment_2_in_rule__Project__Group__2__Impl722 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_rule__Project__ActivitiesAssignment_2_in_rule__Project__Group__2__Impl734 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__0773 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__0776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Activity__Group__0__Impl804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__1835 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__1838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__NameAssignment_1_in_rule__Activity__Group__1__Impl865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__2895 = new BitSet(new long[]{0x000000000007C000L});
        public static final BitSet FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__2898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Activity__Group__2__Impl926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__3957 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__3960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Activity__WidgetsAssignment_3_in_rule__Activity__Group__3__Impl987 = new BitSet(new long[]{0x0000000000078002L});
        public static final BitSet FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__41018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Activity__Group__4__Impl1046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Text__Group__0__Impl_in_rule__Text__Group__01087 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Text__Group__1_in_rule__Text__Group__01090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Text__Group__0__Impl1118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Text__Group__1__Impl_in_rule__Text__Group__11149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Text__NameAssignment_1_in_rule__Text__Group__1__Impl1176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Button__Group__0__Impl_in_rule__Button__Group__01210 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Button__Group__1_in_rule__Button__Group__01213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Button__Group__0__Impl1241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Button__Group__1__Impl_in_rule__Button__Group__11272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Button__NameAssignment_1_in_rule__Button__Group__1__Impl1299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Spinner__Group__0__Impl_in_rule__Spinner__Group__01333 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Spinner__Group__1_in_rule__Spinner__Group__01336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Spinner__Group__0__Impl1364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Spinner__Group__1__Impl_in_rule__Spinner__Group__11395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Spinner__NameAssignment_1_in_rule__Spinner__Group__1__Impl1422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__Group__0__Impl_in_rule__Link__Group__01456 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Link__Group__1_in_rule__Link__Group__01459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Link__Group__0__Impl1487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__Group__1__Impl_in_rule__Link__Group__11518 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Link__Group__2_in_rule__Link__Group__11521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__NameAssignment_1_in_rule__Link__Group__1__Impl1548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__Group__2__Impl_in_rule__Link__Group__21578 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Link__Group__3_in_rule__Link__Group__21581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Link__Group__2__Impl1609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__Group__3__Impl_in_rule__Link__Group__31640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Link__ActivityAssignment_3_in_rule__Link__Group__3__Impl1667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Project__NameAssignment_11710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleActivity_in_rule__Project__ActivitiesAssignment_21741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Activity__NameAssignment_11772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWidget_in_rule__Activity__WidgetsAssignment_31803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Text__NameAssignment_11834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Button__NameAssignment_11865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Spinner__NameAssignment_11896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Link__NameAssignment_11927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Link__ActivityAssignment_31962 = new BitSet(new long[]{0x0000000000000002L});
    }


}