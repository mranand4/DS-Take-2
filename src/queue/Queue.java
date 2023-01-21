package queue;

import java.util.NoSuchElementException;

public class Queue {

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node first;
    Node last;

    /**
     * Adds element to last of the list in O(1) time.
     *
     * @param data
     * @return data
     */
    public int enqueue(int data) {
        Node node = new Node(data);

        if(last != null) last.next = node;

        last = node;

        //Element enqueued was the first element of the queue.
        if(first == null) first = last;

        return data;
    }

    public int dequeue() {
        if(first == null) throw new NoSuchElementException();

        int data = first.data;

        first =  first.next;

        /**
         * element removed was the last element in the queue,
         * when it was removed first points to null but Node last was still pointing to it,
         * so we explicitly set next of last node to null as it should be
         */
        if(first == null) last = null;

        return data;
    }

    public int peek() {
        if(first == null) throw new NoSuchElementException();
        return first.data;
    }

    public boolean isEmpty() {
        return first == null;
    }


    @Override
    public String toString() {
        Node start = first;
        StringBuilder queueStr = new StringBuilder("(FIRST)");

        while(start != null) {
            queueStr.append(start.data + (start.next == null ? "" : "-"));
            start = start.next;
        }

        return queueStr.append("(LAST)").toString();
    }
}
