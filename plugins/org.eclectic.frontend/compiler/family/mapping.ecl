
transformation module compileMappings
  self : main = mappings
 
  interface rt(in, out)
    trace Generic
      var s : core_!Object 
      var t : core_!Object 
    end

    trace ClassMapping 
      var s : in!Context 
      var pat  : out!Pattern
      var step : out!TransformationStep
    end

    trace Class2Var
      var source   : in!ClassDef 
      var variable : out!Variable
    end

    trace ClassDef2TraceFeature
      var class   : in!ClassDef 
      var feature : out!Feature
    end

    trace Context2TraceDef 
      var context   : in!Context
      var trace_def : out!TraceDefinition
    end

    trace Instructions
      var source : core_!Object 
      var instructions : [out!Instruction] 
    end

  end 
  
  navigation extension(map)
    decorator map!Context 
      def executable_mappings
        self.mappings.reject({ x | x.kind_of(map!C2CModifier); })
      end
    end

    decorator map!Context 
      def filters
        self.mappings.select({ x | x.kind_of(map!EqualityFilter); })
      end
      
      def derive_name
         self.left.inject("", { tmp  x | tmp.concat("_").concat(x.className); });
      end
    end
  end
    
  low mappings(map) -> (idc)
    map : library = extension
    self : implements = rt 

    pattern mappingTransformation [t : map!MappingTransformation]
      forall  t is map!MappingTransformation
      and emit[t]
    end 
    
    pattern oneToOneClassMapping [c : map!Context]
      forall  c is map!Context
      and emit[c]
    end 

    pattern contextToTraceDefinition [c : map!Context]
      forall  c is map!Context
      and emit[c]
    end 

    pattern attr2attr_1 [c : map!Attribute2Attribute]
      forall a is map!Attribute2Attribute
      	if a.cardinality.name.eq("OneToOne") then
      	  emit[a]
      	end 
      end 
    end 

    pattern ref2ref_1 [c : map!Reference2Reference]
      forall a is map!Reference2Reference
      	if a.cardinality.name.eq("OneToOne") then
      	  emit[a]
      	end 
      end 
    end     
    
    rule mappingTransformation(mapTransformation)
      t = idc!Transformation.new
      t.name = mapTransformation.name
      t.main = true # TODO: VER ESTO MEJOR

      
      leftModel  = idc!ModelDefinition.new
      rightModel = idc!ModelDefinition.new
      leftModel.name  = mapTransformation.left.name
      leftModel.kind  = "IN"
      rightModel.name = mapTransformation.right.name  
      rightModel.kind  = "OUT"
      
      putIn rt::Generic [ s ~ mapTransformation.left, t ~ leftModel ]
      putIn rt::Generic [ s ~ mapTransformation.right, t ~ rightModel ]
      
      t.models = [leftModel, rightModel]  
      
      t.patterns = [ rt::ClassMapping | s = mapTransformation.contexts ].map({ trace | trace.pat; }).flatten()
      t.mappings = [ rt::ClassMapping | s = mapTransformation.contexts ].map({ trace | trace.step; }).flatten()

      # trace spec
      trace_spec = idc!SingleTraceSpec.new
      trace_spec.name = mapTransformation.name
      t.traceSpec = trace_spec
      trace_spec.traceDefinitions = [ rt::Context2TraceDef | context = mapTransformation.contexts ].map({ trace | trace.trace_def; }).flatten()
    
    end 
          
	rule contextToTraceDefinition(context) 
      trace_def = idc!TraceDefinition.new 
      trace_def.name = context.derive_name()
      
      putIn rt::Context2TraceDef [ context ~ context, trace_def ~ trace_def ]
      
      trace_def.features = context.left.concat(context.right).map({ class_ref |
      	f = idc!ReferenceTraceElement.new
      	f.name = class_ref.className
      	putIn rt::ClassDef2TraceFeature [ class ~ class_ref, feature ~ f ]
      	f
      }); 
	
	end          
          
    rule oneToOneClassMapping(context)
      leftModel  = [ rt::Generic | s = context.container_().left ].t 
      rightModel = [ rt::Generic | s = context.container_().right ].t
       	
      p = idc!EmitPattern.new
      t = idc!TransformationStep.new      
      putIn rt::ClassMapping [ s ~ context, pat ~ p, step ~ t ] 

      # Build the pattern construct
   	  er = idc!EmitResult.new
   	  er.name = "left".next_id() 
      p.formalParameters = er
      
      putIn rt::Class2Var [ source ~ context.left.nth(0), variable ~ er ]
      
      forall   = idc!ForAllGather.new
      typeInfo = idc!TypeInfo.new 
      forall.type = typeInfo
      forall.name = "forAll".concat(context.left.nth(0).className)     
      typeInfo.classifierName = context.left.nth(0).className
      typeInfo.model = leftModel

	  # List -> Tree
      emit = idc!Emit.new
      emit.actualParameters = forall

	  content = context.filters().inject(emit, { tmp filter | 
	  	 # For the moment, equal an string, not calling a function
		 get_f = idc!Get.new
		 get_f.name = "get".next_id()
		 get_f.receptor = forall
		 get_f.featureName = filter.attribute.attributeName
		 
	     lit_f = idc!Literal.new 
         lit_f.name        = "stringLiteral".next_id()
         lit_f.stringValue = filter.filter
         lit_f.kind        = "STRING"
		 
		 comp = idc!MethodCall.new 
		 comp.methodName = "eq"
		 comp.actualParameters = lit_f
		 comp.receptor= get_f
		 
		 # Not sure it this is the best way to aggregate this
		 forall.instructions = [get_f, lit_f, comp]
		 
		 if_f = idc!IfBranch.new
		 if_f.booleanVariable = comp
		 if_block = idc!IfElseBlock.new
		 if_block.instructions = tmp
		 if_f.ifBlock = if_block	
		 
		 if_f	
	  })
	        
      forall.instructions = content
            
      p.instructions = forall
      # End-of pattern construct
      
      # Build the transformation step construct
      elements = context.right.map({ e | 
	      newElement = idc!Create.new
	      newElement.name = "create".next_id()
    	  newElement.className = e.className    	  
      	  newElement.model = rightModel
      	  
      	  putIn rt::Class2Var [ source ~ e, variable ~ newElement ]
      	  
      	  newElement
      });
      
	  # PROVIDE AQUI      
      provide = idc!Provide.new  
      provide.name  = "trace_".next_id()
      provide.trace = [ rt::Context2TraceDef | context = context ].trace_def 
      
      set1 = idc!Set.new 
      set1.featureName = context.left.first().className # Deberia tener un sitio donde guardar esta correspondencia
      set1.receptor    = provide
      set1.value       = er
      
      provide.instructions = set1
      provide.instructions = context.right.mapWith(elements, { classdef create_instr | 
      	set_p = idc!Set.new
      	set_p.featureName = classdef.className
      	set_p.receptor    = provide
      	set_p.value       = create_instr
      	set_p
      })      
      
      t.instructions = elements.add(provide)
      t.instructions = [ rt::Instructions | source = context.executable_mappings() ].map({ trace | trace.instructions; }).flatten()
      
      # End-of transformation step
	              
      t.pattern = p
      t.name    = context.derive_name()
      p.name    = context.left.inject("", { tmp  x | tmp.concat("_").concat(x.className); });
    end
    
	rule attr2attr_1(attr2attr)
		get = idc!Get.new
		get.name = "get".next_id()
		get.receptor = [ rt::Class2Var | source = attr2attr.left.nth(0).klass ].variable
		get.featureName = 	attr2attr.left.first().attributeName
	
		set = idc!Set.new
		set.featureName = attr2attr.right.first().attributeName
		set.receptor = [ rt::Class2Var | source = attr2attr.right.nth(0).klass ].variable
		set.value    = get 

	    putIn rt::Instructions [ source ~ attr2attr, instructions ~ [get, set] ]
	end 

	rule ref2ref_1(ref2ref)
		get = idc!Get.new
		get.name = "get".next_id()
		get.receptor = [ rt::Class2Var | source = ref2ref.left.nth(0).klass ].variable
		get.featureName = 	ref2ref.left.first().attributeName

        resolvingContext = map!Context.all_objects().find_one({ c | ref2ref.resolverName.eq( c.resolverName ); }) 


		# Resolve-trace
		right_cardinality = "ONE_DYNAMIC"
		
		target      = idc!ResolveTrace.new
		matched     = idc!MatchedTrace.new
		source_elem = idc!SourceElement.new
		constraint  = idc!EqualValueConstraint.new
		  
		target.requires       = matched
		target.sourceElements = source_elem
		target.constraint     = constraint            
		  
		matched.name  = "match_ref2ref".next_id()
		# matched.trace = [ rt::tracedef2tracedef | s = self.trace ].t
		matched.trace = [ rt::Context2TraceDef | context = resolvingContext ].trace_def
       		               
		source_elem.boundVariable = get
		source_elem.cardinality   = right_cardinality
		constraint.valueElement = source_elem
		constraint.traceVariable = [ rt::ClassDef2TraceFeature | class = resolvingContext.left.first() ].feature
		  
		match_result_trace = idc!MatchResultTrace.new
		match_result_trace.name = "trace_result_".next_id()
		match_result_trace.exposedTrace = matched
		target.matchResults = match_result_trace
		  
#		trace_expr_instr = instructions@self.traceExpr.expr      
#		instructions <- trace_expr_instr.concat([target])
#		result       <- match_result_trace
        # End-of resolve-trace

		set = idc!Set.new
		set.featureName = ref2ref.right.first().attributeName
		set.receptor = [ rt::Class2Var | source = ref2ref.right.nth(0).klass ].variable
		set.value    = get

	    putIn rt::Instructions [ source ~ ref2ref, instructions ~ [get, target, set] ]
	end        
	
  end

end 