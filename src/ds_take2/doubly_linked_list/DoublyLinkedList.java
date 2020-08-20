/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_take2.doubly_linked_list;

/**
 *
 * @author Shivansh Anand
 * @date   20th August, 2020
 * 
 */

public class DoublyLinkedList {
    
    private Node head;
    
    public DoublyLinkedList() {
        head = null;
    }
    
    private Node getNode(int data) {
 
        Node n = new Node(data, null, null);       
        return n;  
        
    }
    
    public void insertAtStart(int data) {
        
        Node n = getNode(data);
        
        if(head == null) {
            head = n;
        } else {
            head.setPrev(n);
            n.setNext(head);
            head = n;
        }
        
    }
    
    public void insertAtEnd(int data) {
        
        Node n = getNode(data);
        
        if(head == null) {
            head = n;
        } else {
            Node curr = head;
            while(curr.getNext() != null) {
                curr = curr.getNext();
            }
            n.setPrev(curr);
            curr.setNext(n);
        }
        
    }
        
    public void print() {
        Node curr = head;
        while(curr != null) {
            System.out.println(curr.getData());
            curr = curr.getNext();
        } 
    }
    
    public void rprint() {
        
        Node curr = head;
        
        while(curr.getNext() != null)
            curr = curr.getNext();
        
        while(curr != null) {
            System.out.println(curr.getData());
            curr = curr.getPrev();
        }
        
    }
    
    public int getMax() {
        
        if(head == null) {
            return 0;
        }
        
        int max = head.getData();
        Node curr = head;
        
        while(curr != null) {
            if(curr.getData() > max)
                max = curr.getData();
            curr = curr.getNext();
        }
        
        return max;
    }
    
    public int getMin() {
        
        if(head == null) {
            return 0;
        }
        
        int min = head.getData();
        Node curr = head;
        
        while(curr != null) {
            if(curr.getData() < min)
                min = curr.getData();
            curr = curr.getNext();
        }
        
        return min;
    }
    
    public int size() {
        
        int size = 0;
        Node curr = head;
        
        while(curr != null) {
            curr = curr.getNext();
            size++;
        }
        
        return size;
        
    }
    
    // returns index of element n
    public int find(int n) {
        
        int index = 0;       
        Node curr = head;
        
        while(curr != null) {
            if(curr.getData() == n)
                return index;
            index++;
            curr = curr.getNext();
        }
        
        return -1;
        
    }
    
    //returns element at index 
    public int get(int index) {
        
        int i = 0;
        Node curr = head;
        
        while(curr != null) {
            if(index == i)
                return curr.getData();
            i++;
            curr = curr.getNext();
        }
        
        return -1;
        
    }
    
      
}
