package trees;

public class BinaryTree {

	int size(Node root) {
		if(root == null)
			return 0;
		return size(root.left) + 1 + size(root.right);
	}
	int height(Node root) {
		if(root == null)
			return 0;
		int ldepth = height(root.left);
		int rdepth = height(root.right);
		if(ldepth > rdepth)
			return ldepth + 1;
		return rdepth + 1;
	}
	void inorder(Node root) {
		if(root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	void preorder(Node root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data+" ");
		inorder(root.left);
		inorder(root.right);
	}
	void postorder(Node root) {
		if(root == null) {
			return;
		}
		inorder(root.left);
		inorder(root.right);
		System.out.print(root.data+" ");

	}
	void levelOrderTraversal() {
		
	}
	void zigazagTraversal() {

	}
	void printNodesInALevel() {

	}
	void printNoOfLeafNodes() {

	}
	void isSkewed() {

	}
	void printSuccesor() {

	}
	void printPredecessor() {

	}
	void MorisBinaryThreadedTree() {

	}
	void insertion() {
		
	}
	void deletion() {
		
	}
}
