package test.bcel;

import java.util.List;

import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.Type;
import org.eclectic.api.MapperContext;

public class BcelMapper implements org.eclectic.api.GenericMapper {

	private MapperContext context;

	@Override
	public void setContext(MapperContext context) {
		this.context = context;
	}

	public org.apache.bcel.classfile.JavaClass getFieldType(org.apache.bcel.classfile.Field receptor) {
		if  ( receptor.getType() instanceof ObjectType ) {
			ObjectType objectType = (ObjectType) receptor.getType(); 
			List<Object> classes = context.getModel().allObjectsOf("JavaClass");
			for (Object object : classes) {
				if ( ((JavaClass) object).getClassName().equals(objectType.getClassName()) ) {
					return (JavaClass) object;
				}
			}
		}
		
		return null;
	}	
	
}

