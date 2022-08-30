package graph.representation.adjlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {
    /**
     *     Adjacency list is an ArrayList of type LinkedList.
     *     Head element of each LinkedList is a node.
     *     Rest of the elements of each LinkedList are adjacent nodes to the nodes stored in head.
     */
    private ArrayList<LinkedList<Node>> adjLst;

    public Graph() {
        adjLst = new ArrayList<>();
    }

    /**
     *
     * @param node
     * Creates a new LinkedList whose head is the Node which we passed to the function.
     * The head is a new Node in our graph.
     * All the other nodes in this list will be the adjacent nodes to the node in it's head ( at index 0 ).
     */
    public void addNode(Node node) {
        LinkedList<Node> currLst = new LinkedList<>();
        currLst.add(node);
        adjLst.add(currLst);
    }

    /**
     *
     * @param src
     * @param dst
     * Get the LinkedList corresponding to the index src. The head node of that LinkedList will be the node referenced by the src.
     * Get the head node of the LinkedList corresponding to the index dst. Let's call this dstNode.
     * Add the dstNode as an adjacency Node of the src.
     */
    public void addEdge(int src, int dst) {
        LinkedList<Node> currLst = adjLst.get(src);
        Node dstNode = adjLst.get(dst).get(0);
        currLst.add(dstNode);
    }

    public boolean checkEdge(int src, int dst) {
        LinkedList<Node> currLst = adjLst.get(src);
        Node dstNode = adjLst.get(dst).get(0);
        for(Node n : currLst)
            if(n == dstNode)
                return true;
        return false;
    }

    public void print() {
        System.out.println("* Represents a mother node. All other nodes connected to it are it's adjacent nodes.");
        for(int i=0; i<adjLst.size(); i++) {
            LinkedList<Node> currLst = adjLst.get(i);
            System.out.print("*" + currLst.get(0) + "->");
            for(int j=1; j<currLst.size(); j++)
                System.out.print(currLst.get(j) + "->");

            System.out.println("_");
        }
    }

}
