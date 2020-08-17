public class Stack {
  
  private Node head;
  
  public Stack() {
    head = null;
  }
  
  public Stack(Node n) {
    head = null;
    push(n);
  }
  
  public void push(Node n) {
    n.setNextNode(head);
    head = n;
  }
  
  public void pop() {
    if(head != null)
      head = head.getNextNode();
  }
  
  public void display() {
    Node curr = head;
    while(curr.getNextNode() != null) {
      System.out.println(curr.getWord());
      curr = curr.getNextNode();
    }
    System.out.println(curr.getWord());
  }
  
}