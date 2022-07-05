package com.sukesh.functional.algorithms;


/**
 * Given two lists [2,4,5] and [4,6,7] return [6,0,3,1]
 */
public class AddTwoNumbersUsingLinkedList {
    public  ListNode addTwoNumbers(ListNode l1 , ListNode l2){
        ListNode startNode = new ListNode();
        ListNode current = startNode;
        ListNode a = l1 , b = l2;
        int carry = 0 ;
        while (a.next != null || b.next != null){
            int sum = carry + (a != null ? a.val:0) + (b != null ? b.val :0);
            // Carry for the next iteration.
            carry = sum / 10;
            int digit = sum % 10;
            ListNode node = new ListNode(digit);
            current.next = node;
            current = current.next;
            if (a != null) a = a.next;
            if (b != null) b = b.next;
        }
        return current;
    }
}
