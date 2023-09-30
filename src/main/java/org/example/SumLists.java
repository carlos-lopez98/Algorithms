package org.example;

import org.example.practice.Node;

/*
 *
 * You have two numbers represented by a linked list, where each node contains a single digit.
 * The digits are stored in reverse order, such that the 1's digit is at the head of the list.
 * Write a function that adds the two numbers and returns the sum as a linked list.
 *
 * (You can't just convert the linked list into an integer)
 *
 * Input: 7 -> 1 -> 6 + 5 -> 9 -> 2 = 2 -> 1 > 9
 * Output: 912
 * */
public class SumLists {

    public static Node sum(Node integerOne, Node integerTwo) {
        //First what values must be stored
        int summation = 0;
        int carry = 0;
        Node headToReturn = null;
        Node sumList = null;

        //You need to use the or, because you want the iteration to keep going if one is shorter than the other
        while (integerOne != null || integerTwo != null || carry != 0) {

            if (integerOne != null) {
                summation += integerOne.data;
                //Move pointer
                integerOne = integerOne.next;
            }
            if (integerTwo != null) {
                summation += integerTwo.data;
                //Move pointer
                integerTwo = integerTwo.next;
            }

            summation += carry;
            carry = 0;

            if (summation >= 10) {
                carry = summation / 10;
                summation = summation % 10;
            }

            Node temp = new Node(summation);

            //It's only going to be null in the first iteration
            if (sumList == null) {
                sumList = temp;
                headToReturn = temp;
            } else {
                sumList.next = temp;
                sumList = sumList.next;
            }
            summation = 0;
        }

        return headToReturn;
    }
}