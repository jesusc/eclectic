
decorator RefM::EClass do
  def qname
    (pkg_names(self.ePackage, []).map { |c| c.capitalize }.reverse[1..-1] + [self.name]).join('::')
  end
  
  def pkg_names(pkg, list)
    return list if pkg.nil?
    pkg_names(pkg.eSuperPackage, list + [pkg.name])
  end

  def all_features
    self.eStructuralFeatures + self.eSuperTypes.map { |t| 
      t.all_features
    }.flatten
  end
end

SOURCE = Parameters[:source]
TARGET = Parameters[:target]
IGNORE = Parameters[:ignore]
COMPOSE = Parameters[:compose]
FILENAME = Parameters[:filename] || 'copy.rb'

ALL_TOP = (Parameters[:all_top] == false) ? 'rule' : 'top_rule' 

main do
  compose_file FILENAME do

    RefM::EClass.all_objects.reject { |c| c.abstract }.
                             reject { |c| c.name == 'ECore::EObject' }.
                             reject { |c| IGNORE.include?(c.name) }.each do |c|
      println "#{ALL_TOP} '#{c.name}' do"
      inc_indent do
        println "from #{SOURCE}::#{c.qname}"
        println "to #{TARGET}::#{c.qname}"  
        println "filter { |c| c.metaclass == #{SOURCE}::#{c.qname} }"
        println "mapping do |s, t|" 
        inc_indent do
          c.all_features.reject { |f| f.derived == true }.
                         reject { |f| IGNORE.include?("#{c.name}.#{f.name}") }.
                         each do |f|
            if f.eType.class == Module && f.upperBound == -1 ## Is data type??
              println "s.#{f.name}.each { |v| t.#{f.name} << v.strip }"
            else
              println "t.#{f.name} = s.#{f.name}"
            end
          end 
        end
        println "end"   
      end
      println "end"
    end
  
    apply_template COMPOSE if COMPOSE
  end
end