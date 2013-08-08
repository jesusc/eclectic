script umlcopy(in) -> (out)
  
//tclass = out!Class.new
//x = 1
//y = 3


in!Class.all_instances.map { |o|	
	tclass = out!Class.new
	tclass.name = o.name

	tclass.features = o.features.map({ |f|
		outFeature = out!Attribute.new
		outFeature.name = f.name 
		outFeature
	})
	
	tclass	
}
 
