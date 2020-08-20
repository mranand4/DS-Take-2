/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_take2;

import ds_take2.doubly_linked_list.DoublyLinkedList;

/**
 *
 * @author Shivansh Anand
 * @date   20th August, 2020
 * 
 */

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtEnd(0);
        dll.insertAtStart(2);
        dll.insertAtEnd(3);
        dll.insertAtStart(1);
        dll.set(2, 10);
        dll.removeAt(1);
        dll.print();
    }
    
}
