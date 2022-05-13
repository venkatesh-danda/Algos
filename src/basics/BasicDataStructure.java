package basics;

class Node{
	int length;
	int breadth;
}
public class BasicDataStructure {
	public static void main(String args[]) {
		Node n = new Node();
		n.length = 10;
		n.breadth = 5;
		System.out.print(n.length*n.breadth);
		
	}
}
