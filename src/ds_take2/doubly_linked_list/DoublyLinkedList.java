/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_take2.doubly_linked_list;

/**
 *
 * @author hp
 */
public class DoublyLinkedList {
    
    private Node head;
    
    public DoublyLinkedList() {
        head = null;
    }
    
    public void insertAtStart(int data) {
        
        Node n = getNode(data);
        
        if(head == null) {
            head = n;
        } else {
            head.prev = n;
            n.next = head;
            head = n;
        }
        
    }
    
    public void insertAtEnd(int data) {
        
        Node n = getNode(data);
        
        if(head == null) {
            head = n;
        } else {
            Node curr = head;
            while(curr.next != null) {
                curr = curr.next;
            }
            n.prev = curr;
            curr.next = n;
        }
        
    }
        
    public void print() {
        Node curr = head;
        while(curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        } 
    }
    
    public void rprint() {
        
        Node curr = head;
        
        while(curr.next != null)
            curr = curr.next;
        
        while(curr != null) {
            System.out.println(curr.data);
            curr = curr.prev;
        }
        
    }
    
    private Node getNode(int data) {
 
        Node n = new Node();
        n.data = data;
        n.next = null;
        n.prev = null;
        
        return n;
        
    }
    
}
