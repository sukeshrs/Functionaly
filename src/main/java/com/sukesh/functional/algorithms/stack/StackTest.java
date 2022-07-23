package com.sukesh.functional.algorithms.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class StackTest {
    public static void main(String args[]){
        Deque<Integer> stack = new ArrayDeque<Integer>();
        stack.push(1);
        stack.push(2);
        int value = stack.pop();
        System.out.println(value);
        Deque<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        Integer value1 = queue.remove();
        System.out.println(value1);

        Deque<Integer> stack1 = new LinkedList<>();
        stack1.push(3);
        stack1.push(4);

        System.out.println(stack1.pop());
    }
}
