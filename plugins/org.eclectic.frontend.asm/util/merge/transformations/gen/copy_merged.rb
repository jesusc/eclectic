top_rule 'EAnnotation' do
   from Merged::EAnnotation
   to Resulting::EAnnotation
   filter { |c| c.metaclass == Merged::EAnnotation }
   mapping do |s, t|
      t.source = s.source
      t.details = s.details
      t.eModelElement = s.eModelElement
      t.contents = s.contents
      t.references = s.references
      t.eAnnotations = s.eAnnotations
   end
end
top_rule 'EReference' do
   from Merged::EReference
   to Resulting::EReference
   filter { |c| c.metaclass == Merged::EReference }
   mapping do |s, t|
      t.containment = s.containment
      t.resolveProxies = s.resolveProxies
      t.eOpposite = s.eOpposite
      t.changeable = s.changeable
      t.volatile = s.volatile
      t.transient = s.transient
      t.defaultValueLiteral = s.defaultValueLiteral
      t.unsettable = s.unsettable
      t.derived = s.derived
      t.eContainingClass = s.eContainingClass
      t.ordered = s.ordered
      t.unique = s.unique
      t.lowerBound = s.lowerBound
      t.upperBound = s.upperBound
      t.eType = s.eType
      t.name = s.name
      t.eAnnotations = s.eAnnotations
   end
end
top_rule 'EStringToStringMapEntry' do
   from Merged::EStringToStringMapEntry
   to Resulting::EStringToStringMapEntry
   filter { |c| c.metaclass == Merged::EStringToStringMapEntry }
   mapping do |s, t|
      t.key = s.key
      t.value = s.value
   end
end
top_rule 'EAttribute' do
   from Merged::EAttribute
   to Resulting::EAttribute
   filter { |c| c.metaclass == Merged::EAttribute }
   mapping do |s, t|
      t.iD = s.iD
      t.changeable = s.changeable
      t.volatile = s.volatile
      t.transient = s.transient
      t.defaultValueLiteral = s.defaultValueLiteral
      t.unsettable = s.unsettable
      t.derived = s.derived
      t.eContainingClass = s.eContainingClass
      t.ordered = s.ordered
      t.unique = s.unique
      t.lowerBound = s.lowerBound
      t.upperBound = s.upperBound
      t.eType = s.eType
      t.name = s.name
      t.eAnnotations = s.eAnnotations
   end
end
top_rule 'EEnumLiteral' do
   from Merged::EEnumLiteral
   to Resulting::EEnumLiteral
   filter { |c| c.metaclass == Merged::EEnumLiteral }
   mapping do |s, t|
      t.value = s.value
      t.instance = s.instance
      t.literal = s.literal
      t.eEnum = s.eEnum
      t.name = s.name
      t.eAnnotations = s.eAnnotations
   end
end
top_rule 'EEnum' do
   from Merged::EEnum
   to Resulting::EEnum
   filter { |c| c.metaclass == Merged::EEnum }
   mapping do |s, t|
      t.eLiterals = s.eLiterals
      t.serializable = s.serializable
      t.instanceClassName = s.instanceClassName
      t.ePackage = s.ePackage
      t.name = s.name
      t.eAnnotations = s.eAnnotations
   end
end
top_rule 'EFactory' do
   from Merged::EFactory
   to Resulting::EFactory
   filter { |c| c.metaclass == Merged::EFactory }
   mapping do |s, t|
      t.ePackage = s.ePackage
      t.eAnnotations = s.eAnnotations
   end
end
top_rule 'EObject' do
   from Merged::EObject
   to Resulting::EObject
   filter { |c| c.metaclass == Merged::EObject }
   mapping do |s, t|
   end
end
top_rule 'EDataType' do
   from Merged::EDataType
   to Resulting::EDataType
   filter { |c| c.metaclass == Merged::EDataType }
   mapping do |s, t|
      t.serializable = s.serializable
      t.instanceClassName = s.instanceClassName
      t.ePackage = s.ePackage
      t.name = s.name
      t.eAnnotations = s.eAnnotations
   end
end
top_rule 'EParameter' do
   from Merged::EParameter
   to Resulting::EParameter
   filter { |c| c.metaclass == Merged::EParameter }
   mapping do |s, t|
      t.eOperation = s.eOperation
      t.ordered = s.ordered
      t.unique = s.unique
      t.lowerBound = s.lowerBound
      t.upperBound = s.upperBound
      t.eType = s.eType
      t.name = s.name
      t.eAnnotations = s.eAnnotations
   end
end
top_rule 'EOperation' do
   from Merged::EOperation
   to Resulting::EOperation
   filter { |c| c.metaclass == Merged::EOperation }
   mapping do |s, t|
      t.eContainingClass = s.eContainingClass
      t.eParameters = s.eParameters
      t.eExceptions = s.eExceptions
      t.ordered = s.ordered
      t.unique = s.unique
      t.lowerBound = s.lowerBound
      t.upperBound = s.upperBound
      t.eType = s.eType
      t.name = s.name
      t.eAnnotations = s.eAnnotations
   end
end

top_rule 'EPackage' do
   from Merged::EPackage
   to Resulting::EPackage
   filter { |c| c.metaclass == Merged::EPackage && c.creation_condition}
   mapping do |s, t|
      t.nsURI = s.nsURI
      t.nsPrefix = s.nsPrefix
      t.eFactoryInstance = s.eFactoryInstance
      t.eClassifiers = s.eClassifiers.select { |c|  c.metaclass == Merged::EClass && c.creation_condition }
      t.eSubpackages = s.eSubpackages
      t.eSuperPackage = s.eSuperPackage
      t.name = s.name
      t.eAnnotations = s.eAnnotations
   end
end

top_rule 'EClass' do
   from Merged::EClass
   to Resulting::EClass
   filter { |c| c.metaclass == Merged::EClass && c.creation_condition }
   mapping do |s, t|
      t.abstract = s.abstract
      t.interface = s.interface
      t.eSuperTypes = s.eSuperTypes.select { |c|  c.metaclass == Merged::EClass && c.creation_condition }
      t.eOperations = s.eOperations
      t.eStructuralFeatures = s.eStructuralFeatures
      t.instanceClassName = s.instanceClassName
      t.name = s.name
      t.eAnnotations = s.eAnnotations
 
      if s.ePackage.creation_condition
        t.ePackage = s.ePackage 
      else
        p = Receiving::EPackage.all_objects.find { |p| s.ePackage.match?(p.name) }
        t.ePackage = trace_query(p).one!(Resulting::EPackage)
      end

   end
end
