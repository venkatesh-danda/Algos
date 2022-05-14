package recursion;

public class IndirectRecursion {
	public static void main(String args[]) {

		IndirectRecursion ir = new IndirectRecursion();
		ir.fun1(20);
	}

	void fun1(int n) {
		if (n > 0) {
			System.out.println(n);
			fun2(n - 1);
		}
	}

	void fun2(int n) {
		if (n > 0) {
			System.out.println(n);
			fun1(n / 2);
		}
	}
}
