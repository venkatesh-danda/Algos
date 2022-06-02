package arrays;

public class Segregate0sand1s {
	public static void main (String args[]) {
		int arr[] = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
		segregate(arr);
		for(int a: arr)
			System.out.print(a+" ");
	}
	
	static void segregate(int arr[]) {
		int j = -1;
		int temp;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 0) {
				j++;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp; 
			}
		}
	}
}
