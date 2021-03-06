/*
* generated by Xtext
*/
grammar InternalStreamDescLanguage;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.eclectic.streamdesc.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclectic.streamdesc.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclectic.streamdesc.services.StreamDescLanguageGrammarAccess;

}

@parser::members {

 	private StreamDescLanguageGrammarAccess grammarAccess;
 	
    public InternalStreamDescLanguageParser(TokenStream input, StreamDescLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "StreamDescription";	
   	}
   	
   	@Override
   	protected StreamDescLanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleStreamDescription
entryRuleStreamDescription returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStreamDescriptionRule()); }
	 iv_ruleStreamDescription=ruleStreamDescription 
	 { $current=$iv_ruleStreamDescription.current; } 
	 EOF 
;

// Rule StreamDescription
ruleStreamDescription returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='stream' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getStreamDescriptionAccess().getStreamKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getStreamDescriptionAccess().getStreamNameEStringParserRuleCall_1_0()); 
	    }
		lv_streamName_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStreamDescriptionRule());
	        }
       		set(
       			$current, 
       			"streamName",
        		lv_streamName_1_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='for' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getStreamDescriptionAccess().getForKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getStreamDescriptionAccess().getMetamodelNameEStringParserRuleCall_3_0()); 
	    }
		lv_metamodelName_3_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStreamDescriptionRule());
	        }
       		set(
       			$current, 
       			"metamodelName",
        		lv_metamodelName_3_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)((
(
		{ 
	        newCompositeNode(grammarAccess.getStreamDescriptionAccess().getKeysKeySpecParserRuleCall_4_0_0()); 
	    }
		lv_keys_4_0=ruleKeySpec		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStreamDescriptionRule());
	        }
       		add(
       			$current, 
       			"keys",
        		lv_keys_4_0, 
        		"KeySpec");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getStreamDescriptionAccess().getKeysKeySpecParserRuleCall_4_1_0()); 
	    }
		lv_keys_5_0=ruleKeySpec		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStreamDescriptionRule());
	        }
       		add(
       			$current, 
       			"keys",
        		lv_keys_5_0, 
        		"KeySpec");
	        afterParserOrEnumRuleCall();
	    }

)
)*)?((
(
		{ 
	        newCompositeNode(grammarAccess.getStreamDescriptionAccess().getWindowsSlidingWindowParserRuleCall_5_0_0()); 
	    }
		lv_windows_6_0=ruleSlidingWindow		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStreamDescriptionRule());
	        }
       		add(
       			$current, 
       			"windows",
        		lv_windows_6_0, 
        		"SlidingWindow");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getStreamDescriptionAccess().getWindowsSlidingWindowParserRuleCall_5_1_0()); 
	    }
		lv_windows_7_0=ruleSlidingWindow		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStreamDescriptionRule());
	        }
       		add(
       			$current, 
       			"windows",
        		lv_windows_7_0, 
        		"SlidingWindow");
	        afterParserOrEnumRuleCall();
	    }

)
)*)?)
;





// Entry rule entryRuleSlidingWindow
entryRuleSlidingWindow returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSlidingWindowRule()); }
	 iv_ruleSlidingWindow=ruleSlidingWindow 
	 { $current=$iv_ruleSlidingWindow.current; } 
	 EOF 
;

// Rule SlidingWindow
ruleSlidingWindow returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getSlidingWindowAccess().getTimeSlidingWindowParserRuleCall_0()); 
    }
    this_TimeSlidingWindow_0=ruleTimeSlidingWindow
    { 
        $current = $this_TimeSlidingWindow_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getSlidingWindowAccess().getElementSlidingWindowParserRuleCall_1()); 
    }
    this_ElementSlidingWindow_1=ruleElementSlidingWindow
    { 
        $current = $this_ElementSlidingWindow_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleTimeSlidingWindow
entryRuleTimeSlidingWindow returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTimeSlidingWindowRule()); }
	 iv_ruleTimeSlidingWindow=ruleTimeSlidingWindow 
	 { $current=$iv_ruleTimeSlidingWindow.current; } 
	 EOF 
;

// Rule TimeSlidingWindow
ruleTimeSlidingWindow returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='sliding' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getTimeSlidingWindowAccess().getSlidingKeyword_0());
    }
	otherlv_1='for' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getTimeSlidingWindowAccess().getForKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getTimeSlidingWindowAccess().getClassNameEStringParserRuleCall_2_0()); 
	    }
		lv_className_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTimeSlidingWindowRule());
	        }
       		set(
       			$current, 
       			"className",
        		lv_className_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='=' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getTimeSlidingWindowAccess().getEqualsSignKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getTimeSlidingWindowAccess().getSecondsEIntParserRuleCall_4_0()); 
	    }
		lv_seconds_4_0=ruleEInt		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTimeSlidingWindowRule());
	        }
       		set(
       			$current, 
       			"seconds",
        		lv_seconds_4_0, 
        		"EInt");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_5='seconds' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getTimeSlidingWindowAccess().getSecondsKeyword_5_0());
    }

    |	otherlv_6='secs' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getTimeSlidingWindowAccess().getSecsKeyword_5_1());
    }
))
;





// Entry rule entryRuleElementSlidingWindow
entryRuleElementSlidingWindow returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getElementSlidingWindowRule()); }
	 iv_ruleElementSlidingWindow=ruleElementSlidingWindow 
	 { $current=$iv_ruleElementSlidingWindow.current; } 
	 EOF 
;

// Rule ElementSlidingWindow
ruleElementSlidingWindow returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='sliding' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getElementSlidingWindowAccess().getSlidingKeyword_0());
    }
	otherlv_1='for' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getElementSlidingWindowAccess().getForKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getElementSlidingWindowAccess().getClassNameEStringParserRuleCall_2_0()); 
	    }
		lv_className_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getElementSlidingWindowRule());
	        }
       		set(
       			$current, 
       			"className",
        		lv_className_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='=' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getElementSlidingWindowAccess().getEqualsSignKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getElementSlidingWindowAccess().getElementsEIntParserRuleCall_4_0()); 
	    }
		lv_elements_4_0=ruleEInt		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getElementSlidingWindowRule());
	        }
       		set(
       			$current, 
       			"elements",
        		lv_elements_4_0, 
        		"EInt");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5='elements' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getElementSlidingWindowAccess().getElementsKeyword_5());
    }
)
;





// Entry rule entryRuleKeySpec
entryRuleKeySpec returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getKeySpecRule()); }
	 iv_ruleKeySpec=ruleKeySpec 
	 { $current=$iv_ruleKeySpec.current; } 
	 EOF 
;

// Rule KeySpec
ruleKeySpec returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='key' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getKeySpecAccess().getKeyKeyword_0());
    }
	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getKeySpecAccess().getLeftParenthesisKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getKeySpecAccess().getClassNameEStringParserRuleCall_2_0()); 
	    }
		lv_className_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getKeySpecRule());
	        }
       		set(
       			$current, 
       			"className",
        		lv_className_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3=')' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getKeySpecAccess().getRightParenthesisKeyword_3());
    }
	otherlv_4='=' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getKeySpecAccess().getEqualsSignKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getKeySpecAccess().getFeatureNameEStringParserRuleCall_5_0()); 
	    }
		lv_featureName_5_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getKeySpecRule());
	        }
       		set(
       			$current, 
       			"featureName",
        		lv_featureName_5_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleEString
entryRuleEString returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEStringRule()); } 
	 iv_ruleEString=ruleEString 
	 { $current=$iv_ruleEString.current.getText(); }  
	 EOF 
;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_STRING_0=RULE_STRING    {
		$current.merge(this_STRING_0);
    }

    { 
    newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
    }

    |    this_ID_1=RULE_ID    {
		$current.merge(this_ID_1);
    }

    { 
    newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
    }
)
    ;





// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEIntRule()); } 
	 iv_ruleEInt=ruleEInt 
	 { $current=$iv_ruleEInt.current.getText(); }  
	 EOF 
;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
    this_INT_0=RULE_INT    {
		$current.merge(this_INT_0);
    }

    { 
    newLeafNode(this_INT_0, grammarAccess.getEIntAccess().getINTTerminalRuleCall()); 
    }

    ;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


