package arrays;

public class ArrayLeftShift {
	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		leftShift(arr,3);
	}

	static void display(int[] p) {
		for (int A : p) {
			System.out.print(A + " ");
		}
	}

	static void leftShift(int[] arr, int k) {
		for (int i = k; i < k+arr.length; i++) {
			System.out.print(arr[(i+arr.length)%arr.length]+ " ");
		}
	}

	static void swap(int arr[], int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
}
