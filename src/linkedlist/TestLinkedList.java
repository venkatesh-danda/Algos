package linkedlist;

public class TestLinkedList {
	public static void main(String args[]) {
		LinkedList ll = new LinkedList();
		ll.insertAtEnd(1);
		ll.insertAtEnd(2);
		ll.insertAtEnd(3);
		ll.insertAtEnd(4);
		ll.insertAtEnd(5);
		ll.insertAtEnd(6);
		ll.insertAtEnd(7);
		ll.tail.next = ll.head.next.next;
//		System.out.println(ll.ispalindrome(ll.head));
		System.out.println("Head : "+ll.head.data+" Tail : "+ll.tail.data);
//		ll.middleOfLinkedList();
		ll.detectLoop();
		ll.display();
	}
}
