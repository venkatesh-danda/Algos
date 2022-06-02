package arrays;

public class Sort0s1s2s {
	public static void main(String args[]) {
		int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		dsegregate(arr);
		for(int a : arr)
			System.out.print(a+" ");
	}
	
	static void segregate(int arr[]) {
		int j = -1;
		for(int i =0; i<arr.length;i++) {
			if(arr[i] == 0) {
				j++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		for(int i=j+1;i<arr.length;i++) {
			if(arr[i]==1) {
				j++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
	
	//Dutch Flag Standard
	
	static void dsegregate(int arr[]) {
		int l = 0;
		int m = 0;
		int h = arr.length-1;
		while(m<=h) {
			if(arr[m] == 0) {
				int temp = arr[m];
				arr[m++] = arr[l];
				arr[l++] = temp;
			}
			else if(arr[m] == 1)
				m++;
			else {
				int temp = arr[m];
				arr[m] = arr[h];
				arr[h--] = temp;
			}
		}
	}
}
