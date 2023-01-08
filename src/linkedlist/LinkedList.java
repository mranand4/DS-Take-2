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

    public int size() {
        Node runner = head;
        int size = 0;

        while(runner != null) {
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

        while(runner != null) {
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

        while(runner.next != null) {
            runner = runner.next;
        }

        runner.next = new Node(val);
    }

    public void inertAt(int val, int idx) {
        if(idx == 0) {
            insertAtHead(val);
        }

        if(idx > size()) {
            return;
        }

        Node node = new Node(val);
        Node runner = head;

        /**
         * Travelling till node@[idx - 1].
         * After this loop, runner will point at node@[idx-1] i.e. node before node@[idx]
         */
        while(runner != null && --idx > 0) {
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
        while(idx-- > 0) {
            runner = runner.next;
        }

        return runner.val;
    }

    public void removeHead() {
        if(head != null) head = head.next;
    }

    public void removeTail() {
        Node runner = head;

        /**
         * Travelling till node before tail.
         */
        while(runner.next.next != null) {
            runner = runner.next;
        }

        runner.next = null;
    }

    public void removeAt(int idx) {
        if(idx < size()) {
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
}