

public class Test10 {
	public int testMethod(int a) {
		if (a < 0) {
			if (a < -10) {
				if (a < -100) {
					return -100;
				} else {
					return -50;
				}
			} else {
				return -5;
			}
		} else {
			a++;
			if (a > 10) return 10;
			return 5;
		}
	}
}
