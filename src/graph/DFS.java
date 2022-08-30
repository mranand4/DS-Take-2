package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DFS {

    private ArrayList<List<Integer>> adjLst;
    boolean visited[];

    public DFS() {
        adjLst = new ArrayList<>();
    }

    public void dfs(int s) {
        if(visited[s])
            return;
        visited[s] = true;
        System.out.println("VISITED : " + s);
        for(Integer i : adjLst.get(s))
            dfs(i);
    }

    public void run() {
        adjLst.add(Arrays.asList(new Integer[]{new Integer(1), new Integer(2)}));
        adjLst.add(Arrays.asList(new Integer[]{new Integer(0), new Integer(5), new Integer(3)}));
        adjLst.add(Arrays.asList(new Integer[]{new Integer(0), new Integer(3), new Integer(4)}));
        adjLst.add(Arrays.asList(new Integer[]{new Integer(1), new Integer(2), new Integer(6), new Integer(4)}));
        adjLst.add(Arrays.asList(new Integer[]{new Integer(2), new Integer(3), new Integer(7)}));
        adjLst.add(Arrays.asList(new Integer[]{new Integer(1), new Integer(6)}));
        adjLst.add(Arrays.asList(new Integer[]{new Integer(5), new Integer(3), new Integer(7)}));
        adjLst.add(Arrays.asList(new Integer[]{new Integer(4), new Integer(6)}));
        visited = new boolean[adjLst.size()];
        Arrays.fill(visited, false);
        dfs(0);
    }
}
