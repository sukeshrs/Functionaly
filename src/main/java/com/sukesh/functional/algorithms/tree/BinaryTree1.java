package com.sukesh.functional.algorithms.tree;

import java.util.Objects;

/**
 * Binary Tree which uses the Node1 class for storing the node .
 * The Node1 class is with in the package so that the member variables are accessible to this class
 */
public class BinaryTree1 {

    /**
     * The function calls maxDepth and passes 0 as the depth of the tree to begin with
     * @param node1 - The root node of the binary tree
     * @return depth : depth of the tree
     */
    public int findMaxDepth(Node1 node1) {
        if(Objects.isNull(node1)){
            return 0;
        }
        int depth =maxDepth(node1,0);
        return depth;
    }

    /**
     * This function is called recursively to find the depth of the tree.
     * @param :  node
     * @param :  depth of the tree
     * @return
     */
    private int maxDepth(Node1 node, int i) {
        int depth = i;
        if(Objects.nonNull(node)) {
            i++;
            depth= Math.max(maxDepth(node.left, i), maxDepth(node.right,i));
        }
        return depth;
    }
}
