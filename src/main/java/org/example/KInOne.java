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
    private int stackCapacity;
    public void createStackArray(int stackCapacity, int stacksNeeded){
        // This will give us an array, that can hold our capacity per stack + the total number of stacks we need
        this.stackCapacity = stackCapacity;
        completeStackArray = new int[stackCapacity * stacksNeeded];
    }

    //This method will push a value, into the stack at the specified position in our completeArray
    public void pushToKStack(int stackPosition, int value){
    //First in order to push to the specified stack, we must have space left to push onto it
        //If our stackPosition has values = to our stackCapacity - throw an error and not add
        if(this.stackIsFull(stackPosition)){
            throw new RuntimeException("Specified Stack Is Full");
        }

    }

    //This will check if the stack being asked for is full -- since our array is split into stacks
    //Each segment represents a position of a stack -- to pull values from it -- we'd have to be able to reference
    //Particular positions
    private boolean stackIsFull(int stackPosition){
        //How can I get the starting position or the end position everytime to reference the correct elements?
        //completeStack.size() == 16/ stackCapacity == TotalNum Stacks
        //TotalNum Stacks * stackPosition this gives us the starting point for each stack
        //StartingPoint + stackCapacity - 1 this gives you the reference point to last value in each stack



        //If I'm at stack 0, I would need to access elements from (0 - stackCapacity - 1) if capacity is four, elements would be stored in 0 - 3
        //If I'm at stack 1, I would need to access elements from (stackCapacity - stackCapacity + 3) if capacity is four, elemenst would be stored in 4 - 7
        //If I'm at stack 2, I would need to access elements from (stackCapacity + 4 - stackCapacity + 4 + 3) if capacity is four, elemenst would be stored in 8 - 11
        //If I'm at stack 3, I would need to access elements from (stackCapacity + 4 + 4 - stackCapacity + 4 + 4 + 3) if capacity is four, elemenst would be stored in 12 - 15




    }
}
