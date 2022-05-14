package recursion;

public class NestedRecursion {
	public static void main(String args[]) {
		System.out.println(nestedRecursion(95));
	}

	static int nestedRecursion(int n) {
		if (n > 100) {
			return n - 10;
		} else {
			return nestedRecursion(nestedRecursion(n + 11));
		}
	}
}
