package recursion;

public class TailHead {
	public static void main(String[] args)
	{
		int n = 3;
		fun1(n);
	}
	
	static void fun1(int n) {
		if (n > 0) {
			System.out.println(n);
			fun1(n-1);
		}
	}
	static void fun2(int n) {
		if (n>3){
			fun2(n-1);
			System.out.println(n);
		}
	}
}
