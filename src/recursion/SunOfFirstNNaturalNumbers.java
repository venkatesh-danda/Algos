package recursion;

public class SunOfFirstNNaturalNumbers {

	public static void main(String args[]) {
		System.out.print(findSum(10));
	}

	static int findSum(int n) {
		if (n > 0) {
			return findSum(n - 1) + n;
		}
		return 0;
	}
}
