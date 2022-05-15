package arrays;

import java.util.HashMap;
import java.util.HashSet;

public class TripletsWithGivenSum {

	public static void main(String args[]) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		findHash(a, 9);
	}

	static void find(int arr[], int sum) {
		for (int i = 0; i < arr.length - 2; i++) {
			int l = i + 1;
			int r = arr.length - 1;

			while (l < r) {
				if (arr[i] + arr[l] + arr[r] == sum) {
					System.out.println(arr[i] + "+" + arr[l] + "+" + arr[r] + "=" + sum);
					l++;
					r--;
					continue;
				} else if (arr[i] + arr[l] + arr[r] < sum) {
					l++;
					continue;
				}
				r--;

			}

		}
	}

	// using hash map
	static void findHash(int arr[], int sum) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				int temp = sum - arr[j] - arr[i];
				if (set.contains(temp)) {
					System.out.println(arr[i] + "+" + arr[j] + "+" + temp + "=" + sum);
				} else {
					set.add(arr[j]);
				}
			}

		}
	}

}
