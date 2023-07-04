package com.sukesh.functional.algorithms.graph;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class GraphDFSTest {

    @Test
    public void shouldTestTheGraphTraversal(){
        Graph graph = createGraph();
        GraphDFS dfs= new GraphDFS();
        List<Integer> list = dfs.recursiveDepthFirstSearch(graph);
        Integer expected = 1;
        Assert.assertEquals(expected, list.get(0));
    }

//    @Test
//    public void shouldTestTheGraphTraversalRecursive(){
//        Graph graph = createGraph();
//        GraphDFS dfs= new GraphDFS();
//        List<Integer> list = dfs.iterativeDepthFirstSearch(graph);
//        Integer expected = 1;
//        Assert.assertEquals(expected , list.get(0));
//    }

    private Graph createGraph() {
        // List of graph edges as per the above diagram
        List<Edge> edges = Arrays.asList(
                // Notice that node 0 is unconnected
                new Edge(1, 2), new Edge(1, 7), new Edge(1, 8), new Edge(2, 3),
                new Edge(2, 6), new Edge(3, 4), new Edge(3, 5), new Edge(8, 9),
                new Edge(8, 12), new Edge(9, 10), new Edge(9, 11)
        );
        // total number of nodes in the graph (labelled from 0 to 12)
        int n = 13;
        // build a graph from the given edges
        Graph graph = new Graph(edges, n);
        return graph;
    }
}
