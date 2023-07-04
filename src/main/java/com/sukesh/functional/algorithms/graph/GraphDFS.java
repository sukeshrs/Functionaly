package com.sukesh.functional.algorithms.graph;

import java.util.*;

public class GraphDFS {
    public List<Integer> recursiveDepthFirstSearch(Graph graph) {
        //Array to hold the vertex values of graph
        List graphEntries = new ArrayList<>();
        int number_of_nodes = graph.adjList.size();
        boolean[] discovered = new boolean[number_of_nodes];
//        for(int i=0; i < number_of_nodes ; i++){
//            if(!discovered[i]){
//                dfs(graph , i , discovered);
//            }
//        }

        dfs(graph, 1, discovered, graphEntries);
        return graphEntries;
    }

    private void dfs(Graph graph, int vertex, boolean[] discovered, List graphEntries) {
        discovered[vertex] = true;
        graphEntries.add(vertex);
        for (int u : graph.adjList.get(vertex)) {
            if (!discovered[u]) {
                dfs(graph, u, discovered, graphEntries);
            }
        }
    }

    public List<Integer> iterativeDepthFirstSearch(Graph graph) {
        List<Integer> listOfNodes = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        //Get the size of the graph
        Integer size = graph.adjList.size();
        System.out.println(size);

        List<Integer> neighbours = graph.adjList.get(1);
        Integer startingVertex = neighbours.get(0);


        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(startingVertex);

        while (!stack.isEmpty()) {
            int vertex = stack.pop();
            System.out.println(vertex);
            if (!visited.contains(vertex)) {
                visited.add(vertex);
                List<Integer> adjacentNeighbours = graph.adjList.get(vertex);
                int numberOfNeighbours = adjacentNeighbours.size();
                for (int i = numberOfNeighbours - 1; i > 0; i--) {
                    stack.push(adjacentNeighbours.get(i));
                }
            }
        }


        return listOfNodes;
    }
}
