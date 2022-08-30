package linkedlist;

public class LinkedList {

	public class Node {

		private int data;
		private Node next;

		public Node() {
		}

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}

		public void setData(int data) {
			this.data = data;
		}

		public void setNextNode(Node next) {
			this.next = next;
		}

		public int getData() {
			return this.data;
		}

		public Node getNextNode() {
			return this.next;
		}

	}

	private Node head;
	private int length;

	public LinkedList() {
		head = null;
		length = 0;
	}

	public void insert(int data) {

		Node newNode = new Node(data, null);

		if (head == null) {
			head = newNode;
		} else {
			Node curr = head;
			while (curr.getNextNode() != null)
				curr = curr.getNextNode();
			curr.setNextNode(newNode);
		}

		length++;

	}

	public void insertAtEnd(int data) {

		Node newNode = new Node(data, null);

		if (head == null) {
			head = newNode;
		} else {
			Node curr = head;
			while (curr.getNextNode() != null) {
				curr = curr.getNextNode();
			}
			curr.setNextNode(newNode);
		}

		length++;

	}

	public void insertAt(int data, int index) {

		if (index > length || index < 0) {

		} else if (index == length) {
			insertAtEnd(data);
		} else if (index == 0) {
			Node newNode = new Node(data, head);
			head = newNode;
		} else {

			Node prev = head;
			Node curr = head;
			int i = 0;

			while (curr != null) {

				if (i == index) {
					Node newNode = new Node(data, curr);
					prev.setNextNode(newNode);
					break;
				}

				prev = curr;
				curr = curr.getNextNode();
				i++;
			}
		}
	}

	public boolean remove(int index) {

		if (index >= length || index < 0 || length == 0)
			return false;

		if (index == 0) {
			head = head.getNextNode();
			length--;
			return true;
		}

		int i = 0;
		Node prev = head;
		Node temp = head;

		while (temp != null) {

			if (i == index) {
				Node nextNode = temp.getNextNode();
				prev.setNextNode(nextNode);
				break;
			}

			prev = temp;
			temp = temp.getNextNode();
			i++;

		}

		length--;
		return true;

	}

	// search and get element
	public int find(int n) {

		Node temp = head;
		int index = 0;

		while (temp != null) {
			if (temp.getData() == n)
				return index;
			temp = temp.getNextNode();
			index++;
		}

		return -1;
	}

	public int get(int index) {

		if (index < 0 || index >= length)
			return -1;

		int i = 0;
		Node temp = head;

		while (temp != null) {
			if (i == index) {
				return temp.getData();
			}
			temp = temp.getNextNode();
			i++;
		}

		return -1;

	}

	public int getLength() {
		return length;
	}

	public void print() {

		Node curr = head;
		while (curr.getNextNode() != null) {
			System.out.print(curr.getData() + " -> ");
			curr = curr.getNextNode();
		}
		System.out.println(curr.getData());

	}

	public void sort() {

		Node curr = head;

		while (curr.getNextNode() != null) {

			Node traveler = curr.getNextNode();

			while (traveler != null) {

				if (traveler.getData() < curr.getData()) {
					int temp = curr.getData();
					curr.setData(traveler.getData());
					traveler.setData(temp);
				}

				traveler = traveler.getNextNode();

			}

			curr = curr.getNextNode();

		}

	}

	public void reverse() {

		Node prev = null;
		Node curr = head;

		while (curr != null) {

			Node next = curr.getNextNode();
			curr.setNextNode(prev);
			prev = curr;
			curr = next;

			if (curr == null)
				head = prev;

		}

	}

}
