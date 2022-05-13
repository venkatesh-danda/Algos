package arrays;

public class ArrayWithOneRepeatedElement {
	public static void main(String args[]) {
		int a[]  = {1,2,3,4,5,6,2,3,5,4,6};
		findElement(a);
	}
	
	static void findElement(int a[]) {
		int res = 0;
		for(int i = 0; i<a.length;i++) {
			res ^= a[i];
		}
		System.out.print(res);
	}
}
