package ds;

public class DoublyLinkedList {

	public class Node {

		private int data;
		private Node next;
		private Node prev;

		public Node(int data, Node next, Node prev) {
			this.data = data;
			this.next = next;
			this.prev = prev;
		}

		public Node() {
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public Node getPrev() {
			return prev;
		}

		public void setPrev(Node prev) {
			this.prev = prev;
		}

	}

	private Node head;

	public DoublyLinkedList() {
		head = null;
	}

	// creates and returns a new node with prev and next as null
	private Node getNode(int data) {

		Node n = new Node(data, null, null);
		return n;

	}

	// inserts new node at beginning of the list;
	public void insertAtStart(int data) {

		Node n = getNode(data);

		if (head == null) {
			head = n;
		} else {
			head.setPrev(n);
			n.setNext(head);
			head = n;
		}

	}

	// inserts new node at end of the list
	public void insertAtEnd(int data) {

		Node n = getNode(data);

		if (head == null) {
			head = n;
		} else {
			Node curr = head;
			while (curr.getNext() != null) {
				curr = curr.getNext();
			}
			n.setPrev(curr);
			curr.setNext(n);
		}

	}

	// prints the list ( beginning to end )
	public void print() {
		Node curr = head;
		while (curr != null) {
			System.out.println(curr.getData());
			curr = curr.getNext();
		}
	}

	// prints the list ( end to beginning )
	public void rprint() {

		Node curr = head;

		while (curr.getNext() != null)
			curr = curr.getNext();

		while (curr != null) {
			System.out.println(curr.getData());
			curr = curr.getPrev();
		}

	}

	// returns the maximum element in the list ( if list is empty it returns 0 )
	public int getMax() {

		if (head == null) {
			return 0;
		}

		int max = head.getData();
		Node curr = head;

		while (curr != null) {
			if (curr.getData() > max)
				max = curr.getData();
			curr = curr.getNext();
		}

		return max;
	}

	// returns the minimum element in the list ( if list is empty it returns 0 )
	public int getMin() {

		if (head == null) {
			return 0;
		}

		int min = head.getData();
		Node curr = head;

		while (curr != null) {
			if (curr.getData() < min)
				min = curr.getData();
			curr = curr.getNext();
		}

		return min;
	}

	// returns the current size of the list
	public int size() {

		int size = 0;
		Node curr = head;

		while (curr != null) {
			curr = curr.getNext();
			size++;
		}

		return size;

	}

	// searches for an element and returns it's index if found, if element is not
	// found it returns -1;
	public int find(int n) {

		int index = 0;
		Node curr = head;

		while (curr != null) {
			if (curr.getData() == n)
				return index;
			index++;
			curr = curr.getNext();
		}

		return -1;

	}

	// returns element at given index, if index is invalid it returns -1
	public int get(int index) {

		int i = 0;
		Node curr = head;

		while (curr != null) {
			if (index == i)
				return curr.getData();
			i++;
			curr = curr.getNext();
		}

		return -1;

	}

	// sets a value at a particular index
	public int set(int index, int value) {

		int i = 0;
		Node curr = head;

		while (curr != null) {
			if (index == i) {
				curr.setData(value);
				return i;
			}
			i++;
			curr = curr.getNext();
		}

		return -1;
	}

	// removes the element at a particular index
	public int removeAt(int index) {

		if (index == 0) {
			head = head.getNext();
			return index;
		}

		int i = 0;
		Node curr = head;

		while (curr != null) {
			if (i == index) {
				Node p = curr.getPrev();
				Node n = curr.getNext();
				p.setNext(n);
				n.setPrev(p);
				curr = null;
				return i;
			}
			i++;
			curr = curr.getNext();
		}

		return -1;
	}

	// returns list as an int array
	public int[] getAsArray() {

		int arr[] = new int[size()];

		int i = 0;
		Node curr = head;

		while (curr != null) {
			arr[i] = curr.getData();
			i++;
			curr = curr.getNext();
		}

		return arr;

	}

	// checks if the list is empty
	public boolean isEmpty() {
		return head == null;
	}

	// empties the list
	public void clear() {
		head = null;
	}

}