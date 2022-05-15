package arrays;

public class NextSamllestPalindrome {
	public static void main(String args[]) {
		System.out.println(pal(333));
	}

	static int pal(int n) {

		while (true) {
			n++;
			if (palin(n))
				return n;
		}
	}

	static boolean palin(int n) {

		int num = n;
		int sum = 0;
		int rem = 0;
		int c = 1;
		while (n > 0) {
			rem = n % 10;
			sum = (sum * 10 + rem);

			n = n / 10;

		}

//		System.out.println("Sum :"+sum);
		return (sum == num) ? true : false;
	}

}
