package trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
	
	

	boolean isBST(Node root) {
		if(root == null)
			return true;
		
		if((root.left != null && root.left.data > root.data) || 
				(root.right != null && root.right.data < root.data ))
			return false;
		
		if(!isBST(root.left) || !isBST(root.right))
			return false;
		
		return true;
	}
	void inOrderSuccessor(Node root, Node x) {
		if(root == null || x == null)
			System.out.println("-1");
		
		if(x.right != null) {
			Node temp = x.right;
			while(temp.left != null) {
				temp = temp.left;
			}
			System.out.println(temp.data);
		} else {
			Node ancestor = root;
			Node successor = null;
			
			while(ancestor != x) {
				if(x.data < ancestor.data) {
					successor = ancestor;
					ancestor = ancestor.left;
				} else {
					ancestor = ancestor.right;
				}
				
				if (successor != null)
					System.out.println(successor.data);
				else
					System.out.println("-1");
			}
		}
	}
	
	
	void lowestCommonAncestor(Node root, int x, int y) {
		if(root == null) {
			return;
		}
		if(x > root.data && y > root.data) 
			lowestCommonAncestor(root.right, x, y);
		else if(x < root.data && y < root.data) 
			lowestCommonAncestor(root.left, x, y);
		else
			System.out.println(root.data);
	}
	
	void nodeWithMinValue(Node root) {
		if(root == null)
			return;
		if(root.left == null)
			System.out.print(root.data);
		else {
			nodeWithMinValue(root.left);
		}
	}
	
	
	class Sum{
		 int sum = 0;
	}
	
	void addAllGreaterValuesUtil(Node root, Sum sum) {
		if(root == null) {
			return;
		}
		
		addAllGreaterValuesUtil(root.right, sum);
		
		root.data = root.data+sum.sum;
		sum.sum = root.data;
		
		addAllGreaterValuesUtil(root.left, sum);
	
	}
	
	void addAllGreaterValues(Node root) {
		Sum sum = new Sum();
		addAllGreaterValuesUtil(root,sum);
	}
	
	void inOrder(Node root) {
		
		if(root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}
	
	void levelOrder(Node root) {
		if(root == null) {
			return;
		}
		
		Node temp;
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		
		while(!q.isEmpty()) {
			temp = q.poll();
//			q.remove(); 
			
			System.out.print(temp.data + " ");
			
			if(temp.left != null)
				q.add(temp.left);
			if(temp.right != null)
				q.add(temp.right);
			
		}
	}
	Node insert(Node root,int key) {
		
		if(root == null)
			return new Node(key);
		if(root.data > key) {
			if(root.left == null){
				root.left = new Node(key);
				return root;
			}
			else {
				insert(root.left, key);
			}
		} else {
			if(root.right != null) {
				insert(root.right,key);
			}
			else {
				root.right = new Node(key);
				return root;
			}
		}
		return null;
	}
}
