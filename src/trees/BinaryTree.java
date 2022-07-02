package trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	int sizeofTree(Node root) {
		if (root == null) {
			return 0;
		}

		return 1 + sizeofTree(root.right) + sizeofTree(root.left);
	}
	
	int heightOfTree(Node root) {
		
		if(root == null) {
			return 0;
		}
		
		return 1 + Math.max(heightOfTree(root.left), heightOfTree(root.right));
	}

	int diameterOfTree(Node root) {
		if(root == null) {
			return 0;
		}
		int lheight = heightOfTree(root.left);
		int rheight = heightOfTree(root.right);
		
		int x = 1+lheight+rheight;
		int y = Math.max(diameterOfTree(root.left), diameterOfTree(root.right));
		return Math.max(x, y);	
	}
	
	
	Node insert(Node root, int key) {
		if (root == null) {
			root = new Node(key);
		} else {
			Queue<Node> q = new LinkedList<Node>();
			q.add(root);
			Node temp;
			while (!q.isEmpty()) {
				temp = q.peek();
				q.remove();

				if (temp.left != null) {
					q.add(temp.left);
				} else {
					temp.left = new Node(key);
					break;
				}
				if (temp.right != null) {
					q.add(temp.right);
				} else {
					temp.right = new Node(key);
					break;
				}
			}
		}
		return root;
	}

	Node delete(Node root, int key) {

		if (root == null) {
			return null;
		}
		if (root.left == null && root.right == null && root.data == key) {
			return null;
		}
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		Node temp = null;
		Node keyNode = null;

		while (!q.isEmpty()) {
			temp = q.peek();
			q.remove();
			if (temp.data == key) {
				keyNode = temp;
			}
			if (temp.left != null) {
				q.add(temp.left);
			}
			if (temp.right != null) {
				q.add(temp.right);
			}
		}

		if (keyNode != null) {
			keyNode.data = temp.data;
			temp = null;
		}
		return root;
	}

	void inorder(Node root) {
		if (root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}

	void levelOrder(Node root) {
		if (root == null) {
			return;
		}
		Node temp;
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);

		while (!q.isEmpty()) {
			temp = q.peek();
			q.remove();

			System.out.print(temp.data + " ");

			if (temp.left != null) {
				q.add(temp.left);
			}
			if (temp.right != null) {
				q.add(temp.right);
			}
		}
	}
}
