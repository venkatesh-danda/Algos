package arrays;

import java.util.Arrays;

public class PairOfNumbersWithSumX {

	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		find(arr, 11);
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
}
