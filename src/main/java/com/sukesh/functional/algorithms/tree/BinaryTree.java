package com.sukesh.functional.algorithms.tree;

import java.util.*;

public class BinaryTree {

    public int findMaxDepth(Node node) {
        int maxDepth = maxDepth(node , 0);
        return maxDepth;
    }

    /**
     * This uses depth first search to travel down the nodes and find the max length of the tree
     * uses recursion
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

    /**
     *      1
     *   2     3
     * 4   5  6  7
     *
     * The function loops through each node from left to right using BFS principle
     * From above example , 1 will be visited first and then 2 and 3 and then 4,5,6,7 and so on
     * One key point is , it keeps track of the level of the tree so that the sub array can be created and entered
     * @param node
     * @return : List of list with entries from each level
     */
    public List<List> levelOrder(Node node) {
        List<List> levelOrderList = new ArrayList<List>();
        Queue<Node> nodes = new LinkedList<>();
        if(node != null) {
            nodes.add(node);
            traverse(nodes , levelOrderList);
        }
        return levelOrderList;
    }

    /**
     *
     * @param nodes
     * @param levelOrderList
     */
    private void traverse(Queue<Node> nodes ,  List<List> levelOrderList) {

        //When the while loop is executed first , it will have only one entry and the
        //nodes.size will be 1
     while(!nodes.isEmpty()){
         int length = nodes.size(),count =0;
         List<Integer> currentLevelValues = new ArrayList<>();
         while(count < length){
             Node node = nodes.remove();
             currentLevelValues.add(node.getVal());
             if(Objects.nonNull(node.getLeft())){
                 nodes.add(node.getLeft());
             }
             if(Objects.nonNull(node.getRight())){
                 nodes.add(node.getRight());
             }
             count++;
         }
         levelOrderList.add(currentLevelValues);
     }
    }
}
