package com.sukesh.functional.algorithms.linkedlist;

import com.sukesh.functional.algorithms.ListNode;

public class RemoveNthNodeSecond {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head.next == null){
            return head.next;
        }

        int left =0;
        int right =0;

        ListNode current = head;
        ListNode nodeToRemove = head;
        ListNode previous = head;


        while(current !=null){
            current = current.next;
            if(left >=n){
                previous = nodeToRemove;
                nodeToRemove = nodeToRemove.next;
                right++;
            }
            left++;
        }

        if(right == 0){
            head = head.next;
        }
        previous.next = nodeToRemove.next;

        return head;
    }
}
