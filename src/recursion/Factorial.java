package recursion;

public class Factorial {

	public static void main(String args[]) {
		System.out.println(fact(5));
	}

	static int fact(int n) {
		if (n == 0) {
			return 1;
		}
		return fact(n - 1) * n;
	}
}
