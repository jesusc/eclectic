

transformation module Koan2Idc
  self : main = all
  
  interface rt(fam, idc)
    trace generic 
      var s : core_!Object 
      var t : core_!Object 
    end
    
    trace expr2variable
      var source       : core_!Object
      var instructions : [idc!Instruction]
      var result       : idc!Variable
    end    

    trace predicate2instructions
      var source       : core_!Object
      var instructions : [idc!Instruction]
    end     
  end
 
  navigation decorator_ext(fam)
    decorator fam!TransformationModule 
      def interfaces
        # self.definitions.select({ x | x.kind_of(fam!TraceInterface); })
        true
      end
    end
    
    decorator fam!TransformationDefinition      
      def model_parameters
        self.inModels.concat(self.outModels)
      end

      def rule_matchers
        self.rules.map({ r | r.matcher; })
      end
      
      def is_main
        has_main = self.container_().annotations.any({ a| 
          a.name.eq("main").and(a.parameters.first().keyword.eq(self.name)) 
        })
        has_main.or(self.name.eq("main"))
      end
    end   

    decorator fam!TransformationDefinitionParameter
      def imported_libraries    
        fam!Annotation.all_objects().
                   select({ p | p.name.eq("library").and(p.annotable.eq(self)); }).
                   map({ p | p.parameters.first().keyword; }).
                   map({ k | fam!NavigationDefinition.all_objects().find_one({ n | n.name.eq(k); }); }) 
      end

      def is_in
        self.container_().inModels.any({ m | m.eq(self); })
      end
    end

  end 

  scheduling all(fam) -> (idc)
    fam : library = decorator_ext
       
    { 
       idc <- top_level(fam)
       idc <- expressions(fam)
	   # idc <- track_files(fam)

	   idc <- script(fam)       
       idc <- qool(fam)
    }
  end

  low track_files(fam) -> (idc)
    self : implements = rt
    fam : library = decorator_ext 
    # I think this is not really needed
      
    pattern allTopLevel [c1 : fam!LocatedElement]
      forall  c1 is fam!KoanTransformation
      and emit[c1]
      forall  c1 is fam!allTransformationDefinitionParameter
      and emit[c1]      
    end 
    
    rule allTopLevel(src)
      x = [ rt::generic  | s = src ]
      x.s.print("x: ")
	end    
  end

  low qool(fam) -> (idc)
    self : implements = rt
    fam : library = decorator_ext 
    # I think this is not really needed
      
    pattern allQoolTransformation [c1 : fam!QoolTransformation]
      forall  c1 is fam!QoolTransformation
      and emit[c1]
    end 

    pattern allSegment [c1 : fam!Segment]
      forall  c1 is fam!Segment
      and emit[c1]
    end 

    pattern allForAllStatement [c1 : fam!ForAllStatement]
      forall  c1 is fam!ForAllStatement
      and emit[c1]
    end 

	pattern allEmitStatement [c1 : fam!EmitStatement]
      forall  c1 is fam!EmitStatement
      and emit[c1]
    end 

	pattern allModelElementQueue [c1 : fam!ModelElementQueue]
      forall  c1 is fam!ModelElementQueue
      and emit[c1]
    end 

	pattern allLocalQueue [c1 : fam!LocalQueue]
      forall  c1 is fam!LocalQueue
      and emit[c1]
    end 

	pattern allImportedModel [c1 : fam!ImportedModel]
      forall  c1 is fam!ImportedModel
      and emit[c1]
    end 

	pattern allInlineModel [c1 : fam!InlineModel]
      forall  c1 is fam!InlineModel
      and emit[c1]
    end 

	pattern allInlineClass [c1 : fam!InlineClass]
      forall  c1 is fam!InlineClass
      and emit[c1]
    end 

	pattern allInlineReference [c1 : fam!InlineReference]
      forall  c1 is fam!InlineReference
      and emit[c1]
    end 

	pattern allInlineAttribute [c1 : fam!InlineAttribute]
      forall  c1 is fam!InlineAttribute
      and emit[c1]
    end 

	pattern allMatchExpression [c1 : fam!MatchExpression]
      forall  c1 is fam!MatchExpression
      and emit[c1]
    end 
 
	pattern allKindOfPredicate [c1 : fam!KindOfPredicate]
      forall  c1 is fam!KindOfPredicate
      and emit[c1]
    end 
       
	pattern allPropertyEqualsPredicate [c1 : fam!PropertyEqualsPredicate]
      forall  c1 is fam!PropertyEqualsPredicate
      and emit[c1]
    end        

    rule allMatchExpression(src) 
       match = idc!QMatch.new
       putIn rt::generic [ s ~ src, t ~ match ]
       
       match.name = "match".next_id()
       match.queue      = [ rt::generic  | s = src.queue ].t 
       match.predicates = [ rt::generic | s = src.predicates ].map({ trace | trace.t; })
       instructions     = [ rt::predicate2instructions | source = src.predicates ].map({ trace | trace.instructions; }).flatten()

	   match.file   = src.file 
	   match.row    = src.row
       match.column = src.column      
      
 	   putIn rt::expr2variable [ source ~ src, 
                             result ~ match,
                             instructions ~ instructions.add(match) ]
    end

    rule allKindOfPredicate(src) 
       p = idc!KindOfPredicate.new
       putIn rt::generic [ s ~ src, t ~ p ]
       
       p.model = [ rt::generic  | s = src.class_.model ].t
       p.className = src.class_.className
       
       putIn rt::predicate2instructions [ source ~ src, instructions ~ [] ]
    end

    rule allPropertyEqualsPredicate(src) 
       p = idc!PropertyEqualsPredicate.new
       putIn rt::generic [ s ~ src, t ~ p ]

       instructions = [ rt::expr2variable | source = src.value ].instructions
       result       = [ rt::expr2variable | source = src.value ].result
       
       p.propertyName = src.propertyName
       p.value = result
 
       putIn rt::predicate2instructions [ source ~ src, instructions ~ instructions ]
    end

                
    rule allQoolTransformation(src) # Partially copied from script!!
      transformation = idc!QoolTransformation.new
      putIn rt::generic [ s ~ src, t ~ transformation ]

      transformation.name      = src.name      
      transformation.qualifier = "main" # script.qualifier()
      transformation.models   = [ rt::generic | s = src.model_parameters() ].map({ trace | trace.t; })
      
      # Is this always true?
      transformation.main      = true

	  transformation.file   = src.file 
	  transformation.row    = src.row
      transformation.column = src.column              
      
      transformation.segments = [ rt::generic | s = src.segments ].map({ trace | trace.t; })                  
      transformation.queues   = [ rt::generic | s = src.queues ].map({ trace | trace.t; })                  
      transformation.inlineModels = [ rt::generic | s = src.inlineModels ].map({ trace | trace.t; })
      transformation.additionalModels = [ rt::generic | s = src.importedModels ].map({ trace | trace.t; })
    end    
    
    rule allImportedModel(src) 
      md = idc!ModelDefinition.new
      md.name = if src.name.eq("_") then
        "__RuntimeModel__"
      else
        src.name
      end
      
      putIn rt::generic [ s ~ src, t ~ md ]
    end    

    rule allSegment(src) 
      segment = idc!Segment.new
      segment.name = src.name
      putIn rt::generic [ s ~ src, t ~ segment ]
      segment.instructions = [ rt::expr2variable | source = src.statements ].map({ trace | trace.instructions; }).flatten()
    end

	rule allModelElementQueue(src) 
      queue = idc!ModelElementQueue.new
      queue.name = src.name
      putIn rt::generic [ s ~ src, t ~ queue ]
      
      type = idc!TypeInfo.new
      type.model = [ rt::generic  | s = src.class_.model ].t
      type.classifierName = src.class_.className
      
      queue.type_ = type
    end

	rule allLocalQueue(src) 
      queue = idc!LocalQueue.new
      queue.name = src.name
      putIn rt::generic [ s ~ src, t ~ queue ]
    end
    
    rule allForAllStatement(src) 
      idc = idc!QForAll.new
      idc.name = src.name
      putIn rt::generic [ s ~ src, t ~ idc ]

	  putIn rt::expr2variable [ source ~ src, 
                           result ~ idc,
                           instructions ~ [idc] ]

      forall_instructions = [ rt::expr2variable | source = src.statements ].map({ trace | trace.instructions; }).flatten()
      
      if src.condition then
         if_branch = idc!IfBranch.new
         if_branch.name = "if_branch".next_id()

         condition_result       = [ rt::expr2variable | source = src.condition ].result
         condition_instructions = [ rt::expr2variable | source = src.condition ].instructions
         
         idc.instructions = condition_instructions.add(if_branch)  

         if_branch.booleanVariable = condition_result      
         if_block = idc!IfElseBlock.new	  
	     if_block.instructions = forall_instructions 
	     if_branch.ifBlock = if_block
      else
         idc.instructions = forall_instructions
      end     
        
      idc.queue = [ rt::generic | s = src.queue ].t

      idc.file   = src.file
      idc.row    = src.row
      idc.column = src.column                                           	
    end

    rule allEmitStatement(src) 
      idc = idc!QEmit.new
      putIn rt::generic [ s ~ src, t ~ idc ]
 
      value = [ rt::expr2variable | source = src.value ].result
      instr = [ rt::expr2variable | source = src.value ].instructions
      
      idc.value = value
      idc.queue = [ rt::generic | s = src.queue ].t

	  putIn rt::expr2variable [ source ~ src, 
                             result ~ idc,
                             instructions ~ instr.add(idc) ]

      idc.file   = src.file
      idc.row    = src.row
      idc.column = src.column                                           	
      
    end

    # Inline models
    rule allInlineModel(src)
       idc = idc!InlineModel.new
       idc.name = src.name

       putIn rt::generic [ s ~ src, t ~ idc ]
       idc.classifiers = [ rt::generic | s = src.classes ].map({ trace | trace.t; }) 
    end

    rule allInlineClass(src)
       idc = idc!KClass.new
       idc.name = src.name
       
       putIn rt::generic [ s ~ src, t ~ idc ]
             
       idc.features = [ rt::generic | s = src.features ].map({ trace | trace.t; }) 
    end  

	rule allInlineAttribute(self_)
      feature = idc!KAttribute.new
      feature.name = self_.name
      feature.isMultivalued = self_.multivalued
      feature.ktypeName = self_.type.className
      putIn rt::generic [ s ~ self_, t ~ feature ]
    end  

	rule allInlineReference(self_)
      feature = idc!KReference.new
      feature.isMultivalued = self_.multivalued
      feature.name = self_.name
      putIn rt::generic [ s ~ self_, t ~ feature ]
    end  

#	rule allInlineAttribute(self_)
#      feature = if self_.type.metaclass().name.eq("ListTypeExpression") then
#          idc!KAttribute.new
#      else
#        if self_.type.model then 
#          idc!KReference.new
#        else
#          idc!KAttribute.new
#        end
#      end
#      feature.name = self_.name
#      putIn rt::generic [ s ~ self_, t ~ feature ]
#    end  

   

  end

  low script(fam) -> (idc)
    self : implements = rt
    fam : library = decorator_ext 
    # I think this is not really needed
      
    pattern allScriptedTransformation [c1 : fam!ScriptedTransformation]
      forall  c1 is fam!ScriptedTransformation
      and emit[c1]
    end 

    rule allScriptedTransformation(src)
      transformation = idc!Transformation.new
      putIn rt::generic [ s ~ src, t ~ transformation ]

      transformation.name      = src.name      
      transformation.qualifier = "main" # script.qualifier()
      transformation.models   = [ rt::generic | s = src.model_parameters() ].map({ trace | trace.t; })
      
      # Is this always true?
      transformation.main      = true

	  transformation.file   = src.file 
	  transformation.row    = src.row
      transformation.column = src.column                          

	  # Create pre function      
      function = idc!NormalFunction.new
      function.name = "code";
      function.instructions = [ rt::expr2variable | source = src.statements ].map({ trace | trace.instructions; }).flatten()

	  function.file   = src.file 
	  function.row    = src.row
      function.column = src.column                          
	  
	  transformation.functions = function;
	  transformation.pre       = function;
	  
    end    
  end
  
  low top_level(fam) -> (idc)
    self : implements = rt
    fam : library = decorator_ext 
    # I think this is not really needed
      
    pattern allKoanTransformation [c1 : fam!KoanTransformation]
      forall  c1 is fam!KoanTransformation
      and emit[c1]
    end 

    pattern allTransformationDefinitionParameter [c1 : fam!TransformationDefinitionParameter]
      forall  c1 is fam!TransformationDefinitionParameter
      and emit[c1]
    end 
    
    pattern allForAllMatcher [c1 : fam!ForAllMatcher]
      forall  c1 is fam!ForAllMatcher
      and emit[c1]
    end 

    pattern allTraceInterface [c1 : fam!TraceInterface]
      forall  c1 is fam!TraceInterface
      and emit[c1]
    end 

    pattern allTraceDefinition [c1 : fam!TraceDefinition]
      forall  c1 is fam!TraceDefinition
      and emit[c1]
    end 

    pattern allTraceElement [c1 : fam!TraceElement]
      forall  c1 is fam!TraceElement
      and emit[c1]
    end 

    pattern allKoanRule [c1 : fam!KoanRule]
      forall  c1 is fam!KoanRule
      and emit[c1]
    end       

    pattern allTraceInterface [c1 : fam!TraceInterface]
      forall  c1 is fam!TraceInterface
      and emit[c1]
    end       

    pattern allTraceDefinition [c1 : fam!TraceDefinition]
      forall  c1 is fam!TraceDefinition
      and emit[c1]
    end       

    pattern allTraceElement [c1 : fam!TraceElement]
      forall  c1 is fam!TraceElement
      and emit[c1]
    end       

    rule allKoanTransformation(src)
      transformation = idc!Transformation.new
      putIn rt::generic [ s ~ src, t ~ transformation ]

      transformation.name      = src.name      
      transformation.main      = true
      transformation.qualifier = "main" # script.qualifier()
      transformation.models   = [ rt::generic | s = src.model_parameters() ].map({ trace | trace.t; })
      transformation.patterns = [ rt::generic | s = src.rule_matchers() ].map({ trace | trace.t; })
      transformation.mappings = [ rt::generic | s = src.rules ].map({ trace | trace.t; })
      # transformation.executionPlan = [ rt::transformation2plan | s = script ].t

      transformation.traceSpec = [ rt::generic | s = src.traceInterface ].t
        
      # transformation.main = script.is_main()
      
      # Is this always true?
      transformation.main      = true
      

	  #transformation.file   = src.file 
	  #transformation.row    = src.row
      #transformation.column = src.column                          
    end    

    rule allTransformationDefinitionParameter(src)
      idc = idc!ModelDefinition.new
      idc.name = src.name
      putIn rt::generic [ s ~ src, t ~ idc ]

      # TODO: Set the kind!!
      idc.kind = if src.is_in() then 
         # IDC::Core::ModelKind::IN
         "IN" 
      else 
         # IDC::Core::ModelKind::OUT
         "OUT"
      end   
      
      # copied & adapted from mappings.qool
      annotatedWith = src.container_().annotations.select({ a| a.annotatedElement.eq(src); })	
      annotations    = annotatedWith.select({ a | a.kind_of(fam!MetamodelModelAnnotation); })
	  if annotations.size().gt(0) then 
		d = idc!MetamodelDefinition.new
		d.path = annotations.first().metamodel
		idc.metamodel = d  
      end
		      
      #idc.metamodel = annotatedWith.select({ a | a.kind_of(fam!MetamodelModelAnnotation); }).map({ a|  
      #			d = idc!MetamodelDefinition.new
      #			d.path = a.metamodel
      #			d 
      #		}).first() 
      
      
      # idc.includedLibraries = [ rt::navigation2lib | s = ecl.imported_libraries() ].map({ trace | trace.t; })       
    end

    rule allForAllMatcher(src)
      pattern = idc!EmitPattern.new
      pattern.name = src.container_().name.next_id()
      
      putIn rt::generic [ s ~ src, t ~ pattern ]
      
      emit_result = idc!EmitResult.new
      emit_result.name = src.name           
      type = idc!TypeInfo.new
      type.model = [ rt::generic  | s = src.type.model ].t
      type.classifierName = src.type.className
      emit_result.type = type      
      pattern.formalParameters = emit_result

      putIn rt::expr2variable [ source ~ src, 
                             result ~ emit_result,
                             instructions ~ [] ]
      
      forall = idc!ForAllGather.new
      forall.name = src.name.next_id()
	  type_forall = idc!TypeInfo.new
      type_forall.model = [ rt::generic  | s = src.type.model ].t
      type_forall.classifierName = src.type.className
      forall.type = type_forall
            
      emit = idc!Emit.new  
	  emit.actualParameters = forall
      
      forall.instructions = emit

      pattern.instructions = forall      


	  forall.file   = src.file 
	  forall.row    = src.row
      forall.column = src.column                          

	  emit.file   = src.file 
	  emit.row    = src.row
      emit.column = src.column                          
    end

    rule allKoanRule(src)
      idc = idc!TransformationStep.new
      idc.name = src.name
      putIn rt::generic [ s ~ src, t ~ idc ]
       
      idc.pattern = [ rt::generic | s = src.matcher ].t
      idc.instructions = [ rt::expr2variable | source = src.statements ].map({ trace | trace.instructions; }).flatten()

	  idc.file   = src.file 
	  idc.row    = src.row
      idc.column = src.column                          
    end
    
    rule allTraceInterface(src)
       idc = idc!SingleTraceSpec.new
       idc.name = src.name

       putIn rt::generic [ s ~ src, t ~ idc ]
       idc.traceDefinitions = [ rt::generic | s = src.definitions ].map({ trace | trace.t; }) 
    end

    rule allTraceDefinition(src)
       idc = idc!TraceDefinition.new
       idc.name = src.name
       
       putIn rt::generic [ s ~ src, t ~ idc ]
             
       idc.features = [ rt::generic | s = src.elements ].map({ trace | trace.t; }) 
    end  

	rule allTraceElement(self_)
      feature = if self_.type.metaclass().name.eq("ListTypeExpression") then
          idc!AttributeTraceElement.new
      else
        if self_.type.model then 
          idc!ReferenceTraceElement.new
        else
          idc!AttributeTraceElement.new
        end
      end
      feature.name = self_.name
      putIn rt::generic [ s ~ self_, t ~ feature ]
    end  

    rule allTraceElement(src)
      feature = if src.type.metaclass().name.eq("ListTypeExpression") then
          idc!AttributeTraceElement.new
      else
        if src.type.model then 
          idc!ReferenceTraceElement.new
        else
          idc!AttributeTraceElement.new
        end
      end
      feature.name = src.name
      
      putIn rt::generic [ s ~ src, t ~ feature ]
    end    
  end
 
  low expressions(fam) -> (idc)
    self : implements = rt
    fam : library = decorator_ext 

    pattern allDefineVariable [c1 : fam!DefineVariable]
      forall  c1 is fam!DefineVariable
      and emit[c1]
    end       

    pattern allModelReference [c1 : fam!ModelReference]
      forall  c1 is fam!ModelReference
      and emit[c1]
    end       

    pattern allVariableReference [c1 : fam!VariableReference]
      forall  c1 is fam!VariableReference
      and emit[c1]
    end       

    pattern allNumLiteral [c1 : fam!NumLiteral]
      forall  c1 is fam!NumLiteral
      and emit[c1]
    end       

   pattern allDoubleLiteral [c1 : fam!DoubleLiteral]
      forall  c1 is fam!DoubleLiteral
      and emit[c1]
    end       

    pattern allStringLiteral [c1 : fam!StringLiteral]
      forall  c1 is fam!StringLiteral
      and emit[c1]
    end       

    pattern allMethodCall [c1 : fam!MethodCall]
      forall  c1 is fam!MethodCall
      and emit[c1]
    end      

    pattern allPutTrace [c1 : fam!PutTrace]
      forall  c1 is fam!PutTrace
      and emit[c1]
    end       

    pattern allMatchTrace [c1 : fam!MatchTrace]
      forall  c1 is fam!MatchTrace
      and emit[c1]
    end       

    pattern allPropertyWrite [c1 : fam!PropertyWrite]
      forall  c1 is fam!PropertyWrite
      and emit[c1]
    end       

    pattern allClosureDeclaration [c1 : fam!ClosureDeclaration]
      forall  c1 is fam!ClosureDeclaration
      and emit[c1]
    end       
        
    rule allDefineVariable(src)
      expr_trace = [ rt::expr2variable | source = src.expression ]
      putIn rt::expr2variable [ source ~ src, 
                             result ~ expr_trace.result,
                             instructions ~ expr_trace.instructions ]
      # why i don't need to create an assign?
    end
    
    
    rule allModelReference(self_)
      meta = idc!ReadMeta.new
      meta.name  = "read_meta".next_id()
      meta.className = self_.className
      meta.model = [ rt::generic  | s = self_.model ].t

      putIn rt::expr2variable [ source ~ self_, 
                             result ~ meta,
                             instructions ~ [meta] ]

	  # Keep track of row/cols for error reporting
	  meta.file   = self_.file      
	  meta.row    = self_.row
      meta.column = self_.column                          
    end

    rule allVariableReference(self_)
      assign = idc!Assign.new
      assign.name = "assign".next_id()

      expr_trace = [ rt::expr2variable | source = self_.variable ]
      assign.rightVariable = expr_trace.result

      putIn rt::expr2variable [ source ~ self_, 
                             result ~ assign,
                             instructions ~ [assign] ]

	  # Keep track of row/cols for error reporting      
	  assign.file   = self_.file
	  assign.row    = self_.row
      assign.column = self_.column                          
    end

    rule allNumLiteral(self_)
      literal = idc!Literal.new
      literal.name     = "integerLiteral".next_id()
      literal.intValue = self_.value
      literal.kind     = "INTEGER"

      putIn rt::expr2variable [ source ~ self_, 
                             result ~ literal,
                             instructions ~ [literal] ]

      # Keep track of row/cols for error reporting      
      literal.file   = self_.file
      literal.row    = self_.row
      literal.column = self_.column                             
    end

    rule allDoubleLiteral(self_)
      literal = idc!Literal.new
      literal.name     = "doubleLiteral".next_id()
      literal.doubleValue = self_.value
      literal.kind     = "DOUBLE"

      putIn rt::expr2variable [ source ~ self_, 
                             result ~ literal,
                             instructions ~ [literal] ]

      # Keep track of row/cols for error reporting      
      literal.file   = self_.file
      literal.row    = self_.row
      literal.column = self_.column                             
    end

    rule allStringLiteral(self_)
      literal = idc!Literal.new
      literal.name     = "stringLiteral".next_id()
      literal.stringValue = self_.value
      literal.kind     = "STRING"

      putIn rt::expr2variable [ source ~ self_, 
                             result ~ literal,
                             instructions ~ [literal] ]

      # Keep track of row/cols for error reporting      
      literal.file   = self_.file
      literal.row    = self_.row
      literal.column = self_.column                             
    end

    rule allMethodCall(self_)      
      expr_trace    = [ rt::expr2variable | source = self_.receptor ]
      params_trace  = [ rt::expr2variable | source = self_.parameters ] 
      params_instr  = params_trace.map({ t | t.instructions; }).flatten()
      params_result = params_trace.map({ t | t.result; })

      instr = if self_.methodName.eq("new").and( self_.receptor.kind_of(fam!ModelReference) ) then
        create = idc!Create.new 
        create.name      = self_.receptor.className.next_id()
        create.model     = [ rt::generic  | s = self_.receptor.model ].t
        create.className = self_.receptor.className
        # parameters ignored
        create
      else
        # if self_.withParameters then
        if self_.parameters.size().gt(0) then
          method_call = idc!MethodCall.new
	      method_call.name = "method_call".next_id()
	      method_call.methodName = self_.methodName
	      method_call.receptor   = expr_trace.result	    
	      method_call.actualParameters = params_result
	      method_call
        else
          get = idc!Get.new
          get.name = "get".next_id()
          get.featureName = self_.methodName
          get.receptor    = expr_trace.result
          get.kind        = "TRY_GET_FIRST"                             
          get          
        end        
      end 
            
      putIn rt::expr2variable [ source ~ self_, 
                             result ~ instr,
                             instructions ~ expr_trace.instructions.concat( params_instr.add(instr) ) ]        

	  # Keep track of row/cols for error reporting      
      instr.file   = self_.file
      instr.row    = self_.row
      instr.column = self_.column      
    end       

	rule allPropertyWrite(self_)
	   receptor_trace   = [ rt::expr2variable | source = self_.receptor ]
	   expression_trace = [ rt::expr2variable | source = self_.expression ]

       setInstr = idc!Set.new
       setInstr.featureName = self_.property
       setInstr.receptor    = receptor_trace.result
       setInstr.value       = expression_trace.result
       
       # instructions = receptor_trace.instructions.concat(expression_trace.instructions).add(setInstr)
       # This was an annoying bug. The receptor is not an expression, but a reference to a variable!
       instructions = expression_trace.instructions.add(setInstr)

       putIn rt::expr2variable [ source ~ self_, 
                             result ~ expression_trace.result,
                             instructions ~ instructions ]
                             
      setInstr.file   = self_.file
      setInstr.row    = self_.row
      setInstr.column = self_.column                                           	
	end

    rule allPutTrace(self_)
      provide = idc!Provide.new  
      provide.name  = "trace_".next_id()
      # provide.trace = [ rt::tracedef2tracedef | s = self_.trace ].t 
      provide.trace = [ rt::generic | s = self_.trace ].t
      
      params_trace        = [ rt::expr2variable | source = self_.parameters.map({ p | p.value; }) ]
      params_result       = params_trace.map({ t | t.result; })
      params_instructions = params_trace.map({ t | t.instructions; }).flatten()        

      provide.instructions = self_.parameters.mapWith(params_result, { p v |
        set1 = idc!Set.new 
        set1.featureName = p.traceVar.name
        set1.receptor    = provide
        set1.value       = v

	    set1.file   = self_.file
	    set1.row    = self_.row
        set1.column = self_.column                                           	

        set1
      })

      putIn rt::expr2variable [ source ~ self_, 
                             result ~ provide,
                             instructions ~ params_instructions.add(provide) ]              

      provide.file   = self_.file
      provide.row    = self_.row
      provide.column = self_.column                                           	

    end
    
    rule allMatchTrace(self_)
      right_cardinality = "ONE_DYNAMIC"	

      target      = idc!ResolveTrace.new
      matched     = idc!MatchedTrace.new
      source_elem = idc!SourceElement.new
      constraint  = idc!EqualValueConstraint.new
      
      target.requires       = matched
      target.sourceElements = source_elem
      target.constraint     = constraint            
      
      matched.name  = self_.trace.name.concat("_").next_id()
      matched.trace = [ rt::generic | s = self_.trace ].t
                   
      source_elem.boundVariable = [ rt::expr2variable | source = self_.traceExpr.expr ].result
      source_elem.cardinality   = right_cardinality
      
      constraint.valueElement = source_elem
      constraint.traceVariable = [ rt::generic | s = self_.traceExpr.traceVar ].t
      
      match_result_trace = idc!MatchResultTrace.new
      match_result_trace.name = "trace_result_".next_id()
      match_result_trace.exposedTrace = matched
      target.matchResults = match_result_trace
      
      trace_expr_instr = [ rt::expr2variable | source = self_.traceExpr.expr ].instructions      
      instructions = trace_expr_instr.concat([target])
      result       = match_result_trace    	

      putIn rt::expr2variable [ source ~ self_, 
                             result ~ result,
                             instructions ~ instructions.add(target) ]              

      target.file   = self_.file
      target.row    = self_.row
      target.column = self_.column                                           	

    end
  
    rule allClosureDeclaration(self_) 
      idc = idc!ClosureDef.new
      idc.name = "closure".next_id()
      # What to do with the parameters?? Another walk rule... not sure this makes sense... but...
      idc.formalParameters = self_.formalParameters.map({ fp|
      	idc      = idc!Parameter.new
      	idc.name = fp.name
	    putIn rt::expr2variable [ source ~ fp, result ~ idc, instructions ~ [] ]                    	
      	idc
      }) 

      idc.instructions = [ rt::expr2variable | source = self_.statements ].map({ trace | trace.instructions; }).flatten()

      putIn rt::expr2variable [ source ~ self_, result ~ idc, instructions ~ [idc] ]                    	

      idc.file   = self_.file
      idc.row    = self_.row
      idc.column = self_.column                                           	

    end    
      	
  end
 
end