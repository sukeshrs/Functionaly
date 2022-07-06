package com.sukesh.functional.algorithms.tree;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

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


    public List<List> leveOrder(Node1 root) {
        List<List> levelOrderList = new ArrayList<>();
        //Add the root node to a queue
        Queue<Node1> nodes = new LinkedList<>();
        nodes.add(root);
        AtomicInteger depth = new AtomicInteger(0);
        traverseTheTree(nodes , levelOrderList , depth);
        System.out.println(depth);
        return levelOrderList;
    }


    /**
     *          1
     *       2    6
     *     3   7
     * Gets the right side view of the tree
     * The right side view of the above tree is [1,6,7]
     * @param root
     * @return : a list with the right side view os the tree
     */
    public List<Integer> getTheRighSideViewOfTheTree(Node1 root) {
        Queue<Node1> entries = new LinkedList<>();
        entries.add(root);
        List<Integer> rightEntries = new ArrayList<>();
        traverseBreadthWise(entries , rightEntries);
        return rightEntries;
    }


    public List<Integer> getRightMostEntriesImproved(Node1 root){
        List<Integer> list = new ArrayList<>();
        getRightMostValues(root, list);
        return list;
    }

    private int getRightMostValues(Node1 root, List<Integer> list) {
        Node1 current = root;
        int rightMostDepth = 0;
        while(Objects.nonNull(current)){
            list.add(current.value);
            current = current.right;
            ++rightMostDepth;
        }
        return rightMostDepth;
    }

    /**
     * BFS traversal updates
     * @param nodes
     * @param rightEntries
     */
    private void traverseBreadthWise(Queue<Node1> nodes, List<Integer> rightEntries) {
        while(!nodes.isEmpty()){
            int depth = 0, count = 0 , size = nodes.size();
            Node1 node=null;
            while(size > count){
                node = nodes.remove();
                if(Objects.nonNull(node.left)){
                    nodes.add(node.left);
                }
                if(Objects.nonNull(node.right)){
                    nodes.add(node.right);
                }
                count++;
            }
            rightEntries.add(node.value);
        }

    }


    private void traverseTheTree(Queue<Node1> nodes, List<List> levelOrderList, AtomicInteger depth) {

        while(!nodes.isEmpty()){
            int size = nodes.size();
            int count = 0;
            List<Integer> entries = new ArrayList<>();
            while(size> count){
                Node1 node = nodes.remove();
                if(Objects.nonNull(node.left)){
                    nodes.add(node.left);
                }
                if(Objects.nonNull(node.right)){
                    nodes.add(node.right);
                }
                count++;
                entries.add(node.value);
            }
            levelOrderList.add(entries);
            depth.getAndIncrement();
        }

    }
}
