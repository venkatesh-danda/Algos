package trees;

public class DemoBinaryTree {

	
	public static void main(String args[]) {
		BinaryTree tree = new BinaryTree();
		Node root = new Node(1);
		root.left = new Node(2);
		root.left.right = new Node(4);
		root.left.left = new Node(3);
		root.left.right.left = new Node(5);
		root.left.right.right = new Node(6);
		root.left.right.right.right = new Node(7);
		tree.leftView(root);
//>>>>>>> branch 'master' of https://github.com/venkatesh-danda/Algos.git
	}
}
