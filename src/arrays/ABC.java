package arrays;

import java.util.HashSet;

public class ABC {
	public static void main(String args[]) {
		int arr[] = { 4, 3, 6, 5 };

		cal(arr);

	}

	static void cal(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			int sum = arr[i] * arr[i];
			HashSet<Integer> set = new HashSet<Integer>();
			for (int j = 0; j < arr.length; j++) {

				int curr = arr[j] * arr[j];
				int temp = sum - curr;

//				System.out.println(curr+" "+temp+" "+sum);
				if (set.contains(temp)) {
					System.out.print("Found " + curr + "+" + temp + "=" + sum);
					break;
				}
				set.add(curr);
			}

		}
	}

}
