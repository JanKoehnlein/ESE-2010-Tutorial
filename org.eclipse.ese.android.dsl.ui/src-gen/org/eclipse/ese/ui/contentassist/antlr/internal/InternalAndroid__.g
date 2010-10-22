lexer grammar InternalAndroid;
@header {
package org.eclipse.ese.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'Project' ;
T12 : 'Activity' ;
T13 : '{' ;
T14 : '}' ;
T15 : 'Text' ;
T16 : 'Button' ;
T17 : 'Spinner' ;
T18 : 'Link' ;
T19 : '->' ;

// $ANTLR src "../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g" 1111
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g" 1113
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g" 1115
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g" 1117
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g" 1119
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g" 1121
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.ese.android.dsl.ui/src-gen/org/eclipse/ese/ui/contentassist/antlr/internal/InternalAndroid.g" 1123
RULE_ANY_OTHER : .;


