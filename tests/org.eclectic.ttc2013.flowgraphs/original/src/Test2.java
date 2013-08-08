public class Test2 {

	public static void testMethod(int a) {
		int i = a * 2;
		while (i > a) {
			if (a < 1) {
				return;
			} else if (a == 0) {
				continue;
			}
			i++;
		}
	}
}
