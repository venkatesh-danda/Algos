package recursion;

public class TaylorSeries {
	static double p = 1, f = 1, s = 1;

	public static void main(String args[]) {
		System.out.println(e1(12, 4) + "\n" + e2(12, 4) + "\n" + e3(12, 4));
	}

	// o(n^2)
	static double e1(int x, int n) {
		if (n == 0) {
			return 1;
		}
		double r;
		r = e1(x, n - 1);
		p = p * x;
		f = f * n;
		return r + p / f;
	}

	// o(n)
	static double e2(int x, int n) {
		if (n == 0) {
			return s;
		}
		s = 1 + (x * s) / n;
		return e2(x, n - 1);
	}

	// o(n)
	static double e3(int x, int n) {

		double s = 1;
		for (; n > 0; n--) {
			s = ((s * x) / n) + 1;
		}

		return s;
	}
}
