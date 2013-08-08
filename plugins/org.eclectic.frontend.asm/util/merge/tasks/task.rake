select_rmof_handler :new_handler

model_to_model :pkg_merge do |t|

  t.sources :package   => 'Receiving',
            :metamodel => 'http://www.eclipse.org/emf/2002/Ecore',
            :model     => 'models/test1.ecore'  

  t.sources :package   => 'Merged',
            :metamodel => 'http://www.eclipse.org/emf/2002/Ecore',
            :model     => 'models/test2.ecore'  

  t.targets :package   => 'Resulting',
            :metamodel => 'http://www.eclipse.org/emf/2002/Ecore',
            :model     => 'models/result.xmi'  

  t.transformation 'transformations/pkg_merge.rb'
end          


model_to_code :copy_receiving do |t|
  t.sources :package   => 'RefM',
            :metamodel => 'http://www.eclipse.org/emf/2002/Ecore',
            :model => 'metamodels/Ecore.ecore'

  t.codebase = 'transformations/gen'
  t.generate  'transformations/copy/gencopy.tpl.rb'
  t.parameters :filename => 'copy_receiving.rb',
               :source => 'Receiving',
               :target => 'Resulting',
               :ignore => []
end

model_to_code :copy_merge do |t|
  t.sources :package   => 'RefM',
            :metamodel => 'http://www.eclipse.org/emf/2002/Ecore',
            :model => 'metamodels/Ecore.ecore'

  t.codebase = 'transformations/gen'
  t.generate  'transformations/copy/gencopy.tpl.rb'
  t.parameters :filename => 'copy_merged.rb',
               :source => 'Merged',
               :target => 'Resulting',
               :ignore => ['EClass', 'EPackage'],
               :compose => 'transformations/copy/compose.erb'
end

model_to_code :copy_dep do |t|
  t.sources :package   => 'RefM',
            :metamodel => 'http://www.eclipse.org/emf/2002/Ecore',
            :model => 'metamodels/Ecore.ecore'

  t.codebase = 'transformations/gen'
  t.generate  'transformations/copy/gencopy.tpl.rb'
  t.parameters :filename => 'copy_source.rb',
               :all_top => false,
               :source => 'Source',
               :target => 'Resulting',
               :ignore => ['EPackage', 'EReference.eType', 'EClass.eSuperTypes'],
               :compose => 'transformations/copy/package_dep.erb'
end


task :copy => ['copy_receiving', 'copy_merge']