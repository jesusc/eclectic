public class Test6 {

	public static int testMethod(int a) {
		int i = a;
		outer: while (i > 0) {
			inner: while (i > 50) {
				if (i < 60) {
					i = i - 5;
					continue inner;
				}
				if (i == 46)
					break outer;
				i = i - 10;
				if (i == 50)
					continue outer;
			}
			i--;
		}
		return i;
	}
}
