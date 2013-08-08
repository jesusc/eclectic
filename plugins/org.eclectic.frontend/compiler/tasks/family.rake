$LOAD_PATH << '../modelum.eclectic.compiler'
require 'tasklib/bootstrap'
#require File.join(File.dirname(__FILE__), 'compile_with_old_idc.rb')

#compile_with_old_idc :compile_org_eclectic_koan do |t|
#  t.version_definition '../family/koan2idc.ecl'
#  t.impl :continuations
#  t.idc_compiler ECL2IDC_V1 # This is the version with "low"
#  t.idc_result   ORG_KOAN_LANG_V0
#end

compile_version :compile_org_eclectic_koan do |t|
  t.version_definition '../family/koan2idc.ecl'
  t.impl :continuations
  t.idc_compiler ECL2IDC_V1 # This is the version with "low"
  t.idc_result   KOAN_LANG_V0
end