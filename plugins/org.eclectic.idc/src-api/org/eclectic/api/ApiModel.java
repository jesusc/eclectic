package org.eclectic.api;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import org.eclectic.apidesc.ApiDescription;
import org.eclectic.apidesc.ClassMapping;
import org.eclectic.apidesc.FeatureMapping;
import org.eclectic.apidesc.GetMechanism;
import org.eclectic.apidesc.Method;
import org.eclectic.apidesc.ReturnKind;
import org.eclectic.apidesc.SimpleAttributeMapping;
import org.eclectic.apidesc.SimpleClassMapping;
import org.eclectic.apidesc.SimpleGet;
import org.eclectic.apidesc.SimpleReferenceMapping;
import org.eclectic.apidesc.jvmgen.ApiDescriptionJVMGen;
import org.eclectic.apidesc.jvmgen.SimpleClassMappingJVMGen;
import org.eclectic.apidesc.patterns.IteratorGetter;
import org.eclectic.modeling.emf.ICollectionConverter;
import org.eclectic.modeling.emf.IModel;
import org.eclipse.emf.common.util.EList;

public class ApiModel implements IModel<Object, Class<?>> {

	private ApiDescriptionJVMGen apiDescription;
	// private LinkedList<Object> objects;
	private HashSet<Object> objects;
	private ICollectionConverter converter;
	private GenericMapper mapper;
	private Object methodHandler;

	public ApiModel(ApiDescription apiDescription, ICollectionConverter converter) {
		this.apiDescription = (ApiDescriptionJVMGen) apiDescription;
		this.objects        = new HashSet<Object>(); // new LinkedList<Object>();
		this.converter      = converter;
	
		try {
			if ( apiDescription.getMapperClassName() != null ) {
				Class<?> mapperClazz = this.getClass().getClassLoader().loadClass( apiDescription.getMapperClassName() );
				mapper = (GenericMapper) mapperClazz.newInstance();
				mapper.setContext(new MapperContext(this));
			}
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		} catch (InstantiationException e) {
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}

	public ApiModel(Object root, ApiDescription apiDescription, ICollectionConverter converter) {
		this(apiDescription, converter);
		
		loadObjects(root, new HashSet<Object>(), null);
	}

	public List<Object> referencedObjects(Object obj) {
		LinkedList<Object> result = new LinkedList<Object>();
		loadObjects(obj, this.objects, result);
		return result;
	}

	private void loadObjects(Object obj, HashSet<Object> alreadyAdded, List<Object> newObjects) {
		if ( obj == null )
			return;
		
		if ( obj instanceof Collection<?> ) {
			for(Object o : ((Collection) obj)) {
				loadObjects(o, alreadyAdded, newObjects);
			}
			return;
		}
		
		if ( alreadyAdded.contains(obj) ) 
			return;
	
		this.objects.add(obj);
		if ( newObjects != null ) {
			newObjects.add(obj);
		}
		alreadyAdded.add(obj);
		
		SimpleClassMapping m = (SimpleClassMapping) apiDescription.fromClass(obj.getClass());
		EList<FeatureMapping> mappings = m.getFeatureMappings();
		for (FeatureMapping featureMapping : mappings) {
			List<Object> objs = loadObjectFromMapping(featureMapping, obj);
			if ( objs == null )
				continue;
			for (Object object : objs) {
				loadObjects(object, alreadyAdded, newObjects);
			}
		}
	}

	private List<Object> loadObjectFromMapping(FeatureMapping featureMapping, Object obj) {
		if ( featureMapping instanceof SimpleReferenceMapping ) {
			SimpleReferenceMapping ref = (SimpleReferenceMapping) featureMapping;
			GetMechanism mechanism = ref.getGetMethod();
			if ( mechanism == null )
				return null;
			
			if ( mechanism instanceof org.eclectic.apidesc.GenericGet ) {
				return loadObjectsFrom((org.eclectic.apidesc.GenericGet) mechanism, obj);				
			} if ( mechanism instanceof SimpleGet ) {
				return loadObjectsFrom((SimpleGet) mechanism, obj);
			} else if ( mechanism instanceof IteratorGetter ){
				return loadObjectsFrom((IteratorGetter) mechanism, obj);				
			} else {
				throw new UnsupportedOperationException(mechanism.toString());
			}
			// ref.isIsMultivalued()
		}		
		return null;
	}

	private List<Object> loadObjectsFrom(IteratorGetter mechanism, Object obj) {
		LinkedList<Object> result = new LinkedList<Object>();
		try {
			java.lang.reflect.Method m = obj.getClass().getMethod(mechanism.getGetIterator().getName(), new Class[] { });
			Object iterableObj = m.invoke(obj, new Object[] {});
			
			Class<?> clazz = Class.forName(mechanism.getIterator().getIteratorClass());
			
			java.lang.reflect.Method finishedMethod = clazz.getMethod(mechanism.getIterator().getHasFinished().getName(), new Class[] {});
			java.lang.reflect.Method nextElemMethod = clazz.getMethod(mechanism.getIterator().getNextElement().getName(), new Class[] {});
			Object[] emptyParams = new Object[] {};
			
			Boolean hasNext = (Boolean) finishedMethod.invoke(iterableObj, emptyParams);
			while ( hasNext ) {
				Object currentElement = nextElemMethod.invoke(iterableObj, emptyParams);
				result.add(currentElement);
				hasNext = (Boolean) finishedMethod.invoke(iterableObj, emptyParams);
			}
		} catch ( Exception e ) {
			throw new RuntimeException(e);
		}
		return result;
	}
	
	private List<Object> loadObjectsFrom(org.eclectic.apidesc.GenericGet gget, Object obj) {
		// Class<?> paramType = Class.forName(gget.getGetter().getParameterTypes().get(0));


		return loadObjectsFromAux(gget, mapper, mapper.getClass(), new Object[] { obj }, new Class<?>[] { obj.getClass() });
	}
	
	private List<Object> loadObjectsFrom(SimpleGet sget, Object obj) {
		SimpleClassMapping map = (SimpleClassMapping) sget.eContainer().eContainer();
		Class<?> clazz;
		try {
			clazz = Class.forName(map.getCanonicalClassName());
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
		return loadObjectsFromAux(sget, obj, clazz, new Object[] {}, new Class<?>[] {});
	}

	private List<Object> loadObjectsFromAux(SimpleGet sget, Object obj, Class<?> receptorClass, Object[] params, Class<?>[] paramTypes) {
		LinkedList<Object> result = new LinkedList<Object>();
		Method getter = sget.getGetter();
		
		// TODO: Deal with multi-parameters
		Object r = null;
		try {
			java.lang.reflect.Method m = receptorClass.getMethod(getter.getName(), paramTypes);
			r = m.invoke(obj, params);
		} catch (SecurityException e) {
			throw new RuntimeException(e);
		} catch (NoSuchMethodException e) {
			throw new RuntimeException(e);
		} catch (IllegalArgumentException e) {
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		} catch (InvocationTargetException e) {
			throw new RuntimeException(e);
		}
		
		if ( getter.getReturnArray() ) {
			Object[] asArray = (Object[]) r;
			for (Object object : asArray) {
				result.add(object);
			}			
		} else {
			// is object
			result.add(r);
		}
		/*
		switch ( getter.getReturnKind().getValue() ) {
		case ReturnKind.SINGLE_OBJECT_VALUE:
			result.add(r);
			break;
		case ReturnKind.ARRAY_VALUE:
			Object[] asArray = (Object[]) r;
			for (Object object : asArray) {
				result.add(object);
			}
			break;
		default:
			throw new RuntimeException("Return kind not implemented yet: " + getter.getName());
		}
		*/
		
		
		return result;
	}

	// Specific methods
	public void addObject(Object o) {
		this.objects.add(o);
	}

	public <T> List<T> allObjectsOf(Class<T> clazz) {
		LinkedList<T> result = new LinkedList<T>();
		for (Object o : objects) {
			if ( clazz.isInstance(o) ) {
				result.add(clazz.cast(o));
			}
		}
		return result;
	}

	// Inherited methods
	@Override
	public List<Object> allObjectsOf(String metaclass) {
		String javaClass = apiDescription.getJavaClass(metaclass);
		try {
			Class<?> c = Class.forName(javaClass);
			return (List<Object>) allObjectsOf(c);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e); // TODO: I need a custom runtime error
		}
	}

	@Override
	public Object createObject(String metaclass) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Class<?> getMetaclass(String metaclass) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setFeature(Object receptor, String featureName, Object value) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object getFeature(Object receptor, String featureName) {
		Class<?> clazz = receptor.getClass();
		SimpleClassMappingJVMGen m = (SimpleClassMappingJVMGen) apiDescription.fromClass(clazz);
		FeatureMapping featureMapping = m.getFeatureMapping(featureName);

		if ( featureMapping instanceof SimpleReferenceMapping ) {
			List<Object> result = loadObjectFromMapping(featureMapping, receptor);
			if ( featureMapping.isIsMultivalued() ) {
				return converter.convertList(result);
			} 
			return result.get(0);
		} else if ( featureMapping instanceof SimpleAttributeMapping ) {
			// Pretty similar to the reference case, not much difference...
			List<Object> result = loadObjectsFrom((SimpleGet) featureMapping.getGetMethod(), receptor);
			if ( featureMapping.isIsMultivalued() ) {
				return converter.convertList(result);
			} 
			return result.get(0);
		} else {
			throw new UnsupportedOperationException(featureMapping.toString());
		}
	} 

	@Override
	public boolean hasFeature(Object receptor, String featureName) {
		try {
			Class<?> clazz = receptor.getClass();
			SimpleClassMappingJVMGen m = (SimpleClassMappingJVMGen) apiDescription.fromClass(clazz);
			m.getFeatureMapping(featureName);
			return true;
		} catch ( SimpleClassMappingJVMGen.FeatureNotFound e ) {
			return false;
		}
	}

	@Override
	public boolean contains(Object obj) {
		/*
		for(int i = 0; i < objects.size(); i++) {
			if ( objects.get(i) == obj ) 
				return true;
		}
		return false;
		*/
		return this.objects.contains(obj);
	}

	@Override
	public boolean isKindOf(Object o, String metaclass) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void registerMethodHandler(Object handler) {
		methodHandler = handler;
	}

	@Override
	public Object getMethodHandler() {
		return methodHandler;
	}

	@Override
	public Object getContainer(Object object) {
		throw new UnsupportedOperationException();
	}

	public String resolveMetaclassName(Object obj) {
		return resolveMetaclassNameAux(obj.getClass());
	}
	
	public String resolveMetaclassNameAux(Class<?> clazz) {
		String canonicalName = clazz.getCanonicalName();
		EList<ClassMapping> classMappings = apiDescription.getClassMappings();
		for (ClassMapping classMapping : classMappings) {
			SimpleClassMapping scm = (SimpleClassMapping) classMapping;
			if ( scm.getCanonicalClassName().equals(canonicalName) ) {
				return scm.getMetaclassName();
			}
		}
		
		Class<?> superclazz = clazz.getSuperclass();
		if ( superclazz != null && superclazz != Object.class ) {
			String name = resolveMetaclassNameAux(superclazz);
			if ( name != null )
				return name;
		}
		
		Class<?>[] interfaces = clazz.getInterfaces();
		for (Class<?> clazzInterface : interfaces) {
			String name = resolveMetaclassNameAux(clazzInterface);
			if ( name != null )
				return name;
		}
		return null;
	}

	@Override
	public List<Object> allObjectsOf(String metaclass, boolean noSubtypes) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void deleteObject(Object o) {
		throw new UnsupportedOperationException();
	}

}
