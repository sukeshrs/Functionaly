package com.sukesh.functional.algorithms;

enum State {q0, q1,q2,qd}
public class StateMachine{

    //Stores the current State
    private State currentState;
    //Stores the result
    private int result;
    //Stores the sign 1 for + , -1 for -
    private int sign;

    StateMachine(){
        currentState = State.q0;
        result = 0;
        sign = 1;
    }

    private void toStateQ1(char ch){
        sign = (ch == '-') ? -1 : 1;
        currentState = State.q1;
    }

    private void toStateQ2(int digit){
        //TODO : Implement boundary conditions
        result = result * 10 + digit;
        currentState = State.q2;
    }

    private void toStateQd(char ch) {
        currentState = State.qd;
    }

    public void transition(char ch) {
        System.out.println("CurrentState " + currentState);
        if(ch == ' '){
            return;
        }else if(ch == '-' || ch == '+') {
            toStateQ1(ch);
        } else if(Character.isDigit(ch)){
            toStateQ2(ch - '0');
        } else {
            toStateQd(ch);
        }

    }

    public State getState(){
        return currentState;
    }

    public int getResult(){
        return result * sign;
    }

}