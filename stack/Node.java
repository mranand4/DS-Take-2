public class Node {
  
  private String word;
  private Node next;
  
  public Node() {}
  
  public Node(String word) {
    this.word = word;
  }
  
  public void setWord(String word) {
    this.word = word;
  }
  
  public String getWord() {
    return this.word;
  }
  
  public void setNextNode(Node next) {
    this.next = next;
  }
  
  public Node getNextNode() {
    return this.next;
  }
  
}
