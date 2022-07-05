package com.sukesh.functional.algorithms.linkedlist;

import com.sukesh.functional.algorithms.ListNode;

public class RemoveTheNthNodeFromTheEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head.next == null){
            return head.next;
        }

        ListNode current = head;
        ListNode previous = null;

        //Reverse the linked list
        while(current != null){
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        int index = 1;

        current = previous;
        head = current;

        //previos points to the head of the linked list
        while(current != null){
            ListNode next = current.next;
            if(n == 1){
                head = next;
            }
            if(index == n)
            {
                previous.next = next;
                break;
            }
            previous = current;
            current = next;
            index++;
        }

        current = head;
        previous = null;

        while(current != null){
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }
}
