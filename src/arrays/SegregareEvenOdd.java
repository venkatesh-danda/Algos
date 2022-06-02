package arrays;

public class SegregareEvenOdd {
	public static void main(String args[]) {
		int arr[] = {12, 34, 45, 9, 8, 90, 3};
		segregate(arr);
		
		for(int a : arr)
			System.out.print(a+" ");
	}
	
	static void segregate(int arr[]) {
		int i = 0;
		int j = arr.length-1;
		while(i < j) {
			if(arr[i]%2 != 0) {
				if(arr[j]%2 == 0) {
					swap(arr,i,j);
					i++;
					j--;
				}
				else {
					j--;
				}
			}
			else {
				i++;
			}
		}
	}
	
	static void swap(int arr[], int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
		
	}
}
