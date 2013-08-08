package org.eclectic.modeling.emf;

import java.util.Collection;
import java.util.Iterator;

public class IdentityConverter implements ICollectionConverter {

	@Override
	public Object convertList(Object list) {
		return list;
	}

	@Override
	public boolean isList(Object list) {
		return list instanceof Collection;
	}

	@Override
	public Iterator<Object> toIterator(Object list) {
		return ((Collection) list).iterator();
	}

	@Override
	public Object convertToStreamingList(Object list) {
		return list;
	}

}
