top_rule 'EEnum' do
   from Receiving::EEnum
   to Resulting::EEnum
   filter { |c| c.metaclass == Receiving::EEnum }
   mapping do |s, t|
      t.eLiterals = s.eLiterals
      t.serializable = s.serializable
      t.instanceClassName = s.instanceClassName
      t.ePackage = s.ePackage
      t.name = s.name
      t.eAnnotations = s.eAnnotations
   end
end
top_rule 'EStringToStringMapEntry' do
   from Receiving::EStringToStringMapEntry
   to Resulting::EStringToStringMapEntry
   filter { |c| c.metaclass == Receiving::EStringToStringMapEntry }
   mapping do |s, t|
      t.key = s.key
      t.value = s.value
   end
end
top_rule 'EAnnotation' do
   from Receiving::EAnnotation
   to Resulting::EAnnotation
   filter { |c| c.metaclass == Receiving::EAnnotation }
   mapping do |s, t|
      t.source = s.source
      t.details = s.details
      t.eModelElement = s.eModelElement
      t.contents = s.contents
      t.references = s.references
      t.eAnnotations = s.eAnnotations
   end
end
top_rule 'EObject' do
   from Receiving::EObject
   to Resulting::EObject
   filter { |c| c.metaclass == Receiving::EObject }
   mapping do |s, t|
   end
end
top_rule 'EEnumLiteral' do
   from Receiving::EEnumLiteral
   to Resulting::EEnumLiteral
   filter { |c| c.metaclass == Receiving::EEnumLiteral }
   mapping do |s, t|
      t.value = s.value
      t.instance = s.instance
      t.literal = s.literal
      t.eEnum = s.eEnum
      t.name = s.name
      t.eAnnotations = s.eAnnotations
   end
end
top_rule 'EPackage' do
   from Receiving::EPackage
   to Resulting::EPackage
   filter { |c| c.metaclass == Receiving::EPackage }
   mapping do |s, t|
      t.nsURI = s.nsURI
      t.nsPrefix = s.nsPrefix
      t.eFactoryInstance = s.eFactoryInstance
      t.eClassifiers = s.eClassifiers
      t.eSubpackages = s.eSubpackages
      t.eSuperPackage = s.eSuperPackage
      t.name = s.name
      t.eAnnotations = s.eAnnotations
   end
end
top_rule 'EOperation' do
   from Receiving::EOperation
   to Resulting::EOperation
   filter { |c| c.metaclass == Receiving::EOperation }
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
top_rule 'EFactory' do
   from Receiving::EFactory
   to Resulting::EFactory
   filter { |c| c.metaclass == Receiving::EFactory }
   mapping do |s, t|
      t.ePackage = s.ePackage
      t.eAnnotations = s.eAnnotations
   end
end
top_rule 'EClass' do
   from Receiving::EClass
   to Resulting::EClass
   filter { |c| c.metaclass == Receiving::EClass }
   mapping do |s, t|
      t.abstract = s.abstract
      t.interface = s.interface
      t.eSuperTypes = s.eSuperTypes
      t.eOperations = s.eOperations
      t.eStructuralFeatures = s.eStructuralFeatures
      t.instanceClassName = s.instanceClassName
      t.ePackage = s.ePackage
      t.name = s.name
      t.eAnnotations = s.eAnnotations
   end
end
top_rule 'EDataType' do
   from Receiving::EDataType
   to Resulting::EDataType
   filter { |c| c.metaclass == Receiving::EDataType }
   mapping do |s, t|
      t.serializable = s.serializable
      t.instanceClassName = s.instanceClassName
      t.ePackage = s.ePackage
      t.name = s.name
      t.eAnnotations = s.eAnnotations
   end
end
top_rule 'EReference' do
   from Receiving::EReference
   to Resulting::EReference
   filter { |c| c.metaclass == Receiving::EReference }
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
top_rule 'EAttribute' do
   from Receiving::EAttribute
   to Resulting::EAttribute
   filter { |c| c.metaclass == Receiving::EAttribute }
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
top_rule 'EParameter' do
   from Receiving::EParameter
   to Resulting::EParameter
   filter { |c| c.metaclass == Receiving::EParameter }
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
