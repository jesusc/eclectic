

public class Test0 {
	public int testMethod() {
		int a = 1;
		int b = 2;
		int c = a + b;
		a = c;
		b = a;
		c = a / b;
		b = a - b;
		return b * c;
	}
}
