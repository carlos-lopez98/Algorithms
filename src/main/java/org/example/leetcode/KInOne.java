package org.example.leetcode;


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
    public int[] completeStackArray;
    private int stackCapacity;

    //Since we can't reference null values -- we'll have to create an array, that keeps track of the occupied
    //Spaces in each one of our stacks
    public int[] stackSize;
    public KInOne(int stackCapacity, int stacksNeeded){
        // This will give us an array, that can hold our capacity per stack + the total number of stacks we need
        this.stackCapacity = stackCapacity;
        this.completeStackArray = new int[stackCapacity * stacksNeeded];
        this.stackSize = new int[stacksNeeded];

        //Initializes all my stacks in the array to a size of 0 to start
        for(int i = 0; i < stacksNeeded; i++){
            stackSize[i] = 0;
        }
    }

    //This method will push a value, into the stack at the specified position in our completeArray
    public void pushToKStack(int stackPosition, int value){
        //First in order to push to the specified stack, we must have space left to push onto it
        //If our stackPosition has values = to our stackCapacity - throw an error and not add
        if(this.stackIsFull(stackPosition)){
            throw new RuntimeException("Specified Stack Is Full");
        }

        //Adds value to top of stack
        addToTop(stackPosition, value);
    }

    //This will check if the stack being asked for is full -- since our array is split into stacks
    //Each segment represents a position of a stack -- to pull values from it -- we'd have to be able to reference
    //Particular positions
    private boolean stackIsFull(int stackPosition){
        //How can I get the starting position or the end position everytime to reference the correct elements?
        //completeStack.size() == 16/ stackCapacity == TotalNum Stacks
        //TotalNum Stacks * stackPosition this gives us the starting point for each stack
        //StartingPoint + stackCapacity - 1 this gives you the reference point to last value in each stack


        //WE MAY OR MAY NOT NEED THIS -- WE CAN'T CHECK IF A POSITION IS NULL
        //SINCE A PRIMITVE ARRAY CAN'T HOLD NULL VALUES
//        int endReference = startReference + stackCapacity -1;

        //Need to check if last item in the current stack has a value, then it's full

        /*Primitives a cannot hold null types they are only able to hold values
        if(this.completeStackArray[endReference] != null){
            return false;
        }*/

        if(stackSize[stackPosition] >= stackCapacity){
            System.out.println("Stack at position " + stackPosition + " is full ");
            return true;
        }
        //If I'm at stack 0, I would need to access elements from (0 - stackCapacity - 1) if capacity is four, elements would be stored in 0 - 3
        //If I'm at stack 1, I would need to access elements from (stackCapacity - stackCapacity + 3) if capacity is four, elemenst would be stored in 4 - 7
        //If I'm at stack 2, I would need to access elements from (stackCapacity + 4 - stackCapacity + 4 + 3) if capacity is four, elemenst would be stored in 8 - 11
        //If I'm at stack 3, I would need to access elements from (stackCapacity + 4 + 4 - stackCapacity + 4 + 4 + 3) if capacity is four, elemenst would be stored in 12 - 15
        return false;
    }

    //This method will add the value to the top of the specified stack
    public void addToTop(int stackPosition, int value){
        int numStacks = completeStackArray.length * stackCapacity;
        int startReference = numStacks * stackPosition;

        //Think about this, the top element will be the (current stackSize + startReference) - 1 -- The minus one
        //Is there because the stackSize will be 4 -- but the index is 0-3, you have to account for the difference
        if(stackPosition == 0 && startReference == 0){
            completeStackArray[startReference + stackSize[stackPosition]] = value;
        }else{
            completeStackArray[startReference + stackSize[stackPosition]] = value;
        }
        stackSize[stackPosition]++;
    }

    //Before we can pop() we must check to see if the specified stack is empty
    public int pop(int stackPosition){

        //Checks if stack is empty first
        isEmpty(stackPosition);

        int numStacks = completeStackArray.length * stackCapacity;
        int startReference = numStacks * stackPosition;
        int intPopped = completeStackArray[stackSize[stackPosition] + startReference - 1];
        stackSize[stackPosition]--;
        return intPopped;
    }

    public int peek(int stackPosition){
        isEmpty(stackPosition);

        int numStacks = completeStackArray.length * stackCapacity;
        int startReference = numStacks * stackPosition;

        return completeStackArray[stackSize[stackPosition] + startReference - 1];
    }

    public void isEmpty(int stackPosition){
        if(stackSize[stackPosition] == 0){
            throw new RuntimeException("Stack at position " + stackPosition + " is Empty");
        }
    }
}
