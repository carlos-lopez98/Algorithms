package org.example.leetcode;


/*
*
* Given a singly linked list, remove the nth node from the end of the list and return its head
*
* Meaning remove the 3rd from last, etc...
*
* Not the nth position in the list
*
* */
public class RemoveNthNodeFromEndOfList {

    //The easy solution to this is to iterate through the list once, get the size
    //Then start a loop and stop at the size- n - 1 position, the position before your target
    //node in order to remove it's reference


    //The more trickier solution is to use two pointers, one pointer will be a fast pointer
    //We're going to maintain a distance of N between the two pointers, so making it to when
    //The fast pointer makes it to the end (null) the slow pointer will be n distance away from the
    //end effectively landing us in the correct position


}
