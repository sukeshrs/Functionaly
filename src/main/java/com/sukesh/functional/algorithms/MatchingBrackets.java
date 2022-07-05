package com.sukesh.functional.algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MatchingBrackets {
    public boolean isValid(String s) {

        //Map with the brackets as key value pair.To retrieve opening bracket based on the corresponding closing bracket.
        Map<Character, Character> characterMap = new HashMap<>();
        characterMap.put(')', '(');
        characterMap.put('}', '{');
        characterMap.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            Character bracket = s.charAt(i);
            if (characterMap.containsKey(bracket)) {
                Character topBracketValue = stack.isEmpty() ? '0' : stack.pop();
                if (characterMap.get(bracket) != topBracketValue) {
                    return false;
                }
            } else {
                stack.push(bracket);
            }
        }

        //If stack is empty , it would mean all the opening brackets were closed properly
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
}
