rule 'EOperation' do
   from Source::EOperation
   to Resulting::EOperation
   filter { |c| c.metaclass == Source::EOperation }
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
rule 'EAnnotation' do
   from Source::EAnnotation
   to Resulting::EAnnotation
   filter { |c| c.metaclass == Source::EAnnotation }
   mapping do |s, t|
      t.source = s.source
      t.details = s.details
      t.eModelElement = s.eModelElement
      t.contents = s.contents
      t.references = s.references
      t.eAnnotations = s.eAnnotations
   end
end
rule 'EParameter' do
   from Source::EParameter
   to Resulting::EParameter
   filter { |c| c.metaclass == Source::EParameter }
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
rule 'EObject' do
   from Source::EObject
   to Resulting::EObject
   filter { |c| c.metaclass == Source::EObject }
   mapping do |s, t|
   end
end
rule 'EClass' do
   from Source::EClass
   to Resulting::EClass
   filter { |c| c.metaclass == Source::EClass }
   mapping do |s, t|
      t.abstract = s.abstract
      t.interface = s.interface
      t.eOperations = s.eOperations
      t.eStructuralFeatures = s.eStructuralFeatures
      t.instanceClassName = s.instanceClassName
      t.ePackage = s.ePackage
      t.name = s.name
      t.eAnnotations = s.eAnnotations
   end
end
rule 'EDataType' do
   from Source::EDataType
   to Resulting::EDataType
   filter { |c| c.metaclass == Source::EDataType }
   mapping do |s, t|
      t.serializable = s.serializable
      t.instanceClassName = s.instanceClassName
      t.ePackage = s.ePackage
      t.name = s.name
      t.eAnnotations = s.eAnnotations
   end
end
rule 'EFactory' do
   from Source::EFactory
   to Resulting::EFactory
   filter { |c| c.metaclass == Source::EFactory }
   mapping do |s, t|
      t.ePackage = s.ePackage
      t.eAnnotations = s.eAnnotations
   end
end
rule 'EEnumLiteral' do
   from Source::EEnumLiteral
   to Resulting::EEnumLiteral
   filter { |c| c.metaclass == Source::EEnumLiteral }
   mapping do |s, t|
      t.value = s.value
      t.instance = s.instance
      t.literal = s.literal
      t.eEnum = s.eEnum
      t.name = s.name
      t.eAnnotations = s.eAnnotations
   end
end
rule 'EEnum' do
   from Source::EEnum
   to Resulting::EEnum
   filter { |c| c.metaclass == Source::EEnum }
   mapping do |s, t|
      t.eLiterals = s.eLiterals
      t.serializable = s.serializable
      t.instanceClassName = s.instanceClassName
      t.ePackage = s.ePackage
      t.name = s.name
      t.eAnnotations = s.eAnnotations
   end
end
rule 'EReference' do
   from Source::EReference
   to Resulting::EReference
   filter { |c| c.metaclass == Source::EReference }
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
      t.name = s.name
      t.eAnnotations = s.eAnnotations
   end
end
rule 'EStringToStringMapEntry' do
   from Source::EStringToStringMapEntry
   to Resulting::EStringToStringMapEntry
   filter { |c| c.metaclass == Source::EStringToStringMapEntry }
   mapping do |s, t|
      t.key = s.key
      t.value = s.value
   end
end
rule 'EAttribute' do
   from Source::EAttribute
   to Resulting::EAttribute
   filter { |c| c.metaclass == Source::EAttribute }
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

top_rule 'EPackage' do
   from Source::EPackage
   to Resulting::EPackage
   filter { |c| c.metaclass == Source::EPackage && ! c.is_dep? }
   mapping do |s, t|
      t.nsURI = s.nsURI
      t.nsPrefix = s.nsPrefix
      t.eFactoryInstance = s.eFactoryInstance
      t.eClassifiers = s.eClassifiers
      t.eSubpackages = s.eSubpackages.reject { |sub| sub.is_dep? }
      t.eSuperPackage = s.eSuperPackage # The same creation_condition
      t.name = s.name
      t.eAnnotations = s.eAnnotations
   end
end
