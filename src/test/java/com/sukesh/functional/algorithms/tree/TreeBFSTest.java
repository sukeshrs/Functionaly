package com.sukesh.functional.algorithms.tree;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class TreeBFSTest {

    @Test
    public void shouldTraverseTheTreeBreadthFirst(){
        var root = Tree.of(10);
        constructTestTree(root);
        List<Integer> treeNodes = TreeBFS.traverse(root);
        Integer value = treeNodes.get(0);
        Integer expectedResult =10;
        Assert.assertEquals(expectedResult, value);
    }

    private void constructTestTree(Tree<Integer> root) {
        root.addChild(20);
        var child2 =root.addChild(30);
        child2.addChild(40);
        child2.addChild(50);
        child2.addChild(60).addChild(70);
    }
}
