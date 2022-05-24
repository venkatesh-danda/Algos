package arrays;

public class ArrayMerge {

	public static void main(String args[]) {

		int a[] = { 1, 3, 4, 6, 8, 12, 15, 17 };
		int b[] = { 2, 5, 7, 9, 10, 12, 13, 16 };
		int p[] = merge(a, b);

		display(p);

	}

	static void display(int arr[]) {
		for (int A : arr) {
			System.out.print(A + " ");
		}

		System.out.println("\tLength : " + arr.length);
	}

	static int[] merge(int a[], int b[]) {
		int x = a.length;
		int y = b.length;
		int z = x + y;
		int ra[] = new int[z];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < x && j < y) {
			if (a[i] < b[j]) {
				ra[k++] = a[i++];
			} else if (a[i] > b[j]) {
				ra[k++] = b[j++];
			} else {
				ra[k++] = a[i++];
				ra[k++] = b[j++];
			}
		}

		while (i < x) {
			ra[k++] = a[i++];
		}
		while (j < y) {
			ra[k++] = b[j++];
		}

		System.out.println(i + " " + j + " " + k);
		return ra;
	}
}
