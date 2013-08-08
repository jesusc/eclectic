
public class Test1 {

	public static void testMethod(int a) {
		int i = a * 2;
		i = i + 19;
		while (i > a) {
			if (a < 1) {
				return;
			} else if (a == 1) {
				break;
			}
			i--;
		}
	}
}
