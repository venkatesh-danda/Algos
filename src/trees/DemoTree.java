package trees;

public class DemoTree {
	public static void main(String args[]) {
		BinaryTree tree = new BinaryTree();
		Node root = tree.insert(null,1);
		tree.insert(root,2);
		tree.insert(root,3);
//		System.out.println(root.left.data);
		tree.insert(root,4);
		tree.insert(root,5);
		tree.insert(root,6);
		tree.insert(root,7);
		tree.insert(root,8);
		tree.insert(root,9);
		tree.insert(root,10);
		
//		tree.deletexxj(root, 9);
//		tree.inorder(root);
//		System.out.println();
		tree.levelOrder(root);
		System.out.println("\nSize : "+tree.sizeofTree(root));
		System.out.println("Height : " + tree.heightOfTree(root));
		System.out.println("Diameter : " + tree.diameterOfTree(root));
		System.out.print("MaxWidth : "+tree.getMaxWidth(root));
		System.out.println();
		tree.kDistanceFromroot(root, 3);
		System.out.println();
		tree.leftView(root);
	}
}
