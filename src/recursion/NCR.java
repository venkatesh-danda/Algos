package recursion;

public class NCR {

	public static void main(String[] args) {
		System.out.println(ncr(2, 2));
	}

	static int ncr(int n, int r) {
		if (n == r || r == 0) {
			return 1;
		}
		return ncr(n - 1, r) + ncr(n - 1, r - 1);
	}
}
