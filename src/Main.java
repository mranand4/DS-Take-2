import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

import ds.LinkedList;

public class Main {

	public static void main(String args[]) throws IOException {

		LinkedList ll = new LinkedList();
		ll.insert(1);
		ll.insert(2);
		ll.print();
		ll.insert(10);
		ll.insertAtEnd(12);
		ll.print();
		ll.remove(2);
		ll.print();
		ll.insertAtEnd(14);
		ll.insertAt(3, 0);
		ll.print();
		ll.sort();
		ll.print();

	}

}
