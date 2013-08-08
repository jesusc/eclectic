script umlcopy(in) -> (out)
  
//tclass = out!Class.new
//x = 1
//y = 3


// out!Class.all_objects map: 1

//tclass.name = "prueba"
// c = { |o| x = 1 }
//c = { |o| o.name }
tclass1  = out!Class.new
tclass2  = out!Class.new
tclass3  = out!Class.new

c = { |o| 
	// o.name
//	tclass.name = "prueba"
	tclass1.name = "tclass1"
	o.name = "tclass2"
	tclass3
	//o.name = "prueba"
	// o.name
}

// first_o = in!Class.all_objects.first
other = c.call(tclass2)
other.name = "tclass3"
//tclass.name = c.call(first_o)

//names = in!Class.all_objects.inject(0) { |o| o }.
//                             map { |o| o.name }
                             
                             
