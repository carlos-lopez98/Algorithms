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
*
* */
public class SumLists {


    public Node sum(Node integerOne, Node integerTwo){
        Node sum = null;
        int carry = 0;

        //Iteration will keep going as long as lists have a value to keep going or carry has a value to add
        while (integerOne != null || integerTwo != null || carry != 0){
            Node oneCurr = integerOne;
            Node twoCurr = integerTwo;

            int sumation = oneCurr.data + twoCurr.data;

            if(sumation >= 10){
                carry += 1;
                sumation = Math.abs(sumation - 10);
            }

            if(sum == null){
                sum = new Node(sumation);
                sum.next = new Node(0);
                sum = sum.next;
            }else{
                sum.data = sumation;
                sum = sum.next;
            }


            integerOne = integerOne.next;
            integerTwo = integerTwo.next;
        }

        sum.data += carry;

        return sum;
    }
}
