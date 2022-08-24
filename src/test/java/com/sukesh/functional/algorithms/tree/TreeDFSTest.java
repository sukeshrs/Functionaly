package com.sukesh.functional.algorithms.tree;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TreeDFSTest {

    @Test
    public void shouldTraverseThe_TreeDepthFirst_LeftSideFirst() {
        var root = Tree.of(10);
        constructTestTree(root);
        List<Integer> nodeValues = TreeDFS.traverse(root , true);
        Integer expected = 70;
        Assert.assertEquals(expected , nodeValues.get(nodeValues.size()-1));
        System.out.println(nodeValues);
    }

    @Test
    public void shouldTraverseThe_TreeDepthFirst_RightSideFirst() {
        var root = Tree.of(10);
        constructTestTree(root);
        List<Integer> nodeValues = TreeDFS.traverse(root , false);
        Integer expected = 20;
        Assert.assertEquals(expected , nodeValues.get(nodeValues.size()-1));
        System.out.println(nodeValues);
    }


    private void constructTestTree(Tree<Integer> root) {
        root.addChild(20);
        var child2 =root.addChild(30);
        child2.addChild(40);
        child2.addChild(50);
        child2.addChild(60).addChild(70);
    }
}
