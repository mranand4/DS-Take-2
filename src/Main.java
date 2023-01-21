import linkedlist.LinkedList;
import linkedlist.Queue;
import practice.MathOps;
import practice.RecursiveProblems;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(3);
        queue.enqueue(2);
        System.out.println(queue.toString());
        queue.dequeue();
        System.out.println(queue.toString());
    }


}

