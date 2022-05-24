package arrays;

import java.util.Arrays;

public class UnionIntersection {
	
	
	public static void main(String args[]) {
		
		int[] a = {1,1,3,4,7,7};
		int b[] = {2,3,5,5,6,8};
		unionD(a,b);
	}
	
	static int returnIndex(int arr[],int i) {
		
		int j = i-1;
		while(i < arr.length && arr[j] == arr[i]) {
			i++;
		}
		return i;
	}
	
	static void unionD(int arr[],int brr[]) {
		Arrays.sort(arr);
		Arrays.sort(brr);
		
		int i = 0;
		int j = 0;
		while(i<arr.length && j < brr.length) {
			if(arr[i] < brr[j]) {
				System.out.print(arr[i++]+" ");
				i = returnIndex(arr,i);
				
			}
			else if (arr[i] > brr[j]) {
				System.out.print(brr[j++]+" ");
				j = returnIndex(brr,j);
			}
			else {
				System.out.print(arr[i++]+" ");
				j++;
				i = returnIndex(arr,i);
				j = returnIndex(brr,j);
			}
		}
		
		while(i < arr.length) {
			System.out.print(arr[i++]);
			returnIndex(arr,i);

		}
		while(j < brr.length) {
			System.out.print(brr[j++]);
			returnIndex(brr,j);

		}
	}
	
	static void union(int arr[], int brr[]) {
		Arrays.sort(arr);
		Arrays.sort(brr);
		
		int i = 0;
		int j = 0;
		while(i<arr.length && j < brr.length) {
			if(arr[i] < brr[j]) {
				System.out.print(arr[i++]+" ");
			}
			else if (arr[i] > brr[j]) {
				System.out.print(brr[j++]+" ");
			}
			else {
				System.out.print(arr[i++]+" ");
				j++;
			}
		}
		
		while(i < arr.length) {
			System.out.print(arr[i++]);
		}
		while(j < brr.length) {
			System.out.print(brr[j++]);
		}
	}
}
