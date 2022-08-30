package graph;

import java.util.*;

public class BFS {

    /**
     * Index represents a vertex
     * List at a particular index contains a all adjacent vertices
     */
    private ArrayList<List<Integer>> adjLst;

    public BFS() {
        adjLst = new ArrayList<>();
    }

    private List<Integer> reconstructPath(int s, int e, int prev[]) {
        List<Integer> path = new ArrayList<>();
        for(int i = e; prev[i] != -1; i = prev[i]) {
            path.add(new Integer(i));
        }
        Collections.reverse(path);
        return path;
    }

    private int[] solve(int s) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(new Integer(s));

        boolean visited[] = new boolean[adjLst.size()];
        int prev[] = new int[adjLst.size()];

        Arrays.fill(visited, false);
        Arrays.fill(prev, -1);

        visited[s] = true;

        while(!queue.isEmpty()) {
            Integer node = queue.remove();
            List<Integer> neighbours = adjLst.get(node.intValue());

            for(Integer i : neighbours) {
                if(!visited[i.intValue()]) {
                    queue.add(i);
                    visited[i.intValue()] = true;
                    prev[i.intValue()] = node.intValue();
                }
            }

        }

        return prev;
    }

    public void bfs(int s, int e) {
        int prev[] = solve(0);
        System.out.println(reconstructPath(s, e, prev));
    }

    public void run() {

        adjLst.add(Arrays.asList(new Integer[]{new Integer(1), new Integer(2)}));
        adjLst.add(Arrays.asList(new Integer[]{new Integer(5), new Integer(3)}));
        adjLst.add(Arrays.asList(new Integer[]{new Integer(3), new Integer(4)}));
        adjLst.add(Arrays.asList(new Integer[]{new Integer(6), new Integer(4)}));
        adjLst.add(Arrays.asList(new Integer[]{new Integer(3), new Integer(7)}));
        adjLst.add(Arrays.asList(new Integer[]{new Integer(6)}));
        adjLst.add(Arrays.asList(new Integer[]{new Integer(7)}));
        adjLst.add(Arrays.asList(new Integer[]{}));

        bfs(0, 7);

    }



}
