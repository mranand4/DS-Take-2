package linkedlist;

public class LinkedList {
    public class Node {
        public int val;
        public Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }

        public Node() {
            this.next = null;
        }
    }

    private Node head;

    public LinkedList() {
        head = null;
    }

    public LinkedList(int val) {
        head = new Node(val);
    }

    public int size() {
        Node runner = head;
        int size = 0;

        while (runner != null) {
            runner = runner.next;
            size++;
        }

        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void show() {
        Node runner = head;
        StringBuilder sb = new StringBuilder();

        while (runner != null) {
            sb.append(runner.val);
            sb.append("-->");
            runner = runner.next;
        }
        sb.append(".");

        System.out.println(sb);
    }

    public void insertAtHead(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
    }

    public void insertAtTail(int val) {
        Node runner = head;

        while (runner.next != null) {
            runner = runner.next;
        }

        runner.next = new Node(val);
    }

    public void inertAt(int val, int idx) {
        if (idx == 0) {
            insertAtHead(val);
        }

        if (idx > size()) {
            return;
        }

        Node node = new Node(val);
        Node runner = head;

        /**
         * Travelling till node@[idx - 1].
         * After this loop, runner will point at node@[idx-1] i.e. node before node@[idx]
         */
        while (runner != null && --idx > 0) {
            runner = runner.next;
        }

        /**
         * Inserting node with value 'val' between node at index idx and node before it.
         */
        node.next = runner.next;
        runner.next = node;
    }

    public int valueAt(int idx) {
        Node runner = head;

        /**
         * Travelling till node at index idx.
         */
        while (idx-- > 0) {
            runner = runner.next;
        }

        return runner.val;
    }

    public void removeHead() {
        if (head != null) head = head.next;
    }

    public void removeTail() {
        Node runner = head;

        /**
         * Travelling till node before tail.
         */
        while (runner.next.next != null) {
            runner = runner.next;
        }

        runner.next = null;
    }

    public void removeAt(int idx) {
        if (idx < size()) {
            if (idx == 0) {
                removeHead();
            } else {
                Node runner = head;
                /**
                 * Travelling to node at index [idx-1] i.e. node before the node which is going to be deleted.
                 */
                while (runner != null && --idx > 0) {
                    runner = runner.next;
                }

                runner.next = runner.next.next;
            }
        }
    }

    public void removeAtPosFromEnd(int pos) {
        /**
         * To do this in one pass, we have to use a trick.
         * The trick is to maintain two pointers - 1. fast , 2. slow
         * Move the fast pointer to position pos + 1 from beginning of the list.
         * Now, move both fast and slow pointer forward by 1 until fast pointer becomes null
         * When the fast pointer points to null i.e. has reached then end of the list,
         * slow pointer will point the the node just behind the position pos.
         */
        Node fast = head;
        Node slow = head;

        /**
         * Moving fast pointer to post + 1
         */
        for (int i = 0; i <= pos; i++) {
            fast = fast.next;
        }

        /**
         * Moving both slow and fast pointers forward till fast points to end of list.
         * After this loop, slow pointer points to node at pos from end.
         */
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
    }

    public void reverse() {
        //TODO
    }

}