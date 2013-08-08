lexer grammar ValidationDSL;

@header {
/*******************************************************************************
 * MetaDepth parser for language: ValidationDSL
 ******************************************************************************/
package serializers;
import meteoric.at3rdx.parse.MetaDepthParserBase;
}

CFNEXT : 'cfNext' ;
DFNEXT : 'dfNext' ;
TRUE : 'true' ;
FALSE : 'false' ;
VALIDATE : 'validate' ;
SYMBOL22 : '-->' ;
COLON : ':' ;

// $ANTLR src "src/serializers/ValidationDSL.g" 51
ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
// $ANTLR src "src/serializers/ValidationDSL.g" 52
INT :	'0'..'9'+;
// $ANTLR src "src/serializers/ValidationDSL.g" 53
FLOAT:   ('0'..'9')+ '.' ('0'..'9')* EXPONENT? |   '.' ('0'..'9')+ EXPONENT? |   ('0'..'9')+ EXPONENT;
// $ANTLR src "src/serializers/ValidationDSL.g" 54
fragment EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;
// $ANTLR src "src/serializers/ValidationDSL.g" 55
COMMENT :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}  |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;};
// $ANTLR src "src/serializers/ValidationDSL.g" 56
WS  :   ( ' ' | '\t' | '\r' | '\n') {$channel=HIDDEN;};
// $ANTLR src "src/serializers/ValidationDSL.g" 57
STRING :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"';
// $ANTLR src "src/serializers/ValidationDSL.g" 58
CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\'';
// $ANTLR src "src/serializers/ValidationDSL.g" 59
fragment ESC_SEQ :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') |   UNICODE_ESC |   OCTAL_ESC;
// $ANTLR src "src/serializers/ValidationDSL.g" 60
fragment OCTAL_ESC :   '\\' ('0'..'3') ('0'..'7') ('0'..'7') |   '\\' ('0'..'7') ('0'..'7') |   '\\' ('0'..'7');
// $ANTLR src "src/serializers/ValidationDSL.g" 61
fragment UNICODE_ESC :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT;
// $ANTLR src "src/serializers/ValidationDSL.g" 62
fragment HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;
//TRUE : 'true';
//FALSE : 'false';
