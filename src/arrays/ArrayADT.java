package arrays;


class Node{
	
	private int a[];
	private int size;
	private int length;
	
	Node(int arr[], int length,int size){
		
		this.a = arr;
		this.size = size;
		this.length = length;
	} 
	
	void display() {
		for (int i=0;i<length;i++) {
			System.out.print(a[i]);
		}
	}
	
	void append(int value) {
		if(length < size) {
			a[length] = value;
		}
		length++;
	}
	
	void add(int index, int value) {
		if(index<=length && index >=0 ) {
			int i =length;
			while(i>=index) {
				a[i] = a[i-1];
			}
		}
		a[index] = value;
		length++;
	}
}

//public class ArrayADT {
//	
//	public static void main(String args[]) {
//		Node ob = new Node();
//		ob.size = 10;
//		ob.a = new int[ob.size];
//		
//		for(int i=0;i<5;i++)
//			ob.a[i] = i+1;
//		ob.length = 5;
//		add(ob,2,10);
//		display(ob);
//		delete(ob,4);
//		display(ob);
//	}
//	
//	static void display(Node arr) {
//		for(int i=0;i<arr.size;i++)
//		{
//			System.out.print(arr.a[i]+" ");
//		}
//		System.out.println("length : "+arr.length);
//	}
//	
//	
//	static void append(int index,int value) {
//		if(index>=0 && index < length);
//	}
//	static void add(Node arr,int index,int value) {
//		if (index >= arr.length) {
//			arr.a[index] = value;
//			arr.length = index++;
//			return;
//		}
//		int i=arr.length;
//		while(index<i) {
//			arr.a[i] = arr.a[i--];
//		}
//		arr.a[i] = value;
//		arr.length++;
//	}
//	
//	static void delete(Node arr,int index) {
//		if(index<arr.length) {
//			for(int i=index;i<arr.length;i++)
//				arr.a[i] = arr.a[i+1];
//			arr.a[--arr.length] = 0;
//		}
//	}

//}
