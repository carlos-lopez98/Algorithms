package org.example.stacks;

import java.util.Stack;

/**
 * Implement a queue class that which implements a queue using two stacks
 */
public class MyQueue {

    public Stack<Integer> inStack;
    public Stack<Integer> holdStack;

    public MyQueue() {
        inStack = new Stack<>();
        holdStack = new Stack<>();
    }

    public void add(int data) {
        inStack.push(data);
    }

    public int deQueue() {


        while (!inStack.isEmpty()) {
            holdStack.add(inStack.pop());
        }

        int returnVar = holdStack.pop();

        while (!holdStack.isEmpty()) {
            inStack.add(holdStack.pop());
        }

        return returnVar;
    }
}
/**
 * With this one you have to think about the order that queues and stack add and remove elements. If you think about it
 * When you add to a stack you remove the most recently added element. For a queue, you'd remove the first element added
 * so in order to get this to work as a queue, you must reverse the order of the first stack. To do this, you'd
 * just add the elements into a second stack, then pop the top element off the stack, then return the elements back to
 * the first stack, and keep adding from the tail.
 */
