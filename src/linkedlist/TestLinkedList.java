package linkedlist;

public class TestLinkedList {
	public static void main(String args[]) {
		LinkedList ll = new LinkedList();
		ll.insertAtEnd(5);
		for(int i = 5;i<6;i++) {
			ll.insertAtEnd(i);
		}
		LinkedList ll2 = new LinkedList();
		ll2.insertAtEnd(5);
		for(int i = 5;i< 6 ;i++)
			ll2.insertAtEnd(i);
		
		ll.reverse();
		ll.display();
		ll2.reverse();
		ll2.display();
		Node res = ll.sumOfTwoListUtil(ll.head, ll2.head, 0);
		LinkedList ll3 = new LinkedList();
		ll3.head = res;
		ll3.display();
	}
	
}
