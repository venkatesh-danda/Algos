package recursion;

public class TowerOfHanoi {
	public static void main(String args[]) {

		char a = 'a';
		char b = 'b';
		char c = 'c';
		toh(3, a, b, c);
	}

	// o(2^n)
	static void toh(int n, char a, char b, char c) {
		if (n > 0) {
			toh(n - 1, a, c, b);
			System.out.println("From : " + a + " To :" + c);
			toh(n - 1, b, a, c);
		}
	}
}
