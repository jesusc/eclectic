#select_rmof_handler :new_handler

# merger = ENV['HOME'] + '/usr/formol/workspace/formol.util.merge/transformations/dep_merge.rb'
merger      = 'util/merge/transformations/dep_merge.rb'
templatizer = 'util/templatization/templatizer.tpl.rb'

FRONTEND_ASM_PROJECT = '../org.eclectic.frontend.asm/'
model_to_model :merge_frontend_metamodel do |t|  
  t.sources :package   => 'Source',
            :metamodel => 'http://www.eclipse.org/emf/2002/Ecore',
            :model     => [FRONTEND_ASM_PROJECT + 'model/frontend.core.ecore',
                           FRONTEND_ASM_PROJECT + 'model/frontend.attribution.ecore',
                           FRONTEND_ASM_PROJECT + 'model/frontend.mappings.ecore',
                           FRONTEND_ASM_PROJECT + 'model/frontend.pat.ecore',
                           FRONTEND_ASM_PROJECT + 'model/frontend.tao.ecore',                      
                           FRONTEND_ASM_PROJECT + 'model/frontend.chain.ecore',                      
                           
                           FRONTEND_ASM_PROJECT + 'model/frontend.imperative.ecore',                      

                           FRONTEND_ASM_PROJECT + 'model/frontend.koan.ecore',
                           FRONTEND_ASM_PROJECT + 'model/frontend.qool.ecore',
                           FRONTEND_ASM_PROJECT + 'model/frontend.script.ecore']

  t.targets :package   => 'Resulting',
            :metamodel => 'http://www.eclipse.org/emf/2002/Ecore',
            :model     => FRONTEND_ASM_PROJECT + 'model/eclectic.frontend.ecore'

  t.parameters :main_pkg_name => 'frontend',
               :main_pkg_uri  => 'http://eclectic.org/frontend',
               :with_dummy    => 'DummyRootMetaclass'

  t.transformation merger #3'../formol.util.merge/transformations/dep_merge.rb'
end

model_to_code :templatize do |t|  
  t.sources :package   => 'Source',
            :metamodel => 'http://www.eclipse.org/emf/2002/Ecore',
            #:metamodel => 'util/merge/metamodels/Ecore.ecore',
            :model     => [FRONTEND_ASM_PROJECT + 'model/eclectic.frontend.ecore']

  # t.parameters :root_classes => ['ImperativeTransformation']
  t.parameters :pkgs => ['frontend.core', 'frontend.imperative', 'frontend.tao', 'frontend.qool']
  
  t.parameters :names => ['expressions', 'navigation', 'tao', 'qool']
  t.parameters :uris =>  ['http://mydstl/metacompiler/asm/expression', 'http://mydstl/metacompiler/asm/navigation',
                          'http://mydstl/metacompiler/asm/tao', 'http://mydstl/metacompiler/asm/qool']
  t.parameters :prefixes => ['metacompiler_asm_expressions', 'metacompiler_asm_navigation',
                             'metacompiler_asm_tao', 'metacompiler_asm_qool']

  t.parameters :ignore => ['TransformationDefinitionParameter', 'ImperativeTransformation', 
    'ImportedModel', 'EclecticTransformationDefinition', 'TaoTransformation', 'QoolTransformation',
    'ImplicitlyAnnotableElement']


  t.parameters :xtext_names => ['expressions_mc', 'imperative_mc', 'tao_mc', 'qool_mc']

  t.parameters :expr_root => 'Expression'
  t.parameters :expr_language => [ 'Expression',
    'ClosureDeclaration', 
    'StringLiteral', 'DoubleLiteral', 'NumLiteral',
    'MethodCall', 'VariableReference', 'ModelReference']
  
  
  t.parameters :prefix_template => [
    %{

    },
    %{
   class NavigationTransformationCompiler extends core.TransformationCompiler {
      val ImperativeTransformationExt[1] transformation;
   }    
    },
%{
   class TaoTransformationCompiler extends core.TransformationCompiler {
      val TaoTransformationExt[1] transformation;
   }    
    },
%{
   class QoolTransformationCompiler extends core.TransformationCompiler {
      val QoolTransformationExt[1] transformation;
   }    
    }    
  ]
  
 
  
  t.codebase = '/tmp/' 
  t.generate  templatizer
end

