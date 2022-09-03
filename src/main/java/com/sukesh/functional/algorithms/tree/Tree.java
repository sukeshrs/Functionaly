package com.sukesh.functional.algorithms.tree;

import java.util.ArrayList;
import java.util.List;

public class Tree<T> {
    private T value;
    private List<Tree<T>> children;

    private Tree(T value){
        this.value = value;
        this.children = new ArrayList<>();
    }

    /**
     * Creates a new tree
     * @param value
     * @return
     * @param <T>
     */
    public static <T> Tree<T> of(T value){
        return new Tree<>(value);
    }

    /**
     * Adds a child to the tree object
     * @param value
     * @return
     */
    public Tree<T> addChild(T value){
        Tree<T> newChild = new Tree<>(value);
        children.add(newChild);
        return newChild;
    }

    public List<Tree<T>> getChildren(){
        return children;
    }

    public T getValue(){
        return value;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "value=" + value +
                ", children=" + children +
                '}';
    }
}
