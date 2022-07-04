package trees;

public class DemoBinarySerchTree {
	public static void main(String[] args) {
		BinarySearchTree BST = new BinarySearchTree();
//		Node root = BST.insert(null,10);
//		BST.insert(root, 9);
//		BST.insert(root, 15);
//		BST.insert(root, 8);
//		BST.insert(root, 16);
//		BST.insert(root, 18);
		Node root = new Node(20);
		root.left = new Node(8);
		root.right = new Node(22);
		root.left.left = new Node(4);
		root.left.right = new Node(12);
		root.left.right.left = new Node(10);
		root.left.right.right = new Node(14);

		BST.levelOrder(root);
		System.out.println();
//		BST.addAllGreaterValues(root);
		BST.levelOrder(root);
		System.out.println();
		BST.nodeWithMinValue(root);
		System.out.println();
		BST.lowestCommonAncestor(root, 10, 14);
	}
}
