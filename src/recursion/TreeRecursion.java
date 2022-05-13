package recursion;

public class TreeRecursion {
	public static void main(String args[]) {
		treeRecursion(5);
	}
	
	static void treeRecursion(int n) {
		if(n > 0) {
			System.out.print(n);
			treeRecursion(n-1);
			treeRecursion(n-1);
		}
	}
}
