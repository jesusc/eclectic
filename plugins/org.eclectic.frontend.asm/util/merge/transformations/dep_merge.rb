# Terminology: 
#   * Receiving: The package which is augmented by the merge
#   * Merged: The package used to augment the receiving package
#   * Resulting: The result of the merge
#
# TODO:
#  * Optimization techniques : use lazy hash to lookup values
FILENAME = File.join(File.dirname(__FILE__), 'gen', 'copy_source.rb') 
FILENAME.gsub!('/', '\\') if PLATFORM =~ /win/
import "#{FILENAME}", :as => 'copy_source'

decorator Source do
  def normal_classes 
    @normal_classes ||= Source::EClass.all_objects.reject { |o| o.is_dep? } 
  end
end

decorator Source::EClass do
  def is_dep?
    self.ePackage.is_dep?
  end
   
  def find_corresponding  
    classes = Source.normal_classes.select { |c| c.name == self.name }
    raise "No results for #{self.name}" if classes.size == 0
    raise "Too many results for #{self.name}: #{classes.size}" if classes.size > 1
    classes.first
  end
end

decorator Source::EPackage do
  def is_dep?
    self.name == 'dep'
  end
end

module ::ECore 
  def self.is_dep?
    self.name == 'dep'
  end  
end

phase 'merge' do
  MAIN = Resulting::EPackage.new(:name => Parameters[:main_pkg_name])
  MAIN.nsURI = Parameters[:main_pkg_uri]
  MAIN.nsPrefix = Parameters[:main_pkg_name] 
  
  if Parameters[:with_dummy]
    MAIN.eClassifiers << Resulting::EClass.new(:name => Parameters[:with_dummy])
  end  
  
  refinement_rule 'EPackage' do
    from Source::EPackage
    to Resulting::EPackage
    filter { |_, t| t.__container__ == nil }
    mapping do |s, t|
      MAIN.eSubpackages << t
    end  
  end
  
  refinement_rule 'EReference_eType' do
    from Source::EReference
    to Resulting::EReference
    mapping do |s, t|      
      if s.eType.name =~ /^ECore::/
        t.quick_set t.metaclass.property('eType'), s.eType
      else
        eclass = s.eType.is_dep? ? s.eType.find_corresponding : s.eType       
        t.eType = trace_query(eclass).one!(Resulting::EClass)
      end
    end  
  end

  
  refinement_rule 'EClass_eSuperTypes' do
    from Source::EClass
    to Resulting::EClass
    mapping do |s, t|
      s.eSuperTypes.each do |stype|
        eclass = stype.is_dep? ? stype.find_corresponding : stype
        t.eSuperTypes << trace_query(eclass).one!(Resulting::EClass)
      end
    end  
  end
  
end


scheduling do   
  execute 'copy_source'
  execute 'merge'
end