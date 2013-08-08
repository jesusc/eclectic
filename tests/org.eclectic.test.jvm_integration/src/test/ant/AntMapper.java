package test.ant;

import java.util.Collection;
import java.util.List;

import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.Type;
import org.apache.tools.ant.Target;
import org.eclectic.api.MapperContext;

public class AntMapper implements org.eclectic.api.GenericMapper {

	private MapperContext context;

	@Override
	public void setContext(MapperContext context) {
		this.context = context;
	}

	public org.apache.tools.ant.Target[] getTargets(org.apache.tools.ant.Project p) {
		Collection values = p.getTargets().values();
		Target[] targets = new Target[values.size()];
		int i = 0;
		for (Object target : values) {
			targets[i++] = (Target) target;
		}
		return targets;
	}
	
}

