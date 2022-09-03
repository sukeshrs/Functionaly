package com.sukesh.functional.algorithms.tree;

import org.junit.jupiter.api.Test;

public class TreeTest {
    @Test
    public void shouldTestTheTreeCreation(){
        var tree = Tree.of(10);
        tree.addChild(11);
        var child1 = tree.addChild(14);
        child1.addChild(20);
        System.out.println(tree);
    }
}
