package trees;

public class Node {
	int data;
	Node left = null;
	Node right = null;
	Node next = null;
	Node(int data){
		this.data = data;
		left = right = next = null;
	}
}
