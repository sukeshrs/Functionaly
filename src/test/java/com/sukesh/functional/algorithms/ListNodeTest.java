package com.sukesh.functional.algorithms;

import org.junit.jupiter.api.Test;

import java.util.List;

public class ListNodeTest {

    private ListNode testUnit = new ListNode();

    @Test
    public void itTestsAddingEntriesInListNode(){
        testUnit.val = 1;
        ListNode second = new ListNode(2, testUnit);
        ListNode listNode = new ListNode(3, second);

        while (listNode != null) {
            listNode = listNode.next;
            System.out.println(listNode);
        }

        System.out.println(listNode);
    }
}
