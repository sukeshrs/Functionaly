package com.sukesh.functional.algorithms;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class AddTwoNumbersUsingLinkedListTest {
    AddTwoNumbersUsingLinkedList uut = new AddTwoNumbersUsingLinkedList();

    @Test
    public void itTestTheAdditionOfTwoNumbers(){
        ListNode dummyHead = new ListNode(0);
        ListNode currentNode = dummyHead;
        for(int i = 1 ;i <4 ; i++) {
            ListNode node = new ListNode(i);
            System.out.println(currentNode.val);
            currentNode.next = node;
            currentNode = currentNode.next;
        }
        System.out.println(dummyHead.next);

        LinkedList list = new LinkedList();
    }
}
