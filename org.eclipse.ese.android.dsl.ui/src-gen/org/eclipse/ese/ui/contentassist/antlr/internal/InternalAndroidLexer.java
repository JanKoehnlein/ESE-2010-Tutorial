package org.eclipse.ese.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAndroidLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int Tokens=19;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_STRING=5;
    public static final int RULE_INT=6;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int RULE_WS=9;
    public static final int T15=15;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public InternalAndroidLexer() {;} 
    public InternalAndroidLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:10:5: ( 'Application' )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:10:7: 'Application'
            {
            match("Application"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:11:5: ( 'Activity' )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:11:7: 'Activity'
            {
            match("Activity"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:12:5: ( '{' )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:12:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:13:5: ( '}' )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:13:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:14:5: ( 'Text' )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:14:7: 'Text'
            {
            match("Text"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:15:5: ( 'Spinner' )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:15:7: 'Spinner'
            {
            match("Spinner"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:16:5: ( 'Link' )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:16:7: 'Link'
            {
            match("Link"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:17:5: ( '->' )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:17:7: '->'
            {
            match("->"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:999:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:999:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:999:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:999:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:999:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1001:10: ( ( '0' .. '9' )+ )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1001:12: ( '0' .. '9' )+
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1001:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1001:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1003:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1003:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1003:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1003:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1003:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1003:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1003:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1003:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1003:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1003:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1003:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1003:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1005:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1005:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1005:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFE')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFE')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1005:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1007:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1007:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1007:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1007:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1007:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1007:41: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1007:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1007:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1009:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1009:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1009:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1011:16: ( . )
            // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1011:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=15;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='A') ) {
            alt12 = mTokensHelper001();
        }
        else if ( (LA12_0=='{') ) {
            alt12 = mTokensHelper002();
        }
        else if ( (LA12_0=='}') ) {
            alt12 = mTokensHelper003();
        }
        else if ( (LA12_0=='T') ) {
            alt12 = mTokensHelper004();
        }
        else if ( (LA12_0=='S') ) {
            alt12 = mTokensHelper005();
        }
        else if ( (LA12_0=='L') ) {
            alt12 = mTokensHelper006();
        }
        else if ( (LA12_0=='-') ) {
            alt12 = mTokensHelper007();
        }
        else if ( (LA12_0=='^') ) {
            alt12 = mTokensHelper008();
        }
        else if ( ((LA12_0>='B' && LA12_0<='K')||(LA12_0>='M' && LA12_0<='R')||(LA12_0>='U' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {
            alt12 = mTokensHelper009();
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12 = mTokensHelper010();
        }
        else if ( (LA12_0=='\"') ) {
            alt12 = mTokensHelper011();
        }
        else if ( (LA12_0=='\'') ) {
            alt12 = mTokensHelper012();
        }
        else if ( (LA12_0=='/') ) {
            alt12 = mTokensHelper013();
        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12 = mTokensHelper014();
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<=',')||LA12_0=='.'||(LA12_0>=':' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFE')) ) {
            alt12 = mTokensHelper015();
        }
        else {
            alt12 = mTokensHelper016();
        }
        switch (alt12) {
            case 1 :
                // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1:42: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 10 :
                // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1:50: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 11 :
                // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1:59: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 12 :
                // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1:71: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 13 :
                // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1:87: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 14 :
                // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1:103: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 15 :
                // ../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g:1:111: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }
    private int mTokensHelper001() throws RecognitionException {
        switch ( input.LA(2) ) {
        case 'p':
            {
            int LA12_16 = input.LA(3);

            if ( (LA12_16=='p') ) {
                int LA12_30 = input.LA(4);

                if ( (LA12_30=='l') ) {
                    int LA12_35 = input.LA(5);

                    if ( (LA12_35=='i') ) {
                        int LA12_40 = input.LA(6);

                        if ( (LA12_40=='c') ) {
                            int LA12_45 = input.LA(7);

                            if ( (LA12_45=='a') ) {
                                int LA12_48 = input.LA(8);

                                if ( (LA12_48=='t') ) {
                                    int LA12_51 = input.LA(9);

                                    if ( (LA12_51=='i') ) {
                                        int LA12_54 = input.LA(10);

                                        if ( (LA12_54=='o') ) {
                                            int LA12_56 = input.LA(11);

                                            if ( (LA12_56=='n') ) {
                                                int LA12_57 = input.LA(12);

                                                if ( ((LA12_57>='0' && LA12_57<='9')||(LA12_57>='A' && LA12_57<='Z')||LA12_57=='_'||(LA12_57>='a' && LA12_57<='z')) ) {
                                                    return 9;
                                                }
                                                else {
                                                    return 1;}
                                            }
                                            else {
                                                return 9;}
                                        }
                                        else {
                                            return 9;}
                                    }
                                    else {
                                        return 9;}
                                }
                                else {
                                    return 9;}
                            }
                            else {
                                return 9;}
                        }
                        else {
                            return 9;}
                    }
                    else {
                        return 9;}
                }
                else {
                    return 9;}
            }
            else {
                return 9;}
            }
        case 'c':
            {
            int LA12_17 = input.LA(3);

            if ( (LA12_17=='t') ) {
                int LA12_31 = input.LA(4);

                if ( (LA12_31=='i') ) {
                    int LA12_36 = input.LA(5);

                    if ( (LA12_36=='v') ) {
                        int LA12_41 = input.LA(6);

                        if ( (LA12_41=='i') ) {
                            int LA12_46 = input.LA(7);

                            if ( (LA12_46=='t') ) {
                                int LA12_49 = input.LA(8);

                                if ( (LA12_49=='y') ) {
                                    int LA12_52 = input.LA(9);

                                    if ( ((LA12_52>='0' && LA12_52<='9')||(LA12_52>='A' && LA12_52<='Z')||LA12_52=='_'||(LA12_52>='a' && LA12_52<='z')) ) {
                                        return 9;
                                    }
                                    else {
                                        return 2;}
                                }
                                else {
                                    return 9;}
                            }
                            else {
                                return 9;}
                        }
                        else {
                            return 9;}
                    }
                    else {
                        return 9;}
                }
                else {
                    return 9;}
            }
            else {
                return 9;}
            }
        default:
            return 9;}

    }

    private int mTokensHelper002() throws RecognitionException {
        return 3;
    }

    private int mTokensHelper003() throws RecognitionException {
        return 4;
    }

    private int mTokensHelper004() throws RecognitionException {
        int LA12_4 = input.LA(2);

        if ( (LA12_4=='e') ) {
            int LA12_21 = input.LA(3);

            if ( (LA12_21=='x') ) {
                int LA12_32 = input.LA(4);

                if ( (LA12_32=='t') ) {
                    int LA12_37 = input.LA(5);

                    if ( ((LA12_37>='0' && LA12_37<='9')||(LA12_37>='A' && LA12_37<='Z')||LA12_37=='_'||(LA12_37>='a' && LA12_37<='z')) ) {
                        return 9;
                    }
                    else {
                        return 5;}
                }
                else {
                    return 9;}
            }
            else {
                return 9;}
        }
        else {
            return 9;}
    }

    private int mTokensHelper005() throws RecognitionException {
        int LA12_5 = input.LA(2);

        if ( (LA12_5=='p') ) {
            int LA12_22 = input.LA(3);

            if ( (LA12_22=='i') ) {
                int LA12_33 = input.LA(4);

                if ( (LA12_33=='n') ) {
                    int LA12_38 = input.LA(5);

                    if ( (LA12_38=='n') ) {
                        int LA12_43 = input.LA(6);

                        if ( (LA12_43=='e') ) {
                            int LA12_47 = input.LA(7);

                            if ( (LA12_47=='r') ) {
                                int LA12_50 = input.LA(8);

                                if ( ((LA12_50>='0' && LA12_50<='9')||(LA12_50>='A' && LA12_50<='Z')||LA12_50=='_'||(LA12_50>='a' && LA12_50<='z')) ) {
                                    return 9;
                                }
                                else {
                                    return 6;}
                            }
                            else {
                                return 9;}
                        }
                        else {
                            return 9;}
                    }
                    else {
                        return 9;}
                }
                else {
                    return 9;}
            }
            else {
                return 9;}
        }
        else {
            return 9;}
    }

    private int mTokensHelper006() throws RecognitionException {
        int LA12_6 = input.LA(2);

        if ( (LA12_6=='i') ) {
            int LA12_23 = input.LA(3);

            if ( (LA12_23=='n') ) {
                int LA12_34 = input.LA(4);

                if ( (LA12_34=='k') ) {
                    int LA12_39 = input.LA(5);

                    if ( ((LA12_39>='0' && LA12_39<='9')||(LA12_39>='A' && LA12_39<='Z')||LA12_39=='_'||(LA12_39>='a' && LA12_39<='z')) ) {
                        return 9;
                    }
                    else {
                        return 7;}
                }
                else {
                    return 9;}
            }
            else {
                return 9;}
        }
        else {
            return 9;}
    }

    private int mTokensHelper007() throws RecognitionException {
        int LA12_7 = input.LA(2);

        if ( (LA12_7=='>') ) {
            return 8;
        }
        else {
            return 15;}
    }

    private int mTokensHelper008() throws RecognitionException {
        int LA12_8 = input.LA(2);

        if ( ((LA12_8>='A' && LA12_8<='Z')||LA12_8=='_'||(LA12_8>='a' && LA12_8<='z')) ) {
            return 9;
        }
        else {
            return 15;}
    }

    private int mTokensHelper009() throws RecognitionException {
        return 9;
    }

    private int mTokensHelper010() throws RecognitionException {
        return 10;
    }

    private int mTokensHelper011() throws RecognitionException {
        int LA12_11 = input.LA(2);

        if ( ((LA12_11>='\u0000' && LA12_11<='\uFFFE')) ) {
            return 11;
        }
        else {
            return 15;}
    }

    private int mTokensHelper012() throws RecognitionException {
        int LA12_12 = input.LA(2);

        if ( ((LA12_12>='\u0000' && LA12_12<='\uFFFE')) ) {
            return 11;
        }
        else {
            return 15;}
    }

    private int mTokensHelper013() throws RecognitionException {
        switch ( input.LA(2) ) {
        case '/':
            {
            return 13;
            }
        case '*':
            {
            return 12;
            }
        default:
            return 15;}

    }

    private int mTokensHelper014() throws RecognitionException {
        return 14;
    }

    private int mTokensHelper015() throws RecognitionException {
        return 15;
    }

    private int mTokensHelper016() throws RecognitionException {
        NoViableAltException nvae =
            new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

        throw nvae;
    }



 

}