package ds;

public class BinarySearchTree {
	
	public class Node {
		
		public char data;
		public Node left;
		public Node right;
		
		public Node(char data) { this.data = data; }
		
		public String toString() {
			return String.valueOf(data);
		}
		
	}
	
	private static final String MSG_1 = "INSERTED WITH PARENT : ";
	private static final String MSG_2 = "CREATED THE ROOT NODE :  ";
	private static final String MSG_3 = "CAN'T INSERT CAUSE OF DUPLICATE VALUE";
	private static final String MSG_4 = "USER ERROR : WRONG DATA";
	
	public static final byte TRAVERSAL_PREORDER = 0;
	public static final byte TRAVERSAL_INORDER = 1;
	public static final byte TRAVERSAL_POSTORDER = 2;
	
	private Node root;
	
	public void insert(char data) {
		
		if(data < 'A' || data > 'Z') {
			return;
		}
	
		Node temp = new Node(data);
		
		if(root == null) {
			root = temp;
			System.out.println(MSG_2 + root.data);
		}
		else
			insert(data, root);
		
	}
	
	private void insert(char data, Node parent) {
		
		if(data < parent.data) {
			if(parent.left == null) {
				parent.left = new Node(data);
				System.out.println(MSG_1 + parent.data);
			} else {
				insert(data, parent.left);
			}
		} else if(data > parent.data){
			if(parent.right == null) {
				System.out.println(MSG_1 + parent.data);
				parent.right = new Node(data);
			} else {
				insert(data, parent.right);
			}
		} else {
			System.out.println(MSG_3);
		}
		
	}
	
	public void print(byte code) {
		if(code == TRAVERSAL_PREORDER)
			preOrder(root);
		else if(code == TRAVERSAL_INORDER)
			inOrder(root);
		else if(code == TRAVERSAL_POSTORDER)
			postOrder(root);
		else
			System.out.println(MSG_4);
	}
	
	private void preOrder(Node parent) {
		
		/* PARENT, LEFT, RIGHT*/
		if(parent != null) {
			System.out.print(parent + " ");
			preOrder(parent.left);
			preOrder(parent.right);
		}
		
	}
	
	private void inOrder(Node parent) {
		
		/*  LEFT, PARENT, RIGHT*/
		if(parent != null) {
			inOrder(parent.left);
			System.out.print(parent + " ");
			inOrder(parent.right);
		}
		
	}
	
	private void postOrder(Node parent) {
		
		/* LEFT, RIGHT, PARENT*/
		if(parent != null) {
			postOrder(parent.left);
			postOrder(parent.right);
			System.out.print(parent + " ");
		}
		
	}
	
	public boolean search(char data) {
		return root == null ? false : search(root, data);
	}
	
	private boolean search(Node parent, char data) {
		
		if(parent != null) {
			if(parent.data == data)
				return true;
			else if(data < parent.data)
				return search(parent.left, data);
			else
				return search(parent.right, data);
		}
		
		return false;
		
	}

}
