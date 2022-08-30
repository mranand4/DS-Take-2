package graph.representation.adjlistmaps;

import java.util.HashMap;
import java.util.Map;

public class Graph {

    /**
     * Key is the mother vertex.
     * List of adjacent vertices are stored in a map ( String data, Integer weight )
     */
    private Map<String, Map<String, Integer>> adjLst;

    public Graph() {
        adjLst = new HashMap<>();
    }

    public void addNode(String node) {
        adjLst.put(node, new HashMap<>());
    }

    /**
     * Unweighted graph so weights are 0
     * @param src
     * @param dst
     */
    public void addEdge(String src, String dst) {
        adjLst.get(src).put(dst, 0);
    }

    public boolean checkEdge(String src, String dst) {
        return adjLst.get(src).containsKey(dst);
    }

    public void print() {
        for(String vertex : adjLst.keySet()) {
            System.out.print(vertex + "->");
            for(String node : adjLst.get(vertex).keySet()) {
                System.out.print(node + "->");
            }
            System.out.println("_");
        }
    }

}
