
NON_ABSTRACT_CLASSES = Source::EClass.all_objects.reject { |eclass| eclass.abstract }
IGNORE               = Parameters[:ignore].map { |cn| Source::EClass.all_objects.find_one{ |c| c.name == cn } }

decorator Source::EPackage do
  def qualified_pkg_name
    self.__container__ ? 
      self.__container__.qualified_pkg_name + "." + self.name :
      self.name
  end
end

decorator Source::EClass do

  def qool_var
    v = self.name.downcase
    return '^' + v if RESERVED.include?(v)
    return v
  end
  
  def qool_queue
    'm' + self.name
  end  

 def qool_var_foreach
    self.foreach_class_name.downcase
  end
  
  def qool_queue_foreach
    'm' + self.foreach_class_name
  end  
  
  def ext_class_name
    self.name + 'Ext'
  end
  
  def foreach_class_name
    self.name + "_ForEach"
  end
  
  def to_reference_name
    v = self.name[0..0].downcase + self.name[1..-1]
    return '^' + v if RESERVED.include?(v)
    return v
  end
  
  def qualified_pkg_name
    self.__container__.qualified_pkg_name + "." + self.name
  end  
  
  def containment_references
    self.eAllReferences.select { |r| r.containment }
  end
  
  def primitive_attributes
    self.eAllAttributes.select { |a| a.is_supported }
  end
  
  def reachable_classes_by_containment(visited)
    return visited if visited.include?(self)
    self.containment_references.inject(visited) { |tmp, r|
      r.eType.reachable_classes_by_containment(tmp)
    }.flatten + [self]
  end

  def reachable_classes_complete(visited)
    subclasses = NON_ABSTRACT_CLASSES.select { |eclass|
      ! eclass.abstract && eclass.eAllSuperTypes.include?(self)
    }
    
    return subclasses + visited if visited.include?(self)
    
    (subclasses.map { |s| s.containment_references }.flatten + self.containment_references).inject(visited + [self]) { |tmp, r|
      r.eType.reachable_classes_complete(tmp)
    }.flatten + [self] + subclasses
  end
  
  def reachable_expression_classes()
    # self.reachable_classes_complete([]).uniq
    Parameters[:expr_language].map { |cn| 
      Source::EClass.all_objects.find_one { |c| c.name == cn }
    }
  end
    
end

decorator Source::EStructuralFeature do
  def multivalued
    self.upperBound != nil && 
      (self.upperBound == -1 || self.upperBound > 1)
  end
  
  RESERVED = ['model', 'segment', 'queue']
  def xtext_name
    return '^' + self.name if RESERVED.include?(self.name)
    return self.name
  end
end

decorator Source::EReference do
  def cardinality
    self.upperBound == -1 ? '*' : '0..1'
  end
end

decorator Source::EAttribute do
  def is_supported
    self.eType.name =~ /String/ || 
    self.eType.name =~ /Boolean/
  end
  
  def exp_name
    "#{self.name}_exp"
  end
end

class PackageFinder
  def pkg_for(klass)
    qname = klass.ePackage.qualified_pkg_name
    idx   = Parameters[:pkgs].find_index(qname)
    raise ("Package '#{qname}' not found") unless idx
    Parameters[:names][idx]
  end
end

main do
  #involved_classes = Source::EClass.all_objects.select { |eclass|
  #  Parameters[:pkgs].include?(eclass.ePackage.qualified_pkg_name)
  #}
  # involved_classes = classes.inject([]) { |tmp, c| c.reachable_classes(tmp) }.reverse

  compose_file 'template.asm.emf' do
    involved_classes = []
    Parameters[:pkgs].each_with_index do |pkg, idx|
      # klass = Source::EClass.all_objects.find { |c| c.name == cn }
      #involved_classes = klass.reachable_classes(involved_classes).reverse
      involved_classes = NON_ABSTRACT_CLASSES.select { |eclass|
          eclass.ePackage.qualified_pkg_name == pkg
      }

      uri    = Parameters[:uris][idx]
      prefix = Parameters[:prefixes][idx]
      name   = Parameters[:names][idx]
      
      prefix_template = Parameters[:prefix_template][idx]
      
      println "@namespace(uri=\"#{uri}\", prefix=\"#{prefix}\")"
      println "package #{name} {"
      inc_indent do
        println prefix_template
      
        involved_classes = Source::EClass.all_objects.select { |eclass|
          eclass.ePackage.qualified_pkg_name == pkg
        }
        
        involved_classes.each { |c|
          apply_rule :gen_ext, c, :pkg_finder => PackageFinder.new
        }

        println "// ForEach classes"
        ext_involved_classes = Source::EClass.all_objects
        ext_involved_classes. # map { |c| c.containment_references }.flatten.map { |r| r.eType }.uniq.
                         select { |c| c.ePackage.qualified_pkg_name == pkg }.
                         each { |c|
              
          println "class #{c.foreach_class_name} extends core.ForEach {"
          inc_indent do
            println "val #{c.qualified_pkg_name}[*] #{c.to_reference_name.sub('^', '')};"
          end
          println "}"
        
        }
      end
      println "}"
    end
  end  


  compose_file 'compiler.qool' do 
    println 
    println "// Queues"

    Parameters[:pkgs].each do |pkg|
      # klass = Source::EClass.all_objects.find { |c| c.name == cn }
      #involved_classes = klass.reachable_classes(involved_classes).reverse
      involved_classes = NON_ABSTRACT_CLASSES.select { |eclass|
          eclass.ePackage.qualified_pkg_name == pkg
      }

      involved_classes.each { |c|
        println "model queue #{c.qool_queue} : mcc!#{c.name}!, mcc!#{c.ext_class_name}!"        
      }
      
      #involved_classes.map { |c| c.containment_references }.flatten.map { |r| r.eType }.uniq.
      #                 select { |c| c.ePackage.qualified_pkg_name == pkg && ! c.abstract }.each { |c|
      # Considering abstract classes as well
      involved_classes.map { |c| c.containment_references }.flatten.map { |r| r.eType }.uniq.
                         select { |c| c.ePackage.qualified_pkg_name == pkg }.
                         each { |c|
          
          println "model queue #{c.qool_queue_foreach} : mcc!#{c.foreach_class_name}"        
      }
      
    end  
    println 
    println 
    
    
    # Copy Expressions
    println
    println
    println 'segment copyExpressions'
    println %{
	create_expr = { |type, s|
		t = type.new_
		lnk = rt!expression.new
		lnk.s = s
		lnk.t = t
		emit lnk to ExpressionQ
		t
	}
    }
    
    expr_root_class = Source::EClass.all_objects.find_one { |eclass| eclass.name == Parameters[:expr_root] }
    expression_classes = expr_root_class.reachable_expression_classes # includes abstract classes
    
    # This could be done with an external mapping transformation, but it needs to
    # be parameterized
    expression_classes.reject { |c| c.abstract }.each do |c|
      inc_indent do
        println "forall #{c.qool_var} from #{c.qool_queue}"
        println " where #{c.qool_var}.in_template_expression"
        println "  tgt = create_expr.call(eclectic!#{c.name}, #{c.qool_var})"
        c.eAllAttributes.each { |a|
        println "  tgt.#{a.name} = #{c.qool_var}.#{a.name}"
        }
        c.eAllReferences.each { |r|
          if expression_classes.include?(r.eType)
            println "  #{c.qool_var}.#{r.xtext_name}.as_list.each { |p|" 
            println "    tgt.#{r.xtext_name} = ExpressionQ[#kindOf(rt!expression), #p(s, p)].t"
            println "  }"
          else
            println "  #{c.qool_var}.#{r.xtext_name}.as_list.each { |p|" 
            println "    tgt.#{r.xtext_name} = TraceQ[#kindOf(rt!generic), #p(s, p)].t"
            println "  }"
          end
        }        
        println "end"
        println
      end
      
	end
    
     
    println 'end'
    println
    println
    
    # Generate abstract syntax copier
    Parameters[:pkgs].each do |pkg|
      # klass = Source::EClass.all_objects.find { |c| c.name == cn }
      #involved_classes = klass.reachable_classes(involved_classes).reverse
      involved_classes = NON_ABSTRACT_CLASSES.select { |eclass|
          eclass.ePackage.qualified_pkg_name == pkg
      }
            
      println "segment transformation_of_#{pkg.sub('.', '_')}"
      inc_indent do
        println COMMON_CODE

        involved_classes.reject { |c| IGNORE.include?(c) }.each { |c|
          apply_rule :gen_qool_rule, c, :parent_var => '', :parent_type => 'nil'
        }


        println "// ForEach for #{pkg}"
        involved_classes.map { |c| c.containment_references }.flatten.map { |r| r.eType }.uniq.
        #                 select { |c| c.ePackage.qualified_pkg_name == pkg && ! c.abstract }.
                         select { |c| c.ePackage.qualified_pkg_name == pkg  }.
                         reject { |c| IGNORE.include?(c) }.
                         each { |c|
          # Considering abstract classes
            apply_rule :gen_qool_foreach_rule, c
        }

      end
      println "end"

    end
  end  
  
  
  compose_file 'template_syntax.xtext' do 
    Parameters[:pkgs].each_with_index do |pkg, idx|
      # klass = Source::EClass.all_objects.find { |c| c.name == cn }
      #involved_classes = klass.reachable_classes(involved_classes).reverse
      involved_classes = NON_ABSTRACT_CLASSES.select { |eclass|
          eclass.ePackage.qualified_pkg_name == pkg
      }

      xtext_name = Parameters[:xtext_names][idx]
      
      println "// ForEach for #{pkg}"
      involved_classes.map { |c| c.containment_references }.flatten.map { |r| r.eType }.uniq.
                       select { |c| c.ePackage.qualified_pkg_name == pkg }.each { |c|
        
          println "#{c.foreach_class_name} returns #{xtext_name}::#{c.foreach_class_name} :"
          inc_indent do
       	    println '"[" (name=ID ":")? expr=Expression "/" "]" "->" ' + c.to_reference_name + '+=' + c.name + "|"
       	    println '"[" "for" (name=ID ":")? expr=Expression "]" (' + c.to_reference_name + '+=' + c.name + ' )+ "[" "for" "/" "]"'
          end
          println ";"      
      }
    end
  end
  
end

=begin
main do
  classes = Source::EClass.all_objects.select { |eclass|
    Parameters[:root_classes].include?(eclass.name)
  }
  involved_classes = classes.inject([]) { |tmp, c| c.reachable_classes(tmp) }.reverse

  compose_file 'template.asm.emf' do
    involved_classes.each { |c|
      apply_rule :gen_ext, c
    }
  end  


  compose_file 'compiler.qool' do 
    println 
    println "// Queues"
    involved_classes.each { |c|
      println "model queue #{c.qool_queue} : mcc!#{c.name}"
      
    }
    
    println 
    println 
    
    involved_classes = []
    Parameters[:root_classes].each do |cn|
      klass = Source::EClass.all_objects.find { |c| c.name == cn }
      involved_classes = klass.reachable_classes(involved_classes).reverse
      
      
      println "segment transformation_of_#{cn}"
      inc_indent do
        involved_classes.each { |c|
          apply_rule :gen_qool_rule, c, :parent_var => ''
        }
      end
      println "end"

    end
  end  
  
end
=end

rule :gen_ext do
  param :pkg_finder

  from ECore::EClass do
    text do
      println
      println "class #{self.ext_class_name} extends #{self.qualified_pkg_name} {"
      inc_indent do
        self.containment_references.each do |r|
          apply_rule :gen_ext, r, :pkg_finder => self.pkg_finder
        end

        self.primitive_attributes.each do |r|
          apply_rule :gen_ext, r, :pkg_finder => self.pkg_finder
        end

      end
      println "}"
      println
    end 
  end
  

  from ECore::EReference do
    text do
      pkg_name = self.pkg_finder.pkg_for(self.eType)
      println "val #{pkg_name}.#{self.eType.foreach_class_name}[#{self.cardinality}] #{self.name}_foreach;"
      println
    end 
  end

  from ECore::EAttribute do
    text do
      println "val core.TemplateExpression[0..1] #{self.exp_name};"
      println
    end 
  end

end

#
# Begin-of Qool compilation
#
# 

rule :gen_qool_foreach_rule do

  from ECore::EClass do
    text do
      println
      println "forall #{self.qool_var_foreach} from #{self.qool_queue_foreach}"
      inc_indent do
          println "copied = ExpressionQ[#kindOf(rt!expression), #p(s, #{self.qool_var_foreach}.expr)].t"
          println "list_wrapper = eclectic!MethodCall.new"
          println "list_wrapper.receptor   = copied"
    	  println "list_wrapper.methodName = 'as_list'"
    	  println "list_wrapper.withParameters = 0.eq(1)"		
    	  println 
          println "map_closure = eclectic!ClosureDeclaration.new"
    	  println "parameter = eclectic!ClosureParameter.new"
    	  println "parameter.name = #{self.qool_var_foreach}.name.is_nil.if_else({ '__p__' }, { #{self.qool_var_foreach}.name })"
    	  println "map_closure.formalParameters = parameter"
    	  println "emit_to_traceq.call(#{self.qool_var_foreach}, parameter) // make the closure parameter available"
  
          println "#{self.qool_var_foreach}.#{self.to_reference_name}.each { |m|"
          println "  map_closure.statements = StatementsQ[#kindOf(rt!statements), #p(s, m)].statements"
          println "}"
                   	
    	  # Assume all foreach are [*]
   # 	  println "#{self.qool_var_foreach}.#{to_reference_name}.each { |m|"
   # 	  inc_indent do
   #         println "map_closure.statements = StatementsQ[#kindOf(rt!statements), #p(s, m)].statements" 	
   #         println "parent_context   = #{self.qool_var_foreach}._refContainer" 
   # 		println "context_def_var = TraceQ[#kindOf(rt!generic), #p(s, parent_context)].t"
   #         println "complete_property_write.call(m, context_def_var, 'TODO-COMPLETE')"
   # 	  end
   # 	  println "}"
          println
          println "wrap_call = {"
    	  println "     map_call = eclectic!MethodCall.new"
    	  println "		map_call.receptor   = list_wrapper"
    	  println "		map_call.methodName = 'map'"
    	  println "		map_call.withParameters = 1.eq(1)"		
    	  println "		map_call.parameters = map_closure"
    	  println "     map_call"
    	  println "}"
    	  println "wrapped_map_call = wrap_call.call"
    	  println "lnk = rt!statements.new"
    	  println "lnk.s = #{self.qool_var_foreach}"
    	  println "lnk.statements = wrapped_map_call"
    	  println "emit lnk to StatementsQ"
      end
      println "end"
      println
	end
  end
end

rule :gen_qool_rule do
  param :parent_var
  param :parent_type

  from ECore::EClass do
    text do
      println
      println "forall #{self.qool_var} from #{self.qool_queue}"
      println " where #{self.qool_var}.not_in_template_expression"
      inc_indent do
        println "tgt_defvar = meta_create.call('#{self.name}')"
   		println "lnk = rt!statements.new"
		println "lnk.s = #{self.qool_var}"
		println "emit_to_varsq.call(#{self.qool_var}, tgt_defvar)"
		println "lnk.statements = tgt_defvar"
		
		println "lnk.statements = create_and_emit_to_propertyq.call(#{self.qool_var}, tgt_defvar)"
	
	    if self.eAllReferences.size > 0 
	      println "set_references = {"
	      self.eAllReferences
	      inc_indent do
	        #self.eAllReferences.each_with_index do |r, idx|
        	# apply_rule :gen_qool_rule, r, :parent_var => self.qool_var
        	#end
    	    
	        # Group
	        i = 0
	        ref_groups = self.eAllReferences.inject([]) { |tmp, r|
	           tmp[tmp.flatten.size / 3] ||= []
	           tmp[tmp.flatten.size / 3] << r
               tmp
	        }	        
	        
	        ref_groups.each_with_index do |references, idx|
        	    println "set_#{idx} = {"  
        	    references.each do |r|
        	       apply_rule :gen_qool_rule, r, :parent_var => self.qool_var, :parent_type => self
        	    end        	    
        	    println "}"
        	    println "set_#{idx}.call"  
    	    end
	      end
	      println "}"
          println "set_references.call"
        end

	    if self.eAllAttributes.size > 0 && self.eAllAttributes.any? { |a| a.is_supported }
	      println "set_attributes = {"
  	      inc_indent do
    	    self.eAllAttributes.each do |r|
    	       apply_rule :gen_qool_rule, r, :parent_var => self.qool_var, :parent_type => self
    	    end
          end
          println "}"
          println "set_attributes.call"
        end

        if self.containment_references.size > 0
	      println "set_for_each_references = {"
  	      inc_indent do
            println "#{self.qool_var}.kind_of(mcc!#{self.ext_class_name}).if_true({"
    	    self.containment_references.each do |r|
              println "#{self.qool_var}.#{r.xtext_name}_foreach.as_list.each { |foreach_object|"
              inc_indent do
                println "foreach_object.#{r.eType.to_reference_name}.each { |_x_|"
                println "  complete_property_write.call(_x_, tgt_defvar, '#{r.name}')"
                println "}"
                println "stms = StatementsQ[#kindOf(rt!statements), #p(s, foreach_object)].statements"
	            println "stms.each { |stm| lnk.statements = stm }"
                println ""
=begin                
                foreach_object.statement.each { |_x_|
              _x_.println("^segment => ")
              complete_property_write.call(_x_, tgt_defvar, 'statements')
			}
               stms = StatementsQ[#kindOf(rt!statements), #p(s, foreach_object)].statements
               stms.each { |stm| 
               	              stm.println("^segment (stm) => ")
               	
               	lnk.statements = stm
               }
=end
              end
              println "}"             
    	    end
    	    println "})"
          end
          println "}"
          println "set_for_each_references.call"
        end

        println "emit lnk to StatementsQ"
      end
      println "end"
    end
  end

  from ECore::EAttribute do
    text do
      # raise "Unsupported attribute type #{self.eType.name}" unless self.is_supported
      if self.is_supported
      attr_access = "#{self.parent_var}.#{self.xtext_name}"
      exp_access  = "#{self.parent_var}.#{self.exp_name}"
      
      println "#{attr_access}.is_nil.if_else({"
      #println "   #{self.parent_var}.kind_of(mcc!#{self.__container__.ext_class_name}).if_true {" 

      println "   #{self.parent_var}.kind_of(mcc!#{self.parent_type.ext_class_name}).if_true {" 
	  println "   set_conditional_expr.call(tgt_defvar, lnk, #{exp_access}, '#{self.name}')"
	  println "   }"
	  #println "		expr = ExpressionQ[#kindOf(rt!expression), #p(s, #{exp_access}.expr)].t"
	  #println "		lnk.statements = meta_set.call(tgt_defvar, '#{self.xtext_name}', expr)"	
	  println "}, {"
	  println "     lnk.statements = meta_set.call(tgt_defvar, '#{self.name}', #{attr_access})"
	  println "})"
	  println
      end
    end
  end  
  
  from ECore::EReference do
    text do
      attr_access = "#{self.parent_var}.#{self.xtext_name}"
      
      if self.containment
        println "#{attr_access}.as_list.map { |v|"
        inc_indent do
          println "complete_property_write.call(v, tgt_defvar, '#{self.name}')"
          println "stms = StatementsQ[#kindOf(rt!statements), #p(s, v)].statements"
          println "stms.each { |stm| lnk.statements = stm }"
        end
        println "}"  
        println
      else
        println "lnk.statements = meta_set.call(tgt_defvar, '#{self.name}'," 
        println "    VarsQ[#kindOf(rt!generic), #p(s, #{attr_access})].t)"
        # println "complete_property_write.call(#{attr_access}, tgt_defvar, '#{self.name}')"
        println
      end
    end
  end

end


COMMON_CODE =%{
	meta_create   = { Globals[ #kindOf(rt!generic), #p(s, "META_CREATE") ].t }.call
	meta_set      = { Globals[ #kindOf(rt!generic), #p(s, "META_SET") ].t }.call
	emit_to_traceq= { Globals[ #kindOf(rt!generic), #p(s, "EMIT_TO_TRACEQ") ].t }.call
	emit_to_varsq = { Globals[ #kindOf(rt!generic), #p(s, "EMIT_TO_VARSQ") ].t }.call
	create_and_emit_to_propertyq = Globals[ #kindOf(rt!generic), #p(s, "CREATE_AND_EMIT_TO_PROPERTYQ") ].t
	complete_property_write = Globals[ #kindOf(rt!generic), #p(s, "COMPLETE_PROPERTY_WRITE") ].t

	set_conditional_expr = { |tgt_def_var, lnk, template_expr,property_name|
		template_expr.is_nil.if_false {
         		expr = ExpressionQ[#kindOf(rt!expression), #p(s, template_expr.expr)].t
         		lnk.statements = meta_set.call(tgt_def_var, property_name, expr)
		}
	}

}