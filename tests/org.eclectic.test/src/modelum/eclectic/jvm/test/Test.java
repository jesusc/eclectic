
package modelum.eclectic.jvm.test;

public class Test {
	public void test() {
		final int v = 0;
		Comparable<Integer> x = new Comparable<Integer>() { //  implements Runnable
			@Override
			public int compareTo(Integer arg0) {
				return v;
			}
		};
		
	}
}
