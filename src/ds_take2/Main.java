/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_take2;

import ds_take2.doubly_linked_list.DoublyLinkedList;

/**
 *
 * @author hp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtEnd(0);
        dll.insertAtStart(2);
        dll.insertAtEnd(3);
        dll.insertAtStart(1);
        System.out.println(dll.getMin());
    }
    
}
