package com.sukesh.functional.algorithms.graph;

import java.util.ArrayList;
import java.util.List;

public class GraphDFS {
    public List<Integer> depthFirstSearch(Graph graph) {
        List graphEntries = new ArrayList<>();
        int number_of_nodes = graph.adjList.size();
        boolean[] discovered = new boolean[number_of_nodes];
//        for(int i=0; i < number_of_nodes ; i++){
//            if(!discovered[i]){
//                dfs(graph , i , discovered);
//            }
//        }

        dfs(graph , 1, discovered , graphEntries);
        return graphEntries;
    }

    private void dfs(Graph graph,int vertex , boolean[] discovered , List graphEntries){
        discovered[vertex] = true;
        graphEntries.add(vertex);
        for (int u : graph.adjList.get(vertex)){
            if(!discovered[u]){
                dfs(graph , u , discovered , graphEntries);
            }
        }
    }
}
