package arrays;

import java.util.Arrays;

class Node {

	private int a[];
	private int size;
	private int length;

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

//		System.out.print(length);
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

//		Arrays.sort(a);
		int l = 0;
		int r = a.length - 1;

		while (l <= r) {
			int mid = r - l / 2;
			if (a[mid] == key) {
				return mid;
			} else if (a[mid] > key) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return -1;
	}
}

public class ArrayADT {

	public static void main(String args[]) {

		int arr[] = new int[15];
		for (int i = 0; i < 5; i++) {
			arr[i] = i + 1;
		}
		Node ob = new Node(arr, 5, 15);

//		ob.insert(3, 6);
//		ob.display();
//		ob.delete(3);
//		ob.display();
		System.out.println("Find Key  : " + ob.binarySearch(3));
		ob.display();
	}

}
