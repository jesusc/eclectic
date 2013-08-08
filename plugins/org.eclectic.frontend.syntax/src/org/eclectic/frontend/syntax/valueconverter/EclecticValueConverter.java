package org.eclectic.frontend.syntax.valueconverter;

import java.util.regex.Pattern;

import org.eclipse.xtext.common.services.Ecore2XtextTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.impl.AbstractNullSafeConverter;
import org.eclipse.xtext.nodemodel.INode;

public class EclecticValueConverter extends Ecore2XtextTerminalConverters {
	

	private static final Pattern ID_PATTERN = Pattern.compile("\\p{Alpha}\\w*");
	
	@ValueConverter(rule = "StrictString")
	public IValueConverter<String> StrictString() {
		return STRING();
	}
	
	@ValueConverter(rule = "QualifiedName")
	public IValueConverter<String> EString() {
		return new AbstractNullSafeConverter<String>() {
			@Override
			protected String internalToValue(String string, INode node) {
				if((string.startsWith("'") && string.endsWith("'"))||(string.startsWith("\"") && string.endsWith("\""))) {
					return STRING().toValue(string, node);
				}
				return ID().toValue(string, node);
			}

			@Override
			protected String internalToString(String value) {
				if(ID_PATTERN.matcher(value).matches()) {
					return ID().toString(value);
				} else {
					return STRING().toString(value);
				}
			}
		};
	}

}
