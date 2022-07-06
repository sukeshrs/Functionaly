package com.sukesh.functional.algorithms;

public class ListNode {
    @Override
    public String toString() {
        return "[" +
                "val=" + val +
                ", next=" + next +
                ']';
    }

    public int val;
      public  ListNode next;

      public ListNode() {}

      public ListNode(int val) {
          this.val = val;
      }
      public ListNode(int val, ListNode next) {
          this.val = val; this.next = next;
      }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
