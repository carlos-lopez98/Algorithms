package org.example.stacks;

import java.util.Stack;

/**
 * Implement a queue class that which implements a queue using two stacks
 */
public class MyQueue {

    public Stack<Integer> inStack;
    public Stack<Integer> holdStack;

    public MyQueue(){
        inStack = new Stack<>();
        holdStack = new Stack<>();
    }
    public void add(int data){
        inStack.push(data);
    }

    public int deQueue(){


        while(!inStack.isEmpty()){
            holdStack.add(inStack.pop());
        }

        int returnVar = holdStack.pop();

        while(!holdStack.isEmpty()){
            inStack.add(holdStack.pop());
        }

        return returnVar;
    }
}
/**
 * With this one you have to think
 */
