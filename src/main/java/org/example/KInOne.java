package org.example;


/*
*
* Implement K stacks in One Array - Caveat stacks will be of a particular size
*
* */
public class KInOne {
    //We're going to seperate our array into seperate stacks based on input
    //The caveat here is our stacks will all be equal values - if the values are to be flexible,
    //The implementation would take too long

    //Let's say you want an array of four stacks with each having a capacity of four stackable elements
    public static int[] completeStackArray;

    public static void createStackArray(int stackCapacity, int stacksNeeded){
        // This will give us an array, that can hold our capacity per stack + the total number of stacks we need
        completeStackArray = new int[stackCapacity * stacksNeeded];
    }

    //This method will push a value, into the stack at the specified position in our completeArray
    public static void pushToKStack(int stackPosition, int value){



    }
}
