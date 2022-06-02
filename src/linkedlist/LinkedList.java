package linkedlist;

public class LinkedList {
	Node head = null;
	Node tail = null;

	void insertAtBeginning(int data) {
		if (head == null) {
			head = new Node();
			head.data = data;
			head.next = null;
			tail = head;
		} else {
			Node t = new Node();
			t.data = data;
			t.next = head;
			head = t;
		}
	}

	void insertAtGivenPosition(int data, int value) {
		Node temp = head;
		while (temp != null) {
			if (temp.data == value) {
				Node t = new Node();
				t.data = data;
				t.next = temp.next;
				temp.next = t;
				if (t.next == null)
					tail = t;
				break;
			}
			temp = temp.next;
		}
		if (temp == null) {
			System.out.println("insertAtGivenPosition : Given Value Not Found In List");
		}
	}

	void insertAtEnd(int data) {
		Node temp = new Node();
		temp.data = data;
		temp.next = null;
		if(head == null && tail == null) {
			head = tail = temp;
		}
		else {
			tail.next = temp;
			tail = temp;
		}
	}

	void deleteAtBeginning() {
		if (head == null) {
			System.out.println("Linked List Is Empty");
		} else {
			Node prev = head;
			head = head.next;
			prev.next = null;
		}
	}

	void deleteAtEnd() {
		Node prev = head;
		Node curr = head;
		while (curr.next != null) {
			prev = curr;
			curr = curr.next;
		}
		tail = prev;
		prev.next = null;
	}

	void deleteAtGivenPosition(int value) {
		Node curr = head;
		Node prev = head;
		if (head.data == value) {
			deleteAtBeginning();
		} else if (tail.data == value) {
			deleteAtEnd();
		} else {
			while (curr != null) {
				if (curr.data == value) {
					prev.next = curr.next;
					curr.next = null;
					break;
				}
				prev = curr;
				curr = curr.next;
			}
		}
		if (curr == null)
			System.out.print("Value Not Found In LinkedList");
	}

	void noofnodes() {
		Node curr = head;
		int count = 0;
		while (curr != null) {
			count++;
			curr = curr.next;
		}
		System.out.println("\nNo:of Nodes in Linked List are : " + count);
	}

	void reverse() {
		Node prev = null;
		Node curr = head;
		while(curr != null) {
			Node temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr =temp;
		}
		Node temp = head;
		head = tail;
		tail = temp;

	}
	
	
	
	// O(n) && O(n)
	Node left;
	boolean ispalindrome(Node right) {
		left = head;
		if(right == null) {
			return true;
		}
		boolean isp1 = ispalindrome(right.next);
		if(isp1 == false)
			return false;
		boolean res = left.data == right.data;
		left = left.next;
		return res;
		
	}

	void mergeLinkedLists(LinkedList list2) {
		Node curr1 = head;
		Node curr2 = list2.head;
		while(curr1 != null && curr2 !=  null) {
			if(curr1.data < curr2.data) {
				curr2.next = curr1.next;
				curr1.next = curr2;
				curr2 = curr2.next;
			}
			else {
				curr1 = curr1.next;
			}
		}
	}

	void isSubset(LinkedList list2) {
		
	}

	void breakLoop() {
		Node fast = head.next;
		Node slow = head;
		while(fast != slow && fast != null){
			if(fast.next.next == slow.next) {
				System.out.println("Loop Exists");
				slow.next = null;
				return;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println("Loop Not Found");
	}
		
	void removeLoop2(Node loop) {
		Node temp = loop;
		int k = 1;
		while(temp.next != loop) {
			k++;
			temp = temp.next;
		}
		
		Node ptr1 = head;
		Node ptr2 = head;
		for(int i=0;i<k;i++) {
			ptr2 = ptr2.next;
		}
		
		while(true) {
			if(ptr1.next == ptr2.next) {
				ptr2.next = null;
				break;
			}
			ptr1 = ptr1.next;
			ptr2 = ptr2.next;
		}
	}
	void removeLoop(Node loop_node) {
		Node ptr1 = head;
		Node ptr2 = null;
		
		while(true) {
			ptr2 = loop_node;
			while(ptr2.next != loop_node && ptr2.next != ptr1) {
				ptr2 = ptr2.next;
			}
			
			if(ptr2.next == ptr1) {
				ptr2.next = null;
				System.out.println("Remove Loop"+ptr2.data+"Loop Node" + loop_node+ " "+ptr2 );
				break;
			}
			ptr1 = ptr1.next;
		}
	}
	
	
	void detectLoop() {
		Node slow = head;
		Node fast = head;
		
		while(slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				System.out.println("Loop Found");
				removeLoop2(slow);
				
			}
		}
		
	}
	void middleOfLinkedList() {
		Node slow = head;
		Node fast = head;
		while(fast!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		System.out.println(slow.data);
	}

	void sortLinkedList() {
		
	}

	int findLength() {
		Node temp = head;
		int count = 0;
		while(temp!=null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	void yLinkedList(LinkedList list2) {
		int len1 = findLength();
		int len2 = list2.findLength();
		int k = len1 - len2;
	}

	void display() {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println();
	}
}
