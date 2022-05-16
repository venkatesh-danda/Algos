package arrays;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

		int n = search(arr, 12);
		System.out.print(n);
	}

	static int search(int arr[], int key) {
		Arrays.sort(arr);
		int l = 0;
		int r = arr.length - 1;

		while (l < r) {
			int mid = r - l / 2;
			if (arr[mid] == key) {
				return mid;
			} else if (arr[mid] > key) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return -1;
	}
}
