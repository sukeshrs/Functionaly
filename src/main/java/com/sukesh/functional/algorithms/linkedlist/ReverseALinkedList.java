package com.sukesh.functional.algorithms.linkedlist;

import com.sukesh.functional.algorithms.ListNode;

public class ReverseALinkedList {

    public static void reverse(ListNode node) {

        ListNode last = node;
        ListNode temp = node;

        while(temp.getNext() != null){
            ListNode current = temp.getNext();
            current.setNext(temp);
            temp = current;
        }
        System.out.println(temp);
    }

    public static void main(String args[]){
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(2, node);
        ListNode node2 = new ListNode(3,node1);
        System.out.println(node2);
        reverse(node2);
    }

}
