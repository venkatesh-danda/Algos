package arrays;

public class TwoRepeatingElements {
	
	public static void main(String args[]) {
		int arr[] = {5,7,4,5,2,7,6};
		find(arr);
	}
	static void find(int arr[]) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			arr[arr[i]%n] = 
					arr[arr[i]%n] +n;
		}
		display(arr);
		System.out.println(n*2);
		for(int i=0;i<n;i++) {
			if(arr[i] >= arr.length * 2) {
				if(i == 0) {
					System.out.print(n+" ");
					continue;
				}
				System.out.print(i+" ");
			}
			
		}
	}
	
	static void display(int arr[]) {
		for(int A : arr) {
			System.out.print(A+" ");
		}
		System.out.println();
	}
}
