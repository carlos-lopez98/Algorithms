package org.example;

import java.util.ArrayList;
import java.util.List;

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

    public static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> ints = new ArrayList<Integer>();
        int max = 0;

        for(int i = n-1; i >= 0; i--){

            if(arr[i] > max){
                ints.add(arr[i]);
                max = arr[i];
            }
        }

        //I would have to reverse the list to get the correct output
        ArrayList<Integer> reversed = new ArrayList<Integer>();

        for(int i = ints.size() - 1; i >= 0; i--){
            int currentRight = ints.get(i);
            reversed.add(currentRight);
        }

        return reversed;
    }

}
