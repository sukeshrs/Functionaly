package com.sukesh.functional.algorithms.tree;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTree1Test {
    private BinaryTree1 classToTest;

    @Test
    public void itTestsTheMaxDepthOfBinaryTree(){
        classToTest = new BinaryTree1();
        Node1 node1 = new Node1();
        Node1 node2 = new Node1();
        Node1 node3 = new Node1();
        Node1 node4 = new Node1();
        Node1 node5 = new Node1();
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.left.left = node5;
        int depth = classToTest.findMaxDepth(node1);
        assertEquals(4, depth);
    }

    @Test
    public void itTestsTheMaxDepthOfBinaryTree_WhenTreeHasOnlyOneNode(){
        classToTest = new BinaryTree1();
        Node1 node1 = new Node1();
        node1.value = 1;
        int depth = classToTest.findMaxDepth(node1);
        assertEquals(1, depth);
    }

    @Test
    public void itTestsTheMaxDepthOfBinaryTree_WhenTheNodeIs_Null(){
        classToTest = new BinaryTree1();
        Node1 node1 = null;
        int depth = classToTest.findMaxDepth(node1);
        assertEquals(0, depth);
    }

    @Test
    public void itTestsTheMaxDepthOfBinaryTree_WhenTheTreeIsBalanced(){
        classToTest = new BinaryTree1();
        Node1 node1 = createNode();
        int depth = classToTest.findMaxDepth(node1);
        assertEquals(3, depth);
    }


    @Test
    public void itReturnsTheLevelOrderOfTheTree(){
        classToTest = new BinaryTree1();
        Node1 root = createNode();
        List firstLevel = Arrays.asList(1);
        List<List> levelOrderList = classToTest.leveOrder(root);
        assertEquals(levelOrderList.get(0), firstLevel);
        System.out.println(levelOrderList.get(2));
    }

    @Test
    public void itTestsTheListOfRightMostEntries(){
        classToTest = new BinaryTree1();
        Node1 root = createUnbalancedNode();
        List<Integer> expected = Arrays.asList(1,0,0,0);
        List<Integer> rights = classToTest.getTheRighSideViewOfTheTree(root);
        assertEquals(expected, rights);
    }

    @Test
    public void itTestsTheListOfRightMostEntriesUsingAnotherMethod(){
        classToTest = new BinaryTree1();
        Node1 root = createUnbalancedNode();
        List<Integer> expected = Arrays.asList(1,0,0);
        List<Integer> rights = classToTest.getRightMostEntriesImproved(root);
        assertEquals(expected, rights);
    }

    private Node1 createNode() {
        Node1 node1 = new Node1();
        Node1 node2 = new Node1();
        Node1 node3 = new Node1();
        Node1 node4 = new Node1();
        Node1 node5 = new Node1();
        node1.value = 1;
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node3.right = node5;
        return node1;
    }

    private Node1 createUnbalancedNode() {
        Node1 node1 = new Node1();
        Node1 node2 = new Node1();
        Node1 node3 = new Node1();
        Node1 node4 = new Node1();
        Node1 node5 = new Node1();
        node1.value = 1;
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node4.left = new Node1();
        node3.right = node5;
        return node1;
    }
}
