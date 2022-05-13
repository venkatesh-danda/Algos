package arrays;

public class ArrayRotate {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8};
		ArrayReverse.reverseFor(a,0,8);
		
		for(int A : a) {
			System.out.print(A);
		}
	}
}
