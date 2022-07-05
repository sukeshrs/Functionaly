package com.sukesh.functional.algorithms.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {

    public int findMaxDepth(Node node) {
        int maxDepth = maxDepth(node , 0);
        return maxDepth;
    }

    /**
     * This uses depth first search to travel down the nodes and find the max length of the tree
     * @param node
     * @param depth
     * @return
     */
    private int maxDepth(Node node, int depth) {
        if(node == null){
            return depth;
        }
        depth = depth + 1;
       return Math.max( maxDepth(node.getLeft() , depth) , maxDepth(node.getRight() , depth));
    }

    public List<List> levelOrder(Node node) {
        List<List> levelOrderList = new ArrayList<List>();
        Queue<Node> nodes = new LinkedList<>();
        if(node != null) {
            nodes.add(node);
            traverse(nodes);
        }
        return levelOrderList;
    }

    private void traverse(Queue<Node> nodes) {
        while(!nodes.isEmpty()){
            Node n = nodes.remove();
            System.out.println(n);
            if(n.getLeft() !=null){
                nodes.add(n.getLeft());
            }

            if(n.getRight() != null){
                nodes.add(n.getRight());
            }
        }
    }
    

}
