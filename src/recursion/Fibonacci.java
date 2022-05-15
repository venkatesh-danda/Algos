package recursion;

import java.util.Arrays;

public class Fibonacci {
	public static void main(String args[]) {
		Arrays.fill(f, -1);
		f[0] = 0;
		f[1] = 1;
		System.out.println(f3(10));
	}

	static int f1(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		return f1(n - 1) + f1(n - 2);
	}

	static int[] f = new int[100];

	static int f2(int n) {
		if (f[n] != -1) {
			return f[n];
		}
		return f[n] = f2(n - 1) + f2(n - 2);

	}

	static int f3(int n) {
		int t0 = 0, t1 = 1, s = 1;
		for (int i = 2; i <= n; i++) {
			s = t0 + t1;
			t0 = t1;
			t1 = s;
		}

		return s;
	}

	static int f4(int n) {
		if (n <= 1) {
			return f[n] = n;
		}
		if (f[n - 1] == -1) {
			f[n - 1] = f4(n - 1);
		}
		if (f[n - 2] == -1) {
			f[n - 2] = f4(n - 2);
		}

		return f[n - 1] + f[n - 2];
	}
}
