package org.example;


/*
*
* Imagine a (literal) stack of plates. If the stack gets too  high, it might topple. Therefore
* in real life, we would likely start a new stack when the previous stack exceeds some threshold.
* Implement a data structure SetOfStacks that mimics this. SetOfStacks should be composed of several stacks
* and should create a new stack once the previous one exceeds capacity. SetOfStacks, push() and SetOfStacks.pop()
* should behave identically to a single stack (That is pop() should return the same values as it would if there were
* just a single stack
*
* */
public class StackOfPlates {

    //First we'll need the input to bring in the capacity we're having for each stack

    //If we implement the popAt() method, then we need to have a way to fill in that stack after
    //we pop the top off, or a way to roll values from the proceeding stacks if any

    //Without the popAt() method then we just need to keep track of how many values are in each stack, then fill it in
    //If there are available values, if a stack becomes empty then remove that stack from the list

    //For this it an ArrayList would make sense as you can add and remove fairly easily
    //To keep track of available stacks, you'd need to have an alternate data structure
    //You'd also want to keep track of the full stacks, and the order in which we'll pop off of them




}
