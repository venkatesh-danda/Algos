package trees;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;

public class BinaryTree {

	void boundaryTraversal(Node root) {
		if (root == null) {
			return;
		}

		System.out.println(root.data);
		leftView(root.left);
		printLeaves(root);
		rightView(root.right);
	}

	void leftView(Node root) {
		if (root == null)
			return;
		if (root.left != null) {
			System.out.print(root.data + " ");
			leftView(root.left);
		} else if (root.right != null) {
			System.out.print(root.data + " ");
		}
	}

	void printLeaves(Node root) {
		if(root == null) {
			return;
		}
		
		if(root.left == null && root.right == null) {
			System.out.print(root.data+" ");
		}
		
		printLeaves(root.left);
		printLeaves(root.right);
	}

	void rightView(Node root) {
		if (root == null)
			return;
		if (root.right != null) {
			rightView(root.right);
			System.out.print(root.data + " ");
		} else if (root.left != null) {
			leftView(root.left);
			System.out.print(root.data + " ");
		}
	}

	void verticalSum(Node root) {
		TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();
		VerticalSumUtil(root, tm, 0);

		if (tm != null)
			System.out.println(tm.entrySet());
	}

	void VerticalSumUtil(Node root, TreeMap<Integer, Integer> tm, int h) {
		if (root == null) {
			return;
		}
		int add = tm.get(h) == null ? 0 : tm.get(h);
		tm.put(h, root.data + add);

		VerticalSumUtil(root.left, tm, h - 1);
		VerticalSumUtil(root.right, tm, h + 1);
	}

	void reverseLevelOrder(Node root) {
		if (root == null)
			return;
		Queue<Node> q = new LinkedList<Node>();
		Stack<Node> s = new Stack<Node>();
		q.add(root);
		while (!q.isEmpty()) {
			Node temp = q.peek();
			q.remove();
			s.push(temp);
			if (temp.left != null)
				q.add(temp.left);
			if (temp.right != null)
				q.add(temp.right);
		}

		while (!s.isEmpty()) {
			Node temp = s.peek();
			s.pop();
			System.out.print(temp.data + " ");
		}
	}

	void imOrderSpiral(Node root) {
		if (root == null) {
			return;
		}
		Stack<Node> s1 = new Stack<Node>();
		Stack<Node> s2 = new Stack<Node>();

		while (!s1.isEmpty() || !s2.isEmpty()) {
			Node temp = null;
			while (!s1.isEmpty()) {
				temp = s1.peek();
				s1.pop();
				System.out.print(temp.data + " ");
				if (temp.right != null)
					s2.push(temp.right);
				if (temp.left != null)
					s2.push(temp.right);
			}
			while (!s2.isEmpty()) {
				temp = s2.peek();
				s2.pop();
				System.out.println(temp.data);
				if (temp.left != null)
					s1.push(temp.left);
				if (temp.right != null)
					s1.push(temp.right);
			}
		}
	}

	int sizeofTree(Node root) {
		if (root == null) {
			return 0;
		}

		return 1 + sizeofTree(root.right) + sizeofTree(root.left);
	}

	int heightOfTree(Node root) {

		if (root == null) {
			return 0;
		}

		return 1 + Math.max(heightOfTree(root.left), heightOfTree(root.right));
	}

	int diameterOfTree(Node root) {
		if (root == null) {
			return 0;
		}
		int lheight = heightOfTree(root.left);
		int rheight = heightOfTree(root.right);

		int x = 1 + lheight + rheight;
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
		Node last = null;

		while (!q.isEmpty()) {
			temp = q.peek();
			q.remove();
			if (temp.data == key) {
				keyNode = temp;
			}
			if (temp.left != null) {
				last = temp;
				q.add(temp.left);
			}
			if (temp.right != null) {
				last = temp;
				q.add(temp.right);
			}
		}

		if (keyNode != null) {
			keyNode.data = temp.data;
			if (last.right != null)
				last.right = null;
			else {
				last.left = null;
			}
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

	int getMaxWidth(Node root) {

		if (root == null) {
			return 0;
		}

		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		int maxWidth = 0;
		int width = 0;
		while (!q.isEmpty()) {
			int count = q.size();
			Node temp = null;
			width = 0;
			while (count > 0) {
				temp = q.peek();
				q.remove();
				count--;
				width += 1;
				if (temp.left != null)
					q.add(temp.left);
				if (temp.right != null)
					q.add(temp.right);
			}
			if (width > maxWidth)
				maxWidth = width;
		}
		return maxWidth;
	}

	boolean isIdentical(Node root1, Node root2) {
		if (root1 == null && root2 == null) {
			return true;
		}
		if (root1 != null && root2 != null)
			return (root1.data == root2.data && isIdentical(root1.left, root2.left)
					&& isIdentical(root1.right, root2.right));
		return false;
	}

	void inorderSuccessor(Node root) {
		if (root == null) {

		}
	}

	Node getNext(Node q) {
		Node temp = q.next;
		if (temp != null) {
			if (temp.left != null)
				return temp.left;
			if (temp.right != null)
				return temp.right;
			temp = temp.next;
		}

		return null;
	}

	void connectLevelOrder(Node root) {
		if (root == null) {
			return;
		}
		root.next = null;
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
				if (q.right != null)
					q.right.next = getNext(q);

				q = q.next;
			}
			if (root.left != null) {
				root = root.left;
			} else if (root.right != null)
				root = root.right;
			else
				root = getNext(root);
		}
	}
}
