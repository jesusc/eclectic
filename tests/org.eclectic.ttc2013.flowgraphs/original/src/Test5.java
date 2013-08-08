public class Test5 {

	public static int testMethod() {
		int i = 100;
		outer: while (i > 0) {
			while (i > 50) {
				i = i - 10;
				if (i == 50)
					break outer;
			}
			i--;
		}
		return i;
	}
}
