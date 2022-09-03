package com.sukesh.functional.algorithms.graph;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    List<List<Integer>> adjList = null;

    Graph(List<Edge> edges , int n){
        adjList = new ArrayList<>();
        for(int i=0;i<n ;i++){
            adjList.add(new ArrayList<>());
        }

        //Add edges to the undirected graph
        for(Edge edge : edges){
            int src = edge.source;
            int dest = edge.dest;

            adjList.get(src).add(dest);
            adjList.get(dest).add(src);
        }
    }

    @Override
    public String toString() {
        return "Graph{" +
                "adjList=" + adjList +
                '}';
    }
}
