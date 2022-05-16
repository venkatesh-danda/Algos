package arrays;

class Node {

	private int a[];
	private int size;
	int length;

	Node(int arr[], int length, int size) {

		this.a = arr;
		this.size = size;
		this.length = length;
	}

	void display() {
		for (int i = 0; i < length; i++) {
			System.out.print(a[i]);
		}

		System.out.println("\tLength : " + length);
	}

	void append(int value) {

		if (length < size) {
			a[length] = value;
		}
		length++;
	}

	void insert(int index, int value) {
		if (index <= length && index >= 0) {
			int i = length;
			while (i > index) {
				a[i] = a[--i];
			}

			a[index] = value;
			length++;
		}

	}

	void delete(int index) {
		if (index < length && index >= 0) {
			int i = index;
			while (i < length - 1) {
				a[i] = a[++i];
			}
			a[--length] = 0;
		}
	}

	void swap(int x, int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}

	int linearSearch(int key) {

		for (int i = 0; i < length; i++) {
			if (a[i] == key) {
				swap(i, i - 1);
				return i;
			}
		}
		return -1;
	}

	int binarySearch(int key) {

		int l = 0;
		int r = length - 1;
		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (a[mid] == key) {
				return mid;
			} else if (key > a[mid]) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}
		return -1;
	}

	int binaryRec(int l, int h, int key) {

		if (l > h)
			return -1;
		int mid = l + (h - l) / 2;
		if (a[mid] == key) {
			return mid;
		} else if (a[mid] > key) {
			return binaryRec(l, mid - 1, key);
		} else {
			return binaryRec(mid + 1, h, key);
		}
	}
}

public class ArrayADT {

	public static void main(String args[]) {

		int arr[] = new int[15];
		for (int i = 0; i < 5; i++) {
			arr[i] = i + 1;
		}
		Node ob = new Node(arr, 5, 15);

		int key = 5;
		System.out.println("Find Key " + key + " : " + ob.binaryRec(0, ob.length - 1, key));
		ob.display();
	}

}
