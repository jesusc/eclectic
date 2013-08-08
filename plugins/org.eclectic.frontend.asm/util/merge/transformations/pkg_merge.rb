# Terminology: 
#   * Receiving: The package which is augmented by the merge
#   * Merged: The package used to augment the receiving package
#   * Resulting: The result of the merge
#
# TODO:
#  * Optimization techniques : use lazy hash to lookup values

import 'm2m://gen/copy_receiving', :as => 'copy_receiving'
import 'm2m://gen/copy_merged',    :as => 'copy_merged'

decorator Merged::EPackage do 
  def creation_condition
    ! Receiving::EPackage.all_objects.any? { |r| self.match?(r.name) }
  end
  
  # TODO: Match should have into account the containment structure of names
  def match?(name)
    self.name == name
  end 
end

decorator Merged::EClass do
  def creation_condition
    ! Receiving::EClass.all_objects.any? { |r| self.match?(r.name) }
  end
  
  # TODO: Match should have into account the containment structure of names
  def match?(name)
    self.name == name
  end 
end

decorator Merged do
  def self.matching_class(r)
    Merged::EClass.all_objects.find { |m| m.match?(r.name) }
  end  
end

# Look out! 
#   * The root packages should be named equal... which is a bit strange
#     Maybe the root package of each metamodel should be not copied, but only the contents...
phase 'merge' do
  refinement_rule 'EClass' do
    from Receiving::EClass
    to Resulting::EClass
	  filter { |c, r| Merged.matching_class(r) != nil }
    mapping do |s, t|
      merged = Merged.matching_class(t)
      
      #trace_query(merged.eSuperTypes).all(Resulting::EClass).each { |r| t.eSuperTypes << r }
      t.eSuperTypes = trace_query(merged.eSuperTypes).all(Resulting::EClass) 
    end  
  end

end


scheduling do
  execute 'copy_receiving'
  execute 'copy_merged'
  execute 'merge'
end