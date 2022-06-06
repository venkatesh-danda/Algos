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
		if (head == null && tail == null) {
			head = tail = temp;
		} else {
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
		while (curr != null) {
			Node temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		head = prev;

	}

	// O(n) && O(n)
	Node left;

	boolean ispalindrome(Node right) {
		left = head;
		if (right == null) {
			return true;
		}
		boolean isp1 = ispalindrome(right.next);
		if (isp1 == false)
			return false;
		boolean res = left.data == right.data;
		left = left.next;
		return res;

	}

	Node mergeLinkedLists(LinkedList list2) {
		Node curr1 = head;
		Node curr2 = list2.head;
		LinkedList dummy = new LinkedList();
		dummy.head = null;
		Node temp = dummy.head;
		while (true) {
			if (curr1 == null) {
				temp.next = curr2;
				return dummy.head;
			}
			if (curr2 == null) {
				temp.next = curr1;
				return dummy.head;
			}
			if (curr1.data < curr2.data) {
				if (dummy.head == null) {
					dummy.head = curr1;
					temp = curr1;
				} else {
					temp.next = curr1;
					temp = temp.next;
				}
				curr1 = curr1.next;
			} else {
				if (dummy.head == null) {
					dummy.head = curr2;
					temp = curr2;
				} else {
					temp.next = curr2;
					temp = temp.next;
				}
				curr2 = curr2.next;
			}
		}
	}

	void isSubset(LinkedList list2) {

	}

	void breakLoop() {
		Node fast = head.next;
		Node slow = head;
		while (fast != slow && fast != null) {
			if (fast.next.next == slow.next) {
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
		while (temp.next != loop) {
			k++;
			temp = temp.next;
		}

		Node ptr1 = head;
		Node ptr2 = head;
		for (int i = 0; i < k; i++) {
			ptr2 = ptr2.next;
		}

		while (true) {
			if (ptr1.next == ptr2.next) {
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

		while (true) {
			ptr2 = loop_node;
			while (ptr2.next != loop_node && ptr2.next != ptr1) {
				ptr2 = ptr2.next;
			}

			if (ptr2.next == ptr1) {
				ptr2.next = null;
				System.out.println("Remove Loop" + ptr2.data + "Loop Node" + loop_node + " " + ptr2);
				break;
			}
			ptr1 = ptr1.next;
		}
	}

	void detectLoop() {
		Node slow = head;
		Node fast = head;

		while (slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				System.out.println("Loop Found");
				removeLoop2(slow);

			}
		}

	}

	void middleOfLinkedList() {
		Node slow = head;
		Node fast = head;
		while (fast != null) {
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
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	void yLinkedList(LinkedList list2) {
		int len1 = findLength();
		int len2 = list2.findLength();
		Node temp1 = head;
		Node temp2 = list2.head;
		int k = 0;
		if (len1 > len2) {
			k = len1 - len2;
			for (int i = 0; i < k; i++) {
				temp1 = temp1.next;
			}
		} else {
			k = len2 - len1;
			for (int i = 0; i < k; i++) {
				temp2 = temp2.next;
			}
		}

		while (temp1 != null && temp2 != null) {
			if (temp1.next == temp2.next) {
				temp1.next = null;
				break;
			}
			temp1 = temp1.next;
			temp2 = temp2.next;
		}
	}

	void display() {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println();
	}

	void deleteAlternateNodes() {
		Node temp = head;
		while (temp != null && temp.next != null) {
			Node n = temp.next;
			temp.next = temp.next.next;
			n.next = null;
			temp = temp.next;
		}
	}

	void rotateByKElements(int k) {
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = head;

		temp = temp.next;

		int c = 1;
		while (c < k) {
			temp = temp.next;
			c++;
		}

		head = temp.next;
		temp.next = null;

		tail = temp;
	}

	Node reverseInGroups(Node h, int k) {
		int c = 0;
		Node prev = null;
		Node curr = h;
		Node next = null;
		if (h == null)
			return null;
		while (c < k && curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			c++;
		}
		h.next = reverseInGroups(next, k);
		this.head = prev;
		return this.head;

	}

	Node reverseInGroupsAlter(Node h, int k) {
		int c = 0;
		Node prev = null;
		Node curr = h;
		Node next = null;
		if (h == null)
			return null;
		while (c < k && curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			c++;
		}
//		System.out.println("Break");

		if (curr == null)
			return prev;
		Node tp = prev;
		h.next = curr;

//		System.out.println("D "+h.data+" "+curr.data);
		c = 0;
		while (c < k && curr != null) {
			prev = curr;
			curr = curr.next;
			c++;
		}
//		System.out.println("E "+curr.data+" "+prev.data+" "+tp.data);
		prev.next = reverseInGroupsAlter(curr, k);
		this.head = tp;
		return this.head;

	}
	
	Node InstertNodeAtBeginning(Node head,int data) {
		Node node = new Node();
		node.data = data;
		node.next = head;
		head = node;
		return head;
	}
	
	Node res = null;
	Node sumOfTwoListUtil(Node head1, Node head2, int carry) {
		int sum = 0;
		int act = 0;
		if(head1 == null && head2 == null) {
			if(carry == 0)
				return null;
			res = InstertNodeAtBeginning(res,carry);
			return res;
		}
		if(head1 == null) {
			sum = head2.data + carry;
			head1 = new Node();
		}
		else if(head2 == null) {
			sum = head1.data+carry;
			head2 = new Node();
		}
		else {
			sum = head1.data+head2.data+carry;
		}
		act = (sum)%10;
		carry = sum/10;
		res = InstertNodeAtBeginning(res,act);
		sumOfTwoListUtil(head1.next,head2.next,carry);
		return res;
	}
	void swap(Node a, Node b, Node ap, Node bp) {
		if (ap == null) {
			Node tn = b.next;
			b.next = head.next;
			head = b;
			bp.next = a;
			a.next = tn;
		}
		Node t = a;
		Node tn = b.next;
		ap.next = b;
		b.next = t.next;
		bp.next = t;
		t.next = tn;
	}
	void printNthFromLast(Node head, int n)
	{
		int i = 0;

		if (head == null)
			return;
		printNthFromLast(head.next, n);

		if (++i == n)
			System.out.print(head.data);
	}

	// This code is contributed by rutvik_56.

	void sort0s1s2s() {
		Node trail = tail;
		Node prev = null;
		Node curr = head;
		while (curr != null) {
			if (curr == head) {
				if (curr.data == 0 || curr.data == 1) {
					prev = curr;
					curr = curr.next;
				} else {
					tail.next = head;
					tail = head;
					tail.next = null;
				}
			} else {
				if (curr.data == 0) {
					prev.next = curr.next;
					curr.next = head;
					head = curr;
					curr = prev.next;
				} else if (curr.data == 1) {
					prev = curr;
					curr = curr.next;
				} else {
					if(curr == trail)
						break;
					prev.next = curr.next;
					tail.next = curr;
					tail = curr;
					tail.next = null;
					curr = prev.next;
					if(curr.data == 2) {
						prev = curr;
						curr = curr.next;
					}
				}
			}

		}
	}

}