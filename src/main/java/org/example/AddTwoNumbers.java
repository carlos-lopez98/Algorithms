package org.example;

import org.example.practice.Node;

/*

You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order, and each of their nodes contains a single digit.
Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.


Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]

Input: l1 = [0], l2 = [0]
Output: [0]
 */


//Use the ternary operators here, you'll need many if else statements
public class AddTwoNumbers {


    //The approach we want to do, is to keep iterating through each list, until we reach the end of both
    //If we reach the end of one before the other, we will consider the null list's value as 0
    //Then just add as usual

    //You need to consider the carry
    //How you'll get the sum? Would this just be l1 + l2, what about the carry?
    //How you'll get the single digit sum? IE if the sum is 17, single digit should be 7 and carry should be 1
    public Node addTwoNumbers(Node l1, Node l2){

        return null;
    }
}
