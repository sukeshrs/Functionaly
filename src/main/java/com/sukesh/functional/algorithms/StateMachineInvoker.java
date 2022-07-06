package com.sukesh.functional.algorithms;

public class StateMachineInvoker {
    public int atoi(String s){
        StateMachine machine = new StateMachine();
        for(int i = 0; i < s.length() && machine.getState() != State.qd ; i++){
            machine.transition(s.charAt(i));
        }
        return machine.getResult();
    }
}
