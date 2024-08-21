package org.example.stacks;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Imagine a (literal) stack of plates. If the stack gets too high, it might topple. Therefore, in real life, we
 * would likely start a new stack when the previous stack exceeds some threshold. Implement a data structure,
 * SetOfStacks that mimics this. SetOfStacks should be composed of several stacks and should create a new stack once the
 * previous one exceeds capacity SetOfStacks. Push() and SetOfStacks.pop() should behave identically to a single stack
 * (That is pop() should return the same values as it would if there were just a single stack).
 * <p>
 * Implement a function popAt(int index) which performs a pop operation on a specific sub-stack.
 */
public class StackOfPlates {
    public ArrayList<Stack<Integer>> listOne;

    //Tracks the most recent topStack
    public int topStack;

    //Sets the cap for each stack
    public int cap;

    public StackOfPlates(int cap) {
        listOne = new ArrayList<>();
        topStack = 0;
        this.cap = cap;
    }

    public boolean isEmpty() {
        //If the list doesn't have anything return true
        if (listOne.isEmpty()) {
            return true;
        }

        //If our firstStack is empty also return true
        Stack<Integer> current = listOne.get(0);

        if (current.empty()) {
            return true;
        }

        return false;
    }

}
