package org.example;

/*
*
* Implement a MyQueue class which implements a queue using two stacks
*
* */
public class MyQueue {

    //A Queue is FIFO order, something added to the list goes to the end
    //Something removed from the list -- will be the first element in line
    //Stacks are LIFO, something added recently will be the first to pop() off the stack
    //How can I implement the queue using a stack?

    //We're going to have oneStack that get's all the add() elements
    //Second stack will only be in effect when we remove(), caveat will be that we only want to add to this stack
    //When it's empty, so as we're adding to the first stack, we won't add to the second
    //When we pop, we'll shift all elements from the first to the second, but won't shift again until the second one is empty




}
