// ------------------------------------------------------------------------ 
// Interpreter for the parser: automatically generated 
// ------------------------------------------------------------------------ 
package serializers;
import org.antlr.runtime.tree.*;
import meteoric.at3rdx.kernel.*;
import meteoric.at3rdx.kernel.dataTypes.*;
import meteoric.at3rdx.kernel.constraints.*;
import meteoric.at3rdx.kernel.constraints.EVLConstraints.*;
import meteoric.at3rdx.kernel.constraints.JavaConstraints.*;
import meteoric.at3rdx.kernel.exceptions.*;
import meteoric.at3rdx.kernel.templates.*;
import meteoric.at3rdx.parse.*;
import org.antlr.runtime.*;
import java.util.*;
import java.io.*;
import meteoric.at3rdx.parse.exceptions.*;


public class ValidationDSLInterpreter extends Interpreter{
//---------------------------------Construction methods:
  @Override public Lexer createFileLexer(String file) throws IOException {
     return new ValidationDSLLexer(new ANTLRFileStream(file));
  }
  @Override public Lexer createStringLexer(String command) throws IOException {
     return new ValidationDSLLexer(new ANTLRInputStream(new ByteArrayInputStream(command.getBytes())));
  }
  @Override public MetaDepthParserBase createParser(CommonTokenStream tokens) {
    return new ValidationDSLParser(tokens);
  }
  @Override public ASTVisitor createASTVisitor() {
    return new  ASTVisitorValidationDSLInterpreter(this);
  }
  public ASTVisitorValidationDSLInterpreter getASTVisitor() {
    return (ASTVisitorValidationDSLInterpreter)this.astv;
  }
  @Override public boolean parseString(String command, QualifiedElement context ) throws Exception {		// Should try to make this a template method...
  return true;
  }
  @Override public  boolean parse(String textFile) throws Exception {
     Lexer lex = createFileLexer(textFile);
     CommonTokenStream tokens = new CommonTokenStream(lex);
     ValidationDSLParser parser = (ValidationDSLParser)createParser(tokens);
     ValidationDSLParser.document_return r = null;
     try {
	     r = parser.document();
     } catch (Exception e) {
       System.out.println("Error :"+e);
     }
     if (parser.getParseProblems().size()>0) throw new MDmetaDepthParseException(parser.getParseProblems());
     this.ct = (CommonTree)r.getTree();
     return true;
  }
  @Override public boolean interpret(QualifiedElement context) throws Exception {
    return true;
  }
  @Override public boolean interpret() throws Exception {
     if (this.ct == null) return false;
     this.numObjects = 0;
     for (int i=0; i < ct.getChildCount(); i++) {
        CommonTree model = (CommonTree)ct.getChild(i);
        System.out.println("node="+model.getText());
     if (model.getText().equals("VALIDATIONDSL_NODE")){
      Model m = this.getASTVisitor().visitModel(model, null, false);
      this.numObjects++;
      if (m==null)
          throw new MDinvalidElementCreation (model.getText(), null);	// Error: model could not be created
     }
     }
     return true;
  }
  public ValidationDSLInterpreter(){}
}
