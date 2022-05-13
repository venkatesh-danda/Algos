package arrays;

public class ArrayReverse {
	static void reverseWhile(int arr[],int l, int r){
		while (l < r ) {
			int temp = arr[l];
			arr[l++] = arr[--r];
			arr[r] = temp;
		}
	}
	
	static void reverseFor(int a[],int l, int r) {
		int mid = (r-l-1)/2;
//		System.out.println("Mid : "+mid);
		for (int i=l;i<=mid+l;i++) {
//			System.out.println("i :" + i);
//			System.out.println("a[l]:" + a[i]);
//			System.out.println("a[l+r-i-1]:" + a[l+r-i-1]);
			int temp = a[i];
			a[i] = a[l+r-i-1];
			a[l+r-i-1] = temp;
		}
	}
}
