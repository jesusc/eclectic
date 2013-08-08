package org.eclectic.frontend.syntax.tests

import org.eclipse.xtext.junit4.InjectWith
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclectic.frontend.EclecticInjectorProvider
import javax.inject.Inject
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclectic.frontend.core.EclecticTransformationDefinition
import org.junit.Test

@InjectWith(typeof(EclecticInjectorProvider))
@RunWith(typeof(XtextRunner))	
class TestScopes {
	@Inject ParseHelper<EclecticTransformationDefinition> parser

	@Test
	def void parseDomainmodel() {
	val model = parser.parse("
entity MyEntity {
parent: MyEntity
}"
	)
	val entity = model as EclecticTransformationDefinition
	println(entity)
	// assertSame(entity, entity.features.head.type)
}
	
}