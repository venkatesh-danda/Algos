package arrays;

public class Test {
	public static void main(String args[]) {
		int arr[] = {1,1,2,1,4,5,3,7,6};
	}
	
	static void find(int arr[],int k) {
		int n = arr.length;
		
		
		int has[] = new int[100];
		
		for(int i=0;i<n;i++) {
			has[arr[i]] += 1;
		}
		
		int count = 0;
		int has2[] = new int[100];
		for(int i=0;i<has.length;i++) {
			has2[has[i]] += 1;
		}
		
		for(int j = 99; j<=99-k;j++) {
			System.out.print("");
		}
		
	}
}
