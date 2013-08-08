/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.javaflow.rewrite;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public final class RewriteBugs implements Runnable {

    public void run() {
        RewriteBugs.calculateCartesianProduct(new String[]{"a","b"}, new Object[]{"1","2"});
    }

	/**
	 * 
	 * ASM rewriting BUG!
	 * 
	 *  Calculate the cartesian product of parameters.
	 *  Example: names = {"a", "b"}, values = {{"1", "2"}, {"3", "4"}}
	 *  		 result = {{"a"="1", "b"="3"}, {"a"="2", "b"="3"}, {"a"="1", "b"="4"}, {"a=2", b="4"}}
	 *  @param names The names.
	 *  @param values The values (must be some form of collection, i.e. array, list, iterator etc.)
	 */
	public static List calculateCartesianProduct(String[] names, Object[] values)
	{
		//ArrayList ret = SCollection.createArrayList();
		ArrayList ret = new ArrayList();
		if(names==null || values==null)
			return ret;
		if(names.length!=values.length)
			throw new IllegalArgumentException("Must have same length: "+names.length+" "+values.length);
		
		//HashMap binding = SCollection.createHashMap();
		HashMap binding = new HashMap();
		Iterator[] iters = new Iterator[values.length];
		
		for(int i=0; i<values.length; i++)
		{
			// When one collection is empty -> no binding at all.
			// First binding consists of all first elements.
			//iters[i] = SReflect.getIterator(values[i]);
			iters[i] = RewriteBugs.getIterator(values[i]);
			if(!iters[i].hasNext())
			{
				return ret;
			}
			else
			{
				binding.put(names[i], iters[i].next());
			}
		}
		ret.add(binding);
		
		// Iterate through binding sets for subsequent bindings.
		while(true)
		{
			// Calculate next binding.
			// Copy old binding and change one value.
			binding = (HashMap)binding.clone();
			int i = 0;
			for(; i<values.length && !iters[i].hasNext(); i++)
			{
				// Overflow: Re-init iterator.
				//iters[i] = SReflect.getIterator(values[i]);
				iters[i] = RewriteBugs.getIterator(values[i]);
				binding.put(names[i], iters[i].next());
			}
			if(i<iters.length)
			{
				binding.put(names[i], iters[i].next());
			}
			else
			{
				// Overflow in last iterator: done.
				// Hack: Unnecessarily re-inits all iterators before break ?
				break;
			}
			ret.add(binding);
		}
		
		return ret;
	}
	
	
	
	// 
	// ---- helper methods -- copied from jadex utility classes -----
	//
	
	/**
	 *  Get an iterator for an arbitrary collection object.
	 *  Supports iterators, enumerations, java.util.Collections,
	 *  java.util.Maps, arrays. Null is converted to empty iterator.
	 *  @param collection	The collection object.
	 *  @return An iterator over the collection.
	 *  @throws IllegalArgumentException when argument is not
	 * 		one of (Iterator, Enumeration, Collection, Map, Array).
	 */
	public static Iterator	getIterator(Object collection)
	{
		if(collection==null)
		{
			return Collections.EMPTY_LIST.iterator();
		}
		else if(collection instanceof Iterator)
		{
			return (Iterator)collection;
		}
		else if(collection instanceof Enumeration)
		{
			// Return enumeration wrapper.
			final Enumeration eoc	= (Enumeration)collection;
			return new Iterator()
			{
				public boolean	hasNext()	{return eoc.hasMoreElements();}
				public Object	next()	{return eoc.nextElement();}
				public void	remove(){throw new UnsupportedOperationException(
					"remove() not supported for enumerations");}
			};
		}
		else if(collection instanceof Collection)
		{
			return ((Collection)collection).iterator();
		}
		else if(collection instanceof Map)
		{
			return ((Map)collection).values().iterator();
		}
		else if(collection!=null && collection.getClass().isArray())
		{
			// Return array wrapper.
			final Object array	= collection;
			return new Iterator()
			{
				int i=0;
				public boolean	hasNext()	{return i<Array.getLength(array);}
				public Object	next()	{return Array.get(array, i++);}
				public void	remove()	{throw new UnsupportedOperationException(
					"remove() not supported for arrays");}
			};
		}
		else
		{
			throw new IllegalArgumentException("Cannot iterate over "+collection);
		}
	}
	
}