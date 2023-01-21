package queue;

/**
 * Lousy implementation
 */
public class ArrayQueue {

    private int[] queue;
    private int first = -1;
    private int last = -1;

    public ArrayQueue(int size) {
        this.queue = new int[size];
    }

    /**
     * Adding at last
     * @param data
     * @return data
     */
    public int enqueue(int data) {
        int idx = last + 1;
        if(idx == queue.length) throw new IndexOutOfBoundsException();
        queue[idx] = data;
        last = idx;
        if(first == -1) first = last;
        return queue[idx];
    }

    /**
     * Removing from front
     * @return data
     */
    public int dequeue() {
        if(first == -1 || first > last) throw new IndexOutOfBoundsException();
        int data = queue[first];
        first = first + 1;
        return data;
    }

    public void clear() {
        first = -1;
        last = -1;
    }

    @Override
    public String toString() {
        StringBuilder queueStr = new StringBuilder("(FIRST)");
        for(int i=first; i<=last; i++)
            queueStr.append(queue[i]+(i != last ? "-" : "(LAST)"));
        return queueStr.toString();
    }
}
