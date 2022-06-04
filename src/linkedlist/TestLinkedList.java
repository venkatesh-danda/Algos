package linkedlist;

public class TestLinkedList {
	public static void main(String args[]) {
		LinkedList ll = new LinkedList();
		ll.insertAtEnd(1);
		for(int i = 2;i<19;i++) {
			ll.insertAtEnd(i);
		}
		ll.display();
		ll.printNthFromLast(ll.head, 5);
		ll.display();
	}
	
}
