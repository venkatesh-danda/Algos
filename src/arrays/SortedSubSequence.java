package arrays;

public class SortedSubSequence {

	public static void main(String args[]) {
		int arr[] = { 12, 11, 10, 5, 6, 2, 30 };
		sortsub(arr);
	}

	static void sortsub(int arr[]) {

		int n = arr.length;
		int smaller[] = new int[n];
		int min = 0;
		int max = n - 1;
		smaller[0] = -1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] <= arr[min]) {
				smaller[i] = -1;
				min = i;
			} else {
				smaller[i] = min;
			}
		}

		int larger[] = new int[n];
		larger[n-1] = -1;
		for (int i = n - 2; i >= 0; i--) {
			
		if (arr[i] >= arr[max]) {
				max = i;
				larger[i] = -1;
			} else {
				larger[i] = max;
			}
		}

		for (int i = 0;i< n; i++) {
			if(smaller[i] != -1 && larger[i] != -1)
				System.out.println(arr[smaller[i]] + " " + arr[i] + " " + arr[larger[i]]);
		}
	}
}
