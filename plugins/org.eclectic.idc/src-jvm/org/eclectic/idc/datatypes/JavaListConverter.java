package org.eclectic.idc.datatypes;

import java.util.Iterator;

import org.eclectic.modeling.emf.ICollectionConverter;

public class JavaListConverter implements ICollectionConverter {

	@SuppressWarnings("unchecked")
	@Override
	public Object convertList(Object list) {
		return ImmutableList.convertList((java.util.List<Object>) list);
	}

	@Override
	public boolean isList(Object list) {
		return list instanceof ImmutableList;
	}

	@Override
	public Iterator<Object> toIterator(Object list) {
		return ((ImmutableList) list).iterator();
	}

	@Override
	public Object convertToStreamingList(Object list) {
		return ImmutableList.convertList((java.util.List<Object>) list);
	}

}
