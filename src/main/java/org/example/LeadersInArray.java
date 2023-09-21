package org.example;

/*
*
* Write a program to print all the leaders in the array. An element is a leader if it is greater than all the elements
* to it's right side. And the rightmost is always a leader
*
* INPUT:
* arr[] = {16, 17, 4, 3, 5, 2}
*
* OUTPUT:
* 17 5 2
*
* */
public class LeadersInArray {
    //Approach would be iterate from right to left, saving the highest value as you go,
    //If another value is higher than current highest, then that one is leader so add to list
    //Then print list in reverse order, as the order will be 2, 5, 17
    //So you want 17, 5, 2 or use stack as it's LIFO
}
