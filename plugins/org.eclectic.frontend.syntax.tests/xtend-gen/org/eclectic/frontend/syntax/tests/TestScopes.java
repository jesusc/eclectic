package org.eclectic.frontend.syntax.tests;

import javax.inject.Inject;
import org.eclectic.frontend.EclecticInjectorProvider;
import org.eclectic.frontend.core.EclecticTransformationDefinition;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@InjectWith(EclecticInjectorProvider.class)
@RunWith(XtextRunner.class)
public class TestScopes {
  @Inject
  private ParseHelper<EclecticTransformationDefinition> parser;
  
  @Test
  public void parseDomainmodel() {
    try {
      {
        EclecticTransformationDefinition _parse = this.parser.parse("\nentity MyEntity {\nparent: MyEntity\n}");
        final EclecticTransformationDefinition model = _parse;
        final EclecticTransformationDefinition entity = ((EclecticTransformationDefinition) model);
        InputOutput.<EclecticTransformationDefinition>println(entity);
      }
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
