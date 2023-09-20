package org.example;

/*
*
* Given a linked list which might contain a loop, implement an algorithm that returns the node
* at the beginning of the loop(if it exists)
*
* */
public class LoopDetectionLinkedList {

    //! You can solve this use hashing - loop through your original list
    // Add the nodes to hashmap as you go using their addresses as the hashvalue
    //If you run into the same value then there is a cycle, and that value is the new start
    //of a loop



    //Second way is to use the tortoise and hare algorithm
    //This uses two pointers, one fast one slow
    //If the two collide it tells us there is a loop in the linked list
    //To get the head node of the cycle, at the collision point, you will
    //set one of the two pointers = to the original head
    //Then both move one at a time, where they meet will be the root node of your loop

}
