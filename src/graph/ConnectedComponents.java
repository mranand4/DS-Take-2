package graph;

import java.util.*;

public class ConnectedComponents {

    /**
     * Index is a mother vertex
     * List at a index contains all connected vertices
     */
    private ArrayList<List<Integer>> adjList;

    /**
     * Index of this array represent corresponding node.
     * Value at a set of indexes represented the component to which they are connected;
     */
    private int visited[];
    private int connectedComponentsCount;

    private void dfs(int vertex) {
        if(visited[vertex] != -1)
            return;
        visited[vertex] = connectedComponentsCount;
        for(Integer i : adjList.get(vertex))
            dfs(i);
    }
    private void findConnectedComponents() {
        for(int i=0; i<visited.length; i++) {
            if(visited[i] == -1) {
                dfs(i);
                connectedComponentsCount++;
            }
        }
    }

    public boolean isConnected() {

        for(int i=0; i<visited.length - 1; i++)
            if(visited[i] != visited[i+1])
                return false;
        return true;

    }

    public void run() {

        adjList = new ArrayList<>();
        adjList.add(Arrays.asList(new Integer[]{1,2}));
        adjList.add(Arrays.asList(new Integer[]{0}));
        adjList.add(Arrays.asList(new Integer[]{0}));
        visited = new int[adjList.size()];
        Arrays.fill(visited, -1);
        connectedComponentsCount = 0;
        findConnectedComponents();
        System.out.println("INDEX REPRESENTS A VERTEX, VALUE REPRESENTS THE COMPONENT TO WHICH THE NODE IS CONNECTED TO : " + Arrays.toString(visited));

        Set<Integer> count = new HashSet<>();
        for(int i : visited)
            count.add(i);
        System.out.println("COUNT OF CONNECTED COMPONENTS " + count.size());

        System.out.println("IS THE GRAPH CONNECTED : " + isConnected());
    }


}
