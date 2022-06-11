package trees;

public class DemoTree {
	public static void main(String args[]) {
		BinaryTree tree = new BinaryTree();
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		System.out.println("Size : "+tree.size(root));
		System.out.println("Height : "+tree.height(root));
		
		tree.levelOrderTraversal(root);
		tree.leveOrderUsingQ(root);
		System.out.println();
		Node t = tree.connectInorder(root);
		while(t!=null) {
			System.out.print(t.data);
			t = t.next;
		}
	}
	
	

}
