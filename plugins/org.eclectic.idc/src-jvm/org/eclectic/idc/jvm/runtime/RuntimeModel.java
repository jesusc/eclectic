package org.eclectic.idc.jvm.runtime;

import java.math.BigInteger;
import java.util.List;

import org.eclectic.idc.datatypes.ImmutableList;
import org.eclectic.idc.datatypes.ImmutableMap;
import org.eclectic.idc.datatypes.MutableMap;
import org.eclectic.idc.datatypes.Pair;
import org.eclectic.idc.jvm.runtime.facilities.BuiltinFacilities;
import org.eclectic.idc.jvm.runtime.facilities.IdcCopier;
import org.eclectic.modeling.emf.IModel;

/**
 * Contains those objects created at runtime, internally, by IDC.
 * 
 * It is assumed that there will be at most one runtime model
 * per transformation.
 * 
 * @author Jesus Sanchez Cuadrado
 *
 */
public class RuntimeModel implements IModel<Object, Class<?>>, IModelMethodHandler {
	// This constant is important also to the bootstrapping transformation that
	// that indicates calls to the runtime model by using "__RuntimeModel__" as model name
	public static final String UNIQUE_ID = "__RuntimeModel__";
		
	
	@Override
	public List<Object> allObjectsOf(String metaclass) {
		throw new UnsupportedOperationException("RuntimeModel.allObjectsOf");
	}

	@Override
	public Object createObject(String metaclass) {
		if ( "List".equals(metaclass) ) {
			return new ImmutableList();
		} else if ( "Map".equals(metaclass) ) {
			return new ImmutableMap();
		} else if ( "MutableMap".equals(metaclass) ) {
			return new MutableMap();
		} else if ( "Pair".equals(metaclass) ) {
			return new Pair();
		}
		
		throw new IllegalArgumentException("Unknown metaclass " + metaclass + " for " + UNIQUE_ID);
	}

	@Override
	public Class<?> getMetaclass(String metaclass) {
		throw new UnsupportedOperationException("RuntimeModel.getMetaclass");
	}

	@Override
	public boolean isKindOf(Object o, String metaclass) {
		throw new UnsupportedOperationException("RuntimeModel.isKindOf - with object " + o);
	}

	@Override
	public void setFeature(Object receptor, String featureName, Object value) {
		if ( receptor instanceof Pair ) {
			if ( featureName.equals("first") ) {
				((Pair) receptor).set_first(value);
				return;
			} else if ( featureName.equals("second") ) {
				((Pair) receptor).set_second(value);				
				return;
			}
		}
		
		
		throw new UnsupportedOperationException("RuntimeModel.setFeature: " + receptor + "\n" + featureName + "\n" + value);		
	}

	@Override
	public Object getFeature(Object receptor, String featureName) {
		if ( receptor instanceof Pair ) {
			if ( featureName.equals("first") ) {
				return ((Pair) receptor).first();
			} else if ( featureName.equals("second") ) {
				return ((Pair) receptor).second();				
			}
		}

		throw new UnsupportedOperationException("RuntimeModel.getFeature");
	}

	@Override
	public boolean hasFeature(Object receptor, String featureName) {
		if ( receptor instanceof Pair ) {
			return ( featureName.equals("first") || featureName.equals("second") );
		}
		return false;
		//throw new UnsupportedOperationException();
	}

	// --- //
	
	public void registerClosure(IClosure closure) {
		// do nothing, because for the moment all runtime objects 
		// can only belongs to this model!
	}
	
	@Override
	public boolean contains(Object obj) {	
		return 	( obj == null ) || 
				( obj instanceof Boolean) 	||
				( obj instanceof String )		||
				( obj instanceof Integer ) 	||
				( obj instanceof java.math.BigInteger ) 	||
				
				( obj instanceof IClosure ) 	||
				( obj instanceof ImmutableList ) ||
				( obj instanceof ImmutableMap ) ||
				( obj instanceof Pair ) ||
				
				( obj instanceof IdcMetaclass ) ||
				
				( obj instanceof BuiltinFacilities ) ||
				( obj instanceof IdcCopier ); 
	}
	
	// where to put this kind of methods?
	public static boolean isTrueObject(Object original) {
		if (original instanceof Boolean) {
			return (Boolean) original;
		} else {
			return original != null;
		}	
	}

	@Override
	public void registerMethodHandler(Object handler) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object getMethodHandler() {
		return this;
	}

	private static int StringWrapper_NextId = 0;
	public static class StringWrapper extends IdcPrimitiveObjectImpl<String> implements IMethodWrapper, IdcObject {		
		public StringWrapper(String s) {
			super(s);
		}
		
		public String concat(String s) {
			return impl + s;
		}
		
		public String next_id() {
			return this.impl + "_" + StringWrapper_NextId++;
		}		
		
		@Override
		protected String getKindOfTypeName() { return "String"; }

	}
	
	public static class BigIntegerWrapper extends IdcPrimitiveObjectImpl<java.math.BigInteger> implements IMethodWrapper, IdcObject {

		public BigIntegerWrapper(BigInteger impl) {
			super(impl);
		}

		@Override
		protected String getKindOfTypeName() {
			return "BigInteger";
		}		

	}
	
	public static class IntegerWrapper implements IMethodWrapper {
		private int impl;
		
		
		public IntegerWrapper(Integer i) {
			this.impl = i;
		}
		
		public Boolean gt(Integer i) {
			return impl > i;
		}
		
		public Boolean eq(Integer i) {
			return impl == i;
		}		
		
		public Integer add(Integer i) {
			return impl + i;
		}

		public Integer sub(Integer i) {
			return impl - 1;
		}

		public String println(Object prefix) {
			String res = "" + prefix + this.impl;
			System.out.println(res);
			return res;
		}
	}
	

	@Override
	public Object wrap(Object o) {
		if ( o == null ) return new NilObject();
		if ( o instanceof String ) return new StringWrapper((String) o);
		if ( o instanceof Integer) return new IntegerWrapper((Integer) o);
		if ( o instanceof java.math.BigInteger) return new BigIntegerWrapper((java.math.BigInteger) o);
		if ( o instanceof Boolean) return new BooleanWrapper((Boolean) o);
		return o;
	}

	@Override
	public Object getContainer(Object object) {
		throw new UnsupportedOperationException();
	}
	
	public static class NilObject implements IdcObject {
		public Boolean is_nil() {
			return true;
		}
		
		public Object if_nil(IClosure c) {
			return c.call__();
		}
		
		public Boolean eq(Object o) { return o instanceof NilObject; }
		
		public Boolean kind_of(Object o ) { return false; }
	
		public ImmutableList as_list() {
			return new ImmutableList();
		}
		
		public String println(Object o) {
			String str = o != null ? o.toString() : "Nil";
			System.out.println(str + " : " + "Nil");
			return str;
		}

		@Override
		public Object if_true(IClosure c) {
			return this;
		}
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
