package trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	int size(Node root) {
		if (root == null)
			return 0;
		return size(root.left) + 1 + size(root.right);
	}

	int height(Node root) {
		if (root == null)
			return 0;
		int ldepth = height(root.left);
		int rdepth = height(root.right);
		if (ldepth > rdepth)
			return ldepth + 1;
		return rdepth + 1;
	}

	void inorder(Node root) {
		if (root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}

	void preorder(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		inorder(root.left);
		inorder(root.right);
	}

	void postorder(Node root) {
		if (root == null) {
			return;
		}
		inorder(root.left);
		inorder(root.right);
		System.out.print(root.data + " ");

	}

	int diameter(Node root) {
		if (root == null)
			return 0;
		int lheight = height(root.left);
		int rheight = height(root.right);

		return 1 + Math.max((lheight + rheight), Math.max(diameter(root.left), diameter(root.right)));
	}

	void levelorder(Node root, int i) {
		if (root == null)
			return;
		if (i == 1)
			System.out.print(root.data);
		levelorder(root.left, i - 1);
		levelorder(root.right, i - 1);
	}

	Node temp = null;

	Node connectInorder(Node root) {
		if (root != null) {
			connectInorder(root.right);
			root.next = temp;
			temp = root;
			connectInorder(root.left);
		}
		return temp;
	}

	void levelOrderTraversal(Node root) {
		int height = height(root);

		for (int i = 1; i <= height; i++)
			levelorder(root, i);
		System.out.println();
	}

	void leveOrderUsingQ(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while (!q.isEmpty()) {
			Node temp = q.poll();
			System.out.print(temp.data);
			if (temp.left != null) {
				q.add(temp.left);
			}
			if (temp.right != null) {
				q.add(temp.right);
			}
		}
	}

	void connectLevelorder(Node root) {
		if (root != null) {
			root.next = null;
		}

		while (root != null) {
			Node q = root;
			while (q != null) {
				if (q.left != null) {
					if (q.right != null) {
						q.left.next = q.right;
					} else {
						q.left.next = getNext(q);
					}
				}
				if (q.right != null) {
					q.right.next = getNext(q);
				}
				q = q.next;
			}
			if (root.left != null) {
				root = root.left;
			} else if (root.right != null) {
				root = root.right;
			} else {
				root = getNext(root);

			}
		}
	}

	Node getNext(Node root) {
		root = root.next;
		while (root != null) {
			if (root.left != null) {
				return root.left;
			}
			if (root.right != null) {
				return root.right;
			}
			root = root.next;
		}
		return null;
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
