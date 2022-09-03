package com.sukesh.functional.algorithms.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeBFS {

    /**
     * Navigates a tree from left to right and returns all the node values as a list
     * @param root
     * @return
     * @param <T>
     */
    public static <T> List<T> traverse(Tree<T> root) {
        List<T> listOfNodes = new ArrayList<>();
        Queue<Tree<T>> nodeToBeVisited = new LinkedList<>();
        nodeToBeVisited.add(root);
        while(!nodeToBeVisited.isEmpty() ){
           var tree= nodeToBeVisited.remove();
           listOfNodes.add(tree.getValue());
           if(tree.getChildren() != null){
               tree.getChildren().stream()
                               .forEach(t ->nodeToBeVisited.add(t));
           }
        }
        return listOfNodes;
    }
}
