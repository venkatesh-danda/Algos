package arrays;

import java.util.Arrays;
import java.util.HashSet;

public class PairOfNumbersWithSumX {

	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		findHash(arr, 11);
	}

	static void find(int arr[], int sum) {
		Arrays.sort(arr);

		int l = 0;
		int r = arr.length - 1;
		while (l < r) {
//			System.out.println("arr[l],arr[r] : "+arr[l]+" "+arr[r]);
			if (arr[l] + arr[r] == sum) {
				System.out.println(arr[l] + " are " + arr[r] + " pairs for : " + sum);
				System.out.println("pairs Exist");
				l++;
				r--;
				continue;
			} else if (arr[l] + arr[r] > sum) {
				r--;
				continue;
			}
			l++;
		}
	}

	static void findHash(int arr[], int sum) {
		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {
			int temp = sum - arr[i];

			if (set.contains(temp)) {
				System.out.println(temp + "+" + arr[i] + "=" + sum);
			} else {
				set.add(arr[i]);
			}
		}

	}
}
