
ORG_ECLECTIC_IDC_METAMODEL = File.join(File.dirname(__FILE__), '..', '..', '..', 'org.eclectic.idc', 'model', 'idc', 'idc.ecore') 

ORG_FRONTEND_PROJECT    = File.join(File.dirname(__FILE__), '..', "..", 'org.eclectic.frontend')
ORG_KOAN_LANG_V0        = File.join(FRONTEND_PROJECT, "src", "org", "eclectic", "frontend", "koanidc", "koan_v0.idc.xmi")
ORG_MAPPINGS_LANG_V0    = File.join(FRONTEND_PROJECT, '..', "compiler", "_tmp", "mappings_v0.idc.xmi")
ORG_ATTRIBUTION_LANG_V0 = File.join(FRONTEND_PROJECT, '..', "compiler", "_tmp", "attribution_v0.idc.xmi")


def compile_with_old_idc(name, &block)
  CompileWithOldScala.new(name, :caller => caller, &block)
end

class CompileWithOldScala < RubyTL::BaseTaskLayer
  task_file :version_definition, :base_dir => :pwd
  task_file :idc_compiler#, :base_dir => :pwd
  task_file :idc_result
  task_attr :impl
  
  def asm_model; File.join PROJECT_DIR, 'bootstrap/', '_tmp/', derive_asm(@version_definition); end

  def derive_asm(name)
    File.basename(name).sub(/.\w+$/, '') + '.ecl.xmi'
  end


  def execute
    version_definition_ = @version_definition
    idc_compiler_       = @idc_compiler
    asm_model_          = asm_model()
    idc_model_          = @idc_result

    eclectic_parser injector = @name + "injector" do  
      input_file   version_definition_
      output_model asm_model_
    end

    exec_idc_with_scala execution = @name + "execution" do |t|
        t.models :package => 'in', 
            :metamodel => ECLECTIC_METAMODEL, 
            :model => asm_model_

        t.models :package => 'out', 
            :metamodel => ORG_ECLECTIC_IDC_METAMODEL, 
            :model => idc_model_
  
        t.impl @impl
                    
        t.idc_model idc_compiler_
    end  

    task @name => [injector, execution] 
  end  
end
