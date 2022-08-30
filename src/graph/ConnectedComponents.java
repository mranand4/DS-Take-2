package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ConnectedComponents {

    /**
     * Index is a mother vertex
     * List at a index contains all connected vertices
     */
    private ArrayList<List<Integer>> adjList;

    public void run() {

        adjList = new ArrayList<>();
        adjList.add(Arrays.asList(new Integer[]{}));

    }


}
