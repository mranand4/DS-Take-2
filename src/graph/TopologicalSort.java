package graph;

import java.util.*;

public class TopologicalSort {

    private HashMap<String, LinkedList<String>> adjList;

    /**
     * MAP =
     *
     *   shirt ..............> hoodie...........
     *                                          \.........> school
     *   underwear .......> pants.....                   .^
     *                                \ ......>shoes .../
     *   socks ......................./
     *
     *
     */
    public TopologicalSort() {
        this.adjList = new HashMap<>();
        this.adjList.put("shirt", new LinkedList<>(Arrays.asList(new String[]{"hoodie"})));
        this. adjList.put("hoodie", new LinkedList<>(Arrays.asList(new String[]{"school"})));
        this.adjList.put("shoes", new LinkedList<>(Arrays.asList(new String[]{"school"})));
        this.adjList.put("socks", new LinkedList<>(Arrays.asList(new String[]{"shoes"})));
        this.adjList.put("underwear", new LinkedList<>(Arrays.asList(new String[]{"pants"})));
        this.adjList.put("pants", new LinkedList<>(Arrays.asList(new String[]{"shoes"})));
        this.adjList.put("school", new LinkedList<>());
    }

    public List<String> sort() {

        HashMap<String, Integer> indegree = new HashMap<>();
        Queue<String> queue = new LinkedList<>();
        List<String> result = new LinkedList<>();

        for(String node : adjList.keySet())
            indegree.put(node, 0);

        for(String node : adjList.keySet())
            for (String n : adjList.get(node))
                indegree.put(n, indegree.get(n) + 1);

        for(String node : indegree.keySet())
            if(indegree.get(node) == 0)
                queue.add(node);

        while(!queue.isEmpty()) {
            String node = queue.remove();
            result.add(node);
            for(String n : adjList.get(node)) {
                indegree.put(n, indegree.get(n) - 1);
                if(indegree.get(n) == 0)
                    queue.add(n);
            }
        }

        // a cycle exists
        if(result.size() != adjList.size())
            return null;

        //no cycle is there, returning result of top sort
        return result;

    }


}
