package com.sukesh.functional.algorithms.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
public class TreeDFS {
    public static <T> List<T> traverse(Tree<T> root , boolean startLeft) {
        List<T> nodeValues = new ArrayList<>();
        traverseChildren(root , nodeValues , startLeft);
        return nodeValues;
    }

    private static <T> void traverseChildren(Tree<T> root , List<T> nodeValues , boolean startLeft) {
        Deque<Tree<T>> stack = new ArrayDeque<>();
        stack.push(root);
        while(!stack.isEmpty()){
            var removedFromStack = stack.pop();
            nodeValues.add(removedFromStack.getValue());
            var children = removedFromStack.getChildren();
            if(!children.isEmpty()) {
                if (startLeft) {
                    var childrenLength =children.size();
                    for (int i = childrenLength - 1; i >= 0; i--) {
                        stack.push(children.get(i));
                    }
                } else {
                    children.stream()
                            .forEach(child -> stack.push(child));
                }
            }
        }
    }


}
