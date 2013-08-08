// ------------------------------------------------------------------------ 
// Visitor for the parser: automatically generated 
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
public class ASTVisitorValidationDSLInterpreter extends meteoric.at3rdx.syntax.runtime.GeneratedSyntaxASTVisitor {
  public Model visitModel(CommonTree m, Model mod, boolean isTemplate) throws Exception {
    VirtualMachine vm = VirtualMachine.instance();
    if (vm.debug()) System.out.println("Creating "+"ValidationDSL"+m.getText());
    Model context = null;
    Model  metaModel = VirtualMachine.instance().getModel("ValidationDSL");
    if (metaModel != null) {
       ModelFactory mf = metaModel.getFactory();
       if (mf==null) throw new MDinvalidElementCreation (m.getText(), metaModel);	// Error: model could not be created
CommonTree tmpCST0 = (CommonTree) m.getChild(1);
       context = mf.createModel(((CommonTree) tmpCST0.getChild(0) ).getText());
CommonTree m_2 = (CommonTree) m.getChild(2);
CommonTree m_2_0 = (CommonTree) m_2.getChild(0);
for(int idx0 = 0; idx0 < m_2_0.getChildCount(); idx0++) {
setReferenceValue(context, "_", this.visitCONTROLFLOWLINKTEMPLATE_NODE(context, (CommonTree) m_2_0.getChild(idx0)));
}
CommonTree m_3 = (CommonTree) m.getChild(3);
CommonTree m_3_0 = (CommonTree) m_3.getChild(0);
for(int idx1 = 0; idx1 < m_3_0.getChildCount(); idx1++) {
setReferenceValue(context, "_", this.visitDATAFLOWLINKTEMPLATE_NODE(context, (CommonTree) m_3_0.getChild(idx1)));
}
    }
    else throw new MDParseUnknownMetaModel("ValidationDSL");
	   resolveReferences(context);    return context;
  }
  public QualifiedElement visitCONTROLFLOWLINKTEMPLATE_NODE(Model context, CommonTree m) throws Exception {
String type = "ControlFlowLink";
String name = null;
    ModelFactory mf = ((Model)(context.getType())).getFactory();
    QualifiedElement nn = mf.createQE(type, name, context);
        this.intrp.getSymbolTable().addElement(nn);
CommonTree m_2 = (CommonTree) m.getChild(2);
Collection<Field> fields_nn_left0 = nn.references("left");
if ( ! fields_nn_left0.isEmpty() ) {
  for (Field field : fields_nn_left0) {
    setFieldValue(nn, field.name(), m_2);
  }
} else {
  setFieldValue(nn, "left", m_2);
}
CommonTree m_4 = (CommonTree) m.getChild(4);
Collection<Field> fields_nn_right1 = nn.references("right");
if ( ! fields_nn_right1.isEmpty() ) {
  for (Field field : fields_nn_right1) {
    setFieldValue(nn, field.name(), m_4);
  }
} else {
  setFieldValue(nn, "right", m_4);
}
    return nn;
  }
  public QualifiedElement visitDATAFLOWLINKTEMPLATE_NODE(Model context, CommonTree m) throws Exception {
String type = "DataFlowLink";
String name = null;
    ModelFactory mf = ((Model)(context.getType())).getFactory();
    QualifiedElement nn = mf.createQE(type, name, context);
        this.intrp.getSymbolTable().addElement(nn);
CommonTree m_2 = (CommonTree) m.getChild(2);
Collection<Field> fields_nn_left2 = nn.references("left");
if ( ! fields_nn_left2.isEmpty() ) {
  for (Field field : fields_nn_left2) {
    setFieldValue(nn, field.name(), m_2);
  }
} else {
  setFieldValue(nn, "left", m_2);
}
CommonTree m_4 = (CommonTree) m.getChild(4);
Collection<Field> fields_nn_right3 = nn.references("right");
if ( ! fields_nn_right3.isEmpty() ) {
  for (Field field : fields_nn_right3) {
    setFieldValue(nn, field.name(), m_4);
  }
} else {
  setFieldValue(nn, "right", m_4);
}
    return nn;
  }
  public ASTVisitorValidationDSLInterpreter(Interpreter i){
     super(i);
  }
}
