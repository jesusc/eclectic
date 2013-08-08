public class Test4 {

	public static void testMethod() {
		int i = 100;
		while (i > 0) {
			while (i > 50) {
				i = i - 10;
				if (i == 50)
					break;
			}
			i--;
		}
	}
}
