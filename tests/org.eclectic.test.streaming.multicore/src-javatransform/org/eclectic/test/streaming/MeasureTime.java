package org.eclectic.test.streaming;

import java.util.HashMap;
import java.util.Set;

public class MeasureTime {
	public static HashMap<String, Long> aggregates = new HashMap<String, Long>();
	public static HashMap<String, Long> current =  new HashMap<String, Long>();
			
	
	public synchronized static void startMeasure(String id) {
		current.put(id, System.currentTimeMillis());
	}
	
	public synchronized static void endMeasure(String id) {
		long start = current.remove(id);
		long time  = System.currentTimeMillis() - start;
		if ( ! aggregates.containsKey(id) ) {
			aggregates.put(id, time);
		} else {
			aggregates.put(id, aggregates.get(id) + time);
		}
	}
	
	public static void printMeasures() {
		Set<String> ks = aggregates.keySet();
		for (String id : ks) {
			double time = aggregates.get(id) / 1000.0;
			System.out.println(" * " + id + " = " + time + " seconds.");
		}
	}

	public static void printMeasuresPlusTotal() {
		long all = 0;
		Set<String> ks = aggregates.keySet();
		for (String id : ks) {
			all += aggregates.get(id);
			double time = aggregates.get(id) / 1000.0;
			System.out.println(" * " + id + " = " + time + " seconds.");
		}
		System.out.println( "* Total = " + all / 1000.0 + " seconds.");
	}

}
