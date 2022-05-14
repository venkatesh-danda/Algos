package recursion;

public class PowerOfNumber {

	public static void main(String args[]) {
		System.out.println(powT(9, 3));
	}

	static int pow(int m, int n) {

		if (n == 0) {
			return 1;
		}
		return m * pow(m, n - 1);
	}

	static int powT(int m, int n) {
		if (n == 0)
			return 1;
		if (n % 2 == 0)
			return powT(m * m, n / 2);
		return m * powT(m * m, (n - 1) / 2);
	}
}
