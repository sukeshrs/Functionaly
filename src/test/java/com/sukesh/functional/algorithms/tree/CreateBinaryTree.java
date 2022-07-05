package com.sukesh.functional.algorithms.tree;

import com.sukesh.functional.algorithms.search.BinarySearch;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CreateBinaryTree {
    private BinaryTree classToTest = new BinaryTree();

    Node node;

    @Before
    public void setUp(){


    }

    @Test
    public void itPrintsTheBinaryTree(){
        Node node = createNode();
       // System.out.println(node);
    }

    private Node createNode() {
        Node node = new Node(1);
        Node left = new Node(2);
        Node right = new Node(3);
        Node leftChild = new Node(5);
        Node rightChild = new Node(7);
        node.setLeft(left);
        node.setRight(right);
        left.setLeft(leftChild);
        left.setRight(rightChild);
        Node rightSubChild = new Node(8);
        leftChild.setRight(rightSubChild);
        return node;
    }

    @Test
    public void itTestsTheMaximumHeight(){
        Node node = createNode();
       // System.out.println(node);
        int depth = classToTest.findMaxDepth(node);
        System.out.println(depth);
    }


    @Test
    public void itTestsTheLevelOrderReturn(){
        Node node = createNode();
        List expected = Arrays.asList(1);
        classToTest.levelOrder(node);
        //assertEquals(expected , test.get(0));
    }


}
