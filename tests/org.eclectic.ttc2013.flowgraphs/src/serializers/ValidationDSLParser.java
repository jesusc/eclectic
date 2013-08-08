// $ANTLR 3.1 src/serializers/ValidationDSL.g 2013-06-20 11:09:03

/*******************************************************************************
 * MetaDepth parser for language: ValidationDSL
 ******************************************************************************/
package serializers;
import meteoric.at3rdx.parse.MetaDepthParserBase;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class ValidationDSLParser extends MetaDepthParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DOC_INSTANCE", "CFNEXT", "CONTROLFLOWLINKTEMPLATE_NODE", "DFNEXT", "DATAFLOWLINKTEMPLATE_NODE", "TRUE", "FALSE", "SYMBOL", "TOKEN", "ID_ACCESS", "LIST_VALUE", "VALIDATE", "GROUP1", "GROUP2", "VALIDATIONDSL_NODE", "SYMBOL22", "COLON", "ID", "STRING", "INT", "EXPONENT", "FLOAT", "COMMENT", "WS", "ESC_SEQ", "CHAR", "UNICODE_ESC", "OCTAL_ESC", "HEX_DIGIT"
    };
    public static final int ID_ACCESS=13;
    public static final int VALIDATIONDSL_NODE=18;
    public static final int EXPONENT=24;
    public static final int SYMBOL=11;
    public static final int UNICODE_ESC=30;
    public static final int DOC_INSTANCE=4;
    public static final int OCTAL_ESC=31;
    public static final int CHAR=29;
    public static final int DATAFLOWLINKTEMPLATE_NODE=8;
    public static final int HEX_DIGIT=32;
    public static final int FLOAT=25;
    public static final int INT=23;
    public static final int SYMBOL22=19;
    public static final int ID=21;
    public static final int EOF=-1;
    public static final int TRUE=9;
    public static final int DFNEXT=7;
    public static final int TOKEN=12;
    public static final int COLON=20;
    public static final int ESC_SEQ=28;
    public static final int WS=27;
    public static final int LIST_VALUE=14;
    public static final int VALIDATE=15;
    public static final int CFNEXT=5;
    public static final int COMMENT=26;
    public static final int CONTROLFLOWLINKTEMPLATE_NODE=6;
    public static final int FALSE=10;
    public static final int GROUP2=17;
    public static final int GROUP1=16;
    public static final int STRING=22;

    // delegates
    // delegators


        public ValidationDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public ValidationDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return ValidationDSLParser.tokenNames; }
    public String getGrammarFileName() { return "src/serializers/ValidationDSL.g"; }


    public void emitErrorMessage ( String msg ) {}
    public ValidationDSLParser() {}


    public static class document_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "document"
    // src/serializers/ValidationDSL.g:43:1: document : ( declas )+ EOF -> ^( DOC_INSTANCE ( declas )* ) ;
    public final ValidationDSLParser.document_return document() throws RecognitionException {
        ValidationDSLParser.document_return retval = new ValidationDSLParser.document_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF2=null;
        ValidationDSLParser.declas_return declas1 = null;


        CommonTree EOF2_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_declas=new RewriteRuleSubtreeStream(adaptor,"rule declas");
        try {
            // src/serializers/ValidationDSL.g:43:10: ( ( declas )+ EOF -> ^( DOC_INSTANCE ( declas )* ) )
            // src/serializers/ValidationDSL.g:43:12: ( declas )+ EOF
            {
            // src/serializers/ValidationDSL.g:43:12: ( declas )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==VALIDATE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // src/serializers/ValidationDSL.g:43:12: declas
            	    {
            	    pushFollow(FOLLOW_declas_in_document138);
            	    declas1=declas();

            	    state._fsp--;

            	    stream_declas.add(declas1.getTree());

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

            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_document141);  
            stream_EOF.add(EOF2);



            // AST REWRITE
            // elements: declas
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 43:24: -> ^( DOC_INSTANCE ( declas )* )
            {
                // src/serializers/ValidationDSL.g:43:27: ^( DOC_INSTANCE ( declas )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DOC_INSTANCE, "DOC_INSTANCE"), root_1);

                // src/serializers/ValidationDSL.g:43:42: ( declas )*
                while ( stream_declas.hasNext() ) {
                    adaptor.addChild(root_1, stream_declas.nextTree());

                }
                stream_declas.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "document"

    public static class declas_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declas"
    // src/serializers/ValidationDSL.g:44:1: declas : main ;
    public final ValidationDSLParser.declas_return declas() throws RecognitionException {
        ValidationDSLParser.declas_return retval = new ValidationDSLParser.declas_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        ValidationDSLParser.main_return main3 = null;



        try {
            // src/serializers/ValidationDSL.g:44:8: ( main )
            // src/serializers/ValidationDSL.g:44:10: main
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_main_in_declas157);
            main3=main();

            state._fsp--;

            adaptor.addChild(root_0, main3.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declas"

    public static class main_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "main"
    // src/serializers/ValidationDSL.g:45:1: main : VALIDATE id= ID (ControlFlowLinkTemplate7+= rControlFlowLinkTemplate )* (DataFlowLinkTemplate8+= rDataFlowLinkTemplate )* -> ^( VALIDATIONDSL_NODE ^( TOKEN VALIDATE ) ^( ID_ACCESS $id) ^( GROUP1 ^( LIST_VALUE ( $ControlFlowLinkTemplate7)* ) ) ^( GROUP2 ^( LIST_VALUE ( $DataFlowLinkTemplate8)* ) ) ) ;
    public final ValidationDSLParser.main_return main() throws RecognitionException {
        ValidationDSLParser.main_return retval = new ValidationDSLParser.main_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token id=null;
        Token VALIDATE4=null;
        List list_ControlFlowLinkTemplate7=null;
        List list_DataFlowLinkTemplate8=null;
        ValidationDSLParser.rControlFlowLinkTemplate_return ControlFlowLinkTemplate7 = null;
        ValidationDSLParser.rDataFlowLinkTemplate_return DataFlowLinkTemplate8 = null;
        CommonTree id_tree=null;
        CommonTree VALIDATE4_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_VALIDATE=new RewriteRuleTokenStream(adaptor,"token VALIDATE");
        RewriteRuleSubtreeStream stream_rDataFlowLinkTemplate=new RewriteRuleSubtreeStream(adaptor,"rule rDataFlowLinkTemplate");
        RewriteRuleSubtreeStream stream_rControlFlowLinkTemplate=new RewriteRuleSubtreeStream(adaptor,"rule rControlFlowLinkTemplate");
        try {
            // src/serializers/ValidationDSL.g:45:6: ( VALIDATE id= ID (ControlFlowLinkTemplate7+= rControlFlowLinkTemplate )* (DataFlowLinkTemplate8+= rDataFlowLinkTemplate )* -> ^( VALIDATIONDSL_NODE ^( TOKEN VALIDATE ) ^( ID_ACCESS $id) ^( GROUP1 ^( LIST_VALUE ( $ControlFlowLinkTemplate7)* ) ) ^( GROUP2 ^( LIST_VALUE ( $DataFlowLinkTemplate8)* ) ) ) )
            // src/serializers/ValidationDSL.g:45:9: VALIDATE id= ID (ControlFlowLinkTemplate7+= rControlFlowLinkTemplate )* (DataFlowLinkTemplate8+= rDataFlowLinkTemplate )*
            {
            VALIDATE4=(Token)match(input,VALIDATE,FOLLOW_VALIDATE_in_main165);  
            stream_VALIDATE.add(VALIDATE4);

            id=(Token)match(input,ID,FOLLOW_ID_in_main169);  
            stream_ID.add(id);

            // src/serializers/ValidationDSL.g:45:24: (ControlFlowLinkTemplate7+= rControlFlowLinkTemplate )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==CFNEXT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // src/serializers/ValidationDSL.g:45:26: ControlFlowLinkTemplate7+= rControlFlowLinkTemplate
            	    {
            	    pushFollow(FOLLOW_rControlFlowLinkTemplate_in_main175);
            	    ControlFlowLinkTemplate7=rControlFlowLinkTemplate();

            	    state._fsp--;

            	    stream_rControlFlowLinkTemplate.add(ControlFlowLinkTemplate7.getTree());
            	    if (list_ControlFlowLinkTemplate7==null) list_ControlFlowLinkTemplate7=new ArrayList();
            	    list_ControlFlowLinkTemplate7.add(ControlFlowLinkTemplate7.getTree());


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // src/serializers/ValidationDSL.g:45:80: (DataFlowLinkTemplate8+= rDataFlowLinkTemplate )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==DFNEXT) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // src/serializers/ValidationDSL.g:45:82: DataFlowLinkTemplate8+= rDataFlowLinkTemplate
            	    {
            	    pushFollow(FOLLOW_rDataFlowLinkTemplate_in_main184);
            	    DataFlowLinkTemplate8=rDataFlowLinkTemplate();

            	    state._fsp--;

            	    stream_rDataFlowLinkTemplate.add(DataFlowLinkTemplate8.getTree());
            	    if (list_DataFlowLinkTemplate8==null) list_DataFlowLinkTemplate8=new ArrayList();
            	    list_DataFlowLinkTemplate8.add(DataFlowLinkTemplate8.getTree());


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);



            // AST REWRITE
            // elements: DataFlowLinkTemplate8, VALIDATE, id, ControlFlowLinkTemplate7
            // token labels: id
            // rule labels: retval
            // token list labels: 
            // rule list labels: ControlFlowLinkTemplate7, DataFlowLinkTemplate8
            retval.tree = root_0;
            RewriteRuleTokenStream stream_id=new RewriteRuleTokenStream(adaptor,"token id",id);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_ControlFlowLinkTemplate7=new RewriteRuleSubtreeStream(adaptor,"token ControlFlowLinkTemplate7",list_ControlFlowLinkTemplate7);
            RewriteRuleSubtreeStream stream_DataFlowLinkTemplate8=new RewriteRuleSubtreeStream(adaptor,"token DataFlowLinkTemplate8",list_DataFlowLinkTemplate8);
            root_0 = (CommonTree)adaptor.nil();
            // 45:130: -> ^( VALIDATIONDSL_NODE ^( TOKEN VALIDATE ) ^( ID_ACCESS $id) ^( GROUP1 ^( LIST_VALUE ( $ControlFlowLinkTemplate7)* ) ) ^( GROUP2 ^( LIST_VALUE ( $DataFlowLinkTemplate8)* ) ) )
            {
                // src/serializers/ValidationDSL.g:45:133: ^( VALIDATIONDSL_NODE ^( TOKEN VALIDATE ) ^( ID_ACCESS $id) ^( GROUP1 ^( LIST_VALUE ( $ControlFlowLinkTemplate7)* ) ) ^( GROUP2 ^( LIST_VALUE ( $DataFlowLinkTemplate8)* ) ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VALIDATIONDSL_NODE, "VALIDATIONDSL_NODE"), root_1);

                // src/serializers/ValidationDSL.g:45:154: ^( TOKEN VALIDATE )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOKEN, "TOKEN"), root_2);

                adaptor.addChild(root_2, stream_VALIDATE.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // src/serializers/ValidationDSL.g:45:172: ^( ID_ACCESS $id)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ID_ACCESS, "ID_ACCESS"), root_2);

                adaptor.addChild(root_2, stream_id.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // src/serializers/ValidationDSL.g:45:189: ^( GROUP1 ^( LIST_VALUE ( $ControlFlowLinkTemplate7)* ) )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GROUP1, "GROUP1"), root_2);

                // src/serializers/ValidationDSL.g:45:198: ^( LIST_VALUE ( $ControlFlowLinkTemplate7)* )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST_VALUE, "LIST_VALUE"), root_3);

                // src/serializers/ValidationDSL.g:45:211: ( $ControlFlowLinkTemplate7)*
                while ( stream_ControlFlowLinkTemplate7.hasNext() ) {
                    adaptor.addChild(root_3, stream_ControlFlowLinkTemplate7.nextTree());

                }
                stream_ControlFlowLinkTemplate7.reset();

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_1, root_2);
                }
                // src/serializers/ValidationDSL.g:45:242: ^( GROUP2 ^( LIST_VALUE ( $DataFlowLinkTemplate8)* ) )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(GROUP2, "GROUP2"), root_2);

                // src/serializers/ValidationDSL.g:45:251: ^( LIST_VALUE ( $DataFlowLinkTemplate8)* )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST_VALUE, "LIST_VALUE"), root_3);

                // src/serializers/ValidationDSL.g:45:264: ( $DataFlowLinkTemplate8)*
                while ( stream_DataFlowLinkTemplate8.hasNext() ) {
                    adaptor.addChild(root_3, stream_DataFlowLinkTemplate8.nextTree());

                }
                stream_DataFlowLinkTemplate8.reset();

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "main"

    public static class rControlFlowLinkTemplate_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rControlFlowLinkTemplate"
    // src/serializers/ValidationDSL.g:47:1: rControlFlowLinkTemplate : CFNEXT COLON left1= STRING SYMBOL22 right2= STRING -> ^( CONTROLFLOWLINKTEMPLATE_NODE ^( TOKEN CFNEXT ) ^( SYMBOL COLON ) $left1 ^( SYMBOL SYMBOL22 ) $right2) ;
    public final ValidationDSLParser.rControlFlowLinkTemplate_return rControlFlowLinkTemplate() throws RecognitionException {
        ValidationDSLParser.rControlFlowLinkTemplate_return retval = new ValidationDSLParser.rControlFlowLinkTemplate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token left1=null;
        Token right2=null;
        Token CFNEXT5=null;
        Token COLON6=null;
        Token SYMBOL227=null;

        CommonTree left1_tree=null;
        CommonTree right2_tree=null;
        CommonTree CFNEXT5_tree=null;
        CommonTree COLON6_tree=null;
        CommonTree SYMBOL227_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_CFNEXT=new RewriteRuleTokenStream(adaptor,"token CFNEXT");
        RewriteRuleTokenStream stream_SYMBOL22=new RewriteRuleTokenStream(adaptor,"token SYMBOL22");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // src/serializers/ValidationDSL.g:47:26: ( CFNEXT COLON left1= STRING SYMBOL22 right2= STRING -> ^( CONTROLFLOWLINKTEMPLATE_NODE ^( TOKEN CFNEXT ) ^( SYMBOL COLON ) $left1 ^( SYMBOL SYMBOL22 ) $right2) )
            // src/serializers/ValidationDSL.g:47:29: CFNEXT COLON left1= STRING SYMBOL22 right2= STRING
            {
            CFNEXT5=(Token)match(input,CFNEXT,FOLLOW_CFNEXT_in_rControlFlowLinkTemplate243);  
            stream_CFNEXT.add(CFNEXT5);

            COLON6=(Token)match(input,COLON,FOLLOW_COLON_in_rControlFlowLinkTemplate245);  
            stream_COLON.add(COLON6);

            left1=(Token)match(input,STRING,FOLLOW_STRING_in_rControlFlowLinkTemplate249);  
            stream_STRING.add(left1);

            SYMBOL227=(Token)match(input,SYMBOL22,FOLLOW_SYMBOL22_in_rControlFlowLinkTemplate251);  
            stream_SYMBOL22.add(SYMBOL227);

            right2=(Token)match(input,STRING,FOLLOW_STRING_in_rControlFlowLinkTemplate255);  
            stream_STRING.add(right2);



            // AST REWRITE
            // elements: CFNEXT, left1, COLON, SYMBOL22, right2
            // token labels: right2, left1
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_right2=new RewriteRuleTokenStream(adaptor,"token right2",right2);
            RewriteRuleTokenStream stream_left1=new RewriteRuleTokenStream(adaptor,"token left1",left1);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 47:78: -> ^( CONTROLFLOWLINKTEMPLATE_NODE ^( TOKEN CFNEXT ) ^( SYMBOL COLON ) $left1 ^( SYMBOL SYMBOL22 ) $right2)
            {
                // src/serializers/ValidationDSL.g:47:81: ^( CONTROLFLOWLINKTEMPLATE_NODE ^( TOKEN CFNEXT ) ^( SYMBOL COLON ) $left1 ^( SYMBOL SYMBOL22 ) $right2)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONTROLFLOWLINKTEMPLATE_NODE, "CONTROLFLOWLINKTEMPLATE_NODE"), root_1);

                // src/serializers/ValidationDSL.g:47:112: ^( TOKEN CFNEXT )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOKEN, "TOKEN"), root_2);

                adaptor.addChild(root_2, stream_CFNEXT.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // src/serializers/ValidationDSL.g:47:128: ^( SYMBOL COLON )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SYMBOL, "SYMBOL"), root_2);

                adaptor.addChild(root_2, stream_COLON.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_left1.nextNode());
                // src/serializers/ValidationDSL.g:47:151: ^( SYMBOL SYMBOL22 )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SYMBOL, "SYMBOL"), root_2);

                adaptor.addChild(root_2, stream_SYMBOL22.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_right2.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rControlFlowLinkTemplate"

    public static class rDataFlowLinkTemplate_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rDataFlowLinkTemplate"
    // src/serializers/ValidationDSL.g:49:1: rDataFlowLinkTemplate : DFNEXT COLON left4= STRING SYMBOL22 right5= STRING -> ^( DATAFLOWLINKTEMPLATE_NODE ^( TOKEN DFNEXT ) ^( SYMBOL COLON ) $left4 ^( SYMBOL SYMBOL22 ) $right5) ;
    public final ValidationDSLParser.rDataFlowLinkTemplate_return rDataFlowLinkTemplate() throws RecognitionException {
        ValidationDSLParser.rDataFlowLinkTemplate_return retval = new ValidationDSLParser.rDataFlowLinkTemplate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token left4=null;
        Token right5=null;
        Token DFNEXT8=null;
        Token COLON9=null;
        Token SYMBOL2210=null;

        CommonTree left4_tree=null;
        CommonTree right5_tree=null;
        CommonTree DFNEXT8_tree=null;
        CommonTree COLON9_tree=null;
        CommonTree SYMBOL2210_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_SYMBOL22=new RewriteRuleTokenStream(adaptor,"token SYMBOL22");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_DFNEXT=new RewriteRuleTokenStream(adaptor,"token DFNEXT");

        try {
            // src/serializers/ValidationDSL.g:49:23: ( DFNEXT COLON left4= STRING SYMBOL22 right5= STRING -> ^( DATAFLOWLINKTEMPLATE_NODE ^( TOKEN DFNEXT ) ^( SYMBOL COLON ) $left4 ^( SYMBOL SYMBOL22 ) $right5) )
            // src/serializers/ValidationDSL.g:49:26: DFNEXT COLON left4= STRING SYMBOL22 right5= STRING
            {
            DFNEXT8=(Token)match(input,DFNEXT,FOLLOW_DFNEXT_in_rDataFlowLinkTemplate294);  
            stream_DFNEXT.add(DFNEXT8);

            COLON9=(Token)match(input,COLON,FOLLOW_COLON_in_rDataFlowLinkTemplate296);  
            stream_COLON.add(COLON9);

            left4=(Token)match(input,STRING,FOLLOW_STRING_in_rDataFlowLinkTemplate300);  
            stream_STRING.add(left4);

            SYMBOL2210=(Token)match(input,SYMBOL22,FOLLOW_SYMBOL22_in_rDataFlowLinkTemplate302);  
            stream_SYMBOL22.add(SYMBOL2210);

            right5=(Token)match(input,STRING,FOLLOW_STRING_in_rDataFlowLinkTemplate306);  
            stream_STRING.add(right5);



            // AST REWRITE
            // elements: SYMBOL22, COLON, left4, right5, DFNEXT
            // token labels: right5, left4
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_right5=new RewriteRuleTokenStream(adaptor,"token right5",right5);
            RewriteRuleTokenStream stream_left4=new RewriteRuleTokenStream(adaptor,"token left4",left4);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 49:75: -> ^( DATAFLOWLINKTEMPLATE_NODE ^( TOKEN DFNEXT ) ^( SYMBOL COLON ) $left4 ^( SYMBOL SYMBOL22 ) $right5)
            {
                // src/serializers/ValidationDSL.g:49:78: ^( DATAFLOWLINKTEMPLATE_NODE ^( TOKEN DFNEXT ) ^( SYMBOL COLON ) $left4 ^( SYMBOL SYMBOL22 ) $right5)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DATAFLOWLINKTEMPLATE_NODE, "DATAFLOWLINKTEMPLATE_NODE"), root_1);

                // src/serializers/ValidationDSL.g:49:106: ^( TOKEN DFNEXT )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TOKEN, "TOKEN"), root_2);

                adaptor.addChild(root_2, stream_DFNEXT.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // src/serializers/ValidationDSL.g:49:122: ^( SYMBOL COLON )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SYMBOL, "SYMBOL"), root_2);

                adaptor.addChild(root_2, stream_COLON.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_left4.nextNode());
                // src/serializers/ValidationDSL.g:49:145: ^( SYMBOL SYMBOL22 )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SYMBOL, "SYMBOL"), root_2);

                adaptor.addChild(root_2, stream_SYMBOL22.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_right5.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rDataFlowLinkTemplate"

    public static class bool_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bool"
    // src/serializers/ValidationDSL.g:65:1: bool : ( TRUE | FALSE );
    public final ValidationDSLParser.bool_return bool() throws RecognitionException {
        ValidationDSLParser.bool_return retval = new ValidationDSLParser.bool_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set11=null;

        CommonTree set11_tree=null;

        try {
            // src/serializers/ValidationDSL.g:65:7: ( TRUE | FALSE )
            // src/serializers/ValidationDSL.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set11=(Token)input.LT(1);
            if ( (input.LA(1)>=TRUE && input.LA(1)<=FALSE) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set11));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bool"

    // Delegated rules


 

    public static final BitSet FOLLOW_declas_in_document138 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_EOF_in_document141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_main_in_declas157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALIDATE_in_main165 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_main169 = new BitSet(new long[]{0x00000000000000A2L});
    public static final BitSet FOLLOW_rControlFlowLinkTemplate_in_main175 = new BitSet(new long[]{0x00000000000000A2L});
    public static final BitSet FOLLOW_rDataFlowLinkTemplate_in_main184 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_CFNEXT_in_rControlFlowLinkTemplate243 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_COLON_in_rControlFlowLinkTemplate245 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_STRING_in_rControlFlowLinkTemplate249 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_SYMBOL22_in_rControlFlowLinkTemplate251 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_STRING_in_rControlFlowLinkTemplate255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DFNEXT_in_rDataFlowLinkTemplate294 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_COLON_in_rDataFlowLinkTemplate296 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_STRING_in_rDataFlowLinkTemplate300 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_SYMBOL22_in_rDataFlowLinkTemplate302 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_STRING_in_rDataFlowLinkTemplate306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_bool0 = new BitSet(new long[]{0x0000000000000002L});

}