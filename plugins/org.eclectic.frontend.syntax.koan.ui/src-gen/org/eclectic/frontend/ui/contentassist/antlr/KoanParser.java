/*
* generated by Xtext
*/
package org.eclectic.frontend.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.eclectic.frontend.services.KoanGrammarAccess;

public class KoanParser extends AbstractContentAssistParser {
	
	@Inject
	private KoanGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.eclectic.frontend.ui.contentassist.antlr.internal.InternalKoanParser createParser() {
		org.eclectic.frontend.ui.contentassist.antlr.internal.InternalKoanParser result = new org.eclectic.frontend.ui.contentassist.antlr.internal.InternalKoanParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTraceDefinitionAccess().getAlternatives_2(), "rule__TraceDefinition__Alternatives_2");
					put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
					put(grammarAccess.getPrimaryExpressionAccess().getAlternatives(), "rule__PrimaryExpression__Alternatives");
					put(grammarAccess.getMethodCallAccess().getAlternatives_1(), "rule__MethodCall__Alternatives_1");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getBinaryOpAccess().getAlternatives(), "rule__BinaryOp__Alternatives");
					put(grammarAccess.getMappingTransformationAccess().getGroup(), "rule__MappingTransformation__Group__0");
					put(grammarAccess.getTransformationDefinitionParameterAccess().getGroup(), "rule__TransformationDefinitionParameter__Group__0");
					put(grammarAccess.getTraceInterfaceAccess().getGroup(), "rule__TraceInterface__Group__0");
					put(grammarAccess.getTraceDefinitionAccess().getGroup(), "rule__TraceDefinition__Group__0");
					put(grammarAccess.getTraceDefinitionAccess().getGroup_2_0(), "rule__TraceDefinition__Group_2_0__0");
					put(grammarAccess.getTraceDefinitionAccess().getGroup_2_0_2(), "rule__TraceDefinition__Group_2_0_2__0");
					put(grammarAccess.getTraceDefinitionAccess().getGroup_2_1(), "rule__TraceDefinition__Group_2_1__0");
					put(grammarAccess.getTraceElementInlineAccess().getGroup(), "rule__TraceElementInline__Group__0");
					put(grammarAccess.getTraceElementExpandedAccess().getGroup(), "rule__TraceElementExpanded__Group__0");
					put(grammarAccess.getClassUseAccess().getGroup(), "rule__ClassUse__Group__0");
					put(grammarAccess.getPropertyWriteAccess().getGroup(), "rule__PropertyWrite__Group__0");
					put(grammarAccess.getDefineVariableAccess().getGroup(), "rule__DefineVariable__Group__0");
					put(grammarAccess.getModelReferenceAccess().getGroup(), "rule__ModelReference__Group__0");
					put(grammarAccess.getParenthesizedExpressionAccess().getGroup(), "rule__ParenthesizedExpression__Group__0");
					put(grammarAccess.getClosureDeclarationAccess().getGroup(), "rule__ClosureDeclaration__Group__0");
					put(grammarAccess.getClosureDeclarationAccess().getGroup_1(), "rule__ClosureDeclaration__Group_1__0");
					put(grammarAccess.getClosureDeclarationAccess().getGroup_1_2(), "rule__ClosureDeclaration__Group_1_2__0");
					put(grammarAccess.getMethodCallAccess().getGroup(), "rule__MethodCall__Group__0");
					put(grammarAccess.getMethodCallAccess().getGroup_1_0(), "rule__MethodCall__Group_1_0__0");
					put(grammarAccess.getMethodCallAccess().getGroup_1_1(), "rule__MethodCall__Group_1_1__0");
					put(grammarAccess.getMethodCallAccess().getGroup_1_1_0(), "rule__MethodCall__Group_1_1_0__0");
					put(grammarAccess.getMethodCallAccess().getGroup_1_1_3(), "rule__MethodCall__Group_1_1_3__0");
					put(grammarAccess.getMethodCallAccess().getGroup_1_1_3_2(), "rule__MethodCall__Group_1_1_3_2__0");
					put(grammarAccess.getMethodCallAccess().getGroup_1_2(), "rule__MethodCall__Group_1_2__0");
					put(grammarAccess.getKeywordParameterAccess().getGroup(), "rule__KeywordParameter__Group__0");
					put(grammarAccess.getMatchTraceExpressionAccess().getGroup(), "rule__MatchTraceExpression__Group__0");
					put(grammarAccess.getMatchTraceExpressionAccess().getGroup_1(), "rule__MatchTraceExpression__Group_1__0");
					put(grammarAccess.getTraceExprLanguageAccess().getGroup(), "rule__TraceExprLanguage__Group__0");
					put(grammarAccess.getPutTraceExpressionAccess().getGroup(), "rule__PutTraceExpression__Group__0");
					put(grammarAccess.getPutTraceExpressionAccess().getGroup_1(), "rule__PutTraceExpression__Group_1__0");
					put(grammarAccess.getPutTraceExpressionAccess().getGroup_6(), "rule__PutTraceExpression__Group_6__0");
					put(grammarAccess.getPutTraceParameterAccess().getGroup(), "rule__PutTraceParameter__Group__0");
					put(grammarAccess.getKoanRuleAccess().getGroup(), "rule__KoanRule__Group__0");
					put(grammarAccess.getForAllMatcherAccess().getGroup(), "rule__ForAllMatcher__Group__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getMappingTransformationAccess().getNameAssignment_1(), "rule__MappingTransformation__NameAssignment_1");
					put(grammarAccess.getMappingTransformationAccess().getInModelsAssignment_3(), "rule__MappingTransformation__InModelsAssignment_3");
					put(grammarAccess.getMappingTransformationAccess().getOutModelsAssignment_7(), "rule__MappingTransformation__OutModelsAssignment_7");
					put(grammarAccess.getMappingTransformationAccess().getTraceInterfaceAssignment_9(), "rule__MappingTransformation__TraceInterfaceAssignment_9");
					put(grammarAccess.getMappingTransformationAccess().getRulesAssignment_10(), "rule__MappingTransformation__RulesAssignment_10");
					put(grammarAccess.getTransformationDefinitionParameterAccess().getNameAssignment_1(), "rule__TransformationDefinitionParameter__NameAssignment_1");
					put(grammarAccess.getTraceInterfaceAccess().getNameAssignment_1(), "rule__TraceInterface__NameAssignment_1");
					put(grammarAccess.getTraceInterfaceAccess().getDefinitionsAssignment_2(), "rule__TraceInterface__DefinitionsAssignment_2");
					put(grammarAccess.getTraceDefinitionAccess().getNameAssignment_1(), "rule__TraceDefinition__NameAssignment_1");
					put(grammarAccess.getTraceDefinitionAccess().getElementsAssignment_2_0_1(), "rule__TraceDefinition__ElementsAssignment_2_0_1");
					put(grammarAccess.getTraceDefinitionAccess().getElementsAssignment_2_0_2_1(), "rule__TraceDefinition__ElementsAssignment_2_0_2_1");
					put(grammarAccess.getTraceDefinitionAccess().getElementsAssignment_2_1_0(), "rule__TraceDefinition__ElementsAssignment_2_1_0");
					put(grammarAccess.getTraceDefinitionAccess().getElementsAssignment_2_1_1(), "rule__TraceDefinition__ElementsAssignment_2_1_1");
					put(grammarAccess.getTraceElementInlineAccess().getNameAssignment_0(), "rule__TraceElementInline__NameAssignment_0");
					put(grammarAccess.getTraceElementInlineAccess().getTypeAssignment_2(), "rule__TraceElementInline__TypeAssignment_2");
					put(grammarAccess.getTraceElementExpandedAccess().getNameAssignment_1(), "rule__TraceElementExpanded__NameAssignment_1");
					put(grammarAccess.getTraceElementExpandedAccess().getTypeAssignment_3(), "rule__TraceElementExpanded__TypeAssignment_3");
					put(grammarAccess.getClassUseAccess().getModelAssignment_0(), "rule__ClassUse__ModelAssignment_0");
					put(grammarAccess.getClassUseAccess().getClassNameAssignment_2(), "rule__ClassUse__ClassNameAssignment_2");
					put(grammarAccess.getPropertyWriteAccess().getReceptorAssignment_0(), "rule__PropertyWrite__ReceptorAssignment_0");
					put(grammarAccess.getPropertyWriteAccess().getPropertyAssignment_2(), "rule__PropertyWrite__PropertyAssignment_2");
					put(grammarAccess.getPropertyWriteAccess().getExpressionAssignment_4(), "rule__PropertyWrite__ExpressionAssignment_4");
					put(grammarAccess.getDefineVariableAccess().getNameAssignment_0(), "rule__DefineVariable__NameAssignment_0");
					put(grammarAccess.getDefineVariableAccess().getExpressionAssignment_2(), "rule__DefineVariable__ExpressionAssignment_2");
					put(grammarAccess.getModelReferenceAccess().getModelAssignment_0(), "rule__ModelReference__ModelAssignment_0");
					put(grammarAccess.getModelReferenceAccess().getClassNameAssignment_2(), "rule__ModelReference__ClassNameAssignment_2");
					put(grammarAccess.getVariableReferenceAccess().getVariableAssignment(), "rule__VariableReference__VariableAssignment");
					put(grammarAccess.getClosureDeclarationAccess().getFormalParametersAssignment_1_1(), "rule__ClosureDeclaration__FormalParametersAssignment_1_1");
					put(grammarAccess.getClosureDeclarationAccess().getFormalParametersAssignment_1_2_1(), "rule__ClosureDeclaration__FormalParametersAssignment_1_2_1");
					put(grammarAccess.getClosureDeclarationAccess().getStatementsAssignment_2(), "rule__ClosureDeclaration__StatementsAssignment_2");
					put(grammarAccess.getClosureParameterAccess().getNameAssignment(), "rule__ClosureParameter__NameAssignment");
					put(grammarAccess.getMethodCallAccess().getBinaryOpAssignment_1_0_1(), "rule__MethodCall__BinaryOpAssignment_1_0_1");
					put(grammarAccess.getMethodCallAccess().getRightAssignment_1_0_2(), "rule__MethodCall__RightAssignment_1_0_2");
					put(grammarAccess.getMethodCallAccess().getMethodNameAssignment_1_1_2(), "rule__MethodCall__MethodNameAssignment_1_1_2");
					put(grammarAccess.getMethodCallAccess().getWithParametersAssignment_1_1_3_0(), "rule__MethodCall__WithParametersAssignment_1_1_3_0");
					put(grammarAccess.getMethodCallAccess().getParametersAssignment_1_1_3_1(), "rule__MethodCall__ParametersAssignment_1_1_3_1");
					put(grammarAccess.getMethodCallAccess().getParametersAssignment_1_1_3_2_1(), "rule__MethodCall__ParametersAssignment_1_1_3_2_1");
					put(grammarAccess.getMethodCallAccess().getParametersAssignment_1_2_2(), "rule__MethodCall__ParametersAssignment_1_2_2");
					put(grammarAccess.getKeywordParameterAccess().getKeywordAssignment_0(), "rule__KeywordParameter__KeywordAssignment_0");
					put(grammarAccess.getKeywordParameterAccess().getValueAssignment_1(), "rule__KeywordParameter__ValueAssignment_1");
					put(grammarAccess.getMatchTraceExpressionAccess().getTraceAssignment_2(), "rule__MatchTraceExpression__TraceAssignment_2");
					put(grammarAccess.getMatchTraceExpressionAccess().getTraceExprAssignment_5(), "rule__MatchTraceExpression__TraceExprAssignment_5");
					put(grammarAccess.getTraceExprLanguageAccess().getTraceVarAssignment_0(), "rule__TraceExprLanguage__TraceVarAssignment_0");
					put(grammarAccess.getTraceExprLanguageAccess().getExprAssignment_2(), "rule__TraceExprLanguage__ExprAssignment_2");
					put(grammarAccess.getPutTraceExpressionAccess().getTraceAssignment_2(), "rule__PutTraceExpression__TraceAssignment_2");
					put(grammarAccess.getPutTraceExpressionAccess().getParametersAssignment_5(), "rule__PutTraceExpression__ParametersAssignment_5");
					put(grammarAccess.getPutTraceExpressionAccess().getParametersAssignment_6_1(), "rule__PutTraceExpression__ParametersAssignment_6_1");
					put(grammarAccess.getPutTraceParameterAccess().getTraceVarAssignment_0(), "rule__PutTraceParameter__TraceVarAssignment_0");
					put(grammarAccess.getPutTraceParameterAccess().getValueAssignment_2(), "rule__PutTraceParameter__ValueAssignment_2");
					put(grammarAccess.getNumLiteralAccess().getValueAssignment(), "rule__NumLiteral__ValueAssignment");
					put(grammarAccess.getKoanRuleAccess().getNameAssignment_1(), "rule__KoanRule__NameAssignment_1");
					put(grammarAccess.getKoanRuleAccess().getMatcherAssignment_2(), "rule__KoanRule__MatcherAssignment_2");
					put(grammarAccess.getKoanRuleAccess().getStatementsAssignment_3(), "rule__KoanRule__StatementsAssignment_3");
					put(grammarAccess.getForAllMatcherAccess().getNameAssignment_1(), "rule__ForAllMatcher__NameAssignment_1");
					put(grammarAccess.getForAllMatcherAccess().getTypeAssignment_3(), "rule__ForAllMatcher__TypeAssignment_3");
					put(grammarAccess.getForAllMatcherAccess().getChildAssignment_4(), "rule__ForAllMatcher__ChildAssignment_4");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.eclectic.frontend.ui.contentassist.antlr.internal.InternalKoanParser typedParser = (org.eclectic.frontend.ui.contentassist.antlr.internal.InternalKoanParser) parser;
			typedParser.entryRuleMappingTransformation();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public KoanGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(KoanGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
