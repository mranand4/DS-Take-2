import queue.ArrayQueue;

public class Main {

    public static void main(String args[]) {

        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(1);
        queue.enqueue(3);
        queue.enqueue(2);
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
        queue.enqueue(6);
        queue.enqueue(7);
        System.out.println(queue);

    }


}

