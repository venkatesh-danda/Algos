package recursion;

public class StaticGlobal {
	
	static int x = 0;
	public static void main(String args[]) {
		int n = 5;
		System.out.print(nonStatic(n));
	}
	
	static int staticGlobal(int n) {
		if(n <= 0) {
			return 0;
		}
		x++;
		System.out.println("X :"+x+" "+n);
		return staticGlobal(n-1) +x;
	}
	
	static int nonStatic(int n) {
		if(n>0) {
			return nonStatic(n-1)+n;
		}
		return 0;
	}
}
