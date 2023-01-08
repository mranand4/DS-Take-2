package linkedlist;

public class LinkedList {
    public class Node {
        public int val;
        public Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node() {}
    }

    private Node head;

    public LinkedList() {
        head = null;
    }

    public LinkedList(int val) {
        head = new Node(val);
    }

    public void insertAtHead(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
    }

    public void insertAtTail(int val) {
        Node runner = head;

        while(runner.next != null) {
            runner = runner.next;
        }

        runner.next = new Node(val);
    }

    public void inertAt(int val, int idx) {
        if(idx == 0) {
            insertAtHead(val);
        }

        Node node = new Node(val);
        Node runner = head;
        int currIdx = 0;

        while(runner != null && currIdx < idx - 1) {
            runner = runner.next;
            currIdx++;
        }

        node.next = runner.next;
        runner.next = node;
    }

    public void show() {
        Node runner = head;
        StringBuilder sb = new StringBuilder();

        while(runner != null) {
            sb.append(runner.val);
            sb.append("-->");
            runner = runner.next;
        }
        sb.append(".");

        System.out.println(sb);
    }

}