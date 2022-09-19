package graph;

import java.util.ArrayList;
import java.util.LinkedList;

public class AdjMatrixToAdjList {

    private ArrayList<LinkedList<Integer>> adjLst;

    public AdjMatrixToAdjList() {
        adjLst = new ArrayList<>();
    }

    public void convert(int adjMatrix[][]) {
        for(int i=0; i<adjMatrix.length; i++) {
            LinkedList<Integer> currLst = new LinkedList<>();
            currLst.add(i);
            for(int j=0; j<adjMatrix[i].length; j++)
                if(adjMatrix[i][j] == 1)
                    currLst.add(j);
            adjLst.add(currLst);
        }
    }

    public void print() {
        for(int i=0; i<adjLst.size(); i++) {
            for(int j=0; j< adjLst.get(i).size(); j++) {
                System.out.print(adjLst.get(i).get(j) + "->");
            }
            System.out.println("_");
        }

    }



}
