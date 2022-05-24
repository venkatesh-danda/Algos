package arrays;

public class Reverse {

	
	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		reverse(arr,2,arr.length);
		
		display(arr);
 	}
	
	static void display(int[] p) {
		for(int A : p) {
			System.out.print(A+" ");
		}
	}
	
	static void reverse(int arr[], int l ,int r) {
		
		r -= 1;
		while(l<=r) {
			int temp = arr[l];
			arr[l++] = arr[r];
			arr[r--] = temp;
		}
	}
	
}
