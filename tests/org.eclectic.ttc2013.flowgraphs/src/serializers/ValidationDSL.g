grammar ValidationDSL;
options {backtrack= false; output=AST; ASTLabelType=CommonTree; superClass=MetaDepthParserBase;}
tokens{DOC_INSTANCE;
CFNEXT = 'cfNext';
CONTROLFLOWLINKTEMPLATE_NODE;
DFNEXT = 'dfNext';
DATAFLOWLINKTEMPLATE_NODE;
TRUE = 'true';
FALSE = 'false';
SYMBOL;
TOKEN;
ID_ACCESS;
LIST_VALUE;
VALIDATE = 'validate';
GROUP1;
GROUP2;
VALIDATIONDSL_NODE;
VALIDATIONDSL_NODE;
SYMBOL22 = '-->';
COLON = ':';
}
@parser::header{
/*******************************************************************************
 * MetaDepth parser for language: ValidationDSL
 ******************************************************************************/
package serializers;
import meteoric.at3rdx.parse.MetaDepthParserBase;
}

@lexer::header{
/*******************************************************************************
 * MetaDepth parser for language: ValidationDSL
 ******************************************************************************/
package serializers;
import meteoric.at3rdx.parse.MetaDepthParserBase;
}

@members{
public void emitErrorMessage ( String msg ) {}
public ValidationDSLParser() {}
}

document : declas+ EOF -> ^(DOC_INSTANCE declas*);
declas : main;
main :  VALIDATE id=ID ( ControlFlowLinkTemplate7+=rControlFlowLinkTemplate )* ( DataFlowLinkTemplate8+=rDataFlowLinkTemplate )* -> ^(VALIDATIONDSL_NODE ^(TOKEN VALIDATE) ^(ID_ACCESS $id) ^(GROUP1 ^(LIST_VALUE $ControlFlowLinkTemplate7* ) ) ^(GROUP2 ^(LIST_VALUE $DataFlowLinkTemplate8* ) ));

rControlFlowLinkTemplate :  CFNEXT COLON left1=STRING SYMBOL22 right2=STRING -> ^(CONTROLFLOWLINKTEMPLATE_NODE ^(TOKEN CFNEXT) ^(SYMBOL COLON) $left1 ^(SYMBOL SYMBOL22) $right2);

rDataFlowLinkTemplate :  DFNEXT COLON left4=STRING SYMBOL22 right5=STRING -> ^(DATAFLOWLINKTEMPLATE_NODE ^(TOKEN DFNEXT) ^(SYMBOL COLON) $left4 ^(SYMBOL SYMBOL22) $right5);

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
INT :	'0'..'9'+;
FLOAT:   ('0'..'9')+ '.' ('0'..'9')* EXPONENT? |   '.' ('0'..'9')+ EXPONENT? |   ('0'..'9')+ EXPONENT;
fragment EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;
COMMENT :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}  |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;};
WS  :   ( ' ' | '\t' | '\r' | '\n') {$channel=HIDDEN;};
STRING :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"';
CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\'';
fragment ESC_SEQ :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') |   UNICODE_ESC |   OCTAL_ESC;
fragment OCTAL_ESC :   '\\' ('0'..'3') ('0'..'7') ('0'..'7') |   '\\' ('0'..'7') ('0'..'7') |   '\\' ('0'..'7');
fragment UNICODE_ESC :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT;
fragment HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;
//TRUE : 'true';
//FALSE : 'false';
bool 	:	TRUE | FALSE;
