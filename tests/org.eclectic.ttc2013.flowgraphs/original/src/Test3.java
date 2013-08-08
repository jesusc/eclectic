public class Test3 {

	public static void testMethod(int a) {
		int i = a * 2;
		while (i > a) {
			if (a < 1) {
				return;
			} else if (a == 1)
				break;
			else
				a--;
			i--;
		}
	}
}
