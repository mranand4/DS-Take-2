import linkedlist.LinkedList;
import practice.MathOps;
import practice.RecursiveProblems;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        LinkedList ll = new LinkedList(1);
        ll.insertAtTail(3);
        ll.insertAtTail(4);
        ll.inertAt(2, 1);
        ll.inertAt(5, 4);
        ll.inertAt(6, 3);
        ll.show();
        ll.removeAtPosFromEnd(3);
        ll.show();
    }


}

