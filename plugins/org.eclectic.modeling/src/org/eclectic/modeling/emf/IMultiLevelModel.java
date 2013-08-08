package org.eclectic.modeling.emf;

import java.util.List;

public interface IMultiLevelModel<O, M> extends IModel<O, M>{

	public abstract List<O> allObjectsOf(String metaclass, int potency);

}