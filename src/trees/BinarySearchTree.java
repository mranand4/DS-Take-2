package trees;

import java.util.Queue;

public class BinarySearchTree {

	public class Node {
		private int data;
		private Node left;
		private Node right;

		Node() {
			this.left = null;
			this.right = null;
		}
		Node(int data) {
			this();
			this.data = data;
		}
	}

	Node root;

	public BinarySearchTree() {
		this.root = null;
	}
	public BinarySearchTree(int data) {
		this.root = new Node(data);
	}

	private Node insert(Node root, int data) {
		if(root == null) {
			return new Node(data);
		} else if(data <= root.data) {
			root.left = insert(root.left, data);
		} else {
			root.right = insert(root.right, data);
		}

		return root;
	}
	public Node insert(int data) {
		this.root = insert(this.root, data);
		return this.root;
	}

}
